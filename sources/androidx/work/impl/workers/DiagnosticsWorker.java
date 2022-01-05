package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import g0.a.b.b.a;
import h0.b0.v;
import h0.g0.d;
import h0.g0.i;
import h0.g0.r.s.g;
import h0.g0.r.s.h;
import h0.g0.r.s.k;
import h0.g0.r.s.l;
import h0.g0.r.s.o;
import h0.g0.r.s.p;
import h0.g0.r.s.q;
import h0.g0.r.s.s;
import h0.g0.r.s.t;
import h0.w.k.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class DiagnosticsWorker extends Worker {
    public static final String Y1 = i.e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    public static String h(k kVar, s sVar, h hVar, List<o> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{"Job Id"}));
        for (o next : list) {
            g a = ((h0.g0.r.s.i) hVar).a(next.a);
            Integer valueOf = a != null ? Integer.valueOf(a.b) : null;
            String str = next.a;
            l lVar = (l) kVar;
            Objects.requireNonNull(lVar);
            h0.w.g e = h0.w.g.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
            if (str == null) {
                e.i(1);
            } else {
                e.k(1, str);
            }
            lVar.a.b();
            Cursor a2 = b.a(lVar.a, e, false, (CancellationSignal) null);
            try {
                ArrayList arrayList = new ArrayList(a2.getCount());
                while (a2.moveToNext()) {
                    arrayList.add(a2.getString(0));
                }
                a2.close();
                e.l();
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{next.a, next.c, valueOf, next.b.name(), TextUtils.join(InstabugDbContract.COMMA_SEP, arrayList), TextUtils.join(InstabugDbContract.COMMA_SEP, ((t) sVar).a(next.a))}));
            } catch (Throwable th) {
                a2.close();
                e.l();
                throw th;
            }
        }
        return sb.toString();
    }

    public ListenableWorker.a g() {
        h0.w.g gVar;
        h hVar;
        s sVar;
        k kVar;
        int i;
        WorkDatabase workDatabase = h0.g0.r.l.c(this.c).g;
        p q = workDatabase.q();
        k o = workDatabase.o();
        s r = workDatabase.r();
        h n = workDatabase.n();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1);
        q qVar = (q) q;
        Objects.requireNonNull(qVar);
        h0.w.g e = h0.w.g.e("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        e.f(1, currentTimeMillis);
        qVar.a.b();
        Cursor a = b.a(qVar.a, e, false, (CancellationSignal) null);
        try {
            int J = a.J(a, "required_network_type");
            int J2 = a.J(a, "requires_charging");
            int J3 = a.J(a, "requires_device_idle");
            int J4 = a.J(a, "requires_battery_not_low");
            int J5 = a.J(a, "requires_storage_not_low");
            int J6 = a.J(a, "trigger_content_update_delay");
            int J7 = a.J(a, "trigger_max_content_delay");
            int J8 = a.J(a, "content_uri_triggers");
            int J9 = a.J(a, "id");
            int J10 = a.J(a, "state");
            h hVar2 = n;
            int J11 = a.J(a, "worker_class_name");
            k kVar2 = o;
            int J12 = a.J(a, "input_merger_class_name");
            s sVar2 = r;
            int J13 = a.J(a, "input");
            q qVar2 = qVar;
            int J14 = a.J(a, "output");
            gVar = e;
            try {
                int J15 = a.J(a, "initial_delay");
                int J16 = a.J(a, "interval_duration");
                int J17 = a.J(a, "flex_duration");
                int J18 = a.J(a, "run_attempt_count");
                int J19 = a.J(a, "backoff_policy");
                int J20 = a.J(a, "backoff_delay_duration");
                int J21 = a.J(a, "period_start_time");
                int J22 = a.J(a, "minimum_retention_duration");
                int J23 = a.J(a, "schedule_requested_at");
                int J24 = a.J(a, "run_in_foreground");
                int i2 = J14;
                ArrayList arrayList = new ArrayList(a.getCount());
                while (a.moveToNext()) {
                    String string = a.getString(J9);
                    int i3 = J9;
                    String string2 = a.getString(J11);
                    int i4 = J11;
                    h0.g0.b bVar = new h0.g0.b();
                    int i5 = J;
                    bVar.b = v.B0(a.getInt(J));
                    bVar.c = a.getInt(J2) != 0;
                    bVar.d = a.getInt(J3) != 0;
                    bVar.e = a.getInt(J4) != 0;
                    bVar.f = a.getInt(J5) != 0;
                    int i6 = J2;
                    bVar.g = a.getLong(J6);
                    bVar.h = a.getLong(J7);
                    bVar.i = v.r(a.getBlob(J8));
                    o oVar = new o(string, string2);
                    oVar.b = v.C0(a.getInt(J10));
                    oVar.d = a.getString(J12);
                    oVar.e = d.a(a.getBlob(J13));
                    int i7 = i2;
                    oVar.f = d.a(a.getBlob(i7));
                    int i8 = J10;
                    i2 = i7;
                    int i9 = J15;
                    oVar.g = a.getLong(i9);
                    int i10 = J12;
                    int i11 = J16;
                    oVar.h = a.getLong(i11);
                    int i12 = J13;
                    int i13 = J17;
                    oVar.i = a.getLong(i13);
                    int i14 = J18;
                    oVar.k = a.getInt(i14);
                    int i15 = J19;
                    int i16 = i11;
                    oVar.l = v.A0(a.getInt(i15));
                    J17 = i13;
                    int i17 = i14;
                    int i18 = J20;
                    oVar.m = a.getLong(i18);
                    int i19 = i15;
                    int i20 = J21;
                    oVar.n = a.getLong(i20);
                    int i21 = i18;
                    J21 = i20;
                    int i22 = J22;
                    oVar.o = a.getLong(i22);
                    J22 = i22;
                    int i23 = J23;
                    oVar.p = a.getLong(i23);
                    int i24 = J24;
                    oVar.q = a.getInt(i24) != 0;
                    oVar.j = bVar;
                    arrayList.add(oVar);
                    J23 = i23;
                    J24 = i24;
                    J10 = i8;
                    J12 = i10;
                    J11 = i4;
                    J2 = i6;
                    J = i5;
                    J15 = i9;
                    J9 = i3;
                    int i25 = i19;
                    J20 = i21;
                    J13 = i12;
                    J16 = i16;
                    J18 = i17;
                    J19 = i25;
                }
                a.close();
                gVar.l();
                List<o> e2 = qVar2.e();
                List<o> b = qVar2.b(200);
                if (!arrayList.isEmpty()) {
                    i c = i.c();
                    String str = Y1;
                    i = 0;
                    c.d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    i.c().d(str, h(kVar, sVar, hVar, arrayList), new Throwable[0]);
                } else {
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    i = 0;
                }
                if (!((ArrayList) e2).isEmpty()) {
                    i c2 = i.c();
                    String str2 = Y1;
                    c2.d(str2, "Running work:\n\n", new Throwable[i]);
                    i.c().d(str2, h(kVar, sVar, hVar, e2), new Throwable[i]);
                }
                if (!((ArrayList) b).isEmpty()) {
                    i c3 = i.c();
                    String str3 = Y1;
                    c3.d(str3, "Enqueued work:\n\n", new Throwable[i]);
                    i.c().d(str3, h(kVar, sVar, hVar, b), new Throwable[i]);
                }
                return new ListenableWorker.a.c();
            } catch (Throwable th) {
                th = th;
                a.close();
                gVar.l();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gVar = e;
            a.close();
            gVar.l();
            throw th;
        }
    }
}
