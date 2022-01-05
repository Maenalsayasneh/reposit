package i0.j.d.h.d;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/* compiled from: InstaToast */
public class f implements SwipeDismissBehavior.b {
    public final /* synthetic */ d a;

    public f(d dVar) {
        this.a = dVar;
    }

    public void a(View view) {
        this.a.b(0);
    }

    @SuppressFBWarnings({"SF_SWITCH_NO_DEFAULT"})
    public void b(int i) {
        if (i == 0) {
            j.a().g(this.a.g);
        } else if (i == 1 || i == 2) {
            j.a().b(this.a.g);
        }
    }
}
