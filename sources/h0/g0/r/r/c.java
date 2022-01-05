package h0.g0.r.r;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import h0.g0.e;
import h0.g0.i;
import h0.g0.r.b;
import h0.g0.r.l;
import h0.g0.r.q.d;
import h0.g0.r.s.o;
import h0.g0.r.t.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: SystemForegroundDispatcher */
public class c implements h0.g0.r.q.c, b {
    public static final String c = i.e("SystemFgDispatcher");
    public String Y1;
    public final Map<String, e> Z1;
    public final Map<String, o> a2;
    public final Set<o> b2;
    public final d c2;
    public Context d;
    public a d2;
    public l q;
    public final h0.g0.r.t.q.a x;
    public final Object y = new Object();

    /* compiled from: SystemForegroundDispatcher */
    public interface a {
    }

    public c(Context context) {
        this.d = context;
        l c3 = l.c(this.d);
        this.q = c3;
        h0.g0.r.t.q.a aVar = c3.h;
        this.x = aVar;
        this.Y1 = null;
        this.Z1 = new LinkedHashMap();
        this.b2 = new HashSet();
        this.a2 = new HashMap();
        this.c2 = new d(this.d, aVar, this);
        this.q.j.a(this);
    }

    public final void a(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        i.c().a(c, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.d2 != null) {
            this.Z1.put(stringExtra, new e(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.Y1)) {
                this.Y1 = stringExtra;
                ((SystemForegroundService) this.d2).b(intExtra, intExtra2, notification);
                return;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.d2;
            systemForegroundService.q.post(new d(systemForegroundService, intExtra, notification));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, e> value : this.Z1.entrySet()) {
                    i |= ((e) value.getValue()).b;
                }
                e eVar = this.Z1.get(this.Y1);
                if (eVar != null) {
                    ((SystemForegroundService) this.d2).b(eVar.a, i, eVar.c);
                }
            }
        }
    }

    public void b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                i.c().a(c, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                l lVar = this.q;
                h0.g0.r.t.q.a aVar = lVar.h;
                ((h0.g0.r.t.q.b) aVar).a.execute(new k(lVar, next, true));
            }
        }
    }

    public void c() {
        this.d2 = null;
        synchronized (this.y) {
            this.c2.c();
        }
        this.q.j.e(this);
    }

    public void d(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.y) {
            o remove = this.a2.remove(str);
            if (remove != null ? this.b2.remove(remove) : false) {
                this.c2.b(this.b2);
            }
        }
        e remove2 = this.Z1.remove(str);
        if (str.equals(this.Y1) && this.Z1.size() > 0) {
            Iterator it = this.Z1.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.Y1 = (String) entry.getKey();
            if (this.d2 != null) {
                e eVar = (e) entry.getValue();
                ((SystemForegroundService) this.d2).b(eVar.a, eVar.b, eVar.c);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.d2;
                systemForegroundService.q.post(new e(systemForegroundService, eVar.a));
            }
        }
        a aVar = this.d2;
        if (remove2 != null && aVar != null) {
            i.c().a(c, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", new Object[]{Integer.valueOf(remove2.a), str, Integer.valueOf(remove2.b)}), new Throwable[0]);
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar;
            systemForegroundService2.q.post(new e(systemForegroundService2, remove2.a));
        }
    }

    public void f(List<String> list) {
    }
}
