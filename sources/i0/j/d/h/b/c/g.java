package i0.j.d.h.b.c;

import android.os.Handler;
import com.instabug.featuresrequest.d.b;
import k0.b.y.d;

/* compiled from: FeaturesListPresenter */
public class g implements d<b> {
    public final /* synthetic */ e c;

    public g(e eVar) {
        this.c = eVar;
    }

    public void b(Object obj) throws Exception {
        b bVar = (b) obj;
        if (this.c.d.a.d() != null && !this.c.d.a.d().isEmpty()) {
            new Handler().postDelayed(new f(this), 1000);
        }
    }
}
