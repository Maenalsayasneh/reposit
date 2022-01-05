package io.reactivex.internal.schedulers;

import io.reactivex.plugins.RxJavaPlugins;

public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        this.x = Thread.currentThread();
        try {
            this.q.run();
            this.x = null;
        } catch (Throwable th) {
            this.x = null;
            lazySet(AbstractDirectTask.c);
            RxJavaPlugins.onError(th);
        }
    }
}
