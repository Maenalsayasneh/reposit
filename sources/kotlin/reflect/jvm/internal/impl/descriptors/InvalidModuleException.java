package kotlin.reflect.jvm.internal.impl.descriptors;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;

/* compiled from: InvalidModuleException.kt */
public final class InvalidModuleException extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvalidModuleException(String str) {
        super(str);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
    }
}
