package com.clubhouse.android.data.models.local.channel;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ChannelInRoom.kt */
public final class BaseChannelInRoom implements ChannelInRoom, Parcelable {
    public static final Parcelable.Creator<BaseChannelInRoom> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final boolean Y1;
    public final HandraisePermission Z1;
    public final ClipsPermission a2;
    public final boolean b2;
    public final List<UserInChannel> c;
    public final int c2;
    public final boolean d;
    public final String d2;
    public final String e2;
    public final boolean f2;
    public final boolean g2;
    public final BasicUser h2;
    public final BasicUser i2;
    public final ClubWithAdmin j2;
    public final String k2;
    public final int l2;
    public final Boolean m2;
    public final String n2;
    public final String o2;
    public final String p2;
    public final boolean q;
    public final String q2;
    public final boolean x;
    public final boolean y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/BaseChannelInRoom$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/BaseChannelInRoom;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChannelInRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<BaseChannelInRoom> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChannelInRoom.kt */
    public static final class a implements v<BaseChannelInRoom> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.BaseChannelInRoom", aVar, 24);
            pluginGeneratedSerialDescriptor.i("users", true);
            pluginGeneratedSerialDescriptor.i("is_club_member", true);
            pluginGeneratedSerialDescriptor.i("is_club_admin", true);
            pluginGeneratedSerialDescriptor.i("is_club_leader", true);
            pluginGeneratedSerialDescriptor.i("is_club_pending_accept", true);
            pluginGeneratedSerialDescriptor.i("is_handraise_enabled", true);
            pluginGeneratedSerialDescriptor.i("handraise_permission", true);
            pluginGeneratedSerialDescriptor.i("clips_permission", true);
            pluginGeneratedSerialDescriptor.i("should_leave", true);
            pluginGeneratedSerialDescriptor.i("creator_user_profile_id", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("topic", true);
            pluginGeneratedSerialDescriptor.i("is_private", true);
            pluginGeneratedSerialDescriptor.i("is_social_mode", true);
            pluginGeneratedSerialDescriptor.i("welcome_for_user_profile", true);
            pluginGeneratedSerialDescriptor.i("club_added_by_user_profile", true);
            pluginGeneratedSerialDescriptor.i("club", true);
            pluginGeneratedSerialDescriptor.i("url", true);
            pluginGeneratedSerialDescriptor.i("channel_id", true);
            pluginGeneratedSerialDescriptor.i("is_empty", true);
            pluginGeneratedSerialDescriptor.i("empty_state_title", true);
            pluginGeneratedSerialDescriptor.i("empty_state_message", true);
            pluginGeneratedSerialDescriptor.i("empty_state_cta_title", true);
            pluginGeneratedSerialDescriptor.i("empty_state_cta_target", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            BasicUser.a aVar = BasicUser.a.a;
            return new KSerializer[]{new n0.c.k.e(UserInChannel.a.a), hVar, hVar, hVar, hVar, hVar, i0.e.b.b3.a.b.c.e.a, i0.e.b.b3.a.b.c.b.a, hVar, e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, hVar, m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), m0.r.t.a.r.m.a1.a.R1(g1Var), e0Var, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0154, code lost:
            r10 = r10;
            r15 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0163, code lost:
            r6 = r5 | r6;
            r14 = r14;
            r8 = r8;
            r15 = r15;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x01b3, code lost:
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x01c9, code lost:
            r6 = r6 | r2;
            r8 = r8;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x024b, code lost:
            r14 = r14;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x025e, code lost:
            r2 = r55;
            r15 = r15;
            r10 = r10;
            r14 = r14;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0260, code lost:
            r7 = r48;
            r5 = r49;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x027c, code lost:
            r3 = r32;
            r7 = r48;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x02ae, code lost:
            r25 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x02f8, code lost:
            r2 = r55;
            r4 = r25;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x011d, code lost:
            r15 = r15;
            r14 = r14;
            r10 = r10;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x011d, code lost:
            r15 = r15;
            r14 = r14;
            r10 = r10;
            r8 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x011d, code lost:
            r15 = r15;
            r14 = r14;
            r10 = r10;
            r8 = r8;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r55) {
            /*
                r54 = this;
                r0 = r55
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r12 = 3
                r13 = 5
                r14 = 6
                r15 = 7
                r3 = 9
                r4 = 10
                r6 = 0
                r5 = 0
                r7 = 1
                r8 = 2
                r9 = 4
                r10 = 8
                if (r2 == 0) goto L_0x00f0
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r11 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                r2.<init>(r11)
                java.lang.Object r2 = r0.m(r1, r6, r2, r5)
                boolean r6 = r0.s(r1, r7)
                boolean r7 = r0.s(r1, r8)
                boolean r8 = r0.s(r1, r12)
                boolean r9 = r0.s(r1, r9)
                boolean r11 = r0.s(r1, r13)
                i0.e.b.b3.a.b.c.e r12 = i0.e.b.b3.a.b.c.e.a
                java.lang.Object r12 = r0.m(r1, r14, r12, r5)
                i0.e.b.b3.a.b.c.b r13 = i0.e.b.b3.a.b.c.b.a
                java.lang.Object r13 = r0.m(r1, r15, r13, r5)
                boolean r10 = r0.s(r1, r10)
                int r3 = r0.k(r1, r3)
                java.lang.String r4 = r0.t(r1, r4)
                n0.c.k.g1 r14 = n0.c.k.g1.b
                r15 = 11
                java.lang.Object r15 = r0.v(r1, r15, r14, r5)
                r5 = 12
                boolean r5 = r0.s(r1, r5)
                r23 = r2
                r2 = 13
                boolean r2 = r0.s(r1, r2)
                r22 = r2
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r24 = r3
                r21 = r6
                r3 = 14
                r6 = 0
                java.lang.Object r3 = r0.v(r1, r3, r2, r6)
                r25 = r3
                r3 = 15
                java.lang.Object r2 = r0.v(r1, r3, r2, r6)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r3 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r20 = r2
                r2 = 16
                java.lang.Object r2 = r0.v(r1, r2, r3, r6)
                r3 = 17
                java.lang.Object r3 = r0.v(r1, r3, r14, r6)
                r6 = 18
                int r6 = r0.k(r1, r6)
                r17 = r2
                n0.c.k.h r2 = n0.c.k.h.b
                r18 = r3
                r16 = r7
                r3 = 19
                r7 = 0
                java.lang.Object r2 = r0.v(r1, r3, r2, r7)
                r3 = 20
                java.lang.Object r3 = r0.v(r1, r3, r14, r7)
                r55 = r2
                r2 = 21
                java.lang.Object r2 = r0.v(r1, r2, r14, r7)
                r19 = r2
                r2 = 22
                java.lang.Object r2 = r0.v(r1, r2, r14, r7)
                r26 = r2
                r2 = 23
                java.lang.Object r2 = r0.v(r1, r2, r14, r7)
                r7 = 16777215(0xffffff, float:2.3509886E-38)
                r14 = r55
                r39 = r4
                r41 = r5
                r47 = r6
                r28 = r7
                r4 = r8
                r33 = r9
                r37 = r10
                r34 = r11
                r8 = r15
                r31 = r16
                r32 = r18
                r30 = r21
                r42 = r22
                r38 = r24
                r15 = r2
                r10 = r3
                r2 = r23
                r3 = r25
                goto L_0x032b
            L_0x00f0:
                r2 = r6
                r53 = r7
                r7 = r5
                r5 = r53
                r38 = r6
                r39 = r38
                r40 = r39
                r41 = r40
                r42 = r41
                r43 = r42
                r44 = r43
                r45 = r44
                r46 = r45
                r47 = r5
                r3 = r7
                r4 = r3
                r5 = r4
                r8 = r5
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r27 = r15
                r37 = r27
                r2 = r37
                r7 = r46
            L_0x011d:
                if (r47 == 0) goto L_0x02fe
                r48 = r7
                int r7 = r0.x(r1)
                switch(r7) {
                    case -1: goto L_0x02eb;
                    case 0: goto L_0x02d0;
                    case 1: goto L_0x02c1;
                    case 2: goto L_0x02b2;
                    case 3: goto L_0x02a0;
                    case 4: goto L_0x0291;
                    case 5: goto L_0x0282;
                    case 6: goto L_0x0266;
                    case 7: goto L_0x024d;
                    case 8: goto L_0x023b;
                    case 9: goto L_0x0228;
                    case 10: goto L_0x0217;
                    case 11: goto L_0x0204;
                    case 12: goto L_0x01f3;
                    case 13: goto L_0x01e0;
                    case 14: goto L_0x01cc;
                    case 15: goto L_0x01b6;
                    case 16: goto L_0x01a1;
                    case 17: goto L_0x018e;
                    case 18: goto L_0x017a;
                    case 19: goto L_0x0168;
                    case 20: goto L_0x0157;
                    case 21: goto L_0x0148;
                    case 22: goto L_0x013b;
                    case 23: goto L_0x012e;
                    default: goto L_0x0128;
                }
            L_0x0128:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r7)
                throw r0
            L_0x012e:
                r7 = 23
                r49 = r5
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r15 = r0.v(r1, r7, r5, r15)
                r5 = 8388608(0x800000, float:1.17549435E-38)
                goto L_0x0154
            L_0x013b:
                r49 = r5
                r5 = 22
                n0.c.k.g1 r7 = n0.c.k.g1.b
                java.lang.Object r2 = r0.v(r1, r5, r7, r2)
                r5 = 4194304(0x400000, float:5.877472E-39)
                goto L_0x0154
            L_0x0148:
                r49 = r5
                r5 = 21
                n0.c.k.g1 r7 = n0.c.k.g1.b
                java.lang.Object r12 = r0.v(r1, r5, r7, r12)
                r5 = 2097152(0x200000, float:2.938736E-39)
            L_0x0154:
                r7 = 20
                goto L_0x0163
            L_0x0157:
                r49 = r5
                n0.c.k.g1 r5 = n0.c.k.g1.b
                r7 = 20
                java.lang.Object r10 = r0.v(r1, r7, r5, r10)
                r5 = 1048576(0x100000, float:1.469368E-39)
            L_0x0163:
                r5 = r5 | r6
                r6 = r5
                r5 = 7
                goto L_0x0260
            L_0x0168:
                r49 = r5
                r7 = 20
                n0.c.k.h r5 = n0.c.k.h.b
                r55 = r2
                r2 = 19
                java.lang.Object r14 = r0.v(r1, r2, r5, r14)
                r5 = 524288(0x80000, float:7.34684E-40)
                r2 = r5
                goto L_0x01b3
            L_0x017a:
                r55 = r2
                r49 = r5
                r2 = 19
                r5 = 18
                r7 = 20
                int r40 = r0.k(r1, r5)
                r16 = 262144(0x40000, float:3.67342E-40)
                r6 = r6 | r16
                goto L_0x024b
            L_0x018e:
                r55 = r2
                r49 = r5
                r5 = 18
                r7 = 20
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r5 = 17
                java.lang.Object r3 = r0.v(r1, r5, r2, r3)
                r2 = 131072(0x20000, float:1.83671E-40)
                goto L_0x01b3
            L_0x01a1:
                r55 = r2
                r49 = r5
                r5 = 17
                r7 = 20
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r5 = 16
                java.lang.Object r4 = r0.v(r1, r5, r2, r4)
                r2 = 65536(0x10000, float:9.18355E-41)
            L_0x01b3:
                r5 = 15
                goto L_0x01c9
            L_0x01b6:
                r55 = r2
                r49 = r5
                r5 = 16
                r7 = 20
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r5 = 15
                java.lang.Object r11 = r0.v(r1, r5, r2, r11)
                r2 = 32768(0x8000, float:4.5918E-41)
            L_0x01c9:
                r6 = r6 | r2
                goto L_0x024b
            L_0x01cc:
                r55 = r2
                r49 = r5
                r5 = 15
                r7 = 20
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r5 = 14
                java.lang.Object r9 = r0.v(r1, r5, r2, r9)
                r6 = r6 | 16384(0x4000, float:2.2959E-41)
                goto L_0x024b
            L_0x01e0:
                r55 = r2
                r49 = r5
                r2 = 13
                r5 = 14
                r7 = 20
                boolean r21 = r0.s(r1, r2)
                r6 = r6 | 8192(0x2000, float:1.14794E-41)
                r41 = r21
                goto L_0x024b
            L_0x01f3:
                r55 = r2
                r49 = r5
                r2 = 12
                r5 = 14
                r7 = 20
                boolean r38 = r0.s(r1, r2)
                r6 = r6 | 4096(0x1000, float:5.74E-42)
                goto L_0x024b
            L_0x0204:
                r55 = r2
                r49 = r5
                r5 = 14
                r7 = 20
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r5 = 11
                java.lang.Object r8 = r0.v(r1, r5, r2, r8)
                r6 = r6 | 2048(0x800, float:2.87E-42)
                goto L_0x024b
            L_0x0217:
                r55 = r2
                r49 = r5
                r2 = 10
                r5 = 11
                r7 = 20
                java.lang.String r37 = r0.t(r1, r2)
                r6 = r6 | 1024(0x400, float:1.435E-42)
                goto L_0x024b
            L_0x0228:
                r55 = r2
                r49 = r5
                r2 = 9
                r5 = 11
                r7 = 20
                int r24 = r0.k(r1, r2)
                r6 = r6 | 512(0x200, float:7.175E-43)
                r48 = r24
                goto L_0x024b
            L_0x023b:
                r55 = r2
                r49 = r5
                r2 = 8
                r5 = 11
                r7 = 20
                boolean r45 = r0.s(r1, r2)
                r6 = r6 | 256(0x100, float:3.59E-43)
            L_0x024b:
                r5 = 7
                goto L_0x025e
            L_0x024d:
                r55 = r2
                r49 = r5
                r5 = 11
                r7 = 20
                i0.e.b.b3.a.b.c.b r2 = i0.e.b.b3.a.b.c.b.a
                r5 = 7
                java.lang.Object r13 = r0.m(r1, r5, r2, r13)
                r6 = r6 | 128(0x80, float:1.794E-43)
            L_0x025e:
                r2 = r55
            L_0x0260:
                r7 = r48
                r5 = r49
                goto L_0x011d
            L_0x0266:
                r55 = r2
                r49 = r5
                r5 = 7
                r7 = 20
                i0.e.b.b3.a.b.c.e r2 = i0.e.b.b3.a.b.c.e.a
                r32 = r3
                r5 = r49
                r3 = 6
                java.lang.Object r5 = r0.m(r1, r3, r2, r5)
                r6 = r6 | 64
                r2 = r55
            L_0x027c:
                r3 = r32
                r7 = r48
                goto L_0x011d
            L_0x0282:
                r55 = r2
                r32 = r3
                r2 = 5
                r3 = 6
                r7 = 20
                boolean r46 = r0.s(r1, r2)
                r6 = r6 | 32
                goto L_0x02ae
            L_0x0291:
                r55 = r2
                r32 = r3
                r2 = 4
                r3 = 6
                r7 = 20
                boolean r44 = r0.s(r1, r2)
                r6 = r6 | 16
                goto L_0x02ae
            L_0x02a0:
                r55 = r2
                r32 = r3
                r2 = 3
                r3 = 6
                r7 = 20
                boolean r43 = r0.s(r1, r2)
                r6 = r6 | 8
            L_0x02ae:
                r25 = r4
                r4 = 0
                goto L_0x02f8
            L_0x02b2:
                r55 = r2
                r32 = r3
                r2 = 2
                r3 = 6
                r7 = 20
                boolean r42 = r0.s(r1, r2)
                r6 = r6 | 4
                goto L_0x02ae
            L_0x02c1:
                r55 = r2
                r32 = r3
                r2 = 1
                r3 = 6
                r7 = 20
                boolean r39 = r0.s(r1, r2)
                r6 = r6 | 2
                goto L_0x02ae
            L_0x02d0:
                r55 = r2
                r32 = r3
                r3 = 6
                r7 = 20
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r3 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                r2.<init>(r3)
                r25 = r4
                r3 = r27
                r4 = 0
                java.lang.Object r27 = r0.m(r1, r4, r2, r3)
                r2 = r6 | 1
                r6 = r2
                goto L_0x02f8
            L_0x02eb:
                r55 = r2
                r32 = r3
                r25 = r4
                r3 = r27
                r4 = 0
                r7 = 20
                r47 = r4
            L_0x02f8:
                r2 = r55
                r4 = r25
                goto L_0x027c
            L_0x02fe:
                r55 = r2
                r32 = r3
                r25 = r4
                r48 = r7
                r3 = r27
                r26 = r55
                r2 = r3
                r28 = r6
                r3 = r9
                r20 = r11
                r19 = r12
                r17 = r25
                r30 = r39
                r47 = r40
                r31 = r42
                r4 = r43
                r33 = r44
                r34 = r46
                r12 = r5
                r39 = r37
                r42 = r41
                r37 = r45
                r41 = r38
                r38 = r48
            L_0x032b:
                r0.b(r1)
                com.clubhouse.android.data.models.local.channel.BaseChannelInRoom r0 = new com.clubhouse.android.data.models.local.channel.BaseChannelInRoom
                r27 = r0
                r29 = r2
                java.util.List r29 = (java.util.List) r29
                r35 = r12
                com.clubhouse.android.data.models.local.channel.HandraisePermission r35 = (com.clubhouse.android.data.models.local.channel.HandraisePermission) r35
                r36 = r13
                com.clubhouse.android.data.models.local.channel.ClipsPermission r36 = (com.clubhouse.android.data.models.local.channel.ClipsPermission) r36
                r40 = r8
                java.lang.String r40 = (java.lang.String) r40
                r43 = r3
                com.clubhouse.android.data.models.local.user.BasicUser r43 = (com.clubhouse.android.data.models.local.user.BasicUser) r43
                r44 = r20
                com.clubhouse.android.data.models.local.user.BasicUser r44 = (com.clubhouse.android.data.models.local.user.BasicUser) r44
                r45 = r17
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r45 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r45
                r46 = r32
                java.lang.String r46 = (java.lang.String) r46
                r48 = r14
                java.lang.Boolean r48 = (java.lang.Boolean) r48
                r49 = r10
                java.lang.String r49 = (java.lang.String) r49
                r50 = r19
                java.lang.String r50 = (java.lang.String) r50
                r51 = r26
                java.lang.String r51 = (java.lang.String) r51
                r52 = r15
                java.lang.String r52 = (java.lang.String) r52
                r32 = r4
                r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.BaseChannelInRoom.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            BaseChannelInRoom baseChannelInRoom = (BaseChannelInRoom) obj;
            i.e(encoder, "encoder");
            i.e(baseChannelInRoom, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(baseChannelInRoom, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || !i.a(baseChannelInRoom.c, EmptyList.c)) {
                c.z(serialDescriptor, 0, new n0.c.k.e(UserInChannel.a.a), baseChannelInRoom.c);
            }
            if (c.v(serialDescriptor, 1) || baseChannelInRoom.d) {
                c.r(serialDescriptor, 1, baseChannelInRoom.d);
            }
            if (c.v(serialDescriptor, 2) || baseChannelInRoom.q) {
                c.r(serialDescriptor, 2, baseChannelInRoom.q);
            }
            if (c.v(serialDescriptor, 3) || baseChannelInRoom.x) {
                c.r(serialDescriptor, 3, baseChannelInRoom.x);
            }
            if (c.v(serialDescriptor, 4) || baseChannelInRoom.y) {
                c.r(serialDescriptor, 4, baseChannelInRoom.y);
            }
            if (c.v(serialDescriptor, 5) || baseChannelInRoom.Y1) {
                c.r(serialDescriptor, 5, baseChannelInRoom.Y1);
            }
            if (c.v(serialDescriptor, 6) || baseChannelInRoom.Z1 != HandraisePermission.ALL) {
                c.z(serialDescriptor, 6, i0.e.b.b3.a.b.c.e.a, baseChannelInRoom.Z1);
            }
            if (c.v(serialDescriptor, 7) || baseChannelInRoom.a2 != ClipsPermission.NOT_ALLOWED) {
                c.z(serialDescriptor, 7, i0.e.b.b3.a.b.c.b.a, baseChannelInRoom.a2);
            }
            if (c.v(serialDescriptor, 8) || baseChannelInRoom.b2) {
                c.r(serialDescriptor, 8, baseChannelInRoom.b2);
            }
            if (c.v(serialDescriptor, 9) || baseChannelInRoom.c2 != 0) {
                c.q(serialDescriptor, 9, baseChannelInRoom.c2);
            }
            if (c.v(serialDescriptor, 10) || !i.a(baseChannelInRoom.d2, "")) {
                c.s(serialDescriptor, 10, baseChannelInRoom.d2);
            }
            if (c.v(serialDescriptor, 11) || baseChannelInRoom.e2 != null) {
                c.l(serialDescriptor, 11, g1.b, baseChannelInRoom.e2);
            }
            if (c.v(serialDescriptor, 12) || baseChannelInRoom.f2) {
                c.r(serialDescriptor, 12, baseChannelInRoom.f2);
            }
            if (c.v(serialDescriptor, 13) || baseChannelInRoom.g2) {
                c.r(serialDescriptor, 13, baseChannelInRoom.g2);
            }
            if (c.v(serialDescriptor, 14) || baseChannelInRoom.h2 != null) {
                c.l(serialDescriptor, 14, BasicUser.a.a, baseChannelInRoom.h2);
            }
            if (c.v(serialDescriptor, 15) || baseChannelInRoom.i2 != null) {
                c.l(serialDescriptor, 15, BasicUser.a.a, baseChannelInRoom.i2);
            }
            if (c.v(serialDescriptor, 16) || baseChannelInRoom.j2 != null) {
                c.l(serialDescriptor, 16, ClubWithAdmin.a.a, baseChannelInRoom.j2);
            }
            if (c.v(serialDescriptor, 17) || baseChannelInRoom.k2 != null) {
                c.l(serialDescriptor, 17, g1.b, baseChannelInRoom.k2);
            }
            if (c.v(serialDescriptor, 18) || baseChannelInRoom.l2 != 0) {
                c.q(serialDescriptor, 18, baseChannelInRoom.l2);
            }
            if (c.v(serialDescriptor, 19) || baseChannelInRoom.m2 != null) {
                c.l(serialDescriptor, 19, h.b, baseChannelInRoom.m2);
            }
            if (c.v(serialDescriptor, 20) || baseChannelInRoom.n2 != null) {
                c.l(serialDescriptor, 20, g1.b, baseChannelInRoom.n2);
            }
            if (c.v(serialDescriptor, 21) || baseChannelInRoom.o2 != null) {
                c.l(serialDescriptor, 21, g1.b, baseChannelInRoom.o2);
            }
            if (c.v(serialDescriptor, 22) || baseChannelInRoom.p2 != null) {
                c.l(serialDescriptor, 22, g1.b, baseChannelInRoom.p2);
            }
            if (c.v(serialDescriptor, 23) || baseChannelInRoom.q2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 23, g1.b, baseChannelInRoom.q2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ChannelInRoom.kt */
    public static final class b implements Parcelable.Creator<BaseChannelInRoom> {
        public Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i = i0.d.a.a.a.n(UserInChannel.CREATOR, parcel2, arrayList, i, 1)) {
            }
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            HandraisePermission valueOf = HandraisePermission.valueOf(parcel.readString());
            ClipsPermission valueOf2 = ClipsPermission.valueOf(parcel.readString());
            boolean z6 = parcel.readInt() != 0;
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            BasicUser createFromParcel = parcel.readInt() == 0 ? null : BasicUser.CREATOR.createFromParcel(parcel2);
            BasicUser createFromParcel2 = parcel.readInt() == 0 ? null : BasicUser.CREATOR.createFromParcel(parcel2);
            ClubWithAdmin createFromParcel3 = parcel.readInt() == 0 ? null : ClubWithAdmin.CREATOR.createFromParcel(parcel2);
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BaseChannelInRoom(arrayList, z, z2, z3, z4, z5, valueOf, valueOf2, z6, readInt2, readString, readString2, z7, z8, createFromParcel, createFromParcel2, createFromParcel3, readString3, readInt3, bool, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new BaseChannelInRoom[i];
        }
    }

    public BaseChannelInRoom(int i, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, HandraisePermission handraisePermission, ClipsPermission clipsPermission, boolean z6, int i3, String str, String str2, boolean z7, boolean z8, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i4, Boolean bool, String str4, String str5, String str6, String str7) {
        int i5 = i;
        if ((i5 & 0) == 0) {
            this.c = (i5 & 1) == 0 ? EmptyList.c : list;
            if ((i5 & 2) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i5 & 4) == 0) {
                this.q = false;
            } else {
                this.q = z2;
            }
            if ((i5 & 8) == 0) {
                this.x = false;
            } else {
                this.x = z3;
            }
            if ((i5 & 16) == 0) {
                this.y = false;
            } else {
                this.y = z4;
            }
            if ((i5 & 32) == 0) {
                this.Y1 = false;
            } else {
                this.Y1 = z5;
            }
            this.Z1 = (i5 & 64) == 0 ? HandraisePermission.ALL : handraisePermission;
            this.a2 = (i5 & 128) == 0 ? ClipsPermission.NOT_ALLOWED : clipsPermission;
            if ((i5 & 256) == 0) {
                this.b2 = false;
            } else {
                this.b2 = z6;
            }
            if ((i5 & 512) == 0) {
                this.c2 = 0;
            } else {
                this.c2 = i3;
            }
            this.d2 = (i5 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0 ? "" : str;
            if ((i5 & 2048) == 0) {
                this.e2 = null;
            } else {
                this.e2 = str2;
            }
            if ((i5 & 4096) == 0) {
                this.f2 = false;
            } else {
                this.f2 = z7;
            }
            if ((i5 & 8192) == 0) {
                this.g2 = false;
            } else {
                this.g2 = z8;
            }
            if ((i5 & 16384) == 0) {
                this.h2 = null;
            } else {
                this.h2 = basicUser;
            }
            if ((32768 & i5) == 0) {
                this.i2 = null;
            } else {
                this.i2 = basicUser2;
            }
            if ((65536 & i5) == 0) {
                this.j2 = null;
            } else {
                this.j2 = clubWithAdmin;
            }
            if ((131072 & i5) == 0) {
                this.k2 = null;
            } else {
                this.k2 = str3;
            }
            if ((262144 & i5) == 0) {
                this.l2 = 0;
            } else {
                this.l2 = i4;
            }
            if ((524288 & i5) == 0) {
                this.m2 = null;
            } else {
                this.m2 = bool;
            }
            if ((1048576 & i5) == 0) {
                this.n2 = null;
            } else {
                this.n2 = str4;
            }
            if ((2097152 & i5) == 0) {
                this.o2 = null;
            } else {
                this.o2 = str5;
            }
            if ((4194304 & i5) == 0) {
                this.p2 = null;
            } else {
                this.p2 = str6;
            }
            if ((i5 & 8388608) == 0) {
                this.q2 = null;
            } else {
                this.q2 = str7;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public static BaseChannelInRoom a(BaseChannelInRoom baseChannelInRoom, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, HandraisePermission handraisePermission, ClipsPermission clipsPermission, boolean z6, int i, String str, String str2, boolean z7, boolean z8, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i3, Boolean bool, String str4, String str5, String str6, String str7, int i4) {
        BasicUser basicUser3;
        BasicUser basicUser4;
        BasicUser basicUser5;
        ClubWithAdmin clubWithAdmin2;
        ClubWithAdmin clubWithAdmin3;
        String str8;
        String str9;
        int i5;
        int i6;
        Boolean bool2;
        Boolean bool3;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        BaseChannelInRoom baseChannelInRoom2 = baseChannelInRoom;
        int i7 = i4;
        List<UserInChannel> list2 = (i7 & 1) != 0 ? baseChannelInRoom2.c : null;
        boolean z9 = (i7 & 2) != 0 ? baseChannelInRoom2.d : z;
        boolean z10 = (i7 & 4) != 0 ? baseChannelInRoom2.q : z2;
        boolean z11 = (i7 & 8) != 0 ? baseChannelInRoom2.x : z3;
        boolean z12 = (i7 & 16) != 0 ? baseChannelInRoom2.y : z4;
        boolean z13 = (i7 & 32) != 0 ? baseChannelInRoom2.Y1 : z5;
        HandraisePermission handraisePermission2 = (i7 & 64) != 0 ? baseChannelInRoom2.Z1 : null;
        ClipsPermission clipsPermission2 = (i7 & 128) != 0 ? baseChannelInRoom2.a2 : null;
        boolean z14 = (i7 & 256) != 0 ? baseChannelInRoom2.b2 : z6;
        int i8 = (i7 & 512) != 0 ? baseChannelInRoom2.c2 : i;
        String str15 = (i7 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? baseChannelInRoom2.d2 : null;
        String str16 = (i7 & 2048) != 0 ? baseChannelInRoom2.e2 : null;
        boolean z15 = (i7 & 4096) != 0 ? baseChannelInRoom2.f2 : z7;
        boolean z16 = (i7 & 8192) != 0 ? baseChannelInRoom2.g2 : z8;
        BasicUser basicUser6 = (i7 & 16384) != 0 ? baseChannelInRoom2.h2 : null;
        if ((i7 & 32768) != 0) {
            basicUser3 = basicUser6;
            basicUser4 = baseChannelInRoom2.i2;
        } else {
            basicUser3 = basicUser6;
            basicUser4 = null;
        }
        if ((i7 & 65536) != 0) {
            basicUser5 = basicUser4;
            clubWithAdmin2 = baseChannelInRoom2.j2;
        } else {
            basicUser5 = basicUser4;
            clubWithAdmin2 = null;
        }
        if ((i7 & 131072) != 0) {
            clubWithAdmin3 = clubWithAdmin2;
            str8 = baseChannelInRoom2.k2;
        } else {
            clubWithAdmin3 = clubWithAdmin2;
            str8 = null;
        }
        if ((i7 & 262144) != 0) {
            str9 = str8;
            i5 = baseChannelInRoom2.l2;
        } else {
            str9 = str8;
            i5 = i3;
        }
        if ((i7 & 524288) != 0) {
            i6 = i5;
            bool2 = baseChannelInRoom2.m2;
        } else {
            i6 = i5;
            bool2 = null;
        }
        if ((i7 & 1048576) != 0) {
            bool3 = bool2;
            str10 = baseChannelInRoom2.n2;
        } else {
            bool3 = bool2;
            str10 = null;
        }
        if ((i7 & 2097152) != 0) {
            str11 = str10;
            str12 = baseChannelInRoom2.o2;
        } else {
            str11 = str10;
            str12 = null;
        }
        if ((i7 & 4194304) != 0) {
            str13 = str12;
            str14 = baseChannelInRoom2.p2;
        } else {
            str13 = str12;
            str14 = null;
        }
        String str17 = (i7 & 8388608) != 0 ? baseChannelInRoom2.q2 : null;
        i.e(list2, "users");
        i.e(handraisePermission2, "handraisePermission");
        i.e(clipsPermission2, "clipsPermission");
        i.e(str15, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        return new BaseChannelInRoom(list2, z9, z10, z11, z12, z13, handraisePermission2, clipsPermission2, z14, i8, str15, str16, z15, z16, basicUser3, basicUser5, clubWithAdmin3, str9, i6, bool3, str11, str13, str14, str17);
    }

    public boolean A0() {
        return this.d;
    }

    public ChannelInRoom C0(boolean z) {
        return a(this, (List) null, false, false, false, z, false, (HandraisePermission) null, (ClipsPermission) null, false, 0, (String) null, (String) null, false, false, (BasicUser) null, (BasicUser) null, (ClubWithAdmin) null, (String) null, 0, (Boolean) null, (String) null, (String) null, (String) null, (String) null, 16777199);
    }

    public boolean D0() {
        return this.x;
    }

    public boolean E() {
        return this.b2;
    }

    public BasicUser F0() {
        return this.i2;
    }

    public String G() {
        return this.n2;
    }

    public boolean H() {
        return this.q;
    }

    public String Q() {
        return h0.b0.v.j2(this);
    }

    public boolean T() {
        return this.f2;
    }

    public boolean U() {
        return this.g2;
    }

    public String Z() {
        return this.o2;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.d2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseChannelInRoom)) {
            return false;
        }
        BaseChannelInRoom baseChannelInRoom = (BaseChannelInRoom) obj;
        return i.a(this.c, baseChannelInRoom.c) && this.d == baseChannelInRoom.d && this.q == baseChannelInRoom.q && this.x == baseChannelInRoom.x && this.y == baseChannelInRoom.y && this.Y1 == baseChannelInRoom.Y1 && this.Z1 == baseChannelInRoom.Z1 && this.a2 == baseChannelInRoom.a2 && this.b2 == baseChannelInRoom.b2 && this.c2 == baseChannelInRoom.c2 && i.a(this.d2, baseChannelInRoom.d2) && i.a(this.e2, baseChannelInRoom.e2) && this.f2 == baseChannelInRoom.f2 && this.g2 == baseChannelInRoom.g2 && i.a(this.h2, baseChannelInRoom.h2) && i.a(this.i2, baseChannelInRoom.i2) && i.a(this.j2, baseChannelInRoom.j2) && i.a(this.k2, baseChannelInRoom.k2) && this.l2 == baseChannelInRoom.l2 && i.a(this.m2, baseChannelInRoom.m2) && i.a(this.n2, baseChannelInRoom.n2) && i.a(this.o2, baseChannelInRoom.o2) && i.a(this.p2, baseChannelInRoom.p2) && i.a(this.q2, baseChannelInRoom.q2);
    }

    public boolean f() {
        return this.y;
    }

    public String g0() {
        return this.p2;
    }

    public int getId() {
        return this.l2;
    }

    public String getUrl() {
        return this.k2;
    }

    public int hashCode() {
        int i;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int hashCode = this.c.hashCode() * 31;
        boolean z = this.d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i11 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.q;
        if (z3) {
            z3 = true;
        }
        int i12 = (i11 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.x;
        if (z4) {
            z4 = true;
        }
        int i13 = (i12 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.y;
        if (z5) {
            z5 = true;
        }
        int i14 = (i13 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.Y1;
        if (z6) {
            z6 = true;
        }
        int hashCode2 = (this.a2.hashCode() + ((this.Z1.hashCode() + ((i14 + (z6 ? 1 : 0)) * 31)) * 31)) * 31;
        boolean z7 = this.b2;
        if (z7) {
            z7 = true;
        }
        int F = i0.d.a.a.a.F(this.d2, i0.d.a.a.a.M(this.c2, (hashCode2 + (z7 ? 1 : 0)) * 31, 31), 31);
        String str = this.e2;
        int i15 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i16 = (F + i) * 31;
        boolean z8 = this.f2;
        if (z8) {
            z8 = true;
        }
        int i17 = (i16 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.g2;
        if (!z9) {
            z2 = z9;
        }
        int i18 = (i17 + (z2 ? 1 : 0)) * 31;
        BasicUser basicUser = this.h2;
        if (basicUser == null) {
            i3 = 0;
        } else {
            i3 = basicUser.hashCode();
        }
        int i19 = (i18 + i3) * 31;
        BasicUser basicUser2 = this.i2;
        if (basicUser2 == null) {
            i4 = 0;
        } else {
            i4 = basicUser2.hashCode();
        }
        int i20 = (i19 + i4) * 31;
        ClubWithAdmin clubWithAdmin = this.j2;
        if (clubWithAdmin == null) {
            i5 = 0;
        } else {
            i5 = clubWithAdmin.hashCode();
        }
        int i21 = (i20 + i5) * 31;
        String str2 = this.k2;
        if (str2 == null) {
            i6 = 0;
        } else {
            i6 = str2.hashCode();
        }
        int M = i0.d.a.a.a.M(this.l2, (i21 + i6) * 31, 31);
        Boolean bool = this.m2;
        if (bool == null) {
            i7 = 0;
        } else {
            i7 = bool.hashCode();
        }
        int i22 = (M + i7) * 31;
        String str3 = this.n2;
        if (str3 == null) {
            i8 = 0;
        } else {
            i8 = str3.hashCode();
        }
        int i23 = (i22 + i8) * 31;
        String str4 = this.o2;
        if (str4 == null) {
            i9 = 0;
        } else {
            i9 = str4.hashCode();
        }
        int i24 = (i23 + i9) * 31;
        String str5 = this.p2;
        if (str5 == null) {
            i10 = 0;
        } else {
            i10 = str5.hashCode();
        }
        int i25 = (i24 + i10) * 31;
        String str6 = this.q2;
        if (str6 != null) {
            i15 = str6.hashCode();
        }
        return i25 + i15;
    }

    public Club i() {
        return this.j2;
    }

    public Boolean isEmpty() {
        return this.m2;
    }

    public ChannelInRoom n0(boolean z) {
        return a(this, (List) null, z, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, false, 0, (String) null, (String) null, false, false, (BasicUser) null, (BasicUser) null, (ClubWithAdmin) null, (String) null, 0, (Boolean) null, (String) null, (String) null, (String) null, (String) null, 16777213);
    }

    public BasicUser p0() {
        return this.h2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BaseChannelInRoom(users=");
        P0.append(this.c);
        P0.append(", isClubMember=");
        P0.append(this.d);
        P0.append(", isClubAdmin=");
        P0.append(this.q);
        P0.append(", isClubLeader=");
        P0.append(this.x);
        P0.append(", isClubPendingAccept=");
        P0.append(this.y);
        P0.append(", isHandraiseEnabled=");
        P0.append(this.Y1);
        P0.append(", handraisePermission=");
        P0.append(this.Z1);
        P0.append(", clipsPermission=");
        P0.append(this.a2);
        P0.append(", shouldLeave=");
        P0.append(this.b2);
        P0.append(", creatorUserId=");
        P0.append(this.c2);
        P0.append(", channel=");
        P0.append(this.d2);
        P0.append(", topic=");
        P0.append(this.e2);
        P0.append(", isPrivate=");
        P0.append(this.f2);
        P0.append(", isSocialMode=");
        P0.append(this.g2);
        P0.append(", welcomeForUser=");
        P0.append(this.h2);
        P0.append(", clubAddedByUserProfile=");
        P0.append(this.i2);
        P0.append(", club=");
        P0.append(this.j2);
        P0.append(", url=");
        P0.append(this.k2);
        P0.append(", id=");
        P0.append(this.l2);
        P0.append(", isEmpty=");
        P0.append(this.m2);
        P0.append(", emptyStateTitle=");
        P0.append(this.n2);
        P0.append(", emptyStateMessage=");
        P0.append(this.o2);
        P0.append(", emptyStateCTATitle=");
        P0.append(this.p2);
        P0.append(", emptyStateCTATarget=");
        return i0.d.a.a.a.w0(P0, this.q2, ')');
    }

    public String u0() {
        return this.e2;
    }

    public int v() {
        return this.c2;
    }

    public ClipsPermission v0() {
        return this.a2;
    }

    public HandraisePermission w() {
        return this.Z1;
    }

    public String w0() {
        return this.q2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        List<UserInChannel> list = this.c;
        parcel.writeInt(list.size());
        for (UserInChannel writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.Y1 ? 1 : 0);
        parcel.writeString(this.Z1.name());
        parcel.writeString(this.a2.name());
        parcel.writeInt(this.b2 ? 1 : 0);
        parcel.writeInt(this.c2);
        parcel.writeString(this.d2);
        parcel.writeString(this.e2);
        parcel.writeInt(this.f2 ? 1 : 0);
        parcel.writeInt(this.g2 ? 1 : 0);
        BasicUser basicUser = this.h2;
        if (basicUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicUser.writeToParcel(parcel, i);
        }
        BasicUser basicUser2 = this.i2;
        if (basicUser2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicUser2.writeToParcel(parcel, i);
        }
        ClubWithAdmin clubWithAdmin = this.j2;
        if (clubWithAdmin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clubWithAdmin.writeToParcel(parcel, i);
        }
        parcel.writeString(this.k2);
        parcel.writeInt(this.l2);
        Boolean bool = this.m2;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.n2);
        parcel.writeString(this.o2);
        parcel.writeString(this.p2);
        parcel.writeString(this.q2);
    }

    public List<UserInChannel> y() {
        return this.c;
    }

    public boolean z() {
        return this.Y1;
    }

    public BaseChannelInRoom(List<UserInChannel> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, HandraisePermission handraisePermission, ClipsPermission clipsPermission, boolean z6, int i, String str, String str2, boolean z7, boolean z8, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i3, Boolean bool, String str4, String str5, String str6, String str7) {
        String str8 = str;
        i.e(list, "users");
        i.e(handraisePermission, "handraisePermission");
        i.e(clipsPermission, "clipsPermission");
        i.e(str8, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.c = list;
        this.d = z;
        this.q = z2;
        this.x = z3;
        this.y = z4;
        this.Y1 = z5;
        this.Z1 = handraisePermission;
        this.a2 = clipsPermission;
        this.b2 = z6;
        this.c2 = i;
        this.d2 = str8;
        this.e2 = str2;
        this.f2 = z7;
        this.g2 = z8;
        this.h2 = basicUser;
        this.i2 = basicUser2;
        this.j2 = clubWithAdmin;
        this.k2 = str3;
        this.l2 = i3;
        this.m2 = bool;
        this.n2 = str4;
        this.o2 = str5;
        this.p2 = str6;
        this.q2 = str7;
    }

    public BaseChannelInRoom() {
        this(EmptyList.c, false, false, false, false, false, HandraisePermission.ALL, ClipsPermission.NOT_ALLOWED, false, 0, "", (String) null, false, false, (BasicUser) null, (BasicUser) null, (ClubWithAdmin) null, (String) null, 0, (Boolean) null, (String) null, (String) null, (String) null, (String) null);
    }
}
