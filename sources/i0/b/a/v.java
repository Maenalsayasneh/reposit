package i0.b.a;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.viewmodeladapter.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EpoxyViewBinderVisibilityTracker.kt */
public final class v {
    public static final int a = R.id.epoxy_visibility_tracker;
    public static final a b = new a((f) null);
    public final SparseArray<x> c = new SparseArray<>();
    public boolean d = true;
    public View e;
    public b f;
    public final Map<RecyclerView, y> g = new HashMap();
    public Integer h;

    /* compiled from: EpoxyViewBinderVisibilityTracker.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: EpoxyViewBinderVisibilityTracker.kt */
    public final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public final View c;
        public final /* synthetic */ v d;

        public b(v vVar, View view) {
            i.e(view, "view");
            this.d = vVar;
            this.c = view;
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            v vVar = this.d;
            View view = this.c;
            vVar.b(view, !(view.getVisibility() == 0), "onGlobalLayout");
        }
    }

    public final void a() {
        View view = this.e;
        if (view != null) {
            b(view, true, "detach");
            if (!(view instanceof RecyclerView)) {
                view = null;
            }
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView != null) {
                this.g.remove(recyclerView);
            }
        }
        this.e = null;
        b bVar = this.f;
        if (bVar != null) {
            bVar.c.getViewTreeObserver().removeOnGlobalLayoutListener(bVar);
        }
    }

    public final void b(View view, boolean z, String str) {
        w v02 = h0.b0.v.v0(view);
        if (v02 != null) {
            v02.a();
            r rVar = v02.c;
            c(view, z, str, v02);
            if (rVar instanceof f0) {
                Objects.requireNonNull((f0) rVar);
                throw null;
            }
        }
    }

    public final void c(View view, boolean z, String str, w wVar) {
        y yVar;
        View view2 = wVar.itemView;
        i.d(view2, "epoxyHolder.itemView");
        int identityHashCode = System.identityHashCode(view2);
        x xVar = this.c.get(identityHashCode);
        ViewGroup viewGroup = null;
        if (xVar == null) {
            xVar = new x((Integer) null);
            this.c.put(identityHashCode, xVar);
        }
        boolean z2 = false;
        ViewParent parent = view2.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = parent;
        }
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 != null && xVar.g(view2, viewGroup2, z)) {
            xVar.e(wVar, z);
            Integer num = this.h;
            if (num != null) {
                i.c(num);
                xVar.d(wVar, z, num.intValue());
            }
            xVar.b(wVar, z);
            xVar.c(wVar, z);
            z2 = xVar.a(wVar, this.d);
        }
        if (z2 && (view instanceof RecyclerView) && (yVar = this.g.get(view)) != null) {
            yVar.b("requestVisibilityCheck", true);
        }
    }

    public final void d(RecyclerView recyclerView) {
        y yVar = (y) recyclerView.getTag(a);
        if (yVar == null) {
            yVar = new y();
            yVar.m = this.h;
            yVar.a(recyclerView);
        }
        this.g.put(recyclerView, yVar);
    }
}
