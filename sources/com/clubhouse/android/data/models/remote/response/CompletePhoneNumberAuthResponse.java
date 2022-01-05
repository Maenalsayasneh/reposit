package com.clubhouse.android.data.models.remote.response;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: CompletePhoneNumberAuthResponse.kt */
public final class CompletePhoneNumberAuthResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final Boolean b;
    public final Integer c;
    public final BasicUser d;
    public final String e;
    public final String f;
    public final String g;
    public final Boolean h;
    public final Boolean i;
    public final BasicUser j;
    public final ClubWithAdmin k;
    public final List<String> l;
    public final int m;
    public final List<SourceLocation> n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/CompletePhoneNumberAuthResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/CompletePhoneNumberAuthResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: CompletePhoneNumberAuthResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CompletePhoneNumberAuthResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: CompletePhoneNumberAuthResponse.kt */
    public static final class a implements v<CompletePhoneNumberAuthResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse", aVar, 14);
            pluginGeneratedSerialDescriptor.i("success", false);
            pluginGeneratedSerialDescriptor.i("is_verified", true);
            pluginGeneratedSerialDescriptor.i("number_of_attempts_remaining", true);
            pluginGeneratedSerialDescriptor.i("user_profile", true);
            pluginGeneratedSerialDescriptor.i("auth_token", true);
            pluginGeneratedSerialDescriptor.i("refresh_token", true);
            pluginGeneratedSerialDescriptor.i("access_token", true);
            pluginGeneratedSerialDescriptor.i("is_onboarding", true);
            pluginGeneratedSerialDescriptor.i("enable_social_linking", true);
            pluginGeneratedSerialDescriptor.i("invited_by_user_profile", true);
            pluginGeneratedSerialDescriptor.i("club", true);
            pluginGeneratedSerialDescriptor.i("feature_flags", true);
            pluginGeneratedSerialDescriptor.i("num_preselect_follows", true);
            pluginGeneratedSerialDescriptor.i("onboarding_sequence", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            e0 e0Var = e0.b;
            BasicUser.a aVar = BasicUser.a.a;
            g1 g1Var = g1.b;
            return new KSerializer[]{hVar, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(g1Var)), e0Var, m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(i0.e.b.b3.a.b.c.h.a))};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x00dc, code lost:
            r8 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x011b, code lost:
            r22 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x012f, code lost:
            r4 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0153, code lost:
            r4 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0178, code lost:
            r25 = r4;
            r24 = r22;
            r2 = 13;
            r12 = 9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x01a9, code lost:
            r25 = r12;
            r3 = r20;
            r24 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x01bb, code lost:
            r12 = 9;
            r20 = r2;
            r2 = 13;
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
                if (r2 == 0) goto L_0x0086
                boolean r2 = r0.s(r1, r13)
                n0.c.k.h r13 = n0.c.k.h.b
                java.lang.Object r14 = r0.v(r1, r14, r13, r7)
                n0.c.k.e0 r5 = n0.c.k.e0.b
                java.lang.Object r5 = r0.v(r1, r15, r5, r7)
                com.clubhouse.android.data.models.local.user.BasicUser$a r15 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r8 = r0.v(r1, r8, r15, r7)
                n0.c.k.g1 r6 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r3, r6, r7)
                java.lang.Object r9 = r0.v(r1, r9, r6, r7)
                java.lang.Object r10 = r0.v(r1, r10, r6, r7)
                java.lang.Object r11 = r0.v(r1, r11, r13, r7)
                java.lang.Object r4 = r0.v(r1, r4, r13, r7)
                java.lang.Object r12 = r0.v(r1, r12, r15, r7)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r13 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r15 = 10
                java.lang.Object r13 = r0.v(r1, r15, r13, r7)
                n0.c.k.e r15 = new n0.c.k.e
                r15.<init>(r6)
                r6 = 11
                java.lang.Object r6 = r0.v(r1, r6, r15, r7)
                r15 = 12
                int r15 = r0.k(r1, r15)
                n0.c.k.e r7 = new n0.c.k.e
                r16 = r2
                i0.e.b.b3.a.b.c.h r2 = i0.e.b.b3.a.b.c.h.a
                r7.<init>(r2)
                r29 = r13
                r2 = 13
                r13 = 0
                java.lang.Object r2 = r0.v(r1, r2, r7, r13)
                r7 = 16383(0x3fff, float:2.2957E-41)
                r13 = r29
                r17 = r15
                r15 = r5
                r5 = r16
                goto L_0x01de
            L_0x0086:
                r5 = r13
                r2 = 13
                r13 = r7
                r6 = r5
                r8 = r6
                r26 = r8
                r3 = r13
                r5 = r3
                r7 = r5
                r9 = r7
                r10 = r9
                r11 = r10
                r15 = r11
                r20 = r15
                r24 = r20
                r25 = r24
                r27 = r14
                r14 = r25
            L_0x009f:
                if (r27 == 0) goto L_0x01c5
                int r4 = r0.x(r1)
                switch(r4) {
                    case -1: goto L_0x01b0;
                    case 0: goto L_0x0199;
                    case 1: goto L_0x0184;
                    case 2: goto L_0x0168;
                    case 3: goto L_0x0156;
                    case 4: goto L_0x0144;
                    case 5: goto L_0x0132;
                    case 6: goto L_0x011e;
                    case 7: goto L_0x010d;
                    case 8: goto L_0x00fe;
                    case 9: goto L_0x00ee;
                    case 10: goto L_0x00de;
                    case 11: goto L_0x00cb;
                    case 12: goto L_0x00c2;
                    case 13: goto L_0x00ae;
                    default: goto L_0x00a8;
                }
            L_0x00a8:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r4)
                throw r0
            L_0x00ae:
                n0.c.k.e r4 = new n0.c.k.e
                i0.e.b.b3.a.b.c.h r12 = i0.e.b.b3.a.b.c.h.a
                r4.<init>(r12)
                java.lang.Object r4 = r0.v(r1, r2, r4, r7)
                r7 = r8 | 8192(0x2000, float:1.14794E-41)
                r8 = r7
                r22 = r24
                r2 = 2
                r7 = r4
                goto L_0x012f
            L_0x00c2:
                r12 = 12
                int r26 = r0.k(r1, r12)
                r4 = r8 | 4096(0x1000, float:5.74E-42)
                goto L_0x00dc
            L_0x00cb:
                r12 = 12
                n0.c.k.e r4 = new n0.c.k.e
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r4.<init>(r2)
                r2 = 11
                java.lang.Object r3 = r0.v(r1, r2, r4, r3)
                r4 = r8 | 2048(0x800, float:2.87E-42)
            L_0x00dc:
                r8 = r4
                goto L_0x011b
            L_0x00de:
                r2 = 11
                r12 = 12
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r4 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r2 = 10
                java.lang.Object r4 = r0.v(r1, r2, r4, r11)
                r8 = r8 | 1024(0x400, float:1.435E-42)
                r11 = r4
                goto L_0x011b
            L_0x00ee:
                r2 = 10
                r12 = 12
                com.clubhouse.android.data.models.local.user.BasicUser$a r4 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r2 = 9
                java.lang.Object r4 = r0.v(r1, r2, r4, r9)
                r8 = r8 | 512(0x200, float:7.175E-43)
                r9 = r4
                goto L_0x011b
            L_0x00fe:
                r2 = r12
                r12 = 12
                n0.c.k.h r4 = n0.c.k.h.b
                r2 = 8
                java.lang.Object r4 = r0.v(r1, r2, r4, r13)
                r8 = r8 | 256(0x100, float:3.59E-43)
                r13 = r4
                goto L_0x011b
            L_0x010d:
                r2 = 8
                r12 = 12
                n0.c.k.h r4 = n0.c.k.h.b
                r2 = 7
                java.lang.Object r4 = r0.v(r1, r2, r4, r10)
                r8 = r8 | 128(0x80, float:1.794E-43)
                r10 = r4
            L_0x011b:
                r22 = r24
                goto L_0x0153
            L_0x011e:
                r2 = 7
                r12 = 12
                n0.c.k.g1 r4 = n0.c.k.g1.b
                r2 = 6
                java.lang.Object r4 = r0.v(r1, r2, r4, r5)
                r5 = r8 | 64
                r8 = r5
                r22 = r24
                r2 = 2
                r5 = r4
            L_0x012f:
                r4 = r25
                goto L_0x0178
            L_0x0132:
                r2 = 6
                r12 = 12
                n0.c.k.g1 r4 = n0.c.k.g1.b
                r2 = r24
                r12 = 5
                java.lang.Object r2 = r0.v(r1, r12, r4, r2)
                r4 = r8 | 32
                r22 = r2
                r8 = r4
                goto L_0x0153
            L_0x0144:
                r2 = r24
                r12 = 5
                n0.c.k.g1 r4 = n0.c.k.g1.b
                r12 = 4
                java.lang.Object r4 = r0.v(r1, r12, r4, r14)
                r8 = r8 | 16
                r22 = r2
                r14 = r4
            L_0x0153:
                r4 = r25
                goto L_0x0166
            L_0x0156:
                r2 = r24
                r12 = 4
                com.clubhouse.android.data.models.local.user.BasicUser$a r4 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r22 = r2
                r12 = r25
                r2 = 3
                java.lang.Object r4 = r0.v(r1, r2, r4, r12)
                r8 = r8 | 8
            L_0x0166:
                r2 = 2
                goto L_0x0178
            L_0x0168:
                r22 = r24
                r12 = r25
                r2 = 3
                n0.c.k.e0 r4 = n0.c.k.e0.b
                r2 = 2
                java.lang.Object r4 = r0.v(r1, r2, r4, r15)
                r8 = r8 | 4
                r15 = r4
                r4 = r12
            L_0x0178:
                r25 = r4
                r24 = r22
                r2 = 13
                r4 = 8
                r12 = 9
                goto L_0x009f
            L_0x0184:
                r22 = r24
                r12 = r25
                r2 = 2
                n0.c.k.h r4 = n0.c.k.h.b
                r2 = r20
                r20 = r3
                r3 = 1
                java.lang.Object r2 = r0.v(r1, r3, r4, r2)
                r4 = r8 | 2
                r8 = r4
                r4 = 0
                goto L_0x01a9
            L_0x0199:
                r2 = r20
                r22 = r24
                r12 = r25
                r4 = 0
                r20 = r3
                r3 = 1
                boolean r6 = r0.s(r1, r4)
                r8 = r8 | 1
            L_0x01a9:
                r25 = r12
                r3 = r20
                r24 = r22
                goto L_0x01bb
            L_0x01b0:
                r2 = r20
                r22 = r24
                r12 = r25
                r4 = 0
                r20 = r3
                r27 = r4
            L_0x01bb:
                r4 = 8
                r12 = 9
                r20 = r2
                r2 = 13
                goto L_0x009f
            L_0x01c5:
                r2 = r20
                r22 = r24
                r12 = r25
                r20 = r3
                r4 = r13
                r3 = r14
                r17 = r26
                r14 = r2
                r2 = r7
                r7 = r8
                r13 = r11
                r8 = r12
                r12 = r9
                r11 = r10
                r9 = r22
                r10 = r5
                r5 = r6
                r6 = r20
            L_0x01de:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse r0 = new com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse
                r1 = r14
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                r14 = r15
                java.lang.Integer r14 = (java.lang.Integer) r14
                com.clubhouse.android.data.models.local.user.BasicUser r8 = (com.clubhouse.android.data.models.local.user.BasicUser) r8
                r15 = r3
                java.lang.String r15 = (java.lang.String) r15
                r16 = r9
                java.lang.String r16 = (java.lang.String) r16
                r18 = r10
                java.lang.String r18 = (java.lang.String) r18
                r19 = r11
                java.lang.Boolean r19 = (java.lang.Boolean) r19
                r20 = r4
                java.lang.Boolean r20 = (java.lang.Boolean) r20
                r21 = r12
                com.clubhouse.android.data.models.local.user.BasicUser r21 = (com.clubhouse.android.data.models.local.user.BasicUser) r21
                r22 = r13
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r22 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r22
                r23 = r6
                java.util.List r23 = (java.util.List) r23
                java.util.List r2 = (java.util.List) r2
                r3 = r0
                r4 = r7
                r6 = r1
                r7 = r14
                r9 = r15
                r10 = r16
                r11 = r18
                r12 = r19
                r13 = r20
                r14 = r21
                r15 = r22
                r16 = r23
                r18 = r2
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.CompletePhoneNumberAuthResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            Integer num;
            CompletePhoneNumberAuthResponse completePhoneNumberAuthResponse = (CompletePhoneNumberAuthResponse) obj;
            i.e(encoder, "encoder");
            i.e(completePhoneNumberAuthResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(completePhoneNumberAuthResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.r(serialDescriptor, 0, completePhoneNumberAuthResponse.a);
            if (c.v(serialDescriptor, 1) || completePhoneNumberAuthResponse.b != null) {
                c.l(serialDescriptor, 1, h.b, completePhoneNumberAuthResponse.b);
            }
            if (c.v(serialDescriptor, 2) || (num = completePhoneNumberAuthResponse.c) == null || num.intValue() != Integer.MAX_VALUE) {
                c.l(serialDescriptor, 2, e0.b, completePhoneNumberAuthResponse.c);
            }
            if (c.v(serialDescriptor, 3) || completePhoneNumberAuthResponse.d != null) {
                c.l(serialDescriptor, 3, BasicUser.a.a, completePhoneNumberAuthResponse.d);
            }
            if (c.v(serialDescriptor, 4) || completePhoneNumberAuthResponse.e != null) {
                c.l(serialDescriptor, 4, g1.b, completePhoneNumberAuthResponse.e);
            }
            if (c.v(serialDescriptor, 5) || completePhoneNumberAuthResponse.f != null) {
                c.l(serialDescriptor, 5, g1.b, completePhoneNumberAuthResponse.f);
            }
            if (c.v(serialDescriptor, 6) || completePhoneNumberAuthResponse.g != null) {
                c.l(serialDescriptor, 6, g1.b, completePhoneNumberAuthResponse.g);
            }
            if (c.v(serialDescriptor, 7) || completePhoneNumberAuthResponse.h != null) {
                c.l(serialDescriptor, 7, h.b, completePhoneNumberAuthResponse.h);
            }
            if (c.v(serialDescriptor, 8) || !i.a(completePhoneNumberAuthResponse.i, Boolean.FALSE)) {
                c.l(serialDescriptor, 8, h.b, completePhoneNumberAuthResponse.i);
            }
            if (c.v(serialDescriptor, 9) || completePhoneNumberAuthResponse.j != null) {
                c.l(serialDescriptor, 9, BasicUser.a.a, completePhoneNumberAuthResponse.j);
            }
            if (c.v(serialDescriptor, 10) || completePhoneNumberAuthResponse.k != null) {
                c.l(serialDescriptor, 10, ClubWithAdmin.a.a, completePhoneNumberAuthResponse.k);
            }
            if (c.v(serialDescriptor, 11) || completePhoneNumberAuthResponse.l != null) {
                c.l(serialDescriptor, 11, new n0.c.k.e(g1.b), completePhoneNumberAuthResponse.l);
            }
            if (c.v(serialDescriptor, 12) || completePhoneNumberAuthResponse.m != 40) {
                c.q(serialDescriptor, 12, completePhoneNumberAuthResponse.m);
            }
            if (c.v(serialDescriptor, 13) || completePhoneNumberAuthResponse.n != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 13, new n0.c.k.e(i0.e.b.b3.a.b.c.h.a), completePhoneNumberAuthResponse.n);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public CompletePhoneNumberAuthResponse(int i2, boolean z, Boolean bool, Integer num, BasicUser basicUser, String str, String str2, String str3, Boolean bool2, Boolean bool3, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, List list, int i3, List list2) {
        int i4 = i2;
        if (1 == (i4 & 1)) {
            this.a = z;
            if ((i4 & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            this.c = (i4 & 4) == 0 ? Integer.MAX_VALUE : num;
            if ((i4 & 8) == 0) {
                this.d = null;
            } else {
                this.d = basicUser;
            }
            if ((i4 & 16) == 0) {
                this.e = null;
            } else {
                this.e = str;
            }
            if ((i4 & 32) == 0) {
                this.f = null;
            } else {
                this.f = str2;
            }
            if ((i4 & 64) == 0) {
                this.g = null;
            } else {
                this.g = str3;
            }
            if ((i4 & 128) == 0) {
                this.h = null;
            } else {
                this.h = bool2;
            }
            this.i = (i4 & 256) == 0 ? Boolean.FALSE : bool3;
            if ((i4 & 512) == 0) {
                this.j = null;
            } else {
                this.j = basicUser2;
            }
            if ((i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                this.k = null;
            } else {
                this.k = clubWithAdmin;
            }
            if ((i4 & 2048) == 0) {
                this.l = null;
            } else {
                this.l = list;
            }
            this.m = (i4 & 4096) == 0 ? 40 : i3;
            if ((i4 & 8192) == 0) {
                this.n = null;
            } else {
                this.n = list2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i2, 1, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletePhoneNumberAuthResponse)) {
            return false;
        }
        CompletePhoneNumberAuthResponse completePhoneNumberAuthResponse = (CompletePhoneNumberAuthResponse) obj;
        return this.a == completePhoneNumberAuthResponse.a && i.a(this.b, completePhoneNumberAuthResponse.b) && i.a(this.c, completePhoneNumberAuthResponse.c) && i.a(this.d, completePhoneNumberAuthResponse.d) && i.a(this.e, completePhoneNumberAuthResponse.e) && i.a(this.f, completePhoneNumberAuthResponse.f) && i.a(this.g, completePhoneNumberAuthResponse.g) && i.a(this.h, completePhoneNumberAuthResponse.h) && i.a(this.i, completePhoneNumberAuthResponse.i) && i.a(this.j, completePhoneNumberAuthResponse.j) && i.a(this.k, completePhoneNumberAuthResponse.k) && i.a(this.l, completePhoneNumberAuthResponse.l) && this.m == completePhoneNumberAuthResponse.m && i.a(this.n, completePhoneNumberAuthResponse.n);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        Boolean bool = this.b;
        int i3 = 0;
        int hashCode = (i2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        BasicUser basicUser = this.d;
        int hashCode3 = (hashCode2 + (basicUser == null ? 0 : basicUser.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.h;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.i;
        int hashCode8 = (hashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        BasicUser basicUser2 = this.j;
        int hashCode9 = (hashCode8 + (basicUser2 == null ? 0 : basicUser2.hashCode())) * 31;
        ClubWithAdmin clubWithAdmin = this.k;
        int hashCode10 = (hashCode9 + (clubWithAdmin == null ? 0 : clubWithAdmin.hashCode())) * 31;
        List<String> list = this.l;
        int M = i0.d.a.a.a.M(this.m, (hashCode10 + (list == null ? 0 : list.hashCode())) * 31, 31);
        List<SourceLocation> list2 = this.n;
        if (list2 != null) {
            i3 = list2.hashCode();
        }
        return M + i3;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CompletePhoneNumberAuthResponse(success=");
        P0.append(this.a);
        P0.append(", isVerified=");
        P0.append(this.b);
        P0.append(", attemptsRemaining=");
        P0.append(this.c);
        P0.append(", user=");
        P0.append(this.d);
        P0.append(", authToken=");
        P0.append(this.e);
        P0.append(", refreshToken=");
        P0.append(this.f);
        P0.append(", accessToken=");
        P0.append(this.g);
        P0.append(", isOnboarding=");
        P0.append(this.h);
        P0.append(", enableSocialLinking=");
        P0.append(this.i);
        P0.append(", invitedByUser=");
        P0.append(this.j);
        P0.append(", invitedByClub=");
        P0.append(this.k);
        P0.append(", featureFlags=");
        P0.append(this.l);
        P0.append(", numPreselectFollows=");
        P0.append(this.m);
        P0.append(", onboardingSequence=");
        return i0.d.a.a.a.A0(P0, this.n, ')');
    }
}
