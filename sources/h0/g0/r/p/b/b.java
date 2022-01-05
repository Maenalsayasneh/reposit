package h0.g0.r.p.b;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h0.g0.i;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler */
public class b implements h0.g0.r.b {
    public static final String c = i.e("CommandHandler");
    public final Context d;
    public final Map<String, h0.g0.r.b> q = new HashMap();
    public final Object x = new Object();

    public b(Context context) {
        this.d = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public void d(String str, boolean z) {
        synchronized (this.x) {
            h0.g0.r.b remove = this.q.remove(str);
            if (remove != null) {
                remove.d(str, z);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0189  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.content.Intent r11, int r12, h0.g0.r.p.b.e r13) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r1 = r1.equals(r0)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x011c
            h0.g0.i r0 = h0.g0.i.c()
            java.lang.String r1 = c
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r11
            java.lang.String r11 = "Handling constraints changed %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            r0.a(r1, r11, r4)
            h0.g0.r.p.b.c r11 = new h0.g0.r.p.b.c
            android.content.Context r0 = r10.d
            r11.<init>(r0, r12, r13)
            h0.g0.r.l r12 = r13.Y1
            androidx.work.impl.WorkDatabase r12 = r12.g
            h0.g0.r.s.p r12 = r12.q()
            h0.g0.r.s.q r12 = (h0.g0.r.s.q) r12
            java.util.List r12 = r12.f()
            java.lang.String r13 = androidx.work.impl.background.systemalarm.ConstraintProxy.a
            r13 = r12
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r1 = r13.iterator()
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x0045:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r1.next()
            h0.g0.r.s.o r8 = (h0.g0.r.s.o) r8
            h0.g0.b r8 = r8.j
            boolean r9 = r8.e
            r4 = r4 | r9
            boolean r9 = r8.c
            r5 = r5 | r9
            boolean r9 = r8.f
            r6 = r6 | r9
            androidx.work.NetworkType r8 = r8.b
            androidx.work.NetworkType r9 = androidx.work.NetworkType.NOT_REQUIRED
            if (r8 == r9) goto L_0x0064
            r8 = r3
            goto L_0x0065
        L_0x0064:
            r8 = r2
        L_0x0065:
            r7 = r7 | r8
            if (r4 == 0) goto L_0x0045
            if (r5 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            if (r7 == 0) goto L_0x0045
        L_0x006e:
            java.lang.String r1 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.a
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r8 = "androidx.work.impl.background.systemalarm.UpdateProxies"
            r1.<init>(r8)
            android.content.ComponentName r8 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver> r9 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class
            r8.<init>(r0, r9)
            r1.setComponent(r8)
            java.lang.String r8 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r1.putExtra(r8, r4)
            java.lang.String r8 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r8, r5)
            java.lang.String r5 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r5, r6)
            java.lang.String r5 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            r4.putExtra(r5, r7)
            r0.sendBroadcast(r1)
            h0.g0.r.q.d r0 = r11.e
            r0.b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r13.size()
            r12.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Iterator r13 = r13.iterator()
        L_0x00b1:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r4 = r13.next()
            h0.g0.r.s.o r4 = (h0.g0.r.s.o) r4
            java.lang.String r5 = r4.a
            long r6 = r4.a()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00b1
            boolean r6 = r4.b()
            if (r6 == 0) goto L_0x00d5
            h0.g0.r.q.d r6 = r11.e
            boolean r5 = r6.a(r5)
            if (r5 == 0) goto L_0x00b1
        L_0x00d5:
            r12.add(r4)
            goto L_0x00b1
        L_0x00d9:
            java.util.Iterator r12 = r12.iterator()
        L_0x00dd:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0115
            java.lang.Object r13 = r12.next()
            h0.g0.r.s.o r13 = (h0.g0.r.s.o) r13
            java.lang.String r13 = r13.a
            android.content.Context r0 = r11.b
            android.content.Intent r0 = b(r0, r13)
            h0.g0.i r1 = h0.g0.i.c()
            java.lang.String r4 = h0.g0.r.p.b.c.a
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r13
            java.lang.String r13 = "Creating a delay_met command for workSpec with id (%s)"
            java.lang.String r13 = java.lang.String.format(r13, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r1.a(r4, r13, r5)
            h0.g0.r.p.b.e r13 = r11.d
            h0.g0.r.p.b.e$b r1 = new h0.g0.r.p.b.e$b
            int r4 = r11.c
            r1.<init>(r13, r0, r4)
            android.os.Handler r13 = r13.a2
            r13.post(r1)
            goto L_0x00dd
        L_0x0115:
            h0.g0.r.q.d r11 = r11.e
            r11.c()
            goto L_0x037a
        L_0x011c:
            java.lang.String r1 = "ACTION_RESCHEDULE"
            boolean r1 = r1.equals(r0)
            r4 = 2
            if (r1 == 0) goto L_0x0147
            h0.g0.i r0 = h0.g0.i.c()
            java.lang.String r1 = c
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r3] = r11
            java.lang.String r11 = "Handling reschedule %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r2]
            r0.a(r1, r11, r12)
            h0.g0.r.l r11 = r13.Y1
            r11.e()
            goto L_0x037a
        L_0x0147:
            android.os.Bundle r1 = r11.getExtras()
            java.lang.String r5 = "KEY_WORKSPEC_ID"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            if (r1 == 0) goto L_0x016b
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x015a
            goto L_0x016b
        L_0x015a:
            r6 = r2
        L_0x015b:
            if (r6 >= r3) goto L_0x0169
            r7 = r5[r6]
            java.lang.Object r7 = r1.get(r7)
            if (r7 != 0) goto L_0x0166
            goto L_0x016b
        L_0x0166:
            int r6 = r6 + 1
            goto L_0x015b
        L_0x0169:
            r1 = r3
            goto L_0x016c
        L_0x016b:
            r1 = r2
        L_0x016c:
            if (r1 != 0) goto L_0x0189
            h0.g0.i r11 = h0.g0.i.c()
            java.lang.String r12 = c
            java.lang.String r13 = "Invalid request for %s, requires %s."
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r2] = r0
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r1[r3] = r0
            java.lang.String r13 = java.lang.String.format(r13, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r11.b(r12, r13, r0)
            goto L_0x037a
        L_0x0189:
            java.lang.String r1 = "ACTION_SCHEDULE_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0272
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)
            h0.g0.i r0 = h0.g0.i.c()
            java.lang.String r1 = c
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r11
            java.lang.String r6 = "Handling schedule work for %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]
            r0.a(r1, r5, r6)
            h0.g0.r.l r0 = r13.Y1
            androidx.work.impl.WorkDatabase r0 = r0.g
            r0.c()
            h0.g0.r.s.p r5 = r0.q()     // Catch:{ all -> 0x026d }
            h0.g0.r.s.q r5 = (h0.g0.r.s.q) r5     // Catch:{ all -> 0x026d }
            h0.g0.r.s.o r5 = r5.i(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r6 = "Skipping scheduling "
            if (r5 != 0) goto L_0x01e7
            h0.g0.i r12 = h0.g0.i.c()     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            r13.<init>()     // Catch:{ all -> 0x026d }
            r13.append(r6)     // Catch:{ all -> 0x026d }
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = " because it's no longer in the DB"
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x026d }
            r12.f(r1, r11, r13)     // Catch:{ all -> 0x026d }
        L_0x01e2:
            r0.g()
            goto L_0x037a
        L_0x01e7:
            androidx.work.WorkInfo$State r7 = r5.b     // Catch:{ all -> 0x026d }
            boolean r7 = r7.isFinished()     // Catch:{ all -> 0x026d }
            if (r7 == 0) goto L_0x020d
            h0.g0.i r12 = h0.g0.i.c()     // Catch:{ all -> 0x026d }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x026d }
            r13.<init>()     // Catch:{ all -> 0x026d }
            r13.append(r6)     // Catch:{ all -> 0x026d }
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = "because it is finished."
            r13.append(r11)     // Catch:{ all -> 0x026d }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x026d }
            r12.f(r1, r11, r13)     // Catch:{ all -> 0x026d }
            goto L_0x01e2
        L_0x020d:
            long r6 = r5.a()     // Catch:{ all -> 0x026d }
            boolean r5 = r5.b()     // Catch:{ all -> 0x026d }
            if (r5 != 0) goto L_0x0238
            h0.g0.i r12 = h0.g0.i.c()     // Catch:{ all -> 0x026d }
            java.lang.String r5 = "Setting up Alarms for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x026d }
            r4[r2] = r11     // Catch:{ all -> 0x026d }
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x026d }
            r4[r3] = r8     // Catch:{ all -> 0x026d }
            java.lang.String r3 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x026d }
            r12.a(r1, r3, r2)     // Catch:{ all -> 0x026d }
            android.content.Context r12 = r10.d     // Catch:{ all -> 0x026d }
            h0.g0.r.l r13 = r13.Y1     // Catch:{ all -> 0x026d }
            h0.g0.r.p.b.a.b(r12, r13, r11, r6)     // Catch:{ all -> 0x026d }
            goto L_0x0268
        L_0x0238:
            h0.g0.i r5 = h0.g0.i.c()     // Catch:{ all -> 0x026d }
            java.lang.String r8 = "Opportunistically setting an alarm for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x026d }
            r4[r2] = r11     // Catch:{ all -> 0x026d }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x026d }
            r4[r3] = r9     // Catch:{ all -> 0x026d }
            java.lang.String r3 = java.lang.String.format(r8, r4)     // Catch:{ all -> 0x026d }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x026d }
            r5.a(r1, r3, r2)     // Catch:{ all -> 0x026d }
            android.content.Context r1 = r10.d     // Catch:{ all -> 0x026d }
            h0.g0.r.l r2 = r13.Y1     // Catch:{ all -> 0x026d }
            h0.g0.r.p.b.a.b(r1, r2, r11, r6)     // Catch:{ all -> 0x026d }
            android.content.Context r11 = r10.d     // Catch:{ all -> 0x026d }
            android.content.Intent r11 = a(r11)     // Catch:{ all -> 0x026d }
            h0.g0.r.p.b.e$b r1 = new h0.g0.r.p.b.e$b     // Catch:{ all -> 0x026d }
            r1.<init>(r13, r11, r12)     // Catch:{ all -> 0x026d }
            android.os.Handler r11 = r13.a2     // Catch:{ all -> 0x026d }
            r11.post(r1)     // Catch:{ all -> 0x026d }
        L_0x0268:
            r0.k()     // Catch:{ all -> 0x026d }
            goto L_0x01e2
        L_0x026d:
            r11 = move-exception
            r0.g()
            throw r11
        L_0x0272:
            java.lang.String r1 = "ACTION_DELAY_MET"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02cd
            android.os.Bundle r11 = r11.getExtras()
            java.lang.Object r1 = r10.x
            monitor-enter(r1)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)     // Catch:{ all -> 0x02ca }
            h0.g0.i r0 = h0.g0.i.c()     // Catch:{ all -> 0x02ca }
            java.lang.String r4 = c     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = "Handing delay met for %s"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x02ca }
            r6[r2] = r11     // Catch:{ all -> 0x02ca }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x02ca }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x02ca }
            r0.a(r4, r5, r6)     // Catch:{ all -> 0x02ca }
            java.util.Map<java.lang.String, h0.g0.r.b> r0 = r10.q     // Catch:{ all -> 0x02ca }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x02ca }
            if (r0 != 0) goto L_0x02b4
            h0.g0.r.p.b.d r0 = new h0.g0.r.p.b.d     // Catch:{ all -> 0x02ca }
            android.content.Context r2 = r10.d     // Catch:{ all -> 0x02ca }
            r0.<init>(r2, r12, r11, r13)     // Catch:{ all -> 0x02ca }
            java.util.Map<java.lang.String, h0.g0.r.b> r12 = r10.q     // Catch:{ all -> 0x02ca }
            r12.put(r11, r0)     // Catch:{ all -> 0x02ca }
            r0.e()     // Catch:{ all -> 0x02ca }
            goto L_0x02c7
        L_0x02b4:
            h0.g0.i r12 = h0.g0.i.c()     // Catch:{ all -> 0x02ca }
            java.lang.String r13 = "WorkSpec %s is already being handled for ACTION_DELAY_MET"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ all -> 0x02ca }
            r0[r2] = r11     // Catch:{ all -> 0x02ca }
            java.lang.String r11 = java.lang.String.format(r13, r0)     // Catch:{ all -> 0x02ca }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x02ca }
            r12.a(r4, r11, r13)     // Catch:{ all -> 0x02ca }
        L_0x02c7:
            monitor-exit(r1)     // Catch:{ all -> 0x02ca }
            goto L_0x037a
        L_0x02ca:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02ca }
            throw r11
        L_0x02cd:
            java.lang.String r1 = "ACTION_STOP_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x032e
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r12 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r12)
            h0.g0.i r12 = h0.g0.i.c()
            java.lang.String r0 = c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r11
            java.lang.String r4 = "Handing stopWork work for %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            r12.a(r0, r1, r4)
            h0.g0.r.l r12 = r13.Y1
            r12.f(r11)
            android.content.Context r12 = r10.d
            h0.g0.r.l r0 = r13.Y1
            java.lang.String r1 = h0.g0.r.p.b.a.a
            androidx.work.impl.WorkDatabase r0 = r0.g
            h0.g0.r.s.h r0 = r0.n()
            h0.g0.r.s.i r0 = (h0.g0.r.s.i) r0
            h0.g0.r.s.g r1 = r0.a(r11)
            if (r1 == 0) goto L_0x032a
            int r1 = r1.b
            h0.g0.r.p.b.a.a(r12, r11, r1)
            h0.g0.i r12 = h0.g0.i.c()
            java.lang.String r1 = h0.g0.r.p.b.a.a
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r11
            java.lang.String r4 = "Removing SystemIdInfo for workSpecId (%s)"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r2]
            r12.a(r1, r3, r4)
            r0.c(r11)
        L_0x032a:
            r13.d(r11, r2)
            goto L_0x037a
        L_0x032e:
            java.lang.String r13 = "ACTION_EXECUTION_COMPLETED"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0365
            android.os.Bundle r13 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "KEY_NEEDS_RESCHEDULE"
            boolean r13 = r13.getBoolean(r1)
            h0.g0.i r1 = h0.g0.i.c()
            java.lang.String r5 = c
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r3] = r11
            java.lang.String r11 = "Handling onExecutionCompleted %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r2]
            r1.a(r5, r11, r12)
            r10.d(r0, r13)
            goto L_0x037a
        L_0x0365:
            h0.g0.i r12 = h0.g0.i.c()
            java.lang.String r13 = c
            java.lang.String r0 = "Ignoring intent %s"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r11
            java.lang.String r11 = java.lang.String.format(r0, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r2]
            r12.f(r13, r11, r0)
        L_0x037a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g0.r.p.b.b.e(android.content.Intent, int, h0.g0.r.p.b.e):void");
    }
}
