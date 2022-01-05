package n0.c.l;

import i0.j.f.p.h;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.c;
import m0.n.a.a;
import m0.n.b.i;
import n0.c.i.g;

/* compiled from: JsonElementSerializers.kt */
public final class f implements SerialDescriptor {
    public final c a;
    public final /* synthetic */ a b;

    public f(a aVar) {
        this.b = aVar;
        this.a = h.H2(aVar);
    }

    public String a() {
        return b().a();
    }

    public final SerialDescriptor b() {
        return (SerialDescriptor) this.a.getValue();
    }

    public boolean c() {
        return false;
    }

    public int d(String str) {
        i.e(str, "name");
        return b().d(str);
    }

    public int e() {
        return b().e();
    }

    public g f() {
        return b().f();
    }

    public String g(int i) {
        return b().g(i);
    }

    public SerialDescriptor h(int i) {
        return b().h(i);
    }

    public boolean isInline() {
        return false;
    }
}
