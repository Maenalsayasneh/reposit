package kotlin.reflect.jvm.internal;

import i0.j.f.p.h;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.o;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.m.v;

/* compiled from: KClassImpl.kt */
public final class KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1 extends Lambda implements a<Type> {
    public final /* synthetic */ v c;
    public final /* synthetic */ KClassImpl$Data$supertypes$2 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$supertypes$2$$special$$inlined$mapTo$lambda$1(v vVar, KClassImpl$Data$supertypes$2 kClassImpl$Data$supertypes$2) {
        super(0);
        this.c = vVar;
        this.d = kClassImpl$Data$supertypes$2;
    }

    public Object invoke() {
        f c2 = this.c.I0().c();
        if (c2 instanceof d) {
            Class<?> h = o.h((d) c2);
            if (h == null) {
                StringBuilder P0 = i0.d.a.a.a.P0("Unsupported superclass of ");
                P0.append(this.d.c);
                P0.append(": ");
                P0.append(c2);
                throw new KotlinReflectionInternalError(P0.toString());
            } else if (i.a(KClassImpl.this.y.getSuperclass(), h)) {
                Type genericSuperclass = KClassImpl.this.y.getGenericSuperclass();
                i.d(genericSuperclass, "jClass.genericSuperclass");
                return genericSuperclass;
            } else {
                Class[] interfaces = KClassImpl.this.y.getInterfaces();
                i.d(interfaces, "jClass.interfaces");
                int Y1 = h.Y1(interfaces, h);
                if (Y1 >= 0) {
                    Type type = KClassImpl.this.y.getGenericInterfaces()[Y1];
                    i.d(type, "jClass.genericInterfaces[index]");
                    return type;
                }
                StringBuilder P02 = i0.d.a.a.a.P0("No superclass of ");
                P02.append(this.d.c);
                P02.append(" in Java reflection for ");
                P02.append(c2);
                throw new KotlinReflectionInternalError(P02.toString());
            }
        } else {
            throw new KotlinReflectionInternalError("Supertype not a class: " + c2);
        }
    }
}
