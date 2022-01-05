package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import g0.a.b.b.a;

/* compiled from: AppCompatMultiAutoCompleteTextView */
public class m extends MultiAutoCompleteTextView {
    public static final int[] c = {16843126};
    public final e d;
    public final v q;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = androidx.appcompat.R.attr.autoCompleteTextViewStyle
            h0.b.f.t0.a(r4)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            h0.b.f.r0.a(r3, r4)
            android.content.Context r4 = r3.getContext()
            int[] r1 = c
            r2 = 0
            h0.b.f.w0 r4 = h0.b.f.w0.q(r4, r5, r1, r0, r2)
            boolean r1 = r4.o(r2)
            if (r1 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r1 = r4.g(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L_0x0027:
            android.content.res.TypedArray r4 = r4.b
            r4.recycle()
            h0.b.f.e r4 = new h0.b.f.e
            r4.<init>(r3)
            r3.d = r4
            r4.d(r5, r0)
            h0.b.f.v r4 = new h0.b.f.v
            r4.<init>(r3)
            r3.q = r4
            r4.e(r5, r0)
            r4.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.m.<init>(android.content.Context, android.util.AttributeSet):void");
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.j0(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(h0.b.b.a.a.a(getContext(), i));
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

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v vVar = this.q;
        if (vVar != null) {
            vVar.f(context, i);
        }
    }
}
