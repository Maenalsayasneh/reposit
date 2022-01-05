package i0.h.a.b.g.h;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class e2 {
    public static final g2 a;

    static {
        g2 g2Var;
        if (!(d2.h && d2.g) || p.a()) {
            g2Var = new f2();
        } else {
            g2Var = new h2();
        }
        a = g2Var;
    }

    public static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int b(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        byte b2 = -1;
        if (i3 == 0) {
            if (b > -12) {
                b = -1;
            }
            return b;
        } else if (i3 == 1) {
            byte b3 = bArr[i];
            if (b <= -12 && b3 <= -65) {
                b2 = b ^ (b3 << 8);
            }
            return b2;
        } else if (i3 == 2) {
            return a(b, bArr[i], bArr[i + 1]);
        } else {
            throw new AssertionError();
        }
    }
}
