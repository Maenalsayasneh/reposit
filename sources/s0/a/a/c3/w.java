package s0.a.a.c3;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentMap;
import s0.a.a.b3.c;
import s0.a.a.d;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.u0;
import s0.a.a.z;

public class w extends m implements d {
    public e c;
    public int d;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r3 == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r8 == false) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0138  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.d = r8
            r0 = 1
            if (r8 == r0) goto L_0x014c
            r1 = 2
            if (r8 == r1) goto L_0x014c
            r1 = 6
            if (r8 != r1) goto L_0x0010
            goto L_0x014c
        L_0x0010:
            r1 = 8
            if (r8 != r1) goto L_0x001b
            s0.a.a.n r8 = new s0.a.a.n
            r8.<init>((java.lang.String) r9)
            goto L_0x0151
        L_0x001b:
            r2 = 4
            if (r8 != r2) goto L_0x0025
            s0.a.a.b3.c r8 = new s0.a.a.b3.c
            r8.<init>(r9)
            goto L_0x0151
        L_0x0025:
            r3 = 7
            if (r8 != r3) goto L_0x0140
            java.lang.String r8 = "/"
            int r3 = r9.indexOf(r8)
            int r4 = r3 + 1
            java.lang.String r4 = r9.substring(r4)
            r5 = 0
            if (r3 <= 0) goto L_0x0058
            java.lang.String r3 = r9.substring(r5, r3)
            boolean r3 = s0.a.e.b.b0.c.h3.R1(r3)
            if (r3 == 0) goto L_0x0058
            boolean r3 = s0.a.e.b.b0.c.h3.R1(r4)
            if (r3 != 0) goto L_0x0056
            r3 = 128(0x80, float:1.794E-43)
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0053 }
            if (r4 < 0) goto L_0x0053
            if (r4 > r3) goto L_0x0053
            r3 = r0
            goto L_0x0054
        L_0x0053:
            r3 = r5
        L_0x0054:
            if (r3 == 0) goto L_0x0058
        L_0x0056:
            r3 = r0
            goto L_0x0059
        L_0x0058:
            r3 = r5
        L_0x0059:
            r4 = 32
            r6 = 47
            if (r3 != 0) goto L_0x00e0
            boolean r3 = s0.a.e.b.b0.c.h3.R1(r9)
            if (r3 == 0) goto L_0x0067
            goto L_0x00e0
        L_0x0067:
            int r8 = r9.indexOf(r8)
            int r3 = r8 + 1
            java.lang.String r3 = r9.substring(r3)
            if (r8 <= 0) goto L_0x0092
            java.lang.String r8 = r9.substring(r5, r8)
            boolean r8 = s0.a.e.b.b0.c.h3.Q1(r8)
            if (r8 == 0) goto L_0x0092
            boolean r8 = s0.a.e.b.b0.c.h3.Q1(r3)
            if (r8 != 0) goto L_0x0090
            int r8 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x008d }
            if (r8 < 0) goto L_0x008d
            if (r8 > r4) goto L_0x008d
            r8 = r0
            goto L_0x008e
        L_0x008d:
            r8 = r5
        L_0x008e:
            if (r8 == 0) goto L_0x0092
        L_0x0090:
            r8 = r0
            goto L_0x0093
        L_0x0092:
            r8 = r5
        L_0x0093:
            if (r8 != 0) goto L_0x009f
            boolean r8 = s0.a.e.b.b0.c.h3.Q1(r9)
            if (r8 == 0) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            r8 = 0
            goto L_0x012e
        L_0x009f:
            int r8 = r9.indexOf(r6)
            if (r8 >= 0) goto L_0x00ac
            byte[] r8 = new byte[r2]
            r7.u(r9, r8, r5)
            goto L_0x012e
        L_0x00ac:
            byte[] r1 = new byte[r1]
            java.lang.String r3 = r9.substring(r5, r8)
            r7.u(r3, r1, r5)
            int r8 = r8 + r0
            java.lang.String r8 = r9.substring(r8)
            r9 = 46
            int r9 = r8.indexOf(r9)
            if (r9 <= 0) goto L_0x00c6
            r7.u(r8, r1, r2)
            goto L_0x00de
        L_0x00c6:
            int r8 = java.lang.Integer.parseInt(r8)
        L_0x00ca:
            if (r5 == r8) goto L_0x00de
            int r9 = r5 / 8
            int r9 = r9 + r2
            byte r3 = r1[r9]
            int r4 = r5 % 8
            int r4 = 7 - r4
            int r4 = r0 << r4
            r3 = r3 | r4
            byte r3 = (byte) r3
            r1[r9] = r3
            int r5 = r5 + 1
            goto L_0x00ca
        L_0x00de:
            r8 = r1
            goto L_0x012e
        L_0x00e0:
            int r8 = r9.indexOf(r6)
            r2 = 16
            if (r8 >= 0) goto L_0x00f2
            byte[] r8 = new byte[r2]
            int[] r9 = r7.v(r9)
            r7.s(r9, r8, r5)
            goto L_0x012e
        L_0x00f2:
            byte[] r3 = new byte[r4]
            java.lang.String r4 = r9.substring(r5, r8)
            int[] r4 = r7.v(r4)
            r7.s(r4, r3, r5)
            int r8 = r8 + r0
            java.lang.String r8 = r9.substring(r8)
            r9 = 58
            int r9 = r8.indexOf(r9)
            if (r9 <= 0) goto L_0x0111
            int[] r8 = r7.v(r8)
            goto L_0x012a
        L_0x0111:
            int[] r9 = new int[r1]
            int r8 = java.lang.Integer.parseInt(r8)
        L_0x0117:
            if (r5 == r8) goto L_0x0129
            int r1 = r5 / 16
            r4 = r9[r1]
            int r6 = r5 % 16
            int r6 = 15 - r6
            int r6 = r0 << r6
            r4 = r4 | r6
            r9[r1] = r4
            int r5 = r5 + 1
            goto L_0x0117
        L_0x0129:
            r8 = r9
        L_0x012a:
            r7.s(r8, r3, r2)
            r8 = r3
        L_0x012e:
            if (r8 == 0) goto L_0x0138
            s0.a.a.x0 r9 = new s0.a.a.x0
            r9.<init>((byte[]) r8)
            r7.c = r9
            goto L_0x0153
        L_0x0138:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "IP Address is invalid"
            r8.<init>(r9)
            throw r8
        L_0x0140:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "can't process String for tag: "
            java.lang.String r8 = i0.d.a.a.a.e0(r0, r8)
            r9.<init>(r8)
            throw r9
        L_0x014c:
            s0.a.a.u0 r8 = new s0.a.a.u0
            r8.<init>((java.lang.String) r9)
        L_0x0151:
            r7.c = r8
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.a.c3.w.<init>(int, java.lang.String):void");
    }

    public w(int i, e eVar) {
        this.c = eVar;
        this.d = i;
    }

    public w(c cVar) {
        this.c = cVar;
        this.d = 4;
    }

    public static w t(Object obj) {
        u0 u0Var;
        n nVar;
        if (obj == null || (obj instanceof w)) {
            return (w) obj;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            int i = zVar.c;
            switch (i) {
                case 0:
                case 3:
                case 5:
                    return new w(i, (e) s.C(zVar, false));
                case 1:
                case 2:
                case 6:
                    r C = zVar.C();
                    if (C instanceof u0) {
                        u0Var = u0.B(C);
                    } else {
                        u0Var = new u0(o.B(C).c);
                    }
                    return new w(i, (e) u0Var);
                case 4:
                    s0.a.a.b3.d dVar = c.c;
                    return new w(i, (e) c.s(s.C(zVar, true)));
                case 7:
                    return new w(i, (e) o.C(zVar, false));
                case 8:
                    ConcurrentMap<n.a, n> concurrentMap = n.c;
                    r C2 = zVar.C();
                    if (C2 instanceof n) {
                        nVar = n.D(C2);
                    } else {
                        byte[] bArr = o.B(C2).c;
                        n nVar2 = (n) n.c.get(new n.a(bArr));
                        if (nVar2 == null) {
                            nVar2 = new n(bArr);
                        }
                        nVar = nVar2;
                    }
                    return new w(i, (e) nVar);
                default:
                    throw new IllegalArgumentException(a.e0("unknown tag: ", i));
            }
        } else if (obj instanceof byte[]) {
            try {
                return t(r.x((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("unable to parse encoded general name");
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("unknown object in getInstance: ")));
        }
    }

    public r c() {
        int i = this.d;
        return new e1(i == 4, i, this.c);
    }

    public final void s(int[] iArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 != iArr.length; i2++) {
            int i3 = i2 * 2;
            bArr[i3 + i] = (byte) (iArr[i2] >> 8);
            bArr[i3 + 1 + i] = (byte) iArr[i2];
        }
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.d);
        stringBuffer.append(": ");
        int i = this.d;
        if (!(i == 1 || i == 2)) {
            if (i == 4) {
                str = c.s(this.c).toString();
            } else if (i != 6) {
                str = this.c.toString();
            }
            stringBuffer.append(str);
            return stringBuffer.toString();
        }
        str = u0.B(this.c).e();
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public final void u(String str, byte[] bArr, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i2 + i] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i2++;
        }
    }

    public final int[] v(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":", true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i = -1;
        int i2 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(":")) {
                iArr[i2] = 0;
                int i3 = i2;
                i2++;
                i = i3;
            } else if (nextToken.indexOf(46) < 0) {
                int i4 = i2 + 1;
                iArr[i2] = Integer.parseInt(nextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i2 = i4;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(nextToken, ".");
                int i5 = i2 + 1;
                iArr[i2] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i2 = i5 + 1;
                iArr[i5] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i2 != 8) {
            int i6 = i2 - i;
            int i7 = 8 - i6;
            System.arraycopy(iArr, i, iArr, i7, i6);
            while (i != i7) {
                iArr[i] = 0;
                i++;
            }
        }
        return iArr;
    }
}
