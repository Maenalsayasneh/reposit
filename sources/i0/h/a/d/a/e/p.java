package i0.h.a.d.a.e;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.support.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class p<T extends IInterface> {
    public static final Map<String, Handler> a = new HashMap();
    public final Context b;
    public final f c;
    public final String d;
    public final List<g> e = new ArrayList();
    public boolean f;
    public final Intent g;
    public final l<T> h;
    public final WeakReference<k> i;
    public final IBinder.DeathRecipient j = new h(this);
    @Nullable
    public ServiceConnection k;
    @Nullable
    public T l;

    public p(Context context, f fVar, String str, Intent intent, l<T> lVar) {
        this.b = context;
        this.c = fVar;
        this.d = str;
        this.g = intent;
        this.h = lVar;
        this.i = new WeakReference<>((Object) null);
    }

    public final void a(g gVar) {
        c(new i(this, gVar.c, gVar));
    }

    public final void b() {
        c(new j(this));
    }

    public final void c(g gVar) {
        Handler handler;
        Map<String, Handler> map = a;
        synchronized (map) {
            if (!map.containsKey(this.d)) {
                HandlerThread handlerThread = new HandlerThread(this.d, 10);
                handlerThread.start();
                map.put(this.d, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.d);
        }
        handler.post(gVar);
    }
}
