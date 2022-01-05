package i0.e.b.g3.r;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ValidateNumberWithCallViewModel.kt */
public final class o1 implements b {
    public final String a;

    public o1() {
        this((String) null, 1);
    }

    public o1(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1) && i.a(this.a, ((o1) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.w0(a.P0("NavigateBack(message="), this.a, ')');
    }

    public o1(String str, int i) {
        int i2 = i & 1;
        this.a = null;
    }
}
