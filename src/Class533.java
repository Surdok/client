public class Class533 {

	static JS5CacheFile aClass203_7073;

	Class533() throws Throwable {
		throw new Error();
	}

	static final void method11403(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 25);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		Class237.method3987(icomponentdefinitions_3, interface_4, cs2executor_0, -599656695);
	}

	static void method11404(String string_0, String string_1, String string_2, boolean bool_3, boolean bool_4, int i_5) {
		Class184 class184_6 = Class468_Sub20.method12807(-1561736689);
		if (class184_6.method3053((byte) -70) != null) {
			TCPMessage tcpmessage_7 = Class271.method4828(OutgoingPacket.aClass379_4543, class184_6.isaac, 666430203);
			tcpmessage_7.buffer.writeShort(ChatLine.getLength(string_0) + ChatLine.getLength(string_1) + ChatLine.getLength(string_2) + 1, 1417031095);
			tcpmessage_7.buffer.writeString(string_0);
			tcpmessage_7.buffer.writeString(string_1);
			tcpmessage_7.buffer.writeString(string_2);
			int i_8 = 0;
			if (bool_3) {
				i_8 |= 0x1;
			}

			if (bool_4) {
				i_8 |= 0x2;
			}

			tcpmessage_7.buffer.writeByte(i_8);
			class184_6.method3049(tcpmessage_7, 1665621152);
		}

	}

	static final void method11405(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		client.anInt7340 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		client.anInt7342 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
	}

	static final void method11406(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_2, 1937289773).stackable == 1 ? 1 : 0;
	}

}
