package n0.c.l.q;

import i0.d.a.a.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.d;
import n0.c.b;
import n0.c.i.g;
import n0.c.i.h;
import n0.c.m.c;

/* compiled from: PolymorphismValidator.kt */
public final class q implements c {
    public final boolean a;
    public final String b;

    public q(boolean z, String str) {
        i.e(str, "discriminator");
        this.a = z;
        this.b = str;
    }

    public <T> void a(d<T> dVar, KSerializer<T> kSerializer) {
        i.e(dVar, "kClass");
        i.e(kSerializer, "serializer");
    }

    public <Base, Sub extends Base> void b(d<Base> dVar, d<Sub> dVar2, KSerializer<Sub> kSerializer) {
        i.e(dVar, "baseClass");
        i.e(dVar2, "actualClass");
        i.e(kSerializer, "actualSerializer");
        SerialDescriptor descriptor = kSerializer.getDescriptor();
        g f = descriptor.f();
        if ((f instanceof n0.c.i.c) || i.a(f, g.a.a)) {
            StringBuilder P0 = a.P0("Serializer for ");
            P0.append(dVar2.e());
            P0.append(" can't be registered as a subclass for polymorphic serialization ");
            P0.append("because its kind ");
            P0.append(f);
            P0.append(" is not concrete. To work with multiple hierarchies, register it as a base class.");
            throw new IllegalArgumentException(P0.toString());
        } else if (!this.a && (i.a(f, h.b.a) || i.a(f, h.c.a) || (f instanceof n0.c.i.d) || (f instanceof g.b))) {
            StringBuilder P02 = a.P0("Serializer for ");
            P02.append(dVar2.e());
            P02.append(" of kind ");
            P02.append(f);
            P02.append(" cannot be serialized polymorphically with class discriminator.");
            throw new IllegalArgumentException(P02.toString());
        } else if (!this.a) {
            int e = descriptor.e();
            int i = 0;
            while (i < e) {
                String g = descriptor.g(i);
                if (!i.a(g, this.b)) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Polymorphic serializer for ");
                    sb.append(dVar2);
                    sb.append(" has property '");
                    sb.append(g);
                    sb.append("' that conflicts ");
                    throw new IllegalArgumentException(a.z0(sb, "with JSON class discriminator. You can either change class discriminator in JsonConfiguration, ", "rename property with @SerialName annotation ", "or fall back to array polymorphism"));
                }
            }
        }
    }

    public <Base> void c(d<Base> dVar, l<? super String, ? extends b<? extends Base>> lVar) {
        i.e(dVar, "baseClass");
        i.e(lVar, "defaultSerializerProvider");
    }
}
