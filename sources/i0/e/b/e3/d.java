package i0.e.b.e3;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import m0.j.g;
import m0.l.e;
import m0.n.b.i;

/* compiled from: NotificationUtil.kt */
public final class d {
    public static final d a = new d();
    public static final List<c> b = g.K(a.b, a.c, a.d, a.e);
    public static final CoroutineExceptionHandler c = new a(CoroutineExceptionHandler.a.c);

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a extends m0.l.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.a aVar) {
            super(aVar);
        }

        public void handleException(e eVar, Throwable th) {
            v0.a.a.d.w(th, "error updating notification token", new Object[0]);
        }
    }

    static {
        a aVar = a.a;
        int i = CoroutineExceptionHandler.j;
    }

    public final boolean a(Context context) {
        i.e(context, "context");
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }
}
