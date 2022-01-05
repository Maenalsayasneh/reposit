package com.clubhouse.android.ui.profile.settings;

import android.content.res.Resources;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.notification.NotificationFrequency;
import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.clubhouse.android.data.repos.NotificationRepo;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.shared.FeatureFlags;
import com.clubhouse.android.shared.Flag;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.android.shared.preferences.Key;
import com.clubhouse.android.user.model.UserSelf;
import h0.b0.v;
import i0.b.b.j0;
import i0.e.b.a3.b.c;
import i0.e.b.f3.k.b;
import i0.e.b.g3.u.z5.d1;
import i0.e.b.g3.u.z5.w0;
import i0.e.b.g3.u.z5.w1;
import i0.e.b.g3.u.z5.x1;
import i0.e.b.g3.u.z5.y1;
import i0.e.b.g3.u.z5.z0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel extends i0.e.b.a3.b.a<d1> {
    public static final /* synthetic */ int m = 0;
    public final UserManager n;
    public final i0.e.a.a o;
    public final Resources p;
    public final b q;
    public final NotificationRepo r;
    public final UserRepo s;
    public final FeatureFlags t;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.settings.SettingsViewModel$1", f = "SettingsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.settings.SettingsViewModel$1  reason: invalid class name */
    /* compiled from: SettingsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ SettingsViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            c cVar = (c) this.c;
            if (i.a(cVar, w0.a)) {
                SettingsViewModel settingsViewModel = this.d;
                int i = SettingsViewModel.m;
                Objects.requireNonNull(settingsViewModel);
                MavericksViewModel.f(settingsViewModel, new SettingsViewModel$logout$1(settingsViewModel, (m0.l.c<? super SettingsViewModel$logout$1>) null), (d0) null, (m) null, new SettingsViewModel$logout$2(settingsViewModel), 3, (Object) null);
            } else if (cVar instanceof x1) {
                SettingsViewModel settingsViewModel2 = this.d;
                boolean z = ((x1) cVar).a;
                int i2 = SettingsViewModel.m;
                Objects.requireNonNull(settingsViewModel2);
                MavericksViewModel.f(settingsViewModel2, new SettingsViewModel$updateSendFewer$1(settingsViewModel2, z, (m0.l.c<? super SettingsViewModel$updateSendFewer$1>) null), (d0) null, (m) null, new SettingsViewModel$updateSendFewer$2(z, settingsViewModel2), 3, (Object) null);
            } else if (cVar instanceof w1) {
                SettingsViewModel settingsViewModel3 = this.d;
                NotificationPause notificationPause = ((w1) cVar).a;
                int i3 = SettingsViewModel.m;
                Objects.requireNonNull(settingsViewModel3);
                MavericksViewModel.f(settingsViewModel3, new SettingsViewModel$updateNotificationPause$1(settingsViewModel3, notificationPause, (m0.l.c<? super SettingsViewModel$updateNotificationPause$1>) null), (d0) null, (m) null, new SettingsViewModel$updateNotificationPause$2(notificationPause, settingsViewModel3), 3, (Object) null);
            } else if (cVar instanceof y1) {
                SettingsViewModel settingsViewModel4 = this.d;
                boolean z2 = ((y1) cVar).a;
                b bVar = settingsViewModel4.q;
                Objects.requireNonNull(bVar);
                bVar.g(Key.SPATIAL_AUDIO, z2);
            } else if (cVar instanceof z0) {
                SettingsViewModel settingsViewModel5 = this.d;
                int i4 = SettingsViewModel.m;
                Objects.requireNonNull(settingsViewModel5);
                MavericksViewModel.f(settingsViewModel5, new SettingsViewModel$getSettings$1(settingsViewModel5, (m0.l.c<? super SettingsViewModel$getSettings$1>) null), (d0) null, (m) null, new SettingsViewModel$getSettings$2(settingsViewModel5), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel(d1 d1Var, UserManager userManager, i0.e.a.a aVar, Resources resources, b bVar, i0.e.b.f3.i.a aVar2) {
        super(d1Var);
        Class cls = i0.e.b.c3.i.a.class;
        i.e(d1Var, "initialState");
        i.e(userManager, "userManager");
        i.e(aVar, "analytics");
        i.e(resources, "resources");
        i.e(bVar, "userPreferences");
        i.e(aVar2, "userComponentHandler");
        this.n = userManager;
        this.o = aVar;
        this.p = resources;
        this.q = bVar;
        this.r = ((i0.e.b.c3.i.a) h.L0(aVar2, cls)).j();
        this.s = ((i0.e.b.c3.i.a) h.L0(aVar2, cls)).c();
        this.t = ((i0.e.b.f3.h) h.L0(aVar2, i0.e.b.f3.h.class)).e();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        m(new l<d1, d1>(this) {
            public final /* synthetic */ SettingsViewModel c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                d1 d1Var = (d1) obj;
                i.e(d1Var, "$this$setState");
                UserSelf value = this.c.n.d.getValue();
                boolean z = v.J0() || StringsKt__IndentKt.d("production", "local", false, 2) || this.c.t.a(Flag.DebugView);
                boolean a = this.c.t.a(Flag.EnableDirectPaymentsRegistration);
                boolean a2 = this.c.t.a(Flag.EnableAudioSpatialization);
                b bVar = this.c.q;
                Objects.requireNonNull(bVar);
                return d1.copy$default(d1Var, value, false, (NotificationFrequency) null, (NotificationPause) null, false, false, false, false, false, bVar.a(Key.SPATIAL_AUDIO, true), z, a, a2, 510, (Object) null);
            }
        });
    }

    /* compiled from: SettingsViewModel.kt */
    public static final class a implements i0.b.b.v<SettingsViewModel, d1> {
        public final /* synthetic */ i0.e.b.c3.h.c<SettingsViewModel, d1> a = new i0.e.b.c3.h.c<>(SettingsViewModel.class);

        public a() {
        }

        public SettingsViewModel create(j0 j0Var, d1 d1Var) {
            i.e(j0Var, "viewModelContext");
            i.e(d1Var, "state");
            return this.a.create(j0Var, d1Var);
        }

        public d1 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
