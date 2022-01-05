package com.nimbusds.jose.util;

import i0.l.a.j.a;
import i0.l.a.j.c;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Arrays;

public class Base64 implements Serializable {
    public final String c;

    public Base64(String str) {
        if (str != null) {
            this.c = str;
            return;
        }
        throw new IllegalArgumentException("The Base64 value must not be null");
    }

    public byte[] a() {
        char c2;
        String str = this.c;
        int i = 0;
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        byte[] bytes = str.getBytes(c.a);
        int length = bytes.length;
        long j = (((long) length) * 6) >> 3;
        int i2 = (int) j;
        if (((long) i2) == j) {
            byte[] bArr = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            while (i3 < bytes.length) {
                int i5 = i;
                int i6 = i5;
                while (i5 < 4 && i3 < length) {
                    int i7 = i3 + 1;
                    byte b = bytes[i3];
                    int c3 = a.c(b, 64) & a.d(b, 91);
                    int c4 = a.c(b, 96) & a.d(b, 123);
                    int c5 = a.c(b, 47) & a.d(b, 58);
                    int b2 = a.b(b, 43) | a.b(b, 45);
                    int b3 = a.b(b, 47) | a.b(b, 95);
                    byte[] bArr2 = bytes;
                    int e = a.e(c3, (b - 65) + 0, 0) | a.e(c4, (b - 97) + 26, 0) | a.e(c5, (b - 48) + 52, 0) | a.e(b2, 62, 0) | a.e(b3, 63, 0) | a.e(c3 | c4 | c5 | b2 | b3, 0, -1);
                    if (e >= 0) {
                        i6 |= e << (18 - (i5 * 6));
                        i5++;
                    }
                    i3 = i7;
                    bytes = bArr2;
                }
                byte[] bArr3 = bytes;
                if (i5 >= 2) {
                    int i8 = i4 + 1;
                    bArr[i4] = (byte) (i6 >> 16);
                    c2 = 3;
                    if (i5 >= 3) {
                        i4 = i8 + 1;
                        bArr[i8] = (byte) (i6 >> 8);
                        if (i5 >= 4) {
                            i8 = i4 + 1;
                            bArr[i4] = (byte) i6;
                        }
                    }
                    i4 = i8;
                } else {
                    c2 = 3;
                }
                char c6 = c2;
                bytes = bArr3;
                i = 0;
            }
            return Arrays.copyOf(bArr, i4);
        }
        throw new IllegalArgumentException(j + " cannot be cast to int without changing its value.");
    }

    public BigInteger b() {
        return new BigInteger(1, a());
    }

    public String c() {
        return new String(a(), c.a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Base64) && this.c.equals(obj.toString());
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return this.c;
    }
}
