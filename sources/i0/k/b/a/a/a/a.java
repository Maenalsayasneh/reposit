package i0.k.b.a.a.a;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import n0.c.b;
import q0.f0;
import t0.h;

/* compiled from: DeserializationStrategyConverter.kt */
public final class a<T> implements h<f0, T> {
    public final b<T> a;
    public final d b;

    public a(b<T> bVar, d dVar) {
        i.e(bVar, "loader");
        i.e(dVar, "serializer");
        this.a = bVar;
        this.b = dVar;
    }

    public Object a(Object obj) {
        f0 f0Var = (f0) obj;
        i.e(f0Var, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        return this.b.a(this.a, f0Var);
    }
}
