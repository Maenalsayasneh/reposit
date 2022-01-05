package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Objects;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.h;

/* compiled from: IntersectionType.kt */
public final /* synthetic */ class TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 extends FunctionReference implements p<v, v, Boolean> {
    public TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(TypeIntersector typeIntersector) {
        super(2, typeIntersector);
    }

    public final String getName() {
        return "isStrictSupertype";
    }

    public final f getOwner() {
        return m.a(TypeIntersector.class);
    }

    public final String getSignature() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }

    public Object invoke(Object obj, Object obj2) {
        v vVar = (v) obj;
        v vVar2 = (v) obj2;
        i.e(vVar, "p0");
        i.e(vVar2, "p1");
        Objects.requireNonNull((TypeIntersector) this.receiver);
        Objects.requireNonNull(h.b);
        m0.r.t.a.r.m.x0.i iVar = h.a.b;
        return Boolean.valueOf(iVar.d(vVar, vVar2) && !iVar.d(vVar2, vVar));
    }
}
