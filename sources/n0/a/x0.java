package n0.a;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.h2.e;

/* compiled from: Executors.kt */
public final class x0 extends w0 implements j0 {
    public final Executor d;

    public x0(Executor executor) {
        this.d = executor;
        Method method = e.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = e.a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public o0 C(long j, Runnable runnable, m0.l.e eVar) {
        Executor executor = this.d;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = T(scheduledExecutorService, runnable, eVar, j);
        }
        if (scheduledFuture != null) {
            return new n0(scheduledFuture);
        }
        return g0.a2.C(j, runnable, eVar);
    }

    public void I(m0.l.e eVar, Runnable runnable) {
        try {
            this.d.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            a.l0(eVar, cancellationException);
            m0.c.I(eVar, runnable);
        }
    }

    public final ScheduledFuture<?> T(ScheduledExecutorService scheduledExecutorService, Runnable runnable, m0.l.e eVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            a.l0(eVar, cancellationException);
            return null;
        }
    }

    public void close() {
        Executor executor = this.d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public void e(long j, m<? super i> mVar) {
        Executor executor = this.d;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            scheduledFuture = T(scheduledExecutorService, new t1(this, mVar), ((n) mVar).Z1, j);
        }
        if (scheduledFuture != null) {
            ((n) mVar).p(new j(scheduledFuture));
        } else {
            g0.a2.e(j, mVar);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof x0) && ((x0) obj).d == this.d;
    }

    public int hashCode() {
        return System.identityHashCode(this.d);
    }

    public String toString() {
        return this.d.toString();
    }
}
