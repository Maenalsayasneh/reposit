package i0.h.a.c.b0;

import android.view.View;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockFaceView;
import h0.i.i.a;
import h0.i.i.g0.b;

/* compiled from: ClockFaceView */
public class c extends a {
    public final /* synthetic */ ClockFaceView a;

    public c(ClockFaceView clockFaceView) {
        this.a = clockFaceView;
    }

    public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            bVar.b.setTraversalAfter(this.a.t2.get(intValue - 1));
        }
        bVar.j(b.c.a(0, 1, intValue, 1, false, view.isSelected()));
    }
}
