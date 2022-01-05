package i0.j.d.h.c;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.d.f;
import com.instabug.featuresrequest.d.g;
import com.instabug.featuresrequest.network.service.FeaturesRequestVoteService;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.d.d.a.a;
import i0.j.d.d.a.d;
import java.util.ArrayList;
import org.json.JSONException;

/* compiled from: FeaturesRequestsDetailsPresenter */
public class c extends BasePresenter<b> implements d<g>, d {
    public final b c = ((b) this.view.get());
    public i0.j.d.d.a.c d;

    public c(b bVar) {
        super(bVar);
        if (bVar.getViewContext() != null && ((Fragment) bVar.getViewContext()).getContext() != null) {
            Context context = ((Fragment) bVar.getViewContext()).getContext();
            i0.j.d.d.a.c cVar = i0.j.d.d.a.c.a;
            if (cVar == null) {
                cVar = new i0.j.d.d.a.c(context);
                i0.j.d.d.a.c.a = cVar;
            }
            this.d = cVar;
        }
    }

    public final void b() {
        Context context;
        b bVar = this.c;
        if (bVar != null && (context = ((Fragment) bVar.getViewContext()).getContext()) != null) {
            FeaturesRequestVoteService.a(context, new Intent(context, FeaturesRequestVoteService.class));
        }
    }

    public void j(Object obj) {
        g gVar = (g) obj;
        if (this.c != null) {
            ArrayList<f> arrayList = gVar.d;
            if (arrayList == null || arrayList.size() <= 0) {
                this.c.d();
                return;
            }
            this.c.X(gVar);
            this.c.z();
        }
    }

    public void k(long j) {
        i0.j.d.d.a.c cVar = this.d;
        if (cVar != null) {
            try {
                i0.j.d.g.a.d.a().b(cVar.b, j, new a(j, this));
            } catch (JSONException e) {
                InstabugSDKLogger.e(cVar, e.getMessage(), e);
            }
        }
    }

    public void onError(Throwable th) {
        th.printStackTrace();
    }
}
