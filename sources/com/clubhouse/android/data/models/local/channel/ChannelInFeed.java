package com.clubhouse.android.data.models.local.channel;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.UserInFeed;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
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
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ChannelInFeed.kt */
public final class ChannelInFeed implements Channel {
    public static final Parcelable.Creator<ChannelInFeed> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final Map<String, Object> Y1;
    public final int Z1;
    public final String a2;
    public final String b2;
    public final List<UserInFeed> c;
    public final boolean c2;
    public final int d;
    public final boolean d2;
    public final BasicUser e2;
    public final BasicUser f2;
    public final ClubWithAdmin g2;
    public final String h2;
    public final int i2;
    public final int q;
    public final Boolean x;
    public final Boolean y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/channel/ChannelInFeed$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/channel/ChannelInFeed;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ChannelInFeed.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ChannelInFeed> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ChannelInFeed.kt */
    public static final class a implements v<ChannelInFeed> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.channel.ChannelInFeed", aVar, 16);
            pluginGeneratedSerialDescriptor.i("users", false);
            pluginGeneratedSerialDescriptor.i("num_speakers", false);
            pluginGeneratedSerialDescriptor.i("num_all", false);
            pluginGeneratedSerialDescriptor.i("has_blocked_speakers", true);
            pluginGeneratedSerialDescriptor.i("is_explore_channel", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            pluginGeneratedSerialDescriptor.i("creator_user_profile_id", false);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, false);
            pluginGeneratedSerialDescriptor.i("topic", false);
            pluginGeneratedSerialDescriptor.i("is_private", false);
            pluginGeneratedSerialDescriptor.i("is_social_mode", false);
            pluginGeneratedSerialDescriptor.i("welcome_for_user_profile", false);
            pluginGeneratedSerialDescriptor.i("club_added_by_user_profile", true);
            pluginGeneratedSerialDescriptor.i("club", false);
            pluginGeneratedSerialDescriptor.i("url", false);
            pluginGeneratedSerialDescriptor.i("channel_id", false);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            h hVar = h.b;
            g1 g1Var = g1.b;
            BasicUser.a aVar = BasicUser.a.a;
            return new KSerializer[]{new n0.c.k.e(UserInFeed.a.a), e0Var, e0Var, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a)), e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, hVar, m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), m0.r.t.a.r.m.a1.a.R1(g1Var), e0Var};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00d5, code lost:
            r10 = r10;
            r5 = r5;
            r6 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0122, code lost:
            r10 = r10;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0142, code lost:
            r2 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0156, code lost:
            r10 = r10;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x017a, code lost:
            r10 = r10;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0197, code lost:
            r12 = r2;
            r6 = r6;
            r10 = r10;
            r5 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x019d, code lost:
            r2 = 15;
            r7 = 8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0122, code lost:
            r10 = r10;
            r6 = r6;
            r5 = r5;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r37) {
            /*
                r36 = this;
                r0 = r37
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 0
                r10 = 3
                r11 = 5
                r12 = 6
                r13 = 7
                r14 = 9
                r15 = 0
                r4 = 1
                r5 = 2
                r6 = 4
                r7 = 8
                if (r2 == 0) goto L_0x00a2
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInFeed$a r8 = com.clubhouse.android.data.models.local.user.UserInFeed.a.a
                r2.<init>(r8)
                java.lang.Object r2 = r0.m(r1, r15, r2, r3)
                int r4 = r0.k(r1, r4)
                int r5 = r0.k(r1, r5)
                n0.c.k.h r8 = n0.c.k.h.b
                java.lang.Object r10 = r0.v(r1, r10, r8, r3)
                java.lang.Object r6 = r0.v(r1, r6, r8, r3)
                n0.c.k.h0 r8 = new n0.c.k.h0
                n0.c.k.g1 r15 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r9 = i0.e.b.b3.a.b.c.a.a
                r8.<init>(r15, r9)
                java.lang.Object r8 = r0.v(r1, r11, r8, r3)
                int r9 = r0.k(r1, r12)
                java.lang.String r11 = r0.t(r1, r13)
                java.lang.Object r7 = r0.v(r1, r7, r15, r3)
                boolean r12 = r0.s(r1, r14)
                r13 = 10
                boolean r13 = r0.s(r1, r13)
                com.clubhouse.android.data.models.local.user.BasicUser$a r14 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r18 = r2
                r2 = 11
                java.lang.Object r2 = r0.v(r1, r2, r14, r3)
                r17 = r2
                r2 = 12
                java.lang.Object r2 = r0.v(r1, r2, r14, r3)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r14 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r16 = r2
                r2 = 13
                java.lang.Object r2 = r0.v(r1, r2, r14, r3)
                r14 = 14
                java.lang.Object r3 = r0.v(r1, r14, r15, r3)
                r14 = 15
                int r14 = r0.k(r1, r14)
                r15 = 65535(0xffff, float:9.1834E-41)
                r21 = r4
                r22 = r5
                r26 = r9
                r5 = r10
                r27 = r11
                r29 = r12
                r30 = r13
                r35 = r14
                r19 = r15
                r10 = r6
                r6 = r2
                r2 = r18
                goto L_0x01ba
            L_0x00a2:
                r2 = 15
                r5 = r3
                r6 = r5
                r8 = r6
                r9 = r8
                r10 = r9
                r11 = r10
                r19 = r11
                r32 = r4
                r12 = r15
                r25 = r12
                r26 = r25
                r27 = r26
                r28 = r27
                r29 = r28
                r30 = r29
                r4 = r19
                r15 = r4
            L_0x00be:
                if (r32 == 0) goto L_0x01a2
                int r13 = r0.x(r1)
                switch(r13) {
                    case -1: goto L_0x0199;
                    case 0: goto L_0x0187;
                    case 1: goto L_0x017c;
                    case 2: goto L_0x0170;
                    case 3: goto L_0x0164;
                    case 4: goto L_0x0159;
                    case 5: goto L_0x0144;
                    case 6: goto L_0x0139;
                    case 7: goto L_0x012f;
                    case 8: goto L_0x0124;
                    case 9: goto L_0x0116;
                    case 10: goto L_0x010b;
                    case 11: goto L_0x00fe;
                    case 12: goto L_0x00f1;
                    case 13: goto L_0x00e4;
                    case 14: goto L_0x00d9;
                    case 15: goto L_0x00cd;
                    default: goto L_0x00c7;
                }
            L_0x00c7:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r13)
                throw r0
            L_0x00cd:
                int r30 = r0.k(r1, r2)
                r13 = 32768(0x8000, float:4.5918E-41)
                r12 = r12 | r13
            L_0x00d5:
                r7 = 0
                r13 = 4
                goto L_0x019d
            L_0x00d9:
                n0.c.k.g1 r13 = n0.c.k.g1.b
                r2 = 14
                java.lang.Object r8 = r0.v(r1, r2, r13, r8)
                r12 = r12 | 16384(0x4000, float:2.2959E-41)
                goto L_0x00d5
            L_0x00e4:
                r2 = 14
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r13 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r2 = 13
                java.lang.Object r6 = r0.v(r1, r2, r13, r6)
                r12 = r12 | 8192(0x2000, float:1.14794E-41)
                goto L_0x00d5
            L_0x00f1:
                r2 = 13
                com.clubhouse.android.data.models.local.user.BasicUser$a r13 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r2 = 12
                java.lang.Object r9 = r0.v(r1, r2, r13, r9)
                r12 = r12 | 4096(0x1000, float:5.74E-42)
                goto L_0x00d5
            L_0x00fe:
                r2 = 12
                com.clubhouse.android.data.models.local.user.BasicUser$a r13 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r2 = 11
                java.lang.Object r11 = r0.v(r1, r2, r13, r11)
                r12 = r12 | 2048(0x800, float:2.87E-42)
                goto L_0x00d5
            L_0x010b:
                r2 = 11
                r13 = 10
                boolean r29 = r0.s(r1, r13)
                r12 = r12 | 1024(0x400, float:1.435E-42)
                goto L_0x00d5
            L_0x0116:
                r2 = 11
                r13 = 10
                boolean r28 = r0.s(r1, r14)
                r12 = r12 | 512(0x200, float:7.175E-43)
                r2 = 15
            L_0x0122:
                r13 = 7
                goto L_0x00be
            L_0x0124:
                r13 = 10
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r15 = r0.v(r1, r7, r2, r15)
                r2 = r12 | 256(0x100, float:3.59E-43)
                goto L_0x0156
            L_0x012f:
                r2 = 7
                r13 = 10
                java.lang.String r19 = r0.t(r1, r2)
                r12 = r12 | 128(0x80, float:1.794E-43)
                goto L_0x0142
            L_0x0139:
                r2 = 6
                r13 = 10
                int r27 = r0.k(r1, r2)
                r12 = r12 | 64
            L_0x0142:
                r2 = r12
                goto L_0x0156
            L_0x0144:
                r13 = 10
                n0.c.k.h0 r2 = new n0.c.k.h0
                n0.c.k.g1 r7 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r13 = i0.e.b.b3.a.b.c.a.a
                r2.<init>(r7, r13)
                r7 = 5
                java.lang.Object r4 = r0.v(r1, r7, r2, r4)
                r2 = r12 | 32
            L_0x0156:
                r7 = 0
                r13 = 4
                goto L_0x0197
            L_0x0159:
                r7 = 5
                n0.c.k.h r2 = n0.c.k.h.b
                r13 = 4
                java.lang.Object r10 = r0.v(r1, r13, r2, r10)
                r2 = r12 | 16
                goto L_0x017a
            L_0x0164:
                r7 = 5
                r13 = 4
                n0.c.k.h r2 = n0.c.k.h.b
                r7 = 3
                java.lang.Object r5 = r0.v(r1, r7, r2, r5)
                r2 = r12 | 8
                goto L_0x017a
            L_0x0170:
                r2 = 2
                r7 = 3
                r13 = 4
                int r26 = r0.k(r1, r2)
                r12 = r12 | 4
                r2 = r12
            L_0x017a:
                r7 = 0
                goto L_0x0197
            L_0x017c:
                r2 = 1
                r7 = 3
                r13 = 4
                int r25 = r0.k(r1, r2)
                r12 = r12 | 2
                r7 = 0
                goto L_0x019d
            L_0x0187:
                r7 = 3
                r13 = 4
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInFeed$a r7 = com.clubhouse.android.data.models.local.user.UserInFeed.a.a
                r2.<init>(r7)
                r7 = 0
                java.lang.Object r3 = r0.m(r1, r7, r2, r3)
                r2 = r12 | 1
            L_0x0197:
                r12 = r2
                goto L_0x019d
            L_0x0199:
                r7 = 0
                r13 = 4
                r32 = r7
            L_0x019d:
                r2 = 15
                r7 = 8
                goto L_0x0122
            L_0x01a2:
                r2 = r3
                r3 = r8
                r16 = r9
                r17 = r11
                r7 = r15
                r21 = r25
                r22 = r26
                r26 = r27
                r35 = r30
                r8 = r4
                r27 = r19
                r30 = r29
                r19 = r12
                r29 = r28
            L_0x01ba:
                r0.b(r1)
                com.clubhouse.android.data.models.local.channel.ChannelInFeed r0 = new com.clubhouse.android.data.models.local.channel.ChannelInFeed
                r18 = r0
                r20 = r2
                java.util.List r20 = (java.util.List) r20
                r23 = r5
                java.lang.Boolean r23 = (java.lang.Boolean) r23
                r24 = r10
                java.lang.Boolean r24 = (java.lang.Boolean) r24
                r25 = r8
                java.util.Map r25 = (java.util.Map) r25
                r28 = r7
                java.lang.String r28 = (java.lang.String) r28
                r31 = r17
                com.clubhouse.android.data.models.local.user.BasicUser r31 = (com.clubhouse.android.data.models.local.user.BasicUser) r31
                r32 = r16
                com.clubhouse.android.data.models.local.user.BasicUser r32 = (com.clubhouse.android.data.models.local.user.BasicUser) r32
                r33 = r6
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r33 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r33
                r34 = r3
                java.lang.String r34 = (java.lang.String) r34
                r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.channel.ChannelInFeed.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ChannelInFeed channelInFeed = (ChannelInFeed) obj;
            i.e(encoder, "encoder");
            i.e(channelInFeed, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(channelInFeed, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.z(serialDescriptor, 0, new n0.c.k.e(UserInFeed.a.a), channelInFeed.c);
            c.q(serialDescriptor, 1, channelInFeed.d);
            c.q(serialDescriptor, 2, channelInFeed.q);
            if (c.v(serialDescriptor, 3) || channelInFeed.x != null) {
                c.l(serialDescriptor, 3, h.b, channelInFeed.x);
            }
            if (c.v(serialDescriptor, 4) || channelInFeed.y != null) {
                c.l(serialDescriptor, 4, h.b, channelInFeed.y);
            }
            if (c.v(serialDescriptor, 5) || channelInFeed.Y1 != null) {
                c.l(serialDescriptor, 5, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), channelInFeed.Y1);
            }
            c.q(serialDescriptor, 6, channelInFeed.Z1);
            c.s(serialDescriptor, 7, channelInFeed.a2);
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 8, g1Var, channelInFeed.b2);
            c.r(serialDescriptor, 9, channelInFeed.c2);
            c.r(serialDescriptor, 10, channelInFeed.d2);
            BasicUser.a aVar = BasicUser.a.a;
            c.l(serialDescriptor, 11, aVar, channelInFeed.e2);
            if (c.v(serialDescriptor, 12) || channelInFeed.f2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 12, aVar, channelInFeed.f2);
            }
            c.l(serialDescriptor, 13, ClubWithAdmin.a.a, channelInFeed.g2);
            c.l(serialDescriptor, 14, g1Var, channelInFeed.h2);
            c.q(serialDescriptor, 15, channelInFeed.i2);
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ChannelInFeed.kt */
    public static final class b implements Parcelable.Creator<ChannelInFeed> {
        public Object createFromParcel(Parcel parcel) {
            Boolean bool;
            Boolean bool2;
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i = i0.d.a.a.a.n(UserInFeed.CREATOR, parcel2, arrayList, i, 1)) {
            }
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ClubWithAdmin clubWithAdmin = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt4);
                int i2 = 0;
                while (i2 != readInt4) {
                    i2 = i0.d.a.a.a.y(ChannelInFeed.class, parcel, linkedHashMap2, parcel.readString(), i2, 1);
                    linkedHashMap2 = linkedHashMap2;
                }
                linkedHashMap = linkedHashMap2;
            }
            int readInt5 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            BasicUser createFromParcel = parcel.readInt() == 0 ? null : BasicUser.CREATOR.createFromParcel(parcel2);
            BasicUser createFromParcel2 = parcel.readInt() == 0 ? null : BasicUser.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() != 0) {
                clubWithAdmin = ClubWithAdmin.CREATOR.createFromParcel(parcel2);
            }
            return new ChannelInFeed(arrayList, readInt2, readInt3, bool, bool2, linkedHashMap, readInt5, readString, readString2, z, z2, createFromParcel, createFromParcel2, clubWithAdmin, parcel.readString(), parcel.readInt());
        }

        public Object[] newArray(int i) {
            return new ChannelInFeed[i];
        }
    }

    public ChannelInFeed(int i, List list, int i3, int i4, Boolean bool, Boolean bool2, Map map, int i5, String str, String str2, boolean z, boolean z2, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i6) {
        int i7 = i;
        if (61383 == (i7 & 61383)) {
            this.c = list;
            this.d = i3;
            this.q = i4;
            if ((i7 & 8) == 0) {
                this.x = null;
            } else {
                this.x = bool;
            }
            if ((i7 & 16) == 0) {
                this.y = null;
            } else {
                this.y = bool2;
            }
            if ((i7 & 32) == 0) {
                this.Y1 = null;
            } else {
                this.Y1 = map;
            }
            this.Z1 = i5;
            this.a2 = str;
            this.b2 = str2;
            this.c2 = z;
            this.d2 = z2;
            this.e2 = basicUser;
            if ((i7 & 4096) == 0) {
                this.f2 = null;
            } else {
                this.f2 = basicUser2;
            }
            this.g2 = clubWithAdmin;
            this.h2 = str3;
            this.i2 = i6;
            return;
        }
        a aVar = a.a;
        m0.r.t.a.r.m.a1.a.W3(i, 61383, a.b);
        throw null;
    }

    public BasicUser F0() {
        return this.f2;
    }

    public boolean T() {
        return this.c2;
    }

    public boolean U() {
        return this.d2;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.a2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelInFeed)) {
            return false;
        }
        ChannelInFeed channelInFeed = (ChannelInFeed) obj;
        return i.a(this.c, channelInFeed.c) && this.d == channelInFeed.d && this.q == channelInFeed.q && i.a(this.x, channelInFeed.x) && i.a(this.y, channelInFeed.y) && i.a(this.Y1, channelInFeed.Y1) && this.Z1 == channelInFeed.Z1 && i.a(this.a2, channelInFeed.a2) && i.a(this.b2, channelInFeed.b2) && this.c2 == channelInFeed.c2 && this.d2 == channelInFeed.d2 && i.a(this.e2, channelInFeed.e2) && i.a(this.f2, channelInFeed.f2) && i.a(this.g2, channelInFeed.g2) && i.a(this.h2, channelInFeed.h2) && this.i2 == channelInFeed.i2;
    }

    public int getId() {
        return this.i2;
    }

    public String getUrl() {
        return this.h2;
    }

    public int hashCode() {
        int i;
        int i3;
        int i4;
        int i5;
        int M = i0.d.a.a.a.M(this.q, i0.d.a.a.a.M(this.d, this.c.hashCode() * 31, 31), 31);
        Boolean bool = this.x;
        int i6 = 0;
        int hashCode = (M + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.y;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Map<String, Object> map = this.Y1;
        int F = i0.d.a.a.a.F(this.a2, i0.d.a.a.a.M(this.Z1, (hashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31), 31);
        String str = this.b2;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (F + i) * 31;
        boolean z = this.c2;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i8 = (i7 + (z ? 1 : 0)) * 31;
        boolean z3 = this.d2;
        if (!z3) {
            z2 = z3;
        }
        int i9 = (i8 + (z2 ? 1 : 0)) * 31;
        BasicUser basicUser = this.e2;
        if (basicUser == null) {
            i3 = 0;
        } else {
            i3 = basicUser.hashCode();
        }
        int i10 = (i9 + i3) * 31;
        BasicUser basicUser2 = this.f2;
        if (basicUser2 == null) {
            i4 = 0;
        } else {
            i4 = basicUser2.hashCode();
        }
        int i11 = (i10 + i4) * 31;
        ClubWithAdmin clubWithAdmin = this.g2;
        if (clubWithAdmin == null) {
            i5 = 0;
        } else {
            i5 = clubWithAdmin.hashCode();
        }
        int i12 = (i11 + i5) * 31;
        String str2 = this.h2;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return Integer.hashCode(this.i2) + ((i12 + i6) * 31);
    }

    public Club i() {
        return this.g2;
    }

    public BasicUser p0() {
        return this.e2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ChannelInFeed(users=");
        P0.append(this.c);
        P0.append(", numSpeakers=");
        P0.append(this.d);
        P0.append(", numAll=");
        P0.append(this.q);
        P0.append(", hasBlockedSpeakers=");
        P0.append(this.x);
        P0.append(", isExploreChannel=");
        P0.append(this.y);
        P0.append(", loggingContext=");
        P0.append(this.Y1);
        P0.append(", creatorUserId=");
        P0.append(this.Z1);
        P0.append(", channel=");
        P0.append(this.a2);
        P0.append(", topic=");
        P0.append(this.b2);
        P0.append(", isPrivate=");
        P0.append(this.c2);
        P0.append(", isSocialMode=");
        P0.append(this.d2);
        P0.append(", welcomeForUser=");
        P0.append(this.e2);
        P0.append(", clubAddedByUserProfile=");
        P0.append(this.f2);
        P0.append(", club=");
        P0.append(this.g2);
        P0.append(", url=");
        P0.append(this.h2);
        P0.append(", id=");
        return i0.d.a.a.a.s0(P0, this.i2, ')');
    }

    public String u0() {
        return this.b2;
    }

    public int v() {
        return this.Z1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        List<UserInFeed> list = this.c;
        parcel.writeInt(list.size());
        for (UserInFeed writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d);
        parcel.writeInt(this.q);
        Boolean bool = this.x;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.y;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Map<String, Object> map = this.Y1;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator l1 = i0.d.a.a.a.l1(parcel, 1, map);
            while (l1.hasNext()) {
                Map.Entry entry = (Map.Entry) l1.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeValue(entry.getValue());
            }
        }
        parcel.writeInt(this.Z1);
        parcel.writeString(this.a2);
        parcel.writeString(this.b2);
        parcel.writeInt(this.c2 ? 1 : 0);
        parcel.writeInt(this.d2 ? 1 : 0);
        BasicUser basicUser = this.e2;
        if (basicUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicUser.writeToParcel(parcel, i);
        }
        BasicUser basicUser2 = this.f2;
        if (basicUser2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicUser2.writeToParcel(parcel, i);
        }
        ClubWithAdmin clubWithAdmin = this.g2;
        if (clubWithAdmin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clubWithAdmin.writeToParcel(parcel, i);
        }
        parcel.writeString(this.h2);
        parcel.writeInt(this.i2);
    }

    public ChannelInFeed(List<UserInFeed> list, int i, int i3, Boolean bool, Boolean bool2, Map<String, ? extends Object> map, int i4, String str, String str2, boolean z, boolean z2, BasicUser basicUser, BasicUser basicUser2, ClubWithAdmin clubWithAdmin, String str3, int i5) {
        i.e(list, "users");
        i.e(str, Include.INCLUDE_CHANNEL_PARAM_VALUE);
        this.c = list;
        this.d = i;
        this.q = i3;
        this.x = bool;
        this.y = bool2;
        this.Y1 = map;
        this.Z1 = i4;
        this.a2 = str;
        this.b2 = str2;
        this.c2 = z;
        this.d2 = z2;
        this.e2 = basicUser;
        this.f2 = basicUser2;
        this.g2 = clubWithAdmin;
        this.h2 = str3;
        this.i2 = i5;
    }
}
