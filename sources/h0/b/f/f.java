package h0.b.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.appcompat.R;
import g0.a.b.b.a;
import h0.i.j.b;

/* compiled from: AppCompatButton */
public class f extends Button implements b {
    private final e mBackgroundTintHelper;
    private final v mTextHelper;

    public f(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            return Math.round(vVar.i.h);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            return Math.round(vVar.i.g);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            return Math.round(vVar.i.f);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v vVar = this.mTextHelper;
        return vVar != null ? vVar.i.i : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.a) {
            v vVar = this.mTextHelper;
            if (vVar != null) {
                return vVar.i.d;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        u0 u0Var = this.mTextHelper.h;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        u0 u0Var = this.mTextHelper.h;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        v vVar = this.mTextHelper;
        if (vVar != null && !b.a) {
            vVar.i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        v vVar = this.mTextHelper;
        if (vVar != null && !b.a && vVar.d()) {
            this.mTextHelper.i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.h(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.i(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.j(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.G0(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.f(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        boolean z = b.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null && !z && !vVar.d()) {
            vVar.i.f(i, f);
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.a(context);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i);
        v vVar = new v(this);
        this.mTextHelper = vVar;
        vVar.e(attributeSet, i);
        vVar.b();
    }
}
