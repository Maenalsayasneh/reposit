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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UpdateIsMembershipOpenRequest.kt */
public final class UpdateIsMembershipOpenRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final boolean b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UpdateIsMembershipOpenRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UpdateIsMembershipOpenRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateIsMembershipOpenRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateIsMembershipOpenRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateIsMembershipOpenRequest.kt */
    public static final class a implements v<UpdateIsMembershipOpenRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UpdateIsMembershipOpenRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            pluginGeneratedSerialDescriptor.i("is_membership_open", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{e0.b, h.b};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            boolean z;
            int i2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                i2 = c.k(serialDescriptor, 0);
                z = c.s(serialDescriptor, 1);
                i = 3;
            } else {
                i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                boolean z3 = true;
                while (z3) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z3 = false;
                    } else if (x == 0) {
                        i2 = c.k(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (x == 1) {
                        z2 = c.s(serialDescriptor, 1);
                        i3 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z = z2;
                i = i3;
            }
            c.b(serialDescriptor);
            return new UpdateIsMembershipOpenRequest(i, i2, z);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateIsMembershipOpenRequest updateIsMembershipOpenRequest = (UpdateIsMembershipOpenRequest) obj;
            i.e(encoder, "encoder");
            i.e(updateIsMembershipOpenRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updateIsMembershipOpenRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.q(serialDescriptor, 0, updateIsMembershipOpenRequest.a);
            if (c.v(serialDescriptor, 1) || updateIsMembershipOpenRequest.b) {
                z = true;
            }
            if (z) {
                c.r(serialDescriptor, 1, updateIsMembershipOpenRequest.b);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdateIsMembershipOpenRequest(int i, int i2, boolean z) {
        if (1 == (i & 1)) {
            this.a = i2;
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateIsMembershipOpenRequest)) {
            return false;
        }
        UpdateIsMembershipOpenRequest updateIsMembershipOpenRequest = (UpdateIsMembershipOpenRequest) obj;
        return this.a == updateIsMembershipOpenRequest.a && this.b == updateIsMembershipOpenRequest.b;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateIsMembershipOpenRequest(clubId=");
        P0.append(this.a);
        P0.append(", isMembershipOpen=");
        return i0.d.a.a.a.C0(P0, this.b, ')');
    }

    public UpdateIsMembershipOpenRequest(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
