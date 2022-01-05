package i0.j.c.h;

import android.app.Activity;
import android.view.View;
import com.instabug.chat.e.d;
import com.instabug.library.PresentationManager;
import i0.j.c.h.l;
import i0.j.c.l.a;
import java.util.List;

/* compiled from: NotificationBarInvoker */
public class h implements View.OnClickListener {
    public final /* synthetic */ a c;

    public h(a aVar) {
        this.c = aVar;
    }

    public void onClick(View view) {
        a aVar = this.c;
        aVar.e = null;
        aVar.d(false);
        l.b bVar = (l.b) this.c.f;
        l lVar = l.this;
        Activity activity = bVar.a;
        if (lVar.b != 1) {
            List<d> list = lVar.e;
            activity.startActivity(a.f(activity, list.get(list.size() - 1).d));
        } else {
            activity.startActivity(a.e(activity));
        }
        PresentationManager.getInstance().setNotificationShowing(false);
    }
}
