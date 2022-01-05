package i0.j.d.h.d;

import android.view.View;
import android.widget.TextView;
import com.instabug.featuresrequest.ui.custom.SnackbarLayout;
import com.instabug.library.settings.SettingsManager;
import h0.i.i.a0;
import h0.i.i.q;
import h0.i.i.y;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: InstaToast */
public class c extends a0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public c(d dVar, int i) {
        this.b = dVar;
        this.a = i;
    }

    public void b(View view) {
        this.b.d(this.a);
    }

    public void c(View view) {
        SnackbarLayout snackbarLayout = this.b.e;
        TextView textView = snackbarLayout.c;
        AtomicInteger atomicInteger = q.a;
        textView.setAlpha(1.0f);
        y b2 = q.b(snackbarLayout.c);
        b2.a(0.0f);
        long j = (long) SettingsManager.MAX_ASR_DURATION_IN_SECONDS;
        b2.c(j);
        long j2 = (long) 0;
        b2.g(j2);
        b2.i();
        if (snackbarLayout.d.getVisibility() == 0) {
            snackbarLayout.d.setAlpha(1.0f);
            y b3 = q.b(snackbarLayout.d);
            b3.a(0.0f);
            b3.c(j);
            b3.g(j2);
            b3.i();
        }
    }
}
