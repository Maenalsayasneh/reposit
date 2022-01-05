package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
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
/* compiled from: GetFollowingResponse.kt */
public final class GetFollowingResponse {
    public static final Companion Companion = new Companion((f) null);
    public final List<UserInList> a;
    public final List<ClubWithAdmin> b;
    public final int c;
    public final Integer d;
    public final Integer e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetFollowingResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetFollowingResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetFollowingResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetFollowingResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetFollowingResponse.kt */
    public static final class a implements v<GetFollowingResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetFollowingResponse", aVar, 5);
            pluginGeneratedSerialDescriptor.i("users", false);
            pluginGeneratedSerialDescriptor.i("clubs", false);
            pluginGeneratedSerialDescriptor.i("count", false);
            pluginGeneratedSerialDescriptor.i("next", false);
            pluginGeneratedSerialDescriptor.i("previous", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{new n0.c.k.e(UserInList.a.a), new n0.c.k.e(ClubWithAdmin.a.a), e0Var, m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 3
                r4 = 0
                r5 = 0
                r6 = 1
                r7 = 2
                r8 = 4
                if (r2 == 0) goto L_0x0042
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r9 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r2.<init>(r9)
                java.lang.Object r2 = r0.m(r1, r5, r2, r4)
                n0.c.k.e r5 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r9 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r5.<init>(r9)
                java.lang.Object r5 = r0.m(r1, r6, r5, r4)
                int r6 = r0.k(r1, r7)
                n0.c.k.e0 r7 = n0.c.k.e0.b
                java.lang.Object r3 = r0.v(r1, r3, r7, r4)
                java.lang.Object r4 = r0.v(r1, r8, r7, r4)
                r7 = 31
                r10 = r6
                goto L_0x009e
            L_0x0042:
                r2 = r4
                r9 = r2
                r10 = r9
                r11 = r5
                r12 = r11
                r13 = r6
            L_0x0048:
                if (r13 == 0) goto L_0x0098
                int r14 = r0.x(r1)
                r15 = -1
                if (r14 == r15) goto L_0x0096
                if (r14 == 0) goto L_0x0088
                if (r14 == r6) goto L_0x007a
                if (r14 == r7) goto L_0x0073
                if (r14 == r3) goto L_0x006a
                if (r14 != r8) goto L_0x0064
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r8, r14, r9)
                r12 = r12 | 16
                goto L_0x0048
            L_0x0064:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r14)
                throw r0
            L_0x006a:
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r2 = r0.v(r1, r3, r14, r2)
                r12 = r12 | 8
                goto L_0x0048
            L_0x0073:
                int r11 = r0.k(r1, r7)
                r12 = r12 | 4
                goto L_0x0048
            L_0x007a:
                n0.c.k.e r14 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r15 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r14.<init>(r15)
                java.lang.Object r4 = r0.m(r1, r6, r14, r4)
                r12 = r12 | 2
                goto L_0x0048
            L_0x0088:
                n0.c.k.e r14 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r15 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r14.<init>(r15)
                java.lang.Object r10 = r0.m(r1, r5, r14, r10)
                r12 = r12 | 1
                goto L_0x0048
            L_0x0096:
                r13 = r5
                goto L_0x0048
            L_0x0098:
                r3 = r2
                r5 = r4
                r4 = r9
                r2 = r10
                r10 = r11
                r7 = r12
            L_0x009e:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.response.GetFollowingResponse r0 = new com.clubhouse.android.data.models.remote.response.GetFollowingResponse
                r8 = r2
                java.util.List r8 = (java.util.List) r8
                r9 = r5
                java.util.List r9 = (java.util.List) r9
                r11 = r3
                java.lang.Integer r11 = (java.lang.Integer) r11
                r12 = r4
                java.lang.Integer r12 = (java.lang.Integer) r12
                r6 = r0
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.response.GetFollowingResponse.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetFollowingResponse getFollowingResponse = (GetFollowingResponse) obj;
            i.e(encoder, "encoder");
            i.e(getFollowingResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getFollowingResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, new n0.c.k.e(UserInList.a.a), getFollowingResponse.a);
            c.z(serialDescriptor, 1, new n0.c.k.e(ClubWithAdmin.a.a), getFollowingResponse.b);
            c.q(serialDescriptor, 2, getFollowingResponse.c);
            e0 e0Var = e0.b;
            c.l(serialDescriptor, 3, e0Var, getFollowingResponse.d);
            c.l(serialDescriptor, 4, e0Var, getFollowingResponse.e);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetFollowingResponse(int i, List list, List list2, int i2, Integer num, Integer num2) {
        if (31 == (i & 31)) {
            this.a = list;
            this.b = list2;
            this.c = i2;
            this.d = num;
            this.e = num2;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 31, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFollowingResponse)) {
            return false;
        }
        GetFollowingResponse getFollowingResponse = (GetFollowingResponse) obj;
        return i.a(this.a, getFollowingResponse.a) && i.a(this.b, getFollowingResponse.b) && this.c == getFollowingResponse.c && i.a(this.d, getFollowingResponse.d) && i.a(this.e, getFollowingResponse.e);
    }

    public int hashCode() {
        int i;
        int M = i0.d.a.a.a.M(this.c, i0.d.a.a.a.H(this.b, this.a.hashCode() * 31, 31), 31);
        Integer num = this.d;
        int i2 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i3 = (M + i) * 31;
        Integer num2 = this.e;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetFollowingResponse(users=");
        P0.append(this.a);
        P0.append(", clubs=");
        P0.append(this.b);
        P0.append(", count=");
        P0.append(this.c);
        P0.append(", next=");
        P0.append(this.d);
        P0.append(", previous=");
        return i0.d.a.a.a.v0(P0, this.e, ')');
    }
}
