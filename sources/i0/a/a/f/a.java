package i0.a.a.f;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.i;
import m0.n.a.l;

/* compiled from: ConfirmCallback.kt */
public final class a {
    public l<? super Boolean, i> a;

    public a(l<? super Boolean, i> lVar) {
        this.a = lVar;
    }

    public final void a(boolean z) {
        if (this.a == null) {
            m0.n.b.i.f(this, "$this$warn");
            m0.n.b.i.f("Confirm callback invoked more than once, ignored after first invocation.", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            m0.n.b.i.f(new Object[0], "args");
        }
        l<? super Boolean, i> lVar = this.a;
        if (lVar != null) {
            i invoke = lVar.invoke(Boolean.valueOf(z));
        }
        this.a = null;
    }
}
