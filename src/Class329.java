
/* Class329 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class329 {
	protected boolean aBool3773;
	static int[][] anIntArrayArray3774;
	static int[][] anIntArrayArray3775;
	protected SceneObjectManager aClass206_3776;
	static int[] anIntArray3778;
	public boolean aBool3780;
	int anInt3781;
	public boolean aBool3782;
	protected int maxX;
	protected int maxY;
	public boolean overlayHidden;
	protected RegionMap regionMap;
	public byte[][][] aByteArrayArrayArray3788;
	UnderlayIndexLoader aClass479_3789;
	byte[][][] val49ArrDiv4;
	byte[][][] val49ArrAnd0x3;
	static boolean[][] aBoolArrayArray3793;
	protected byte[][][] aByteArrayArrayArray3794;
	int[] anIntArray3795;
	int[] anIntArray3796;
	int[] anIntArray3797;
	int[] anIntArray3798;
	int[] anIntArray3799;
	static int[] anIntArray3800;
	byte[][][] underlayColors;
	public int anInt3809 = 0;
	boolean aBool3810;
	static int[] anIntArray3811;
	int[] anIntArray3813;
	static int[] anIntArray3814 = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	static int[][] anIntArrayArray3815;
	static boolean[][] aBoolArrayArray3816;
	public int[][][] unk0Data;
	static int[] anIntArray3819;
	public boolean aBool3820;
	static int[][] anIntArrayArray3821;
	static boolean[][] aBoolArrayArray3822;
	static boolean[][] aBoolArrayArray3823;
	static int[][] anIntArrayArray3824;
	byte[][][] overlayColors;
	static int[] anIntArray3826;
	int[] anIntArray3827;
	static int[][] anIntArrayArray3828;
	static int[] anIntArray3829 = { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
	static int[][] anIntArrayArray3830;
	static int[][] anIntArrayArray3831;
	int[] anIntArray3832;
	static int[][] anIntArrayArray3833;
	Class536 aClass536_3834;
	public boolean aBool3835 = false;
	static int[][] anIntArrayArray3836;
	int[] anIntArray3837;
	int[] anIntArray3838;
	int[] anIntArray3839;
	int[] anIntArray3842;
	int[] anIntArray3843;
	int anInt3844;
	public int anInt3845;
	int anInt3846;
	static int[] anIntArray3847;
	int anInt3848;
	int anInt3849;
	int anInt3850;
	boolean aBool3851;
	int anInt3852;
	boolean aBool3853;
	boolean aBool3854;
	int anInt3855;
	int anInt3856;
	int[] anIntArray3857;
	int[] anIntArray3858;
	int[] anIntArray3859;
	static int[][] anIntArrayArray3860;
	
	public void method5835(int i) {
		aBool3773 = true;
	}

	public final void method5837(GraphicalRenderer class505, Class390 class390, Class390 class390_71_, int i) {
		int[][] is = new int[maxX * -1230013231][maxY * 2024737111];
		if (null == ((Class329) this).anIntArray3795 || (((Class329) this).anIntArray3795.length != 2024737111 * maxY)) {
			((Class329) this).anIntArray3795 = new int[2024737111 * maxY];
			((Class329) this).anIntArray3796 = new int[maxY * 2024737111];
			((Class329) this).anIntArray3797 = new int[maxY * 2024737111];
			((Class329) this).anIntArray3798 = new int[2024737111 * maxY];
			((Class329) this).anIntArray3799 = new int[2024737111 * maxY];
		}
		for (int i_72_ = 0; i_72_ < anInt3845 * 1599084401; i_72_++) {
			for (int i_73_ = 0; i_73_ < 2024737111 * maxY; i_73_++) {
				((Class329) this).anIntArray3795[i_73_] = 0;
				((Class329) this).anIntArray3796[i_73_] = 0;
				((Class329) this).anIntArray3797[i_73_] = 0;
				((Class329) this).anIntArray3798[i_73_] = 0;
				((Class329) this).anIntArray3799[i_73_] = 0;
			}
			for (int i_74_ = -5; i_74_ < -1230013231 * maxX; i_74_++) {
				for (int i_75_ = 0; i_75_ < maxY * 2024737111; i_75_++) {
					int i_76_ = i_74_ + 5;
					if (i_76_ < maxX * -1230013231) {
						int i_77_ = (((Class329) this).underlayColors[i_72_][i_76_][i_75_]) & 0xff;
						if (i_77_ > 0) {
							UnderlayDef class481 = ((Class329) this).aClass479_3789.getUnderlayDef(i_77_ - 1, (byte) -26);
							((Class329) this).anIntArray3795[i_75_] += class481.r * -520008741;
							((Class329) this).anIntArray3796[i_75_] += -771727201 * class481.g;
							((Class329) this).anIntArray3797[i_75_] += 1389910939 * class481.b;
							((Class329) this).anIntArray3798[i_75_] += -45673991 * class481.a;
							((Class329) this).anIntArray3799[i_75_]++;
						}
					}
					int i_78_ = i_74_ - 5;
					if (i_78_ >= 0) {
						int i_79_ = (((Class329) this).underlayColors[i_72_][i_78_][i_75_]) & 0xff;
						if (i_79_ > 0) {
							UnderlayDef class481 = ((Class329) this).aClass479_3789.getUnderlayDef(i_79_ - 1, (byte) -111);
							((Class329) this).anIntArray3795[i_75_] -= -520008741 * class481.r;
							((Class329) this).anIntArray3796[i_75_] -= class481.g * -771727201;
							((Class329) this).anIntArray3797[i_75_] -= 1389910939 * class481.b;
							((Class329) this).anIntArray3798[i_75_] -= -45673991 * class481.a;
							((Class329) this).anIntArray3799[i_75_]--;
						}
					}
				}
				if (i_74_ >= 0) {
					int i_80_ = 0;
					int i_81_ = 0;
					int i_82_ = 0;
					int i_83_ = 0;
					int i_84_ = 0;
					for (int i_85_ = -5; i_85_ < maxY * 2024737111; i_85_++) {
						int i_86_ = i_85_ + 5;
						if (i_86_ < maxY * 2024737111) {
							i_80_ += ((Class329) this).anIntArray3795[i_86_];
							i_81_ += ((Class329) this).anIntArray3796[i_86_];
							i_82_ += ((Class329) this).anIntArray3797[i_86_];
							i_83_ += ((Class329) this).anIntArray3798[i_86_];
							i_84_ += ((Class329) this).anIntArray3799[i_86_];
						}
						int i_87_ = i_85_ - 5;
						if (i_87_ >= 0) {
							i_80_ -= ((Class329) this).anIntArray3795[i_87_];
							i_81_ -= ((Class329) this).anIntArray3796[i_87_];
							i_82_ -= ((Class329) this).anIntArray3797[i_87_];
							i_83_ -= ((Class329) this).anIntArray3798[i_87_];
							i_84_ -= ((Class329) this).anIntArray3799[i_87_];
						}
						if (i_85_ >= 0 && i_83_ > 0 && i_84_ > 0)
							is[i_74_][i_85_] = Class371.method6348(i_80_ * 256 / i_83_, i_81_ / i_84_, i_82_ / i_84_, -432025079);
					}
				}
			}
			if (aBool3820)
				method5846(class505, aClass206_3776.aClass390Array2591[i_72_], i_72_, is, 0 == i_72_ ? class390 : null, i_72_ == 0 ? class390_71_ : null, (byte) 4);
			else
				method5845(class505, aClass206_3776.aClass390Array2591[i_72_], i_72_, is, i_72_ == 0 ? class390 : null, i_72_ == 0 ? class390_71_ : null, (byte) 1);
			((Class329) this).underlayColors[i_72_] = null;
			((Class329) this).overlayColors[i_72_] = null;
			((Class329) this).val49ArrDiv4[i_72_] = null;
			((Class329) this).val49ArrAnd0x3[i_72_] = null;
		}
		if (!overlayHidden) {
			if (anInt3809 * 207676255 != 0)
				aClass206_3776.method3429(1532483847);
			if (aBool3780)
				aClass206_3776.method3431(1204197709);
		}
		for (int i_88_ = 0; i_88_ < 1599084401 * anInt3845; i_88_++)
			aClass206_3776.aClass390Array2591[i_88_].SA();
	}

	public final void method5838(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_) {
		for (int i_94_ = i_90_; i_94_ < i_92_ + i_90_; i_94_++) {
			for (int i_95_ = i_89_; i_95_ < i_91_ + i_89_; i_95_++) {
				if (i_95_ >= 0 && i_95_ < maxX * -1230013231 && i_94_ >= 0 && i_94_ < 2024737111 * maxY)
					unk0Data[i][i_95_][i_94_] = i > 0 ? (unk0Data[i - 1][i_95_][i_94_]) - 960 : 0;
			}
		}
		if (i_89_ > 0 && i_89_ < -1230013231 * maxX) {
			for (int i_96_ = i_90_ + 1; i_96_ < i_90_ + i_92_; i_96_++) {
				if (i_96_ >= 0 && i_96_ < 2024737111 * maxY)
					unk0Data[i][i_89_][i_96_] = unk0Data[i][i_89_ - 1][i_96_];
			}
		}
		if (i_90_ > 0 && i_90_ < 2024737111 * maxY) {
			for (int i_97_ = i_89_ + 1; i_97_ < i_91_ + i_89_; i_97_++) {
				if (i_97_ >= 0 && i_97_ < maxX * -1230013231)
					unk0Data[i][i_97_][i_90_] = unk0Data[i][i_97_][i_90_ - 1];
			}
		}
		if (i_89_ >= 0 && i_90_ >= 0 && i_89_ < -1230013231 * maxX && i_90_ < 2024737111 * maxY) {
			if (0 == i) {
				if (i_89_ > 0 && 0 != unk0Data[i][i_89_ - 1][i_90_])
					unk0Data[i][i_89_][i_90_] = unk0Data[i][i_89_ - 1][i_90_];
				else if (i_90_ > 0 && unk0Data[i][i_89_][i_90_ - 1] != 0)
					unk0Data[i][i_89_][i_90_] = unk0Data[i][i_89_][i_90_ - 1];
				else if (i_89_ > 0 && i_90_ > 0 && (unk0Data[i][i_89_ - 1][i_90_ - 1] != 0))
					unk0Data[i][i_89_][i_90_] = unk0Data[i][i_89_ - 1][i_90_ - 1];
			} else if (i_89_ > 0 && (unk0Data[i - 1][i_89_ - 1][i_90_] != unk0Data[i][i_89_ - 1][i_90_]))
				unk0Data[i][i_89_][i_90_] = unk0Data[i][i_89_ - 1][i_90_];
			else if (i_90_ > 0 && (unk0Data[i][i_89_][i_90_ - 1] != unk0Data[i - 1][i_89_][i_90_ - 1]))
				unk0Data[i][i_89_][i_90_] = unk0Data[i][i_89_][i_90_ - 1];
			else if (i_89_ > 0 && i_90_ > 0 && (unk0Data[i][i_89_ - 1][i_90_ - 1] != (unk0Data[i - 1][i_89_ - 1][i_90_ - 1])))
				unk0Data[i][i_89_][i_90_] = unk0Data[i][i_89_ - 1][i_90_ - 1];
		}
	}

	public final void decodeTileMasksUnderlay(RsByteBuffer class282_sub35, int xOffset, int yOffset, int i_99_, int i_100_, ClipMap[] class336s, byte i_101_) {
		if (!overlayHidden) {
			for (int i_102_ = 0; i_102_ < 4; i_102_++) {
				ClipMap clipMap = class336s[i_102_];
				for (int i_103_ = 0; i_103_ < 64; i_103_++) {
					for (int i_104_ = 0; i_104_ < 64; i_104_++) {
						int i_105_ = xOffset + i_103_;
						int i_106_ = i_104_ + yOffset;
						if (i_105_ >= 0 && i_105_ < maxX * -1230013231 && i_106_ >= 0 && i_106_ < maxY * 2024737111)
							clipMap.method5974(i_105_, i_106_, 1933302120);
					}
				}
			}
		}
		int i_107_ = i_99_ + xOffset;
		int i_108_ = i_100_ + yOffset;
		for (int plane = 0; plane < anInt3845 * 1599084401; plane++) {
			for (int x = 0; x < 64; x++) {
				for (int y = 0; y < 64; y++)
					decodeTileMasks(class282_sub35, plane, x + xOffset, y + yOffset, 0, 0, i_107_ + x, y + i_108_, 0, false, 116410177);
			}
		}
	}

	public final void method5841(RsByteBuffer class282_sub35, int i, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_, int i_128_, ClipMap[] class336s, int i_129_) {
		int i_130_ = (i_126_ & 0x7) * 8;
		int i_131_ = 8 * (i_127_ & 0x7);
		if (!overlayHidden) {
			ClipMap class336 = class336s[i];
			for (int i_132_ = 0; i_132_ < 8; i_132_++) {
				for (int i_133_ = 0; i_133_ < 8; i_133_++) {
					int i_134_ = (i_123_ + Class112.method1871(i_132_ & 0x7, i_133_ & 0x7, i_128_, 1449989045));
					int i_135_ = i_124_ + Class2.method259(i_132_ & 0x7, i_133_ & 0x7, i_128_, 97423682);
					if (i_134_ > 0 && i_134_ < -1230013231 * maxX - 1 && i_135_ > 0 && i_135_ < 2024737111 * maxY - 1)
						class336.method5974(i_134_, i_135_, 1933302120);
				}
			}
		}
		int i_136_ = (i_126_ & ~0x7) << 3;
		int i_137_ = (i_127_ & ~0x7) << 3;
		int i_138_ = 0;
		int i_139_ = 0;
		if (1 == i_128_)
			i_139_ = 1;
		else if (2 == i_128_) {
			i_138_ = 1;
			i_139_ = 1;
		} else if (i_128_ == 3)
			i_138_ = 1;
		for (int i_140_ = 0; i_140_ < 1599084401 * anInt3845; i_140_++) {
			for (int i_141_ = 0; i_141_ < 64; i_141_++) {
				for (int i_142_ = 0; i_142_ < 64; i_142_++) {
					if (i_125_ == i_140_ && i_141_ >= i_130_ && i_141_ <= i_130_ + 8 && i_142_ >= i_131_ && i_142_ <= i_131_ + 8) {
						int i_143_;
						int i_144_;
						if (i_141_ == i_130_ + 8 || 8 + i_131_ == i_142_) {
							if (0 == i_128_) {
								i_143_ = i_141_ - i_130_ + i_123_;
								i_144_ = i_142_ - i_131_ + i_124_;
							} else if (1 == i_128_) {
								i_143_ = i_142_ - i_131_ + i_123_;
								i_144_ = i_124_ + 8 - (i_141_ - i_130_);
							} else if (2 == i_128_) {
								i_143_ = i_123_ + 8 - (i_141_ - i_130_);
								i_144_ = 8 + i_124_ - (i_142_ - i_131_);
							} else {
								i_143_ = 8 + i_123_ - (i_142_ - i_131_);
								i_144_ = i_124_ + (i_141_ - i_130_);
							}
							decodeTileMasks(class282_sub35, i, i_143_, i_144_, 0, 0, i_136_ + i_141_, i_137_ + i_142_, 0, true, 1122422835);
						} else {
							i_143_ = i_123_ + Class112.method1871(i_141_ & 0x7, i_142_ & 0x7, i_128_, 1449989045);
							i_144_ = i_124_ + Class2.method259(i_141_ & 0x7, i_142_ & 0x7, i_128_, 656585016);
							decodeTileMasks(class282_sub35, i, i_143_, i_144_, i_138_, i_139_, i_136_ + i_141_, i_137_ + i_142_, i_128_, false, -310142187);
						}
						if (i_141_ == 63 || 63 == i_142_) {
							int i_145_ = 1;
							if (63 == i_141_ && i_142_ == 63)
								i_145_ = 3;
							for (int i_146_ = 0; i_146_ < i_145_; i_146_++) {
								int i_147_ = i_141_;
								int i_148_ = i_142_;
								if (0 == i_146_) {
									i_147_ = i_141_ == 63 ? 64 : i_141_;
									i_148_ = 63 == i_142_ ? 64 : i_142_;
								} else if (1 == i_146_)
									i_147_ = 64;
								else if (2 == i_146_)
									i_148_ = 64;
								int i_149_;
								int i_150_;
								if (0 == i_128_) {
									i_149_ = i_123_ + (i_147_ - i_130_);
									i_150_ = i_148_ - i_131_ + i_124_;
								} else if (1 == i_128_) {
									i_149_ = i_123_ + (i_148_ - i_131_);
									i_150_ = 8 + i_124_ - (i_147_ - i_130_);
								} else if (2 == i_128_) {
									i_149_ = i_123_ + 8 - (i_147_ - i_130_);
									i_150_ = i_124_ + 8 - (i_148_ - i_131_);
								} else {
									i_149_ = 8 + i_123_ - (i_148_ - i_131_);
									i_150_ = i_147_ - i_130_ + i_124_;
								}
								if (i_149_ >= 0 && i_149_ < -1230013231 * maxX && i_150_ >= 0 && i_150_ < maxY * 2024737111)
									unk0Data[i][i_149_][i_150_] = (unk0Data[i][i_143_ + i_138_][i_139_ + i_144_]);
							}
						}
					} else
						decodeTileMasks(class282_sub35, 0, -1, -1, 0, 0, 0, 0, 0, false, 56162627);
				}
			}
		}
	}

	public void initClipMap(GraphicalRenderer class505, int[][][] is, ClipMap[] clipMap, byte i) {
		if (!overlayHidden) {
			for (int plane = 0; plane < 4; plane++) {
				for (int x = 0; x < maxX * -1230013231; x++) {
					for (int y = 0; y < 2024737111 * maxY; y++) {
						if (0 != ((regionMap.tileMasks[plane][x][y]) & 0x1)) {
							int finalPlane = plane;
							if (0 != ((regionMap.tileMasks[1][x][y]) & 0x2))
								finalPlane--;
							if (finalPlane >= 0) {
								clipMap[finalPlane].addUnwalkable(x, y, 16711935);
							}
						}
					}
				}
			}
		}
		for (int i_159_ = 0; i_159_ < anInt3845 * 1599084401; i_159_++) {
			int i_160_ = 0;
			int i_161_ = 0;
			if (!overlayHidden) {
				if (aBool3835)
					i_161_ |= 0x8;
				if (aBool3780)
					i_160_ |= 0x2;
				if (anInt3809 * 207676255 != 0) {
					i_160_ |= 0x1;
					i_161_ |= 0x10;
				}
			}
			if (aBool3780)
				i_161_ |= 0x7;
			if (!aBool3782)
				i_161_ |= 0x20;
			int[][] is_162_ = (is != null && i_159_ < is.length ? is[i_159_] : unk0Data[i_159_]);
			aClass206_3776.method3385(i_159_, class505.method8478(-1230013231 * maxX, maxY * 2024737111, unk0Data[i_159_], is_162_, 512, i_160_, i_161_), 322492568);
		}
	}

	void method5845(GraphicalRenderer class505, Class390 class390, int i, int[][] is, Class390 class390_205_, Class390 class390_206_, byte i_207_) {
		for (int i_208_ = 0; i_208_ < -1230013231 * maxX; i_208_++) {
			for (int i_209_ = 0; i_209_ < 2024737111 * maxY; i_209_++) {
				byte i_210_ = (((Class329) this).val49ArrDiv4[i][i_208_][i_209_]);
				byte i_211_ = (((Class329) this).val49ArrAnd0x3[i][i_208_][i_209_]);
				int overlayId = ((((Class329) this).overlayColors[i][i_208_][i_209_]) & 0xff);
				int underlayId = ((((Class329) this).underlayColors[i][i_208_][i_209_]) & 0xff);
				OverlayDef overlayDef = (0 != overlayId ? ((Class329) this).aClass536_3834.method11475(overlayId - 1, (byte) 0) : null);
				UnderlayDef underlayDef = (underlayId != 0 ? ((Class329) this).aClass479_3789.getUnderlayDef(underlayId - 1, (byte) -14) : null);
				if (0 == i_210_ && overlayDef == null)
					i_210_ = (byte) 12;
				OverlayDef class531_214_ = overlayDef;
				if (null != overlayDef && -1 == 1419498143 * overlayDef.primaryRGB && -1 == -848345857 * overlayDef.secondaryRGB) {
					class531_214_ = overlayDef;
					overlayDef = null;
				}
				if (overlayDef != null || underlayDef != null) {
					((Class329) this).anInt3855 = anIntArray3829[i_210_] * -32442583;
					((Class329) this).anInt3856 = anIntArray3814[i_210_] * 1732574483;
					int i_215_ = ((null != underlayDef ? ((Class329) this).anInt3855 * -1657432807 : 0) + (overlayDef != null ? ((Class329) this).anInt3856 * -1916381925 : 0));
					int i_216_ = 0;
					((Class329) this).anInt3781 = 0;
					((Class329) this).anInt3848 = (null != overlayDef ? 1717409107 * overlayDef.texture : -1) * -1668530227;
					int i_217_ = (underlayDef != null ? underlayDef.anInt5719 * -1346987295 : -1);
					int[] is_218_ = new int[i_215_];
					int[] is_219_ = new int[i_215_];
					int[] is_220_ = new int[i_215_];
					int[] is_221_ = new int[i_215_];
					int[] is_222_ = new int[i_215_];
					int[] is_223_ = new int[i_215_];
					int[] is_224_ = ((overlayDef != null && -1 != overlayDef.secondaryRGB * -848345857) ? new int[i_215_] : null);
					if (overlayDef != null) {
						for (int i_225_ = 0; (i_225_ < -1916381925 * ((Class329) this).anInt3856); i_225_++) {
							is_218_[i_216_] = (anIntArrayArray3824[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_219_[i_216_] = (anIntArrayArray3860[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_220_[i_216_] = (anIntArrayArray3815[i_210_][1070348131 * ((Class329) this).anInt3781]);
							is_222_[i_216_] = 1725089029 * ((Class329) this).anInt3848;
							is_223_[i_216_] = -1065364389 * overlayDef.anInt7057;
							is_221_[i_216_] = overlayDef.primaryRGB * 1419498143;
							if (is_224_ != null)
								is_224_[i_216_] = overlayDef.secondaryRGB * -848345857;
							i_216_++;
							((Class329) this).anInt3781 += 56558155;
						}
						if (!overlayHidden && i == 0)
							aClass206_3776.method3392(i_208_, i_209_, overlayDef.anInt7051 * 220189999, overlayDef.anInt7063 * 442664952, overlayDef.anInt7064 * -1036917025, 669977931 * overlayDef.anInt7065, overlayDef.anInt7055 * -1307230745, -335219819 * overlayDef.anInt7067, (short) -10476);
					} else
						((Class329) this).anInt3781 += ((Class329) this).anInt3856 * -70638359;
					if (underlayDef != null) {
						for (int i_226_ = 0; (i_226_ < -1657432807 * ((Class329) this).anInt3855); i_226_++) {
							is_218_[i_216_] = (anIntArrayArray3824[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_219_[i_216_] = (anIntArrayArray3860[i_210_][1070348131 * ((Class329) this).anInt3781]);
							is_220_[i_216_] = (anIntArrayArray3815[i_210_][((Class329) this).anInt3781 * 1070348131]);
							is_222_[i_216_] = i_217_;
							is_223_[i_216_] = -1001005969 * underlayDef.anInt5720;
							is_221_[i_216_] = is[i_208_][i_209_];
							if (is_224_ != null)
								is_224_[i_216_] = is_221_[i_216_];
							i_216_++;
							((Class329) this).anInt3781 += 56558155;
						}
					}
					int i_227_ = anIntArray3811.length;
					int[] is_228_ = new int[i_227_];
					int[] is_229_ = new int[i_227_];
					int[] is_230_ = class390_206_ != null ? new int[i_227_] : null;
					int[] is_231_ = (null != class390_206_ || class390_205_ != null ? new int[i_227_] : null);
					for (int i_232_ = 0; i_232_ < i_227_; i_232_++) {
						int i_233_ = anIntArray3811[i_232_];
						int i_234_ = anIntArray3800[i_232_];
						if (0 == i_211_) {
							is_228_[i_232_] = i_233_;
							is_229_[i_232_] = i_234_;
						} else if (1 == i_211_) {
							int i_235_ = i_233_;
							is_228_[i_232_] = i_234_;
							is_229_[i_232_] = 512 - i_235_;
						} else if (2 == i_211_) {
							is_228_[i_232_] = 512 - i_233_;
							is_229_[i_232_] = 512 - i_234_;
						} else if (3 == i_211_) {
							int i_236_ = i_233_;
							is_228_[i_232_] = 512 - i_234_;
							is_229_[i_232_] = i_236_;
						}
						if (null != is_230_ && aBoolArrayArray3822[i_210_][i_232_]) {
							int i_237_ = (i_208_ << 9) + is_228_[i_232_];
							int i_238_ = (i_209_ << 9) + is_229_[i_232_];
							is_230_[i_232_] = (class390_206_.method6709(i_237_, i_238_, 1611134572) - class390.method6709(i_237_, i_238_, -1090922483));
						}
						if (null != is_231_) {
							if (null != class390_206_ && !aBoolArrayArray3822[i_210_][i_232_]) {
								int i_239_ = is_228_[i_232_] + (i_208_ << 9);
								int i_240_ = is_229_[i_232_] + (i_209_ << 9);
								is_231_[i_232_] = (class390.method6709(i_239_, i_240_, 1460513028) - (class390_206_.method6709(i_239_, i_240_, -2104579941)));
							} else if (class390_205_ != null && !(aBoolArrayArray3823[i_210_][i_232_])) {
								int i_241_ = is_228_[i_232_] + (i_208_ << 9);
								int i_242_ = (i_209_ << 9) + is_229_[i_232_];
								is_231_[i_232_] = (class390_205_.method6709(i_241_, i_242_, -896694521) - class390.method6709(i_241_, i_242_, 1289574118));
							}
						}
					}
					int i_243_ = class390.method6722(i_208_, i_209_, 65280);
					int i_244_ = class390.method6722(1 + i_208_, i_209_, 65280);
					int i_245_ = class390.method6722(i_208_ + 1, i_209_ + 1, 65280);
					int i_246_ = class390.method6722(i_208_, 1 + i_209_, 65280);
					boolean bool = regionMap.is0x2(i_208_, i_209_, 1772345202);
					if (bool && i > 1 || !bool && i > 0) {
						boolean bool_247_ = true;
						if (null != underlayDef && !underlayDef.aBool5722)
							bool_247_ = false;
						else if (underlayId == 0 && 0 != i_210_)
							bool_247_ = false;
						else if (overlayId > 0 && class531_214_ != null && !class531_214_.aBool7056)
							bool_247_ = false;
						if (bool_247_ && i_243_ == i_244_ && i_243_ == i_245_ && i_243_ == i_246_)
							aByteArrayArrayArray3794[i][i_208_][i_209_] |= 0x4;
					}
					Class90 class90 = new Class90();
					if (overlayHidden) {
						class90.anInt946 = (aClass206_3776.method3387(i_208_, i_209_, (byte) 110) * -1856397433);
						class90.anInt945 = (aClass206_3776.method3386(i_208_, i_209_, 2091764285) * 873459953);
						class90.anInt947 = (aClass206_3776.method3538(i_208_, i_209_, -575094789) * -96197041);
						class90.anInt949 = (aClass206_3776.method3432(i_208_, i_209_, (byte) 1) * -1472617411);
						class90.anInt950 = (aClass206_3776.method3464(i_208_, i_209_, -989916176) * 1801644261);
						class90.anInt951 = (aClass206_3776.method3391(i_208_, i_209_, 2086149647) * 1412616155);
					}
					class390.method6708(i_208_, i_209_, is_228_, is_230_, is_229_, is_231_, is_218_, is_219_, is_220_, is_221_, is_224_, is_222_, is_223_, class90, false);
					aClass206_3776.method3384(i, i_208_, i_209_, (byte) 44);
				}
			}
		}
	}

	void method5846(GraphicalRenderer class505, Class390 class390, int i, int[][] is, Class390 class390_248_, Class390 class390_249_, byte i_250_) {
		byte[][] is_251_ = ((Class329) this).val49ArrDiv4[i];
		byte[][] is_252_ = ((Class329) this).val49ArrAnd0x3[i];
		byte[][] is_253_ = ((Class329) this).underlayColors[i];
		byte[][] is_254_ = ((Class329) this).overlayColors[i];
		boolean[] bools = new boolean[4];
		for (int i_255_ = 0; i_255_ < maxX * -1230013231; i_255_++) {
			int i_256_ = i_255_ < maxX * -1230013231 - 1 ? 1 + i_255_ : i_255_;
			for (int i_257_ = 0; i_257_ < 2024737111 * maxY; i_257_++) {
				int i_258_ = (i_257_ < maxY * 2024737111 - 1 ? 1 + i_257_ : i_257_);
				((Class329) this).anInt3844 = is_251_[i_255_][i_257_] * 1489820949;
				((Class329) this).anInt3781 = is_252_[i_255_][i_257_] * 56558155;
				int i_259_ = is_254_[i_255_][i_257_] & 0xff;
				int i_260_ = is_253_[i_255_][i_257_] & 0xff;
				if (i_259_ != 0 || i_260_ != 0) {
					OverlayDef class531 = (i_259_ != 0 ? ((Class329) this).aClass536_3834.method11475(i_259_ - 1, (byte) 0) : null);
					UnderlayDef class481 = (0 != i_260_ ? ((Class329) this).aClass479_3789.getUnderlayDef(i_260_ - 1, (byte) -6) : null);
					if (0 == -595948995 * ((Class329) this).anInt3844 && null == class531)
						((Class329) this).anInt3844 = 697982204;
					((Class329) this).aBool3851 = false;
					((Class329) this).aBool3810 = false;
					boolean[] bools_261_ = bools;
					boolean[] bools_262_ = bools;
					boolean[] bools_263_ = bools;
					bools[3] = false;
					bools_263_[2] = false;
					bools_262_[1] = false;
					bools_261_[0] = false;
					OverlayDef class531_264_ = class531;
					if (null != class531) {
						if (-1 == class531.primaryRGB * 1419498143 && -1 == class531.secondaryRGB * -848345857) {
							class531_264_ = class531;
							class531 = null;
						} else if (null != class481 && (-595948995 * ((Class329) this).anInt3844 != 0))
							((Class329) this).aBool3810 = class531.aBool7061;
					}
					((Class329) this).anInt3781 = method5870(i_260_, i_255_, i_257_, i_256_, i_258_, class390, is_253_, -770588954) * 56558155;
					for (int i_265_ = 0; i_265_ < 13; i_265_++) {
						((Class329) this).anIntArray3842[i_265_] = -1;
						((Class329) this).anIntArray3843[i_265_] = 1;
					}
					method5859(class505, class531, class481, i_255_, i_257_, is_251_, is_252_, is_254_, bools, (short) 14961);
					((Class329) this).aBool3853 = (!((Class329) this).aBool3810 && !bools[0] && !bools[2] && !bools[1] && !bools[3]);
					method5849(class531, class481, -961871857);
					int i_266_ = (-1657432807 * ((Class329) this).anInt3855 + -1916381925 * ((Class329) this).anInt3856);
					if (i_266_ <= 0)
						aClass206_3776.method3384(i, i_255_, i_257_, (byte) 7);
					else {
						if (bools[0])
							i_266_++;
						if (bools[2])
							i_266_++;
						if (bools[1])
							i_266_++;
						if (bools[3])
							i_266_++;
						((Class329) this).anInt3846 = 0;
						((Class329) this).anInt3852 = 0;
						int i_267_ = 3 * i_266_;
						int[] is_268_ = (((Class329) this).aBool3854 ? new int[i_267_] : null);
						int[] is_269_ = new int[i_267_];
						int[] is_270_ = new int[i_267_];
						int[] is_271_ = new int[i_267_];
						int[] is_272_ = new int[i_267_];
						int[] is_273_ = new int[i_267_];
						int[] is_274_ = null != class390_249_ ? new int[i_267_] : null;
						int[] is_275_ = (null != class390_249_ || class390_248_ != null ? new int[i_267_] : null);
						method5850(class505, i, i_255_, i_257_, class531, bools, is_268_, is_269_, is_270_, is_271_, is_272_, is_273_, is_274_, is_275_, class390, class390_249_, class390_248_, 702605153);
						int i_276_ = is_253_[i_255_][i_258_] & 0xff;
						int i_277_ = is_253_[i_256_][i_258_] & 0xff;
						int i_278_ = is_253_[i_256_][i_257_] & 0xff;
						method5851(class505, i, i_255_, i_257_, i_256_, i_258_, class481, i_260_, i_276_, i_277_, i_278_, bools, is_268_, is_269_, is_270_, is_271_, is_272_, is_273_, is_274_, is_275_, is, class390, class390_249_, class390_248_, (byte) 2);
						method5852(class390, class481, class531_264_, i, i_255_, i_257_, i_256_, i_258_, i_260_, i_259_, (short) 13205);
						Class90 class90 = new Class90();
						if (overlayHidden) {
							class90.anInt946 = (aClass206_3776.method3387(i_255_, i_257_, (byte) 114) * -1856397433);
							class90.anInt945 = (aClass206_3776.method3386(i_255_, i_257_, 1952003657) * 873459953);
							class90.anInt947 = (aClass206_3776.method3538(i_255_, i_257_, -575094789) * -96197041);
							class90.anInt949 = (aClass206_3776.method3432(i_255_, i_257_, (byte) 1) * -1472617411);
							class90.anInt950 = (aClass206_3776.method3464(i_255_, i_257_, -1127280692) * 1801644261);
							class90.anInt951 = (aClass206_3776.method3391(i_255_, i_257_, 2048484597) * 1412616155);
						}
						class390.method6707(i_255_, i_257_, is_269_, is_274_, is_270_, is_275_, is_271_, is_268_, is_272_, is_273_, class90, ((Class329) this).aBool3851);
						aClass206_3776.method3384(i, i_255_, i_257_, (byte) -7);
					}
				}
			}
		}
	}

	final void method5848(GraphicalRenderer class505, OverlayDef class531, UnderlayDef class481, int i, int i_289_, int i_290_, int i_291_, byte[][] is, byte[][] is_292_, byte[][] is_293_, boolean[] bools, int i_294_) {
		boolean[] bools_295_ = (null != class531 && class531.aBool7061 ? aBoolArrayArray3793[-595948995 * ((Class329) this).anInt3844] : (aBoolArrayArray3816[((Class329) this).anInt3844 * -595948995]));
		if (i_289_ > 0) {
			if (i > 0) {
				int i_296_ = is[i - 1][i_289_ - 1] & 0xff;
				if (i_296_ > 0) {
					OverlayDef class531_297_ = ((Class329) this).aClass536_3834.method11475(i_296_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_297_.primaryRGB && class531_297_.aBool7061) {
						byte i_298_ = is_292_[i - 1][i_289_ - 1];
						int i_299_ = 2 * is_293_[i - 1][i_289_ - 1] + 4 & 0x7;
						int i_300_ = Class153.method2617(class505, class531_297_, (byte) -21);
						if (aBoolArrayArray3822[i_298_][i_299_]) {
							((Class329) this).anIntArray3838[0] = class531_297_.primaryRGB * 1419498143;
							((Class329) this).anIntArray3839[0] = i_300_;
							((Class329) this).anIntArray3813[0] = 1717409107 * class531_297_.texture;
							((Class329) this).anIntArray3827[0] = class531_297_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[0] = 1070524733 * class531_297_.anInt7052;
							((Class329) this).anIntArray3843[0] = 256;
						}
					}
				}
			}
			if (i < i_290_ - 1) {
				int i_301_ = is[i + 1][i_289_ - 1] & 0xff;
				if (i_301_ > 0) {
					OverlayDef class531_302_ = ((Class329) this).aClass536_3834.method11475(i_301_ - 1, (byte) 0);
					if (-1 != 1419498143 * class531_302_.primaryRGB && class531_302_.aBool7061) {
						byte i_303_ = is_292_[1 + i][i_289_ - 1];
						int i_304_ = 6 + is_293_[1 + i][i_289_ - 1] * 2 & 0x7;
						int i_305_ = Class153.method2617(class505, class531_302_, (byte) -18);
						if (aBoolArrayArray3822[i_303_][i_304_]) {
							((Class329) this).anIntArray3838[2] = 1419498143 * class531_302_.primaryRGB;
							((Class329) this).anIntArray3839[2] = i_305_;
							((Class329) this).anIntArray3813[2] = 1717409107 * class531_302_.texture;
							((Class329) this).anIntArray3827[2] = -1065364389 * class531_302_.anInt7057;
							((Class329) this).anIntArray3842[2] = class531_302_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[2] = 512;
						}
					}
				}
			}
		}
		if (i_289_ < i_291_ - 1) {
			if (i > 0) {
				int i_306_ = is[i - 1][i_289_ + 1] & 0xff;
				if (i_306_ > 0) {
					OverlayDef class531_307_ = ((Class329) this).aClass536_3834.method11475(i_306_ - 1, (byte) 0);
					if (class531_307_.primaryRGB * 1419498143 != -1 && class531_307_.aBool7061) {
						byte i_308_ = is_292_[i - 1][i_289_ + 1];
						int i_309_ = is_293_[i - 1][1 + i_289_] * 2 + 2 & 0x7;
						int i_310_ = Class153.method2617(class505, class531_307_, (byte) 12);
						if (aBoolArrayArray3822[i_308_][i_309_]) {
							((Class329) this).anIntArray3838[6] = class531_307_.primaryRGB * 1419498143;
							((Class329) this).anIntArray3839[6] = i_310_;
							((Class329) this).anIntArray3813[6] = 1717409107 * class531_307_.texture;
							((Class329) this).anIntArray3827[6] = class531_307_.anInt7057 * -1065364389;
							((Class329) this).anIntArray3842[6] = class531_307_.anInt7052 * 1070524733;
							((Class329) this).anIntArray3843[6] = 64;
						}
					}
				}
			}
			if (i < i_290_ - 1) {
				int i_311_ = is[1 + i][i_289_ + 1] & 0xff;
				if (i_311_ > 0) {
					OverlayDef class531_312_ = ((Class329) this).aClass536_3834.method11475(i_311_ - 1, (byte) 0);
					if (1419498143 * class531_312_.primaryRGB != -1 && class531_312_.aBool7061) {
						byte i_313_ = is_292_[i + 1][1 + i_289_];
						int i_314_ = 2 * is_293_[i + 1][i_289_ + 1] + 0 & 0x7;
						int i_315_ = Class153.method2617(class505, class531_312_, (byte) -16);
						if (aBoolArrayArray3822[i_313_][i_314_]) {
							((Class329) this).anIntArray3838[4] = class531_312_.primaryRGB * 1419498143;
							((Class329) this).anIntArray3839[4] = i_315_;
							((Class329) this).anIntArray3813[4] = class531_312_.texture * 1717409107;
							((Class329) this).anIntArray3827[4] = -1065364389 * class531_312_.anInt7057;
							((Class329) this).anIntArray3842[4] = 1070524733 * class531_312_.anInt7052;
							((Class329) this).anIntArray3843[4] = 128;
						}
					}
				}
			}
		}
		if (i_289_ > 0) {
			int i_316_ = is[i][i_289_ - 1] & 0xff;
			if (i_316_ > 0) {
				OverlayDef class531_317_ = ((Class329) this).aClass536_3834.method11475(i_316_ - 1, (byte) 0);
				if (1419498143 * class531_317_.primaryRGB != -1) {
					byte i_318_ = is_292_[i][i_289_ - 1];
					int i_319_ = is_293_[i][i_289_ - 1];
					if (class531_317_.aBool7061) {
						int i_320_ = 2;
						int i_321_ = 2 * i_319_ + 4;
						int i_322_ = Class153.method2617(class505, class531_317_, (byte) 56);
						for (int i_323_ = 0; i_323_ < 3; i_323_++) {
							i_321_ &= 0x7;
							i_320_ &= 0x7;
							if (aBoolArrayArray3822[i_318_][i_321_] && (((Class329) this).anIntArray3842[i_320_] <= class531_317_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_320_] = 1419498143 * class531_317_.primaryRGB;
								((Class329) this).anIntArray3839[i_320_] = i_322_;
								((Class329) this).anIntArray3813[i_320_] = 1717409107 * class531_317_.texture;
								((Class329) this).anIntArray3827[i_320_] = -1065364389 * class531_317_.anInt7057;
								if (((Class329) this).anIntArray3842[i_320_] == 1070524733 * class531_317_.anInt7052)
									((Class329) this).anIntArray3843[i_320_] |= 0x20;
								else
									((Class329) this).anIntArray3843[i_320_] = 32;
								((Class329) this).anIntArray3842[i_320_] = class531_317_.anInt7052 * 1070524733;
							}
							i_321_++;
							i_320_--;
						}
						if (!bools_295_[0 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[0] = (aBoolArrayArray3793[i_318_][2 + i_319_ & 0x3]);
					} else if (!bools_295_[0 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[0] = aBoolArrayArray3816[i_318_][i_319_ + 2 & 0x3];
				}
			}
		}
		if (i_289_ < i_291_ - 1) {
			int i_324_ = is[i][i_289_ + 1] & 0xff;
			if (i_324_ > 0) {
				OverlayDef class531_325_ = ((Class329) this).aClass536_3834.method11475(i_324_ - 1, (byte) 0);
				if (-1 != 1419498143 * class531_325_.primaryRGB) {
					byte i_326_ = is_292_[i][i_289_ + 1];
					int i_327_ = is_293_[i][i_289_ + 1];
					if (class531_325_.aBool7061) {
						int i_328_ = 4;
						int i_329_ = 2 * i_327_ + 2;
						int i_330_ = Class153.method2617(class505, class531_325_, (byte) 43);
						for (int i_331_ = 0; i_331_ < 3; i_331_++) {
							i_329_ &= 0x7;
							i_328_ &= 0x7;
							if (aBoolArrayArray3822[i_326_][i_329_] && (((Class329) this).anIntArray3842[i_328_] <= 1070524733 * class531_325_.anInt7052)) {
								((Class329) this).anIntArray3838[i_328_] = class531_325_.primaryRGB * 1419498143;
								((Class329) this).anIntArray3839[i_328_] = i_330_;
								((Class329) this).anIntArray3813[i_328_] = 1717409107 * class531_325_.texture;
								((Class329) this).anIntArray3827[i_328_] = class531_325_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_328_] == 1070524733 * class531_325_.anInt7052)
									((Class329) this).anIntArray3843[i_328_] |= 0x10;
								else
									((Class329) this).anIntArray3843[i_328_] = 16;
								((Class329) this).anIntArray3842[i_328_] = 1070524733 * class531_325_.anInt7052;
							}
							i_329_--;
							i_328_++;
						}
						if (!bools_295_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
							bools[2] = (aBoolArrayArray3793[i_326_][i_327_ + 0 & 0x3]);
					} else if (!bools_295_[2 + (((Class329) this).anInt3781 * 1070348131) & 0x3])
						bools[2] = aBoolArrayArray3816[i_326_][0 + i_327_ & 0x3];
				}
			}
		}
		if (i > 0) {
			int i_332_ = is[i - 1][i_289_] & 0xff;
			if (i_332_ > 0) {
				OverlayDef class531_333_ = ((Class329) this).aClass536_3834.method11475(i_332_ - 1, (byte) 0);
				if (class531_333_.primaryRGB * 1419498143 != -1) {
					byte i_334_ = is_292_[i - 1][i_289_];
					int i_335_ = is_293_[i - 1][i_289_];
					if (class531_333_.aBool7061) {
						int i_336_ = 6;
						int i_337_ = i_335_ * 2 + 4;
						int i_338_ = Class153.method2617(class505, class531_333_, (byte) -53);
						for (int i_339_ = 0; i_339_ < 3; i_339_++) {
							i_337_ &= 0x7;
							i_336_ &= 0x7;
							if (aBoolArrayArray3822[i_334_][i_337_] && (((Class329) this).anIntArray3842[i_336_] <= 1070524733 * class531_333_.anInt7052)) {
								((Class329) this).anIntArray3838[i_336_] = 1419498143 * class531_333_.primaryRGB;
								((Class329) this).anIntArray3839[i_336_] = i_338_;
								((Class329) this).anIntArray3813[i_336_] = class531_333_.texture * 1717409107;
								((Class329) this).anIntArray3827[i_336_] = -1065364389 * class531_333_.anInt7057;
								if (1070524733 * class531_333_.anInt7052 == (((Class329) this).anIntArray3842[i_336_]))
									((Class329) this).anIntArray3843[i_336_] |= 0x8;
								else
									((Class329) this).anIntArray3843[i_336_] = 8;
								((Class329) this).anIntArray3842[i_336_] = 1070524733 * class531_333_.anInt7052;
							}
							i_337_--;
							i_336_++;
						}
						if (!bools_295_[(((Class329) this).anInt3781 * 1070348131 + 3 & 0x3)])
							bools[3] = (aBoolArrayArray3793[i_334_][i_335_ + 1 & 0x3]);
					} else if (!bools_295_[(3 + 1070348131 * ((Class329) this).anInt3781 & 0x3)])
						bools[3] = aBoolArrayArray3816[i_334_][1 + i_335_ & 0x3];
				}
			}
		}
		if (i < i_290_ - 1) {
			int i_340_ = is[i + 1][i_289_] & 0xff;
			if (i_340_ > 0) {
				OverlayDef class531_341_ = ((Class329) this).aClass536_3834.method11475(i_340_ - 1, (byte) 0);
				if (1419498143 * class531_341_.primaryRGB != -1) {
					byte i_342_ = is_292_[1 + i][i_289_];
					int i_343_ = is_293_[1 + i][i_289_];
					if (class531_341_.aBool7061) {
						int i_344_ = 4;
						int i_345_ = 6 + i_343_ * 2;
						int i_346_ = Class153.method2617(class505, class531_341_, (byte) 10);
						for (int i_347_ = 0; i_347_ < 3; i_347_++) {
							i_345_ &= 0x7;
							i_344_ &= 0x7;
							if (aBoolArrayArray3822[i_342_][i_345_] && (((Class329) this).anIntArray3842[i_344_] <= class531_341_.anInt7052 * 1070524733)) {
								((Class329) this).anIntArray3838[i_344_] = 1419498143 * class531_341_.primaryRGB;
								((Class329) this).anIntArray3839[i_344_] = i_346_;
								((Class329) this).anIntArray3813[i_344_] = class531_341_.texture * 1717409107;
								((Class329) this).anIntArray3827[i_344_] = class531_341_.anInt7057 * -1065364389;
								if (((Class329) this).anIntArray3842[i_344_] == class531_341_.anInt7052 * 1070524733)
									((Class329) this).anIntArray3843[i_344_] |= 0x4;
								else
									((Class329) this).anIntArray3843[i_344_] = 4;
								((Class329) this).anIntArray3842[i_344_] = class531_341_.anInt7052 * 1070524733;
							}
							i_345_++;
							i_344_--;
						}
						if (!bools_295_[1 + 1070348131 * (((Class329) this).anInt3781) & 0x3])
							bools[1] = (aBoolArrayArray3793[i_342_][3 + i_343_ & 0x3]);
					} else if (!bools_295_[(1070348131 * ((Class329) this).anInt3781 + 1 & 0x3)])
						bools[1] = aBoolArrayArray3816[i_342_][i_343_ + 3 & 0x3];
				}
			}
		}
		if (null != class531 && class531.aBool7061) {
			int i_348_ = Class153.method2617(class505, class531, (byte) -30);
			for (int i_349_ = 0; i_349_ < 8; i_349_++) {
				int i_350_ = i_349_ - 2140696262 * ((Class329) this).anInt3781 & 0x7;
				if ((aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_349_]) && (((Class329) this).anIntArray3842[i_350_] <= class531.anInt7052 * 1070524733)) {
					((Class329) this).anIntArray3838[i_350_] = class531.primaryRGB * 1419498143;
					((Class329) this).anIntArray3839[i_350_] = i_348_;
					((Class329) this).anIntArray3813[i_350_] = 1717409107 * class531.texture;
					((Class329) this).anIntArray3827[i_350_] = class531.anInt7057 * -1065364389;
					if (1070524733 * class531.anInt7052 == ((Class329) this).anIntArray3842[i_350_])
						((Class329) this).anIntArray3843[i_350_] |= 0x2;
					else
						((Class329) this).anIntArray3843[i_350_] = 2;
					((Class329) this).anIntArray3842[i_350_] = class531.anInt7052 * 1070524733;
				}
			}
		}
	}

	void method5849(OverlayDef class531, UnderlayDef class481, int i) {
		if (((Class329) this).aBool3853) {
			((Class329) this).anIntArray3857 = (anIntArrayArray3824[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3860[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3815[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anInt3856 = 1732574483 * (null != class531 ? (anIntArray3814[-595948995 * ((Class329) this).anInt3844]) : 0);
			((Class329) this).anInt3855 = -32442583 * (null != class481 ? (anIntArray3829[((Class329) this).anInt3844 * -595948995]) : 0);
		} else if (((Class329) this).aBool3810) {
			((Class329) this).anIntArray3857 = (anIntArrayArray3775[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3821[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3836[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anInt3856 = 1732574483 * (null != class531 ? (anIntArray3778[((Class329) this).anInt3844 * -595948995]) : 0);
			((Class329) this).anInt3855 = (class481 != null ? anIntArray3819[-595948995 * ((Class329) this).anInt3844] : 0) * -32442583;
			((Class329) this).anIntArray3832 = (anIntArrayArray3833[-595948995 * ((Class329) this).anInt3844]);
		} else {
			((Class329) this).anIntArray3857 = (anIntArrayArray3774[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3858 = (anIntArrayArray3830[-595948995 * ((Class329) this).anInt3844]);
			((Class329) this).anIntArray3859 = (anIntArrayArray3831[((Class329) this).anInt3844 * -595948995]);
			((Class329) this).anInt3856 = (class531 != null ? anIntArray3826[((Class329) this).anInt3844 * -595948995] : 0) * 1732574483;
			((Class329) this).anInt3855 = (class481 != null ? anIntArray3847[-595948995 * ((Class329) this).anInt3844] : 0) * -32442583;
			((Class329) this).anIntArray3832 = (anIntArrayArray3828[((Class329) this).anInt3844 * -595948995]);
		}
	}

	void method5850(GraphicalRenderer class505, int i, int i_351_, int i_352_, OverlayDef class531, boolean[] bools, int[] is, int[] is_353_, int[] is_354_, int[] is_355_, int[] is_356_, int[] is_357_, int[] is_358_, int[] is_359_, Class390 class390, Class390 class390_360_, Class390 class390_361_, int i_362_) {
		((Class329) this).anInt3850 = 1866422575;
		((Class329) this).anInt3848 = 1668530227;
		((Class329) this).anInt3849 = -566299392;
		if (class531 != null) {
			((Class329) this).anInt3850 = class531.primaryRGB * -2062938673;
			((Class329) this).anInt3848 = class531.texture * 1041498231;
			((Class329) this).anInt3849 = -1129429737 * class531.anInt7057;
			int i_363_ = Class153.method2617(class505, class531, (byte) 29);
			for (int i_364_ = 0; i_364_ < -1916381925 * ((Class329) this).anInt3856; i_364_++) {
				boolean bool = false;
				int i_365_;
				if (bools[0 - ((Class329) this).anInt3781 * 1070348131 & 0x3] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[0])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_365_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[2])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_365_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_365_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[3] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_365_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_365_ = 3;
				}
				for (int i_366_ = 0; i_366_ < i_365_; i_366_++) {
					int i_367_ = ((Class329) this).anIntArray3837[i_366_];
					int i_368_ = (i_367_ - ((Class329) this).anInt3781 * 2140696262 & 0x7);
					int i_369_ = anIntArray3811[i_367_];
					int i_370_ = anIntArray3800[i_367_];
					int i_371_;
					int i_372_;
					if (1 == 1070348131 * ((Class329) this).anInt3781) {
						i_371_ = i_370_;
						i_372_ = 512 - i_369_;
					} else if (2 == 1070348131 * ((Class329) this).anInt3781) {
						i_371_ = 512 - i_369_;
						i_372_ = 512 - i_370_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_371_ = 512 - i_370_;
						i_372_ = i_369_;
					} else {
						i_371_ = i_369_;
						i_372_ = i_370_;
					}
					is_353_[((Class329) this).anInt3852 * -1626041195] = i_371_;
					is_354_[-1626041195 * ((Class329) this).anInt3852] = i_372_;
					if (null != is_358_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_367_])) {
						int i_373_ = (i_351_ << 9) + i_371_;
						int i_374_ = (i_352_ << 9) + i_372_;
						is_358_[-1626041195 * ((Class329) this).anInt3852] = (class390_360_.method6709(i_373_, i_374_, 1550950385) - class390.method6709(i_373_, i_374_, -497084405));
					}
					if (is_359_ != null) {
						if (null != class390_360_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_367_])) {
							int i_375_ = (i_351_ << 9) + i_371_;
							int i_376_ = (i_352_ << 9) + i_372_;
							is_359_[((Class329) this).anInt3852 * -1626041195] = (class390.method6709(i_375_, i_376_, -1953375051) - class390_360_.method6709(i_375_, i_376_, -1082530779));
						} else if (class390_361_ != null && !(aBoolArrayArray3823[(((Class329) this).anInt3844 * -595948995)][i_367_])) {
							int i_377_ = i_371_ + (i_351_ << 9);
							int i_378_ = i_372_ + (i_352_ << 9);
							is_359_[-1626041195 * ((Class329) this).anInt3852] = (class390_361_.method6709(i_377_, i_378_, -1990196729) - class390.method6709(i_377_, i_378_, -1843099367));
						}
					}
					if (i_367_ < 8 && (((Class329) this).anIntArray3842[i_368_] > class531.anInt7052 * 1070524733)) {
						if (is != null)
							is[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3839[i_368_];
						is_357_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3827[i_368_];
						is_356_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3813[i_368_];
						is_355_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3838[i_368_];
					} else {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = i_363_;
						is_356_[-1626041195 * ((Class329) this).anInt3852] = class531.texture * 1717409107;
						is_357_[-1626041195 * ((Class329) this).anInt3852] = class531.anInt7057 * -1065364389;
						is_355_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (!overlayHidden && 0 == i)
				aClass206_3776.method3392(i_351_, i_352_, 220189999 * class531.anInt7051, 442664952 * class531.anInt7063, -1036917025 * class531.anInt7064, class531.anInt7065 * 669977931, -1307230745 * class531.anInt7055, class531.anInt7067 * -335219819, (short) -30684);
			if (-595948995 * ((Class329) this).anInt3844 != 12 && 1419498143 * class531.primaryRGB != -1 && class531.aBool7059)
				((Class329) this).aBool3851 = true;
		} else if (((Class329) this).aBool3853)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3814[-595948995 * ((Class329) this).anInt3844]);
		else if (((Class329) this).aBool3810)
			((Class329) this).anInt3846 += -193737745 * (anIntArray3778[-595948995 * ((Class329) this).anInt3844]);
		else
			((Class329) this).anInt3846 += -193737745 * (anIntArray3826[-595948995 * ((Class329) this).anInt3844]);
	}

	void method5851(GraphicalRenderer class505, int i, int i_379_, int i_380_, int i_381_, int i_382_, UnderlayDef class481, int i_383_, int i_384_, int i_385_, int i_386_, boolean[] bools, int[] is, int[] is_387_, int[] is_388_, int[] is_389_, int[] is_390_, int[] is_391_, int[] is_392_, int[] is_393_, int[][] is_394_, Class390 class390, Class390 class390_395_, Class390 class390_396_, byte i_397_) {
		if (null != class481) {
			if (i_384_ == 0)
				i_384_ = i_383_;
			if (0 == i_385_)
				i_385_ = i_383_;
			if (0 == i_386_)
				i_386_ = i_383_;
			UnderlayDef class481_398_ = ((Class329) this).aClass479_3789.getUnderlayDef(i_383_ - 1, (byte) -96);
			UnderlayDef class481_399_ = ((Class329) this).aClass479_3789.getUnderlayDef(i_384_ - 1, (byte) -18);
			UnderlayDef class481_400_ = ((Class329) this).aClass479_3789.getUnderlayDef(i_385_ - 1, (byte) -95);
			UnderlayDef class481_401_ = ((Class329) this).aClass479_3789.getUnderlayDef(i_386_ - 1, (byte) -80);
			for (int i_402_ = 0; i_402_ < -1657432807 * ((Class329) this).anInt3855; i_402_++) {
				boolean bool = false;
				int i_403_;
				if (bools[0 - 1070348131 * ((Class329) this).anInt3781 & 0x3] && (((Class329) this).anIntArray3832[0] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 1;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 1;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_403_ = 6;
				} else if (bools[(2 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[2] == ((Class329) this).anInt3846 * -1256144113)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 5;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 5;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_403_ = 6;
				} else if (bools[(1 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (((Class329) this).anIntArray3832[1] == -1256144113 * ((Class329) this).anInt3846)) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 3;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					((Class329) this).anIntArray3837[3] = 3;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_403_ = 6;
				} else if (bools[(3 - 1070348131 * ((Class329) this).anInt3781 & 0x3)] && (-1256144113 * ((Class329) this).anInt3846 == ((Class329) this).anIntArray3832[3])) {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = 7;
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[3] = 7;
					((Class329) this).anIntArray3837[4] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[5] = (((Class329) this).anIntArray3859[((Class329) this).anInt3846 * -1256144113]);
					i_403_ = 6;
				} else {
					((Class329) this).anIntArray3837[0] = (((Class329) this).anIntArray3857[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[1] = (((Class329) this).anIntArray3858[-1256144113 * ((Class329) this).anInt3846]);
					((Class329) this).anIntArray3837[2] = (((Class329) this).anIntArray3859[-1256144113 * ((Class329) this).anInt3846]);
					i_403_ = 3;
				}
				for (int i_404_ = 0; i_404_ < i_403_; i_404_++) {
					int i_405_ = ((Class329) this).anIntArray3837[i_404_];
					int i_406_ = (i_405_ - 2140696262 * ((Class329) this).anInt3781 & 0x7);
					int i_407_ = anIntArray3811[i_405_];
					int i_408_ = anIntArray3800[i_405_];
					int i_409_;
					int i_410_;
					if (((Class329) this).anInt3781 * 1070348131 == 1) {
						i_409_ = i_408_;
						i_410_ = 512 - i_407_;
					} else if (1070348131 * ((Class329) this).anInt3781 == 2) {
						i_409_ = 512 - i_407_;
						i_410_ = 512 - i_408_;
					} else if (((Class329) this).anInt3781 * 1070348131 == 3) {
						i_409_ = 512 - i_408_;
						i_410_ = i_407_;
					} else {
						i_409_ = i_407_;
						i_410_ = i_408_;
					}
					is_387_[((Class329) this).anInt3852 * -1626041195] = i_409_;
					is_388_[((Class329) this).anInt3852 * -1626041195] = i_410_;
					if (null != is_392_ && (aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_405_])) {
						int i_411_ = (i_379_ << 9) + i_409_;
						int i_412_ = (i_380_ << 9) + i_410_;
						is_392_[((Class329) this).anInt3852 * -1626041195] = (class390_395_.method6709(i_411_, i_412_, -722499660) - class390.method6709(i_411_, i_412_, 478616173));
					}
					if (is_393_ != null) {
						if (null != class390_395_ && !(aBoolArrayArray3822[((Class329) this).anInt3844 * -595948995][i_405_])) {
							int i_413_ = i_409_ + (i_379_ << 9);
							int i_414_ = (i_380_ << 9) + i_410_;
							is_393_[-1626041195 * ((Class329) this).anInt3852] = (class390.method6709(i_413_, i_414_, -1591634709) - class390_395_.method6709(i_413_, i_414_, -1293906415));
						} else if (class390_396_ != null && !(aBoolArrayArray3823[(-595948995 * ((Class329) this).anInt3844)][i_405_])) {
							int i_415_ = (i_379_ << 9) + i_409_;
							int i_416_ = (i_380_ << 9) + i_410_;
							is_393_[((Class329) this).anInt3852 * -1626041195] = (class390_396_.method6709(i_415_, i_416_, 2113040787) - class390.method6709(i_415_, i_416_, 1891063345));
						}
					}
					if (i_405_ < 8 && ((Class329) this).anIntArray3842[i_406_] >= 0) {
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3839[i_406_];
						is_391_[((Class329) this).anInt3852 * -1626041195] = ((Class329) this).anIntArray3827[i_406_];
						is_390_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3813[i_406_];
						is_389_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anIntArray3838[i_406_];
					} else {
						if (((Class329) this).aBool3810 && (aBoolArrayArray3822[-595948995 * ((Class329) this).anInt3844][i_405_])) {
							is_390_[-1626041195 * ((Class329) this).anInt3852] = ((Class329) this).anInt3848 * 1725089029;
							is_391_[((Class329) this).anInt3852 * -1626041195] = -1073742499 * ((Class329) this).anInt3849;
							is_389_[((Class329) this).anInt3852 * -1626041195] = 1730638385 * ((Class329) this).anInt3850;
						} else if (0 == i_409_ && 0 == i_410_) {
							is_389_[-1626041195 * ((Class329) this).anInt3852] = is_394_[i_379_][i_380_];
							is_390_[-1626041195 * ((Class329) this).anInt3852] = -1346987295 * class481_398_.anInt5719;
							is_391_[((Class329) this).anInt3852 * -1626041195] = class481_398_.anInt5720 * -1001005969;
						} else if (0 == i_409_ && 512 == i_410_) {
							is_389_[((Class329) this).anInt3852 * -1626041195] = is_394_[i_379_][i_382_];
							is_390_[-1626041195 * ((Class329) this).anInt3852] = -1346987295 * class481_399_.anInt5719;
							is_391_[((Class329) this).anInt3852 * -1626041195] = class481_399_.anInt5720 * -1001005969;
						} else if (512 == i_409_ && 512 == i_410_) {
							is_389_[-1626041195 * ((Class329) this).anInt3852] = is_394_[i_381_][i_382_];
							is_390_[-1626041195 * ((Class329) this).anInt3852] = class481_400_.anInt5719 * -1346987295;
							is_391_[-1626041195 * ((Class329) this).anInt3852] = class481_400_.anInt5720 * -1001005969;
						} else if (i_409_ == 512 && 0 == i_410_) {
							is_389_[((Class329) this).anInt3852 * -1626041195] = is_394_[i_381_][i_380_];
							is_390_[((Class329) this).anInt3852 * -1626041195] = -1346987295 * class481_401_.anInt5719;
							is_391_[((Class329) this).anInt3852 * -1626041195] = -1001005969 * class481_401_.anInt5720;
						} else {
							if (i_409_ < 256) {
								if (i_410_ < 256) {
									is_390_[(-1626041195 * ((Class329) this).anInt3852)] = (-1346987295 * class481_398_.anInt5719);
									is_391_[(-1626041195 * ((Class329) this).anInt3852)] = (-1001005969 * class481_398_.anInt5720);
								} else {
									is_390_[(((Class329) this).anInt3852 * -1626041195)] = (class481_399_.anInt5719 * -1346987295);
									is_391_[(((Class329) this).anInt3852 * -1626041195)] = (-1001005969 * class481_399_.anInt5720);
								}
							} else if (i_410_ < 256) {
								is_390_[(-1626041195 * ((Class329) this).anInt3852)] = -1346987295 * class481_401_.anInt5719;
								is_391_[(-1626041195 * ((Class329) this).anInt3852)] = class481_401_.anInt5720 * -1001005969;
							} else {
								is_390_[(-1626041195 * ((Class329) this).anInt3852)] = class481_400_.anInt5719 * -1346987295;
								is_391_[(((Class329) this).anInt3852 * -1626041195)] = -1001005969 * class481_400_.anInt5720;
							}
							int i_417_ = Class371.method6347(is_394_[i_379_][i_380_], is_394_[i_381_][i_380_], i_409_ << 7 >> 9, -1964912847);
							int i_418_ = Class371.method6347(is_394_[i_379_][i_382_], is_394_[i_381_][i_382_], i_409_ << 7 >> 9, -2132910365);
							is_389_[((Class329) this).anInt3852 * -1626041195] = Class371.method6347(i_417_, i_418_, i_410_ << 7 >> 9, -2113555849);
						}
						if (null != is)
							is[((Class329) this).anInt3852 * -1626041195] = is_389_[(-1626041195 * ((Class329) this).anInt3852)];
					}
					((Class329) this).anInt3852 += 2097387197;
				}
				((Class329) this).anInt3846 += -193737745;
			}
			if (0 != -595948995 * ((Class329) this).anInt3844 && class481.aBool5721)
				((Class329) this).aBool3851 = true;
		}
	}

	void method5852(Class390 class390, UnderlayDef class481, OverlayDef class531, int i, int i_419_, int i_420_, int i_421_, int i_422_, int i_423_, int i_424_, short i_425_) {
		int i_426_ = class390.method6722(i_419_, i_420_, 65280);
		int i_427_ = class390.method6722(i_421_, i_420_, 65280);
		int i_428_ = class390.method6722(i_421_, i_422_, 65280);
		int i_429_ = class390.method6722(i_419_, i_422_, 65280);
		boolean bool = regionMap.is0x2(i_419_, i_420_, 1534116751);
		if (bool && i > 1 || !bool && i > 0) {
			boolean bool_430_ = true;
			if (null != class481 && !class481.aBool5722)
				bool_430_ = false;
			else if (i_423_ == 0 && 0 != ((Class329) this).anInt3844 * -595948995)
				bool_430_ = false;
			else if (i_424_ > 0 && class531 != null && !class531.aBool7056)
				bool_430_ = false;
			if (bool_430_ && i_427_ == i_426_ && i_426_ == i_428_ && i_426_ == i_429_)
				aByteArrayArrayArray3794[i][i_419_][i_420_] |= 0x4;
		}
	}

	public final void method5853(int i, int[][] is, int i_431_) {
		int[][] is_432_ = unk0Data[i];
		for (int i_433_ = 0; i_433_ < maxX * -1230013231 + 1; i_433_++) {
			for (int i_434_ = 0; i_434_ < 1 + 2024737111 * maxY; i_434_++)
				is_432_[i_433_][i_434_] += is[i_433_][i_434_];
		}
	}

	static {
		anIntArray3826 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray3847 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray3778 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray3819 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray3811 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray3800 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBoolArrayArray3822 = (new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, { false, false, false, false, false, false, false, false, false, false, false, false, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false } });
		aBoolArrayArray3823 = (new boolean[][] { { false, false, false, false, false, false, false, false, false, false, false, false, false }, { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false },
				{ true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, { false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true } });
		anIntArrayArray3824 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray3860 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray3815 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBoolArrayArray3816 = (new boolean[][] { { false, false, false, false }, { false, false, false, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false }, { false, false, false, false } });
		anIntArrayArray3828 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray3774 = (new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } });
		anIntArrayArray3830 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray3831 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBoolArrayArray3793 = (new boolean[][] { { false, false, false, false }, { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, { false, false, false, false }, { false, true, false, true }, { false, false, false, false } });
		anIntArrayArray3833 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray3775 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray3821 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray3836 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
	}

	Class329(SceneObjectManager class206, int i, int i_435_, int i_436_, boolean bool, Class536 class536, UnderlayIndexLoader class479, RegionMap class311) {
		aBool3780 = false;
		aBool3820 = false;
		aBool3782 = false;
		((Class329) this).anIntArray3837 = new int[6];
		((Class329) this).anIntArray3838 = new int[13];
		((Class329) this).anIntArray3839 = new int[13];
		((Class329) this).anIntArray3813 = new int[13];
		((Class329) this).anIntArray3827 = new int[13];
		((Class329) this).anIntArray3842 = new int[13];
		((Class329) this).anIntArray3843 = new int[13];
		((Class329) this).anInt3846 = 0;
		((Class329) this).anInt3852 = 0;
		((Class329) this).anIntArray3832 = null;
		aClass206_3776 = class206;
		anInt3845 = i * 627820945;
		maxX = 1781423153 * i_435_;
		maxY = 1893331559 * i_436_;
		overlayHidden = bool;
		((Class329) this).aClass536_3834 = class536;
		((Class329) this).aClass479_3789 = class479;
		regionMap = class311;
		((Class329) this).underlayColors = (new byte[anInt3845 * 1599084401][-1230013231 * maxX][maxY * 2024737111]);
		((Class329) this).overlayColors = (new byte[1599084401 * anInt3845][maxX * -1230013231][maxY * 2024737111]);
		((Class329) this).val49ArrDiv4 = (new byte[anInt3845 * 1599084401][maxX * -1230013231][2024737111 * maxY]);
		((Class329) this).val49ArrAnd0x3 = (new byte[1599084401 * anInt3845][maxX * -1230013231][2024737111 * maxY]);
		unk0Data = (new int[anInt3845 * 1599084401][1 + -1230013231 * maxX][1 + 2024737111 * maxY]);
		aByteArrayArrayArray3794 = (new byte[anInt3845 * 1599084401][-1230013231 * maxX + 1][maxY * 2024737111 + 1]);
	}

	void method5859(GraphicalRenderer class505, OverlayDef class531, UnderlayDef class481, int i, int i_489_, byte[][] is, byte[][] is_490_, byte[][] is_491_, boolean[] bools, short i_492_) {
		boolean[] bools_493_ = (class531 != null && class531.aBool7061 ? aBoolArrayArray3793[((Class329) this).anInt3844 * -595948995] : (aBoolArrayArray3816[-595948995 * ((Class329) this).anInt3844]));
		method5848(class505, class531, class481, i, i_489_, maxX * -1230013231, maxY * 2024737111, is_491_, is, is_490_, bools, -1828708428);
		((Class329) this).aBool3854 = null != class531 && (class531.primaryRGB * 1419498143 != -848345857 * class531.secondaryRGB);
		if (!((Class329) this).aBool3854) {
			for (int i_494_ = 0; i_494_ < 8; i_494_++) {
				if (((Class329) this).anIntArray3842[i_494_] >= 0 && (((Class329) this).anIntArray3839[i_494_] != ((Class329) this).anIntArray3838[i_494_])) {
					((Class329) this).aBool3854 = true;
					break;
				}
			}
		}
		if (!bools_493_[1 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_495_ = bools;
			int i_496_ = 1;
			bools_495_[i_496_] = (bools_495_[i_496_] | 0 == (((Class329) this).anIntArray3843[2] & ((Class329) this).anIntArray3843[4]));
		}
		if (!bools_493_[3 + ((Class329) this).anInt3781 * 1070348131 & 0x3]) {
			boolean[] bools_497_ = bools;
			int i_498_ = 3;
			bools_497_[i_498_] = (bools_497_[i_498_] | 0 == (((Class329) this).anIntArray3843[6] & ((Class329) this).anIntArray3843[0]));
		}
		if (!bools_493_[1070348131 * ((Class329) this).anInt3781 + 0 & 0x3]) {
			boolean[] bools_499_ = bools;
			int i_500_ = 0;
			bools_499_[i_500_] = (bools_499_[i_500_] | 0 == (((Class329) this).anIntArray3843[0] & ((Class329) this).anIntArray3843[2]));
		}
		if (!bools_493_[2 + 1070348131 * ((Class329) this).anInt3781 & 0x3]) {
			boolean[] bools_501_ = bools;
			int i_502_ = 2;
			bools_501_[i_502_] = (bools_501_[i_502_] | 0 == (((Class329) this).anIntArray3843[4] & ((Class329) this).anIntArray3843[6]));
		}
		if (!((Class329) this).aBool3810 && (((Class329) this).anInt3844 * -595948995 == 0 || -595948995 * ((Class329) this).anInt3844 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_503_ = bools;
				bools[3] = false;
				bools_503_[0] = false;
				((Class329) this).anInt3844 = (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_504_ = bools;
				bools[1] = false;
				bools_504_[0] = false;
				((Class329) this).anInt3844 = (0 == -595948995 * ((Class329) this).anInt3844 ? 13 : 14) * 1489820949;
				((Class329) this).anInt3781 = 169674465;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_505_ = bools;
				bools[2] = false;
				bools_505_[1] = false;
				((Class329) this).anInt3844 = (1489820949 * (-595948995 * ((Class329) this).anInt3844 == 0 ? 13 : 14));
				((Class329) this).anInt3781 = 113116310;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_506_ = bools;
				bools[3] = false;
				bools_506_[2] = false;
				((Class329) this).anInt3844 = (1489820949 * (0 == ((Class329) this).anInt3844 * -595948995 ? 13 : 14));
				((Class329) this).anInt3781 = 56558155;
			}
		}
	}

	int method5870(int i, int i_659_, int i_660_, int i_661_, int i_662_, Class390 class390, byte[][] is, int i_663_) {
		if ((-595948995 * ((Class329) this).anInt3844 == 0 || -595948995 * ((Class329) this).anInt3844 == 12) && i_659_ > 0 && i_660_ > 0 && i_659_ < -1230013231 * maxX && i_660_ < maxY * 2024737111) {
			int i_664_ = 0;
			int i_665_ = 0;
			int i_666_ = 0;
			int i_667_ = 0;
			i_664_ = i_664_ + (i == is[i_659_ - 1][i_660_ - 1] ? 1 : -1);
			i_665_ = i_665_ + (i == is[i_661_][i_660_ - 1] ? 1 : -1);
			i_666_ = i_666_ + (is[i_661_][i_662_] == i ? 1 : -1);
			i_667_ = i_667_ + (i == is[i_659_ - 1][i_662_] ? 1 : -1);
			if (is[i_659_][i_660_ - 1] == i) {
				i_664_++;
				i_665_++;
			} else {
				i_664_--;
				i_665_--;
			}
			if (i == is[i_661_][i_660_]) {
				i_665_++;
				i_666_++;
			} else {
				i_665_--;
				i_666_--;
			}
			if (i == is[i_659_][i_662_]) {
				i_666_++;
				i_667_++;
			} else {
				i_666_--;
				i_667_--;
			}
			if (i == is[i_659_ - 1][i_660_]) {
				i_667_++;
				i_664_++;
			} else {
				i_667_--;
				i_664_--;
			}
			int i_668_ = i_664_ - i_666_;
			if (i_668_ < 0)
				i_668_ = -i_668_;
			int i_669_ = i_665_ - i_667_;
			if (i_669_ < 0)
				i_669_ = -i_669_;
			if (i_668_ == i_669_) {
				i_668_ = (class390.method6722(i_659_, i_660_, 65280) - class390.method6722(i_661_, i_662_, 65280));
				if (i_668_ < 0)
					i_668_ = -i_668_;
				i_669_ = (class390.method6722(i_661_, i_660_, 65280) - class390.method6722(i_659_, i_662_, 65280));
				if (i_669_ < 0)
					i_669_ = -i_669_;
			}
			return i_668_ < i_669_ ? 1 : 0;
		}
		return ((Class329) this).anInt3781 * 1070348131;
	}

	final void decodeTileMasks(RsByteBuffer stream, int plane, int x, int y, int xOffset, int yOffset, int i_674_, int i_675_, int i_676_, boolean overlay, int i_677_) {
		if (1 == i_676_)
			yOffset = 1;
		else if (2 == i_676_) {
			xOffset = 1;
			yOffset = 1;
		} else if (i_676_ == 3)
			xOffset = 1;
		if (x >= 0 && x < -1230013231 * maxX && y >= 0 && y < 2024737111 * maxY) {
			if (!overlayHidden && !overlay)
				regionMap.tileMasks[plane][x][y] = (byte) 0;
			for (;;) {
				int value = stream.readUnsignedByte();
				if (value == 0) {
					if (overlayHidden)
						unk0Data[0][xOffset + x][yOffset + y] = 0;
					else if (plane == 0)
						unk0Data[0][x + xOffset][yOffset + y] = (-Class92.method1560(i_674_ + 932731, i_675_ + 556238, 1995871883) * 8) << 2;
					else
						unk0Data[plane][x + xOffset][yOffset + y] = (unk0Data[plane - 1][xOffset + x][y + yOffset]) - 960;
					break;
				}
				if (value == 1) {
					int val1Hash = stream.readUnsignedByte();
					if (!overlayHidden) {
						if (val1Hash == 1)
							val1Hash = 0;
						if (0 == plane)
							unk0Data[0][x + xOffset][y + yOffset] = 8 * -val1Hash << 2;
						else
							unk0Data[plane][x + xOffset][yOffset + y] = ((unk0Data[plane - 1][x + xOffset][y + yOffset]) - (8 * val1Hash << 2));
					} else
						unk0Data[0][xOffset + x][y + yOffset] = 8 * val1Hash << 2;
					break;
				}
				if (value <= 49) {
					if (overlay)
						stream.readUnsignedByte();
					else {
						((Class329) this).overlayColors[plane][x][y] = stream.readByte();
						((Class329) this).val49ArrDiv4[plane][x][y] = (byte) ((value - 2) / 4);
						((Class329) this).val49ArrAnd0x3[plane][x][y] = (byte) (i_676_ + (value - 2) & 0x3);
					}
				} else if (value <= 81) {
					if (!overlayHidden && !overlay)
						regionMap.tileMasks[plane][x][y] = (byte) (value - 49);
				} 
				else if (!overlay)
					((Class329) this).underlayColors[plane][x][y] = (byte) (value - 81);
			}
		} else {
			for (;;) {
				int i_680_ = stream.readUnsignedByte();
				if (0 == i_680_)
					break;
				if (i_680_ == 1) {
					stream.readUnsignedByte();
					break;
				}
				if (i_680_ <= 49)
					stream.readUnsignedByte();
			}
		}
	}

	public final void method5890(int i, int i_954_, int i_955_, int i_956_, byte i_957_) {
		for (int i_958_ = 0; i_958_ < anInt3845 * 1599084401; i_958_++)
			method5838(i_958_, i, i_954_, i_955_, i_956_, -1337783095);
	}

	public void method5891(short i) {
		((Class329) this).anIntArray3795 = null;
		((Class329) this).anIntArray3796 = null;
		((Class329) this).anIntArray3797 = null;
		((Class329) this).anIntArray3798 = null;
		((Class329) this).anIntArray3799 = null;
		aBool3773 = false;
	}

	static final void method5901(CS2Executor class527, int i) {
		class527.intStackPtr -= 567564004;
		int i_1064_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_1065_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		int i_1066_ = (class527.intStack[1942118537 * class527.intStackPtr + 2]);
		int i_1067_ = (class527.intStack[3 + class527.intStackPtr * 1942118537]);
		EnumDefinitions class431 = IndexLoaders.ENUM_LOADER.method7424(i_1066_, (byte) 8);
		if (class431.aChar5146 != i_1064_ || class431.aChar5140 != i_1065_)
			throw new RuntimeException(new StringBuilder().append(i_1066_).append(" ").append(i_1067_).toString());
		if (115 == i_1065_)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class431.method7226(i_1067_, 870483820);
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = class431.method7232(i_1067_, -1848389937);
	}

	static final void method5902(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class527.aClass61_7010.aByte619;
	}

	public static void method5903(Class470 class470, Frame frame, int i) {
		class470.method7820((byte) 1);
		frame.setVisible(false);
		frame.dispose();
	}

	static final void method5904(CS2Executor class527, short i) {
		int i_1068_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (null == Class468_Sub8.aClass98Array7889[i_1068_])
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = (Class468_Sub8.aClass98Array7889[i_1068_].components).length;
	}

	static long method5905(SceneObject interface12, int i, int i_1069_, byte i_1070_) {
		long l = 4194304L;
		long l_1071_ = -9223372036854775808L;
		ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1495690632).getObjectDefinitions(interface12.getId(1049688189), 65280);
		long l_1072_ = (long) (i | i_1069_ << 7 | interface12.method89(1466657768) << 14 | interface12.method92(-524760179) << 20 | 0x40000000);
		if (0 == -348507379 * class478.anInt5652)
			l_1072_ |= l_1071_;
		if (1 == -1062790731 * class478.anInt5687)
			l_1072_ |= l;
		l_1072_ |= (long) interface12.getId(-1337355622) << 32;
		return l_1072_;
	}

	static void method5906(int i, int i_1073_) {
		Class282_Sub53_Sub2.anInt9630 = i * -1678093667;
		Class282_Sub53_Sub2.aClass282_Sub53_Sub2Array9633 = new Class282_Sub53_Sub2[i];
		Class279.anInt3370 = 0;
	}
}
