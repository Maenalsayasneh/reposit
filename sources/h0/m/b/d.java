package h0.m.b;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import h0.m.a.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: EmojiInputFilter */
public final class d implements InputFilter {
    public final TextView c;
    public a.d d;

    /* compiled from: EmojiInputFilter */
    public static class a extends a.d {
        public final Reference<TextView> a;

        public a(TextView textView) {
            this.a = new WeakReference(textView);
        }

        public void a() {
            TextView textView = this.a.get();
            if (textView != null && textView.isAttachedToWindow()) {
                CharSequence f = h0.m.a.a.a().f(textView.getText());
                int selectionStart = Selection.getSelectionStart(f);
                int selectionEnd = Selection.getSelectionEnd(f);
                textView.setText(f);
                if (f instanceof Spannable) {
                    Spannable spannable = (Spannable) f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.c = textView;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.c.isInEditMode()) {
            return charSequence;
        }
        int b = h0.m.a.a.a().b();
        if (b != 0) {
            boolean z = true;
            if (b == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.c.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (!(i == 0 && i2 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                CharSequence charSequence2 = charSequence;
                return h0.m.a.a.a().g(charSequence2, 0, charSequence2.length(), Integer.MAX_VALUE, 0);
            } else if (b != 3) {
                return charSequence;
            }
        }
        h0.m.a.a a2 = h0.m.a.a.a();
        if (this.d == null) {
            this.d = new a(this.c);
        }
        a2.h(this.d);
        return charSequence;
    }
}
