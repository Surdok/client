public class Class282_Sub20_Sub29 extends Class282_Sub20 {

	public static int anInt9913 = -1;
	int[] anIntArray9916;
	int anInt9914;
	int anInt9915;
	int anInt9912 = -1;

	void method12326(int i_1) {
		super.method12326(984017845);
		this.anIntArray9916 = null;
	}

	boolean method15398(int i_1) {
		if (this.anIntArray9916 != null) {
			return true;
		} else if (this.anInt9912 >= 0) {
			Class91 class91_2 = anInt9913 >= 0 ? Class91.method1522(Class532_Sub2.aClass317_7925, anInt9913, this.anInt9912) : Class91.method1515(Class532_Sub2.aClass317_7925, this.anInt9912);
			class91_2.method1523();
			this.anIntArray9916 = class91_2.method1528();
			this.anInt9914 = class91_2.anInt957;
			this.anInt9915 = class91_2.anInt954;
			return true;
		} else {
			return false;
		}
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		if (i_1 == 0) {
			this.anInt9912 = rsbytebuffer_2.readUnsignedShort();
		}

	}

	public Class282_Sub20_Sub29() {
		super(0, false);
	}

	int method12323(int i_1) {
		return this.anInt9912;
	}

	int[][] method12320(int i_1, int i_2) {
		int[][] ints_3 = this.aClass308_7670.method5463(i_1, 1580670333);
		if (this.aClass308_7670.aBool3619 && this.method15398(1057936106)) {
			int[] ints_4 = ints_3[0];
			int[] ints_5 = ints_3[1];
			int[] ints_6 = ints_3[2];
			int i_7 = (this.anInt9915 != Class316.anInt3671 ? this.anInt9915 * i_1 / Class316.anInt3671 : i_1) * this.anInt9914;
			int i_8;
			int i_9;
			if (this.anInt9914 == Class316.anInt3670) {
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = this.anIntArray9916[i_7++];
					ints_6[i_8] = (i_9 & 0xff) << 4;
					ints_5[i_8] = (i_9 & 0xff00) >> 4;
					ints_4[i_8] = (i_9 & 0xff0000) >> 12;
				}
			} else {
				for (i_8 = 0; i_8 < Class316.anInt3670; i_8++) {
					i_9 = i_8 * this.anInt9914 / Class316.anInt3670;
					int i_10 = this.anIntArray9916[i_7 + i_9];
					ints_6[i_8] = (i_10 & 0xff) << 4;
					ints_5[i_8] = (i_10 & 0xff00) >> 4;
					ints_4[i_8] = (i_10 & 0xff0000) >> 12;
				}
			}
		}

		return ints_3;
	}

}
