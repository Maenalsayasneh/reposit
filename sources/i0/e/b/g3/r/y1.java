package i0.e.b.g3.r;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CollectUsernameViewModel.kt */
public final class y1 implements c {
    public final String a;

    public y1(String str) {
        i.e(str, "username");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && i.a(this.a, ((y1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("SuggestedUsernameSelected(username="), this.a, ')');
    }
}
