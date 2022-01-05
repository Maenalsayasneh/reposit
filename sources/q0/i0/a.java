package q0.i0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import okhttp3.logging.HttpLoggingInterceptor;
import q0.h0.l.h;

/* compiled from: HttpLoggingInterceptor.kt */
public final class a implements HttpLoggingInterceptor.a {
    public void a(String str) {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        h.a aVar = h.c;
        h.j(h.a, str, 0, (Throwable) null, 6, (Object) null);
    }
}
