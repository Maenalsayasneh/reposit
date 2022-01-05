package m0.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CoroutineContextImpl.kt */
public abstract class a implements e.a {
    private final e.b<?> key;

    public a(e.b<?> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        this.key = bVar;
    }

    public <R> R fold(R r, p<? super R, ? super e.a, ? extends R> pVar) {
        i.e(pVar, "operation");
        return e.a.C0242a.a(this, r, pVar);
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return e.a.C0242a.b(this, bVar);
    }

    public e.b<?> getKey() {
        return this.key;
    }

    public e minusKey(e.b<?> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return e.a.C0242a.c(this, bVar);
    }

    public e plus(e eVar) {
        i.e(eVar, "context");
        return e.a.C0242a.d(this, eVar);
    }
}
