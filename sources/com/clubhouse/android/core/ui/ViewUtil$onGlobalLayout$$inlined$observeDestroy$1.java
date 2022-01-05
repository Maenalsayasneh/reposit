package com.clubhouse.android.core.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import h0.q.a0;
import h0.q.o;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/clubhouse/android/shared/LifecycleUtil$observeDestroy$2", "Lh0/q/o;", "Lm0/i;", "onDestroy", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: LifecycleUtil.kt */
public final class ViewUtil$onGlobalLayout$$inlined$observeDestroy$1 implements o {
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener d;

    public ViewUtil$onGlobalLayout$$inlined$observeDestroy$1(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.c = view;
        this.d = onGlobalLayoutListener;
    }

    @a0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this.d);
    }
}
