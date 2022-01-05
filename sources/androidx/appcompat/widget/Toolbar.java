package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionMenuView;
import androidx.customview.view.AbsSavedState;
import h0.b.a.a;
import h0.b.e.i.g;
import h0.b.e.i.i;
import h0.b.e.i.m;
import h0.b.e.i.r;
import h0.b.f.a0;
import h0.b.f.c1;
import h0.b.f.o0;
import h0.b.f.w0;
import h0.b.f.y0;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Toolbar extends ViewGroup {
    public final ActionMenuView.e A2;
    public y0 B2;
    public h0.b.f.c C2;
    public d D2;
    public m.a E2;
    public g.a F2;
    public boolean G2;
    public final Runnable H2;
    public Drawable Y1;
    public CharSequence Z1;
    public ImageButton a2;
    public View b2;
    public ActionMenuView c;
    public Context c2;
    public TextView d;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public int k2;
    public int l2;
    public o0 m2;
    public int n2;
    public int o2;
    public int p2;
    public TextView q;
    public CharSequence q2;
    public CharSequence r2;
    public ColorStateList s2;
    public ColorStateList t2;
    public boolean u2;
    public boolean v2;
    public final ArrayList<View> w2;
    public ImageButton x;
    public final ArrayList<View> x2;
    public ImageView y;
    public final int[] y2;
    public f z2;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.v();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            i iVar;
            d dVar = Toolbar.this.D2;
            if (dVar == null) {
                iVar = null;
            } else {
                iVar = dVar.d;
            }
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    public class d implements m {
        public g c;
        public i d;

        public d() {
        }

        public void c(g gVar, boolean z) {
        }

        public void d(boolean z) {
            if (this.d != null) {
                g gVar = this.c;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.c.getItem(i) == this.d) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    f(this.c, this.d);
                }
            }
        }

        public boolean e() {
            return false;
        }

        public boolean f(g gVar, i iVar) {
            View view = Toolbar.this.b2;
            if (view instanceof h0.b.e.b) {
                ((h0.b.e.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.b2);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.a2);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.b2 = null;
            int size = toolbar3.x2.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.x2.get(size));
                } else {
                    toolbar3.x2.clear();
                    this.d = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.q(false);
                    return true;
                }
            }
        }

        public boolean g(g gVar, i iVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.a2.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.a2);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.a2);
            }
            Toolbar.this.b2 = iVar.getActionView();
            this.d = iVar;
            ViewParent parent2 = Toolbar.this.b2.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.b2);
                }
                e h = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h.a = 8388611 | (toolbar4.g2 & 112);
                h.b = 2;
                toolbar4.b2.setLayoutParams(h);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.b2);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).b == 2 || childAt == toolbar6.c)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.x2.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.q(false);
            View view = Toolbar.this.b2;
            if (view instanceof h0.b.e.b) {
                ((h0.b.e.b) view).c();
            }
            return true;
        }

        public void i(Context context, g gVar) {
            i iVar;
            g gVar2 = this.c;
            if (!(gVar2 == null || (iVar = this.d) == null)) {
                gVar2.d(iVar);
            }
            this.c = gVar;
        }

        public boolean k(r rVar) {
            return false;
        }
    }

    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    private MenuInflater getMenuInflater() {
        return new h0.b.e.f(getContext());
    }

    public final void a(List<View> list, int i) {
        AtomicInteger atomicInteger = q.a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (z) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && u(childAt) && j(eVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && u(childAt2) && j(eVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.b = 1;
        if (!z || this.b2 == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.x2.add(view);
    }

    public void c() {
        if (this.a2 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.a2 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.Y1);
            this.a2.setContentDescription(this.Z1);
            e h = generateDefaultLayoutParams();
            h.a = 8388611 | (this.g2 & 112);
            h.b = 2;
            this.a2.setLayoutParams(h);
            this.a2.setOnClickListener(new c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.m2 == null) {
            this.m2 = new o0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView.i2 == null) {
            g gVar = (g) actionMenuView.getMenu();
            if (this.D2 == null) {
                this.D2 = new d();
            }
            this.c.setExpandedActionViewsExclusive(true);
            gVar.b(this.D2, this.c2);
        }
    }

    public final void f() {
        if (this.c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.c = actionMenuView;
            actionMenuView.setPopupTheme(this.d2);
            this.c.setOnMenuItemClickListener(this.A2);
            ActionMenuView actionMenuView2 = this.c;
            m.a aVar = this.E2;
            g.a aVar2 = this.F2;
            actionMenuView2.n2 = aVar;
            actionMenuView2.o2 = aVar2;
            e h = generateDefaultLayoutParams();
            h.a = 8388613 | (this.g2 & 112);
            this.c.setLayoutParams(h);
            b(this.c, false);
        }
    }

    public final void g() {
        if (this.x == null) {
            this.x = new AppCompatImageButton(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            e h = generateDefaultLayoutParams();
            h.a = 8388611 | (this.g2 & 112);
            this.x.setLayoutParams(h);
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.a2;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.a2;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0 o0Var = this.m2;
        if (o0Var != null) {
            return o0Var.g ? o0Var.a : o0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.o2;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0 o0Var = this.m2;
        if (o0Var != null) {
            return o0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0 o0Var = this.m2;
        if (o0Var != null) {
            return o0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0 o0Var = this.m2;
        if (o0Var != null) {
            return o0Var.g ? o0Var.b : o0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.n2;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.i2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.c
            r1 = 0
            if (r0 == 0) goto L_0x0011
            h0.b.e.i.g r0 = r0.i2
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.o2
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        AtomicInteger atomicInteger = q.a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        AtomicInteger atomicInteger = q.a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.n2, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.y;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.y;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.c.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public h0.b.f.c getOuterActionMenuPresenter() {
        return this.C2;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.c.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.c2;
    }

    public int getPopupTheme() {
        return this.d2;
    }

    public CharSequence getSubtitle() {
        return this.r2;
    }

    public final TextView getSubtitleTextView() {
        return this.q;
    }

    public CharSequence getTitle() {
        return this.q2;
    }

    public int getTitleMarginBottom() {
        return this.l2;
    }

    public int getTitleMarginEnd() {
        return this.j2;
    }

    public int getTitleMarginStart() {
        return this.i2;
    }

    public int getTitleMarginTop() {
        return this.k2;
    }

    public final TextView getTitleTextView() {
        return this.d;
    }

    public a0 getWrapper() {
        if (this.B2 == null) {
            this.B2 = new y0(this, true);
        }
        return this.B2;
    }

    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0015a) {
            return new e((a.C0015a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public final int j(int i) {
        AtomicInteger atomicInteger = q.a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int k(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i4 = eVar.a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.p2 & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = eVar.topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = eVar.bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.x2.contains(view);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.H2);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.v2 = false;
        }
        if (!this.v2) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.v2 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.v2 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a1 A[LOOP:0: B:101:0x029f->B:102:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c3 A[LOOP:1: B:104:0x02c1->B:105:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e8 A[LOOP:2: B:107:0x02e6->B:108:0x02e8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x033d A[LOOP:3: B:115:0x033b->B:116:0x033d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            java.util.concurrent.atomic.AtomicInteger r1 = h0.i.i.q.a
            int r1 = r20.getLayoutDirection()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = r2
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            int r4 = r20.getWidth()
            int r5 = r20.getHeight()
            int r6 = r20.getPaddingLeft()
            int r7 = r20.getPaddingRight()
            int r8 = r20.getPaddingTop()
            int r9 = r20.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.y2
            r11[r2] = r3
            r11[r3] = r3
            int r12 = r20.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r25 - r23
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = r3
        L_0x003d:
            android.widget.ImageButton r13 = r0.x
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0050
            android.widget.ImageButton r13 = r0.x
            int r13 = r0.r(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0059
        L_0x0050:
            android.widget.ImageButton r13 = r0.x
            int r13 = r0.q(r13, r6, r11, r12)
            goto L_0x0058
        L_0x0057:
            r13 = r6
        L_0x0058:
            r14 = r10
        L_0x0059:
            android.widget.ImageButton r15 = r0.a2
            boolean r15 = r0.u(r15)
            if (r15 == 0) goto L_0x0070
            if (r1 == 0) goto L_0x006a
            android.widget.ImageButton r15 = r0.a2
            int r14 = r0.r(r15, r14, r11, r12)
            goto L_0x0070
        L_0x006a:
            android.widget.ImageButton r15 = r0.a2
            int r13 = r0.q(r15, r13, r11, r12)
        L_0x0070:
            androidx.appcompat.widget.ActionMenuView r15 = r0.c
            boolean r15 = r0.u(r15)
            if (r15 == 0) goto L_0x0087
            if (r1 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.c
            int r13 = r0.q(r15, r13, r11, r12)
            goto L_0x0087
        L_0x0081:
            androidx.appcompat.widget.ActionMenuView r15 = r0.c
            int r14 = r0.r(r15, r14, r11, r12)
        L_0x0087:
            int r15 = r20.getCurrentContentInsetLeft()
            int r16 = r20.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.b2
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00be
            android.view.View r13 = r0.b2
            int r10 = r0.r(r13, r10, r11, r12)
            goto L_0x00c4
        L_0x00be:
            android.view.View r13 = r0.b2
            int r2 = r0.q(r13, r2, r11, r12)
        L_0x00c4:
            android.widget.ImageView r13 = r0.y
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x00db
            if (r1 == 0) goto L_0x00d5
            android.widget.ImageView r13 = r0.y
            int r10 = r0.r(r13, r10, r11, r12)
            goto L_0x00db
        L_0x00d5:
            android.widget.ImageView r13 = r0.y
            int r2 = r0.q(r13, r2, r11, r12)
        L_0x00db:
            android.widget.TextView r13 = r0.d
            boolean r13 = r0.u(r13)
            android.widget.TextView r14 = r0.q
            boolean r14 = r0.u(r14)
            if (r13 == 0) goto L_0x0102
            android.widget.TextView r15 = r0.d
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r24 = r7
            android.widget.TextView r7 = r0.d
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x0105
        L_0x0102:
            r24 = r7
            r7 = 0
        L_0x0105:
            if (r14 == 0) goto L_0x011f
            android.widget.TextView r3 = r0.q
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.q
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0121
        L_0x011f:
            r16 = r4
        L_0x0121:
            if (r13 != 0) goto L_0x012c
            if (r14 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            r18 = r6
            r23 = r12
            goto L_0x0291
        L_0x012c:
            if (r13 == 0) goto L_0x0131
            android.widget.TextView r3 = r0.d
            goto L_0x0133
        L_0x0131:
            android.widget.TextView r3 = r0.q
        L_0x0133:
            if (r14 == 0) goto L_0x0138
            android.widget.TextView r4 = r0.q
            goto L_0x013a
        L_0x0138:
            android.widget.TextView r4 = r0.d
        L_0x013a:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x0150
            android.widget.TextView r15 = r0.d
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x015a
        L_0x0150:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.q
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x015a:
            r17 = 1
            goto L_0x015f
        L_0x015d:
            r17 = 0
        L_0x015f:
            int r15 = r0.p2
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a7
            r6 = 80
            if (r15 == r6) goto L_0x0199
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r23 = r12
            int r12 = r0.k2
            r25 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0182
            int r6 = r15 + r12
            goto L_0x0197
        L_0x0182:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.l2
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0197
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0197:
            int r8 = r8 + r6
            goto L_0x01b6
        L_0x0199:
            r25 = r2
            r23 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.l2
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01b6
        L_0x01a7:
            r25 = r2
            r23 = r12
            int r2 = r20.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.k2
            int r8 = r2 + r3
        L_0x01b6:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bd
            int r1 = r0.i2
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f5
            android.widget.TextView r1 = r0.d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.d
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.d
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.j2
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f6
        L_0x01f5:
            r2 = r10
        L_0x01f6:
            if (r14 == 0) goto L_0x021c
            android.widget.TextView r1 = r0.q
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.q
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.q
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.q
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.j2
            int r1 = r10 - r1
            goto L_0x021d
        L_0x021c:
            r1 = r10
        L_0x021d:
            if (r17 == 0) goto L_0x0224
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0224:
            r2 = r25
            goto L_0x0291
        L_0x0227:
            if (r17 == 0) goto L_0x022c
            int r1 = r0.i2
            goto L_0x022d
        L_0x022c:
            r1 = 0
        L_0x022d:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r25
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0263
            android.widget.TextView r1 = r0.d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.d
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.d
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.j2
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0264
        L_0x0263:
            r2 = r3
        L_0x0264:
            if (r14 == 0) goto L_0x0288
            android.widget.TextView r1 = r0.q
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.q
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.q
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.q
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.j2
            int r1 = r1 + r4
            goto L_0x0289
        L_0x0288:
            r1 = r3
        L_0x0289:
            if (r17 == 0) goto L_0x0290
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0291
        L_0x0290:
            r2 = r3
        L_0x0291:
            java.util.ArrayList<android.view.View> r1 = r0.w2
            r3 = 3
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.w2
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x029f:
            if (r2 >= r1) goto L_0x02b2
            java.util.ArrayList<android.view.View> r4 = r0.w2
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r23
            int r3 = r0.q(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r23
            java.util.ArrayList<android.view.View> r1 = r0.w2
            r2 = 5
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.w2
            int r1 = r1.size()
            r2 = 0
        L_0x02c1:
            if (r2 >= r1) goto L_0x02d2
            java.util.ArrayList<android.view.View> r4 = r0.w2
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.r(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList<android.view.View> r1 = r0.w2
            r2 = 1
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.w2
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02e6:
            if (r5 >= r4) goto L_0x0319
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02e6
        L_0x0319:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r24
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x0329
            goto L_0x0330
        L_0x0329:
            if (r6 <= r10) goto L_0x032f
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0330
        L_0x032f:
            r3 = r4
        L_0x0330:
            java.util.ArrayList<android.view.View> r1 = r0.w2
            int r1 = r1.size()
            r19 = r3
            r3 = r2
            r2 = r19
        L_0x033b:
            if (r3 >= r1) goto L_0x034c
            java.util.ArrayList<android.view.View> r4 = r0.w2
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.q(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x033b
        L_0x034c:
            java.util.ArrayList<android.view.View> r1 = r0.w2
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i3) {
        char c3;
        char c4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.y2;
        boolean z = true;
        int i11 = 0;
        if (c1.b(this)) {
            c4 = 1;
            c3 = 0;
        } else {
            c3 = 1;
            c4 = 0;
        }
        if (u(this.x)) {
            t(this.x, i, 0, i3, 0, this.h2);
            i6 = l(this.x) + this.x.getMeasuredWidth();
            i5 = Math.max(0, m(this.x) + this.x.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.x.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (u(this.a2)) {
            t(this.a2, i, 0, i3, 0, this.h2);
            i6 = l(this.a2) + this.a2.getMeasuredWidth();
            i5 = Math.max(i5, m(this.a2) + this.a2.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.a2.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[c4] = Math.max(0, currentContentInsetStart - i6);
        if (u(this.c)) {
            t(this.c, i, max, i3, 0, this.h2);
            i7 = l(this.c) + this.c.getMeasuredWidth();
            i5 = Math.max(i5, m(this.c) + this.c.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.c.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c3] = Math.max(0, currentContentInsetEnd - i7);
        if (u(this.b2)) {
            max2 += s(this.b2, i, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.b2) + this.b2.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.b2.getMeasuredState());
        }
        if (u(this.y)) {
            max2 += s(this.y, i, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.y) + this.y.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.y.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && u(childAt)) {
                View view = childAt;
                max2 += s(childAt, i, max2, i3, 0, iArr);
                View view2 = view;
                i5 = Math.max(i5, m(view2) + view.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
            }
        }
        int i13 = this.k2 + this.l2;
        int i14 = this.i2 + this.j2;
        if (u(this.d)) {
            s(this.d, i, max2 + i14, i3, i13, iArr);
            int l = l(this.d) + this.d.getMeasuredWidth();
            i8 = m(this.d) + this.d.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.d.getMeasuredState());
            i9 = l;
        } else {
            i8 = 0;
            i10 = i4;
            i9 = 0;
        }
        if (u(this.q)) {
            i9 = Math.max(i9, s(this.q, i, max2 + i14, i3, i8 + i13, iArr));
            i8 = m(this.q) + this.q.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.q.getMeasuredState());
        } else {
            int i15 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.G2) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i16);
                if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i16++;
            }
        }
        z = false;
        if (!z) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        ActionMenuView actionMenuView = this.c;
        g gVar = actionMenuView != null ? actionMenuView.i2 : null;
        int i = savedState.q;
        if (!(i == 0 || this.D2 == null || gVar == null || (findItem = gVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.x) {
            removeCallbacks(this.H2);
            post(this.H2);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        o0 o0Var = this.m2;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != o0Var.g) {
            o0Var.g = z;
            if (!o0Var.h) {
                o0Var.a = o0Var.e;
                o0Var.b = o0Var.f;
            } else if (z) {
                int i3 = o0Var.d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = o0Var.e;
                }
                o0Var.a = i3;
                int i4 = o0Var.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = o0Var.f;
                }
                o0Var.b = i4;
            } else {
                int i5 = o0Var.c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = o0Var.e;
                }
                o0Var.a = i5;
                int i6 = o0Var.d;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = o0Var.f;
                }
                o0Var.b = i6;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        d dVar = this.D2;
        if (!(dVar == null || (iVar = dVar.d) == null)) {
            savedState.q = iVar.a;
        }
        savedState.x = p();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.u2 = false;
        }
        if (!this.u2) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.u2 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.u2 = false;
        }
        return true;
    }

    public boolean p() {
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            h0.b.f.c cVar = actionMenuView.m2;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final int q(View view, int i, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i;
        iArr[0] = Math.max(0, -i4);
        int k = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k, max + measuredWidth, view.getMeasuredHeight() + k);
        return measuredWidth + eVar.rightMargin + max;
    }

    public final int r(View view, int i, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k, max, view.getMeasuredHeight() + k);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final int s(View view, int i, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(h0.b.b.a.a.a(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.G2 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.o2) {
            this.o2 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.n2) {
            this.n2 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(h0.b.b.a.a.a(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(h0.b.b.a.a.a(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.x.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.z2 = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.d2 != i) {
            this.d2 = i;
            if (i == 0) {
                this.c2 = getContext();
            } else {
                this.c2 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.l2 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.j2 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.i2 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.k2 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            h0.b.f.c cVar = actionMenuView.m2;
            if (cVar != null && cVar.n()) {
                return true;
            }
        }
        return false;
    }

    public static class e extends a.C0015a {
        public int b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public e(e eVar) {
            super((a.C0015a) eVar);
            this.b = eVar.b;
        }

        public e(a.C0015a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p2 = 8388627;
        this.w2 = new ArrayList<>();
        this.x2 = new ArrayList<>();
        this.y2 = new int[2];
        this.A2 = new a();
        this.H2 = new b();
        Context context2 = getContext();
        int[] iArr = R.styleable.Toolbar;
        w0 q3 = w0.q(context2, attributeSet, iArr, i, 0);
        q.o(this, context, iArr, attributeSet, q3.b, i, 0);
        this.e2 = q3.l(R.styleable.Toolbar_titleTextAppearance, 0);
        this.f2 = q3.l(R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.p2 = q3.b.getInteger(R.styleable.Toolbar_android_gravity, this.p2);
        this.g2 = q3.b.getInteger(R.styleable.Toolbar_buttonGravity, 48);
        int e3 = q3.e(R.styleable.Toolbar_titleMargin, 0);
        int i3 = R.styleable.Toolbar_titleMargins;
        e3 = q3.o(i3) ? q3.e(i3, e3) : e3;
        this.l2 = e3;
        this.k2 = e3;
        this.j2 = e3;
        this.i2 = e3;
        int e4 = q3.e(R.styleable.Toolbar_titleMarginStart, -1);
        if (e4 >= 0) {
            this.i2 = e4;
        }
        int e5 = q3.e(R.styleable.Toolbar_titleMarginEnd, -1);
        if (e5 >= 0) {
            this.j2 = e5;
        }
        int e6 = q3.e(R.styleable.Toolbar_titleMarginTop, -1);
        if (e6 >= 0) {
            this.k2 = e6;
        }
        int e7 = q3.e(R.styleable.Toolbar_titleMarginBottom, -1);
        if (e7 >= 0) {
            this.l2 = e7;
        }
        this.h2 = q3.f(R.styleable.Toolbar_maxButtonHeight, -1);
        int e8 = q3.e(R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int e9 = q3.e(R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int f3 = q3.f(R.styleable.Toolbar_contentInsetLeft, 0);
        int f4 = q3.f(R.styleable.Toolbar_contentInsetRight, 0);
        d();
        o0 o0Var = this.m2;
        o0Var.h = false;
        if (f3 != Integer.MIN_VALUE) {
            o0Var.e = f3;
            o0Var.a = f3;
        }
        if (f4 != Integer.MIN_VALUE) {
            o0Var.f = f4;
            o0Var.b = f4;
        }
        if (!(e8 == Integer.MIN_VALUE && e9 == Integer.MIN_VALUE)) {
            o0Var.a(e8, e9);
        }
        this.n2 = q3.e(R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.o2 = q3.e(R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.Y1 = q3.g(R.styleable.Toolbar_collapseIcon);
        this.Z1 = q3.n(R.styleable.Toolbar_collapseContentDescription);
        CharSequence n = q3.n(R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(n)) {
            setTitle(n);
        }
        CharSequence n3 = q3.n(R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(n3)) {
            setSubtitle(n3);
        }
        this.c2 = getContext();
        setPopupTheme(q3.l(R.styleable.Toolbar_popupTheme, 0));
        Drawable g = q3.g(R.styleable.Toolbar_navigationIcon);
        if (g != null) {
            setNavigationIcon(g);
        }
        CharSequence n4 = q3.n(R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(n4)) {
            setNavigationContentDescription(n4);
        }
        Drawable g3 = q3.g(R.styleable.Toolbar_logo);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence n5 = q3.n(R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(n5)) {
            setLogoDescription(n5);
        }
        int i4 = R.styleable.Toolbar_titleTextColor;
        if (q3.o(i4)) {
            setTitleTextColor(q3.c(i4));
        }
        int i5 = R.styleable.Toolbar_subtitleTextColor;
        if (q3.o(i5)) {
            setSubtitleTextColor(q3.c(i5));
        }
        int i6 = R.styleable.Toolbar_menu;
        if (q3.o(i6)) {
            getMenuInflater().inflate(q3.l(i6, 0), getMenu());
        }
        q3.b.recycle();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.a2;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.a2.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.a2;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.Y1);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.y == null) {
                this.y = new AppCompatImageView(getContext());
            }
            if (!o(this.y)) {
                b(this.y, true);
            }
        } else {
            ImageView imageView = this.y;
            if (imageView != null && o(imageView)) {
                removeView(this.y);
                this.x2.remove(this.y);
            }
        }
        ImageView imageView2 = this.y;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.y == null) {
            this.y = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.y;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.x)) {
                b(this.x, true);
            }
        } else {
            ImageButton imageButton = this.x;
            if (imageButton != null && o(imageButton)) {
                removeView(this.x);
                this.x2.remove(this.x);
            }
        }
        ImageButton imageButton2 = this.x;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.q == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.q = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.q.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2;
                if (i != 0) {
                    this.q.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.t2;
                if (colorStateList != null) {
                    this.q.setTextColor(colorStateList);
                }
            }
            if (!o(this.q)) {
                b(this.q, true);
            }
        } else {
            TextView textView = this.q;
            if (textView != null && o(textView)) {
                removeView(this.q);
                this.x2.remove(this.q);
            }
        }
        TextView textView2 = this.q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.r2 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.t2 = colorStateList;
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.d = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.e2;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.s2;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!o(this.d)) {
                b(this.d, true);
            }
        } else {
            TextView textView = this.d;
            if (textView != null && o(textView)) {
                removeView(this.d);
                this.x2.remove(this.d);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.q2 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.s2 = colorStateList;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int q;
        public boolean x;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = parcel.readInt();
            this.x = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.q);
            parcel.writeInt(this.x ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
