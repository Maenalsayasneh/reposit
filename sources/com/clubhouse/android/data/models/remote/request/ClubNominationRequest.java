package com.clubhouse.android.data.models.remote.request;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.c;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ClubNominationRequest.kt */
public final class ClubNominationRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final int b;
    public final Integer c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/ClubNominationRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/ClubNominationRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ClubNominationRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ClubNominationRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ClubNominationRequest.kt */
    public static final class a implements v<ClubNominationRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.ClubNominationRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("invite_nomination_id", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{e0Var, e0Var, m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            int i3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                i3 = c.k(serialDescriptor, 0);
                i2 = c.k(serialDescriptor, 1);
                obj = c.v(serialDescriptor, 2, e0.b, null);
                i = 7;
            } else {
                i3 = 0;
                int i4 = 0;
                int i5 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        i3 = c.k(serialDescriptor, 0);
                        i5 |= 1;
                    } else if (x == 1) {
                        i4 = c.k(serialDescriptor, 1);
                        i5 |= 2;
                    } else if (x == 2) {
                        obj = c.v(serialDescriptor, 2, e0.b, obj);
                        i5 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i2 = i4;
                i = i5;
            }
            c.b(serialDescriptor);
            return new ClubNominationRequest(i, i3, i2, (Integer) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ClubNominationRequest clubNominationRequest = (ClubNominationRequest) obj;
            i.e(encoder, "encoder");
            i.e(clubNominationRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(clubNominationRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.q(serialDescriptor, 0, clubNominationRequest.a);
            c.q(serialDescriptor, 1, clubNominationRequest.b);
            if (c.v(serialDescriptor, 2) || clubNominationRequest.c != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 2, e0.b, clubNominationRequest.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ClubNominationRequest(int i, int i2, int i3, Integer num) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = i3;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubNominationRequest)) {
            return false;
        }
        ClubNominationRequest clubNominationRequest = (ClubNominationRequest) obj;
        return this.a == clubNominationRequest.a && this.b == clubNominationRequest.b && i.a(this.c, clubNominationRequest.c);
    }

    public int hashCode() {
        int M = i0.d.a.a.a.M(this.b, Integer.hashCode(this.a) * 31, 31);
        Integer num = this.c;
        return M + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubNominationRequest(clubId=");
        P0.append(this.a);
        P0.append(", userId=");
        P0.append(this.b);
        P0.append(", inviteNominationId=");
        return i0.d.a.a.a.v0(P0, this.c, ')');
    }

    public ClubNominationRequest(int i, int i2, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = num;
    }

    public ClubNominationRequest(int i, int i2, Integer num, int i3) {
        int i4 = i3 & 4;
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
