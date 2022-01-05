package h0.o.a;

import android.view.View;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransitionImpl */
public class n0 implements Runnable {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Map d;

    public n0(l0 l0Var, ArrayList arrayList, Map map) {
        this.c = arrayList;
        this.d = map;
    }

    public void run() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.c.get(i);
            AtomicInteger atomicInteger = q.a;
            view.setTransitionName((String) this.d.get(view.getTransitionName()));
        }
    }
}
