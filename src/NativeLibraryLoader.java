import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class NativeLibraryLoader implements Interface36 {

	public static int[][] anIntArrayArray3239;
	public static int anInt3240;
	Hashtable linkedLibraries = new Hashtable();
	Hashtable aHashtable3237 = new Hashtable();
	Index nativeLibraryIndex;
	String OS_AND_ARCHITECTURE;

	void method4637(String string_1, File file_2, byte b_3) {
		this.aHashtable3237.put(string_1, file_2);
	}

	public boolean method4639(String string_1, short s_2) {
		return this.linkedLibraries.containsKey(string_1);
	}

	public boolean loadLibrary(String string_1, int i_2) {
		return this.loadLibrary(string_1, Class266.class, (byte) 2);
	}

	public boolean method219(int i_1) {
		Hashtable hashtable_2 = new Hashtable();
		Enumeration enumeration_3 = this.linkedLibraries.keys();

		while (enumeration_3.hasMoreElements()) {
			String string_4 = (String) enumeration_3.nextElement();
			hashtable_2.put(string_4, this.linkedLibraries.get(string_4));
		}

		try {
			Class class_25 = Class.forName("java.lang.reflect.AccessibleObject");
			Class class_5 = Class.forName("java.lang.ClassLoader");
			Field field_6 = class_5.getDeclaredField("nativeLibraries");
			Method method_7 = class_25.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method_7.invoke(field_6, new Object[] { Boolean.TRUE });

			try {
				enumeration_3 = this.linkedLibraries.keys();

				while (enumeration_3.hasMoreElements()) {
					String string_8 = (String) enumeration_3.nextElement();

					try {
						File file_9 = (File) this.aHashtable3237.get(string_8);
						Class class_10 = (Class) this.linkedLibraries.get(string_8);
						Vector vector_11 = (Vector) field_6.get(class_10.getClassLoader());

						for (int i_12 = 0; i_12 < vector_11.size(); i_12++) {
							try {
								Object object_13 = vector_11.elementAt(i_12);
								Field field_14 = object_13.getClass().getDeclaredField("name");
								method_7.invoke(field_14, new Object[] { Boolean.TRUE });

								try {
									String string_15 = (String) field_14.get(object_13);
									if (string_15 != null && string_15.equalsIgnoreCase(file_9.getCanonicalPath())) {
										Field field_16 = object_13.getClass().getDeclaredField("handle");
										Method method_17 = object_13.getClass().getDeclaredMethod("finalize", new Class[0]);
										method_7.invoke(field_16, new Object[] { Boolean.TRUE });
										method_7.invoke(method_17, new Object[] { Boolean.TRUE });

										try {
											method_17.invoke(object_13, new Object[0]);
											field_16.set(object_13, new Integer(0));
											hashtable_2.remove(string_8);
										} catch (Throwable throwable_19) {
											;
										}

										method_7.invoke(method_17, new Object[] { Boolean.FALSE });
										method_7.invoke(field_16, new Object[] { Boolean.FALSE });
									}
								} catch (Throwable throwable_20) {
									;
								}

								method_7.invoke(field_14, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable_21) {
								;
							}
						}
					} catch (Throwable throwable_22) {
						;
					}
				}
			} catch (Throwable throwable_23) {
				;
			}

			method_7.invoke(field_6, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable_24) {
			;
		}

		this.linkedLibraries = hashtable_2;
		return this.linkedLibraries.isEmpty();
	}

	public boolean method224(String string_1) {
		return this.loadLibrary(string_1, Class266.class, (byte) 2);
	}

	public boolean method218(String string_1, int i_2) {
		return this.aHashtable3237.containsKey(string_1);
	}

	boolean loadLibrary(String string_1, Class class_2, byte b_3) {
		Class class_4 = (Class) this.linkedLibraries.get(string_1);
		if (class_4 != null) {
			return class_4.getClassLoader() == class_2.getClassLoader();
		} else {
			File file_5 = null;
			if (file_5 == null) {
				file_5 = (File) this.aHashtable3237.get(string_1);
			}

			if (file_5 != null) {
				try {
					file_5 = new File(file_5.getCanonicalPath());
					System.load(file_5.getPath());
					this.linkedLibraries.put(string_1, class_2);
					boolean bool_6 = true;
					return bool_6;
				} catch (Throwable throwable_8) {
					throwable_8.printStackTrace();
				}
			}

			return false;
		}
	}

	public boolean method223(String string_1) {
		return this.aHashtable3237.containsKey(string_1);
	}

	public NativeLibraryLoader(Index index_1) {
		this.nativeLibraryIndex = index_1;
		String str_2 = "";
		if (!Class396.OS_NAME.startsWith("win") && !Class396.OS_NAME.startsWith("windows 7")) {
			if (Class396.OS_NAME.startsWith("linux")) {
				str_2 = str_2 + "linux/";
			} else if (Class396.OS_NAME.startsWith("mac")) {
				str_2 = str_2 + "macos/";
			}
		} else {
			str_2 = str_2 + "windows/";
		}

		if (!Class396.OS_ARCHITECTURE.startsWith("amd64") && !Class396.OS_ARCHITECTURE.startsWith("x86_64")) {
			if (!Class396.OS_ARCHITECTURE.startsWith("i386") && !Class396.OS_ARCHITECTURE.startsWith("i486") && !Class396.OS_ARCHITECTURE.startsWith("i586") && !Class396.OS_ARCHITECTURE.startsWith("x86")) {
				if (Class396.OS_ARCHITECTURE.startsWith("ppc")) {
					str_2 = str_2 + "ppc/";
				} else {
					str_2 = str_2 + "universal/";
				}
			} else {
				str_2 = str_2 + "x86/";
			}
		} else {
			str_2 = str_2 + "x86_64/";
		}

		this.OS_AND_ARCHITECTURE = str_2;
	}

	public int method4648(String string_1, int i_2) {
		if (this.aHashtable3237.containsKey(string_1)) {
			return 100;
		} else {
			String string_3 = Class94.prependOS(string_1, (byte) 70);
			if (string_3 == null) {
				return -1;
			} else {
				String string_4 = null;
				if (string_4 == null) {
					string_4 = this.OS_AND_ARCHITECTURE + string_3;
					if (!this.nativeLibraryIndex.method5625(string_4, "", (byte) -91)) {
						return -1;
					}
				}

				if (!this.nativeLibraryIndex.method5629(string_4, 71472045)) {
					return this.nativeLibraryIndex.method5631(string_4, (byte) 113);
				} else {
					byte[] bytes_5 = this.nativeLibraryIndex.method5626(string_4, "", (byte) 1);
					Object obj_6 = null;
					File file_7 = Class96_Sub23.method14681(string_3, 827415998);
					if (bytes_5 != null && file_7 != null) {
						boolean bool_11 = true;
						byte[] bytes_9 = Class153.method2621(file_7, -1379715433);
						if (bytes_9 != null && bytes_9.length == bytes_5.length) {
							for (int i_10 = 0; i_10 < bytes_9.length; i_10++) {
								if (bytes_9[i_10] != bytes_5[i_10]) {
									bool_11 = false;
									break;
								}
							}
						} else {
							bool_11 = false;
						}

						try {
							if (!bool_11) {
								try {
									FileOutputStream fileoutputstream_12 = new FileOutputStream(file_7);
									fileoutputstream_12.write(bytes_5, 0, bytes_5.length);
									fileoutputstream_12.close();
								} catch (IOException ioexception_13) {
									throw new RuntimeException();
								}
							}
						} catch (Throwable throwable_14) {
							return -1;
						}

						this.method4637(string_1, file_7, (byte) -88);
						return 100;
					} else {
						return -1;
					}
				}
			}
		}
	}

	public boolean method221(String string_1) {
		return this.loadLibrary(string_1, Class266.class, (byte) 2);
	}

	public boolean method217(String string_1) {
		return this.loadLibrary(string_1, Class266.class, (byte) 2);
	}

	public boolean method220() {
		Hashtable hashtable_1 = new Hashtable();
		Enumeration enumeration_2 = this.linkedLibraries.keys();

		while (enumeration_2.hasMoreElements()) {
			String string_3 = (String) enumeration_2.nextElement();
			hashtable_1.put(string_3, this.linkedLibraries.get(string_3));
		}

		try {
			Class class_24 = Class.forName("java.lang.reflect.AccessibleObject");
			Class class_4 = Class.forName("java.lang.ClassLoader");
			Field field_5 = class_4.getDeclaredField("nativeLibraries");
			Method method_6 = class_24.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method_6.invoke(field_5, new Object[] { Boolean.TRUE });

			try {
				enumeration_2 = this.linkedLibraries.keys();

				while (enumeration_2.hasMoreElements()) {
					String string_7 = (String) enumeration_2.nextElement();

					try {
						File file_8 = (File) this.aHashtable3237.get(string_7);
						Class class_9 = (Class) this.linkedLibraries.get(string_7);
						Vector vector_10 = (Vector) field_5.get(class_9.getClassLoader());

						for (int i_11 = 0; i_11 < vector_10.size(); i_11++) {
							try {
								Object object_12 = vector_10.elementAt(i_11);
								Field field_13 = object_12.getClass().getDeclaredField("name");
								method_6.invoke(field_13, new Object[] { Boolean.TRUE });

								try {
									String string_14 = (String) field_13.get(object_12);
									if (string_14 != null && string_14.equalsIgnoreCase(file_8.getCanonicalPath())) {
										Field field_15 = object_12.getClass().getDeclaredField("handle");
										Method method_16 = object_12.getClass().getDeclaredMethod("finalize", new Class[0]);
										method_6.invoke(field_15, new Object[] { Boolean.TRUE });
										method_6.invoke(method_16, new Object[] { Boolean.TRUE });

										try {
											method_16.invoke(object_12, new Object[0]);
											field_15.set(object_12, new Integer(0));
											hashtable_1.remove(string_7);
										} catch (Throwable throwable_18) {
											;
										}

										method_6.invoke(method_16, new Object[] { Boolean.FALSE });
										method_6.invoke(field_15, new Object[] { Boolean.FALSE });
									}
								} catch (Throwable throwable_19) {
									;
								}

								method_6.invoke(field_13, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable_20) {
								;
							}
						}
					} catch (Throwable throwable_21) {
						;
					}
				}
			} catch (Throwable throwable_22) {
				;
			}

			method_6.invoke(field_5, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable_23) {
			;
		}

		this.linkedLibraries = hashtable_1;
		return this.linkedLibraries.isEmpty();
	}

	static final void method4651(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1522252372) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1292 = Class351.method6193(string_4, cs2executor_2, 1736342439);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method4652(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 2;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		if (i_2 == 0) {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = 0;
		} else {
			cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = (int) Math.pow((double) i_2, (double) i_3);
		}

	}

	static void method4653(int i_0, int i_1, int i_2) {
		if (Class58.aClass529_527.aBool7044 || Class20.anInt169 != 1 && (!Class96_Sub6.aBool9173 || Class20.anInt169 != 2 || !Class1.aClass282_Sub50_Sub7_12.aString9576.equals(Message.FACE_HERE.translate(Class223.CURRENT_LANGUAGE, -1649910920)))) {
			FontMetrics fontmetrics_3 = Class114.method1887(2016134923);
			int i_4 = fontmetrics_3.getWidthNoSprites(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -2018972202), -1967833701);
			int i_5;
			int i_7;
			if (!Class20.aBool162) {
				for (Class282_Sub50_Sub7 class282_sub50_sub7_9 = (Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 95); class282_sub50_sub7_9 != null; class282_sub50_sub7_9 = (Class282_Sub50_Sub7) Class20.aClass482_171.next(1149283361)) {
					i_7 = Class282_Sub50_Sub17.method15507(class282_sub50_sub7_9, fontmetrics_3, 943671530);
					if (i_7 > i_4) {
						i_4 = i_7;
					}
				}

				i_4 += 8;
				i_5 = Class20.anInt169 * Class20.anInt178 + 21;
				Class110.anInt1104 = (Class20.aBool187 ? 26 : 22) + Class20.anInt169 * Class20.anInt178;
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15_6 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4); class282_sub50_sub15_6 != null; class282_sub50_sub15_6 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-1603156921)) {
					if (class282_sub50_sub15_6.anInt9769 == 1) {
						i_7 = Class282_Sub50_Sub17.method15507((Class282_Sub50_Sub7) class282_sub50_sub15_6.aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119, fontmetrics_3, 943671530);
					} else {
						i_7 = Class163.method2840(class282_sub50_sub15_6, fontmetrics_3, 444800403);
					}

					if (i_7 > i_4) {
						i_4 = i_7;
					}
				}

				i_4 += 8;
				i_5 = Class20.anInt178 * Class20.anInt170 + 21;
				Class110.anInt1104 = Class20.anInt178 * Class20.anInt170 + (Class20.aBool187 ? 26 : 22);
			}

			i_4 += 10;
			int i_8 = i_0 - i_4 / 2;
			if (i_8 + i_4 > Class349.anInt4083) {
				i_8 = Class349.anInt4083 - i_4;
			}

			if (i_8 < 0) {
				i_8 = 0;
			}

			i_7 = i_1;
			if (i_1 + i_5 > Engine.anInt3243 * -969250379) {
				i_7 = Engine.anInt3243 * -969250379 - i_5;
			}

			if (i_7 < 0) {
				i_7 = 0;
			}

			Class301.anInt3555 = i_8;
			Class184.anInt2300 = i_7;
			Class158_Sub2.anInt8975 = i_4;
			Class20.anInt156 = (int) (Math.random() * 24.0D);
			Class20.aBool161 = true;
		}

	}

}
