package h0.g0.r.t;

import androidx.work.impl.WorkDatabase;
import h0.g0.r.s.d;
import h0.g0.r.s.f;

/* compiled from: IdGenerator */
public class e {
    public final WorkDatabase a;

    public e(WorkDatabase workDatabase) {
        this.a = workDatabase;
    }

    public final int a(String str) {
        this.a.c();
        try {
            Long a2 = ((f) this.a.m()).a(str);
            int i = 0;
            int intValue = a2 != null ? a2.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            ((f) this.a.m()).b(new d(str, (long) i));
            this.a.k();
            return intValue;
        } finally {
            this.a.g();
        }
    }

    public int b(int i, int i2) {
        synchronized (e.class) {
            int a2 = a("next_job_scheduler_id");
            if (a2 >= i) {
                if (a2 <= i2) {
                    i = a2;
                }
            }
            ((f) this.a.m()).b(new d("next_job_scheduler_id", (long) (i + 1)));
        }
        return i;
    }
}
