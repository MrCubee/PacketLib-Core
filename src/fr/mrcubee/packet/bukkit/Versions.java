package fr.mrcubee.packet.bukkit;

import org.bukkit.Bukkit;

/**
 * @author MrCubee
 * @since 1.0
 */
public enum Versions {

    v1_7_R4(5),
    v1_8_R1(47),
    v1_8_R2(47),
    v1_8_R3(47),
    v1_9_R1(107),
    v1_9_R2(110),
    v1_10_R1(210),
    v1_11_R1(316),
    v1_12_R1(340),
    v1_15_R1(573),
    v1_16_R1(736);

    private final int number;

    Versions(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public static Versions fromString(String str) {
        Versions[] versions;

        if (str == null)
            return null;
        versions = Versions.values();
        for (Versions version : versions) {
            if (version.toString().equalsIgnoreCase(str))
                return version;
        }
        return null;
    }

    public static Versions getCurrent() {
        String packageName = Bukkit.getServer().getClass().getPackage().getName();

        return fromString(packageName.substring(packageName.lastIndexOf('.') + 1));
    }
}
