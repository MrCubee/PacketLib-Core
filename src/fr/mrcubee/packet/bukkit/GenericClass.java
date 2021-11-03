package fr.mrcubee.packet.bukkit;

/**
 * @author MrCubee
 * @since 1.0
 * @version 1.0
 */
public class GenericClass {

    /** Retrives the generic packet class in a specific version.
     * @since 1.0
     * @param packet Desired packet.
     * @return Returns the desired packet class if it exists otherwise returns null.
     */
    public static Class<? extends GenericPacket> getGenericPacketClass(Packets packet) {
        Class<?> unknownClass = null;

        if (packet == null)
            return null;
        try {
            unknownClass = Class.forName(String.format("fr.mrcubee.packet.bukkit.Generic%s", packet.getClassName()));
        } catch (ClassNotFoundException ignored) {}
        if (unknownClass == null || !unknownClass.isAssignableFrom(GenericPacket.class))
            return null;
        return unknownClass.asSubclass(GenericPacket.class);
    }

}
