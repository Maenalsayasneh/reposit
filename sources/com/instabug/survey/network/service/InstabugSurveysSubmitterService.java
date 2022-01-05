package com.instabug.survey.network.service;

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
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;
import com.instabug.survey.models.b;
import i0.d.a.a.a;
import i0.j.f.r.a.d;
import i0.j.f.r.a.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class InstabugSurveysSubmitterService extends InstabugNetworkBasedBackgroundService {
    public static void a(Context context, Intent intent) {
        InstabugBackgroundService.enqueueInstabugWork(context, InstabugSurveysSubmitterService.class, 2581, intent);
    }

    public void runBackgroundTask() throws Exception {
        InstabugSDKLogger.d(this, "runBackgroundTask started");
        InstabugSDKLogger.d(this, "submitSurveys started");
        List<Survey> readyToSendSurveys = SurveysCacheManager.getReadyToSendSurveys();
        StringBuilder P0 = a.P0("ready to send surveys size: ");
        P0.append(readyToSendSurveys.size());
        InstabugSDKLogger.d(this, P0.toString());
        for (Survey next : readyToSendSurveys) {
            f a = f.a();
            i0.j.f.r.a.a aVar = new i0.j.f.r.a.a(next);
            Objects.requireNonNull(a);
            InstabugSDKLogger.v(a, "submitting survey");
            Request buildRequest = a.b.buildRequest((Context) this, Request.Endpoint.SUBMIT_SURVEY, Request.RequestMethod.Post);
            buildRequest.setEndpoint(buildRequest.getEndpoint().replaceAll(":survey_id", String.valueOf(next.getId())));
            if (!next.isLastEventDismiss()) {
                ArrayList<b> questions = next.getQuestions();
                JSONArray jSONArray = new JSONArray();
                Iterator<b> it = questions.iterator();
                while (it.hasNext()) {
                    b next2 = it.next();
                    String str = next2.y;
                    if (str != null && !str.equals("")) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, (Object) next2.y);
                        jSONObject.put("question_id", next2.c);
                        jSONArray.put((Object) jSONObject);
                    }
                }
                if (jSONArray.length() > 0) {
                    buildRequest.addParameter("responses", jSONArray);
                }
            }
            buildRequest.addParameter("responded_at", Long.valueOf(next.getRespondedAt()));
            buildRequest.addParameter("name", InstabugCore.getIdentifiedUsername());
            buildRequest.addParameter("email", Instabug.getUserEmail());
            ArrayList<com.instabug.survey.f.c.a> surveyEvents = next.getSurveyEvents();
            JSONArray jSONArray2 = new JSONArray();
            if (surveyEvents != null && !surveyEvents.isEmpty()) {
                Iterator<com.instabug.survey.f.c.a> it2 = surveyEvents.iterator();
                while (it2.hasNext()) {
                    com.instabug.survey.f.c.a next3 = it2.next();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("event_type", (Object) next3.c);
                    jSONObject2.put("timestamp", next3.d);
                    jSONObject2.put("index", next3.q);
                    jSONArray2.put((Object) jSONObject2);
                }
            }
            buildRequest.addParameter("events", jSONArray2);
            if (!(next.getLocalization() == null || next.getLocalization().q == null)) {
                buildRequest.addParameter(State.KEY_LOCALE, next.getLocalization().q);
            }
            buildRequest.addParameter("sdk_version", "10.4.3");
            buildRequest.addParameter("app_version", InstabugDeviceProperties.getAppVersion(this));
            buildRequest.addParameter(State.KEY_PUSH_TOKEN, InstabugCore.getPushNotificationToken());
            HashMap<String, String> retrieveAllSDKAttributes = InstabugCore.retrieveAllSDKAttributes();
            if (retrieveAllSDKAttributes != null && retrieveAllSDKAttributes.size() > 0) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry next4 : retrieveAllSDKAttributes.entrySet()) {
                    jSONObject3.put((String) next4.getKey(), next4.getValue());
                }
                buildRequest.addParameter("user_attributes", jSONObject3);
            }
            buildRequest.addParameter("os", DeviceStateProvider.getOS());
            buildRequest.addParameter("device", DeviceStateProvider.getDevice());
            a.b.doRequest(buildRequest).c(new d(aVar));
        }
    }
}
