package i0.h.a.c.b0;

import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* compiled from: TimePickerTextInputPresenter */
public class j implements MaterialButtonToggleGroup.e {
    public final /* synthetic */ i a;

    public j(i iVar) {
        this.a = iVar;
    }

    public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        this.a.d.g(i == R.id.material_clock_period_pm_button ? 1 : 0);
    }
}
