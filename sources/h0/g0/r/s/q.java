package h0.g0.r.s;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import androidx.work.WorkInfo$State;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import h0.g0.r.s.o;
import h0.w.i;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WorkSpecDao_Impl */
public final class q implements p {
    public final RoomDatabase a;
    public final h0.w.b<o> b;
    public final i c;
    public final i d;
    public final i e;
    public final i f;
    public final i g;
    public final i h;
    public final i i;

    /* compiled from: WorkSpecDao_Impl */
    public class a extends h0.w.b<o> {
        public a(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: java.io.ObjectOutputStream} */
        /* JADX WARNING: type inference failed for: r3v11 */
        /* JADX WARNING: type inference failed for: r3v18 */
        /* JADX WARNING: type inference failed for: r3v27 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01b1 A[SYNTHETIC, Splitter:B:62:0x01b1] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x01dd A[SYNTHETIC, Splitter:B:76:0x01dd] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(h0.y.a.f.f r17, java.lang.Object r18) {
            /*
                r16 = this;
                r1 = r17
                r0 = r18
                h0.g0.r.s.o r0 = (h0.g0.r.s.o) r0
                java.lang.String r2 = r0.a
                r3 = 1
                if (r2 != 0) goto L_0x0011
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r2.bindNull(r3)
                goto L_0x0016
            L_0x0011:
                android.database.sqlite.SQLiteProgram r4 = r1.c
                r4.bindString(r3, r2)
            L_0x0016:
                androidx.work.WorkInfo$State r2 = r0.b
                int r2 = h0.b0.v.l2(r2)
                long r4 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r6 = 2
                r2.bindLong(r6, r4)
                java.lang.String r2 = r0.c
                r4 = 3
                if (r2 != 0) goto L_0x002e
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r2.bindNull(r4)
                goto L_0x0033
            L_0x002e:
                android.database.sqlite.SQLiteProgram r5 = r1.c
                r5.bindString(r4, r2)
            L_0x0033:
                java.lang.String r2 = r0.d
                r5 = 4
                if (r2 != 0) goto L_0x003e
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r2.bindNull(r5)
                goto L_0x0043
            L_0x003e:
                android.database.sqlite.SQLiteProgram r7 = r1.c
                r7.bindString(r5, r2)
            L_0x0043:
                h0.g0.d r2 = r0.e
                byte[] r2 = h0.g0.d.b(r2)
                r7 = 5
                if (r2 != 0) goto L_0x0052
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r2.bindNull(r7)
                goto L_0x0057
            L_0x0052:
                android.database.sqlite.SQLiteProgram r8 = r1.c
                r8.bindBlob(r7, r2)
            L_0x0057:
                h0.g0.d r2 = r0.f
                byte[] r2 = h0.g0.d.b(r2)
                r7 = 6
                if (r2 != 0) goto L_0x0066
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r2.bindNull(r7)
                goto L_0x006b
            L_0x0066:
                android.database.sqlite.SQLiteProgram r8 = r1.c
                r8.bindBlob(r7, r2)
            L_0x006b:
                r2 = 7
                long r7 = r0.g
                android.database.sqlite.SQLiteProgram r9 = r1.c
                r9.bindLong(r2, r7)
                r2 = 8
                long r7 = r0.h
                android.database.sqlite.SQLiteProgram r9 = r1.c
                r9.bindLong(r2, r7)
                r2 = 9
                long r7 = r0.i
                android.database.sqlite.SQLiteProgram r9 = r1.c
                r9.bindLong(r2, r7)
                r2 = 10
                int r7 = r0.k
                long r7 = (long) r7
                android.database.sqlite.SQLiteProgram r9 = r1.c
                r9.bindLong(r2, r7)
                androidx.work.BackoffPolicy r2 = r0.l
                int r7 = r2.ordinal()
                java.lang.String r8 = " to int"
                java.lang.String r9 = "Could not convert "
                if (r7 == 0) goto L_0x00b7
                if (r7 != r3) goto L_0x009f
                r2 = r3
                goto L_0x00b8
            L_0x009f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r2)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00b7:
                r2 = 0
            L_0x00b8:
                r7 = 11
                long r11 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r2.bindLong(r7, r11)
                r2 = 12
                long r11 = r0.m
                android.database.sqlite.SQLiteProgram r7 = r1.c
                r7.bindLong(r2, r11)
                r2 = 13
                long r11 = r0.n
                android.database.sqlite.SQLiteProgram r7 = r1.c
                r7.bindLong(r2, r11)
                r2 = 14
                long r11 = r0.o
                android.database.sqlite.SQLiteProgram r7 = r1.c
                r7.bindLong(r2, r11)
                r2 = 15
                long r11 = r0.p
                android.database.sqlite.SQLiteProgram r7 = r1.c
                r7.bindLong(r2, r11)
                boolean r2 = r0.q
                r7 = 16
                long r11 = (long) r2
                android.database.sqlite.SQLiteProgram r2 = r1.c
                r2.bindLong(r7, r11)
                h0.g0.b r0 = r0.j
                r2 = 22
                r7 = 21
                r11 = 20
                r12 = 19
                r13 = 18
                r14 = 17
                if (r0 == 0) goto L_0x01f0
                androidx.work.NetworkType r10 = r0.b
                int r15 = r10.ordinal()
                if (r15 == 0) goto L_0x012c
                if (r15 == r3) goto L_0x012a
                if (r15 == r6) goto L_0x0129
                if (r15 == r4) goto L_0x0127
                if (r15 != r5) goto L_0x010f
                goto L_0x012d
            L_0x010f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r9)
                r1.append(r10)
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0127:
                r3 = r4
                goto L_0x012a
            L_0x0129:
                r3 = r6
            L_0x012a:
                r5 = r3
                goto L_0x012d
            L_0x012c:
                r5 = 0
            L_0x012d:
                long r3 = (long) r5
                android.database.sqlite.SQLiteProgram r5 = r1.c
                r5.bindLong(r14, r3)
                boolean r3 = r0.c
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.c
                r5.bindLong(r13, r3)
                boolean r3 = r0.d
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.c
                r5.bindLong(r12, r3)
                boolean r3 = r0.e
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.c
                r5.bindLong(r11, r3)
                boolean r3 = r0.f
                long r3 = (long) r3
                android.database.sqlite.SQLiteProgram r5 = r1.c
                r5.bindLong(r7, r3)
                long r3 = r0.g
                android.database.sqlite.SQLiteProgram r5 = r1.c
                r5.bindLong(r2, r3)
                long r2 = r0.h
                android.database.sqlite.SQLiteProgram r4 = r1.c
                r5 = 23
                r4.bindLong(r5, r2)
                h0.g0.c r0 = r0.i
                int r2 = r0.a()
                r3 = 0
                if (r2 != 0) goto L_0x016d
                goto L_0x01c7
            L_0x016d:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01ab }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01ab }
                int r3 = r0.a()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.util.Set<h0.g0.c$a> r0 = r0.a     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
            L_0x0184:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                if (r3 == 0) goto L_0x019f
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                h0.g0.c$a r3 = (h0.g0.c.a) r3     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                android.net.Uri r5 = r3.a     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                boolean r3 = r3.b     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x01a6, all -> 0x01a3 }
                goto L_0x0184
            L_0x019f:
                r4.close()     // Catch:{ IOException -> 0x01b5 }
                goto L_0x01ba
            L_0x01a3:
                r0 = move-exception
                r1 = r0
                goto L_0x01db
            L_0x01a6:
                r0 = move-exception
                r3 = r4
                goto L_0x01ac
            L_0x01a9:
                r0 = move-exception
                goto L_0x01d9
            L_0x01ab:
                r0 = move-exception
            L_0x01ac:
                r0.printStackTrace()     // Catch:{ all -> 0x01a9 }
                if (r3 == 0) goto L_0x01ba
                r3.close()     // Catch:{ IOException -> 0x01b5 }
                goto L_0x01ba
            L_0x01b5:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01ba:
                r2.close()     // Catch:{ IOException -> 0x01be }
                goto L_0x01c3
            L_0x01be:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01c3:
                byte[] r3 = r2.toByteArray()
            L_0x01c7:
                if (r3 != 0) goto L_0x01d1
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r2 = 24
                r0.bindNull(r2)
                goto L_0x021c
            L_0x01d1:
                r2 = 24
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r0.bindBlob(r2, r3)
                goto L_0x021c
            L_0x01d9:
                r1 = r0
                r4 = r3
            L_0x01db:
                if (r4 == 0) goto L_0x01e6
                r4.close()     // Catch:{ IOException -> 0x01e1 }
                goto L_0x01e6
            L_0x01e1:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01e6:
                r2.close()     // Catch:{ IOException -> 0x01ea }
                goto L_0x01ef
            L_0x01ea:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x01ef:
                throw r1
            L_0x01f0:
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r0.bindNull(r14)
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r0.bindNull(r13)
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r0.bindNull(r12)
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r0.bindNull(r11)
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r0.bindNull(r7)
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r2 = 23
                r0.bindNull(r2)
                android.database.sqlite.SQLiteProgram r0 = r1.c
                r1 = 24
                r0.bindNull(r1)
            L_0x021c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.g0.r.s.q.a.d(h0.y.a.f.f, java.lang.Object):void");
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class b extends i {
        public b(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class c extends i {
        public c(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class d extends i {
        public d(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class e extends i {
        public e(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class f extends i {
        public f(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class g extends i {
        public g(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl */
    public class h extends i {
        public h(q qVar, RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        public String b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public q(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new a(this, roomDatabase);
        this.c = new b(this, roomDatabase);
        this.d = new c(this, roomDatabase);
        this.e = new d(this, roomDatabase);
        this.f = new e(this, roomDatabase);
        this.g = new f(this, roomDatabase);
        this.h = new g(this, roomDatabase);
        this.i = new h(this, roomDatabase);
        new AtomicBoolean(false);
    }

    public void a(String str) {
        this.a.b();
        h0.y.a.f.f a2 = this.c.a();
        if (str == null) {
            a2.c.bindNull(1);
        } else {
            a2.c.bindString(1, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            i iVar = this.c;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.c.c(a2);
            throw th;
        }
    }

    public List<o> b(int i2) {
        h0.w.g gVar;
        h0.w.g e2 = h0.w.g.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        e2.f(1, (long) i2);
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            int J = g0.a.b.b.a.J(a2, "required_network_type");
            int J2 = g0.a.b.b.a.J(a2, "requires_charging");
            int J3 = g0.a.b.b.a.J(a2, "requires_device_idle");
            int J4 = g0.a.b.b.a.J(a2, "requires_battery_not_low");
            int J5 = g0.a.b.b.a.J(a2, "requires_storage_not_low");
            int J6 = g0.a.b.b.a.J(a2, "trigger_content_update_delay");
            int J7 = g0.a.b.b.a.J(a2, "trigger_max_content_delay");
            int J8 = g0.a.b.b.a.J(a2, "content_uri_triggers");
            int J9 = g0.a.b.b.a.J(a2, "id");
            int J10 = g0.a.b.b.a.J(a2, "state");
            int J11 = g0.a.b.b.a.J(a2, "worker_class_name");
            int J12 = g0.a.b.b.a.J(a2, "input_merger_class_name");
            int J13 = g0.a.b.b.a.J(a2, "input");
            int J14 = g0.a.b.b.a.J(a2, "output");
            gVar = e2;
            try {
                int J15 = g0.a.b.b.a.J(a2, "initial_delay");
                int J16 = g0.a.b.b.a.J(a2, "interval_duration");
                int J17 = g0.a.b.b.a.J(a2, "flex_duration");
                int J18 = g0.a.b.b.a.J(a2, "run_attempt_count");
                int J19 = g0.a.b.b.a.J(a2, "backoff_policy");
                int J20 = g0.a.b.b.a.J(a2, "backoff_delay_duration");
                int J21 = g0.a.b.b.a.J(a2, "period_start_time");
                int J22 = g0.a.b.b.a.J(a2, "minimum_retention_duration");
                int J23 = g0.a.b.b.a.J(a2, "schedule_requested_at");
                int J24 = g0.a.b.b.a.J(a2, "run_in_foreground");
                int i3 = J14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(J9);
                    int i4 = J9;
                    String string2 = a2.getString(J11);
                    int i5 = J11;
                    h0.g0.b bVar = new h0.g0.b();
                    int i6 = J;
                    bVar.b = v.B0(a2.getInt(J));
                    bVar.c = a2.getInt(J2) != 0;
                    bVar.d = a2.getInt(J3) != 0;
                    bVar.e = a2.getInt(J4) != 0;
                    bVar.f = a2.getInt(J5) != 0;
                    int i7 = J2;
                    int i8 = J3;
                    bVar.g = a2.getLong(J6);
                    bVar.h = a2.getLong(J7);
                    bVar.i = v.r(a2.getBlob(J8));
                    o oVar = new o(string, string2);
                    oVar.b = v.C0(a2.getInt(J10));
                    oVar.d = a2.getString(J12);
                    oVar.e = h0.g0.d.a(a2.getBlob(J13));
                    int i9 = i3;
                    oVar.f = h0.g0.d.a(a2.getBlob(i9));
                    int i10 = i7;
                    i3 = i9;
                    int i11 = J15;
                    oVar.g = a2.getLong(i11);
                    int i12 = J12;
                    int i13 = J16;
                    oVar.h = a2.getLong(i13);
                    int i14 = i11;
                    int i15 = J4;
                    int i16 = J17;
                    oVar.i = a2.getLong(i16);
                    int i17 = J18;
                    oVar.k = a2.getInt(i17);
                    int i18 = J19;
                    int i19 = i13;
                    oVar.l = v.A0(a2.getInt(i18));
                    J17 = i16;
                    int i20 = i15;
                    int i21 = J20;
                    oVar.m = a2.getLong(i21);
                    int i22 = i17;
                    int i23 = i18;
                    int i24 = J21;
                    oVar.n = a2.getLong(i24);
                    int i25 = i21;
                    J21 = i24;
                    int i26 = J22;
                    oVar.o = a2.getLong(i26);
                    int i27 = i22;
                    int i28 = J23;
                    oVar.p = a2.getLong(i28);
                    int i29 = J24;
                    oVar.q = a2.getInt(i29) != 0;
                    oVar.j = bVar;
                    arrayList.add(oVar);
                    J23 = i28;
                    J24 = i29;
                    J2 = i10;
                    J12 = i12;
                    J15 = i14;
                    J16 = i19;
                    J18 = i27;
                    J9 = i4;
                    J11 = i5;
                    J = i6;
                    J22 = i26;
                    J3 = i8;
                    int i30 = i23;
                    J20 = i25;
                    J4 = i20;
                    J19 = i30;
                }
                a2.close();
                gVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                gVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = e2;
            a2.close();
            gVar.l();
            throw th;
        }
    }

    public List<String> c() {
        h0.w.g e2 = h0.w.g.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            e2.l();
        }
    }

