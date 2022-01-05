package com.clubhouse.backchannel.data.models.remote.request;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Limiter;
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
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ChatMessagesRequest.kt */
public final class ChatMessagesRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/backchannel/data/models/remote/request/ChatMessagesRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/backchannel/data/models/remote/request/ChatMessagesRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "backchannel_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChatMessagesRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChatMessagesRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChatMessagesRequest.kt */
    public static final class a implements v<ChatMessagesRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.backchannel.data.models.remote.request.ChatMessagesRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("chat_id", false);
            pluginGeneratedSerialDescriptor.i("start_message_id", true);
            pluginGeneratedSerialDescriptor.i("end_message_id", true);
            pluginGeneratedSerialDescriptor.i(Limiter.LIMIT_PARAM_NAME, true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            return new KSerializer[]{g1.b, m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r19) {
            /*
                r18 = this;
                r0 = r19
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
                if (r2 == 0) goto L_0x002f
                java.lang.String r2 = r0.t(r1, r5)
                n0.c.k.e0 r5 = n0.c.k.e0.b
                java.lang.Object r6 = r0.v(r1, r6, r5, r4)
                java.lang.Object r7 = r0.v(r1, r7, r5, r4)
                java.lang.Object r3 = r0.v(r1, r3, r5, r4)
                r4 = 15
                r14 = r2
                r13 = r4
                goto L_0x0074
            L_0x002f:
                r8 = r4
                r9 = r8
                r10 = r9
                r2 = r5
                r11 = r6
            L_0x0034:
                if (r11 == 0) goto L_0x006f
                int r12 = r0.x(r1)
                r13 = -1
                if (r12 == r13) goto L_0x006d
                if (r12 == 0) goto L_0x0066
                if (r12 == r6) goto L_0x005d
                if (r12 == r7) goto L_0x0054
                if (r12 != r3) goto L_0x004e
                n0.c.k.e0 r12 = n0.c.k.e0.b
                java.lang.Object r10 = r0.v(r1, r3, r12, r10)
                r2 = r2 | 8
                goto L_0x0034
            L_0x004e:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x0054:
                n0.c.k.e0 r12 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r7, r12, r9)
                r2 = r2 | 4
                goto L_0x0034
            L_0x005d:
                n0.c.k.e0 r12 = n0.c.k.e0.b
                java.lang.Object r8 = r0.v(r1, r6, r12, r8)
                r2 = r2 | 2
                goto L_0x0034
            L_0x0066:
                java.lang.String r4 = r0.t(r1, r5)
                r2 = r2 | 1
                goto L_0x0034
            L_0x006d:
                r11 = r5
                goto L_0x0034
            L_0x006f:
                r13 = r2
                r14 = r4
                r6 = r8
                r7 = r9
                r3 = r10
            L_0x0074:
                r0.b(r1)
                com.clubhouse.backchannel.data.models.remote.request.ChatMessagesRequest r0 = new com.clubhouse.backchannel.data.models.remote.request.ChatMessagesRequest
                r15 = r6
                java.lang.Integer r15 = (java.lang.Integer) r15
                r16 = r7
                java.lang.Integer r16 = (java.lang.Integer) r16
                r17 = r3
                java.lang.Integer r17 = (java.lang.Integer) r17
                r12 = r0
                r12.<init>(r13, r14, r15, r16, r17)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.backchannel.data.models.remote.request.ChatMessagesRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChatMessagesRequest chatMessagesRequest = (ChatMessagesRequest) obj;
            i.e(encoder, "encoder");
            i.e(chatMessagesRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(chatMessagesRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, chatMessagesRequest.a);
            if (c.v(serialDescriptor, 1) || chatMessagesRequest.b != null) {
                c.l(serialDescriptor, 1, e0.b, chatMessagesRequest.b);
            }
            if (c.v(serialDescriptor, 2) || chatMessagesRequest.c != null) {
                c.l(serialDescriptor, 2, e0.b, chatMessagesRequest.c);
            }
            if (c.v(serialDescriptor, 3) || chatMessagesRequest.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, e0.b, chatMessagesRequest.d);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ChatMessagesRequest(int i, String str, Integer num, Integer num2, Integer num3) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = num;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = num2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = num3;
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
        if (!(obj instanceof ChatMessagesRequest)) {
            return false;
        }
        ChatMessagesRequest chatMessagesRequest = (ChatMessagesRequest) obj;
        return i.a(this.a, chatMessagesRequest.a) && i.a(this.b, chatMessagesRequest.b) && i.a(this.c, chatMessagesRequest.c) && i.a(this.d, chatMessagesRequest.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        if (num3 != null) {
            i = num3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChatMessagesRequest(chatId=");
        P0.append(this.a);
        P0.append(", startMessageId=");
        P0.append(this.b);
        P0.append(", endMessageId=");
        P0.append(this.c);
        P0.append(", limit=");
        return i0.d.a.a.a.v0(P0, this.d, ')');
    }
}
