package i0.b.a;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;
import m0.n.b.i;

/* compiled from: UnboundedViewPool.kt */
public final class m0 extends RecyclerView.t {
    public final SparseArray<Queue<RecyclerView.b0>> c = new SparseArray<>();

    public void a() {
        this.c.clear();
    }

    public RecyclerView.b0 b(int i) {
        Queue queue = this.c.get(i);
        if (queue != null) {
            return (RecyclerView.b0) queue.poll();
        }
        return null;
    }

    public void d(RecyclerView.b0 b0Var) {
        i.e(b0Var, "viewHolder");
        int itemViewType = b0Var.getItemViewType();
        Queue queue = this.c.get(itemViewType);
        if (queue == null) {
            queue = new LinkedList();
            this.c.put(itemViewType, queue);
        }
        queue.add(b0Var);
    }
}