    public List<o> d(int i2) {
        h0.w.g gVar;
        h0.w.g e2 = h0.w.g.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        e2.f(1, (long) i2);
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            int J = g0.a.b.b.a.J(a2, "required_network_type");
            int J2 = g0.a.b.b.a.J(a2, "requires_charging");
            int J3 = g0.a.b.b.a.J(a2, "requires_device_idle");
            int J4 = g0.a.b.b.a.J(a2, "requires_battery_not_low");
            int J5 = g0.a.b.b.a.J(a2, "requires_storage_not_low");
            int J6 = g0.a.b.b.a.J(a2, "trigger_content_update_delay");
            int J7 = g0.a.b.b.a.J(a2, "trigger_max_content_delay");
            int J8 = g0.a.b.b.a.J(a2, "content_uri_triggers");
            int J9 = g0.a.b.b.a.J(a2, "id");
            int J10 = g0.a.b.b.a.J(a2, "state");
            int J11 = g0.a.b.b.a.J(a2, "worker_class_name");
            int J12 = g0.a.b.b.a.J(a2, "input_merger_class_name");
            int J13 = g0.a.b.b.a.J(a2, "input");
            int J14 = g0.a.b.b.a.J(a2, "output");
            gVar = e2;
            try {
                int J15 = g0.a.b.b.a.J(a2, "initial_delay");
                int J16 = g0.a.b.b.a.J(a2, "interval_duration");
                int J17 = g0.a.b.b.a.J(a2, "flex_duration");
                int J18 = g0.a.b.b.a.J(a2, "run_attempt_count");
                int J19 = g0.a.b.b.a.J(a2, "backoff_policy");
                int J20 = g0.a.b.b.a.J(a2, "backoff_delay_duration");
                int J21 = g0.a.b.b.a.J(a2, "period_start_time");
                int J22 = g0.a.b.b.a.J(a2, "minimum_retention_duration");
                int J23 = g0.a.b.b.a.J(a2, "schedule_requested_at");
                int J24 = g0.a.b.b.a.J(a2, "run_in_foreground");
                int i3 = J14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(J9);
                    int i4 = J9;
                    String string2 = a2.getString(J11);
                    int i5 = J11;
                    h0.g0.b bVar = new h0.g0.b();
                    int i6 = J;
                    bVar.b = v.B0(a2.getInt(J));
                    bVar.c = a2.getInt(J2) != 0;
                    bVar.d = a2.getInt(J3) != 0;
                    bVar.e = a2.getInt(J4) != 0;
                    bVar.f = a2.getInt(J5) != 0;
                    int i7 = J2;
                    int i8 = J3;
                    bVar.g = a2.getLong(J6);
                    bVar.h = a2.getLong(J7);
                    bVar.i = v.r(a2.getBlob(J8));
                    o oVar = new o(string, string2);
                    oVar.b = v.C0(a2.getInt(J10));
                    oVar.d = a2.getString(J12);
                    oVar.e = h0.g0.d.a(a2.getBlob(J13));
                    int i9 = i3;
                    oVar.f = h0.g0.d.a(a2.getBlob(i9));
                    int i10 = i7;
                    i3 = i9;
                    int i11 = J15;
                    oVar.g = a2.getLong(i11);
                    int i12 = J12;
                    int i13 = J16;
                    oVar.h = a2.getLong(i13);
                    int i14 = i11;
                    int i15 = J4;
                    int i16 = J17;
                    oVar.i = a2.getLong(i16);
                    int i17 = J18;
                    oVar.k = a2.getInt(i17);
                    int i18 = J19;
                    int i19 = i13;
                    oVar.l = v.A0(a2.getInt(i18));
                    J17 = i16;
                    int i20 = i15;
                    int i21 = J20;
                    oVar.m = a2.getLong(i21);
                    int i22 = i17;
                    int i23 = i18;
                    int i24 = J21;
                    oVar.n = a2.getLong(i24);
                    int i25 = i21;
                    J21 = i24;
                    int i26 = J22;
                    oVar.o = a2.getLong(i26);
                    int i27 = i22;
                    int i28 = J23;
                    oVar.p = a2.getLong(i28);
                    int i29 = J24;
                    oVar.q = a2.getInt(i29) != 0;
                    oVar.j = bVar;
                    arrayList.add(oVar);
                    J23 = i28;
                    J24 = i29;
                    J2 = i10;
                    J12 = i12;
                    J15 = i14;
                    J16 = i19;
                    J18 = i27;
                    J9 = i4;
                    J11 = i5;
                    J = i6;
                    J22 = i26;
                    J3 = i8;
                    int i30 = i23;
                    J20 = i25;
                    J4 = i20;
                    J19 = i30;
                }
                a2.close();
                gVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                gVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = e2;
            a2.close();
            gVar.l();
            throw th;
        }
    }

