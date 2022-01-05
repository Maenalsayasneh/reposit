package i0.h.a.c.e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

/* compiled from: BottomAppBar */
public class d extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ ActionMenuView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ BottomAppBar e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.b = actionMenuView;
        this.c = i;
        this.d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            BottomAppBar bottomAppBar = this.e;
            int i = bottomAppBar.P2;
            boolean z = i != 0;
            if (i != 0) {
                bottomAppBar.P2 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.n(i);
            }
            BottomAppBar bottomAppBar2 = this.e;
            ActionMenuView actionMenuView = this.b;
            int i2 = this.c;
            boolean z2 = this.d;
            Objects.requireNonNull(bottomAppBar2);
            e eVar = new e(bottomAppBar2, actionMenuView, i2, z2);
            if (z) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
