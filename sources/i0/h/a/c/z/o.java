package i0.h.a.c.z;

import android.view.View;
import android.widget.AdapterView;
import h0.b.f.h0;

/* compiled from: MaterialAutoCompleteTextView */
public class o implements AdapterView.OnItemClickListener {
    public final /* synthetic */ p c;

    public o(p pVar) {
        this.c = pVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object obj;
        int i2;
        View view2 = null;
        if (i < 0) {
            h0 h0Var = this.c.x;
            if (!h0Var.b()) {
                obj = null;
            } else {
                obj = h0Var.y.getSelectedItem();
            }
        } else {
            obj = this.c.getAdapter().getItem(i);
        }
        p.a(this.c, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.c.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                h0 h0Var2 = this.c.x;
                if (h0Var2.b()) {
                    view2 = h0Var2.y.getSelectedView();
                }
                view = view2;
                h0 h0Var3 = this.c.x;
                if (!h0Var3.b()) {
                    i2 = -1;
                } else {
                    i2 = h0Var3.y.getSelectedItemPosition();
                }
                i = i2;
                h0 h0Var4 = this.c.x;
                if (!h0Var4.b()) {
                    j = Long.MIN_VALUE;
                } else {
                    j = h0Var4.y.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(this.c.x.y, view, i, j);
        }
        this.c.x.dismiss();
    }
}
