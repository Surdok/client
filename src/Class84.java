public class Class84 {

	public static Player myPlayer;
	public int anInt812;
	public int anInt809;
	public int anInt811;
	public int anInt810;

	Class84 method1459(int i_1, int i_2) {
		return new Class84(this.anInt812, i_1, this.anInt811, this.anInt810);
	}

	Class84(int i_1, int i_2, int i_3, int i_4) {
		this.anInt812 = i_1;
		this.anInt809 = i_2;
		this.anInt811 = i_3;
		this.anInt810 = i_4;
	}

	public static Class273 method1461(int i_0) {
		try {
			Class273_Sub1 class273_sub1_1 = new Class273_Sub1();
			return class273_sub1_1;
		} catch (Throwable throwable_3) {
			return new Class273_Sub2();
		}
	}

	static final void method1462(CS2Executor cs2executor_0, int i_1) {
		String string_2 = (String) cs2executor_0.objectStack[--cs2executor_0.anInt7000];
		Class16.method567(string_2, true, (byte) -67);
	}

	static final void method1463(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method12666(2085478304);
	}

	static final void method1464(int i_0) {
		for (int i_1 = Class158_Sub1.aClass3_8507.method264(true, (byte) 112); i_1 != -1; i_1 = Class158_Sub1.aClass3_8507.method264(false, (byte) 48)) {
			Class499.method8333(i_1, 1768744786);
			client.anIntArray7379[++client.anInt7453 - 1 & 0x1f] = i_1;
		}

		for (Class282_Sub50_Sub12 class282_sub50_sub12_11 = ObjectDefinitions.method8022(-54255165); class282_sub50_sub12_11 != null; class282_sub50_sub12_11 = ObjectDefinitions.method8022(153366181)) {
			int i_2 = class282_sub50_sub12_11.method14953(701484568);
			long long_3 = class282_sub50_sub12_11.method14967(1056683905);
			if (i_2 == 1) {
				Class320.anIntArray3724[(int) long_3] = class282_sub50_sub12_11.anInt9668;
				client.aBool7400 |= Class282_Sub17_Sub2.aBoolArray9934[(int) long_3];
				client.anIntArray7150[++client.anInt7368 - 1 & 0x1f] = (int) long_3;
			} else if (i_2 == 2) {
				Class462.aStringArray5548[(int) long_3] = class282_sub50_sub12_11.aString9640;
				client.anIntArray7387[++client.anInt7388 - 1 & 0x1f] = (int) long_3;
			} else {
				IComponentDefinitions icomponentdefinitions_5;
				if (i_2 == 3) {
					icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 54);
					if (!class282_sub50_sub12_11.aString9640.equals(icomponentdefinitions_5.aString1391)) {
						icomponentdefinitions_5.aString1391 = class282_sub50_sub12_11.aString9640;
						Class109.method1858(icomponentdefinitions_5, (byte) -73);
					}
				} else if (i_2 == 22) {
					icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 57);
					if (class282_sub50_sub12_11.anInt9668 == 1 != icomponentdefinitions_5.aBool1363) {
						icomponentdefinitions_5.aBool1363 = class282_sub50_sub12_11.anInt9668 == 1;
						Class109.method1858(icomponentdefinitions_5, (byte) -26);
					}
				} else {
					int i_6;
					int i_7;
					int i_8;
					if (i_2 == 4) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 70);
						i_6 = class282_sub50_sub12_11.anInt9668;
						i_7 = class282_sub50_sub12_11.anInt9641;
						i_8 = class282_sub50_sub12_11.anInt9642;
						if (i_6 != icomponentdefinitions_5.anInt1329 || i_7 != icomponentdefinitions_5.anInt1330 || i_8 != icomponentdefinitions_5.anInt1339) {
							icomponentdefinitions_5.anInt1329 = i_6;
							icomponentdefinitions_5.anInt1330 = i_7;
							icomponentdefinitions_5.anInt1339 = i_8;
							icomponentdefinitions_5.aClass417_1308 = null;
							Class109.method1858(icomponentdefinitions_5, (byte) 2);
						}
					} else if (i_2 == 5) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 59);
						if (class282_sub50_sub12_11.anInt9668 != icomponentdefinitions_5.anInt1321) {
							if (class282_sub50_sub12_11.anInt9668 != -1) {
								if (icomponentdefinitions_5.aClass456_1437 == null) {
									icomponentdefinitions_5.aClass456_1437 = new Class456_Sub1();
								}

								icomponentdefinitions_5.aClass456_1437.method7567(class282_sub50_sub12_11.anInt9668, (short) 8960);
							} else {
								icomponentdefinitions_5.aClass456_1437 = null;
							}

							icomponentdefinitions_5.anInt1321 = class282_sub50_sub12_11.anInt9668;
							Class109.method1858(icomponentdefinitions_5, (byte) -35);
						}
					} else if (i_2 == 6) {
						int i_12 = class282_sub50_sub12_11.anInt9668;
						i_6 = i_12 >> 10 & 0x1f;
						i_7 = i_12 >> 5 & 0x1f;
						i_8 = i_12 & 0x1f;
						int i_9 = (i_7 << 11) + (i_6 << 19) + (i_8 << 3);
						IComponentDefinitions icomponentdefinitions_10 = Class117.method1981((int) long_3, (byte) 106);
						if (i_9 != icomponentdefinitions_10.anInt1264) {
							icomponentdefinitions_10.anInt1264 = i_9;
							Class109.method1858(icomponentdefinitions_10, (byte) 85);
						}
					} else if (i_2 == 7) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 66);
						boolean bool_13 = class282_sub50_sub12_11.anInt9668 == 1;
						if (bool_13 != icomponentdefinitions_5.aBool1306) {
							icomponentdefinitions_5.aBool1306 = bool_13;
							Class109.method1858(icomponentdefinitions_5, (byte) -2);
						}
					} else if (i_2 == 8) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 73);
						if (class282_sub50_sub12_11.anInt9668 != icomponentdefinitions_5.anInt1385 || class282_sub50_sub12_11.anInt9641 != icomponentdefinitions_5.anInt1336 || icomponentdefinitions_5.anInt1343 != class282_sub50_sub12_11.anInt9642) {
							icomponentdefinitions_5.anInt1385 = class282_sub50_sub12_11.anInt9668;
							icomponentdefinitions_5.anInt1336 = class282_sub50_sub12_11.anInt9641;
							icomponentdefinitions_5.anInt1343 = class282_sub50_sub12_11.anInt9642;
							if (icomponentdefinitions_5.anInt1426 != -1) {
								if (icomponentdefinitions_5.anInt1417 > 0) {
									icomponentdefinitions_5.anInt1343 = icomponentdefinitions_5.anInt1343 * 32 / icomponentdefinitions_5.anInt1417;
								} else if (icomponentdefinitions_5.anInt1297 > 0) {
									icomponentdefinitions_5.anInt1343 = icomponentdefinitions_5.anInt1343 * 32 / icomponentdefinitions_5.anInt1297;
								}
							}

							Class109.method1858(icomponentdefinitions_5, (byte) -89);
						}
					} else if (i_2 == 9) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 121);
						if (icomponentdefinitions_5.anInt1426 != class282_sub50_sub12_11.anInt9668 || class282_sub50_sub12_11.anInt9641 != icomponentdefinitions_5.anInt1427) {
							icomponentdefinitions_5.anInt1426 = class282_sub50_sub12_11.anInt9668;
							icomponentdefinitions_5.anInt1427 = class282_sub50_sub12_11.anInt9641;
							Class109.method1858(icomponentdefinitions_5, (byte) -62);
						}
					} else if (i_2 == 10) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 4);
						if (class282_sub50_sub12_11.anInt9668 != icomponentdefinitions_5.anInt1293 || class282_sub50_sub12_11.anInt9641 != icomponentdefinitions_5.anInt1334 || class282_sub50_sub12_11.anInt9642 != icomponentdefinitions_5.anInt1337) {
							icomponentdefinitions_5.anInt1293 = class282_sub50_sub12_11.anInt9668;
							icomponentdefinitions_5.anInt1334 = class282_sub50_sub12_11.anInt9641;
							icomponentdefinitions_5.anInt1337 = class282_sub50_sub12_11.anInt9642;
							Class109.method1858(icomponentdefinitions_5, (byte) -28);
						}
					} else if (i_2 == 11) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 61);
						icomponentdefinitions_5.aByte1333 = 0;
						icomponentdefinitions_5.anInt1299 = icomponentdefinitions_5.anInt1295 = class282_sub50_sub12_11.anInt9668;
						icomponentdefinitions_5.aByte1355 = 0;
						icomponentdefinitions_5.anInt1428 = icomponentdefinitions_5.anInt1296 = class282_sub50_sub12_11.anInt9641;
						Class109.method1858(icomponentdefinitions_5, (byte) 30);
					} else if (i_2 == 12) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 13);
						i_6 = class282_sub50_sub12_11.anInt9668;
						if (icomponentdefinitions_5 != null && icomponentdefinitions_5.anInt1268 == 0) {
							if (i_6 > icomponentdefinitions_5.anInt1314 - icomponentdefinitions_5.anInt1429) {
								i_6 = icomponentdefinitions_5.anInt1314 - icomponentdefinitions_5.anInt1429;
							}

							if (i_6 < 0) {
								i_6 = 0;
							}

							if (i_6 != icomponentdefinitions_5.anInt1312) {
								icomponentdefinitions_5.anInt1312 = i_6;
								Class109.method1858(icomponentdefinitions_5, (byte) -20);
							}
						}
					} else if (i_2 == 14) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 39);
						icomponentdefinitions_5.anInt1320 = class282_sub50_sub12_11.anInt9668;
					} else if (i_2 == 15) {
						Class187.aBool2360 = true;
						Class187.anInt2361 = class282_sub50_sub12_11.anInt9668;
						Class187.anInt2359 = class282_sub50_sub12_11.anInt9641;
					} else if (i_2 == 16) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 73);
						icomponentdefinitions_5.anInt1277 = class282_sub50_sub12_11.anInt9668;
					} else if (i_2 == 20) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 127);
						icomponentdefinitions_5.aBool1356 = class282_sub50_sub12_11.anInt9668 == 1;
					} else if (i_2 == 21) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 114);
						icomponentdefinitions_5.aBool1328 = class282_sub50_sub12_11.anInt9668 == 1;
					} else if (i_2 == 17) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 82);
						icomponentdefinitions_5.anInt1435 = class282_sub50_sub12_11.anInt9668;
					} else if (i_2 == 18) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 125);
						i_6 = (int) (long_3 >> 32);
						icomponentdefinitions_5.method2007(i_6, (short) class282_sub50_sub12_11.anInt9668, (short) class282_sub50_sub12_11.anInt9641, -328591291);
					} else if (i_2 == 19) {
						icomponentdefinitions_5 = Class117.method1981((int) long_3, (byte) 16);
						i_6 = (int) (long_3 >> 32);
						icomponentdefinitions_5.method2013(i_6, (short) class282_sub50_sub12_11.anInt9668, (short) class282_sub50_sub12_11.anInt9641, (byte) 69);
					}
				}
			}
		}

	}

	static boolean method1465(int i_0) {
		return Class86.method1481(Class149_Sub2.DEFAULTS_LOADER_7.aClass232_5873, (byte) -3);
	}

}
