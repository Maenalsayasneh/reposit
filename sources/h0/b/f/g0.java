package h0.b.f;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: ListPopupWindow */
public class g0 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ h0 c;

    public g0(h0 h0Var) {
        this.c = h0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        c0 c0Var;
        if (i != -1 && (c0Var = this.c.y) != null) {
            c0Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
