package i0.h.c.o;

import android.content.Context;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import i0.h.c.j.u;
import i0.h.c.q.b;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultHeartBeatInfo */
public class d implements HeartBeatInfo {
    public static final /* synthetic */ int a = 0;
    public b<f> b;

    public d(Context context, Set<e> set) {
        u uVar = new u(new a(context));
        new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), c.c);
        this.b = uVar;
    }

    public HeartBeatInfo.HeartBeat a(String str) {
        boolean a2;
        long currentTimeMillis = System.currentTimeMillis();
        boolean a3 = this.b.get().a(str, currentTimeMillis);
        f fVar = this.b.get();
        synchronized (fVar) {
            a2 = fVar.a("fire-global", currentTimeMillis);
        }
        if (a3 && a2) {
            return HeartBeatInfo.HeartBeat.COMBINED;
        }
        if (a2) {
            return HeartBeatInfo.HeartBeat.GLOBAL;
        }
        if (a3) {
            return HeartBeatInfo.HeartBeat.SDK;
        }
        return HeartBeatInfo.HeartBeat.NONE;
    }
}
