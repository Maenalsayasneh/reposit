package i0.j.e.q0;

import android.content.Context;
import i0.j.e.l0.c.b;
import i0.j.e.t0.b;

/* compiled from: InstabugSDKDiskLogger */
public final class d {
    public j a;
    public b b = b.c();

    public d(Context context) {
        this.a = new j(context);
    }

    public void a(String str, String str2, String str3, long j) {
        j jVar;
        i0.j.e.t0.d a2 = this.b.a();
        if (a2 != null && a2.d == 2 && (jVar = this.a) != null) {
            jVar.c.add(new i0.j.e.t0.b(str, str2, j, str3, (b.a) null));
        }
    }
}
