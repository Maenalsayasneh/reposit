package i0.h.a.a.i.s.h;

import android.app.job.JobParameters;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;

/* compiled from: JobInfoSchedulerService */
public final /* synthetic */ class e implements Runnable {
    public final JobInfoSchedulerService c;
    public final JobParameters d;

    public e(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.c = jobInfoSchedulerService;
        this.d = jobParameters;
    }

    public void run() {
        JobInfoSchedulerService jobInfoSchedulerService = this.c;
        JobParameters jobParameters = this.d;
        int i = JobInfoSchedulerService.c;
        jobInfoSchedulerService.jobFinished(jobParameters, false);
    }
}
