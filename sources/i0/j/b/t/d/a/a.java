package i0.j.b.t.d.a;

import com.instabug.bug.view.actionList.service.ReportCategoriesService;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Objects;

/* compiled from: ReportCategoriesService */
public class a implements Runnable {
    public final /* synthetic */ ReportCategoriesService c;

    public a(ReportCategoriesService reportCategoriesService) {
        this.c = reportCategoriesService;
    }

    public void run() {
        try {
            if (c.a == null) {
                c.a = new c();
            }
            c cVar = c.a;
            ReportCategoriesService reportCategoriesService = this.c;
            Objects.requireNonNull(cVar);
            InstabugSDKLogger.d("ReportCategoriesServiceHelper", "Getting enabled features for this application");
            cVar.b.doRequest(cVar.b.buildRequestWithoutUUID(reportCategoriesService, Request.Endpoint.REPORT_CATEGORIES, Request.RequestMethod.Get)).c(new b(cVar));
        } catch (Exception e) {
            InstabugSDKLogger.e("ReportCategoriesService", "An error has occurred while fetching report categories", e);
        }
    }
}
