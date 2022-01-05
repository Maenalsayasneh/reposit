package i0.e.b.d3;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

/* compiled from: ViewExtensions.kt */
public final class n implements TextWatcher {
    public final /* synthetic */ EditText c;
    public final /* synthetic */ String d;

    public n(EditText editText, String str) {
        this.c = editText;
        this.d = str;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.c.length() >= this.d.length()) {
            Editable text = this.c.getText();
            i.d(text, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            if (StringsKt__IndentKt.H(text, this.d, false, 2)) {
                return;
            }
        }
        this.c.setText(this.d);
        EditText editText = this.c;
        editText.setSelection(editText.length());
    }
}
