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
import kotlinx.serialization.MissingFieldException;
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
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ChannelInRoom.kt */
public final class ChannelInRoomWithAccess implements ChannelInRoom, Parcelable {
    public static final Parcelable.Creator<ChannelInRoomWithAccess> CREATOR = new b();
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
    public final String r2;
    public final String s2;
    public final String t2;
    public final int u2;
    public final int v2;
    public final Long w2;
    public final boolean x;
    public final List<String> x2;
    public final boolean y;
    public final boolean y2;
    public final boolean z2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/ChannelInRoomWithAccess$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/ChannelInRoomWithAccess;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChannelInRoom.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChannelInRoomWithAccess> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChannelInRoom.kt */
    public static final class a implements v<ChannelInRoomWithAccess> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess", aVar, 33);
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
            pluginGeneratedSerialDescriptor.i("token", false);
            pluginGeneratedSerialDescriptor.i("pubnub_token", false);
            pluginGeneratedSerialDescriptor.i("pubnub_origin", false);
            pluginGeneratedSerialDescriptor.i("pubnub_heartbeat_interval", false);
            pluginGeneratedSerialDescriptor.i("pubnub_heartbeat_value", false);
            pluginGeneratedSerialDescriptor.i("pubnub_time_token", true);
            pluginGeneratedSerialDescriptor.i("feature_flags", true);
            pluginGeneratedSerialDescriptor.i("pubnub_enable", false);
            pluginGeneratedSerialDescriptor.i("agora_native_mute", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            BasicUser.a aVar = BasicUser.a.a;
            return new KSerializer[]{new n0.c.k.e(UserInChannel.a.a), hVar, hVar, hVar, hVar, hVar, i0.e.b.b3.a.b.c.e.a, i0.e.b.b3.a.b.c.b.a, hVar, e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, hVar, m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), m0.r.t.a.r.m.a1.a.R1(g1Var), e0Var, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), g1Var, g1Var, g1Var, e0Var, e0Var, m0.r.t.a.r.m.a1.a.R1(o0.b), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(g1Var)), hVar, hVar};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x01b2, code lost:
            r21 = r3;
            r56 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x01b6, code lost:
            r35 = r38;
            r36 = r41;
            r14 = r14;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0202, code lost:
            r8 = r2;
            r47 = r9;
            r35 = r38;
            r27 = r39;
            r36 = r41;
            r2 = r43;
            r43 = r4;
            r9 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0279, code lost:
            r8 = r2 | r8;
            r21 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x02a0, code lost:
            r21 = r3;
            r35 = r38;
            r36 = r41;
            r6 = r6;
            r14 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x02e7, code lost:
            r8 = r2 | r8;
            r21 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0305, code lost:
            r35 = r38;
            r36 = r41;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x039c, code lost:
            r36 = r4;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x03bb, code lost:
            r35 = r38;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x03bd, code lost:
            r4 = r43;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0445, code lost:
            r4 = r43;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0463, code lost:
            r43 = r9;
            r14 = r14;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0465, code lost:
            r3 = r21;
            r27 = r39;
            r2 = r43;
            r9 = r56;
            r43 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x04aa, code lost:
            r2 = r9;
            r3 = r21;
            r9 = r56;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x04af, code lost:
            r39 = r27;
            r38 = r35;
            r41 = r36;
            r4 = r43;
            r5 = r54;
            r43 = r2;
            r2 = 32;
            r14 = r14;
            r11 = r11;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x04af, code lost:
            r14 = r14;
            r11 = r11;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x04af, code lost:
            r14 = r14;
            r6 = r6;
            r11 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x04af, code lost:
            r11 = r11;
            r14 = r14;
            r6 = r6;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r86) {
            /*
                r85 = this;
                r0 = r86
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r11 = 3
                r12 = 5
                r13 = 6
                r14 = 7
                r15 = 9
                r3 = 10
                r5 = 0
                r4 = 2
                r6 = 4
                r7 = 8
                r8 = 0
                r9 = 1
                if (r2 == 0) goto L_0x0150
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r10 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                r2.<init>(r10)
                java.lang.Object r2 = r0.m(r1, r5, r2, r8)
                boolean r5 = r0.s(r1, r9)
                boolean r4 = r0.s(r1, r4)
                boolean r10 = r0.s(r1, r11)
                boolean r6 = r0.s(r1, r6)
                boolean r11 = r0.s(r1, r12)
                i0.e.b.b3.a.b.c.e r12 = i0.e.b.b3.a.b.c.e.a
                java.lang.Object r12 = r0.m(r1, r13, r12, r8)
                i0.e.b.b3.a.b.c.b r13 = i0.e.b.b3.a.b.c.b.a
                java.lang.Object r13 = r0.m(r1, r14, r13, r8)
                boolean r7 = r0.s(r1, r7)
                int r14 = r0.k(r1, r15)
                java.lang.String r3 = r0.t(r1, r3)
                n0.c.k.g1 r15 = n0.c.k.g1.b
                r9 = 11
                java.lang.Object r9 = r0.v(r1, r9, r15, r8)
                r8 = 12
                boolean r8 = r0.s(r1, r8)
                r23 = r2
                r2 = 13
                boolean r2 = r0.s(r1, r2)
                r22 = r2
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r24 = r3
                r21 = r4
                r3 = 14
                r4 = 0
                java.lang.Object r3 = r0.v(r1, r3, r2, r4)
                r26 = r3
                r3 = 15
                java.lang.Object r2 = r0.v(r1, r3, r2, r4)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r3 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r20 = r2
                r2 = 16
                java.lang.Object r2 = r0.v(r1, r2, r3, r4)
                r3 = 17
                java.lang.Object r3 = r0.v(r1, r3, r15, r4)
                r4 = 18
                int r4 = r0.k(r1, r4)
                r16 = r2
                n0.c.k.h r2 = n0.c.k.h.b
                r18 = r3
                r86 = r4
                r3 = 19
                r4 = 0
                java.lang.Object r2 = r0.v(r1, r3, r2, r4)
                r3 = 20
                java.lang.Object r3 = r0.v(r1, r3, r15, r4)
                r19 = r2
                r2 = 21
                java.lang.Object r2 = r0.v(r1, r2, r15, r4)
                r27 = r2
                r2 = 22
                java.lang.Object r2 = r0.v(r1, r2, r15, r4)
                r28 = r2
                r2 = 23
                java.lang.Object r2 = r0.v(r1, r2, r15, r4)
                r4 = 24
                java.lang.String r4 = r0.t(r1, r4)
                r29 = r2
                r2 = 25
                java.lang.String r2 = r0.t(r1, r2)
                r30 = r2
                r2 = 26
                java.lang.String r2 = r0.t(r1, r2)
                r31 = r2
                r2 = 27
                int r2 = r0.k(r1, r2)
                r32 = r2
                r2 = 28
                int r2 = r0.k(r1, r2)
                r33 = r2
                r2 = 29
                r34 = r3
                n0.c.k.o0 r3 = n0.c.k.o0.b
                r35 = r5
                r5 = 0
                java.lang.Object r2 = r0.v(r1, r2, r3, r5)
                r3 = 30
                r25 = r2
                n0.c.k.e r2 = new n0.c.k.e
                r2.<init>(r15)
                java.lang.Object r2 = r0.v(r1, r3, r2, r5)
                r3 = 31
                boolean r3 = r0.s(r1, r3)
                r5 = -1
                r15 = 32
                boolean r15 = r0.s(r1, r15)
                r69 = r86
                r82 = r3
                r75 = r4
                r49 = r5
                r55 = r6
                r59 = r7
                r63 = r8
                r6 = r9
                r54 = r10
                r56 = r11
                r60 = r14
                r83 = r15
                r14 = r19
                r53 = r21
                r64 = r22
                r61 = r24
                r47 = r25
                r3 = r26
                r43 = r27
                r9 = r28
                r76 = r30
                r77 = r31
                r78 = r32
                r79 = r33
                r52 = r35
                r50 = 1
                r11 = r2
                r2 = r23
                goto L_0x050a
            L_0x0150:
                r2 = 32
                r84 = r8
                r8 = r5
                r5 = r84
                r3 = r5
                r4 = r3
                r6 = r4
                r7 = r6
                r11 = r7
                r12 = r11
                r13 = r12
                r14 = r13
                r15 = r14
                r38 = r15
                r39 = r38
                r40 = r39
                r41 = r40
                r42 = r41
                r43 = r42
                r44 = r43
                r45 = r44
                r46 = r45
                r47 = r46
                r5 = r8
                r9 = r5
                r10 = r9
                r17 = r10
                r25 = r17
                r26 = r25
                r28 = r26
                r29 = r28
                r30 = r29
                r37 = r30
                r48 = r37
                r49 = r48
                r50 = r49
                r51 = r50
                r53 = r51
                r52 = 1
            L_0x0191:
                if (r52 == 0) goto L_0x04bf
                r54 = r5
                int r5 = r0.x(r1)
                switch(r5) {
                    case -1: goto L_0x0495;
                    case 0: goto L_0x0471;
                    case 1: goto L_0x0449;
                    case 2: goto L_0x042d;
                    case 3: goto L_0x0414;
                    case 4: goto L_0x03fb;
                    case 5: goto L_0x03e2;
                    case 6: goto L_0x03c3;
                    case 7: goto L_0x039f;
                    case 8: goto L_0x0386;
                    case 9: goto L_0x036f;
                    case 10: goto L_0x0358;
                    case 11: goto L_0x033e;
                    case 12: goto L_0x0327;
                    case 13: goto L_0x030b;
                    case 14: goto L_0x02ec;
                    case 15: goto L_0x02d2;
                    case 16: goto L_0x02bd;
                    case 17: goto L_0x02aa;
                    case 18: goto L_0x0290;
                    case 19: goto L_0x027f;
                    case 20: goto L_0x026b;
                    case 21: goto L_0x025c;
                    case 22: goto L_0x024b;
                    case 23: goto L_0x023c;
                    case 24: goto L_0x022f;
                    case 25: goto L_0x0222;
                    case 26: goto L_0x0215;
                    case 27: goto L_0x01f2;
                    case 28: goto L_0x01e4;
                    case 29: goto L_0x01d4;
                    case 30: goto L_0x01c0;
                    case 31: goto L_0x01a9;
                    case 32: goto L_0x01a2;
                    default: goto L_0x019c;
                }
            L_0x019c:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r5)
                throw r0
            L_0x01a2:
                boolean r51 = r0.s(r1, r2)
                r53 = r53 | 1
                goto L_0x01b2
            L_0x01a9:
                r5 = 31
                boolean r17 = r0.s(r1, r5)
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r8 = r8 | r5
            L_0x01b2:
                r21 = r3
                r56 = r9
            L_0x01b6:
                r35 = r38
                r36 = r41
                r2 = 1
                r3 = 6
                r5 = 19
                goto L_0x0465
            L_0x01c0:
                n0.c.k.e r5 = new n0.c.k.e
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r5.<init>(r2)
                r2 = 30
                java.lang.Object r11 = r0.v(r1, r2, r5, r11)
                r2 = 1073741824(0x40000000, float:2.0)
                r2 = r2 | r8
                r5 = r9
                r9 = r47
                goto L_0x0202
            L_0x01d4:
                r2 = 29
                n0.c.k.o0 r5 = n0.c.k.o0.b
                r56 = r9
                r9 = r47
                java.lang.Object r47 = r0.v(r1, r2, r5, r9)
                r2 = 536870912(0x20000000, float:1.0842022E-19)
                goto L_0x0279
            L_0x01e4:
                r56 = r9
                r9 = r47
                r2 = 28
                int r10 = r0.k(r1, r2)
                r2 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x0279
            L_0x01f2:
                r9 = r47
                r2 = 27
                int r2 = r0.k(r1, r2)
                r5 = 134217728(0x8000000, float:3.85186E-34)
                r5 = r5 | r8
                r84 = r5
                r5 = r2
                r2 = r84
            L_0x0202:
                r8 = r2
                r47 = r9
                r35 = r38
                r27 = r39
                r36 = r41
                r2 = r43
                r43 = r4
                r9 = r5
                r4 = 0
                r5 = 19
                goto L_0x04af
            L_0x0215:
                r56 = r9
                r9 = r47
                r2 = 26
                java.lang.String r46 = r0.t(r1, r2)
                r2 = 67108864(0x4000000, float:1.5046328E-36)
                goto L_0x0279
            L_0x0222:
                r56 = r9
                r9 = r47
                r2 = 25
                java.lang.String r45 = r0.t(r1, r2)
                r2 = 33554432(0x2000000, float:9.403955E-38)
                goto L_0x0279
            L_0x022f:
                r56 = r9
                r9 = r47
                r2 = 24
                java.lang.String r44 = r0.t(r1, r2)
                r2 = 16777216(0x1000000, float:2.3509887E-38)
                goto L_0x0279
            L_0x023c:
                r56 = r9
                r9 = r47
                r2 = 23
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r15 = r0.v(r1, r2, r5, r15)
                r2 = 8388608(0x800000, float:1.17549435E-38)
                goto L_0x0279
            L_0x024b:
                r56 = r9
                r9 = r47
                r2 = 22
                n0.c.k.g1 r5 = n0.c.k.g1.b
                r9 = r43
                java.lang.Object r43 = r0.v(r1, r2, r5, r9)
                r2 = 4194304(0x400000, float:5.877472E-39)
                goto L_0x0279
            L_0x025c:
                r56 = r9
                r9 = r43
                r2 = 21
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r4 = r0.v(r1, r2, r5, r4)
                r2 = 2097152(0x200000, float:2.938736E-39)
                goto L_0x0279
            L_0x026b:
                r56 = r9
                r9 = r43
                r2 = 20
                n0.c.k.g1 r5 = n0.c.k.g1.b
                java.lang.Object r13 = r0.v(r1, r2, r5, r13)
                r2 = 1048576(0x100000, float:1.469368E-39)
            L_0x0279:
                r2 = r2 | r8
                r8 = r2
                r21 = r3
                goto L_0x01b6
            L_0x027f:
                r56 = r9
                r9 = r43
                n0.c.k.h r2 = n0.c.k.h.b
                r5 = 19
                java.lang.Object r14 = r0.v(r1, r5, r2, r14)
                r2 = 524288(0x80000, float:7.34684E-40)
                r2 = r2 | r8
                r8 = r2
                goto L_0x02a0
            L_0x0290:
                r56 = r9
                r9 = r43
                r2 = 18
                r5 = 19
                int r25 = r0.k(r1, r2)
                r16 = 262144(0x40000, float:3.67342E-40)
                r8 = r8 | r16
            L_0x02a0:
                r21 = r3
                r35 = r38
                r36 = r41
                r2 = 1
                r3 = 6
                goto L_0x0465
            L_0x02aa:
                r56 = r9
                r9 = r43
                r5 = 19
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r43 = r4
                r4 = 17
                java.lang.Object r12 = r0.v(r1, r4, r2, r12)
                r2 = 131072(0x20000, float:1.83671E-40)
                goto L_0x02e7
            L_0x02bd:
                r56 = r9
                r9 = r43
                r5 = 19
                r43 = r4
                r4 = 17
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r4 = 16
                java.lang.Object r7 = r0.v(r1, r4, r2, r7)
                r2 = 65536(0x10000, float:9.18355E-41)
                goto L_0x02e7
            L_0x02d2:
                r56 = r9
                r9 = r43
                r5 = 19
                r43 = r4
                r4 = 16
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r4 = 15
                java.lang.Object r3 = r0.v(r1, r4, r2, r3)
                r2 = 32768(0x8000, float:4.5918E-41)
            L_0x02e7:
                r2 = r2 | r8
                r8 = r2
                r21 = r3
                goto L_0x0305
            L_0x02ec:
                r56 = r9
                r9 = r43
                r5 = 19
                r43 = r4
                r4 = 15
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r21 = r3
                r4 = r41
                r3 = 14
                java.lang.Object r41 = r0.v(r1, r3, r2, r4)
                r2 = r8 | 16384(0x4000, float:2.2959E-41)
                r8 = r2
            L_0x0305:
                r35 = r38
                r36 = r41
                goto L_0x03bd
            L_0x030b:
                r21 = r3
                r56 = r9
                r9 = r43
                r2 = 13
                r3 = 14
                r5 = 19
                r43 = r4
                r4 = r41
                boolean r22 = r0.s(r1, r2)
                r8 = r8 | 8192(0x2000, float:1.14794E-41)
                r36 = r4
                r54 = r22
                goto L_0x03bb
            L_0x0327:
                r21 = r3
                r56 = r9
                r9 = r43
                r2 = 12
                r3 = 14
                r5 = 19
                r43 = r4
                r4 = r41
                boolean r37 = r0.s(r1, r2)
                r8 = r8 | 4096(0x1000, float:5.74E-42)
                goto L_0x039c
            L_0x033e:
                r21 = r3
                r56 = r9
                r9 = r43
                r3 = 14
                r5 = 19
                r43 = r4
                r4 = r41
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r3 = 11
                java.lang.Object r6 = r0.v(r1, r3, r2, r6)
                r2 = r8 | 2048(0x800, float:2.87E-42)
                r8 = r2
                goto L_0x039c
            L_0x0358:
                r21 = r3
                r56 = r9
                r9 = r43
                r2 = 10
                r3 = 11
                r5 = 19
                r43 = r4
                r4 = r41
                java.lang.String r42 = r0.t(r1, r2)
                r8 = r8 | 1024(0x400, float:1.435E-42)
                goto L_0x039c
            L_0x036f:
                r21 = r3
                r56 = r9
                r9 = r43
                r2 = 9
                r3 = 11
                r5 = 19
                r43 = r4
                r4 = r41
                int r50 = r0.k(r1, r2)
                r8 = r8 | 512(0x200, float:7.175E-43)
                goto L_0x039c
            L_0x0386:
                r21 = r3
                r56 = r9
                r9 = r43
                r2 = 8
                r3 = 11
                r5 = 19
                r43 = r4
                r4 = r41
                boolean r30 = r0.s(r1, r2)
                r8 = r8 | 256(0x100, float:3.59E-43)
            L_0x039c:
                r36 = r4
                goto L_0x03bb
            L_0x039f:
                r21 = r3
                r56 = r9
                r9 = r43
                r3 = 11
                r5 = 19
                r43 = r4
                r4 = r41
                i0.e.b.b3.a.b.c.b r2 = i0.e.b.b3.a.b.c.b.a
                r36 = r4
                r3 = r38
                r4 = 7
                java.lang.Object r38 = r0.m(r1, r4, r2, r3)
                r2 = r8 | 128(0x80, float:1.794E-43)
                r8 = r2
            L_0x03bb:
                r35 = r38
            L_0x03bd:
                r4 = r43
                r2 = 1
                r3 = 6
                goto L_0x0463
            L_0x03c3:
                r21 = r3
                r56 = r9
                r3 = r38
                r36 = r41
                r9 = r43
                r5 = 19
                r43 = r4
                r4 = 7
                i0.e.b.b3.a.b.c.e r2 = i0.e.b.b3.a.b.c.e.a
                r35 = r3
                r4 = r39
                r3 = 6
                java.lang.Object r39 = r0.m(r1, r3, r2, r4)
                r2 = r8 | 64
                r8 = r2
                goto L_0x0445
            L_0x03e2:
                r21 = r3
                r56 = r9
                r35 = r38
                r36 = r41
                r9 = r43
                r2 = 5
                r3 = 6
                r5 = 19
                r43 = r4
                r4 = r39
                boolean r49 = r0.s(r1, r2)
                r8 = r8 | 32
                goto L_0x0445
            L_0x03fb:
                r21 = r3
                r56 = r9
                r35 = r38
                r36 = r41
                r9 = r43
                r2 = 4
                r3 = 6
                r5 = 19
                r43 = r4
                r4 = r39
                boolean r29 = r0.s(r1, r2)
                r8 = r8 | 16
                goto L_0x0445
            L_0x0414:
                r21 = r3
                r56 = r9
                r35 = r38
                r36 = r41
                r9 = r43
                r2 = 3
                r3 = 6
                r5 = 19
                r43 = r4
                r4 = r39
                boolean r48 = r0.s(r1, r2)
                r8 = r8 | 8
                goto L_0x0445
            L_0x042d:
                r21 = r3
                r56 = r9
                r35 = r38
                r36 = r41
                r9 = r43
                r2 = 2
                r3 = 6
                r5 = 19
                r43 = r4
                r4 = r39
                boolean r26 = r0.s(r1, r2)
                r8 = r8 | 4
            L_0x0445:
                r4 = r43
                r2 = 1
                goto L_0x0463
            L_0x0449:
                r21 = r3
                r56 = r9
                r35 = r38
                r36 = r41
                r9 = r43
                r2 = 1
                r3 = 6
                r5 = 19
                r43 = r4
                r4 = r39
                boolean r28 = r0.s(r1, r2)
                r8 = r8 | 2
                r4 = r43
            L_0x0463:
                r43 = r9
            L_0x0465:
                r3 = r21
                r27 = r39
                r2 = r43
                r9 = r56
                r43 = r4
                r4 = 0
                goto L_0x04af
            L_0x0471:
                r21 = r3
                r56 = r9
                r35 = r38
                r36 = r41
                r9 = r43
                r3 = 6
                r5 = 19
                r43 = r4
                r4 = r39
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.channel.UserInChannel$a r3 = com.clubhouse.android.data.models.local.channel.UserInChannel.a.a
                r2.<init>(r3)
                r27 = r4
                r3 = r40
                r4 = 0
                java.lang.Object r40 = r0.m(r1, r4, r2, r3)
                r8 = r8 | 1
                goto L_0x04aa
            L_0x0495:
                r21 = r3
                r56 = r9
                r35 = r38
                r27 = r39
                r3 = r40
                r36 = r41
                r9 = r43
                r5 = 19
                r43 = r4
                r4 = 0
                r52 = r4
            L_0x04aa:
                r2 = r9
                r3 = r21
                r9 = r56
            L_0x04af:
                r39 = r27
                r38 = r35
                r41 = r36
                r4 = r43
                r5 = r54
                r43 = r2
                r2 = 32
                goto L_0x0191
            L_0x04bf:
                r21 = r3
                r54 = r5
                r56 = r9
                r35 = r38
                r27 = r39
                r3 = r40
                r36 = r41
                r9 = r43
                r43 = r4
                r2 = r3
                r16 = r7
                r79 = r10
                r18 = r12
                r34 = r13
                r82 = r17
                r20 = r21
                r69 = r25
                r12 = r27
                r52 = r28
                r55 = r29
                r59 = r30
                r13 = r35
                r3 = r36
                r63 = r37
                r61 = r42
                r75 = r44
                r76 = r45
                r77 = r46
                r60 = r50
                r83 = r51
                r50 = r53
                r64 = r54
                r78 = r56
                r29 = r15
                r53 = r26
                r54 = r48
                r56 = r49
                r49 = r8
            L_0x050a:
                r0.b(r1)
                com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess r0 = new com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess
                r48 = r0
                r51 = r2
                java.util.List r51 = (java.util.List) r51
                r57 = r12
                com.clubhouse.android.data.models.local.channel.HandraisePermission r57 = (com.clubhouse.android.data.models.local.channel.HandraisePermission) r57
                r58 = r13
                com.clubhouse.android.data.models.local.channel.ClipsPermission r58 = (com.clubhouse.android.data.models.local.channel.ClipsPermission) r58
                r62 = r6
                java.lang.String r62 = (java.lang.String) r62
                r65 = r3
                com.clubhouse.android.data.models.local.user.BasicUser r65 = (com.clubhouse.android.data.models.local.user.BasicUser) r65
                r66 = r20
                com.clubhouse.android.data.models.local.user.BasicUser r66 = (com.clubhouse.android.data.models.local.user.BasicUser) r66
                r67 = r16
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r67 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r67
                r68 = r18
                java.lang.String r68 = (java.lang.String) r68
                r70 = r14
                java.lang.Boolean r70 = (java.lang.Boolean) r70
                r71 = r34
                java.lang.String r71 = (java.lang.String) r71
                r72 = r43
                java.lang.String r72 = (java.lang.String) r72
                r73 = r9
                java.lang.String r73 = (java.lang.String) r73
                r74 = r29
                java.lang.String r74 = (java.lang.String) r74
                r80 = r47
                java.lang.Long r80 = (java.lang.Long) r80
                r81 = r11
                java.util.List r81 = (java.util.List) r81
                r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChannelInRoomWithAccess channelInRoomWithAccess = (ChannelInRoomWithAccess) obj;
            i.e(encoder, "encoder");
            i.e(channelInRoomWithAccess, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(channelInRoomWithAccess, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || !i.a(channelInRoomWithAccess.c, EmptyList.c)) {
                c.z(serialDescriptor, 0, new n0.c.k.e(UserInChannel.a.a), channelInRoomWithAccess.c);
            }
            if (c.v(serialDescriptor, 1) || channelInRoomWithAccess.d) {
                c.r(serialDescriptor, 1, channelInRoomWithAccess.d);
            }
            if (c.v(serialDescriptor, 2) || channelInRoomWithAccess.q) {
                c.r(serialDescriptor, 2, channelInRoomWithAccess.q);
            }
            if (c.v(serialDescriptor, 3) || channelInRoomWithAccess.x) {
                c.r(serialDescriptor, 3, channelInRoomWithAccess.x);
            }
            if (c.v(serialDescriptor, 4) || channelInRoomWithAccess.y) {
                c.r(serialDescriptor, 4, channelInRoomWithAccess.y);
            }
            if (c.v(serialDescriptor, 5) || channelInRoomWithAccess.Y1) {
                c.r(serialDescriptor, 5, channelInRoomWithAccess.Y1);
            }
            if (c.v(serialDescriptor, 6) || channelInRoomWithAccess.Z1 != HandraisePermission.ALL) {
                c.z(serialDescriptor, 6, i0.e.b.b3.a.b.c.e.a, channelInRoomWithAccess.Z1);
            }
            if (c.v(serialDescriptor, 7) || channelInRoomWithAccess.a2 != ClipsPermission.NOT_ALLOWED) {
                c.z(serialDescriptor, 7, i0.e.b.b3.a.b.c.b.a, channelInRoomWithAccess.a2);
            }
            if (c.v(serialDescriptor, 8) || channelInRoomWithAccess.b2) {
                c.r(serialDescriptor, 8, channelInRoomWithAccess.b2);
            }
            if (c.v(serialDescriptor, 9) || channelInRoomWithAccess.c2 != 0) {
                c.q(serialDescriptor, 9, channelInRoomWithAccess.c2);
            }
            if (c.v(serialDescriptor, 10) || !i.a(channelInRoomWithAccess.d2, "")) {
                c.s(serialDescriptor, 10, channelInRoomWithAccess.d2);
            }
            if (c.v(serialDescriptor, 11) || channelInRoomWithAccess.e2 != null) {
                c.l(serialDescriptor, 11, g1.b, channelInRoomWithAccess.e2);
            }
            if (c.v(serialDescriptor, 12) || channelInRoomWithAccess.f2) {
                c.r(serialDescriptor, 12, channelInRoomWithAccess.f2);
            }
            if (c.v(serialDescriptor, 13) || channelInRoomWithAccess.g2) {
                c.r(serialDescriptor, 13, channelInRoomWithAccess.g2);
            }
            if (c.v(serialDescriptor, 14) || channelInRoomWithAccess.h2 != null) {
                c.l(serialDescriptor, 14, BasicUser.a.a, channelInRoomWithAccess.h2);
            }
            if (c.v(serialDescriptor, 15) || channelInRoomWithAccess.i2 != null) {
                c.l(serialDescriptor, 15, BasicUser.a.a, channelInRoomWithAccess.i2);
            }
            if (c.v(serialDescriptor, 16) || channelInRoomWithAccess.j2 != null) {
                c.l(serialDescriptor, 16, ClubWithAdmin.a.a, channelInRoomWithAccess.j2);
            }
            if (c.v(serialDescriptor, 17) || channelInRoomWithAccess.k2 != null) {
                c.l(serialDescriptor, 17, g1.b, channelInRoomWithAccess.k2);
            }
            if (c.v(serialDescriptor, 18) || channelInRoomWithAccess.l2 != 0) {
                c.q(serialDescriptor, 18, channelInRoomWithAccess.l2);
            }
            if (c.v(serialDescriptor, 19) || channelInRoomWithAccess.m2 != null) {
                c.l(serialDescriptor, 19, h.b, channelInRoomWithAccess.m2);
            }
            if (c.v(serialDescriptor, 20) || channelInRoomWithAccess.n2 != null) {
                c.l(serialDescriptor, 20, g1.b, channelInRoomWithAccess.n2);
            }
            if (c.v(serialDescriptor, 21) || channelInRoomWithAccess.o2 != null) {
                c.l(serialDescriptor, 21, g1.b, channelInRoomWithAccess.o2);
            }
            if (c.v(serialDescriptor, 22) || channelInRoomWithAccess.p2 != null) {
                c.l(serialDescriptor, 22, g1.b, channelInRoomWithAccess.p2);
            }
            if (c.v(serialDescriptor, 23) || channelInRoomWithAccess.q2 != null) {
                c.l(serialDescriptor, 23, g1.b, channelInRoomWithAccess.q2);
            }
            c.s(serialDescriptor, 24, channelInRoomWithAccess.r2);
            c.s(serialDescriptor, 25, channelInRoomWithAccess.s2);
            c.s(serialDescriptor, 26, channelInRoomWithAccess.t2);
            c.q(serialDescriptor, 27, channelInRoomWithAccess.u2);
            c.q(serialDescriptor, 28, channelInRoomWithAccess.v2);
            if (c.v(serialDescriptor, 29) || channelInRoomWithAccess.w2 != null) {
                c.l(serialDescriptor, 29, o0.b, channelInRoomWithAccess.w2);
            }
            if (c.v(serialDescriptor, 30) || channelInRoomWithAccess.x2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 30, new n0.c.k.e(g1.b), channelInRoomWithAccess.x2);
            }
            c.r(serialDescriptor, 31, channelInRoomWithAccess.y2);
            c.r(serialDescriptor, 32, channelInRoomWithAccess.z2);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ChannelInRoom.kt */
    public static final class b implements Parcelable.Creator<ChannelInRoomWithAccess> {
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
            return new ChannelInRoomWithAccess(arrayList, z, z2, z3, z4, z5, valueOf, valueOf2, z6, readInt2, readString, readString2, z7, z8, createFromParcel, createFromParcel2, createFromParcel3, readString3, readInt3, bool, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        public Object[] newArray(int i) {
            return new ChannelInRoomWithAccess[i];
        }
    }

    public ChannelInRoomWithAccess(int i, int i3, List list, boolean z, boolean z3, boolean z4, boolean z5, boolean z6, HandraisePermission handraisePermission, ClipsPermission clipsPermission, boolean z7, int i4, String str, String str2, boolean z8, boolean z9, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i5, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i6, int i7, Long l, List list2, boolean z10, boolean z11) {
        int i8 = i;
        if ((-1627389952 != (i8 & -1627389952)) || (1 != (i3 & 1))) {
            int[] iArr = {i8, i3};
            int[] iArr2 = {-1627389952, 1};
            a aVar = a.a;
            SerialDescriptor serialDescriptor = a.b;
            i.e(iArr, "seenArray");
            i.e(iArr2, "goldenMaskArray");
            i.e(serialDescriptor, "descriptor");
            ArrayList arrayList = new ArrayList();
            for (int i9 = 0; i9 < 2; i9++) {
                int i10 = iArr2[i9] & (~iArr[i9]);
                if (i10 != 0) {
                    for (int i11 = 0; i11 < 32; i11++) {
                        if ((i10 & 1) != 0) {
                            arrayList.add(serialDescriptor.g((i9 * 32) + i11));
                        }
                        i10 >>>= 1;
                    }
                }
            }
            throw new MissingFieldException(arrayList, serialDescriptor.a());
        }
        this.c = (i8 & 1) == 0 ? EmptyList.c : list;
        if ((i8 & 2) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i8 & 4) == 0) {
            this.q = false;
        } else {
            this.q = z3;
        }
        if ((i8 & 8) == 0) {
            this.x = false;
        } else {
            this.x = z4;
        }
        if ((i8 & 16) == 0) {
            this.y = false;
        } else {
            this.y = z5;
        }
        if ((i8 & 32) == 0) {
            this.Y1 = false;
        } else {
            this.Y1 = z6;
        }
        this.Z1 = (i8 & 64) == 0 ? HandraisePermission.ALL : handraisePermission;
        this.a2 = (i8 & 128) == 0 ? ClipsPermission.NOT_ALLOWED : clipsPermission;
        if ((i8 & 256) == 0) {
            this.b2 = false;
        } else {
            this.b2 = z7;
        }
        if ((i8 & 512) == 0) {
            this.c2 = 0;
        } else {
            this.c2 = i4;
        }
        this.d2 = (i8 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0 ? "" : str;
        if ((i8 & 2048) == 0) {
            this.e2 = null;
        } else {
            this.e2 = str2;
        }
        if ((i8 & 4096) == 0) {
            this.f2 = false;
        } else {
            this.f2 = z8;
        }
        if ((i8 & 8192) == 0) {
            this.g2 = false;
        } else {
            this.g2 = z9;
        }
        if ((i8 & 16384) == 0) {
            this.h2 = null;
        } else {
            this.h2 = basicUser;
        }
        if ((32768 & i8) == 0) {
            this.i2 = null;
        } else {
            this.i2 = basicUser2;
        }
        if ((65536 & i8) == 0) {
            this.j2 = null;
        } else {
            this.j2 = clubWithAdmin;
        }
        if ((131072 & i8) == 0) {
            this.k2 = null;
        } else {
            this.k2 = str3;
        }
        if ((262144 & i8) == 0) {
            this.l2 = 0;
        } else {
            this.l2 = i5;
        }
        if ((524288 & i8) == 0) {
            this.m2 = null;
        } else {
            this.m2 = bool;
        }
        if ((1048576 & i8) == 0) {
            this.n2 = null;
        } else {
            this.n2 = str4;
        }
        if ((2097152 & i8) == 0) {
            this.o2 = null;
        } else {
            this.o2 = str5;
        }
        if ((4194304 & i8) == 0) {
            this.p2 = null;
        } else {
            this.p2 = str6;
        }
        if ((8388608 & i8) == 0) {
            this.q2 = null;
        } else {
            this.q2 = str7;
        }
        this.r2 = str8;
        this.s2 = str9;
        this.t2 = str10;
        this.u2 = i6;
        this.v2 = i7;
        if ((536870912 & i8) == 0) {
            this.w2 = null;
        } else {
            this.w2 = l;
        }
        if ((i8 & 1073741824) == 0) {
            this.x2 = null;
        } else {
            this.x2 = list2;
        }
        this.y2 = z10;
        this.z2 = z11;
    }

    public static ChannelInRoomWithAccess a(ChannelInRoomWithAccess channelInRoomWithAccess, List list, boolean z, boolean z3, boolean z4, boolean z5, boolean z6, HandraisePermission handraisePermission, ClipsPermission clipsPermission, boolean z7, int i, String str, String str2, boolean z8, boolean z9, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i4, int i5, Long l, List list2, boolean z10, boolean z11, int i6, int i7) {
        BasicUser basicUser3;
        BasicUser basicUser4;
        BasicUser basicUser5;
        ClubWithAdmin clubWithAdmin2;
        ClubWithAdmin clubWithAdmin3;
        String str11;
        String str12;
        int i8;
        int i9;
        Boolean bool2;
        Boolean bool3;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        ChannelInRoomWithAccess channelInRoomWithAccess2 = channelInRoomWithAccess;
        int i10 = i6;
        List<UserInChannel> list3 = (i10 & 1) != 0 ? channelInRoomWithAccess2.c : null;
        boolean z12 = (i10 & 2) != 0 ? channelInRoomWithAccess2.d : z;
        boolean z13 = (i10 & 4) != 0 ? channelInRoomWithAccess2.q : z3;
        boolean z14 = (i10 & 8) != 0 ? channelInRoomWithAccess2.x : z4;
        boolean z15 = (i10 & 16) != 0 ? channelInRoomWithAccess2.y : z5;
        boolean z16 = (i10 & 32) != 0 ? channelInRoomWithAccess2.Y1 : z6;
        HandraisePermission handraisePermission2 = (i10 & 64) != 0 ? channelInRoomWithAccess2.Z1 : null;
        ClipsPermission clipsPermission2 = (i10 & 128) != 0 ? channelInRoomWithAccess2.a2 : null;
        boolean z17 = (i10 & 256) != 0 ? channelInRoomWithAccess2.b2 : z7;
        int i11 = (i10 & 512) != 0 ? channelInRoomWithAccess2.c2 : i;
        String str22 = (i10 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? channelInRoomWithAccess2.d2 : null;
        String str23 = (i10 & 2048) != 0 ? channelInRoomWithAccess2.e2 : null;
        boolean z18 = (i10 & 4096) != 0 ? channelInRoomWithAccess2.f2 : z8;
        boolean z19 = (i10 & 8192) != 0 ? channelInRoomWithAccess2.g2 : z9;
        BasicUser basicUser6 = (i10 & 16384) != 0 ? channelInRoomWithAccess2.h2 : null;
        if ((i10 & 32768) != 0) {
            basicUser3 = basicUser6;
            basicUser4 = channelInRoomWithAccess2.i2;
        } else {
            basicUser3 = basicUser6;
            basicUser4 = null;
        }
        if ((i10 & 65536) != 0) {
            basicUser5 = basicUser4;
            clubWithAdmin2 = channelInRoomWithAccess2.j2;
        } else {
            basicUser5 = basicUser4;
            clubWithAdmin2 = null;
        }
        if ((i10 & 131072) != 0) {
            clubWithAdmin3 = clubWithAdmin2;
            str11 = channelInRoomWithAccess2.k2;
        } else {
            clubWithAdmin3 = clubWithAdmin2;
            str11 = null;
        }
        if ((i10 & 262144) != 0) {
            str12 = str11;
            i8 = channelInRoomWithAccess2.l2;
        } else {
            str12 = str11;
            i8 = i3;
        }
        if ((i10 & 524288) != 0) {
            i9 = i8;
            bool2 = channelInRoomWithAccess2.m2;
        } else {
            i9 = i8;
            bool2 = null;
        }
        if ((i10 & 1048576) != 0) {
            bool3 = bool2;
            str13 = channelInRoomWithAccess2.n2;
        } else {
            bool3 = bool2;
            str13 = null;
        }
        if ((i10 & 2097152) != 0) {
            str14 = str13;
            str15 = channelInRoomWithAccess2.o2;
        } else {
            str14 = str13;
            str15 = null;
        }
        if ((i10 & 4194304) != 0) {
            str16 = str15;
            str17 = channelInRoomWithAccess2.p2;
        } else {
            str16 = str15;
            str17 = null;
        }
        if ((i10 & 8388608) != 0) {
            str18 = str17;
            str19 = channelInRoomWithAccess2.q2;
        } else {
            str18 = str17;
            str19 = null;
        }
        if ((i10 & 16777216) != 0) {
            str20 = str19;
            str21 = channelInRoomWithAccess2.r2;
        } else {
            str20 = str19;
            str21 = null;
        }
        boolean z20 = z18;
        String str24 = (i10 & 33554432) != 0 ? channelInRoomWithAccess2.s2 : null;
        String str25 = str23;
        String str26 = (i10 & 67108864) != 0 ? channelInRoomWithAccess2.t2 : null;
        int i12 = i11;
        int i13 = (i10 & 134217728) != 0 ? channelInRoomWithAccess2.u2 : i4;
        int i14 = (i10 & 268435456) != 0 ? channelInRoomWithAccess2.v2 : i5;
        Long l3 = (i10 & 536870912) != 0 ? channelInRoomWithAccess2.w2 : null;
        List<String> list4 = (i10 & 1073741824) != 0 ? channelInRoomWithAccess2.x2 : null;
        boolean z21 = (i10 & Integer.MIN_VALUE) != 0 ? channelInRoomWithAccess2.y2 : z10;
        if ((i7 & 1) != 0) {
            z11 = channelInRoomWithAccess2.z2;
        }
        i.e(list3, "users");
        i.e(handraisePermission2, "handraisePermission");
        i.e(clipsPermission2, "clipsPermission");
        i.e(str22, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(str21, "token");
        i.e(str24, "pubnubToken");
        i.e(str26, "pubnubOrigin");
        return new ChannelInRoomWithAccess(list3, z12, z13, z14, z15, z16, handraisePermission2, clipsPermission2, z17, i12, str22, str25, z20, z19, basicUser3, basicUser5, clubWithAdmin3, str12, i9, bool3, str14, str16, str18, str20, str21, str24, str26, i13, i14, l3, list4, z21, z11);
    }

    public boolean A0() {
        return this.d;
    }

    public ChannelInRoom C0(boolean z) {
        return a(this, (List) null, false, false, false, z, false, (HandraisePermission) null, (ClipsPermission) null, false, 0, (String) null, (String) null, false, false, (BasicUser) null, (BasicUser) null, (ClubWithAdmin) null, (String) null, 0, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (Long) null, (List) null, false, false, -17, 1);
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
        if (!(obj instanceof ChannelInRoomWithAccess)) {
            return false;
        }
        ChannelInRoomWithAccess channelInRoomWithAccess = (ChannelInRoomWithAccess) obj;
        return i.a(this.c, channelInRoomWithAccess.c) && this.d == channelInRoomWithAccess.d && this.q == channelInRoomWithAccess.q && this.x == channelInRoomWithAccess.x && this.y == channelInRoomWithAccess.y && this.Y1 == channelInRoomWithAccess.Y1 && this.Z1 == channelInRoomWithAccess.Z1 && this.a2 == channelInRoomWithAccess.a2 && this.b2 == channelInRoomWithAccess.b2 && this.c2 == channelInRoomWithAccess.c2 && i.a(this.d2, channelInRoomWithAccess.d2) && i.a(this.e2, channelInRoomWithAccess.e2) && this.f2 == channelInRoomWithAccess.f2 && this.g2 == channelInRoomWithAccess.g2 && i.a(this.h2, channelInRoomWithAccess.h2) && i.a(this.i2, channelInRoomWithAccess.i2) && i.a(this.j2, channelInRoomWithAccess.j2) && i.a(this.k2, channelInRoomWithAccess.k2) && this.l2 == channelInRoomWithAccess.l2 && i.a(this.m2, channelInRoomWithAccess.m2) && i.a(this.n2, channelInRoomWithAccess.n2) && i.a(this.o2, channelInRoomWithAccess.o2) && i.a(this.p2, channelInRoomWithAccess.p2) && i.a(this.q2, channelInRoomWithAccess.q2) && i.a(this.r2, channelInRoomWithAccess.r2) && i.a(this.s2, channelInRoomWithAccess.s2) && i.a(this.t2, channelInRoomWithAccess.t2) && this.u2 == channelInRoomWithAccess.u2 && this.v2 == channelInRoomWithAccess.v2 && i.a(this.w2, channelInRoomWithAccess.w2) && i.a(this.x2, channelInRoomWithAccess.x2) && this.y2 == channelInRoomWithAccess.y2 && this.z2 == channelInRoomWithAccess.z2;
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
        int i11;
        int hashCode = this.c.hashCode() * 31;
        boolean z = this.d;
        boolean z3 = true;
        if (z) {
            z = true;
        }
        int i12 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z4 = this.q;
        if (z4) {
            z4 = true;
        }
        int i13 = (i12 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.x;
        if (z5) {
            z5 = true;
        }
        int i14 = (i13 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.y;
        if (z6) {
            z6 = true;
        }
        int i15 = (i14 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.Y1;
        if (z7) {
            z7 = true;
        }
        int hashCode2 = (this.a2.hashCode() + ((this.Z1.hashCode() + ((i15 + (z7 ? 1 : 0)) * 31)) * 31)) * 31;
        boolean z8 = this.b2;
        if (z8) {
            z8 = true;
        }
        int F = i0.d.a.a.a.F(this.d2, i0.d.a.a.a.M(this.c2, (hashCode2 + (z8 ? 1 : 0)) * 31, 31), 31);
        String str = this.e2;
        int i16 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i17 = (F + i) * 31;
        boolean z9 = this.f2;
        if (z9) {
            z9 = true;
        }
        int i18 = (i17 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.g2;
        if (z10) {
            z10 = true;
        }
        int i19 = (i18 + (z10 ? 1 : 0)) * 31;
        BasicUser basicUser = this.h2;
        if (basicUser == null) {
            i3 = 0;
        } else {
            i3 = basicUser.hashCode();
        }
        int i20 = (i19 + i3) * 31;
        BasicUser basicUser2 = this.i2;
        if (basicUser2 == null) {
            i4 = 0;
        } else {
            i4 = basicUser2.hashCode();
        }
        int i21 = (i20 + i4) * 31;
        ClubWithAdmin clubWithAdmin = this.j2;
        if (clubWithAdmin == null) {
            i5 = 0;
        } else {
            i5 = clubWithAdmin.hashCode();
        }
        int i22 = (i21 + i5) * 31;
        String str2 = this.k2;
        if (str2 == null) {
            i6 = 0;
        } else {
            i6 = str2.hashCode();
        }
        int M = i0.d.a.a.a.M(this.l2, (i22 + i6) * 31, 31);
        Boolean bool = this.m2;
        if (bool == null) {
            i7 = 0;
        } else {
            i7 = bool.hashCode();
        }
        int i23 = (M + i7) * 31;
        String str3 = this.n2;
        if (str3 == null) {
            i8 = 0;
        } else {
            i8 = str3.hashCode();
        }
        int i24 = (i23 + i8) * 31;
        String str4 = this.o2;
        if (str4 == null) {
            i9 = 0;
        } else {
            i9 = str4.hashCode();
        }
        int i25 = (i24 + i9) * 31;
        String str5 = this.p2;
        if (str5 == null) {
            i10 = 0;
        } else {
            i10 = str5.hashCode();
        }
        int i26 = (i25 + i10) * 31;
        String str6 = this.q2;
        if (str6 == null) {
            i11 = 0;
        } else {
            i11 = str6.hashCode();
        }
        int M2 = i0.d.a.a.a.M(this.v2, i0.d.a.a.a.M(this.u2, i0.d.a.a.a.F(this.t2, i0.d.a.a.a.F(this.s2, i0.d.a.a.a.F(this.r2, (i26 + i11) * 31, 31), 31), 31), 31), 31);
        Long l = this.w2;
        int hashCode3 = (M2 + (l == null ? 0 : l.hashCode())) * 31;
        List<String> list = this.x2;
        if (list != null) {
            i16 = list.hashCode();
        }
        int i27 = (hashCode3 + i16) * 31;
        boolean z11 = this.y2;
        if (z11) {
            z11 = true;
        }
        int i28 = (i27 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.z2;
        if (!z12) {
            z3 = z12;
        }
        return i28 + (z3 ? 1 : 0);
    }

    public Club i() {
        return this.j2;
    }

    public Boolean isEmpty() {
        return this.m2;
    }

    public ChannelInRoom n0(boolean z) {
        return a(this, (List) null, z, false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, false, 0, (String) null, (String) null, false, false, (BasicUser) null, (BasicUser) null, (ClubWithAdmin) null, (String) null, 0, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (Long) null, (List) null, false, false, -3, 1);
    }

    public BasicUser p0() {
        return this.h2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelInRoomWithAccess(users=");
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
        P0.append(this.q2);
        P0.append(", token=");
        P0.append(this.r2);
        P0.append(", pubnubToken=");
        P0.append(this.s2);
        P0.append(", pubnubOrigin=");
        P0.append(this.t2);
        P0.append(", pubnubHeartbeatInterval=");
        P0.append(this.u2);
        P0.append(", pubnubHeartbeatValue=");
        P0.append(this.v2);
        P0.append(", pubnubTimeToken=");
        P0.append(this.w2);
        P0.append(", featureFlags=");
        P0.append(this.x2);
        P0.append(", pubnubEnable=");
        P0.append(this.y2);
        P0.append(", agoraNativeMute=");
        return i0.d.a.a.a.C0(P0, this.z2, ')');
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
        parcel.writeString(this.r2);
        parcel.writeString(this.s2);
        parcel.writeString(this.t2);
        parcel.writeInt(this.u2);
        parcel.writeInt(this.v2);
        Long l = this.w2;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeStringList(this.x2);
        parcel.writeInt(this.y2 ? 1 : 0);
        parcel.writeInt(this.z2 ? 1 : 0);
    }

    public List<UserInChannel> y() {
        return this.c;
    }

    public boolean z() {
        return this.Y1;
    }

    public ChannelInRoomWithAccess(List<UserInChannel> list, boolean z, boolean z3, boolean z4, boolean z5, boolean z6, HandraisePermission handraisePermission, ClipsPermission clipsPermission, boolean z7, int i, String str, String str2, boolean z8, boolean z9, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i3, Boolean bool, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i4, int i5, Long l, List<String> list2, boolean z10, boolean z11) {
        HandraisePermission handraisePermission2 = handraisePermission;
        ClipsPermission clipsPermission2 = clipsPermission;
        String str11 = str;
        String str12 = str8;
        String str13 = str9;
        String str14 = str10;
        i.e(list, "users");
        i.e(handraisePermission2, "handraisePermission");
        i.e(clipsPermission2, "clipsPermission");
        i.e(str11, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        i.e(str12, "token");
        i.e(str13, "pubnubToken");
        i.e(str14, "pubnubOrigin");
        this.c = list;
        this.d = z;
        this.q = z3;
        this.x = z4;
        this.y = z5;
        this.Y1 = z6;
        this.Z1 = handraisePermission2;
        this.a2 = clipsPermission2;
        this.b2 = z7;
        this.c2 = i;
        this.d2 = str11;
        this.e2 = str2;
        this.f2 = z8;
        this.g2 = z9;
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
        this.r2 = str12;
        this.s2 = str13;
        this.t2 = str14;
        this.u2 = i4;
        this.v2 = i5;
        this.w2 = l;
        this.x2 = list2;
        this.y2 = z10;
        this.z2 = z11;
    }
}
