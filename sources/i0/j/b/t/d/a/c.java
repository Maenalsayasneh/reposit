package i0.j.b.t.d.a;

import com.instabug.library.network.NetworkManager;
import i0.j.b.s.a;
import java.util.Objects;

/* compiled from: ReportCategoriesServiceHelper */
public class c {
    public static c a;
    public NetworkManager b = new NetworkManager();

    public static void a(c cVar, String str) {
        Objects.requireNonNull(cVar);
        Objects.requireNonNull(a.h());
        i0.j.b.s.c a2 = i0.j.b.s.c.a();
        a2.c.putString("ib_remote_report_categories", str);
        a2.c.apply();
    }
}
