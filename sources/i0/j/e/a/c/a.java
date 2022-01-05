package i0.j.e.a.c;

import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.network.InstabugAnalyticsUploaderService;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugAnalyticsUploaderService */
public class a implements Request.Callbacks<Boolean, Throwable> {
    public final /* synthetic */ InstabugAnalyticsUploaderService a;

    public a(InstabugAnalyticsUploaderService instabugAnalyticsUploaderService) {
        this.a = instabugAnalyticsUploaderService;
    }

    public void onFailed(Object obj) {
        Throwable th = (Throwable) obj;
        InstabugSDKLogger.e(InstabugAnalyticsUploaderService.class, th.getMessage(), th);
    }

    public void onSucceeded(Object obj) {
        Boolean bool = (Boolean) obj;
        AnalyticsWrapper.setLastUploadedAt(System.currentTimeMillis(), this.a);
        i0.j.e.a.d.a.a();
        i0.j.e.a.d.a.c();
    }
}
