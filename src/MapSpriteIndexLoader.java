public class MapSpriteIndexLoader {

	public static int anInt5123;
	SoftCache aClass229_5117 = new SoftCache(64);
	SoftCache aClass229_5122 = new SoftCache(64);
	Index aClass317_5120;
	Index aClass317_5118;

	public MapSpriteDefinitions method7172(int i_1) {
		SoftCache softcache_4 = this.aClass229_5117;
		MapSpriteDefinitions class418_3;
		synchronized (this.aClass229_5117) {
			class418_3 = (MapSpriteDefinitions) this.aClass229_5117.get((long) i_1);
		}
		if (class418_3 != null) {
			return class418_3;
		} else {
			Index index_5 = this.aClass317_5120;
			byte[] bytes_10;
			synchronized (this.aClass317_5120) {
				bytes_10 = this.aClass317_5120.getFile(SharedConfigsType.MAP_SPRITES.id, i_1);
			}
			class418_3 = new MapSpriteDefinitions();
			class418_3.aClass427_4998 = this;
			if (bytes_10 != null) {
				class418_3.method7008(new RsByteBuffer(bytes_10));
			}
			SoftCache softcache_9 = this.aClass229_5117;
			synchronized (this.aClass229_5117) {
				this.aClass229_5117.put(class418_3, (long) i_1);
				return class418_3;
			}
		}
	}

	public void method7173() {
		SoftCache softcache_3 = this.aClass229_5117;
		synchronized (this.aClass229_5117) {
			this.aClass229_5117.method3858(5);
		}
		softcache_3 = this.aClass229_5122;
		synchronized (this.aClass229_5122) {
			this.aClass229_5122.method3858(5);
		}
	}

	public MapSpriteIndexLoader(Game game_1, Language xlanguage_2, Index index_3, Index index_4) {
		this.aClass317_5120 = index_3;
		this.aClass317_5118 = index_4;
		this.aClass317_5120.filesCount(SharedConfigsType.MAP_SPRITES.id);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}

	public void method7174() {
		SoftCache softcache_2 = this.aClass229_5117;
		synchronized (this.aClass229_5117) {
			this.aClass229_5117.method3859();
		}
		softcache_2 = this.aClass229_5122;
		synchronized (this.aClass229_5122) {
			this.aClass229_5122.method3859();
		}
	}

	public void method7175(int i_1, int i_2, int i_3) {
		this.aClass229_5117 = new SoftCache(i_1);
		this.aClass229_5122 = new SoftCache(i_2);
	}

	public void method7177() {
		SoftCache softcache_2 = this.aClass229_5117;
		synchronized (this.aClass229_5117) {
			this.aClass229_5117.method3863();
		}
		softcache_2 = this.aClass229_5122;
		synchronized (this.aClass229_5122) {
			this.aClass229_5122.method3863();
		}
	}

	static final int method7188(Entity animable_0) {
		if (animable_0.anInt10340 == 0) {
			return 0;
		} else {
			int i_5;
			Vector3 vector3_9;
			if (animable_0.faceEntity != -1) {
				Object obj_2 = null;
				if (animable_0.faceEntity < 32768) {
					StringNode class282_sub47_3 = (StringNode) client.NPCS.get((long) animable_0.faceEntity);
					if (class282_sub47_3 != null) {
						obj_2 = (Entity) class282_sub47_3.anObject8068;
					}
				} else if (animable_0.faceEntity >= 32768) {
					obj_2 = client.players[animable_0.faceEntity - 32768];
				}
				if (obj_2 != null) {
					vector3_9 = Vector3.method6632(animable_0.method11166().coords, ((Entity) obj_2).method11166().coords);
					int i_4 = (int) vector3_9.x;
					i_5 = (int) vector3_9.z;
					if (i_4 != 0 || i_5 != 0) {
						animable_0.method15863((int) (Math.atan2((double) i_4, (double) i_5) * 2607.5945876176133D) & 0x3fff, 1489120080);
					}
				}
			}
			if (animable_0 instanceof Player) {
				Player player_8 = (Player) animable_0;
				if (player_8.faceDirection != -1 && (player_8.anInt10355 == 0 || player_8.anInt10366 > 0)) {
					player_8.method15863(player_8.faceDirection, 1785594136);
					player_8.faceDirection = -1;
				}
			} else if (animable_0 instanceof NPC) {
				NPC npc_10 = (NPC) animable_0;
				if (npc_10.faceX != -1 && (npc_10.anInt10355 == 0 || npc_10.anInt10366 > 0)) {
					vector3_9 = npc_10.method11166().coords;
					WorldTile coordgrid_7 = IndexLoaders.MAP_REGION_DECODER.getBase();
					i_5 = (int) vector3_9.x - (npc_10.faceX * 256 - coordgrid_7.x * 256 - coordgrid_7.x * 256);
					int i_6 = (int) vector3_9.z - (npc_10.faceY * 256 - coordgrid_7.y * 256 - coordgrid_7.y * 256);
					System.out.println("Direction1: " + i_5 + ", " + i_6);
					if (i_5 != 0 || i_6 != 0) {
						System.out.println("Direction: " + i_5 + ", " + i_6);
						npc_10.method15863((int) (Math.atan2((double) i_5, (double) i_6) * 2607.5945876176133D) & 0x3fff, 1631347734);
					}
					npc_10.faceX = -1;
				}
			}
			return animable_0.method15796();
		}
	}

	public static int method7189(RsByteBuffer rsbytebuffer_0, String string_1, int i_2) {
		int i_3 = rsbytebuffer_0.index;
		byte[] bytes_4 = LinkedNodeList.method7885(string_1, (byte) -70);
		rsbytebuffer_0.method13076(bytes_4.length);
		rsbytebuffer_0.index += Class113.HUFFMAN.method1971(bytes_4, 0, bytes_4.length, rsbytebuffer_0.buffer, rsbytebuffer_0.index);
		return rsbytebuffer_0.index - i_3;
	}
}
