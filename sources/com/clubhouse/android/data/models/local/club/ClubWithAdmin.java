package com.clubhouse.android.data.models.local.club;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
/* compiled from: ClubWithAdmin.kt */
public final class ClubWithAdmin implements Club {
    public static final Parcelable.Creator<ClubWithAdmin> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final String Y1;
    public final String Z1;
    public final List<ClubRule> a2;
    public final int b2;
    public final boolean c;
    public final int c2;
    public final boolean d;
    public final String d2;
    public final boolean e2;
    public final boolean f2;
    public final boolean g2;
    public final boolean h2;
    public final boolean i2;
    public final Map<String, Object> j2;
    public final String k2;
    public final boolean q;
    public final int x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/club/ClubWithAdmin$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/club/ClubWithAdmin;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ClubWithAdmin.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ClubWithAdmin> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ClubWithAdmin.kt */
    public static final class a implements v<ClubWithAdmin> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.club.ClubWithAdmin", aVar, 18);
            pluginGeneratedSerialDescriptor.i("is_admin", true);
            pluginGeneratedSerialDescriptor.i("is_leader", true);
            pluginGeneratedSerialDescriptor.i("is_member", true);
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
            h hVar = h.b;
            e0 e0Var = e0.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{hVar, hVar, hVar, e0Var, g1Var, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), new n0.c.k.e(ClubRule.a.a), e0Var, e0Var, m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, hVar, hVar, hVar, hVar, m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a)), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0116, code lost:
            r4 = r4 | r14;
            r29 = r11;
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0152, code lost:
            r29 = r11;
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x01ad, code lost:
            r4 = r2;
            r29 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x01f1, code lost:
            r29 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0205, code lost:
            r11 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0216, code lost:
            r35 = r29;
            r29 = r11;
            r11 = r35;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0229, code lost:
            r2 = 17;
            r3 = 9;
            r8 = 8;
            r15 = 7;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r38) {
            /*
                r37 = this;
                r0 = r38
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 9
                r11 = 0
                r12 = 3
                r13 = 5
                r14 = 6
                r15 = 7
                r4 = 0
                r5 = 1
                r6 = 2
                r7 = 4
                r8 = 8
                if (r2 == 0) goto L_0x00b7
                boolean r2 = r0.s(r1, r4)
                boolean r4 = r0.s(r1, r5)
                boolean r5 = r0.s(r1, r6)
                int r6 = r0.k(r1, r12)
                java.lang.String r7 = r0.t(r1, r7)
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r13 = r0.v(r1, r13, r12, r11)
                java.lang.Object r14 = r0.v(r1, r14, r12, r11)
                n0.c.k.e r9 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubRule$a r10 = com.clubhouse.android.data.models.local.club.ClubRule.a.a
                r9.<init>(r10)
                java.lang.Object r9 = r0.m(r1, r15, r9, r11)
                int r8 = r0.k(r1, r8)
                int r3 = r0.k(r1, r3)
                r10 = 10
                java.lang.Object r10 = r0.v(r1, r10, r12, r11)
                r15 = 11
                boolean r15 = r0.s(r1, r15)
                r11 = 12
                boolean r11 = r0.s(r1, r11)
                r20 = r2
                r2 = 13
                boolean r2 = r0.s(r1, r2)
                r19 = r2
                r2 = 14
                boolean r2 = r0.s(r1, r2)
                r18 = r2
                r2 = 15
                boolean r2 = r0.s(r1, r2)
                r17 = r2
                n0.c.k.h0 r2 = new n0.c.k.h0
                r21 = r3
                i0.e.b.b3.a.b.c.a r3 = i0.e.b.b3.a.b.c.a.a
                r2.<init>(r12, r3)
                r16 = r4
                r3 = 0
                r4 = 16
                java.lang.Object r2 = r0.v(r1, r4, r2, r3)
                r4 = 17
                java.lang.Object r3 = r0.v(r1, r4, r12, r3)
                r4 = 262143(0x3ffff, float:3.6734E-40)
                r30 = r7
                r28 = r8
                r33 = r15
                r24 = r21
                r7 = r5
                r8 = r6
                r5 = r20
                r6 = r4
                r20 = r17
                r4 = r3
                r17 = r11
                r35 = r13
                r13 = r10
                r10 = r35
                r36 = r19
                r19 = r18
                r18 = r36
                goto L_0x024b
            L_0x00b7:
                r9 = r11
                r2 = 17
                r10 = r4
                r11 = r10
                r23 = r11
                r24 = r23
                r25 = r24
                r26 = r25
                r27 = r26
                r28 = r27
                r31 = r28
                r33 = r31
                r34 = r5
                r5 = r9
                r6 = r5
                r7 = r6
                r12 = r7
                r13 = r12
                r30 = r13
                r32 = r30
                r9 = r33
            L_0x00d9:
                if (r34 == 0) goto L_0x0233
                int r14 = r0.x(r1)
                switch(r14) {
                    case -1: goto L_0x021d;
                    case 0: goto L_0x0207;
                    case 1: goto L_0x01f5;
                    case 2: goto L_0x01e3;
                    case 3: goto L_0x01d4;
                    case 4: goto L_0x01c5;
                    case 5: goto L_0x01b3;
                    case 6: goto L_0x019f;
                    case 7: goto L_0x0185;
                    case 8: goto L_0x0175;
                    case 9: goto L_0x016a;
                    case 10: goto L_0x015b;
                    case 11: goto L_0x0146;
                    case 12: goto L_0x0139;
                    case 13: goto L_0x012c;
                    case 14: goto L_0x011f;
                    case 15: goto L_0x010b;
                    case 16: goto L_0x00f9;
                    case 17: goto L_0x00e8;
                    default: goto L_0x00e2;
                }
            L_0x00e2:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r14)
                throw r0
            L_0x00e8:
                n0.c.k.g1 r14 = n0.c.k.g1.b
                java.lang.Object r5 = r0.v(r1, r2, r14, r5)
                r14 = 131072(0x20000, float:1.83671E-40)
                r4 = r4 | r14
                r2 = 1
                r8 = 5
                r14 = 14
                r15 = 10
                goto L_0x0181
            L_0x00f9:
                n0.c.k.h0 r14 = new n0.c.k.h0
                n0.c.k.g1 r2 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r15 = i0.e.b.b3.a.b.c.a.a
                r14.<init>(r2, r15)
                r2 = 16
                java.lang.Object r12 = r0.v(r1, r2, r14, r12)
                r14 = 65536(0x10000, float:9.18355E-41)
                goto L_0x0116
            L_0x010b:
                r2 = 16
                r15 = 15
                boolean r10 = r0.s(r1, r15)
                r14 = 32768(0x8000, float:4.5918E-41)
            L_0x0116:
                r4 = r4 | r14
                r29 = r11
                r2 = 1
                r8 = 5
                r11 = 0
                r14 = 14
                goto L_0x0157
            L_0x011f:
                r2 = 16
                r14 = 14
                r15 = 15
                boolean r9 = r0.s(r1, r14)
                r4 = r4 | 16384(0x4000, float:2.2959E-41)
                goto L_0x0152
            L_0x012c:
                r2 = 13
                r14 = 14
                r15 = 15
                boolean r23 = r0.s(r1, r2)
                r4 = r4 | 8192(0x2000, float:1.14794E-41)
                goto L_0x0152
            L_0x0139:
                r2 = 12
                r14 = 14
                r15 = 15
                boolean r31 = r0.s(r1, r2)
                r4 = r4 | 4096(0x1000, float:5.74E-42)
                goto L_0x0152
            L_0x0146:
                r2 = 11
                r14 = 14
                r15 = 15
                boolean r33 = r0.s(r1, r2)
                r4 = r4 | 2048(0x800, float:2.87E-42)
            L_0x0152:
                r29 = r11
                r2 = 1
                r8 = 5
                r11 = 0
            L_0x0157:
                r15 = 10
                goto L_0x0216
            L_0x015b:
                r14 = 14
                r15 = 15
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r15 = 10
                java.lang.Object r6 = r0.v(r1, r15, r2, r6)
                r2 = r4 | 1024(0x400, float:1.435E-42)
                goto L_0x01ad
            L_0x016a:
                r14 = 14
                r15 = 10
                int r24 = r0.k(r1, r3)
                r2 = r4 | 512(0x200, float:7.175E-43)
                goto L_0x01ad
            L_0x0175:
                r14 = 14
                r15 = 10
                int r28 = r0.k(r1, r8)
                r4 = r4 | 256(0x100, float:3.59E-43)
                r2 = 1
                r8 = 5
            L_0x0181:
                r29 = 0
                goto L_0x0229
            L_0x0185:
                r14 = 14
                r15 = 10
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.club.ClubRule$a r3 = com.clubhouse.android.data.models.local.club.ClubRule.a.a
                r2.<init>(r3)
                r3 = 7
                java.lang.Object r7 = r0.m(r1, r3, r2, r7)
                r4 = r4 | 128(0x80, float:1.794E-43)
                r15 = r3
                r2 = 17
                r3 = 9
                r14 = 6
                goto L_0x00d9
            L_0x019f:
                r3 = r15
                r14 = 14
                r15 = 10
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r3 = 6
                java.lang.Object r13 = r0.v(r1, r3, r2, r13)
                r2 = r4 | 64
            L_0x01ad:
                r4 = r2
                r29 = r11
                r2 = 1
                r8 = 5
                goto L_0x0205
            L_0x01b3:
                r3 = 6
                r14 = 14
                r15 = 10
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r3 = r32
                r8 = 5
                java.lang.Object r32 = r0.v(r1, r8, r2, r3)
                r2 = r4 | 32
                r4 = r2
                goto L_0x01f1
            L_0x01c5:
                r3 = r32
                r2 = 4
                r8 = 5
                r14 = 14
                r15 = 10
                java.lang.String r30 = r0.t(r1, r2)
                r4 = r4 | 16
                goto L_0x01f1
            L_0x01d4:
                r3 = r32
                r2 = 3
                r8 = 5
                r14 = 14
                r15 = 10
                int r27 = r0.k(r1, r2)
                r4 = r4 | 8
                goto L_0x01f1
            L_0x01e3:
                r3 = r32
                r2 = 2
                r8 = 5
                r14 = 14
                r15 = 10
                boolean r26 = r0.s(r1, r2)
                r4 = r4 | 4
            L_0x01f1:
                r29 = r11
                r2 = 1
                goto L_0x0205
            L_0x01f5:
                r3 = r32
                r2 = 1
                r8 = 5
                r14 = 14
                r15 = 10
                boolean r25 = r0.s(r1, r2)
                r4 = r4 | 2
                r29 = r11
            L_0x0205:
                r11 = 0
                goto L_0x0216
            L_0x0207:
                r3 = r32
                r2 = 1
                r8 = 5
                r11 = 0
                r14 = 14
                r15 = 10
                boolean r29 = r0.s(r1, r11)
                r4 = r4 | 1
            L_0x0216:
                r35 = r29
                r29 = r11
                r11 = r35
                goto L_0x0229
            L_0x021d:
                r3 = r32
                r2 = 1
                r8 = 5
                r14 = 14
                r15 = 10
                r29 = 0
                r34 = r29
            L_0x0229:
                r2 = 17
                r3 = 9
                r8 = 8
                r14 = 6
                r15 = 7
                goto L_0x00d9
            L_0x0233:
                r3 = r32
                r19 = r9
                r20 = r10
                r2 = r12
                r14 = r13
                r18 = r23
                r16 = r25
                r8 = r27
                r17 = r31
                r10 = r3
                r13 = r6
                r9 = r7
                r7 = r26
                r6 = r4
                r4 = r5
                r5 = r11
            L_0x024b:
                r0.b(r1)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r0 = new com.clubhouse.android.data.models.local.club.ClubWithAdmin
                r3 = r0
                java.lang.String r10 = (java.lang.String) r10
                r11 = r14
                java.lang.String r11 = (java.lang.String) r11
                r12 = r9
                java.util.List r12 = (java.util.List) r12
                r15 = r13
                java.lang.String r15 = (java.lang.String) r15
                r21 = r2
                java.util.Map r21 = (java.util.Map) r21
                r22 = r4
                java.lang.String r22 = (java.lang.String) r22
                r4 = r6
                r6 = r16
                r9 = r30
                r13 = r28
                r14 = r24
                r16 = r33
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ClubWithAdmin clubWithAdmin = (ClubWithAdmin) obj;
            i.e(encoder, "encoder");
            i.e(clubWithAdmin, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(clubWithAdmin, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || clubWithAdmin.c) {
                c.r(serialDescriptor, 0, clubWithAdmin.c);
            }
            if (c.v(serialDescriptor, 1) || clubWithAdmin.d) {
                c.r(serialDescriptor, 1, clubWithAdmin.d);
            }
            if (c.v(serialDescriptor, 2) || clubWithAdmin.q) {
                c.r(serialDescriptor, 2, clubWithAdmin.q);
            }
            c.q(serialDescriptor, 3, clubWithAdmin.x);
            c.s(serialDescriptor, 4, clubWithAdmin.y);
            if (c.v(serialDescriptor, 5) || clubWithAdmin.Y1 != null) {
                c.l(serialDescriptor, 5, g1.b, clubWithAdmin.Y1);
            }
            g1 g1Var = g1.b;
            c.l(serialDescriptor, 6, g1Var, clubWithAdmin.Z1);
            if (c.v(serialDescriptor, 7) || !i.a(clubWithAdmin.a2, EmptyList.c)) {
                c.z(serialDescriptor, 7, new n0.c.k.e(ClubRule.a.a), clubWithAdmin.a2);
            }
            if (c.v(serialDescriptor, 8) || clubWithAdmin.b2 != 0) {
                c.q(serialDescriptor, 8, clubWithAdmin.b2);
            }
            if (c.v(serialDescriptor, 9) || clubWithAdmin.c2 != 0) {
                c.q(serialDescriptor, 9, clubWithAdmin.c2);
            }
            if (c.v(serialDescriptor, 10) || clubWithAdmin.d2 != null) {
                c.l(serialDescriptor, 10, g1Var, clubWithAdmin.d2);
            }
            if (c.v(serialDescriptor, 11) || clubWithAdmin.e2) {
                c.r(serialDescriptor, 11, clubWithAdmin.e2);
            }
            if (c.v(serialDescriptor, 12) || clubWithAdmin.f2) {
                c.r(serialDescriptor, 12, clubWithAdmin.f2);
            }
            if (c.v(serialDescriptor, 13) || clubWithAdmin.g2) {
                c.r(serialDescriptor, 13, clubWithAdmin.g2);
            }
            if (c.v(serialDescriptor, 14) || clubWithAdmin.h2) {
                c.r(serialDescriptor, 14, clubWithAdmin.h2);
            }
            if (c.v(serialDescriptor, 15) || clubWithAdmin.i2) {
                c.r(serialDescriptor, 15, clubWithAdmin.i2);
            }
            if (c.v(serialDescriptor, 16) || clubWithAdmin.j2 != null) {
                c.l(serialDescriptor, 16, new h0(g1Var, i0.e.b.b3.a.b.c.a.a), clubWithAdmin.j2);
            }
            if (c.v(serialDescriptor, 17) || clubWithAdmin.k2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 17, g1Var, clubWithAdmin.k2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ClubWithAdmin.kt */
    public static final class b implements Parcelable.Creator<ClubWithAdmin> {
        public Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i = i0.d.a.a.a.n(ClubRule.CREATOR, parcel2, arrayList, i, 1)) {
            }
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString4 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            boolean z6 = parcel.readInt() != 0;
            boolean z7 = parcel.readInt() != 0;
            boolean z8 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt5 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt5);
                int i2 = 0;
                while (i2 != readInt5) {
                    i2 = i0.d.a.a.a.y(ClubWithAdmin.class, parcel, linkedHashMap2, parcel.readString(), i2, 1);
                    linkedHashMap2 = linkedHashMap2;
                    readInt5 = readInt5;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ClubWithAdmin(z, z2, z3, readInt, readString, readString2, readString3, arrayList, readInt3, readInt4, readString4, z4, z5, z6, z7, z8, linkedHashMap, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new ClubWithAdmin[i];
        }
    }

    public ClubWithAdmin(int i, boolean z, boolean z2, boolean z3, int i3, String str, String str2, String str3, List list, int i4, int i5, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Map map, String str5) {
        int i6 = i;
        if (88 == (i6 & 88)) {
            if ((i6 & 1) == 0) {
                this.c = false;
            } else {
                this.c = z;
            }
            if ((i6 & 2) == 0) {
                this.d = false;
            } else {
                this.d = z2;
            }
            if ((i6 & 4) == 0) {
                this.q = false;
            } else {
                this.q = z3;
            }
            this.x = i3;
            this.y = str;
            if ((i6 & 32) == 0) {
                this.Y1 = null;
            } else {
                this.Y1 = str2;
            }
            this.Z1 = str3;
            this.a2 = (i6 & 128) == 0 ? EmptyList.c : list;
            if ((i6 & 256) == 0) {
                this.b2 = 0;
            } else {
                this.b2 = i4;
            }
            if ((i6 & 512) == 0) {
                this.c2 = 0;
            } else {
                this.c2 = i5;
            }
            if ((i6 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                this.d2 = null;
            } else {
                this.d2 = str4;
            }
            if ((i6 & 2048) == 0) {
                this.e2 = false;
            } else {
                this.e2 = z4;
            }
            if ((i6 & 4096) == 0) {
                this.f2 = false;
            } else {
                this.f2 = z5;
            }
            if ((i6 & 8192) == 0) {
                this.g2 = false;
            } else {
                this.g2 = z6;
            }
            if ((i6 & 16384) == 0) {
                this.h2 = false;
            } else {
                this.h2 = z7;
            }
            if ((32768 & i6) == 0) {
                this.i2 = false;
            } else {
                this.i2 = z8;
            }
            if ((65536 & i6) == 0) {
                this.j2 = null;
            } else {
                this.j2 = map;
            }
            if ((i6 & 131072) == 0) {
                this.k2 = null;
            } else {
                this.k2 = str5;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 88, a.b);
            throw null;
        }
    }

    public static ClubWithAdmin d(ClubWithAdmin clubWithAdmin, boolean z, boolean z2, boolean z3, int i, String str, String str2, String str3, List list, int i3, int i4, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Map map, String str5, int i5) {
        boolean z9;
        boolean z10;
        boolean z11;
        Map<String, Object> map2;
        ClubWithAdmin clubWithAdmin2 = clubWithAdmin;
        int i6 = i5;
        boolean z12 = (i6 & 1) != 0 ? clubWithAdmin2.c : z;
        boolean z13 = (i6 & 2) != 0 ? clubWithAdmin2.d : z2;
        boolean z14 = (i6 & 4) != 0 ? clubWithAdmin2.q : z3;
        int i7 = (i6 & 8) != 0 ? clubWithAdmin2.x : i;
        String str6 = (i6 & 16) != 0 ? clubWithAdmin2.y : null;
        String str7 = (i6 & 32) != 0 ? clubWithAdmin2.Y1 : null;
        String str8 = (i6 & 64) != 0 ? clubWithAdmin2.Z1 : str3;
        List list2 = (i6 & 128) != 0 ? clubWithAdmin2.a2 : list;
        int i8 = (i6 & 256) != 0 ? clubWithAdmin2.b2 : i3;
        int i9 = (i6 & 512) != 0 ? clubWithAdmin2.c2 : i4;
        String str9 = (i6 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? clubWithAdmin2.d2 : str4;
        boolean z15 = (i6 & 2048) != 0 ? clubWithAdmin2.e2 : z4;
        boolean z16 = (i6 & 4096) != 0 ? clubWithAdmin2.f2 : z5;
        boolean z17 = (i6 & 8192) != 0 ? clubWithAdmin2.g2 : z6;
        boolean z18 = (i6 & 16384) != 0 ? clubWithAdmin2.h2 : z7;
        if ((i6 & 32768) != 0) {
            z9 = z18;
            z10 = clubWithAdmin2.i2;
        } else {
            z9 = z18;
            z10 = z8;
        }
        if ((i6 & 65536) != 0) {
            z11 = z10;
            map2 = clubWithAdmin2.j2;
        } else {
            z11 = z10;
            map2 = null;
        }
        String str10 = (i6 & 131072) != 0 ? clubWithAdmin2.k2 : null;
        Objects.requireNonNull(clubWithAdmin);
        i.e(str6, "name");
        i.e(list2, "rules");
        return new ClubWithAdmin(z12, z13, z14, i7, str6, str7, str8, list2, i8, i9, str9, z15, z16, z17, z9, z11, map2, str10);
    }

    public boolean O() {
        return this.g2;
    }

    public String a() {
        return this.k2;
    }

    public String b() {
        return this.d2;
    }

    public List<ClubRule> b0() {
        return this.a2;
    }

    public Map<String, Object> c() {
        return this.j2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClubWithAdmin)) {
            return false;
        }
        ClubWithAdmin clubWithAdmin = (ClubWithAdmin) obj;
        return this.c == clubWithAdmin.c && this.d == clubWithAdmin.d && this.q == clubWithAdmin.q && this.x == clubWithAdmin.x && i.a(this.y, clubWithAdmin.y) && i.a(this.Y1, clubWithAdmin.Y1) && i.a(this.Z1, clubWithAdmin.Z1) && i.a(this.a2, clubWithAdmin.a2) && this.b2 == clubWithAdmin.b2 && this.c2 == clubWithAdmin.c2 && i.a(this.d2, clubWithAdmin.d2) && this.e2 == clubWithAdmin.e2 && this.f2 == clubWithAdmin.f2 && this.g2 == clubWithAdmin.g2 && this.h2 == clubWithAdmin.h2 && this.i2 == clubWithAdmin.i2 && i.a(this.j2, clubWithAdmin.j2) && i.a(this.k2, clubWithAdmin.k2);
    }

    public boolean f0() {
        return this.h2;
    }

    public String getDescription() {
        return this.Z1;
    }

    public int getId() {
        return this.x;
    }

    public String getName() {
        return this.y;
    }

    public int hashCode() {
        int i;
        int i3;
        int i4;
        int i5;
        boolean z = this.c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i6 = (z ? 1 : 0) * true;
        boolean z3 = this.d;
        if (z3) {
            z3 = true;
        }
        int i7 = (i6 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.q;
        if (z4) {
            z4 = true;
        }
        int F = i0.d.a.a.a.F(this.y, i0.d.a.a.a.M(this.x, (i7 + (z4 ? 1 : 0)) * 31, 31), 31);
        String str = this.Y1;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i9 = (F + i) * 31;
        String str2 = this.Z1;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int M = i0.d.a.a.a.M(this.c2, i0.d.a.a.a.M(this.b2, i0.d.a.a.a.H(this.a2, (i9 + i3) * 31, 31), 31), 31);
        String str3 = this.d2;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i10 = (M + i4) * 31;
        boolean z5 = this.e2;
        if (z5) {
            z5 = true;
        }
        int i11 = (i10 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f2;
        if (z6) {
            z6 = true;
        }
        int i12 = (i11 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.g2;
        if (z7) {
            z7 = true;
        }
        int i13 = (i12 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.h2;
        if (z8) {
            z8 = true;
        }
        int i14 = (i13 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.i2;
        if (!z9) {
            z2 = z9;
        }
        int i15 = (i14 + (z2 ? 1 : 0)) * 31;
        Map<String, Object> map = this.j2;
        if (map == null) {
            i5 = 0;
        } else {
            i5 = map.hashCode();
        }
        int i16 = (i15 + i5) * 31;
        String str4 = this.k2;
        if (str4 != null) {
            i8 = str4.hashCode();
        }
        return i16 + i8;
    }

    public int q() {
        return this.b2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ClubWithAdmin(isAdmin=");
        P0.append(this.c);
        P0.append(", isLeader=");
        P0.append(this.d);
        P0.append(", isMember=");
        P0.append(this.q);
        P0.append(", id=");
        P0.append(this.x);
        P0.append(", name=");
        P0.append(this.y);
        P0.append(", url=");
        P0.append(this.Y1);
        P0.append(", description=");
        P0.append(this.Z1);
        P0.append(", rules=");
        P0.append(this.a2);
        P0.append(", numMembers=");
        P0.append(this.b2);
        P0.append(", numFollowers=");
        P0.append(this.c2);
        P0.append(", photoUrl=");
        P0.append(this.d2);
        P0.append(", isCommunity=");
        P0.append(this.e2);
        P0.append(", isFollowAllowed=");
        P0.append(this.f2);
        P0.append(", isMembershipOpen=");
        P0.append(this.g2);
        P0.append(", isAskToJoinAllowed=");
        P0.append(this.h2);
        P0.append(", isMembershipPrivate=");
        P0.append(this.i2);
        P0.append(", loggingContext=");
        P0.append(this.j2);
        P0.append(", reason=");
        return i0.d.a.a.a.w0(P0, this.k2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.Y1);
        parcel.writeString(this.Z1);
        List<ClubRule> list = this.a2;
        parcel.writeInt(list.size());
        for (ClubRule writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.b2);
        parcel.writeInt(this.c2);
        parcel.writeString(this.d2);
        parcel.writeInt(this.e2 ? 1 : 0);
        parcel.writeInt(this.f2 ? 1 : 0);
        parcel.writeInt(this.g2 ? 1 : 0);
        parcel.writeInt(this.h2 ? 1 : 0);
        parcel.writeInt(this.i2 ? 1 : 0);
        Map<String, Object> map = this.j2;
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
        parcel.writeString(this.k2);
    }

    public ClubWithAdmin(boolean z, boolean z2, boolean z3, int i, String str, String str2, String str3, List<ClubRule> list, int i3, int i4, String str4, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Map<String, ? extends Object> map, String str5) {
        i.e(str, "name");
        i.e(list, "rules");
        this.c = z;
        this.d = z2;
        this.q = z3;
        this.x = i;
        this.y = str;
        this.Y1 = str2;
        this.Z1 = str3;
        this.a2 = list;
        this.b2 = i3;
        this.c2 = i4;
        this.d2 = str4;
        this.e2 = z4;
        this.f2 = z5;
        this.g2 = z6;
        this.h2 = z7;
        this.i2 = z8;
        this.j2 = map;
        this.k2 = str5;
    }
}
