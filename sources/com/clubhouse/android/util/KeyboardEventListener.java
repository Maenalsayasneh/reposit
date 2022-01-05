package com.clubhouse.android.util;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import h0.q.a0;
import h0.q.o;
import i0.e.b.i3.a;
import kotlin.Metadata;
import m0.i;
import m0.n.a.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/clubhouse/android/util/KeyboardEventListener;", "Lh0/q/o;", "Lm0/i;", "onPause", "()V", "onResume", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "x", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "listener", "Landroid/view/View;", "c", "Landroid/view/View;", "rootView", "Lkotlin/Function2;", "", "", "d", "Lm0/n/a/p;", "callback", "q", "Z", "prevValue", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;Landroid/view/View;Lm0/n/a/p;)V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: KeyboardEventListener.kt */
public final class KeyboardEventListener implements o {
    public final View c;
    public final p<Boolean, Integer, i> d;
    public boolean q;
    public final ViewTreeObserver.OnGlobalLayoutListener x = new a(this);

    public KeyboardEventListener(Lifecycle lifecycle, View view, p<? super Boolean, ? super Integer, i> pVar) {
        m0.n.b.i.e(lifecycle, "lifecycle");
        m0.n.b.i.e(view, "rootView");
        m0.n.b.i.e(pVar, "callback");
        this.c = view;
        this.d = pVar;
        lifecycle.a(this);
    }

    @a0(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.x);
    }

    @a0(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.c.getViewTreeObserver().addOnGlobalLayoutListener(this.x);
    }
}
