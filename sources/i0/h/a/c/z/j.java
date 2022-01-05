package i0.h.a.c.z;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate */
public class j implements View.OnTouchListener {
    public final /* synthetic */ AutoCompleteTextView c;
    public final /* synthetic */ h d;

    public j(h hVar, AutoCompleteTextView autoCompleteTextView) {
        this.d = hVar;
        this.c = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.d.i()) {
                this.d.i = false;
            }
            h.g(this.d, this.c);
        }
        return false;
    }
}