    public List<o> e() {
        h0.w.g gVar;
        h0.w.g e2 = h0.w.g.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            int J = g0.a.b.b.a.J(a2, "required_network_type");
            int J2 = g0.a.b.b.a.J(a2, "requires_charging");
            int J3 = g0.a.b.b.a.J(a2, "requires_device_idle");
            int J4 = g0.a.b.b.a.J(a2, "requires_battery_not_low");
            int J5 = g0.a.b.b.a.J(a2, "requires_storage_not_low");
            int J6 = g0.a.b.b.a.J(a2, "trigger_content_update_delay");
            int J7 = g0.a.b.b.a.J(a2, "trigger_max_content_delay");
            int J8 = g0.a.b.b.a.J(a2, "content_uri_triggers");
            int J9 = g0.a.b.b.a.J(a2, "id");
            int J10 = g0.a.b.b.a.J(a2, "state");
            int J11 = g0.a.b.b.a.J(a2, "worker_class_name");
            int J12 = g0.a.b.b.a.J(a2, "input_merger_class_name");
            int J13 = g0.a.b.b.a.J(a2, "input");
            int J14 = g0.a.b.b.a.J(a2, "output");
            gVar = e2;
            try {
                int J15 = g0.a.b.b.a.J(a2, "initial_delay");
                int J16 = g0.a.b.b.a.J(a2, "interval_duration");
                int J17 = g0.a.b.b.a.J(a2, "flex_duration");
                int J18 = g0.a.b.b.a.J(a2, "run_attempt_count");
                int J19 = g0.a.b.b.a.J(a2, "backoff_policy");
                int J20 = g0.a.b.b.a.J(a2, "backoff_delay_duration");
                int J21 = g0.a.b.b.a.J(a2, "period_start_time");
                int J22 = g0.a.b.b.a.J(a2, "minimum_retention_duration");
                int J23 = g0.a.b.b.a.J(a2, "schedule_requested_at");
                int J24 = g0.a.b.b.a.J(a2, "run_in_foreground");
                int i2 = J14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(J9);
                    int i3 = J9;
                    String string2 = a2.getString(J11);
                    int i4 = J11;
                    h0.g0.b bVar = new h0.g0.b();
                    int i5 = J;
                    bVar.b = v.B0(a2.getInt(J));
                    bVar.c = a2.getInt(J2) != 0;
                    bVar.d = a2.getInt(J3) != 0;
                    bVar.e = a2.getInt(J4) != 0;
                    bVar.f = a2.getInt(J5) != 0;
                    int i6 = J2;
                    int i7 = J3;
                    bVar.g = a2.getLong(J6);
                    bVar.h = a2.getLong(J7);
                    bVar.i = v.r(a2.getBlob(J8));
                    o oVar = new o(string, string2);
                    oVar.b = v.C0(a2.getInt(J10));
                    oVar.d = a2.getString(J12);
                    oVar.e = h0.g0.d.a(a2.getBlob(J13));
                    int i8 = i2;
                    oVar.f = h0.g0.d.a(a2.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = J15;
                    oVar.g = a2.getLong(i10);
                    int i11 = J13;
                    int i12 = J16;
                    oVar.h = a2.getLong(i12);
                    int i13 = i10;
                    int i14 = J4;
                    int i15 = J17;
                    oVar.i = a2.getLong(i15);
                    int i16 = J18;
                    oVar.k = a2.getInt(i16);
                    int i17 = J19;
                    int i18 = i12;
                    oVar.l = v.A0(a2.getInt(i17));
                    J17 = i15;
                    int i19 = i14;
                    int i20 = J20;
                    oVar.m = a2.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = J21;
                    oVar.n = a2.getLong(i23);
                    int i24 = i20;
                    J21 = i23;
                    int i25 = J22;
                    oVar.o = a2.getLong(i25);
                    int i26 = i21;
                    int i27 = J23;
                    oVar.p = a2.getLong(i27);
                    int i28 = J24;
                    oVar.q = a2.getInt(i28) != 0;
                    oVar.j = bVar;
                    arrayList.add(oVar);
                    J23 = i27;
                    J24 = i28;
                    J2 = i9;
                    J13 = i11;
                    J15 = i13;
                    J16 = i18;
                    J18 = i26;
                    J9 = i3;
                    J11 = i4;
                    J = i5;
                    J22 = i25;
                    J3 = i7;
                    int i29 = i22;
                    J20 = i24;
                    J4 = i19;
                    J19 = i29;
                }
                a2.close();
                gVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                gVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = e2;
            a2.close();
            gVar.l();
            throw th;
        }
    }

