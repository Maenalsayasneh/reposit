package com.clubhouse.android.data.models.local.notification;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import i0.e.b.b3.a.a.e.l;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: Notification.kt */
public final class Notification {
    public static final Companion Companion = new Companion((f) null);
    public final long a;
    public final NotificationType b;
    public final OffsetDateTime c;
    public final String d;
    public final Boolean e;
    public final BasicUser f;
    public final String g;
    public final String h;
    public final ClubWithAdmin i;
    public final Integer j;
    public final List<BasicUser> k;
    public final Integer l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/notification/Notification$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/notification/Notification;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: Notification.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<Notification> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: Notification.kt */
    public static final class a implements v<Notification> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.notification.Notification", aVar, 12);
            pluginGeneratedSerialDescriptor.i("notification_id", false);
            pluginGeneratedSerialDescriptor.i("type", false);
            pluginGeneratedSerialDescriptor.i("time_created", false);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.BugEntry.COLUMN_MESSAGE, false);
            pluginGeneratedSerialDescriptor.i("is_unread", true);
            pluginGeneratedSerialDescriptor.i("user_profile", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("url", true);
            pluginGeneratedSerialDescriptor.i("club", true);
            pluginGeneratedSerialDescriptor.i("event_id", true);
            pluginGeneratedSerialDescriptor.i("user_profiles", true);
            pluginGeneratedSerialDescriptor.i("count", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            BasicUser.a aVar = BasicUser.a.a;
            e0 e0Var = e0.b;
            return new KSerializer[]{o0.b, l.a, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), g1Var, m0.r.t.a.r.m.a1.a.R1(h.b), m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(aVar)), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d0, code lost:
            r7 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d1, code lost:
            r2 = 11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00df, code lost:
            r2 = 11;
            r15 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e1, code lost:
            r9 = 9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x011e, code lost:
            r2 = 11;
            r9 = 9;
            r10 = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0172, code lost:
            r4 = r21;
            r2 = 11;
            r10 = 10;
            r21 = r9;
            r15 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
            r15 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
            r15 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0093, code lost:
            r15 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
            r15 = r15;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r27) {
            /*
                r26 = this;
                r0 = r27
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r4 = 0
                r5 = 3
                r6 = 5
                r7 = 6
                r8 = 7
                r9 = 9
                r10 = 10
                r11 = 1
                r12 = 2
                r13 = 4
                r14 = 8
                r15 = 0
                if (r2 == 0) goto L_0x007d
                long r16 = r0.h(r1, r15)
                i0.e.b.b3.a.a.e.l r2 = i0.e.b.b3.a.a.e.l.a
                java.lang.Object r2 = r0.m(r1, r11, r2, r4)
                n0.c.a r11 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r18 = j$.time.OffsetDateTime.class
                m0.r.d r3 = m0.n.b.m.a(r18)
                kotlinx.serialization.KSerializer[] r15 = new kotlinx.serialization.KSerializer[r15]
                r11.<init>(r3, r4, r15)
                java.lang.Object r3 = r0.m(r1, r12, r11, r4)
                java.lang.String r5 = r0.t(r1, r5)
                n0.c.k.h r11 = n0.c.k.h.b
                java.lang.Object r11 = r0.v(r1, r13, r11, r4)
                com.clubhouse.android.data.models.local.user.BasicUser$a r12 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r6 = r0.v(r1, r6, r12, r4)
                n0.c.k.g1 r13 = n0.c.k.g1.b
                java.lang.Object r7 = r0.v(r1, r7, r13, r4)
                java.lang.Object r8 = r0.v(r1, r8, r13, r4)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r13 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                java.lang.Object r13 = r0.v(r1, r14, r13, r4)
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r9, r14, r4)
                n0.c.k.e r15 = new n0.c.k.e
                r15.<init>(r12)
                java.lang.Object r10 = r0.v(r1, r10, r15, r4)
                r12 = 11
                java.lang.Object r4 = r0.v(r1, r12, r14, r4)
                r12 = 4095(0xfff, float:5.738E-42)
                r15 = r7
                r7 = r12
                r25 = r11
                r11 = r5
                r5 = r25
                goto L_0x0193
            L_0x007d:
                r2 = 11
                r16 = 0
                r3 = r4
                r5 = r3
                r6 = r5
                r8 = r6
                r12 = r8
                r13 = r12
                r21 = r13
                r24 = r11
                r7 = r15
                r22 = r16
                r11 = r21
                r15 = r11
                r17 = r15
            L_0x0093:
                if (r24 == 0) goto L_0x017e
                int r14 = r0.x(r1)
                switch(r14) {
                    case -1: goto L_0x0168;
                    case 0: goto L_0x0159;
                    case 1: goto L_0x0147;
                    case 2: goto L_0x0126;
                    case 3: goto L_0x0112;
                    case 4: goto L_0x0101;
                    case 5: goto L_0x00f3;
                    case 6: goto L_0x00e4;
                    case 7: goto L_0x00d4;
                    case 8: goto L_0x00c6;
                    case 9: goto L_0x00bb;
                    case 10: goto L_0x00ad;
                    case 11: goto L_0x00a2;
                    default: goto L_0x009c;
                }
            L_0x009c:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r14)
                throw r0
            L_0x00a2:
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r12 = r0.v(r1, r2, r14, r12)
                r7 = r7 | 2048(0x800, float:2.87E-42)
                r14 = 8
                goto L_0x00d1
            L_0x00ad:
                n0.c.k.e r14 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r14.<init>(r2)
                java.lang.Object r6 = r0.v(r1, r10, r14, r6)
                r2 = r7 | 1024(0x400, float:1.435E-42)
                goto L_0x00c3
            L_0x00bb:
                n0.c.k.e0 r2 = n0.c.k.e0.b
                java.lang.Object r13 = r0.v(r1, r9, r2, r13)
                r2 = r7 | 512(0x200, float:7.175E-43)
            L_0x00c3:
                r14 = 8
                goto L_0x00d0
            L_0x00c6:
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r14 = 8
                java.lang.Object r8 = r0.v(r1, r14, r2, r8)
                r2 = r7 | 256(0x100, float:3.59E-43)
            L_0x00d0:
                r7 = r2
            L_0x00d1:
                r2 = 11
                goto L_0x0093
            L_0x00d4:
                r14 = 8
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r9 = 7
                java.lang.Object r5 = r0.v(r1, r9, r2, r5)
                r7 = r7 | 128(0x80, float:1.794E-43)
            L_0x00df:
                r2 = 11
            L_0x00e1:
                r9 = 9
                goto L_0x0093
            L_0x00e4:
                r9 = 7
                r14 = 8
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r9 = 6
                java.lang.Object r15 = r0.v(r1, r9, r2, r15)
                r2 = r7 | 64
                r7 = r2
                r9 = 5
                goto L_0x00df
            L_0x00f3:
                r9 = 6
                r14 = 8
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r9 = 5
                java.lang.Object r4 = r0.v(r1, r9, r2, r4)
                r2 = r7 | 32
                r7 = r2
                goto L_0x00df
            L_0x0101:
                r9 = 5
                r14 = 8
                n0.c.k.h r2 = n0.c.k.h.b
                r9 = r21
                r10 = 4
                java.lang.Object r21 = r0.v(r1, r10, r2, r9)
                r2 = r7 | 16
                r7 = r2
                r2 = 3
                goto L_0x011e
            L_0x0112:
                r9 = r21
                r2 = 3
                r10 = 4
                r14 = 8
                java.lang.String r17 = r0.t(r1, r2)
                r7 = r7 | 8
            L_0x011e:
                r2 = 11
                r9 = 9
                r10 = 10
                goto L_0x0093
            L_0x0126:
                r9 = r21
                r10 = 4
                r14 = 8
                n0.c.a r2 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r21 = j$.time.OffsetDateTime.class
                m0.r.d r10 = m0.n.b.m.a(r21)
                r21 = r4
                r4 = 0
                kotlinx.serialization.KSerializer[] r14 = new kotlinx.serialization.KSerializer[r4]
                r4 = 0
                r2.<init>(r10, r4, r14)
                r10 = 2
                java.lang.Object r11 = r0.m(r1, r10, r2, r11)
                r2 = r7 | 4
                r7 = r2
                r2 = 0
                r14 = 1
                goto L_0x0172
            L_0x0147:
                r9 = r21
                r10 = 2
                r21 = r4
                r4 = 0
                i0.e.b.b3.a.a.e.l r2 = i0.e.b.b3.a.a.e.l.a
                r14 = 1
                java.lang.Object r3 = r0.m(r1, r14, r2, r3)
                r2 = r7 | 2
                r7 = r2
                r2 = 0
                goto L_0x0172
            L_0x0159:
                r9 = r21
                r2 = 0
                r10 = 2
                r14 = 1
                r21 = r4
                r4 = 0
                long r22 = r0.h(r1, r2)
                r7 = r7 | 1
                goto L_0x0172
            L_0x0168:
                r9 = r21
                r2 = 0
                r10 = 2
                r14 = 1
                r21 = r4
                r4 = 0
                r24 = r2
            L_0x0172:
                r4 = r21
                r2 = 11
                r10 = 10
                r14 = 8
                r21 = r9
                goto L_0x00e1
            L_0x017e:
                r9 = r21
                r21 = r4
                r2 = r3
                r10 = r6
                r3 = r11
                r4 = r12
                r11 = r17
                r6 = r21
                r16 = r22
                r25 = r8
                r8 = r5
                r5 = r9
                r9 = r13
                r13 = r25
            L_0x0193:
                r0.b(r1)
                com.clubhouse.android.data.models.local.notification.Notification r0 = new com.clubhouse.android.data.models.local.notification.Notification
                r1 = r2
                com.clubhouse.android.data.models.local.notification.NotificationType r1 = (com.clubhouse.android.data.models.local.notification.NotificationType) r1
                r2 = r3
                j$.time.OffsetDateTime r2 = (j$.time.OffsetDateTime) r2
                r12 = r5
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                r3 = r6
                com.clubhouse.android.data.models.local.user.BasicUser r3 = (com.clubhouse.android.data.models.local.user.BasicUser) r3
                r14 = r15
                java.lang.String r14 = (java.lang.String) r14
                r15 = r8
                java.lang.String r15 = (java.lang.String) r15
                r18 = r13
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r18 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r18
                r19 = r9
                java.lang.Integer r19 = (java.lang.Integer) r19
                r20 = r10
                java.util.List r20 = (java.util.List) r20
                java.lang.Integer r4 = (java.lang.Integer) r4
                r5 = r0
                r6 = r7
                r7 = r16
                r9 = r1
                r10 = r2
                r13 = r3
                r16 = r18
                r17 = r19
                r18 = r20
                r19 = r4
                r5.<init>(r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.notification.Notification.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            Notification notification = (Notification) obj;
            i.e(encoder, "encoder");
            i.e(notification, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(notification, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.D(serialDescriptor, 0, notification.a);
            c.z(serialDescriptor, 1, l.a, notification.b);
            c.z(serialDescriptor, 2, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), notification.c);
            c.s(serialDescriptor, 3, notification.d);
            if (c.v(serialDescriptor, 4) || notification.e != null) {
                c.l(serialDescriptor, 4, h.b, notification.e);
            }
            if (c.v(serialDescriptor, 5) || notification.f != null) {
                c.l(serialDescriptor, 5, BasicUser.a.a, notification.f);
            }
            if (c.v(serialDescriptor, 6) || notification.g != null) {
                c.l(serialDescriptor, 6, g1.b, notification.g);
            }
            if (c.v(serialDescriptor, 7) || notification.h != null) {
                c.l(serialDescriptor, 7, g1.b, notification.h);
            }
            if (c.v(serialDescriptor, 8) || notification.i != null) {
                c.l(serialDescriptor, 8, ClubWithAdmin.a.a, notification.i);
            }
            if (c.v(serialDescriptor, 9) || notification.j != null) {
                c.l(serialDescriptor, 9, e0.b, notification.j);
            }
            if (c.v(serialDescriptor, 10) || notification.k != null) {
                c.l(serialDescriptor, 10, new n0.c.k.e(BasicUser.a.a), notification.k);
            }
            if (c.v(serialDescriptor, 11) || notification.l != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 11, e0.b, notification.l);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public Notification(int i2, long j2, NotificationType notificationType, OffsetDateTime offsetDateTime, String str, Boolean bool, BasicUser basicUser, String str2, String str3, ClubWithAdmin clubWithAdmin, Integer num, List list, Integer num2) {
        int i3 = i2;
        if (15 == (i3 & 15)) {
            this.a = j2;
            this.b = notificationType;
            this.c = offsetDateTime;
            this.d = str;
            if ((i3 & 16) == 0) {
                this.e = null;
            } else {
                this.e = bool;
            }
            if ((i3 & 32) == 0) {
                this.f = null;
            } else {
                this.f = basicUser;
            }
            if ((i3 & 64) == 0) {
                this.g = null;
            } else {
                this.g = str2;
            }
            if ((i3 & 128) == 0) {
                this.h = null;
            } else {
                this.h = str3;
            }
            if ((i3 & 256) == 0) {
                this.i = null;
            } else {
                this.i = clubWithAdmin;
            }
            if ((i3 & 512) == 0) {
                this.j = null;
            } else {
                this.j = num;
            }
            if ((i3 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                this.k = null;
            } else {
                this.k = list;
            }
            if ((i3 & 2048) == 0) {
                this.l = null;
            } else {
                this.l = num2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i2, 15, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        return this.a == notification.a && this.b == notification.b && i.a(this.c, notification.c) && i.a(this.d, notification.d) && i.a(this.e, notification.e) && i.a(this.f, notification.f) && i.a(this.g, notification.g) && i.a(this.h, notification.h) && i.a(this.i, notification.i) && i.a(this.j, notification.j) && i.a(this.k, notification.k) && i.a(this.l, notification.l);
    }

    public int hashCode() {
        int F = i0.d.a.a.a.F(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31);
        Boolean bool = this.e;
        int i2 = 0;
        int hashCode = (F + (bool == null ? 0 : bool.hashCode())) * 31;
        BasicUser basicUser = this.f;
        int hashCode2 = (hashCode + (basicUser == null ? 0 : basicUser.hashCode())) * 31;
        String str = this.g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ClubWithAdmin clubWithAdmin = this.i;
        int hashCode5 = (hashCode4 + (clubWithAdmin == null ? 0 : clubWithAdmin.hashCode())) * 31;
        Integer num = this.j;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        List<BasicUser> list = this.k;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.l;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode7 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Notification(notificationId=");
        P0.append(this.a);
        P0.append(", type=");
        P0.append(this.b);
        P0.append(", timeCreated=");
        P0.append(this.c);
        P0.append(", message=");
        P0.append(this.d);
        P0.append(", isUnread=");
        P0.append(this.e);
        P0.append(", user=");
        P0.append(this.f);
        P0.append(", channel=");
        P0.append(this.g);
        P0.append(", url=");
        P0.append(this.h);
        P0.append(", club=");
        P0.append(this.i);
        P0.append(", eventId=");
        P0.append(this.j);
        P0.append(", users=");
        P0.append(this.k);
        P0.append(", count=");
        return i0.d.a.a.a.v0(P0, this.l, ')');
    }
}
