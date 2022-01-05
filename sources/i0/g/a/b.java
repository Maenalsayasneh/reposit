package i0.g.a;

import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import i0.g.a.d.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: RecyclerViewScrollListener */
public class b extends RecyclerView.s {
    public final FastScroller a;
    public List<a> b = new ArrayList();
    public int c = 0;

    /* compiled from: RecyclerViewScrollListener */
    public interface a {
        void a(float f);
    }

    public b(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.c != 0) {
            c viewProvider = this.a.getViewProvider();
            if (viewProvider.c() != null) {
                Objects.requireNonNull(viewProvider.c());
            }
            if (viewProvider.a() != null) {
                Objects.requireNonNull(viewProvider.a());
            }
        } else if (i != 0 && this.c == 0) {
            c viewProvider2 = this.a.getViewProvider();
            if (viewProvider2.c() != null) {
                Objects.requireNonNull(viewProvider2.c());
            }
            if (viewProvider2.a() != null) {
                Objects.requireNonNull(viewProvider2.a());
            }
        }
        this.c = i;
    }

    public void c(RecyclerView recyclerView, int i, int i2) {
        FastScroller fastScroller = this.a;
        if (fastScroller.y != null && !fastScroller.f2 && fastScroller.q.getChildCount() > 0) {
            e(recyclerView);
        }
    }

    public void e(RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        if (this.a.c()) {
            i3 = recyclerView.computeVerticalScrollOffset();
            i2 = recyclerView.computeVerticalScrollExtent();
            i = recyclerView.computeVerticalScrollRange();
        } else {
            i3 = recyclerView.computeHorizontalScrollOffset();
            i2 = recyclerView.computeHorizontalScrollExtent();
            i = recyclerView.computeHorizontalScrollRange();
        }
        float f = ((float) i3) / ((float) (i - i2));
        this.a.setScrollerPosition(f);
        for (a a2 : this.b) {
            a2.a(f);
        }
    }
}
