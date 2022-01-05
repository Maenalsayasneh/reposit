package m0.r.t.a.r.e.a.t;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.f;

/* compiled from: AnnotationDefaultValue.kt */
public final class i extends a {
    public final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super((f) null);
        m0.n.b.i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.a = str;
    }
}
