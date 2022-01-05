package com.clubhouse.android.data.models.local.club;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ClubInStatus.kt */
public final class ClubInStatus implements Club {
    public static final Parcelable.Creator<ClubInStatus> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String Y1;
    public final List<ClubRule> Z1;
    public final int a2;
    public final int b2;
    public final int c;
    public final String c2;
    public final List<BasicUser> d;
    public final boolean d2;
    public final boolean e2;
    public final boolean f2;
    public final boolean g2;
    public final boolean h2;
    public final Map<String, Object> i2;
    public final String j2;
    public final int q;
    public final String x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/club/ClubInStatus$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/club/ClubInStatus;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ClubInStatus.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ClubInStatus> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ClubInStatus.kt */
    public static final class a implements v<ClubInStatus> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.club.ClubInStatus", aVar, 17);
            pluginGeneratedSerialDescriptor.i("num_online", false);
            pluginGeneratedSerialDescriptor.i("online_members", false);
            pluginGeneratedSerialDescriptor.i("club_id", false);
            pluginGeneratedSerialDescriptor.i("name", false);
            pluginGeneratedSerialDescriptor.i("url", true);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, false);
            pluginGeneratedSerialDescriptor.i("rules", true);
            pluginGeneratedSerialDescriptor.i("num_members", true);
            pluginGeneratedSerialDescriptor.i("num_followers", true);
            pluginGeneratedSerialDescriptor.i("photo_url", true);
            pluginGeneratedSerialDescriptor.i("is_community", true);
            pluginGeneratedSerialDescriptor.i("is_follow_allowed", true);
            pluginGeneratedSerialDescriptor.i("is_membership_open", true);
            pluginGeneratedSerialDescriptor.i("is_ask_to_join_allowed", true);
            pluginGeneratedSerialDescriptor.i("is_membership_private", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            pluginGeneratedSerialDescriptor.i("reason", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            h hVar = h.b;
            return new KSerializer[]{e0Var, new n0.c.k.e(BasicUser.a.a), e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), new n0.c.k.e(ClubRule.a.a), e0Var, e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, hVar, hVar, hVar, hVar, m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a)), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00e5, code lost:
            r11 = r11 | r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0155, code lost:
            r13 = 7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0164, code lost:
            r6 = r26;
            r12 = r27;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x01ea, code lost:
            r26 = r6;
            r27 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x01ee, code lost:
            r2 = 16;
            r6 = 8;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r34) {
            /*
                r33 = this;
                r0 = r34
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r9 = 0
                r10 = 3
                r11 = 5
                r12 = 6
                r13 = 7
                r14 = 9
                r15 = 0
                r3 = 1
                r4 = 2
                r5 = 4
                r6 = 8
                if (r2 == 0) goto L_0x00ab
                int r2 = r0.k(r1, r15)
                n0.c.k.e r15 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.BasicUser$a r7 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r15.<init>(r7)
                java.lang.Object r3 = r0.m(r1, r3, r15, r9)
                int r4 = r0.k(r1, r4)
                java.lang.String r7 = r0.t(r1, r10)
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r5 = r0.v(r1, r5, r10, r9)
                java.lang.Object r11 = r0.v(r1, r11, r10, r9)
                n0.c.k.e r15 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubRule$a r8 = com.clubhouse.android.data.models.local.club.ClubRule.a.a
                r15.<init>(r8)
                java.lang.Object r8 = r0.m(r1, r12, r15, r9)
                int r12 = r0.k(r1, r13)
                int r6 = r0.k(r1, r6)
                java.lang.Object r13 = r0.v(r1, r14, r10, r9)
                r14 = 10
                boolean r14 = r0.s(r1, r14)
                r15 = 11
                boolean r15 = r0.s(r1, r15)
                r9 = 12
                boolean r9 = r0.s(r1, r9)
                r19 = r2
                r2 = 13
                boolean r2 = r0.s(r1, r2)
                r18 = r2
                r2 = 14
                boolean r2 = r0.s(r1, r2)
                r17 = r2
                n0.c.k.h0 r2 = new n0.c.k.h0
                r20 = r3
                i0.e.b.b3.a.b.c.a r3 = i0.e.b.b3.a.b.c.a.a
                r2.<init>(r10, r3)
                r16 = r15
                r3 = 15
                r15 = 0
                java.lang.Object r2 = r0.v(r1, r3, r2, r15)
                r3 = 16
                java.lang.Object r3 = r0.v(r1, r3, r10, r15)
                r10 = 131071(0x1ffff, float:1.8367E-40)
                r22 = r4
                r23 = r6
                r24 = r7
                r7 = r10
                r10 = r11
                r15 = r14
                r4 = r3
                r11 = r8
                r8 = r5
                r5 = r19
                r19 = r17
                r17 = r9
                goto L_0x0211
            L_0x00ab:
                r7 = r15
                r2 = 16
                r15 = r9
                r31 = r3
                r8 = r7
                r9 = r8
                r11 = r9
                r22 = r11
                r23 = r22
                r25 = r23
                r28 = r25
                r29 = r28
                r30 = r29
                r3 = r15
                r4 = r3
                r5 = r4
                r10 = r5
                r24 = r10
                r26 = r24
                r27 = r26
                r7 = r27
                r15 = r30
            L_0x00ce:
                if (r31 == 0) goto L_0x01f4
                int r12 = r0.x(r1)
                switch(r12) {
                    case -1: goto L_0x01e2;
                    case 0: goto L_0x01d5;
                    case 1: goto L_0x01be;
                    case 2: goto L_0x01b0;
                    case 3: goto L_0x01a2;
                    case 4: goto L_0x0190;
                    case 5: goto L_0x0180;
                    case 6: goto L_0x016c;
                    case 7: goto L_0x0159;
                    case 8: goto L_0x0149;
                    case 9: goto L_0x013c;
                    case 10: goto L_0x012f;
                    case 11: goto L_0x0122;
                    case 12: goto L_0x0115;
                    case 13: goto L_0x0108;
                    case 14: goto L_0x00fd;
                    case 15: goto L_0x00ea;
                    case 16: goto L_0x00dd;
                    default: goto L_0x00d7;
                }
            L_0x00d7:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x00dd:
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r10 = r0.v(r1, r2, r12, r10)
                r12 = 65536(0x10000, float:9.18355E-41)
            L_0x00e5:
                r11 = r11 | r12
            L_0x00e6:
                r2 = 0
                r13 = 1
                goto L_0x01ee
            L_0x00ea:
                n0.c.k.h0 r12 = new n0.c.k.h0
                n0.c.k.g1 r2 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r13 = i0.e.b.b3.a.b.c.a.a
                r12.<init>(r2, r13)
                r2 = 15
                java.lang.Object r7 = r0.v(r1, r2, r12, r7)
                r12 = 32768(0x8000, float:4.5918E-41)
                goto L_0x00e5
            L_0x00fd:
                r2 = 15
                r13 = 14
                boolean r15 = r0.s(r1, r13)
                r11 = r11 | 16384(0x4000, float:2.2959E-41)
                goto L_0x00e6
            L_0x0108:
                r2 = 15
                r12 = 13
                r13 = 14
                boolean r9 = r0.s(r1, r12)
                r11 = r11 | 8192(0x2000, float:1.14794E-41)
                goto L_0x00e6
            L_0x0115:
                r2 = 12
                r12 = 13
                r13 = 14
                boolean r25 = r0.s(r1, r2)
                r11 = r11 | 4096(0x1000, float:5.74E-42)
                goto L_0x00e6
            L_0x0122:
                r2 = 11
                r12 = 13
                r13 = 14
                boolean r30 = r0.s(r1, r2)
                r11 = r11 | 2048(0x800, float:2.87E-42)
                goto L_0x00e6
            L_0x012f:
                r2 = 10
                r12 = 13
                r13 = 14
                boolean r29 = r0.s(r1, r2)
                r11 = r11 | 1024(0x400, float:1.435E-42)
                goto L_0x00e6
            L_0x013c:
                r12 = 13
                r13 = 14
                n0.c.k.g1 r2 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r14, r2, r3)
                r11 = r11 | 512(0x200, float:7.175E-43)
                goto L_0x0164
            L_0x0149:
                r12 = 13
                r13 = 14
                int r23 = r0.k(r1, r6)
                r11 = r11 | 256(0x100, float:3.59E-43)
                r2 = 16
            L_0x0155:
                r12 = 6
                r13 = 7
                goto L_0x00ce
            L_0x0159:
                r2 = r13
                r12 = 13
                r13 = 14
                int r28 = r0.k(r1, r2)
                r11 = r11 | 128(0x80, float:1.794E-43)
            L_0x0164:
                r6 = r26
                r12 = r27
                r2 = 0
                r13 = 1
                goto L_0x01ea
            L_0x016c:
                r12 = 13
                r13 = 14
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubRule$a r6 = com.clubhouse.android.data.models.local.club.ClubRule.a.a
                r2.<init>(r6)
                r6 = 6
                java.lang.Object r5 = r0.m(r1, r6, r2, r5)
                r11 = r11 | 64
                goto L_0x00e6
            L_0x0180:
                r6 = 6
                r12 = 13
                r13 = 14
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r6 = 5
                java.lang.Object r4 = r0.v(r1, r6, r2, r4)
                r11 = r11 | 32
                goto L_0x00e6
            L_0x0190:
                r6 = 5
                r12 = 13
                r13 = 14
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r6 = r26
                r13 = 4
                java.lang.Object r26 = r0.v(r1, r13, r2, r6)
                r11 = r11 | 16
                goto L_0x00e6
            L_0x01a2:
                r6 = r26
                r2 = 3
                r12 = 13
                r13 = 4
                java.lang.String r24 = r0.t(r1, r2)
                r11 = r11 | 8
                goto L_0x00e6
            L_0x01b0:
                r6 = r26
                r2 = 2
                r12 = 13
                r13 = 4
                int r22 = r0.k(r1, r2)
                r11 = r11 | 4
                goto L_0x00e6
            L_0x01be:
                r6 = r26
                r12 = 13
                r13 = 4
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.BasicUser$a r12 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r2.<init>(r12)
                r12 = r27
                r13 = 1
                java.lang.Object r27 = r0.m(r1, r13, r2, r12)
                r11 = r11 | 2
                r2 = 0
                goto L_0x01ee
            L_0x01d5:
                r6 = r26
                r12 = r27
                r2 = 0
                r13 = 1
                int r8 = r0.k(r1, r2)
                r11 = r11 | 1
                goto L_0x01ee
            L_0x01e2:
                r6 = r26
                r12 = r27
                r2 = 0
                r13 = 1
                r31 = r2
            L_0x01ea:
                r26 = r6
                r27 = r12
            L_0x01ee:
                r2 = 16
                r6 = 8
                goto L_0x0155
            L_0x01f4:
                r6 = r26
                r12 = r27
                r13 = r3
                r2 = r7
                r18 = r9
                r7 = r11
                r20 = r12
                r19 = r15
                r17 = r25
                r12 = r28
                r15 = r29
                r16 = r30
                r11 = r5
                r5 = r8
                r8 = r6
                r32 = r10
                r10 = r4
                r4 = r32
            L_0x0211:
                r0.b(r1)
                com.clubhouse.android.data.models.local.club.ClubInStatus r0 = new com.clubhouse.android.data.models.local.club.ClubInStatus
                r3 = r0
                r6 = r20
                java.util.List r6 = (java.util.List) r6
                r9 = r8
                java.lang.String r9 = (java.lang.String) r9
                java.lang.String r10 = (java.lang.String) r10
                java.util.List r11 = (java.util.List) r11
                r14 = r13
                java.lang.String r14 = (java.lang.String) r14
                r20 = r2
                java.util.Map r20 = (java.util.Map) r20
                r21 = r4
                java.lang.String r21 = (java.lang.String) r21
                r4 = r7
                r7 = r22
                r8 = r24
                r13 = r23
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.club.ClubInStatus.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ClubInStatus clubInStatus = (ClubInStatus) obj;
            i.e(encoder, "encoder");
            i.e(clubInStatus, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(clubInStatus, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.q(serialDescriptor, 0, clubInStatus.c);
            c.z(serialDescriptor, 1, new n0.c.k.e(BasicUser.a.a), clubInStatus.d);
            c.q(serialDescriptor, 2, clubInStatus.q);
            c.s(serialDescriptor, 3, clubInStatus.x);
            if (c.v(serialDescriptor, 4) || clubInStatus.y != null) {
                c.l(serialDescriptor, 4, g1.b, clubInStatus.y);
            }
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 5, g1Var, clubInStatus.Y1);
            if (c.v(serialDescriptor, 6) || !i.a(clubInStatus.Z1, EmptyList.c)) {
                c.z(serialDescriptor, 6, new n0.c.k.e(ClubRule.a.a), clubInStatus.Z1);
            }
            if (c.v(serialDescriptor, 7) || clubInStatus.a2 != 0) {
                c.q(serialDescriptor, 7, clubInStatus.a2);
            }
            if (c.v(serialDescriptor, 8) || clubInStatus.b2 != 0) {
                c.q(serialDescriptor, 8, clubInStatus.b2);
            }
            if (c.v(serialDescriptor, 9) || clubInStatus.c2 != null) {
                c.l(serialDescriptor, 9, g1Var, clubInStatus.c2);
            }
            if (c.v(serialDescriptor, 10) || clubInStatus.d2) {
                c.r(serialDescriptor, 10, clubInStatus.d2);
            }
            if (c.v(serialDescriptor, 11) || clubInStatus.e2) {
                c.r(serialDescriptor, 11, clubInStatus.e2);
            }
            if (c.v(serialDescriptor, 12) || clubInStatus.f2) {
                c.r(serialDescriptor, 12, clubInStatus.f2);
            }
            if (c.v(serialDescriptor, 13) || clubInStatus.g2) {
                c.r(serialDescriptor, 13, clubInStatus.g2);
            }
            if (c.v(serialDescriptor, 14) || clubInStatus.h2) {
                c.r(serialDescriptor, 14, clubInStatus.h2);
            }
            if (c.v(serialDescriptor, 15) || clubInStatus.i2 != null) {
                c.l(serialDescriptor, 15, new h0(g1Var, i0.e.b.b3.a.b.c.a.a), clubInStatus.i2);
            }
            if (c.v(serialDescriptor, 16) || clubInStatus.j2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 16, g1Var, clubInStatus.j2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ClubInStatus.kt */
    public static final class b implements Parcelable.Creator<ClubInStatus> {
        public Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i = i0.d.a.a.a.n(BasicUser.CREATOR, parcel2, arrayList, i, 1)) {
            }
            int readInt3 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt4 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt4);
            for (int i2 = 0; i2 != readInt4; i2 = i0.d.a.a.a.n(ClubRule.CREATOR, parcel2, arrayList2, i2, 1)) {
            }
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            String readString4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt7 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt7);
                int i3 = 0;
                while (i3 != readInt7) {
                    i3 = i0.d.a.a.a.y(ClubInStatus.class, parcel, linkedHashMap2, parcel.readString(), i3, 1);
                    linkedHashMap2 = linkedHashMap2;
                    readInt7 = readInt7;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ClubInStatus(readInt, arrayList, readInt3, readString, readString2, readString3, arrayList2, readInt5, readInt6, readString4, z, z2, z3, z4, z5, linkedHashMap, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ClubInStatus[i];
        }
    }

    public ClubInStatus(int i, int i3, List list, int i4, String str, String str2, String str3, List list2, int i5, int i6, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Map map, String str5) {
        int i7 = i;
        if (47 == (i7 & 47)) {
            this.c = i3;
            this.d = list;
            this.q = i4;
            this.x = str;
            if ((i7 & 16) == 0) {
                this.y = null;
            } else {
                this.y = str2;
            }
            this.Y1 = str3;
            this.Z1 = (i7 & 64) == 0 ? EmptyList.c : list2;
            if ((i7 & 128) == 0) {
                this.a2 = 0;
            } else {
                this.a2 = i5;
            }
            if ((i7 & 256) == 0) {
                this.b2 = 0;
            } else {
                this.b2 = i6;
            }
            if ((i7 & 512) == 0) {
                this.c2 = null;
            } else {
                this.c2 = str4;
            }
            if ((i7 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                this.d2 = false;
            } else {
                this.d2 = z;
            }
            if ((i7 & 2048) == 0) {
                this.e2 = false;
            } else {
                this.e2 = z2;
            }
            if ((i7 & 4096) == 0) {
                this.f2 = false;
            } else {
                this.f2 = z3;
            }
            if ((i7 & 8192) == 0) {
                this.g2 = false;
            } else {
                this.g2 = z4;
            }
            if ((i7 & 16384) == 0) {
                this.h2 = false;
            } else {
                this.h2 = z5;
            }
            if ((32768 & i7) == 0) {
                this.i2 = null;
            } else {
                this.i2 = map;
            }
            if ((i7 & 65536) == 0) {
                this.j2 = null;
            } else {
                this.j2 = str5;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 47, a.b);
            throw null;
        }
    }

    public boolean O() {
        return this.f2;
    }

    public String a() {
        return this.j2;
    }

    public String b() {
        return this.c2;
    }

    public List<ClubRule> b0() {
        return this.Z1;
    }

    public Map<String, Object> c() {
        return this.i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubInStatus)) {
            return false;
        }
        ClubInStatus clubInStatus = (ClubInStatus) obj;
        return this.c == clubInStatus.c && i.a(this.d, clubInStatus.d) && this.q == clubInStatus.q && i.a(this.x, clubInStatus.x) && i.a(this.y, clubInStatus.y) && i.a(this.Y1, clubInStatus.Y1) && i.a(this.Z1, clubInStatus.Z1) && this.a2 == clubInStatus.a2 && this.b2 == clubInStatus.b2 && i.a(this.c2, clubInStatus.c2) && this.d2 == clubInStatus.d2 && this.e2 == clubInStatus.e2 && this.f2 == clubInStatus.f2 && this.g2 == clubInStatus.g2 && this.h2 == clubInStatus.h2 && i.a(this.i2, clubInStatus.i2) && i.a(this.j2, clubInStatus.j2);
    }

    public boolean f0() {
        return this.g2;
    }

    public String getDescription() {
        return this.Y1;
    }

    public int getId() {
        return this.q;
    }

    public String getName() {
        return this.x;
    }

    public int hashCode() {
        int i;
        int i3;
        int i4;
        int i5;
        int F = i0.d.a.a.a.F(this.x, i0.d.a.a.a.M(this.q, i0.d.a.a.a.H(this.d, Integer.hashCode(this.c) * 31, 31), 31), 31);
        String str = this.y;
        int i6 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i7 = (F + i) * 31;
        String str2 = this.Y1;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int M = i0.d.a.a.a.M(this.b2, i0.d.a.a.a.M(this.a2, i0.d.a.a.a.H(this.Z1, (i7 + i3) * 31, 31), 31), 31);
        String str3 = this.c2;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i8 = (M + i4) * 31;
        boolean z = this.d2;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i9 = (i8 + (z ? 1 : 0)) * 31;
        boolean z3 = this.e2;
        if (z3) {
            z3 = true;
        }
        int i10 = (i9 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f2;
        if (z4) {
            z4 = true;
        }
        int i11 = (i10 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.g2;
        if (z5) {
            z5 = true;
        }
        int i12 = (i11 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.h2;
        if (!z6) {
            z2 = z6;
        }
        int i13 = (i12 + (z2 ? 1 : 0)) * 31;
        Map<String, Object> map = this.i2;
        if (map == null) {
            i5 = 0;
        } else {
            i5 = map.hashCode();
        }
        int i14 = (i13 + i5) * 31;
        String str4 = this.j2;
        if (str4 != null) {
            i6 = str4.hashCode();
        }
        return i14 + i6;
    }

    public int q() {
        return this.a2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubInStatus(numOnline=");
        P0.append(this.c);
        P0.append(", onlineMembers=");
        P0.append(this.d);
        P0.append(", id=");
        P0.append(this.q);
        P0.append(", name=");
        P0.append(this.x);
        P0.append(", url=");
        P0.append(this.y);
        P0.append(", description=");
        P0.append(this.Y1);
        P0.append(", rules=");
        P0.append(this.Z1);
        P0.append(", numMembers=");
        P0.append(this.a2);
        P0.append(", numFollowers=");
        P0.append(this.b2);
        P0.append(", photoUrl=");
        P0.append(this.c2);
        P0.append(", isCommunity=");
        P0.append(this.d2);
        P0.append(", isFollowAllowed=");
        P0.append(this.e2);
        P0.append(", isMembershipOpen=");
        P0.append(this.f2);
        P0.append(", isAskToJoinAllowed=");
        P0.append(this.g2);
        P0.append(", isMembershipPrivate=");
        P0.append(this.h2);
        P0.append(", loggingContext=");
        P0.append(this.i2);
        P0.append(", reason=");
        return i0.d.a.a.a.w0(P0, this.j2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c);
        List<BasicUser> list = this.d;
        parcel.writeInt(list.size());
        for (BasicUser writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.q);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.Y1);
        List<ClubRule> list2 = this.Z1;
        parcel.writeInt(list2.size());
        for (ClubRule writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.a2);
        parcel.writeInt(this.b2);
        parcel.writeString(this.c2);
        parcel.writeInt(this.d2 ? 1 : 0);
        parcel.writeInt(this.e2 ? 1 : 0);
        parcel.writeInt(this.f2 ? 1 : 0);
        parcel.writeInt(this.g2 ? 1 : 0);
        parcel.writeInt(this.h2 ? 1 : 0);
        Map<String, Object> map = this.i2;
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
        parcel.writeString(this.j2);
    }

    public ClubInStatus(int i, List<BasicUser> list, int i3, String str, String str2, String str3, List<ClubRule> list2, int i4, int i5, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, ? extends Object> map, String str5) {
        i.e(list, "onlineMembers");
        i.e(str, "name");
        i.e(list2, "rules");
        this.c = i;
        this.d = list;
        this.q = i3;
        this.x = str;
        this.y = str2;
        this.Y1 = str3;
        this.Z1 = list2;
        this.a2 = i4;
        this.b2 = i5;
        this.c2 = str4;
        this.d2 = z;
        this.e2 = z2;
        this.f2 = z3;
        this.g2 = z4;
        this.h2 = z5;
        this.i2 = map;
        this.j2 = str5;
    }
}
