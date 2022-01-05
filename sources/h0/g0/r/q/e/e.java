package h0.g0.r.q.e;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import h0.g0.i;
import h0.g0.r.q.b;
import h0.g0.r.q.f.g;
import h0.g0.r.s.o;
import h0.g0.r.t.q.a;

/* compiled from: NetworkMeteredController */
public class e extends c<b> {
    public static final String e = i.e("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super(g.a(context, aVar).d);
    }

    public boolean b(o oVar) {
        return oVar.j.b == NetworkType.METERED;
    }

    public boolean c(Object obj) {
        b bVar = (b) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            i.c().a(e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.a;
        }
        if (bVar.a && bVar.c) {
            z = false;
        }
        return z;
    }
}
