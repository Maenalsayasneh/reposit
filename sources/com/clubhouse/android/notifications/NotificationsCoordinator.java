package com.clubhouse.android.notifications;

import android.app.Activity;
import androidx.core.app.NotificationManagerCompat;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.analytics.AmplitudeAnalytics$setPushNotificationStatus$1;
import com.clubhouse.android.data.repos.NotificationRepo;
import com.clubhouse.android.shared.auth.UserManager;
import i0.e.b.e3.d;
import i0.e.b.f3.i.a;
import i0.e.b.h3.a.b;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.f0;
import n0.a.i0;

/* compiled from: NotificationsCoordinator.kt */
public final class NotificationsCoordinator {

    @m0.l.f.a.c(c = "com.clubhouse.android.notifications.NotificationsCoordinator$1", f = "NotificationsCoordinator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.notifications.NotificationsCoordinator$1  reason: invalid class name */
    /* compiled from: NotificationsCoordinator.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, c<? super m0.i>, Object> {
        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(aVar3, activity2, aVar4, f0Var2, this, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            AnonymousClass1 r02 = new AnonymousClass1(aVar3, activity2, aVar4, f0Var2, this, (c) obj2);
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            b bVar = aVar3.d;
            i.c(bVar);
            i0<Integer> i0Var = ((i0.e.b.h3.a.a) h.L0(bVar, i0.e.b.h3.a.a.class)).a().a;
            final Activity activity = activity2;
            i0Var.E(new l<Throwable, m0.i>() {
                public Object invoke(Object obj) {
                    Throwable th = (Throwable) obj;
                    d dVar = d.a;
                    Activity activity = activity;
                    i.e(activity, "context");
                    NotificationManagerCompat.from(activity).cancelAll();
                    return m0.i.a;
                }
            });
            final NotificationRepo j = ((i0.e.b.c3.i.a) h.L0(aVar3, i0.e.b.c3.i.a.class)).j();
            final boolean a = d.a.a(activity2);
            AmplitudeAnalytics amplitudeAnalytics = (AmplitudeAnalytics) aVar4;
            Objects.requireNonNull(amplitudeAnalytics);
            amplitudeAnalytics.c(new AmplitudeAnalytics$setPushNotificationStatus$1(a));
            f0 f0Var = f0Var2;
            final NotificationsCoordinator notificationsCoordinator = this;
            m0.r.t.a.r.m.a1.a.E2(f0Var, (e) null, (CoroutineStart) null, new p<f0, c<? super m0.i>, Object>((c<? super AnonymousClass2>) null) {
                public int c;

                public final c<m0.i> create(Object obj, c<?> cVar) {
                    return 

                    public NotificationsCoordinator(Activity activity, UserManager userManager, a aVar, f0 f0Var, i0.e.a.a aVar2) {
                        i.e(activity, "activity");
                        i.e(userManager, "userManager");
                        i.e(aVar, "userComponentHandler");
                        i.e(f0Var, "coroutineScope");
                        i.e(aVar2, "analytics");
                        final a aVar3 = aVar;
                        final Activity activity2 = activity;
                        final i0.e.a.a aVar4 = aVar2;
                        final f0 f0Var2 = f0Var;
                        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(userManager.f, new AnonymousClass1((c<? super AnonymousClass1>) null)), f0Var);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public static final java.lang.Object a(com.clubhouse.android.notifications.NotificationsCoordinator r4, com.clubhouse.android.data.repos.NotificationRepo r5, boolean r6, m0.l.c r7) {
                        /*
                            java.util.Objects.requireNonNull(r4)
                            boolean r0 = r7 instanceof com.clubhouse.android.notifications.NotificationsCoordinator$clearToken$1
                            if (r0 == 0) goto L_0x0016
                            r0 = r7
                            com.clubhouse.android.notifications.NotificationsCoordinator$clearToken$1 r0 = (com.clubhouse.android.notifications.NotificationsCoordinator$clearToken$1) r0
                            int r1 = r0.q
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L_0x0016
                            int r1 = r1 - r2
                            r0.q = r1
                            goto L_0x001b
                        L_0x0016:
                            com.clubhouse.android.notifications.NotificationsCoordinator$clearToken$1 r0 = new com.clubhouse.android.notifications.NotificationsCoordinator$clearToken$1
                            r0.<init>(r4, r7)
                        L_0x001b:
                            java.lang.Object r4 = r0.c
                            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r0.q
                            r2 = 0
                            r3 = 1
                            if (r1 == 0) goto L_0x0033
                            if (r1 != r3) goto L_0x002b
                            i0.j.f.p.h.d4(r4)     // Catch:{ Exception -> 0x0040 }
                            goto L_0x0049
                        L_0x002b:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                            r4.<init>(r5)
                            throw r4
                        L_0x0033:
                            i0.j.f.p.h.d4(r4)
                            r4 = 0
                            r0.q = r3     // Catch:{ Exception -> 0x0040 }
                            java.lang.Object r4 = r5.h(r6, r4, r0)     // Catch:{ Exception -> 0x0040 }
                            if (r4 != r7) goto L_0x0049
                            goto L_0x004b
                        L_0x0040:
                            java.lang.Object[] r4 = new java.lang.Object[r2]
                            v0.a.a$b r5 = v0.a.a.d
                            java.lang.String r6 = "Error clearing notification token"
                            r5.i(r6, r4)
                        L_0x0049:
                            m0.i r7 = m0.i.a
                        L_0x004b:
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.notifications.NotificationsCoordinator.a(com.clubhouse.android.notifications.NotificationsCoordinator, com.clubhouse.android.data.repos.NotificationRepo, boolean, m0.l.c):java.lang.Object");
                    }
                }
