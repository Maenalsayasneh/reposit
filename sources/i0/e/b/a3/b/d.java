package i0.e.b.a3.b;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: BaseViewModel.kt */
public final class d implements b {
    public final String a;

    public d() {
        this((String) null, 1);
    }

    public d(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && i.a(this.a, ((d) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.w0(a.P0("ShowError(message="), this.a, ')');
    }

    public d(String str, int i) {
        int i2 = i & 1;
        this.a = null;
    }
}
