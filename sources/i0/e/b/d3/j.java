package i0.e.b.d3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: ViewUtil.kt */
public final class j implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;

    public j(View view, View view2) {
        this.c = view;
        this.d = view2;
    }

    public final void onGlobalLayout() {
        BottomSheetBehavior.H(this.d).N(3);
    }
}
