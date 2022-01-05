package n0.a;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher$Key$1;
import m0.l.b;
import m0.l.c;
import m0.l.d;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.h2.g;

/* compiled from: CoroutineDispatcher.kt */
public abstract class d0 extends m0.l.a implements d {
    public static final a c = new a((f) null);

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends b<d, d0> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super(d.a.c, CoroutineDispatcher$Key$1.c);
            int i = d.h;
        }
    }

    public d0() {
        super(d.a.c);
    }

    public abstract void I(e eVar, Runnable runnable);

    public void O(e eVar, Runnable runnable) {
        I(eVar, runnable);
    }

    public boolean Q(e eVar) {
        return !(this instanceof a2);
    }

    public final void f(c<?> cVar) {
        ((g) cVar).k();
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            e.b<?> key = getKey();
            i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            if (!(key == bVar2 || bVar2.c == key)) {
                return null;
            }
            i.e(this, "element");
            E e = (e.a) bVar2.d.invoke(this);
            if (!(e instanceof e.a)) {
                return null;
            }
            return e;
        } else if (d.a.c == bVar) {
            return this;
        } else {
            return null;
        }
    }

    public final <T> c<T> k(c<? super T> cVar) {
        return new g(this, cVar);
    }

    public e minusKey(e.b<?> bVar) {
        i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        if (bVar instanceof b) {
            b bVar2 = (b) bVar;
            e.b<?> key = getKey();
            i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            if (key == bVar2 || bVar2.c == key) {
                i.e(this, "element");
                if (((e.a) bVar2.d.invoke(this)) != null) {
                    return EmptyCoroutineContext.c;
                }
            }
        } else if (d.a.c == bVar) {
            return EmptyCoroutineContext.c;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + m0.r.t.a.r.m.a1.a.M1(this);
    }
}
