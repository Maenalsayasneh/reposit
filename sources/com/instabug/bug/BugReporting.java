package com.instabug.bug;

import android.text.TextUtils;
import com.instabug.bug.h.a$a;
import com.instabug.bug.invocation.Option;
import com.instabug.bug.settings.AttachmentsTypesParams;
import com.instabug.chat.ChatsDelegate;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.extendedbugreport.ExtendedBugReport;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.OnInvokeCallback;
import com.instabug.library.invocation.util.InstabugFloatingButtonEdge;
import com.instabug.library.invocation.util.InstabugVideoRecordingButtonPosition;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

public class BugReporting {
    private static final String TAG = "BugReporting";

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ReportType {
        public static final int BUG = 0;
        public static final int FEEDBACK = 1;
        public static final int QUESTION = 2;
    }

    public static class a implements VoidRunnable {
        public final /* synthetic */ InstabugInvocationEvent[] a;

        /* renamed from: com.instabug.bug.BugReporting$a$a  reason: collision with other inner class name */
        public class C0092a implements k0.b.y.d<SDKCoreEvent> {
            public C0092a() {
            }

            public void b(Object obj) throws Exception {
                SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
                if (sDKCoreEvent.getType().equals("sdk_state") && sDKCoreEvent.getValue().equals("built")) {
                    InvocationManager.getInstance().setInstabugInvocationEvent(a.this.a);
                }
            }
        }

        public a(InstabugInvocationEvent[] instabugInvocationEventArr) {
            this.a = instabugInvocationEventArr;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setInvocationEvents", i0.d.a.a.a.O("instabugInvocationEvent", InstabugInvocationEvent.class).setValue(TextUtils.join(InstabugDbContract.COMMA_SEP, this.a)));
            if (Instabug.isBuilding()) {
                SDKCoreEventSubscriber.subscribe(new C0092a());
            } else {
                InvocationManager.getInstance().setInstabugInvocationEvent(this.a);
            }
        }
    }

