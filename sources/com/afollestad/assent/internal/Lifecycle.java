package com.afollestad.assent.internal;

import androidx.lifecycle.Lifecycle;
import h0.q.a0;
import h0.q.o;
import h0.q.p;
import h0.q.r;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0013\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0004R\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR$\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/afollestad/assent/internal/Lifecycle;", "Lh0/q/o;", "Lm0/i;", "onCreate", "()V", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Lh0/q/p;", "c", "Lh0/q/p;", "lifecycleOwner", "Lkotlin/Function1;", "Landroidx/lifecycle/Lifecycle$Event;", "q", "Lm0/n/a/l;", "onEvent", "", "d", "[Landroidx/lifecycle/Lifecycle$Event;", "watchFor", "<init>", "(Lh0/q/p;[Landroidx/lifecycle/Lifecycle$Event;Lm0/n/a/l;)V", "core"}, k = 1, mv = {1, 4, 0})
/* compiled from: Lifecycles.kt */
public final class Lifecycle implements o {
    public p c;
    public Lifecycle.Event[] d;
    public l<? super Lifecycle.Event, i> q;

    public Lifecycle(p pVar, Lifecycle.Event[] eventArr, l<? super Lifecycle.Event, i> lVar) {
        androidx.lifecycle.Lifecycle lifecycle;
        m0.n.b.i.f(eventArr, "watchFor");
        this.c = pVar;
        this.d = eventArr;
        this.q = lVar;
        if (pVar != null && (lifecycle = pVar.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }

    @a0(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        l<? super Lifecycle.Event, i> lVar;
        Lifecycle.Event[] eventArr = this.d;
        if (((eventArr.length == 0) || h.U(eventArr, Lifecycle.Event.ON_CREATE)) && (lVar = this.q) != null) {
            i invoke = lVar.invoke(Lifecycle.Event.ON_CREATE);
        }
    }

    @a0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        l<? super Lifecycle.Event, i> lVar;
        androidx.lifecycle.Lifecycle lifecycle;
        p pVar = this.c;
        if (!(pVar == null || (lifecycle = pVar.getLifecycle()) == null)) {
            r rVar = (r) lifecycle;
            rVar.d("removeObserver");
            rVar.b.k(this);
        }
        this.c = null;
        Lifecycle.Event[] eventArr = this.d;
        if (((eventArr.length == 0) || h.U(eventArr, Lifecycle.Event.ON_DESTROY)) && (lVar = this.q) != null) {
            i invoke = lVar.invoke(Lifecycle.Event.ON_DESTROY);
        }
        this.q = null;
    }

    @a0(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        l<? super Lifecycle.Event, i> lVar;
        Lifecycle.Event[] eventArr = this.d;
        if (((eventArr.length == 0) || h.U(eventArr, Lifecycle.Event.ON_PAUSE)) && (lVar = this.q) != null) {
            i invoke = lVar.invoke(Lifecycle.Event.ON_PAUSE);
        }
    }

    @a0(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        l<? super Lifecycle.Event, i> lVar;
        Lifecycle.Event[] eventArr = this.d;
        if (((eventArr.length == 0) || h.U(eventArr, Lifecycle.Event.ON_RESUME)) && (lVar = this.q) != null) {
            i invoke = lVar.invoke(Lifecycle.Event.ON_RESUME);
        }
    }

    @a0(Lifecycle.Event.ON_START)
    public final void onStart() {
        l<? super Lifecycle.Event, i> lVar;
        Lifecycle.Event[] eventArr = this.d;
        if (((eventArr.length == 0) || h.U(eventArr, Lifecycle.Event.ON_START)) && (lVar = this.q) != null) {
            i invoke = lVar.invoke(Lifecycle.Event.ON_START);
        }
    }

    @a0(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        l<? super Lifecycle.Event, i> lVar;
        Lifecycle.Event[] eventArr = this.d;
        if (((eventArr.length == 0) || h.U(eventArr, Lifecycle.Event.ON_STOP)) && (lVar = this.q) != null) {
            i invoke = lVar.invoke(Lifecycle.Event.ON_STOP);
        }
    }
}
