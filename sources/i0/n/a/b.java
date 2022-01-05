package i0.n.a;

import androidx.core.app.NotificationCompat;
import java.util.LinkedHashSet;
import java.util.Set;
import m0.n.b.i;

/* compiled from: Log.kt */
public final class b {
    public static final Set<a> a = new LinkedHashSet();
    public static final b b = new b();

    /* compiled from: Log.kt */
    public static final class a implements c {
        public final String a;

        public a(String str) {
            i.e(str, "tag");
            this.a = str;
        }

        public void a(String str, Throwable th) {
            i.e(str, NotificationCompat.CATEGORY_MESSAGE);
            b bVar = b.b;
            for (a a2 : b.a) {
                a2.a(this.a, str, th);
            }
        }

        public void b(String str, Throwable th) {
            i.e(str, NotificationCompat.CATEGORY_MESSAGE);
            b bVar = b.b;
            for (a c : b.a) {
                c.c(this.a, str, th);
            }
        }

        public void c(String str, Throwable th) {
            i.e(str, NotificationCompat.CATEGORY_MESSAGE);
            b bVar = b.b;
            for (a d : b.a) {
                d.d(this.a, str, th);
            }
        }

        public void error(String str, Throwable th) {
            i.e(str, NotificationCompat.CATEGORY_MESSAGE);
            b bVar = b.b;
            for (a b : b.a) {
                b.b(this.a, str, th);
            }
        }
    }
}
