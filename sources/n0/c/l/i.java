package n0.c.l;

import kotlinx.serialization.json.JsonPrimitive;
import m0.n.b.f;
import m0.n.b.m;
import n0.c.l.q.u;

/* compiled from: JsonElement.kt */
public final class i extends JsonPrimitive {
    public final String a;
    public final boolean b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Object obj, boolean z) {
        super((f) null);
        m0.n.b.i.e(obj, "body");
        this.b = z;
        this.a = obj.toString();
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (!m0.n.b.i.a(m.a(i.class), m.a(obj.getClass())))) {
            return false;
        }
        i iVar = (i) obj;
        return this.b == iVar.b && !(m0.n.b.i.a(this.a, iVar.a) ^ true);
    }

    public int hashCode() {
        return this.a.hashCode() + (Boolean.valueOf(this.b).hashCode() * 31);
    }

    public String toString() {
        if (!this.b) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        u.a(sb, this.a);
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
