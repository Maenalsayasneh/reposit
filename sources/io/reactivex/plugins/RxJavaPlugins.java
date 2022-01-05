package io.reactivex.plugins;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import k0.b.a;
import k0.b.f;
import k0.b.g;
import k0.b.i;
import k0.b.l;
import k0.b.p;
import k0.b.q;
import k0.b.r;
import k0.b.t;
import k0.b.y.b;
import k0.b.y.c;
import k0.b.y.d;
import k0.b.y.e;
import k0.b.z.g.h;

public final class RxJavaPlugins {
    public static volatile d<? super Throwable> errorHandler;
    public static volatile boolean failNonBlockingScheduler;
    public static volatile boolean lockdown;
    public static volatile c onBeforeBlocking;
    public static volatile e<? super a, ? extends a> onCompletableAssembly;
    public static volatile b<? super a, ? super k0.b.c, ? extends k0.b.c> onCompletableSubscribe;
    public static volatile e<? super q, ? extends q> onComputationHandler;
    public static volatile e<? super k0.b.x.a, ? extends k0.b.x.a> onConnectableFlowableAssembly;
    public static volatile e<? super k0.b.a0.a, ? extends k0.b.a0.a> onConnectableObservableAssembly;
    public static volatile e<? super f, ? extends f> onFlowableAssembly;
    public static volatile b<? super f, ? super s0.b.a, ? extends s0.b.a> onFlowableSubscribe;
    public static volatile e<? super Callable<q>, ? extends q> onInitComputationHandler;
    public static volatile e<? super Callable<q>, ? extends q> onInitIoHandler;
    public static volatile e<? super Callable<q>, ? extends q> onInitNewThreadHandler;
    public static volatile e<? super Callable<q>, ? extends q> onInitSingleHandler;
    public static volatile e<? super q, ? extends q> onIoHandler;
    public static volatile e<? super g, ? extends g> onMaybeAssembly;
    public static volatile b<? super g, ? super i, ? extends i> onMaybeSubscribe;
    public static volatile e<? super q, ? extends q> onNewThreadHandler;
    public static volatile e<? super l, ? extends l> onObservableAssembly;
    public static volatile b<? super l, ? super p, ? extends p> onObservableSubscribe;
    public static volatile e<? super k0.b.c0.a, ? extends k0.b.c0.a> onParallelAssembly;
    public static volatile e<? super Runnable, ? extends Runnable> onScheduleHandler;
    public static volatile e<? super r, ? extends r> onSingleAssembly;
    public static volatile e<? super q, ? extends q> onSingleHandler;
    public static volatile b<? super r, ? super t, ? extends t> onSingleSubscribe;

