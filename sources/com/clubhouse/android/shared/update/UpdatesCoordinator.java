package com.clubhouse.android.shared.update;

import android.app.Activity;
import android.content.Context;
import com.clubhouse.android.data.models.remote.response.CheckForUpdateResponse;
import com.clubhouse.android.data.repos.UpdatesRepo;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.a3.f.b;
import i0.h.a.d.a.a.h;
import i0.h.a.d.a.a.t;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

/* compiled from: UpdatesCoordinator.kt */
public final class UpdatesCoordinator {
    public final Activity a;
    public final DeviceSharedPreferences b;
    public final b c;
    public final f0 d;
    public final UpdatesRepo e;
    public final i0.h.a.d.a.a.b f;

    @m0.l.f.a.c(c = "com.clubhouse.android.shared.update.UpdatesCoordinator$1", f = "UpdatesCoordinator.kt", l = {53}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.shared.update.UpdatesCoordinator$1  reason: invalid class name */
    /* compiled from: UpdatesCoordinator.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super m0.i>, Object> {
        public int c;
        public final /* synthetic */ UpdatesCoordinator d;

        {
            this.d = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.d, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(this.d, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                i0.j.f.p.h.d4(obj);
                UpdatesRepo updatesRepo = this.d.e;
                this.c = 1;
                obj = updatesRepo.a(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                try {
                    i0.j.f.p.h.d4(obj);
                } catch (Exception e) {
                    v0.a.a.d.w(e, "Error checking for updates", new Object[0]);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CheckForUpdateResponse checkForUpdateResponse = (CheckForUpdateResponse) obj;
            if (checkForUpdateResponse.a) {
                UpdatesCoordinator updatesCoordinator = this.d;
                UpdatesCoordinator.b(updatesCoordinator, updatesCoordinator.a, checkForUpdateResponse.c, checkForUpdateResponse.b);
            }
            return m0.i.a;
        }
    }

    public UpdatesCoordinator(Activity activity, DeviceSharedPreferences deviceSharedPreferences, b bVar, f0 f0Var, UpdatesRepo updatesRepo) {
        t tVar;
        i.e(activity, "activity");
        i.e(deviceSharedPreferences, "devicePreferences");
        i.e(bVar, "bannerHandler");
        i.e(f0Var, "coroutineScope");
        i.e(updatesRepo, "updatesRepo");
        this.a = activity;
        this.b = deviceSharedPreferences;
        this.c = bVar;
        this.d = f0Var;
        this.e = updatesRepo;
        Context applicationContext = activity.getApplicationContext();
        synchronized (i0.h.a.b.c.m.b.class) {
            if (i0.h.a.b.c.m.b.d == null) {
                Context applicationContext2 = applicationContext.getApplicationContext();
                h hVar = new h(applicationContext2 != null ? applicationContext2 : applicationContext);
                i0.h.a.b.c.m.b.S(hVar, h.class);
                i0.h.a.b.c.m.b.d = new t(hVar);
            }
            tVar = i0.h.a.b.c.m.b.d;
        }
        i0.h.a.d.a.a.b a2 = tVar.f.a();
        i.d(a2, "create(activity.applicationContext)");
        this.f = a2;
        a.E2(f0Var, (e) null, (CoroutineStart) null, new AnonymousClass1(this, (c<? super AnonymousClass1>) null), 3, (Object) null);
        ((h0.q.p) activity).getLifecycle().a(new UpdatesCoordinator$special$$inlined$observeResume$1(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(com.clubhouse.android.shared.update.UpdatesCoordinator r4, m0.l.c r5) {
        /*
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r5 instanceof com.clubhouse.android.shared.update.UpdatesCoordinator$resumeUpdate$1
            if (r0 == 0) goto L_0x0016
            r0 = r5
            com.clubhouse.android.shared.update.UpdatesCoordinator$resumeUpdate$1 r0 = (com.clubhouse.android.shared.update.UpdatesCoordinator$resumeUpdate$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x001b
        L_0x0016:
            com.clubhouse.android.shared.update.UpdatesCoordinator$resumeUpdate$1 r0 = new com.clubhouse.android.shared.update.UpdatesCoordinator$resumeUpdate$1
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.c
            com.clubhouse.android.shared.update.UpdatesCoordinator r4 = (com.clubhouse.android.shared.update.UpdatesCoordinator) r4
            i0.j.f.p.h.d4(r5)
            goto L_0x0046
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            i0.j.f.p.h.d4(r5)
            i0.h.a.d.a.a.b r5 = r4.f
            r0.c = r4
            r0.x = r3
            java.lang.Object r5 = i0.h.a.b.c.m.b.h0(r5, r0)
            if (r5 != r1) goto L_0x0046
            goto L_0x005a
        L_0x0046:
            i0.h.a.d.a.a.a r5 = (i0.h.a.d.a.a.a) r5
            int r0 = r5.o()
            r1 = 3
            if (r0 != r1) goto L_0x0058
            i0.h.a.d.a.a.b r0 = r4.f
            android.app.Activity r4 = r4.a
            r1 = 5566(0x15be, float:7.8E-42)
            r0.b(r5, r3, r4, r1)
        L_0x0058:
            m0.i r1 = m0.i.a
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.shared.update.UpdatesCoordinator.a(com.clubhouse.android.shared.update.UpdatesCoordinator, m0.l.c):java.lang.Object");
    }

    public static final void b(UpdatesCoordinator updatesCoordinator, Activity activity, String str, Boolean bool) {
        Objects.requireNonNull(updatesCoordinator);
        if (str != null) {
            d.a aVar = new d.a(activity, 2132017388);
            aVar.a.d = activity.getString(R.string.update_available_title);
            aVar.b(R.string.update_available_message);
            if (i.a(bool, Boolean.TRUE)) {
                aVar.a.k = false;
            } else {
                aVar.c(R.string.not_now, i0.e.b.f3.n.a.c);
            }
            aVar.d(R.string.update, new i0.e.b.f3.n.c(activity, str));
            aVar.g();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(com.clubhouse.android.shared.update.UpdatesCoordinator r4, m0.l.c r5) {
        /*
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r5 instanceof com.clubhouse.android.shared.update.UpdatesCoordinator$startUpdateIfAvailable$1
            if (r0 == 0) goto L_0x0016
            r0 = r5
            com.clubhouse.android.shared.update.UpdatesCoordinator$startUpdateIfAvailable$1 r0 = (com.clubhouse.android.shared.update.UpdatesCoordinator$startUpdateIfAvailable$1) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x001b
        L_0x0016:
            com.clubhouse.android.shared.update.UpdatesCoordinator$startUpdateIfAvailable$1 r0 = new com.clubhouse.android.shared.update.UpdatesCoordinator$startUpdateIfAvailable$1
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.d
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r4 = r0.c
            com.clubhouse.android.shared.update.UpdatesCoordinator r4 = (com.clubhouse.android.shared.update.UpdatesCoordinator) r4
            i0.j.f.p.h.d4(r5)
            goto L_0x0046
        L_0x002e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0036:
            i0.j.f.p.h.d4(r5)
            i0.h.a.d.a.a.b r5 = r4.f
            r0.c = r4
            r0.x = r3
            java.lang.Object r5 = i0.h.a.b.c.m.b.h0(r5, r0)
            if (r5 != r1) goto L_0x0046
            goto L_0x0069
        L_0x0046:
            i0.h.a.d.a.a.a r5 = (i0.h.a.d.a.a.a) r5
            int r0 = r5.o()
            r1 = 2
            if (r0 != r1) goto L_0x0067
            i0.h.a.d.a.a.c r0 = i0.h.a.d.a.a.c.c(r3)
            android.app.PendingIntent r0 = r5.j(r0)
            if (r0 == 0) goto L_0x005b
            r0 = r3
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x0067
            i0.h.a.d.a.a.b r0 = r4.f
            android.app.Activity r4 = r4.a
            r1 = 5566(0x15be, float:7.8E-42)
            r0.b(r5, r3, r4, r1)
        L_0x0067:
            m0.i r1 = m0.i.a
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.shared.update.UpdatesCoordinator.c(com.clubhouse.android.shared.update.UpdatesCoordinator, m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007e A[Catch:{ Exception -> 0x00cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(m0.l.c<? super m0.i> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.clubhouse.android.shared.update.UpdatesCoordinator$maybeShowReleaseNotes$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.clubhouse.android.shared.update.UpdatesCoordinator$maybeShowReleaseNotes$1 r0 = (com.clubhouse.android.shared.update.UpdatesCoordinator$maybeShowReleaseNotes$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.shared.update.UpdatesCoordinator$maybeShowReleaseNotes$1 r0 = new com.clubhouse.android.shared.update.UpdatesCoordinator$maybeShowReleaseNotes$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            int r1 = r0.d
            java.lang.Object r0 = r0.c
            com.clubhouse.android.shared.update.UpdatesCoordinator r0 = (com.clubhouse.android.shared.update.UpdatesCoordinator) r0
            i0.j.f.p.h.d4(r7)     // Catch:{ Exception -> 0x00cc }
            goto L_0x0051
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0035:
            i0.j.f.p.h.d4(r7)
            com.clubhouse.android.shared.preferences.DeviceSharedPreferences r7 = r6.b
            int r7 = r7.k()
            r2 = 4734(0x127e, float:6.634E-42)
            com.clubhouse.android.data.repos.UpdatesRepo r4 = r6.e     // Catch:{ Exception -> 0x00cc }
            r0.c = r6     // Catch:{ Exception -> 0x00cc }
            r0.d = r2     // Catch:{ Exception -> 0x00cc }
            r0.y = r3     // Catch:{ Exception -> 0x00cc }
            java.lang.Object r7 = r4.b(r7, r2, r0)     // Catch:{ Exception -> 0x00cc }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r0 = r6
            r1 = r2
        L_0x0051:
            com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse r7 = (com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse) r7     // Catch:{ Exception -> 0x00cc }
            com.clubhouse.android.shared.preferences.DeviceSharedPreferences r2 = r0.b     // Catch:{ Exception -> 0x00cc }
            java.util.Objects.requireNonNull(r2)     // Catch:{ Exception -> 0x00cc }
            com.clubhouse.android.shared.preferences.Key r3 = com.clubhouse.android.shared.preferences.Key.VERSION_CODE     // Catch:{ Exception -> 0x00cc }
            java.lang.String r4 = "key"
            m0.n.b.i.e(r3, r4)     // Catch:{ Exception -> 0x00cc }
            android.content.SharedPreferences r4 = r2.a     // Catch:{ Exception -> 0x00cc }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r5 = "editor"
            m0.n.b.i.d(r4, r5)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r2 = r2.f(r3)     // Catch:{ Exception -> 0x00cc }
            r4.putInt(r2, r1)     // Catch:{ Exception -> 0x00cc }
            r4.apply()     // Catch:{ Exception -> 0x00cc }
            java.lang.Boolean r1 = r7.a     // Catch:{ Exception -> 0x00cc }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00cc }
            boolean r1 = m0.n.b.i.a(r1, r2)     // Catch:{ Exception -> 0x00cc }
            if (r1 == 0) goto L_0x00d7
            i0.e.b.a3.f.b r1 = r0.c     // Catch:{ Exception -> 0x00cc }
            i0.e.b.a3.f.j r1 = r1.create()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r2 = r7.b     // Catch:{ Exception -> 0x00cc }
            if (r2 != 0) goto L_0x0096
            android.app.Activity r2 = r0.a     // Catch:{ Exception -> 0x00cc }
            r3 = 2131952671(0x7f13041f, float:1.9541791E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r3 = "activity.getString(R.string.release_notes_message)"
            m0.n.b.i.d(r2, r3)     // Catch:{ Exception -> 0x00cc }
        L_0x0096:
            com.clubhouse.android.core.databinding.BannerBinding r3 = r1.c     // Catch:{ Exception -> 0x00cc }
            android.widget.TextView r3 = r3.b     // Catch:{ Exception -> 0x00cc }
            r3.setText(r2)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r2 = r7.c     // Catch:{ Exception -> 0x00cc }
            if (r2 != 0) goto L_0x00af
            android.app.Activity r2 = r0.a     // Catch:{ Exception -> 0x00cc }
            r3 = 2131952670(0x7f13041e, float:1.954179E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x00cc }
            java.lang.String r3 = "activity.getString(R.string.release_notes_action)"
            m0.n.b.i.d(r2, r3)     // Catch:{ Exception -> 0x00cc }
        L_0x00af:
            i0.e.b.f3.n.d r3 = new i0.e.b.f3.n.d     // Catch:{ Exception -> 0x00cc }
            r3.<init>(r0, r7)     // Catch:{ Exception -> 0x00cc }
            r1.g(r2, r3)     // Catch:{ Exception -> 0x00cc }
            android.app.Activity r7 = r0.a     // Catch:{ Exception -> 0x00cc }
            r0 = 2131952055(0x7f1301b7, float:1.9540542E38)
            java.lang.String r7 = r7.getString(r0)     // Catch:{ Exception -> 0x00cc }
            i0.e.b.f3.n.b r0 = new i0.e.b.f3.n.b     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            r1.f(r7, r0)     // Catch:{ Exception -> 0x00cc }
            r1.a()     // Catch:{ Exception -> 0x00cc }
            goto L_0x00d7
        L_0x00cc:
            r7 = move-exception
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            v0.a.a$b r1 = v0.a.a.d
            java.lang.String r2 = "Error checking for release notes"
            r1.w(r7, r2, r0)
        L_0x00d7:
            m0.i r7 = m0.i.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.shared.update.UpdatesCoordinator.d(m0.l.c):java.lang.Object");
    }
}
