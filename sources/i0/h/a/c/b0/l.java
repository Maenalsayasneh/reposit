package i0.h.a.c.b0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimePickerView;

/* compiled from: TimePickerView */
public class l extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView a;

    public l(TimePickerView timePickerView) {
        this.a = timePickerView;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        TimePickerView.b bVar = this.a.v2;
        if (bVar != null) {
            MaterialTimePicker.a aVar = (MaterialTimePicker.a) bVar;
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            boolean z = true;
            materialTimePicker.y2 = 1;
            materialTimePicker.Q0(materialTimePicker.x2);
            i iVar = MaterialTimePicker.this.r2;
            iVar.y.setChecked(iVar.d.Y1 == 12);
            ChipTextInputComboView chipTextInputComboView = iVar.Y1;
            if (iVar.d.Y1 != 10) {
                z = false;
            }
            chipTextInputComboView.setChecked(z);
        }
        return onDoubleTap;
    }
}
