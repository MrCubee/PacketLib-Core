package fr.mrcubee.packet.bukkit;

import org.bukkit.entity.Player;

/**
 * @author MrCubee
 * @since 1.0
 */
public interface GenericOutPacket extends GenericPacket {

    /** Send the packet to the desired player.
     * @since 1.0
     * @param player The player who is to receive the packet.
     * @return Returns true if the packet was sent, otherwise returns false.
     */
    boolean sendPlayer(Player player);

}
