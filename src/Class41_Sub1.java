public abstract class Class41_Sub1 extends Class41 {

	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9206;
	static Matrix44Arr aClass384_9228 = new Matrix44Arr();
	protected Class101 aClass101_9218;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9212;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9211;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9204;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9202;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9207;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9208;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9216;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9229;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9209;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9214;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9215;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9217;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9213;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9203;
	Class282_Sub21_Sub1 aClass282_Sub21_Sub1_9205;
	int anInt9226;
	int[] anIntArray9201;
	float[] aFloatArray9230 = new float[3];
	Matrix44Arr[] aClass384Array9227;

	void method877() {
	}

	boolean method14523(String string_1) throws Exception_Sub2 {
		this.aClass101_9218 = this.aClass505_Sub2_413.method13890(string_1);
		if (this.aClass101_9218 == null) {
			throw new Exception_Sub2("");
		} else {
			this.aClass282_Sub21_Sub1_9212 = this.aClass101_9218.method1681("textureMatrix", (byte) 18);
			this.aClass282_Sub21_Sub1_9211 = this.aClass101_9218.method1681("modelMatrix", (byte) -24);
			this.aClass282_Sub21_Sub1_9204 = this.aClass101_9218.method1681("viewMatrix", (byte) -52);
			this.aClass282_Sub21_Sub1_9202 = this.aClass101_9218.method1681("projectionMatrix", (byte) -50);
			this.aClass282_Sub21_Sub1_9207 = this.aClass101_9218.method1681("modelViewMatrix", (byte) 33);
			this.aClass282_Sub21_Sub1_9208 = this.aClass101_9218.method1681("modelViewProjectionMatrix", (byte) 81);
			this.aClass282_Sub21_Sub1_9216 = this.aClass101_9218.method1681("viewProjectionMatrix", (byte) -33);
			this.aClass282_Sub21_Sub1_9229 = this.aClass101_9218.method1681("ambientColour", (byte) -14);
			this.aClass282_Sub21_Sub1_9209 = this.aClass101_9218.method1681("sunDirection", (byte) 68);
			this.aClass282_Sub21_Sub1_9214 = this.aClass101_9218.method1681("sunColour", (byte) 81);
			this.aClass282_Sub21_Sub1_9215 = this.aClass101_9218.method1681("antiSunColour", (byte) -7);
			this.aClass282_Sub21_Sub1_9217 = this.aClass101_9218.method1681("sunExponent", (byte) -20);
			this.aClass282_Sub21_Sub1_9213 = this.aClass101_9218.method1681("eyePosition", (byte) -36);
			this.aClass282_Sub21_Sub1_9203 = this.aClass101_9218.method1681("eyePositionOS", (byte) 7);
			this.aClass282_Sub21_Sub1_9205 = this.aClass101_9218.method1681("sunDirectionOS", (byte) 39);
			if (!this.method14524()) {
				this.aClass101_9218 = null;
				this.aClass282_Sub21_Sub1_9212 = null;
				this.aClass282_Sub21_Sub1_9211 = null;
				this.aClass282_Sub21_Sub1_9204 = null;
				this.aClass282_Sub21_Sub1_9202 = null;
				this.aClass282_Sub21_Sub1_9207 = null;
				this.aClass282_Sub21_Sub1_9208 = null;
				this.aClass282_Sub21_Sub1_9216 = null;
				this.aClass282_Sub21_Sub1_9229 = null;
				this.aClass282_Sub21_Sub1_9209 = null;
				this.aClass282_Sub21_Sub1_9214 = null;
				this.aClass282_Sub21_Sub1_9215 = null;
				this.aClass282_Sub21_Sub1_9217 = null;
				this.aClass282_Sub21_Sub1_9213 = null;
				this.aClass282_Sub21_Sub1_9203 = null;
				this.aClass282_Sub21_Sub1_9205 = null;
				return false;
			} else {
				if (this.aClass101_9218.method1656(413496416) == null) {
					Class115 class115_2 = this.aClass101_9218.method1654(604973216);
					if (class115_2 == null) {
						throw new Exception_Sub2(this.aClass101_9218.method1717(40421350) + "");
					}

					this.aClass101_9218.method1655(class115_2);
				}

				this.anInt9226 = this.aClass101_9218.method1650(1800341695);
				this.anIntArray9201 = new int[this.anInt9226];
				return true;
			}
		}
	}

	abstract boolean method14524() throws Exception_Sub2;

	void method14526() {
		this.method14530(this.aClass505_Sub2_413.aBool8684);
		this.method14527(this.aClass505_Sub2_413.method13884());
		this.method14528();
		this.method877();
	}

	void method885() {
		if (this.aClass101_9218 != null) {
			this.aClass101_9218.method1647();
		}

	}

	void method14527(Matrix44Arr matrix44arr_1) {
		if (this.aClass101_9218 != null && this.aClass101_9218.method1648() && this.aClass505_Sub2_413.method13963() == 0) {
			int i_2 = this.aClass101_9218.method1714(-1997910663);
			if ((this.anIntArray9201[i_2] & 0x80) != 0 && this.aClass282_Sub21_Sub1_9212 != null) {
				this.aClass101_9218.method1667(this.aClass282_Sub21_Sub1_9212, matrix44arr_1, 1796891625);
				this.anIntArray9201[i_2] &= ~0x80;
			}
		}

	}

	void method14528() {
		if (this.aClass101_9218 != null && this.aClass101_9218.method1648()) {
			int i_1 = this.aClass101_9218.method1714(-2137286253);
			int i_2 = this.anIntArray9201[i_1];
			if ((i_2 & 0x1) != 0 && this.aClass282_Sub21_Sub1_9211 != null) {
				this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9211, this.aClass505_Sub2_413.method14036(), (byte) -54);
			}

			if ((i_2 & 0x2) != 0) {
				if (this.aClass282_Sub21_Sub1_9204 != null) {
					this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9204, this.aClass505_Sub2_413.method14126(), (byte) -33);
				}

				if (this.aClass282_Sub21_Sub1_9213 != null) {
					this.aFloatArray9230[0] = 0.0F;
					this.aFloatArray9230[1] = 0.0F;
					this.aFloatArray9230[2] = 0.0F;
					this.aClass505_Sub2_413.method8458().method5228(this.aFloatArray9230[0], this.aFloatArray9230[1], this.aFloatArray9230[2], this.aFloatArray9230);
					this.aClass101_9218.method1661(this.aClass282_Sub21_Sub1_9213, this.aFloatArray9230[0], this.aFloatArray9230[1], this.aFloatArray9230[2], (byte) -104);
				}
			}

			if ((i_2 & 0x10) != 0 && this.aClass282_Sub21_Sub1_9207 != null) {
				this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9207, this.aClass505_Sub2_413.method13930(), (byte) -45);
			}

			if ((i_2 & 0x8) != 0 && this.aClass282_Sub21_Sub1_9206 != null) {
				this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9206, this.aClass505_Sub2_413.method13998(), (byte) -72);
			}

			if ((i_2 & 0x4) != 0 && this.aClass282_Sub21_Sub1_9202 != null) {
				this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9202, this.aClass505_Sub2_413.method13912(), (byte) -67);
			}

			if ((i_2 & 0x20) != 0 && this.aClass282_Sub21_Sub1_9208 != null) {
				aClass384_9228.method6568(this.aClass505_Sub2_413.method13930(), this.aClass505_Sub2_413.method13912());
				this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9208, aClass384_9228, (byte) -54);
			}

			if ((i_2 & 0x40) != 0 && this.aClass282_Sub21_Sub1_9216 != null) {
				aClass384_9228.method6568(this.aClass505_Sub2_413.method14126(), this.aClass505_Sub2_413.method13912());
				this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9216, aClass384_9228, (byte) -94);
			}

			if (this.aClass505_Sub2_413.method13963() == 0 && (this.anIntArray9201[i_1] & 0x80) != 0 && this.aClass282_Sub21_Sub1_9212 != null) {
				this.aClass101_9218.method1667(this.aClass282_Sub21_Sub1_9212, this.aClass505_Sub2_413.method13884(), 56632045);
				this.anIntArray9201[i_1] &= ~0x80;
			}

			this.anIntArray9201[i_1] = 0;
		}

	}

	void method14529(int i_1, Matrix44Var matrix44var_2) {
		if (this.aClass282_Sub21_Sub1_9203 != null) {
			Matrix44Arr matrix44arr_3 = this.aClass505_Sub2_413.method13998();
			float[] floats_4 = new float[] { matrix44arr_3.buf[12], matrix44arr_3.buf[13], matrix44arr_3.buf[14] };
			float[] floats_5 = new float[] { 0.0F, 0.0F, 0.0F };
			matrix44arr_3.method6528(floats_5);
			float[] floats_6 = new float[] { 0.0F, 0.0F, 0.0F };
			this.aClass505_Sub2_413.method8458().method5226(0.0F, 0.0F, 0.0F, floats_6);
			matrix44var_2.method5243(floats_4);
			this.aClass101_9218.method1661(this.aClass282_Sub21_Sub1_9203, floats_4[0], floats_4[1], floats_4[2], (byte) -92);
		}

	}

	void method886() {
		this.method14532(Matrix44Var.aClass294_3518);
	}

	void method14530(boolean bool_1) {
		if (this.aClass101_9218 != null && this.aClass101_9218.method1648()) {
			if (this.aClass282_Sub21_Sub1_9229 != null) {
				this.aClass101_9218.method1661(this.aClass282_Sub21_Sub1_9229, this.aClass505_Sub2_413.aFloat8766 * this.aClass505_Sub2_413.aFloat8769, this.aClass505_Sub2_413.aFloat8767 * this.aClass505_Sub2_413.aFloat8769, this.aClass505_Sub2_413.aFloat8768 * this.aClass505_Sub2_413.aFloat8769, (byte) -107);
			}

			if (this.aClass282_Sub21_Sub1_9209 != null) {
				this.aClass101_9218.method1661(this.aClass282_Sub21_Sub1_9209, this.aClass505_Sub2_413.aFloatArray8747[0], this.aClass505_Sub2_413.aFloatArray8747[1], this.aClass505_Sub2_413.aFloatArray8747[2], (byte) -123);
			}

			if (this.aClass282_Sub21_Sub1_9214 != null) {
				this.aClass101_9218.method1661(this.aClass282_Sub21_Sub1_9214, this.aClass505_Sub2_413.aFloat8766 * this.aClass505_Sub2_413.aFloat8770, this.aClass505_Sub2_413.aFloat8767 * this.aClass505_Sub2_413.aFloat8770, this.aClass505_Sub2_413.aFloat8768 * this.aClass505_Sub2_413.aFloat8770, (byte) -113);
			}

			if (this.aClass282_Sub21_Sub1_9215 != null) {
				this.aClass101_9218.method1661(this.aClass282_Sub21_Sub1_9215, -this.aClass505_Sub2_413.aFloat8766 * this.aClass505_Sub2_413.aFloat8826, -this.aClass505_Sub2_413.aFloat8767 * this.aClass505_Sub2_413.aFloat8826, -this.aClass505_Sub2_413.aFloat8768 * this.aClass505_Sub2_413.aFloat8826, (byte) -35);
			}

			if (this.aClass282_Sub21_Sub1_9217 != null) {
				this.aClass101_9218.method1659(this.aClass282_Sub21_Sub1_9217, 64.0F + Math.abs(this.aClass505_Sub2_413.aFloatArray8747[1]) * 928.0F, (short) 25645);
			}
		}

	}

	void method879() {
		this.method14532(Matrix44Var.aClass294_3518);
	}

	void method14532(Matrix44Var matrix44var_1) {
		Matrix44Arr matrix44arr_2 = this.aClass505_Sub2_413.aClass384_8683;
		matrix44arr_2.fromVarMatrix44(matrix44var_1);
		int i_3 = this.aClass101_9218.method1714(-1934547708);
		if (this.aClass282_Sub21_Sub1_9211 != null) {
			this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9211, matrix44arr_2, (byte) -59);
			this.anIntArray9201[i_3] &= ~0x1;
		}

		if (this.aClass282_Sub21_Sub1_9207 != null) {
			aClass384_9228.method6568(matrix44arr_2, this.aClass505_Sub2_413.method14126());
			this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9207, aClass384_9228, (byte) -4);
			this.anIntArray9201[i_3] &= ~0x10;
		}

		if (this.aClass282_Sub21_Sub1_9208 != null) {
			aClass384_9228.method6568(matrix44arr_2, this.aClass505_Sub2_413.method13931());
			this.aClass101_9218.method1668(this.aClass282_Sub21_Sub1_9208, aClass384_9228, (byte) -61);
			this.anIntArray9201[i_3] &= ~0x20;
		}

		this.method14529(i_3, matrix44var_1);
		this.method14549(i_3, matrix44var_1);
	}

	void method888() {
		this.aClass101_9218.method1646();
		this.anIntArray9201[this.aClass101_9218.method1714(-1896522085)] = -1;
		this.method14550(0);
		this.method14526();
	}

	void method889() {
		this.method14532(Matrix44Var.aClass294_3518);
	}

	void method14536(int i_1) {
		for (int i_2 = 0; i_2 < this.anInt9226; i_2++) {
			this.anIntArray9201[i_2] |= 128 << i_1;
		}

	}

	abstract boolean method14539() throws Exception_Sub2;

	abstract boolean method14541() throws Exception_Sub2;

	void method873() {
		this.aClass101_9218.method1646();
		this.anIntArray9201[this.aClass101_9218.method1714(-2118159907)] = -1;
		this.method14550(0);
		this.method14526();
	}

	Class41_Sub1(Class505_Sub2 class505_sub2_1) {
		super(class505_sub2_1);
		new Matrix44Var();
		this.aClass384Array9227 = new Matrix44Arr[this.aClass505_Sub2_413.anInt8825];

		for (int i_2 = 0; i_2 < this.aClass505_Sub2_413.anInt8825; i_2++) {
			this.aClass384Array9227[i_2] = new Matrix44Arr();
		}

	}

	void method14549(int i_1, Matrix44Var matrix44var_2) {
		if (this.aClass282_Sub21_Sub1_9205 != null) {
			float[] floats_3 = new float[] { this.aClass505_Sub2_413.aFloatArray8747[0], this.aClass505_Sub2_413.aFloatArray8747[1], this.aClass505_Sub2_413.aFloatArray8747[2] };
			matrix44var_2.method5230(floats_3);
			this.aClass101_9218.method1661(this.aClass282_Sub21_Sub1_9205, floats_3[0], floats_3[1], floats_3[2], (byte) -97);
		}

	}

	void method14550(int i_1) {
		this.aClass384Array9227[0].identity();
		this.method14536(i_1);
	}

}
