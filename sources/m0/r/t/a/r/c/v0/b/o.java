package m0.r.t.a.r.c.v0.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaAnnotationArguments.kt */
public final class o extends c implements m0.r.t.a.r.e.a.w.o {
    public final Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(d dVar, Object obj) {
        super(dVar);
        i.e(obj, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.b = obj;
    }

    public Object getValue() {
        return this.b;
    }
}
