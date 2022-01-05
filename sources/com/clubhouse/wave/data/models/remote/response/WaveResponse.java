package com.clubhouse.wave.data.models.remote.response;

import com.clubhouse.android.data.models.local.user.BasicUser;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: WaveResponse.kt */
public final class WaveResponse {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final Integer b;
    public final Integer c;
    public final OffsetDateTime d;
    public final boolean e;
    public final BasicUser f;
    public final BasicUser g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/wave/data/models/remote/response/WaveResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/wave/data/models/remote/response/WaveResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "wave_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: WaveResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<WaveResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: WaveResponse.kt */
    public static final class a implements v<WaveResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.wave.data.models.remote.response.WaveResponse", aVar, 7);
            pluginGeneratedSerialDescriptor.i("wave_id", false);
            pluginGeneratedSerialDescriptor.i("from_user_profile_id", true);
            pluginGeneratedSerialDescriptor.i("to_user_profile_id", true);
            pluginGeneratedSerialDescriptor.i("time_created", false);
            pluginGeneratedSerialDescriptor.i("suspended", true);
            pluginGeneratedSerialDescriptor.i("from_user", true);
            pluginGeneratedSerialDescriptor.i("to_user", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            BasicUser.a aVar = BasicUser.a.a;
            return new KSerializer[]{g1.b, m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), h.b, m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(aVar)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0080, code lost:
            r6 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bc, code lost:
            r14 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c3, code lost:
            r3 = r6;
            r5 = null;
            r6 = 4;
            r7 = 5;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r19) {
            /*
                r18 = this;
                r0 = r19
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 4
                r7 = 5
                r8 = 6
                r9 = 1
                r10 = 2
                if (r2 == 0) goto L_0x004f
                java.lang.String r2 = r0.t(r1, r4)
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r9, r11, r5)
                java.lang.Object r10 = r0.v(r1, r10, r11, r5)
                n0.c.a r11 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r12 = j$.time.OffsetDateTime.class
                m0.r.d r12 = m0.n.b.m.a(r12)
                kotlinx.serialization.KSerializer[] r4 = new kotlinx.serialization.KSerializer[r4]
                r11.<init>(r12, r5, r4)
                java.lang.Object r3 = r0.m(r1, r3, r11, r5)
                boolean r4 = r0.s(r1, r6)
                com.clubhouse.android.data.models.local.user.BasicUser$a r6 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r7 = r0.v(r1, r7, r6, r5)
                java.lang.Object r5 = r0.v(r1, r8, r6, r5)
                r6 = 127(0x7f, float:1.78E-43)
                r12 = r4
                r14 = r6
                r6 = r2
                goto L_0x00cc
            L_0x004f:
                r12 = r4
                r14 = r12
                r2 = r5
                r10 = r2
                r11 = r10
                r13 = r11
                r15 = r13
                r16 = r9
                r9 = r15
            L_0x0059:
                if (r16 == 0) goto L_0x00c8
                int r3 = r0.x(r1)
                switch(r3) {
                    case -1: goto L_0x00be;
                    case 0: goto L_0x00b3;
                    case 1: goto L_0x00a7;
                    case 2: goto L_0x009a;
                    case 3: goto L_0x0083;
                    case 4: goto L_0x007a;
                    case 5: goto L_0x0071;
                    case 6: goto L_0x0068;
                    default: goto L_0x0062;
                }
            L_0x0062:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r3)
                throw r0
            L_0x0068:
                com.clubhouse.android.data.models.local.user.BasicUser$a r3 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r13 = r0.v(r1, r8, r3, r13)
                r14 = r14 | 64
                goto L_0x0080
            L_0x0071:
                com.clubhouse.android.data.models.local.user.BasicUser$a r3 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r15 = r0.v(r1, r7, r3, r15)
                r14 = r14 | 32
                goto L_0x0080
            L_0x007a:
                boolean r12 = r0.s(r1, r6)
                r14 = r14 | 16
            L_0x0080:
                r5 = 1
                r6 = 3
                goto L_0x0098
            L_0x0083:
                n0.c.a r3 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r17 = j$.time.OffsetDateTime.class
                m0.r.d r6 = m0.n.b.m.a(r17)
                kotlinx.serialization.KSerializer[] r7 = new kotlinx.serialization.KSerializer[r4]
                r3.<init>(r6, r5, r7)
                r6 = 3
                java.lang.Object r11 = r0.m(r1, r6, r3, r11)
                r14 = r14 | 8
                r5 = 1
            L_0x0098:
                r7 = 2
                goto L_0x00c3
            L_0x009a:
                r6 = 3
                n0.c.k.e0 r3 = n0.c.k.e0.b
                r7 = 2
                java.lang.Object r10 = r0.v(r1, r7, r3, r10)
                r3 = r14 | 4
                r14 = r3
                r5 = 1
                goto L_0x00c3
            L_0x00a7:
                r6 = 3
                r7 = 2
                n0.c.k.e0 r3 = n0.c.k.e0.b
                r5 = 1
                java.lang.Object r9 = r0.v(r1, r5, r3, r9)
                r3 = r14 | 2
                goto L_0x00bc
            L_0x00b3:
                r5 = 1
                r6 = 3
                r7 = 2
                java.lang.String r2 = r0.t(r1, r4)
                r3 = r14 | 1
            L_0x00bc:
                r14 = r3
                goto L_0x00c3
            L_0x00be:
                r5 = 1
                r6 = 3
                r7 = 2
                r16 = r4
            L_0x00c3:
                r3 = r6
                r5 = 0
                r6 = 4
                r7 = 5
                goto L_0x0059
            L_0x00c8:
                r6 = r2
                r3 = r11
                r5 = r13
                r7 = r15
            L_0x00cc:
                r0.b(r1)
                com.clubhouse.wave.data.models.remote.response.WaveResponse r0 = new com.clubhouse.wave.data.models.remote.response.WaveResponse
                r1 = r9
                java.lang.Integer r1 = (java.lang.Integer) r1
                r8 = r10
                java.lang.Integer r8 = (java.lang.Integer) r8
                r9 = r3
                j$.time.OffsetDateTime r9 = (j$.time.OffsetDateTime) r9
                r11 = r7
                com.clubhouse.android.data.models.local.user.BasicUser r11 = (com.clubhouse.android.data.models.local.user.BasicUser) r11
                r2 = r5
                com.clubhouse.android.data.models.local.user.BasicUser r2 = (com.clubhouse.android.data.models.local.user.BasicUser) r2
                r4 = r0
                r5 = r14
                r7 = r1
                r10 = r12
                r12 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.wave.data.models.remote.response.WaveResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            WaveResponse waveResponse = (WaveResponse) obj;
            i.e(encoder, "encoder");
            i.e(waveResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(waveResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, waveResponse.a);
            if (c.v(serialDescriptor, 1) || waveResponse.b != null) {
                c.l(serialDescriptor, 1, e0.b, waveResponse.b);
            }
            if (c.v(serialDescriptor, 2) || waveResponse.c != null) {
                c.l(serialDescriptor, 2, e0.b, waveResponse.c);
            }
            c.z(serialDescriptor, 3, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), waveResponse.d);
            if (c.v(serialDescriptor, 4) || waveResponse.e) {
                c.r(serialDescriptor, 4, waveResponse.e);
            }
            if (c.v(serialDescriptor, 5) || waveResponse.f != null) {
                c.l(serialDescriptor, 5, BasicUser.a.a, waveResponse.f);
            }
            if (c.v(serialDescriptor, 6) || waveResponse.g != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 6, BasicUser.a.a, waveResponse.g);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public WaveResponse(int i, String str, Integer num, Integer num2, OffsetDateTime offsetDateTime, boolean z, BasicUser basicUser, BasicUser basicUser2) {
        if (9 == (i & 9)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
            this.d = offsetDateTime;
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = basicUser;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = basicUser2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 9, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveResponse)) {
            return false;
        }
        WaveResponse waveResponse = (WaveResponse) obj;
        return i.a(this.a, waveResponse.a) && i.a(this.b, waveResponse.b) && i.a(this.c, waveResponse.c) && i.a(this.d, waveResponse.d) && this.e == waveResponse.e && i.a(this.f, waveResponse.f) && i.a(this.g, waveResponse.g);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        boolean z = this.e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        BasicUser basicUser = this.f;
        int hashCode4 = (i2 + (basicUser == null ? 0 : basicUser.hashCode())) * 31;
        BasicUser basicUser2 = this.g;
        if (basicUser2 != null) {
            i = basicUser2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("WaveResponse(waveId=");
        P0.append(this.a);
        P0.append(", fromUserId=");
        P0.append(this.b);
        P0.append(", toUserId=");
        P0.append(this.c);
        P0.append(", timeCreated=");
        P0.append(this.d);
        P0.append(", suspended=");
        P0.append(this.e);
        P0.append(", fromUser=");
        P0.append(this.f);
        P0.append(", toUser=");
        P0.append(this.g);
        P0.append(')');
        return P0.toString();
    }
}
