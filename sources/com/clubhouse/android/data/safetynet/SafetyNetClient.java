package com.clubhouse.android.data.safetynet;

import android.content.Context;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import i0.e.a.a;
import i0.e.b.f3.e;
import i0.h.a.b.c.b;
import i0.h.a.b.c.g.a;
import i0.h.a.b.g.h.u2;
import i0.h.a.b.g.i.m;
import i0.h.a.b.j.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.f0;

/* compiled from: SafetyNetClient.kt */
public final class SafetyNetClient {
    public final f0 a;
    public final Context b;
    public final i0.e.a.a c;
    public final b d;
    public final i0.h.a.b.i.a e;
    public RecaptchaHandle f;
    public final String g = "6LcNAMYaAAAAAKDxm-jPPMrJvh_VTiWyWy4D9jp3";
    public final d h;
    public final String i;
    public int j;

    @m0.l.f.a.c(c = "com.clubhouse.android.data.safetynet.SafetyNetClient$1", f = "SafetyNetClient.kt", l = {54}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.data.safetynet.SafetyNetClient$1  reason: invalid class name */
    /* compiled from: SafetyNetClient.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super m0.i>, Object> {
        public Object c;
        public int d;
        public final /* synthetic */ SafetyNetClient q;

        {
            this.q = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.q, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(this.q, (c) obj2).invokeSuspend(m0.i.a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r7.d
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x001a
                if (r1 != r3) goto L_0x0012
                java.lang.Object r0 = r7.c
                com.clubhouse.android.data.safetynet.SafetyNetClient r0 = (com.clubhouse.android.data.safetynet.SafetyNetClient) r0
                i0.j.f.p.h.d4(r8)     // Catch:{ Exception -> 0x0066 }
                goto L_0x0057
            L_0x0012:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001a:
                i0.j.f.p.h.d4(r8)
                com.clubhouse.android.data.safetynet.SafetyNetClient r8 = r7.q     // Catch:{ Exception -> 0x0066 }
                java.lang.String r1 = r8.g     // Catch:{ Exception -> 0x0066 }
                if (r1 == 0) goto L_0x005c
                i0.h.a.b.i.a r4 = r8.e     // Catch:{ Exception -> 0x0066 }
                i0.h.a.b.g.h.u2 r4 = (i0.h.a.b.g.h.u2) r4     // Catch:{ Exception -> 0x0066 }
                java.util.Objects.requireNonNull(r4)     // Catch:{ Exception -> 0x0066 }
                i0.h.a.b.c.g.j.n$a r5 = i0.h.a.b.c.g.j.n.a()     // Catch:{ Exception -> 0x0066 }
                i0.h.a.b.g.h.t2 r6 = new i0.h.a.b.g.h.t2     // Catch:{ Exception -> 0x0066 }
                r6.<init>(r4, r1)     // Catch:{ Exception -> 0x0066 }
                r5.a = r6     // Catch:{ Exception -> 0x0066 }
                com.google.android.gms.common.Feature[] r1 = new com.google.android.gms.common.Feature[r3]     // Catch:{ Exception -> 0x0066 }
                com.google.android.gms.common.Feature r6 = i0.h.a.b.i.b.b     // Catch:{ Exception -> 0x0066 }
                r1[r2] = r6     // Catch:{ Exception -> 0x0066 }
                r5.c = r1     // Catch:{ Exception -> 0x0066 }
                i0.h.a.b.c.g.j.n r1 = r5.a()     // Catch:{ Exception -> 0x0066 }
                i0.h.a.b.m.g r1 = r4.c(r2, r1)     // Catch:{ Exception -> 0x0066 }
                java.lang.String r4 = "recaptchaClient.init(recaptchaKey)"
                m0.n.b.i.d(r1, r4)     // Catch:{ Exception -> 0x0066 }
                r7.c = r8     // Catch:{ Exception -> 0x0066 }
                r7.d = r3     // Catch:{ Exception -> 0x0066 }
                java.lang.Object r1 = m0.r.t.a.r.m.a1.a.Z(r1, r7)     // Catch:{ Exception -> 0x0066 }
                if (r1 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r0 = r8
                r8 = r1
            L_0x0057:
                com.google.android.gms.recaptcha.RecaptchaHandle r8 = (com.google.android.gms.recaptcha.RecaptchaHandle) r8     // Catch:{ Exception -> 0x0066 }
                r0.f = r8     // Catch:{ Exception -> 0x0066 }
                goto L_0x008e
            L_0x005c:
                i0.e.a.a r8 = r8.c     // Catch:{ Exception -> 0x0066 }
                java.lang.String r0 = "Token-RecaptchaKeyNotAvailable-Error"
                com.clubhouse.analytics.AmplitudeAnalytics r8 = (com.clubhouse.analytics.AmplitudeAnalytics) r8     // Catch:{ Exception -> 0x0066 }
                r8.a(r0)     // Catch:{ Exception -> 0x0066 }
                goto L_0x008e
            L_0x0066:
                r8 = move-exception
                com.clubhouse.android.data.safetynet.SafetyNetClient r0 = r7.q
                i0.e.a.a r0 = r0.c
                java.lang.String r1 = r8.getMessage()
                if (r1 != 0) goto L_0x0073
                java.lang.String r1 = ""
            L_0x0073:
                kotlin.Pair r3 = new kotlin.Pair
                java.lang.String r4 = "exception"
                r3.<init>(r4, r1)
                java.util.Map r1 = i0.j.f.p.h.S2(r3)
                com.clubhouse.analytics.AmplitudeAnalytics r0 = (com.clubhouse.analytics.AmplitudeAnalytics) r0
                java.lang.String r3 = "Token-RecaptchaInitFailed-Error"
                r0.b(r3, r1)
                java.lang.Object[] r0 = new java.lang.Object[r2]
                v0.a.a$b r1 = v0.a.a.d
                java.lang.String r2 = "Recaptcha initialization failed"
                r1.w(r8, r2, r0)
            L_0x008e:
                com.clubhouse.android.data.safetynet.SafetyNetClient r8 = r7.q
                i0.h.a.b.c.b r0 = r8.d
                android.content.Context r1 = r8.b
                int r0 = r0.c(r1)
                r8.j = r0
                com.clubhouse.android.data.safetynet.SafetyNetClient r8 = r7.q
                int r0 = r8.j
                if (r0 == 0) goto L_0x00b9
                i0.e.a.a r8 = r8.c
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                kotlin.Pair r0 = new kotlin.Pair
                java.lang.String r2 = "response_code"
                r0.<init>(r2, r1)
                java.util.Map r0 = i0.j.f.p.h.S2(r0)
                com.clubhouse.analytics.AmplitudeAnalytics r8 = (com.clubhouse.analytics.AmplitudeAnalytics) r8
                java.lang.String r1 = "Token-GooglePlayServicesUnavailable-Error"
                r8.b(r1, r0)
            L_0x00b9:
                m0.i r8 = m0.i.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.safetynet.SafetyNetClient.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SafetyNetClient(f0 f0Var, Context context, e eVar, i0.e.a.a aVar, b bVar) {
        i.e(f0Var, "coroutineScope");
        i.e(context, "applicationContext");
        i.e(eVar, "environment");
        i.e(aVar, "analytics");
        i.e(bVar, "availability");
        this.a = f0Var;
        this.b = context;
        this.c = aVar;
        this.d = bVar;
        int i2 = i0.h.a.b.g.h.d.a;
        this.e = new u2(context);
        a.g<m> gVar = i0.h.a.b.j.a.a;
        this.h = new d(context);
        this.i = "AIzaSyDGJ877BvgHAg2Bed1sgFjZ4wJmh2RfEfU";
        this.j = -1;
        m0.r.t.a.r.m.a1.a.E2(f0Var, (m0.l.e) null, (CoroutineStart) null, new AnonymousClass1(this, (c<? super AnonymousClass1>) null), 3, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @android.annotation.SuppressLint({"HardwareIds"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(m0.l.c<? super i0.e.b.b3.d.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.clubhouse.android.data.safetynet.SafetyNetClient$fetchAttestationResult$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.clubhouse.android.data.safetynet.SafetyNetClient$fetchAttestationResult$1 r0 = (com.clubhouse.android.data.safetynet.SafetyNetClient$fetchAttestationResult$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.safetynet.SafetyNetClient$fetchAttestationResult$1 r0 = new com.clubhouse.android.data.safetynet.SafetyNetClient$fetchAttestationResult$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r1 = r0.d
            byte[] r1 = (byte[]) r1
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.safetynet.SafetyNetClient r0 = (com.clubhouse.android.data.safetynet.SafetyNetClient) r0
            i0.j.f.p.h.d4(r9)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0092
        L_0x0031:
            r9 = move-exception
            goto L_0x00c5
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x003c:
            i0.j.f.p.h.d4(r9)
            android.content.Context r9 = r8.b
            android.content.ContentResolver r9 = r9.getContentResolver()
            java.lang.String r2 = "android_id"
            java.lang.String r9 = android.provider.Settings.Secure.getString(r9, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            java.lang.String r9 = "__"
            r2.append(r9)
            long r6 = java.lang.System.currentTimeMillis()
            r2.append(r6)
            java.lang.String r9 = r2.toString()
            java.nio.charset.Charset r2 = m0.t.a.a
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            java.util.Objects.requireNonNull(r9, r6)
            byte[] r9 = r9.getBytes(r2)
            java.lang.String r2 = "(this as java.lang.String).getBytes(charset)"
            m0.n.b.i.d(r9, r2)
            java.lang.String r2 = r8.i
            if (r2 == 0) goto L_0x00eb
            i0.h.a.b.j.d r6 = r8.h     // Catch:{ Exception -> 0x00c3 }
            i0.h.a.b.m.g r2 = r6.d(r9, r2)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r6 = "safetyNetClient.attest(nonce, attestationKey)"
            m0.n.b.i.d(r2, r6)     // Catch:{ Exception -> 0x00c3 }
            r0.c = r8     // Catch:{ Exception -> 0x00c3 }
            r0.d = r9     // Catch:{ Exception -> 0x00c3 }
            r0.y = r4     // Catch:{ Exception -> 0x00c3 }
            java.lang.Object r0 = m0.r.t.a.r.m.a1.a.Z(r2, r0)     // Catch:{ Exception -> 0x00c3 }
            if (r0 != r1) goto L_0x008f
            return r1
        L_0x008f:
            r1 = r9
            r9 = r0
            r0 = r8
        L_0x0092:
            i0.h.a.b.j.b r9 = (i0.h.a.b.j.b) r9     // Catch:{ Exception -> 0x0031 }
            i0.e.a.a r2 = r0.c     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "Token-SafetyNetAttestationPassed-Success"
            com.clubhouse.analytics.AmplitudeAnalytics r2 = (com.clubhouse.analytics.AmplitudeAnalytics) r2     // Catch:{ Exception -> 0x0031 }
            r2.a(r4)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "Safety net attestation request succeeded"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0031 }
            v0.a.a$b r6 = v0.a.a.d     // Catch:{ Exception -> 0x0031 }
            r6.i(r2, r4)     // Catch:{ Exception -> 0x0031 }
            i0.e.b.b3.d.a r2 = new i0.e.b.b3.d.a     // Catch:{ Exception -> 0x0031 }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "encodeToString(nonce, Base64.DEFAULT)"
            m0.n.b.i.d(r1, r4)     // Catch:{ Exception -> 0x0031 }
            T r9 = r9.a     // Catch:{ Exception -> 0x0031 }
            i0.h.a.b.j.c r9 = (i0.h.a.b.j.c) r9     // Catch:{ Exception -> 0x0031 }
            java.lang.String r9 = r9.r0()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "safetyNetResponse.jwsResult"
            m0.n.b.i.d(r9, r4)     // Catch:{ Exception -> 0x0031 }
            r2.<init>(r1, r9)     // Catch:{ Exception -> 0x0031 }
            r3 = r2
            goto L_0x00f4
        L_0x00c3:
            r9 = move-exception
            r0 = r8
        L_0x00c5:
            i0.e.a.a r0 = r0.c
            java.lang.String r1 = r9.getMessage()
            if (r1 != 0) goto L_0x00cf
            java.lang.String r1 = ""
        L_0x00cf:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r4 = "exception"
            r2.<init>(r4, r1)
            java.util.Map r1 = i0.j.f.p.h.S2(r2)
            com.clubhouse.analytics.AmplitudeAnalytics r0 = (com.clubhouse.analytics.AmplitudeAnalytics) r0
            java.lang.String r2 = "Token-SafetyNetAttestationFailed-Error"
            r0.b(r2, r1)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            v0.a.a$b r1 = v0.a.a.d
            java.lang.String r2 = "Safety Net request failed"
            r1.w(r9, r2, r0)
            goto L_0x00f4
        L_0x00eb:
            i0.e.a.a r9 = r8.c
            com.clubhouse.analytics.AmplitudeAnalytics r9 = (com.clubhouse.analytics.AmplitudeAnalytics) r9
            java.lang.String r0 = "Token-SafetyNetKeyNotAvailable-Error"
            r9.a(r0)
        L_0x00f4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.safetynet.SafetyNetClient.a(m0.l.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(com.google.android.gms.recaptcha.RecaptchaActionType r10, m0.l.c<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.clubhouse.android.data.safetynet.SafetyNetClient$fetchRecaptchaToken$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.clubhouse.android.data.safetynet.SafetyNetClient$fetchRecaptchaToken$1 r0 = (com.clubhouse.android.data.safetynet.SafetyNetClient$fetchRecaptchaToken$1) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.y = r1
            goto L_0x0018
        L_0x0013:
            com.clubhouse.android.data.safetynet.SafetyNetClient$fetchRecaptchaToken$1 r0 = new com.clubhouse.android.data.safetynet.SafetyNetClient$fetchRecaptchaToken$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.y
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r10 = r0.d
            com.google.android.gms.recaptcha.RecaptchaActionType r10 = (com.google.android.gms.recaptcha.RecaptchaActionType) r10
            java.lang.Object r0 = r0.c
            com.clubhouse.android.data.safetynet.SafetyNetClient r0 = (com.clubhouse.android.data.safetynet.SafetyNetClient) r0
            i0.j.f.p.h.d4(r11)     // Catch:{ Exception -> 0x0031 }
            goto L_0x0081
        L_0x0031:
            r10 = move-exception
            goto L_0x00a9
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            i0.j.f.p.h.d4(r11)
            com.google.android.gms.recaptcha.RecaptchaHandle r11 = r9.f
            java.lang.String r2 = r9.g
            if (r2 == 0) goto L_0x00cf
            if (r11 == 0) goto L_0x00cf
            i0.h.a.b.i.a r2 = r9.e     // Catch:{ Exception -> 0x00a7 }
            com.google.android.gms.recaptcha.RecaptchaAction r6 = new com.google.android.gms.recaptcha.RecaptchaAction     // Catch:{ Exception -> 0x00a7 }
            r6.<init>(r10)     // Catch:{ Exception -> 0x00a7 }
            i0.h.a.b.g.h.u2 r2 = (i0.h.a.b.g.h.u2) r2     // Catch:{ Exception -> 0x00a7 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ Exception -> 0x00a7 }
            i0.h.a.b.c.g.j.n$a r7 = i0.h.a.b.c.g.j.n.a()     // Catch:{ Exception -> 0x00a7 }
            i0.h.a.b.g.h.v2 r8 = new i0.h.a.b.g.h.v2     // Catch:{ Exception -> 0x00a7 }
            r8.<init>(r2, r11, r6)     // Catch:{ Exception -> 0x00a7 }
            r7.a = r8     // Catch:{ Exception -> 0x00a7 }
            com.google.android.gms.common.Feature[] r11 = new com.google.android.gms.common.Feature[r4]     // Catch:{ Exception -> 0x00a7 }
            com.google.android.gms.common.Feature r6 = i0.h.a.b.i.b.c     // Catch:{ Exception -> 0x00a7 }
            r11[r3] = r6     // Catch:{ Exception -> 0x00a7 }
            r7.c = r11     // Catch:{ Exception -> 0x00a7 }
            i0.h.a.b.c.g.j.n r11 = r7.a()     // Catch:{ Exception -> 0x00a7 }
            i0.h.a.b.m.g r11 = r2.c(r3, r11)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r2 = "recaptchaClient\n                    .execute(\n                        handle,\n                        RecaptchaAction(actionType)\n                    )"
            m0.n.b.i.d(r11, r2)     // Catch:{ Exception -> 0x00a7 }
            r0.c = r9     // Catch:{ Exception -> 0x00a7 }
            r0.d = r10     // Catch:{ Exception -> 0x00a7 }
            r0.y = r4     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r11 = m0.r.t.a.r.m.a1.a.Z(r11, r0)     // Catch:{ Exception -> 0x00a7 }
            if (r11 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r0 = r9
        L_0x0081:
            com.google.android.gms.recaptcha.RecaptchaResultData r11 = (com.google.android.gms.recaptcha.RecaptchaResultData) r11     // Catch:{ Exception -> 0x0031 }
            i0.e.a.a r1 = r0.c     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "Token-RecaptchaFetchedSuccessfully-Success"
            java.lang.String r4 = "action"
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0031 }
            kotlin.Pair r6 = new kotlin.Pair     // Catch:{ Exception -> 0x0031 }
            r6.<init>(r4, r10)     // Catch:{ Exception -> 0x0031 }
            java.util.Map r10 = i0.j.f.p.h.S2(r6)     // Catch:{ Exception -> 0x0031 }
            com.clubhouse.analytics.AmplitudeAnalytics r1 = (com.clubhouse.analytics.AmplitudeAnalytics) r1     // Catch:{ Exception -> 0x0031 }
            r1.b(r2, r10)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r10 = "Recaptcha request succeeded with token"
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0031 }
            v0.a.a$b r2 = v0.a.a.d     // Catch:{ Exception -> 0x0031 }
            r2.i(r10, r1)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r5 = r11.c     // Catch:{ Exception -> 0x0031 }
            goto L_0x00f0
        L_0x00a7:
            r10 = move-exception
            r0 = r9
        L_0x00a9:
            i0.e.a.a r11 = r0.c
            java.lang.String r0 = r10.getMessage()
            if (r0 != 0) goto L_0x00b3
            java.lang.String r0 = ""
        L_0x00b3:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r2 = "exception"
            r1.<init>(r2, r0)
            java.util.Map r0 = i0.j.f.p.h.S2(r1)
            com.clubhouse.analytics.AmplitudeAnalytics r11 = (com.clubhouse.analytics.AmplitudeAnalytics) r11
            java.lang.String r1 = "Token-RecaptchaFetchErrorThrown-Error"
            r11.b(r1, r0)
            java.lang.Object[] r11 = new java.lang.Object[r3]
            v0.a.a$b r0 = v0.a.a.d
            java.lang.String r1 = "Recaptcha request failed"
            r0.w(r10, r1, r11)
            goto L_0x00f0
        L_0x00cf:
            if (r2 != 0) goto L_0x00db
            i0.e.a.a r10 = r9.c
            com.clubhouse.analytics.AmplitudeAnalytics r10 = (com.clubhouse.analytics.AmplitudeAnalytics) r10
            java.lang.String r11 = "Token-RecaptchaKeyNullInFetch-Error"
            r10.a(r11)
            goto L_0x00f0
        L_0x00db:
            if (r11 != 0) goto L_0x00e7
            i0.e.a.a r10 = r9.c
            com.clubhouse.analytics.AmplitudeAnalytics r10 = (com.clubhouse.analytics.AmplitudeAnalytics) r10
            java.lang.String r11 = "Token-RecaptchaHandleNullInFetch-Error"
            r10.a(r11)
            goto L_0x00f0
        L_0x00e7:
            i0.e.a.a r10 = r9.c
            com.clubhouse.analytics.AmplitudeAnalytics r10 = (com.clubhouse.analytics.AmplitudeAnalytics) r10
            java.lang.String r11 = "Token-RecaptchaFetchFinalBlock-Error"
            r10.a(r11)
        L_0x00f0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.safetynet.SafetyNetClient.b(com.google.android.gms.recaptcha.RecaptchaActionType, m0.l.c):java.lang.Object");
    }
}
