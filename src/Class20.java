public class Class20 {

	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_157;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_168;
	static int[] anIntArray177;
	static int anInt186;
	public static int anInt188;
	static int anInt178 = 16;
	public static boolean aBool161 = false;
	static boolean aBool162 = false;
	static Class282_Sub50_Sub15 aClass282_Sub50_Sub15_163 = null;
	static int anInt167 = 0;
	public static int anInt169 = 0;
	public static int anInt170 = 0;
	static NodeCollection aClass482_171 = new NodeCollection();
	static IterableNodeMap aClass465_172 = new IterableNodeMap(16);
	static Class477 aClass477_182 = new Class477();
	static NodeCollection aClass482_174 = new NodeCollection();
	static NodeCollection aClass482_175 = new NodeCollection();
	static SoftCache aClass229_164 = new SoftCache(30);
	static IComponentDefinitions aClass118_183 = null;
	static int anInt195 = -1;
	static int anInt179 = -1;
	static int anInt180 = -1;
	static int anInt181 = -1;
	static int anInt176 = 0;
	static int anInt184 = 0;
	static Matrix44Arr aClass384_158 = null;
	static Matrix44Arr aClass384_185 = new Matrix44Arr();
	static Matrix44Var aClass294_155 = new Matrix44Var();
	public static boolean aBool187 = false;
	static int anInt156 = 0;
	public static int anInt198 = -1;
	static SoftCache aClass229_191 = new SoftCache(8);
	static float[] aFloatArray194 = new float[4];

	Class20() throws Throwable {
		throw new Error();
	}

	static final void method741(CS2Executor cs2executor_0, short s_1) {
		UnderlayDefinition underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class306.method5455(icomponentdefinitions_3, interface_4, cs2executor_0, -869216999);
	}

	static final void method742(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		Class282_Sub50_Sub14 class282_sub50_sub14_3 = IndexLoaders.QUICK_CHAT_INDEX_LOADER.method5918(i_2, -572656458);
		if (class282_sub50_sub14_3.anIntArray9746 == null) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = class282_sub50_sub14_3.anIntArray9746.length;
		}

	}

	static final void method743(CS2Executor cs2executor_0, byte b_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub22_8213.method12872(-257053432) ? 1 : 0;
	}

	static void method744(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6) {
		int i_7 = Class275.method4890(i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -109837866);
		int i_8 = Class275.method4890(i_3, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -766812485);
		int i_9 = Class275.method4890(i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -1790568603);
		int i_10 = Class275.method4890(i_1, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, -1159028771);
		int i_11 = Class275.method4890(i_5 + i_2, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -1317034828);
		int i_12 = Class275.method4890(i_3 - i_5, Class532_Sub1.anInt7070, Class532_Sub1.anInt7068, -1696179527);

		int i_13;
		for (i_13 = i_7; i_13 < i_11; i_13++) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_13], i_9, i_10, i_4, (byte) 31);
		}

		for (i_13 = i_8; i_13 > i_12; --i_13) {
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_13], i_9, i_10, i_4, (byte) 46);
		}

		i_13 = Class275.method4890(i_5 + i_0, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, 2146581760);
		int i_14 = Class275.method4890(i_1 - i_5, Class532_Sub1.anInt7071, Class532_Sub1.anInt7069, 167924575);

		for (int i_15 = i_11; i_15 <= i_12; i_15++) {
			int[] ints_16 = Class532_Sub1.anIntArrayArray7072[i_15];
			Class232.method3922(ints_16, i_9, i_13, i_4, (byte) -7);
			Class232.method3922(ints_16, i_14, i_10, i_4, (byte) -37);
		}

	}

	static final void method745(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.aBool7155 ? 1 : 0;
	}

	public static void animate(Animable animable_0, int[] ints_1, int i_2, boolean bool_3, byte b_4) {
		boolean bool_5;
		int i_6;
		if (animable_0.currentAnimations != null) {
			bool_5 = true;

			for (i_6 = 0; i_6 < animable_0.currentAnimations.length; i_6++) {
				if (animable_0.currentAnimations[i_6] != ints_1[i_6]) {
					bool_5 = false;
					break;
				}
			}

			Animation animation_9 = animable_0.currentAnimation;
			if (bool_5 && animation_9.hasDefs()) {
				AnimationDefinitions animationdefinitions_7 = animable_0.currentAnimation.getDefs();
				int i_8 = animationdefinitions_7.anInt5907;
				if (i_8 == 1) {
					animation_9.method7583(i_2, (byte) 0);
				}

				if (i_8 == 2) {
					animation_9.method7584(-272427166);
				}
			}
		}

		bool_5 = true;

		for (i_6 = 0; i_6 < ints_1.length; i_6++) {
			if (ints_1[i_6] != -1) {
				bool_5 = false;
			}

			if (animable_0.currentAnimations == null || animable_0.currentAnimations[i_6] == -1 || IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(ints_1[i_6], (byte) -52).priority >= IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(animable_0.currentAnimations[i_6], (byte) -23).priority) {
				animable_0.currentAnimations = ints_1;
				animable_0.currentAnimation.setSpeed(i_2);
				if (bool_3) {
					animable_0.anInt10367 = animable_0.anInt10355;
				}
			}
		}

		if (bool_5) {
			animable_0.currentAnimations = ints_1;
			animable_0.currentAnimation.setSpeed(i_2);
			if (bool_3) {
				animable_0.anInt10367 = animable_0.anInt10355;
			}
		}

	}

}
