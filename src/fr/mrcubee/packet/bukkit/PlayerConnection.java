package fr.mrcubee.packet.bukkit;

import io.netty.channel.Channel;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author MrCubee
 * @since 1.0
 * @version 1.0
 */
public class PlayerConnection {

    /** Call the object's method from its name.
     * @since 1.0
     * @param object The object having the method.
     * @param methodName The name of the desired method.
     * @return Returns the value returned by the method.
     */
    private static Object invokeGetterMethod(Object object, String methodName) {
        Method method = null;
        Object result = null;

        if (object == null || methodName == null)
            return null;
        try {
            method = object.getClass().getMethod(methodName);
        } catch (NoSuchMethodException ignored) {}
        if (method == null)
            return null;
        try {
            result = method.invoke(object);
        } catch (Exception ignored) {}
        return result;
    }

    /** Get the value of the object's field.
     * @since 1.0
     * @param object The object having the field.
     * @param fieldName The name of the desired field.
     * @return The value contained in the field.
     */
    private static Object getFieldValue(Object object, String fieldName) {
        Field field = null;
        Object result = null;

        if (object == null || fieldName == null)
            return null;
        try {
            field = object.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException ignored) {}
        if (field == null)
            return null;
        try {
            result = field.get(object);
        } catch (Exception ignored) {}
        return result;
    }

    /** Get the player's connection from the player.
     * @since 1.0
     * @param player The targeted player.
     * @return Returns the player's connection.
     */
    public static Object getPlayerConnection(Player player) {
        if (player == null)
            return null;
        return getFieldValue(invokeGetterMethod(player, "getHandle"), "playerConnection");
    }

    /** Get the player's connection channel from the player.
     * @since 1.0
     * @param player The targeted player.
     * @return Return the player's connection channel.
     */
    public static Channel getPlayerChannel(Player player) {
        if (player == null)
            return null;
        return (Channel) getFieldValue(getFieldValue(getPlayerConnection(player), "networkManager"), "channel");
    }
}
