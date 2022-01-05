package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.notification.ActionableNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.experimentation.ExperimentBehavior;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: MeResponse.kt */
public final class MeResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final Map<ActionableNotificationType, Integer> b;
    public final String c;
    public final String d;
    public final boolean e;
    public final BasicUser f;
    public final List<Integer> g;
    public final List<Integer> h;
    public final boolean i;
    public final String j;
    public final List<String> k;
    public final String l;
    public final String m;
    public final Map<String, ExperimentBehavior> n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/MeResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/MeResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: MeResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<MeResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: MeResponse.kt */
    public static final class a implements v<MeResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.MeResponse", aVar, 14);
            pluginGeneratedSerialDescriptor.i("has_unread_notifications", false);
            pluginGeneratedSerialDescriptor.i("actionable_notifications_count_by_type", false);
            pluginGeneratedSerialDescriptor.i("refresh_token", false);
            pluginGeneratedSerialDescriptor.i("access_token", false);
            pluginGeneratedSerialDescriptor.i("notifications_enabled", false);
            pluginGeneratedSerialDescriptor.i("user_profile", false);
            pluginGeneratedSerialDescriptor.i("following_ids", false);
            pluginGeneratedSerialDescriptor.i("blocked_ids", false);
            pluginGeneratedSerialDescriptor.i("is_admin", false);
            pluginGeneratedSerialDescriptor.i("email", false);
            pluginGeneratedSerialDescriptor.i("feature_flags", false);
            pluginGeneratedSerialDescriptor.i("pubnub_token", false);
            pluginGeneratedSerialDescriptor.i("pubnub_origin", false);
            pluginGeneratedSerialDescriptor.i("experiments", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            i0.e.b.b3.a.a.e.a aVar = i0.e.b.b3.a.a.e.a.a;
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{hVar, new h0(aVar, e0Var), g1Var, g1Var, hVar, BasicUser.a.a, new n0.c.k.e(e0Var), new n0.c.k.e(e0Var), hVar, m0.r.t.a.r.m.a1.a.R1(g1Var), new n0.c.k.e(g1Var), g1Var, g1Var, new h0(g1Var, ExperimentBehavior.a.a)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x01be, code lost:
            r2 = 13;
            r4 = 8;
            r11 = 7;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r29) {
            /*
                r28 = this;
                r0 = r29
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r7 = 0
                r8 = 3
                r9 = 5
                r10 = 6
                r11 = 7
                r12 = 9
                r13 = 0
                r14 = 1
                r15 = 2
                r3 = 4
                r4 = 8
                if (r2 == 0) goto L_0x0096
                boolean r2 = r0.s(r1, r13)
                n0.c.k.h0 r13 = new n0.c.k.h0
                i0.e.b.b3.a.a.e.a r5 = i0.e.b.b3.a.a.e.a.a
                n0.c.k.e0 r6 = n0.c.k.e0.b
                r13.<init>(r5, r6)
                java.lang.Object r5 = r0.m(r1, r14, r13, r7)
                java.lang.String r13 = r0.t(r1, r15)
                java.lang.String r8 = r0.t(r1, r8)
                boolean r3 = r0.s(r1, r3)
                com.clubhouse.android.data.models.local.user.BasicUser$a r14 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r9 = r0.m(r1, r9, r14, r7)
                n0.c.k.e r14 = new n0.c.k.e
                r14.<init>(r6)
                java.lang.Object r10 = r0.m(r1, r10, r14, r7)
                n0.c.k.e r14 = new n0.c.k.e
                r14.<init>(r6)
                java.lang.Object r6 = r0.m(r1, r11, r14, r7)
                boolean r4 = r0.s(r1, r4)
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r12 = r0.v(r1, r12, r11, r7)
                n0.c.k.e r14 = new n0.c.k.e
                r14.<init>(r11)
                r15 = 10
                java.lang.Object r14 = r0.m(r1, r15, r14, r7)
                r15 = 11
                java.lang.String r15 = r0.t(r1, r15)
                r7 = 12
                java.lang.String r7 = r0.t(r1, r7)
                r16 = r2
                n0.c.k.h0 r2 = new n0.c.k.h0
                r17 = r3
                com.clubhouse.experimentation.ExperimentBehavior$a r3 = com.clubhouse.experimentation.ExperimentBehavior.a.a
                r2.<init>(r11, r3)
                r3 = 13
                r11 = 0
                java.lang.Object r2 = r0.m(r1, r3, r2, r11)
                r3 = 16383(0x3fff, float:2.2957E-41)
                r23 = r7
                r7 = r13
                r13 = r4
                r4 = r3
                r3 = r5
                r5 = r16
                r16 = r15
                goto L_0x01da
            L_0x0096:
                r5 = r7
                r2 = 13
                r3 = r5
                r8 = r3
                r9 = r8
                r15 = r9
                r21 = r15
                r22 = r21
                r23 = r22
                r24 = r23
                r25 = r24
                r6 = r13
                r7 = r6
                r19 = r7
                r26 = r14
                r14 = r25
                r5 = r19
                r13 = r14
            L_0x00b2:
                if (r26 == 0) goto L_0x01c6
                int r10 = r0.x(r1)
                switch(r10) {
                    case -1: goto L_0x01b6;
                    case 0: goto L_0x01a9;
                    case 1: goto L_0x0190;
                    case 2: goto L_0x0184;
                    case 3: goto L_0x0178;
                    case 4: goto L_0x016c;
                    case 5: goto L_0x015d;
                    case 6: goto L_0x0141;
                    case 7: goto L_0x0129;
                    case 8: goto L_0x011b;
                    case 9: goto L_0x010b;
                    case 10: goto L_0x00f6;
                    case 11: goto L_0x00e6;
                    case 12: goto L_0x00d6;
                    case 13: goto L_0x00c1;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r10)
                throw r0
            L_0x00c1:
                n0.c.k.h0 r10 = new n0.c.k.h0
                n0.c.k.g1 r11 = n0.c.k.g1.b
                com.clubhouse.experimentation.ExperimentBehavior$a r4 = com.clubhouse.experimentation.ExperimentBehavior.a.a
                r10.<init>(r11, r4)
                java.lang.Object r4 = r0.m(r1, r2, r10, r13)
                r7 = r7 | 8192(0x2000, float:1.14794E-41)
                r13 = r4
                r2 = 10
                r4 = 12
                goto L_0x00e2
            L_0x00d6:
                r4 = 12
                java.lang.String r10 = r0.t(r1, r4)
                r7 = r7 | 4096(0x1000, float:5.74E-42)
                r23 = r10
                r2 = 10
            L_0x00e2:
                r11 = 11
                goto L_0x01be
            L_0x00e6:
                r4 = 12
                r11 = 11
                java.lang.String r10 = r0.t(r1, r11)
                r7 = r7 | 2048(0x800, float:2.87E-42)
                r22 = r10
                r2 = 10
                goto L_0x01be
            L_0x00f6:
                r4 = 12
                r11 = 11
                n0.c.k.e r10 = new n0.c.k.e
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r10.<init>(r2)
                r2 = 10
                java.lang.Object r9 = r0.m(r1, r2, r10, r9)
                r7 = r7 | 1024(0x400, float:1.435E-42)
                goto L_0x01be
            L_0x010b:
                r2 = 10
                r4 = 12
                r11 = 11
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r14 = r0.v(r1, r12, r10, r14)
                r7 = r7 | 512(0x200, float:7.175E-43)
                goto L_0x01be
            L_0x011b:
                r10 = r4
                r2 = 10
                r4 = 12
                r11 = 11
                boolean r19 = r0.s(r1, r10)
                r7 = r7 | 256(0x100, float:3.59E-43)
                goto L_0x013d
            L_0x0129:
                r10 = r4
                r4 = 12
                r11 = 11
                n0.c.k.e r2 = new n0.c.k.e
                n0.c.k.e0 r4 = n0.c.k.e0.b
                r2.<init>(r4)
                r4 = 7
                java.lang.Object r2 = r0.m(r1, r4, r2, r3)
                r7 = r7 | 128(0x80, float:1.794E-43)
                r3 = r2
            L_0x013d:
                r2 = 0
                r10 = 1
                goto L_0x01be
            L_0x0141:
                r10 = r4
                r4 = r11
                r11 = 11
                n0.c.k.e r2 = new n0.c.k.e
                n0.c.k.e0 r4 = n0.c.k.e0.b
                r2.<init>(r4)
                r4 = 6
                java.lang.Object r15 = r0.m(r1, r4, r2, r15)
                r7 = r7 | 64
                r2 = 13
                r11 = 7
                r27 = r10
                r10 = r4
                r4 = r27
                goto L_0x00b2
            L_0x015d:
                r10 = r4
                r4 = 6
                r11 = 11
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r4 = 5
                java.lang.Object r8 = r0.m(r1, r4, r2, r8)
                r2 = r7 | 32
                r7 = r2
                goto L_0x013d
            L_0x016c:
                r10 = r4
                r2 = 4
                r4 = 5
                r11 = 11
                boolean r6 = r0.s(r1, r2)
                r7 = r7 | 16
                goto L_0x013d
            L_0x0178:
                r10 = r4
                r2 = 3
                r4 = 5
                r11 = 11
                java.lang.String r21 = r0.t(r1, r2)
                r7 = r7 | 8
                goto L_0x013d
            L_0x0184:
                r10 = r4
                r2 = 2
                r4 = 5
                r11 = 11
                java.lang.String r25 = r0.t(r1, r2)
                r7 = r7 | 4
                goto L_0x013d
            L_0x0190:
                r10 = r4
                r4 = 5
                r11 = 11
                n0.c.k.h0 r2 = new n0.c.k.h0
                i0.e.b.b3.a.a.e.a r4 = i0.e.b.b3.a.a.e.a.a
                n0.c.k.e0 r10 = n0.c.k.e0.b
                r2.<init>(r4, r10)
                r4 = r24
                r10 = 1
                java.lang.Object r24 = r0.m(r1, r10, r2, r4)
                r2 = r7 | 2
                r7 = r2
                r2 = 0
                goto L_0x01be
            L_0x01a9:
                r4 = r24
                r2 = 0
                r10 = 1
                r11 = 11
                boolean r5 = r0.s(r1, r2)
                r7 = r7 | 1
                goto L_0x01be
            L_0x01b6:
                r4 = r24
                r2 = 0
                r10 = 1
                r11 = 11
                r26 = r2
            L_0x01be:
                r2 = 13
                r4 = 8
                r10 = 6
                r11 = 7
                goto L_0x00b2
            L_0x01c6:
                r4 = r24
                r17 = r6
                r2 = r13
                r12 = r14
                r10 = r15
                r13 = r19
                r16 = r22
                r6 = r3
                r3 = r4
                r4 = r7
                r14 = r9
                r7 = r25
                r9 = r8
                r8 = r21
            L_0x01da:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.MeResponse r0 = new com.clubhouse.android.data.models.remote.response.MeResponse
                r1 = r3
                java.util.Map r1 = (java.util.Map) r1
                r11 = r9
                com.clubhouse.android.data.models.local.user.BasicUser r11 = (com.clubhouse.android.data.models.local.user.BasicUser) r11
                r15 = r10
                java.util.List r15 = (java.util.List) r15
                r18 = r6
                java.util.List r18 = (java.util.List) r18
                r19 = r12
                java.lang.String r19 = (java.lang.String) r19
                r20 = r14
                java.util.List r20 = (java.util.List) r20
                java.util.Map r2 = (java.util.Map) r2
                r3 = r0
                r6 = r1
                r9 = r17
                r10 = r11
                r11 = r15
                r12 = r18
                r14 = r19
                r15 = r20
                r17 = r23
                r18 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.MeResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            MeResponse meResponse = (MeResponse) obj;
            i.e(encoder, "encoder");
            i.e(meResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(meResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.r(serialDescriptor, 0, meResponse.a);
            i0.e.b.b3.a.a.e.a aVar = i0.e.b.b3.a.a.e.a.a;
            e0 e0Var = e0.b;
            c.z(serialDescriptor, 1, new h0(aVar, e0Var), meResponse.b);
            c.s(serialDescriptor, 2, meResponse.c);
            c.s(serialDescriptor, 3, meResponse.d);
            c.r(serialDescriptor, 4, meResponse.e);
            c.z(serialDescriptor, 5, BasicUser.a.a, meResponse.f);
            c.z(serialDescriptor, 6, new n0.c.k.e(e0Var), meResponse.g);
            c.z(serialDescriptor, 7, new n0.c.k.e(e0Var), meResponse.h);
            c.r(serialDescriptor, 8, meResponse.i);
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 9, g1Var, meResponse.j);
            c.z(serialDescriptor, 10, new n0.c.k.e(g1Var), meResponse.k);
            c.s(serialDescriptor, 11, meResponse.l);
            c.s(serialDescriptor, 12, meResponse.m);
            c.z(serialDescriptor, 13, new h0(g1Var, ExperimentBehavior.a.a), meResponse.n);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public MeResponse(int i2, boolean z, Map map, String str, String str2, boolean z2, BasicUser basicUser, List list, List list2, boolean z3, String str3, List list3, String str4, String str5, Map map2) {
        if (16383 == (i2 & 16383)) {
            this.a = z;
            this.b = map;
            this.c = str;
            this.d = str2;
            this.e = z2;
            this.f = basicUser;
            this.g = list;
            this.h = list2;
            this.i = z3;
            this.j = str3;
            this.k = list3;
            this.l = str4;
            this.m = str5;
            this.n = map2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i2, 16383, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeResponse)) {
            return false;
        }
        MeResponse meResponse = (MeResponse) obj;
        return this.a == meResponse.a && i.a(this.b, meResponse.b) && i.a(this.c, meResponse.c) && i.a(this.d, meResponse.d) && this.e == meResponse.e && i.a(this.f, meResponse.f) && i.a(this.g, meResponse.g) && i.a(this.h, meResponse.h) && this.i == meResponse.i && i.a(this.j, meResponse.j) && i.a(this.k, meResponse.k) && i.a(this.l, meResponse.l) && i.a(this.m, meResponse.m) && i.a(this.n, meResponse.n);
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int F = i0.d.a.a.a.F(this.d, i0.d.a.a.a.F(this.c, (this.b.hashCode() + ((z ? 1 : 0) * true)) * 31, 31), 31);
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int H = i0.d.a.a.a.H(this.h, i0.d.a.a.a.H(this.g, (this.f.hashCode() + ((F + (z3 ? 1 : 0)) * 31)) * 31, 31), 31);
        boolean z4 = this.i;
        if (!z4) {
            z2 = z4;
        }
        int i2 = (H + (z2 ? 1 : 0)) * 31;
        String str = this.j;
        return this.n.hashCode() + i0.d.a.a.a.F(this.m, i0.d.a.a.a.F(this.l, i0.d.a.a.a.H(this.k, (i2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("MeResponse(hasUnreadNotifications=");
        P0.append(this.a);
        P0.append(", actionableNotificationsCountByType=");
        P0.append(this.b);
        P0.append(", refreshToken=");
        P0.append(this.c);
        P0.append(", accessToken=");
        P0.append(this.d);
        P0.append(", notificationsEnabled=");
        P0.append(this.e);
        P0.append(", userProfile=");
        P0.append(this.f);
        P0.append(", followingIds=");
        P0.append(this.g);
        P0.append(", blockedIds=");
        P0.append(this.h);
        P0.append(", isAdmin=");
        P0.append(this.i);
        P0.append(", email=");
        P0.append(this.j);
        P0.append(", featureFlags=");
        P0.append(this.k);
        P0.append(", pubnubToken=");
        P0.append(this.l);
        P0.append(", pubnubOrigin=");
        P0.append(this.m);
        P0.append(", experiments=");
        return i0.d.a.a.a.B0(P0, this.n, ')');
    }
}
