package h0.v.a;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AdapterListUpdateCallback */
public final class b implements r {
    public final RecyclerView.Adapter a;

    public b(RecyclerView.Adapter adapter) {
        this.a = adapter;
    }

    public void a(int i, int i2) {
        this.a.notifyItemRangeInserted(i, i2);
    }

    public void b(int i, int i2) {
        this.a.notifyItemRangeRemoved(i, i2);
    }

    public void c(int i, int i2) {
        this.a.notifyItemMoved(i, i2);
    }

    public void d(int i, int i2, Object obj) {
        this.a.notifyItemRangeChanged(i, i2, obj);
    }
}
