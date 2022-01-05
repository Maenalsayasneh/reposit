package com.clubhouse.backchannel.data.models.remote.request;

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
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: SendChatMessageRequest.kt */
public final class SendChatMessageRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public String b;
    public String c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/backchannel/data/models/remote/request/SendChatMessageRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/backchannel/data/models/remote/request/SendChatMessageRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "backchannel_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SendChatMessageRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<SendChatMessageRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: SendChatMessageRequest.kt */
    public static final class a implements v<SendChatMessageRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.backchannel.data.models.remote.request.SendChatMessageRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i("chat_id", false);
            pluginGeneratedSerialDescriptor.i("message_body", false);
            pluginGeneratedSerialDescriptor.i("client_message_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, g1Var, g1Var};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            String str;
            String str2;
            String str3;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                str3 = c.t(serialDescriptor, 0);
                str2 = c.t(serialDescriptor, 1);
                str = c.t(serialDescriptor, 2);
                i = 7;
            } else {
                str3 = null;
                String str4 = null;
                String str5 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        str3 = c.t(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        str4 = c.t(serialDescriptor, 1);
                        i2 |= 2;
                    } else if (x == 2) {
                        str5 = c.t(serialDescriptor, 2);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                str2 = str4;
                str = str5;
                i = i2;
            }
            c.b(serialDescriptor);
            return new SendChatMessageRequest(i, str3, str2, str);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            SendChatMessageRequest sendChatMessageRequest = (SendChatMessageRequest) obj;
            i.e(encoder, "encoder");
            i.e(sendChatMessageRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(sendChatMessageRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.s(serialDescriptor, 0, sendChatMessageRequest.a);
            c.s(serialDescriptor, 1, sendChatMessageRequest.b);
            c.s(serialDescriptor, 2, sendChatMessageRequest.c);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public SendChatMessageRequest(int i, String str, String str2, String str3) {
        if (7 == (i & 7)) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendChatMessageRequest)) {
            return false;
        }
        SendChatMessageRequest sendChatMessageRequest = (SendChatMessageRequest) obj;
        return i.a(this.a, sendChatMessageRequest.a) && i.a(this.b, sendChatMessageRequest.b) && i.a(this.c, sendChatMessageRequest.c);
    }

    public int hashCode() {
        return this.c.hashCode() + i0.d.a.a.a.F(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SendChatMessageRequest(chatId=");
        P0.append(this.a);
        P0.append(", messageBody=");
        P0.append(this.b);
        P0.append(", clientMessageId=");
        return i0.d.a.a.a.x0(P0, this.c, ')');
    }

    public SendChatMessageRequest(String str, String str2, String str3) {
        i.e(str, "chatId");
        i.e(str2, "messageBody");
        i.e(str3, "clientMessageId");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
