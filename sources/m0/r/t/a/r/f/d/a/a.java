package m0.r.t.a.r.f.d.a;

import m0.n.b.i;

/* compiled from: BitEncoding */
public class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    public static byte[] a(String[] strArr) {
        int i;
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                String[] b = b(strArr);
                i.e(b, "strings");
                int i2 = 0;
                for (String length : b) {
                    i2 += length.length();
                }
                byte[] bArr = new byte[i2];
                int length2 = b.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    String str = b[i3];
                    i3++;
                    int length3 = str.length() - 1;
                    if (length3 >= 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            i = i4 + 1;
                            bArr[i4] = (byte) str.charAt(i5);
                            if (i5 == length3) {
                                break;
                            }
                            i5 = i6;
                            i4 = i;
                        }
                        i4 = i;
                    }
                }
                return bArr;
            } else if (charAt == 65535) {
                strArr = b(strArr);
            }
        }
        int i7 = 0;
        for (String length4 : strArr) {
            i7 += length4.length();
        }
        byte[] bArr2 = new byte[i7];
        int i8 = 0;
        for (String str2 : strArr) {
            int length5 = str2.length();
            int i9 = 0;
            while (i9 < length5) {
                bArr2[i8] = (byte) str2.charAt(i9);
                i9++;
                i8++;
            }
        }
        for (int i10 = 0; i10 < i7; i10++) {
            bArr2[i10] = (byte) ((bArr2[i10] + Byte.MAX_VALUE) & 127);
        }
        int i11 = (i7 * 7) / 8;
        byte[] bArr3 = new byte[i11];
        int i12 = 0;
        byte b2 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12++;
            int i14 = b2 + 1;
            bArr3[i13] = (byte) (((bArr2[i12] & 255) >>> b2) + ((bArr2[i12] & ((1 << i14) - 1)) << (7 - b2)));
            if (b2 == 6) {
                i12++;
                b2 = 0;
            } else {
                b2 = i14;
            }
        }
        return bArr3;
    }

    public static String[] b(String[] strArr) {
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
