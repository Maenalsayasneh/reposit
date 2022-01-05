package h0.g0.r.q.e;

import android.content.Context;
import androidx.work.NetworkType;
import h0.g0.i;
import h0.g0.r.q.b;
import h0.g0.r.q.f.g;
import h0.g0.r.s.o;
import h0.g0.r.t.q.a;

/* compiled from: NetworkNotRoamingController */
public class f extends c<b> {
    public static final String e = i.e("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(g.a(context, aVar).d);
    }

    public boolean b(o oVar) {
        return oVar.j.b == NetworkType.NOT_ROAMING;
    }

    public boolean c(Object obj) {
        b bVar = (b) obj;
        return !bVar.a || !bVar.d;
    }
}
