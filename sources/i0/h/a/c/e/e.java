package i0.h.a.c.e;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class e implements Runnable {
    public final /* synthetic */ ActionMenuView c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ BottomAppBar x;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.x = bottomAppBar;
        this.c = actionMenuView;
        this.d = i;
        this.q = z;
    }

    public void run() {
        ActionMenuView actionMenuView = this.c;
        actionMenuView.setTranslationX((float) this.x.C(actionMenuView, this.d, this.q));
    }
}
