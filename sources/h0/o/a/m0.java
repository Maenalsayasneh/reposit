package h0.o.a;

import android.view.View;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransitionImpl */
public class m0 implements Runnable {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Map d;

    public m0(l0 l0Var, ArrayList arrayList, Map map) {
        this.c = arrayList;
        this.d = map;
    }

    public void run() {
        String str;
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.c.get(i);
            AtomicInteger atomicInteger = q.a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.d.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
