package i0.h.a.c.b;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import h0.i.i.g0.d;

/* compiled from: AppBarLayout */
public class d implements h0.i.i.g0.d {
    public final /* synthetic */ CoordinatorLayout a;
    public final /* synthetic */ AppBarLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public d(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = view;
        this.d = i;
    }

    public boolean perform(View view, d.a aVar) {
        this.e.L(this.a, this.b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}
