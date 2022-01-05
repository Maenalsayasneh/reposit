package com.clubhouse.android.ui.profile.settings;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.NotificationRepo;
import com.clubhouse.android.shared.FeatureFlags;
import com.clubhouse.android.shared.Flag;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.u.z5.r1;
import i0.e.b.g3.u.z5.s1;
import i0.e.b.g3.u.z5.t1;
import i0.e.b.g3.u.z5.u1;
import i0.e.b.g3.u.z5.y0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: NotificationSettingsViewModel.kt */
public final class NotificationSettingsViewModel extends i0.e.b.a3.b.a<y0> {
    public static final /* synthetic */ int m = 0;
    public final i0.e.a.a n;
    public final NotificationRepo o;
    public final FeatureFlags p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.settings.NotificationSettingsViewModel$1", f = "NotificationSettingsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.settings.NotificationSettingsViewModel$1  reason: invalid class name */
    /* compiled from: NotificationSettingsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ NotificationSettingsViewModel d;

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
            if (cVar instanceof t1) {
                NotificationSettingsViewModel notificationSettingsViewModel = this.d;
                boolean z = ((t1) cVar).a;
                int i = NotificationSettingsViewModel.m;
                Objects.requireNonNull(notificationSettingsViewModel);
                MavericksViewModel.f(notificationSettingsViewModel, new NotificationSettingsViewModel$updateNotificationEnableRoom$1(notificationSettingsViewModel, z, (m0.l.c<? super NotificationSettingsViewModel$updateNotificationEnableRoom$1>) null), (d0) null, (m) null, new NotificationSettingsViewModel$updateNotificationEnableRoom$2(z, notificationSettingsViewModel), 3, (Object) null);
            } else if (cVar instanceof r1) {
                NotificationSettingsViewModel notificationSettingsViewModel2 = this.d;
                boolean z2 = ((r1) cVar).a;
                int i2 = NotificationSettingsViewModel.m;
                Objects.requireNonNull(notificationSettingsViewModel2);
                MavericksViewModel.f(notificationSettingsViewModel2, new NotificationSettingsViewModel$updateNotificationEnableBackchannel$1(notificationSettingsViewModel2, z2, (m0.l.c<? super NotificationSettingsViewModel$updateNotificationEnableBackchannel$1>) null), (d0) null, (m) null, new NotificationSettingsViewModel$updateNotificationEnableBackchannel$2(z2, notificationSettingsViewModel2), 3, (Object) null);
            } else if (cVar instanceof u1) {
                NotificationSettingsViewModel notificationSettingsViewModel3 = this.d;
                boolean z3 = ((u1) cVar).a;
                int i3 = NotificationSettingsViewModel.m;
                Objects.requireNonNull(notificationSettingsViewModel3);
                MavericksViewModel.f(notificationSettingsViewModel3, new NotificationSettingsViewModel$updateNotificationEnableTrending$1(notificationSettingsViewModel3, z3, (m0.l.c<? super NotificationSettingsViewModel$updateNotificationEnableTrending$1>) null), (d0) null, (m) null, new NotificationSettingsViewModel$updateNotificationEnableTrending$2(z3, notificationSettingsViewModel3), 3, (Object) null);
            } else if (cVar instanceof s1) {
                NotificationSettingsViewModel notificationSettingsViewModel4 = this.d;
                boolean z4 = ((s1) cVar).a;
                int i4 = NotificationSettingsViewModel.m;
                Objects.requireNonNull(notificationSettingsViewModel4);
                MavericksViewModel.f(notificationSettingsViewModel4, new NotificationSettingsViewModel$updateNotificationEnableOther$1(notificationSettingsViewModel4, z4, (m0.l.c<? super NotificationSettingsViewModel$updateNotificationEnableOther$1>) null), (d0) null, (m) null, new NotificationSettingsViewModel$updateNotificationEnableOther$2(z4, notificationSettingsViewModel4), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationSettingsViewModel(y0 y0Var, i0.e.a.a aVar, i0.e.b.f3.i.a aVar2) {
        super(y0Var);
        i.e(y0Var, "initialState");
        i.e(aVar, "analytics");
        i.e(aVar2, "userComponentHandler");
        this.n = aVar;
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar2, i0.e.b.c3.i.a.class)).j();
        this.p = ((i0.e.b.f3.h) h.L0(aVar2, i0.e.b.f3.h.class)).e();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        m(new l<y0, y0>(this) {
            public final /* synthetic */ NotificationSettingsViewModel c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                y0 y0Var = (y0) obj;
                i.e(y0Var, "$this$setState");
                return y0.copy$default(y0Var, false, false, false, false, this.c.p.a(Flag.EnableWaves), 15, (Object) null);
            }
        });
    }

    /* compiled from: NotificationSettingsViewModel.kt */
    public static final class a implements v<NotificationSettingsViewModel, y0> {
        public final /* synthetic */ i0.e.b.c3.h.c<NotificationSettingsViewModel, y0> a = new i0.e.b.c3.h.c<>(NotificationSettingsViewModel.class);

        public a() {
        }

        public NotificationSettingsViewModel create(j0 j0Var, y0 y0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(y0Var, "state");
            return this.a.create(j0Var, y0Var);
        }

        public y0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
