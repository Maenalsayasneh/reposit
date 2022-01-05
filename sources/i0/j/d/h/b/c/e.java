package i0.j.d.h.b.c;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.c;
import com.instabug.featuresrequest.eventbus.FeatureRequestsEventBus;
import com.instabug.featuresrequest.network.service.FeaturesRequestVoteService;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.d.g.a.d;
import i0.j.d.h.b.b;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeaturesListPresenter */
public class e extends BasePresenter<d> implements BaseContract.Presenter {
    public final d c = ((d) this.view.get());
    public b d;

    /* compiled from: FeaturesListPresenter */
    public class a implements Request.Callbacks<JSONObject, Throwable> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ b b;

        public a(boolean z, b bVar) {
            this.a = z;
            this.b = bVar;
        }

        /* renamed from: a */
        public void onFailed(Throwable th) {
            InstabugSDKLogger.e("FeaturesListPresenter", th.getMessage(), th);
            e eVar = e.this;
            d dVar = eVar.c;
            if (dVar != null) {
                dVar.l(false);
                if (eVar.m() == 0) {
                    eVar.c.K();
                    return;
                }
                d dVar2 = eVar.c;
                dVar2.A(((Fragment) dVar2.getViewContext()).getString(R.string.feature_requests_error_state_title));
                eVar.c.E();
            }
        }

        public void onSucceeded(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                onFailed(new JSONException("response json is null"));
                return;
            }
            try {
                c cVar = new c();
                cVar.fromJson(jSONObject.toString());
                List<com.instabug.featuresrequest.d.b> list = cVar.q;
                if (list != null && list.size() > 0) {
                    if (this.a) {
                        b bVar = this.b;
                        bVar.a.b();
                        bVar.a.a = 1;
                    }
                    this.b.a.c(cVar.q);
                    if (cVar.d) {
                        this.b.a.a++;
                    } else {
                        this.b.b = false;
                    }
                }
                e.this.n();
            } catch (JSONException e) {
                onFailed(e);
            }
        }
    }

    public e(d dVar, b bVar, boolean z) {
        super(dVar);
        this.d = bVar;
        p(bVar, bVar.a.a, false, i0.j.d.e.a.e(), z, false);
        FeatureRequestsEventBus.getInstance().subscribe(new g(this));
    }

    public final void k() {
        Context context;
        d dVar = this.c;
        if (dVar != null && (context = ((Fragment) dVar.getViewContext()).getContext()) != null) {
            FeaturesRequestVoteService.a(context, new Intent(context, FeaturesRequestVoteService.class));
        }
    }

    public int m() {
        return this.d.a();
    }

    public void n() {
        d dVar = this.c;
        if (dVar == null || !((Fragment) dVar.getViewContext()).isVisible() || ((Fragment) this.c.getViewContext()).getContext() == null) {
            InstabugSDKLogger.w("FeaturesListPresenter", "View is null or not visible");
            return;
        }
        this.c.l(false);
        if (m() != 0) {
            this.c.F0();
        } else if (NetworkManager.isOnline(((Fragment) this.c.getViewContext()).getContext())) {
            this.c.I();
        } else {
            this.c.K();
        }
    }

    public void onDestroy() {
        b bVar = this.d;
        bVar.a.b();
        bVar.a.a = 1;
    }

    public void p(b bVar, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.c != null) {
            if ((InstabugCore.getFeatureState(Feature.FEATURE_REQUESTS) == Feature.State.ENABLED) && Instabug.getApplicationContext() != null && NetworkManager.isOnline(Instabug.getApplicationContext())) {
                if (i == 1) {
                    this.c.l(true);
                }
                d a2 = d.a();
                Context applicationContext = Instabug.getApplicationContext();
                a aVar = new a(z4, bVar);
                Objects.requireNonNull(a2);
                InstabugSDKLogger.d("FeaturesRequestService", "fetch Features Requests");
                try {
                    Request buildRequest = a2.b.buildRequest(applicationContext, Request.Endpoint.GET_FEATURES_REQUEST, Request.RequestMethod.Get);
                    buildRequest.addParameter("page", Integer.valueOf(i));
                    buildRequest.addParameter("completed", Boolean.valueOf(z));
                    buildRequest.addParameter("sort_top_votes", Boolean.valueOf(z2));
                    buildRequest.addParameter("my_posts", Boolean.valueOf(z3));
                    buildRequest.addHeader(new Request.RequestParameter("Accept", "application/vnd.instabug.v1"));
                    buildRequest.addHeader(new Request.RequestParameter("version", "1"));
                    a2.b.doRequest(buildRequest).v(k0.b.d0.a.c()).s(k0.b.v.a.a.a()).c(new i0.j.d.g.a.b(aVar));
                    return;
                } catch (JSONException e) {
                    aVar.onFailed(e);
                    return;
                }
            }
        }
        if (this.c != null) {
            if (bVar.a() == 0) {
                this.c.K();
            } else {
                this.c.E();
            }
        }
    }

    public void s() {
        this.d.b = true;
        if (this.c != null && Instabug.getApplicationContext() != null) {
            if (NetworkManager.isOnline(Instabug.getApplicationContext())) {
                this.c.b();
                this.c.k();
                p(this.d, 1, false, i0.j.d.e.a.e(), this.c.H0(), true);
            } else if (this.d.a() != 0) {
                this.c.o();
                this.c.m0();
            } else if (NetworkManager.isOnline(Instabug.getApplicationContext())) {
                this.c.I();
            } else {
                this.c.K();
            }
        }
    }
}
