import java.io.DataInputStream;
import java.net.URL;

public class Class151 {

	public Class464 aClass464_1961 = new Class464();

	static final void method2586(CS2Executor cs2executor_0, int i_1) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub5_8221, cs2executor_0.intStack[--cs2executor_0.intStackPtr], -2100114669);
		Class190.method3148((byte) 44);
	}

	static final void method2587(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aShort7436;
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aShort7437;
	}

	static final void method2588(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub24_8216.method12923(-1002096865) ? 1 : 0;
	}

	public static void method2589(boolean bool_0, byte[] bytes_1, int i_2) {
		if (Class96_Sub20.aClass282_Sub35_9415 == null) {
			Class96_Sub20.aClass282_Sub35_9415 = new RsByteBuffer(20000);
		}

		Class96_Sub20.aClass282_Sub35_9415.writeBytes(bytes_1, 0, bytes_1.length);
		if (bool_0) {
			Class468_Sub10.method12695(Class96_Sub20.aClass282_Sub35_9415.buffer, (byte) 1);
			Class448.aClass217_Sub1Array5426 = new Class217_Sub1[Class4.anInt34];
			int i_3 = 0;

			for (int i_4 = Class485.anInt5740; i_4 <= Class244.anInt3003; i_4++) {
				Class217_Sub1 class217_sub1_5 = ObjectIndexLoader.method7916(i_4, 241978983);
				if (class217_sub1_5 != null) {
					Class448.aClass217_Sub1Array5426[i_3++] = class217_sub1_5;
				}
			}

			Class448.aBool5422 = false;
			Class448.aLong5425 = Class169.method2869(1708391360);
			Class96_Sub20.aClass282_Sub35_9415 = null;
		}

	}

	static void method2590(IComponentDefinitions icomponentdefinitions_0, byte b_1) {
		if (client.aBool7344) {
			if (icomponentdefinitions_0.anObjectArray1393 != null) {
				IComponentDefinitions icomponentdefinitions_2 = Index.method5694(Class7.anInt56, client.anInt7345, -1264111799);
				if (icomponentdefinitions_2 != null) {
					HookRequest hookrequest_3 = new HookRequest();
					hookrequest_3.iComponentDefs = icomponentdefinitions_0;
					hookrequest_3.aClass118_8057 = icomponentdefinitions_2;
					hookrequest_3.params = icomponentdefinitions_0.anObjectArray1393;
					Class96_Sub4.executeHookInner200k(hookrequest_3, 1791224764);
				}
			}

			TCPMessage tcpmessage_4 = Class271.method4828(OutgoingPacket.aClass379_4573, client.aClass184_7475.isaac, 891007251);
			tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.anInt1288, -1183932171);
			tcpmessage_4.buffer.writeShortLE(client.anInt7345, (short) -9723);
			tcpmessage_4.buffer.writeShortLE128(icomponentdefinitions_0.anInt1426, -1183932171);
			tcpmessage_4.buffer.writeLEInt(icomponentdefinitions_0.idHash, (byte) 89);
			tcpmessage_4.buffer.writeIntV2(Class7.anInt56, (byte) 104);
			tcpmessage_4.buffer.writeShortLE(client.anInt7346, (short) -1117);
			client.aClass184_7475.method3049(tcpmessage_4, 656208756);
		}

	}

	static final void method2591(IComponentDefinitions[] arr_0, int i_1, byte b_2) {
		for (int i_3 = 0; i_3 < arr_0.length; i_3++) {
			IComponentDefinitions icomponentdefinitions_4 = arr_0[i_3];
			if (icomponentdefinitions_4 != null) {
				if (icomponentdefinitions_4.anInt1268 == 0) {
					if (icomponentdefinitions_4.aClass118Array1439 != null) {
						method2591(icomponentdefinitions_4.aClass118Array1439, i_1, (byte) -28);
					}

					Class282_Sub44 class282_sub44_5 = (Class282_Sub44) client.aClass465_7442.method7754((long) icomponentdefinitions_4.idHash);
					if (class282_sub44_5 != null) {
						Class383.method6514(class282_sub44_5.anInt8063, i_1, -138211954);
					}
				}

				HookRequest hookrequest_6;
				if (i_1 == 0 && icomponentdefinitions_4.anObjectArray1421 != null) {
					hookrequest_6 = new HookRequest();
					hookrequest_6.iComponentDefs = icomponentdefinitions_4;
					hookrequest_6.params = icomponentdefinitions_4.anObjectArray1421;
					Class96_Sub4.executeHookInner200k(hookrequest_6, 506526261);
				}

				if (i_1 == 1 && icomponentdefinitions_4.anObjectArray1346 != null) {
					if (icomponentdefinitions_4.anInt1288 >= 0) {
						IComponentDefinitions icomponentdefinitions_7 = Class117.method1981(icomponentdefinitions_4.idHash, (byte) 87);
						if (icomponentdefinitions_7 == null || icomponentdefinitions_7.aClass118Array1438 == null || icomponentdefinitions_4.anInt1288 >= icomponentdefinitions_7.aClass118Array1438.length || icomponentdefinitions_4 != icomponentdefinitions_7.aClass118Array1438[icomponentdefinitions_4.anInt1288]) {
							continue;
						}
					}

					hookrequest_6 = new HookRequest();
					hookrequest_6.iComponentDefs = icomponentdefinitions_4;
					hookrequest_6.params = icomponentdefinitions_4.anObjectArray1346;
					Class96_Sub4.executeHookInner200k(hookrequest_6, 2094989397);
				}
			}
		}

	}

	static final void method2592(byte b_0) {
		if (!Class282_Sub17.method12259(client.anInt7166, -632153862) && !Class97.method1612(client.anInt7166, 1908805257)) {
			Class233.aClass202_2883 = client.aClass184_7475.method3053((byte) -113);
			client.aClass184_7475.method3061(-1872117357);
			Class365.setGameState(10, 1328603649);
		} else {
			Class438.method7333(false, 2084407063);
		}

	}

	static final void method2593(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1647551269) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1394 = Class351.method6193(string_4, cs2executor_2, 1442904775);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public static void method2594(String string_0, Throwable throwable_1, byte b_2) {
		try {
			String str_3 = "";
			if (throwable_1 != null) {
				str_3 = Class96_Sub3.method13787(throwable_1, (byte) -73);
			}

			if (string_0 != null) {
				if (throwable_1 != null) {
					str_3 = str_3 + " | ";
				}

				str_3 = str_3 + string_0;
			}

			CS2Executor.method11251(str_3, -16686792);
			str_3 = Class475.method7926(str_3, -53160653);
			if (RuntimeException_Sub3.anApplet10460 != null) {
				String str_4 = "Unknown";
				String str_5 = "1.1";

				try {
					str_4 = System.getProperty("java.vendor");
					str_5 = System.getProperty("java.version");
				} catch (Exception exception_8) {
					;
				}

				URL url_6 = new URL(RuntimeException_Sub3.anApplet10460.getCodeBase(), "clienterror.ws?c=" + RuntimeException_Sub3.anInt10457 + "&cs=" + InventoriesIndexLoader.anInt4781 + "&u=" + (RuntimeException_Sub3.aString10458 != null ? Class475.method7926(RuntimeException_Sub3.aString10458, -790911814) : "" + RuntimeException_Sub3.aLong10459) + "&v1=" + Class475.method7926(str_4, 553035872) + "&v2=" + Class475.method7926(str_5, 72672054) + "&e=" + str_3);
				DataInputStream datainputstream_7 = new DataInputStream(url_6.openStream());
				datainputstream_7.read();
				datainputstream_7.close();
			}
		} catch (Exception exception_9) {
			exception_9.printStackTrace();
		}

	}

	static final void method2595(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 76);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class380.method6453(icomponentdefinitions_3, interface_4, cs2executor_0, -1649840188);
	}

}
