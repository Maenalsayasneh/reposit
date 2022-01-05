package i0.j.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.model.State;
import com.instabug.library.network.Request;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.MemoryUtils;
import i0.j.e.v0.e.c;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InstabugFeaturesManager */
public class z {
    public static final Object a = new Object();
    public static volatile z b;
    public static final Feature.State c = Feature.State.ENABLED;
    public static final Feature.State d = Feature.State.DISABLED;
    public boolean e = false;
    public ConcurrentHashMap<Feature, Feature.State> f = new ConcurrentHashMap<>(20, 0.9f, 2);
    public ConcurrentHashMap<Object, Boolean> g = new ConcurrentHashMap<>(20, 0.9f, 2);
    public ConcurrentHashMap<Feature, Boolean> h = new ConcurrentHashMap<>(20, 0.9f, 2);

    /* compiled from: InstabugFeaturesManager */
    public class a implements Runnable {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
        public void run() {
            InstabugSDKLogger.d("InstabugFeaturesManager", "start saving app_features");
            SharedPreferences.Editor edit = this.c.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).edit();
            for (Object next : z.this.g.keySet()) {
                if (next instanceof Feature) {
                    edit.putBoolean(((Feature) next).name() + "AVAIL", z.this.g.get(next).booleanValue());
                }
            }
            for (Feature next2 : z.this.h.keySet()) {
                z zVar = z.this;
                String name = next2.name();
                Objects.requireNonNull(zVar);
                edit.putBoolean(name + "EXP_AVAIL", z.this.h.get(next2).booleanValue());
            }
            edit.apply();
            InstabugSDKLogger.d("InstabugFeaturesManager", "finish saving app_features");
        }
    }

    /* compiled from: InstabugFeaturesManager */
    public class b implements Request.Callbacks<String, Throwable> {
        public final /* synthetic */ Context a;

        public b(Context context) {
            this.a = context;
        }

        public void onFailed(Object obj) {
            InstabugSDKLogger.e(z.class, "Something went wrong while do fetching features request", (Throwable) obj);
        }

        public void onSucceeded(Object obj) {
            String str = (String) obj;
            Class<z> cls = z.class;
            if (str == null) {
                try {
                    InstabugSDKLogger.d(z.this, "Features fetch response is null");
                } catch (JSONException e) {
                    InstabugSDKLogger.e(cls, "Something went wrong while parsing fetching features request's response", e);
                }
            } else {
                z zVar = z.this;
                long currentTimeMillis = System.currentTimeMillis();
                Context context = this.a;
                Objects.requireNonNull(zVar);
                SharedPreferences.Editor edit = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).edit();
                edit.putLong("LAST_FETCHED_AT", currentTimeMillis);
                edit.apply();
                InstabugSDKLogger.d(cls, "Features fetched successfully");
                z.this.g(str);
                SDKCoreEventPublisher.post(new SDKCoreEvent(SDKCoreEvent.Feature.TYPE_FEATURES_FETCHED, str));
                SDKCoreEventPublisher.post(new SDKCoreEvent(SDKCoreEvent.Feature.TYPE_FEATURES, SDKCoreEvent.Feature.VALUE_FETCHED));
            }
        }
    }

    public static z j() {
        if (b == null) {
            synchronized (a) {
                if (b == null) {
                    b = new z();
                }
            }
        }
        return b;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Feature.State a(Object obj) {
        if (this.e) {
            return Feature.State.DISABLED;
        }
        if (!i(obj)) {
            return Feature.State.DISABLED;
        }
        if (this.f.containsKey(obj)) {
            return this.f.get(obj);
        }
        if (l(obj)) {
            return d;
        }
        return c;
    }

    public void b() {
        String str;
        i0.j.e.t0.a m = m();
        if (m != null && (str = m.d) != null && !str.equalsIgnoreCase("10.4.3")) {
            try {
                m.q = "";
                SettingsManager.getInstance().setFeaturesCache(m);
            } catch (JSONException e2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Failed to update previously cached feature settings due to: ");
                P0.append(e2.getMessage());
                InstabugSDKLogger.d("InstabugFeaturesManager", P0.toString());
            }
        }
    }

    public synchronized void c(Context context) {
        b();
        if (n(context)) {
            if (c.a == null) {
                c.a = new c();
            }
            c cVar = c.a;
            cVar.b.debounce((Runnable) new i0.j.e.v0.e.a(cVar, context, new b(context)));
        }
    }

    public void d(Feature feature, Feature.State state) {
        if (!this.f.containsKey(feature) || this.f.get(feature) != state) {
            InstabugSDKLogger.d("InstabugFeaturesManager", "Setting " + feature + " state to " + state);
            this.f.put(feature, state);
            return;
        }
        InstabugSDKLogger.d("InstabugFeaturesManager", "Feature " + feature + " state is already " + state + " ignoring");
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public void e(Feature feature, boolean z) {
        if (!this.h.containsKey(feature) || this.h.get(feature).booleanValue() != z) {
            InstabugSDKLogger.d("InstabugFeaturesManager", "Experimental feature " + feature + " availability to " + z);
            this.h.put(feature, Boolean.valueOf(z));
            return;
        }
        InstabugSDKLogger.d("InstabugFeaturesManager", "Experimental Feature " + feature + " availability is already " + z + ", ignoring");
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public final void f(Object obj, boolean z) {
        if (!this.g.containsKey(obj) || this.g.get(obj).booleanValue() != z) {
            InstabugSDKLogger.d("InstabugFeaturesManager", "Setting feature " + obj + " availability to " + z);
            this.g.put(obj, Boolean.valueOf(z));
        }
    }

    public void g(String str) throws JSONException {
        String str2;
        InstabugSDKLogger.v("InstabugFeaturesManager", "feature_response: " + str);
        JSONObject jSONObject = new JSONObject(str);
        boolean optBoolean = jSONObject.optBoolean("is_active", true);
        f(Feature.INSTABUG, optBoolean);
        if (optBoolean) {
            Instabug.resumeSdk();
        } else {
            Instabug.pauseSdk();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("crashes");
        if (optJSONObject != null) {
            f(Feature.ANR_REPORTING, optJSONObject.optBoolean("anr", false));
        } else {
            f(Feature.ANR_REPORTING, false);
        }
        boolean optBoolean2 = jSONObject.optBoolean("crash_reporting", false);
        f(Feature.CRASH_REPORTING, optBoolean2);
        if (!optBoolean2) {
            f(Feature.ANR_REPORTING, optBoolean2);
        }
        Feature feature = Feature.ANR_REPORTING;
        d(feature, i(feature) ? Feature.State.ENABLED : Feature.State.DISABLED);
        f(Feature.PUSH_NOTIFICATION, jSONObject.optBoolean("push_notifications", false));
        f(Feature.WHITE_LABELING, jSONObject.optBoolean("white_label", false));
        f(Feature.IN_APP_MESSAGING, jSONObject.optBoolean("in_app_messaging", false));
        f(Feature.MULTIPLE_ATTACHMENTS, jSONObject.optBoolean("multiple_attachments", false));
        f(Feature.TRACK_USER_STEPS, jSONObject.optBoolean(State.KEY_USER_STEPS, false));
        f(Feature.REPRO_STEPS, jSONObject.optBoolean("repro_steps", false));
        f(Feature.CONSOLE_LOGS, jSONObject.optBoolean(State.KEY_CONSOLE_LOG, false));
        f(Feature.INSTABUG_LOGS, jSONObject.optBoolean("ibg_log", false));
        f(Feature.USER_DATA, jSONObject.optBoolean(State.KEY_USER_DATA, true));
        f(Feature.SURVEYS, jSONObject.optBoolean("surveys", false));
        f(Feature.VIEW_HIERARCHY_V2, jSONObject.optBoolean("view_hierarchy_v2", false));
        f(Feature.USER_EVENTS, jSONObject.optBoolean("user_events", false));
        f(Feature.DISCLAIMER, jSONObject.optBoolean("disclaimer_text", false));
        f(Feature.SESSION_PROFILER, jSONObject.optBoolean(State.KEY_SESSIONS_PROFILER, false));
        boolean optBoolean3 = jSONObject.optBoolean("feature_requests", false);
        Feature feature2 = Feature.FEATURE_REQUESTS;
        f(feature2, optBoolean3);
        f(Feature.VP_CUSTOMIZATION, jSONObject.optBoolean("vp_customizations", false));
        e(feature2, jSONObject.optBoolean("experimental_prompt_fr", false));
        f(Feature.ANNOUNCEMENTS, jSONObject.optBoolean("announcements", false));
        e(Feature.BE_USER_ATTRIBUTES, jSONObject.optBoolean("be_user_attributes", false));
        f(com.instabug.library.a.BE_DISABLE_SIGNING, !jSONObject.optBoolean("disable_signing", false));
        f(Feature.REPORT_PHONE_NUMBER, jSONObject.optBoolean("report_phone_number", false));
        boolean optBoolean4 = jSONObject.optBoolean("sdk_analytics", false);
        f(Feature.SDK_ANALYTICS, optBoolean4);
        i0.j.e.a.d.b.a().post(Boolean.valueOf(optBoolean4));
        SettingsManager.getInstance().setUsersPageEnabled(jSONObject.optBoolean("users_keys", false));
        f(Feature.VZ_MESSAGES_CUSTOM_APPRATING_UI, jSONObject.optBoolean("vz_messages_custom_app_rating_ui", false));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("sdk_log");
        i0.j.e.l0.c.b.c().b(optJSONObject2);
        i0.j.e.l0.c.b.c().b(optJSONObject2);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("sessions");
        if (optJSONObject3 == null) {
            str2 = "{}";
        } else {
            str2 = optJSONObject3.toString();
        }
        SettingsManager.getInstance().setSessionsSyncConfigurations(str2);
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Feature.State h(Object obj) {
        if (this.e) {
            return Feature.State.DISABLED;
        }
        Feature feature = Feature.INSTABUG;
        if (!i(feature)) {
            return Feature.State.DISABLED;
        }
        Feature.State state = this.f.get(feature);
        Feature.State state2 = Feature.State.DISABLED;
        if (state == state2 || !i(obj)) {
            return state2;
        }
        if (this.f.containsKey(obj)) {
            return this.f.get(obj);
        }
        if (l(obj)) {
            return d;
        }
        return c;
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public boolean i(Object obj) {
        if (this.g.containsKey(obj)) {
            return this.g.get(obj).booleanValue();
        }
        return !l(obj);
    }

    public void k(Context context) {
        if (context == null) {
            InstabugSDKLogger.w("InstabugFeaturesManager", "unable to execute saveFeaturesToSharedPreferences. Null context reference");
        } else if (!MemoryUtils.isLowMemory(context)) {
            new Thread(new a(context)).start();
        } else {
            InstabugSDKLogger.e(z.class.getSimpleName(), "Couldn't save features because memory is low, Instabug will be paused");
            Instabug.pauseSdk();
        }
    }

    public final boolean l(Object obj) {
        return obj == Feature.VIEW_HIERARCHY_V2 || obj == Feature.VP_CUSTOMIZATION || obj == Feature.VZ_MESSAGES_CUSTOM_APPRATING_UI || obj == Feature.REPORT_PHONE_NUMBER || obj == com.instabug.library.a.BE_USERS_KEYS;
    }

    public final i0.j.e.t0.a m() {
        try {
            i0.j.e.t0.a featuresCache = SettingsManager.getInstance().getFeaturesCache();
            if (featuresCache != null) {
                InstabugSDKLogger.d("InstabugFeaturesManager", "Previously cached feature settings : " + featuresCache.toJson());
            }
            return featuresCache;
        } catch (JSONException e2) {
            StringBuilder P0 = i0.d.a.a.a.P0("Failed to load previously cached feature settings due to: ");
            P0.append(e2.getMessage());
            InstabugSDKLogger.d("InstabugFeaturesManager", P0.toString());
            return null;
        }
    }

    public final boolean n(Context context) {
        i0.j.e.t0.a m = m();
        if (m != null) {
            StringBuilder P0 = i0.d.a.a.a.P0("Last fetched at is more than ");
            P0.append(m.c);
            P0.append(" millis, retrieve it again");
            InstabugSDKLogger.d("InstabugFeaturesManager", P0.toString());
            if (System.currentTimeMillis() - context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).getLong("LAST_FETCHED_AT", 0) > m.c) {
                return true;
            }
            return false;
        }
        return true;
    }
}
