package i0.h.a.c.z;

import android.widget.AutoCompleteTextView;

/* compiled from: DropdownMenuEndIconDelegate */
public class k implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ h a;

    public k(h hVar) {
        this.a = hVar;
    }

    public void onDismiss() {
        h hVar = this.a;
        hVar.i = true;
        hVar.k = System.currentTimeMillis();
        h.f(this.a, false);
    }
}
