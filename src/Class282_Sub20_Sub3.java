public class Class282_Sub20_Sub3 extends Class282_Sub20 {

	int anInt9682 = 0;
	int anInt9684 = 0;
	int anInt9680 = 1;

	int[] method12319(int i_1, int i_2) {
		int[] ints_3 = this.aClass320_7667.method5721(i_1, -4712683);
		if (this.aClass320_7667.aBool3722) {
			int i_4 = Class316.anIntArray3668[i_1];
			int i_5 = i_4 - 2048 >> 1;

			for (int i_6 = 0; i_6 < Class316.anInt3670; i_6++) {
				int i_7 = Class316.anIntArray3672[i_6];
				int i_8 = i_7 - 2048 >> 1;
				int i_9;
				if (this.anInt9682 == 0) {
					i_9 = (i_7 - i_4) * this.anInt9680;
				} else {
					int i_10 = i_5 * i_5 + i_8 * i_8 >> 12;
					i_9 = (int) (Math.sqrt((double) ((float) i_10 / 4096.0F)) * 4096.0D);
					i_9 = (int) ((double) (i_9 * this.anInt9680) * 3.141592653589793D);
				}

				i_9 -= i_9 & ~0xfff;
				if (this.anInt9684 == 0) {
					i_9 = Class316.anIntArray3677[i_9 >> 4 & 0xff] + 4096 >> 1;
				} else if (this.anInt9684 == 2) {
					i_9 -= 2048;
					if (i_9 < 0) {
						i_9 = -i_9;
					}

					i_9 = 2048 - i_9 << 1;
				}

				ints_3[i_6] = i_9;
			}
		}

		return ints_3;
	}

	void method12321(int i_1) {
		Class316.method5586((byte) 39);
	}

	void method12322(int i_1, RsByteBuffer rsbytebuffer_2, int i_3) {
		switch (i_1) {
		case 0:
			this.anInt9682 = rsbytebuffer_2.readUnsignedByte();
			break;
		case 1:
			this.anInt9684 = rsbytebuffer_2.readUnsignedByte();
		case 2:
		default:
			break;
		case 3:
			this.anInt9680 = rsbytebuffer_2.readUnsignedByte();
		}

	}

	public Class282_Sub20_Sub3() {
		super(0, true);
	}

}
