package fr.mrcubee.packet.bukkit;

/**
 * @author MrCubee
 * @since 1.0
 */
public enum Packets {

    LOGIN_IN_START("PacketLoginInStart", PacketDirection.IN),
    LOGIN_IN_ENCRYPTION_BEGIN("PacketLoginInEncryptionBegin", PacketDirection.IN),

    PLAY_IN_ABILITIES("PacketPlayInAbilities", PacketDirection.IN),
    PLAY_IN_ARM_ANIMATION("PacketPlayInArmAnimation", PacketDirection.IN),
    PLAY_IN_BLOCK_DIG("PacketPlayInBlockDig", PacketDirection.IN),
    PLAY_IN_BLOCK_PLACE("PacketPlayInBlockPlace", PacketDirection.IN),
    PLAY_IN_CHAT("PacketPlayInChat", PacketDirection.IN),
    PLAY_IN_CLIENT_COMMAND("PacketPlayInClientCommand", PacketDirection.IN),
    PLAY_IN_CLOSE_WINDOW("PacketPlayInCloseWindow", PacketDirection.IN),
    PLAY_IN_CUSTOM_PAYLOAD("PacketPlayInCustomPayload", PacketDirection.IN),
    PLAY_IN_ENCHANT_ITEM("PacketPlayInEnchantItem", PacketDirection.IN),
    PLAY_IN_ENTITY_ACTION("PacketPlayInEntityAction", PacketDirection.IN),
    PLAY_IN_FLYING("PacketPlayInFlying", PacketDirection.IN),
    PLAY_IN_HELD_ITEM_SLOT("PacketPlayInHeldItemSlot", PacketDirection.IN),
    PLAY_IN_KEEP_ALIVE("PacketPlayInKeepAlive", PacketDirection.IN),
    PLAY_IN_RESOURCE_PACK_STATUS("PacketPlayInResourcePackStatus", PacketDirection.IN),
    PLAY_IN_SET_CREATIVE_SLOT("PacketPlayInSetCreativeSlot", PacketDirection.IN),
    PLAY_IN_SETTINGS("PacketPlayInSettings", PacketDirection.IN),
    PLAY_IN_SPECTATE("PacketPlayInSpectate", PacketDirection.IN),
    PLAY_IN_STEER_VEHICLE("PacketPlayInSteerVehicle", PacketDirection.IN),
    PLAY_IN_TAB_COMPLETE("PacketPlayInTabComplete", PacketDirection.IN),
    PLAY_IN_TRANSACTION("PacketPlayInTransaction", PacketDirection.IN),
    PLAY_IN_UPDATE_SIGN("PacketPlayInUpdateSign", PacketDirection.IN),
    PLAY_IN_USE_ENTITY("PacketPlayInUseEntity", PacketDirection.IN),
    PLAY_IN_WINDOW_CLICK("PacketPlayInWindowClick", PacketDirection.IN),

    LOGIN_OUT_ENCRYPTION_BEGIN("PacketLoginOutEncryptionBegin", PacketDirection.OUT),
    LOGIN_OUT_SUCCESS("PacketLoginOutSuccess", PacketDirection.OUT),
    LOGIN_OUT_DISCONNECT("PacketLoginOutDisconnect", PacketDirection.OUT),
    LOGIN_OUT_SET_COMPRESSION("PacketLoginOutSetCompression", PacketDirection.OUT),

