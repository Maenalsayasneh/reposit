package i0.n.c.a.e.d;

import androidx.core.app.NotificationCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.sinch.verification.core.internal.error.ApiCallException;
import com.sinch.verification.core.internal.error.ApiErrorData;
import java.lang.annotation.Annotation;
import m0.n.b.i;
import q0.f0;
import t0.d;
import t0.f;
import t0.v;
import t0.w;

/* compiled from: RetrofitCallback.kt */
public class b<T> implements f<T> {
    public final w a;
    public final a<T> b;

    public b(w wVar, a<T> aVar) {
        i.e(wVar, "retrofit");
        i.e(aVar, "apiCallback");
        this.a = wVar;
        this.b = aVar;
    }

    public void onFailure(d<T> dVar, Throwable th) {
        i.e(dVar, NotificationCompat.CATEGORY_CALL);
        i.e(th, "t");
        this.b.onError(th);
    }

    public void onResponse(d<T> dVar, v<T> vVar) {
        ApiErrorData a2;
        i.e(dVar, NotificationCompat.CATEGORY_CALL);
        i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (vVar.a()) {
            T t = vVar.b;
            if (t != null) {
                this.b.a(t, vVar);
                return;
            }
            return;
        }
        f0 f0Var = vVar.c;
        if (f0Var != null && (a2 = this.a.e(ApiErrorData.class, new Annotation[0]).a(f0Var)) != null) {
            a<T> aVar = this.b;
            i.d(a2, "it");
            aVar.onError(new ApiCallException(a2));
        }
    }
}
