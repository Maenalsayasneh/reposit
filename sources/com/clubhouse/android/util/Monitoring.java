package com.clubhouse.android.util;

import android.app.Application;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.analytics.AmplitudeAnalytics$setUserId$1;
import com.clubhouse.android.shared.FeatureFlags;
import com.clubhouse.android.shared.Flag;
import com.clubhouse.android.shared.auth.UserManager;
import com.instabug.bug.BugReporting;
import com.instabug.crash.CrashReporting;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.ui.onboarding.WelcomeMessage;
import h0.b0.v;
import i0.e.b.f3.e;
import i0.e.b.f3.i.a;
import i0.e.b.h3.a.b;
import i0.j.f.p.h;
import io.sentry.Sentry;
import io.sentry.protocol.User;
import java.io.File;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.f0;

/* compiled from: Monitoring.kt */
public final class Monitoring {
    public final f0 a;
    public final Application b;
    public final a c;

    @m0.l.f.a.c(c = "com.clubhouse.android.util.Monitoring$1", f = "Monitoring.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.util.Monitoring$1  reason: invalid class name */
    /* compiled from: Monitoring.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, c<? super m0.i>, Object> {
        public /* synthetic */ int c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(aVar, this, cVar);
            r02.c = ((Number) obj).intValue();
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            Integer valueOf = Integer.valueOf(((Number) obj).intValue());
            AnonymousClass1 r02 = new AnonymousClass1(aVar, this, (c) obj2);
            r02.c = valueOf.intValue();
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            int i = this.c;
            i0.e.a.a aVar = aVar;
            Integer num = new Integer(i);
            AmplitudeAnalytics amplitudeAnalytics = (AmplitudeAnalytics) aVar;
            Objects.requireNonNull(amplitudeAnalytics);
            amplitudeAnalytics.c(new AmplitudeAnalytics$setUserId$1(num));
            User user = new User();
            user.setId(String.valueOf(i));
            Sentry.setUser(user);
            Monitoring monitoring = this;
            Objects.requireNonNull(monitoring);
            if (v.J0()) {
                monitoring.a(i, true, true);
            } else {
                b bVar = monitoring.c.d;
                if (bVar != null) {
                    FeatureFlags e = ((i0.e.b.f3.h) h.L0(bVar, i0.e.b.f3.h.class)).e();
                    m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(e.b(Flag.Instabug), new Monitoring$initInstabugIfNeeded$1$1(monitoring, i, e, (c<? super Monitoring$initInstabugIfNeeded$1$1>) null)), monitoring.a);
                }
            }
            return m0.i.a;
        }
    }

    public Monitoring(UserManager userManager, e eVar, final i0.e.a.a aVar, f0 f0Var, Application application, a aVar2) {
        i.e(userManager, "userManager");
        i.e(eVar, "environment");
        i.e(aVar, "analytics");
        i.e(f0Var, "coroutineScope");
        i.e(application, "application");
        i.e(aVar2, "userComponentHandler");
        this.a = f0Var;
        this.b = application;
        this.c = aVar2;
        new Instabug.Builder(application, "3db7bc1d6a5b1ed5504cbad8d337edf4").setInvocationEvents(InstabugInvocationEvent.SHAKE).build(Feature.State.DISABLED);
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(userManager.f, new AnonymousClass1((c<? super AnonymousClass1>) null)), f0Var);
    }

    public final void a(int i, boolean z, boolean z2) {
        if (z) {
            Instabug.enable();
            Instabug.setWelcomeMessageState(WelcomeMessage.State.DISABLED);
            Instabug.setUserAttribute("UserId", String.valueOf(i));
            BugReporting.setShakingThreshold(350);
            CrashReporting.setState(Feature.State.DISABLED);
            if (z2) {
                Application application = this.b;
                i.e(application, "<this>");
                String k = i.k(application.getPackageName(), ".provider");
                i.e(application, "<this>");
                Uri b2 = FileProvider.a(application, k).b(new File(application.getFilesDir(), "clubhouse.log").getAbsoluteFile());
                i.d(b2, "getUriForFile(this, \"$packageName.provider\", audioLog().absoluteFile)");
                Instabug.addFileAttachment(b2, "clubhouse.log");
            }
        } else if (Instabug.isEnabled()) {
            Instabug.removeUserAttribute("UserId");
            Instabug.disable();
        }
    }
}
