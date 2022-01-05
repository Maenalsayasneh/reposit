package h0.o.a;

import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* compiled from: FragmentTransition */
public class g0 implements Runnable {
    public final /* synthetic */ ArrayList Y1;
    public final /* synthetic */ ArrayList Z1;
    public final /* synthetic */ Object a2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ l0 d;
    public final /* synthetic */ View q;
    public final /* synthetic */ Fragment x;
    public final /* synthetic */ ArrayList y;

    public g0(Object obj, l0 l0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.c = obj;
        this.d = l0Var;
        this.q = view;
        this.x = fragment;
        this.y = arrayList;
        this.Y1 = arrayList2;
        this.Z1 = arrayList3;
        this.a2 = obj2;
    }

    public void run() {
        Object obj = this.c;
        if (obj != null) {
            this.d.o(obj, this.q);
            this.Y1.addAll(j0.h(this.d, this.c, this.x, this.y, this.q));
        }
        if (this.Z1 != null) {
            if (this.a2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.q);
                this.d.p(this.a2, this.Z1, arrayList);
            }
            this.Z1.clear();
            this.Z1.add(this.q);
        }
    }
}
