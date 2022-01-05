package i0.h.a.c.g;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h0.i.i.g0.d;

/* compiled from: BottomSheetBehavior */
public class c implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }

    public boolean perform(View view, d.a aVar) {
        this.b.N(this.a);
        return true;
    }
}
