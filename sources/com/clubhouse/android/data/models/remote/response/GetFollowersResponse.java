package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.user.UserInList;
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
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetFollowersResponse.kt */
public final class GetFollowersResponse {
    public static final Companion Companion = new Companion((f) null);
    public final List<UserInList> a;
    public final int b;
    public final Integer c;
    public final Integer d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetFollowersResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetFollowersResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetFollowersResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetFollowersResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetFollowersResponse.kt */
    public static final class a implements v<GetFollowersResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetFollowersResponse", aVar, 4);
            pluginGeneratedSerialDescriptor.i("users", false);
            pluginGeneratedSerialDescriptor.i("count", false);
            pluginGeneratedSerialDescriptor.i("next", false);
            pluginGeneratedSerialDescriptor.i("previous", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{new n0.c.k.e(UserInList.a.a), e0Var, m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r14) {
            /*
                r13 = this;
                java.lang.String r0 = "decoder"
                m0.n.b.i.e(r14, r0)
                kotlinx.serialization.descriptors.SerialDescriptor r0 = b
                n0.c.j.c r14 = r14.c(r0)
                boolean r1 = r14.y()
                r2 = 3
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 2
                if (r1 == 0) goto L_0x0034
                n0.c.k.e r1 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r7 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r1.<init>(r7)
                java.lang.Object r1 = r14.m(r0, r4, r1, r3)
                int r4 = r14.k(r0, r5)
                n0.c.k.e0 r5 = n0.c.k.e0.b
                java.lang.Object r6 = r14.v(r0, r6, r5, r3)
                java.lang.Object r2 = r14.v(r0, r2, r5, r3)
                r3 = 15
                r9 = r4
                r4 = r3
                goto L_0x007e
            L_0x0034:
                r1 = r3
                r7 = r1
                r8 = r7
                r3 = r4
                r9 = r3
                r10 = r5
            L_0x003a:
                if (r10 == 0) goto L_0x007a
                int r11 = r14.x(r0)
                r12 = -1
                if (r11 == r12) goto L_0x0078
                if (r11 == 0) goto L_0x006a
                if (r11 == r5) goto L_0x0063
                if (r11 == r6) goto L_0x005a
                if (r11 != r2) goto L_0x0054
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r1 = r14.v(r0, r2, r11, r1)
                r3 = r3 | 8
                goto L_0x003a
            L_0x0054:
                kotlinx.serialization.UnknownFieldException r14 = new kotlinx.serialization.UnknownFieldException
                r14.<init>(r11)
                throw r14
            L_0x005a:
                n0.c.k.e0 r11 = n0.c.k.e0.b
                java.lang.Object r8 = r14.v(r0, r6, r11, r8)
                r3 = r3 | 4
                goto L_0x003a
            L_0x0063:
                int r9 = r14.k(r0, r5)
                r3 = r3 | 2
                goto L_0x003a
            L_0x006a:
                n0.c.k.e r11 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r12 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r11.<init>(r12)
                java.lang.Object r7 = r14.m(r0, r4, r11, r7)
                r3 = r3 | 1
                goto L_0x003a
            L_0x0078:
                r10 = r4
                goto L_0x003a
            L_0x007a:
                r2 = r1
                r4 = r3
                r1 = r7
                r6 = r8
            L_0x007e:
                r14.b(r0)
                com.clubhouse.android.data.models.remote.response.GetFollowersResponse r14 = new com.clubhouse.android.data.models.remote.response.GetFollowersResponse
                r5 = r1
                java.util.List r5 = (java.util.List) r5
                r7 = r6
                java.lang.Integer r7 = (java.lang.Integer) r7
                r8 = r2
                java.lang.Integer r8 = (java.lang.Integer) r8
                r3 = r14
                r6 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.GetFollowersResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetFollowersResponse getFollowersResponse = (GetFollowersResponse) obj;
            i.e(encoder, "encoder");
            i.e(getFollowersResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getFollowersResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, new n0.c.k.e(UserInList.a.a), getFollowersResponse.a);
            c.q(serialDescriptor, 1, getFollowersResponse.b);
            e0 e0Var = e0.b;
            c.l(serialDescriptor, 2, e0Var, getFollowersResponse.c);
            c.l(serialDescriptor, 3, e0Var, getFollowersResponse.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetFollowersResponse(int i, List list, int i2, Integer num, Integer num2) {
        if (15 == (i & 15)) {
            this.a = list;
            this.b = i2;
            this.c = num;
            this.d = num2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 15, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFollowersResponse)) {
            return false;
        }
        GetFollowersResponse getFollowersResponse = (GetFollowersResponse) obj;
        return i.a(this.a, getFollowersResponse.a) && this.b == getFollowersResponse.b && i.a(this.c, getFollowersResponse.c) && i.a(this.d, getFollowersResponse.d);
    }

    public int hashCode() {
        int i;
        int M = i0.d.a.a.a.M(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int i2 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = (M + i) * 31;
        Integer num2 = this.d;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetFollowersResponse(users=");
        P0.append(this.a);
        P0.append(", count=");
        P0.append(this.b);
        P0.append(", next=");
        P0.append(this.c);
        P0.append(", previous=");
        return i0.d.a.a.a.v0(P0, this.d, ')');
    }
}
