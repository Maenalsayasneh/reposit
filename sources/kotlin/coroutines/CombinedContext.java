package kotlin.coroutines;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.io.Serializable;
import java.util.Objects;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CoroutineContextImpl.kt */
public final class CombinedContext implements e, Serializable {
    public final e c;
    public final e.a d;

    public CombinedContext(e eVar, e.a aVar) {
        i.e(eVar, "left");
        i.e(aVar, "element");
        this.c = eVar;
        this.d = aVar;
    }

    public final int c() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            e eVar = combinedContext.c;
            if (!(eVar instanceof CombinedContext)) {
                eVar = null;
            }
            combinedContext = (CombinedContext) eVar;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof CombinedContext)) {
                return false;
            }
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.c() != c()) {
                return false;
            }
            Objects.requireNonNull(combinedContext);
            CombinedContext combinedContext2 = this;
            while (true) {
                e.a aVar = combinedContext2.d;
                if (i.a(combinedContext.get(aVar.getKey()), aVar)) {
                    e eVar = combinedContext2.c;
                    if (!(eVar instanceof CombinedContext)) {
                        Objects.requireNonNull(eVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        e.a aVar2 = (e.a) eVar;
                        z = i.a(combinedContext.get(aVar2.getKey()), aVar2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) eVar;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, p<? super R, ? super e.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return pVar.invoke(this.c.fold(r, pVar), this.d);
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        CombinedContext combinedContext = this;
        while (true) {
            E e = combinedContext.d.get(bVar);
            if (e != null) {
                return e;
            }
            e eVar = combinedContext.c;
            if (!(eVar instanceof CombinedContext)) {
                return eVar.get(bVar);
            }
            combinedContext = (CombinedContext) eVar;
        }
    }

    public int hashCode() {
        return this.d.hashCode() + this.c.hashCode();
    }

    public e minusKey(e.b<?> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        if (this.d.get(bVar) != null) {
            return this.c;
        }
        e minusKey = this.c.minusKey(bVar);
        if (minusKey == this.c) {
            return this;
        }
        if (minusKey == EmptyCoroutineContext.c) {
            return this.d;
        }
        return new CombinedContext(minusKey, this.d);
    }

    public e plus(e eVar) {
        i.e(eVar, "context");
        i.e(eVar, "context");
        if (eVar == EmptyCoroutineContext.c) {
            return this;
        }
        return (e) eVar.fold(this, CoroutineContext$plus$1.c);
    }

    public String toString() {
        return a.y0(a.P0("["), (String) fold("", CombinedContext$toString$1.c), "]");
    }
}
