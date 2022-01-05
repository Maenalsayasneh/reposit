package i0.h.a.c.x;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.Objects;

/* compiled from: BaseTransientBottomBar */
public class a implements Runnable {
    public final /* synthetic */ BaseTransientBottomBar c;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.c = baseTransientBottomBar;
    }

    public void run() {
        BaseTransientBottomBar.i iVar = this.c.f;
        if (iVar != null) {
            if (iVar.getParent() != null) {
                this.c.f.setVisibility(0);
            }
            if (this.c.f.getAnimationMode() == 1) {
                BaseTransientBottomBar baseTransientBottomBar = this.c;
                Objects.requireNonNull(baseTransientBottomBar);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setInterpolator(i0.h.a.c.a.a.a);
                ofFloat.addUpdateListener(new d(baseTransientBottomBar));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                ofFloat2.setInterpolator(i0.h.a.c.a.a.d);
                ofFloat2.addUpdateListener(new e(baseTransientBottomBar));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                animatorSet.setDuration(150);
                animatorSet.addListener(new b(baseTransientBottomBar));
                animatorSet.start();
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = this.c;
            int c2 = baseTransientBottomBar2.c();
            baseTransientBottomBar2.f.setTranslationY((float) c2);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{c2, 0});
            valueAnimator.setInterpolator(i0.h.a.c.a.a.b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new f(baseTransientBottomBar2));
            valueAnimator.addUpdateListener(new g(baseTransientBottomBar2, c2));
            valueAnimator.start();
        }
    }
}