    private RxJavaPlugins() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, R> R apply(e<T, R> eVar, T t) {
        try {
            return eVar.apply(t);
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }

    public static q applyRequireNonNull(e<? super Callable<q>, ? extends q> eVar, Callable<q> callable) {
        Object apply = apply(eVar, callable);
        Objects.requireNonNull(apply, "Scheduler Callable result can't be null");
        return (q) apply;
    }

    public static q callRequireNonNull(Callable<q> callable) {
        try {
            q call = callable.call();
            Objects.requireNonNull(call, "Scheduler Callable result can't be null");
            return call;
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }

    public static q createComputationScheduler(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new k0.b.z.g.a(threadFactory);
    }

    public static q createIoScheduler(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new k0.b.z.g.c(threadFactory);
    }

    public static q createNewThreadScheduler(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new k0.b.z.g.d(threadFactory);
    }

    public static q createSingleScheduler(ThreadFactory threadFactory) {
        Objects.requireNonNull(threadFactory, "threadFactory is null");
        return new h(threadFactory);
    }

    public static e<? super q, ? extends q> getComputationSchedulerHandler() {
        return onComputationHandler;
    }

    public static d<? super Throwable> getErrorHandler() {
        return errorHandler;
    }

    public static e<? super Callable<q>, ? extends q> getInitComputationSchedulerHandler() {
        return onInitComputationHandler;
    }

    public static e<? super Callable<q>, ? extends q> getInitIoSchedulerHandler() {
        return onInitIoHandler;
    }

    public static e<? super Callable<q>, ? extends q> getInitNewThreadSchedulerHandler() {
        return onInitNewThreadHandler;
    }

    public static e<? super Callable<q>, ? extends q> getInitSingleSchedulerHandler() {
        return onInitSingleHandler;
    }

    public static e<? super q, ? extends q> getIoSchedulerHandler() {
        return onIoHandler;
    }

    public static e<? super q, ? extends q> getNewThreadSchedulerHandler() {
        return onNewThreadHandler;
    }

    public static c getOnBeforeBlocking() {
        return onBeforeBlocking;
    }

    public static e<? super a, ? extends a> getOnCompletableAssembly() {
        return onCompletableAssembly;
    }

    public static b<? super a, ? super k0.b.c, ? extends k0.b.c> getOnCompletableSubscribe() {
        return onCompletableSubscribe;
    }

    public static e<? super k0.b.x.a, ? extends k0.b.x.a> getOnConnectableFlowableAssembly() {
        return onConnectableFlowableAssembly;
    }

    public static e<? super k0.b.a0.a, ? extends k0.b.a0.a> getOnConnectableObservableAssembly() {
        return onConnectableObservableAssembly;
    }

    public static e<? super f, ? extends f> getOnFlowableAssembly() {
        return onFlowableAssembly;
    }

    public static b<? super f, ? super s0.b.a, ? extends s0.b.a> getOnFlowableSubscribe() {
        return onFlowableSubscribe;
    }

    public static e<? super g, ? extends g> getOnMaybeAssembly() {
        return onMaybeAssembly;
    }

    public static b<? super g, ? super i, ? extends i> getOnMaybeSubscribe() {
        return onMaybeSubscribe;
    }

    public static e<? super l, ? extends l> getOnObservableAssembly() {
        return onObservableAssembly;
    }

    public static b<? super l, ? super p, ? extends p> getOnObservableSubscribe() {
        return onObservableSubscribe;
    }

    public static e<? super k0.b.c0.a, ? extends k0.b.c0.a> getOnParallelAssembly() {
        return onParallelAssembly;
    }

    public static e<? super r, ? extends r> getOnSingleAssembly() {
        return onSingleAssembly;
    }

    public static b<? super r, ? super t, ? extends t> getOnSingleSubscribe() {
        return onSingleSubscribe;
    }

    public static e<? super Runnable, ? extends Runnable> getScheduleHandler() {
        return onScheduleHandler;
    }

    public static e<? super q, ? extends q> getSingleSchedulerHandler() {
        return onSingleHandler;
    }

    public static q initComputationScheduler(Callable<q> callable) {
        Objects.requireNonNull(callable, "Scheduler Callable can't be null");
        e<? super Callable<q>, ? extends q> eVar = onInitComputationHandler;
        if (eVar == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(eVar, callable);
    }

    public static q initIoScheduler(Callable<q> callable) {
        Objects.requireNonNull(callable, "Scheduler Callable can't be null");
        e<? super Callable<q>, ? extends q> eVar = onInitIoHandler;
        if (eVar == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(eVar, callable);
    }

    public static q initNewThreadScheduler(Callable<q> callable) {
        Objects.requireNonNull(callable, "Scheduler Callable can't be null");
        e<? super Callable<q>, ? extends q> eVar = onInitNewThreadHandler;
        if (eVar == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(eVar, callable);
    }

    public static q initSingleScheduler(Callable<q> callable) {
        Objects.requireNonNull(callable, "Scheduler Callable can't be null");
        e<? super Callable<q>, ? extends q> eVar = onInitSingleHandler;
        if (eVar == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(eVar, callable);
    }

    public static boolean isBug(Throwable th) {
        if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            return false;
        }
        return true;
    }

    public static boolean isFailOnNonBlockingScheduler() {
        return failNonBlockingScheduler;
    }

    public static boolean isLockdown() {
        return lockdown;
    }

    public static void lockdown() {
        lockdown = true;
    }

    public static <T> g<T> onAssembly(g<T> gVar) {
        e<? super g, ? extends g> eVar = onMaybeAssembly;
        return eVar != null ? (g) apply(eVar, gVar) : gVar;
    }

    public static boolean onBeforeBlocking() {
        c cVar = onBeforeBlocking;
        if (cVar == null) {
            return false;
        }
        try {
            return cVar.a();
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }

    public static q onComputationScheduler(q qVar) {
        e<? super q, ? extends q> eVar = onComputationHandler;
        if (eVar == null) {
            return qVar;
        }
        return (q) apply(eVar, qVar);
    }

    public static void onError(Throwable th) {
        d<? super Throwable> dVar = errorHandler;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!isBug(th)) {
            th = new UndeliverableException(th);
        }
        if (dVar != null) {
            try {
                dVar.b(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                uncaught(th2);
            }
        }
        th.printStackTrace();
        uncaught(th);
    }

    public static q onIoScheduler(q qVar) {
        e<? super q, ? extends q> eVar = onIoHandler;
        if (eVar == null) {
            return qVar;
        }
        return (q) apply(eVar, qVar);
    }

    public static q onNewThreadScheduler(q qVar) {
        e<? super q, ? extends q> eVar = onNewThreadHandler;
        if (eVar == null) {
            return qVar;
        }
        return (q) apply(eVar, qVar);
    }

    public static Runnable onSchedule(Runnable runnable) {
        Objects.requireNonNull(runnable, "run is null");
        e<? super Runnable, ? extends Runnable> eVar = onScheduleHandler;
        if (eVar == null) {
            return runnable;
        }
        return (Runnable) apply(eVar, runnable);
    }

    public static q onSingleScheduler(q qVar) {
        e<? super q, ? extends q> eVar = onSingleHandler;
        if (eVar == null) {
            return qVar;
        }
        return (q) apply(eVar, qVar);
    }

    public static <T> s0.b.a<? super T> onSubscribe(f<T> fVar, s0.b.a<? super T> aVar) {
        b<? super f, ? super s0.b.a, ? extends s0.b.a> bVar = onFlowableSubscribe;
        return bVar != null ? (s0.b.a) apply(bVar, fVar, aVar) : aVar;
    }

    public static void reset() {
        setErrorHandler((d<? super Throwable>) null);
        setScheduleHandler((e<? super Runnable, ? extends Runnable>) null);
        setComputationSchedulerHandler((e<? super q, ? extends q>) null);
        setInitComputationSchedulerHandler((e<? super Callable<q>, ? extends q>) null);
        setIoSchedulerHandler((e<? super q, ? extends q>) null);
        setInitIoSchedulerHandler((e<? super Callable<q>, ? extends q>) null);
        setSingleSchedulerHandler((e<? super q, ? extends q>) null);
        setInitSingleSchedulerHandler((e<? super Callable<q>, ? extends q>) null);
        setNewThreadSchedulerHandler((e<? super q, ? extends q>) null);
        setInitNewThreadSchedulerHandler((e<? super Callable<q>, ? extends q>) null);
        setOnFlowableAssembly((e<? super f, ? extends f>) null);
        setOnFlowableSubscribe((b<? super f, ? super s0.b.a, ? extends s0.b.a>) null);
        setOnObservableAssembly((e<? super l, ? extends l>) null);
        setOnObservableSubscribe((b<? super l, ? super p, ? extends p>) null);
        setOnSingleAssembly((e<? super r, ? extends r>) null);
        setOnSingleSubscribe((b<? super r, ? super t, ? extends t>) null);
        setOnCompletableAssembly((e<? super a, ? extends a>) null);
        setOnCompletableSubscribe((b<? super a, ? super k0.b.c, ? extends k0.b.c>) null);
        setOnConnectableFlowableAssembly((e<? super k0.b.x.a, ? extends k0.b.x.a>) null);
        setOnConnectableObservableAssembly((e<? super k0.b.a0.a, ? extends k0.b.a0.a>) null);
        setOnMaybeAssembly((e<? super g, ? extends g>) null);
        setOnMaybeSubscribe((b<? super g, i, ? extends i>) null);
        setOnParallelAssembly((e<? super k0.b.c0.a, ? extends k0.b.c0.a>) null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking((c) null);
    }

    public static void setComputationSchedulerHandler(e<? super q, ? extends q> eVar) {
        if (!lockdown) {
            onComputationHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setErrorHandler(d<? super Throwable> dVar) {
        if (!lockdown) {
            errorHandler = dVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setFailOnNonBlockingScheduler(boolean z) {
        if (!lockdown) {
            failNonBlockingScheduler = z;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitComputationSchedulerHandler(e<? super Callable<q>, ? extends q> eVar) {
        if (!lockdown) {
            onInitComputationHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitIoSchedulerHandler(e<? super Callable<q>, ? extends q> eVar) {
        if (!lockdown) {
            onInitIoHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitNewThreadSchedulerHandler(e<? super Callable<q>, ? extends q> eVar) {
        if (!lockdown) {
            onInitNewThreadHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setInitSingleSchedulerHandler(e<? super Callable<q>, ? extends q> eVar) {
        if (!lockdown) {
            onInitSingleHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setIoSchedulerHandler(e<? super q, ? extends q> eVar) {
        if (!lockdown) {
            onIoHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setNewThreadSchedulerHandler(e<? super q, ? extends q> eVar) {
        if (!lockdown) {
            onNewThreadHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnBeforeBlocking(c cVar) {
        if (!lockdown) {
            onBeforeBlocking = cVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnCompletableAssembly(e<? super a, ? extends a> eVar) {
        if (!lockdown) {
            onCompletableAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnCompletableSubscribe(b<? super a, ? super k0.b.c, ? extends k0.b.c> bVar) {
        if (!lockdown) {
            onCompletableSubscribe = bVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnConnectableFlowableAssembly(e<? super k0.b.x.a, ? extends k0.b.x.a> eVar) {
        if (!lockdown) {
            onConnectableFlowableAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnConnectableObservableAssembly(e<? super k0.b.a0.a, ? extends k0.b.a0.a> eVar) {
        if (!lockdown) {
            onConnectableObservableAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnFlowableAssembly(e<? super f, ? extends f> eVar) {
        if (!lockdown) {
            onFlowableAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnFlowableSubscribe(b<? super f, ? super s0.b.a, ? extends s0.b.a> bVar) {
        if (!lockdown) {
            onFlowableSubscribe = bVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnMaybeAssembly(e<? super g, ? extends g> eVar) {
        if (!lockdown) {
            onMaybeAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnMaybeSubscribe(b<? super g, i, ? extends i> bVar) {
        if (!lockdown) {
            onMaybeSubscribe = bVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnObservableAssembly(e<? super l, ? extends l> eVar) {
        if (!lockdown) {
            onObservableAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnObservableSubscribe(b<? super l, ? super p, ? extends p> bVar) {
        if (!lockdown) {
            onObservableSubscribe = bVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnParallelAssembly(e<? super k0.b.c0.a, ? extends k0.b.c0.a> eVar) {
        if (!lockdown) {
            onParallelAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnSingleAssembly(e<? super r, ? extends r> eVar) {
        if (!lockdown) {
            onSingleAssembly = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setOnSingleSubscribe(b<? super r, ? super t, ? extends t> bVar) {
        if (!lockdown) {
            onSingleSubscribe = bVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setScheduleHandler(e<? super Runnable, ? extends Runnable> eVar) {
        if (!lockdown) {
            onScheduleHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void setSingleSchedulerHandler(e<? super q, ? extends q> eVar) {
        if (!lockdown) {
            onSingleHandler = eVar;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }

    public static void uncaught(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }

    public static void unlock() {
        lockdown = false;
    }

    public static <T, U, R> R apply(b<T, U, R> bVar, T t, U u) {
        try {
            i0.j.e.v0.e.h hVar = (i0.j.e.v0.e.h) bVar;
            Objects.requireNonNull(hVar);
            R r = (Integer) u;
            hVar.a.c.onFailed((Throwable) t);
            return r;
        } catch (Throwable th) {
            throw ExceptionHelper.a(th);
        }
    }

    public static <T> f<T> onAssembly(f<T> fVar) {
        e<? super f, ? extends f> eVar = onFlowableAssembly;
        return eVar != null ? (f) apply(eVar, fVar) : fVar;
    }

    public static <T> p<? super T> onSubscribe(l<T> lVar, p<? super T> pVar) {
        b<? super l, ? super p, ? extends p> bVar = onObservableSubscribe;
        return bVar != null ? (p) apply(bVar, lVar, pVar) : pVar;
    }

    public static <T> k0.b.x.a<T> onAssembly(k0.b.x.a<T> aVar) {
        e<? super k0.b.x.a, ? extends k0.b.x.a> eVar = onConnectableFlowableAssembly;
        return eVar != null ? (k0.b.x.a) apply(eVar, aVar) : aVar;
    }

    public static <T> t<? super T> onSubscribe(r<T> rVar, t<? super T> tVar) {
        b<? super r, ? super t, ? extends t> bVar = onSingleSubscribe;
        return bVar != null ? (t) apply(bVar, rVar, tVar) : tVar;
    }

    public static <T> l<T> onAssembly(l<T> lVar) {
        e<? super l, ? extends l> eVar = onObservableAssembly;
        return eVar != null ? (l) apply(eVar, lVar) : lVar;
    }

    public static k0.b.c onSubscribe(a aVar, k0.b.c cVar) {
        b<? super a, ? super k0.b.c, ? extends k0.b.c> bVar = onCompletableSubscribe;
        return bVar != null ? (k0.b.c) apply(bVar, aVar, cVar) : cVar;
    }

    public static <T> k0.b.a0.a<T> onAssembly(k0.b.a0.a<T> aVar) {
        e<? super k0.b.a0.a, ? extends k0.b.a0.a> eVar = onConnectableObservableAssembly;
        return eVar != null ? (k0.b.a0.a) apply(eVar, aVar) : aVar;
    }

    public static <T> i<? super T> onSubscribe(g<T> gVar, i<? super T> iVar) {
        b<? super g, ? super i, ? extends i> bVar = onMaybeSubscribe;
        return bVar != null ? (i) apply(bVar, gVar, iVar) : iVar;
    }

    public static <T> r<T> onAssembly(r<T> rVar) {
        e<? super r, ? extends r> eVar = onSingleAssembly;
        return eVar != null ? (r) apply(eVar, rVar) : rVar;
    }

    public static a onAssembly(a aVar) {
        e<? super a, ? extends a> eVar = onCompletableAssembly;
        return eVar != null ? (a) apply(eVar, aVar) : aVar;
    }

    public static <T> k0.b.c0.a<T> onAssembly(k0.b.c0.a<T> aVar) {
        e<? super k0.b.c0.a, ? extends k0.b.c0.a> eVar = onParallelAssembly;
        return eVar != null ? (k0.b.c0.a) apply(eVar, aVar) : aVar;
    }
}
