package com.clubhouse.android.data.models.remote.response;

import com.clubhouse.android.data.models.local.notification.NotificationFrequency;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: GetSettingsResponse.kt */
public final class GetSettingsResponse {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final NotificationFrequency f;
    public final boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/response/GetSettingsResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/response/GetSettingsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: GetSettingsResponse.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<GetSettingsResponse> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: GetSettingsResponse.kt */
    public static final class a implements v<GetSettingsResponse> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.response.GetSettingsResponse", aVar, 7);
            pluginGeneratedSerialDescriptor.i("notifications_enable_room", false);
            pluginGeneratedSerialDescriptor.i("notifications_enable_chat", false);
            pluginGeneratedSerialDescriptor.i("notifications_enable_trending", false);
            pluginGeneratedSerialDescriptor.i("notifications_enable_other", false);
            pluginGeneratedSerialDescriptor.i("notifications_enable_send_fewer", false);
            pluginGeneratedSerialDescriptor.i("notifications_frequency", false);
            pluginGeneratedSerialDescriptor.i("notifications_is_paused", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            return new KSerializer[]{hVar, hVar, hVar, hVar, hVar, i0.e.b.b3.a.a.e.h.a, hVar};
        }

        public Object deserialize(Decoder decoder) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int i;
            int i2;
            Decoder decoder2 = decoder;
            i.e(decoder2, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder2.c(serialDescriptor);
            if (c.y()) {
                boolean s = c.s(serialDescriptor, 0);
                boolean s2 = c.s(serialDescriptor, 1);
                boolean s3 = c.s(serialDescriptor, 2);
                boolean s4 = c.s(serialDescriptor, 3);
                z2 = c.s(serialDescriptor, 4);
                obj = c.m(serialDescriptor, 5, i0.e.b.b3.a.a.e.h.a, null);
                z = c.s(serialDescriptor, 6);
                i = 127;
                z6 = s;
                boolean z7 = s3;
                z3 = s4;
                z5 = s2;
                z4 = z7;
            } else {
                boolean z8 = true;
                boolean z9 = false;
                z = false;
                int i3 = 0;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (z8) {
                    int x = c.x(serialDescriptor);
                    switch (x) {
                        case -1:
                            z8 = false;
                            continue;
                        case 0:
                            z9 = c.s(serialDescriptor, 0);
                            i3 |= 1;
                            continue;
                        case 1:
                            z11 = c.s(serialDescriptor, 1);
                            i2 = i3 | 2;
                            break;
                        case 2:
                            z12 = c.s(serialDescriptor, 2);
                            i2 = i3 | 4;
                            break;
                        case 3:
                            z10 = c.s(serialDescriptor, 3);
                            i2 = i3 | 8;
                            break;
                        case 4:
                            z13 = c.s(serialDescriptor, 4);
                            i2 = i3 | 16;
                            break;
                        case 5:
                            obj = c.m(serialDescriptor, 5, i0.e.b.b3.a.a.e.h.a, obj);
                            i2 = i3 | 32;
                            break;
                        case 6:
                            z = c.s(serialDescriptor, 6);
                            i2 = i3 | 64;
                            break;
                        default:
                            throw new UnknownFieldException(x);
                    }
                    i3 = i2;
                }
                z6 = z9;
                i = i3;
                z3 = z10;
                z5 = z11;
                z4 = z12;
                z2 = z13;
            }
            c.b(serialDescriptor);
            return new GetSettingsResponse(i, z6, z5, z4, z3, z2, (NotificationFrequency) obj, z);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            GetSettingsResponse getSettingsResponse = (GetSettingsResponse) obj;
            i.e(encoder, "encoder");
            i.e(getSettingsResponse, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(getSettingsResponse, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.r(serialDescriptor, 0, getSettingsResponse.a);
            c.r(serialDescriptor, 1, getSettingsResponse.b);
            c.r(serialDescriptor, 2, getSettingsResponse.c);
            c.r(serialDescriptor, 3, getSettingsResponse.d);
            c.r(serialDescriptor, 4, getSettingsResponse.e);
            c.z(serialDescriptor, 5, i0.e.b.b3.a.a.e.h.a, getSettingsResponse.f);
            c.r(serialDescriptor, 6, getSettingsResponse.g);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public GetSettingsResponse(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, NotificationFrequency notificationFrequency, boolean z6) {
        if (127 == (i & 127)) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = notificationFrequency;
            this.g = z6;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 127, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSettingsResponse)) {
            return false;
        }
        GetSettingsResponse getSettingsResponse = (GetSettingsResponse) obj;
        return this.a == getSettingsResponse.a && this.b == getSettingsResponse.b && this.c == getSettingsResponse.c && this.d == getSettingsResponse.d && this.e == getSettingsResponse.e && this.f == getSettingsResponse.f && this.g == getSettingsResponse.g;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.c;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.d;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.e;
        if (z6) {
            z6 = true;
        }
        int hashCode = (this.f.hashCode() + ((i4 + (z6 ? 1 : 0)) * 31)) * 31;
        boolean z7 = this.g;
        if (!z7) {
            z2 = z7;
        }
        return hashCode + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("GetSettingsResponse(notificationsEnableRoom=");
        P0.append(this.a);
        P0.append(", notificationsEnableBackchannel=");
        P0.append(this.b);
        P0.append(", notificationsEnableTrending=");
        P0.append(this.c);
        P0.append(", notificationsEnableOther=");
        P0.append(this.d);
        P0.append(", notificationsSendFewer=");
        P0.append(this.e);
        P0.append(", notificationsFrequency=");
        P0.append(this.f);
        P0.append(", notificationsPaused=");
        return i0.d.a.a.a.C0(P0, this.g, ')');
    }
}
