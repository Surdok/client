import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EnumDefinitions {

	public char aChar5146;
	public char aChar5140;
	String aString5142 = "null";
	int anInt5143;
	int anInt5141 = 0;
	Map aMap5144;
	Object[] anObjectArray5145;
	HashMap aHashMap5147;

	public int method7222(int i_1) {
		return this.anInt5141;
	}

	void method7224(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.aChar5146 = Class11.method470(rsbytebuffer_1.readByte(), -1589762239);
		} else if (i_2 == 2) {
			this.aChar5140 = Class11.method470(rsbytebuffer_1.readByte(), -940945676);
		} else if (i_2 == 3) {
			this.aString5142 = rsbytebuffer_1.readString();
		} else if (i_2 == 4) {
			this.anInt5143 = rsbytebuffer_1.readInt();
		} else {
			int i_4;
			int i_5;
			if (i_2 != 5 && i_2 != 6) {
				if (i_2 == 7 || i_2 == 8) {
					i_4 = rsbytebuffer_1.readUnsignedShort();
					this.anInt5141 = rsbytebuffer_1.readUnsignedShort();
					this.anObjectArray5145 = new Object[i_4];

					for (i_5 = 0; i_5 < this.anInt5141; i_5++) {
						int i_7 = rsbytebuffer_1.readUnsignedShort();
						if (i_2 == 7) {
							this.anObjectArray5145[i_7] = rsbytebuffer_1.readString();
						} else {
							this.anObjectArray5145[i_7] = new Integer(rsbytebuffer_1.readInt());
						}
					}
				}
			} else {
				this.anInt5141 = rsbytebuffer_1.readUnsignedShort();
				this.aMap5144 = new HashMap(this.anInt5141);

				for (i_4 = 0; i_4 < this.anInt5141; i_4++) {
					i_5 = rsbytebuffer_1.readInt();
					Object obj_6;
					if (i_2 == 5) {
						obj_6 = rsbytebuffer_1.readString();
					} else {
						obj_6 = new Integer(rsbytebuffer_1.readInt());
					}

					this.aMap5144.put(new Integer(i_5), obj_6);
				}
			}
		}

	}

	Object method7225(int i_1, byte b_2) {
		return this.anObjectArray5145 != null ? (i_1 >= 0 && i_1 < this.anObjectArray5145.length ? this.anObjectArray5145[i_1] : null) : (this.aMap5144 != null ? this.aMap5144.get(new Integer(i_1)) : null);
	}

	public String method7226(int i_1, int i_2) {
		Object object_3 = this.method7225(i_1, (byte) 1);
		return object_3 == null ? this.aString5142 : (String) object_3;
	}

	void method7227(RsByteBuffer rsbytebuffer_1, byte b_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7224(rsbytebuffer_1, i_3, -1155102640);
		}
	}

	public boolean method7228(Object object_1, byte b_2) {
		if (this.anInt5141 == 0) {
			return false;
		} else {
			if (this.aHashMap5147 == null) {
				this.method7233(1243120329);
			}

			return this.aHashMap5147.containsKey(object_1);
		}
	}

	public int method7232(int i_1, int i_2) {
		Object object_3 = this.method7225(i_1, (byte) 1);
		return object_3 == null ? this.anInt5143 : ((Integer) object_3).intValue();
	}

	void method7233(int i_1) {
		HashMap hashmap_2 = new HashMap();
		Object obj_5;
		Iterator iterator_10;
		Entry map$entry_11;
		if (this.anObjectArray5145 != null) {
			for (int i_3 = 0; i_3 < this.anObjectArray5145.length; i_3++) {
				if (this.anObjectArray5145[i_3] != null) {
					Object object_4 = this.anObjectArray5145[i_3];
					obj_5 = (List) hashmap_2.get(object_4);
					if (obj_5 == null) {
						obj_5 = new LinkedList();
						hashmap_2.put(object_4, obj_5);
					}

					((List) obj_5).add(new Integer(i_3));
				}
			}
		} else {
			if (this.aMap5144 == null) {
				throw new IllegalStateException();
			}

			Object obj_6;
			for (iterator_10 = this.aMap5144.entrySet().iterator(); iterator_10.hasNext(); ((List) obj_6).add(map$entry_11.getKey())) {
				map$entry_11 = (Entry) iterator_10.next();
				obj_5 = map$entry_11.getValue();
				obj_6 = (List) hashmap_2.get(obj_5);
				if (obj_6 == null) {
					obj_6 = new LinkedList();
					hashmap_2.put(obj_5, obj_6);
				}
			}
		}

		this.aHashMap5147 = new HashMap();

		int[] ints_13;
		for (iterator_10 = hashmap_2.entrySet().iterator(); iterator_10.hasNext(); this.aHashMap5147.put(map$entry_11.getKey(), ints_13)) {
			map$entry_11 = (Entry) iterator_10.next();
			List list_12 = (List) map$entry_11.getValue();
			ints_13 = new int[list_12.size()];
			int i_7 = 0;

			Integer integer_9;
			for (Iterator iterator_8 = list_12.iterator(); iterator_8.hasNext(); ints_13[i_7++] = integer_9.intValue()) {
				integer_9 = (Integer) iterator_8.next();
			}

			if (this.anObjectArray5145 == null) {
				Arrays.sort(ints_13);
			}
		}

	}

	public int[] method7251(Object object_1, int i_2) {
		if (this.anInt5141 == 0) {
			return null;
		} else {
			if (this.aHashMap5147 == null) {
				this.method7233(1243120329);
			}

			return (int[]) this.aHashMap5147.get(object_1);
		}
	}

	static boolean method7252(int i_0, byte b_1) {
		return i_0 != 3 && i_0 != 4 && i_0 != 5 && i_0 != 6 && i_0 != 1001 && i_0 != 1002 ? i_0 == 2 : true;
	}

}
