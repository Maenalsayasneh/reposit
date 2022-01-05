package i0.h.a.b.c.n;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class b {
    public static b a = new b();
    public a b = null;

    @RecentlyNonNull
    public static a a(@RecentlyNonNull Context context) {
        a aVar;
        b bVar = a;
        synchronized (bVar) {
            if (bVar.b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                bVar.b = new a(context);
            }
            aVar = bVar.b;
        }
        return aVar;
    }
}
