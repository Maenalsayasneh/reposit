package i0.h.a.c.b0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

/* compiled from: TimePickerView */
public class m implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector c;

    public m(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.c = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.c.onTouchEvent(motionEvent);
        }
        return false;
    }
}
