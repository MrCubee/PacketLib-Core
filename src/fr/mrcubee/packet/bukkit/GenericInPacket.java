package fr.mrcubee.packet.bukkit;

import org.bukkit.entity.Player;

/**
 * @author MrCubee
 * @since 1.0
 * @version 1.0
 */
public interface GenericInPacket extends GenericPacket {

    /** Insert the packet into the desired player connection.
     * @since 1.0
     * @param player The player who is to interpret the packet.
     * @return Returns true if the packet has been interpreted, otherwise returns false.
     */
    boolean insertPlayer(Player player);

}
