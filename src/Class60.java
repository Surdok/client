public class Class60 {

	public static NativeSprite aClass160_612;
	public static Class60 aClass60_609 = new Class60(1);
	public static Class60 aClass60_602 = new Class60(2);
	public static Class60 aClass60_603 = new Class60(2);
	public static Class60 aClass60_608 = new Class60(2);
	public static Class60 aClass60_605 = new Class60(1);
	public static Class60 aClass60_606 = new Class60(1);
	public static Class60 aClass60_607 = new Class60(1);
	public static Class60 aClass60_604 = new Class60(2);
	public static Class60 aClass60_601 = new Class60(1);
	public static Class60 aClass60_610 = new Class60(2);
	public int anInt611;

	Class60(int i_1) {
		this.anInt611 = i_1;
	}

	public static boolean method1166(int i_0, int i_1) {
		return i_0 == 1 || i_0 == 3 || i_0 == 5;
	}

	static final void method1167(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 23);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		FontRenderer.method403(icomponentdefinitions_3, interface_4, cs2executor_0, 2136495218);
	}

	public static IncomingPacket[] getIncommingPacket() {
		return new IncomingPacket[] { IncomingPacket.PLAYER_ON_ICOMPONENT, IncomingPacket.aClass375_4352, IncomingPacket.aClass375_4504, IncomingPacket.aClass375_4354, IncomingPacket.aClass375_4450, IncomingPacket.aClass375_4356, IncomingPacket.NPC_UPDATE, IncomingPacket.CONFIG_2, IncomingPacket.aClass375_4381, IncomingPacket.aClass375_4360, IncomingPacket.aClass375_4361, IncomingPacket.aClass375_4362, IncomingPacket.GLOBAL_CONFIG_1, IncomingPacket.aClass375_4365, IncomingPacket.aClass375_4473, IncomingPacket.aClass375_4392, IncomingPacket.aClass375_4367, IncomingPacket.aClass375_4368, IncomingPacket.aClass375_4433, IncomingPacket.aClass375_4370, IncomingPacket.aClass375_4402, IncomingPacket.aClass375_4372, IncomingPacket.aClass375_4510, IncomingPacket.aClass375_4374, IncomingPacket.aClass375_4391, IncomingPacket.aClass375_4376, IncomingPacket.aClass375_4377, IncomingPacket.CREATE_GROUND_ITEM, IncomingPacket.aClass375_4480, IncomingPacket.PING, IncomingPacket.aClass375_4427, IncomingPacket.aClass375_4382, IncomingPacket.aClass375_4394, IncomingPacket.aClass375_4384, IncomingPacket.aClass375_4385, IncomingPacket.aClass375_4386, IncomingPacket.aClass375_4397, IncomingPacket.WINDOW_PANE_PACKET, IncomingPacket.INTERFACE, IncomingPacket.aClass375_4371, IncomingPacket.aClass375_4399, IncomingPacket.WORLD_TILE, IncomingPacket.aClass375_4393, IncomingPacket.PLAYER_UPDATE, IncomingPacket.aClass375_4395, IncomingPacket.aClass375_4440, IncomingPacket.aClass375_4502, IncomingPacket.NPC_UPDATE_LARGE, IncomingPacket.MOVE_ICOMPONENT, IncomingPacket.aClass375_4400, IncomingPacket.aClass375_4401, IncomingPacket.DYNAMIC_MAP_REGION, IncomingPacket.aClass375_4499, IncomingPacket.aClass375_4478, IncomingPacket.aClass375_4511, IncomingPacket.aClass375_4406, IncomingPacket.aClass375_4429, IncomingPacket.aClass375_4408, IncomingPacket.aClass375_4409, IncomingPacket.aClass375_4410, IncomingPacket.aClass375_4411, IncomingPacket.aClass375_4412, IncomingPacket.aClass375_4413, IncomingPacket.aClass375_4414, IncomingPacket.RUN_ENERGY, IncomingPacket.aClass375_4416, IncomingPacket.aClass375_4390, IncomingPacket.aClass375_4373, IncomingPacket.VARPBIT_1, IncomingPacket.DESTROY_OBJECT, IncomingPacket.aClass375_4421, IncomingPacket.aClass375_4422, IncomingPacket.aClass375_4423, IncomingPacket.aClass375_4396, IncomingPacket.aClass375_4425, IncomingPacket.aClass375_4426, IncomingPacket.aClass375_4492, IncomingPacket.aClass375_4428, IncomingPacket.aClass375_4407, IncomingPacket.aClass375_4430, IncomingPacket.OBJECT_ANIMATION, IncomingPacket.aClass375_4432, IncomingPacket.aClass375_4417, IncomingPacket.aClass375_4434, IncomingPacket.aClass375_4435, IncomingPacket.REGION, IncomingPacket.aClass375_4437, IncomingPacket.aClass375_4438, IncomingPacket.aClass375_4439, IncomingPacket.aClass375_4387, IncomingPacket.aClass375_4441, IncomingPacket.aClass375_4442, IncomingPacket.aClass375_4443, IncomingPacket.aClass375_4359, IncomingPacket.aClass375_4445, IncomingPacket.aClass375_4446, IncomingPacket.aClass375_4418, IncomingPacket.aClass375_4448, IncomingPacket.aClass375_4449, IncomingPacket.RUN_CS2_SCRIPT, IncomingPacket.aClass375_4451, IncomingPacket.aClass375_4452, IncomingPacket.aClass375_4491, IncomingPacket.aClass375_4358, IncomingPacket.aClass375_4455, IncomingPacket.aClass375_4456, IncomingPacket.aClass375_4457, IncomingPacket.aClass375_4458, IncomingPacket.VARPBIT_2, IncomingPacket.NPC_ON_ICOMPONENT, IncomingPacket.aClass375_4461, IncomingPacket.aClass375_4462, IncomingPacket.aClass375_4463, IncomingPacket.aClass375_4464, IncomingPacket.aClass375_4465, IncomingPacket.CONFIG_1, IncomingPacket.GLOBAL_CONFIG_2, IncomingPacket.CREATE_OBJECT, IncomingPacket.aClass375_4469, IncomingPacket.aClass375_4470, IncomingPacket.aClass375_4404, IncomingPacket.ICOMPONENT_SETTINGS, IncomingPacket.aClass375_4509, IncomingPacket.aClass375_4474, IncomingPacket.aClass375_4475, IncomingPacket.REMOVE_GROUND_ITEM, IncomingPacket.aClass375_4477, IncomingPacket.aClass375_4500, IncomingPacket.aClass375_4479, IncomingPacket.aClass375_4364, IncomingPacket.aClass375_4481, IncomingPacket.aClass375_4353, IncomingPacket.aClass375_4483, IncomingPacket.aClass375_4355, IncomingPacket.aClass375_4453, IncomingPacket.aClass375_4486, IncomingPacket.aClass375_4487, IncomingPacket.aClass375_4488, IncomingPacket.aClass375_4489, IncomingPacket.aClass375_4351, IncomingPacket.aClass375_4490, IncomingPacket.aClass375_4484, IncomingPacket.aClass375_4493, IncomingPacket.PROJECTILE, IncomingPacket.aClass375_4495, IncomingPacket.aClass375_4496, IncomingPacket.aClass375_4497, IncomingPacket.aClass375_4498, IncomingPacket.aClass375_4383, IncomingPacket.aClass375_4375, IncomingPacket.aClass375_4501, IncomingPacket.aClass375_4444, IncomingPacket.aClass375_4369, IncomingPacket.aClass375_4482, IncomingPacket.aClass375_4505, IncomingPacket.aClass375_4506, IncomingPacket.aClass375_4507, IncomingPacket.aClass375_4508, IncomingPacket.aClass375_4379, IncomingPacket.aClass375_4405, IncomingPacket.GAME_MESSAGE,
				IncomingPacket.aClass375_4459 };
	}

	public static boolean method1169(char var_0, byte b_1) {
		return var_0 >= 65 && var_0 <= 90 || var_0 >= 97 && var_0 <= 122;
	}

	public static void method1170(int i_0) {
		if (client.aBool7344) {
			IComponentDefinitions icomponentdefinitions_1 = Index.method5694(Class7.anInt56, client.anInt7345, 1160609713);
			if (icomponentdefinitions_1 != null && icomponentdefinitions_1.anObjectArray1396 != null) {
				HookRequest hookrequest_2 = new HookRequest();
				hookrequest_2.iComponentDefs = icomponentdefinitions_1;
				hookrequest_2.params = icomponentdefinitions_1.anObjectArray1396;
				Class96_Sub4.executeHookInner200k(hookrequest_2, 1386646091);
			}

			client.anInt7427 = -1;
			client.anInt7346 = -1;
			client.aBool7344 = false;
			if (icomponentdefinitions_1 != null) {
				Class109.method1858(icomponentdefinitions_1, (byte) 30);
			}
		}

	}

	static final void method1171(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = cs2executor_0.aClass61_7010.anInt641;
	}

	static void method1172(int i_0) {
		if (Class90.aClass496_952 != Class496.aClass496_5810) {
			Class361.aClass361_4174.method6257(-84783453);
		}

	}

	static final void method1173(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7422;
	}

	static final void method1174(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		ItemIndexLoader.method7170(i_2, 377314002);
		int i_7 = 0;
		int i_8 = i_2 - i_5;
		if (i_8 < 0) {
			i_8 = 0;
		}

		int i_9 = i_2;
		int i_10 = -i_2;
		int i_11 = i_8;
		int i_12 = -i_8;
		int i_13 = -1;
		int i_14 = -1;
		int i_16;
		int i_17;
		int i_18;
		int i_19;
		if (i_1 >= Class532_Sub3.anInt7070 && i_1 <= Class532_Sub3.anInt7068) {
			int[] ints_15 = Class532_Sub3.anIntArrayArray7072[i_1];
			i_16 = Class275.method4890(i_0 - i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 1149911370);
			i_17 = Class275.method4890(i_0 + i_2, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -1752676227);
			i_18 = Class275.method4890(i_0 - i_8, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 543795752);
			i_19 = Class275.method4890(i_0 + i_8, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 1403864905);
			Class232.method3922(ints_15, i_16, i_18, i_4, (byte) -39);
			Class232.method3922(ints_15, i_18, i_19, i_3, (byte) -10);
			Class232.method3922(ints_15, i_19, i_17, i_4, (byte) -23);
		}

		while (i_9 > i_7) {
			i_13 += 2;
			i_14 += 2;
			i_10 += i_13;
			i_12 += i_14;
			if (i_12 >= 0 && i_11 >= 1) {
				--i_11;
				i_12 -= i_11 << 1;
				Class5.anIntArray36[i_11] = i_7;
			}

			++i_7;
			int i_20;
			int i_21;
			int[] ints_22;
			int i_23;
			if (i_10 >= 0) {
				--i_9;
				i_10 -= i_9 << 1;
				i_23 = i_1 - i_9;
				i_16 = i_9 + i_1;
				if (i_16 >= Class532_Sub3.anInt7070 && i_23 <= Class532_Sub3.anInt7068) {
					if (i_9 >= i_8) {
						i_17 = Class275.method4890(i_0 + i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -617603444);
						i_18 = Class275.method4890(i_0 - i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -1801446753);
						if (i_16 <= Class532_Sub3.anInt7068) {
							Class232.method3922(Class532_Sub3.anIntArrayArray7072[i_16], i_18, i_17, i_4, (byte) -23);
						}

						if (i_23 >= Class532_Sub3.anInt7070) {
							Class232.method3922(Class532_Sub3.anIntArrayArray7072[i_23], i_18, i_17, i_4, (byte) 29);
						}
					} else {
						i_17 = Class5.anIntArray36[i_9];
						i_18 = Class275.method4890(i_0 + i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 877789143);
						i_19 = Class275.method4890(i_0 - i_7, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 58227539);
						i_20 = Class275.method4890(i_0 + i_17, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -1073712474);
						i_21 = Class275.method4890(i_0 - i_17, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 87726144);
						if (i_16 <= Class532_Sub3.anInt7068) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_16];
							Class232.method3922(ints_22, i_19, i_21, i_4, (byte) 31);
							Class232.method3922(ints_22, i_21, i_20, i_3, (byte) -76);
							Class232.method3922(ints_22, i_20, i_18, i_4, (byte) 42);
						}

						if (i_23 >= Class532_Sub3.anInt7070) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_23];
							Class232.method3922(ints_22, i_19, i_21, i_4, (byte) -28);
							Class232.method3922(ints_22, i_21, i_20, i_3, (byte) -31);
							Class232.method3922(ints_22, i_20, i_18, i_4, (byte) -10);
						}
					}
				}
			}

			i_23 = i_1 - i_7;
			i_16 = i_7 + i_1;
			if (i_16 >= Class532_Sub3.anInt7070 && i_23 <= Class532_Sub3.anInt7068) {
				i_17 = i_0 + i_9;
				i_18 = i_0 - i_9;
				if (i_17 >= Class532_Sub3.anInt7071 && i_18 <= Class532_Sub3.anInt7069) {
					i_17 = Class275.method4890(i_17, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, 686110117);
					i_18 = Class275.method4890(i_18, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -716811882);
					if (i_7 < i_8) {
						i_19 = i_11 < i_7 ? Class5.anIntArray36[i_7] : i_11;
						i_20 = Class275.method4890(i_0 + i_19, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -569174694);
						i_21 = Class275.method4890(i_0 - i_19, Class532_Sub3.anInt7071, Class532_Sub3.anInt7069, -277030614);
						if (i_16 <= Class532_Sub3.anInt7068) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_16];
							Class232.method3922(ints_22, i_18, i_21, i_4, (byte) -20);
							Class232.method3922(ints_22, i_21, i_20, i_3, (byte) 51);
							Class232.method3922(ints_22, i_20, i_17, i_4, (byte) -7);
						}

						if (i_23 >= Class532_Sub3.anInt7070) {
							ints_22 = Class532_Sub3.anIntArrayArray7072[i_23];
							Class232.method3922(ints_22, i_18, i_21, i_4, (byte) 32);
							Class232.method3922(ints_22, i_21, i_20, i_3, (byte) -49);
							Class232.method3922(ints_22, i_20, i_17, i_4, (byte) -4);
						}
					} else {
						if (i_16 <= Class532_Sub3.anInt7068) {
							Class232.method3922(Class532_Sub3.anIntArrayArray7072[i_16], i_18, i_17, i_4, (byte) 63);
						}

						if (i_23 >= Class532_Sub3.anInt7070) {
							Class232.method3922(Class532_Sub3.anIntArrayArray7072[i_23], i_18, i_17, i_4, (byte) 67);
						}
					}
				}
			}
		}

	}

}
