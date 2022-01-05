package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.local.club.ClubRule;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
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
/* compiled from: UpdateClubRulesRequest.kt */
public final class UpdateClubRulesRequest {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final List<ClubRule> b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UpdateClubRulesRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UpdateClubRulesRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateClubRulesRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateClubRulesRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateClubRulesRequest.kt */
    public static final class a implements v<UpdateClubRulesRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UpdateClubRulesRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            pluginGeneratedSerialDescriptor.i("rules", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{e0.b, new n0.c.k.e(ClubRule.a.a)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            int i2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                i2 = c.k(serialDescriptor, 0);
                obj = c.m(serialDescriptor, 1, new n0.c.k.e(ClubRule.a.a), null);
                i = 3;
            } else {
                i2 = 0;
                int i3 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        i2 = c.k(serialDescriptor, 0);
                        i3 |= 1;
                    } else if (x == 1) {
                        obj = c.m(serialDescriptor, 1, new n0.c.k.e(ClubRule.a.a), obj);
                        i3 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i3;
            }
            c.b(serialDescriptor);
            return new UpdateClubRulesRequest(i, i2, (List) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateClubRulesRequest updateClubRulesRequest = (UpdateClubRulesRequest) obj;
            i.e(encoder, "encoder");
            i.e(updateClubRulesRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(updateClubRulesRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.q(serialDescriptor, 0, updateClubRulesRequest.a);
            c.z(serialDescriptor, 1, new n0.c.k.e(ClubRule.a.a), updateClubRulesRequest.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdateClubRulesRequest(int i, int i2, List list) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = list;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateClubRulesRequest)) {
            return false;
        }
        UpdateClubRulesRequest updateClubRulesRequest = (UpdateClubRulesRequest) obj;
        return this.a == updateClubRulesRequest.a && i.a(this.b, updateClubRulesRequest.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateClubRulesRequest(clubId=");
        P0.append(this.a);
        P0.append(", rules=");
        return i0.d.a.a.a.A0(P0, this.b, ')');
    }

    public UpdateClubRulesRequest(int i, List<ClubRule> list) {
        i.e(list, "rules");
        this.a = i;
        this.b = list;
    }
}
