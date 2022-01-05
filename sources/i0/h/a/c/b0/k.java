package i0.h.a.c.b0;

import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.timepicker.TimePickerView;

/* compiled from: TimePickerView */
public class k implements MaterialButtonToggleGroup.e {
    public final /* synthetic */ TimePickerView a;

    public k(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        int i2 = i == R.id.material_clock_period_pm_button ? 1 : 0;
        TimePickerView.c cVar = this.a.t2;
        if (cVar != null && z) {
            ((f) cVar).y.g(i2);
        }
    }
}
