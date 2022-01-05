package i0.j.c.h;

import android.view.View;
import i0.j.c.h.l;

/* compiled from: NotificationBarInvoker */
public class i implements View.OnClickListener {
    public final /* synthetic */ a c;

    public i(a aVar) {
        this.c = aVar;
    }

    public void onClick(View view) {
        a aVar = this.c;
        aVar.e = null;
        aVar.d(true);
        ((l.b) this.c.f).a();
    }
}
