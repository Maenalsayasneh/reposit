package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import i0.h.a.a.i.b;
import i0.h.a.a.i.h;
import i0.h.a.a.i.m;
import i0.h.a.a.i.s.h.e;
import i0.h.a.a.i.s.h.f;
import i0.h.a.a.i.s.h.k;
import i0.h.a.a.i.v.a;

public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int c = 0;

    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        m.b(getApplicationContext());
        h.a a = h.a();
        a.b(string);
        a.c(a.b(i));
        if (string2 != null) {
            ((b.C0125b) a).b = Base64.decode(string2, 0);
        }
        k kVar = m.a().e;
        kVar.e.execute(new f(kVar, a.a(), i2, new e(this, jobParameters)));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
