package q0;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import m0.n.b.i;

/* compiled from: EventListener.kt */
public abstract class t {
    public static final t a = new a();

    /* compiled from: EventListener.kt */
    public static final class a extends t {
    }

    /* compiled from: EventListener.kt */
    public interface b {
        t a(f fVar);
    }

    public void a(f fVar, k kVar) {
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(kVar, "connection");
    }

    public void b(f fVar, IOException iOException) {
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(iOException, "ioe");
    }

    public void c(f fVar, IOException iOException) {
        i.e(fVar, NotificationCompat.CATEGORY_CALL);
        i.e(iOException, "ioe");
    }
}
