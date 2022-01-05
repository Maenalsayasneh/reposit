package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.appcompat.R;
import h0.b.b.a.a;

/* compiled from: AppCompatCheckBox */
public class g extends CheckBox {
    public final i c;
    public final e d;
    public final v q;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.d;
        if (eVar != null) {
            eVar.a();
        }
        v vVar = this.q;
        if (vVar != null) {
            vVar.b();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.c;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.d;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.d;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.c;
        if (iVar != null) {
            return iVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.c;
        if (iVar != null) {
            return iVar.c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.d;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.d;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.c;
        if (iVar == null) {
            return;
        }
        if (iVar.f) {
            iVar.f = false;
            return;
        }
        iVar.f = true;
        iVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.d;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.d;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.c;
        if (iVar != null) {
            iVar.b = colorStateList;
            iVar.d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.c;
        if (iVar != null) {
            iVar.c = mode;
            iVar.e = true;
            iVar.a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.a(context);
        r0.a(this, getContext());
        i iVar = new i(this);
        this.c = iVar;
        iVar.b(attributeSet, i);
        e eVar = new e(this);
        this.d = eVar;
        eVar.d(attributeSet, i);
        v vVar = new v(this);
        this.q = vVar;
        vVar.e(attributeSet, i);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(a.a(getContext(), i));
    }
}