    public List<o> f() {
        h0.w.g gVar;
        h0.w.g e2 = h0.w.g.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            int J = g0.a.b.b.a.J(a2, "required_network_type");
            int J2 = g0.a.b.b.a.J(a2, "requires_charging");
            int J3 = g0.a.b.b.a.J(a2, "requires_device_idle");
            int J4 = g0.a.b.b.a.J(a2, "requires_battery_not_low");
            int J5 = g0.a.b.b.a.J(a2, "requires_storage_not_low");
            int J6 = g0.a.b.b.a.J(a2, "trigger_content_update_delay");
            int J7 = g0.a.b.b.a.J(a2, "trigger_max_content_delay");
            int J8 = g0.a.b.b.a.J(a2, "content_uri_triggers");
            int J9 = g0.a.b.b.a.J(a2, "id");
            int J10 = g0.a.b.b.a.J(a2, "state");
            int J11 = g0.a.b.b.a.J(a2, "worker_class_name");
            int J12 = g0.a.b.b.a.J(a2, "input_merger_class_name");
            int J13 = g0.a.b.b.a.J(a2, "input");
            int J14 = g0.a.b.b.a.J(a2, "output");
            gVar = e2;
            try {
                int J15 = g0.a.b.b.a.J(a2, "initial_delay");
                int J16 = g0.a.b.b.a.J(a2, "interval_duration");
                int J17 = g0.a.b.b.a.J(a2, "flex_duration");
                int J18 = g0.a.b.b.a.J(a2, "run_attempt_count");
                int J19 = g0.a.b.b.a.J(a2, "backoff_policy");
                int J20 = g0.a.b.b.a.J(a2, "backoff_delay_duration");
                int J21 = g0.a.b.b.a.J(a2, "period_start_time");
                int J22 = g0.a.b.b.a.J(a2, "minimum_retention_duration");
                int J23 = g0.a.b.b.a.J(a2, "schedule_requested_at");
                int J24 = g0.a.b.b.a.J(a2, "run_in_foreground");
                int i2 = J14;
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    String string = a2.getString(J9);
                    int i3 = J9;
                    String string2 = a2.getString(J11);
                    int i4 = J11;
                    h0.g0.b bVar = new h0.g0.b();
                    int i5 = J;
                    bVar.b = v.B0(a2.getInt(J));
                    bVar.c = a2.getInt(J2) != 0;
                    bVar.d = a2.getInt(J3) != 0;
                    bVar.e = a2.getInt(J4) != 0;
                    bVar.f = a2.getInt(J5) != 0;
                    int i6 = J2;
                    int i7 = J3;
                    bVar.g = a2.getLong(J6);
                    bVar.h = a2.getLong(J7);
                    bVar.i = v.r(a2.getBlob(J8));
                    o oVar = new o(string, string2);
                    oVar.b = v.C0(a2.getInt(J10));
                    oVar.d = a2.getString(J12);
                    oVar.e = h0.g0.d.a(a2.getBlob(J13));
                    int i8 = i2;
                    oVar.f = h0.g0.d.a(a2.getBlob(i8));
                    int i9 = i6;
                    i2 = i8;
                    int i10 = J15;
                    oVar.g = a2.getLong(i10);
                    int i11 = J13;
                    int i12 = J16;
                    oVar.h = a2.getLong(i12);
                    int i13 = i10;
                    int i14 = J4;
                    int i15 = J17;
                    oVar.i = a2.getLong(i15);
                    int i16 = J18;
                    oVar.k = a2.getInt(i16);
                    int i17 = J19;
                    int i18 = i12;
                    oVar.l = v.A0(a2.getInt(i17));
                    J17 = i15;
                    int i19 = i14;
                    int i20 = J20;
                    oVar.m = a2.getLong(i20);
                    int i21 = i16;
                    int i22 = i17;
                    int i23 = J21;
                    oVar.n = a2.getLong(i23);
                    int i24 = i20;
                    J21 = i23;
                    int i25 = J22;
                    oVar.o = a2.getLong(i25);
                    int i26 = i21;
                    int i27 = J23;
                    oVar.p = a2.getLong(i27);
                    int i28 = J24;
                    oVar.q = a2.getInt(i28) != 0;
                    oVar.j = bVar;
                    arrayList.add(oVar);
                    J23 = i27;
                    J24 = i28;
                    J2 = i9;
                    J13 = i11;
                    J15 = i13;
                    J16 = i18;
                    J18 = i26;
                    J9 = i3;
                    J11 = i4;
                    J = i5;
                    J22 = i25;
                    J3 = i7;
                    int i29 = i22;
                    J20 = i24;
                    J4 = i19;
                    J19 = i29;
                }
                a2.close();
                gVar.l();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                a2.close();
                gVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = e2;
            a2.close();
            gVar.l();
            throw th;
        }
    }

