package i0.j.b.t.d.a;

import android.annotation.SuppressLint;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import i0.j.b.s.c;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: ReportCategoriesServiceHelper */
public class b extends k0.b.b0.b<RequestResponse> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void b(Object obj) {
        RequestResponse requestResponse = (RequestResponse) obj;
        StringBuilder P0 = a.P0("getReportCategories request onNext, Response code: ");
        P0.append(requestResponse.getResponseCode());
        P0.append(", Response body: ");
        P0.append(requestResponse.getResponseBody());
        InstabugSDKLogger.d("ReportCategoriesServiceHelper", P0.toString());
        long currentTimeMillis = System.currentTimeMillis();
        Objects.requireNonNull(i0.j.b.s.a.h());
        c a = c.a();
        a.c.putLong("report_categories_fetched_time", currentTimeMillis);
        a.c.apply();
        String str = (String) requestResponse.getResponseBody();
        try {
            if (new JSONArray(str).length() == 0) {
                c.a(this.d, (String) null);
            } else {
                c.a(this.d, str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void c() {
        InstabugSDKLogger.d("ReportCategoriesServiceHelper", "getReportCategories request started");
    }

    public void onComplete() {
        InstabugSDKLogger.d("ReportCategoriesServiceHelper", "getReportCategories request completed");
    }

    public void onError(Throwable th) {
        InstabugSDKLogger.e("ReportCategoriesServiceHelper", "getReportCategories request got error", th);
    }
}
