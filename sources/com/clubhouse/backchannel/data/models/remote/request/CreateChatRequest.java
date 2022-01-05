package com.clubhouse.backchannel.data.models.remote.request;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.e.b.b3.a.b.c.h;
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
/* compiled from: CreateChatRequest.kt */
public final class CreateChatRequest {
    public static final Companion Companion = new Companion((f) null);
    public final List<Integer> a;
    public final SourceLocation b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/backchannel/data/models/remote/request/CreateChatRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/backchannel/data/models/remote/request/CreateChatRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "backchannel_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: CreateChatRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<CreateChatRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: CreateChatRequest.kt */
    public static final class a implements v<CreateChatRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.backchannel.data.models.remote.request.CreateChatRequest", aVar, 2);
            pluginGeneratedSerialDescriptor.i("participant_ids", false);
            pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{new n0.c.k.e(e0.b), h.a};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            Object obj;
            Object obj2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                obj2 = c.m(serialDescriptor, 0, new n0.c.k.e(e0.b), null);
                obj = c.m(serialDescriptor, 1, h.a, null);
                i = 3;
            } else {
                Object obj4 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        obj3 = c.m(serialDescriptor, 0, new n0.c.k.e(e0.b), obj3);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj4 = c.m(serialDescriptor, 1, h.a, obj4);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
                Object obj5 = obj3;
                obj = obj4;
                obj2 = obj5;
            }
            c.b(serialDescriptor);
            return new CreateChatRequest(i, (List) obj2, (SourceLocation) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            CreateChatRequest createChatRequest = (CreateChatRequest) obj;
            i.e(encoder, "encoder");
            i.e(createChatRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(createChatRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.z(serialDescriptor, 0, new n0.c.k.e(e0.b), createChatRequest.a);
            c.z(serialDescriptor, 1, h.a, createChatRequest.b);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public CreateChatRequest(int i, List list, SourceLocation sourceLocation) {
        if (3 == (i & 3)) {
            this.a = list;
            this.b = sourceLocation;
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
        if (!(obj instanceof CreateChatRequest)) {
            return false;
        }
        CreateChatRequest createChatRequest = (CreateChatRequest) obj;
        return i.a(this.a, createChatRequest.a) && this.b == createChatRequest.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CreateChatRequest(participants=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }

    public CreateChatRequest(List<Integer> list, SourceLocation sourceLocation) {
        i.e(list, "participants");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = list;
        this.b = sourceLocation;
    }
}
