package h0.g0.r.t;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import h0.g0.b;
import h0.g0.d;
import h0.g0.i;
import h0.g0.k;
import h0.g0.r.c;
import h0.g0.r.f;
import h0.g0.r.g;
import h0.g0.r.l;
import h0.g0.r.s.o;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: EnqueueRunnable */
public class d implements Runnable {
    public static final String c = i.e("EnqueueRunnable");
    public final g d;
    public final c q = new c();

    public d(g gVar) {
        this.d = gVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0326 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(h0.g0.r.g r21) {
        /*
            r0 = r21
            java.util.List<h0.g0.r.g> r1 = r0.h
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0041
            java.util.Iterator r1 = r1.iterator()
            r4 = r2
        L_0x000d:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0042
            java.lang.Object r5 = r1.next()
            h0.g0.r.g r5 = (h0.g0.r.g) r5
            boolean r6 = r5.i
            if (r6 != 0) goto L_0x0023
            boolean r5 = a(r5)
            r4 = r4 | r5
            goto L_0x000d
        L_0x0023:
            h0.g0.i r6 = h0.g0.i.c()
            java.lang.String r7 = c
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.util.List<java.lang.String> r5 = r5.f
            java.lang.String r9 = ", "
            java.lang.String r5 = android.text.TextUtils.join(r9, r5)
            r8[r2] = r5
            java.lang.String r5 = "Already enqueued work ids (%s)."
            java.lang.String r5 = java.lang.String.format(r5, r8)
            java.lang.Throwable[] r8 = new java.lang.Throwable[r2]
            r6.f(r7, r5, r8)
            goto L_0x000d
        L_0x0041:
            r4 = r2
        L_0x0042:
            java.util.Set r1 = h0.g0.r.g.c(r21)
            h0.g0.r.l r5 = r0.b
            java.util.List<? extends h0.g0.o> r6 = r0.e
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r7 = r0.c
            androidx.work.ExistingWorkPolicy r8 = r0.d
            long r9 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r11 = r5.g
            if (r1 == 0) goto L_0x0063
            int r12 = r1.length
            if (r12 <= 0) goto L_0x0063
            r12 = r3
            goto L_0x0064
        L_0x0063:
            r12 = r2
        L_0x0064:
            if (r12 == 0) goto L_0x00b4
            int r13 = r1.length
            r14 = r2
            r16 = r14
            r17 = r16
            r15 = r3
        L_0x006d:
            if (r14 >= r13) goto L_0x00b9
            r2 = r1[r14]
            h0.g0.r.s.p r18 = r11.q()
            r3 = r18
            h0.g0.r.s.q r3 = (h0.g0.r.s.q) r3
            h0.g0.r.s.o r3 = r3.i(r2)
            if (r3 != 0) goto L_0x0098
            h0.g0.i r1 = h0.g0.i.c()
            java.lang.String r3 = c
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r5 = 0
            r6[r5] = r2
            java.lang.String r2 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r2, r6)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r5]
            r1.b(r3, r2, r6)
            goto L_0x0101
        L_0x0098:
            androidx.work.WorkInfo$State r2 = r3.b
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.SUCCEEDED
            if (r2 != r3) goto L_0x00a0
            r3 = 1
            goto L_0x00a1
        L_0x00a0:
            r3 = 0
        L_0x00a1:
            r15 = r15 & r3
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.FAILED
            if (r2 != r3) goto L_0x00a9
            r16 = 1
            goto L_0x00af
        L_0x00a9:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo$State.CANCELLED
            if (r2 != r3) goto L_0x00af
            r17 = 1
        L_0x00af:
            int r14 = r14 + 1
            r2 = 0
            r3 = 1
            goto L_0x006d
        L_0x00b4:
            r15 = 1
            r16 = 0
            r17 = 0
        L_0x00b9:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00c5
            if (r12 != 0) goto L_0x00c5
            r3 = 1
            goto L_0x00c6
        L_0x00c5:
            r3 = 0
        L_0x00c6:
            if (r3 == 0) goto L_0x0207
            h0.g0.r.s.p r3 = r11.q()
            h0.g0.r.s.q r3 = (h0.g0.r.s.q) r3
            java.util.List r3 = r3.j(r7)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r13 = r3.isEmpty()
            if (r13 != 0) goto L_0x0207
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.APPEND
            if (r8 == r13) goto L_0x0133
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r8 != r13) goto L_0x00e3
            goto L_0x0133
        L_0x00e3:
            androidx.work.ExistingWorkPolicy r13 = androidx.work.ExistingWorkPolicy.KEEP
            if (r8 != r13) goto L_0x0107
            java.util.Iterator r8 = r3.iterator()
        L_0x00eb:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0107
            java.lang.Object r13 = r8.next()
            h0.g0.r.s.o$a r13 = (h0.g0.r.s.o.a) r13
            androidx.work.WorkInfo$State r13 = r13.b
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.ENQUEUED
            if (r13 == r14) goto L_0x0101
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.RUNNING
            if (r13 != r14) goto L_0x00eb
        L_0x0101:
            r20 = r4
            r1 = 1
            r2 = 0
            goto L_0x0335
        L_0x0107:
            h0.g0.r.t.b r8 = new h0.g0.r.t.b
            r13 = 0
            r8.<init>(r5, r7, r13)
            r8.run()
            h0.g0.r.s.p r5 = r11.q()
            java.util.Iterator r3 = r3.iterator()
        L_0x0118:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x012d
            java.lang.Object r8 = r3.next()
            h0.g0.r.s.o$a r8 = (h0.g0.r.s.o.a) r8
            java.lang.String r8 = r8.a
            r13 = r5
            h0.g0.r.s.q r13 = (h0.g0.r.s.q) r13
            r13.a(r8)
            goto L_0x0118
        L_0x012d:
            r20 = r4
            r5 = 1
            r14 = 0
            goto L_0x020b
        L_0x0133:
            h0.g0.r.s.b r5 = r11.l()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0140:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x01c1
            java.lang.Object r13 = r3.next()
            h0.g0.r.s.o$a r13 = (h0.g0.r.s.o.a) r13
            java.lang.String r14 = r13.a
            r18 = r3
            r3 = r5
            h0.g0.r.s.c r3 = (h0.g0.r.s.c) r3
            java.util.Objects.requireNonNull(r3)
            r19 = r5
            java.lang.String r5 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r20 = r4
            r4 = 1
            h0.w.g r5 = h0.w.g.e(r5, r4)
            if (r14 != 0) goto L_0x0167
            r5.i(r4)
            goto L_0x016a
        L_0x0167:
            r5.k(r4, r14)
        L_0x016a:
            androidx.room.RoomDatabase r4 = r3.a
            r4.b()
            androidx.room.RoomDatabase r3 = r3.a
            r4 = 0
            r14 = 0
            android.database.Cursor r3 = h0.w.k.b.a(r3, r5, r14, r4)
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x01b9 }
            if (r4 == 0) goto L_0x0185
            int r4 = r3.getInt(r14)     // Catch:{ all -> 0x01b9 }
            if (r4 == 0) goto L_0x0185
            r4 = 1
            goto L_0x0186
        L_0x0185:
            r4 = r14
        L_0x0186:
            r3.close()
            r5.l()
            if (r4 != 0) goto L_0x01b2
            androidx.work.WorkInfo$State r3 = r13.b
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo$State.SUCCEEDED
            if (r3 != r4) goto L_0x0196
            r5 = 1
            goto L_0x0197
        L_0x0196:
            r5 = r14
        L_0x0197:
            r4 = r5 & r15
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo$State.FAILED
            if (r3 != r5) goto L_0x019f
            r5 = 1
            goto L_0x01aa
        L_0x019f:
            androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo$State.CANCELLED
            if (r3 != r5) goto L_0x01a8
            r5 = r16
            r17 = 1
            goto L_0x01aa
        L_0x01a8:
            r5 = r16
        L_0x01aa:
            java.lang.String r3 = r13.a
            r12.add(r3)
            r15 = r4
            r16 = r5
        L_0x01b2:
            r3 = r18
            r5 = r19
            r4 = r20
            goto L_0x0140
        L_0x01b9:
            r0 = move-exception
            r3.close()
            r5.l()
            throw r0
        L_0x01c1:
            r20 = r4
            r14 = 0
            androidx.work.ExistingWorkPolicy r3 = androidx.work.ExistingWorkPolicy.APPEND_OR_REPLACE
            if (r8 != r3) goto L_0x01f6
            if (r17 != 0) goto L_0x01cc
            if (r16 == 0) goto L_0x01f6
        L_0x01cc:
            h0.g0.r.s.p r3 = r11.q()
            h0.g0.r.s.q r3 = (h0.g0.r.s.q) r3
            java.util.List r4 = r3.j(r7)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01dc:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01ee
            java.lang.Object r5 = r4.next()
            h0.g0.r.s.o$a r5 = (h0.g0.r.s.o.a) r5
            java.lang.String r5 = r5.a
            r3.a(r5)
            goto L_0x01dc
        L_0x01ee:
            java.util.List r12 = java.util.Collections.emptyList()
            r5 = r14
            r17 = r5
            goto L_0x01f8
        L_0x01f6:
            r5 = r16
        L_0x01f8:
            java.lang.Object[] r1 = r12.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            r16 = r5
            if (r3 <= 0) goto L_0x0205
            r12 = 1
            goto L_0x020a
        L_0x0205:
            r12 = r14
            goto L_0x020a
        L_0x0207:
            r20 = r4
            r14 = 0
        L_0x020a:
            r5 = r14
        L_0x020b:
            java.util.Iterator r3 = r6.iterator()
        L_0x020f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0333
            java.lang.Object r4 = r3.next()
            h0.g0.o r4 = (h0.g0.o) r4
            h0.g0.r.s.o r6 = r4.b
            if (r12 == 0) goto L_0x0234
            if (r15 != 0) goto L_0x0234
            if (r16 == 0) goto L_0x0228
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo$State.FAILED
            r6.b = r8
            goto L_0x023c
        L_0x0228:
            if (r17 == 0) goto L_0x022f
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo$State.CANCELLED
            r6.b = r8
            goto L_0x023c
        L_0x022f:
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo$State.BLOCKED
            r6.b = r8
            goto L_0x023c
        L_0x0234:
            boolean r8 = r6.c()
            if (r8 != 0) goto L_0x023e
            r6.n = r9
        L_0x023c:
            r8 = r15
            goto L_0x0243
        L_0x023e:
            r8 = r15
            r14 = 0
            r6.n = r14
        L_0x0243:
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 25
            if (r13 > r14) goto L_0x024c
            b(r6)
        L_0x024c:
            androidx.work.WorkInfo$State r13 = r6.b
            androidx.work.WorkInfo$State r14 = androidx.work.WorkInfo$State.ENQUEUED
            if (r13 != r14) goto L_0x0253
            r5 = 1
        L_0x0253:
            h0.g0.r.s.p r13 = r11.q()
            h0.g0.r.s.q r13 = (h0.g0.r.s.q) r13
            androidx.room.RoomDatabase r14 = r13.a
            r14.b()
            androidx.room.RoomDatabase r14 = r13.a
            r14.c()
            h0.w.b<h0.g0.r.s.o> r14 = r13.b     // Catch:{ all -> 0x032c }
            r14.e(r6)     // Catch:{ all -> 0x032c }
            androidx.room.RoomDatabase r6 = r13.a     // Catch:{ all -> 0x032c }
            r6.k()     // Catch:{ all -> 0x032c }
            androidx.room.RoomDatabase r6 = r13.a
            r6.g()
            if (r12 == 0) goto L_0x02b0
            int r6 = r1.length
            r13 = 0
        L_0x0276:
            if (r13 >= r6) goto L_0x02b0
            r14 = r1[r13]
            h0.g0.r.s.a r15 = new h0.g0.r.s.a
            r18 = r1
            java.lang.String r1 = r4.a()
            r15.<init>(r1, r14)
            h0.g0.r.s.b r1 = r11.l()
            h0.g0.r.s.c r1 = (h0.g0.r.s.c) r1
            androidx.room.RoomDatabase r14 = r1.a
            r14.b()
            androidx.room.RoomDatabase r14 = r1.a
            r14.c()
            h0.w.b<h0.g0.r.s.a> r14 = r1.b     // Catch:{ all -> 0x02a9 }
            r14.e(r15)     // Catch:{ all -> 0x02a9 }
            androidx.room.RoomDatabase r14 = r1.a     // Catch:{ all -> 0x02a9 }
            r14.k()     // Catch:{ all -> 0x02a9 }
            androidx.room.RoomDatabase r1 = r1.a
            r1.g()
            int r13 = r13 + 1
            r1 = r18
            goto L_0x0276
        L_0x02a9:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r1.a
            r1.g()
            throw r0
        L_0x02b0:
            r18 = r1
            java.util.Set<java.lang.String> r1 = r4.c
            java.util.Iterator r1 = r1.iterator()
        L_0x02b8:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x02f4
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            h0.g0.r.s.s r13 = r11.r()
            h0.g0.r.s.r r14 = new h0.g0.r.s.r
            java.lang.String r15 = r4.a()
            r14.<init>(r6, r15)
            h0.g0.r.s.t r13 = (h0.g0.r.s.t) r13
            androidx.room.RoomDatabase r6 = r13.a
            r6.b()
            androidx.room.RoomDatabase r6 = r13.a
            r6.c()
            h0.w.b<h0.g0.r.s.r> r6 = r13.b     // Catch:{ all -> 0x02ed }
            r6.e(r14)     // Catch:{ all -> 0x02ed }
            androidx.room.RoomDatabase r6 = r13.a     // Catch:{ all -> 0x02ed }
            r6.k()     // Catch:{ all -> 0x02ed }
            androidx.room.RoomDatabase r6 = r13.a
            r6.g()
            goto L_0x02b8
        L_0x02ed:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r13.a
            r1.g()
            throw r0
        L_0x02f4:
            if (r2 == 0) goto L_0x0326
            h0.g0.r.s.k r1 = r11.o()
            h0.g0.r.s.j r6 = new h0.g0.r.s.j
            java.lang.String r4 = r4.a()
            r6.<init>(r7, r4)
            h0.g0.r.s.l r1 = (h0.g0.r.s.l) r1
            androidx.room.RoomDatabase r4 = r1.a
            r4.b()
            androidx.room.RoomDatabase r4 = r1.a
            r4.c()
            h0.w.b<h0.g0.r.s.j> r4 = r1.b     // Catch:{ all -> 0x031f }
            r4.e(r6)     // Catch:{ all -> 0x031f }
            androidx.room.RoomDatabase r4 = r1.a     // Catch:{ all -> 0x031f }
            r4.k()     // Catch:{ all -> 0x031f }
            androidx.room.RoomDatabase r1 = r1.a
            r1.g()
            goto L_0x0326
        L_0x031f:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r1.a
            r1.g()
            throw r0
        L_0x0326:
            r15 = r8
            r1 = r18
            r14 = 0
            goto L_0x020f
        L_0x032c:
            r0 = move-exception
            androidx.room.RoomDatabase r1 = r13.a
            r1.g()
            throw r0
        L_0x0333:
            r2 = r5
            r1 = 1
        L_0x0335:
            r0.i = r1
            r0 = r20 | r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g0.r.t.d.a(h0.g0.r.g):boolean");
    }

    public static void b(o oVar) {
        b bVar = oVar.j;
        if (bVar.e || bVar.f) {
            String str = oVar.c;
            d.a aVar = new d.a();
            aVar.b(oVar.e.c);
            aVar.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            oVar.c = ConstraintTrackingWorker.class.getName();
            oVar.e = aVar.a();
        }
    }

    public void run() {
        WorkDatabase workDatabase;
        try {
            g gVar = this.d;
            Objects.requireNonNull(gVar);
            if (!g.b(gVar, new HashSet())) {
                workDatabase = this.d.b.g;
                workDatabase.c();
                boolean a = a(this.d);
                workDatabase.k();
                workDatabase.g();
                if (a) {
                    f.a(this.d.b.e, RescheduleReceiver.class, true);
                    l lVar = this.d.b;
                    f.a(lVar.f, lVar.g, lVar.i);
                }
                this.q.a(k.a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.d}));
        } catch (Throwable th) {
            this.q.a(new k.b.a(th));
        }
    }
}
