package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton */
public class y extends ToggleButton {
    public final e c;
    public final v d;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        r0.a(this, getContext());
        e eVar = new e(this);
        this.c = eVar;
        eVar.d(attributeSet, 16842827);
        v vVar = new v(this);
        this.d = vVar;
        vVar.e(attributeSet, 16842827);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.c;
        if (eVar != null) {
            eVar.a();
        }
        v vVar = this.d;
        if (vVar != null) {
            vVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.c;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.c;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
