package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.R;
import g0.a.b.b.a;

/* compiled from: AppCompatAutoCompleteTextView */
public class d extends AutoCompleteTextView {
    public static final int[] c = {16843126};
    public final e d;
    public final v q;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
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

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.G0(this, callback));
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.a(context);
        r0.a(this, getContext());
        w0 q2 = w0.q(getContext(), attributeSet, c, i, 0);
        if (q2.o(0)) {
            setDropDownBackgroundDrawable(q2.g(0));
        }
        q2.b.recycle();
        e eVar = new e(this);
        this.d = eVar;
        eVar.d(attributeSet, i);
        v vVar = new v(this);
        this.q = vVar;
        vVar.e(attributeSet, i);
        vVar.b();
    }
}
