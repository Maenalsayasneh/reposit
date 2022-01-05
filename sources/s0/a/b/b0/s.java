package s0.a.b.b0;

import i0.d.a.a.a;
import s0.a.g.f;

public class s extends h {
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int[] i = new int[16];
    public int j;

    public s() {
        reset();
    }

    public s(s sVar) {
        super(sVar);
        j(sVar);
    }

    public f a() {
        return new s(this);
    }

    public void c(f fVar) {
        j((s) fVar);
    }

    public int doFinal(byte[] bArr, int i2) {
        e();
        p(this.d, bArr, i2);
        p(this.e, bArr, i2 + 4);
        p(this.f, bArr, i2 + 8);
        p(this.g, bArr, i2 + 12);
        p(this.h, bArr, i2 + 16);
        reset();
        return 20;
    }

    public void f() {
        int i2 = this.d;
        int i3 = this.e;
        int i4 = this.f;
        int i5 = this.g;
        int i6 = this.h;
        int Z0 = a.Z0(k(i3, i4, i5) + i2, this.i[0], this, 11, i6);
        int i7 = i(i4, 10);
        int Z02 = a.Z0(k(Z0, i3, i7) + i6, this.i[1], this, 14, i5);
        int i8 = i(i3, 10);
        int Z03 = a.Z0(k(Z02, Z0, i8) + i5, this.i[2], this, 15, i7);
        int i9 = i(Z0, 10);
        int Z04 = a.Z0(k(Z03, Z02, i9) + i7, this.i[3], this, 12, i8);
        int i10 = i(Z02, 10);
        int Z05 = a.Z0(k(Z04, Z03, i10) + i8, this.i[4], this, 5, i9);
        int i11 = i(Z03, 10);
        int Z06 = a.Z0(k(Z05, Z04, i11) + i9, this.i[5], this, 8, i10);
        int i12 = i(Z04, 10);
        int Z07 = a.Z0(k(Z06, Z05, i12) + i10, this.i[6], this, 7, i11);
        int i13 = i(Z05, 10);
        int Z08 = a.Z0(k(Z07, Z06, i13) + i11, this.i[7], this, 9, i12);
        int i14 = i(Z06, 10);
        int Z09 = a.Z0(k(Z08, Z07, i14) + i12, this.i[8], this, 11, i13);
        int i15 = i(Z07, 10);
        int Z010 = a.Z0(k(Z09, Z08, i15) + i13, this.i[9], this, 13, i14);
        int i16 = i(Z08, 10);
        int Z011 = a.Z0(k(Z010, Z09, i16) + i14, this.i[10], this, 14, i15);
        int i17 = i(Z09, 10);
        int Z012 = a.Z0(k(Z011, Z010, i17) + i15, this.i[11], this, 15, i16);
        int i18 = i(Z010, 10);
        int Z013 = a.Z0(k(Z012, Z011, i18) + i16, this.i[12], this, 6, i17);
        int i19 = i(Z011, 10);
        int Z014 = a.Z0(k(Z013, Z012, i19) + i17, this.i[13], this, 7, i18);
        int i20 = i(Z012, 10);
        int Z015 = a.Z0(k(Z014, Z013, i20) + i18, this.i[14], this, 9, i19);
        int i21 = i(Z013, 10);
        int Z016 = a.Z0(k(Z015, Z014, i21) + i19, this.i[15], this, 8, i20);
        int i22 = i(Z014, 10);
        int E0 = a.E0(i2 + o(i3, i4, i5), this.i[5], 1352829926, this, 8, i6);
        int i23 = i(i4, 10);
        int i24 = E0;
        int E02 = a.E0(o(E0, i3, i23) + i6, this.i[14], 1352829926, this, 9, i5);
        int i25 = i(i3, 10);
        int i26 = E02;
        int E03 = a.E0(o(E02, i24, i25) + i5, this.i[7], 1352829926, this, 9, i23);
        int i27 = i(i24, 10);
        int i28 = E03;
        int E04 = a.E0(o(E03, i26, i27) + i23, this.i[0], 1352829926, this, 11, i25);
        int i29 = i(i26, 10);
        int i30 = E04;
        int E05 = a.E0(o(E04, i28, i29) + i25, this.i[9], 1352829926, this, 13, i27);
        int i31 = i(i28, 10);
        int i32 = E05;
        int E06 = a.E0(o(E05, i30, i31) + i27, this.i[2], 1352829926, this, 15, i29);
        int i33 = i(i30, 10);
        int i34 = E06;
        int E07 = a.E0(o(E06, i32, i33) + i29, this.i[11], 1352829926, this, 15, i31);
        int i35 = i(i32, 10);
        int i36 = E07;
        int E08 = a.E0(o(E07, i34, i35) + i31, this.i[4], 1352829926, this, 5, i33);
        int i37 = i(i34, 10);
        int i38 = E08;
        int E09 = a.E0(o(E08, i36, i37) + i33, this.i[13], 1352829926, this, 7, i35);
        int i39 = i(i36, 10);
        int i40 = E09;
        int E010 = a.E0(o(E09, i38, i39) + i35, this.i[6], 1352829926, this, 7, i37);
        int i41 = i(i38, 10);
        int i42 = E010;
        int E011 = a.E0(o(E010, i40, i41) + i37, this.i[15], 1352829926, this, 8, i39);
        int i43 = i(i40, 10);
        int i44 = E011;
        int E012 = a.E0(o(E011, i42, i43) + i39, this.i[8], 1352829926, this, 11, i41);
        int i45 = i(i42, 10);
        int i46 = E012;
        int E013 = a.E0(o(E012, i44, i45) + i41, this.i[1], 1352829926, this, 14, i43);
        int i47 = i(i44, 10);
        int i48 = E013;
        int E014 = a.E0(o(E013, i46, i47) + i43, this.i[10], 1352829926, this, 14, i45);
        int i49 = i(i46, 10);
        int i50 = E014;
        int E015 = a.E0(o(E014, i48, i49) + i45, this.i[3], 1352829926, this, 12, i47);
        int i51 = i(i48, 10);
        int i52 = E015;
        int E016 = a.E0(o(E015, i50, i51) + i47, this.i[12], 1352829926, this, 6, i49);
        int i53 = i(i50, 10);
        int i54 = i22;
        int i55 = i54;
        int i56 = E016;
        int E017 = a.E0(l(Z016, Z015, i54) + i20, this.i[7], 1518500249, this, 7, i21);
        int i57 = i(Z015, 10);
        int i58 = E017;
        int E018 = a.E0(l(E017, Z016, i57) + i21, this.i[4], 1518500249, this, 6, i55);
        int i59 = i(Z016, 10);
        int i60 = E018;
        int E019 = a.E0(l(E018, i58, i59) + i55, this.i[13], 1518500249, this, 8, i57);
        int i61 = i(i58, 10);
        int i62 = i60;
        int i63 = E019;
        int E020 = a.E0(l(E019, i62, i61) + i57, this.i[1], 1518500249, this, 13, i59);
        int i64 = i(i62, 10);
        int i65 = E020;
        int E021 = a.E0(l(E020, i63, i64) + i59, this.i[10], 1518500249, this, 11, i61);
        int i66 = i(i63, 10);
        int i67 = E021;
        int E022 = a.E0(l(E021, i65, i66) + i61, this.i[6], 1518500249, this, 9, i64);
        int i68 = i(i65, 10);
        int i69 = E022;
        int E023 = a.E0(l(E022, i67, i68) + i64, this.i[15], 1518500249, this, 7, i66);
        int i70 = i(i67, 10);
        int i71 = E023;
        int E024 = a.E0(l(E023, i69, i70) + i66, this.i[3], 1518500249, this, 15, i68);
        int i72 = i(i69, 10);
        int i73 = E024;
        int E025 = a.E0(l(E024, i71, i72) + i68, this.i[12], 1518500249, this, 7, i70);
        int i74 = i(i71, 10);
        int i75 = E025;
        int E026 = a.E0(l(E025, i73, i74) + i70, this.i[0], 1518500249, this, 12, i72);
        int i76 = i(i73, 10);
        int i77 = E026;
        int E027 = a.E0(l(E026, i75, i76) + i72, this.i[9], 1518500249, this, 15, i74);
        int i78 = i(i75, 10);
        int i79 = E027;
        int E028 = a.E0(l(E027, i77, i78) + i74, this.i[5], 1518500249, this, 9, i76);
        int i80 = i(i77, 10);
        int i81 = E028;
        int E029 = a.E0(l(E028, i79, i80) + i76, this.i[2], 1518500249, this, 11, i78);
        int i82 = i(i79, 10);
        int i83 = E029;
        int E030 = a.E0(l(E029, i81, i82) + i78, this.i[14], 1518500249, this, 7, i80);
        int i84 = i(i81, 10);
        int i85 = E030;
        int E031 = a.E0(l(E030, i83, i84) + i80, this.i[11], 1518500249, this, 13, i82);
        int i86 = i(i83, 10);
        int i87 = E031;
        int E032 = a.E0(l(E031, i85, i86) + i82, this.i[8], 1518500249, this, 12, i84);
        int i88 = i(i85, 10);
        int i89 = E032;
        int E033 = a.E0(n(i56, i52, i53) + i49, this.i[6], 1548603684, this, 9, i51);
        int i90 = i(i52, 10);
        int i91 = E033;
        int E034 = a.E0(n(E033, i56, i90) + i51, this.i[11], 1548603684, this, 13, i53);
        int i92 = i(i56, 10);
        int i93 = E034;
        int E035 = a.E0(n(E034, i91, i92) + i53, this.i[3], 1548603684, this, 15, i90);
        int i94 = i(i91, 10);
        int i95 = E035;
        int E036 = a.E0(n(E035, i93, i94) + i90, this.i[7], 1548603684, this, 7, i92);
        int i96 = i(i93, 10);
        int i97 = E036;
        int E037 = a.E0(n(E036, i95, i96) + i92, this.i[0], 1548603684, this, 12, i94);
        int i98 = i(i95, 10);
        int i99 = E037;
        int E038 = a.E0(n(E037, i97, i98) + i94, this.i[13], 1548603684, this, 8, i96);
        int i100 = i(i97, 10);
        int i101 = E038;
        int E039 = a.E0(n(E038, i99, i100) + i96, this.i[5], 1548603684, this, 9, i98);
        int i102 = i(i99, 10);
        int i103 = E039;
        int E040 = a.E0(n(E039, i101, i102) + i98, this.i[10], 1548603684, this, 11, i100);
        int i104 = i(i101, 10);
        int i105 = E040;
        int E041 = a.E0(n(E040, i103, i104) + i100, this.i[14], 1548603684, this, 7, i102);
        int i106 = i(i103, 10);
        int i107 = E041;
        int E042 = a.E0(n(E041, i105, i106) + i102, this.i[15], 1548603684, this, 7, i104);
        int i108 = i(i105, 10);
        int E043 = a.E0(n(E042, i107, i108) + i104, this.i[8], 1548603684, this, 12, i106);
        int i109 = i(i107, 10);
        int i110 = E043;
        int E044 = a.E0(n(E043, E042, i109) + i106, this.i[12], 1548603684, this, 7, i108);
        int i111 = i(E042, 10);
        int E045 = a.E0(n(E044, i110, i111) + i108, this.i[4], 1548603684, this, 6, i109);
        int i112 = i(i110, 10);
        int E046 = a.E0(n(E045, E044, i112) + i109, this.i[9], 1548603684, this, 15, i111);
        int i113 = i(E044, 10);
        int E047 = a.E0(n(E046, E045, i113) + i111, this.i[1], 1548603684, this, 13, i112);
        int i114 = i(E045, 10);
        int E048 = a.E0(n(E047, E046, i114) + i112, this.i[2], 1548603684, this, 11, i113);
        int i115 = i(E046, 10);
        int i116 = i89;
        int i117 = i116;
        int i118 = E048;
        int E049 = a.E0(m(i116, i87, i88) + i84, this.i[3], 1859775393, this, 11, i86);
        int i119 = i(i87, 10);
        int i120 = E049;
        int E050 = a.E0(m(E049, i117, i119) + i86, this.i[10], 1859775393, this, 13, i88);
        int i121 = i(i117, 10);
        int i122 = E050;
        int E051 = a.E0(m(E050, i120, i121) + i88, this.i[14], 1859775393, this, 6, i119);
        int i123 = i(i120, 10);
        int i124 = E051;
        int E052 = a.E0(m(E051, i122, i123) + i119, this.i[4], 1859775393, this, 7, i121);
        int i125 = i(i122, 10);
        int i126 = E052;
        int E053 = a.E0(m(E052, i124, i125) + i121, this.i[9], 1859775393, this, 14, i123);
        int i127 = i(i124, 10);
        int i128 = E053;
        int E054 = a.E0(m(E053, i126, i127) + i123, this.i[15], 1859775393, this, 9, i125);
        int i129 = i(i126, 10);
        int i130 = E054;
        int E055 = a.E0(m(E054, i128, i129) + i125, this.i[8], 1859775393, this, 13, i127);
        int i131 = i(i128, 10);
        int i132 = E055;
        int E056 = a.E0(m(E055, i130, i131) + i127, this.i[1], 1859775393, this, 15, i129);
        int i133 = i(i130, 10);
        int i134 = E056;
        int E057 = a.E0(m(E056, i132, i133) + i129, this.i[2], 1859775393, this, 14, i131);
        int i135 = i(i132, 10);
        int i136 = E057;
        int E058 = a.E0(m(E057, i134, i135) + i131, this.i[7], 1859775393, this, 8, i133);
        int i137 = i(i134, 10);
        int i138 = E058;
        int E059 = a.E0(m(E058, i136, i137) + i133, this.i[0], 1859775393, this, 13, i135);
        int i139 = i(i136, 10);
        int i140 = E059;
        int E060 = a.E0(m(E059, i138, i139) + i135, this.i[6], 1859775393, this, 6, i137);
        int i141 = i(i138, 10);
        int i142 = E060;
        int E061 = a.E0(m(E060, i140, i141) + i137, this.i[13], 1859775393, this, 5, i139);
        int i143 = i(i140, 10);
        int i144 = E061;
        int E062 = a.E0(m(E061, i142, i143) + i139, this.i[11], 1859775393, this, 12, i141);
        int i145 = i(i142, 10);
        int i146 = E062;
        int E063 = a.E0(m(E062, i144, i145) + i141, this.i[5], 1859775393, this, 7, i143);
        int i147 = i(i144, 10);
        int i148 = E063;
        int E064 = a.E0(m(E063, i146, i147) + i143, this.i[12], 1859775393, this, 5, i145);
        int i149 = i(i146, 10);
        int i150 = E064;
        int E065 = a.E0(m(i118, E047, i115) + i113, this.i[15], 1836072691, this, 9, i114);
        int i151 = i(E047, 10);
        int i152 = E065;
        int E066 = a.E0(m(E065, i118, i151) + i114, this.i[5], 1836072691, this, 7, i115);
        int i153 = i(i118, 10);
        int i154 = E066;
        int E067 = a.E0(m(E066, i152, i153) + i115, this.i[1], 1836072691, this, 15, i151);
        int i155 = i(i152, 10);
        int i156 = E067;
        int E068 = a.E0(m(E067, i154, i155) + i151, this.i[3], 1836072691, this, 11, i153);
        int i157 = i(i154, 10);
        int i158 = E068;
        int E069 = a.E0(m(E068, i156, i157) + i153, this.i[7], 1836072691, this, 8, i155);
        int i159 = i(i156, 10);
        int i160 = E069;
        int E070 = a.E0(m(E069, i158, i159) + i155, this.i[14], 1836072691, this, 6, i157);
        int i161 = i(i158, 10);
        int i162 = E070;
        int E071 = a.E0(m(E070, i160, i161) + i157, this.i[6], 1836072691, this, 6, i159);
        int i163 = i(i160, 10);
        int E072 = a.E0(m(E071, i162, i163) + i159, this.i[9], 1836072691, this, 14, i161);
        int i164 = i(i162, 10);
        int E073 = a.E0(m(E072, E071, i164) + i161, this.i[11], 1836072691, this, 12, i163);
        int i165 = i(E071, 10);
        int E074 = a.E0(m(E073, E072, i165) + i163, this.i[8], 1836072691, this, 13, i164);
        int i166 = i(E072, 10);
        int E075 = a.E0(m(E074, E073, i166) + i164, this.i[12], 1836072691, this, 5, i165);
        int i167 = i(E073, 10);
        int E076 = a.E0(m(E075, E074, i167) + i165, this.i[2], 1836072691, this, 14, i166);
        int i168 = i(E074, 10);
        int E077 = a.E0(m(E076, E075, i168) + i166, this.i[10], 1836072691, this, 13, i167);
        int i169 = i(E075, 10);
        int i170 = E077;
        int E078 = a.E0(m(E077, E076, i169) + i167, this.i[0], 1836072691, this, 13, i168);
        int i171 = i(E076, 10);
        int E079 = a.E0(m(E078, i170, i171) + i168, this.i[4], 1836072691, this, 7, i169);
        int i172 = i(i170, 10);
        int E080 = a.E0(m(E079, E078, i172) + i169, this.i[13], 1836072691, this, 5, i171);
        int i173 = i(E078, 10);
        int i174 = i150;
        int i175 = i174;
        int E081 = a.E0(n(i174, i148, i149) + i145, this.i[1], -1894007588, this, 11, i147);
        int i176 = i(i148, 10);
        int i177 = E081;
        int E082 = a.E0(n(E081, i175, i176) + i147, this.i[9], -1894007588, this, 12, i149);
        int i178 = i(i175, 10);
        int i179 = E082;
        int E083 = a.E0(n(E082, i177, i178) + i149, this.i[11], -1894007588, this, 14, i176);
        int i180 = i(i177, 10);
        int i181 = E083;
        int E084 = a.E0(n(E083, i179, i180) + i176, this.i[10], -1894007588, this, 15, i178);
        int i182 = i(i179, 10);
        int i183 = E084;
        int E085 = a.E0(n(E084, i181, i182) + i178, this.i[0], -1894007588, this, 14, i180);
        int i184 = i(i181, 10);
        int i185 = E085;
        int E086 = a.E0(n(E085, i183, i184) + i180, this.i[8], -1894007588, this, 15, i182);
        int i186 = i(i183, 10);
        int i187 = E086;
        int E087 = a.E0(n(E086, i185, i186) + i182, this.i[12], -1894007588, this, 9, i184);
        int i188 = i(i185, 10);
        int i189 = E087;
        int E088 = a.E0(n(E087, i187, i188) + i184, this.i[4], -1894007588, this, 8, i186);
        int i190 = i(i187, 10);
        int i191 = E088;
        int E089 = a.E0(n(E088, i189, i190) + i186, this.i[13], -1894007588, this, 9, i188);
        int i192 = i(i189, 10);
        int i193 = E089;
        int E090 = a.E0(n(E089, i191, i192) + i188, this.i[3], -1894007588, this, 14, i190);
        int i194 = i(i191, 10);
        int i195 = E090;
        int E091 = a.E0(n(E090, i193, i194) + i190, this.i[7], -1894007588, this, 5, i192);
        int i196 = i(i193, 10);
        int i197 = E091;
        int E092 = a.E0(n(E091, i195, i196) + i192, this.i[15], -1894007588, this, 6, i194);
        int i198 = i(i195, 10);
        int i199 = E092;
        int E093 = a.E0(n(E092, i197, i198) + i194, this.i[14], -1894007588, this, 8, i196);
        int i200 = i(i197, 10);
        int i201 = E093;
        int E094 = a.E0(n(E093, i199, i200) + i196, this.i[5], -1894007588, this, 6, i198);
        int i202 = i(i199, 10);
        int i203 = E094;
        int E095 = a.E0(n(E094, i201, i202) + i198, this.i[6], -1894007588, this, 5, i200);
        int i204 = i(i201, 10);
        int i205 = E095;
        int E096 = a.E0(n(E095, i203, i204) + i200, this.i[2], -1894007588, this, 12, i202);
        int i206 = i(i203, 10);
        int i207 = E096;
        int E097 = a.E0(l(E080, E079, i173) + i171, this.i[8], 2053994217, this, 15, i172);
        int i208 = i(E079, 10);
        int i209 = E097;
        int E098 = a.E0(l(E097, E080, i208) + i172, this.i[6], 2053994217, this, 5, i173);
        int i210 = i(E080, 10);
        int i211 = E098;
        int E099 = a.E0(l(E098, i209, i210) + i173, this.i[4], 2053994217, this, 8, i208);
        int i212 = i(i209, 10);
        int i213 = E099;
        int E0100 = a.E0(l(E099, i211, i212) + i208, this.i[1], 2053994217, this, 11, i210);
        int i214 = i(i211, 10);
        int i215 = E0100;
        int E0101 = a.E0(l(E0100, i213, i214) + i210, this.i[3], 2053994217, this, 14, i212);
        int i216 = i(i213, 10);
        int i217 = E0101;
        int E0102 = a.E0(l(E0101, i215, i216) + i212, this.i[11], 2053994217, this, 14, i214);
        int i218 = i(i215, 10);
        int i219 = E0102;
        int E0103 = a.E0(l(E0102, i217, i218) + i214, this.i[15], 2053994217, this, 6, i216);
        int i220 = i(i217, 10);
        int i221 = E0103;
        int E0104 = a.E0(l(E0103, i219, i220) + i216, this.i[0], 2053994217, this, 14, i218);
        int i222 = i(i219, 10);
        int i223 = E0104;
        int E0105 = a.E0(l(E0104, i221, i222) + i218, this.i[5], 2053994217, this, 6, i220);
        int i224 = i(i221, 10);
        int i225 = E0105;
        int E0106 = a.E0(l(E0105, i223, i224) + i220, this.i[12], 2053994217, this, 9, i222);
        int i226 = i(i223, 10);
        int i227 = E0106;
        int E0107 = a.E0(l(E0106, i225, i226) + i222, this.i[2], 2053994217, this, 12, i224);
        int i228 = i(i225, 10);
        int i229 = E0107;
        int E0108 = a.E0(l(E0107, i227, i228) + i224, this.i[13], 2053994217, this, 9, i226);
        int i230 = i(i227, 10);
        int i231 = E0108;
        int E0109 = a.E0(l(E0108, i229, i230) + i226, this.i[9], 2053994217, this, 12, i228);
        int i232 = i(i229, 10);
        int E0110 = a.E0(l(E0109, i231, i232) + i228, this.i[7], 2053994217, this, 5, i230);
        int i233 = i(i231, 10);
        int E0111 = a.E0(l(E0110, E0109, i233) + i230, this.i[10], 2053994217, this, 15, i232);
        int i234 = i(E0109, 10);
        int i235 = E0111;
        int E0112 = a.E0(l(E0111, E0110, i234) + i232, this.i[14], 2053994217, this, 8, i233);
        int i236 = i(E0110, 10);
        int i237 = i207;
        int i238 = i237;
        int E0113 = a.E0(o(i237, i205, i206) + i202, this.i[4], -1454113458, this, 9, i204);
        int i239 = i(i205, 10);
        int i240 = E0113;
        int E0114 = a.E0(o(E0113, i238, i239) + i204, this.i[0], -1454113458, this, 15, i206);
        int i241 = i(i238, 10);
        int i242 = E0114;
        int E0115 = a.E0(o(E0114, i240, i241) + i206, this.i[5], -1454113458, this, 5, i239);
        int i243 = i(i240, 10);
        int i244 = E0115;
        int E0116 = a.E0(o(E0115, i242, i243) + i239, this.i[9], -1454113458, this, 11, i241);
        int i245 = i(i242, 10);
        int i246 = E0116;
        int E0117 = a.E0(o(E0116, i244, i245) + i241, this.i[7], -1454113458, this, 6, i243);
        int i247 = i(i244, 10);
        int i248 = E0117;
        int E0118 = a.E0(o(E0117, i246, i247) + i243, this.i[12], -1454113458, this, 8, i245);
        int i249 = i(i246, 10);
        int i250 = E0118;
        int E0119 = a.E0(o(E0118, i248, i249) + i245, this.i[2], -1454113458, this, 13, i247);
        int i251 = i(i248, 10);
        int i252 = E0119;
        int E0120 = a.E0(o(E0119, i250, i251) + i247, this.i[10], -1454113458, this, 12, i249);
        int i253 = i(i250, 10);
        int i254 = E0120;
        int E0121 = a.E0(o(E0120, i252, i253) + i249, this.i[14], -1454113458, this, 5, i251);
        int i255 = i(i252, 10);
        int i256 = E0121;
        int E0122 = a.E0(o(E0121, i254, i255) + i251, this.i[1], -1454113458, this, 12, i253);
        int i257 = i(i254, 10);
        int i258 = E0122;
        int E0123 = a.E0(o(E0122, i256, i257) + i253, this.i[3], -1454113458, this, 13, i255);
        int i259 = i(i256, 10);
        int i260 = E0123;
        int E0124 = a.E0(o(E0123, i258, i259) + i255, this.i[8], -1454113458, this, 14, i257);
        int i261 = i(i258, 10);
        int i262 = E0124;
        int E0125 = a.E0(o(E0124, i260, i261) + i257, this.i[11], -1454113458, this, 11, i259);
        int i263 = i(i260, 10);
        int i264 = E0125;
        int E0126 = a.E0(o(E0125, i262, i263) + i259, this.i[6], -1454113458, this, 8, i261);
        int i265 = i(i262, 10);
        int i266 = E0126;
        int E0127 = a.E0(o(E0126, i264, i265) + i261, this.i[15], -1454113458, this, 5, i263);
        int i267 = i(i264, 10);
        int i268 = E0127;
        int E0128 = a.E0(o(E0127, i266, i267) + i263, this.i[13], -1454113458, this, 6, i265);
        int i269 = i(i266, 10);
        int Z017 = a.Z0(k(E0112, i235, i236) + i233, this.i[12], this, 8, i234);
        int i270 = i(i235, 10);
        int Z018 = a.Z0(k(Z017, E0112, i270) + i234, this.i[15], this, 5, i236);
        int i271 = i(E0112, 10);
        int Z019 = a.Z0(k(Z018, Z017, i271) + i236, this.i[10], this, 12, i270);
        int i272 = i(Z017, 10);
        int Z020 = a.Z0(k(Z019, Z018, i272) + i270, this.i[4], this, 9, i271);
        int i273 = i(Z018, 10);
        int Z021 = a.Z0(k(Z020, Z019, i273) + i271, this.i[1], this, 12, i272);
        int i274 = i(Z019, 10);
        int Z022 = a.Z0(k(Z021, Z020, i274) + i272, this.i[5], this, 5, i273);
        int i275 = i(Z020, 10);
        int Z023 = a.Z0(k(Z022, Z021, i275) + i273, this.i[8], this, 14, i274);
        int i276 = i(Z021, 10);
        int Z024 = a.Z0(k(Z023, Z022, i276) + i274, this.i[7], this, 6, i275);
        int i277 = i(Z022, 10);
        int Z025 = a.Z0(k(Z024, Z023, i277) + i275, this.i[6], this, 8, i276);
        int i278 = i(Z023, 10);
        int Z026 = a.Z0(k(Z025, Z024, i278) + i276, this.i[2], this, 13, i277);
        int i279 = i(Z024, 10);
        int Z027 = a.Z0(k(Z026, Z025, i279) + i277, this.i[13], this, 6, i278);
        int i280 = i(Z025, 10);
        int Z028 = a.Z0(k(Z027, Z026, i280) + i278, this.i[14], this, 5, i279);
        int i281 = i(Z026, 10);
        int Z029 = a.Z0(k(Z028, Z027, i281) + i279, this.i[0], this, 15, i280);
        int i282 = i(Z027, 10);
        int Z030 = a.Z0(k(Z029, Z028, i282) + i280, this.i[3], this, 13, i281);
        int i283 = i(Z028, 10);
        int Z031 = a.Z0(k(Z030, Z029, i283) + i281, this.i[9], this, 11, i282);
        int i284 = i(Z029, 10);
        int Z032 = a.Z0(k(Z031, Z030, i284) + i282, this.i[11], this, 11, i283);
        int i285 = this.e + i268 + i(Z030, 10);
        this.e = this.f + i269 + i284;
        this.f = this.g + i267 + i283;
        this.g = this.h + i265 + Z032;
        this.h = this.d + E0128 + Z031;
        this.d = i285;
        this.j = 0;
        int i286 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i286 != iArr.length) {
                iArr[i286] = 0;
                i286++;
            } else {
                return;
            }
        }
    }

    public void g(long j2) {
        if (this.j > 14) {
            f();
        }
        int[] iArr = this.i;
        iArr[14] = (int) (-1 & j2);
        iArr[15] = (int) (j2 >>> 32);
    }

    public String getAlgorithmName() {
        return "RIPEMD160";
    }

    public int getDigestSize() {
        return 20;
    }

    public void h(byte[] bArr, int i2) {
        int[] iArr = this.i;
        int i3 = this.j;
        int i4 = i3 + 1;
        this.j = i4;
        iArr[i3] = ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        if (i4 == 16) {
            f();
        }
    }

    public final int i(int i2, int i3) {
        return (i2 >>> (32 - i3)) | (i2 << i3);
    }

    public final void j(s sVar) {
        d(sVar);
        this.d = sVar.d;
        this.e = sVar.e;
        this.f = sVar.f;
        this.g = sVar.g;
        this.h = sVar.h;
        int[] iArr = sVar.i;
        System.arraycopy(iArr, 0, this.i, 0, iArr.length);
        this.j = sVar.j;
    }

    public final int k(int i2, int i3, int i4) {
        return (i2 ^ i3) ^ i4;
    }

    public final int l(int i2, int i3, int i4) {
        return ((~i2) & i4) | (i3 & i2);
    }

    public final int m(int i2, int i3, int i4) {
        return (i2 | (~i3)) ^ i4;
    }

    public final int n(int i2, int i3, int i4) {
        return (i2 & i4) | (i3 & (~i4));
    }

    public final int o(int i2, int i3, int i4) {
        return i2 ^ (i3 | (~i4));
    }

    public final void p(int i2, byte[] bArr, int i3) {
        bArr[i3] = (byte) i2;
        bArr[i3 + 1] = (byte) (i2 >>> 8);
        bArr[i3 + 2] = (byte) (i2 >>> 16);
        bArr[i3 + 3] = (byte) (i2 >>> 24);
    }

    public void reset() {
        super.reset();
        this.d = 1732584193;
        this.e = -271733879;
        this.f = -1732584194;
        this.g = 271733878;
        this.h = -1009589776;
        this.j = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.i;
            if (i2 != iArr.length) {
                iArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }
}
