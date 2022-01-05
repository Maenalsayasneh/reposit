package com.instabug.survey;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.cache.OnDiskCache;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.user.UserManagerWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.TimeUtils;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.announcements.network.InstabugAnnouncementSubmitterService;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;
import com.instabug.survey.network.service.InstabugSurveysSubmitterService;
import i0.j.f.h;
import i0.j.f.j;
import i0.j.f.k;
import i0.j.f.l.g;
import i0.j.f.p.i;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class SurveyPlugin extends Plugin {
    private g announcementManager;
    private k0.b.w.a subscribe;
    private k0.b.w.a userTypeDisposable;

    public class a implements Runnable {
        public final /* synthetic */ Context c;

        public a(Context context) {
            this.c = context;
        }

        public void run() {
            Context context = this.c;
            if (context != null) {
                i0.j.f.o.b.a = new i0.j.f.o.b(context);
            }
            SurveyPlugin.this.initAnnouncementSettings(this.c);
            SurveyPlugin.this.subscribeOnSDKEvents();
        }
    }

    public class b implements k0.b.y.d<SDKCoreEvent> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
            if (SurveyPlugin.this.contextWeakReference != null && SurveyPlugin.this.contextWeakReference.get() != null && h.i() != null) {
                if (sDKCoreEvent.getType().equals("user") && sDKCoreEvent.getValue().equals(SDKCoreEvent.User.VALUE_LOGGED_OUT)) {
                    Objects.requireNonNull(h.i());
                    UserManagerWrapper.getUUIDAsync(new j());
                    Objects.requireNonNull(g.a((Context) SurveyPlugin.this.contextWeakReference.get()));
                    UserManagerWrapper.getUUIDAsync(new i0.j.f.l.e());
                } else if (sDKCoreEvent.getType().equals("user") && sDKCoreEvent.getValue().equals(SDKCoreEvent.User.VALUE_LOGGED_IN)) {
                    h i = h.i();
                    Objects.requireNonNull(i);
                    PoolProvider.postIOTask(new k(i));
                    g a = g.a((Context) SurveyPlugin.this.contextWeakReference.get());
                    Objects.requireNonNull(a);
                    PoolProvider.postIOTask(new i0.j.f.l.f(a));
                }
            }
        }
    }

    public class c implements k0.b.y.d<SDKCoreEvent> {
        public c() {
        }

        public void b(Object obj) throws Exception {
            SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
            if (i.c()) {
                String type = sDKCoreEvent.getType();
                type.hashCode();
                char c2 = 65535;
                switch (type.hashCode()) {
                    case -290659267:
                        if (type.equals(SDKCoreEvent.Feature.TYPE_FEATURES)) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3599307:
                        if (type.equals("user")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1843485230:
                        if (type.equals(SDKCoreEvent.Network.TYPE_NETWORK)) {
                            c2 = 2;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        if (sDKCoreEvent.getValue().equals(SDKCoreEvent.Feature.VALUE_FETCHED)) {
                            SurveyPlugin.this.startFetchingRequests();
                            return;
                        }
                        return;
                    case 1:
                        if (sDKCoreEvent.getValue().equals(SDKCoreEvent.User.VALUE_LOGGED_OUT)) {
                            SurveyPlugin.clearUserActivities();
                            return;
                        }
                        return;
                    case 2:
                        if (sDKCoreEvent.getValue().equals(SDKCoreEvent.Network.VALUE_ACTIVATED)) {
                            SurveyPlugin.this.startSubmittingPendingSurveys();
                            SurveyPlugin.this.startSubmittingPendingAnnouncements();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ Context c;

        public d(Context context) {
            this.c = context;
        }

        public void run() {
            List<com.instabug.survey.e.c.a> readyToBeSend = AnnouncementCacheManager.getReadyToBeSend();
            if (readyToBeSend != null && !readyToBeSend.isEmpty() && NetworkManager.isOnline(this.c)) {
                InstabugAnnouncementSubmitterService.a(this.c, new Intent(this.c, InstabugAnnouncementSubmitterService.class));
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ Context c;

        public e(Context context) {
            this.c = context;
        }

        public void run() {
            List<Survey> readyToSendSurveys = SurveysCacheManager.getReadyToSendSurveys();
            if (SurveyPlugin.this.contextWeakReference != null && readyToSendSurveys != null && !readyToSendSurveys.isEmpty() && NetworkManager.isOnline(this.c)) {
                InstabugSurveysSubmitterService.a(this.c, new Intent(this.c, InstabugSurveysSubmitterService.class));
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        public void run() {
            int i = i0.j.f.o.c.b;
            boolean z = false;
            if (i0.j.f.o.b.b() != null) {
                z = i0.j.f.o.b.b().b.getBoolean("should_remove_old_survey_cache_file", false);
            }
            if (!z) {
                InstabugSDKLogger.v(this, "Creating Surveys disk cache");
                if (SurveyPlugin.this.contextWeakReference != null && SurveyPlugin.this.contextWeakReference.get() != null) {
                    new OnDiskCache((Context) SurveyPlugin.this.contextWeakReference.get(), SurveysCacheManager.SURVEYS_DISK_CACHE_KEY, SurveysCacheManager.SURVEYS_DISK_CACHE_FILE_NAME, Survey.class).delete();
                    if (i0.j.f.o.b.b() != null) {
                        i0.j.f.o.b b = i0.j.f.o.b.b();
                        b.c.putBoolean("should_remove_old_survey_cache_file", true);
                        b.c.apply();
                    }
                }
            }
        }
    }

    private void checkAppStatus() {
        Context context;
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            int i = i0.j.f.o.c.b;
            if (i0.j.f.o.a.a().i == null) {
                StringBuilder P0 = i0.d.a.a.a.P0("https://play.google.com/store/apps/details?id=");
                P0.append(context.getPackageName());
                String sb = P0.toString();
                NetworkManager networkManager = new NetworkManager();
                Request request = new Request(sb, NetworkManager.RequestType.NORMAL);
                request.setRequestMethod(Request.RequestMethod.Get);
                networkManager.doRequest(request).v(k0.b.d0.a.c()).c(new i0.j.f.p.a());
            }
        }
    }

    /* access modifiers changed from: private */
    public static void clearUserActivities() {
        if (i0.j.f.o.b.b() != null) {
            i0.j.f.o.b.b().a(0);
            i0.j.f.o.b b2 = i0.j.f.o.b.b();
            b2.c.putLong("survey_resolve_country_code_last_fetch", 0);
            b2.c.apply();
        }
    }

    private String getLocaleResolved() {
        if (getAppContext() == null) {
            return "default";
        }
        return LocaleUtils.getCurrentLocaleResolved(getAppContext());
    }

    /* access modifiers changed from: private */
    public void initAnnouncementSettings(Context context) {
        this.announcementManager = g.a(context);
        i0.j.f.l.i.b.a = new i0.j.f.l.i.b(context);
    }

    private void removeOldSurveys() {
        PoolProvider.postIOTask(new f());
    }

    /* access modifiers changed from: private */
    public void startFetchingRequests() {
        startFetchingSurveys(getLocaleResolved());
        startFetchingAnnouncements(getLocaleResolved());
        resolveCountryInfo(new i0.j.f.q.a());
    }

    /* access modifiers changed from: private */
    public void startSubmittingPendingAnnouncements() {
        if (InstabugCore.getFeatureState(Feature.ANNOUNCEMENTS) == Feature.State.ENABLED) {
            WeakReference<Context> weakReference = this.contextWeakReference;
            if (weakReference != null) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    PoolProvider.postIOTask(new d(context));
                } else {
                    InstabugSDKLogger.e(this, "Context is null.");
                }
            } else {
                InstabugSDKLogger.e(this, "Context WeakReference is null.");
            }
        }
    }

    /* access modifiers changed from: private */
    public void startSubmittingPendingSurveys() {
        if (InstabugCore.getFeatureState(Feature.SURVEYS) == Feature.State.ENABLED) {
            WeakReference<Context> weakReference = this.contextWeakReference;
            if (weakReference != null) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    PoolProvider.postIOTask(new e(context));
                } else {
                    InstabugSDKLogger.e(this, "Context is null.");
                }
            } else {
                InstabugSDKLogger.e(this, "Context WeakReference is null.");
            }
        }
    }

    private void unSubscribeOnSDKEvents() {
        k0.b.w.a aVar = this.subscribe;
        if (aVar != null && !aVar.isDisposed()) {
            this.subscribe.dispose();
        }
    }

    public long getLastActivityTime() {
        if (i0.j.f.o.b.b() == null) {
            return -1;
        }
        return i0.j.f.o.b.b().b.getLong("last_survey_time", 0);
    }

    public void init(Context context) {
        super.init(context);
    }

    public void onLocaleChanged(Locale locale, Locale locale2) {
        super.onLocaleChanged(locale, locale2);
        if (shouldReFetch() && getAppContext() != null) {
            String resolveLocale = LocaleUtils.resolveLocale(getAppContext(), locale2);
            startFetchingAnnouncements(resolveLocale);
            startFetchingSurveys(resolveLocale);
        }
    }

    public void resolveCountryInfo(i0.j.f.q.a aVar) {
        WeakReference<Context> weakReference;
        long j;
        if (InstabugCore.isFeatureAvailable(Feature.SURVEYS) && (weakReference = this.contextWeakReference) != null && weakReference.get() != null && h.i() != null) {
            InstabugSDKLogger.d(this, "Getting Country Code...");
            h i = h.i();
            Objects.requireNonNull(i);
            try {
                String a2 = i0.j.f.o.c.a();
                long j2 = i0.j.f.o.c.a;
                if (a2 != null) {
                    aVar.fromJson(a2);
                    j2 = aVar.x;
                }
                long currentTimeMillis = TimeUtils.currentTimeMillis();
                if (i0.j.f.o.b.b() == null) {
                    j = -1;
                } else {
                    j = i0.j.f.o.b.b().b.getLong("survey_resolve_country_code_last_fetch", 0);
                }
                if (currentTimeMillis - j > TimeUnit.DAYS.toMillis(j2)) {
                    WeakReference<Context> weakReference2 = i.b;
                    if (weakReference2 != null && weakReference2.get() != null) {
                        i.f.a((Context) i.b.get());
                        return;
                    }
                    return;
                }
                i.b(aVar);
            } catch (JSONException e2) {
                e2.printStackTrace();
                InstabugSDKLogger.e(i, "Can't resolve country info due to: " + e2.getMessage());
            }
        }
    }

    public boolean shouldReFetch() {
        String str;
        String localeResolved = getLocaleResolved();
        int i = i0.j.f.o.c.b;
        if (i0.j.f.o.b.b() == null) {
            str = null;
        } else {
            str = i0.j.f.o.a.a().h;
        }
        return !localeResolved.equals(str);
    }

    public void sleep() {
        g gVar = this.announcementManager;
        Objects.requireNonNull(gVar);
        if (i0.j.f.l.i.b.a() != null) {
            i0.j.f.l.i.b a2 = i0.j.f.l.i.b.a();
            a2.c.putString("announcements_app_latest_version", InstabugDeviceProperties.getAppVersion(gVar.b));
            a2.c.apply();
        }
        if (h.i() != null) {
            h i = h.i();
            synchronized (i) {
                i.g();
                Objects.requireNonNull(i0.j.f.m.c.a());
                Objects.requireNonNull(i0.j.f.m.c.a());
                i0.j.f.m.c a3 = i0.j.f.m.c.a();
                a3.c = null;
                a3.b = null;
                if (h.a != null) {
                    h.a = null;
                }
            }
        }
        k0.b.w.a aVar = this.userTypeDisposable;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    public void start(Context context) {
        PoolProvider.postIOTaskWithCheck(new a(context));
    }

    public void startFetchingAnnouncements(String str) {
        Feature feature;
        Feature.State state;
        long j;
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference != null && weakReference.get() != null && InstabugCore.getFeatureState((feature = Feature.ANNOUNCEMENTS)) == (state = Feature.State.ENABLED)) {
            InstabugSDKLogger.v(this, "initialize Instabug Announcement Manager");
            g a2 = g.a((Context) this.contextWeakReference.get());
            if (a2.b != null) {
                try {
                    if (InstabugCore.isFeaturesFetchedBefore()) {
                        if (InstabugCore.getFeatureState(feature) == state) {
                            long currentTimeMillis = TimeUtils.currentTimeMillis();
                            Objects.requireNonNull(i0.j.f.l.i.a.a());
                            if (i0.j.f.l.i.b.a() == null) {
                                j = -1;
                            } else {
                                j = i0.j.f.l.i.b.a().b.getLong("announcements_last_fetch_time", 0);
                            }
                            if (currentTimeMillis - j > 10000) {
                                if (i0.j.f.b.b.b.a == null) {
                                    i0.j.f.b.b.b.a = new i0.j.f.b.b.b();
                                }
                                i0.j.f.b.b.b.a.a(a2.b, str, new i0.j.f.l.b(a2));
                                return;
                            }
                            com.instabug.survey.e.c.a a3 = a2.e().a();
                            if (a3 != null) {
                                PoolProvider.postIOTask(new i0.j.f.l.c(a2, a3));
                            }
                        }
                    }
                } catch (JSONException e2) {
                    a2.d(e2);
                    InstabugSDKLogger.e(g.class, e2.getMessage(), e2);
                }
            }
        }
    }

    public void startFetchingSurveys(String str) {
        WeakReference<Context> weakReference;
        if (InstabugCore.isAppOnForeground() && InstabugCore.isFeaturesFetchedBefore() && i.c() && (weakReference = this.contextWeakReference) != null && weakReference.get() != null && h.i() != null) {
            InstabugSDKLogger.v(this, "initialize Instabug Surveys Manager");
            h i = h.i();
            Objects.requireNonNull(i);
            if (str != null) {
                i.g.debounce((Runnable) new i0.j.f.g(i, str));
            }
        }
    }

    public void stop() {
        i0.j.f.o.b.a = null;
        synchronized (i0.j.f.o.a.class) {
            i0.j.f.o.a.a = null;
        }
        unSubscribeOnSDKEvents();
    }

    public void subscribeOnSDKEvents() {
        if (this.subscribe == null) {
            this.subscribe = SDKCoreEventSubscriber.subscribe(new c());
        }
    }

    public void wake() {
        removeOldSurveys();
        h.j();
        if (h.i() != null) {
            Objects.requireNonNull(h.i());
            InstabugCore.doOnBackground(new i0.j.f.i());
        }
        startFetchingRequests();
        checkAppStatus();
        this.userTypeDisposable = SDKCoreEventSubscriber.subscribe(new b());
    }
}
