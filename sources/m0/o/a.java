package m0.o;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import m0.r.k;

/* compiled from: Delegates.kt */
public final class a<T> implements d<Object, T> {
    public T a;

    public T getValue(Object obj, k<?> kVar) {
        i.e(kVar, "property");
        T t = this.a;
        if (t != null) {
            return t;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Property ");
        P0.append(kVar.getName());
        P0.append(" should be initialized before get.");
        throw new IllegalStateException(P0.toString());
    }

    public void setValue(Object obj, k<?> kVar, T t) {
        i.e(kVar, "property");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.a = t;
    }
}
