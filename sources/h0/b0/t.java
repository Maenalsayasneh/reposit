package h0.b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.R;
import h0.b0.j;

/* compiled from: TranslationAnimationCreator */
public class t {

    /* compiled from: TranslationAnimationCreator */
    public static class a extends AnimatorListenerAdapter implements j.d {
        public final View a;
        public final View b;
        public final int c;
        public final int d;
        public int[] e;
        public float f;
        public float g;
        public final float h;
        public final float i;

        public a(View view, View view2, int i2, int i3, float f2, float f3) {
            this.b = view;
            this.a = view2;
            this.c = i2 - Math.round(view.getTranslationX());
            this.d = i3 - Math.round(view.getTranslationY());
            this.h = f2;
            this.i = f3;
            int i4 = R.id.transition_position;
            int[] iArr = (int[]) view2.getTag(i4);
            this.e = iArr;
            if (iArr != null) {
                view2.setTag(i4, (Object) null);
            }
        }

        public void a(j jVar) {
        }

        public void b(j jVar) {
        }

        public void c(j jVar) {
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
            jVar.y(this);
        }

        public void d(j jVar) {
        }

        public void e(j jVar) {
        }

        public void onAnimationCancel(Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            this.e[0] = Math.round(this.b.getTranslationX() + ((float) this.c));
            this.e[1] = Math.round(this.b.getTranslationY() + ((float) this.d));
            this.a.setTag(R.id.transition_position, this.e);
        }

        public void onAnimationPause(Animator animator) {
            this.f = this.b.getTranslationX();
            this.g = this.b.getTranslationY();
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
        }

        public void onAnimationResume(Animator animator) {
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }
    }

    public static Animator a(View view, r rVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, j jVar) {
        float f5;
        float f6;
        View view2 = view;
        r rVar2 = rVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) rVar2.b.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = Math.round(f6 - translationY) + i2;
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        a aVar = new a(view, rVar2.b, round, round2, translationX, translationY);
        jVar.b(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
