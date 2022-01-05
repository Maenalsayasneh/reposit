package h0.v.a;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public abstract class z extends RecyclerView.q {
    public RecyclerView a;
    public Scroller b;
    public final RecyclerView.s c = new a();

    /* compiled from: SnapHelper */
    public class a extends RecyclerView.s {
        public boolean a = false;

        public a() {
        }

        public void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                z.this.f();
            }
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.a = true;
            }
        }
    }

    public void a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.c);
                this.a.setOnFlingListener((RecyclerView.q) null);
            }
            this.a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.a.addOnScrollListener(this.c);
                this.a.setOnFlingListener(this);
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                f();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.n nVar, View view);

    public RecyclerView.x c(RecyclerView.n nVar) {
        if (!(nVar instanceof RecyclerView.x.b)) {
            return null;
        }
        return new a0(this, this.a.getContext());
    }

    public abstract View d(RecyclerView.n nVar);

    public abstract int e(RecyclerView.n nVar, int i, int i2);

    public void f() {
        RecyclerView.n layoutManager;
        View d;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] b2 = b(layoutManager, d);
            if (b2[0] != 0 || b2[1] != 0) {
                this.a.smoothScrollBy(b2[0], b2[1]);
            }
        }
    }
}
