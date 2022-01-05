package i0.b.a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import m0.n.b.i;

/* compiled from: ModelGroupHolder.kt */
public final class b0 extends RecyclerView.Adapter<w> {
    public int getItemCount() {
        return 1;
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        i.e((w) b0Var, "holder");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewParent, i0.b.a.t, java.lang.Object] */
    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        i.e(viewGroup, "parent");
        ? r02 = 0;
        i.c(r02);
        View n = r02.n(viewGroup);
        i.c(r02);
        return new w(r02, n, true);
    }
}
