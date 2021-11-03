package fr.mrcubee.packet.bukkit;

import java.lang.reflect.Constructor;

/**
 * @author MrCubee
 * @since 1.0
 */
public class CraftClass {

    public static <T> Constructor<T> getConstructor(Class<T> clazz, Class<?>... parameters) {
        Constructor<T> constructor = null;

        if (clazz == null)
            return null;
        try {
            constructor = clazz.getConstructor(parameters);
        } catch (NoSuchMethodException ignored) {}
        return constructor;
    }

    public static <T> Constructor<T> getConstructor(Class<T> clazz, Object... parameters) {
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
