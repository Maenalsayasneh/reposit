package i0.i;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* compiled from: CountryCodeAdapter */
public class f implements TextView.OnEditorActionListener {
    public final /* synthetic */ h c;

    public f(h hVar) {
        this.c = hVar;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        ((InputMethodManager) this.c.h.getSystemService("input_method")).hideSoftInputFromWindow(this.c.f.getWindowToken(), 0);
        return true;
    }
}
