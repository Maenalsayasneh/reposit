package okio;

import com.google.android.gms.recaptcha.RecaptchaActionType;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.j.f.p.h;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import m0.n.b.f;
import m0.n.b.i;
import r0.a0.b;

/* compiled from: ByteString.kt */
public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString c = new ByteString(new byte[0]);
    public static final a d = new a((f) null);
    public transient int q;
    public transient String x;
    public final byte[] y;

    /* compiled from: ByteString.kt */
    public static final class a {
        public a(f fVar) {
        }

        public static ByteString d(a aVar, byte[] bArr, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = bArr.length;
            }
            i.e(bArr, "$this$toByteString");
            m0.r.t.a.r.m.a1.a.A0((long) bArr.length, (long) i, (long) i2);
            int i4 = i2 + i;
            i.e(bArr, "$this$copyOfRangeImpl");
            h.X(i4, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i4);
            i.d(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
            return new ByteString(copyOfRange);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
            r6 = r1 - 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.ByteString a(java.lang.String r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "$this$decodeBase64"
                m0.n.b.i.e(r0, r1)
                byte[] r1 = r0.a.a
                java.lang.String r1 = "$this$decodeBase64ToArray"
                m0.n.b.i.e(r0, r1)
                int r1 = r17.length()
            L_0x0012:
                r2 = 9
                r3 = 32
                r4 = 13
                r5 = 10
                if (r1 <= 0) goto L_0x0031
                int r6 = r1 + -1
                char r7 = r0.charAt(r6)
                r8 = 61
                if (r7 == r8) goto L_0x002f
                if (r7 == r5) goto L_0x002f
                if (r7 == r4) goto L_0x002f
                if (r7 == r3) goto L_0x002f
                if (r7 == r2) goto L_0x002f
                goto L_0x0031
            L_0x002f:
                r1 = r6
                goto L_0x0012
            L_0x0031:
                long r6 = (long) r1
                r8 = 6
                long r6 = r6 * r8
                r8 = 8
                long r6 = r6 / r8
                int r6 = (int) r6
                byte[] r7 = new byte[r6]
                r8 = 0
                r9 = r8
                r10 = r9
                r11 = r10
            L_0x003f:
                r12 = 0
                if (r8 >= r1) goto L_0x00aa
                char r13 = r0.charAt(r8)
                r14 = 90
                r15 = 65
                if (r15 <= r13) goto L_0x004d
                goto L_0x0052
            L_0x004d:
                if (r14 < r13) goto L_0x0052
                int r13 = r13 + -65
                goto L_0x008a
            L_0x0052:
                r14 = 122(0x7a, float:1.71E-43)
                r15 = 97
                if (r15 <= r13) goto L_0x0059
                goto L_0x005e
            L_0x0059:
                if (r14 < r13) goto L_0x005e
                int r13 = r13 + -71
                goto L_0x008a
            L_0x005e:
                r14 = 57
                r15 = 48
                if (r15 <= r13) goto L_0x0065
                goto L_0x006a
            L_0x0065:
                if (r14 < r13) goto L_0x006a
                int r13 = r13 + 4
                goto L_0x008a
            L_0x006a:
                r14 = 43
                if (r13 == r14) goto L_0x0088
                r14 = 45
                if (r13 != r14) goto L_0x0073
                goto L_0x0088
            L_0x0073:
                r14 = 47
                if (r13 == r14) goto L_0x0085
                r14 = 95
                if (r13 != r14) goto L_0x007c
                goto L_0x0085
            L_0x007c:
                if (r13 == r5) goto L_0x00a7
                if (r13 == r4) goto L_0x00a7
                if (r13 == r3) goto L_0x00a7
                if (r13 != r2) goto L_0x00de
                goto L_0x00a7
            L_0x0085:
                r13 = 63
                goto L_0x008a
            L_0x0088:
                r13 = 62
            L_0x008a:
                int r10 = r10 << 6
                r10 = r10 | r13
                int r9 = r9 + 1
                int r12 = r9 % 4
                if (r12 != 0) goto L_0x00a7
                int r12 = r11 + 1
                int r13 = r10 >> 16
                byte r13 = (byte) r13
                r7[r11] = r13
                int r11 = r12 + 1
                int r13 = r10 >> 8
                byte r13 = (byte) r13
                r7[r12] = r13
                int r12 = r11 + 1
                byte r13 = (byte) r10
                r7[r11] = r13
                r11 = r12
            L_0x00a7:
                int r8 = r8 + 1
                goto L_0x003f
            L_0x00aa:
                int r9 = r9 % 4
                r0 = 1
                if (r9 == r0) goto L_0x00de
                r0 = 2
                if (r9 == r0) goto L_0x00c7
                r0 = 3
                if (r9 == r0) goto L_0x00b6
                goto L_0x00d1
            L_0x00b6:
                int r0 = r10 << 6
                int r1 = r11 + 1
                int r2 = r0 >> 16
                byte r2 = (byte) r2
                r7[r11] = r2
                int r11 = r1 + 1
                int r0 = r0 >> 8
                byte r0 = (byte) r0
                r7[r1] = r0
                goto L_0x00d1
            L_0x00c7:
                int r0 = r10 << 12
                int r1 = r11 + 1
                int r0 = r0 >> 16
                byte r0 = (byte) r0
                r7[r11] = r0
                r11 = r1
            L_0x00d1:
                if (r11 != r6) goto L_0x00d4
                goto L_0x00df
            L_0x00d4:
                byte[] r7 = java.util.Arrays.copyOf(r7, r11)
                java.lang.String r0 = "java.util.Arrays.copyOf(this, newSize)"
                m0.n.b.i.d(r7, r0)
                goto L_0x00df
            L_0x00de:
                r7 = r12
            L_0x00df:
                if (r7 == 0) goto L_0x00e6
                okio.ByteString r12 = new okio.ByteString
                r12.<init>(r7)
            L_0x00e6:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.a.a(java.lang.String):okio.ByteString");
        }

        public final ByteString b(String str) {
            i.e(str, "$this$decodeHex");
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i * 2;
                    bArr[i] = (byte) (b.a(str.charAt(i2 + 1)) + (b.a(str.charAt(i2)) << 4));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(i0.d.a.a.a.n0("Unexpected hex string: ", str).toString());
        }

        public final ByteString c(String str) {
            i.e(str, "$this$encodeUtf8");
            i.e(str, "$this$asUtf8ToByteArray");
            byte[] bytes = str.getBytes(m0.t.a.a);
            i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.x = str;
            return byteString;
        }
    }

    public ByteString(byte[] bArr) {
        i.e(bArr, MessageExtension.FIELD_DATA);
        this.y = bArr;
    }

    public String a() {
        byte[] bArr = this.y;
        byte[] bArr2 = r0.a.a;
        byte[] bArr3 = r0.a.a;
        i.e(bArr, "$this$encodeBase64");
        i.e(bArr3, "map");
        byte[] bArr4 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            int i5 = i4 + 1;
            byte b3 = bArr[i4];
            int i6 = i2 + 1;
            bArr4[i2] = bArr3[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr4[i6] = bArr3[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr4[i7] = bArr3[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr4[i8] = bArr3[b3 & 63];
            i = i5;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            int i9 = i2 + 1;
            bArr4[i2] = bArr3[(b4 & 255) >> 2];
            int i10 = i9 + 1;
            bArr4[i9] = bArr3[(b4 & 3) << 4];
            byte b5 = (byte) 61;
            bArr4[i10] = b5;
            bArr4[i10 + 1] = b5;
        } else if (length2 == 2) {
            int i11 = i + 1;
            byte b6 = bArr[i];
            byte b7 = bArr[i11];
            int i12 = i2 + 1;
            bArr4[i2] = bArr3[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr4[i12] = bArr3[((b6 & 3) << 4) | ((b7 & 255) >> 4)];
            bArr4[i13] = bArr3[(b7 & 15) << 2];
            bArr4[i13 + 1] = (byte) 61;
        }
        i.e(bArr4, "$this$toUtf8String");
        return new String(bArr4, m0.t.a.a);
    }

    public ByteString b(String str) {
        i.e(str, "algorithm");
        byte[] digest = MessageDigest.getInstance(str).digest(this.y);
        i.d(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new ByteString(digest);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r6 < r7) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 < r1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            okio.ByteString r9 = (okio.ByteString) r9
            java.lang.String r0 = "other"
            m0.n.b.i.e(r9, r0)
            int r0 = r8.e()
            int r1 = r9.e()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            r5 = -1
            if (r4 >= r2) goto L_0x002c
            byte r6 = r8.i(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.i(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0029
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 >= r7) goto L_0x0033
            goto L_0x0031
        L_0x002c:
            if (r0 != r1) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            if (r0 >= r1) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(java.lang.Object):int");
    }

    public int e() {
        return this.y.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int e = byteString.e();
            byte[] bArr = this.y;
            if (e == bArr.length && byteString.n(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.y;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = b.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte[] g() {
        return this.y;
    }

    public int hashCode() {
        int i = this.q;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.y);
        this.q = hashCode;
        return hashCode;
    }

    public byte i(int i) {
        return this.y[i];
    }

    public boolean l(int i, ByteString byteString, int i2, int i3) {
        i.e(byteString, RecaptchaActionType.OTHER);
        return byteString.n(i2, this.y, i, i3);
    }

    public boolean n(int i, byte[] bArr, int i2, int i3) {
        i.e(bArr, RecaptchaActionType.OTHER);
        if (i >= 0) {
            byte[] bArr2 = this.y;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && m0.r.t.a.r.m.a1.a.T(bArr2, i, bArr, i2, i3);
        }
    }

    public ByteString q() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.y;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                i.d(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0125, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0163, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0176, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0187, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0196, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01ac, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01b4, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01bb, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01f0, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01f3, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e8, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00fb, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x010a, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x011c, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.y
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02d1
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0014:
            r6 = 64
            if (r3 >= r2) goto L_0x01f4
            byte r7 = r1[r3]
            r8 = 10
            r9 = 13
            r10 = 159(0x9f, float:2.23E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 31
            r14 = 65533(0xfffd, float:9.1831E-41)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r7 < 0) goto L_0x007f
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0031
            goto L_0x01f4
        L_0x0031:
            if (r7 == r8) goto L_0x0043
            if (r7 == r9) goto L_0x0043
            if (r7 < 0) goto L_0x0039
            if (r12 >= r7) goto L_0x003e
        L_0x0039:
            if (r11 <= r7) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            if (r10 < r7) goto L_0x0040
        L_0x003e:
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x01f3
        L_0x0043:
            if (r7 != r14) goto L_0x0047
            goto L_0x01f3
        L_0x0047:
            if (r7 >= r15) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 2
        L_0x004c:
            int r5 = r5 + r4
            int r3 = r3 + 1
        L_0x004f:
            r4 = r16
            if (r3 >= r2) goto L_0x0014
            byte r7 = r1[r3]
            if (r7 < 0) goto L_0x0014
            int r7 = r3 + 1
            byte r3 = r1[r3]
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0061
            goto L_0x01f4
        L_0x0061:
            if (r3 == r8) goto L_0x0073
            if (r3 == r9) goto L_0x0073
            if (r3 < 0) goto L_0x0069
            if (r12 >= r3) goto L_0x006e
        L_0x0069:
            if (r11 <= r3) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            if (r10 < r3) goto L_0x0070
        L_0x006e:
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 != 0) goto L_0x01f3
        L_0x0073:
            if (r3 != r14) goto L_0x0077
            goto L_0x01f3
        L_0x0077:
            if (r3 >= r15) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 2
        L_0x007c:
            int r5 = r5 + r3
            r3 = r7
            goto L_0x004f
        L_0x007f:
            int r14 = r7 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x00da
            int r7 = r3 + 1
            if (r2 > r7) goto L_0x008e
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x008e:
            byte r14 = r1[r3]
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0098
            r15 = 1
            goto L_0x0099
        L_0x0098:
            r15 = 0
        L_0x0099:
            if (r15 != 0) goto L_0x009f
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x009f:
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r14 = r14 << 6
            r7 = r7 ^ r14
            if (r7 >= r13) goto L_0x00aa
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00aa:
            int r13 = r4 + 1
            if (r4 != r6) goto L_0x00b0
            goto L_0x01f4
        L_0x00b0:
            if (r7 == r8) goto L_0x00c2
            if (r7 == r9) goto L_0x00c2
            if (r7 < 0) goto L_0x00b8
            if (r12 >= r7) goto L_0x00bd
        L_0x00b8:
            if (r11 <= r7) goto L_0x00bb
            goto L_0x00bf
        L_0x00bb:
            if (r10 < r7) goto L_0x00bf
        L_0x00bd:
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            if (r4 != 0) goto L_0x01f3
        L_0x00c2:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x00c9
            goto L_0x01f3
        L_0x00c9:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x00d1
            r4 = 1
            r16 = r4
            goto L_0x00d3
        L_0x00d1:
            r16 = 2
        L_0x00d3:
            int r5 = r5 + r16
            int r3 = r3 + 2
            r4 = r13
            goto L_0x0014
        L_0x00da:
            int r10 = r7 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r15) goto L_0x015b
            int r7 = r3 + 2
            if (r2 > r7) goto L_0x00ec
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00ec:
            byte r10 = r1[r3]
            int r14 = r3 + 1
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x00f8
            r15 = 1
            goto L_0x00f9
        L_0x00f8:
            r15 = 0
        L_0x00f9:
            if (r15 != 0) goto L_0x00ff
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00ff:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0107
            r13 = 1
            goto L_0x0108
        L_0x0107:
            r13 = 0
        L_0x0108:
            if (r13 != 0) goto L_0x010e
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x010e:
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r13
            int r13 = r14 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L_0x0120
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0120:
            if (r11 <= r7) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            if (r12 < r7) goto L_0x0129
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0129:
            int r10 = r4 + 1
            if (r4 != r6) goto L_0x012f
            goto L_0x01f4
        L_0x012f:
            if (r7 == r8) goto L_0x0147
            if (r7 == r9) goto L_0x0147
            if (r7 < 0) goto L_0x0139
            r4 = 31
            if (r4 >= r7) goto L_0x0142
        L_0x0139:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x0144
        L_0x0142:
            r4 = 1
            goto L_0x0145
        L_0x0144:
            r4 = 0
        L_0x0145:
            if (r4 != 0) goto L_0x01f3
        L_0x0147:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x014e
            goto L_0x01f3
        L_0x014e:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x0154
            r13 = 1
            goto L_0x0155
        L_0x0154:
            r13 = 2
        L_0x0155:
            int r5 = r5 + r13
            int r3 = r3 + 3
            r4 = r10
            goto L_0x0014
        L_0x015b:
            int r7 = r7 >> 3
            if (r7 != r15) goto L_0x01f0
            int r7 = r3 + 3
            if (r2 > r7) goto L_0x0167
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0167:
            byte r9 = r1[r3]
            int r10 = r3 + 1
            byte r10 = r1[r10]
            r14 = r10 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L_0x0173
            r14 = 1
            goto L_0x0174
        L_0x0173:
            r14 = 0
        L_0x0174:
            if (r14 != 0) goto L_0x017a
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x017a:
            int r14 = r3 + 2
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0184
            r15 = 1
            goto L_0x0185
        L_0x0184:
            r15 = 0
        L_0x0185:
            if (r15 != 0) goto L_0x018b
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x018b:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0193
            r13 = 1
            goto L_0x0194
        L_0x0193:
            r13 = 0
        L_0x0194:
            if (r13 != 0) goto L_0x019a
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x019a:
            r13 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r13
            int r13 = r14 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            int r9 = r9 << 18
            r7 = r7 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r9) goto L_0x01af
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01af:
            if (r11 <= r7) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            if (r12 < r7) goto L_0x01b7
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01b7:
            r9 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r9) goto L_0x01be
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01be:
            int r9 = r4 + 1
            if (r4 != r6) goto L_0x01c3
            goto L_0x01f4
        L_0x01c3:
            if (r7 == r8) goto L_0x01dd
            r4 = 13
            if (r7 == r4) goto L_0x01dd
            if (r7 < 0) goto L_0x01cf
            r4 = 31
            if (r4 >= r7) goto L_0x01d8
        L_0x01cf:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x01d4
            goto L_0x01da
        L_0x01d4:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x01da
        L_0x01d8:
            r4 = 1
            goto L_0x01db
        L_0x01da:
            r4 = 0
        L_0x01db:
            if (r4 != 0) goto L_0x01f3
        L_0x01dd:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x01e3
            goto L_0x01f3
        L_0x01e3:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x01e9
            r13 = 1
            goto L_0x01ea
        L_0x01e9:
            r13 = 2
        L_0x01ea:
            int r5 = r5 + r13
            int r3 = r3 + 4
            r4 = r9
            goto L_0x0014
        L_0x01f0:
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01f3:
            r5 = -1
        L_0x01f4:
            java.lang.String r1 = "…]"
            r2 = 93
            java.lang.String r3 = "[size="
            r4 = -1
            if (r5 != r4) goto L_0x0276
            byte[] r4 = r0.y
            int r4 = r4.length
            if (r4 > r6) goto L_0x0218
            java.lang.String r1 = "[hex="
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r3 = r17.f()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x02d1
        L_0x0218:
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r3)
            byte[] r3 = r0.y
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " hex="
            r2.append(r3)
            byte[] r3 = r0.y
            int r4 = r3.length
            if (r6 > r4) goto L_0x022e
            r4 = 1
            goto L_0x022f
        L_0x022e:
            r4 = 0
        L_0x022f:
            if (r4 == 0) goto L_0x025d
            int r4 = r3.length
            if (r6 != r4) goto L_0x0236
            r4 = r0
            goto L_0x024e
        L_0x0236:
            okio.ByteString r4 = new okio.ByteString
            java.lang.String r5 = "$this$copyOfRangeImpl"
            m0.n.b.i.e(r3, r5)
            int r5 = r3.length
            i0.j.f.p.h.X(r6, r5)
            r5 = 0
            byte[] r3 = java.util.Arrays.copyOfRange(r3, r5, r6)
            java.lang.String r5 = "java.util.Arrays.copyOfR…this, fromIndex, toIndex)"
            m0.n.b.i.d(r3, r5)
            r4.<init>(r3)
        L_0x024e:
            java.lang.String r3 = r4.f()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02d1
        L_0x025d:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            byte[] r2 = r0.y
            int r2 = r2.length
            r3 = 41
            java.lang.String r1 = i0.d.a.a.a.s0(r1, r2, r3)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x0276:
            java.lang.String r4 = r17.v()
            r6 = 0
            java.lang.String r7 = r4.substring(r6, r5)
            java.lang.String r8 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            m0.n.b.i.d(r7, r8)
            java.lang.String r8 = "\\"
            java.lang.String r9 = "\\\\"
            r10 = 4
            java.lang.String r7 = kotlin.text.StringsKt__IndentKt.B(r7, r8, r9, r6, r10)
            java.lang.String r8 = "\n"
            java.lang.String r9 = "\\n"
            java.lang.String r7 = kotlin.text.StringsKt__IndentKt.B(r7, r8, r9, r6, r10)
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            java.lang.String r6 = kotlin.text.StringsKt__IndentKt.B(r7, r8, r9, r6, r10)
            int r4 = r4.length()
            if (r5 >= r4) goto L_0x02bd
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r3)
            byte[] r3 = r0.y
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " text="
            r2.append(r3)
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02d1
        L_0x02bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[text="
            r1.append(r3)
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02d1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }

    public String v() {
        String str = this.x;
        if (str != null) {
            return str;
        }
        byte[] g = g();
        i.e(g, "$this$toUtf8String");
        String str2 = new String(g, m0.t.a.a);
        this.x = str2;
        return str2;
    }

    public void w(r0.f fVar, int i, int i2) {
        i.e(fVar, "buffer");
        i.e(this, "$this$commonWrite");
        i.e(fVar, "buffer");
        fVar.H(this.y, i, i2);
    }
}
