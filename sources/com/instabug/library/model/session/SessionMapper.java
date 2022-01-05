package com.instabug.library.model.session;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import androidx.annotation.Keep;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Keep
public class SessionMapper {

    public static class a implements ReturnableExecutable<JSONObject> {
        public final /* synthetic */ SessionRemoteEntity a;

        public a(SessionRemoteEntity sessionRemoteEntity) {
            this.a = sessionRemoteEntity;
        }

        public Object execute() throws Exception {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : this.a.getMap().entrySet()) {
                jSONObject.put((String) next.getKey(), SessionMapper.extractJsonValue(next.getValue()));
            }
            return jSONObject;
        }
    }

    public static class b implements ReturnableExecutable<JSONObject> {
        public final /* synthetic */ SessionsBatchDTO a;

        public b(SessionsBatchDTO sessionsBatchDTO) {
            this.a = sessionsBatchDTO;
        }

        public Object execute() throws Exception {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : this.a.getCommonKeys().entrySet()) {
                jSONObject.put((String) next.getKey(), SessionMapper.extractJsonValue(next.getValue()));
            }
            JSONArray jSONArray = new JSONArray();
            for (SessionRemoteEntity json : this.a.getSessions()) {
                jSONArray.put((Object) SessionMapper.toJson(json));
            }
            jSONObject.put("sessions", (Object) jSONArray);
            return jSONObject;
        }
    }

    public static class c implements ReturnableExecutable<Request> {
        public final /* synthetic */ JSONObject a;
        public final /* synthetic */ Request b;

        public c(JSONObject jSONObject, Request request) {
            this.a = jSONObject;
            this.b = request;
        }

        public Object execute() throws Exception {
            Iterator<String> keys = this.a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                this.b.addRequestBodyParameter(next, this.a.get(next));
            }
            return this.b;
        }
    }

    private SessionMapper() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return new org.json.JSONArray(r2.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0024 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object extractJsonValue(java.lang.Object r2) {
        /*
            if (r2 == 0) goto L_0x002e
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "{"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "["
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0024 }
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x0024 }
            r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x0024 }
            return r0
        L_0x0024:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x002e }
            java.lang.String r1 = r2.toString()     // Catch:{ JSONException -> 0x002e }
            r0.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x002e }
            return r0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.model.session.SessionMapper.extractJsonValue(java.lang.Object):java.lang.Object");
    }

    public static ContentValues toContentValues(SessionLocalEntity sessionLocalEntity) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("session_id", sessionLocalEntity.getId());
        contentValues.put("started_at", Long.valueOf(sessionLocalEntity.getStartTimestampMicros()));
        contentValues.put("duration", Long.valueOf(sessionLocalEntity.getDuration()));
        contentValues.put("user_attributes", sessionLocalEntity.getUserEvents());
        contentValues.put("user_events", sessionLocalEntity.getCustomAttributes());
        contentValues.put(InstabugDbContract.SessionEntry.COLUMN_USER_EVENTS_KEYS, sessionLocalEntity.getUserEventsKeys());
        contentValues.put(InstabugDbContract.SessionEntry.COLUMN_USER_ATTRIBUTES_KEYS, sessionLocalEntity.getCustomAttributesKeys());
        contentValues.put(InstabugDbContract.SessionEntry.COLUMN_USER_EMAIL, sessionLocalEntity.getUserEmail());
        contentValues.put(InstabugDbContract.SessionEntry.COLUMN_USER_NAME, sessionLocalEntity.getUserName());
        contentValues.put("uuid", sessionLocalEntity.getUuid());
        contentValues.put(InstabugDbContract.SessionEntry.COLUMN_APP_TOKEN, sessionLocalEntity.getAppToken());
        contentValues.put("os", sessionLocalEntity.getOs());
        contentValues.put("device", sessionLocalEntity.getDevice());
        contentValues.put("sdk_version", sessionLocalEntity.getSdkVersion());
        contentValues.put("app_version", sessionLocalEntity.getAppVersion());
        contentValues.put("crash_reporting_enabled", Integer.valueOf(sessionLocalEntity.isCrashReportingEnabled() ? 1 : 0));
        contentValues.put(InstabugDbContract.SessionEntry.COLUMN_USERS_PAGE_ENABLED, Integer.valueOf(sessionLocalEntity.isUsersPageEnabled() ? 1 : 0));
        contentValues.put("sync_status", Integer.valueOf(sessionLocalEntity.getSyncStatus()));
        return contentValues;
    }

    public static SessionsBatchDTO toDTO(SessionRemoteEntity sessionRemoteEntity) {
        return toDTO(Collections.emptyMap(), Collections.singletonList(sessionRemoteEntity));
    }

    public static List<String> toIDs(SessionsBatchDTO sessionsBatchDTO) {
        ArrayList arrayList = new ArrayList();
        for (SessionRemoteEntity id : sessionsBatchDTO.getSessions()) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    public static JSONObject toJson(SessionRemoteEntity sessionRemoteEntity) {
        return (JSONObject) new ExceptionHandler().withPenaltyLog().executeAndGet(new a(sessionRemoteEntity), new JSONObject());
    }

    public static SessionLocalEntity toLocalEntity(ContentValues contentValues) {
        ContentValues contentValues2 = contentValues;
        return new SessionLocalEntity(contentValues2.getAsString("session_id"), contentValues2.getAsString("os"), contentValues2.getAsString("device"), contentValues2.getAsLong("duration").longValue(), contentValues2.getAsLong("started_at").longValue(), contentValues2.getAsString(InstabugDbContract.SessionEntry.COLUMN_USER_NAME), contentValues2.getAsString(InstabugDbContract.SessionEntry.COLUMN_USER_EMAIL), contentValues2.getAsString("sdk_version"), contentValues2.getAsString("app_version"), contentValues2.getAsString("user_attributes"), contentValues2.getAsString("user_events"), contentValues2.getAsString(InstabugDbContract.SessionEntry.COLUMN_USER_EVENTS_KEYS), contentValues2.getAsString(InstabugDbContract.SessionEntry.COLUMN_USER_ATTRIBUTES_KEYS), contentValues2.getAsInteger("crash_reporting_enabled").intValue() == 1, contentValues2.getAsInteger("sync_status").intValue(), contentValues2.getAsString("uuid"), contentValues2.getAsString(InstabugDbContract.SessionEntry.COLUMN_APP_TOKEN), contentValues2.getAsInteger(InstabugDbContract.SessionEntry.COLUMN_USERS_PAGE_ENABLED).intValue() == 1);
    }

    public static CoreSession toModel(SessionLocalEntity sessionLocalEntity) {
        return new CoreSession(sessionLocalEntity.getId(), sessionLocalEntity.getOs(), sessionLocalEntity.getDevice(), sessionLocalEntity.getDuration(), sessionLocalEntity.getStartTimestampMicros(), 0, sessionLocalEntity.getUserName(), sessionLocalEntity.getUserEmail(), sessionLocalEntity.getSdkVersion(), sessionLocalEntity.getAppVersion(), sessionLocalEntity.isUsersPageEnabled() ? sessionLocalEntity.getUserEvents() : sessionLocalEntity.getUserEventsKeys(), sessionLocalEntity.isUsersPageEnabled() ? sessionLocalEntity.getCustomAttributes() : sessionLocalEntity.getCustomAttributesKeys(), sessionLocalEntity.isCrashReportingEnabled(), sessionLocalEntity.getSyncStatus(), sessionLocalEntity.getUuid(), sessionLocalEntity.getAppToken(), sessionLocalEntity.isUsersPageEnabled());
    }

    public static List<CoreSession> toModels(List<SessionLocalEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (SessionLocalEntity model : list) {
            arrayList.add(toModel(model));
        }
        return arrayList;
    }

    public static List<SessionRemoteEntity> toRemoteEntities(List<CoreSession> list) {
        ArrayList arrayList = new ArrayList();
        for (CoreSession remoteEntity : list) {
            arrayList.add(toRemoteEntity(remoteEntity));
        }
        return arrayList;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static SessionRemoteEntity toRemoteEntity(CoreSession coreSession) {
        HashMap hashMap = new HashMap();
        hashMap.put("os", coreSession.getOs());
        hashMap.put("device", coreSession.getDevice());
        hashMap.put("duration", Long.valueOf(coreSession.getDuration()));
        hashMap.put("started_at", Long.valueOf(coreSession.getStartTimestampMicros()));
        hashMap.put("name", coreSession.getUserName());
        hashMap.put("email", coreSession.getUserEmail());
        hashMap.put("sdk_version", coreSession.getSdkVersion());
        hashMap.put("app_version", coreSession.getAppVersion());
        hashMap.put(coreSession.isUsersPageEnabled() ? "user_events" : SessionParameter.USER_EVENTS_KEYS, coreSession.getUserEvents());
        hashMap.put(coreSession.isUsersPageEnabled() ? SessionParameter.CUSTOM_ATTRIBUTES : SessionParameter.CUSTOM_ATTRIBUTES_KEYS, coreSession.getCustomAttributes());
        hashMap.put("crash_reporting_enabled", Boolean.valueOf(coreSession.isCrashReportingEnabled()));
        hashMap.put("uuid", coreSession.getUuid());
        hashMap.put("application_token", coreSession.getAppToken());
        return toRemoteEntity(coreSession.getId(), hashMap);
    }

    public static Request toRequest(JSONObject jSONObject) {
        Request request = new Request(Request.Endpoint.SEND_SESSION, NetworkManager.RequestType.NORMAL);
        request.setRequestMethod(Request.RequestMethod.Post);
        return (Request) new ExceptionHandler().withPenaltyLog().executeAndGet(new c(jSONObject, request), request);
    }

    public static CoreSession toSession(String str, String str2, String str3, String str4, long j, long j2) {
        return new CoreSession(str, str2, str3, str4, j, j2);
    }

    public static SessionsBatchDTO toDTO(Map<String, Object> map, List<SessionRemoteEntity> list) {
        return new SessionsBatchDTO(map, list);
    }

    public static JSONObject toJson(SessionsBatchDTO sessionsBatchDTO) {
        return (JSONObject) new ExceptionHandler().withPenaltyLog().executeAndGet(new b(sessionsBatchDTO), new JSONObject());
    }

    public static SessionRemoteEntity toRemoteEntity(String str, Map<String, Object> map) {
        return new SessionRemoteEntity(str, map);
    }
}
