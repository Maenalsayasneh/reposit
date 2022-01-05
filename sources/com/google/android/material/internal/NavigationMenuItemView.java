package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.google.android.material.R;
import h0.b.e.i.i;
import h0.b.e.i.n;
import h0.b.f.f0;
import h0.i.b.d.h;
import h0.i.i.g0.b;
import h0.i.i.q;
import i0.h.a.c.q.f;
import java.util.concurrent.atomic.AtomicInteger;

public class NavigationMenuItemView extends f implements n.a {
    public static final int[] o2 = {16842912};
    public int p2;
    public boolean q2;
    public boolean r2;
    public final CheckedTextView s2;
    public FrameLayout t2;
    public i u2;
    public ColorStateList v2;
    public boolean w2;
    public Drawable x2;
    public final h0.i.i.a y2;

    public class a extends h0.i.i.a {
        public a() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.b.setCheckable(NavigationMenuItemView.this.r2);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.y2 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.s2 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        q.p(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.t2 == null) {
                this.t2 = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.t2.removeAllViews();
            this.t2.addView(view);
        }
    }

    public void d(i iVar, int i) {
        StateListDrawable stateListDrawable;
        this.u2 = iVar;
        int i2 = iVar.a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(o2, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = q.a;
            setBackground(stateListDrawable);
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.e);
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.q);
        g0.a.b.b.a.y0(this, iVar.r);
        i iVar2 = this.u2;
        if (!(iVar2.e == null && iVar2.getIcon() == null && this.u2.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.s2.setVisibility(8);
            FrameLayout frameLayout = this.t2;
            if (frameLayout != null) {
                f0.a aVar = (f0.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.t2.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.s2.setVisibility(0);
        FrameLayout frameLayout2 = this.t2;
        if (frameLayout2 != null) {
            f0.a aVar2 = (f0.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.t2.setLayoutParams(aVar2);
        }
    }

    public i getItemData() {
        return this.u2;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.u2;
        if (iVar != null && iVar.isCheckable() && this.u2.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, o2);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.r2 != z) {
            this.r2 = z;
            this.y2.sendAccessibilityEvent(this.s2, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.s2.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.w2) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.v2);
            }
            int i = this.p2;
            drawable.setBounds(0, 0, i, i);
        } else if (this.q2) {
            if (this.x2 == null) {
                Resources resources = getResources();
                int i2 = R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = h.a;
                Drawable drawable2 = resources.getDrawable(i2, theme);
                this.x2 = drawable2;
                if (drawable2 != null) {
                    int i3 = this.p2;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.x2;
        }
        this.s2.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.s2.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.p2 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.v2 = colorStateList;
        this.w2 = colorStateList != null;
        i iVar = this.u2;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.s2.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.q2 = z;
    }

    public void setTextAppearance(int i) {
        this.s2.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.s2.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.s2.setText(charSequence);
    }
}
