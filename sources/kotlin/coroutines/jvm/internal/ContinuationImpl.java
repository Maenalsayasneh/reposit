package kotlin.coroutines.jvm.internal;

import m0.l.c;
import m0.l.d;
import m0.l.e;
import m0.l.f.a.a;
import m0.n.b.i;

/* compiled from: ContinuationImpl.kt */
public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final e _context;
    private transient c<Object> intercepted;

    public ContinuationImpl(c<Object> cVar, e eVar) {
        super(cVar);
        this._context = eVar;
    }

    public e getContext() {
        e eVar = this._context;
        i.c(eVar);
        return eVar;
    }

    public final c<Object> intercepted() {
        c<Object> cVar = this.intercepted;
        if (cVar == null) {
            e context = getContext();
            int i = d.h;
            d dVar = (d) context.get(d.a.c);
            if (dVar == null || (cVar = dVar.k(this)) == null) {
                cVar = this;
            }
            this.intercepted = cVar;
        }
        return cVar;
    }

    public void releaseIntercepted() {
        c<Object> cVar = this.intercepted;
        if (!(cVar == null || cVar == this)) {
            e context = getContext();
            int i = d.h;
            e.a aVar = context.get(d.a.c);
            i.c(aVar);
            ((d) aVar).f(cVar);
        }
        this.intercepted = a.c;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
