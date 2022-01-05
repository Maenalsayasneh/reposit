package com.instabug.library.analytics.network;

import android.content.Context;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.a.c.b;
import i0.j.e.a.c.c;
import i0.j.e.a.d.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class InstabugAnalyticsUploaderService extends InstabugNetworkBasedBackgroundService {
    public static final /* synthetic */ int c = 0;

    public void runBackgroundTask() throws Exception {
        if (System.currentTimeMillis() - AnalyticsWrapper.getLastUploadedAt(this) > TimeUnit.DAYS.toMillis(1)) {
            ArrayList<Api> d = a.d();
            if (d.size() > 0) {
                if (c.a == null) {
                    c.a = new c();
                }
                c cVar = c.a;
                i0.j.e.a.c.a aVar = new i0.j.e.a.c.a(this);
                Objects.requireNonNull(cVar);
                InstabugSDKLogger.d(cVar, "starting upload SDK analytics");
                Request buildRequest = cVar.b.buildRequest((Context) this, Request.Endpoint.ANALYTICS, Request.RequestMethod.Post);
                buildRequest.addParameter("sdk_version", "10.4.3");
                buildRequest.addParameter("platform", "android");
                buildRequest.addParameter("method_logs", Api.toJson(d));
                cVar.b.doRequest(buildRequest).c(new b(aVar));
            }
        }
    }
}
