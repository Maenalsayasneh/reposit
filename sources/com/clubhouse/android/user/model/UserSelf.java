package com.clubhouse.android.user.model;

import com.clubhouse.android.shared.auth.AccessCredential;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
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
/* compiled from: UserSelf.kt */
public final class UserSelf {
    public static final Companion Companion = new Companion((f) null);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final AccessCredential e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/user/model/UserSelf$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/user/model/UserSelf;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "user_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserSelf.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserSelf> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserSelf.kt */
    public static final class a implements v<UserSelf> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.user.model.UserSelf", aVar, 5);
            pluginGeneratedSerialDescriptor.i("id", false);
            pluginGeneratedSerialDescriptor.i("name", true);
            pluginGeneratedSerialDescriptor.i("username", true);
            pluginGeneratedSerialDescriptor.i("photoUrl", true);
            pluginGeneratedSerialDescriptor.i("accessCredential", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            return new KSerializer[]{e0.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), AccessCredential.a.a};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r22) {
            /*
                r21 = this;
                r0 = r22
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
                r8 = 4
                if (r2 == 0) goto L_0x0038
                int r2 = r0.k(r1, r5)
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r6 = r0.v(r1, r6, r5, r4)
                java.lang.Object r7 = r0.v(r1, r7, r5, r4)
                java.lang.Object r3 = r0.v(r1, r3, r5, r4)
                com.clubhouse.android.shared.auth.AccessCredential$a r5 = com.clubhouse.android.shared.auth.AccessCredential.a.a
                java.lang.Object r4 = r0.m(r1, r8, r5, r4)
                r5 = 31
                r16 = r2
                r15 = r5
                goto L_0x008b
            L_0x0038:
                r9 = r4
                r10 = r9
                r11 = r10
                r2 = r5
                r12 = r2
                r13 = r6
            L_0x003e:
                if (r13 == 0) goto L_0x0084
                int r14 = r0.x(r1)
                r15 = -1
                if (r14 == r15) goto L_0x0082
                if (r14 == 0) goto L_0x007b
                if (r14 == r6) goto L_0x0072
                if (r14 == r7) goto L_0x0069
                if (r14 == r3) goto L_0x0060
                if (r14 != r8) goto L_0x005a
                com.clubhouse.android.shared.auth.AccessCredential$a r14 = com.clubhouse.android.shared.auth.AccessCredential.a.a
                java.lang.Object r11 = r0.m(r1, r8, r14, r11)
                r12 = r12 | 16
                goto L_0x003e
            L_0x005a:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r14)
                throw r0
            L_0x0060:
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r10 = r0.v(r1, r3, r14, r10)
                r12 = r12 | 8
                goto L_0x003e
            L_0x0069:
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r9 = r0.v(r1, r7, r14, r9)
                r12 = r12 | 4
                goto L_0x003e
            L_0x0072:
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r4 = r0.v(r1, r6, r14, r4)
                r12 = r12 | 2
                goto L_0x003e
            L_0x007b:
                int r2 = r0.k(r1, r5)
                r12 = r12 | 1
                goto L_0x003e
            L_0x0082:
                r13 = r5
                goto L_0x003e
            L_0x0084:
                r16 = r2
                r6 = r4
                r7 = r9
                r3 = r10
                r4 = r11
                r15 = r12
            L_0x008b:
                r0.b(r1)
                com.clubhouse.android.user.model.UserSelf r0 = new com.clubhouse.android.user.model.UserSelf
                r17 = r6
                java.lang.String r17 = (java.lang.String) r17
                r18 = r7
                java.lang.String r18 = (java.lang.String) r18
                r19 = r3
                java.lang.String r19 = (java.lang.String) r19
                r20 = r4
                com.clubhouse.android.shared.auth.AccessCredential r20 = (com.clubhouse.android.shared.auth.AccessCredential) r20
                r14 = r0
                r14.<init>(r15, r16, r17, r18, r19, r20)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.user.model.UserSelf.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserSelf userSelf = (UserSelf) obj;
            i.e(encoder, "encoder");
            i.e(userSelf, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(userSelf, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.q(serialDescriptor, 0, userSelf.a);
            if (c.v(serialDescriptor, 1) || userSelf.b != null) {
                c.l(serialDescriptor, 1, g1.b, userSelf.b);
            }
            if (c.v(serialDescriptor, 2) || userSelf.c != null) {
                c.l(serialDescriptor, 2, g1.b, userSelf.c);
            }
            if (c.v(serialDescriptor, 3) || userSelf.d != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 3, g1.b, userSelf.d);
            }
            c.z(serialDescriptor, 4, AccessCredential.a.a, userSelf.e);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UserSelf(int i, int i2, String str, String str2, String str3, AccessCredential accessCredential) {
        if (17 == (i & 17)) {
            this.a = i2;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str2;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str3;
            }
            this.e = accessCredential;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 17, a.b);
        throw null;
    }

    public static UserSelf a(UserSelf userSelf, int i, String str, String str2, String str3, AccessCredential accessCredential, int i2) {
        if ((i2 & 1) != 0) {
            i = userSelf.a;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = userSelf.b;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = userSelf.c;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = userSelf.d;
        }
        String str6 = str3;
        AccessCredential accessCredential2 = (i2 & 16) != 0 ? userSelf.e : null;
        i.e(accessCredential2, "accessCredential");
        return new UserSelf(i3, str4, str5, str6, accessCredential2);
    }

    public final boolean b() {
        String str = this.b;
        if (!(str == null || StringsKt__IndentKt.o(str))) {
            String str2 = this.c;
            if (!(str2 == null || StringsKt__IndentKt.o(str2))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserSelf)) {
            return false;
        }
        UserSelf userSelf = (UserSelf) obj;
        return this.a == userSelf.a && i.a(this.b, userSelf.b) && i.a(this.c, userSelf.c) && i.a(this.d, userSelf.d) && i.a(this.e, userSelf.e);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.e.hashCode() + ((hashCode3 + i) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserSelf(id=");
        P0.append(this.a);
        P0.append(", name=");
        P0.append(this.b);
        P0.append(", username=");
        P0.append(this.c);
        P0.append(", photoUrl=");
        P0.append(this.d);
        P0.append(", accessCredential=");
        P0.append(this.e);
        P0.append(')');
        return P0.toString();
    }

    public UserSelf(int i, String str, String str2, String str3, AccessCredential accessCredential) {
        i.e(accessCredential, "accessCredential");
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = accessCredential;
    }
}
