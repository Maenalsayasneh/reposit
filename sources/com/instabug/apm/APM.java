package com.instabug.apm;

import android.app.Activity;
import android.os.Looper;
import com.instabug.apm.model.ExecutionTrace;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.ReturnableRunnable;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.model.StepType;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import com.pubnub.api.builder.PubNubErrorBuilder;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class APM {
    /* access modifiers changed from: private */
    public static i0.j.a.c apmImplementation = i0.j.a.g.a.h();

    public static class a implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsage("APM.setEnabled", i0.d.a.a.a.N("enabled").setType(Boolean.TYPE).setValue(Boolean.valueOf(this.a)));
            i0.j.a.c access$000 = APM.apmImplementation;
            boolean z = this.a;
            Objects.requireNonNull(access$000);
            i0.j.a.e.c cVar = (i0.j.a.e.c) i0.j.a.g.a.g();
            if (cVar.m() || !z) {
                i0.j.a.e.d dVar = cVar.c;
                dVar.a.put("IS_APM_SDK_ENABLED", Boolean.valueOf(z));
                if (!z) {
                    i0.j.a.g.a.f("execution_traces_thread_executor").execute(new i0.j.a.b(i0.j.a.g.a.r()));
                    access$000.a();
                    i0.j.a.g.a.f("network_log_thread_executor").execute(new i0.j.a.a(new i0.j.a.h.c.c()));
                    access$000.b();
                    synchronized (i0.j.a.g.a.class) {
                        i0.j.a.g.a.e = null;
                        i0.j.a.g.a.d = null;
                        i0.j.a.g.a.f = null;
                        i0.j.a.g.a.g = null;
                        i0.j.a.g.a.i = null;
                        i0.j.a.g.a.j = null;
                        i0.j.a.g.a.q = null;
                        i0.j.a.g.a.p = null;
                        i0.j.a.g.a.t = null;
                    }
                    return;
                }
                return;
            }
            access$000.a.f("APM wasn't enabled as it seems to be disabled for your Instabug company account. Please, contact support to switch it on for you.");
        }
    }

    public static class b implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsage("APM.setAppLaunchEnabled", i0.d.a.a.a.N("enabled").setType(Boolean.TYPE).setValue(Boolean.valueOf(this.a)));
            i0.j.a.c access$000 = APM.apmImplementation;
            boolean z = this.a;
            Objects.requireNonNull(access$000);
            i0.j.a.e.c cVar = (i0.j.a.e.c) i0.j.a.g.a.g();
            if (!cVar.a() && z) {
                access$000.a.f("App launch wasn't enabled. Please make sure to enable APM first by following the instructions at this link: https://docs.instabug.com/reference#enable-or-disable-apm");
            } else if (!cVar.b()) {
                access$000.a.f("App launch wasn't enabled as the feature seems to be disabled for your Instabug company account. Please contact support for more information.");
            } else {
                i0.j.a.e.d dVar = cVar.c;
                dVar.a.put("LAUNCHES_SDK_ENABLED", Boolean.valueOf(z));
                if (!z) {
                    access$000.a();
                }
            }
        }
    }

    public static class c implements ReturnableRunnable<ExecutionTrace> {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        public Object run() throws Exception {
            AnalyticsWrapper.getInstance().catchApiUsage("APM.startExecutionTrace", i0.d.a.a.a.O("name", String.class).setValue(this.a));
            i0.j.a.c access$000 = APM.apmImplementation;
            String str = this.a;
            Objects.requireNonNull(access$000);
            if (str == null || str.trim().isEmpty()) {
                access$000.a.f("Execution trace wasn't created. Execution trace name can't be empty or null.");
                return null;
            }
            i0.j.a.e.c cVar = (i0.j.a.e.c) i0.j.a.g.a.g();
            if (!cVar.a()) {
                access$000.a.d("Execution trace \"$s\" wasn't created. Please make sure to enable APM first by following the instructions at this link: https://docs.instabug.com/reference#enable-or-disable-apm".replace("$s", str));
                return null;
            } else if (!cVar.k()) {
                access$000.a.d("Execution trace \"$s\" wasn't started as the feature seems to be disabled for your Instabug company account. Please contact support for more information.".replace("$s", str));
                return null;
            } else {
                String trim = str.trim();
                if (trim.length() > 150) {
                    trim = trim.substring(0, PubNubErrorBuilder.PNERR_SPACE_MISSING);
                    access$000.a.g("Execution trace \"$s\" was truncated as it was too long. Please limit trace names to 150 characters.".replace("$s", str));
                }
                return new ExecutionTrace(trim);
            }
        }
    }

    public static class d implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsage("APM.setAutoUITraceEnabled", i0.d.a.a.a.N("enabled").setType(Boolean.TYPE).setValue(Boolean.valueOf(this.a)));
            i0.j.a.c access$000 = APM.apmImplementation;
            boolean z = this.a;
            Objects.requireNonNull(access$000);
            i0.j.a.e.c cVar = (i0.j.a.e.c) i0.j.a.g.a.g();
            if (!cVar.a() && z) {
                access$000.a.f("Auto UI Trace wasn't enabled. Please make sure to enable APM first by following the instructions at this link: https://docs.instabug.com/reference#enable-or-disable-apm");
            } else if (!cVar.f()) {
                access$000.a.f("Auto UI Trace wasn't enabled as the feature seems to be disabled for your Instabug company account. Please contact support for more information.");
            } else {
                i0.j.a.e.d dVar = cVar.c;
                dVar.a.put("UI_TRACE_SDK_ENABLED", Boolean.valueOf(z));
                if (!z) {
                    access$000.b();
                }
            }
        }
    }

    public static class e implements VoidRunnable {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsage("APM.setLogLevel", i0.d.a.a.a.N("level").setType(Integer.TYPE).setValue(Integer.valueOf(this.a)));
            i0.j.a.c access$000 = APM.apmImplementation;
            int i = this.a;
            Objects.requireNonNull(access$000);
            i0.j.a.e.b g = i0.j.a.g.a.g();
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
                ((i0.j.a.e.c) g).c.a.put("LOG_LEVEL", Integer.valueOf(i));
                return;
            }
            i0.j.a.n.a.a aVar = access$000.a;
            String replace = i0.j.a.f.a.a.replace("$s1", String.valueOf(i));
            int c = ((i0.j.a.e.c) g).c();
            aVar.g(replace.replace("$s2", c != 0 ? c != 1 ? c != 2 ? c != 3 ? c != 4 ? c != 5 ? StepType.UNKNOWN : "VERBOSE" : "DEBUG" : "INFO" : "WARNING" : "ERROR" : "NONE"));
        }
    }

    public static class f implements VoidRunnable {
        public final /* synthetic */ String a;

        public f(String str) {
            this.a = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsage("APM.startUITrace", i0.d.a.a.a.O("name", String.class).setValue(this.a));
            i0.j.a.c access$000 = APM.apmImplementation;
            String str = this.a;
            Objects.requireNonNull(access$000);
            if (str == null || str.trim().isEmpty()) {
                access$000.a.f("Custom UI Trace wasn't created. Trace name can't be empty or null.");
            } else if (Looper.myLooper() != Looper.getMainLooper()) {
                access$000.a.d("Custom UI Trace \"$name\" wasn't started as it was called from a non-main thread. Please make sure to start Custom UI Traces from the main thread.".replace("$name", str));
            } else {
                i0.j.a.e.c cVar = (i0.j.a.e.c) i0.j.a.g.a.g();
                if (!cVar.a()) {
                    access$000.a.d("Custom UI Trace \"$s\" wasn't started. Please make sure to enable APM first by following the instructions at this link: https://docs.instabug.com/reference#enable-or-disable-apm".replace("$s", str));
                } else if (!cVar.f()) {
                    access$000.a.d("Custom UI Trace \"$s\" wasn't started as the feature seems to be disabled for your Instabug company account. Please contact support for more information.".replace("$s", str));
                } else {
                    String trim = str.trim();
                    if (trim.length() > 150) {
                        trim = trim.substring(0, PubNubErrorBuilder.PNERR_SPACE_MISSING);
                        access$000.a.g("Custom UI Trace \"$s\" was truncated as it was too long. Please limit trace names to 150 characters.".replace("$s", str));
                    }
                    Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
                    if (currentActivity != null) {
                        i0.j.a.h.e.e.b bVar = (i0.j.a.h.e.e.b) i0.j.a.g.a.n();
                        if (bVar.e != null) {
                            i0.j.a.n.a.a aVar = bVar.c;
                            StringBuilder P0 = i0.d.a.a.a.P0("Existing Ui trace ");
                            P0.append(bVar.c());
                            P0.append(" need to be ended first");
                            String sb = P0.toString();
                            Objects.requireNonNull(aVar);
                            InstabugSDKLogger.p("Instabug - APM", sb);
                            if (bVar.c() != null) {
                                bVar.c.g("Custom UI Trace \"$s1\" has started and \"$s2\" has been ended. Please make sure to end traces before starting a new one by following the instructions at this link: https://docs.instabug.com/reference#end-ui-trace".replace("$s1", trim).replace("$s2", bVar.c()));
                            }
                            bVar.d(currentActivity);
                        }
                        i0.j.a.d.b.d dVar = ((i0.j.a.h.d.d) i0.j.a.g.a.a()).f;
                        if (dVar != null) {
                            i0.j.a.d.b.f fVar = new i0.j.a.d.b.f();
                            bVar.e = fVar;
                            fVar.n = dVar.getId();
                            i0.j.a.d.b.f fVar2 = bVar.e;
                            fVar2.b = trim;
                            fVar2.f = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
                            bVar.e.o = System.nanoTime();
                            i0.j.a.d.b.f fVar3 = bVar.e;
                            Objects.requireNonNull((i0.j.a.m.b.b) bVar.a);
                            fVar3.i = DeviceStateProvider.getBatteryLevel(currentActivity);
                            bVar.e.j = ((i0.j.a.m.b.b) bVar.a).c(currentActivity);
                            bVar.e.m = ((i0.j.a.m.b.b) bVar.a).a(currentActivity);
                            bVar.e.a = true;
                            bVar.f(currentActivity);
                            bVar.g(currentActivity);
                            i0.j.a.l.a aVar2 = bVar.d;
                            if (aVar2 != null) {
                                i0.j.a.l.b bVar2 = (i0.j.a.l.b) aVar2;
                                bVar2.a.postFrameCallback(bVar2);
                            }
                            i0.j.a.n.a.a aVar3 = bVar.c;
                            aVar3.e("Custom UI Trace  \"" + trim + "\" has started.");
                        }
                    }
                }
            }
        }
    }

    public static class g implements VoidRunnable {
        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsage("APM.endUITrace", new Api.Parameter[0]);
            i0.j.a.c access$000 = APM.apmImplementation;
            Objects.requireNonNull(access$000);
            i0.j.a.h.e.e.b bVar = (i0.j.a.h.e.e.b) i0.j.a.g.a.n();
            if (bVar.c() != null) {
                Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
                if (currentActivity != null) {
                    bVar.d(currentActivity);
                    return;
                }
                return;
            }
            access$000.a.f("Custom UI Trace wasn't ended. Please make sure to start a UI Trace first by following the instructions at this link: https://docs.instabug.com/reference#start-ui-trace");
        }
    }

    public static void endUITrace() {
        APIChecker.checkAndRun("APM.endUITrace", new g());
    }

    public static void setAppLaunchEnabled(boolean z) {
        APIChecker.checkAndRun("APM.setAppLaunchEnabled", new b(z));
    }

    public static void setAutoUITraceEnabled(boolean z) {
        APIChecker.checkAndRun("APM.setAutoUITraceEnabled", new d(z));
    }

    public static void setEnabled(boolean z) {
        APIChecker.checkAndRun("APM.setEnabled", new a(z));
    }

    public static void setLogLevel(int i) {
        APIChecker.checkAndRun("APM.setLogLevel", new e(i));
    }

    public static ExecutionTrace startExecutionTrace(String str) {
        return (ExecutionTrace) APIChecker.checkAndGet("APM.startExecutionTrace", new c(str), null);
    }

    public static void startUITrace(String str) {
        APIChecker.checkAndRun("APM.startUITrace", new f(str));
    }
}
