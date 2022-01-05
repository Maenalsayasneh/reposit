package com.clubhouse.android.data.models.remote.request;

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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: SearchRequest.kt */
public final class FollowScopedSearchRequest implements i0.e.b.b3.a.b.a.a {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/FollowScopedSearchRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/FollowScopedSearchRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: SearchRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FollowScopedSearchRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: SearchRequest.kt */
    public static final class a implements v<FollowScopedSearchRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest", aVar, 4);
            pluginGeneratedSerialDescriptor.i("cofollows_only", true);
            pluginGeneratedSerialDescriptor.i("following_only", true);
            pluginGeneratedSerialDescriptor.i("followers_only", true);
            pluginGeneratedSerialDescriptor.i("query", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            return new KSerializer[]{hVar, hVar, hVar, m0.r.t.a.r.m.a1.a.R1(g1.b)};
        }

        public Object deserialize(Decoder decoder) {
            boolean z;
            boolean z2;
            boolean z3;
            int i;
            i.e(decoder, "decoder");
            SerialDescriptor serialDescriptor = b;
            Object obj = null;
            c c = decoder.c(serialDescriptor);
            if (c.y()) {
                boolean s = c.s(serialDescriptor, 0);
                boolean s2 = c.s(serialDescriptor, 1);
                boolean s3 = c.s(serialDescriptor, 2);
                obj = c.v(serialDescriptor, 3, g1.b, null);
                i = 15;
                z = s3;
                z2 = s2;
                z3 = s;
            } else {
                boolean z4 = false;
                int i2 = 0;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = true;
                while (z7) {
                    int x = c.x(serialDescriptor);
                    if (x == -1) {
                        z7 = false;
                    } else if (x == 0) {
                        z4 = c.s(serialDescriptor, 0);
                        i2 |= 1;
                    } else if (x == 1) {
                        z5 = c.s(serialDescriptor, 1);
                        i2 |= 2;
                    } else if (x == 2) {
                        z6 = c.s(serialDescriptor, 2);
                        i2 |= 4;
                    } else if (x == 3) {
                        obj = c.v(serialDescriptor, 3, g1.b, obj);
                        i2 |= 8;
                    } else {
                        throw new UnknownFieldException(x);
                    }
                }
                z3 = z4;
                i = i2;
                z2 = z5;
                z = z6;
            }
            c.b(serialDescriptor);
            return new FollowScopedSearchRequest(i, z3, z2, z, (String) obj);
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            FollowScopedSearchRequest followScopedSearchRequest = (FollowScopedSearchRequest) obj;
            i.e(encoder, "encoder");
            i.e(followScopedSearchRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(followScopedSearchRequest, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || followScopedSearchRequest.a) {
                c.r(serialDescriptor, 0, followScopedSearchRequest.a);
            }
            if (c.v(serialDescriptor, 1) || followScopedSearchRequest.b) {
                c.r(serialDescriptor, 1, followScopedSearchRequest.b);
            }
            if (c.v(serialDescriptor, 2) || followScopedSearchRequest.c) {
                z = true;
            }
            if (z) {
                c.r(serialDescriptor, 2, followScopedSearchRequest.c);
            }
            c.l(serialDescriptor, 3, g1.b, followScopedSearchRequest.d);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public FollowScopedSearchRequest(int i, boolean z, boolean z2, boolean z3, String str) {
        if (8 == (i & 8)) {
            if ((i & 1) == 0) {
                this.a = false;
            } else {
                this.a = z;
            }
            if ((i & 2) == 0) {
                this.b = false;
            } else {
                this.b = z2;
            }
            if ((i & 4) == 0) {
                this.c = false;
            } else {
                this.c = z3;
            }
            this.d = str;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 8, a.b);
        throw null;
    }

    public String a() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowScopedSearchRequest)) {
            return false;
        }
        FollowScopedSearchRequest followScopedSearchRequest = (FollowScopedSearchRequest) obj;
        return this.a == followScopedSearchRequest.a && this.b == followScopedSearchRequest.b && this.c == followScopedSearchRequest.c && i.a(this.d, followScopedSearchRequest.d);
    }

    public int hashCode() {
        int i;
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.c;
        if (!z4) {
            z2 = z4;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        String str = this.d;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FollowScopedSearchRequest(cofollowsOnly=");
        P0.append(this.a);
        P0.append(", followingOnly=");
        P0.append(this.b);
        P0.append(", followersOnly=");
        P0.append(this.c);
        P0.append(", query=");
        return i0.d.a.a.a.w0(P0, this.d, ')');
    }

    public FollowScopedSearchRequest(boolean z, boolean z2, boolean z3, String str, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }
}
