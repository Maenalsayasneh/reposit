package h0.g0.r.q.e;

import android.content.Context;
import android.os.Build;
import androidx.work.NetworkType;
import h0.g0.r.q.b;
import h0.g0.r.q.f.g;
import h0.g0.r.s.o;
import h0.g0.r.t.q.a;

/* compiled from: NetworkConnectedController */
public class d extends c<b> {
    public d(Context context, a aVar) {
        super(g.a(context, aVar).d);
    }

    public boolean b(o oVar) {
        return oVar.j.b == NetworkType.CONNECTED;
    }

    public boolean c(Object obj) {
        b bVar = (b) obj;
        if (Build.VERSION.SDK_INT < 26) {
            return true ^ bVar.a;
        }
        if (!bVar.a || !bVar.b) {
            return true;
        }
        return false;
    }
}
