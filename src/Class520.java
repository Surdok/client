public class Class520 {

    CoordGrid aClass219_5934;

    int anInt5933;

    public GroundItem method11158() {
        Node_Sub29 class282_sub29_2 = (Node_Sub29) client.aClass465_7414.get((long) (this.aClass219_5934.level << 28 | this.aClass219_5934.y << 14 | this.aClass219_5934.x));
        if (class282_sub29_2 == null) {
            return null;
        } else {
            CoordGrid coordgrid_3 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid();
            int i_4 = this.aClass219_5934.x - coordgrid_3.x;
            int i_5 = this.aClass219_5934.y - coordgrid_3.y;
            if (i_4 >= 0 && i_5 >= 0 && i_4 < IndexLoaders.MAP_REGION_DECODER.getSizeX() && i_5 < IndexLoaders.MAP_REGION_DECODER.getSizeY()) {
                for (GroundItemNode class282_sub34_6 = (GroundItemNode) class282_sub29_2.aClass482_7708.head(); class282_sub34_6 != null; class282_sub34_6 = (GroundItemNode) class282_sub29_2.aClass482_7708.next(184260692)) {
                    if (class282_sub34_6.id == this.anInt5933) {
                        return (GroundItem) IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager().method3437(this.aClass219_5934.level, i_4, i_5);
                    }
                }
            }
            return null;
        }
    }

    public Class520(CoordGrid coordgrid_1, int i_2) {
        this.aClass219_5934 = coordgrid_1;
        this.anInt5933 = i_2;
    }

    public static void method11161() {
        IComponentDefinitions.aClass229_1280.method3859();
        IComponentDefinitions.aClass229_1341.method3859();
        IComponentDefinitions.aClass229_1303.method3859();
        IComponentDefinitions.aClass229_1282.method3859();
    }

    public static boolean method11162(int i_0, byte b_1) {
        return i_0 == 0 || i_0 == 2;
    }

    static int method11163(IComponentDefinitions icomponentdefinitions_0, int i_1, int i_2) {
        return !client.method11633(icomponentdefinitions_0).clickOptionEnabled(i_1) && icomponentdefinitions_0.params == null ? -1 : (icomponentdefinitions_0.opCursors != null && icomponentdefinitions_0.opCursors.length > i_1 ? icomponentdefinitions_0.opCursors[i_1] : -1);
    }
}
