package com.rs.jagex;

public class MenuActionEvent extends CacheableNode {

	String aString9585;
	String aString9588;
	String actionName;
	int anInt9578;
	MenuAction menuAction;
	int itemId;
	long aLong9584;
	int anInt9581;
	int anInt9582;
	boolean aBool9583;
	boolean aBool9577;
	long aLong9580;
	boolean aBool9586;

	MenuActionEvent(String ActionName, String string_2, int i_3, MenuAction i_4, int ItemID, long long_6, int i_8, int i_9, boolean bool_10, boolean bool_11, long long_12, boolean bool_14) {
		aString9588 = string_2;
		actionName = ActionName;
		anInt9578 = i_3;
		menuAction = i_4;
		itemId = ItemID;
		aLong9584 = long_6;
		anInt9581 = i_8;
		anInt9582 = i_9;
		aBool9583 = bool_10;
		aBool9577 = bool_11;
		aLong9580 = long_12;
		aBool9586 = bool_14;
	}

}
