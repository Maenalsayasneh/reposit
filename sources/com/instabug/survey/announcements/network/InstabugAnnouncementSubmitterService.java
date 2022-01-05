package com.instabug.survey.announcements.network;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.State;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.e.c.c;
import com.instabug.survey.f.c.a;
import com.instabug.survey.f.c.g;
import i0.j.f.b.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class InstabugAnnouncementSubmitterService extends InstabugNetworkBasedBackgroundService {
    public static void a(Context context, Intent intent) {
        InstabugBackgroundService.enqueueInstabugWork(context, InstabugAnnouncementSubmitterService.class, 2583, intent);
    }

    public void runBackgroundTask() throws Exception {
        String str;
        ArrayList<a> arrayList;
        InstabugSDKLogger.d(this, "runBackgroundTask started");
        InstabugSDKLogger.d(this, "submitAnnouncements started");
        List<com.instabug.survey.e.c.a> readyToBeSend = AnnouncementCacheManager.getReadyToBeSend();
        StringBuilder P0 = i0.d.a.a.a.P0("ready to send Announcements size: ");
        P0.append(readyToBeSend.size());
        InstabugSDKLogger.d(this, P0.toString());
        for (com.instabug.survey.e.c.a next : readyToBeSend) {
            if (b.a == null) {
                b.a = new b();
            }
            b bVar = b.a;
            i0.j.f.b.b.a aVar = new i0.j.f.b.b.a(next);
            Objects.requireNonNull(bVar);
            InstabugSDKLogger.v(bVar, "submitting announcement");
            Request buildRequest = bVar.b.buildRequest((Context) this, Request.Endpoint.SUBMIT_ANNOUNCEMENT, Request.RequestMethod.Post);
            buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":announcement_id", String.valueOf(next.c)));
            String appVersion = InstabugDeviceProperties.getAppVersion(this);
            ArrayList<c> arrayList2 = next.x;
            JSONArray jSONArray = new JSONArray();
            Iterator<c> it = arrayList2.iterator();
            while (it.hasNext()) {
                c next2 = it.next();
                String str2 = next2.q;
                if (str2 != null && !str2.equals("")) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, (Object) next2.q);
                    jSONObject.put(InstabugDbContract.AnnouncementAssetsEntry.COLUMN_ANNOUNCE_ID, next2.x);
                    jSONArray.put((Object) jSONObject);
                }
            }
            if (jSONArray.length() > 0) {
                buildRequest.addParameter("responses", jSONArray);
            }
            buildRequest.addParameter(InstabugDbContract.AnnouncementEntry.COLUMN_ID, Long.valueOf(next.c));
            buildRequest.addParameter("name", InstabugCore.getIdentifiedUsername());
            buildRequest.addParameter("email", Instabug.getUserEmail());
            buildRequest.addParameter("responded_at", Long.valueOf(next.b()));
            buildRequest.addParameter("app_version", appVersion);
            g gVar = next.a2.q;
            if (!(gVar == null || (arrayList = gVar.x) == null)) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator<a> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    a next3 = it2.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event_type", (Object) next3.c);
                    jSONObject2.put("timestamp", next3.d);
                    jSONObject2.put("index", next3.q);
                    jSONArray2.put((Object) jSONObject2);
                }
                buildRequest.addParameter("events", jSONArray2);
            }
            com.instabug.survey.f.c.b bVar2 = next.Z1;
            if (!(bVar2 == null || (str = bVar2.q) == null)) {
                buildRequest.addParameter(State.KEY_LOCALE, str);
            }
            buildRequest.addParameter(State.KEY_PUSH_TOKEN, InstabugCore.getPushNotificationToken());
            bVar.b.doRequest(buildRequest).c(new i0.j.f.b.b.c(aVar));
        }
    }
}
