package com.instabug.library.model;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Process;
import androidx.annotation.Keep;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.model.i;
import com.instabug.library.n.b.a.d;
import com.instabug.library.n.b.a.e;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.user.UserEvent;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.memory.MemoryGuard;
import com.instabug.library.util.memory.MemoryUtils;
import com.instabug.library.util.memory.predicate.StringMemoryAvailablePredicate;
import com.instabug.library.visualusersteps.VisualUserStep;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.j.e.f1.n;
import i0.j.e.o0.d.a;
import i0.j.e.q0.c;
import i0.j.e.u0.b;
import i0.j.e.z;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class State implements Cacheable, Serializable {
    public static final String KEY_APP_PACKAGE_NAME = "bundle_id";
    private static final String KEY_APP_STATUS = "app_status";
    public static final String KEY_APP_VERSION = "app_version";
    private static final String KEY_BATTERY_LEVEL = "battery_level";
    private static final String KEY_BATTERY_STATUS = "battery_state";
    public static final String KEY_CARRIER = "carrier";
    public static final String KEY_CONSOLE_LOG = "console_log";
    public static final String KEY_CURRENT_VIEW = "current_view";
    public static final String KEY_DENSITY = "density";
    public static final String KEY_DEVICE = "device";
    public static final String KEY_DEVICE_ROOTED = "device_rooted";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_EMAIL = "email";
    private static final String KEY_EXPERIMENTS = "experiments";
    public static final String KEY_INSTABUG_LOG = "instabug_log";
    public static final String KEY_LOCALE = "locale";
    private static final String KEY_MEMORY_FREE = "memory_free";
    private static final String KEY_MEMORY_TOTAL = "memory_total";
    private static final String KEY_MEMORY_USED = "memory_used";
    public static final String KEY_NAME = "name";
    public static final String KEY_NETWORK_LOGS = "network_log";
    public static final String KEY_ORIENTATION = "orientation";
    public static final String KEY_OS = "os";
    public static final String KEY_PUSH_TOKEN = "push_token";
    public static final String KEY_REPORTED_AT = "reported_at";
    public static final String KEY_SCREEN_SIZE = "screen_size";
    public static final String KEY_SDK_VERSION = "sdk_version";
    public static final String KEY_SESSIONS_PROFILER = "sessions_profiler";
    public static final String KEY_STORAGE_FREE = "storage_free";
    public static final String KEY_STORAGE_TOTAL = "storage_total";
    public static final String KEY_STORAGE_USED = "storage_used";
    public static final String KEY_TAGS = "tags";
    public static final String KEY_USER_ATTRIBUTES = "user_attributes";
    public static final String KEY_USER_DATA = "user_data";
    public static final String KEY_USER_EVENTS = "user_events";
    public static final String KEY_USER_STEPS = "user_steps";
    public static final String KEY_VISUAL_USER_STEPS = "user_repro_steps";
    public static final String KEY_WIFI_SSID = "wifi_ssid";
    public static final String KEY_WIFI_STATE = "wifi_state";
    private static final String TAG = "State";
    public static final String VALUE_APP_STATUS_BACKGROUND = "background";
    public static final String VALUE_APP_STATUS_FOREGROUND = "foreground";
    private String OS;
    private String ScreenOrientation;
    private String appPackageName;
    private String appStatus;
    private String appVersion;
    private int batteryLevel;
    private String batteryState;
    private String carrier;
    private ArrayList<a> consoleLog;
    private String currentView;
    private String customUserAttribute;
    private String device;
    private long duration;
    private JSONArray experiments;
    private long freeMemory;
    public long freeStorage;
    private String instabugLog;
    private boolean isDeviceRooted;
    private String locale;
    private String networkLogs;
    private String pushToken;
    private long reportedAt;
    private String screenDensity;
    private String screenSize;
    private String sdkVersion;
    private e sessionProfilerTimeline;
    private String tags;
    private long totalMemory;
    private long totalStorage;
    private Uri uri;
    private long usedMemory;
    private long usedStorage;
    private String userAttributes;
    private String userData;
    private String userEmail;
    private String userEvents;
    private String userName;
    private ArrayList<i> userSteps;
    private ArrayList<VisualUserStep> visualUserSteps;
    private String wifiSSID;
    private boolean wifiState;

    @Keep
    public enum Action {
        FINISHED,
        ERROR
    }

    public static class Builder implements Serializable {
        private Context context;

        public Builder(Context context2) {
            this.context = context2;
        }

        /* access modifiers changed from: private */
        public static ArrayList<a> getConsoleLog(ArrayList<a> arrayList) {
            ArrayList<a> consoleLog = getConsoleLog();
            consoleLog.addAll(arrayList);
            return consoleLog;
        }

        private JSONArray getExperiments() {
            List<String> b = a.d().b();
            if (b == null || b.isEmpty()) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (String put : b) {
                jSONArray.put((Object) put);
            }
            return jSONArray;
        }

        private String getInstabugLog() {
            if (!MemoryUtils.isLowMemory(this.context)) {
                try {
                    if (z.j().h(Feature.INSTABUG_LOGS) == Feature.State.ENABLED) {
                        return InstabugLog.getLogs();
                    }
                    return null;
                } catch (OutOfMemoryError e) {
                    InstabugSDKLogger.e(State.TAG, "Got error while parsing user events logs", e);
                    return null;
                }
            } else {
                InstabugSDKLogger.w(State.TAG, "Running low on memory. Excluding UserEvents serialization from state builder.");
                return null;
            }
        }

        private String getPushNotificationToken() {
            return InstabugCore.getPushNotificationToken();
        }

        private long getReportedAt() {
            return InstabugDateFormatter.getCurrentUTCTimeStampInSeconds();
        }

        private e getSessionProfilerTimeline() {
            return b.c().b.d();
        }

        private String getTags() {
            return SettingsManager.getInstance().getTagsAsString();
        }

        private String getUserData() {
            return SettingsManager.getInstance().getUserData();
        }

        private String getUserEmail() {
            return i0.j.e.c1.b.E();
        }

        private String getUserEvents() {
            if (!MemoryUtils.isLowMemory(this.context)) {
                try {
                    return UserEvent.toJson(InstabugUserEventLogger.getInstance().getUserEvents()).toString();
                } catch (OutOfMemoryError | JSONException e) {
                    InstabugSDKLogger.e(State.TAG, "Got error while parsing user events logs", e);
                    return "[]";
                }
            } else {
                InstabugSDKLogger.w(State.TAG, "Running low on memory. Excluding UserEvents serialization from state builder.");
                return "[]";
            }
        }

        private String getUserName() {
            return i0.j.e.c1.b.F();
        }

        private ArrayList<i> getUserSteps() {
            i0.j.e.a1.e c = i0.j.e.a1.e.c();
            Objects.requireNonNull(c);
            ArrayList<i> arrayList = new ArrayList<>();
            for (int i = 0; i < c.b.size(); i++) {
                i iVar = new i();
                iVar.d = c.b.get(i).b;
                iVar.c = c.b.get(i).a;
                String str = c.b.get(i).c;
                if (str != null) {
                    char c2 = 65535;
                    switch (str.hashCode()) {
                        case -1854350643:
                            if (str.equals(StepType.SCROLL)) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1647502663:
                            if (str.equals(StepType.APPLICATION_CREATED)) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 82819:
                            if (str.equals(StepType.TAP)) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 76133530:
                            if (str.equals(StepType.PINCH)) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 78862054:
                            if (str.equals(StepType.SHAKE)) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 79316762:
                            if (str.equals(StepType.SWIPE)) {
                                c2 = 5;
                                break;
                            }
                            break;
                        case 1074528416:
                            if (str.equals(StepType.LONG_PRESS)) {
                                c2 = 6;
                                break;
                            }
                            break;
                        case 1265144341:
                            if (str.equals(StepType.DOUBLE_TAP)) {
                                c2 = 7;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            iVar.q = i.b.SCROLL;
                            break;
                        case 1:
                            iVar.q = i.b.APPLICATION;
                            break;
                        case 2:
                            iVar.q = i.b.TAP;
                            break;
                        case 3:
                            iVar.q = i.b.PINCH;
                            break;
                        case 4:
                            iVar.q = i.b.MOTION;
                            break;
                        case 5:
                            iVar.q = i.b.SWIPE;
                            break;
                        case 6:
                            iVar.q = i.b.LONG_PRESS;
                            break;
                        case 7:
                            iVar.q = i.b.DOUBLE_TAP;
                            break;
                        default:
                            iVar.q = i.b.VIEW;
                            break;
                    }
                } else {
                    iVar.q = i.b.NOT_AVAILABLE;
                }
                iVar.x = new i.a(iVar.q, c.b.get(i).e, c.b.get(i).f, c.b.get(i).d);
                arrayList.add(iVar);
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static ArrayList<VisualUserStep> getVisualUserSteps() {
            return n.k().g();
        }

        @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
        public State build(boolean z) {
            return build(z, false);
        }

        public State buildInternalState() {
            return new State().setSdkVersion(DeviceStateProvider.getSdkVersion()).setLocale(DeviceStateProvider.getLocale(this.context)).setDuration(DeviceStateProvider.getActiveSessionDuration()).setDevice(DeviceStateProvider.getDevice()).setIsDeviceRooted(DeviceStateProvider.isDeviceRooted()).setOS(DeviceStateProvider.getOS()).setCarrier(DeviceStateProvider.getCarrier(this.context)).setAppStatus(InstabugCore.getStartedActivitiesCount() > 0 ? State.VALUE_APP_STATUS_FOREGROUND : State.VALUE_APP_STATUS_BACKGROUND).setAppVersion(DeviceStateProvider.getAppVersion(this.context)).setAppPackageName(DeviceStateProvider.getAppPackageName(this.context)).setBatteryLevel(DeviceStateProvider.getBatteryLevel(this.context)).setBatteryState(DeviceStateProvider.getBatteryState(this.context)).setWifiState(DeviceStateProvider.getWifiState(this.context)).setWifiSSID(DeviceStateProvider.getWifiSSID(this.context)).setFreeMemory(DeviceStateProvider.getFreeMemory(this.context)).setUsedMemory(DeviceStateProvider.getUsedMemory(this.context)).setTotalMemory(DeviceStateProvider.getTotalMemory(this.context)).setFreeStorage(DeviceStateProvider.getFreeStorage()).setUsedStorage(DeviceStateProvider.getUsedStorage()).setTotalStorage(DeviceStateProvider.getTotalStorage()).setScreenDensity(DeviceStateProvider.getScreenDensity(this.context)).setScreenSize(DeviceStateProvider.getScreenSize(this.context)).setScreenOrientation(DeviceStateProvider.getScreenOrientation(this.context)).setCurrentView(DeviceStateProvider.getCurrentView()).setReportedAt(getReportedAt());
        }

        public String formatSessionDuration(long j) {
            StringBuilder sb = new StringBuilder();
            int i = ((int) j) % 60;
            long j2 = j / 60;
            int i2 = ((int) j2) % 60;
            int i3 = ((int) (j2 / 60)) % 60;
            if (i3 <= 9) {
                sb.append("0");
            }
            sb.append(i3);
            sb.append(":");
            if (i2 <= 9) {
                sb.append("0");
            }
            sb.append(i2);
            sb.append(":");
            if (i <= 9) {
                sb.append("0");
            }
            sb.append(i);
            return sb.toString();
        }

        public String getNetworkLogs() {
            String str;
            MemoryGuard from = MemoryGuard.from(this.context);
            synchronized (c.class) {
                String[] strArr = {null};
                from.withPredicate(new StringMemoryAvailablePredicate(1000000)).doAction(new i0.j.e.q0.b(strArr));
                str = strArr[0];
            }
            return str;
        }

        public State build(boolean z, boolean z2) {
            State access$1600 = new State().setSdkVersion(DeviceStateProvider.getSdkVersion()).setLocale(DeviceStateProvider.getLocale(this.context)).setDuration(DeviceStateProvider.getActiveSessionDuration()).setDevice(DeviceStateProvider.getDevice()).setIsDeviceRooted(DeviceStateProvider.isDeviceRooted()).setOS(DeviceStateProvider.getOS()).setCarrier(DeviceStateProvider.getCarrier(this.context)).setAppStatus(InstabugCore.getStartedActivitiesCount() > 0 ? State.VALUE_APP_STATUS_FOREGROUND : State.VALUE_APP_STATUS_BACKGROUND).setAppVersion(DeviceStateProvider.getAppVersion(this.context)).setAppPackageName(DeviceStateProvider.getAppPackageName(this.context)).setBatteryLevel(DeviceStateProvider.getBatteryLevel(this.context)).setBatteryState(DeviceStateProvider.getBatteryState(this.context)).setWifiState(DeviceStateProvider.getWifiState(this.context)).setWifiSSID(DeviceStateProvider.getWifiSSID(this.context)).setFreeMemory(DeviceStateProvider.getFreeMemory(this.context)).setUsedMemory(DeviceStateProvider.getUsedMemory(this.context)).setTotalMemory(DeviceStateProvider.getTotalMemory(this.context)).setFreeStorage(DeviceStateProvider.getFreeStorage()).setUsedStorage(DeviceStateProvider.getUsedStorage()).setTotalStorage(DeviceStateProvider.getTotalStorage()).setScreenDensity(DeviceStateProvider.getScreenDensity(this.context)).setScreenSize(DeviceStateProvider.getScreenSize(this.context)).setScreenOrientation(DeviceStateProvider.getScreenOrientation(this.context)).setCurrentView(DeviceStateProvider.getCurrentView()).setConsoleLog(getConsoleLog()).setUserSteps(getUserSteps()).setUserEmail(getUserEmail()).setUserName(getUserName()).setPushToken(getPushNotificationToken()).setUserData(getUserData()).setReportedAt(getReportedAt()).setTags(getTags()).setUserAttributes(UserAttributesDbHelper.getSDKUserAttributes()).setNetworkLogs(getNetworkLogs()).setUserEvents(getUserEvents()).setSessionProfilerTimeline(getSessionProfilerTimeline());
            if (z && getInstabugLog() != null) {
                access$1600.setInstabugLog(getInstabugLog());
            }
            if (z2) {
                access$1600.setExperiments(getExperiments());
            }
            return access$1600;
        }

        /* access modifiers changed from: private */
        public static ArrayList<a> getConsoleLog() {
            ArrayList<a> arrayList = new ArrayList<>();
            if (z.j().h(Feature.CONSOLE_LOGS) == Feature.State.ENABLED) {
                try {
                    Runtime runtime = Runtime.getRuntime();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(runtime.exec("logcat -v time -d " + Process.myPid()).getInputStream(), Charset.forName(FileEncryptionUtil.ENCODING_UTF_8)));
                    ArrayList arrayList2 = new ArrayList();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList2.add(readLine);
                    }
                    bufferedReader.close();
                    arrayList2.trimToSize();
                    for (int size = arrayList2.size() > 700 ? arrayList2.size() - 700 : 0; size < arrayList2.size(); size++) {
                        if (((String) arrayList2.get(size)).length() > 18) {
                            a aVar = new a();
                            aVar.c = ((String) arrayList2.get(size)).substring(18);
                            aVar.d = a.a(((String) arrayList2.get(size)).substring(0, 18));
                            arrayList.add(aVar);
                        }
                    }
                    arrayList2.clear();
                    return arrayList;
                } catch (IOException e) {
                    InstabugSDKLogger.e(State.TAG, "Could not read logcat log", e);
                }
            }
            return arrayList;
        }
    }

    public static class StateItem<V> implements Serializable {
        public String key;
        public V value;

        public String getKey() {
            return this.key;
        }

        public V getValue() {
            return this.value;
        }

        public StateItem<V> setKey(String str) {
            this.key = str;
            return this;
        }

        public StateItem<V> setValue(V v) {
            this.value = v;
            return this;
        }

        @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("key: ");
            P0.append(getKey());
            P0.append(", value: ");
            P0.append(getValue());
            return P0.toString();
        }
    }

    private long getFreeStorage() {
        return this.freeStorage;
    }

    private String getSessionProfilerTimeline() {
        e eVar = this.sessionProfilerTimeline;
        if (eVar == null) {
            return null;
        }
        e.c(eVar.c, 30.0f);
        e.c(eVar.d, 30.0f);
        e.c(eVar.q, 30.0f);
        e.c(eVar.x, 120.0f);
        e.c(eVar.y, 120.0f);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 1).put("platform", (Object) "Android").put("battery", (Object) eVar.b(eVar.c)).put("orientation", (Object) eVar.b(eVar.q)).put("battery", (Object) eVar.b(eVar.c)).put("connectivity", (Object) eVar.b(eVar.d)).put("memory", (Object) eVar.b(eVar.x)).put("storage", (Object) eVar.b(eVar.y).put("total", eVar.Y1));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static State getState(Context context) {
        return new Builder(context).build(true, true);
    }

    private static String getTagsAsString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        if (list != null && list.size() > 0) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(list.get(i));
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public State setAppStatus(String str) {
        this.appStatus = str;
        return this;
    }

    /* access modifiers changed from: private */
    public State setConsoleLog(ArrayList<a> arrayList) {
        this.consoleLog = arrayList;
        return this;
    }

    /* access modifiers changed from: private */
    public State setFreeStorage(long j) {
        this.freeStorage = j;
        return this;
    }

    /* access modifiers changed from: private */
    public State setIsDeviceRooted(boolean z) {
        this.isDeviceRooted = z;
        return this;
    }

    /* access modifiers changed from: private */
    public State setNetworkLogs(String str) {
        this.networkLogs = str;
        return this;
    }

    /* access modifiers changed from: private */
    public State setReportedAt(long j) {
        this.reportedAt = j;
        return this;
    }

    /* access modifiers changed from: private */
    public State setSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }

    /* access modifiers changed from: private */
    public State setSessionProfilerTimeline(e eVar) {
        this.sessionProfilerTimeline = eVar;
        return this;
    }

    /* access modifiers changed from: private */
    public State setTotalStorage(long j) {
        this.totalStorage = j;
        return this;
    }

    /* access modifiers changed from: private */
    public State setUsedMemory(long j) {
        this.usedMemory = j;
        return this;
    }

    /* access modifiers changed from: private */
    public State setUsedStorage(long j) {
        this.usedStorage = j;
        return this;
    }

    /* access modifiers changed from: private */
    public State setUserSteps(ArrayList<i> arrayList) {
        this.userSteps = arrayList;
        return this;
    }

    private void setVisualUserSteps(ArrayList<VisualUserStep> arrayList) {
        this.visualUserSteps = arrayList;
    }

    /* access modifiers changed from: private */
    public State setWifiSSID(String str) {
        this.wifiSSID = str;
        return this;
    }

    /* access modifiers changed from: private */
    public State setWifiState(boolean z) {
        this.wifiState = z;
        return this;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public boolean equals(Object obj) {
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        if (!String.valueOf(state.getAppVersion()).equals(String.valueOf(getAppVersion())) || state.getBatteryLevel() != getBatteryLevel() || !String.valueOf(state.getBatteryState()).equals(String.valueOf(getBatteryState())) || !String.valueOf(state.getCarrier()).equals(String.valueOf(getCarrier())) || !String.valueOf(state.getAppStatus()).equals(String.valueOf(getAppStatus())) || !String.valueOf(state.getConsoleLog()).equals(String.valueOf(getConsoleLog())) || !String.valueOf(state.getCurrentView()).equals(String.valueOf(getCurrentView())) || state.getDuration() != getDuration() || !String.valueOf(state.getDevice()).equals(String.valueOf(getDevice())) || state.getFreeMemory() != getFreeMemory() || state.getFreeStorage() != getFreeStorage() || !String.valueOf(state.getLocale()).equals(String.valueOf(getLocale())) || !String.valueOf(state.getOS()).equals(String.valueOf(getOS())) || state.getReportedAt() != getReportedAt() || !String.valueOf(state.getScreenDensity()).equals(String.valueOf(getScreenDensity())) || !String.valueOf(state.getScreenOrientation()).equals(String.valueOf(getScreenOrientation())) || !String.valueOf(state.getScreenSize()).equals(String.valueOf(getScreenSize())) || !String.valueOf(state.getSdkVersion()).equals(String.valueOf(getSdkVersion())) || state.getTotalMemory() != getTotalMemory() || state.getTotalStorage() != getTotalStorage() || !String.valueOf(state.getTags()).equals(String.valueOf(getTags())) || state.getUsedMemory() != getUsedMemory() || state.getUsedStorage() != getUsedStorage() || !String.valueOf(state.getUserData()).equals(String.valueOf(getUserData())) || !String.valueOf(state.getUserEmail()).equals(String.valueOf(getUserEmail())) || !String.valueOf(state.getUserName()).equals(String.valueOf(getUserName())) || !String.valueOf(state.getPushToken()).equals(String.valueOf(getPushToken())) || !String.valueOf(state.getUserSteps()).equals(String.valueOf(getUserSteps())) || !String.valueOf(state.getWifiSSID()).equals(String.valueOf(getWifiSSID())) || state.isDeviceRooted() != isDeviceRooted() || state.isWifiEnable() != isWifiEnable() || !String.valueOf(state.getInstabugLog()).equals(String.valueOf(getInstabugLog())) || !String.valueOf(state.getUserAttributes()).equals(String.valueOf(getUserAttributes())) || !String.valueOf(state.getNetworkLogs()).equals(String.valueOf(getNetworkLogs())) || !String.valueOf(state.getUserEvents()).equals(String.valueOf(getUserEvents())) || !String.valueOf(state.getVisualUserSteps()).equals(String.valueOf(getVisualUserSteps())) || !String.valueOf(state.getSessionProfilerTimeline()).equals(String.valueOf(getSessionProfilerTimeline()))) {
            return false;
        }
        return true;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(KEY_APP_PACKAGE_NAME)) {
            setAppPackageName(jSONObject.getString(KEY_APP_PACKAGE_NAME));
        }
        if (jSONObject.has("app_version")) {
            setAppVersion(jSONObject.getString("app_version"));
        }
        if (jSONObject.has(KEY_BATTERY_LEVEL)) {
            setBatteryLevel(jSONObject.getInt(KEY_BATTERY_LEVEL));
        }
        if (jSONObject.has(KEY_BATTERY_STATUS)) {
            setBatteryState(jSONObject.getString(KEY_BATTERY_STATUS));
        }
        if (jSONObject.has("carrier")) {
            setCarrier(jSONObject.getString("carrier"));
        }
        if (jSONObject.has(KEY_CONSOLE_LOG)) {
            JSONArray jSONArray = new JSONArray(jSONObject.getString(KEY_CONSOLE_LOG));
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    a aVar = new a();
                    aVar.fromJson(jSONArray.getJSONObject(i).toString());
                    arrayList.add(aVar);
                }
            }
            setConsoleLog(arrayList);
        }
        if (jSONObject.has(KEY_CURRENT_VIEW)) {
            setCurrentView(jSONObject.getString(KEY_CURRENT_VIEW));
        }
        if (jSONObject.has(KEY_DENSITY)) {
            setScreenDensity(jSONObject.getString(KEY_DENSITY));
        }
        if (jSONObject.has("device")) {
            setDevice(jSONObject.getString("device"));
        }
        if (jSONObject.has(KEY_DEVICE_ROOTED)) {
            setIsDeviceRooted(jSONObject.getBoolean(KEY_DEVICE_ROOTED));
        }
        if (jSONObject.has("duration")) {
            setDuration(jSONObject.getLong("duration"));
        }
        if (jSONObject.has("email")) {
            setUserEmail(jSONObject.getString("email"));
        }
        if (jSONObject.has("name")) {
            setUserName(jSONObject.getString("name"));
        }
        if (jSONObject.has(KEY_PUSH_TOKEN)) {
            setPushToken(jSONObject.getString(KEY_PUSH_TOKEN));
        }
        if (jSONObject.has(KEY_INSTABUG_LOG)) {
            setInstabugLog(jSONObject.getString(KEY_INSTABUG_LOG));
        }
        if (jSONObject.has(KEY_LOCALE)) {
            setLocale(jSONObject.getString(KEY_LOCALE));
        }
        if (jSONObject.has(KEY_MEMORY_FREE)) {
            setFreeMemory(jSONObject.getLong(KEY_MEMORY_FREE));
        }
        if (jSONObject.has(KEY_MEMORY_TOTAL)) {
            setTotalMemory(jSONObject.getLong(KEY_MEMORY_TOTAL));
        }
        if (jSONObject.has(KEY_MEMORY_USED)) {
            setUsedMemory(jSONObject.getLong(KEY_MEMORY_USED));
        }
        if (jSONObject.has("orientation")) {
            setScreenOrientation(jSONObject.getString("orientation"));
        }
        if (jSONObject.has("os")) {
            setOS(jSONObject.getString("os"));
        }
        if (jSONObject.has(KEY_APP_STATUS)) {
            setAppStatus(jSONObject.getString(KEY_APP_STATUS));
        }
        if (jSONObject.has(KEY_REPORTED_AT)) {
            setReportedAt(jSONObject.getLong(KEY_REPORTED_AT));
        }
        if (jSONObject.has(KEY_SCREEN_SIZE)) {
            setScreenSize(jSONObject.getString(KEY_SCREEN_SIZE));
        }
        if (jSONObject.has("sdk_version")) {
            setSdkVersion(jSONObject.getString("sdk_version"));
        }
        if (jSONObject.has(KEY_STORAGE_FREE)) {
            setFreeStorage(jSONObject.getLong(KEY_STORAGE_FREE));
        }
        if (jSONObject.has(KEY_STORAGE_TOTAL)) {
            setTotalStorage(jSONObject.getLong(KEY_STORAGE_TOTAL));
        }
        if (jSONObject.has(KEY_STORAGE_USED)) {
            setUsedStorage(jSONObject.getLong(KEY_STORAGE_USED));
        }
        if (jSONObject.has(KEY_TAGS)) {
            setTags(jSONObject.getString(KEY_TAGS));
        }
        if (jSONObject.has(KEY_USER_DATA)) {
            setUserData(jSONObject.getString(KEY_USER_DATA));
        }
        if (jSONObject.has(KEY_USER_STEPS)) {
            JSONArray jSONArray2 = new JSONArray(jSONObject.getString(KEY_USER_STEPS));
            ArrayList arrayList2 = new ArrayList();
            if (jSONArray2.length() > 0) {
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    i iVar = new i();
                    iVar.fromJson(jSONArray2.getJSONObject(i2).toString());
                    arrayList2.add(iVar);
                }
            }
            setUserSteps(arrayList2);
        }
        if (jSONObject.has(KEY_WIFI_SSID)) {
            setWifiSSID(jSONObject.getString(KEY_WIFI_SSID));
        }
        if (jSONObject.has(KEY_WIFI_STATE)) {
            setWifiState(jSONObject.getBoolean(KEY_WIFI_STATE));
        }
        if (jSONObject.has("user_attributes")) {
            setUserAttributes(jSONObject.getString("user_attributes"));
        }
        if (jSONObject.has(KEY_NETWORK_LOGS)) {
            setNetworkLogs(jSONObject.getString(KEY_NETWORK_LOGS));
        }
        if (jSONObject.has("user_events")) {
            setUserEvents(jSONObject.getString("user_events"));
        }
        if (jSONObject.has(KEY_VISUAL_USER_STEPS)) {
            setVisualUserSteps(VisualUserStep.fromJson(new JSONArray(jSONObject.getString(KEY_VISUAL_USER_STEPS))));
        }
        if (jSONObject.has(KEY_SESSIONS_PROFILER)) {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString(KEY_SESSIONS_PROFILER));
            e eVar = new e();
            try {
                JSONArray jSONArray3 = jSONObject2.getJSONObject("battery").getJSONArray("timeline");
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
                    JSONObject jSONObject3 = jSONArray3.getJSONObject(i3);
                    com.instabug.library.n.b.a.a aVar2 = new com.instabug.library.n.b.a.a((float) jSONObject3.getDouble("v"), jSONObject3.getBoolean("plugged"));
                    aVar2.c = jSONObject3.getDouble("t");
                    concurrentLinkedQueue.add(aVar2);
                }
                eVar.c = concurrentLinkedQueue;
                eVar.d = com.instabug.library.n.b.a.b.c(jSONObject2.getJSONObject("connectivity").getJSONArray("timeline"));
                JSONArray jSONArray4 = jSONObject2.getJSONObject("orientation").getJSONArray("timeline");
                ConcurrentLinkedQueue concurrentLinkedQueue2 = new ConcurrentLinkedQueue();
                for (int i4 = 0; i4 < jSONArray4.length(); i4++) {
                    JSONObject jSONObject4 = jSONArray4.getJSONObject(i4);
                    d dVar = new d(jSONObject4.getString("v"));
                    dVar.c = jSONObject4.getDouble("t");
                    concurrentLinkedQueue2.add(dVar);
                }
                eVar.q = concurrentLinkedQueue2;
                eVar.x = com.instabug.library.n.b.a.c.c(jSONObject2.getJSONObject("memory").getJSONArray("timeline"));
                eVar.y = com.instabug.library.n.b.a.c.c(jSONObject2.getJSONObject("storage").getJSONArray("timeline"));
            } catch (JSONException e) {
                e.printStackTrace();
            }
            setSessionProfilerTimeline(eVar);
        }
        if (jSONObject.has(KEY_EXPERIMENTS)) {
            setExperiments(jSONObject.getJSONArray(KEY_EXPERIMENTS));
        }
    }

    public String getAppPackageName() {
        return this.appPackageName;
    }

    public String getAppStatus() {
        return this.appStatus;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public String getBatteryState() {
        return this.batteryState;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public JSONArray getConsoleLog() {
        ArrayList<a> arrayList = this.consoleLog;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<a> it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put((Object) new JSONObject(it.next().toJson()));
                } catch (JSONException e) {
                    InstabugSDKLogger.addVerboseLog(a.class, e.toString());
                }
            }
        }
        return jSONArray;
    }

    public String getCurrentView() {
        return this.currentView;
    }

    public String getCustomUserAttribute() {
        return this.customUserAttribute;
    }

    public String getDevice() {
        return this.device;
    }

    public long getDuration() {
        return this.duration;
    }

    public JSONArray getExperiments() {
        return this.experiments;
    }

    public long getFreeMemory() {
        return this.freeMemory;
    }

    public String getInstabugLog() {
        return this.instabugLog;
    }

    public String getLocale() {
        return this.locale;
    }

    public ArrayList<StateItem> getLogsItems() {
        ArrayList<StateItem> arrayList = new ArrayList<>();
        arrayList.add(new StateItem().setKey(KEY_CONSOLE_LOG).setValue(getConsoleLog().toString()));
        arrayList.add(new StateItem().setKey(KEY_INSTABUG_LOG).setValue(getInstabugLog()));
        arrayList.add(new StateItem().setKey(KEY_USER_DATA).setValue(getUserData()));
        arrayList.add(new StateItem().setKey(KEY_NETWORK_LOGS).setValue(getNetworkLogs()));
        arrayList.add(new StateItem().setKey("user_events").setValue(getUserEvents()));
        Feature.State h = z.j().h(Feature.TRACK_USER_STEPS);
        Feature.State state = Feature.State.ENABLED;
        if (h == state) {
            arrayList.add(new StateItem().setKey(KEY_USER_STEPS).setValue(getUserSteps().toString()));
        }
        if (z.j().h(Feature.REPRO_STEPS) == state) {
            arrayList.add(new StateItem().setKey(KEY_VISUAL_USER_STEPS).setValue(getVisualUserSteps()));
        }
        if (z.j().h(Feature.SESSION_PROFILER) == state && this.sessionProfilerTimeline != null) {
            arrayList.add(new StateItem().setKey(KEY_SESSIONS_PROFILER).setValue(getSessionProfilerTimeline()));
        }
        return arrayList;
    }

    public String getNetworkLogs() {
        return this.networkLogs;
    }

    public String getOS() {
        return this.OS;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public long getReportedAt() {
        return this.reportedAt;
    }

    public String getScreenDensity() {
        return this.screenDensity;
    }

    public String getScreenOrientation() {
        return this.ScreenOrientation;
    }

    public String getScreenSize() {
        return this.screenSize;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public ArrayList<StateItem> getStateItems() {
        ArrayList<StateItem> arrayList = new ArrayList<>();
        arrayList.add(new StateItem().setKey(KEY_APP_PACKAGE_NAME).setValue(getAppPackageName()));
        arrayList.add(new StateItem().setKey("app_version").setValue(getAppVersion()));
        arrayList.add(new StateItem().setKey(KEY_BATTERY_LEVEL).setValue(Integer.valueOf(getBatteryLevel())));
        arrayList.add(new StateItem().setKey(KEY_BATTERY_STATUS).setValue(getBatteryState()));
        arrayList.add(new StateItem().setKey("carrier").setValue(getCarrier()));
        arrayList.add(new StateItem().setKey(KEY_CURRENT_VIEW).setValue(getCurrentView()));
        arrayList.add(new StateItem().setKey(KEY_DENSITY).setValue(getScreenDensity()));
        arrayList.add(new StateItem().setKey("device").setValue(getDevice()));
        arrayList.add(new StateItem().setKey(KEY_DEVICE_ROOTED).setValue(Boolean.valueOf(isDeviceRooted())));
        arrayList.add(new StateItem().setKey("duration").setValue(Long.valueOf(getDuration())));
        arrayList.add(new StateItem().setKey("email").setValue(getUserEmail()));
        arrayList.add(new StateItem().setKey("name").setValue(getUserName()));
        arrayList.add(new StateItem().setKey(KEY_PUSH_TOKEN).setValue(getPushToken()));
        arrayList.add(new StateItem().setKey(KEY_LOCALE).setValue(getLocale()));
        arrayList.add(new StateItem().setKey(KEY_MEMORY_FREE).setValue(Long.valueOf(getFreeMemory())));
        arrayList.add(new StateItem().setKey(KEY_MEMORY_TOTAL).setValue(Long.valueOf(getTotalMemory())));
        arrayList.add(new StateItem().setKey(KEY_MEMORY_USED).setValue(Long.valueOf(getUsedMemory())));
        arrayList.add(new StateItem().setKey("orientation").setValue(getScreenOrientation()));
        arrayList.add(new StateItem().setKey("os").setValue(getOS()));
        arrayList.add(new StateItem().setKey(KEY_REPORTED_AT).setValue(Long.valueOf(getReportedAt())));
        arrayList.add(new StateItem().setKey(KEY_SCREEN_SIZE).setValue(getScreenSize()));
        arrayList.add(new StateItem().setKey("sdk_version").setValue(getSdkVersion()));
        arrayList.add(new StateItem().setKey(KEY_STORAGE_FREE).setValue(Long.valueOf(getFreeStorage())));
        arrayList.add(new StateItem().setKey(KEY_STORAGE_TOTAL).setValue(Long.valueOf(getTotalStorage())));
        arrayList.add(new StateItem().setKey(KEY_STORAGE_USED).setValue(Long.valueOf(getUsedStorage())));
        arrayList.add(new StateItem().setKey(KEY_TAGS).setValue(getTags()));
        arrayList.add(new StateItem().setKey(KEY_WIFI_SSID).setValue(getWifiSSID()));
        arrayList.add(new StateItem().setKey(KEY_WIFI_STATE).setValue(Boolean.valueOf(isWifiEnable())));
        arrayList.add(new StateItem().setKey("user_attributes").setValue(getUserAttributes()));
        arrayList.add(new StateItem().setKey(KEY_APP_STATUS).setValue(getAppStatus()));
        arrayList.add(new StateItem().setKey(KEY_EXPERIMENTS).setValue(getExperiments()));
        return arrayList;
    }

    public String getTags() {
        return this.tags;
    }

    public long getTotalMemory() {
        return this.totalMemory;
    }

    public long getTotalStorage() {
        return this.totalStorage;
    }

    public Uri getUri() {
        return this.uri;
    }

    public long getUsedMemory() {
        return this.usedMemory;
    }

    public long getUsedStorage() {
        return this.usedStorage;
    }

    public String getUserAttributes() {
        return this.userAttributes;
    }

    public String getUserData() {
        return this.userData;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public String getUserEvents() {
        return this.userEvents;
    }

    public String getUserName() {
        return this.userName;
    }

    public JSONArray getUserSteps() {
        ArrayList<i> arrayList = this.userSteps;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put((Object) new JSONObject(it.next().toJson()));
                } catch (JSONException e) {
                    InstabugSDKLogger.v("UserStep", e.toString());
                }
            }
        }
        return jSONArray;
    }

    public String getVisualUserSteps() {
        return VisualUserStep.toJsonString(this.visualUserSteps);
    }

    public String getWifiSSID() {
        return this.wifiSSID;
    }

    public int hashCode() {
        return String.valueOf(getReportedAt()).hashCode();
    }

    public boolean isDeviceRooted() {
        return this.isDeviceRooted;
    }

    public boolean isWifiEnable() {
        return this.wifiState;
    }

    public State setAppPackageName(String str) {
        this.appPackageName = str;
        return this;
    }

    public State setAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    public State setBatteryLevel(int i) {
        this.batteryLevel = i;
        return this;
    }

    public State setBatteryState(String str) {
        this.batteryState = str;
        return this;
    }

    public State setCarrier(String str) {
        this.carrier = str;
        return this;
    }

    public State setCurrentView(String str) {
        this.currentView = str;
        return this;
    }

    public void setCustomUserAttribute(String str) {
        this.customUserAttribute = str;
    }

    public State setDevice(String str) {
        this.device = str;
        return this;
    }

    public State setDuration(long j) {
        this.duration = j;
        return this;
    }

    public void setExperiments(JSONArray jSONArray) {
        this.experiments = jSONArray;
    }

    public State setFreeMemory(long j) {
        this.freeMemory = j;
        return this;
    }

    public void setInstabugLog(String str) {
        this.instabugLog = str;
    }

    public State setLocale(String str) {
        this.locale = str;
        return this;
    }

    public State setOS(String str) {
        this.OS = str;
        return this;
    }

    public State setPushToken(String str) {
        this.pushToken = str;
        return this;
    }

    public State setScreenDensity(String str) {
        this.screenDensity = str;
        return this;
    }

    public State setScreenOrientation(String str) {
        this.ScreenOrientation = str;
        return this;
    }

    public State setScreenSize(String str) {
        this.screenSize = str;
        return this;
    }

    public State setTags(String str) {
        this.tags = str;
        return this;
    }

    public State setTotalMemory(long j) {
        this.totalMemory = j;
        return this;
    }

    public void setUri(Uri uri2) {
        this.uri = uri2;
    }

    public State setUserAttributes(String str) {
        this.userAttributes = str;
        return this;
    }

    public State setUserData(String str) {
        this.userData = str;
        return this;
    }

    public State setUserEmail(String str) {
        this.userEmail = str;
        return this;
    }

    public State setUserEvents(String str) {
        this.userEvents = str;
        return this;
    }

    public State setUserName(String str) {
        this.userName = str;
        return this;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ArrayList<StateItem> stateItems = getStateItems();
        for (int i = 0; i < stateItems.size(); i++) {
            jSONObject.put(stateItems.get(i).getKey(), stateItems.get(i).getValue());
        }
        ArrayList<StateItem> logsItems = getLogsItems();
        for (int i2 = 0; i2 < logsItems.size(); i2++) {
            jSONObject.put(logsItems.get(i2).getKey(), logsItems.get(i2).getValue());
        }
        return jSONObject.toString();
    }

    public String toString() {
        try {
            return toJson();
        } catch (JSONException e) {
            e.printStackTrace();
            InstabugSDKLogger.e(TAG, "Something went wrong while getting state.toString()" + e.getMessage(), e);
            return "error";
        }
    }

    public void updateConsoleLog() {
        setConsoleLog(Builder.getConsoleLog());
    }

    public void updateUserEvents() throws JSONException {
        setUserEvents(UserEvent.toJson(InstabugUserEventLogger.getInstance().getUserEvents()).toString());
    }

    public void updateVisualUserSteps() {
        setVisualUserSteps(Builder.getVisualUserSteps());
    }

    public State setTags(List<String> list) {
        this.tags = getTagsAsString(list);
        return this;
    }

    public void updateConsoleLog(ArrayList<a> arrayList) {
        setConsoleLog(Builder.getConsoleLog(arrayList));
    }
}
