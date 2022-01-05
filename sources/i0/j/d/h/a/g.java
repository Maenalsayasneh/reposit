package i0.j.d.h.a;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.ui.BasePresenter;
import i0.j.d.d.a.c;
import i0.j.d.e.a;
import i0.j.d.e.b;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: AddCommentPresenter */
public class g extends BasePresenter<a> implements Object {
    public c c;
    public final a d = ((a) this.view.get());

    public g(a aVar) {
        super(aVar);
        if (aVar.getViewContext() != null && ((Fragment) aVar.getViewContext()).getContext() != null) {
            Context context = ((Fragment) aVar.getViewContext()).getContext();
            c cVar = c.a;
            if (cVar == null) {
                cVar = new c(context);
                c.a = cVar;
            }
            this.c = cVar;
        }
    }

    public void j(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        a aVar = this.d;
        if (aVar != null) {
            aVar.n0();
            this.d.m();
        }
    }

    public boolean m() {
        Objects.requireNonNull(a.d());
        return b.a().c;
    }

    public void onError(Throwable th) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.n0();
            this.d.y0();
        }
    }
}
