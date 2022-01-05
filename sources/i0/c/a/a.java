package i0.c.a;

import android.content.Context;
import com.amplitude.api.CursorWindowAllocationException;
import i0.c.c.b;
import q0.f;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ f c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ f.a q;
    public final /* synthetic */ String x;
    public final /* synthetic */ f y;

    public /* synthetic */ a(f fVar, Context context, f.a aVar, String str, f fVar2) {
        this.c = fVar;
        this.d = context;
        this.q = aVar;
        this.x = str;
        this.y = fVar2;
    }

    public final void run() {
        f fVar = this.c;
        Context context = this.d;
        f.a aVar = this.q;
        String str = this.x;
        f fVar2 = this.y;
        if (!fVar.i) {
            try {
                if (fVar.f.equals("$default_instance")) {
                    f.u(context);
                    f.v(context);
                }
                if (aVar == null) {
                    b bVar = c.a;
                    Object obj = i0.c.c.a.a;
                    if (!(bVar instanceof i0.c.c.a)) {
                        bVar = new i0.c.c.a(bVar);
                    }
                    fVar.c = new b(bVar);
                } else {
                    fVar.c = aVar;
                }
                fVar.v = new o(context, fVar.n);
                fVar.h = fVar.e();
                fVar.v.b();
                if (str != null) {
                    fVar2.g = str;
                    fVar.d.I("user_id", str);
                } else {
                    fVar2.g = fVar.d.C("user_id");
                }
                Long v = fVar.d.v("opt_out");
                fVar.j = v != null && v.longValue() == 1;
                long b = fVar.b("previous_session_id", -1);
                fVar.u = b;
                if (b >= 0) {
                    fVar.p = b;
                }
                fVar.q = fVar.b("sequence_number", 0);
                fVar.r = fVar.b("last_event_id", -1);
                fVar.s = fVar.b("last_identify_id", -1);
                fVar.t = fVar.b("last_event_time", -1);
                fVar.d.Y1 = new i(fVar, fVar2);
                fVar.i = true;
            } catch (CursorWindowAllocationException e) {
                k.a.a(f.a, String.format("Failed to initialize Amplitude SDK due to: %s", new Object[]{e.getMessage()}));
                fVar2.e = null;
            }
        }
    }
}
