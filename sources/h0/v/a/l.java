package h0.v.a;

import androidx.recyclerview.widget.RecyclerView;
import h0.v.a.k;

/* compiled from: ItemTouchHelper */
public class l implements Runnable {
    public final /* synthetic */ k.f c;
    public final /* synthetic */ int d;
    public final /* synthetic */ k q;

    public l(k kVar, k.f fVar, int i) {
        this.q = kVar;
        this.c = fVar;
        this.d = i;
    }

    public void run() {
        RecyclerView recyclerView = this.q.k2;
        if (recyclerView != null && recyclerView.isAttachedToWindow()) {
            k.f fVar = this.c;
            if (!fVar.k && fVar.e.getAbsoluteAdapterPosition() != -1) {
                RecyclerView.k itemAnimator = this.q.k2.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.isRunning((RecyclerView.k.a) null)) {
                    k kVar = this.q;
                    int size = kVar.i2.size();
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (!kVar.i2.get(i).l) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z) {
                        this.q.f2.onSwiped(this.c.e, this.d);
                        return;
                    }
                }
                this.q.k2.post(this);
            }
        }
    }
}
