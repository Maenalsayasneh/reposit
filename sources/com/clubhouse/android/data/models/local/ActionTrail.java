package com.clubhouse.android.data.models.local;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.h0;
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ActionTrail.kt */
public final class ActionTrail {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final long b;
    public final String c;
    public final Map<String, Object> d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/ActionTrail$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/ActionTrail;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ActionTrail.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ActionTrail> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ActionTrail.kt */
    public static final class a implements v<ActionTrail> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.ActionTrail", aVar, 4);
            pluginGeneratedSerialDescriptor.i("trail_type", false);
            pluginGeneratedSerialDescriptor.i("client_time_created", false);
            pluginGeneratedSerialDescriptor.i("client_event_id", false);
            pluginGeneratedSerialDescriptor.i("blob_data", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, o0.b, g1Var, new h0(g1Var, i0.e.b.b3.a.b.c.a.a)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r21) {
            /*
                r20 = this;
                r0 = r21
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                r2 = 0
                n0.c.j.c r0 = r0.c(r1)
                boolean r4 = r0.y()
                r5 = 3
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 2
                if (r4 == 0) goto L_0x003c
                java.lang.String r2 = r0.t(r1, r7)
                long r3 = r0.h(r1, r8)
                java.lang.String r7 = r0.t(r1, r9)
                n0.c.k.h0 r8 = new n0.c.k.h0
                n0.c.k.g1 r9 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r10 = i0.e.b.b3.a.b.c.a.a
                r8.<init>(r9, r10)
                java.lang.Object r5 = r0.m(r1, r5, r8, r6)
                r6 = 15
                r15 = r2
                r16 = r3
                r14 = r6
                r18 = r7
                goto L_0x0085
            L_0x003c:
                r10 = r6
                r11 = r10
                r4 = r7
                r12 = r8
            L_0x0040:
                if (r12 == 0) goto L_0x007e
                int r13 = r0.x(r1)
                r14 = -1
                if (r13 == r14) goto L_0x007c
                if (r13 == 0) goto L_0x0075
                if (r13 == r8) goto L_0x006e
                if (r13 == r9) goto L_0x0067
                if (r13 != r5) goto L_0x0061
                n0.c.k.h0 r13 = new n0.c.k.h0
                n0.c.k.g1 r14 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r15 = i0.e.b.b3.a.b.c.a.a
                r13.<init>(r14, r15)
                java.lang.Object r11 = r0.m(r1, r5, r13, r11)
                r4 = r4 | 8
                goto L_0x0040
            L_0x0061:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r13)
                throw r0
            L_0x0067:
                java.lang.String r10 = r0.t(r1, r9)
                r4 = r4 | 4
                goto L_0x0040
            L_0x006e:
                long r2 = r0.h(r1, r8)
                r4 = r4 | 2
                goto L_0x0040
            L_0x0075:
                java.lang.String r6 = r0.t(r1, r7)
                r4 = r4 | 1
                goto L_0x0040
            L_0x007c:
                r12 = r7
                goto L_0x0040
            L_0x007e:
                r16 = r2
                r14 = r4
                r15 = r6
                r18 = r10
                r5 = r11
            L_0x0085:
                r0.b(r1)
                com.clubhouse.android.data.models.local.ActionTrail r0 = new com.clubhouse.android.data.models.local.ActionTrail
                r19 = r5
                java.util.Map r19 = (java.util.Map) r19
                r13 = r0
                r13.<init>(r14, r15, r16, r18, r19)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.ActionTrail.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ActionTrail actionTrail = (ActionTrail) obj;
            i.e(encoder, "encoder");
            i.e(actionTrail, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(actionTrail, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            c.s(serialDescriptor, 0, actionTrail.a);
            c.D(serialDescriptor, 1, actionTrail.b);
            c.s(serialDescriptor, 2, actionTrail.c);
            c.z(serialDescriptor, 3, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), actionTrail.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ActionTrail(int i, String str, long j, String str2, Map map) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = j;
            this.c = str2;
            this.d = map;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 15, a.b);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionTrail)) {
            return false;
        }
        ActionTrail actionTrail = (ActionTrail) obj;
        return i.a(this.a, actionTrail.a) && this.b == actionTrail.b && i.a(this.c, actionTrail.c) && i.a(this.d, actionTrail.d);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.b);
        return this.d.hashCode() + i0.d.a.a.a.F(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActionTrail(trailType=");
        P0.append(this.a);
        P0.append(", clientTimeCreatedSecondsSinceEpoch=");
        P0.append(this.b);
        P0.append(", clientEventId=");
        P0.append(this.c);
        P0.append(", blobData=");
        return i0.d.a.a.a.B0(P0, this.d, ')');
    }

    public ActionTrail(String str, long j, String str2, Map<String, ? extends Object> map) {
        i.e(str, "trailType");
        i.e(str2, "clientEventId");
        i.e(map, "blobData");
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = map;
    }
}
