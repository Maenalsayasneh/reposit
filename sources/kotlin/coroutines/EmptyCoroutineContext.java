package kotlin.coroutines;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Serializable;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CoroutineContextImpl.kt */
public final class EmptyCoroutineContext implements e, Serializable {
    public static final EmptyCoroutineContext c = new EmptyCoroutineContext();

    public <R> R fold(R r, p<? super R, ? super e.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return r;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public e minusKey(e.b<?> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return this;
    }

    public e plus(e eVar) {
        i.e(eVar, "context");
        return eVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
