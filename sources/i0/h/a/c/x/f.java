package i0.h.a.c.x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.instabug.library.settings.SettingsManager;

/* compiled from: BaseTransientBottomBar */
public class f extends AnimatorListenerAdapter {
    public final /* synthetic */ BaseTransientBottomBar a;

    public f(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.e();
    }

    public void onAnimationStart(Animator animator) {
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) this.a.g;
        snackbarContentLayout.c.setAlpha(0.0f);
        ViewPropertyAnimator alpha = snackbarContentLayout.c.animate().alpha(1.0f);
        long j = (long) SettingsManager.MAX_ASR_DURATION_IN_SECONDS;
        long j2 = (long) 70;
        alpha.setDuration(j).setStartDelay(j2).start();
        if (snackbarContentLayout.d.getVisibility() == 0) {
            snackbarContentLayout.d.setAlpha(0.0f);
            snackbarContentLayout.d.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
