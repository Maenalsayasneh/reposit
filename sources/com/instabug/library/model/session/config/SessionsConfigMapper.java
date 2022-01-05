package com.instabug.library.model.session.config;

import com.instabug.library.internal.utils.stability.execution.ReturnableExecutable;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import org.json.JSONObject;

public class SessionsConfigMapper {
    private static final String TAG = "SessionsConfigMapper";

    public static class a implements ReturnableExecutable<SessionsConfig> {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        public Object execute() throws Exception {
            return SessionsConfigMapper.map(new JSONObject(this.a));
        }
    }

    public static class b implements ReturnableExecutable<SessionsConfig> {
        public final /* synthetic */ JSONObject a;

        public b(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public Object execute() throws Exception {
            return new SessionsConfig(this.a.optInt(SessionsConfigParameter.SYNC_INTERVAL, 720), this.a.optInt(SessionsConfigParameter.MAX_SESSIONS_PER_REQUEST, 10), this.a.optInt(SessionsConfigParameter.SYNC_MODE, 2));
        }
    }

    public static class c implements ReturnableExecutable<String> {
        public final /* synthetic */ SessionsConfig a;

        public c(SessionsConfig sessionsConfig) {
            this.a = sessionsConfig;
        }

        public Object execute() throws Exception {
            int syncIntervalsInMinutes = this.a.getSyncIntervalsInMinutes();
            int maxSessionsPerRequest = this.a.getMaxSessionsPerRequest();
            int syncMode = this.a.getSyncMode();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(SessionsConfigParameter.SYNC_INTERVAL, syncIntervalsInMinutes);
            jSONObject.put(SessionsConfigParameter.MAX_SESSIONS_PER_REQUEST, maxSessionsPerRequest);
            jSONObject.put(SessionsConfigParameter.SYNC_MODE, syncMode);
            return jSONObject.toString();
        }
    }

    private SessionsConfigMapper() {
    }

    public static SessionsConfig map(String str) {
        return (SessionsConfig) new ExceptionHandler().withPenaltyLog(TAG).executeAndGet(new a(str), SessionsConfig.createDefault());
    }

    public static SessionsConfig map(JSONObject jSONObject) {
        return (SessionsConfig) new ExceptionHandler().withPenaltyLog(TAG).executeAndGet(new b(jSONObject), SessionsConfig.createDefault());
    }

    public static String map(SessionsConfig sessionsConfig) {
        return (String) new ExceptionHandler().withPenaltyLog(TAG).executeAndGet(new c(sessionsConfig), "{}");
    }
}
