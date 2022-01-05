package com.clubhouse.android.data.models.local;

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
/* compiled from: PhoneContact.kt */
public final class PhoneContact {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final String b;
    public final String c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/PhoneContact$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/PhoneContact;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: PhoneContact.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<PhoneContact> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: PhoneContact.kt */
    public static final class a implements v<PhoneContact> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.PhoneContact", aVar, 3);
            pluginGeneratedSerialDescriptor.i("phoneNumber", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("photoUri", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        public Object deserialize(Decoder decoder) {
            Object obj;
            int i;
            Object obj2;
            String str;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                str = c.t(serialDescriptor, 0);
                g1 g1Var = g1.b;
                obj = c.v(serialDescriptor, 1, g1Var, null);
                obj2 = c.v(serialDescriptor, 2, g1Var, null);
                i = 7;
            } else {
                str = null;
                Object obj4 = null;
                int i2 = 0;
                boolean z = true;
                while (z) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z = false;
                    } else if (x == 0) {
                        str = c.t(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        obj3 = c.v(serialDescriptor, 1, g1.b, obj3);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj4 = c.v(serialDescriptor, 2, g1.b, obj4);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                obj = obj3;
                obj2 = obj4;
                i = i2;
            }
            c.b(serialDescriptor);
            return new PhoneContact(i, str, (String) obj, (String) obj2);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            PhoneContact phoneContact = (PhoneContact) obj;
            i.e(encoder, "encoder");
            i.e(phoneContact, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(phoneContact, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.s(serialDescriptor, 0, phoneContact.a);
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 1, g1Var, phoneContact.b);
            if (c.v(serialDescriptor, 2) || phoneContact.c != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 2, g1Var, phoneContact.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public PhoneContact(String str, String str2, String str3, int i) {
        int i2 = i & 4;
        i.e(str, "phoneNumber");
        this.a = str;
        this.b = str2;
        this.c = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhoneContact)) {
            return false;
        }
        PhoneContact phoneContact = (PhoneContact) obj;
        return i.a(this.a, phoneContact.a) && i.a(this.b, phoneContact.b) && i.a(this.c, phoneContact.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("PhoneContact(phoneNumber=");
        P0.append(this.a);
        P0.append(", name=");
        P0.append(this.b);
        P0.append(", photoUri=");
        return i0.d.a.a.a.w0(P0, this.c, ')');
    }

    public PhoneContact(int i, String str, String str2, String str3) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = str2;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 3, a.b);
            throw null;
        }
    }

    public PhoneContact(String str, String str2, String str3) {
        i.e(str, "phoneNumber");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