    PLAY_OUT_ABILITIES("PacketPlayOutAbilities", PacketDirection.OUT),
    PLAY_OUT_ANIMATION("PacketPlayOutAnimation", PacketDirection.OUT),
    PLAY_OUT_ATTACH_ENTITY("PacketPlayOutAttachEntity", PacketDirection.OUT),
    PLAY_OUT_BED("PacketPlayOutBed", PacketDirection.OUT),
    PLAY_OUT_BLOCK_ACTION("PacketPlayOutBlockAction", PacketDirection.OUT),
    PLAY_OUT_BLOCK_BREAK_ANIMATION("PacketPlayOutBlockBreakAnimation", PacketDirection.OUT),
    PLAY_OUT_BLOCK_CHANGE("PacketPlayOutBlockChange", PacketDirection.OUT),
    PLAY_OUT_CAMERA("PacketPlayOutCamera", PacketDirection.OUT),
    PLAY_OUT_CHAT("PacketPlayOutChat", PacketDirection.OUT),
    PLAY_OUT_CLOSE_WINDOW("PacketPlayOutCloseWindow", PacketDirection.OUT),
    PLAY_OUT_COLLECT("PacketPlayOutCollect", PacketDirection.OUT),
    PLAY_OUT_COMBAT_EVENT("PacketPlayOutCombatEvent", PacketDirection.OUT),
    PLAY_OUT_CUSTOM_PAYLOAD("PacketPlayOutCustomPayload", PacketDirection.OUT),
    PLAY_OUT_ENTITY("PacketPlayOutEntity", PacketDirection.OUT),
    PLAY_OUT_ENTITY_LOOK("PacketPlayOutEntity$PacketPlayOutEntityLook", PacketDirection.OUT),
    PLAY_OUT_REL_ENTITY_MOVE("PacketPlayOutEntity$PacketPlayOutRelEntityMove", PacketDirection.OUT),
    PLAY_OUT_REL_ENTITY_MOVE_LOOK("PacketPlayOutEntity$PacketPlayOutRelEntityMoveLook", PacketDirection.OUT),
    PLAY_OUT_ENTITY_DESTROY("PacketPlayOutEntityDestroy", PacketDirection.OUT),
    PLAY_OUT_ENTITY_EFFECT("PacketPlayOutEntityEffect", PacketDirection.OUT),
    PLAY_OUT_ENTITY_EQUIPMENT("PacketPlayOutEntityEquipment", PacketDirection.OUT),
    PLAY_OUT_ENTITY_HEAD_ROTATION("PacketPlayOutEntityHeadRotation", PacketDirection.OUT),
    PLAY_OUT_ENTITY_METADATA("PacketPlayOutEntityMetadata", PacketDirection.OUT),
    PLAY_OUT_ENTITY_STATUS("PacketPlayOutEntityStatus", PacketDirection.OUT),
    PLAY_OUT_ENTITY_TELEPORT("PacketPlayOutEntityTeleport", PacketDirection.OUT),
    PLAY_OUT_ENTITY_VELOCITY("PacketPlayOutEntityVelocity", PacketDirection.OUT),
    PLAY_OUT_EXPERIENCE("PacketPlayOutExperience", PacketDirection.OUT),
    PLAY_OUT_EXPLOSION("PacketPlayOutExplosion", PacketDirection.OUT),
    PLAY_OUT_GAME_STATE_CHANGE("PacketPlayOutGameStateChange", PacketDirection.OUT),
    PLAY_OUT_HELD_ITEM_SLOT("PacketPlayOutHeldItemSlot", PacketDirection.OUT),
    PLAY_OUT_KEEP_ALIVE("PacketPlayOutKeepAlive", PacketDirection.OUT),
    PLAY_OUT_KICK_DISCONNECT("PacketPlayOutKickDisconnect", PacketDirection.OUT),
    PLAY_OUT_LOGIN("PacketPlayOutLogin", PacketDirection.OUT),
    PLAY_OUT_MAP("PacketPlayOutMap", PacketDirection.OUT),
    PLAY_OUT_MAP_CHUNK("PacketPlayOutMapChunk", PacketDirection.OUT),
    PLAY_OUT_MAP_CHUNK_BULK("PacketPlayOutMapChunkBulk", PacketDirection.OUT),
    PLAY_OUT_MULTI_BLOCK_CHANGE("PacketPlayOutMultiBlockChange", PacketDirection.OUT),
    PLAY_OUT_NAMED_ENTITY_SPAWN("PacketPlayOutNamedEntitySpawn", PacketDirection.OUT),
    PLAY_OUT_NAMED_SOUND_EFFECT("PacketPlayOutNamedSoundEffect", PacketDirection.OUT),
    PLAY_OUT_OPEN_SIGN_EDITOR("PacketPlayOutOpenSignEditor", PacketDirection.OUT),
    PLAY_OUT_OPEN_WINDOW("PacketPlayOutOpenWindow", PacketDirection.OUT),
    PLAY_OUT_PLAYER_INFO("PacketPlayOutPlayerInfo", PacketDirection.OUT),
    PLAY_OUT_PLAYER_LIST_HEADER_FOOTER("PacketPlayOutPlayerListHeaderFooter", PacketDirection.OUT),
    PLAY_OUT_POSITION("PacketPlayOutPosition", PacketDirection.OUT),
    PLAY_OUT_REMOVE_ENTITY_EFFECT("PacketPlayOutRemoveEntityEffect", PacketDirection.OUT),
    PLAY_OUT_RESOURCE_PACK_SEND("PacketPlayOutResourcePackSend", PacketDirection.OUT),
    PLAY_OUT_RESPAWN("PacketPlayOutRespawn", PacketDirection.OUT),
    PLAY_OUT_SCOREBOARD_DISPLAY_OBJECTIVE("PacketPlayOutScoreboardDisplayObjective", PacketDirection.OUT),
    PLAY_OUT_SCOREBOARD_OBJECTIVE("PacketPlayOutScoreboardObjective", PacketDirection.OUT),
    PLAY_OUT_SCOREBOARD_SCORE("PacketPlayOutScoreboardScore", PacketDirection.OUT),
    PLAY_OUT_SCOREBOARD_TEAM("PacketPlayOutScoreboardTeam", PacketDirection.OUT),
    PLAY_OUT_SERVER_DIFFICULTY("PacketPlayOutServerDifficulty", PacketDirection.OUT),
    PLAY_OUT_SET_COMPRESSION("PacketPlayOutSetCompression", PacketDirection.OUT),
    PLAY_OUT_SET_SLOT("PacketPlayOutSetSlot", PacketDirection.OUT),
    PLAY_OUT_SPAWN_ENTITY("PacketPlayOutSpawnEntity", PacketDirection.OUT),
    PLAY_OUT_SPAWN_ENTITY_EXPERIENCE_ORB("PacketPlayOutSpawnEntityExperienceOrb", PacketDirection.OUT),
    PLAY_OUT_SPAWN_ENTITY_LIVING("PacketPlayOutSpawnEntityLiving", PacketDirection.OUT),
    PLAY_OUT_SPAWN_ENTITY_PAINTING("PacketPlayOutSpawnEntityPainting", PacketDirection.OUT),
    PLAY_OUT_SPAWN_ENTITY_WEATHER("PacketPlayOutSpawnEntityWeather", PacketDirection.OUT),
    PLAY_OUT_SPAWN_POSITION("PacketPlayOutSpawnPosition", PacketDirection.OUT),
    PLAY_OUT_STATISTIC("PacketPlayOutStatistic", PacketDirection.OUT),
    PLAY_OUT_TAB_COMPLETE("PacketPlayOutTabComplete", PacketDirection.OUT),
    PLAY_OUT_TILE_ENTITY_DATA("PacketPlayOutTileEntityData", PacketDirection.OUT),
    PLAY_OUT_TITLE("PacketPlayOutTitle", PacketDirection.OUT),
    PLAY_OUT_TRANSACTION("PacketPlayOutTransaction", PacketDirection.OUT),
    PLAY_OUT_UPDATE_ATTRIBUTES("PacketPlayOutUpdateAttributes", PacketDirection.OUT),
    PLAY_OUT_UPDATE_ENTITY_NBT("PacketPlayOutUpdateEntityNBT", PacketDirection.OUT),
    PLAY_OUT_UPDATE_HEALTH("PacketPlayOutUpdateHealth", PacketDirection.OUT),
    PLAY_OUT_UPDATE_SIGN("PacketPlayOutUpdateSign", PacketDirection.OUT),
    PLAY_OUT_UPDATE_TIME("PacketPlayOutUpdateTime", PacketDirection.OUT),
    PLAY_OUT_WINDOW_DATA("PacketPlayOutWindowData", PacketDirection.OUT),
    PLAY_OUT_WINDOW_ITEMS("PacketPlayOutWindowItems", PacketDirection.OUT),
    PLAY_OUT_WORLD_BORDER("PacketPlayOutWorldBorder", PacketDirection.OUT),
    PLAY_OUT_WORLD_EVENT("PacketPlayOutWorldEvent", PacketDirection.OUT),
    PLAY_OUT_WORLD_PARTICLES("PacketPlayOutWorldParticles", PacketDirection.OUT);

