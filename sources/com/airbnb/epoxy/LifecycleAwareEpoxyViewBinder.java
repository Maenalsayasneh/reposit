package com.airbnb.epoxy;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.airbnb.epoxy.viewbinder.R;
import h0.b0.v;
import h0.q.a0;
import h0.q.o;
import i0.b.a.e0;
import i0.b.a.w;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Metadata;
import m0.c;
import m0.i;
import m0.n.a.a;
import m0.n.a.p;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0'\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R(\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/airbnb/epoxy/LifecycleAwareEpoxyViewBinder;", "Lh0/q/o;", "Lm0/i;", "onViewDestroyed", "()V", "Lkotlin/Function2;", "Li0/b/a/e0;", "Landroid/content/Context;", "b2", "Lm0/n/a/p;", "modelProvider", "", "a2", "Z", "fallbackToNameLookup", "Li0/b/a/v;", "q", "Lm0/c;", "getVisibilityTracker", "()Li0/b/a/v;", "visibilityTracker", "Lh0/q/p;", "x", "Lh0/q/p;", "lifecycleOwner", "Z1", "useVisibilityTracking", "", "Y1", "I", "viewId", "Lcom/airbnb/epoxy/EpoxyViewBinder;", "c", "Lcom/airbnb/epoxy/EpoxyViewBinder;", "viewBinder", "Landroid/view/View;", "d", "Landroid/view/View;", "lazyView", "Lkotlin/Function0;", "y", "Lm0/n/a/a;", "rootView", "<init>", "(Lh0/q/p;Lm0/n/a/a;IZZLm0/n/a/p;)V", "epoxy-viewbinder_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EpoxyViewBinderExtensions.kt */
public final class LifecycleAwareEpoxyViewBinder implements o {
    public final int Y1;
    public final boolean Z1;
    public final boolean a2;
    public final p<e0, Context, i> b2;
    public final EpoxyViewBinder c = new EpoxyViewBinder();
    public View d;
    public final c q = h.H2(LifecycleAwareEpoxyViewBinder$visibilityTracker$2.c);
    public final h0.q.p x;
    public final a<View> y;

    public LifecycleAwareEpoxyViewBinder(h0.q.p pVar, a<? extends View> aVar, int i, boolean z, boolean z2, p<? super e0, ? super Context, i> pVar2) {
        m0.n.b.i.e(pVar, "lifecycleOwner");
        m0.n.b.i.e(aVar, "rootView");
        m0.n.b.i.e(pVar2, "modelProvider");
        this.x = pVar;
        this.y = aVar;
        this.Y1 = i;
        this.Z1 = z;
        this.a2 = z2;
        this.b2 = pVar2;
    }

    @a0(Lifecycle.Event.ON_DESTROY)
    public final void onViewDestroyed() {
        View view = this.d;
        if (view != null) {
            Objects.requireNonNull(this.c);
            m0.n.b.i.e(view, "view");
            w v02 = v.v0(view);
            if (v02 != null) {
                v02.a();
                v02.a.B(v02.c());
                v02.a = null;
                m0.n.b.i.e(view, "$this$viewHolder");
                view.setTag(R.id.epoxy_view_binder, (Object) null);
            }
        }
        this.d = null;
        if (this.Z1) {
            ((i0.b.a.v) this.q.getValue()).a();
        }
    }
}
