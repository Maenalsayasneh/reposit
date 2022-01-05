package com.clubhouse.experimentation;

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
/* compiled from: ExperimentBehavior.kt */
public final class ExperimentBehavior {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/experimentation/ExperimentBehavior$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/experimentation/ExperimentBehavior;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ExperimentBehavior.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ExperimentBehavior> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ExperimentBehavior.kt */
    public static final class a implements v<ExperimentBehavior> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.experimentation.ExperimentBehavior", aVar, 2);
            pluginGeneratedSerialDescriptor.i("behavior", false);
            pluginGeneratedSerialDescriptor.i("log", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            Object obj;
            String str;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            String str2 = null;
            if (c.y()) {
                str = c.t(serialDescriptor, 0);
                obj = c.v(serialDescriptor, 1, g1.b, null);
                i = 3;
            } else {
                Object obj2 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        str2 = c.t(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj2 = c.v(serialDescriptor, 1, g1.b, obj2);
                        i2 |= 2;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                i = i2;
                String str3 = str2;
                obj = obj2;
                str = str3;
            }
            c.b(serialDescriptor);
            return new ExperimentBehavior(i, str, (String) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ExperimentBehavior experimentBehavior = (ExperimentBehavior) obj;
            i.e(encoder, "encoder");
            i.e(experimentBehavior, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(experimentBehavior, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, experimentBehavior.a);
            if (c.v(serialDescriptor, 1) || experimentBehavior.b != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 1, g1.b, experimentBehavior.b);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public ExperimentBehavior(int i, String str, String str2) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
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
        if (!(obj instanceof ExperimentBehavior)) {
            return false;
        }
        ExperimentBehavior experimentBehavior = (ExperimentBehavior) obj;
        return i.a(this.a, experimentBehavior.a) && i.a(this.b, experimentBehavior.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ExperimentBehavior(behavior=");
        P0.append(this.a);
        P0.append(", log=");
        return i0.d.a.a.a.w0(P0, this.b, ')');
    }
}
