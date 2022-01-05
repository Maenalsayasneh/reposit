package i0.h.a.c.x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.instabug.library.settings.SettingsManager;

/* compiled from: BaseTransientBottomBar */
public class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseTransientBottomBar b;

    public h(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.b = baseTransientBottomBar;
        this.a = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.d(this.a);
    }

    public void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.b.g;
        snackbarContentLayout.c.setAlpha(1.0f);
        ViewPropertyAnimator alpha = snackbarContentLayout.c.animate().alpha(0.0f);
        long j = (long) SettingsManager.MAX_ASR_DURATION_IN_SECONDS;
        long j2 = (long) 0;
        alpha.setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.d.getVisibility() == 0) {
            snackbarContentLayout.d.setAlpha(1.0f);
            snackbarContentLayout.d.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
