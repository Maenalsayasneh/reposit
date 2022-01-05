package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.FunctionReference;
import m0.n.a.p;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.i;

/* compiled from: IntersectionType.kt */
public final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 extends FunctionReference implements p<v, v, Boolean> {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(i iVar) {
        super(2, iVar);
    }

    public final String getName() {
        return "equalTypes";
    }

    public final f getOwner() {
        return m.a(i.class);
    }

    public final String getSignature() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        v vVar2 = (v) obj2;
        m0.n.b.i.e(vVar, "p0");
        m0.n.b.i.e(vVar2, "p1");
        return Boolean.valueOf(((i) this.receiver).b(vVar, vVar2));
    }
}
