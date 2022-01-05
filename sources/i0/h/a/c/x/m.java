package i0.h.a.c.x;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class m implements SwipeDismissBehavior.b {
    public final /* synthetic */ BaseTransientBottomBar a;

    public m(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.a.b(0);
    }

    public void b(int i) {
        if (i == 0) {
            o.b().f(this.a.q);
        } else if (i == 1 || i == 2) {
            o.b().e(this.a.q);
        }
    }
}
