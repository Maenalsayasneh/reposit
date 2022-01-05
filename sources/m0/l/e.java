package m0.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.coroutines.CoroutineContext$plus$1;
import kotlin.coroutines.EmptyCoroutineContext;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: CoroutineContext.kt */
public interface e {

    /* compiled from: CoroutineContext.kt */
    public interface a extends e {

        /* renamed from: m0.l.e$a$a  reason: collision with other inner class name */
        /* compiled from: CoroutineContext.kt */
        public static final class C0242a {
            public static <R> R a(a aVar, R r, p<? super R, ? super a, ? extends R> pVar) {
                i.e(pVar, "operation");
                return pVar.invoke(r, aVar);
            }

            public static <E extends a> E b(a aVar, b<E> bVar) {
                i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                if (i.a(aVar.getKey(), bVar)) {
                    return aVar;
                }
                return null;
            }

            public static e c(a aVar, b<?> bVar) {
                i.e(bVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                return i.a(aVar.getKey(), bVar) ? EmptyCoroutineContext.c : aVar;
            }

            public static e d(a aVar, e eVar) {
                i.e(eVar, "context");
                i.e(eVar, "context");
                return eVar == EmptyCoroutineContext.c ? aVar : (e) eVar.fold(aVar, CoroutineContext$plus$1.c);
            }
        }

        <E extends a> E get(b<E> bVar);

        b<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface b<E extends a> {
    }

    <R> R fold(R r, p<? super R, ? super a, ? extends R> pVar);

    <E extends a> E get(b<E> bVar);

    e minusKey(b<?> bVar);

    e plus(e eVar);
}
