package i0.e.c.f.b.a;

import i0.d.a.a.a;
import java.util.List;
import m0.n.b.f;

/* compiled from: BackchannelChatSegment.kt */
public final class i extends b {
    public final List<c> a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(List<? extends c> list) {
        super((f) null);
        m0.n.b.i.e(list, "messages");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && m0.n.b.i.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("Messages(messages="), this.a, ')');
    }
}
