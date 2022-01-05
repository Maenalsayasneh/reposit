package i0.e.a.b;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.clubhouse.analytics.actiontrails.ActionTrailWorker;
import com.clubhouse.android.data.network.ServerDataSource;
import h0.g0.q;
import m0.n.b.i;
import n0.c.l.a;

/* compiled from: ActionTrailWorker.kt */
public final class b extends q {
    public final a b;
    public final i0.k.a.a c;
    public final ServerDataSource d;
    public final i0.e.a.a e;

    public b(a aVar, i0.k.a.a aVar2, ServerDataSource serverDataSource, i0.e.a.a aVar3) {
        i.e(aVar, "json");
        i.e(aVar2, "cache");
        i.e(serverDataSource, "fetcher");
        i.e(aVar3, "analytics");
        this.b = aVar;
        this.c = aVar2;
        this.d = serverDataSource;
        this.e = aVar3;
    }

    public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        i.e(context, "appContext");
        i.e(str, "workerClassName");
        i.e(workerParameters, "workerParameters");
        if (!i.a(str, ActionTrailWorker.class.getName())) {
            return null;
        }
        return new ActionTrailWorker(context, workerParameters, this.b, this.c, this.d, this.e);
    }
}
