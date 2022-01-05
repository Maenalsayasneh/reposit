package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
/* compiled from: CreateChannelRequest.kt */
public final class CreateChannelRequest {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final boolean b;
    public final List<Integer> c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final String g;
    public final SourceLocation h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/CreateChannelRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/CreateChannelRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: CreateChannelRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CreateChannelRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: CreateChannelRequest.kt */
    public static final class a implements v<CreateChannelRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.CreateChannelRequest", aVar, 8);
            pluginGeneratedSerialDescriptor.i("is_social_mode", false);
            pluginGeneratedSerialDescriptor.i("is_private", false);
            pluginGeneratedSerialDescriptor.i("user_ids", true);
            pluginGeneratedSerialDescriptor.i("club_id", true);
            pluginGeneratedSerialDescriptor.i("event_id", true);
            pluginGeneratedSerialDescriptor.i("topic", true);
            pluginGeneratedSerialDescriptor.i("chat_id", true);
            pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{hVar, hVar, new n0.c.k.e(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), i0.e.b.b3.a.b.c.h.a};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0091, code lost:
            r3 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c8, code lost:
            r19 = r16;
            r16 = r2;
            r2 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d5, code lost:
            r11 = r3;
            r3 = 6;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r21) {
            /*
                r20 = this;
                r0 = r21
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 6
                r4 = 5
                r5 = 0
                r6 = 4
                r7 = 3
                r8 = 7
                r9 = 0
                r10 = 1
                r11 = 2
                if (r2 == 0) goto L_0x0050
                boolean r2 = r0.s(r1, r9)
                boolean r9 = r0.s(r1, r10)
                n0.c.k.e r10 = new n0.c.k.e
                n0.c.k.e0 r12 = n0.c.k.e0.b
                r10.<init>(r12)
                java.lang.Object r10 = r0.m(r1, r11, r10, r5)
                java.lang.Object r7 = r0.v(r1, r7, r12, r5)
                java.lang.Object r6 = r0.v(r1, r6, r12, r5)
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r4 = r0.v(r1, r4, r11, r5)
                java.lang.Object r3 = r0.v(r1, r3, r11, r5)
                i0.e.b.b3.a.b.c.h r11 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r5 = r0.m(r1, r8, r11, r5)
                r8 = 255(0xff, float:3.57E-43)
                r12 = r3
                r17 = r9
                r3 = r2
                r2 = r8
                goto L_0x00de
            L_0x0050:
                r12 = r5
                r13 = r12
                r14 = r13
                r15 = r14
                r2 = r9
                r17 = r2
                r18 = r10
                r10 = r17
                r9 = r15
            L_0x005c:
                if (r18 == 0) goto L_0x00d8
                int r11 = r0.x(r1)
                switch(r11) {
                    case -1: goto L_0x00cf;
                    case 0: goto L_0x00bf;
                    case 1: goto L_0x00b3;
                    case 2: goto L_0x00a0;
                    case 3: goto L_0x0096;
                    case 4: goto L_0x0088;
                    case 5: goto L_0x007e;
                    case 6: goto L_0x0074;
                    case 7: goto L_0x006b;
                    default: goto L_0x0065;
                }
            L_0x0065:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r11)
                throw r0
            L_0x006b:
                i0.e.b.b3.a.b.c.h r11 = i0.e.b.b3.a.b.c.h.a
                java.lang.Object r5 = r0.m(r1, r8, r11, r5)
                r10 = r10 | 128(0x80, float:1.794E-43)
                goto L_0x0091
            L_0x0074:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r11 = r0.v(r1, r3, r11, r12)
                r10 = r10 | 64
                r12 = r11
                goto L_0x0091
            L_0x007e:
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r11 = r0.v(r1, r4, r11, r13)
                r10 = r10 | 32
                r13 = r11
                goto L_0x0091
            L_0x0088:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r11 = r0.v(r1, r6, r11, r15)
                r10 = r10 | 16
                r15 = r11
            L_0x0091:
                r3 = 2
                r11 = 1
                r16 = 0
                goto L_0x00d5
            L_0x0096:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r14 = r0.v(r1, r7, r11, r14)
                r10 = r10 | 8
                r11 = 2
                goto L_0x005c
            L_0x00a0:
                n0.c.k.e r11 = new n0.c.k.e
                n0.c.k.e0 r3 = n0.c.k.e0.b
                r11.<init>(r3)
                r3 = 2
                java.lang.Object r9 = r0.m(r1, r3, r11, r9)
                r10 = r10 | 4
                r16 = r2
                r2 = 0
                r11 = 1
                goto L_0x00c8
            L_0x00b3:
                r3 = 2
                r11 = 1
                boolean r17 = r0.s(r1, r11)
                r10 = r10 | 2
                r16 = r2
                r2 = 0
                goto L_0x00c8
            L_0x00bf:
                r2 = 0
                r3 = 2
                r11 = 1
                boolean r16 = r0.s(r1, r2)
                r10 = r10 | 1
            L_0x00c8:
                r19 = r16
                r16 = r2
                r2 = r19
                goto L_0x00d5
            L_0x00cf:
                r3 = 2
                r11 = 1
                r16 = 0
                r18 = r16
            L_0x00d5:
                r11 = r3
                r3 = 6
                goto L_0x005c
            L_0x00d8:
                r3 = r2
                r2 = r10
                r4 = r13
                r7 = r14
                r6 = r15
                r10 = r9
            L_0x00de:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.request.CreateChannelRequest r0 = new com.clubhouse.android.data.models.remote.request.CreateChannelRequest
                r8 = r10
                java.util.List r8 = (java.util.List) r8
                java.lang.Integer r7 = (java.lang.Integer) r7
                r9 = r6
                java.lang.Integer r9 = (java.lang.Integer) r9
                r10 = r4
                java.lang.String r10 = (java.lang.String) r10
                r11 = r12
                java.lang.String r11 = (java.lang.String) r11
                r12 = r5
                com.clubhouse.android.data.models.local.user.SourceLocation r12 = (com.clubhouse.android.data.models.local.user.SourceLocation) r12
                r1 = r0
                r4 = r17
                r5 = r8
                r6 = r7
                r7 = r9
                r8 = r10
                r9 = r11
                r10 = r12
                r1.<init>((int) r2, (boolean) r3, (boolean) r4, (java.util.List) r5, (java.lang.Integer) r6, (java.lang.Integer) r7, (java.lang.String) r8, (java.lang.String) r9, (com.clubhouse.android.data.models.local.user.SourceLocation) r10)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.CreateChannelRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            CreateChannelRequest createChannelRequest = (CreateChannelRequest) obj;
            i.e(encoder, "encoder");
            i.e(createChannelRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(createChannelRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.r(serialDescriptor, 0, createChannelRequest.a);
            c.r(serialDescriptor, 1, createChannelRequest.b);
            if (c.v(serialDescriptor, 2) || !i.a(createChannelRequest.c, EmptyList.c)) {
                c.z(serialDescriptor, 2, new n0.c.k.e(e0.b), createChannelRequest.c);
            }
            if (c.v(serialDescriptor, 3) || createChannelRequest.d != null) {
                c.l(serialDescriptor, 3, e0.b, createChannelRequest.d);
            }
            if (c.v(serialDescriptor, 4) || createChannelRequest.e != null) {
                c.l(serialDescriptor, 4, e0.b, createChannelRequest.e);
            }
            if (c.v(serialDescriptor, 5) || createChannelRequest.f != null) {
                c.l(serialDescriptor, 5, g1.b, createChannelRequest.f);
            }
            if (c.v(serialDescriptor, 6) || createChannelRequest.g != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 6, g1.b, createChannelRequest.g);
            }
            c.z(serialDescriptor, 7, i0.e.b.b3.a.b.c.h.a, createChannelRequest.h);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public CreateChannelRequest(int i, boolean z, boolean z2, List list, Integer num, Integer num2, String str, String str2, SourceLocation sourceLocation) {
        if (131 == (i & PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS)) {
            this.a = z;
            this.b = z2;
            if ((i & 4) == 0) {
                this.c = EmptyList.c;
            } else {
                this.c = list;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num;
            }
            if ((i & 16) == 0) {
                this.e = null;
            } else {
                this.e = num2;
            }
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = str;
            }
            if ((i & 64) == 0) {
                this.g = null;
            } else {
                this.g = str2;
            }
            this.h = sourceLocation;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateChannelRequest)) {
            return false;
        }
        CreateChannelRequest createChannelRequest = (CreateChannelRequest) obj;
        return this.a == createChannelRequest.a && this.b == createChannelRequest.b && i.a(this.c, createChannelRequest.c) && i.a(this.d, createChannelRequest.d) && i.a(this.e, createChannelRequest.e) && i.a(this.f, createChannelRequest.f) && i.a(this.g, createChannelRequest.g) && this.h == createChannelRequest.h;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (!z3) {
            z2 = z3;
        }
        int H = i0.d.a.a.a.H(this.c, (i + (z2 ? 1 : 0)) * 31, 31);
        Integer num = this.d;
        int i2 = 0;
        int hashCode = (H + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.h.hashCode() + ((hashCode3 + i2) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CreateChannelRequest(isSocialMode=");
        P0.append(this.a);
        P0.append(", isPrivate=");
        P0.append(this.b);
        P0.append(", userIds=");
        P0.append(this.c);
        P0.append(", clubId=");
        P0.append(this.d);
        P0.append(", eventId=");
        P0.append(this.e);
        P0.append(", topic=");
        P0.append(this.f);
        P0.append(", chatId=");
        P0.append(this.g);
        P0.append(", source=");
        P0.append(this.h);
        P0.append(')');
        return P0.toString();
    }

    public CreateChannelRequest(boolean z, boolean z2, List<Integer> list, Integer num, Integer num2, String str, String str2, SourceLocation sourceLocation, int i) {
        list = (i & 4) != 0 ? EmptyList.c : list;
        num = (i & 8) != 0 ? null : num;
        num2 = (i & 16) != 0 ? null : num2;
        str = (i & 32) != 0 ? null : str;
        str2 = (i & 64) != 0 ? null : str2;
        i.e(list, "userIds");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = num;
        this.e = num2;
        this.f = str;
        this.g = str2;
        this.h = sourceLocation;
    }
}
