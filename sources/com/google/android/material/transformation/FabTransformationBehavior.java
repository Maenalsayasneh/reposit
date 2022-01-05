package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import h0.i.i.q;
import i0.h.a.c.a.d;
import i0.h.a.c.a.g;
import i0.h.a.c.a.h;
import i0.h.a.c.a.i;
import i0.h.a.c.c0.e;
import i0.h.a.c.k.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c = new Rect();
    public final RectF d = new RectF();
    public final RectF e = new RectF();
    public final int[] f = new int[2];
    public float g;
    public float h;

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.a) {
                this.b.setVisibility(4);
                this.c.setAlpha(1.0f);
                this.c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    public static class b {
        public g a;
        public i b;
    }

    public FabTransformationBehavior() {
    }

    public AnimatorSet D(View view, View view2, boolean z, boolean z2) {
        b bVar;
        ArrayList arrayList;
        c cVar;
        ArrayList arrayList2;
        Animator animator;
        ObjectAnimator objectAnimator;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        b N = N(view2.getContext(), z3);
        if (z3) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        L(view, view2, z, z2, N, arrayList3);
        RectF rectF = this.d;
        M(view, view2, z, z2, N, arrayList3, rectF);
        float width = rectF.width();
        float height = rectF.height();
        float F = F(view3, view4, N.b);
        float G = G(view3, view4, N.b);
        Pair<h, h> E = E(F, G, z3, N);
        h hVar = (h) E.first;
        h hVar2 = (h) E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z3) {
            F = this.g;
        }
        fArr[0] = F;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z3) {
            G = this.h;
        }
        fArr2[0] = G;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, property2, fArr2);
        hVar.a(ofFloat);
        hVar2.a(ofFloat2);
        arrayList3.add(ofFloat);
        arrayList3.add(ofFloat2);
        boolean z4 = view4 instanceof c;
        if (z4 && (view3 instanceof ImageView)) {
            c cVar2 = (c) view4;
            Drawable drawable = ((ImageView) view3).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z3) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, d.a, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, d.a, new int[]{255});
                }
                objectAnimator.addUpdateListener(new i0.h.a.c.c0.a(this, view4));
                N.a.d("iconFade").a(objectAnimator);
                arrayList3.add(objectAnimator);
                arrayList4.add(new i0.h.a.c.c0.b(this, cVar2, drawable));
            }
        }
        if (!z4) {
            bVar = N;
            arrayList = arrayList4;
        } else {
            c cVar3 = (c) view4;
            i iVar = N.b;
            RectF rectF2 = this.d;
            RectF rectF3 = this.e;
            I(view3, rectF2);
            rectF2.offset(this.g, this.h);
            I(view4, rectF3);
            rectF3.offset(-F(view3, view4, iVar), 0.0f);
            float centerX = rectF2.centerX() - rectF3.left;
            i iVar2 = N.b;
            RectF rectF4 = this.d;
            RectF rectF5 = this.e;
            I(view3, rectF4);
            rectF4.offset(this.g, this.h);
            I(view4, rectF5);
            rectF5.offset(0.0f, -G(view3, view4, iVar2));
            float centerY = rectF4.centerY() - rectF5.top;
            ((FloatingActionButton) view3).g(this.c);
            float width2 = ((float) this.c.width()) / 2.0f;
            h d2 = N.a.d("expansion");
            ArrayList arrayList5 = arrayList4;
            if (z3) {
                if (!z2) {
                    cVar3.setRevealInfo(new c.e(centerX, centerY, width2));
                }
                if (z2) {
                    width2 = cVar3.getRevealInfo().c;
                }
                float D = i0.h.a.b.c.m.b.D(centerX, centerY, 0.0f, 0.0f);
                float D2 = i0.h.a.b.c.m.b.D(centerX, centerY, width, 0.0f);
                float D3 = i0.h.a.b.c.m.b.D(centerX, centerY, width, height);
                float D4 = i0.h.a.b.c.m.b.D(centerX, centerY, 0.0f, height);
                if (D <= D2 || D <= D3 || D <= D4) {
                    D = (D2 <= D3 || D2 <= D4) ? D3 > D4 ? D3 : D4 : D2;
                }
                animator = i0.h.a.b.c.m.b.y(cVar3, centerX, centerY, D);
                animator.addListener(new i0.h.a.c.c0.c(this, cVar3));
                long j = d2.a;
                int i = (int) centerX;
                int i2 = (int) centerY;
                if (j > 0) {
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view4, i, i2, width2, width2);
                    createCircularReveal.setStartDelay(0);
                    createCircularReveal.setDuration(j);
                    arrayList3.add(createCircularReveal);
                }
                cVar = cVar3;
                arrayList2 = arrayList5;
                bVar = N;
            } else {
                float f2 = cVar3.getRevealInfo().c;
                Animator y = i0.h.a.b.c.m.b.y(cVar3, centerX, centerY, width2);
                long j2 = d2.a;
                int i3 = (int) centerX;
                int i4 = (int) centerY;
                if (j2 > 0) {
                    Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view4, i3, i4, f2, f2);
                    createCircularReveal2.setStartDelay(0);
                    createCircularReveal2.setDuration(j2);
                    arrayList3.add(createCircularReveal2);
                }
                long j3 = d2.a;
                long j4 = d2.b;
                g gVar = N.a;
                Animator animator2 = y;
                int i5 = gVar.a.Z1;
                arrayList2 = arrayList5;
                bVar = N;
                int i6 = 0;
                long j5 = 0;
                while (i6 < i5) {
                    int i7 = i5;
                    h l = gVar.a.l(i6);
                    j5 = Math.max(j5, l.a + l.b);
                    i6++;
                    i5 = i7;
                    cVar3 = cVar3;
                    i3 = i3;
                    gVar = gVar;
                }
                cVar = cVar3;
                int i8 = i3;
                long j6 = j3 + j4;
                if (j6 < j5) {
                    Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view4, i8, i4, width2, width2);
                    createCircularReveal3.setStartDelay(j6);
                    createCircularReveal3.setDuration(j5 - j6);
                    arrayList3.add(createCircularReveal3);
                }
                animator = animator2;
            }
            d2.a(animator);
            arrayList3.add(animator);
            arrayList = arrayList2;
            arrayList.add(new i0.h.a.c.k.a(cVar));
        }
        K(view, view2, z, z2, bVar, arrayList3);
        J(view2, z, z2, bVar, arrayList3);
        AnimatorSet animatorSet = new AnimatorSet();
        i0.h.a.b.c.m.b.g0(animatorSet, arrayList3);
        animatorSet.addListener(new a(this, z, view4, view));
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i9));
        }
        return animatorSet;
    }

    public final Pair<h, h> E(float f2, float f3, boolean z, b bVar) {
        h hVar;
        h hVar2;
        int i;
        if (f2 == 0.0f || f3 == 0.0f) {
            hVar2 = bVar.a.d("translationXLinear");
            hVar = bVar.a.d("translationYLinear");
        } else if ((!z || f3 >= 0.0f) && (z || i <= 0)) {
            hVar2 = bVar.a.d("translationXCurveDownwards");
            hVar = bVar.a.d("translationYCurveDownwards");
        } else {
            hVar2 = bVar.a.d("translationXCurveUpwards");
            hVar = bVar.a.d("translationYCurveUpwards");
        }
        return new Pair<>(hVar2, hVar);
    }

    public final float F(View view, View view2, i iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        I(view, rectF);
        rectF.offset(this.g, this.h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float G(View view, View view2, i iVar) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        I(view, rectF);
        rectF.offset(this.g, this.h);
        I(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float H(b bVar, h hVar, float f2, float f3) {
        long j = hVar.a;
        long j2 = hVar.b;
        h d2 = bVar.a.d("expansion");
        float interpolation = hVar.b().getInterpolation(((float) (((d2.a + d2.b) + 17) - j)) / ((float) j2));
        TimeInterpolator timeInterpolator = i0.h.a.c.a.a.a;
        return i0.d.a.a.a.a(f3, f2, interpolation, f2);
    }

    public final void I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public final void J(View view, boolean z, boolean z2, b bVar, List list) {
        ViewGroup viewGroup;
        ObjectAnimator objectAnimator;
        if (view instanceof ViewGroup) {
            boolean z3 = view instanceof c;
            View findViewById = view.findViewById(R.id.mtrl_child_content_container);
            if (findViewById != null) {
                viewGroup = O(findViewById);
            } else if ((view instanceof e) || (view instanceof i0.h.a.c.c0.d)) {
                viewGroup = O(((ViewGroup) view).getChildAt(0));
            } else {
                viewGroup = O(view);
            }
            if (viewGroup != null) {
                if (z) {
                    if (!z2) {
                        i0.h.a.c.a.c.a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(viewGroup, i0.h.a.c.a.c.a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(viewGroup, i0.h.a.c.a.c.a, new float[]{0.0f});
                }
                bVar.a.d("contentFade").a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    public final void K(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof c) {
            c cVar = (c) view2;
            AtomicInteger atomicInteger = q.a;
            ColorStateList backgroundTintList = view.getBackgroundTintList();
            int colorForState = backgroundTintList != null ? backgroundTintList.getColorForState(view.getDrawableState(), backgroundTintList.getDefaultColor()) : 0;
            int i = 16777215 & colorForState;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(colorForState);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, c.d.a, new int[]{colorForState});
            }
            objectAnimator.setEvaluator(i0.h.a.c.a.b.a);
            bVar.a.d("color").a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    @TargetApi(21)
    public final void L(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator objectAnimator;
        AtomicInteger atomicInteger = q.a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-elevation});
        }
        bVar.a.d("elevation").a(objectAnimator);
        list.add(objectAnimator);
    }

    public final void M(View view, View view2, boolean z, boolean z2, b bVar, List list, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float F = F(view, view2, bVar.b);
        float G = G(view, view2, bVar.b);
        Pair<h, h> E = E(F, G, z, bVar);
        h hVar = (h) E.first;
        h hVar2 = (h) E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-F);
                view2.setTranslationY(-G);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f});
            float H = H(bVar, hVar, -F, 0.0f);
            float H2 = H(bVar, hVar2, -G, 0.0f);
            Rect rect = this.c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.d;
            rectF2.set(rect);
            RectF rectF3 = this.e;
            I(view2, rectF3);
            rectF3.offset(H, H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{-F});
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{-G});
        }
        hVar.a(objectAnimator2);
        hVar2.a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    public abstract b N(Context context, boolean z);

    public final ViewGroup O(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public void f(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
