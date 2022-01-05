package t0;

import androidx.core.app.NotificationCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import m0.n.b.i;
import n0.a.m;

/* compiled from: KotlinExtensions.kt */
public final class l implements f<T> {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    public void onFailure(d<T> dVar, Throwable th) {
        i.f(dVar, NotificationCompat.CATEGORY_CALL);
        i.f(th, "t");
        this.a.resumeWith(h.l0(th));
    }

    public void onResponse(d<T> dVar, v<T> vVar) {
        i.f(dVar, NotificationCompat.CATEGORY_CALL);
        i.f(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        this.a.resumeWith(vVar);
    }
}
