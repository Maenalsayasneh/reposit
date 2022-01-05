package i0.b.a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: BaseEpoxyAdapter */
public abstract class d extends RecyclerView.Adapter<w> {
    public int a = 1;
    public final o0 b = new o0();
    public final e c = new e();
    public ViewHolderState d = new ViewHolderState();
    public final GridLayoutManager.c e;

    /* compiled from: BaseEpoxyAdapter */
    public class a extends GridLayoutManager.c {
        public a() {
        }

        public int e(int i) {
            try {
                t<?> d2 = d.this.d(i);
                d dVar = d.this;
                return d2.p(dVar.a, i, dVar.getItemCount());
            } catch (IndexOutOfBoundsException e) {
                d.this.f(e);
                return 1;
            }
        }
    }

    public d() {
        a aVar = new a();
        this.e = aVar;
        setHasStableIds(true);
        aVar.c = true;
    }

    public e b() {
        return this.c;
    }

    public abstract List<? extends t<?>> c();

    public t<?> d(int i) {
        return (t) c().get(i);
    }

    /* renamed from: e */
    public void onBindViewHolder(w wVar, int i, List<Object> list) {
        t<?> d2 = d(i);
        boolean z = this instanceof p;
        t<?> tVar = null;
        if (z) {
            long j = ((t) c().get(i)).b;
            if (!list.isEmpty()) {
                Iterator<Object> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    k kVar = (k) it.next();
                    t<?> tVar2 = kVar.a;
                    if (tVar2 == null) {
                        t<?> j2 = kVar.b.j(j, null);
                        if (j2 != null) {
                            tVar = j2;
                            break;
                        }
                    } else if (tVar2.b == j) {
                        tVar = tVar2;
                        break;
                    }
                }
            }
        }
        wVar.b(d2, tVar, list, i);
        if (list.isEmpty()) {
            ViewHolderState viewHolderState = this.d;
            Objects.requireNonNull(viewHolderState);
            wVar.a();
            t tVar3 = wVar.a;
            Objects.requireNonNull(tVar3);
            if (tVar3 instanceof g) {
                ViewHolderState.ViewState viewState = (ViewHolderState.ViewState) viewHolderState.h(wVar.getItemId());
                if (viewState != null) {
                    viewState.c(wVar.itemView);
                } else {
                    ViewHolderState.ViewState viewState2 = wVar.d;
                    if (viewState2 != null) {
                        viewState2.c(wVar.itemView);
                    }
                }
            }
        }
        this.c.c.o(wVar.getItemId(), wVar);
        if (z) {
            g(wVar, d2, i, tVar);
        }
    }

    public void f(RuntimeException runtimeException) {
    }

    public void g(w wVar, t<?> tVar, int i, t<?> tVar2) {
    }

    public int getItemCount() {
        return c().size();
    }

    public long getItemId(int i) {
        return ((t) c().get(i)).b;
    }

    public int getItemViewType(int i) {
        o0 o0Var = this.b;
        t<?> d2 = d(i);
        o0Var.b = d2;
        return o0.a(d2);
    }

    public void h(w wVar, t<?> tVar) {
    }

    /* renamed from: i */
    public void onViewAttachedToWindow(w wVar) {
        wVar.a();
        wVar.a.x(wVar.c());
    }

    /* renamed from: j */
    public void onViewDetachedFromWindow(w wVar) {
        wVar.a();
        wVar.a.y(wVar.c());
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        onBindViewHolder((w) b0Var, i, Collections.emptyList());
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        t<?> tVar;
        o0 o0Var = this.b;
        t<?> tVar2 = o0Var.b;
        if (tVar2 == null || o0.a(tVar2) != i) {
            f(new IllegalStateException("Last model did not match expected view type"));
            Iterator<? extends t<?>> it = c().iterator();
            while (true) {
                if (it.hasNext()) {
                    t<?> tVar3 = (t) it.next();
                    if (o0.a(tVar3) == i) {
                        tVar = tVar3;
                        break;
                    }
                } else {
                    c0 c0Var = new c0();
                    if (i == c0Var.o()) {
                        tVar = c0Var;
                    } else {
                        throw new IllegalStateException(i0.d.a.a.a.e0("Could not find model for view type: ", i));
                    }
                }
            }
        } else {
            tVar = o0Var.b;
        }
        return new w(viewGroup, tVar.n(viewGroup), tVar instanceof g);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.b.b = null;
    }

    public boolean onFailedToRecycleView(RecyclerView.b0 b0Var) {
        w wVar = (w) b0Var;
        wVar.a();
        return wVar.a.v(wVar.c());
    }

    public void onViewRecycled(RecyclerView.b0 b0Var) {
        w wVar = (w) b0Var;
        this.d.t(wVar);
        this.c.c.p(wVar.getItemId());
        wVar.a();
        t tVar = wVar.a;
        wVar.a();
        wVar.a.B(wVar.c());
        wVar.a = null;
        h(wVar, tVar);
    }
}
