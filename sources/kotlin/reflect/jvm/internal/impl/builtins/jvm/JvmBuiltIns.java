package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.j.g;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.b.k.e;
import m0.r.t.a.r.c.s0.b;
import m0.r.t.a.r.c.s0.c;
import m0.r.t.a.r.c.t0.v;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;

/* compiled from: JvmBuiltIns.kt */
public final class JvmBuiltIns extends f {
    public static final /* synthetic */ k<Object>[] f = {m.c(new PropertyReference1Impl(m.a(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    public m0.n.a.a<a> g;
    public final h h;

    /* compiled from: JvmBuiltIns.kt */
    public enum Kind {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* compiled from: JvmBuiltIns.kt */
    public static final class a {
        public final u a;
        public final boolean b;

        public a(u uVar, boolean z) {
            i.e(uVar, "ownerModuleDescriptor");
            this.a = uVar;
            this.b = z;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(l lVar, Kind kind) {
        super(lVar);
        i.e(lVar, "storageManager");
        i.e(kind, "kind");
        this.h = ((LockBasedStorageManager) lVar).d(new JvmBuiltIns$customizer$2(this, lVar));
        int ordinal = kind.ordinal();
        if (ordinal == 1) {
            d(false);
        } else if (ordinal == 2) {
            d(true);
        }
    }

    public final JvmBuiltInsCustomizer O() {
        return (JvmBuiltInsCustomizer) i0.j.f.p.h.K1(this.h, f[0]);
    }

    public m0.r.t.a.r.c.s0.a e() {
        return O();
    }

    public Iterable l() {
        Iterable<b> l = super.l();
        i.d(l, "super.getClassDescriptorFactories()");
        l lVar = this.e;
        if (lVar != null) {
            i.d(lVar, "storageManager");
            v vVar = this.b;
            if (vVar != null) {
                i.d(vVar, "builtInsModule");
                return g.Y(l, new e(lVar, vVar, (m0.n.a.l) null, 4));
            }
            f.a(6);
            throw null;
        }
        f.a(5);
        throw null;
    }

    public c q() {
        return O();
    }
}
