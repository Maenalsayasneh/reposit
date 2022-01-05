package h0.g0.r.q.e;

import android.content.Context;
import androidx.work.NetworkType;
import h0.g0.r.q.b;
import h0.g0.r.s.o;
import h0.g0.r.t.q.a;

/* compiled from: NetworkUnmeteredController */
public class g extends c<b> {
    public g(Context context, a aVar) {
        super(h0.g0.r.q.f.g.a(context, aVar).d);
    }

    public boolean b(o oVar) {
        return oVar.j.b == NetworkType.UNMETERED;
    }

    public boolean c(Object obj) {
        b bVar = (b) obj;
        return !bVar.a || bVar.c;
    }
}
