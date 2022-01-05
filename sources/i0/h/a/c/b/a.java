package i0.h.a.c.b;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import h0.i.i.d0;
import h0.i.i.m;
import h0.i.i.q;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppBarLayout */
public class a implements m {
    public final /* synthetic */ AppBarLayout a;

    public a(AppBarLayout appBarLayout) {
        this.a = appBarLayout;
    }

    public d0 a(View view, d0 d0Var) {
        AppBarLayout appBarLayout = this.a;
        Objects.requireNonNull(appBarLayout);
        AtomicInteger atomicInteger = q.a;
        d0 d0Var2 = appBarLayout.getFitsSystemWindows() ? d0Var : null;
        if (!Objects.equals(appBarLayout.a2, d0Var2)) {
            appBarLayout.a2 = d0Var2;
            appBarLayout.f();
            appBarLayout.requestLayout();
        }
        return d0Var;
    }
}
