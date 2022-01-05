package com.clubhouse.android.data.models.remote.request;

import com.clubhouse.android.data.models.local.Contact;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UploadContactsRequest.kt */
public final class UploadContactsRequest {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final boolean b;
    public final List<Contact> c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UploadContactsRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UploadContactsRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UploadContactsRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UploadContactsRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UploadContactsRequest.kt */
    public static final class a implements v<UploadContactsRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UploadContactsRequest", aVar, 3);
            pluginGeneratedSerialDescriptor.i("club_id", true);
            pluginGeneratedSerialDescriptor.i("upload_contacts", true);
            pluginGeneratedSerialDescriptor.i("contacts", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1.b), h.b, new n0.c.k.e(Contact.a.a)};
        }

        public Object deserialize(Decoder decoder) {
            int i;
            boolean z;
            Object obj;
            Object obj2;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            c c = decoder.c(serialDescriptor);
            Object obj3 = null;
            if (c.y()) {
                obj2 = c.v(serialDescriptor, 0, g1.b, null);
                z = c.s(serialDescriptor, 1);
                obj = c.m(serialDescriptor, 2, new n0.c.k.e(Contact.a.a), null);
                i = 7;
            } else {
                Object obj4 = null;
                boolean z2 = false;
                int i2 = 0;
                boolean z3 = true;
                while (z3) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z3 = false;
                    } else if (x == 0) {
                        obj3 = c.v(serialDescriptor, 0, g1.b, obj3);
                        i2 |= 1;
                    } else if (x == 1) {
                        z2 = c.s(serialDescriptor, 1);
                        i2 |= 2;
                    } else if (x == 2) {
                        obj4 = c.m(serialDescriptor, 2, new n0.c.k.e(Contact.a.a), obj4);
                        i2 |= 4;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z = z2;
                i = i2;
                Object obj5 = obj3;
                obj = obj4;
                obj2 = obj5;
            }
            c.b(serialDescriptor);
            return new UploadContactsRequest(i, (String) obj2, z, (List) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UploadContactsRequest uploadContactsRequest = (UploadContactsRequest) obj;
            i.e(encoder, "encoder");
            i.e(uploadContactsRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(uploadContactsRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || uploadContactsRequest.a != null) {
                c.l(serialDescriptor, 0, g1.b, uploadContactsRequest.a);
            }
            if (c.v(serialDescriptor, 1) || uploadContactsRequest.b) {
                c.r(serialDescriptor, 1, uploadContactsRequest.b);
            }
            if (c.v(serialDescriptor, 2) || !i.a(uploadContactsRequest.c, EmptyList.c)) {
                z = true;
            }
            if (z) {
                c.z(serialDescriptor, 2, new n0.c.k.e(Contact.a.a), uploadContactsRequest.c);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UploadContactsRequest() {
        this((String) null, false, (List) null, 7);
    }

    public UploadContactsRequest(int i, String str, boolean z, List list) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z;
            }
            if ((i & 4) == 0) {
                this.c = EmptyList.c;
            } else {
                this.c = list;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadContactsRequest)) {
            return false;
        }
        UploadContactsRequest uploadContactsRequest = (UploadContactsRequest) obj;
        return i.a(this.a, uploadContactsRequest.a) && this.b == uploadContactsRequest.b && i.a(this.c, uploadContactsRequest.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return this.c.hashCode() + ((hashCode + (z ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UploadContactsRequest(clubId=");
        P0.append(this.a);
        P0.append(", uploadContacts=");
        P0.append(this.b);
        P0.append(", contacts=");
        return i0.d.a.a.a.A0(P0, this.c, ')');
    }

    public UploadContactsRequest(String str, boolean z, List<Contact> list, int i) {
        int i2 = i & 1;
        z = (i & 2) != 0 ? false : z;
        list = (i & 4) != 0 ? EmptyList.c : list;
        i.e(list, "contacts");
        this.a = null;
        this.b = z;
        this.c = list;
    }
}
