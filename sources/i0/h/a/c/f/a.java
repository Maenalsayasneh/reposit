package i0.h.a.c.f;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import h0.b.e.i.i;
import h0.b.e.i.n;
import h0.i.i.g0.b;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BottomNavigationItemView */
public class a extends FrameLayout implements n.a {
    public static final int[] c = {16842912};
    public ColorStateList Y1;
    public Drawable Z1;
    public Drawable a2;
    public BadgeDrawable b2;
    public int d;
    public boolean q;
    public int x;
    public i y;

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public void d(i iVar, int i) {
        CharSequence charSequence;
        this.y = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.e);
        setId(iVar.a);
        if (!TextUtils.isEmpty(iVar.q)) {
            setContentDescription(iVar.q);
        }
        if (!TextUtils.isEmpty(iVar.r)) {
            charSequence = iVar.r;
        } else {
            charSequence = iVar.e;
        }
        g0.a.b.b.a.y0(this, charSequence);
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    public BadgeDrawable getBadge() {
        return this.b2;
    }

    public i getItemData() {
        return this.y;
    }

    public int getItemPosition() {
        return this.x;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.y;
        if (iVar != null && iVar.isCheckable() && this.y.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, c);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.b2;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            i iVar = this.y;
            CharSequence charSequence = iVar.e;
            if (!TextUtils.isEmpty(iVar.q)) {
                charSequence = this.y.q;
            }
            accessibilityNodeInfo.setContentDescription(charSequence + ", " + this.b2.f());
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b.a.a.i);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        this.b2 = badgeDrawable;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        throw null;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        throw null;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.Z1) {
            this.Z1 = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                Drawable mutate = drawable.mutate();
                this.a2 = mutate;
                ColorStateList colorStateList = this.Y1;
                if (colorStateList != null) {
                    mutate.setTintList(colorStateList);
                }
            }
            throw null;
        }
    }

    public void setIconSize(int i) {
        throw null;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.Y1 = colorStateList;
        if (this.y != null && (drawable = this.a2) != null) {
            drawable.setTintList(colorStateList);
            this.a2.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : h0.i.b.a.getDrawable(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.x = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.d != i) {
            this.d = i;
            i iVar = this.y;
            if (iVar != null) {
                setChecked(iVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.q != z) {
            this.q = z;
            i iVar = this.y;
            if (iVar != null) {
                setChecked(iVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        throw null;
    }

    public void setTextAppearanceInactive(int i) {
        throw null;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            throw null;
        }
    }

    public void setTitle(CharSequence charSequence) {
        throw null;
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        AtomicInteger atomicInteger = q.a;
        setBackground(drawable);
    }
}
