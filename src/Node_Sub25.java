public class Node_Sub25 extends Node {

    int anInt7688;
    int anInt7689;

    Node_Sub25(int i_1, int i_2) {
        this.anInt7688 = i_1;
        this.anInt7689 = i_2;
    }

    static void method12400(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, int i_6, CacheableNode_Sub7 class282_sub50_sub7_7, FontRenderer fontrenderer_8, FontMetrics fontmetrics_9, int i_10, int i_11, int i_12) {
        if (i_0 > i_2 && i_0 < i_2 + i_4 && i_1 > i_6 - fontmetrics_9.topPadding - 1 && i_1 < fontmetrics_9.bottomPadding + i_6 && class282_sub50_sub7_7.aBool9583) {
            i_10 = i_11;
        }
        int[] ints_13 = Class534_Sub1.method12815(class282_sub50_sub7_7, -1726186381);
        String string_14 = IncomingPacket.method6380(class282_sub50_sub7_7, 868923697);
        if (ints_13 != null) {
            string_14 = string_14 + Class15.method547(ints_13, 1953018919);
        }
        fontrenderer_8.method386(string_14, i_2 + 3, i_6, i_10, client.aRandom7260, PacketsDecoder.anInt9079, Class115.aNativeSpriteArray1248, Class20.anIntArray177, -1905511896);
        if (class282_sub50_sub7_7.aBool9577) {
            Exception_Sub1.aNativeSprite_10075.method2752(5 + i_2 + fontmetrics_9.getWidthNoSprites(string_14), i_6 - fontmetrics_9.topPadding);
        }
    }

    public static boolean method12402(char var_0) {
        return var_0 >= 32 && var_0 <= 126 ? true : (var_0 >= 160 && var_0 <= 255 ? true : var_0 == 8364 || var_0 == 338 || var_0 == 8212 || var_0 == 339 || var_0 == 376);
    }
}