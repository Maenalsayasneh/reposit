package com.instabug.survey;

import android.annotation.SuppressLint;
import com.instabug.library.Feature;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.ReturnableRunnable;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.callbacks.OnDismissCallback;
import com.instabug.survey.callbacks.OnFinishCallback;
import com.instabug.survey.callbacks.OnShowCallback;
import com.instabug.survey.models.Survey;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Surveys {

    public static class a implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public a(Feature.State state) {
            this.a = state;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("setState(state: ");
            P0.append(this.a);
            P0.append(")");
            InstabugSDKLogger.i(Surveys.class, P0.toString());
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.setState", i0.d.a.a.a.O("state", Feature.State.class).setValue(this.a));
            InstabugCore.setFeatureState(Feature.SURVEYS, this.a);
            InstabugCore.setFeatureState(Feature.ANNOUNCEMENTS, this.a);
        }
    }

    public static class b implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.setIsAppStoreRatingEnabled", new Api.Parameter[0]);
            boolean z = this.a;
            int i = i0.j.f.o.c.b;
            i0.j.f.o.a.a().i = Boolean.valueOf(z);
        }
    }

    public static class c implements VoidRunnable {
        public final /* synthetic */ OnFinishCallback a;

        public c(OnFinishCallback onFinishCallback) {
            this.a = onFinishCallback;
        }

        public void run() throws Exception {
            StringBuilder P0 = i0.d.a.a.a.P0("setOnFinishCallback(onFinishCallback: ");
            P0.append(this.a);
            P0.append(")");
            InstabugSDKLogger.i(Surveys.class, P0.toString());
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.setOnFinishCallback", i0.d.a.a.a.O("setOnFinishCallback", Runnable.class));
            OnFinishCallback onFinishCallback = this.a;
            int i = i0.j.f.o.c.b;
            i0.j.f.o.a.a().f = onFinishCallback;
        }
    }

    public static class d implements ReturnableRunnable<Boolean> {
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object run() throws java.lang.Exception {
            /*
                r5 = this;
                java.lang.Class<com.instabug.survey.Surveys> r0 = com.instabug.survey.Surveys.class
                java.lang.String r1 = "showSurveyIfAvailable()"
                com.instabug.library.util.InstabugSDKLogger.i(r0, r1)
                com.instabug.library.analytics.AnalyticsWrapper r0 = com.instabug.library.analytics.AnalyticsWrapper.getInstance()
                r1 = 0
                com.instabug.library.analytics.model.Api$Parameter[] r2 = new com.instabug.library.analytics.model.Api.Parameter[r1]
                java.lang.String r3 = "Surveys.showSurveyIfAvailable"
                r0.catchApiUsageAsync(r3, r2)
                i0.j.f.h r0 = i0.j.f.h.i()
                r2 = 1
                if (r0 == 0) goto L_0x0068
                i0.j.f.h r0 = i0.j.f.h.i()
                java.util.Objects.requireNonNull(r0)
                boolean r3 = com.instabug.library.Instabug.isEnabled()
                if (r3 != 0) goto L_0x002f
                java.lang.Class<i0.j.f.h> r0 = i0.j.f.h.class
                java.lang.String r3 = "Instabug SDK is disabled."
                com.instabug.library.util.InstabugSDKLogger.d(r0, r3)
                goto L_0x0064
            L_0x002f:
                com.instabug.library.InstabugStateProvider r3 = com.instabug.library.InstabugStateProvider.getInstance()     // Catch:{ ParseException -> 0x0056 }
                com.instabug.library.InstabugState r3 = r3.getState()     // Catch:{ ParseException -> 0x0056 }
                com.instabug.library.InstabugState r4 = com.instabug.library.InstabugState.ENABLED     // Catch:{ ParseException -> 0x0056 }
                boolean r3 = r3.equals(r4)     // Catch:{ ParseException -> 0x0056 }
                if (r3 == 0) goto L_0x0064
                boolean r3 = i0.j.f.p.i.c()     // Catch:{ ParseException -> 0x0056 }
                if (r3 == 0) goto L_0x0064
                boolean r3 = com.instabug.library.Instabug.isAppOnForeground()     // Catch:{ ParseException -> 0x0056 }
                if (r3 == 0) goto L_0x0064
                com.instabug.survey.models.Survey r3 = r0.h()     // Catch:{ ParseException -> 0x0056 }
                if (r3 == 0) goto L_0x0064
                r0.e(r3)     // Catch:{ ParseException -> 0x0056 }
                r0 = r2
                goto L_0x0065
            L_0x0056:
                r0 = move-exception
                java.lang.Class<i0.j.f.n.b> r3 = i0.j.f.n.b.class
                java.lang.annotation.Annotation[] r3 = r3.getAnnotations()
                java.lang.String r4 = r0.getMessage()
                com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r0)
            L_0x0064:
                r0 = r1
            L_0x0065:
                if (r0 == 0) goto L_0x0068
                r1 = r2
            L_0x0068:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.Surveys.d.run():java.lang.Object");
        }
    }

    public static class e implements VoidRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void run() {
            AnalyticsWrapper instance = AnalyticsWrapper.getInstance();
            Api.Parameter N = i0.d.a.a.a.N("sessionsCount");
            Class cls = Integer.TYPE;
            instance.catchApiUsageAsync("Surveys.setThresholdForReshowingSurveyAfterDismiss", N.setType(cls).setValue(Integer.valueOf(this.a)), i0.d.a.a.a.O("daysCount", cls).setValue(Integer.valueOf(this.b)));
            InstabugSDKLogger.i(Surveys.class, "setThresholdForReshowingSurveyAfterDismiss(sessionsCount: " + this.a + ", daysCount: " + this.b + ")");
            int i = this.a;
            int i2 = this.b;
            int i3 = i0.j.f.o.c.b;
            if (i0.j.f.o.b.b() != null) {
                i0.j.f.o.b b2 = i0.j.f.o.b.b();
                b2.c.putInt("survey_reshow_after_session_count", i);
                b2.c.putInt("survey_reshow_after_days_count", i2);
                b2.c.putBoolean("survey_reshow_set_by_local_api", true);
                b2.c.apply();
            }
        }
    }

    public static class f implements ReturnableRunnable<List<Survey>> {
        public Object run() throws Exception {
            InstabugSDKLogger.i(Surveys.class, "getAvailableSurveys()");
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.getAvailableSurveys", new Api.Parameter[0]);
            List<Survey> list = null;
            if (i0.j.f.h.i() == null) {
                return null;
            }
            i0.j.f.p.j jVar = i0.j.f.h.i().d;
            Objects.requireNonNull(jVar);
            try {
                list = jVar.a(SurveysCacheManager.getTimeTriggeredSurveys());
            } catch (ParseException e) {
                InstabugSDKLogger.e(jVar, e.getMessage(), e);
            }
            LinkedList linkedList = new LinkedList();
            if (list != null) {
                for (Survey next : list) {
                    try {
                        if (jVar.d(next)) {
                            linkedList.add(new Survey(next.getId(), next.getTitle()));
                        }
                    } catch (ParseException e2) {
                        InstabugSDKLogger.e(jVar, e2.getMessage(), e2);
                    }
                }
            }
            return linkedList;
        }
    }

    public static class g implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public g(boolean z) {
            this.a = z;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("setAutoShowingEnabled(isAutoShowingEnabled: ");
            P0.append(this.a);
            P0.append(")");
            InstabugSDKLogger.i(Surveys.class, P0.toString());
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.setAutoShowingEnabled", i0.d.a.a.a.O("isAutoShowingEnabled", Boolean.class).setValue(Boolean.valueOf(this.a)));
            boolean z = this.a;
            int i = i0.j.f.o.c.b;
            i0.j.f.o.a.a().b = z;
        }
    }

    public static class h implements VoidRunnable {
        public final /* synthetic */ OnShowCallback a;

        public h(OnShowCallback onShowCallback) {
            this.a = onShowCallback;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("setOnShowCallback(onShowCallback: ");
            P0.append(this.a);
            P0.append(")");
            InstabugSDKLogger.i(Surveys.class, P0.toString());
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.setOnShowCallback", i0.d.a.a.a.O("setOnShowCallback", Runnable.class));
            OnShowCallback onShowCallback = this.a;
            int i = i0.j.f.o.c.b;
            i0.j.f.o.a.a().d = onShowCallback;
        }
    }

    public static class i implements VoidRunnable {
        public final /* synthetic */ OnDismissCallback a;

        public i(OnDismissCallback onDismissCallback) {
            this.a = onDismissCallback;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("setOnDismissCallback(onDismissCallback: ");
            P0.append(this.a);
            P0.append(")");
            InstabugSDKLogger.i(Surveys.class, P0.toString());
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.setOnDismissCallback", i0.d.a.a.a.O("setOnDismissCallback", Runnable.class));
            OnDismissCallback onDismissCallback = this.a;
            int i = i0.j.f.o.c.b;
            i0.j.f.o.a.a().e = onDismissCallback;
        }
    }

    public static class j implements ReturnableRunnable<Boolean> {
        public final /* synthetic */ String a;

        public j(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            if (r0 != false) goto L_0x0084;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object run() throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Class<com.instabug.survey.Surveys> r0 = com.instabug.survey.Surveys.class
                java.lang.String r1 = "showSurvey(token: "
                java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
                java.lang.String r2 = r6.a
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.instabug.library.util.InstabugSDKLogger.i(r0, r1)
                java.lang.String r1 = r6.a
                if (r1 == 0) goto L_0x0089
                java.lang.String r2 = "null"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0026
                goto L_0x0089
            L_0x0026:
                com.instabug.library.analytics.AnalyticsWrapper r0 = com.instabug.library.analytics.AnalyticsWrapper.getInstance()
                r1 = 1
                com.instabug.library.analytics.model.Api$Parameter[] r2 = new com.instabug.library.analytics.model.Api.Parameter[r1]
                java.lang.String r3 = "showSurvey"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.instabug.library.analytics.model.Api$Parameter r3 = i0.d.a.a.a.O(r3, r4)
                java.lang.String r4 = r6.a
                com.instabug.library.analytics.model.Api$Parameter r3 = r3.setValue(r4)
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "Surveys.showSurvey"
                r0.catchApiUsageAsync(r3, r2)
                i0.j.f.h r0 = i0.j.f.h.i()
                if (r0 == 0) goto L_0x0083
                i0.j.f.h r0 = i0.j.f.h.i()
                java.lang.String r2 = r6.a
                java.util.Objects.requireNonNull(r0)
                com.instabug.library.InstabugStateProvider r3 = com.instabug.library.InstabugStateProvider.getInstance()
                com.instabug.library.InstabugState r3 = r3.getState()
                com.instabug.library.InstabugState r5 = com.instabug.library.InstabugState.ENABLED
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L_0x007f
                boolean r3 = i0.j.f.p.i.c()
                if (r3 == 0) goto L_0x007f
                boolean r3 = com.instabug.library.Instabug.isAppOnForeground()
                if (r3 == 0) goto L_0x007f
                com.instabug.survey.models.Survey r2 = r0.a(r2)
                if (r2 == 0) goto L_0x007f
                boolean r3 = r2.isPaused()
                if (r3 != 0) goto L_0x007f
                r0.e(r2)
                r0 = r1
                goto L_0x0080
            L_0x007f:
                r0 = r4
            L_0x0080:
                if (r0 == 0) goto L_0x0083
                goto L_0x0084
            L_0x0083:
                r1 = r4
            L_0x0084:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                goto L_0x0094
            L_0x0089:
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "Optin survey token is NULL"
                com.instabug.library.util.InstabugSDKLogger.i(r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
            L_0x0094:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.Surveys.j.run():java.lang.Object");
        }
    }

    public static class k implements ReturnableRunnable<Boolean> {
        public final /* synthetic */ String a;

        public k(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0074, code lost:
            if (r0 != false) goto L_0x0078;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object run() throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Class<com.instabug.survey.Surveys> r0 = com.instabug.survey.Surveys.class
                java.lang.String r1 = "hasRespondToSurvey(token: "
                java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
                java.lang.String r2 = r6.a
                r1.append(r2)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.instabug.library.util.InstabugSDKLogger.i(r0, r1)
                java.lang.String r1 = r6.a
                if (r1 == 0) goto L_0x007d
                java.lang.String r2 = "null"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0026
                goto L_0x007d
            L_0x0026:
                com.instabug.library.analytics.AnalyticsWrapper r0 = com.instabug.library.analytics.AnalyticsWrapper.getInstance()
                r1 = 1
                com.instabug.library.analytics.model.Api$Parameter[] r2 = new com.instabug.library.analytics.model.Api.Parameter[r1]
                java.lang.String r3 = "token"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                com.instabug.library.analytics.model.Api$Parameter r3 = i0.d.a.a.a.O(r3, r4)
                java.lang.String r4 = r6.a
                com.instabug.library.analytics.model.Api$Parameter r3 = r3.setValue(r4)
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "Surveys.hasRespondToSurvey"
                r0.catchApiUsageAsync(r3, r2)
                i0.j.f.h r0 = i0.j.f.h.i()
                if (r0 == 0) goto L_0x0077
                i0.j.f.h r0 = i0.j.f.h.i()
                java.lang.String r2 = r6.a
                com.instabug.survey.models.Survey r3 = r0.a(r2)
                if (r3 == 0) goto L_0x005a
                boolean r0 = r3.isAnswered()
                goto L_0x0074
            L_0x005a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "No survey with token="
                r3.append(r5)
                r3.append(r2)
                java.lang.String r2 = " was found."
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                com.instabug.library.util.InstabugSDKLogger.e(r0, r2)
                r0 = r4
            L_0x0074:
                if (r0 == 0) goto L_0x0077
                goto L_0x0078
            L_0x0077:
                r1 = r4
            L_0x0078:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                goto L_0x0088
            L_0x007d:
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "Optin survey token is NULL"
                com.instabug.library.util.InstabugSDKLogger.i(r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
            L_0x0088:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.Surveys.k.run():java.lang.Object");
        }
    }

    public static class l implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public l(boolean z) {
            this.a = z;
        }

        public void run() {
            StringBuilder P0 = i0.d.a.a.a.P0("setShouldShowWelcomeScreen(shouldShow: ");
            P0.append(this.a);
            P0.append(")");
            InstabugSDKLogger.i(Surveys.class, P0.toString());
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.setShouldShowWelcomeScreen", i0.d.a.a.a.O("shouldShow", Boolean.class).setValue(Boolean.valueOf(this.a)));
            boolean z = this.a;
            int i = i0.j.f.o.c.b;
            i0.j.f.o.a.a().c = z;
        }
    }

    private static void enableCustomization() {
        InstabugSDKLogger.i(Surveys.class, "enableCustomization");
        AnalyticsWrapper.getInstance().catchApiUsageAsync("Surveys.enableCustomization", new Api.Parameter[0]);
        int i2 = i0.j.f.o.c.b;
        i0.j.f.o.a.a().j = true;
    }

    public static List<Survey> getAvailableSurveys() {
        return (List) APIChecker.checkAndGet("Surveys.getAvailableSurveys", new f(), null);
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public static boolean hasRespondToSurvey(String str) {
        return ((Boolean) APIChecker.checkAndGet("Surveys.hasRespondToSurvey", new k(str), Boolean.FALSE)).booleanValue();
    }

    public static void setAutoShowingEnabled(boolean z) {
        APIChecker.checkAndRun("Surveys.setAutoShowingEnabled", new g(z));
    }

    public static void setIsAppStoreRatingEnabled(boolean z) {
        APIChecker.checkAndRun("Surveys.setIsAppStoreRatingEnabled", new b(z));
    }

    public static void setOnDismissCallback(OnDismissCallback onDismissCallback) {
        APIChecker.checkAndRun("Surveys.setOnDismissCallback", new i(onDismissCallback));
    }

    public static void setOnFinishCallback(OnFinishCallback onFinishCallback) throws IllegalStateException {
        APIChecker.checkAndRun("Surveys.setOnFinishCallback", new c(onFinishCallback));
    }

    public static void setOnShowCallback(OnShowCallback onShowCallback) {
        APIChecker.checkAndRun("Surveys.setOnShowCallback", new h(onShowCallback));
    }

    public static void setShouldShowWelcomeScreen(boolean z) {
        APIChecker.checkAndRun("Surveys.setShouldShowWelcomeScreen", new l(z));
    }

    public static void setState(Feature.State state) {
        APIChecker.checkAndRun("Surveys.setState", new a(state));
    }

    @Deprecated
    public static void setThresholdForReshowingSurveyAfterDismiss(int i2, int i3) {
        APIChecker.checkAndRun("Surveys.setThresholdForReshowingSurveyAfterDismiss", new e(i2, i3));
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public static boolean showSurvey(String str) {
        return ((Boolean) APIChecker.checkAndGet("Surveys.showSurvey", new j(str), Boolean.FALSE)).booleanValue();
    }

    public static boolean showSurveyIfAvailable() {
        Boolean bool = (Boolean) APIChecker.checkAndGet("Surveys.showSurveyIfAvailable", new d(), Boolean.FALSE);
        return bool != null && bool.booleanValue();
    }
}
