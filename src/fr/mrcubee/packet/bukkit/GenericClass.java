package fr.mrcubee.packet.bukkit;

public class GenericClass {

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
