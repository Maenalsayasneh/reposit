package i0.h.a.c.l;

import android.view.View;
import com.google.android.material.datepicker.MaterialDatePicker;

/* compiled from: MaterialDatePicker */
public class k implements View.OnClickListener {
    public final /* synthetic */ MaterialDatePicker c;

    public k(MaterialDatePicker materialDatePicker) {
        this.c = materialDatePicker;
    }

    public void onClick(View view) {
        MaterialDatePicker materialDatePicker = this.c;
        materialDatePicker.A2.setEnabled(materialDatePicker.p2.d0());
        this.c.y2.toggle();
        MaterialDatePicker materialDatePicker2 = this.c;
        materialDatePicker2.V0(materialDatePicker2.y2);
        this.c.T0();
    }
}
