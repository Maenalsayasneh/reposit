package h0.o.a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import h0.f.a;

/* compiled from: FragmentTransition */
public class h0 implements Runnable {
    public final /* synthetic */ l0 Y1;
    public final /* synthetic */ Rect Z1;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ Fragment d;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ a x;
    public final /* synthetic */ View y;

    public h0(Fragment fragment, Fragment fragment2, boolean z, a aVar, View view, l0 l0Var, Rect rect) {
        this.c = fragment;
        this.d = fragment2;
        this.q = z;
        this.x = aVar;
        this.y = view;
        this.Y1 = l0Var;
        this.Z1 = rect;
    }

    public void run() {
        j0.c(this.c, this.d, this.q, this.x, false);
        View view = this.y;
        if (view != null) {
            this.Y1.j(view, this.Z1);
        }
    }
}
