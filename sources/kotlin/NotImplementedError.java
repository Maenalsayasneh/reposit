package kotlin;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;

/* compiled from: Standard.kt */
public final class NotImplementedError extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotImplementedError(String str) {
        super(str);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
    }
}
