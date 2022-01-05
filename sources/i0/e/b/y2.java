package i0.e.b;

import android.app.Application;
import com.clubhouse.android.ClubhouseApplication;
import i0.e.b.c3.g.c;
import i0.e.b.l;
import i0.j.f.p.h;
import j0.a.a.c.c.d;
import j0.a.a.c.c.e;
import j0.a.b.b;

/* compiled from: Hilt_ClubhouseApplication */
public abstract class y2 extends Application implements b {
    public final d c = new d(new a());

    /* compiled from: Hilt_ClubhouseApplication */
    public class a implements e {
        public a() {
        }

        public Object a() {
            j0.a.a.c.d.a aVar = new j0.a.a.c.d.a(y2.this);
            i0.e.b.c3.a aVar2 = new i0.e.b.c3.a();
            h.C(aVar, j0.a.a.c.d.a.class);
            return new l(aVar2, aVar, new c(), new i0.e.c.g.b(), new i0.e.b.c3.d(), new i0.e.e.l.b(), (l.a) null);
        }
    }

    public final Object U() {
        return this.c.U();
    }

    public void onCreate() {
        ((b) U()).b((ClubhouseApplication) this);
        super.onCreate();
    }
}
