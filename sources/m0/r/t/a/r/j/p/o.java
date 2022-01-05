package m0.r.t.a.r.j.p;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.o0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class o extends g<a> {

    /* compiled from: constantValues.kt */
    public static abstract class a {

        /* renamed from: m0.r.t.a.r.j.p.o$a$a  reason: collision with other inner class name */
        /* compiled from: constantValues.kt */
        public static final class C0271a extends a {
            public final v a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0271a(v vVar) {
                super((f) null);
                i.e(vVar, "type");
                this.a = vVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0271a) && i.a(this.a, ((C0271a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("LocalClass(type=");
                P0.append(this.a);
                P0.append(')');
                return P0.toString();
            }
        }

        /* compiled from: constantValues.kt */
        public static final class b extends a {
            public final f a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(f fVar) {
                super((f) null);
                i.e(fVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                this.a = fVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && i.a(this.a, ((b) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode();
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("NormalClass(value=");
                P0.append(this.a);
                P0.append(')');
                return P0.toString();
            }
        }

        public a() {
        }

        public a(f fVar) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(a aVar) {
        super(aVar);
        i.e(aVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
    }

    public v a(u uVar) {
        v vVar;
        i.e(uVar, "module");
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
        m0.r.t.a.r.c.r0.f fVar = f.a.b;
        m0.r.t.a.r.b.f m = uVar.m();
        Objects.requireNonNull(m);
        d j = m.j(g.a.X.i());
        if (j != null) {
            i.d(j, "module.builtIns.kClass");
            i.e(uVar, "module");
            T t = this.a;
            a aVar = (a) t;
            if (aVar instanceof a.C0271a) {
                vVar = ((a.C0271a) t).a;
            } else if (aVar instanceof a.b) {
                f fVar2 = ((a.b) t).a;
                m0.r.t.a.r.g.a aVar2 = fVar2.a;
                int i = fVar2.b;
                d D0 = h.D0(uVar, aVar2);
                if (D0 == null) {
                    vVar = p.d("Unresolved type: " + aVar2 + " (arrayDimensions=" + i + ')');
                    i.d(vVar, "createErrorType(\"Unresolved type: $classId (arrayDimensions=$arrayDimensions)\")");
                } else {
                    a0 q = D0.q();
                    i.d(q, "descriptor.defaultType");
                    v h3 = m0.r.t.a.r.m.a1.a.h3(q);
                    for (int i2 = 0; i2 < i; i2++) {
                        h3 = uVar.m().h(Variance.INVARIANT, h3);
                        i.d(h3, "module.builtIns.getArrayType(Variance.INVARIANT, type)");
                    }
                    vVar = h3;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return KotlinTypeFactory.e(fVar, j, h.L2(new o0(vVar)));
        }
        m0.r.t.a.r.b.f.a(20);
        throw null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(m0.r.t.a.r.j.p.f r3) {
        /*
            r2 = this;
            java.lang.String r0 = "value"
            m0.n.b.i.e(r3, r0)
            m0.r.t.a.r.j.p.o$a$b r1 = new m0.r.t.a.r.j.p.o$a$b
            r1.<init>(r3)
            m0.n.b.i.e(r1, r0)
            r2.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.j.p.o.<init>(m0.r.t.a.r.j.p.f):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o(m0.r.t.a.r.g.a aVar, int i) {
        this(new f(aVar, i));
        i.e(aVar, "classId");
    }
}
