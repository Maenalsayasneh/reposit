package io.sentry.android.core;

import androidx.core.app.NotificationCompat;
import com.instabug.library.model.State;
import com.pubnub.api.endpoints.objects_api.utils.Pager;
import h0.q.f;
import h0.q.p;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.SentryLevel;
import io.sentry.transport.CurrentDateProvider;
import io.sentry.transport.ICurrentDateProvider;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public final class LifecycleWatcher implements f {
    private final ICurrentDateProvider currentDateProvider;
    private final boolean enableAppLifecycleBreadcrumbs;
    private final boolean enableSessionTracking;
    /* access modifiers changed from: private */
    public final IHub hub;
    private final AtomicLong lastUpdatedSession;
    /* access modifiers changed from: private */
    public final AtomicBoolean runningSession;
    private final long sessionIntervalMillis;
    private final Timer timer;
    private TimerTask timerTask;

    public LifecycleWatcher(IHub iHub, long j, boolean z, boolean z2) {
        this(iHub, j, z, z2, CurrentDateProvider.getInstance());
    }

    private void addAppBreadcrumb(String str) {
        if (this.enableAppLifecycleBreadcrumbs) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType(NotificationCompat.CATEGORY_NAVIGATION);
            breadcrumb.setData("state", str);
            breadcrumb.setCategory("app.lifecycle");
            breadcrumb.setLevel(SentryLevel.INFO);
            this.hub.addBreadcrumb(breadcrumb);
        }
    }

    /* access modifiers changed from: private */
    public void addSessionBreadcrumb(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.setType("session");
        breadcrumb.setData("state", str);
        breadcrumb.setCategory("app.lifecycle");
        breadcrumb.setLevel(SentryLevel.INFO);
        this.hub.addBreadcrumb(breadcrumb);
    }

    private void cancelTask() {
        TimerTask timerTask2 = this.timerTask;
        if (timerTask2 != null) {
            timerTask2.cancel();
            this.timerTask = null;
        }
    }

    private void scheduleEndSession() {
        cancelTask();
        AnonymousClass1 r02 = new TimerTask() {
            public void run() {
                LifecycleWatcher.this.addSessionBreadcrumb(Pager.END_PARAM_NAME);
                LifecycleWatcher.this.hub.endSession();
                LifecycleWatcher.this.runningSession.set(false);
            }
        };
        this.timerTask = r02;
        this.timer.schedule(r02, this.sessionIntervalMillis);
    }

    private void startSession() {
        if (this.enableSessionTracking) {
            cancelTask();
            long currentTimeMillis = this.currentDateProvider.getCurrentTimeMillis();
            long j = this.lastUpdatedSession.get();
            if (j == 0 || j + this.sessionIntervalMillis <= currentTimeMillis) {
                addSessionBreadcrumb(Pager.START_PARAM_NAME);
                this.hub.startSession();
                this.runningSession.set(true);
            }
            this.lastUpdatedSession.set(currentTimeMillis);
        }
    }

    public TimerTask getTimerTask() {
        return this.timerTask;
    }

    public AtomicBoolean isRunningSession() {
        return this.runningSession;
    }

    public void onCreate(p pVar) {
    }

    public void onDestroy(p pVar) {
    }

    public void onPause(p pVar) {
    }

    public void onResume(p pVar) {
    }

    public void onStart(p pVar) {
        startSession();
        addAppBreadcrumb(State.VALUE_APP_STATUS_FOREGROUND);
    }

    public void onStop(p pVar) {
        if (this.enableSessionTracking) {
            this.lastUpdatedSession.set(this.currentDateProvider.getCurrentTimeMillis());
            scheduleEndSession();
        }
        addAppBreadcrumb(State.VALUE_APP_STATUS_BACKGROUND);
    }

    public LifecycleWatcher(IHub iHub, long j, boolean z, boolean z2, ICurrentDateProvider iCurrentDateProvider) {
        this.lastUpdatedSession = new AtomicLong(0);
        this.timer = new Timer(true);
        this.runningSession = new AtomicBoolean();
        this.sessionIntervalMillis = j;
        this.enableSessionTracking = z;
        this.enableAppLifecycleBreadcrumbs = z2;
        this.hub = iHub;
        this.currentDateProvider = iCurrentDateProvider;
    }
}
