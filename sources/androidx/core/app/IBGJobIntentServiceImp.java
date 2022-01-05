package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.JobIntentService;
import com.instabug.library.util.InstabugSDKLogger;

public class IBGJobIntentServiceImp extends JobServiceEngine implements JobIntentService.b {
    public static final boolean DEBUG = false;
    public static final String TAG = "IBGJobIntentServiceImp";
    public final Object mLock = new Object();
    public JobParameters mParams;
    public final JobIntentService mService;

    public final class a implements JobIntentService.e {
        public final JobWorkItem a;

        public a(JobWorkItem jobWorkItem) {
            this.a = jobWorkItem;
        }

        public void a() {
            synchronized (IBGJobIntentServiceImp.this.mLock) {
                JobParameters jobParameters = IBGJobIntentServiceImp.this.mParams;
                if (jobParameters != null) {
                    try {
                        jobParameters.completeWork(this.a);
                    } catch (Exception e) {
                        InstabugSDKLogger.e(IBGJobIntentServiceImp.TAG, "IBJonIntentServiceImp has an issue on complete", e);
                    }
                }
            }
        }

        public Intent getIntent() {
            return this.a.getIntent();
        }
    }

    public IBGJobIntentServiceImp(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.mService = jobIntentService;
    }

    public IBinder compatGetBinder() {
        return getBinder();
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public JobIntentService.e dequeueWork() {
        JobWorkItem jobWorkItem;
        synchronized (this.mLock) {
            JobParameters jobParameters = this.mParams;
            if (jobParameters == null) {
                return null;
            }
            try {
                jobWorkItem = jobParameters.dequeueWork();
            } catch (Exception e) {
                InstabugSDKLogger.e(TAG, "IBJonIntentServiceImp has an issue on dequeueWork", e);
                jobWorkItem = null;
            }
        }
        if (jobWorkItem == null) {
            return null;
        }
        jobWorkItem.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
        return new a(jobWorkItem);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        synchronized (this.mLock) {
            this.mParams = jobParameters;
        }
        this.mService.ensureProcessorRunningLocked(false);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean doStopCurrentWork = this.mService.doStopCurrentWork();
        synchronized (this.mLock) {
            this.mParams = null;
        }
        return doStopCurrentWork;
    }
}
