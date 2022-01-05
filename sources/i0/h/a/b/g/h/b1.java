package i0.h.a.b.g.h;

import com.google.android.gms.internal.recaptcha.zzct;
import i0.d.a.a.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class b1<T> implements j1<T> {
    public static final int[] a = new int[0];
    public static final Unsafe b = d2.j();
    public final int[] c;
    public final Object[] d;
    public final y0 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final c1 j;
    public final k0 k;
    public final x1<?, ?> l;
    public final u<?> m;
    public final s0 n;

    public b1(int[] iArr, Object[] objArr, int i2, int i3, y0 y0Var, boolean z, int[] iArr2, int i4, int i5, c1 c1Var, k0 k0Var, x1 x1Var, u uVar, s0 s0Var) {
        this.c = iArr;
        this.d = objArr;
        boolean z2 = y0Var instanceof z;
        this.f = uVar != null && uVar.b(y0Var);
        this.g = iArr2;
        this.h = i4;
        this.i = i5;
        this.j = c1Var;
        this.k = k0Var;
        this.l = x1Var;
        this.m = uVar;
        this.e = y0Var;
        this.n = s0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> i0.h.a.b.g.h.b1 f(i0.h.a.b.g.h.w0 r35, i0.h.a.b.g.h.c1 r36, i0.h.a.b.g.h.k0 r37, i0.h.a.b.g.h.x1 r38, i0.h.a.b.g.h.u r39, i0.h.a.b.g.h.s0 r40) {
        /*
            r0 = r35
            boolean r1 = r0 instanceof i0.h.a.b.g.h.h1
            if (r1 == 0) goto L_0x0426
            i0.h.a.b.g.h.h1 r0 = (i0.h.a.b.g.h.h1) r0
            int r1 = r0.d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x0011
            r1 = r2
            goto L_0x0012
        L_0x0011:
            r1 = r3
        L_0x0012:
            r4 = 0
            if (r1 != r3) goto L_0x0017
            r11 = r2
            goto L_0x0018
        L_0x0017:
            r11 = r4
        L_0x0018:
            java.lang.String r1 = r0.b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0032
            r5 = r2
        L_0x0028:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0033
            r5 = r7
            goto L_0x0028
        L_0x0032:
            r7 = r2
        L_0x0033:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003f:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003f
        L_0x004f:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0052:
            if (r7 != 0) goto L_0x005f
            int[] r7 = a
            r9 = r4
            r10 = r9
            r12 = r10
            r14 = r12
            r15 = r14
            r13 = r7
            r7 = r15
            goto L_0x0170
        L_0x005f:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006b:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007b
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006b
        L_0x007b:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007e:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009d
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x008a:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x009a
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x008a
        L_0x009a:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009d:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bc
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a9:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a9
        L_0x00b9:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bc:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00db
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c8:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d8
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c8
        L_0x00d8:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00db:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00fa
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e7:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f7
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e7
        L_0x00f7:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fa:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011b
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0106:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0117
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0106
        L_0x0117:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011b:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0127:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0139
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0127
        L_0x0139:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013e:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0163
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x014c:
            int r17 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x015e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x014c
        L_0x015e:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x0163:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x0170:
            sun.misc.Unsafe r8 = b
            java.lang.Object[] r6 = r0.c
            i0.h.a.b.g.h.y0 r2 = r0.a
            java.lang.Class r2 = r2.getClass()
            r19 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            r18 = 1
            int r12 = r12 << 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r20 = r15 + r7
            r22 = r15
            r7 = r19
            r23 = r20
            r19 = 0
            r21 = 0
        L_0x0192:
            if (r7 >= r3) goto L_0x03f9
            int r24 = r7 + 1
            char r7 = r1.charAt(r7)
            r25 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01c6
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x01a7:
            int r26 = r3 + 1
            char r3 = r1.charAt(r3)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01c0
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r7 = r7 | r3
            int r24 = r24 + 13
            r3 = r26
            r15 = r27
            goto L_0x01a7
        L_0x01c0:
            int r3 = r3 << r24
            r7 = r7 | r3
            r3 = r26
            goto L_0x01ca
        L_0x01c6:
            r27 = r15
            r3 = r24
        L_0x01ca:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r24 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01fc
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r24
            r24 = 13
        L_0x01dd:
            int r26 = r15 + 1
            char r15 = r1.charAt(r15)
            r28 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01f6
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r24
            r3 = r3 | r10
            int r24 = r24 + 13
            r15 = r26
            r10 = r28
            goto L_0x01dd
        L_0x01f6:
            int r10 = r15 << r24
            r3 = r3 | r10
            r15 = r26
            goto L_0x0200
        L_0x01fc:
            r28 = r10
            r15 = r24
        L_0x0200:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r24 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x020e
            int r9 = r19 + 1
            r13[r19] = r21
            r19 = r9
        L_0x020e:
            r9 = 51
            if (r10 < r9) goto L_0x02bc
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r26 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0246
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r26
            r26 = r15
            r15 = r34
        L_0x0229:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x023f
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r26 = r26 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0229
        L_0x023f:
            int r9 = r15 << r32
            r15 = r26 | r9
            r9 = r33
            goto L_0x0248
        L_0x0246:
            r9 = r26
        L_0x0248:
            r26 = r9
            int r9 = r10 + -51
            r32 = r0
            r0 = 9
            if (r9 == r0) goto L_0x026b
            r0 = 17
            if (r9 != r0) goto L_0x0257
            goto L_0x026b
        L_0x0257:
            r0 = 12
            if (r9 != r0) goto L_0x0269
            if (r11 != 0) goto L_0x0269
            int r0 = r21 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r9 = r14 + 1
            r14 = r6[r14]
            r12[r0] = r14
            r14 = r9
        L_0x0269:
            r9 = 1
            goto L_0x0278
        L_0x026b:
            int r0 = r21 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r18 = r14 + 1
            r14 = r6[r14]
            r12[r0] = r14
            r14 = r18
        L_0x0278:
            int r0 = r15 << 1
            r9 = r6[r0]
            boolean r15 = r9 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0283
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x028b
        L_0x0283:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = h(r2, r9)
            r6[r0] = r9
        L_0x028b:
            r29 = r14
            long r14 = r8.objectFieldOffset(r9)
            int r9 = (int) r14
            int r0 = r0 + 1
            r14 = r6[r0]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x029d
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x02a5
        L_0x029d:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = h(r2, r14)
            r6[r0] = r14
        L_0x02a5:
            long r14 = r8.objectFieldOffset(r14)
            int r0 = (int) r14
            r30 = r1
            r14 = r11
            r15 = r26
            r31 = r29
            r17 = 1
            r1 = r0
            r29 = r12
            r0 = 55296(0xd800, float:7.7486E-41)
            r12 = 0
            goto L_0x03c1
        L_0x02bc:
            r32 = r0
            int r0 = r14 + 1
            r9 = r6[r14]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = h(r2, r9)
            r14 = 9
            if (r10 == r14) goto L_0x0336
            r14 = 17
            if (r10 != r14) goto L_0x02d2
            goto L_0x0336
        L_0x02d2:
            r14 = 27
            if (r10 == r14) goto L_0x0325
            r14 = 49
            if (r10 != r14) goto L_0x02db
            goto L_0x0325
        L_0x02db:
            r14 = 12
            if (r10 == r14) goto L_0x0311
            r14 = 30
            if (r10 == r14) goto L_0x0311
            r14 = 44
            if (r10 != r14) goto L_0x02e8
            goto L_0x0311
        L_0x02e8:
            r14 = 50
            if (r10 != r14) goto L_0x0344
            int r14 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            r18 = 1
            int r22 = r22 << 1
            int r29 = r0 + 1
            r0 = r6[r0]
            r12[r22] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x030e
            int r22 = r22 + 1
            int r0 = r29 + 1
            r29 = r6[r29]
            r12[r22] = r29
            r29 = r12
            r22 = r14
            r14 = r11
            goto L_0x0347
        L_0x030e:
            r22 = r14
            goto L_0x0333
        L_0x0311:
            if (r11 != 0) goto L_0x0322
            int r14 = r21 / 3
            r18 = 1
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r29 = r0 + 1
            r0 = r6[r0]
            r12[r14] = r0
            goto L_0x0333
        L_0x0322:
            r18 = 1
            goto L_0x0344
        L_0x0325:
            r18 = 1
            int r14 = r21 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r29 = r0 + 1
            r0 = r6[r0]
            r12[r14] = r0
        L_0x0333:
            r0 = r29
            goto L_0x0344
        L_0x0336:
            r18 = 1
            int r14 = r21 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            java.lang.Class r29 = r9.getType()
            r12[r14] = r29
        L_0x0344:
            r14 = r11
            r29 = r12
        L_0x0347:
            long r11 = r8.objectFieldOffset(r9)
            int r9 = (int) r11
            r11 = r3 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 != r12) goto L_0x03a6
            r11 = 17
            if (r10 > r11) goto L_0x03a6
            int r11 = r15 + 1
            char r12 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r15) goto L_0x037c
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
        L_0x0365:
            int r30 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r15) goto L_0x0377
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r17
            r12 = r12 | r11
            int r17 = r17 + 13
            r11 = r30
            goto L_0x0365
        L_0x0377:
            int r11 = r11 << r17
            r12 = r12 | r11
            r11 = r30
        L_0x037c:
            r17 = 1
            int r18 = r4 << 1
            int r30 = r12 / 32
            int r30 = r30 + r18
            r15 = r6[r30]
            r31 = r0
            boolean r0 = r15 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x038f
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x0397
        L_0x038f:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = h(r2, r15)
            r6[r30] = r15
        L_0x0397:
            r30 = r1
            long r0 = r8.objectFieldOffset(r15)
            int r0 = (int) r0
            int r12 = r12 % 32
            r1 = r0
            r15 = r11
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03b3
        L_0x03a6:
            r31 = r0
            r30 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r17 = 1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x03b3:
            r11 = 18
            if (r10 < r11) goto L_0x03c1
            r11 = 49
            if (r10 > r11) goto L_0x03c1
            int r11 = r23 + 1
            r13[r23] = r9
            r23 = r11
        L_0x03c1:
            int r11 = r21 + 1
            r5[r21] = r7
            int r7 = r11 + 1
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03ce
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03cf
        L_0x03ce:
            r0 = 0
        L_0x03cf:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03d6
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03d7
        L_0x03d6:
            r3 = 0
        L_0x03d7:
            r0 = r0 | r3
            int r3 = r10 << 20
            r0 = r0 | r3
            r0 = r0 | r9
            r5[r11] = r0
            int r21 = r7 + 1
            int r0 = r12 << 20
            r0 = r0 | r1
            r5[r7] = r0
            r11 = r14
            r7 = r15
            r9 = r24
            r3 = r25
            r15 = r27
            r10 = r28
            r12 = r29
            r1 = r30
            r14 = r31
            r0 = r32
            goto L_0x0192
        L_0x03f9:
            r32 = r0
            r24 = r9
            r28 = r10
            r14 = r11
            r29 = r12
            r27 = r15
            i0.h.a.b.g.h.b1 r0 = new i0.h.a.b.g.h.b1
            r1 = r32
            i0.h.a.b.g.h.y0 r10 = r1.a
            r1 = r5
            r5 = r0
            r6 = r1
            r7 = r29
            r8 = r24
            r9 = r28
            r12 = r13
            r13 = r27
            r14 = r20
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0426:
            i0.h.a.b.g.h.u1 r0 = (i0.h.a.b.g.h.u1) r0
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.h.b1.f(i0.h.a.b.g.h.w0, i0.h.a.b.g.h.c1, i0.h.a.b.g.h.k0, i0.h.a.b.g.h.x1, i0.h.a.b.g.h.u, i0.h.a.b.g.h.s0):i0.h.a.b.g.h.b1");
    }

    public static Field h(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + name.length() + String.valueOf(str).length() + 40);
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            throw new RuntimeException(a.y0(sb, " not found. Known fields are ", arrays));
        }
    }

    public static <T> int r(T t, long j2) {
        return ((Integer) d2.p(t, j2)).intValue();
    }

    public static <T> long t(T t, long j2) {
        return ((Long) d2.p(t, j2)).longValue();
    }

    public final void a(T t) {
        int i2;
        int i3 = this.h;
        while (true) {
            i2 = this.i;
            if (i3 >= i2) {
                break;
            }
            long q = (long) (q(this.g[i3]) & 1048575);
            Object p = d2.p(t, q);
            if (p != null) {
                d2.e(t, q, this.n.d(p));
            }
            i3++;
        }
        int length = this.g.length;
        while (i2 < length) {
            this.k.b(t, (long) this.g[i2]);
            i2++;
        }
        this.l.d(t);
        if (this.f) {
            this.m.d(t);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (i0.h.a.b.g.h.k1.c(i0.h.a.b.g.h.d2.p(r10, r6), i0.h.a.b.g.h.d2.p(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (i0.h.a.b.g.h.d2.g(r10, r6) == i0.h.a.b.g.h.d2.g(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (i0.h.a.b.g.h.d2.b(r10, r6) == i0.h.a.b.g.h.d2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (i0.h.a.b.g.h.d2.g(r10, r6) == i0.h.a.b.g.h.d2.g(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (i0.h.a.b.g.h.d2.b(r10, r6) == i0.h.a.b.g.h.d2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (i0.h.a.b.g.h.d2.b(r10, r6) == i0.h.a.b.g.h.d2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (i0.h.a.b.g.h.d2.b(r10, r6) == i0.h.a.b.g.h.d2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (i0.h.a.b.g.h.k1.c(i0.h.a.b.g.h.d2.p(r10, r6), i0.h.a.b.g.h.d2.p(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (i0.h.a.b.g.h.k1.c(i0.h.a.b.g.h.d2.p(r10, r6), i0.h.a.b.g.h.d2.p(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (i0.h.a.b.g.h.k1.c(i0.h.a.b.g.h.d2.p(r10, r6), i0.h.a.b.g.h.d2.p(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (i0.h.a.b.g.h.d2.l(r10, r6) == i0.h.a.b.g.h.d2.l(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (i0.h.a.b.g.h.d2.b(r10, r6) == i0.h.a.b.g.h.d2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (i0.h.a.b.g.h.d2.g(r10, r6) == i0.h.a.b.g.h.d2.g(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (i0.h.a.b.g.h.d2.b(r10, r6) == i0.h.a.b.g.h.d2.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (i0.h.a.b.g.h.d2.g(r10, r6) == i0.h.a.b.g.h.d2.g(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (i0.h.a.b.g.h.d2.g(r10, r6) == i0.h.a.b.g.h.d2.g(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(i0.h.a.b.g.h.d2.m(r10, r6)) == java.lang.Float.floatToIntBits(i0.h.a.b.g.h.d2.m(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(i0.h.a.b.g.h.d2.o(r10, r6)) == java.lang.Double.doubleToLongBits(i0.h.a.b.g.h.d2.o(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (i0.h.a.b.g.h.k1.c(i0.h.a.b.g.h.d2.p(r10, r6), i0.h.a.b.g.h.d2.p(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.c
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.q(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.s(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = i0.h.a.b.g.h.d2.b(r10, r4)
            int r4 = i0.h.a.b.g.h.d2.b(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = i0.h.a.b.g.h.d2.p(r10, r6)
            java.lang.Object r5 = i0.h.a.b.g.h.d2.p(r11, r6)
            boolean r4 = i0.h.a.b.g.h.k1.c(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r10, r6)
            java.lang.Object r4 = i0.h.a.b.g.h.d2.p(r11, r6)
            boolean r3 = i0.h.a.b.g.h.k1.c(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r10, r6)
            java.lang.Object r4 = i0.h.a.b.g.h.d2.p(r11, r6)
            boolean r3 = i0.h.a.b.g.h.k1.c(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i0.h.a.b.g.h.d2.p(r10, r6)
            java.lang.Object r5 = i0.h.a.b.g.h.d2.p(r11, r6)
            boolean r4 = i0.h.a.b.g.h.k1.c(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i0.h.a.b.g.h.d2.g(r10, r6)
            long r6 = i0.h.a.b.g.h.d2.g(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i0.h.a.b.g.h.d2.b(r10, r6)
            int r5 = i0.h.a.b.g.h.d2.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i0.h.a.b.g.h.d2.g(r10, r6)
            long r6 = i0.h.a.b.g.h.d2.g(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i0.h.a.b.g.h.d2.b(r10, r6)
            int r5 = i0.h.a.b.g.h.d2.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i0.h.a.b.g.h.d2.b(r10, r6)
            int r5 = i0.h.a.b.g.h.d2.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i0.h.a.b.g.h.d2.b(r10, r6)
            int r5 = i0.h.a.b.g.h.d2.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i0.h.a.b.g.h.d2.p(r10, r6)
            java.lang.Object r5 = i0.h.a.b.g.h.d2.p(r11, r6)
            boolean r4 = i0.h.a.b.g.h.k1.c(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i0.h.a.b.g.h.d2.p(r10, r6)
            java.lang.Object r5 = i0.h.a.b.g.h.d2.p(r11, r6)
            boolean r4 = i0.h.a.b.g.h.k1.c(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = i0.h.a.b.g.h.d2.p(r10, r6)
            java.lang.Object r5 = i0.h.a.b.g.h.d2.p(r11, r6)
            boolean r4 = i0.h.a.b.g.h.k1.c(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = i0.h.a.b.g.h.d2.l(r10, r6)
            boolean r5 = i0.h.a.b.g.h.d2.l(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i0.h.a.b.g.h.d2.b(r10, r6)
            int r5 = i0.h.a.b.g.h.d2.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i0.h.a.b.g.h.d2.g(r10, r6)
            long r6 = i0.h.a.b.g.h.d2.g(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = i0.h.a.b.g.h.d2.b(r10, r6)
            int r5 = i0.h.a.b.g.h.d2.b(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i0.h.a.b.g.h.d2.g(r10, r6)
            long r6 = i0.h.a.b.g.h.d2.g(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = i0.h.a.b.g.h.d2.g(r10, r6)
            long r6 = i0.h.a.b.g.h.d2.g(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = i0.h.a.b.g.h.d2.m(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = i0.h.a.b.g.h.d2.m(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.p(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = i0.h.a.b.g.h.d2.o(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = i0.h.a.b.g.h.d2.o(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = r1
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            i0.h.a.b.g.h.x1<?, ?> r0 = r9.l
            java.lang.Object r0 = r0.b(r10)
            i0.h.a.b.g.h.x1<?, ?> r2 = r9.l
            java.lang.Object r2 = r2.b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f
            if (r0 == 0) goto L_0x01f1
            i0.h.a.b.g.h.u<?> r0 = r9.m
            i0.h.a.b.g.h.v r10 = r0.a(r10)
            i0.h.a.b.g.h.u<?> r0 = r9.m
            i0.h.a.b.g.h.v r11 = r0.a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.h.b1.b(java.lang.Object, java.lang.Object):boolean");
    }

    public final boolean c(T t) {
        int i2;
        int i3;
        T t2 = t;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            boolean z = true;
            if (i6 >= this.h) {
                return !this.f || this.m.a(t2).h();
            }
            int i7 = this.g[i6];
            int i8 = this.c[i7];
            int q = q(i7);
            int i9 = this.c[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = b.getInt(t2, (long) i10);
                }
                i2 = i5;
                i3 = i10;
            } else {
                i3 = i4;
                i2 = i5;
            }
            if (((268435456 & q) != 0) && !l(t, i7, i3, i2, i11)) {
                return false;
            }
            int i12 = (267386880 & q) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (k(t2, i8, i7) && !g(i7).c(d2.p(t2, (long) (q & 1048575)))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 == 50 && !this.n.a(d2.p(t2, (long) (q & 1048575))).isEmpty()) {
                            Objects.requireNonNull(this.n.c(this.d[(i7 / 3) << 1]));
                            throw null;
                        }
                    }
                }
                List list = (List) d2.p(t2, (long) (q & 1048575));
                if (!list.isEmpty()) {
                    j1 g2 = g(i7);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= list.size()) {
                            break;
                        } else if (!g2.c(list.get(i13))) {
                            z = false;
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (l(t, i7, i3, i2, i11) && !g(i7).c(d2.p(t2, (long) (q & 1048575)))) {
                return false;
            }
            i6++;
            i4 = i3;
            i5 = i2;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (r3 != false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f2, code lost:
        if (r3 != false) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f5, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f6, code lost:
        r2 = r2 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0240, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0242, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int d(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.c
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0246
            int r3 = r10.q(r1)
            int[] r4 = r10.c
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            r8 = 1231(0x4cf, float:1.725E-42)
            r9 = 1237(0x4d5, float:1.733E-42)
            switch(r3) {
                case 0: goto L_0x0232;
                case 1: goto L_0x0227;
                case 2: goto L_0x021c;
                case 3: goto L_0x0211;
                case 4: goto L_0x020a;
                case 5: goto L_0x01ff;
                case 6: goto L_0x01f8;
                case 7: goto L_0x01ea;
                case 8: goto L_0x01dd;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01c3;
                case 11: goto L_0x01bb;
                case 12: goto L_0x01b3;
                case 13: goto L_0x01ab;
                case 14: goto L_0x019f;
                case 15: goto L_0x0197;
                case 16: goto L_0x018b;
                case 17: goto L_0x0180;
                case 18: goto L_0x0174;
                case 19: goto L_0x0174;
                case 20: goto L_0x0174;
                case 21: goto L_0x0174;
                case 22: goto L_0x0174;
                case 23: goto L_0x0174;
                case 24: goto L_0x0174;
                case 25: goto L_0x0174;
                case 26: goto L_0x0174;
                case 27: goto L_0x0174;
                case 28: goto L_0x0174;
                case 29: goto L_0x0174;
                case 30: goto L_0x0174;
                case 31: goto L_0x0174;
                case 32: goto L_0x0174;
                case 33: goto L_0x0174;
                case 34: goto L_0x0174;
                case 35: goto L_0x0174;
                case 36: goto L_0x0174;
                case 37: goto L_0x0174;
                case 38: goto L_0x0174;
                case 39: goto L_0x0174;
                case 40: goto L_0x0174;
                case 41: goto L_0x0174;
                case 42: goto L_0x0174;
                case 43: goto L_0x0174;
                case 44: goto L_0x0174;
                case 45: goto L_0x0174;
                case 46: goto L_0x0174;
                case 47: goto L_0x0174;
                case 48: goto L_0x0174;
                case 49: goto L_0x0174;
                case 50: goto L_0x0168;
                case 51: goto L_0x014c;
                case 52: goto L_0x0134;
                case 53: goto L_0x0122;
                case 54: goto L_0x0110;
                case 55: goto L_0x0102;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e2;
                case 58: goto L_0x00ca;
                case 59: goto L_0x00b6;
                case 60: goto L_0x00a4;
                case 61: goto L_0x0092;
                case 62: goto L_0x0084;
                case 63: goto L_0x0076;
                case 64: goto L_0x0068;
                case 65: goto L_0x0056;
                case 66: goto L_0x0048;
                case 67: goto L_0x0036;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0242
        L_0x0024:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x0036:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = t(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0048:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = r(r11, r5)
            goto L_0x0240
        L_0x0056:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = t(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0068:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = r(r11, r5)
            goto L_0x0240
        L_0x0076:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = r(r11, r5)
            goto L_0x0240
        L_0x0084:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = r(r11, r5)
            goto L_0x0240
        L_0x0092:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00a4:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00b6:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x00ca:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = i0.h.a.b.g.h.b0.a
            if (r3 == 0) goto L_0x01f5
            goto L_0x01f6
        L_0x00e2:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = r(r11, r5)
            goto L_0x0240
        L_0x00f0:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = t(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0102:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            int r3 = r(r11, r5)
            goto L_0x0240
        L_0x0110:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = t(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0122:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            long r3 = t(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0134:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0240
        L_0x014c:
            boolean r3 = r10.k(r11, r4, r1)
            if (r3 == 0) goto L_0x0242
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x0180:
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = i0.h.a.b.g.h.d2.g(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0197:
            int r2 = r2 * 53
            int r3 = i0.h.a.b.g.h.d2.b(r11, r5)
            goto L_0x0240
        L_0x019f:
            int r2 = r2 * 53
            long r3 = i0.h.a.b.g.h.d2.g(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = i0.h.a.b.g.h.d2.b(r11, r5)
            goto L_0x0240
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = i0.h.a.b.g.h.d2.b(r11, r5)
            goto L_0x0240
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = i0.h.a.b.g.h.d2.b(r11, r5)
            goto L_0x0240
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x01cf:
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0242
        L_0x01dd:
            int r2 = r2 * 53
            java.lang.Object r3 = i0.h.a.b.g.h.d2.p(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0240
        L_0x01ea:
            int r2 = r2 * 53
            boolean r3 = i0.h.a.b.g.h.d2.l(r11, r5)
            java.nio.charset.Charset r4 = i0.h.a.b.g.h.b0.a
            if (r3 == 0) goto L_0x01f5
            goto L_0x01f6
        L_0x01f5:
            r8 = r9
        L_0x01f6:
            int r2 = r2 + r8
            goto L_0x0242
        L_0x01f8:
            int r2 = r2 * 53
            int r3 = i0.h.a.b.g.h.d2.b(r11, r5)
            goto L_0x0240
        L_0x01ff:
            int r2 = r2 * 53
            long r3 = i0.h.a.b.g.h.d2.g(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x020a:
            int r2 = r2 * 53
            int r3 = i0.h.a.b.g.h.d2.b(r11, r5)
            goto L_0x0240
        L_0x0211:
            int r2 = r2 * 53
            long r3 = i0.h.a.b.g.h.d2.g(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x021c:
            int r2 = r2 * 53
            long r3 = i0.h.a.b.g.h.d2.g(r11, r5)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
            goto L_0x0240
        L_0x0227:
            int r2 = r2 * 53
            float r3 = i0.h.a.b.g.h.d2.m(r11, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0240
        L_0x0232:
            int r2 = r2 * 53
            double r3 = i0.h.a.b.g.h.d2.o(r11, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = i0.h.a.b.g.h.b0.a(r3)
        L_0x0240:
            int r3 = r3 + r2
            r2 = r3
        L_0x0242:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0246:
            int r2 = r2 * 53
            i0.h.a.b.g.h.x1<?, ?> r0 = r10.l
            java.lang.Object r0 = r0.b(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f
            if (r1 == 0) goto L_0x0264
            int r0 = r0 * 53
            i0.h.a.b.g.h.u<?> r1 = r10.m
            i0.h.a.b.g.h.v r11 = r1.a(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0264:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.b.g.h.b1.d(java.lang.Object):int");
    }

    public final void e(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.c.length; i2 += 3) {
            int q = q(i2);
            long j2 = (long) (1048575 & q);
            int i3 = this.c[i2];
            switch ((q & 267386880) >>> 20) {
                case 0:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.b(t, j2, d2.o(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 1:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.c(t, j2, d2.m(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 2:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.d(t, j2, d2.g(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 3:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.d(t, j2, d2.g(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 4:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.d(t, j2, d2.b(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 5:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.d(t, j2, d2.g(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 6:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.d(t, j2, d2.b(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 7:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.f(t, j2, d2.l(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 8:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.e(t, j2, d2.p(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 9:
                    i(t, t2, i2);
                    break;
                case 10:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.e(t, j2, d2.p(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 11:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.d(t, j2, d2.b(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 12:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.d(t, j2, d2.b(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 13:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.d(t, j2, d2.b(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 14:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.d(t, j2, d2.g(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 15:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.f.d(t, j2, d2.b(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 16:
                    if (!j(t2, i2)) {
                        break;
                    } else {
                        d2.d(t, j2, d2.g(t2, j2));
                        m(t, i2);
                        break;
                    }
                case 17:
                    i(t, t2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.k.a(t, t2, j2);
                    break;
                case 50:
                    s0 s0Var = this.n;
                    Class<?> cls = k1.a;
                    d2.e(t, j2, s0Var.b(d2.p(t, j2), d2.p(t2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!k(t2, i3, i2)) {
                        break;
                    } else {
                        d2.e(t, j2, d2.p(t2, j2));
                        n(t, i3, i2);
                        break;
                    }
                case 60:
                    o(t, t2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!k(t2, i3, i2)) {
                        break;
                    } else {
                        d2.e(t, j2, d2.p(t2, j2));
                        n(t, i3, i2);
                        break;
                    }
                case 68:
                    o(t, t2, i2);
                    break;
            }
        }
        x1<?, ?> x1Var = this.l;
        Class<?> cls2 = k1.a;
        x1Var.a(t, x1Var.c(x1Var.b(t), x1Var.b(t2)));
        if (this.f) {
            k1.b(this.m, t, t2);
        }
    }

    public final j1 g(int i2) {
        int i3 = (i2 / 3) << 1;
        Object[] objArr = this.d;
        j1 j1Var = (j1) objArr[i3];
        if (j1Var != null) {
            return j1Var;
        }
        j1 a2 = i1.a.a((Class) objArr[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    public final void i(T t, T t2, int i2) {
        long j2 = (long) (this.c[i2 + 1] & 1048575);
        if (j(t2, i2)) {
            Object p = d2.p(t, j2);
            Object p2 = d2.p(t2, j2);
            if (p != null && p2 != null) {
                d2.e(t, j2, b0.b(p, p2));
                m(t, i2);
            } else if (p2 != null) {
                d2.e(t, j2, p2);
                m(t, i2);
            }
        }
    }

    public final boolean j(T t, int i2) {
        int[] iArr = this.c;
        int i3 = iArr[i2 + 2];
        long j2 = (long) (i3 & 1048575);
        if (j2 == 1048575) {
            int i4 = iArr[i2 + 1];
            long j3 = (long) (i4 & 1048575);
            switch ((i4 & 267386880) >>> 20) {
                case 0:
                    return d2.o(t, j3) != 0.0d;
                case 1:
                    return d2.m(t, j3) != 0.0f;
                case 2:
                    return d2.g(t, j3) != 0;
                case 3:
                    return d2.g(t, j3) != 0;
                case 4:
                    return d2.b(t, j3) != 0;
                case 5:
                    return d2.g(t, j3) != 0;
                case 6:
                    return d2.b(t, j3) != 0;
                case 7:
                    return d2.l(t, j3);
                case 8:
                    Object p = d2.p(t, j3);
                    if (p instanceof String) {
                        return !((String) p).isEmpty();
                    }
                    if (p instanceof zzct) {
                        return !zzct.c.equals(p);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return d2.p(t, j3) != null;
                case 10:
                    return !zzct.c.equals(d2.p(t, j3));
                case 11:
                    return d2.b(t, j3) != 0;
                case 12:
                    return d2.b(t, j3) != 0;
                case 13:
                    return d2.b(t, j3) != 0;
                case 14:
                    return d2.g(t, j3) != 0;
                case 15:
                    return d2.b(t, j3) != 0;
                case 16:
                    return d2.g(t, j3) != 0;
                case 17:
                    return d2.p(t, j3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (d2.b(t, j2) & (1 << (i3 >>> 20))) != 0;
        }
    }

    public final boolean k(T t, int i2, int i3) {
        return d2.b(t, (long) (this.c[i3 + 2] & 1048575)) == i2;
    }

    public final boolean l(T t, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return j(t, i2);
        }
        return (i4 & i5) != 0;
    }

    public final void m(T t, int i2) {
        int i3 = this.c[i2 + 2];
        long j2 = (long) (1048575 & i3);
        if (j2 != 1048575) {
            d2.f.d(t, j2, (1 << (i3 >>> 20)) | d2.b(t, j2));
        }
    }

    public final void n(T t, int i2, int i3) {
        d2.f.d(t, (long) (this.c[i3 + 2] & 1048575), i2);
    }

    public final void o(T t, T t2, int i2) {
        int[] iArr = this.c;
        int i3 = iArr[i2 + 1];
        int i4 = iArr[i2];
        long j2 = (long) (i3 & 1048575);
        if (k(t2, i4, i2)) {
            Object p = d2.p(t, j2);
            Object p2 = d2.p(t2, j2);
            if (p != null && p2 != null) {
                d2.e(t, j2, b0.b(p, p2));
                n(t, i4, i2);
            } else if (p2 != null) {
                d2.e(t, j2, p2);
                n(t, i4, i2);
            }
        }
    }

    public final boolean p(T t, T t2, int i2) {
        return j(t, i2) == j(t2, i2);
    }

    public final int q(int i2) {
        return this.c[i2 + 1];
    }

    public final int s(int i2) {
        return this.c[i2 + 2];
    }
}
