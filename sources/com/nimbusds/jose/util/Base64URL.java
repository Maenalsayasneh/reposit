package com.nimbusds.jose.util;

import i0.l.a.j.a;
import i0.l.a.j.c;

public class Base64URL extends Base64 {
    public Base64URL(String str) {
        super(str);
    }

    public static Base64URL d(byte[] bArr) {
        String str;
        int i;
        int i2 = 0;
        int length = bArr != null ? bArr.length : 0;
        if (length == 0) {
            str = "";
        } else {
            int i3 = length / 3;
            int i4 = i3 * 3;
            if (length == 0) {
                i = 0;
            } else {
                i = i3 << 2;
                int i5 = length % 3;
                if (i5 != 0) {
                    i = i + i5 + 1;
                }
            }
            byte[] bArr2 = new byte[i];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4) {
                int i8 = i6 + 1;
                int i9 = i8 + 1;
                byte b = ((bArr[i6] & 255) << 16) | ((bArr[i8] & 255) << 8);
                int i10 = i9 + 1;
                byte b2 = b | (bArr[i9] & 255);
                int i11 = i7 + 1;
                bArr2[i7] = a.a((b2 >>> 18) & 63);
                int i12 = i11 + 1;
                bArr2[i11] = a.a((b2 >>> 12) & 63);
                int i13 = i12 + 1;
                bArr2[i12] = a.a((b2 >>> 6) & 63);
                i7 = i13 + 1;
                bArr2[i13] = a.a(b2 & 63);
                i6 = i10;
            }
            int i14 = length - i4;
            if (i14 > 0) {
                int i15 = (bArr[i4] & 255) << 10;
                if (i14 == 2) {
                    i2 = (bArr[length - 1] & 255) << 2;
                }
                int i16 = i15 | i2;
                if (i14 == 2) {
                    bArr2[i - 3] = a.a(i16 >> 12);
                    bArr2[i - 2] = a.a((i16 >>> 6) & 63);
                    bArr2[i - 1] = a.a(i16 & 63);
                } else {
                    bArr2[i - 2] = a.a(i16 >> 12);
                    bArr2[i - 1] = a.a((i16 >>> 6) & 63);
                }
            }
            str = new String(bArr2, c.a);
        }
        return new Base64URL(str);
    }

    public static Base64URL e(String str) {
        if (str == null) {
            return null;
        }
        return new Base64URL(str);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Base64URL) && this.c.equals(obj.toString());
    }
}
