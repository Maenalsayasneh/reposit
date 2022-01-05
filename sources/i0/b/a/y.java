package i0.b.a;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.viewmodeladapter.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EpoxyVisibilityTracker.kt */
public final class y {
    public static final int a = R.id.epoxy_visibility_tracker;
    public static final a b = new a((f) null);
    public final RecyclerView.k.a c = new d(this);
    public final SparseArray<x> d = new SparseArray<>();
    public final List<x> e = new ArrayList();
    public final c f = new c();
    public final b g = new b();
    public RecyclerView h;
    public RecyclerView.Adapter<?> i;
    public final Map<RecyclerView, y> j = new HashMap();
    public boolean k;
    public boolean l = true;
    public Integer m;

    /* compiled from: EpoxyVisibilityTracker.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* compiled from: EpoxyVisibilityTracker.kt */
    public final class b extends RecyclerView.h {
        public b() {
        }

        public void a() {
            if (!h(y.this.h)) {
                y.this.d.clear();
                y.this.e.clear();
                y.this.k = true;
            }
        }

        public void d(int i, int i2) {
            if (!h(y.this.h)) {
                for (x next : y.this.e) {
                    int i3 = next.b;
                    if (i3 >= i) {
                        y.this.k = true;
                        next.b = i3 + i2;
                    }
                }
            }
        }

        public void e(int i, int i2, int i3) {
            if (!h(y.this.h)) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i + i4;
                    int i6 = i2 + i4;
                    if (!h(y.this.h)) {
                        for (x next : y.this.e) {
                            int i7 = next.b;
                            if (i7 == i5) {
                                next.f(i6 - i5);
                                y.this.k = true;
                            } else if (i5 < i6) {
                                if (i5 + 1 <= i7 && i6 >= i7) {
                                    next.f(-1);
                                    y.this.k = true;
                                }
                            } else if (i5 > i6 && i6 <= i7 && i5 > i7) {
                                next.f(1);
                                y.this.k = true;
                            }
                        }
                    }
                }
            }
        }

        public void f(int i, int i2) {
            if (!h(y.this.h)) {
                for (x next : y.this.e) {
                    if (next.b >= i) {
                        y.this.k = true;
                        next.f(-i2);
                    }
                }
            }
        }

        public final boolean h(RecyclerView recyclerView) {
            return recyclerView == null || !(recyclerView.getAdapter() instanceof d);
        }
    }

    /* compiled from: EpoxyVisibilityTracker.kt */
    public final class c extends RecyclerView.s implements View.OnLayoutChangeListener, RecyclerView.p {
        public c() {
        }

        public void b(View view) {
            i.e(view, "child");
            if (view instanceof RecyclerView) {
                y.this.j.remove((RecyclerView) view);
            }
            y yVar = y.this;
            if (yVar.k) {
                yVar.d(view, "onChildViewDetachedFromWindow");
                y.this.k = false;
                return;
            }
            yVar.e(view, true, "onChildViewDetachedFromWindow");
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
            i.e(recyclerView, "recyclerView");
            y.c(y.this, "onScrolled", false, 2);
        }

        public void d(View view) {
            i.e(view, "child");
            if (view instanceof RecyclerView) {
                y.this.g((RecyclerView) view);
            }
            y.this.e(view, false, "onChildViewAttachedToWindow");
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            i.e(view, "recyclerView");
            y.c(y.this, "onLayoutChange", false, 2);
        }
    }

    /* compiled from: EpoxyVisibilityTracker.kt */
    public static final class d implements RecyclerView.k.a {
        public final /* synthetic */ y a;

        public d(y yVar) {
            this.a = yVar;
        }

        public final void a() {
            this.a.b("ItemAnimatorFinishedListener.onAnimationsFinished", false);
        }
    }

    public static /* synthetic */ void c(y yVar, String str, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        yVar.b(str, z);
    }

    public final void a(RecyclerView recyclerView) {
        i.e(recyclerView, "recyclerView");
        this.h = recyclerView;
        recyclerView.addOnScrollListener(this.f);
        recyclerView.addOnLayoutChangeListener(this.f);
        recyclerView.addOnChildAttachStateChangeListener(this.f);
        recyclerView.setTag(a, this);
    }

    public final void b(String str, boolean z) {
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            RecyclerView.k itemAnimator = recyclerView.getItemAnimator();
            if (!z || itemAnimator == null) {
                d((View) null, str);
            } else if (itemAnimator.isRunning(this.c)) {
                d((View) null, str);
            }
        }
    }

    public final void d(View view, String str) {
        RecyclerView.Adapter<?> adapter;
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null || !(!i.a(this.i, adapter)))) {
                RecyclerView.Adapter<?> adapter2 = this.i;
                if (adapter2 != null) {
                    adapter2.unregisterAdapterDataObserver(this.g);
                }
                adapter.registerAdapterDataObserver(this.g);
                this.i = adapter;
            }
            if (view != null) {
                e(view, true, str);
            }
            int childCount = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (!(childAt == null || childAt == view)) {
                    e(childAt, false, str);
                }
            }
        }
    }

    public final void e(View view, boolean z, String str) {
        RecyclerView recyclerView = this.h;
        if (recyclerView != null) {
            RecyclerView.b0 childViewHolder = view.getParent() == null || view.getParent() == recyclerView ? recyclerView.getChildViewHolder(view) : null;
            if (childViewHolder instanceof w) {
                w wVar = (w) childViewHolder;
                wVar.a();
                r rVar = wVar.c;
                f(recyclerView, view, z, str, wVar);
                if (rVar instanceof f0) {
                    Objects.requireNonNull((f0) rVar);
                    throw null;
                }
            }
        }
    }

    public final void f(RecyclerView recyclerView, View view, boolean z, String str, w wVar) {
        y yVar;
        View view2 = wVar.itemView;
        i.d(view2, "epoxyHolder.itemView");
        int identityHashCode = System.identityHashCode(view2);
        x xVar = this.d.get(identityHashCode);
        boolean z2 = false;
        if (xVar == null) {
            xVar = new x(Integer.valueOf(wVar.getAdapterPosition()));
            this.d.put(identityHashCode, xVar);
            this.e.add(xVar);
        } else if (!(wVar.getAdapterPosition() == -1 || xVar.b == wVar.getAdapterPosition())) {
            int adapterPosition = wVar.getAdapterPosition();
            xVar.j = false;
            xVar.k = false;
            xVar.l = false;
            xVar.b = adapterPosition;
            xVar.n = null;
            xVar.o = null;
            xVar.p = null;
        }
        if (xVar.g(view2, recyclerView, z)) {
            xVar.e(wVar, z);
            Integer num = this.m;
            if (num != null) {
                xVar.d(wVar, z, num.intValue());
            }
            xVar.b(wVar, z);
            xVar.c(wVar, z);
            z2 = xVar.a(wVar, this.l);
        }
        if (z2 && (view instanceof RecyclerView) && (yVar = this.j.get(view)) != null) {
            yVar.b("parent", true);
        }
    }

    public final void g(RecyclerView recyclerView) {
        y yVar = (y) recyclerView.getTag(a);
        if (yVar == null) {
            yVar = new y();
            yVar.m = this.m;
            yVar.a(recyclerView);
        }
        this.j.put(recyclerView, yVar);
    }
}