    public static class b implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setExtendedBugReportState", i0.d.a.a.a.O("setAutoScreenRecordingEnabled", Boolean.class).setValue(String.valueOf(this.a)));
            InstabugSDKLogger.i(BugReporting.TAG, "setAutoScreenRecordingEnabled: " + this.a);
            boolean z = this.a;
            InstabugSDKLogger.i("BugReportingWrapper", "setAutoScreenRecordingEnabled: " + z);
            if (!z || !InstabugCore.isAutoScreenRecordingEnabled()) {
                InstabugCore.setAutoScreenRecordingEnabled(z);
                if (z) {
                    InternalAutoScreenRecorderHelper.getInstance().start();
                }
            }
        }
    }

    public static class c implements VoidRunnable {
        public final /* synthetic */ int[] a;

        public class a implements Runnable {

            /* renamed from: com.instabug.bug.BugReporting$c$a$a  reason: collision with other inner class name */
            public class C0093a implements k0.b.y.d<SDKCoreEvent> {
                public C0093a() {
                }

                public void b(Object obj) throws Exception {
                    SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
                    if (sDKCoreEvent.getType().equals("sdk_state") && sDKCoreEvent.getValue().equals("built")) {
                        i0.h.a.b.c.m.b.r(c.this.a);
                    }
                }
            }

            public a() {
            }

            public void run() {
                AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setExtendedBugReportState", i0.d.a.a.a.O("types", int[].class));
                if (Instabug.isBuilding()) {
                    SDKCoreEventSubscriber.subscribe(new C0093a());
                } else {
                    i0.h.a.b.c.m.b.r(c.this.a);
                }
            }
        }

        public c(int[] iArr) {
            this.a = iArr;
        }

        public void run() {
            PoolProvider.postIOTaskWithCheck(new a());
        }
    }

    public static class d implements VoidRunnable {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.show", i0.d.a.a.a.N("type").setType(Integer.TYPE));
            i0.h.a.b.c.m.b.f(this.a);
        }
    }

    public static class e implements VoidRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ int[] b;

        public e(int i, int[] iArr) {
            this.a = i;
            this.b = iArr;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.show", i0.d.a.a.a.N("type").setType(Integer.TYPE));
            int i = this.a;
            i0.h.a.b.c.m.b.i(this.b);
            i0.h.a.b.c.m.b.f(i);
        }
    }

    public static class f implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                Class<Feature.State> cls = Feature.State.class;
                AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setState", i0.d.a.a.a.O("state", cls));
                if (f.this.a == null) {
                    InstabugSDKLogger.w(BugReporting.TAG, "state object passed to BugReporting.setState() is null");
                    return;
                }
                AnalyticsWrapper.getInstance().catchApiUsage("setState", i0.d.a.a.a.O("state", cls));
                Feature.State state = f.this.a;
                InstabugSDKLogger.i("BugReportingWrapper", "setQuestionState: " + state);
                Feature.State state2 = Feature.State.DISABLED;
                if (state == state2) {
                    InstabugCore.setChatsState(state2);
                    InstabugCore.setMessagingState(state2);
                } else {
                    Feature.State state3 = Feature.State.ENABLED;
                    if (state == state3) {
                        Objects.requireNonNull(i0.j.b.s.a.h());
                        if (i0.j.b.s.b.a().l.b.get("ask a question").booleanValue()) {
                            InstabugCore.setChatsState(state3);
                            InstabugCore.setMessagingState(state3);
                        }
                    }
                }
                InstabugSDKLogger.i("BugReportingWrapper", "setState: " + state);
                InstabugCore.setBugReportingState(state);
                InvocationManager.getInstance().notifyInvocationOptionChanged();
            }
        }

        public f(Feature.State state) {
            this.a = state;
        }

        public void run() {
            PoolProvider.postIOTaskWithCheck(new a());
        }
    }

    public static class g implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public g(Feature.State state) {
            this.a = state;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setViewHierarchyState", i0.d.a.a.a.O("state", Feature.State.class).setValue(this.a));
            InstabugSDKLogger.i(BugReporting.TAG, "setViewHierarchyState: " + this.a);
            InstabugCore.setFeatureState(Feature.VIEW_HIERARCHY_V2, this.a);
        }
    }

    public static class h implements VoidRunnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;

        public h(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public void run() {
            Class<Boolean> cls = Boolean.class;
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setAttachmentTypesEnabled", i0.d.a.a.a.O("initialScreenshot", cls).setValue(Boolean.toString(this.a)), i0.d.a.a.a.O("extraScreenshot", cls).setValue(Boolean.toString(this.b)), i0.d.a.a.a.O("galleryImage", cls).setValue(Boolean.toString(this.c)), i0.d.a.a.a.O("screenRecording", cls).setValue(Boolean.toString(this.d)));
            InstabugCore.setInitialScreenShotAllowed(this.a);
            boolean z = this.a;
            boolean z2 = this.b;
            boolean z3 = this.c;
            boolean z4 = this.d;
            InstabugSDKLogger.i("BugReportingWrapper", "setAttachementTypes: initialScreenshot: " + z + " extraScreenshot: " + z2 + " imageFromGallery: " + z3 + "screenRecording: " + z4);
            AttachmentsTypesParams attachmentsTypesParams = new AttachmentsTypesParams(z, z2, z3, z4);
            Objects.requireNonNull(i0.j.b.s.a.h());
            i0.j.b.s.b.a().b = attachmentsTypesParams;
            ChatsDelegate.setAttachmentTypesEnabled(z2, z3, z4);
        }
    }

    public static class i implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public i(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setScreenshotByMediaProjectionEnabled", new Api.Parameter[0]);
            InstabugSDKLogger.i(BugReporting.TAG, "setScreenshotByMediaProjectionEnabled: " + this.a);
            SettingsManager.getInstance().setScreenshotByMediaProjectionEnabled(this.a);
        }
    }

    public static /* synthetic */ class j {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        static {
            /*
                com.instabug.library.extendedbugreport.ExtendedBugReport.State.values()
                r0 = 3
                int[] r0 = new int[r0]
                a = r0
                com.instabug.library.extendedbugreport.ExtendedBugReport$State r1 = com.instabug.library.extendedbugreport.ExtendedBugReport.State.ENABLED_WITH_REQUIRED_FIELDS     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.extendedbugreport.ExtendedBugReport$State r1 = com.instabug.library.extendedbugreport.ExtendedBugReport.State.ENABLED_WITH_OPTIONAL_FIELDS     // Catch:{ NoSuchFieldError -> 0x001c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.BugReporting.j.<clinit>():void");
        }
    }

    public static class k implements VoidRunnable {
        public final /* synthetic */ int[] a;

        public k(int[] iArr) {
            this.a = iArr;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setOptions", i0.d.a.a.a.O("options", int[].class));
            i0.h.a.b.c.m.b.i(this.a);
        }
    }

    public static class l implements VoidRunnable {
        public final /* synthetic */ OnInvokeCallback a;

        public l(OnInvokeCallback onInvokeCallback) {
            this.a = onInvokeCallback;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setOnInvokeCallback", i0.d.a.a.a.O("setOnInvokeCallback", Runnable.class));
            InstabugSDKLogger.i(BugReporting.TAG, "setInvokeCallback");
            SettingsManager.getInstance().setOnInvokeCallback(this.a);
        }
    }

    public static class m implements VoidRunnable {
        public final /* synthetic */ OnSdkDismissCallback a;

        public m(OnSdkDismissCallback onSdkDismissCallback) {
            this.a = onSdkDismissCallback;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setOnDismissCallback", i0.d.a.a.a.O("OnSdkDismissCallback", OnSdkDismissCallback.class));
            InstabugSDKLogger.i(BugReporting.TAG, "OnSdkDismissCallback");
            ChatsDelegate.setOnSdkDismissCallback(this.a);
            i0.j.b.s.a h = i0.j.b.s.a.h();
            OnSdkDismissCallback onSdkDismissCallback = this.a;
            Objects.requireNonNull(h);
            i0.j.b.s.b.a().h = onSdkDismissCallback;
            SettingsManager.getInstance().setOnSdkDismissCallback(this.a);
        }
    }

    public static class n implements VoidRunnable {
        public final /* synthetic */ int a;

        public class a implements k0.b.y.d<SDKCoreEvent> {
            public a() {
            }

            public void b(Object obj) throws Exception {
                SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
                if (sDKCoreEvent.getType().equals("sdk_state") && sDKCoreEvent.getValue().equals("built")) {
                    InvocationManager.getInstance().getCurrentInvocationSettings().setShakingThreshold(n.this.a);
                }
            }
        }

        public n(int i) {
            this.a = i;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setShakingThreshold", i0.d.a.a.a.N("threshold").setType(Integer.TYPE).setValue(Integer.toString(this.a)));
            InstabugSDKLogger.i(BugReporting.TAG, "setShakingThreshold: " + this.a);
            if (Instabug.isBuilding()) {
                SDKCoreEventSubscriber.subscribe(new a());
            } else {
                InvocationManager.getInstance().getCurrentInvocationSettings().setShakingThreshold(this.a);
            }
        }
    }

    public static class o implements VoidRunnable {
        public final /* synthetic */ InstabugFloatingButtonEdge a;

        public class a implements k0.b.y.d<SDKCoreEvent> {
            public a() {
            }

            public void b(Object obj) throws Exception {
                SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
                if (sDKCoreEvent.getType().equals("sdk_state") && sDKCoreEvent.getValue().equals("built")) {
                    InvocationManager.getInstance().getCurrentInvocationSettings().setFloatingButtonEdge(o.this.a);
                }
            }
        }

        public o(InstabugFloatingButtonEdge instabugFloatingButtonEdge) {
            this.a = instabugFloatingButtonEdge;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setFloatingButtonEdge", i0.d.a.a.a.O("instabugFloatingButtonEdge", InstabugFloatingButtonEdge.class).setValue(this.a));
            InstabugSDKLogger.i(BugReporting.TAG, "setFloatingButtonEdge: " + this.a);
            if (Instabug.isBuilding()) {
                SDKCoreEventSubscriber.subscribe(new a());
            } else {
                InvocationManager.getInstance().getCurrentInvocationSettings().setFloatingButtonEdge(this.a);
            }
        }
    }

    public static class p implements VoidRunnable {
        public final /* synthetic */ int a;

        public class a implements k0.b.y.d<SDKCoreEvent> {
            public a() {
            }

            public void b(Object obj) throws Exception {
                SDKCoreEvent sDKCoreEvent = (SDKCoreEvent) obj;
                if (sDKCoreEvent.getType().equals("sdk_state") && sDKCoreEvent.getValue().equals("built")) {
                    InvocationManager.getInstance().getCurrentInvocationSettings().setFloatingButtonOffsetFromTop(p.this.a);
                }
            }
        }

        public p(int i) {
            this.a = i;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setFloatingButtonOffset", i0.d.a.a.a.N("floatingButtonOffsetFromTop").setType(Integer.TYPE).setValue(Integer.toString(this.a)));
            InstabugSDKLogger.i(BugReporting.TAG, "setFloatingButtonOffset: " + this.a);
            if (Instabug.isBuilding()) {
                SDKCoreEventSubscriber.subscribe(new a());
            } else {
                InvocationManager.getInstance().getCurrentInvocationSettings().setFloatingButtonOffsetFromTop(this.a);
            }
        }
    }

    public static class q implements VoidRunnable {
        public final /* synthetic */ InstabugVideoRecordingButtonPosition a;

        public q(InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition) {
            this.a = instabugVideoRecordingButtonPosition;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setVideoRecordingFloatingButtonPosition", i0.d.a.a.a.O("instabugViewRecordingButtonPosition", InstabugVideoRecordingButtonPosition.class).setValue(this.a));
            InstabugSDKLogger.i(BugReporting.TAG, "setVideoRecordingFloatingButtonPosition: " + this.a);
            InvocationManager.getInstance().getCurrentInvocationSettings().setVideoRecordingButtonPosition(this.a);
        }
    }

    public static class r implements VoidRunnable {
        public final /* synthetic */ ExtendedBugReport.State a;

        public r(ExtendedBugReport.State state) {
            this.a = state;
        }

        public void run() {
            a$a a_a;
            if (this.a == null) {
                InstabugSDKLogger.w(BugReporting.TAG, "state object passed to BugReporting.setExtendedBugReportState() is null");
                return;
            }
            AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setExtendedBugReportState", new Api.Parameter[0]);
            InstabugSDKLogger.i(BugReporting.TAG, "setExtendedBugReportState: " + this.a);
            int i = j.a[this.a.ordinal()];
            if (i == 1) {
                a_a = a$a.ENABLED_WITH_REQUIRED_FIELDS;
            } else if (i != 2) {
                a_a = a$a.DISABLED;
            } else {
                a_a = a$a.ENABLED_WITH_OPTIONAL_FIELDS;
            }
            Objects.requireNonNull(i0.j.b.s.a.h());
            i0.j.b.s.b.a().f = a_a;
        }
    }

    public static void setAttachmentTypesEnabled(boolean z, boolean z2, boolean z3, boolean z4) {
        APIChecker.checkAndRun("BugReporting.setAttachmentTypesEnabled", new h(z, z2, z3, z4));
    }

    public static void setAutoScreenRecordingEnabled(boolean z) {
        APIChecker.checkAndRun("BugReporting.setAutoScreenRecordingEnabled", new b(z));
    }

    public static void setExtendedBugReportState(ExtendedBugReport.State state) {
        APIChecker.checkAndRun("BugReporting.setExtendedBugReportState", new r(state));
    }

    public static void setFloatingButtonEdge(InstabugFloatingButtonEdge instabugFloatingButtonEdge) {
        APIChecker.checkAndRun("BugReporting.setFloatingButtonEdge", new o(instabugFloatingButtonEdge));
    }

    public static void setFloatingButtonOffset(int i2) {
        APIChecker.checkAndRun("BugReporting.setFloatingButtonOffset", new p(i2));
    }

    public static void setInvocationEvents(InstabugInvocationEvent... instabugInvocationEventArr) {
        APIChecker.checkAndRun("BugReporting.setInvocationEvents", new a(instabugInvocationEventArr));
    }

    public static void setOnDismissCallback(OnSdkDismissCallback onSdkDismissCallback) {
        APIChecker.checkAndRun("BugReporting.setOnDismissCallback", new m(onSdkDismissCallback));
    }

    public static void setOnInvokeCallback(OnInvokeCallback onInvokeCallback) {
        APIChecker.checkAndRun("BugReporting.setOnInvokeCallback", new l(onInvokeCallback));
    }

    public static void setOptions(@Option int... iArr) {
        APIChecker.checkAndRun("BugReporting.NonNull", new k(iArr));
    }

    public static void setReportTypes(@ReportType int... iArr) {
        APIChecker.checkAndRun("BugReporting.setReportTypes", new c(iArr));
    }

    public static void setScreenshotByMediaProjectionEnabled(boolean z) {
        APIChecker.checkAndRun("BugReporting.setScreenshotByMediaProjectionEnabled", new i(z));
    }

    public static void setScreenshotRequired(boolean z) {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("BugReporting.setScreenshotRequired", i0.d.a.a.a.N("screenshotRequired").setType(Boolean.TYPE));
        InstabugSDKLogger.i(TAG, "setScreenshotRequired: " + z);
        Objects.requireNonNull(i0.j.b.s.a.h());
        i0.j.b.s.b.a().g = z;
    }

    public static void setShakingThreshold(int i2) {
        APIChecker.checkAndRun("BugReporting.setShakingThreshold", new n(i2));
    }

    public static void setState(Feature.State state) {
        APIChecker.checkAndRun("BugReporting.setState", new f(state));
    }

    public static void setVideoRecordingFloatingButtonPosition(InstabugVideoRecordingButtonPosition instabugVideoRecordingButtonPosition) {
        APIChecker.checkAndRun("BugReporting.setVideoRecordingFloatingButtonPosition", new q(instabugVideoRecordingButtonPosition));
    }

    public static void setViewHierarchyState(Feature.State state) {
        APIChecker.checkAndRun("BugReporting.setViewHierarchyState", new g(state));
    }

    public static void show(@ReportType int i2) {
        APIChecker.checkAndRun("BugReporting.show", new d(i2));
    }

    public static void show(@ReportType int i2, @Option int... iArr) {
        APIChecker.checkAndRun("BugReporting.show", new e(i2, iArr));
    }
}
