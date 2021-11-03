package fr.mrcubee.packet.bukkit;

import java.lang.reflect.Constructor;

/**
 * @author MrCubee
 * @since 1.0
 * @version 1.0
 */
public class CraftClass {

    /** Get the specific constructor of a class from its parameter types.
     * @since 1.0
     * @param clazz Targeted class.
     * @param parameters The parameter types of the desired constructor.
     * @param <T>
     * @return Returns the constructor if it exists otherwise returns null.
     */
    private static <T> Constructor<T> getConstructor(Class<T> clazz, Class<?>... parameters) {
        Constructor<T> constructor = null;

        if (clazz == null)
            return null;
        try {
            constructor = clazz.getConstructor(parameters);
        } catch (NoSuchMethodException ignored) {}
        return constructor;
    }

    /** Get the specific constructor of a class from its parameters.
     * @since 1.0
     * @param clazz Targeted class.
     * @param parameters The parameters of the desired constructor.
     * @param <T>
     * @return Returns the constructor if it exists otherwise returns null.
     */
    private static <T> Constructor<T> getConstructor(Class<T> clazz, Object... parameters) {
        Class<?>[] types;

        if (clazz == null)
            return null;
        if (parameters == null || parameters.length < 1)
            return getConstructor(clazz);
        types = new Class<?>[parameters.length];
        for (int i = 0; i < types.length; i++)
            types[i] = parameters[i].getClass();
        return getConstructor(clazz, types);
    }

    /** NMS class in a particular version.
     * @since 1.0
     * @param clazz Desired class.
     * @param version Desired version.
     * @param <T>
     * @return Returns the desired class if it exists otherwise returns null.
     */
    public static <T> Class<? extends T> getCraftClass(Class<T> clazz, Versions version) {
        Class<?> unknownClass = null;

        if (clazz == null || version == null)
            return null;
        try {
            unknownClass = Class.forName(String.format("fr.mrcubee.packet.bukkit.%s.%s", version, clazz.getSimpleName()));
        } catch (ClassNotFoundException ignored) {}
        if (unknownClass == null || !unknownClass.isAssignableFrom(clazz))
            return null;
        return unknownClass.asSubclass(clazz);
    }

    /** Retrieves the instance of an NMS class in a particular version.
     * @since 1.0
     * @param clazz Desired class.
     * @param version Desired version.
     * @param parameters Parameters of the desired constructor.
     * @param <T>
     * @return Returns the instance of the desired class if it exists otherwise returns null.
     */
    public static <T> T newInstance(Class<T> clazz, Versions version, Object... parameters) {
        Class<? extends T> craftClass = getCraftClass(clazz, version);
        Constructor<? extends T> constructor;
        T result = null;

        if (craftClass == null)
            return null;
        constructor = getConstructor(craftClass, parameters);
        if (constructor == null)
            return null;
        try {
            result = constructor.newInstance(parameters);
        } catch (Exception ignored) {}
        return result;
    }

}
