package kotlin.reflect.jvm.internal.impl.builtins;

import i0.j.f.p.h;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import m0.c;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: PrimitiveType.kt */
public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final a Companion = null;
    public static final Set<PrimitiveType> NUMBER_TYPES = null;
    private final c arrayTypeFqName$delegate;
    private final d arrayTypeName;
    private final c typeFqName$delegate;
    private final d typeName;

    /* compiled from: PrimitiveType.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        PrimitiveType primitiveType;
        PrimitiveType primitiveType2;
        PrimitiveType primitiveType3;
        PrimitiveType primitiveType4;
        PrimitiveType primitiveType5;
        PrimitiveType primitiveType6;
        PrimitiveType primitiveType7;
        Companion = new a((f) null);
        NUMBER_TYPES = g.h0(primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7);
    }

    private PrimitiveType(String str) {
        d g = d.g(str);
        i.d(g, "identifier(typeName)");
        this.typeName = g;
        d g2 = d.g(i.k(str, "Array"));
        i.d(g2, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = g2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = h.G2(lazyThreadSafetyMode, new PrimitiveType$typeFqName$2(this));
        this.arrayTypeFqName$delegate = h.G2(lazyThreadSafetyMode, new PrimitiveType$arrayTypeFqName$2(this));
    }

    public final b getArrayTypeFqName() {
        return (b) this.arrayTypeFqName$delegate.getValue();
    }

    public final d getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final b getTypeFqName() {
        return (b) this.typeFqName$delegate.getValue();
    }

    public final d getTypeName() {
        return this.typeName;
    }
}
