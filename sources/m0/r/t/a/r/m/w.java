package m0.r.t.a.r.m;

import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$refine$1;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.x0.e;

/* compiled from: SpecialTypes.kt */
public final class w extends w0 {
    public final l d;
    public final a<v> q;
    public final h<v> x;

    public w(l lVar, a<? extends v> aVar) {
        i.e(lVar, "storageManager");
        i.e(aVar, "computation");
        this.d = lVar;
        this.q = aVar;
        this.x = lVar.d(aVar);
    }

    public v K0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return new w(this.d, new LazyWrappedType$refine$1(eVar, this));
    }

    public v M0() {
        return (v) this.x.invoke();
    }

    public boolean N0() {
        LockBasedStorageManager.h hVar = (LockBasedStorageManager.h) this.x;
        return (hVar.q == LockBasedStorageManager.NotValue.NOT_COMPUTED || hVar.q == LockBasedStorageManager.NotValue.COMPUTING) ? false : true;
    }
}
