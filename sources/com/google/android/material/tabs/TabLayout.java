package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import h0.i.i.g0.b;
import h0.i.i.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@ViewPager.e
public class TabLayout extends HorizontalScrollView {
    public static final int c = R.style.Widget_Design_TabLayout;
    public static final h0.i.h.d<g> d = new h0.i.h.e(16);
    public c A2;
    public final ArrayList<c> B2 = new ArrayList<>();
    public c C2;
    public ValueAnimator D2;
    public ViewPager E2;
    public h0.f0.a.a F2;
    public DataSetObserver G2;
    public h H2;
    public b I2;
    public boolean J2;
    public final h0.i.h.d<i> K2 = new h0.i.h.d<>(12);
    public int Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public ColorStateList d2;
    public ColorStateList e2;
    public ColorStateList f2;
    public Drawable g2 = new GradientDrawable();
    public int h2 = 0;
    public PorterDuff.Mode i2;
    public float j2;
    public float k2;
    public final int l2;
    public int m2 = Integer.MAX_VALUE;
    public final int n2;
    public final int o2;
    public final int p2;
    public final ArrayList<g> q = new ArrayList<>();
    public int q2;
    public int r2;
    public int s2;
    public int t2;
    public int u2;
    public boolean v2;
    public boolean w2;
    public g x;
    public int x2;
    public final f y;
    public boolean y2;
    public i0.h.a.c.y.b z2;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    public class b implements ViewPager.i {
        public boolean a;

        public b() {
        }

        public void a(ViewPager viewPager, h0.f0.a.a aVar, h0.f0.a.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.E2 == viewPager) {
                tabLayout.m(aVar2, this.a);
            }
        }
    }

    @Deprecated
    public interface c<T extends g> {
        void a(T t);

        void b(T t);

        void c(T t);
    }

    public interface d extends c<g> {
    }

    public class e extends DataSetObserver {
        public e() {
        }

        public void onChanged() {
            TabLayout.this.j();
        }

        public void onInvalidated() {
            TabLayout.this.j();
        }
    }

    public class f extends LinearLayout {
        public ValueAnimator c;
        public int d = -1;
        public float q;
        public int x = -1;

        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ View a;
            public final /* synthetic */ View b;

            public a(View view, View view2) {
                this.a = view;
                this.b = view2;
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(this.a, this.b, valueAnimator.getAnimatedFraction());
            }
        }

        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            public void onAnimationEnd(Animator animator) {
                f.this.d = this.a;
            }

            public void onAnimationStart(Animator animator) {
                f.this.d = this.a;
            }
        }

        public f(Context context) {
            super(context);
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.d);
            TabLayout tabLayout = TabLayout.this;
            i0.h.a.c.y.b bVar = tabLayout.z2;
            Drawable drawable = tabLayout.g2;
            Objects.requireNonNull(bVar);
            RectF a2 = i0.h.a.c.y.b.a(tabLayout, childAt);
            drawable.setBounds((int) a2.left, drawable.getBounds().top, (int) a2.right, drawable.getBounds().bottom);
        }

        public void b(int i) {
            Rect bounds = TabLayout.this.g2.getBounds();
            TabLayout.this.g2.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        public final void c(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.z2.b(tabLayout, view, view2, f, tabLayout.g2);
            } else {
                Drawable drawable = TabLayout.this.g2;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.g2.getBounds().bottom);
            }
            AtomicInteger atomicInteger = q.a;
            postInvalidateOnAnimation();
        }

        public final void d(boolean z, int i, int i2) {
            View childAt = getChildAt(this.d);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                a();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.c = valueAnimator;
                valueAnimator.setInterpolator(i0.h.a.c.a.a.b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                valueAnimator.addUpdateListener(aVar);
                valueAnimator.addListener(new b(i));
                valueAnimator.start();
                return;
            }
            this.c.removeAllUpdateListeners();
            this.c.addUpdateListener(aVar);
        }

        public void draw(Canvas canvas) {
            int height = TabLayout.this.g2.getBounds().height();
            if (height < 0) {
                height = TabLayout.this.g2.getIntrinsicHeight();
            }
            int i = TabLayout.this.t2;
            int i2 = 0;
            if (i == 0) {
                i2 = getHeight() - height;
                height = getHeight();
            } else if (i == 1) {
                i2 = (getHeight() - height) / 2;
                height = (getHeight() + height) / 2;
            } else if (i != 2) {
                if (i != 3) {
                    height = 0;
                } else {
                    height = getHeight();
                }
            }
            if (TabLayout.this.g2.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.g2.getBounds();
                TabLayout.this.g2.setBounds(bounds.left, i2, bounds.right, height);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawable = tabLayout.g2;
                int i3 = tabLayout.h2;
                if (i3 != 0) {
                    drawable.setTint(i3);
                }
                drawable.draw(canvas);
            }
            super.draw(canvas);
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                d(false, this.d, -1);
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) == 1073741824) {
                TabLayout tabLayout = TabLayout.this;
                boolean z = true;
                if (tabLayout.r2 == 1 || tabLayout.u2 == 2) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (((int) i0.h.a.b.c.m.b.E(getContext(), 16)) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout tabLayout2 = TabLayout.this;
                            tabLayout2.r2 = 0;
                            tabLayout2.r(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
        }
    }

    public static class g {
        public Drawable a;
        public CharSequence b;
        public CharSequence c;
        public int d = -1;
        public View e;
        public TabLayout f;
        public i g;
        public int h = -1;

        public g a(int i) {
            TabLayout tabLayout = this.f;
            if (tabLayout != null) {
                b(tabLayout.getResources().getText(i));
                return this;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
                this.g.setContentDescription(charSequence);
            }
            this.b = charSequence;
            c();
            return this;
        }

        public void c() {
            i iVar = this.g;
            if (iVar != null) {
                iVar.h();
            }
        }
    }

    public static class h implements ViewPager.j {
        public final WeakReference<TabLayout> c;
        public int d;
        public int q;

        public h(TabLayout tabLayout) {
            this.c = new WeakReference<>(tabLayout);
        }

        public void onPageScrollStateChanged(int i) {
            this.d = this.q;
            this.q = i;
        }

        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.c.get();
            if (tabLayout != null) {
                int i3 = this.q;
                boolean z = false;
                boolean z2 = i3 != 2 || this.d == 1;
                if (!(i3 == 2 && this.d == 0)) {
                    z = true;
                }
                tabLayout.n(i, f, z2, z);
            }
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.c.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.q;
                tabLayout.l(tabLayout.h(i), i2 == 0 || (i2 == 2 && this.d == 0));
            }
        }
    }

    public final class i extends LinearLayout {
        public static final /* synthetic */ int c = 0;
        public BadgeDrawable Y1;
        public View Z1;
        public TextView a2;
        public ImageView b2;
        public Drawable c2;
        public g d;
        public int d2 = 2;
        public TextView q;
        public ImageView x;
        public View y;

        public i(Context context) {
            super(context);
            i(context);
            int i = TabLayout.this.Y1;
            int i2 = TabLayout.this.Z1;
            int i3 = TabLayout.this.a2;
            int i4 = TabLayout.this.b2;
            AtomicInteger atomicInteger = q.a;
            setPaddingRelative(i, i2, i3, i4);
            setGravity(17);
            setOrientation(TabLayout.this.v2 ^ true ? 1 : 0);
            setClickable(true);
            setPointerIcon(PointerIcon.getSystemIcon(getContext(), 1002));
        }

        /* access modifiers changed from: private */
        public BadgeDrawable getBadge() {
            return this.Y1;
        }

        /* access modifiers changed from: private */
        public BadgeDrawable getOrCreateBadge() {
            if (this.Y1 == null) {
                this.Y1 = BadgeDrawable.b(getContext());
            }
            f();
            BadgeDrawable badgeDrawable = this.Y1;
            if (badgeDrawable != null) {
                return badgeDrawable;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final boolean c() {
            return this.Y1 != null;
        }

        public final void d(View view) {
            if (c() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                i0.h.a.c.c.a.a(this.Y1, view, (FrameLayout) null);
                this.y = view;
            }
        }

        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.c2;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.c2.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e() {
            if (c()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.y;
                if (view != null) {
                    i0.h.a.c.c.a.b(this.Y1, view);
                    this.y = null;
                }
            }
        }

        public final void f() {
            g gVar;
            g gVar2;
            if (c()) {
                if (this.Z1 != null) {
                    e();
                    return;
                }
                ImageView imageView = this.x;
                if (imageView == null || (gVar2 = this.d) == null || gVar2.a == null) {
                    if (this.q == null || (gVar = this.d) == null) {
                        e();
                        return;
                    }
                    Objects.requireNonNull(gVar);
                    View view = this.y;
                    TextView textView = this.q;
                    if (view != textView) {
                        e();
                        d(this.q);
                        return;
                    }
                    g(textView);
                } else if (this.y != imageView) {
                    e();
                    d(this.x);
                } else {
                    g(imageView);
                }
            }
        }

        public final void g(View view) {
            if (c() && view == this.y) {
                BadgeDrawable badgeDrawable = this.Y1;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                badgeDrawable.setBounds(rect);
                badgeDrawable.m(view, (FrameLayout) null);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.q, this.x, this.Z1};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getTop()) : view.getTop();
                    i = z ? Math.max(i, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return i - i2;
        }

        public int getContentWidth() {
            View[] viewArr = {this.q, this.x, this.Z1};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        public g getTab() {
            return this.d;
        }

        public final void h() {
            Drawable drawable;
            g gVar = this.d;
            Drawable drawable2 = null;
            View view = gVar != null ? gVar.e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.Z1 = view;
                TextView textView = this.q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.x;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.x.setImageDrawable((Drawable) null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.a2 = textView2;
                if (textView2 != null) {
                    this.d2 = textView2.getMaxLines();
                }
                this.b2 = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.Z1;
                if (view2 != null) {
                    removeView(view2);
                    this.Z1 = null;
                }
                this.a2 = null;
                this.b2 = null;
            }
            boolean z = false;
            if (this.Z1 == null) {
                if (this.x == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, this, false);
                    this.x = imageView2;
                    addView(imageView2, 0);
                }
                if (!(gVar == null || (drawable = gVar.a) == null)) {
                    drawable2 = drawable.mutate();
                }
                if (drawable2 != null) {
                    drawable2.setTintList(TabLayout.this.e2);
                    PorterDuff.Mode mode = TabLayout.this.i2;
                    if (mode != null) {
                        drawable2.setTintMode(mode);
                    }
                }
                if (this.q == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, this, false);
                    this.q = textView3;
                    addView(textView3);
                    this.d2 = this.q.getMaxLines();
                }
                this.q.setTextAppearance(TabLayout.this.c2);
                ColorStateList colorStateList = TabLayout.this.d2;
                if (colorStateList != null) {
                    this.q.setTextColor(colorStateList);
                }
                j(this.q, this.x);
                f();
                ImageView imageView3 = this.x;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new i0.h.a.c.y.d(this, imageView3));
                }
                TextView textView4 = this.q;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new i0.h.a.c.y.d(this, textView4));
                }
            } else {
                TextView textView5 = this.a2;
                if (!(textView5 == null && this.b2 == null)) {
                    j(textView5, this.b2);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.c)) {
                setContentDescription(gVar.c);
            }
            if (gVar != null) {
                TabLayout tabLayout = gVar.f;
                if (tabLayout != null) {
                    if (tabLayout.getSelectedTabPosition() == gVar.d) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z);
        }

        /* JADX WARNING: type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(android.content.Context r8) {
            /*
                r7 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.l2
                r1 = 0
                if (r0 == 0) goto L_0x001f
                android.graphics.drawable.Drawable r8 = h0.b.b.a.a.a(r8, r0)
                r7.c2 = r8
                if (r8 == 0) goto L_0x0021
                boolean r8 = r8.isStateful()
                if (r8 == 0) goto L_0x0021
                android.graphics.drawable.Drawable r8 = r7.c2
                int[] r0 = r7.getDrawableState()
                r8.setState(r0)
                goto L_0x0021
            L_0x001f:
                r7.c2 = r1
            L_0x0021:
                android.graphics.drawable.GradientDrawable r8 = new android.graphics.drawable.GradientDrawable
                r8.<init>()
                r0 = 0
                r8.setColor(r0)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r2 = r2.f2
                if (r2 == 0) goto L_0x0077
                android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
                r2.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r2.setCornerRadius(r3)
                r3 = -1
                r2.setColor(r3)
                com.google.android.material.tabs.TabLayout r3 = com.google.android.material.tabs.TabLayout.this
                android.content.res.ColorStateList r3 = r3.f2
                r4 = 2
                int[][] r5 = new int[r4][]
                int[] r4 = new int[r4]
                int[] r6 = i0.h.a.c.u.a.i
                r5[r0] = r6
                int[] r6 = i0.h.a.c.u.a.e
                int r6 = i0.h.a.c.u.a.a(r3, r6)
                r4[r0] = r6
                r0 = 1
                int[] r6 = android.util.StateSet.NOTHING
                r5[r0] = r6
                int[] r6 = i0.h.a.c.u.a.a
                int r3 = i0.h.a.c.u.a.a(r3, r6)
                r4[r0] = r3
                android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
                r0.<init>(r5, r4)
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                boolean r4 = r4.y2
                if (r4 == 0) goto L_0x006f
                r8 = r1
            L_0x006f:
                if (r4 == 0) goto L_0x0072
                goto L_0x0073
            L_0x0072:
                r1 = r2
            L_0x0073:
                r3.<init>(r0, r8, r1)
                r8 = r3
            L_0x0077:
                java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
                r7.setBackground(r8)
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                r8.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.i(android.content.Context):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
            r0 = r0.a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(android.widget.TextView r7, android.widget.ImageView r8) {
            /*
                r6 = this;
                com.google.android.material.tabs.TabLayout$g r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.a
                if (r0 == 0) goto L_0x000e
                android.graphics.drawable.Drawable r0 = r0.mutate()
                goto L_0x000f
            L_0x000e:
                r0 = r1
            L_0x000f:
                com.google.android.material.tabs.TabLayout$g r2 = r6.d
                if (r2 == 0) goto L_0x0016
                java.lang.CharSequence r2 = r2.b
                goto L_0x0017
            L_0x0016:
                r2 = r1
            L_0x0017:
                r3 = 8
                r4 = 0
                if (r8 == 0) goto L_0x002e
                if (r0 == 0) goto L_0x0028
                r8.setImageDrawable(r0)
                r8.setVisibility(r4)
                r6.setVisibility(r4)
                goto L_0x002e
            L_0x0028:
                r8.setVisibility(r3)
                r8.setImageDrawable(r1)
            L_0x002e:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                r0 = r0 ^ 1
                if (r7 == 0) goto L_0x004d
                if (r0 == 0) goto L_0x0047
                r7.setText(r2)
                com.google.android.material.tabs.TabLayout$g r5 = r6.d
                java.util.Objects.requireNonNull(r5)
                r7.setVisibility(r4)
                r6.setVisibility(r4)
                goto L_0x004d
            L_0x0047:
                r7.setVisibility(r3)
                r7.setText(r1)
            L_0x004d:
                if (r8 == 0) goto L_0x008f
                android.view.ViewGroup$LayoutParams r7 = r8.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
                if (r0 == 0) goto L_0x0067
                int r5 = r8.getVisibility()
                if (r5 != 0) goto L_0x0067
                android.content.Context r5 = r6.getContext()
                float r3 = i0.h.a.b.c.m.b.E(r5, r3)
                int r3 = (int) r3
                goto L_0x0068
            L_0x0067:
                r3 = r4
            L_0x0068:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                boolean r5 = r5.v2
                if (r5 == 0) goto L_0x0080
                int r5 = r7.getMarginEnd()
                if (r3 == r5) goto L_0x008f
                r7.setMarginEnd(r3)
                r7.bottomMargin = r4
                r8.setLayoutParams(r7)
                r8.requestLayout()
                goto L_0x008f
            L_0x0080:
                int r5 = r7.bottomMargin
                if (r3 == r5) goto L_0x008f
                r7.bottomMargin = r3
                r7.setMarginEnd(r4)
                r8.setLayoutParams(r7)
                r8.requestLayout()
            L_0x008f:
                com.google.android.material.tabs.TabLayout$g r7 = r6.d
                if (r7 == 0) goto L_0x0095
                java.lang.CharSequence r1 = r7.c
            L_0x0095:
                if (r0 == 0) goto L_0x0098
                goto L_0x0099
            L_0x0098:
                r2 = r1
            L_0x0099:
                g0.a.b.b.a.y0(r6, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.j(android.widget.TextView, android.widget.ImageView):void");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.Y1;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(contentDescription + ", " + this.Y1.f());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(0, 1, this.d.d, 1, false, isSelected()).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b.a.a.i);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0095;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r8, int r9) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r8)
                int r1 = android.view.View.MeasureSpec.getMode(r8)
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x001e
                if (r1 == 0) goto L_0x0014
                if (r0 <= r2) goto L_0x001e
            L_0x0014:
                com.google.android.material.tabs.TabLayout r8 = com.google.android.material.tabs.TabLayout.this
                int r8 = r8.m2
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0)
            L_0x001e:
                super.onMeasure(r8, r9)
                android.widget.TextView r0 = r7.q
                if (r0 == 0) goto L_0x00a5
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.j2
                int r1 = r7.d2
                android.widget.ImageView r2 = r7.x
                r3 = 1
                if (r2 == 0) goto L_0x0038
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0038
                r1 = r3
                goto L_0x0046
            L_0x0038:
                android.widget.TextView r2 = r7.q
                if (r2 == 0) goto L_0x0046
                int r2 = r2.getLineCount()
                if (r2 <= r3) goto L_0x0046
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                float r0 = r0.k2
            L_0x0046:
                android.widget.TextView r2 = r7.q
                float r2 = r2.getTextSize()
                android.widget.TextView r4 = r7.q
                int r4 = r4.getLineCount()
                android.widget.TextView r5 = r7.q
                int r5 = r5.getMaxLines()
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 != 0) goto L_0x0060
                if (r5 < 0) goto L_0x00a5
                if (r1 == r5) goto L_0x00a5
            L_0x0060:
                com.google.android.material.tabs.TabLayout r5 = com.google.android.material.tabs.TabLayout.this
                int r5 = r5.u2
                r6 = 0
                if (r5 != r3) goto L_0x0096
                if (r2 <= 0) goto L_0x0096
                if (r4 != r3) goto L_0x0096
                android.widget.TextView r2 = r7.q
                android.text.Layout r2 = r2.getLayout()
                if (r2 == 0) goto L_0x0095
                float r4 = r2.getLineWidth(r6)
                android.text.TextPaint r2 = r2.getPaint()
                float r2 = r2.getTextSize()
                float r2 = r0 / r2
                float r2 = r2 * r4
                int r4 = r7.getMeasuredWidth()
                int r5 = r7.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r7.getPaddingRight()
                int r4 = r4 - r5
                float r4 = (float) r4
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r2 <= 0) goto L_0x0096
            L_0x0095:
                r3 = r6
            L_0x0096:
                if (r3 == 0) goto L_0x00a5
                android.widget.TextView r2 = r7.q
                r2.setTextSize(r6, r0)
                android.widget.TextView r0 = r7.q
                r0.setMaxLines(r1)
                super.onMeasure(r8, r9)
            L_0x00a5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.onMeasure(int, int):void");
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.d == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            g gVar = this.d;
            TabLayout tabLayout = gVar.f;
            if (tabLayout != null) {
                tabLayout.l(gVar, true);
                return true;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.q;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.x;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.Z1;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.d) {
                this.d = gVar;
                h();
            }
        }
    }

    public static class j implements d {
        public final ViewPager a;

        public j(ViewPager viewPager) {
            this.a = viewPager;
        }

        public void a(g gVar) {
        }

        public void b(g gVar) {
            this.a.setCurrentItem(gVar.d);
        }

        public void c(g gVar) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            int r3 = com.google.android.material.R.attr.tabStyle
            int r4 = c
            android.content.Context r12 = i0.h.a.c.a0.a.a.a(r12, r13, r3, r4)
            r11.<init>(r12, r13, r3)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r11.q = r12
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            r11.g2 = r12
            r12 = 0
            r11.h2 = r12
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11.m2 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.B2 = r0
            h0.i.h.d r0 = new h0.i.h.d
            r1 = 12
            r0.<init>(r1)
            r11.K2 = r0
            android.content.Context r6 = r11.getContext()
            r11.setHorizontalScrollBarEnabled(r12)
            com.google.android.material.tabs.TabLayout$f r7 = new com.google.android.material.tabs.TabLayout$f
            r7.<init>(r6)
            r11.y = r7
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r8 = -1
            r0.<init>(r1, r8)
            super.addView(r7, r12, r0)
            int[] r2 = com.google.android.material.R.styleable.TabLayout
            r9 = 1
            int[] r5 = new int[r9]
            int r10 = com.google.android.material.R.styleable.TabLayout_tabTextAppearance
            r5[r12] = r10
            r0 = r6
            r1 = r13
            android.content.res.TypedArray r13 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            android.graphics.drawable.Drawable r0 = r11.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x008e
            android.graphics.drawable.Drawable r0 = r11.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            i0.h.a.c.w.g r1 = new i0.h.a.c.w.g
            r1.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.t(r0)
            i0.h.a.c.w.g$b r0 = r1.q
            i0.h.a.c.n.a r2 = new i0.h.a.c.n.a
            r2.<init>(r6)
            r0.b = r2
            r1.B()
            java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
            float r0 = r11.getElevation()
            r1.s(r0)
            r11.setBackground(r1)
        L_0x008e:
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIndicator
            android.graphics.drawable.Drawable r0 = i0.h.a.b.c.m.b.P(r6, r13, r0)
            r11.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIndicatorColor
            int r0 = r13.getColor(r0, r12)
            r11.setSelectedTabIndicatorColor(r0)
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIndicatorHeight
            int r0 = r13.getDimensionPixelSize(r0, r8)
            r7.b(r0)
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIndicatorGravity
            int r0 = r13.getInt(r0, r12)
            r11.setSelectedTabIndicatorGravity(r0)
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIndicatorFullWidth
            boolean r0 = r13.getBoolean(r0, r9)
            r11.setTabIndicatorFullWidth(r0)
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIndicatorAnimationMode
            int r0 = r13.getInt(r0, r12)
            r11.setTabIndicatorAnimationMode(r0)
            int r0 = com.google.android.material.R.styleable.TabLayout_tabPadding
            int r0 = r13.getDimensionPixelSize(r0, r12)
            r11.b2 = r0
            r11.a2 = r0
            r11.Z1 = r0
            r11.Y1 = r0
            int r1 = com.google.android.material.R.styleable.TabLayout_tabPaddingStart
            int r0 = r13.getDimensionPixelSize(r1, r0)
            r11.Y1 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabPaddingTop
            int r1 = r11.Z1
            int r0 = r13.getDimensionPixelSize(r0, r1)
            r11.Z1 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabPaddingEnd
            int r1 = r11.a2
            int r0 = r13.getDimensionPixelSize(r0, r1)
            r11.a2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabPaddingBottom
            int r1 = r11.b2
            int r0 = r13.getDimensionPixelSize(r0, r1)
            r11.b2 = r0
            int r0 = com.google.android.material.R.style.TextAppearance_Design_Tab
            int r0 = r13.getResourceId(r10, r0)
            r11.c2 = r0
            int[] r1 = androidx.appcompat.R.styleable.TextAppearance
            android.content.res.TypedArray r0 = r6.obtainStyledAttributes(r0, r1)
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textSize     // Catch:{ all -> 0x01d5 }
            int r1 = r0.getDimensionPixelSize(r1, r12)     // Catch:{ all -> 0x01d5 }
            float r1 = (float) r1     // Catch:{ all -> 0x01d5 }
            r11.j2 = r1     // Catch:{ all -> 0x01d5 }
            int r1 = androidx.appcompat.R.styleable.TextAppearance_android_textColor     // Catch:{ all -> 0x01d5 }
            android.content.res.ColorStateList r1 = i0.h.a.b.c.m.b.M(r6, r0, r1)     // Catch:{ all -> 0x01d5 }
            r11.d2 = r1     // Catch:{ all -> 0x01d5 }
            r0.recycle()
            int r0 = com.google.android.material.R.styleable.TabLayout_tabTextColor
            boolean r1 = r13.hasValue(r0)
            if (r1 == 0) goto L_0x0128
            android.content.res.ColorStateList r0 = i0.h.a.b.c.m.b.M(r6, r13, r0)
            r11.d2 = r0
        L_0x0128:
            int r0 = com.google.android.material.R.styleable.TabLayout_tabSelectedTextColor
            boolean r1 = r13.hasValue(r0)
            if (r1 == 0) goto L_0x0152
            int r0 = r13.getColor(r0, r12)
            android.content.res.ColorStateList r1 = r11.d2
            int r1 = r1.getDefaultColor()
            r2 = 2
            int[][] r3 = new int[r2][]
            int[] r2 = new int[r2]
            int[] r4 = android.widget.HorizontalScrollView.SELECTED_STATE_SET
            r3[r12] = r4
            r2[r12] = r0
            int[] r0 = android.widget.HorizontalScrollView.EMPTY_STATE_SET
            r3[r9] = r0
            r2[r9] = r1
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r3, r2)
            r11.d2 = r0
        L_0x0152:
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIconTint
            android.content.res.ColorStateList r0 = i0.h.a.b.c.m.b.M(r6, r13, r0)
            r11.e2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIconTintMode
            int r0 = r13.getInt(r0, r8)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = i0.h.a.b.c.m.b.f0(r0, r1)
            r11.i2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabRippleColor
            android.content.res.ColorStateList r0 = i0.h.a.b.c.m.b.M(r6, r13, r0)
            r11.f2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabIndicatorAnimationDuration
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = r13.getInt(r0, r1)
            r11.s2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabMinWidth
            int r0 = r13.getDimensionPixelSize(r0, r8)
            r11.n2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabMaxWidth
            int r0 = r13.getDimensionPixelSize(r0, r8)
            r11.o2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabBackground
            int r0 = r13.getResourceId(r0, r12)
            r11.l2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabContentStart
            int r0 = r13.getDimensionPixelSize(r0, r12)
            r11.q2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabMode
            int r0 = r13.getInt(r0, r9)
            r11.u2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabGravity
            int r0 = r13.getInt(r0, r12)
            r11.r2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabInlineLabel
            boolean r0 = r13.getBoolean(r0, r12)
            r11.v2 = r0
            int r0 = com.google.android.material.R.styleable.TabLayout_tabUnboundedRipple
            boolean r12 = r13.getBoolean(r0, r12)
            r11.y2 = r12
            r13.recycle()
            android.content.res.Resources r12 = r11.getResources()
            int r13 = com.google.android.material.R.dimen.design_tab_text_size_2line
            int r13 = r12.getDimensionPixelSize(r13)
            float r13 = (float) r13
            r11.k2 = r13
            int r13 = com.google.android.material.R.dimen.design_tab_scrollable_min_width
            int r12 = r12.getDimensionPixelSize(r13)
            r11.p2 = r12
            r11.e()
            return
        L_0x01d5:
            r12 = move-exception
            r0.recycle()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getDefaultHeight() {
        int size = this.q.size();
        boolean z = false;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                g gVar = this.q.get(i3);
                if (gVar != null && gVar.a != null && !TextUtils.isEmpty(gVar.b)) {
                    z = true;
                    break;
                }
                i3++;
            } else {
                break;
            }
        }
        return (!z || this.v2) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i3 = this.n2;
        if (i3 != -1) {
            return i3;
        }
        int i4 = this.u2;
        if (i4 == 0 || i4 == 2) {
            return this.p2;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.y.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i3) {
        int childCount = this.y.getChildCount();
        if (i3 < childCount) {
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = this.y.getChildAt(i4);
                boolean z = true;
                childAt.setSelected(i4 == i3);
                if (i4 != i3) {
                    z = false;
                }
                childAt.setActivated(z);
                i4++;
            }
        }
    }

    public void a(g gVar) {
        b(gVar, this.q.size(), this.q.isEmpty());
    }

    public void addView(View view) {
        c(view);
    }

    public void b(g gVar, int i3, boolean z) {
        if (gVar.f == this) {
            gVar.d = i3;
            this.q.add(i3, gVar);
            int size = this.q.size();
            while (true) {
                i3++;
                if (i3 >= size) {
                    break;
                }
                this.q.get(i3).d = i3;
            }
            i iVar = gVar.g;
            iVar.setSelected(false);
            iVar.setActivated(false);
            f fVar = this.y;
            int i4 = gVar.d;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            q(layoutParams);
            fVar.addView(iVar, i4, layoutParams);
            if (z) {
                TabLayout tabLayout = gVar.f;
                if (tabLayout != null) {
                    tabLayout.l(gVar, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void c(View view) {
        if (view instanceof i0.h.a.c.y.c) {
            i0.h.a.c.y.c cVar = (i0.h.a.c.y.c) view;
            g i3 = i();
            Objects.requireNonNull(cVar);
            if (!TextUtils.isEmpty(cVar.getContentDescription())) {
                i3.c = cVar.getContentDescription();
                i3.c();
            }
            a(i3);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void d(int i3) {
        boolean z;
        if (i3 != -1) {
            if (getWindowToken() != null) {
                AtomicInteger atomicInteger = q.a;
                if (isLaidOut()) {
                    f fVar = this.y;
                    int childCount = fVar.getChildCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= childCount) {
                            z = false;
                            break;
                        } else if (fVar.getChildAt(i4).getWidth() <= 0) {
                            z = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (!z) {
                        int scrollX = getScrollX();
                        int f3 = f(i3, 0.0f);
                        if (scrollX != f3) {
                            g();
                            this.D2.setIntValues(new int[]{scrollX, f3});
                            this.D2.start();
                        }
                        f fVar2 = this.y;
                        int i5 = this.s2;
                        ValueAnimator valueAnimator = fVar2.c;
                        if (valueAnimator != null && valueAnimator.isRunning()) {
                            fVar2.c.cancel();
                        }
                        fVar2.d(true, i3, i5);
                        return;
                    }
                }
            }
            n(i3, 0.0f, true, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 != 2) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r5 = this;
            int r0 = r5.u2
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L_0x000b
            if (r0 != r1) goto L_0x0009
            goto L_0x000b
        L_0x0009:
            r0 = r2
            goto L_0x0014
        L_0x000b:
            int r0 = r5.q2
            int r3 = r5.Y1
            int r0 = r0 - r3
            int r0 = java.lang.Math.max(r2, r0)
        L_0x0014:
            com.google.android.material.tabs.TabLayout$f r3 = r5.y
            java.util.concurrent.atomic.AtomicInteger r4 = h0.i.i.q.a
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.u2
            java.lang.String r2 = "TabLayout"
            r3 = 1
            if (r0 == 0) goto L_0x0036
            if (r0 == r3) goto L_0x0027
            if (r0 == r1) goto L_0x0027
            goto L_0x0052
        L_0x0027:
            int r0 = r5.r2
            if (r0 != r1) goto L_0x0030
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r2, r0)
        L_0x0030:
            com.google.android.material.tabs.TabLayout$f r0 = r5.y
            r0.setGravity(r3)
            goto L_0x0052
        L_0x0036:
            int r0 = r5.r2
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x003f
            if (r0 == r1) goto L_0x004a
            goto L_0x0052
        L_0x003f:
            com.google.android.material.tabs.TabLayout$f r0 = r5.y
            r0.setGravity(r3)
            goto L_0x0052
        L_0x0045:
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r2, r0)
        L_0x004a:
            com.google.android.material.tabs.TabLayout$f r0 = r5.y
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r0.setGravity(r1)
        L_0x0052:
            r5.r(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.e():void");
    }

    public final int f(int i3, float f3) {
        int i4 = this.u2;
        int i5 = 0;
        if (i4 != 0 && i4 != 2) {
            return 0;
        }
        View childAt = this.y.getChildAt(i3);
        int i6 = i3 + 1;
        View childAt2 = i6 < this.y.getChildCount() ? this.y.getChildAt(i6) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        if (childAt2 != null) {
            i5 = childAt2.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i7 = (int) (((float) (width + i5)) * 0.5f * f3);
        AtomicInteger atomicInteger = q.a;
        return getLayoutDirection() == 0 ? left + i7 : left - i7;
    }

    public final void g() {
        if (this.D2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.D2 = valueAnimator;
            valueAnimator.setInterpolator(i0.h.a.c.a.a.b);
            this.D2.setDuration((long) this.s2);
            this.D2.addUpdateListener(new a());
        }
    }

    public int getSelectedTabPosition() {
        g gVar = this.x;
        if (gVar != null) {
            return gVar.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.q.size();
    }

    public int getTabGravity() {
        return this.r2;
    }

    public ColorStateList getTabIconTint() {
        return this.e2;
    }

    public int getTabIndicatorAnimationMode() {
        return this.x2;
    }

    public int getTabIndicatorGravity() {
        return this.t2;
    }

    public int getTabMaxWidth() {
        return this.m2;
    }

    public int getTabMode() {
        return this.u2;
    }

    public ColorStateList getTabRippleColor() {
        return this.f2;
    }

    public Drawable getTabSelectedIndicator() {
        return this.g2;
    }

    public ColorStateList getTabTextColors() {
        return this.d2;
    }

    public g h(int i3) {
        if (i3 < 0 || i3 >= getTabCount()) {
            return null;
        }
        return this.q.get(i3);
    }

    public g i() {
        g a3 = d.a();
        if (a3 == null) {
            a3 = new g();
        }
        a3.f = this;
        h0.i.h.d<i> dVar = this.K2;
        i a4 = dVar != null ? dVar.a() : null;
        if (a4 == null) {
            a4 = new i(getContext());
        }
        a4.setTab(a3);
        a4.setFocusable(true);
        a4.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(a3.c)) {
            a4.setContentDescription(a3.b);
        } else {
            a4.setContentDescription(a3.c);
        }
        a3.g = a4;
        int i3 = a3.h;
        if (i3 != -1) {
            a4.setId(i3);
        }
        return a3;
    }

    public void j() {
        int currentItem;
        k();
        h0.f0.a.a aVar = this.F2;
        if (aVar != null) {
            int count = aVar.getCount();
            for (int i3 = 0; i3 < count; i3++) {
                g i4 = i();
                i4.b(this.F2.getPageTitle(i3));
                b(i4, this.q.size(), false);
            }
            ViewPager viewPager = this.E2;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                l(h(currentItem), true);
            }
        }
    }

    public void k() {
        int childCount = this.y.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            i iVar = (i) this.y.getChildAt(childCount);
            this.y.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab((g) null);
                iVar.setSelected(false);
                this.K2.b(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.q.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f = null;
            next.g = null;
            next.a = null;
            next.h = -1;
            next.b = null;
            next.c = null;
            next.d = -1;
            next.e = null;
            d.b(next);
        }
        this.x = null;
    }

    public void l(g gVar, boolean z) {
        g gVar2 = this.x;
        if (gVar2 != gVar) {
            int i3 = gVar != null ? gVar.d : -1;
            if (z) {
                if ((gVar2 == null || gVar2.d == -1) && i3 != -1) {
                    n(i3, 0.0f, true, true);
                } else {
                    d(i3);
                }
                if (i3 != -1) {
                    setSelectedTabView(i3);
                }
            }
            this.x = gVar;
            if (gVar2 != null) {
                for (int size = this.B2.size() - 1; size >= 0; size--) {
                    this.B2.get(size).c(gVar2);
                }
            }
            if (gVar != null) {
                for (int size2 = this.B2.size() - 1; size2 >= 0; size2--) {
                    this.B2.get(size2).b(gVar);
                }
            }
        } else if (gVar2 != null) {
            for (int size3 = this.B2.size() - 1; size3 >= 0; size3--) {
                this.B2.get(size3).a(gVar);
            }
            d(gVar.d);
        }
    }

    public void m(h0.f0.a.a aVar, boolean z) {
        DataSetObserver dataSetObserver;
        h0.f0.a.a aVar2 = this.F2;
        if (!(aVar2 == null || (dataSetObserver = this.G2) == null)) {
            aVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.F2 = aVar;
        if (z && aVar != null) {
            if (this.G2 == null) {
                this.G2 = new e();
            }
            aVar.registerDataSetObserver(this.G2);
        }
        j();
    }

    public void n(int i3, float f3, boolean z, boolean z3) {
        int round = Math.round(((float) i3) + f3);
        if (round >= 0 && round < this.y.getChildCount()) {
            if (z3) {
                f fVar = this.y;
                ValueAnimator valueAnimator = fVar.c;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    fVar.c.cancel();
                }
                fVar.d = i3;
                fVar.q = f3;
                fVar.c(fVar.getChildAt(i3), fVar.getChildAt(fVar.d + 1), fVar.q);
            }
            ValueAnimator valueAnimator2 = this.D2;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.D2.cancel();
            }
            scrollTo(f(i3, f3), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void o(ViewPager viewPager, boolean z, boolean z3) {
        ViewPager viewPager2 = this.E2;
        if (viewPager2 != null) {
            h hVar = this.H2;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.I2;
            if (bVar != null) {
                this.E2.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.C2;
        if (cVar != null) {
            this.B2.remove(cVar);
            this.C2 = null;
        }
        if (viewPager != null) {
            this.E2 = viewPager;
            if (this.H2 == null) {
                this.H2 = new h(this);
            }
            h hVar2 = this.H2;
            hVar2.q = 0;
            hVar2.d = 0;
            viewPager.addOnPageChangeListener(hVar2);
            j jVar = new j(viewPager);
            this.C2 = jVar;
            if (!this.B2.contains(jVar)) {
                this.B2.add(jVar);
            }
            h0.f0.a.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                m(adapter, z);
            }
            if (this.I2 == null) {
                this.I2 = new b();
            }
            b bVar2 = this.I2;
            bVar2.a = z;
            viewPager.addOnAdapterChangeListener(bVar2);
            n(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.E2 = null;
            m((h0.f0.a.a) null, false);
        }
        this.J2 = z3;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i0.h.a.c.w.g) {
            i0.h.a.b.c.m.b.m0(this, (i0.h.a.c.w.g) background);
        }
        if (this.E2 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                o((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.J2) {
            setupWithViewPager((ViewPager) null);
            this.J2 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        r1 = (com.google.android.material.tabs.TabLayout.i) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            com.google.android.material.tabs.TabLayout$f r1 = r7.y
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0034
            com.google.android.material.tabs.TabLayout$f r1 = r7.y
            android.view.View r1 = r1.getChildAt(r0)
            boolean r2 = r1 instanceof com.google.android.material.tabs.TabLayout.i
            if (r2 == 0) goto L_0x0031
            com.google.android.material.tabs.TabLayout$i r1 = (com.google.android.material.tabs.TabLayout.i) r1
            android.graphics.drawable.Drawable r2 = r1.c2
            if (r2 == 0) goto L_0x0031
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r6 = r1.getBottom()
            r2.setBounds(r3, r4, r5, r6)
            android.graphics.drawable.Drawable r1 = r1.c2
            r1.draw(r8)
        L_0x0031:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0034:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0048b.a(1, getTabCount(), false, 1).a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r0 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = i0.h.a.b.c.m.b.E(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L_0x002e
            if (r1 == 0) goto L_0x001f
            goto L_0x0041
        L_0x001f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0041
        L_0x002e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L_0x0041
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L_0x0041
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L_0x0041:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L_0x005f
            int r1 = r6.o2
            if (r1 <= 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = i0.h.a.b.c.m.b.E(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L_0x005d:
            r6.m2 = r1
        L_0x005f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto L_0x00ad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.u2
            if (r0 == 0) goto L_0x0082
            if (r0 == r5) goto L_0x0076
            r1 = 2
            if (r0 == r1) goto L_0x0082
            goto L_0x008d
        L_0x0076:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L_0x008d
        L_0x0080:
            r4 = r5
            goto L_0x008d
        L_0x0082:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L_0x008d
            goto L_0x0080
        L_0x008d:
            if (r4 == 0) goto L_0x00ad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final void p() {
        int size = this.q.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.q.get(i3).c();
        }
    }

    public final void q(LinearLayout.LayoutParams layoutParams) {
        if (this.u2 == 1 && this.r2 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void r(boolean z) {
        for (int i3 = 0; i3 < this.y.getChildCount(); i3++) {
            View childAt = this.y.getChildAt(i3);
            childAt.setMinimumWidth(getTabMinWidth());
            q((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void setElevation(float f3) {
        super.setElevation(f3);
        i0.h.a.b.c.m.b.l0(this, f3);
    }

    public void setInlineLabel(boolean z) {
        if (this.v2 != z) {
            this.v2 = z;
            for (int i3 = 0; i3 < this.y.getChildCount(); i3++) {
                View childAt = this.y.getChildAt(i3);
                if (childAt instanceof i) {
                    i iVar = (i) childAt;
                    iVar.setOrientation(TabLayout.this.v2 ^ true ? 1 : 0);
                    TextView textView = iVar.a2;
                    if (textView == null && iVar.b2 == null) {
                        iVar.j(iVar.q, iVar.x);
                    } else {
                        iVar.j(textView, iVar.b2);
                    }
                }
            }
            e();
        }
    }

    public void setInlineLabelResource(int i3) {
        setInlineLabel(getResources().getBoolean(i3));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        g();
        this.D2.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.g2 != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.g2 = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i3) {
        this.h2 = i3;
    }

    public void setSelectedTabIndicatorGravity(int i3) {
        if (this.t2 != i3) {
            this.t2 = i3;
            f fVar = this.y;
            AtomicInteger atomicInteger = q.a;
            fVar.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i3) {
        this.y.b(i3);
    }

    public void setTabGravity(int i3) {
        if (this.r2 != i3) {
            this.r2 = i3;
            e();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.e2 != colorStateList) {
            this.e2 = colorStateList;
            p();
        }
    }

    public void setTabIconTintResource(int i3) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
        setTabIconTint(context.getColorStateList(i3));
    }

    public void setTabIndicatorAnimationMode(int i3) {
        this.x2 = i3;
        if (i3 == 0) {
            this.z2 = new i0.h.a.c.y.b();
        } else if (i3 == 1) {
            this.z2 = new i0.h.a.c.y.a();
        } else {
            throw new IllegalArgumentException(i3 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.w2 = z;
        f fVar = this.y;
        AtomicInteger atomicInteger = q.a;
        fVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i3) {
        if (i3 != this.u2) {
            this.u2 = i3;
            e();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f2 != colorStateList) {
            this.f2 = colorStateList;
            for (int i3 = 0; i3 < this.y.getChildCount(); i3++) {
                View childAt = this.y.getChildAt(i3);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i4 = i.c;
                    ((i) childAt).i(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i3) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = h0.b.b.a.a.a;
        setTabRippleColor(context.getColorStateList(i3));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.d2 != colorStateList) {
            this.d2 = colorStateList;
            p();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(h0.f0.a.a aVar) {
        m(aVar, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.y2 != z) {
            this.y2 = z;
            for (int i3 = 0; i3 < this.y.getChildCount(); i3++) {
                View childAt = this.y.getChildAt(i3);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i4 = i.c;
                    ((i) childAt).i(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i3) {
        setUnboundedRipple(getResources().getBoolean(i3));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        o(viewPager, true, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public void addView(View view, int i3) {
        c(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.A2;
        if (cVar2 != null) {
            this.B2.remove(cVar2);
        }
        this.A2 = cVar;
        if (cVar != null && !this.B2.contains(cVar)) {
            this.B2.add(cVar);
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setSelectedTabIndicator(int i3) {
        if (i3 != 0) {
            setSelectedTabIndicator(h0.b.b.a.a.a(getContext(), i3));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }
}
