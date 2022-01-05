package h0.b.f;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g0.a.b.b.a;

/* compiled from: AppCompatCheckedTextView */
public class h extends CheckedTextView {
    public static final int[] c = {16843016};
    public final v d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        t0.a(context);
        r0.a(this, getContext());
        v vVar = new v(this);
        this.d = vVar;
        vVar.e(attributeSet, 16843720);
        vVar.b();
        w0 q = w0.q(getContext(), attributeSet, c, 16843720, 0);
        setCheckMarkDrawable(q.g(0));
        q.b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        v vVar = this.d;
        if (vVar != null) {
            vVar.b();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.j0(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(h0.b.b.a.a.a(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.G0(this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v vVar = this.d;
        if (vVar != null) {
            vVar.f(context, i);
        }
    }
}
