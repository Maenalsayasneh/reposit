package i0.e.b.g3.n;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CreateChannelViewModel.kt */
public final class v implements c {
    public final String a;

    public v(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && i.a(this.a, ((v) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.w0(a.P0("SetTopic(topic="), this.a, ')');
    }
}
