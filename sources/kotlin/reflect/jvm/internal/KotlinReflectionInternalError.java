package kotlin.reflect.jvm.internal;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;

/* compiled from: KotlinReflectionInternalError.kt */
public final class KotlinReflectionInternalError extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KotlinReflectionInternalError(String str) {
        super(str);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
    }
}
