package i0.h.a.c.b;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import h0.i.i.g0.d;

/* compiled from: AppBarLayout */
public class e implements d {
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;

    public e(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.a = appBarLayout;
        this.b = z;
    }

    public boolean perform(View view, d.a aVar) {
        this.a.setExpanded(this.b);
        return true;
    }
}
