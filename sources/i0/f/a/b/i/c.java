package i0.f.a.b.i;

/* compiled from: JsonStringEncoder */
public final class c {
    public static final char[] a = ((char[]) a.a.clone());
    public static final c b = new c();

    static {
        a.b.clone();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r14 >= 0) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        r10[1] = 'u';
        r11 = a;
        r10[4] = r11[r7 >> 4];
        r10[5] = r11[r7 & 15];
        r11 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r10[1] = (char) r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        r7 = r9 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r7 <= r1.length) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r7 = r1.length - r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r7 <= 0) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        java.lang.System.arraycopy(r10, 0, r1, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r8 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r8 = new i0.f.a.b.m.i((i0.f.a.b.m.a) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        r1 = r8.l();
        r11 = r11 - r7;
        java.lang.System.arraycopy(r10, r7, r1, 0, r11);
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        java.lang.System.arraycopy(r10, 0, r1, r9, r11);
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r10 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r10 = new char[6];
        r10[0] = '\\';
        r10[2] = '0';
        r10[3] = '0';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r13 = r7 + 1;
        r7 = r0.charAt(r7);
        r14 = r2[r7];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] a(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r17
            r1 = 120(0x78, float:1.68E-43)
            char[] r1 = new char[r1]
            int[] r2 = i0.f.a.b.i.a.h
            int r3 = r2.length
            int r4 = r17.length()
            r5 = 0
            r6 = 0
            r8 = r5
            r10 = r8
            r7 = r6
            r9 = r7
        L_0x0013:
            if (r7 >= r4) goto L_0x008f
        L_0x0015:
            char r11 = r0.charAt(r7)
            if (r11 >= r3) goto L_0x0077
            r12 = r2[r11]
            if (r12 == 0) goto L_0x0077
            r11 = 2
            r12 = 6
            if (r10 != 0) goto L_0x0030
            char[] r10 = new char[r12]
            r13 = 92
            r10[r6] = r13
            r13 = 48
            r10[r11] = r13
            r14 = 3
            r10[r14] = r13
        L_0x0030:
            int r13 = r7 + 1
            char r7 = r0.charAt(r7)
            r14 = r2[r7]
            r15 = 1
            if (r14 >= 0) goto L_0x0051
            r11 = 117(0x75, float:1.64E-43)
            r10[r15] = r11
            char[] r11 = a
            int r14 = r7 >> 4
            char r14 = r11[r14]
            r15 = 4
            r10[r15] = r14
            r7 = r7 & 15
            char r7 = r11[r7]
            r11 = 5
            r10[r11] = r7
            r11 = r12
            goto L_0x0054
        L_0x0051:
            char r7 = (char) r14
            r10[r15] = r7
        L_0x0054:
            int r7 = r9 + r11
            int r12 = r1.length
            if (r7 <= r12) goto L_0x0071
            int r7 = r1.length
            int r7 = r7 - r9
            if (r7 <= 0) goto L_0x0060
            java.lang.System.arraycopy(r10, r6, r1, r9, r7)
        L_0x0060:
            if (r8 != 0) goto L_0x0067
            i0.f.a.b.m.i r8 = new i0.f.a.b.m.i
            r8.<init>(r5, r1)
        L_0x0067:
            char[] r1 = r8.l()
            int r11 = r11 - r7
            java.lang.System.arraycopy(r10, r7, r1, r6, r11)
            r9 = r11
            goto L_0x0075
        L_0x0071:
            java.lang.System.arraycopy(r10, r6, r1, r9, r11)
            r9 = r7
        L_0x0075:
            r7 = r13
            goto L_0x0013
        L_0x0077:
            int r12 = r1.length
            if (r9 < r12) goto L_0x0086
            if (r8 != 0) goto L_0x0081
            i0.f.a.b.m.i r8 = new i0.f.a.b.m.i
            r8.<init>(r5, r1)
        L_0x0081:
            char[] r1 = r8.l()
            r9 = r6
        L_0x0086:
            int r12 = r9 + 1
            r1[r9] = r11
            int r7 = r7 + 1
            r9 = r12
            if (r7 < r4) goto L_0x0015
        L_0x008f:
            if (r8 != 0) goto L_0x0096
            char[] r0 = java.util.Arrays.copyOfRange(r1, r6, r9)
            return r0
        L_0x0096:
            r8.j = r9
            char[] r0 = r8.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.b.i.c.a(java.lang.String):char[]");
    }
}