    public WorkInfo$State g(String str) {
        h0.w.g e2 = h0.w.g.e("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            e2.i(1);
        } else {
            e2.k(1, str);
        }
        this.a.b();
        WorkInfo$State workInfo$State = null;
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            if (a2.moveToFirst()) {
                workInfo$State = v.C0(a2.getInt(0));
            }
            return workInfo$State;
        } finally {
            a2.close();
            e2.l();
        }
    }

    public List<String> h(String str) {
        h0.w.g e2 = h0.w.g.e("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e2.i(1);
        } else {
            e2.k(1, str);
        }
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                arrayList.add(a2.getString(0));
            }
            return arrayList;
        } finally {
            a2.close();
            e2.l();
        }
    }

    public o i(String str) {
        h0.w.g gVar;
        o oVar;
        String str2 = str;
        h0.w.g e2 = h0.w.g.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str2 == null) {
            e2.i(1);
        } else {
            e2.k(1, str2);
        }
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            int J = g0.a.b.b.a.J(a2, "required_network_type");
            int J2 = g0.a.b.b.a.J(a2, "requires_charging");
            int J3 = g0.a.b.b.a.J(a2, "requires_device_idle");
            int J4 = g0.a.b.b.a.J(a2, "requires_battery_not_low");
            int J5 = g0.a.b.b.a.J(a2, "requires_storage_not_low");
            int J6 = g0.a.b.b.a.J(a2, "trigger_content_update_delay");
            int J7 = g0.a.b.b.a.J(a2, "trigger_max_content_delay");
            int J8 = g0.a.b.b.a.J(a2, "content_uri_triggers");
            int J9 = g0.a.b.b.a.J(a2, "id");
            int J10 = g0.a.b.b.a.J(a2, "state");
            int J11 = g0.a.b.b.a.J(a2, "worker_class_name");
            int J12 = g0.a.b.b.a.J(a2, "input_merger_class_name");
            int J13 = g0.a.b.b.a.J(a2, "input");
            int J14 = g0.a.b.b.a.J(a2, "output");
            gVar = e2;
            try {
                int J15 = g0.a.b.b.a.J(a2, "initial_delay");
                int J16 = g0.a.b.b.a.J(a2, "interval_duration");
                int J17 = g0.a.b.b.a.J(a2, "flex_duration");
                int J18 = g0.a.b.b.a.J(a2, "run_attempt_count");
                int J19 = g0.a.b.b.a.J(a2, "backoff_policy");
                int J20 = g0.a.b.b.a.J(a2, "backoff_delay_duration");
                int J21 = g0.a.b.b.a.J(a2, "period_start_time");
                int J22 = g0.a.b.b.a.J(a2, "minimum_retention_duration");
                int J23 = g0.a.b.b.a.J(a2, "schedule_requested_at");
                int J24 = g0.a.b.b.a.J(a2, "run_in_foreground");
                if (a2.moveToFirst()) {
                    String string = a2.getString(J9);
                    String string2 = a2.getString(J11);
                    int i2 = J24;
                    h0.g0.b bVar = new h0.g0.b();
                    bVar.b = v.B0(a2.getInt(J));
                    bVar.c = a2.getInt(J2) != 0;
                    bVar.d = a2.getInt(J3) != 0;
                    bVar.e = a2.getInt(J4) != 0;
                    bVar.f = a2.getInt(J5) != 0;
                    bVar.g = a2.getLong(J6);
                    bVar.h = a2.getLong(J7);
                    bVar.i = v.r(a2.getBlob(J8));
                    o oVar2 = new o(string, string2);
                    oVar2.b = v.C0(a2.getInt(J10));
                    oVar2.d = a2.getString(J12);
                    oVar2.e = h0.g0.d.a(a2.getBlob(J13));
                    oVar2.f = h0.g0.d.a(a2.getBlob(J14));
                    oVar2.g = a2.getLong(J15);
                    oVar2.h = a2.getLong(J16);
                    oVar2.i = a2.getLong(J17);
                    oVar2.k = a2.getInt(J18);
                    oVar2.l = v.A0(a2.getInt(J19));
                    oVar2.m = a2.getLong(J20);
                    oVar2.n = a2.getLong(J21);
                    oVar2.o = a2.getLong(J22);
                    oVar2.p = a2.getLong(J23);
                    oVar2.q = a2.getInt(i2) != 0;
                    oVar2.j = bVar;
                    oVar = oVar2;
                } else {
                    oVar = null;
                }
                a2.close();
                gVar.l();
                return oVar;
            } catch (Throwable th) {
                th = th;
                a2.close();
                gVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = e2;
            a2.close();
            gVar.l();
            throw th;
        }
    }

    public List<o.a> j(String str) {
        h0.w.g e2 = h0.w.g.e("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            e2.i(1);
        } else {
            e2.k(1, str);
        }
        this.a.b();
        Cursor a2 = h0.w.k.b.a(this.a, e2, false, (CancellationSignal) null);
        try {
            int J = g0.a.b.b.a.J(a2, "id");
            int J2 = g0.a.b.b.a.J(a2, "state");
            ArrayList arrayList = new ArrayList(a2.getCount());
            while (a2.moveToNext()) {
                o.a aVar = new o.a();
                aVar.a = a2.getString(J);
                aVar.b = v.C0(a2.getInt(J2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a2.close();
            e2.l();
        }
    }

    public int k(String str) {
        this.a.b();
        h0.y.a.f.f a2 = this.f.a();
        if (str == null) {
            a2.c.bindNull(1);
        } else {
            a2.c.bindString(1, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.k();
            this.a.g();
            i iVar = this.f;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
            return a3;
        } catch (Throwable th) {
            this.a.g();
            this.f.c(a2);
            throw th;
        }
    }

    public int l(String str, long j) {
        this.a.b();
        h0.y.a.f.f a2 = this.h.a();
        a2.c.bindLong(1, j);
        if (str == null) {
            a2.c.bindNull(2);
        } else {
            a2.c.bindString(2, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.k();
            return a3;
        } finally {
            this.a.g();
            i iVar = this.h;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
        }
    }

    public int m(String str) {
        this.a.b();
        h0.y.a.f.f a2 = this.g.a();
        if (str == null) {
            a2.c.bindNull(1);
        } else {
            a2.c.bindString(1, str);
        }
        this.a.c();
        try {
            int a3 = a2.a();
            this.a.k();
            this.a.g();
            i iVar = this.g;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
            return a3;
        } catch (Throwable th) {
            this.a.g();
            this.g.c(a2);
            throw th;
        }
    }

    public void n(String str, h0.g0.d dVar) {
        this.a.b();
        h0.y.a.f.f a2 = this.d.a();
        byte[] b2 = h0.g0.d.b(dVar);
        if (b2 == null) {
            a2.c.bindNull(1);
        } else {
            a2.c.bindBlob(1, b2);
        }
        if (str == null) {
            a2.c.bindNull(2);
        } else {
            a2.c.bindString(2, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
            this.a.g();
            i iVar = this.d;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.g();
            this.d.c(a2);
            throw th;
        }
    }

    public void o(String str, long j) {
        this.a.b();
        h0.y.a.f.f a2 = this.e.a();
        a2.c.bindLong(1, j);
        if (str == null) {
            a2.c.bindNull(2);
        } else {
            a2.c.bindString(2, str);
        }
        this.a.c();
        try {
            a2.a();
            this.a.k();
        } finally {
            this.a.g();
            i iVar = this.e;
            if (a2 == iVar.c) {
                iVar.a.set(false);
            }
        }
    }

    public int p(WorkInfo$State workInfo$State, String... strArr) {
        this.a.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("?");
            if (i2 < length - 1) {
                sb.append(InstabugDbContract.COMMA_SEP);
            }
        }
        sb.append(")");
        h0.y.a.f.f d2 = this.a.d(sb.toString());
        d2.c.bindLong(1, (long) v.l2(workInfo$State));
        int i3 = 2;
        for (String str : strArr) {
            if (str == null) {
                d2.c.bindNull(i3);
            } else {
                d2.c.bindString(i3, str);
            }
            i3++;
        }
        this.a.c();
        try {
            int a2 = d2.a();
            this.a.k();
            return a2;
        } finally {
            this.a.g();
        }
    }
}
