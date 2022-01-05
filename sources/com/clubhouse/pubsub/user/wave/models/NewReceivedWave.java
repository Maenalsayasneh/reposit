package com.clubhouse.pubsub.user.wave.models;

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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: WavePubSubMessage.kt */
public final class NewReceivedWave extends WavePubSubMessage {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/pubsub/user/wave/models/NewReceivedWave$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/pubsub/user/wave/models/NewReceivedWave;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "pubsub_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: WavePubSubMessage.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<NewReceivedWave> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: WavePubSubMessage.kt */
    public static final class a implements v<NewReceivedWave> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.pubsub.user.wave.models.NewReceivedWave", aVar, 6);
            pluginGeneratedSerialDescriptor.i("wave_id", false);
            pluginGeneratedSerialDescriptor.i("from_user_profile_id", false);
            pluginGeneratedSerialDescriptor.i("from_user_name", false);
            pluginGeneratedSerialDescriptor.i("from_user_username", false);
            pluginGeneratedSerialDescriptor.i("from_user_photo", false);
            pluginGeneratedSerialDescriptor.i("should_toast", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, e0.b, g1Var, g1Var, g1Var, h.b};
        }

        public Object deserialize(Decoder decoder) {
            boolean z;
            String str;
            String str2;
            String str3;
            int i;
            String str4;
            int i2;
            int i3;
            Decoder decoder2 = decoder;
            i.e(decoder2, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder2.c(serialDescriptor);
            if (c.y()) {
                String t = c.t(serialDescriptor, 0);
                int k = c.k(serialDescriptor, 1);
                String t2 = c.t(serialDescriptor, 2);
                String t3 = c.t(serialDescriptor, 3);
                String t4 = c.t(serialDescriptor, 4);
                str4 = t;
                z = c.s(serialDescriptor, 5);
                str2 = t3;
                i = k;
                str3 = t2;
                str = t4;
                i2 = 63;
            } else {
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                boolean z2 = true;
                boolean z3 = false;
                int i4 = 0;
                int i5 = 0;
                while (z2) {
                    int x = c.x(serialDescriptor);
                    switch (x) {
                        case -1:
                            z2 = false;
                            continue;
                        case 0:
                            str5 = c.t(serialDescriptor, 0);
                            i5 |= 1;
                            continue;
                        case 1:
                            i4 = c.k(serialDescriptor, 1);
                            i3 = i5 | 2;
                            break;
                        case 2:
                            str7 = c.t(serialDescriptor, 2);
                            i3 = i5 | 4;
                            break;
                        case 3:
                            str6 = c.t(serialDescriptor, 3);
                            i3 = i5 | 8;
                            break;
                        case 4:
                            str8 = c.t(serialDescriptor, 4);
                            i3 = i5 | 16;
                            break;
                        case 5:
                            z3 = c.s(serialDescriptor, 5);
                            i3 = i5 | 32;
                            break;
                        default:
                            throw new UnknownFieldException(x);
                    }
                    i5 = i3;
                }
                z = z3;
                str = str8;
                str3 = str7;
                i = i4;
                str4 = str5;
                int i6 = i5;
                str2 = str6;
                i2 = i6;
            }
            c.b(serialDescriptor);
            return new NewReceivedWave(i2, str4, i, str3, str2, str, z);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            NewReceivedWave newReceivedWave = (NewReceivedWave) obj;
            i.e(encoder, "encoder");
            i.e(newReceivedWave, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(newReceivedWave, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.s(serialDescriptor, 0, newReceivedWave.a);
            c.q(serialDescriptor, 1, newReceivedWave.b);
            c.s(serialDescriptor, 2, newReceivedWave.c);
            c.s(serialDescriptor, 3, newReceivedWave.d);
            c.s(serialDescriptor, 4, newReceivedWave.e);
            c.r(serialDescriptor, 5, newReceivedWave.f);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewReceivedWave(int i, String str, int i2, String str2, String str3, String str4, boolean z) {
        super((f) null);
        if (63 == (i & 63)) {
            this.a = str;
            this.b = i2;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = z;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 63, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewReceivedWave)) {
            return false;
        }
        NewReceivedWave newReceivedWave = (NewReceivedWave) obj;
        return i.a(this.a, newReceivedWave.a) && this.b == newReceivedWave.b && i.a(this.c, newReceivedWave.c) && i.a(this.d, newReceivedWave.d) && i.a(this.e, newReceivedWave.e) && this.f == newReceivedWave.f;
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.e, i0.d.a.a.a.F(this.d, i0.d.a.a.a.F(this.c, i0.d.a.a.a.M(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        boolean z = this.f;
        if (z) {
            z = true;
        }
        return F + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("NewReceivedWave(waveId=");
        P0.append(this.a);
        P0.append(", fromUserId=");
        P0.append(this.b);
        P0.append(", fromUserName=");
        P0.append(this.c);
        P0.append(", fromUserUsername=");
        P0.append(this.d);
        P0.append(", fromUserPhotoUrl=");
        P0.append(this.e);
        P0.append(", shouldToast=");
        return i0.d.a.a.a.C0(P0, this.f, ')');
    }
}
