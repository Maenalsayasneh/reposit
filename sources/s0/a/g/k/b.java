package s0.a.g.k;

import java.io.IOException;
import java.io.OutputStream;

public class b implements c {
    public final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public final byte[] b = new byte[128];

    public b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.a;
            if (i < bArr2.length) {
                this.b[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    public int a(String str, OutputStream outputStream) throws IOException {
        String str2 = str;
        OutputStream outputStream2 = outputStream;
        byte[] bArr = new byte[54];
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!c(str2.charAt(i))) {
                break;
            }
            length = i;
        }
        if (length == 0) {
            return 0;
        }
        int i2 = length;
        int i3 = 0;
        while (i2 > 0 && i3 != 4) {
            i2--;
            if (!c(str2.charAt(i2))) {
                i3++;
            }
        }
        int d = d(str2, 0, i2);
        int i4 = 0;
        int i5 = 0;
        while (d < i2) {
            int i6 = d + 1;
            byte b2 = this.b[str2.charAt(d)];
            int d2 = d(str2, i6, i2);
            int i7 = d2 + 1;
            byte b3 = this.b[str2.charAt(d2)];
            int d3 = d(str2, i7, i2);
            int i8 = d3 + 1;
            byte b4 = this.b[str2.charAt(d3)];
            int d4 = d(str2, i8, i2);
            int i9 = d4 + 1;
            byte b5 = this.b[str2.charAt(d4)];
            if ((b2 | b3 | b4 | b5) >= 0) {
                int i10 = i4 + 1;
                bArr[i4] = (byte) ((b2 << 2) | (b3 >> 4));
                int i11 = i10 + 1;
                bArr[i10] = (byte) ((b3 << 4) | (b4 >> 2));
                i4 = i11 + 1;
                bArr[i11] = (byte) ((b4 << 6) | b5);
                i5 += 3;
                if (i4 == 54) {
                    outputStream2.write(bArr);
                    i4 = 0;
                }
                d = d(str2, i9, i2);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        if (i4 > 0) {
            outputStream2.write(bArr, 0, i4);
        }
        int d5 = d(str2, d, length);
        int d6 = d(str2, d5 + 1, length);
        int d7 = d(str2, d6 + 1, length);
        int d8 = d(str2, d7 + 1, length);
        char charAt = str2.charAt(d5);
        char charAt2 = str2.charAt(d6);
        char charAt3 = str2.charAt(d7);
        char charAt4 = str2.charAt(d8);
        int i12 = 2;
        if (charAt3 == '=') {
            if (charAt4 == '=') {
                byte[] bArr2 = this.b;
                byte b6 = bArr2[charAt];
                byte b7 = bArr2[charAt2];
                if ((b6 | b7) >= 0) {
                    outputStream2.write((b7 >> 4) | (b6 << 2));
                    i12 = 1;
                } else {
                    throw new IOException("invalid characters encountered at end of base64 data");
                }
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        } else if (charAt4 == '=') {
            byte[] bArr3 = this.b;
            byte b8 = bArr3[charAt];
            byte b9 = bArr3[charAt2];
            byte b10 = bArr3[charAt3];
            if ((b8 | b9 | b10) >= 0) {
                outputStream2.write((b8 << 2) | (b9 >> 4));
                outputStream2.write((b10 >> 2) | (b9 << 4));
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        } else {
            byte[] bArr4 = this.b;
            byte b11 = bArr4[charAt];
            byte b12 = bArr4[charAt2];
            byte b13 = bArr4[charAt3];
            byte b14 = bArr4[charAt4];
            if ((b11 | b12 | b13 | b14) >= 0) {
                outputStream2.write((b11 << 2) | (b12 >> 4));
                outputStream2.write((b12 << 4) | (b13 >> 2));
                outputStream2.write(b14 | (b13 << 6));
                i12 = 3;
            } else {
                throw new IOException("invalid characters encountered at end of base64 data");
            }
        }
        return i5 + i12;
    }

    public int b(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        byte[] bArr2 = new byte[72];
        int i3 = i;
        int i4 = i2;
        while (i4 > 0) {
            int min = Math.min(54, i4);
            int i5 = i3 + min;
            int i6 = i5 - 2;
            int i7 = i3;
            int i8 = 0;
            while (i7 < i6) {
                int i9 = i7 + 1;
                byte b2 = bArr[i7];
                int i10 = i9 + 1;
                byte b3 = bArr[i9] & 255;
                int i11 = i10 + 1;
                byte b4 = bArr[i10] & 255;
                int i12 = i8 + 1;
                byte[] bArr3 = this.a;
                bArr2[i8] = bArr3[(b2 >>> 2) & 63];
                int i13 = i12 + 1;
                bArr2[i12] = bArr3[((b2 << 4) | (b3 >>> 4)) & 63];
                int i14 = i13 + 1;
                bArr2[i13] = bArr3[((b3 << 2) | (b4 >>> 6)) & 63];
                i8 = i14 + 1;
                bArr2[i14] = bArr3[b4 & 63];
                i7 = i11;
            }
            int i15 = min - (i7 - i3);
            if (i15 == 1) {
                byte b5 = bArr[i7] & 255;
                int i16 = i8 + 1;
                byte[] bArr4 = this.a;
                bArr2[i8] = bArr4[(b5 >>> 2) & 63];
                int i17 = i16 + 1;
                bArr2[i16] = bArr4[(b5 << 4) & 63];
                int i18 = i17 + 1;
                bArr2[i17] = 61;
                i8 = i18 + 1;
                bArr2[i18] = 61;
            } else if (i15 == 2) {
                int i19 = i7 + 1;
                byte b6 = bArr[i7] & 255;
                byte b7 = bArr[i19] & 255;
                int i20 = i8 + 1;
                byte[] bArr5 = this.a;
                bArr2[i8] = bArr5[(b6 >>> 2) & 63];
                int i21 = i20 + 1;
                bArr2[i20] = bArr5[((b6 << 4) | (b7 >>> 4)) & 63];
                int i22 = i21 + 1;
                bArr2[i21] = bArr5[(b7 << 2) & 63];
                i8 = i22 + 1;
                bArr2[i22] = 61;
            }
            outputStream.write(bArr2, 0, i8 - 0);
            i4 -= min;
            i3 = i5;
        }
        return ((i4 + 2) / 3) * 4;
    }

    public final boolean c(char c) {
        return c == 10 || c == 13 || c == 9 || c == ' ';
    }

    public final int d(String str, int i, int i2) {
        while (i < i2 && c(str.charAt(i))) {
            i++;
        }
        return i;
    }
}
