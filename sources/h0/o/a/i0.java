package h0.o.a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import h0.f.a;
import h0.o.a.j0;
import java.util.ArrayList;

/* compiled from: FragmentTransition */
public class i0 implements Runnable {
    public final /* synthetic */ View Y1;
    public final /* synthetic */ Fragment Z1;
    public final /* synthetic */ Fragment a2;
    public final /* synthetic */ boolean b2;
    public final /* synthetic */ l0 c;
    public final /* synthetic */ ArrayList c2;
    public final /* synthetic */ a d;
    public final /* synthetic */ Object d2;
    public final /* synthetic */ Rect e2;
    public final /* synthetic */ Object q;
    public final /* synthetic */ j0.b x;
    public final /* synthetic */ ArrayList y;

    public i0(l0 l0Var, a aVar, Object obj, j0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.c = l0Var;
        this.d = aVar;
        this.q = obj;
        this.x = bVar;
        this.y = arrayList;
        this.Y1 = view;
        this.Z1 = fragment;
        this.a2 = fragment2;
        this.b2 = z;
        this.c2 = arrayList2;
        this.d2 = obj2;
        this.e2 = rect;
    }

    public void run() {
        a<String, View> e = j0.e(this.c, this.d, this.q, this.x);
        if (e != null) {
            this.y.addAll(e.values());
            this.y.add(this.Y1);
        }
        j0.c(this.Z1, this.a2, this.b2, e, false);
        Object obj = this.q;
        if (obj != null) {
            this.c.x(obj, this.c2, this.y);
            View l = j0.l(e, this.x, this.d2, this.b2);
            if (l != null) {
                this.c.j(l, this.e2);
            }
        }
    }
}
