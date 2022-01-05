package s0.a.b.e0;

import java.util.Objects;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.b.e;
import s0.a.b.i;
import s0.a.b.k0.n1;
import s0.a.b.k0.y0;

public class z0 implements e {
    public static int[] a;
    public static int[] b;
    public static int[] c;
    public static int[] d;
    public int e;
    public int f;
    public long[] g;
    public long[] h;
    public long[] i;
    public d j;
    public boolean k;

    public static final class a extends d {
        public a(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        /* JADX WARNING: type inference failed for: r79v0, types: [long[]] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(long[] r78, long[] r79) {
            /*
                r77 = this;
                r0 = r77
                long[] r1 = r0.b
                long[] r2 = r0.a
                int[] r3 = s0.a.b.e0.z0.a
                int[] r3 = s0.a.b.e0.z0.b
                int[] r4 = s0.a.b.e0.z0.d
                int r5 = r1.length
                r6 = 33
                if (r5 != r6) goto L_0x050a
                int r5 = r2.length
                r7 = 5
                if (r5 != r7) goto L_0x0504
                r5 = 0
                r8 = r78[r5]
                r10 = 1
                r11 = r78[r10]
                r13 = 2
                r14 = r78[r13]
                r16 = 3
                r17 = r78[r16]
                r13 = 4
                r19 = r78[r13]
                r21 = r78[r7]
                r23 = 6
                r24 = r78[r23]
                r26 = 7
                r27 = r78[r26]
                r5 = 8
                r29 = r78[r5]
                r5 = 9
                r31 = r78[r5]
                r6 = 10
                r33 = r78[r6]
                r35 = 11
                r36 = r78[r35]
                r6 = 12
                r38 = r78[r6]
                r7 = 13
                r40 = r78[r7]
                r42 = 14
                r43 = r78[r42]
                r45 = 15
                r46 = r78[r45]
                r6 = 19
            L_0x0051:
                if (r6 < r10) goto L_0x047e
                r48 = r3[r6]
                r49 = r4[r6]
                int r50 = r48 + 1
                r51 = r1[r50]
                long r8 = r8 - r51
                int r51 = r48 + 2
                r52 = r1[r51]
                long r11 = r11 - r52
                int r52 = r48 + 3
                r53 = r1[r52]
                long r14 = r14 - r53
                int r53 = r48 + 4
                r54 = r1[r53]
                r56 = r11
                long r10 = r17 - r54
                int r12 = r48 + 5
                r17 = r1[r12]
                r58 = r14
                long r13 = r19 - r17
                int r15 = r48 + 6
                r17 = r1[r15]
                r60 = r8
                long r7 = r21 - r17
                int r9 = r48 + 7
                r17 = r1[r9]
                r62 = r6
                long r5 = r24 - r17
                int r17 = r48 + 8
                r19 = r1[r17]
                r63 = r3
                r64 = r4
                long r3 = r27 - r19
                int r18 = r48 + 9
                r19 = r1[r18]
                r21 = r3
                long r3 = r29 - r19
                int r19 = r48 + 10
                r24 = r1[r19]
                r65 = r10
                r11 = r9
                long r9 = r31 - r24
                int r20 = r48 + 11
                r24 = r1[r20]
                r27 = r11
                r67 = r12
                long r11 = r33 - r24
                int r24 = r48 + 12
                r29 = r1[r24]
                r31 = r11
                long r11 = r36 - r29
                int r25 = r48 + 13
                r29 = r1[r25]
                r68 = r3
                long r3 = r38 - r29
                int r28 = r48 + 14
                r29 = r1[r28]
                int r33 = r49 + 1
                r36 = r2[r33]
                long r29 = r29 + r36
                r36 = r3
                long r3 = r40 - r29
                int r29 = r48 + 15
                r38 = r1[r29]
                int r30 = r49 + 2
                r40 = r2[r30]
                long r38 = r38 + r40
                r70 = r7
                long r7 = r43 - r38
                int r30 = r48 + 16
                r38 = r1[r30]
                r72 = r2
                r0 = r62
                r62 = r1
                long r1 = (long) r0
                long r38 = r38 + r1
                r40 = 1
                long r38 = r38 + r40
                r30 = r0
                r40 = r1
                long r0 = r46 - r38
                r38 = r7
                r7 = r60
                r2 = 9
                long r0 = s0.a.b.e0.z0.h(r0, r2, r7)
                long r7 = r7 - r0
                r2 = 48
                r43 = r0
                r0 = r58
                long r11 = s0.a.b.e0.z0.h(r11, r2, r0)
                long r0 = r0 - r11
                r2 = 35
                long r2 = s0.a.b.e0.z0.h(r3, r2, r5)
                long r5 = r5 - r2
                r4 = 52
                long r9 = s0.a.b.e0.z0.h(r9, r4, r13)
                long r13 = r13 - r9
                r4 = 23
                r46 = r9
                r9 = r56
                r75 = r11
                r11 = r38
                r38 = r75
                long r9 = s0.a.b.e0.z0.h(r9, r4, r11)
                long r11 = r11 - r9
                r4 = 31
                r56 = r2
                r58 = r11
                r11 = r68
                r2 = r70
                long r2 = s0.a.b.e0.z0.h(r2, r4, r11)
                long r11 = r11 - r2
                r4 = 37
                r60 = r11
                r11 = r65
                r75 = r5
                r5 = r31
                r31 = r75
                long r11 = s0.a.b.e0.z0.h(r11, r4, r5)
                long r5 = r5 - r11
                r4 = 20
                r68 = r5
                r5 = r21
                r21 = r9
                r9 = r36
                long r4 = s0.a.b.e0.z0.h(r5, r4, r9)
                long r9 = r9 - r4
                r6 = 31
                long r4 = s0.a.b.e0.z0.h(r4, r6, r7)
                long r7 = r7 - r4
                r6 = 44
                long r2 = s0.a.b.e0.z0.h(r2, r6, r0)
                long r0 = r0 - r2
                r6 = 47
                long r11 = s0.a.b.e0.z0.h(r11, r6, r13)
                long r13 = r13 - r11
                r6 = 46
                r70 = r2
                r2 = r31
                r75 = r11
                r11 = r21
                r21 = r75
                long r11 = s0.a.b.e0.z0.h(r11, r6, r2)
                long r2 = r2 - r11
                r31 = r11
                r11 = r43
                r6 = 19
                long r11 = s0.a.b.e0.z0.h(r11, r6, r9)
                long r9 = r9 - r11
                r6 = 42
                r43 = r9
                r9 = r56
                r56 = r4
                r4 = r58
                long r9 = s0.a.b.e0.z0.h(r9, r6, r4)
                long r4 = r4 - r9
                r58 = r4
                r4 = r38
                r6 = 44
                r38 = r11
                r11 = r60
                long r4 = s0.a.b.e0.z0.h(r4, r6, r11)
                long r11 = r11 - r4
                r6 = 25
                r60 = r11
                r11 = r46
                r46 = r13
                r13 = r68
                long r11 = s0.a.b.e0.z0.h(r11, r6, r13)
                long r13 = r13 - r11
                r6 = 16
                long r11 = s0.a.b.e0.z0.h(r11, r6, r7)
                long r7 = r7 - r11
                r6 = 34
                long r9 = s0.a.b.e0.z0.h(r9, r6, r0)
                long r0 = r0 - r9
                r6 = 56
                long r4 = s0.a.b.e0.z0.h(r4, r6, r2)
                long r2 = r2 - r4
                r6 = 51
                r68 = r9
                r9 = r46
                r75 = r4
                r4 = r38
                r38 = r75
                long r4 = s0.a.b.e0.z0.h(r4, r6, r9)
                long r9 = r9 - r4
                r46 = r4
                r4 = r56
                r6 = 4
                long r4 = s0.a.b.e0.z0.h(r4, r6, r13)
                long r13 = r13 - r4
                r6 = 53
                r56 = r13
                r13 = r21
                r21 = r11
                r11 = r43
                long r13 = s0.a.b.e0.z0.h(r13, r6, r11)
                long r11 = r11 - r13
                r6 = 42
                r43 = r11
                r11 = r70
                r75 = r2
                r2 = r58
                r58 = r75
                long r11 = s0.a.b.e0.z0.h(r11, r6, r2)
                long r2 = r2 - r11
                r6 = 41
                r70 = r2
                r2 = r31
                r31 = r4
                r4 = r60
                long r2 = s0.a.b.e0.z0.h(r2, r6, r4)
                long r4 = r4 - r2
                long r2 = s0.a.b.e0.z0.h(r2, r6, r7)
                long r7 = r7 - r2
                r6 = 9
                long r13 = s0.a.b.e0.z0.h(r13, r6, r0)
                long r0 = r0 - r13
                r6 = 37
                long r11 = s0.a.b.e0.z0.h(r11, r6, r9)
                long r9 = r9 - r11
                r73 = r11
                r11 = r58
                r6 = 31
                r75 = r9
                r9 = r31
                r31 = r75
                long r9 = s0.a.b.e0.z0.h(r9, r6, r11)
                long r11 = r11 - r9
                r58 = r9
                r9 = r21
                r6 = 12
                long r9 = s0.a.b.e0.z0.h(r9, r6, r4)
                long r4 = r4 - r9
                r21 = r9
                r9 = r38
                r6 = 47
                r38 = r4
                r4 = r56
                long r9 = s0.a.b.e0.z0.h(r9, r6, r4)
                long r4 = r4 - r9
                r56 = r9
                r9 = r68
                r6 = 44
                r75 = r4
                r4 = r43
                r43 = r75
                long r9 = s0.a.b.e0.z0.h(r9, r6, r4)
                long r4 = r4 - r9
                r6 = 30
                r68 = r9
                r9 = r46
                r46 = r4
                r4 = r70
                long r9 = s0.a.b.e0.z0.h(r9, r6, r4)
                long r4 = r4 - r9
                r70 = r62[r48]
                long r7 = r7 - r70
                r70 = r62[r50]
                long r2 = r2 - r70
                r50 = r62[r51]
                long r0 = r0 - r50
                r50 = r62[r52]
                long r13 = r13 - r50
                r50 = r62[r53]
                r52 = r13
                long r13 = r31 - r50
                r31 = r62[r67]
                r50 = r2
                long r2 = r73 - r31
                r31 = r62[r15]
                long r11 = r11 - r31
                r31 = r62[r27]
                r70 = r2
                long r2 = r58 - r31
                r31 = r62[r17]
                r58 = r2
                long r2 = r38 - r31
                r17 = r62[r18]
                r31 = r2
                long r2 = r21 - r17
                r17 = r62[r19]
                r21 = r2
                long r2 = r43 - r17
                r17 = r62[r20]
                r19 = r2
                long r2 = r56 - r17
                r17 = r62[r24]
                r38 = r13
                long r13 = r46 - r17
                r17 = r62[r25]
                r24 = r72[r49]
                long r17 = r17 + r24
                r24 = r13
                long r13 = r68 - r17
                r17 = r62[r28]
                r27 = r72[r33]
                long r17 = r17 + r27
                long r4 = r4 - r17
                r17 = r62[r29]
                long r17 = r17 + r40
                long r9 = r9 - r17
                r6 = 5
                long r9 = s0.a.b.e0.z0.h(r9, r6, r7)
                long r7 = r7 - r9
                r6 = 20
                long r2 = s0.a.b.e0.z0.h(r2, r6, r0)
                long r0 = r0 - r2
                r6 = 48
                long r13 = s0.a.b.e0.z0.h(r13, r6, r11)
                long r11 = r11 - r13
                r17 = r2
                r2 = r38
                r6 = 41
                r75 = r13
                r13 = r21
                r21 = r75
                long r13 = s0.a.b.e0.z0.h(r13, r6, r2)
                long r2 = r2 - r13
                r27 = r13
                r13 = r50
                r6 = 47
                long r13 = s0.a.b.e0.z0.h(r13, r6, r4)
                long r4 = r4 - r13
                r6 = 28
                r33 = r4
                r4 = r70
                r75 = r9
                r9 = r31
                r31 = r75
                long r4 = s0.a.b.e0.z0.h(r4, r6, r9)
                long r9 = r9 - r4
                r38 = r9
                r9 = r52
                r6 = 16
                r75 = r11
                r11 = r19
                r19 = r75
                long r9 = s0.a.b.e0.z0.h(r9, r6, r11)
                long r11 = r11 - r9
                r6 = 25
                r40 = r11
                r11 = r58
                r75 = r13
                r13 = r24
                r24 = r75
                long r11 = s0.a.b.e0.z0.h(r11, r6, r13)
                long r13 = r13 - r11
                r6 = 33
                long r11 = s0.a.b.e0.z0.h(r11, r6, r7)
                long r7 = r7 - r11
                r15 = 4
                long r4 = s0.a.b.e0.z0.h(r4, r15, r0)
                long r0 = r0 - r4
                r15 = 51
                long r9 = s0.a.b.e0.z0.h(r9, r15, r2)
                long r2 = r2 - r9
                r43 = r7
                r6 = r19
                r8 = 13
                r19 = r4
                r4 = r24
                long r4 = s0.a.b.e0.z0.h(r4, r8, r6)
                long r6 = r6 - r4
                r8 = 34
                r24 = r4
                r4 = r31
                long r4 = s0.a.b.e0.z0.h(r4, r8, r13)
                long r13 = r13 - r4
                r31 = r9
                r8 = r21
                r10 = 41
                r21 = r13
                r13 = r33
                long r8 = s0.a.b.e0.z0.h(r8, r10, r13)
                long r13 = r13 - r8
                r10 = 59
                r33 = r13
                r13 = r17
                r17 = r11
                r11 = r38
                long r13 = s0.a.b.e0.z0.h(r13, r10, r11)
                long r10 = r11 - r13
                r12 = 17
                r38 = r10
                r10 = r27
                r27 = r2
                r2 = r40
                long r10 = s0.a.b.e0.z0.h(r10, r12, r2)
                long r2 = r2 - r10
                r12 = 38
                r40 = r2
                r2 = r43
                long r10 = s0.a.b.e0.z0.h(r10, r12, r2)
                long r2 = r2 - r10
                r12 = 19
                long r8 = s0.a.b.e0.z0.h(r8, r12, r0)
                long r0 = r0 - r8
                r15 = 10
                long r13 = s0.a.b.e0.z0.h(r13, r15, r6)
                long r6 = r6 - r13
                r15 = 55
                r43 = r13
                r12 = r27
                long r4 = s0.a.b.e0.z0.h(r4, r15, r12)
                long r12 = r12 - r4
                r14 = 49
                r27 = r4
                r4 = r17
                r17 = r8
                r8 = r40
                long r4 = s0.a.b.e0.z0.h(r4, r14, r8)
                long r8 = r8 - r4
                r14 = 18
                r40 = r8
                r8 = r31
                r75 = r10
                r10 = r21
                r21 = r75
                long r8 = s0.a.b.e0.z0.h(r8, r14, r10)
                long r10 = r10 - r8
                r14 = 23
                r31 = r10
                r10 = r19
                r19 = r4
                r4 = r33
                long r10 = s0.a.b.e0.z0.h(r10, r14, r4)
                long r4 = r4 - r10
                r14 = 52
                r33 = r4
                r4 = r24
                r24 = r6
                r6 = r38
                long r4 = s0.a.b.e0.z0.h(r4, r14, r6)
                long r6 = r6 - r4
                r14 = 24
                long r4 = s0.a.b.e0.z0.h(r4, r14, r2)
                long r2 = r2 - r4
                r14 = 13
                long r8 = s0.a.b.e0.z0.h(r8, r14, r0)
                long r14 = r0 - r8
                r0 = 8
                long r10 = s0.a.b.e0.z0.h(r10, r0, r12)
                long r12 = r12 - r10
                r0 = r24
                r24 = r4
                r4 = 47
                r75 = r2
                r2 = r19
                r19 = r75
                long r2 = s0.a.b.e0.z0.h(r2, r4, r0)
                long r0 = r0 - r2
                r4 = r21
                r21 = r0
                r0 = 8
                long r4 = s0.a.b.e0.z0.h(r4, r0, r6)
                long r0 = r6 - r4
                r6 = 17
                r36 = r0
                r38 = r2
                r2 = r40
                r0 = r43
                long r0 = s0.a.b.e0.z0.h(r0, r6, r2)
                long r2 = r2 - r0
                r6 = 22
                r40 = r0
                r0 = r17
                r17 = r2
                r2 = r31
                long r0 = s0.a.b.e0.z0.h(r0, r6, r2)
                long r2 = r2 - r0
                r31 = r2
                r2 = r33
                r6 = 37
                r75 = r0
                r0 = r27
                r27 = r75
                long r46 = s0.a.b.e0.z0.h(r0, r6, r2)
                long r43 = r2 - r46
                int r6 = r30 + -2
                r0 = r77
                r33 = r17
                r29 = r36
                r36 = r40
                r1 = r62
                r3 = r63
                r2 = r72
                r17 = r8
                r8 = r19
                r40 = r27
                r27 = r38
                r19 = r12
                r38 = r31
                r13 = 4
                r31 = r4
                r4 = r64
                r5 = 9
                r75 = r10
                r10 = 1
                r11 = r24
                r24 = r21
                r21 = r75
                goto L_0x0051
            L_0x047e:
                r62 = r1
                r72 = r2
                r1 = 0
                r2 = r62[r1]
                long r8 = r8 - r2
                r0 = 1
                r1 = r62[r0]
                long r11 = r11 - r1
                r0 = 2
                r1 = r62[r0]
                long r14 = r14 - r1
                r0 = r62[r16]
                long r17 = r17 - r0
                r0 = 4
                r1 = r62[r0]
                long r19 = r19 - r1
                r0 = 5
                r1 = r62[r0]
                long r21 = r21 - r1
                r0 = r62[r23]
                long r24 = r24 - r0
                r0 = r62[r26]
                long r27 = r27 - r0
                r0 = 8
                r1 = r62[r0]
                long r29 = r29 - r1
                r0 = 9
                r1 = r62[r0]
                long r31 = r31 - r1
                r0 = 10
                r1 = r62[r0]
                long r33 = r33 - r1
                r0 = r62[r35]
                long r36 = r36 - r0
                r0 = 12
                r1 = r62[r0]
                long r38 = r38 - r1
                r0 = 13
                r1 = r62[r0]
                r0 = 0
                r3 = r72[r0]
                long r1 = r1 + r3
                long r40 = r40 - r1
                r1 = r62[r42]
                r3 = 1
                r4 = r72[r3]
                long r1 = r1 + r4
                long r43 = r43 - r1
                r1 = r62[r45]
                long r46 = r46 - r1
                r79[r0] = r8
                r79[r3] = r11
                r0 = 2
                r79[r0] = r14
                r79[r16] = r17
                r0 = 4
                r79[r0] = r19
                r0 = 5
                r79[r0] = r21
                r79[r23] = r24
                r79[r26] = r27
                r0 = 8
                r79[r0] = r29
                r0 = 9
                r79[r0] = r31
                r0 = 10
                r79[r0] = r33
                r79[r35] = r36
                r0 = 12
                r79[r0] = r38
                r0 = 13
                r79[r0] = r40
                r79[r42] = r43
                r79[r45] = r46
                return
            L_0x0504:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            L_0x050a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.b.e0.z0.a.a(long[], long[]):void");
        }

        /* JADX WARNING: type inference failed for: r85v0, types: [long[]] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(long[] r84, long[] r85) {
            /*
                r83 = this;
                r0 = r83
                long[] r1 = r0.b
                long[] r2 = r0.a
                int[] r3 = s0.a.b.e0.z0.a
                int[] r3 = s0.a.b.e0.z0.b
                int[] r4 = s0.a.b.e0.z0.d
                int r5 = r1.length
                r6 = 33
                if (r5 != r6) goto L_0x04c9
                int r5 = r2.length
                r7 = 5
                if (r5 != r7) goto L_0x04c3
                r5 = 0
                r8 = r84[r5]
                r10 = 1
                r11 = r84[r10]
                r13 = 2
                r14 = r84[r13]
                r16 = 3
                r17 = r84[r16]
                r6 = 4
                r19 = r84[r6]
                r21 = r84[r7]
                r23 = 6
                r24 = r84[r23]
                r26 = 7
                r27 = r84[r26]
                r7 = 8
                r30 = r84[r7]
                r7 = 9
                r33 = r84[r7]
                r7 = 10
                r36 = r84[r7]
                r38 = 11
                r39 = r84[r38]
                r7 = 12
                r42 = r84[r7]
                r7 = 13
                r45 = r84[r7]
                r47 = 14
                r48 = r84[r47]
                r50 = 15
                r51 = r84[r50]
                r53 = r1[r5]
                long r8 = r8 + r53
                r53 = r1[r10]
                long r11 = r11 + r53
                r53 = r1[r13]
                long r14 = r14 + r53
                r53 = r1[r16]
                long r17 = r17 + r53
                r53 = r1[r6]
                long r19 = r19 + r53
                r29 = 5
                r53 = r1[r29]
                long r21 = r21 + r53
                r53 = r1[r23]
                long r24 = r24 + r53
                r53 = r1[r26]
                long r27 = r27 + r53
                r32 = 8
                r53 = r1[r32]
                long r30 = r30 + r53
                r35 = 9
                r53 = r1[r35]
                long r33 = r33 + r53
                r41 = 10
                r53 = r1[r41]
                long r36 = r36 + r53
                r53 = r1[r38]
                long r39 = r39 + r53
                r44 = 12
                r53 = r1[r44]
                long r42 = r42 + r53
                r53 = r1[r7]
                r55 = r2[r5]
                long r53 = r53 + r55
                long r53 = r53 + r45
                r45 = r1[r47]
                r55 = r2[r10]
                long r45 = r45 + r55
                long r45 = r45 + r48
                r48 = r1[r50]
                long r51 = r51 + r48
                r5 = r17
                r57 = r21
                r59 = r27
                r61 = r33
                r63 = r39
                r65 = r51
                r67 = r53
            L_0x00af:
                r13 = 20
                if (r10 >= r13) goto L_0x0482
                r27 = r3[r10]
                r28 = r4[r10]
                r13 = 24
                long r8 = r8 + r11
                long r11 = s0.a.b.e0.z0.f(r11, r13, r8)
                long r14 = r14 + r5
                long r5 = s0.a.b.e0.z0.f(r5, r7, r14)
                r33 = r8
                r39 = r14
                r7 = r57
                long r13 = r19 + r7
                r15 = 8
                long r7 = s0.a.b.e0.z0.f(r7, r15, r13)
                r51 = r3
                r52 = r4
                r48 = r10
                r9 = r59
                long r3 = r24 + r9
                r15 = 47
                long r9 = s0.a.b.e0.z0.f(r9, r15, r3)
                r53 = r1
                r54 = r11
                r0 = r61
                long r11 = r30 + r0
                r15 = 8
                long r0 = s0.a.b.e0.z0.f(r0, r15, r11)
                r15 = 17
                r56 = r7
                r24 = r11
                r11 = r63
                long r7 = r36 + r11
                long r11 = s0.a.b.e0.z0.f(r11, r15, r7)
                r15 = 22
                r58 = r5
                r30 = r7
                r5 = r67
                long r7 = r42 + r5
                long r5 = s0.a.b.e0.z0.f(r5, r15, r7)
                r36 = r7
                r60 = r9
                r7 = r65
                long r9 = r45 + r7
                r15 = 37
                long r7 = s0.a.b.e0.z0.f(r7, r15, r9)
                r15 = 38
                r42 = r9
                long r9 = r33 + r0
                long r0 = s0.a.b.e0.z0.f(r0, r15, r9)
                r15 = 19
                r33 = r0
                long r0 = r39 + r5
                long r5 = s0.a.b.e0.z0.f(r5, r15, r0)
                long r3 = r3 + r11
                r15 = 10
                long r11 = s0.a.b.e0.z0.f(r11, r15, r3)
                r15 = 55
                long r13 = r13 + r7
                long r7 = s0.a.b.e0.z0.f(r7, r15, r13)
                r15 = 49
                r39 = r11
                long r11 = r30 + r60
                r30 = r5
                r5 = r60
                long r5 = s0.a.b.e0.z0.f(r5, r15, r11)
                r15 = 18
                r45 = r11
                long r11 = r36 + r58
                r36 = r7
                r7 = r58
                long r7 = s0.a.b.e0.z0.f(r7, r15, r11)
                r15 = 23
                r58 = r11
                long r11 = r42 + r56
                r60 = r2
                r42 = r3
                r2 = r56
                long r2 = s0.a.b.e0.z0.f(r2, r15, r11)
                r4 = 52
                r56 = r11
                long r11 = r24 + r54
                r24 = r7
                r7 = r54
                long r7 = s0.a.b.e0.z0.f(r7, r4, r11)
                long r9 = r9 + r5
                r4 = 33
                long r5 = s0.a.b.e0.z0.f(r5, r4, r9)
                long r0 = r0 + r2
                r15 = 4
                long r2 = s0.a.b.e0.z0.f(r2, r15, r0)
                r15 = 51
                long r13 = r13 + r24
                r54 = r5
                r4 = r24
                long r4 = s0.a.b.e0.z0.f(r4, r15, r13)
                r24 = r13
                long r13 = r42 + r7
                r6 = 13
                long r7 = s0.a.b.e0.z0.f(r7, r6, r13)
                r6 = 34
                r42 = r4
                long r4 = r58 + r36
                r58 = r2
                r2 = r36
                long r2 = s0.a.b.e0.z0.f(r2, r6, r4)
                r36 = r4
                long r4 = r56 + r30
                r6 = 41
                r56 = r7
                r7 = r30
                long r7 = s0.a.b.e0.z0.f(r7, r6, r4)
                r15 = 59
                long r11 = r11 + r39
                r61 = r7
                r6 = r39
                long r6 = s0.a.b.e0.z0.f(r6, r15, r11)
                r8 = 17
                r39 = r11
                long r11 = r45 + r33
                r45 = r4
                r4 = r33
                long r4 = s0.a.b.e0.z0.f(r4, r8, r11)
                long r9 = r9 + r2
                r8 = 5
                long r2 = s0.a.b.e0.z0.f(r2, r8, r9)
                long r0 = r0 + r6
                r8 = 20
                long r6 = s0.a.b.e0.z0.f(r6, r8, r0)
                r8 = 48
                long r13 = r13 + r61
                r33 = r2
                r2 = r61
                long r2 = s0.a.b.e0.z0.f(r2, r8, r13)
                r61 = r2
                long r2 = r24 + r4
                r8 = 41
                long r4 = s0.a.b.e0.z0.f(r4, r8, r2)
                r24 = r6
                long r6 = r45 + r56
                r45 = r4
                r4 = r56
                r8 = 47
                long r4 = s0.a.b.e0.z0.f(r4, r8, r6)
                r8 = 28
                r56 = r6
                long r6 = r39 + r58
                r39 = r13
                r13 = r58
                long r13 = s0.a.b.e0.z0.f(r13, r8, r6)
                long r11 = r11 + r42
                r8 = 16
                r58 = r6
                r6 = r42
                long r6 = s0.a.b.e0.z0.f(r6, r8, r11)
                r15 = 25
                r42 = r9
                long r8 = r36 + r54
                r36 = r11
                r10 = r54
                long r10 = s0.a.b.e0.z0.f(r10, r15, r8)
                r54 = r53[r27]
                long r42 = r42 + r54
                int r15 = r27 + 1
                r54 = r53[r15]
                long r4 = r4 + r54
                int r31 = r27 + 2
                r54 = r53[r31]
                long r0 = r0 + r54
                int r54 = r27 + 3
                r63 = r53[r54]
                long r6 = r6 + r63
                int r55 = r27 + 4
                r63 = r53[r55]
                long r2 = r2 + r63
                int r63 = r27 + 5
                r64 = r53[r63]
                long r13 = r13 + r64
                int r64 = r27 + 6
                r65 = r53[r64]
                long r39 = r39 + r65
                int r65 = r27 + 7
                r66 = r53[r65]
                long r10 = r10 + r66
                int r66 = r27 + 8
                r67 = r53[r66]
                long r58 = r58 + r67
                int r67 = r27 + 9
                r68 = r53[r67]
                r70 = r13
                long r12 = r45 + r68
                int r14 = r27 + 10
                r45 = r53[r14]
                long r36 = r36 + r45
                int r45 = r27 + 11
                r68 = r53[r45]
                r72 = r14
                r46 = r15
                long r14 = r24 + r68
                int r24 = r27 + 12
                r68 = r53[r24]
                long r8 = r8 + r68
                int r25 = r27 + 13
                r68 = r53[r25]
                r73 = r60[r28]
                long r68 = r68 + r73
                r73 = r8
                long r8 = r68 + r61
                int r61 = r27 + 14
                r68 = r53[r61]
                int r62 = r28 + 1
                r75 = r60[r62]
                long r68 = r68 + r75
                long r68 = r68 + r56
                int r56 = r27 + 15
                r75 = r53[r56]
                r77 = r8
                r79 = r14
                r8 = r48
                long r14 = (long) r8
                long r75 = r75 + r14
                long r8 = r75 + r33
                r33 = r14
                long r14 = r42 + r4
                r42 = r8
                r8 = 41
                long r4 = s0.a.b.e0.z0.f(r4, r8, r14)
                long r0 = r0 + r6
                r8 = 9
                long r6 = s0.a.b.e0.z0.f(r6, r8, r0)
                long r2 = r2 + r70
                r8 = r70
                r70 = r4
                r4 = 37
                long r8 = s0.a.b.e0.z0.f(r8, r4, r2)
                long r4 = r39 + r10
                r39 = r8
                r8 = 31
                long r9 = s0.a.b.e0.z0.f(r10, r8, r4)
                r75 = r9
                long r8 = r58 + r12
                r10 = 12
                long r12 = s0.a.b.e0.z0.f(r12, r10, r8)
                r58 = r12
                long r11 = r36 + r79
                r36 = r8
                r8 = r79
                r10 = 47
                long r8 = s0.a.b.e0.z0.f(r8, r10, r11)
                r79 = r6
                long r6 = r73 + r77
                r13 = 44
                r73 = r11
                r10 = r77
                long r11 = s0.a.b.e0.z0.f(r10, r13, r6)
                r10 = 30
                r77 = r6
                long r6 = r68 + r42
                r68 = r2
                r2 = r42
                long r2 = s0.a.b.e0.z0.f(r2, r10, r6)
                long r14 = r14 + r58
                r42 = r6
                r6 = r58
                r10 = 16
                long r6 = s0.a.b.e0.z0.f(r6, r10, r14)
                r81 = r14
                r13 = r75
                r15 = 34
                long r0 = r0 + r11
                long r11 = s0.a.b.e0.z0.f(r11, r15, r0)
                r15 = 56
                long r4 = r4 + r8
                long r8 = s0.a.b.e0.z0.f(r8, r15, r4)
                r15 = 51
                r75 = r11
                long r10 = r68 + r2
                long r2 = s0.a.b.e0.z0.f(r2, r15, r10)
                r68 = r6
                long r6 = r73 + r13
                r12 = 4
                long r13 = s0.a.b.e0.z0.f(r13, r12, r6)
                r12 = 53
                r73 = r6
                long r6 = r77 + r79
                r77 = r8
                r8 = r79
                long r8 = s0.a.b.e0.z0.f(r8, r12, r6)
                r12 = 42
                r79 = r2
                long r2 = r42 + r39
                r42 = r6
                r6 = r39
                long r6 = s0.a.b.e0.z0.f(r6, r12, r2)
                r39 = r2
                long r2 = r36 + r70
                r36 = r4
                r4 = r70
                r12 = 41
                long r4 = s0.a.b.e0.z0.f(r4, r12, r2)
                r70 = r2
                long r2 = r81 + r13
                r12 = 31
                long r13 = s0.a.b.e0.z0.f(r13, r12, r2)
                r81 = r13
                r12 = r75
                long r0 = r0 + r6
                r15 = 44
                long r6 = s0.a.b.e0.z0.f(r6, r15, r0)
                long r10 = r10 + r8
                r15 = 47
                long r8 = s0.a.b.e0.z0.f(r8, r15, r10)
                r15 = 46
                r75 = r8
                long r8 = r36 + r4
                long r4 = s0.a.b.e0.z0.f(r4, r15, r8)
                r15 = 19
                r36 = r6
                long r6 = r42 + r79
                r42 = r4
                r4 = r79
                long r4 = s0.a.b.e0.z0.f(r4, r15, r6)
                r15 = 42
                r79 = r6
                long r6 = r39 + r12
                long r12 = s0.a.b.e0.z0.f(r12, r15, r6)
                long r14 = r70 + r77
                r39 = r6
                r58 = r10
                r6 = r77
                r10 = 44
                long r6 = s0.a.b.e0.z0.f(r6, r10, r14)
                r10 = 25
                r70 = r14
                long r14 = r73 + r68
                r73 = r8
                r8 = r68
                long r8 = s0.a.b.e0.z0.f(r8, r10, r14)
                long r2 = r2 + r4
                r10 = 9
                long r4 = s0.a.b.e0.z0.f(r4, r10, r2)
                r10 = 48
                long r0 = r0 + r6
                long r6 = s0.a.b.e0.z0.f(r6, r10, r0)
                r10 = 35
                r68 = r4
                long r4 = r73 + r12
                long r10 = s0.a.b.e0.z0.f(r12, r10, r4)
                r12 = 52
                r73 = r10
                long r10 = r58 + r8
                long r8 = s0.a.b.e0.z0.f(r8, r12, r10)
                r12 = 23
                r58 = r6
                long r6 = r39 + r42
                r39 = r8
                r8 = r42
                long r8 = s0.a.b.e0.z0.f(r8, r12, r6)
                long r12 = r70 + r36
                r42 = r6
                r6 = r36
                r36 = r4
                r4 = 31
                long r4 = s0.a.b.e0.z0.f(r6, r4, r12)
                long r14 = r14 + r75
                r19 = r12
                r6 = r75
                r12 = 37
                long r6 = s0.a.b.e0.z0.f(r6, r12, r14)
                long r12 = r79 + r81
                r75 = r4
                r70 = r14
                r14 = r81
                r4 = 20
                long r4 = s0.a.b.e0.z0.f(r14, r4, r12)
                r14 = r53[r46]
                long r2 = r2 + r14
                r14 = r53[r31]
                long r8 = r8 + r14
                r14 = r53[r54]
                long r14 = r14 + r0
                r0 = r53[r55]
                long r0 = r0 + r6
                r6 = r53[r63]
                long r6 = r6 + r10
                r10 = r53[r64]
                long r10 = r75 + r10
                r30 = r53[r65]
                long r30 = r36 + r30
                r36 = r53[r66]
                long r4 = r4 + r36
                r36 = r53[r67]
                long r19 = r19 + r36
                r36 = r53[r72]
                long r36 = r39 + r36
                r39 = r53[r45]
                long r39 = r70 + r39
                r45 = r53[r24]
                long r63 = r58 + r45
                r24 = r53[r25]
                long r12 = r12 + r24
                r24 = r53[r61]
                r45 = r60[r62]
                long r24 = r24 + r45
                long r24 = r24 + r73
                r45 = r53[r56]
                r22 = 2
                int r28 = r28 + 2
                r54 = r60[r28]
                long r45 = r45 + r54
                long r45 = r45 + r42
                r28 = 16
                int r27 = r27 + 16
                r27 = r53[r27]
                long r27 = r27 + r33
                r33 = 1
                long r27 = r27 + r33
                long r65 = r27 + r68
                int r27 = r48 + 2
                r57 = r10
                r42 = r12
                r67 = r24
                r10 = r27
                r24 = r30
                r61 = r36
                r36 = r39
                r11 = r8
                r30 = r19
                r8 = r2
                r19 = r6
                r3 = r51
                r2 = r60
                r7 = 13
                r59 = r4
                r4 = r52
                r5 = r0
                r1 = r53
                r0 = r83
                goto L_0x00af
            L_0x0482:
                r2 = r5
                r39 = r8
                r27 = r11
                r33 = r57
                r9 = r59
                r0 = r61
                r11 = r63
                r7 = r65
                r5 = r67
                r4 = 0
                r85[r4] = r39
                r4 = 1
                r85[r4] = r27
                r4 = 2
                r85[r4] = r14
                r85[r16] = r2
                r2 = 4
                r85[r2] = r19
                r2 = 5
                r85[r2] = r33
                r85[r23] = r24
                r85[r26] = r9
                r2 = 8
                r85[r2] = r30
                r2 = 9
                r85[r2] = r0
                r0 = 10
                r85[r0] = r36
                r85[r38] = r11
                r0 = 12
                r85[r0] = r42
                r0 = 13
                r85[r0] = r5
                r85[r47] = r45
                r85[r50] = r7
                return
            L_0x04c3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            L_0x04c9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: s0.a.b.e0.z0.a.b(long[], long[]):void");
        }
    }

    public static final class b extends d {
        public b(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = z0.a;
            int[] iArr2 = z0.c;
            int[] iArr3 = z0.d;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                boolean z = false;
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                int i = 17;
                for (int i2 = 1; i >= i2; i2 = 1) {
                    int i3 = iArr2[i];
                    int i4 = iArr3[i];
                    int i5 = i3 + 1;
                    long j5 = j - jArr3[i5];
                    int i6 = i3 + 2;
                    int i7 = i4 + 1;
                    long j6 = j2 - (jArr3[i6] + jArr4[i7]);
                    int i8 = i3 + 3;
                    long j7 = j3 - (jArr3[i8] + jArr4[i4 + 2]);
                    long j8 = (long) i;
                    long h = z0.h(j4 - ((jArr3[i3 + 4] + j8) + 1), 32, j5);
                    long j9 = j5 - h;
                    int[] iArr4 = iArr2;
                    long h2 = z0.h(j6, 32, j7);
                    long j10 = j7 - h2;
                    long h3 = z0.h(h2, 58, j9);
                    long j11 = j9 - h3;
                    long h4 = z0.h(h, 22, j10);
                    long j12 = j10 - h4;
                    long h5 = z0.h(h4, 46, j11);
                    long j13 = j11 - h5;
                    long h6 = z0.h(h3, 12, j12);
                    long j14 = j12 - h6;
                    long h7 = z0.h(h6, 25, j13);
                    long h8 = z0.h(h5, 33, j14);
                    long j15 = (j13 - h7) - jArr3[i3];
                    long j16 = h7 - (jArr3[i5] + jArr4[i4]);
                    long j17 = (j14 - h8) - (jArr3[i6] + jArr4[i7]);
                    long h9 = z0.h(h8 - (jArr3[i8] + j8), 5, j15);
                    long j18 = j15 - h9;
                    long h10 = z0.h(j16, 37, j17);
                    long j19 = j17 - h10;
                    long h11 = z0.h(h10, 23, j18);
                    long j20 = j18 - h11;
                    long h12 = z0.h(h9, 40, j19);
                    long j21 = j19 - h12;
                    long h13 = z0.h(h12, 52, j20);
                    long j22 = j20 - h13;
                    long h14 = z0.h(h11, 57, j21);
                    long j23 = j21 - h14;
                    long h15 = z0.h(h14, 14, j22);
                    j = j22 - h15;
                    j4 = z0.h(h13, 16, j23);
                    j3 = j23 - j4;
                    i -= 2;
                    j2 = h15;
                    iArr2 = iArr4;
                    iArr3 = iArr3;
                    z = false;
                }
                char c = z;
                long j24 = j2 - (jArr3[1] + jArr4[c]);
                long j25 = j3 - (jArr3[2] + jArr4[1]);
                jArr2[c] = j - jArr3[c];
                jArr2[1] = j24;
                jArr2[2] = j25;
                jArr2[3] = j4 - jArr3[3];
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = z0.a;
            int[] iArr2 = z0.c;
            int[] iArr3 = z0.d;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                long j5 = j + jArr3[0];
                long j6 = jArr3[1] + jArr4[0] + j2;
                long j7 = jArr3[2] + jArr4[1] + j3;
                int i = 1;
                long j8 = j4 + jArr3[3];
                long j9 = j6;
                while (i < 18) {
                    int i2 = iArr2[i];
                    int i3 = iArr3[i];
                    long j10 = j5 + j9;
                    long f = z0.f(j9, 14, j10);
                    long j11 = j7 + j8;
                    long f2 = z0.f(j8, 16, j11);
                    long j12 = j10 + f2;
                    long f3 = z0.f(f2, 52, j12);
                    long j13 = j11 + f;
                    long f4 = z0.f(f, 57, j13);
                    long j14 = j12 + f4;
                    long f5 = z0.f(f4, 23, j14);
                    long j15 = j13 + f3;
                    long f6 = z0.f(f3, 40, j15);
                    long j16 = j14 + f6;
                    long f7 = z0.f(f6, 5, j16);
                    long j17 = j15 + f5;
                    long f8 = z0.f(f5, 37, j17);
                    long j18 = j16 + jArr3[i2];
                    int i4 = i2 + 1;
                    long j19 = jArr3[i4] + jArr4[i3] + f8;
                    int i5 = i2 + 2;
                    int i6 = i3 + 1;
                    long j20 = jArr3[i5] + jArr4[i6] + j17;
                    int i7 = i2 + 3;
                    int[] iArr4 = iArr2;
                    long j21 = (long) i;
                    long j22 = jArr3[i7] + j21 + f7;
                    long j23 = j18 + j19;
                    long f9 = z0.f(j19, 25, j23);
                    long j24 = j21;
                    long j25 = j20 + j22;
                    long f10 = z0.f(j22, 33, j25);
                    long j26 = j23 + f10;
                    long f11 = z0.f(f10, 46, j26);
                    long j27 = j25 + f9;
                    long f12 = z0.f(f9, 12, j27);
                    long j28 = j26 + f12;
                    long f13 = z0.f(f12, 58, j28);
                    long j29 = j27 + f11;
                    long f14 = z0.f(f11, 22, j29);
                    long j30 = j28 + f14;
                    long f15 = z0.f(f14, 32, j30);
                    long j31 = j29 + f13;
                    long f16 = z0.f(f13, 32, j31);
                    j5 = j30 + jArr3[i4];
                    j9 = f16 + jArr3[i5] + jArr4[i6];
                    long j32 = j31 + jArr3[i7] + jArr4[i3 + 2];
                    j8 = jArr3[i2 + 4] + j24 + 1 + f15;
                    i += 2;
                    j7 = j32;
                    iArr2 = iArr4;
                    iArr3 = iArr3;
                }
                jArr2[0] = j5;
                jArr2[1] = j9;
                jArr2[2] = j7;
                jArr2[3] = j8;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static final class c extends d {
        public c(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = z0.a;
            int[] iArr2 = z0.a;
            int[] iArr3 = z0.d;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                boolean z = false;
                long j = jArr[0];
                int i = 1;
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                long j5 = jArr[4];
                long j6 = jArr[5];
                long j7 = jArr[6];
                long j8 = jArr[7];
                int i2 = 17;
                while (i2 >= i) {
                    int i3 = iArr2[i2];
                    int i4 = iArr3[i2];
                    int i5 = i3 + 1;
                    long j9 = j - jArr3[i5];
                    int i6 = i3 + 2;
                    long j10 = j2 - jArr3[i6];
                    int i7 = i3 + 3;
                    long j11 = j3 - jArr3[i7];
                    int i8 = i3 + 4;
                    long j12 = j4 - jArr3[i8];
                    int i9 = i3 + 5;
                    long j13 = j5 - jArr3[i9];
                    int i10 = i3 + 6;
                    int i11 = i4 + 1;
                    long j14 = j6 - (jArr3[i10] + jArr4[i11]);
                    int i12 = i3 + 7;
                    int[] iArr4 = iArr2;
                    int[] iArr5 = iArr3;
                    long j15 = j7 - (jArr3[i12] + jArr4[i4 + 2]);
                    long[] jArr5 = jArr3;
                    long j16 = (long) i2;
                    long j17 = j16;
                    int i13 = i2;
                    long j18 = j12;
                    long h = z0.h(j10, 8, j15);
                    long j19 = j15 - h;
                    long h2 = z0.h(j8 - ((jArr3[i3 + 8] + j16) + 1), 35, j9);
                    long j20 = j9 - h2;
                    long j21 = h2;
                    long j22 = j11;
                    long h3 = z0.h(j14, 56, j22);
                    long j23 = j22 - h3;
                    long h4 = z0.h(j18, 22, j13);
                    long j24 = j13 - h4;
                    long h5 = z0.h(h, 25, j24);
                    long j25 = j24 - h5;
                    long h6 = z0.h(h4, 29, j19);
                    long j26 = j19 - h6;
                    long h7 = z0.h(h3, 39, j20);
                    long j27 = h6;
                    long j28 = j21;
                    long j29 = j20 - h7;
                    long j30 = j23;
                    long h8 = z0.h(j28, 43, j30);
                    long j31 = j30 - h8;
                    long h9 = z0.h(h5, 13, j31);
                    long j32 = j31 - h9;
                    long h10 = z0.h(h8, 50, j25);
                    long j33 = j25 - h10;
                    long h11 = z0.h(h7, 10, j26);
                    long j34 = j26 - h11;
                    long j35 = h10;
                    long j36 = j29;
                    long h12 = z0.h(j27, 17, j36);
                    long j37 = j36 - h12;
                    long h13 = z0.h(h9, 39, j37);
                    long h14 = z0.h(h12, 30, j32);
                    long h15 = z0.h(h11, 34, j33);
                    long j38 = j33 - h15;
                    long j39 = h15;
                    long h16 = z0.h(j35, 24, j34);
                    long j40 = (j37 - h13) - jArr5[i3];
                    long j41 = h13 - jArr5[i5];
                    long j42 = (j32 - h14) - jArr5[i6];
                    long j43 = h14 - jArr5[i7];
                    long j44 = j38 - jArr5[i8];
                    long j45 = j43;
                    long j46 = (j34 - h16) - (jArr5[i10] + jArr4[i11]);
                    long h17 = z0.h(j41, 44, j46);
                    long j47 = j46 - h17;
                    long h18 = z0.h(h16 - (jArr5[i12] + j17), 9, j40);
                    long j48 = j40 - h18;
                    long h19 = z0.h(j39 - (jArr5[i9] + jArr4[i4]), 54, j42);
                    long j49 = j42 - h19;
                    long h20 = z0.h(j45, 56, j44);
                    long j50 = j44 - h20;
                    long h21 = z0.h(h17, 17, j50);
                    long j51 = j50 - h21;
                    long h22 = z0.h(h20, 49, j47);
                    long j52 = j47 - h22;
                    long h23 = z0.h(h19, 36, j48);
                    long j53 = j48 - h23;
                    long j54 = j49;
                    long h24 = z0.h(h18, 39, j54);
                    long j55 = j54 - h24;
                    long h25 = z0.h(h21, 33, j55);
                    long j56 = j55 - h25;
                    long h26 = z0.h(h24, 27, j51);
                    long j57 = j51 - h26;
                    long h27 = z0.h(h23, 14, j52);
                    long[] jArr6 = jArr4;
                    long j58 = j53;
                    long h28 = z0.h(h22, 42, j58);
                    long j59 = j58 - h28;
                    long h29 = z0.h(h25, 46, j59);
                    long j60 = j59 - h29;
                    j4 = z0.h(h28, 36, j56);
                    long h30 = z0.h(h27, 19, j57);
                    j5 = j57 - h30;
                    long j61 = j52 - h27;
                    j8 = z0.h(h26, 37, j61);
                    j7 = j61 - j8;
                    j3 = j56 - j4;
                    j2 = h29;
                    j6 = h30;
                    i2 = i13 - 2;
                    iArr3 = iArr5;
                    jArr3 = jArr5;
                    z = false;
                    i = 1;
                    j = j60;
                    jArr4 = jArr6;
                    iArr2 = iArr4;
                }
                long[] jArr7 = jArr3;
                long[] jArr8 = jArr4;
                char c = z;
                long j62 = j - jArr7[c];
                long j63 = j2 - jArr7[1];
                long j64 = j3 - jArr7[2];
                long j65 = j4 - jArr7[3];
                long j66 = j5 - jArr7[4];
                long j67 = j7 - (jArr7[6] + jArr8[1]);
                jArr2[c] = j62;
                jArr2[1] = j63;
                jArr2[2] = j64;
                jArr2[3] = j65;
                jArr2[4] = j66;
                jArr2[5] = j6 - (jArr7[5] + jArr8[c]);
                jArr2[6] = j67;
                jArr2[7] = j8 - jArr7[7];
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.b;
            long[] jArr4 = this.a;
            int[] iArr = z0.a;
            int[] iArr2 = z0.a;
            int[] iArr3 = z0.d;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            } else if (jArr4.length == 5) {
                long j = jArr[0];
                long j2 = jArr[1];
                long j3 = jArr[2];
                long j4 = jArr[3];
                long j5 = jArr[4];
                long j6 = jArr[5];
                long j7 = jArr[6];
                long j8 = jArr[7];
                long j9 = j + jArr3[0];
                long j10 = j2 + jArr3[1];
                long j11 = j3 + jArr3[2];
                long j12 = j4 + jArr3[3];
                long j13 = j5 + jArr3[4];
                long j14 = jArr3[5] + jArr4[0] + j6;
                long j15 = jArr3[6] + jArr4[1] + j7;
                int i = 1;
                long j16 = j12;
                long j17 = j8 + jArr3[7];
                long j18 = j14;
                while (i < 18) {
                    int i2 = iArr2[i];
                    int i3 = iArr3[i];
                    long j19 = j9 + j10;
                    long f = z0.f(j10, 46, j19);
                    long j20 = j11 + j16;
                    long f2 = z0.f(j16, 36, j20);
                    long[] jArr5 = jArr3;
                    int[] iArr4 = iArr2;
                    long j21 = j18;
                    long j22 = j13 + j21;
                    long f3 = z0.f(j21, 19, j22);
                    long j23 = f2;
                    int i4 = i;
                    long j24 = j17;
                    long j25 = j15 + j24;
                    long f4 = z0.f(j24, 37, j25);
                    long j26 = j20 + f;
                    long f5 = z0.f(f, 33, j26);
                    long j27 = j22 + f4;
                    long f6 = z0.f(f4, 27, j27);
                    long j28 = j25 + f3;
                    long f7 = z0.f(f3, 14, j28);
                    long j29 = f6;
                    long j30 = j19 + j23;
                    long f8 = z0.f(j23, 42, j30);
                    long j31 = j27 + f5;
                    long f9 = z0.f(f5, 17, j31);
                    long j32 = j28 + f8;
                    long f10 = z0.f(f8, 49, j32);
                    long j33 = j30 + f7;
                    long f11 = z0.f(f7, 36, j33);
                    int i5 = i2;
                    long j34 = j26 + j29;
                    long j35 = j31;
                    long f12 = z0.f(j29, 39, j34);
                    long j36 = j32 + f9;
                    long f13 = z0.f(f9, 44, j36);
                    long j37 = j33 + f12;
                    long f14 = z0.f(f12, 9, j37);
                    long j38 = j34 + f11;
                    long f15 = z0.f(f11, 54, j38);
                    long j39 = f14;
                    long j40 = j35 + f10;
                    long f16 = z0.f(f10, 56, j40);
                    long j41 = j37 + jArr5[i5];
                    int i6 = i5 + 1;
                    long j42 = f13 + jArr5[i6];
                    int i7 = i5 + 2;
                    long j43 = j38 + jArr5[i7];
                    int i8 = i5 + 3;
                    long j44 = f16 + jArr5[i8];
                    int i9 = i5 + 4;
                    long j45 = j40 + jArr5[i9];
                    int i10 = i5 + 5;
                    long j46 = jArr5[i10] + jArr4[i3] + f15;
                    int i11 = i5 + 6;
                    int i12 = i3 + 1;
                    long j47 = jArr5[i11] + jArr4[i12] + j36;
                    int i13 = i5 + 7;
                    long j48 = j45;
                    int i14 = i4;
                    long j49 = (long) i14;
                    long j50 = j49;
                    long j51 = jArr5[i13] + j49 + j39;
                    long j52 = j41 + j42;
                    long f17 = z0.f(j42, 39, j52);
                    long j53 = j43 + j44;
                    long f18 = z0.f(j44, 30, j53);
                    int i15 = i13;
                    long j54 = j48 + j46;
                    long f19 = z0.f(j46, 34, j54);
                    long j55 = j52;
                    long j56 = j47 + j51;
                    long f20 = z0.f(j51, 24, j56);
                    long j57 = j53 + f17;
                    long f21 = z0.f(f17, 13, j57);
                    long j58 = j54 + f20;
                    long f22 = z0.f(f20, 50, j58);
                    long j59 = j56 + f19;
                    long f23 = z0.f(f19, 10, j59);
                    long j60 = f22;
                    long j61 = j55 + f18;
                    long f24 = z0.f(f18, 17, j61);
                    long j62 = j58 + f21;
                    long f25 = z0.f(f21, 25, j62);
                    long j63 = j59 + f24;
                    long f26 = z0.f(f24, 29, j63);
                    long j64 = j61 + f23;
                    long f27 = z0.f(f23, 39, j64);
                    long j65 = j57 + j60;
                    long j66 = j62;
                    long f28 = z0.f(j60, 43, j65);
                    long j67 = j63 + f25;
                    long f29 = z0.f(f25, 8, j67);
                    long j68 = j64 + f28;
                    long f30 = z0.f(f28, 35, j68);
                    long j69 = j65 + f27;
                    long f31 = z0.f(f27, 56, j69);
                    long j70 = f30;
                    long j71 = j66 + f26;
                    long f32 = z0.f(f26, 22, j71);
                    j10 = f29 + jArr5[i7];
                    long j72 = j69 + jArr5[i8];
                    long j73 = f32 + jArr5[i9];
                    long j74 = j71 + jArr5[i10];
                    j18 = jArr5[i11] + jArr4[i12] + f31;
                    j15 = jArr5[i15] + jArr4[i3 + 2] + j67;
                    j17 = jArr5[i5 + 8] + j50 + 1 + j70;
                    j13 = j74;
                    iArr2 = iArr4;
                    iArr3 = iArr3;
                    i = i14 + 2;
                    j16 = j73;
                    j11 = j72;
                    j9 = j68 + jArr5[i6];
                    jArr3 = jArr5;
                }
                jArr2[0] = j9;
                jArr2[1] = j10;
                jArr2[2] = j11;
                jArr2[3] = j16;
                jArr2[4] = j13;
                jArr2[5] = j18;
                jArr2[6] = j15;
                jArr2[7] = j17;
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    public static abstract class d {
        public final long[] a;
        public final long[] b;

        public d(long[] jArr, long[] jArr2) {
            this.b = jArr;
            this.a = jArr2;
        }

        public abstract void a(long[] jArr, long[] jArr2);

        public abstract void b(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        a = iArr;
        b = new int[iArr.length];
        c = new int[iArr.length];
        d = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int[] iArr2 = a;
            if (i2 < iArr2.length) {
                b[i2] = i2 % 17;
                iArr2[i2] = i2 % 9;
                c[i2] = i2 % 5;
                d[i2] = i2 % 3;
                i2++;
            } else {
                return;
            }
        }
    }

    public z0(int i2) {
        d dVar;
        long[] jArr = new long[5];
        this.h = jArr;
        int i3 = i2 / 8;
        this.e = i3;
        int i4 = i3 / 8;
        this.f = i4;
        this.g = new long[i4];
        long[] jArr2 = new long[((i4 * 2) + 1)];
        this.i = jArr2;
        if (i2 == 256) {
            dVar = new b(jArr2, jArr);
        } else if (i2 == 512) {
            dVar = new c(jArr2, jArr);
        } else if (i2 == 1024) {
            dVar = new a(jArr2, jArr);
        } else {
            throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
        }
        this.j = dVar;
    }

    public static long c(byte[] bArr, int i2) {
        if (i2 + 8 <= bArr.length) {
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            return ((((long) bArr[i8 + 1]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i3]) & 255) << 8) | ((((long) bArr[i4]) & 255) << 16) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 32) | ((((long) bArr[i7]) & 255) << 40) | ((((long) bArr[i8]) & 255) << 48);
        }
        throw new IllegalArgumentException();
    }

    public static long f(long j2, int i2, long j3) {
        return ((j2 >>> (-i2)) | (j2 << i2)) ^ j3;
    }

    public static void g(long j2, byte[] bArr, int i2) {
        if (i2 + 8 <= bArr.length) {
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) j2);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) (j2 >> 8));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (j2 >> 16));
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((int) (j2 >> 24));
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((int) (j2 >> 32));
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((int) (j2 >> 40));
            bArr[i8] = (byte) ((int) (j2 >> 48));
            bArr[i8 + 1] = (byte) ((int) (j2 >> 56));
            return;
        }
        throw new IllegalArgumentException();
    }

    public static long h(long j2, int i2, long j3) {
        long j4 = j2 ^ j3;
        return (j4 << (-i2)) | (j4 >>> i2);
    }

    public int a(byte[] bArr, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        int i4 = this.e;
        if (i2 + i4 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        } else if (i4 + i3 <= bArr2.length) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.e; i6 += 8) {
                this.g[i6 >> 3] = c(bArr, i2 + i6);
            }
            long[] jArr = this.g;
            e(jArr, jArr);
            while (true) {
                int i7 = this.e;
                if (i5 >= i7) {
                    return i7;
                }
                g(this.g[i5 >> 3], bArr2, i3 + i5);
                i5 += 8;
            }
        } else {
            throw new OutputLengthException("Output buffer too short");
        }
    }

    public int b() {
        return this.e;
    }

    public void d(boolean z, long[] jArr, long[] jArr2) {
        int i2;
        this.k = z;
        if (jArr != null) {
            if (jArr.length == this.f) {
                long j2 = 2004413935125273122L;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (i3 >= i2) {
                        break;
                    }
                    long[] jArr3 = this.i;
                    jArr3[i3] = jArr[i3];
                    j2 ^= jArr3[i3];
                    i3++;
                }
                long[] jArr4 = this.i;
                jArr4[i2] = j2;
                System.arraycopy(jArr4, 0, jArr4, i2 + 1, i2);
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.u0(i0.d.a.a.a.P0("Threefish key must be same size as block ("), this.f, " words)"));
            }
        }
        if (jArr2 == null) {
            return;
        }
        if (jArr2.length == 2) {
            long[] jArr5 = this.h;
            jArr5[0] = jArr2[0];
            jArr5[1] = jArr2[1];
            jArr5[2] = jArr5[0] ^ jArr5[1];
            jArr5[3] = jArr5[0];
            jArr5[4] = jArr5[1];
            return;
        }
        throw new IllegalArgumentException("Tweak must be 2 words.");
    }

    public int e(long[] jArr, long[] jArr2) throws DataLengthException, IllegalStateException {
        long[] jArr3 = this.i;
        int i2 = this.f;
        if (jArr3[i2] == 0) {
            throw new IllegalStateException("Threefish engine not initialised");
        } else if (jArr.length != i2) {
            throw new DataLengthException("Input buffer too short");
        } else if (jArr2.length == i2) {
            if (this.k) {
                this.j.b(jArr, jArr2);
            } else {
                this.j.a(jArr, jArr2);
            }
            return this.f;
        } else {
            throw new OutputLengthException("Output buffer too short");
        }
    }

    public String getAlgorithmName() {
        StringBuilder P0 = i0.d.a.a.a.P0("Threefish-");
        P0.append(this.e * 8);
        return P0.toString();
    }

    public void init(boolean z, i iVar) throws IllegalArgumentException {
        long[] jArr;
        if (iVar instanceof n1) {
            Objects.requireNonNull((n1) iVar);
            throw null;
        } else if (iVar instanceof y0) {
            byte[] bArr = ((y0) iVar).c;
            if (bArr == null) {
                jArr = null;
            } else if (bArr.length == this.e) {
                int i2 = this.f;
                jArr = new long[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    jArr[i3] = c(bArr, i3 * 8);
                }
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.u0(i0.d.a.a.a.P0("Threefish key must be same size as block ("), this.e, " bytes)"));
            }
            d(z, jArr, (long[]) null);
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.L0(iVar, i0.d.a.a.a.P0("Invalid parameter passed to Threefish init - ")));
        }
    }

    public void reset() {
    }
}
