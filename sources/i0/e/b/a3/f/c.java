package i0.e.b.a3.f;

import android.view.View;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i0.h.a.c.g.d;
import m0.n.b.i;

/* compiled from: BaseBottomSheetFragment.kt */
public final class c extends BottomSheetBehavior.c {
    public final /* synthetic */ BaseBottomSheetFragment a;
    public final /* synthetic */ d b;

    public c(BaseBottomSheetFragment baseBottomSheetFragment, d dVar) {
        this.a = baseBottomSheetFragment;
        this.b = dVar;
    }

    public void onSlide(View view, float f) {
        i.e(view, "bottomSheet");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if ((r4.getResources().getConfiguration().orientation == 2) == true) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStateChanged(android.view.View r4, int r5) {
        /*
            r3 = this;
            java.lang.String r0 = "bottomSheet"
            m0.n.b.i.e(r4, r0)
            com.clubhouse.android.core.ui.BaseBottomSheetFragment r4 = r3.a
            android.content.Context r4 = r4.getContext()
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L_0x0010
            goto L_0x0028
        L_0x0010:
            java.lang.String r2 = "<this>"
            m0.n.b.i.e(r4, r2)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.orientation
            r2 = 2
            if (r4 != r2) goto L_0x0024
            r4 = r0
            goto L_0x0025
        L_0x0024:
            r4 = r1
        L_0x0025:
            if (r4 != r0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = r1
        L_0x0029:
            if (r0 == 0) goto L_0x0033
            r4 = 4
            if (r5 != r4) goto L_0x0033
            i0.h.a.c.g.d r4 = r3.b
            r4.dismiss()
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.a3.f.c.onStateChanged(android.view.View, int):void");
    }
}
