package i0.j.b.t.k;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instabug.bug.view.reporting.b;
import com.instabug.library.Instabug;
import com.instabug.library.view.ViewUtils;

/* compiled from: BaseReportingFragment */
public class f extends BottomSheetBehavior.c {
    public final /* synthetic */ b a;

    public f(b bVar) {
        this.a = bVar;
    }

    public void onSlide(View view, float f) {
        ImageView imageView = this.a.h2;
        if (imageView != null) {
            imageView.setRotation((1.0f - f) * 180.0f);
        }
    }

    public void onStateChanged(View view, int i) {
        b.c = i;
        ScrollView scrollView = this.a.Z1;
        if (scrollView != null) {
            if (i == 4) {
                scrollView.setPadding(0, 0, 0, ViewUtils.convertDpToPx(Instabug.getApplicationContext(), 0.0f));
            } else if (i == 3) {
                scrollView.setPadding(0, 0, 0, ViewUtils.convertDpToPx(Instabug.getApplicationContext(), 130.0f));
            }
            if (i != 1 || !this.a.k2) {
                b bVar = this.a;
                if (!bVar.j2) {
                    if (i == 4) {
                        bVar.b0();
                        return;
                    } else {
                        bVar.f0();
                        return;
                    }
                }
            }
            this.a.b0();
        }
    }
}
