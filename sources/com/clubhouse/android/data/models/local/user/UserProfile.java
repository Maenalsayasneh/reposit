package com.clubhouse.android.data.models.local.user;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.b3.a.b.c.d;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
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
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.r;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UserProfile.kt */
public final class UserProfile implements User {
    public static final Parcelable.Creator<UserProfile> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final int Y1;
    public final OffsetDateTime Z1;
    public final boolean a2;
    public final boolean b2;
    public final String c;
    public final int c2;
    public final String d;
    public final List<UserInList> d2;
    public final FollowNotificationType e2;
    public final BasicUser f2;
    public final ClubWithAdmin g2;
    public final List<ClubWithAdmin> h2;
    public final String i2;
    public final boolean j2;
    public final double k2;
    public final double l2;
    public final Boolean m2;
    public final Boolean n2;
    public final Boolean o2;
    public final Boolean p2;
    public final String q;
    public final List<Topic> q2;
    public final List<EventInProfile> r2;
    public final Boolean s2;
    public final int t2;
    public final String u2;
    public final String v2;
    public final String w2;
    public final String x;
    public final int y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/user/UserProfile$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/user/UserProfile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UserProfile.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UserProfile> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UserProfile.kt */
    public static final class a implements v<UserProfile> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("user_profile", aVar, 30);
            pluginGeneratedSerialDescriptor.i("displayname", true);
            pluginGeneratedSerialDescriptor.i("bio", true);
            pluginGeneratedSerialDescriptor.i("twitter", true);
            pluginGeneratedSerialDescriptor.i("instagram", true);
            pluginGeneratedSerialDescriptor.i("num_followers", false);
            pluginGeneratedSerialDescriptor.i("num_following", false);
            pluginGeneratedSerialDescriptor.i("time_created", false);
            pluginGeneratedSerialDescriptor.i("follows_me", false);
            pluginGeneratedSerialDescriptor.i("is_blocked_by_network", false);
            pluginGeneratedSerialDescriptor.i("mutual_follows_count", false);
            pluginGeneratedSerialDescriptor.i("mutual_follows", false);
            pluginGeneratedSerialDescriptor.i("notification_type", true);
            pluginGeneratedSerialDescriptor.i("invited_by_user_profile", true);
            pluginGeneratedSerialDescriptor.i("invited_by_club", true);
            pluginGeneratedSerialDescriptor.i("clubs", false);
            pluginGeneratedSerialDescriptor.i("url", false);
            pluginGeneratedSerialDescriptor.i("can_receive_direct_payment", false);
            pluginGeneratedSerialDescriptor.i("direct_payment_fee_rate", true);
            pluginGeneratedSerialDescriptor.i("direct_payment_fee_fixed", true);
            pluginGeneratedSerialDescriptor.i("has_verified_email", true);
            pluginGeneratedSerialDescriptor.i("can_edit_username", true);
            pluginGeneratedSerialDescriptor.i("can_edit_name", true);
            pluginGeneratedSerialDescriptor.i("can_edit_displayname", true);
            pluginGeneratedSerialDescriptor.i("topics", true);
            pluginGeneratedSerialDescriptor.i("upcoming_events", true);
            pluginGeneratedSerialDescriptor.i("can_chat", true);
            pluginGeneratedSerialDescriptor.i("user_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("username", false);
            pluginGeneratedSerialDescriptor.i("photo_url", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            e0 e0Var = e0.b;
            h hVar = h.b;
            ClubWithAdmin.a aVar = ClubWithAdmin.a.a;
            r rVar = r.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), e0Var, e0Var, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), hVar, hVar, e0Var, new n0.c.k.e(UserInList.a.a), m0.r.t.a.r.m.a1.a.R1(d.a), m0.r.t.a.r.m.a1.a.R1(BasicUser.a.a), m0.r.t.a.r.m.a1.a.R1(aVar), new n0.c.k.e(aVar), g1Var, hVar, rVar, rVar, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(Topic.a.a)), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(EventInProfile.a.a)), m0.r.t.a.r.m.a1.a.R1(hVar), e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v1, resolved type: com.clubhouse.android.data.models.local.user.BasicUser} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v2, resolved type: com.clubhouse.android.data.models.local.user.BasicUser} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.clubhouse.android.data.models.local.user.BasicUser} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: com.clubhouse.android.data.models.local.user.BasicUser} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v3, resolved type: com.clubhouse.android.data.models.local.user.BasicUser} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: com.clubhouse.android.data.models.local.user.BasicUser} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r57v4, resolved type: com.clubhouse.android.data.models.local.user.BasicUser} */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x01b7, code lost:
            r2 = r58;
            r9 = r9;
            r6 = r6;
            r5 = r5;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x01cb, code lost:
            r11 = r2 | r11;
            r16 = r4;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x01f7, code lost:
            r2 = r2 | r11;
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x020c, code lost:
            r2 = r2 | r11;
            r16 = r4;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0246, code lost:
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x026a, code lost:
            r2 = r11 | r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x02aa, code lost:
            r3 = r2;
            r16 = r4;
            r2 = r58;
            r6 = r6;
            r5 = r5;
            r9 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x02cb, code lost:
            r3 = r2;
            r2 = r58;
            r9 = r9;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x02ce, code lost:
            r11 = r3;
            r3 = r59;
            r8 = r8;
            r9 = r9;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x02d1, code lost:
            r29 = r35;
            r36 = r40;
            r60 = r46;
            r27 = r47;
            r9 = r9;
            r8 = r8;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0387, code lost:
            r47 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0389, code lost:
            r60 = r46;
            r27 = r47;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0425, code lost:
            r11 = r2;
            r44 = r26;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0428, code lost:
            r29 = r35;
            r36 = r40;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x048d, code lost:
            r44 = r26;
            r48 = r30;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0491, code lost:
            r2 = r58;
            r3 = r59;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0495, code lost:
            r4 = r16;
            r47 = r27;
            r35 = r29;
            r40 = r36;
            r10 = r57;
            r46 = r60;
            r9 = r9;
            r8 = r8;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0495, code lost:
            r9 = r9;
            r8 = r8;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0495, code lost:
            r9 = r9;
            r8 = r8;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r70) {
            /*
                r69 = this;
                r0 = r70
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r13 = 3
                r14 = 5
                r15 = 6
                r3 = 7
                r4 = 9
                r6 = 1
                r5 = 2
                r7 = 4
                r8 = 8
                r9 = 0
                r10 = 0
                if (r2 == 0) goto L_0x013a
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r24 = r0.v(r1, r9, r2, r10)
                java.lang.Object r6 = r0.v(r1, r6, r2, r10)
                java.lang.Object r5 = r0.v(r1, r5, r2, r10)
                java.lang.Object r13 = r0.v(r1, r13, r2, r10)
                int r7 = r0.k(r1, r7)
                int r14 = r0.k(r1, r14)
                n0.c.a r11 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r26 = j$.time.OffsetDateTime.class
                m0.r.d r12 = m0.n.b.m.a(r26)
                kotlinx.serialization.KSerializer[] r9 = new kotlinx.serialization.KSerializer[r9]
                r11.<init>(r12, r10, r9)
                java.lang.Object r9 = r0.m(r1, r15, r11, r10)
                boolean r3 = r0.s(r1, r3)
                boolean r8 = r0.s(r1, r8)
                int r4 = r0.k(r1, r4)
                n0.c.k.e r11 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r12 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r11.<init>(r12)
                r12 = 10
                java.lang.Object r11 = r0.m(r1, r12, r11, r10)
                i0.e.b.b3.a.b.c.d r12 = i0.e.b.b3.a.b.c.d.a
                r15 = 11
                java.lang.Object r12 = r0.v(r1, r15, r12, r10)
                com.clubhouse.android.data.models.local.user.BasicUser$a r15 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r25 = r3
                r3 = 12
                java.lang.Object r3 = r0.v(r1, r3, r15, r10)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r15 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r23 = r3
                r3 = 13
                java.lang.Object r3 = r0.v(r1, r3, r15, r10)
                r22 = r3
                n0.c.k.e r3 = new n0.c.k.e
                r3.<init>(r15)
                r15 = 14
                java.lang.Object r3 = r0.m(r1, r15, r3, r10)
                r15 = 15
                java.lang.String r15 = r0.t(r1, r15)
                r10 = 16
                boolean r10 = r0.s(r1, r10)
                r19 = r3
                r3 = 17
                double r20 = r0.A(r1, r3)
                r3 = 18
                double r17 = r0.A(r1, r3)
                n0.c.k.h r3 = n0.c.k.h.b
                r27 = r4
                r16 = r5
                r4 = 19
                r5 = 0
                java.lang.Object r4 = r0.v(r1, r4, r3, r5)
                r26 = r4
                r4 = 20
                java.lang.Object r4 = r0.v(r1, r4, r3, r5)
                r70 = r4
                r4 = 21
                java.lang.Object r4 = r0.v(r1, r4, r3, r5)
                r28 = r4
                r4 = 22
                java.lang.Object r4 = r0.v(r1, r4, r3, r5)
                n0.c.k.e r5 = new n0.c.k.e
                r30 = r4
                com.clubhouse.android.data.models.local.Topic$a r4 = com.clubhouse.android.data.models.local.Topic.a.a
                r5.<init>(r4)
                r4 = 23
                r31 = r6
                r6 = 0
                java.lang.Object r4 = r0.v(r1, r4, r5, r6)
                n0.c.k.e r5 = new n0.c.k.e
                com.clubhouse.android.data.models.local.EventInProfile$a r6 = com.clubhouse.android.data.models.local.EventInProfile.a.a
                r5.<init>(r6)
                r6 = 24
                r32 = r4
                r4 = 0
                java.lang.Object r5 = r0.v(r1, r6, r5, r4)
                r6 = 25
                java.lang.Object r3 = r0.v(r1, r6, r3, r4)
                r6 = 26
                int r6 = r0.k(r1, r6)
                r29 = r3
                r3 = 27
                java.lang.Object r3 = r0.v(r1, r3, r2, r4)
                r33 = r3
                r3 = 28
                java.lang.Object r3 = r0.v(r1, r3, r2, r4)
                r34 = r3
                r3 = 29
                java.lang.Object r2 = r0.v(r1, r3, r2, r4)
                r3 = 1073741823(0x3fffffff, float:1.9999999)
                r36 = r3
                r65 = r6
                r41 = r7
                r45 = r8
                r53 = r10
                r42 = r14
                r52 = r15
                r56 = r17
                r54 = r20
                r3 = r23
                r44 = r25
                r4 = r26
                r46 = r27
                r8 = r29
                r6 = r70
                r26 = r9
                r9 = r5
                r5 = r28
                goto L_0x04eb
            L_0x013a:
                r10 = 0
                r56 = r6
                r24 = r9
                r28 = r24
                r41 = r28
                r42 = r41
                r43 = r42
                r45 = r43
                r49 = r45
                r51 = r10
                r53 = r51
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r10 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r35 = 0
                r40 = 0
                r44 = 0
                r46 = 0
                r47 = 0
                r48 = 0
                r50 = 0
                r55 = 0
                r11 = r49
                r9 = 0
            L_0x016f:
                if (r56 == 0) goto L_0x04a3
                r57 = r10
                int r10 = r0.x(r1)
                switch(r10) {
                    case -1: goto L_0x0475;
                    case 0: goto L_0x0453;
                    case 1: goto L_0x042f;
                    case 2: goto L_0x0406;
                    case 3: goto L_0x03e9;
                    case 4: goto L_0x03d2;
                    case 5: goto L_0x03bb;
                    case 6: goto L_0x0391;
                    case 7: goto L_0x0372;
                    case 8: goto L_0x035a;
                    case 9: goto L_0x0343;
                    case 10: goto L_0x0322;
                    case 11: goto L_0x0304;
                    case 12: goto L_0x02da;
                    case 13: goto L_0x02b2;
                    case 14: goto L_0x0293;
                    case 15: goto L_0x0281;
                    case 16: goto L_0x026e;
                    case 17: goto L_0x025a;
                    case 18: goto L_0x0249;
                    case 19: goto L_0x0235;
                    case 20: goto L_0x0226;
                    case 21: goto L_0x0215;
                    case 22: goto L_0x01fe;
                    case 23: goto L_0x01e4;
                    case 24: goto L_0x01d0;
                    case 25: goto L_0x01bf;
                    case 26: goto L_0x01a7;
                    case 27: goto L_0x019a;
                    case 28: goto L_0x018d;
                    case 29: goto L_0x0180;
                    default: goto L_0x017a;
                }
            L_0x017a:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r10)
                throw r0
            L_0x0180:
                r10 = 29
                r58 = r2
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r14 = r0.v(r1, r10, r2, r14)
                r2 = 536870912(0x20000000, float:1.0842022E-19)
                goto L_0x01cb
            L_0x018d:
                r58 = r2
                r2 = 28
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r2, r10, r3)
                r2 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x01cb
            L_0x019a:
                r58 = r2
                r2 = 27
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r13 = r0.v(r1, r2, r10, r13)
                r2 = 134217728(0x8000000, float:3.85186E-34)
                goto L_0x01cb
            L_0x01a7:
                r58 = r2
                r2 = 26
                int r2 = r0.k(r1, r2)
                r10 = 67108864(0x4000000, float:1.5046328E-36)
                r10 = r10 | r11
                r41 = r2
                r16 = r4
                r11 = r10
            L_0x01b7:
                r2 = r58
                r4 = 13
                r10 = 19
                goto L_0x02d1
            L_0x01bf:
                r58 = r2
                r2 = 25
                n0.c.k.h r10 = n0.c.k.h.b
                java.lang.Object r8 = r0.v(r1, r2, r10, r8)
                r2 = 33554432(0x2000000, float:9.403955E-38)
            L_0x01cb:
                r2 = r2 | r11
                r11 = r2
                r16 = r4
                goto L_0x01b7
            L_0x01d0:
                r58 = r2
                r2 = 24
                n0.c.k.e r10 = new n0.c.k.e
                r59 = r3
                com.clubhouse.android.data.models.local.EventInProfile$a r3 = com.clubhouse.android.data.models.local.EventInProfile.a.a
                r10.<init>(r3)
                java.lang.Object r9 = r0.v(r1, r2, r10, r9)
                r2 = 16777216(0x1000000, float:2.3509887E-38)
                goto L_0x01f7
            L_0x01e4:
                r58 = r2
                r59 = r3
                r2 = 23
                n0.c.k.e r3 = new n0.c.k.e
                com.clubhouse.android.data.models.local.Topic$a r10 = com.clubhouse.android.data.models.local.Topic.a.a
                r3.<init>(r10)
                java.lang.Object r4 = r0.v(r1, r2, r3, r4)
                r2 = 8388608(0x800000, float:1.17549435E-38)
            L_0x01f7:
                r2 = r2 | r11
                r3 = 14
                r10 = 19
                goto L_0x02aa
            L_0x01fe:
                r58 = r2
                r59 = r3
                r2 = 22
                n0.c.k.h r3 = n0.c.k.h.b
                java.lang.Object r15 = r0.v(r1, r2, r3, r15)
                r2 = 4194304(0x400000, float:5.877472E-39)
            L_0x020c:
                r2 = r2 | r11
                r16 = r4
                r4 = 13
                r10 = 19
                goto L_0x02cb
            L_0x0215:
                r58 = r2
                r59 = r3
                r2 = 21
                n0.c.k.h r3 = n0.c.k.h.b
                java.lang.Object r5 = r0.v(r1, r2, r3, r5)
                r2 = 2097152(0x200000, float:2.938736E-39)
                r3 = 20
                goto L_0x020c
            L_0x0226:
                r58 = r2
                r59 = r3
                n0.c.k.h r2 = n0.c.k.h.b
                r3 = 20
                java.lang.Object r6 = r0.v(r1, r3, r2, r6)
                r2 = 1048576(0x100000, float:1.469368E-39)
                goto L_0x020c
            L_0x0235:
                r58 = r2
                r59 = r3
                r3 = 20
                n0.c.k.h r2 = n0.c.k.h.b
                r10 = 19
                java.lang.Object r7 = r0.v(r1, r10, r2, r7)
                r2 = 524288(0x80000, float:7.34684E-40)
                r2 = r2 | r11
            L_0x0246:
                r3 = 14
                goto L_0x02aa
            L_0x0249:
                r58 = r2
                r59 = r3
                r2 = 18
                r3 = 20
                r10 = 19
                double r51 = r0.A(r1, r2)
                r16 = 262144(0x40000, float:3.67342E-40)
                goto L_0x026a
            L_0x025a:
                r58 = r2
                r59 = r3
                r2 = 17
                r3 = 20
                r10 = 19
                double r53 = r0.A(r1, r2)
                r16 = 131072(0x20000, float:1.83671E-40)
            L_0x026a:
                r11 = r11 | r16
                r2 = r11
                goto L_0x0246
            L_0x026e:
                r58 = r2
                r59 = r3
                r2 = 16
                r3 = 20
                r10 = 19
                boolean r45 = r0.s(r1, r2)
                r16 = 65536(0x10000, float:9.18355E-41)
                r2 = 15
                goto L_0x026a
            L_0x0281:
                r58 = r2
                r59 = r3
                r2 = 15
                r3 = 20
                r10 = 19
                java.lang.String r50 = r0.t(r1, r2)
                r16 = 32768(0x8000, float:4.5918E-41)
                goto L_0x026a
            L_0x0293:
                r58 = r2
                r59 = r3
                r3 = 20
                r10 = 19
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r3 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r2.<init>(r3)
                r3 = 14
                java.lang.Object r12 = r0.m(r1, r3, r2, r12)
                r2 = r11 | 16384(0x4000, float:2.2959E-41)
            L_0x02aa:
                r3 = r2
                r16 = r4
                r2 = r58
                r4 = 13
                goto L_0x02ce
            L_0x02b2:
                r58 = r2
                r59 = r3
                r3 = 14
                r10 = 19
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r16 = r4
                r3 = r58
                r4 = 13
                java.lang.Object r2 = r0.v(r1, r4, r2, r3)
                r3 = r11 | 8192(0x2000, float:1.14794E-41)
                r58 = r2
                r2 = r3
            L_0x02cb:
                r3 = r2
                r2 = r58
            L_0x02ce:
                r11 = r3
                r3 = r59
            L_0x02d1:
                r29 = r35
                r36 = r40
                r60 = r46
                r27 = r47
                goto L_0x0300
            L_0x02da:
                r59 = r3
                r16 = r4
                r4 = 13
                r10 = 19
                r3 = r2
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r58 = r3
                r4 = r57
                r3 = 12
                java.lang.Object r2 = r0.v(r1, r3, r2, r4)
                r4 = r11 | 4096(0x1000, float:5.74E-42)
                r57 = r2
                r11 = r4
                r29 = r35
                r36 = r40
                r60 = r46
                r27 = r47
                r2 = r58
                r3 = r59
            L_0x0300:
                r4 = 0
                r10 = 0
                goto L_0x0495
            L_0x0304:
                r58 = r2
                r59 = r3
                r16 = r4
                r4 = r57
                r3 = 12
                r10 = 19
                i0.e.b.b3.a.b.c.d r2 = i0.e.b.b3.a.b.c.d.a
                r3 = r47
                r4 = 11
                java.lang.Object r47 = r0.v(r1, r4, r2, r3)
                r2 = r11 | 2048(0x800, float:2.87E-42)
                r11 = r2
                r2 = 7
                r3 = 10
                goto L_0x0389
            L_0x0322:
                r58 = r2
                r59 = r3
                r16 = r4
                r3 = r47
                r4 = 11
                r10 = 19
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r4 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r2.<init>(r4)
                r27 = r3
                r4 = r46
                r3 = 10
                java.lang.Object r46 = r0.m(r1, r3, r2, r4)
                r2 = r11 | 1024(0x400, float:1.435E-42)
                r11 = r2
                goto L_0x0370
            L_0x0343:
                r58 = r2
                r59 = r3
                r16 = r4
                r4 = r46
                r27 = r47
                r2 = 9
                r3 = 10
                r10 = 19
                int r28 = r0.k(r1, r2)
                r11 = r11 | 512(0x200, float:7.175E-43)
                goto L_0x0370
            L_0x035a:
                r58 = r2
                r59 = r3
                r16 = r4
                r4 = r46
                r27 = r47
                r2 = 8
                r3 = 10
                r10 = 19
                boolean r43 = r0.s(r1, r2)
                r11 = r11 | 256(0x100, float:3.59E-43)
            L_0x0370:
                r2 = 7
                goto L_0x0387
            L_0x0372:
                r58 = r2
                r59 = r3
                r16 = r4
                r4 = r46
                r27 = r47
                r2 = 7
                r3 = 10
                r10 = 19
                boolean r24 = r0.s(r1, r2)
                r11 = r11 | 128(0x80, float:1.794E-43)
            L_0x0387:
                r47 = r27
            L_0x0389:
                r60 = r46
                r27 = r47
                r4 = 2
                r10 = 0
                goto L_0x0428
            L_0x0391:
                r58 = r2
                r59 = r3
                r16 = r4
                r4 = r46
                r27 = r47
                r3 = 10
                r10 = 19
                n0.c.a r2 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r46 = j$.time.OffsetDateTime.class
                m0.r.d r3 = m0.n.b.m.a(r46)
                r60 = r4
                r10 = 0
                kotlinx.serialization.KSerializer[] r4 = new kotlinx.serialization.KSerializer[r10]
                r10 = 0
                r2.<init>(r3, r10, r4)
                r3 = r44
                r4 = 6
                java.lang.Object r44 = r0.m(r1, r4, r2, r3)
                r2 = r11 | 64
                r11 = r2
                goto L_0x03d0
            L_0x03bb:
                r58 = r2
                r59 = r3
                r16 = r4
                r3 = r44
                r60 = r46
                r27 = r47
                r2 = 5
                r4 = 6
                r10 = 0
                int r49 = r0.k(r1, r2)
                r11 = r11 | 32
            L_0x03d0:
                r2 = 4
                goto L_0x03e7
            L_0x03d2:
                r58 = r2
                r59 = r3
                r16 = r4
                r3 = r44
                r60 = r46
                r27 = r47
                r2 = 4
                r4 = 6
                r10 = 0
                int r42 = r0.k(r1, r2)
                r11 = r11 | 16
            L_0x03e7:
                r4 = 2
                goto L_0x0428
            L_0x03e9:
                r58 = r2
                r59 = r3
                r16 = r4
                r3 = r44
                r60 = r46
                r27 = r47
                r4 = 6
                r10 = 0
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r26 = r3
                r4 = r48
                r3 = 3
                java.lang.Object r48 = r0.v(r1, r3, r2, r4)
                r2 = r11 | 8
                r4 = 2
                goto L_0x0425
            L_0x0406:
                r58 = r2
                r59 = r3
                r16 = r4
                r26 = r44
                r60 = r46
                r27 = r47
                r4 = r48
                r3 = 3
                r10 = 0
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r30 = r4
                r3 = r35
                r4 = 2
                java.lang.Object r35 = r0.v(r1, r4, r2, r3)
                r2 = r11 | 4
                r48 = r30
            L_0x0425:
                r11 = r2
                r44 = r26
            L_0x0428:
                r29 = r35
                r36 = r40
                r4 = 0
                goto L_0x0491
            L_0x042f:
                r58 = r2
                r59 = r3
                r16 = r4
                r3 = r35
                r26 = r44
                r60 = r46
                r27 = r47
                r30 = r48
                r4 = 2
                r10 = 0
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r29 = r3
                r4 = r40
                r3 = 1
                java.lang.Object r40 = r0.v(r1, r3, r2, r4)
                r2 = r11 | 2
                r11 = r2
                r36 = r40
                r4 = 0
                goto L_0x048d
            L_0x0453:
                r58 = r2
                r59 = r3
                r16 = r4
                r29 = r35
                r4 = r40
                r26 = r44
                r60 = r46
                r27 = r47
                r30 = r48
                r3 = 1
                r10 = 0
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r36 = r4
                r3 = r55
                r4 = 0
                java.lang.Object r55 = r0.v(r1, r4, r2, r3)
                r11 = r11 | 1
                goto L_0x048d
            L_0x0475:
                r58 = r2
                r59 = r3
                r16 = r4
                r29 = r35
                r36 = r40
                r26 = r44
                r60 = r46
                r27 = r47
                r30 = r48
                r3 = r55
                r4 = 0
                r10 = 0
                r56 = r4
            L_0x048d:
                r44 = r26
                r48 = r30
            L_0x0491:
                r2 = r58
                r3 = r59
            L_0x0495:
                r4 = r16
                r47 = r27
                r35 = r29
                r40 = r36
                r10 = r57
                r46 = r60
                goto L_0x016f
            L_0x04a3:
                r58 = r2
                r59 = r3
                r16 = r4
                r57 = r10
                r29 = r35
                r36 = r40
                r26 = r44
                r60 = r46
                r27 = r47
                r30 = r48
                r3 = r55
                r4 = r7
                r19 = r12
                r33 = r13
                r2 = r14
                r32 = r16
                r44 = r24
                r12 = r27
                r46 = r28
                r16 = r29
                r13 = r30
                r31 = r36
                r65 = r41
                r41 = r42
                r42 = r49
                r54 = r53
                r22 = r58
                r34 = r59
                r24 = r3
                r36 = r11
                r30 = r15
                r53 = r45
                r3 = r57
                r11 = r60
                r45 = r43
                r56 = r51
                r52 = r50
            L_0x04eb:
                r0.b(r1)
                com.clubhouse.android.data.models.local.user.UserProfile r0 = new com.clubhouse.android.data.models.local.user.UserProfile
                r35 = r0
                r37 = r24
                java.lang.String r37 = (java.lang.String) r37
                r38 = r31
                java.lang.String r38 = (java.lang.String) r38
                r39 = r16
                java.lang.String r39 = (java.lang.String) r39
                r40 = r13
                java.lang.String r40 = (java.lang.String) r40
                r43 = r26
                j$.time.OffsetDateTime r43 = (j$.time.OffsetDateTime) r43
                r47 = r11
                java.util.List r47 = (java.util.List) r47
                r48 = r12
                com.clubhouse.android.data.models.local.notification.FollowNotificationType r48 = (com.clubhouse.android.data.models.local.notification.FollowNotificationType) r48
                r49 = r3
                com.clubhouse.android.data.models.local.user.BasicUser r49 = (com.clubhouse.android.data.models.local.user.BasicUser) r49
                r50 = r22
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r50 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r50
                r51 = r19
                java.util.List r51 = (java.util.List) r51
                r58 = r4
                java.lang.Boolean r58 = (java.lang.Boolean) r58
                r59 = r6
                java.lang.Boolean r59 = (java.lang.Boolean) r59
                r60 = r5
                java.lang.Boolean r60 = (java.lang.Boolean) r60
                r61 = r30
                java.lang.Boolean r61 = (java.lang.Boolean) r61
                r62 = r32
                java.util.List r62 = (java.util.List) r62
                r63 = r9
                java.util.List r63 = (java.util.List) r63
                r64 = r8
                java.lang.Boolean r64 = (java.lang.Boolean) r64
                r66 = r33
                java.lang.String r66 = (java.lang.String) r66
                r67 = r34
                java.lang.String r67 = (java.lang.String) r67
                r68 = r2
                java.lang.String r68 = (java.lang.String) r68
                r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r56, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.user.UserProfile.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UserProfile userProfile = (UserProfile) obj;
            i.e(encoder, "encoder");
            i.e(userProfile, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            n0.c.j.d c = encoder.c(serialDescriptor);
            i.e(userProfile, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || userProfile.c != null) {
                c.l(serialDescriptor, 0, g1.b, userProfile.c);
            }
            if (c.v(serialDescriptor, 1) || userProfile.d != null) {
                c.l(serialDescriptor, 1, g1.b, userProfile.d);
            }
            if (c.v(serialDescriptor, 2) || userProfile.q != null) {
                c.l(serialDescriptor, 2, g1.b, userProfile.q);
            }
            if (c.v(serialDescriptor, 3) || userProfile.x != null) {
                c.l(serialDescriptor, 3, g1.b, userProfile.x);
            }
            c.q(serialDescriptor, 4, userProfile.y);
            c.q(serialDescriptor, 5, userProfile.Y1);
            c.z(serialDescriptor, 6, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), userProfile.Z1);
            c.r(serialDescriptor, 7, userProfile.a2);
            c.r(serialDescriptor, 8, userProfile.b2);
            c.q(serialDescriptor, 9, userProfile.c2);
            c.z(serialDescriptor, 10, new n0.c.k.e(UserInList.a.a), userProfile.d2);
            if (c.v(serialDescriptor, 11) || userProfile.e2 != null) {
                c.l(serialDescriptor, 11, d.a, userProfile.e2);
            }
            if (c.v(serialDescriptor, 12) || userProfile.f2 != null) {
                c.l(serialDescriptor, 12, BasicUser.a.a, userProfile.f2);
            }
            if (c.v(serialDescriptor, 13) || userProfile.g2 != null) {
                c.l(serialDescriptor, 13, ClubWithAdmin.a.a, userProfile.g2);
            }
            c.z(serialDescriptor, 14, new n0.c.k.e(ClubWithAdmin.a.a), userProfile.h2);
            c.s(serialDescriptor, 15, userProfile.i2);
            c.r(serialDescriptor, 16, userProfile.j2);
            if (c.v(serialDescriptor, 17) || !i.a(Double.valueOf(userProfile.k2), Double.valueOf(0.029d))) {
                c.B(serialDescriptor, 17, userProfile.k2);
            }
            if (c.v(serialDescriptor, 18) || !i.a(Double.valueOf(userProfile.l2), Double.valueOf(0.3d))) {
                c.B(serialDescriptor, 18, userProfile.l2);
            }
            if (c.v(serialDescriptor, 19) || !i.a(userProfile.m2, Boolean.FALSE)) {
                c.l(serialDescriptor, 19, h.b, userProfile.m2);
            }
            if (c.v(serialDescriptor, 20) || !i.a(userProfile.n2, Boolean.FALSE)) {
                c.l(serialDescriptor, 20, h.b, userProfile.n2);
            }
            if (c.v(serialDescriptor, 21) || !i.a(userProfile.o2, Boolean.FALSE)) {
                c.l(serialDescriptor, 21, h.b, userProfile.o2);
            }
            if (c.v(serialDescriptor, 22) || !i.a(userProfile.p2, Boolean.FALSE)) {
                c.l(serialDescriptor, 22, h.b, userProfile.p2);
            }
            if (c.v(serialDescriptor, 23) || userProfile.q2 != null) {
                c.l(serialDescriptor, 23, new n0.c.k.e(Topic.a.a), userProfile.q2);
            }
            if (c.v(serialDescriptor, 24) || userProfile.r2 != null) {
                c.l(serialDescriptor, 24, new n0.c.k.e(EventInProfile.a.a), userProfile.r2);
            }
            if (c.v(serialDescriptor, 25) || userProfile.s2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 25, h.b, userProfile.s2);
            }
            c.q(serialDescriptor, 26, userProfile.getId().intValue());
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 27, g1Var, userProfile.u2);
            c.l(serialDescriptor, 28, g1Var, userProfile.v2);
            c.l(serialDescriptor, 29, g1Var, userProfile.w2);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: UserProfile.kt */
    public static final class b implements Parcelable.Creator<UserProfile> {
        public Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            String str;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Boolean valueOf5;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            OffsetDateTime offsetDateTime = (OffsetDateTime) parcel.readSerializable();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(readInt4);
            for (int i = 0; i != readInt4; i = i0.d.a.a.a.n(UserInList.CREATOR, parcel2, arrayList5, i, 1)) {
            }
            FollowNotificationType valueOf6 = parcel.readInt() == 0 ? null : FollowNotificationType.valueOf(parcel.readString());
            BasicUser createFromParcel = parcel.readInt() == 0 ? null : BasicUser.CREATOR.createFromParcel(parcel2);
            ClubWithAdmin createFromParcel2 = parcel.readInt() == 0 ? null : ClubWithAdmin.CREATOR.createFromParcel(parcel2);
            int readInt5 = parcel.readInt();
            ArrayList arrayList6 = new ArrayList(readInt5);
            BasicUser basicUser = createFromParcel;
            int i2 = 0;
            while (i2 != readInt5) {
                i2 = i0.d.a.a.a.n(ClubWithAdmin.CREATOR, parcel2, arrayList6, i2, 1);
                readInt5 = readInt5;
                valueOf6 = valueOf6;
            }
            FollowNotificationType followNotificationType = valueOf6;
            String readString5 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = valueOf;
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool2 = valueOf2;
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool3 = valueOf3;
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool4 = valueOf4;
            if (parcel.readInt() == 0) {
                str = readString5;
                arrayList = arrayList6;
                arrayList2 = null;
            } else {
                int readInt6 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt6);
                arrayList = arrayList6;
                int i3 = 0;
                while (i3 != readInt6) {
                    i3 = i0.d.a.a.a.n(Topic.CREATOR, parcel2, arrayList7, i3, 1);
                    readInt6 = readInt6;
                    readString5 = readString5;
                }
                str = readString5;
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int readInt7 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(readInt7);
                int i4 = 0;
                while (i4 != readInt7) {
                    i4 = i0.d.a.a.a.n(EventInProfile.CREATOR, parcel2, arrayList8, i4, 1);
                    readInt7 = readInt7;
                    arrayList2 = arrayList2;
                }
                arrayList3 = arrayList2;
                arrayList4 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserProfile(readString, readString2, readString3, readString4, readInt, readInt2, offsetDateTime, z, z2, readInt3, arrayList5, followNotificationType, basicUser, createFromParcel2, arrayList, str, z3, readDouble, readDouble2, bool, bool2, bool3, bool4, arrayList3, arrayList4, valueOf5, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new UserProfile[i];
        }
    }

    public UserProfile(int i, String str, String str2, String str3, String str4, int i3, int i4, OffsetDateTime offsetDateTime, boolean z, boolean z2, int i5, List list, FollowNotificationType followNotificationType, BasicUser basicUser, ClubWithAdmin clubWithAdmin, List list2, String str5, boolean z3, double d3, double d4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list3, List list4, Boolean bool5, int i6, String str6, String str7, String str8) {
        int i7 = i;
        if (1006749680 == (i7 & 1006749680)) {
            if ((i7 & 1) == 0) {
                this.c = null;
            } else {
                this.c = str;
            }
            if ((i7 & 2) == 0) {
                this.d = null;
            } else {
                this.d = str2;
            }
            if ((i7 & 4) == 0) {
                this.q = null;
            } else {
                this.q = str3;
            }
            if ((i7 & 8) == 0) {
                this.x = null;
            } else {
                this.x = str4;
            }
            this.y = i3;
            this.Y1 = i4;
            this.Z1 = offsetDateTime;
            this.a2 = z;
            this.b2 = z2;
            this.c2 = i5;
            this.d2 = list;
            if ((i7 & 2048) == 0) {
                this.e2 = null;
            } else {
                this.e2 = followNotificationType;
            }
            if ((i7 & 4096) == 0) {
                this.f2 = null;
            } else {
                this.f2 = basicUser;
            }
            if ((i7 & 8192) == 0) {
                this.g2 = null;
            } else {
                this.g2 = clubWithAdmin;
            }
            this.h2 = list2;
            this.i2 = str5;
            this.j2 = z3;
            this.k2 = (131072 & i7) == 0 ? 0.029d : d3;
            this.l2 = (262144 & i7) == 0 ? 0.3d : d4;
            this.m2 = (524288 & i7) == 0 ? Boolean.FALSE : bool;
            this.n2 = (1048576 & i7) == 0 ? Boolean.FALSE : bool2;
            this.o2 = (2097152 & i7) == 0 ? Boolean.FALSE : bool3;
            this.p2 = (4194304 & i7) == 0 ? Boolean.FALSE : bool4;
            if ((8388608 & i7) == 0) {
                this.q2 = null;
            } else {
                this.q2 = list3;
            }
            if ((16777216 & i7) == 0) {
                this.r2 = null;
            } else {
                this.r2 = list4;
            }
            if ((i7 & 33554432) == 0) {
                this.s2 = null;
            } else {
                this.s2 = bool5;
            }
            this.t2 = i6;
            this.u2 = str6;
            this.v2 = str7;
            this.w2 = str8;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 1006749680, a.b);
        throw null;
    }

    public static UserProfile a(UserProfile userProfile, String str, String str2, String str3, String str4, int i, int i3, OffsetDateTime offsetDateTime, boolean z, boolean z2, int i4, List list, FollowNotificationType followNotificationType, BasicUser basicUser, ClubWithAdmin clubWithAdmin, List list2, String str5, boolean z3, double d3, double d4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list3, List list4, Boolean bool5, int i5, String str6, String str7, String str8, int i6) {
        Boolean bool6;
        String str9;
        String str10;
        String str11;
        UserProfile userProfile2 = userProfile;
        int i7 = i6;
        String str12 = (i7 & 1) != 0 ? userProfile2.c : null;
        String str13 = (i7 & 2) != 0 ? userProfile2.d : str2;
        String str14 = (i7 & 4) != 0 ? userProfile2.q : str3;
        String str15 = (i7 & 8) != 0 ? userProfile2.x : null;
        int i8 = (i7 & 16) != 0 ? userProfile2.y : i;
        int i9 = (i7 & 32) != 0 ? userProfile2.Y1 : i3;
        OffsetDateTime offsetDateTime2 = (i7 & 64) != 0 ? userProfile2.Z1 : null;
        boolean z4 = (i7 & 128) != 0 ? userProfile2.a2 : z;
        boolean z5 = (i7 & 256) != 0 ? userProfile2.b2 : z2;
        int i10 = (i7 & 512) != 0 ? userProfile2.c2 : i4;
        List<UserInList> list5 = (i7 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? userProfile2.d2 : null;
        FollowNotificationType followNotificationType2 = (i7 & 2048) != 0 ? userProfile2.e2 : null;
        BasicUser basicUser2 = (i7 & 4096) != 0 ? userProfile2.f2 : null;
        ClubWithAdmin clubWithAdmin2 = (i7 & 8192) != 0 ? userProfile2.g2 : null;
        List<ClubWithAdmin> list6 = (i7 & 16384) != 0 ? userProfile2.h2 : null;
        BasicUser basicUser3 = basicUser2;
        String str16 = (i7 & 32768) != 0 ? userProfile2.i2 : null;
        FollowNotificationType followNotificationType3 = followNotificationType2;
        boolean z6 = (i7 & 65536) != 0 ? userProfile2.j2 : z3;
        boolean z7 = z5;
        int i11 = i10;
        double d5 = (i7 & 131072) != 0 ? userProfile2.k2 : d3;
        double d6 = (i7 & 262144) != 0 ? userProfile2.l2 : d4;
        Boolean bool7 = (i7 & 524288) != 0 ? userProfile2.m2 : null;
        Boolean bool8 = (1048576 & i7) != 0 ? userProfile2.n2 : null;
        Boolean bool9 = (i7 & 2097152) != 0 ? userProfile2.o2 : null;
        Boolean bool10 = (i7 & 4194304) != 0 ? userProfile2.p2 : null;
        List<Topic> list7 = (i7 & 8388608) != 0 ? userProfile2.q2 : null;
        List<EventInProfile> list8 = (i7 & 16777216) != 0 ? userProfile2.r2 : null;
        Boolean bool11 = (i7 & 33554432) != 0 ? userProfile2.s2 : null;
        int intValue = (i7 & 67108864) != 0 ? userProfile.getId().intValue() : i5;
        if ((i7 & 134217728) != 0) {
            bool6 = bool11;
            str9 = userProfile2.u2;
        } else {
            bool6 = bool11;
            str9 = null;
        }
        if ((i7 & 268435456) != 0) {
            str10 = str9;
            str11 = userProfile2.v2;
        } else {
            str10 = str9;
            str11 = null;
        }
        String str17 = (i7 & 536870912) != 0 ? userProfile2.w2 : str8;
        i.e(offsetDateTime2, "joinDate");
        i.e(list5, "mutuals");
        i.e(list6, "clubs");
        i.e(str16, "url");
        return new UserProfile(str12, str13, str14, str15, i8, i9, offsetDateTime2, z4, z7, i11, list5, followNotificationType3, basicUser3, clubWithAdmin2, list6, str16, z6, d5, d6, bool7, bool8, bool9, bool10, list7, list8, bool6, intValue, str10, str11, str17);
    }

    public String C() {
        return this.v2;
    }

    public String F() {
        return h0.b0.v.f0(this);
    }

    public String I() {
        return h0.b0.v.O0(this);
    }

    public String b() {
        return this.w2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) obj;
        return i.a(this.c, userProfile.c) && i.a(this.d, userProfile.d) && i.a(this.q, userProfile.q) && i.a(this.x, userProfile.x) && this.y == userProfile.y && this.Y1 == userProfile.Y1 && i.a(this.Z1, userProfile.Z1) && this.a2 == userProfile.a2 && this.b2 == userProfile.b2 && this.c2 == userProfile.c2 && i.a(this.d2, userProfile.d2) && this.e2 == userProfile.e2 && i.a(this.f2, userProfile.f2) && i.a(this.g2, userProfile.g2) && i.a(this.h2, userProfile.h2) && i.a(this.i2, userProfile.i2) && this.j2 == userProfile.j2 && i.a(Double.valueOf(this.k2), Double.valueOf(userProfile.k2)) && i.a(Double.valueOf(this.l2), Double.valueOf(userProfile.l2)) && i.a(this.m2, userProfile.m2) && i.a(this.n2, userProfile.n2) && i.a(this.o2, userProfile.o2) && i.a(this.p2, userProfile.p2) && i.a(this.q2, userProfile.q2) && i.a(this.r2, userProfile.r2) && i.a(this.s2, userProfile.s2) && getId().intValue() == userProfile.getId().intValue() && i.a(this.u2, userProfile.u2) && i.a(this.v2, userProfile.v2) && i.a(this.w2, userProfile.w2);
    }

    public String getName() {
        return this.u2;
    }

    public int hashCode() {
        int i;
        int i3;
        String str = this.c;
        int i4 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.q;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.x;
        int hashCode4 = (this.Z1.hashCode() + i0.d.a.a.a.M(this.Y1, i0.d.a.a.a.M(this.y, (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31)) * 31;
        boolean z = this.a2;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i5 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.b2;
        if (z3) {
            z3 = true;
        }
        int H = i0.d.a.a.a.H(this.d2, i0.d.a.a.a.M(this.c2, (i5 + (z3 ? 1 : 0)) * 31, 31), 31);
        FollowNotificationType followNotificationType = this.e2;
        int hashCode5 = (H + (followNotificationType == null ? 0 : followNotificationType.hashCode())) * 31;
        BasicUser basicUser = this.f2;
        int hashCode6 = (hashCode5 + (basicUser == null ? 0 : basicUser.hashCode())) * 31;
        ClubWithAdmin clubWithAdmin = this.g2;
        int F = i0.d.a.a.a.F(this.i2, i0.d.a.a.a.H(this.h2, (hashCode6 + (clubWithAdmin == null ? 0 : clubWithAdmin.hashCode())) * 31, 31), 31);
        boolean z4 = this.j2;
        if (!z4) {
            z2 = z4;
        }
        int hashCode7 = (Double.hashCode(this.l2) + ((Double.hashCode(this.k2) + ((F + (z2 ? 1 : 0)) * 31)) * 31)) * 31;
        Boolean bool = this.m2;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.n2;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.o2;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.p2;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<Topic> list = this.q2;
        int hashCode12 = (hashCode11 + (list == null ? 0 : list.hashCode())) * 31;
        List<EventInProfile> list2 = this.r2;
        int hashCode13 = (hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool5 = this.s2;
        int hashCode14 = (getId().hashCode() + ((hashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31)) * 31;
        String str5 = this.u2;
        if (str5 == null) {
            i = 0;
        } else {
            i = str5.hashCode();
        }
        int i6 = (hashCode14 + i) * 31;
        String str6 = this.v2;
        if (str6 == null) {
            i3 = 0;
        } else {
            i3 = str6.hashCode();
        }
        int i7 = (i6 + i3) * 31;
        String str7 = this.w2;
        if (str7 != null) {
            i4 = str7.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserProfile(displayname=");
        P0.append(this.c);
        P0.append(", bio=");
        P0.append(this.d);
        P0.append(", twitter=");
        P0.append(this.q);
        P0.append(", instagram=");
        P0.append(this.x);
        P0.append(", numFollowers=");
        P0.append(this.y);
        P0.append(", numFollowing=");
        P0.append(this.Y1);
        P0.append(", joinDate=");
        P0.append(this.Z1);
        P0.append(", followsMe=");
        P0.append(this.a2);
        P0.append(", isBlockedByNetwork=");
        P0.append(this.b2);
        P0.append(", mutualsCount=");
        P0.append(this.c2);
        P0.append(", mutuals=");
        P0.append(this.d2);
        P0.append(", notificationType=");
        P0.append(this.e2);
        P0.append(", invitedByUser=");
        P0.append(this.f2);
        P0.append(", invitedByClub=");
        P0.append(this.g2);
        P0.append(", clubs=");
        P0.append(this.h2);
        P0.append(", url=");
        P0.append(this.i2);
        P0.append(", canReceivePayment=");
        P0.append(this.j2);
        P0.append(", feeRate=");
        P0.append(this.k2);
        P0.append(", feeFixed=");
        P0.append(this.l2);
        P0.append(", verifiedEmail=");
        P0.append(this.m2);
        P0.append(", canEditUsername=");
        P0.append(this.n2);
        P0.append(", canEditName=");
        P0.append(this.o2);
        P0.append(", canEditDisplayName=");
        P0.append(this.p2);
        P0.append(", topics=");
        P0.append(this.q2);
        P0.append(", upcomingEvents=");
        P0.append(this.r2);
        P0.append(", canChat=");
        P0.append(this.s2);
        P0.append(", id=");
        P0.append(getId().intValue());
        P0.append(", name=");
        P0.append(this.u2);
        P0.append(", username=");
        P0.append(this.v2);
        P0.append(", photoUrl=");
        return i0.d.a.a.a.w0(P0, this.w2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.q);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.Y1);
        parcel.writeSerializable(this.Z1);
        parcel.writeInt(this.a2 ? 1 : 0);
        parcel.writeInt(this.b2 ? 1 : 0);
        parcel.writeInt(this.c2);
        List<UserInList> list = this.d2;
        parcel.writeInt(list.size());
        for (UserInList writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        FollowNotificationType followNotificationType = this.e2;
        if (followNotificationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(followNotificationType.name());
        }
        BasicUser basicUser = this.f2;
        if (basicUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicUser.writeToParcel(parcel, i);
        }
        ClubWithAdmin clubWithAdmin = this.g2;
        if (clubWithAdmin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clubWithAdmin.writeToParcel(parcel, i);
        }
        List<ClubWithAdmin> list2 = this.h2;
        parcel.writeInt(list2.size());
        for (ClubWithAdmin writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.i2);
        parcel.writeInt(this.j2 ? 1 : 0);
        parcel.writeDouble(this.k2);
        parcel.writeDouble(this.l2);
        Boolean bool = this.m2;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.n2;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Boolean bool3 = this.o2;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool3.booleanValue() ? 1 : 0);
        }
        Boolean bool4 = this.p2;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool4.booleanValue() ? 1 : 0);
        }
        List<Topic> list3 = this.q2;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            for (Topic writeToParcel3 : list3) {
                writeToParcel3.writeToParcel(parcel, i);
            }
        }
        List<EventInProfile> list4 = this.r2;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list4.size());
            for (EventInProfile writeToParcel4 : list4) {
                writeToParcel4.writeToParcel(parcel, i);
            }
        }
        Boolean bool5 = this.s2;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool5.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.t2);
        parcel.writeString(this.u2);
        parcel.writeString(this.v2);
        parcel.writeString(this.w2);
    }

    public Integer getId() {
        return Integer.valueOf(this.t2);
    }

    public UserProfile(String str, String str2, String str3, String str4, int i, int i3, OffsetDateTime offsetDateTime, boolean z, boolean z2, int i4, List<UserInList> list, FollowNotificationType followNotificationType, BasicUser basicUser, ClubWithAdmin clubWithAdmin, List<ClubWithAdmin> list2, String str5, boolean z3, double d3, double d4, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List<Topic> list3, List<EventInProfile> list4, Boolean bool5, int i5, String str6, String str7, String str8) {
        List<UserInList> list5 = list;
        List<ClubWithAdmin> list6 = list2;
        String str9 = str5;
        i.e(offsetDateTime, "joinDate");
        i.e(list5, "mutuals");
        i.e(list6, "clubs");
        i.e(str9, "url");
        this.c = str;
        this.d = str2;
        this.q = str3;
        this.x = str4;
        this.y = i;
        this.Y1 = i3;
        this.Z1 = offsetDateTime;
        this.a2 = z;
        this.b2 = z2;
        this.c2 = i4;
        this.d2 = list5;
        this.e2 = followNotificationType;
        this.f2 = basicUser;
        this.g2 = clubWithAdmin;
        this.h2 = list6;
        this.i2 = str9;
        this.j2 = z3;
        this.k2 = d3;
        this.l2 = d4;
        this.m2 = bool;
        this.n2 = bool2;
        this.o2 = bool3;
        this.p2 = bool4;
        this.q2 = list3;
        this.r2 = list4;
        this.s2 = bool5;
        this.t2 = i5;
        this.u2 = str6;
        this.v2 = str7;
        this.w2 = str8;
    }
}
