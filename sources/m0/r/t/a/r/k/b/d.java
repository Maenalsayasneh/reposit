package m0.r.t.a.r.k.b;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.f.c.a;
import m0.r.t.a.r.f.c.c;

/* compiled from: ClassData.kt */
public final class d {
    public final c a;
    public final ProtoBuf$Class b;
    public final a c;
    public final h0 d;

    public d(c cVar, ProtoBuf$Class protoBuf$Class, a aVar, h0 h0Var) {
        i.e(cVar, "nameResolver");
        i.e(protoBuf$Class, "classProto");
        i.e(aVar, "metadataVersion");
        i.e(h0Var, "sourceElement");
        this.a = cVar;
        this.b = protoBuf$Class;
        this.c = aVar;
        this.d = h0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.b, dVar.b) && i.a(this.c, dVar.c) && i.a(this.d, dVar.d);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClassData(nameResolver=");
        P0.append(this.a);
        P0.append(", classProto=");
        P0.append(this.b);
        P0.append(", metadataVersion=");
        P0.append(this.c);
        P0.append(", sourceElement=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }
}
