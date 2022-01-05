package h0.g0.r.p.b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import h0.g0.i;
import h0.g0.r.l;
import h0.g0.r.s.d;
import h0.g0.r.s.f;
import h0.g0.r.s.g;
import h0.g0.r.t.e;

/* compiled from: Alarms */
public class a {
    public static final String a = i.e("Alarms");

    public static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            i.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, l lVar, String str, long j) {
        int intValue;
        WorkDatabase workDatabase = lVar.g;
        h0.g0.r.s.i iVar = (h0.g0.r.s.i) workDatabase.n();
        g a2 = iVar.a(str);
        if (a2 != null) {
            a(context, str, a2.b);
            c(context, str, a2.b, j);
            return;
        }
        synchronized (e.class) {
            workDatabase.c();
            try {
                Long a3 = ((f) workDatabase.m()).a("next_alarm_manager_id");
                int i = 0;
                intValue = a3 != null ? a3.intValue() : 0;
                if (intValue != Integer.MAX_VALUE) {
                    i = intValue + 1;
                }
                ((f) workDatabase.m()).b(new d("next_alarm_manager_id", (long) i));
                workDatabase.k();
            } finally {
                workDatabase.g();
            }
        }
        iVar.b(new g(str, intValue));
        c(context, str, intValue, j);
    }

    public static void c(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, b.b(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
