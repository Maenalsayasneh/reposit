package h0.m.b;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import h0.m.a.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiTextWatcher */
public final class g implements TextWatcher {
    public final EditText c;
    public a.d d;
    public int q = Integer.MAX_VALUE;
    public int x = 0;

    /* compiled from: EmojiTextWatcher */
    public static class a extends a.d {
        public final Reference<EditText> a;

        public a(EditText editText) {
            this.a = new WeakReference(editText);
        }

        public void a() {
            EditText editText = this.a.get();
            if (editText != null && editText.isAttachedToWindow()) {
                Editable editableText = editText.getEditableText();
                int selectionStart = Selection.getSelectionStart(editableText);
                int selectionEnd = Selection.getSelectionEnd(editableText);
                h0.m.a.a.a().f(editableText);
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(editableText, selectionStart);
                } else if (selectionEnd >= 0) {
                    Selection.setSelection(editableText, selectionEnd);
                }
            }
        }
    }

    public g(EditText editText) {
        this.c = editText;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.c.isInEditMode() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int b = h0.m.a.a.a().b();
            if (b != 0) {
                if (b == 1) {
                    h0.m.a.a.a().g((Spannable) charSequence, i, i + i3, this.q, this.x);
                    return;
                } else if (b != 3) {
                    return;
                }
            }
            h0.m.a.a a2 = h0.m.a.a.a();
            if (this.d == null) {
                this.d = new a(this.c);
            }
            a2.h(this.d);
        }
    }
}
