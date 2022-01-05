package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;
import s0.a.g.k.f;

public class f1 extends r implements y {
    public final byte[] c;

    public f1(String str) {
        String str2 = j.a;
        this.c = j.f(str.toCharArray());
    }

    public f1(byte[] bArr) {
        this.c = bArr;
    }

    public static f1 B(Object obj) {
        if (obj == null || (obj instanceof f1)) {
            return (f1) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (f1) r.x((byte[]) obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(a.b0(e, a.P0("encoding error in getInstance: ")));
            }
        } else {
            throw new IllegalArgumentException(a.c0(obj, a.P0("illegal object in getInstance: ")));
        }
    }

    public String e() {
        byte[] bArr = this.c;
        String str = j.a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = f.a;
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                short s = f.a[b & Byte.MAX_VALUE];
                int i4 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 < 0) {
                        if (b2 == -2) {
                            break;
                        }
                        if (i4 <= 65535) {
                            if (i2 >= length) {
                                break;
                            }
                            cArr[i2] = (char) i4;
                            i2++;
                        } else if (i2 >= length - 1) {
                            break;
                        } else {
                            int i5 = i2 + 1;
                            cArr[i2] = (char) ((i4 >>> 10) + 55232);
                            i2 = i5 + 1;
                            cArr[i5] = (char) ((i4 & 1023) | 56320);
                        }
                        i = i3;
                    } else if (i3 >= bArr.length) {
                        break loop0;
                    } else {
                        int i6 = i3 + 1;
                        byte b3 = bArr[i3];
                        i4 = (i4 << 6) | (b3 & 63);
                        b2 = f.b[b2 + ((b3 & 255) >>> 4)];
                        i3 = i6;
                    }
                }
            } else if (i2 >= length) {
                break;
            } else {
                cArr[i2] = (char) b;
                i = i3;
                i2++;
            }
        }
        i2 = -1;
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof f1)) {
            return false;
        }
        return Arrays.equals(this.c, ((f1) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 12, this.c);
    }

    public String toString() {
        return e();
    }

    public int u() throws IOException {
        return a2.a(this.c.length) + 1 + this.c.length;
    }

    public boolean y() {
        return false;
    }
}
