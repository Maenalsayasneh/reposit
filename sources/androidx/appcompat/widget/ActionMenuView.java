package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import h0.b.a.o;
import h0.b.e.i.g;
import h0.b.e.i.i;
import h0.b.e.i.m;
import h0.b.e.i.n;
import h0.b.f.c;
import h0.b.f.c1;
import h0.b.f.f0;

public class ActionMenuView extends f0 implements g.b, n {
    public g i2;
    public Context j2;
    public int k2 = 0;
    public boolean l2;
    public h0.b.f.c m2;
    public m.a n2;
    public g.a o2;
    public boolean p2;
    public int q2;
    public int r2;
    public int s2;
    public e t2;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements m.a {
        public void c(g gVar, boolean z) {
        }

        public boolean d(g gVar) {
            return false;
        }
    }

    public static class c extends f0.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        public boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.a = false;
        }
    }

    public class d implements g.a {
        public d() {
        }

        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.t2;
            if (eVar == null) {
                return false;
            }
            Toolbar.f fVar = Toolbar.this.z2;
            if (fVar != null ? o.this.c.onMenuItemSelected(0, menuItem) : false) {
                return true;
            }
            return false;
        }

        public void b(g gVar) {
            g.a aVar = ActionMenuView.this.o2;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.r2 = (int) (56.0f * f);
        this.s2 = (int) (f * 4.0f);
        this.j2 = context;
    }

    public static int t(View view, int i, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.c();
        int i6 = 2;
        if (i3 <= 0 || (z2 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i7++;
            }
            if (!z2 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (!cVar.a && z2) {
            z = true;
        }
        cVar.d = z;
        cVar.b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    public boolean a(i iVar) {
        return this.i2.s(iVar, (m) null, 0);
    }

    public void b(g gVar) {
        this.i2 = gVar;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.i2 == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.i2 = gVar;
            gVar.f = new d();
            h0.b.f.c cVar = new h0.b.f.c(context);
            this.m2 = cVar;
            cVar.e2 = true;
            cVar.f2 = true;
            m.a aVar = this.n2;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.y = aVar;
            this.i2.b(cVar, this.j2);
            h0.b.f.c cVar2 = this.m2;
            cVar2.a2 = this;
            this.i2 = cVar2.q;
        }
        return this.i2;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        h0.b.f.c cVar = this.m2;
        c.d dVar = cVar.b2;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.d2) {
            return cVar.c2;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.k2;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public f0.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h0.b.f.c cVar = this.m2;
        if (cVar != null) {
            cVar.d(false);
            if (this.m2.m()) {
                this.m2.j();
                this.m2.n();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h0.b.f.c cVar = this.m2;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (!this.p2) {
            super.onLayout(z, i, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = c1.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (s(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    s(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int i17 = 0;
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            while (i17 < childCount) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.a) {
                    int i18 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i17++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i17 < childCount) {
            View childAt4 = getChildAt(i17);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.a) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i0.d.a.a.a.X(measuredWidth4, cVar3.rightMargin, max, i20);
            }
            i17++;
        }
    }

    public void onMeasure(int i, int i3) {
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        int i7;
        boolean z3;
        g gVar;
        boolean z4 = this.p2;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.p2 = z5;
        if (z4 != z5) {
            this.q2 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (!(!this.p2 || (gVar = this.i2) == null || size == this.q2)) {
            this.q2 = size;
            gVar.q(true);
        }
        int childCount = getChildCount();
        if (!this.p2 || childCount <= 0) {
            int i8 = i3;
            for (int i9 = 0; i9 < childCount; i9++) {
                c cVar = (c) getChildAt(i9).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.r2;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z6 = false;
        long j = 0;
        while (i19 < childCount2) {
            View childAt = getChildAt(i19);
            int i20 = size3;
            int i21 = i10;
            if (childAt.getVisibility() != 8) {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i22 = i15 + 1;
                if (z7) {
                    int i23 = this.s2;
                    i7 = i22;
                    z3 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i7 = i22;
                    z3 = false;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f = z3;
                cVar2.c = z3 ? 1 : 0;
                cVar2.b = z3;
                cVar2.d = z3;
                cVar2.leftMargin = z3;
                cVar2.rightMargin = z3;
                cVar2.e = z7 && ((ActionMenuItemView) childAt).c();
                int t = t(childAt, i14, cVar2.a ? 1 : i12, childMeasureSpec, paddingBottom);
                i17 = Math.max(i17, t);
                if (cVar2.d) {
                    i18++;
                }
                if (cVar2.a) {
                    z6 = true;
                }
                i12 -= t;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (t == 1) {
                    j |= (long) (1 << i19);
                }
                i15 = i7;
            }
            i19++;
            size3 = i20;
            i10 = i21;
        }
        int i24 = i10;
        int i25 = size3;
        boolean z8 = z6 && i15 == 2;
        boolean z9 = false;
        while (true) {
            if (i18 <= 0 || i12 <= 0) {
                i4 = i16;
                z = z9;
            } else {
                int i26 = Integer.MAX_VALUE;
                int i27 = 0;
                int i28 = 0;
                long j3 = 0;
                while (i27 < childCount2) {
                    int i29 = i16;
                    c cVar3 = (c) getChildAt(i27).getLayoutParams();
                    boolean z10 = z9;
                    if (cVar3.d) {
                        int i30 = cVar3.b;
                        if (i30 < i26) {
                            j3 = 1 << i27;
                            i26 = i30;
                            i28 = 1;
                        } else if (i30 == i26) {
                            i28++;
                            j3 |= 1 << i27;
                        }
                    }
                    i27++;
                    z9 = z10;
                    i16 = i29;
                }
                i4 = i16;
                z = z9;
                j |= j3;
                if (i28 > i12) {
                    break;
                }
                int i31 = i26 + 1;
                int i32 = 0;
                while (i32 < childCount2) {
                    View childAt2 = getChildAt(i32);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i33 = i18;
                    long j4 = (long) (1 << i32);
                    if ((j3 & j4) == 0) {
                        if (cVar4.b == i31) {
                            j |= j4;
                        }
                        z2 = z8;
                    } else {
                        if (!z8 || !cVar4.e || i12 != 1) {
                            z2 = z8;
                        } else {
                            int i34 = this.s2;
                            z2 = z8;
                            childAt2.setPadding(i34 + i14, 0, i34, 0);
                        }
                        cVar4.b++;
                        cVar4.f = true;
                        i12--;
                    }
                    i32++;
                    i18 = i33;
                    z8 = z2;
                }
                i16 = i4;
                z9 = true;
            }
        }
        i4 = i16;
        z = z9;
        boolean z11 = !z6 && i15 == 1;
        if (i12 > 0 && j != 0 && (i12 < i15 - 1 || z11 || i17 > 1)) {
            float bitCount = (float) Long.bitCount(j);
            if (!z11) {
                if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((c) getChildAt(i35).getLayoutParams()).e) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) (((float) (i12 * i14)) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.c = i36;
                        cVar5.f = true;
                        if (i37 == 0 && !cVar5.e) {
                            cVar5.leftMargin = (-i36) / 2;
                        }
                        z = true;
                    } else if (cVar5.a) {
                        cVar5.c = i36;
                        cVar5.f = true;
                        cVar5.rightMargin = (-i36) / 2;
                        z = true;
                    } else {
                        if (i37 != 0) {
                            cVar5.leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            cVar5.rightMargin = i36 / 2;
                        }
                    }
                }
            }
        }
        if (z) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.b * i14) + cVar6.c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i6 = i24;
            i5 = i4;
        } else {
            i5 = i25;
            i6 = i24;
        }
        setMeasuredDimension(i6, i5);
    }

    /* renamed from: q */
    public c h() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: r */
    public c j(ViewGroup.LayoutParams layoutParams) {
        c cVar;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof c) {
            cVar = new c((c) layoutParams);
        } else {
            cVar = new c(layoutParams);
        }
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public boolean s(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.m2.j2 = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.t2 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        h0.b.f.c cVar = this.m2;
        c.d dVar = cVar.b2;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.d2 = true;
        cVar.c2 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.l2 = z;
    }

    public void setPopupTheme(int i) {
        if (this.k2 != i) {
            this.k2 = i;
            if (i == 0) {
                this.j2 = getContext();
            } else {
                this.j2 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(h0.b.f.c cVar) {
        this.m2 = cVar;
        cVar.a2 = this;
        this.i2 = cVar.q;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
