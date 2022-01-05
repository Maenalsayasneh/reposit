package i0.h.a.b.g.h;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class h1 implements w0 {
    public final y0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public h1(y0 y0Var, String str, Object[] objArr) {
        this.a = y0Var;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.d = c2 | (charAt2 << i);
                return;
            }
        }
    }

    public final int a() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    public final boolean d() {
        return (this.d & 2) == 2;
    }

    public final y0 h() {
        return this.a;
    }
}
