package i0.j.f.n;

import android.content.Context;
import com.instabug.library.model.State;
import com.instabug.library.network.Request;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.TimeUtils;
import com.instabug.survey.models.Survey;
import i0.j.f.h;
import i0.j.f.p.i;
import i0.j.f.r.a.f;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SurveysFetcher */
public class b {
    public c a;

    /* compiled from: SurveysFetcher */
    public class a implements Request.Callbacks<JSONObject, Throwable> {
        public a() {
        }

        public void onFailed(Object obj) {
            ((h) b.this.a).c((Throwable) obj);
        }

        public void onSucceeded(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            try {
                long currentTimeMillis = TimeUtils.currentTimeMillis();
                int i = i0.j.f.o.c.b;
                if (i0.j.f.o.b.b() != null) {
                    i0.j.f.o.b b = i0.j.f.o.b.b();
                    b.c.putLong("survey_last_fetch_time", currentTimeMillis);
                    b.c.apply();
                }
                if (jSONObject != null) {
                    List<Survey> fromJson = Survey.fromJson(jSONObject);
                    fromJson.addAll(Survey.getPausedSurveysFromJson(jSONObject));
                    ((h) b.this.a).d(fromJson);
                    return;
                }
                ((h) b.this.a).c(new NullPointerException("Json response is null"));
            } catch (JSONException e) {
                ((h) b.this.a).c(e);
            }
        }
    }

    /* renamed from: i0.j.f.n.b$b  reason: collision with other inner class name */
    /* compiled from: SurveysFetcher */
    public class C0190b implements Request.Callbacks<JSONObject, Throwable> {
        public final /* synthetic */ Context a;

        public C0190b(Context context) {
            this.a = context;
        }

        public void onFailed(Object obj) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                InstabugSDKLogger.e("SurveysFetcher", "first_seen throwable is null");
            } else {
                InstabugSDKLogger.e("SurveysFetcher", th.getMessage() != null ? th.getMessage() : "first_seen error msg is null", th);
            }
        }

        public void onSucceeded(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                InstabugSDKLogger.e("SurveysFetcher", "first_seen response is null");
            } else if (jSONObject.has("first_seen")) {
                try {
                    long j = jSONObject.getLong("first_seen");
                    if (j != -1) {
                        int i = i0.j.f.o.c.b;
                        if (i0.j.f.o.b.b() != null) {
                            i0.j.f.o.b b = i0.j.f.o.b.b();
                            b.c.putLong("instabug_app_version_first_seen", j);
                            b.c.apply();
                        }
                        i0.j.f.o.c.b(DeviceStateProvider.getAppVersion(this.a));
                    }
                } catch (JSONException unused) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Something went wrong while parsing first_seen responsebody: ");
                    P0.append(jSONObject.toString());
                    InstabugSDKLogger.e("SurveysFetcher", P0.toString());
                }
            } else {
                StringBuilder P02 = i0.d.a.a.a.P0("first_seen response doesn't has a key first_seenbody: ");
                P02.append(jSONObject.toString());
                InstabugSDKLogger.e("SurveysFetcher", P02.toString());
            }
        }
    }

    /* compiled from: SurveysFetcher */
    public interface c {
    }

    public b(c cVar) {
        this.a = cVar;
    }

    public void a(Context context) throws JSONException {
        boolean z;
        if (i.c()) {
            if (i0.j.f.o.c.d() == null || !DeviceStateProvider.getAppVersion(context).equals(i0.j.f.o.c.d())) {
                i0.j.f.o.c.b((String) null);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f a2 = f.a();
                C0190b bVar = new C0190b(context);
                Objects.requireNonNull(a2);
                InstabugSDKLogger.v(a2, "fetch first_seen");
                Request buildRequest = a2.b.buildRequest(context, Request.Endpoint.FIRST_SEEN, Request.RequestMethod.Get);
                buildRequest.addHeader(new Request.RequestParameter(Header.APP_VERSION, DeviceStateProvider.getAppVersion(context)));
                InstabugSDKLogger.addVerboseLog("SurveysService", "Request: " + buildRequest);
                a2.b.doRequest(buildRequest).v(k0.b.d0.a.c()).c(new i0.j.f.r.a.c(bVar));
            }
        }
    }

    public void b(Context context, String str) throws JSONException {
        long j;
        if (i.c()) {
            long currentTimeMillis = TimeUtils.currentTimeMillis();
            int i = i0.j.f.o.c.b;
            if (i0.j.f.o.b.b() == null) {
                j = -1;
            } else {
                j = i0.j.f.o.b.b().b.getLong("survey_last_fetch_time", 0);
            }
            if (currentTimeMillis - j > 10000) {
                f a2 = f.a();
                a aVar = new a();
                Objects.requireNonNull(a2);
                InstabugSDKLogger.v(a2, "fetch surveys");
                Request buildRequest = a2.b.buildRequest(context, Request.Endpoint.GET_SURVEYS, Request.RequestMethod.Get);
                buildRequest.addParameter(State.KEY_LOCALE, str);
                buildRequest.addHeader(new Request.RequestParameter("Accept", "application/vnd.instabug.v2"));
                buildRequest.addHeader(new Request.RequestParameter("version", "2"));
                InstabugSDKLogger.addVerboseLog("SurveysService", "Request: " + buildRequest);
                a2.b.doRequest(buildRequest).v(k0.b.d0.a.c()).c(new i0.j.f.r.a.b(aVar));
            }
        }
    }
}
