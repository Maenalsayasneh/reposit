package com.clubhouse.android.data.models.remote.response;

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
import n0.c.k.g1;
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: AcceptSpeakerInviteResponse.kt */
public final class AcceptSpeakerInviteResponse {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final Long f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/AcceptSpeakerInviteResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/AcceptSpeakerInviteResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: AcceptSpeakerInviteResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<AcceptSpeakerInviteResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: AcceptSpeakerInviteResponse.kt */
    public static final class a implements v<AcceptSpeakerInviteResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.AcceptSpeakerInviteResponse", aVar, 6);
            pluginGeneratedSerialDescriptor.i("token", false);
            pluginGeneratedSerialDescriptor.i("pubnub_token", false);
            pluginGeneratedSerialDescriptor.i("pubnub_origin", false);
            pluginGeneratedSerialDescriptor.i("pubnub_heartbeat_value", false);
            pluginGeneratedSerialDescriptor.i("pubnub_heartbeat_interval", false);
            pluginGeneratedSerialDescriptor.i("pubnub_time_token", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            e0 e0Var = e0.b;
            return new KSerializer[]{g1Var, g1Var, g1Var, e0Var, e0Var, m0.r.t.a.r.m.a1.a.R1(o0.b)};
        }

        public Object deserialize(Decoder decoder) {
            Object obj;
            int i;
            int i2;
            String str;
            String str2;
            String str3;
            int i3;
            Decoder decoder2 = decoder;
            i.e(decoder2, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder2.c(serialDescriptor);
            if (c.y()) {
                String t = c.t(serialDescriptor, 0);
                String t2 = c.t(serialDescriptor, 1);
                String t3 = c.t(serialDescriptor, 2);
                int k = c.k(serialDescriptor, 3);
                int k2 = c.k(serialDescriptor, 4);
                obj = c.v(serialDescriptor, 5, o0.b, null);
                str3 = t;
                i3 = 63;
                str = t3;
                i = k2;
                String str4 = t2;
                i2 = k;
                str2 = str4;
            } else {
                String str5 = null;
                String str6 = null;
                String str7 = null;
                obj = null;
                boolean z = true;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (z) {
                    int x = c.x(serialDescriptor);
                    switch (x) {
                        case -1:
                            z = false;
                            continue;
                        case 0:
                            str5 = c.t(serialDescriptor, 0);
                            i5 |= 1;
                            continue;
                        case 1:
                            i5 |= 2;
                            str6 = c.t(serialDescriptor, 1);
                            break;
                        case 2:
                            i5 |= 4;
                            str7 = c.t(serialDescriptor, 2);
                            break;
                        case 3:
                            i4 = c.k(serialDescriptor, 3);
                            i5 |= 8;
                            break;
                        case 4:
                            i6 = c.k(serialDescriptor, 4);
                            i5 |= 16;
                            break;
                        case 5:
                            i5 |= 32;
                            obj = c.v(serialDescriptor, 5, o0.b, obj);
                            break;
                        default:
                            throw new UnknownFieldException(x);
                    }
                }
                i2 = i4;
                i3 = i5;
                str3 = str5;
                str2 = str6;
                str = str7;
                i = i6;
            }
            c.b(serialDescriptor);
            return new AcceptSpeakerInviteResponse(i3, str3, str2, str, i2, i, (Long) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            AcceptSpeakerInviteResponse acceptSpeakerInviteResponse = (AcceptSpeakerInviteResponse) obj;
            i.e(encoder, "encoder");
            i.e(acceptSpeakerInviteResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(acceptSpeakerInviteResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, acceptSpeakerInviteResponse.a);
            c.s(serialDescriptor, 1, acceptSpeakerInviteResponse.b);
            c.s(serialDescriptor, 2, acceptSpeakerInviteResponse.c);
            c.q(serialDescriptor, 3, acceptSpeakerInviteResponse.d);
            c.q(serialDescriptor, 4, acceptSpeakerInviteResponse.e);
            if (c.v(serialDescriptor, 5) || acceptSpeakerInviteResponse.f != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 5, o0.b, acceptSpeakerInviteResponse.f);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public AcceptSpeakerInviteResponse(int i, String str, String str2, String str3, int i2, int i3, Long l) {
        if (31 == (i & 31)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i2;
            this.e = i3;
            if ((i & 32) == 0) {
                this.f = null;
            } else {
                this.f = l;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 31, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcceptSpeakerInviteResponse)) {
            return false;
        }
        AcceptSpeakerInviteResponse acceptSpeakerInviteResponse = (AcceptSpeakerInviteResponse) obj;
        return i.a(this.a, acceptSpeakerInviteResponse.a) && i.a(this.b, acceptSpeakerInviteResponse.b) && i.a(this.c, acceptSpeakerInviteResponse.c) && this.d == acceptSpeakerInviteResponse.d && this.e == acceptSpeakerInviteResponse.e && i.a(this.f, acceptSpeakerInviteResponse.f);
    }

    public int hashCode() {
        int M = i0.d.a.a.a.M(this.e, i0.d.a.a.a.M(this.d, i0.d.a.a.a.F(this.c, i0.d.a.a.a.F(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        Long l = this.f;
        return M + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AcceptSpeakerInviteResponse(token=");
        P0.append(this.a);
        P0.append(", pubnubToken=");
        P0.append(this.b);
        P0.append(", pubnubOrigin=");
        P0.append(this.c);
        P0.append(", pubnubHeartbeatValue=");
        P0.append(this.d);
        P0.append(", pubnubHeartbeatInterval=");
        P0.append(this.e);
        P0.append(", pubnubTimeToken=");
        P0.append(this.f);
        P0.append(')');
        return P0.toString();
    }
}
