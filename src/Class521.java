public class Class521 {

	boolean aBool5938 = true;
	boolean aBool5945 = true;
	boolean aBool5942;
	Class521 aClass521_5944;
	Class521 aClass521_5943;
	Class521 aClass521_5940;
	Class305 aClass305_5936 = new Class305();
	Class305 aClass305_5937 = new Class305();
	Class305 aClass305_5939 = new Class305();
	Matrix44Var aClass294_5941;

	public final Class305 method11165() {
		return this.aClass305_5936;
	}

	public final Class305 method11166() {
		if (this.aBool5938) {
			this.aBool5938 = false;
			if (this.aClass521_5943 != null) {
				this.aClass305_5937.method5411(this.aClass305_5936);
				this.aClass305_5937.method5414(this.aClass521_5943.method11166());
			} else {
				this.aClass305_5937.method5411(this.aClass305_5936);
			}
		}

		return this.aClass305_5937;
	}

	final Class305 method11167() {
		if (this.aBool5945) {
			this.aBool5945 = false;
			this.aClass305_5939.method5411(this.method11166());
			this.aClass305_5939.method5413();
		}

		return this.aClass305_5937;
	}

	final Matrix44Var method11168() {
		if (this.aBool5942) {
			this.aBool5942 = false;
			this.aClass294_5941.method5279(this.method11166());
		}

		return this.aClass294_5941;
	}

	public final void method11171(Vector3 vector3_1) {
		this.aClass305_5936.aClass385_3595.copy(vector3_1);
		this.method11174();
		if (this.aClass521_5944 != null) {
			this.aClass521_5944.method11188();
		}

	}

	public final void method11172(float f_1, float f_2, float f_3) {
		this.aClass305_5936.aClass385_3595.set(f_1, f_2, f_3);
		this.method11174();
		if (this.aClass521_5944 != null) {
			this.aClass521_5944.method11188();
		}

	}

	final void method11174() {
		this.aBool5938 = true;
		this.aBool5945 = true;
		this.aBool5942 = true;
	}

	final void method11175(Class305 class305_1) {
		this.aClass305_5936.method5411(class305_1);
		this.method11174();
		if (this.aClass521_5944 != null) {
			this.aClass521_5944.method11188();
		}

	}

	public final void method11176() {
		Class521 class521_1;
		if (this.aClass521_5943 != null) {
			class521_1 = this.aClass521_5943.aClass521_5944;
			if (class521_1 == this) {
				this.aClass521_5943.aClass521_5944 = this.aClass521_5940;
			} else {
				while (this != class521_1.aClass521_5940) {
					class521_1 = class521_1.aClass521_5940;
				}

				class521_1.aClass521_5940 = this.aClass521_5940;
			}
		}

		this.method11174();
		if (this.aClass521_5944 != null) {
			this.aClass521_5944.method11188();
			class521_1 = this.aClass521_5944;

			while (true) {
				class521_1.aClass305_5936.method5414(this.aClass305_5936);
				class521_1.aClass521_5943 = this.aClass521_5943;
				if (class521_1.aClass521_5940 == null) {
					class521_1.aClass521_5940 = this.aClass521_5943.aClass521_5944;
					this.aClass521_5943.aClass521_5944 = this.aClass521_5944;
					break;
				}

				class521_1 = class521_1.aClass521_5940;
			}
		}

		this.aClass521_5943 = null;
		this.aClass521_5940 = null;
		this.aClass521_5944 = null;
	}

	public final void method11187(Quaternion quaternion_1) {
		this.aClass305_5936.aClass381_3594.copy(quaternion_1);
		this.method11174();
		if (this.aClass521_5944 != null) {
			this.aClass521_5944.method11188();
		}

	}

	final void method11188() {
		this.method11174();
		if (this.aClass521_5944 != null) {
			this.aClass521_5944.method11188();
		}

		if (this.aClass521_5940 != null) {
			this.aClass521_5940.method11188();
		}

	}

	Class521() {
		new Matrix44Arr();
		new Matrix44Arr();
		this.aClass294_5941 = new Matrix44Var();
		this.aBool5942 = true;
		this.aClass521_5943 = null;
		this.aClass521_5944 = null;
		this.aClass521_5940 = null;
	}

	final void method11191(Class305 class305_1) {
		if (this.aClass521_5943 != null) {
			Class305 class305_2 = new Class305(class305_1);
			class305_2.method5414(this.aClass521_5943.method11167());
			this.method11175(class305_2);
		} else {
			this.method11175(class305_1);
		}

	}

}