    private final String className;
    private final PacketDirection direction;

    Packets(String className, PacketDirection direction) {
        this.className = className;
        this.direction = direction;
    }

    public PacketDirection getDirection() {
        return this.direction;
    }

    public String getClassName() {
        return this.className;
    }

    public Class<? extends GenericPacket> getCraftGenericPacketClass(Versions version) {
        return CraftClass.getCraftClass(GenericClass.getGenericPacketClass(this), version);
    }

    public Class<? extends GenericPacket> getCraftGenericPacketClass() {
        return getCraftGenericPacketClass(Versions.getCurrent());
    }

    public Class<?> getPacketClass(Versions version) {
        Class<?> clazz = null;

        if (version == null)
            return null;
        try {
            clazz = Class.forName(String.format("net.minecraft.server.%s.%s", version, getClassName()));
        } catch (ClassNotFoundException ignored) {}
        return clazz;
    }

    public Class<?> getPacketClass() {
        return getPacketClass(Versions.getCurrent());
    }

    public GenericPacket createPacket(Versions version, Object... parameters) {
        return CraftClass.newInstance(GenericClass.getGenericPacketClass(this), version, parameters);
    }

    public GenericPacket createPacket(Object... parameters) {
        return createPacket(Versions.getCurrent(), parameters);
    }

    public static Packets fromClassName(String className) {
        Packets[] packets;

        if (className == null)
            return null;
        packets = Packets.values();
        for (Packets packet : packets) {
            if (packet.getClassName().equals(className))
                return packet;
        }
        return null;
    }

    public static Packets getFromGenericPacketClass(Class<?> clazz) {
        if (clazz == null)
            return null;
        return fromClassName(clazz.getName().substring(clazz.getName().lastIndexOf('.') + 1));
    }

    public static Packets getFromPacketClass(Class<?> clazz) {
        if (clazz == null)
            return null;
        return fromClassName(clazz.getName().substring(clazz.getName().lastIndexOf('.') + 1));
    }
}
