package com.instabug.library.util;

import androidx.annotation.Keep;
import k0.b.l;

@Keep
public class TaskDebouncer {
    private long lastRun;
    private final long timeout;

    public TaskDebouncer(long j) {
        this.timeout = j;
    }

    private long getElapsedTime() {
        return System.currentTimeMillis() - this.lastRun;
    }

    private void updateLastRun(long j) {
        this.lastRun = j;
    }

    public void debounce(Runnable runnable) {
        if (getElapsedTime() >= this.timeout) {
            updateLastRun(System.currentTimeMillis());
            runnable.run();
        }
    }

    public <T> l<T> debounce(l<T> lVar) {
        if (getElapsedTime() < this.timeout) {
            return l.g();
        }
        updateLastRun(System.currentTimeMillis());
        return lVar;
    }
}
