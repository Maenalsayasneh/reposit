package kotlinx.serialization.internal;

import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import n0.c.i.f;
import n0.c.i.g;
import n0.c.k.u0;
import n0.c.k.v;

/* compiled from: Enums.kt */
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {
    public final g l = g.b.a;
    public final c m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String str, int i) {
        super(str, (v<?>) null, i);
        i.e(str, "name");
        this.m = h.H2(new EnumDescriptor$elementDescriptors$2(this, i, str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.f() == g.b.a && !(i.a(this.i, serialDescriptor.a()) ^ true) && !(i.a(u0.a(this), u0.a(serialDescriptor)) ^ true);
    }

    public g f() {
        return this.l;
    }

    public SerialDescriptor h(int i) {
        return ((SerialDescriptor[]) this.m.getValue())[i];
    }

    public int hashCode() {
        int hashCode = this.i.hashCode();
        i.e(this, "$this$elementNames");
        f.a aVar = new f.a(new f(this));
        int i = 1;
        while (aVar.hasNext()) {
            int i2 = i * 31;
            String str = (String) aVar.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        i.e(this, "$this$elementNames");
        return m0.j.g.E(new f(this), ", ", a.x0(new StringBuilder(), this.i, '('), ")", 0, (CharSequence) null, (l) null, 56);
    }
}
