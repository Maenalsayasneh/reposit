package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R;
import h0.b.e.i.g;
import h0.b.e.i.n;
import h0.b.f.c;
import h0.b.f.c1;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionBarContextView extends h0.b.f.a {
    public CharSequence b2;
    public CharSequence c2;
    public View d2;
    public View e2;
    public View f2;
    public LinearLayout g2;
    public TextView h2;
    public TextView i2;
    public int j2;
    public int k2;
    public boolean l2;
    public int m2;

    public class a implements View.OnClickListener {
        public final /* synthetic */ h0.b.e.a c;

        public a(ActionBarContextView actionBarContextView, h0.b.e.a aVar) {
            this.c = aVar;
        }

        public void onClick(View view) {
            this.c.c();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = androidx.appcompat.R.attr.actionModeStyle
            r3.<init>(r4, r5, r0)
            int[] r1 = androidx.appcompat.R.styleable.ActionMode
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            int r0 = androidx.appcompat.R.styleable.ActionMode_background
            boolean r1 = r5.hasValue(r0)
            if (r1 == 0) goto L_0x001f
            int r1 = r5.getResourceId(r0, r2)
            if (r1 == 0) goto L_0x001f
            android.graphics.drawable.Drawable r4 = h0.b.b.a.a.a(r4, r1)
            goto L_0x0023
        L_0x001f:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r0)
        L_0x0023:
            java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
            r3.setBackground(r4)
            int r4 = androidx.appcompat.R.styleable.ActionMode_titleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.j2 = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_subtitleTextStyle
            int r4 = r5.getResourceId(r4, r2)
            r3.k2 = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_height
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.y = r4
            int r4 = androidx.appcompat.R.styleable.ActionMode_closeItemLayout
            int r0 = androidx.appcompat.R.layout.abc_action_mode_close_item_material
            int r4 = r5.getResourceId(r4, r0)
            r3.m2 = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void f(h0.b.e.a aVar) {
        View view = this.d2;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.m2, this, false);
            this.d2 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.d2);
        }
        View findViewById = this.d2.findViewById(R.id.action_mode_close_button);
        this.e2 = findViewById;
        findViewById.setOnClickListener(new a(this, aVar));
        g gVar = (g) aVar.e();
        c cVar = this.x;
        if (cVar != null) {
            cVar.a();
        }
        c cVar2 = new c(getContext());
        this.x = cVar2;
        cVar2.e2 = true;
        cVar2.f2 = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.b(this.x, this.d);
        c cVar3 = this.x;
        n nVar = cVar3.a2;
        if (nVar == null) {
            n nVar2 = (n) cVar3.x.inflate(cVar3.Y1, this, false);
            cVar3.a2 = nVar2;
            nVar2.b(cVar3.q);
            cVar3.d(true);
        }
        n nVar3 = cVar3.a2;
        if (nVar != nVar3) {
            ((ActionMenuView) nVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) nVar3;
        this.q = actionMenuView;
        AtomicInteger atomicInteger = q.a;
        actionMenuView.setBackground((Drawable) null);
        addView(this.q, layoutParams);
    }

    public final void g() {
        if (this.g2 == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.g2 = linearLayout;
            this.h2 = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.i2 = (TextView) this.g2.findViewById(R.id.action_bar_subtitle);
            if (this.j2 != 0) {
                this.h2.setTextAppearance(getContext(), this.j2);
            }
            if (this.k2 != 0) {
                this.i2.setTextAppearance(getContext(), this.k2);
            }
        }
        this.h2.setText(this.b2);
        this.i2.setText(this.c2);
        boolean z = !TextUtils.isEmpty(this.b2);
        boolean z2 = !TextUtils.isEmpty(this.c2);
        int i = 0;
        this.i2.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.g2;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.g2.getParent() == null) {
            addView(this.g2);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.c2;
    }

    public CharSequence getTitle() {
        return this.b2;
    }

    public void h() {
        removeAllViews();
        this.f2 = null;
        this.q = null;
        this.x = null;
        View view = this.e2;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.x;
        if (cVar != null) {
            cVar.j();
            this.x.l();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.b2);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        boolean b = c1.b(this);
        int paddingRight = b ? (i4 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.d2;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d2.getLayoutParams();
            int i6 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = b ? paddingRight - i6 : paddingRight + i6;
            int d = i8 + d(this.d2, i8, paddingTop, paddingTop2, b);
            paddingRight = b ? d - i7 : d + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.g2;
        if (!(linearLayout == null || this.f2 != null || linearLayout.getVisibility() == 8)) {
            i9 += d(this.g2, i9, paddingTop, paddingTop2, b);
        }
        int i10 = i9;
        View view2 = this.f2;
        if (view2 != null) {
            d(view2, i10, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i4 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.q;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    public void onMeasure(int i, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i5 = this.y;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.d2;
            if (view != null) {
                int c = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d2.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.q;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.q, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.g2;
            if (linearLayout != null && this.f2 == null) {
                if (this.l2) {
                    this.g2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.g2.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.g2.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f2;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.f2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.y <= 0) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i10) {
                        i10 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i10);
                return;
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i) {
        this.y = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2 = view;
        if (!(view == null || (linearLayout = this.g2) == null)) {
            removeView(linearLayout);
            this.g2 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c2 = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.b2 = charSequence;
        g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.l2) {
            requestLayout();
        }
        this.l2 = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
