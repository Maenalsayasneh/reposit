package com.instabug.featuresrequest.network.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.d.g.a.c;
import i0.j.d.g.a.d;
import i0.j.f.p.h;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class FeaturesRequestVoteService extends InstabugNetworkBasedBackgroundService {

    public class a implements Request.Callbacks<JSONObject, Throwable> {
        public final /* synthetic */ com.instabug.featuresrequest.d.b a;

        public a(com.instabug.featuresrequest.d.b bVar) {
            this.a = bVar;
        }

        public void onFailed(Object obj) {
            Throwable th = (Throwable) obj;
            if (th.getMessage() != null) {
                InstabugSDKLogger.e("FeaturesRequestVoteService", th.getMessage(), th);
            }
        }

        public void onSucceeded(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            String str = this.a.c + "";
            synchronized (i0.j.d.c.a.class) {
                SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
                String[] strArr = {str};
                openDatabase.beginTransaction();
                try {
                    openDatabase.delete(InstabugDbContract.FeatureRequestEntry.TABLE_NAME, "_id=? ", strArr);
                    openDatabase.setTransactionSuccessful();
                } finally {
                    openDatabase.endTransaction();
                    openDatabase.close();
                }
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        static {
            /*
                com.instabug.featuresrequest.d.b.C0102b.values()
                r0 = 4
                int[] r0 = new int[r0]
                a = r0
                com.instabug.featuresrequest.d.b$b r1 = com.instabug.featuresrequest.d.b.C0102b.USER_VOTED_UP     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.featuresrequest.d.b$b r1 = com.instabug.featuresrequest.d.b.C0102b.USER_UN_VOTED     // Catch:{ NoSuchFieldError -> 0x001c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.network.service.FeaturesRequestVoteService.b.<clinit>():void");
        }
    }

    public static void a(Context context, Intent intent) {
        InstabugBackgroundService.enqueueInstabugWork(context, FeaturesRequestVoteService.class, 2584, intent);
    }

    public final void b(com.instabug.featuresrequest.d.b bVar, Request.RequestMethod requestMethod) throws JSONException {
        d a2 = d.a();
        long j = bVar.c;
        a aVar = new a(bVar);
        Objects.requireNonNull(a2);
        InstabugSDKLogger.d("FeaturesRequestService", "voting request for feature with id : " + j);
        Request buildRequest = a2.b.buildRequest((Context) this, Request.Endpoint.VOTE_FEATURE, requestMethod);
        buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":feature_req_id", String.valueOf(j)));
        try {
            a2.b.doRequest(buildRequest).v(k0.b.d0.a.c()).c(new c(aVar));
        } catch (Exception e) {
            h.c = null;
            h.d = null;
            RxJavaPlugins.onError(e);
        }
    }

    public void runBackgroundTask() throws Exception {
        InstabugSDKLogger.d("FeaturesRequestVoteService", "runBackgroundTask started");
        InstabugSDKLogger.d("FeaturesRequestVoteService", "submitVotes started");
        Iterator it = ((ArrayList) i0.j.d.c.a.b()).iterator();
        while (it.hasNext()) {
            com.instabug.featuresrequest.d.b bVar = (com.instabug.featuresrequest.d.b) it.next();
            int i = b.a[bVar.g2.ordinal()];
            if (i == 1) {
                b(bVar, Request.RequestMethod.Post);
            } else if (i == 2) {
                b(bVar, Request.RequestMethod.Delete);
            }
        }
    }
}
