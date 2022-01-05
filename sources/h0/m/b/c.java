package h0.m.b;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import h0.m.a.a;

/* compiled from: EmojiInputConnection */
public final class c extends InputConnectionWrapper {
    public final TextView a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z = false;
        this.a = textView;
        a a2 = a.a();
        if ((a2.b() == 1 ? true : z) && editorInfo != null && editorInfo.extras != null) {
            a2.g.b(editorInfo);
        }
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (a.c(this, this.a.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (a.c(this, this.a.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}
