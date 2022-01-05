package com.clubhouse.android.data.models.local;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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
import n0.c.k.h0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: EventInClub.kt */
public final class EventInClub implements i0.e.b.b3.a.a.a, i0.e.b.b3.a.a.b, Parcelable {
    public static final Parcelable.Creator<EventInClub> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final int Y1;
    public final String Z1;
    public final String a2;
    public final List<UserInList> b2;
    public final ClubWithAdmin c;
    public final OffsetDateTime c2;
    public final boolean d;
    public final boolean d2;
    public final String e2;
    public final String f2;
    public final boolean g2;
    public final Map<String, Object> h2;
    public final String i2;
    public final boolean q;
    public final Boolean x;
    public final String y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/EventInClub$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/EventInClub;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: EventInClub.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<EventInClub> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: EventInClub.kt */
    public static final class a implements v<EventInClub> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.EventInClub", aVar, 16);
            pluginGeneratedSerialDescriptor.i("club", false);
            pluginGeneratedSerialDescriptor.i("club_is_member", true);
            pluginGeneratedSerialDescriptor.i("club_is_invited", true);
            pluginGeneratedSerialDescriptor.i("is_attending", true);
            pluginGeneratedSerialDescriptor.i("club_invite_url", true);
            pluginGeneratedSerialDescriptor.i("event_id", true);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, true);
            pluginGeneratedSerialDescriptor.i("name", true);
            pluginGeneratedSerialDescriptor.i("hosts", true);
            pluginGeneratedSerialDescriptor.i("time_start", true);
            pluginGeneratedSerialDescriptor.i("is_member_only", true);
            pluginGeneratedSerialDescriptor.i("url", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("is_expired", true);
            pluginGeneratedSerialDescriptor.i("logging_context", true);
            pluginGeneratedSerialDescriptor.i("reason", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            h hVar = h.b;
            g1 g1Var = g1.b;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), hVar, hVar, m0.r.t.a.r.m.a1.a.R1(hVar), m0.r.t.a.r.m.a1.a.R1(g1Var), e0.b, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(UserInList.a.a)), m0.r.t.a.r.m.a1.a.R1(new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0])), hVar, m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), hVar, m0.r.t.a.r.m.a1.a.R1(new h0(g1Var, i0.e.b.b3.a.b.c.a.a)), m0.r.t.a.r.m.a1.a.R1(g1Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0129, code lost:
            r36 = r7;
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x013b, code lost:
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0184, code lost:
            r14 = r2;
            r12 = r12;
            r13 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x01a9, code lost:
            r7 = r36;
            r2 = 15;
            r11 = r11;
            r10 = r10;
            r13 = r13;
            r12 = r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x01ad, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x01c0, code lost:
            r4 = r2;
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x01e7, code lost:
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x01f8, code lost:
            r14 = r4;
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x01f9, code lost:
            r7 = r36;
            r2 = 15;
            r13 = r13;
            r12 = r12;
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0219, code lost:
            r27 = r4;
            r7 = r36;
            r2 = 15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
            r13 = r13;
            r12 = r12;
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
            r13 = r13;
            r12 = r12;
            r11 = r11;
            r10 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
            r13 = r13;
            r12 = r12;
            r11 = r11;
            r10 = r10;
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
                r10 = 3
                r11 = 5
                r12 = 6
                r13 = 7
                r14 = 1
                r15 = 2
                r3 = 4
                r4 = 8
                r5 = 0
                r6 = 0
                if (r2 == 0) goto L_0x00b0
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                java.lang.Object r2 = r0.v(r1, r5, r2, r6)
                boolean r14 = r0.s(r1, r14)
                boolean r15 = r0.s(r1, r15)
                n0.c.k.h r7 = n0.c.k.h.b
                java.lang.Object r7 = r0.v(r1, r10, r7, r6)
                n0.c.k.g1 r10 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r3, r10, r6)
                int r11 = r0.k(r1, r11)
                java.lang.Object r12 = r0.v(r1, r12, r10, r6)
                java.lang.Object r13 = r0.v(r1, r13, r10, r6)
                n0.c.k.e r8 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r9 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r8.<init>(r9)
                java.lang.Object r4 = r0.v(r1, r4, r8, r6)
                n0.c.a r8 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r9 = j$.time.OffsetDateTime.class
                m0.r.d r9 = m0.n.b.m.a(r9)
                kotlinx.serialization.KSerializer[] r5 = new kotlinx.serialization.KSerializer[r5]
                r8.<init>(r9, r6, r5)
                r5 = 9
                java.lang.Object r5 = r0.v(r1, r5, r8, r6)
                r8 = 10
                boolean r8 = r0.s(r1, r8)
                r9 = 11
                java.lang.Object r9 = r0.v(r1, r9, r10, r6)
                r19 = r2
                r2 = 12
                java.lang.Object r2 = r0.v(r1, r2, r10, r6)
                r6 = 13
                boolean r6 = r0.s(r1, r6)
                r17 = r2
                n0.c.k.h0 r2 = new n0.c.k.h0
                r18 = r3
                i0.e.b.b3.a.b.c.a r3 = i0.e.b.b3.a.b.c.a.a
                r2.<init>(r10, r3)
                r16 = r4
                r3 = 14
                r4 = 0
                java.lang.Object r2 = r0.v(r1, r3, r2, r4)
                r3 = 15
                java.lang.Object r3 = r0.v(r1, r3, r10, r4)
                r4 = 65535(0xffff, float:9.1834E-41)
                r10 = r2
                r33 = r6
                r30 = r8
                r25 = r11
                r21 = r14
                r22 = r15
                r2 = r19
                r19 = r4
                r11 = r9
                r4 = r16
                r9 = r3
                r3 = r18
                goto L_0x023a
            L_0x00b0:
                r2 = 15
                r26 = r5
                r28 = r26
                r30 = r28
                r33 = r30
                r34 = r33
                r35 = r14
                r3 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r15 = 0
                r27 = 0
                r14 = r34
            L_0x00cc:
                if (r35 == 0) goto L_0x0223
                int r4 = r0.x(r1)
                switch(r4) {
                    case -1: goto L_0x0211;
                    case 0: goto L_0x0200;
                    case 1: goto L_0x01e9;
                    case 2: goto L_0x01d8;
                    case 3: goto L_0x01c4;
                    case 4: goto L_0x01b0;
                    case 5: goto L_0x019b;
                    case 6: goto L_0x0188;
                    case 7: goto L_0x0174;
                    case 8: goto L_0x015f;
                    case 9: goto L_0x0141;
                    case 10: goto L_0x012c;
                    case 11: goto L_0x011b;
                    case 12: goto L_0x010c;
                    case 13: goto L_0x0101;
                    case 14: goto L_0x00ef;
                    case 15: goto L_0x00db;
                    default: goto L_0x00d5;
                }
            L_0x00d5:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r4)
                throw r0
            L_0x00db:
                n0.c.k.g1 r4 = n0.c.k.g1.b
                java.lang.Object r4 = r0.v(r1, r2, r4, r9)
                r9 = 32768(0x8000, float:4.5918E-41)
                r9 = r9 | r14
                r36 = r7
                r14 = r9
                r2 = 1
                r5 = 3
                r7 = 9
                r9 = r4
                goto L_0x01f9
            L_0x00ef:
                n0.c.k.h0 r4 = new n0.c.k.h0
                n0.c.k.g1 r2 = n0.c.k.g1.b
                i0.e.b.b3.a.b.c.a r5 = i0.e.b.b3.a.b.c.a.a
                r4.<init>(r2, r5)
                r2 = 14
                java.lang.Object r10 = r0.v(r1, r2, r4, r10)
                r4 = r14 | 16384(0x4000, float:2.2959E-41)
                goto L_0x0129
            L_0x0101:
                r2 = 14
                r5 = 13
                boolean r26 = r0.s(r1, r5)
                r4 = r14 | 8192(0x2000, float:1.14794E-41)
                goto L_0x0129
            L_0x010c:
                r2 = 14
                r5 = 13
                n0.c.k.g1 r4 = n0.c.k.g1.b
                r2 = 12
                java.lang.Object r7 = r0.v(r1, r2, r4, r7)
                r4 = r14 | 4096(0x1000, float:5.74E-42)
                goto L_0x0129
            L_0x011b:
                r2 = 12
                r5 = 13
                n0.c.k.g1 r4 = n0.c.k.g1.b
                r2 = 11
                java.lang.Object r11 = r0.v(r1, r2, r4, r11)
                r4 = r14 | 2048(0x800, float:2.87E-42)
            L_0x0129:
                r36 = r7
                goto L_0x013b
            L_0x012c:
                r2 = 11
                r4 = 10
                r5 = 13
                boolean r28 = r0.s(r1, r4)
                r14 = r14 | 1024(0x400, float:1.435E-42)
                r36 = r7
                r4 = r14
            L_0x013b:
                r2 = 1
                r5 = 3
                r7 = 9
                goto L_0x01f8
            L_0x0141:
                r4 = 10
                r5 = 13
                n0.c.a r2 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r17 = j$.time.OffsetDateTime.class
                m0.r.d r4 = m0.n.b.m.a(r17)
                r36 = r7
                r5 = 0
                kotlinx.serialization.KSerializer[] r7 = new kotlinx.serialization.KSerializer[r5]
                r5 = 0
                r2.<init>(r4, r5, r7)
                r7 = 9
                java.lang.Object r3 = r0.v(r1, r7, r2, r3)
                r2 = r14 | 512(0x200, float:7.175E-43)
                goto L_0x01c0
            L_0x015f:
                r36 = r7
                r5 = 0
                r7 = 9
                n0.c.k.e r2 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.UserInList$a r4 = com.clubhouse.android.data.models.local.user.UserInList.a.a
                r2.<init>(r4)
                r4 = 8
                java.lang.Object r15 = r0.v(r1, r4, r2, r15)
                r2 = r14 | 256(0x100, float:3.59E-43)
                goto L_0x0184
            L_0x0174:
                r36 = r7
                r4 = 8
                r5 = 0
                r7 = 9
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r5 = 7
                java.lang.Object r13 = r0.v(r1, r5, r2, r13)
                r2 = r14 | 128(0x80, float:1.794E-43)
            L_0x0184:
                r14 = r2
                r2 = 5
                r5 = 6
                goto L_0x01a9
            L_0x0188:
                r36 = r7
                r4 = 8
                r5 = 7
                r7 = 9
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r5 = 6
                java.lang.Object r12 = r0.v(r1, r5, r2, r12)
                r2 = r14 | 64
                r14 = r2
                r2 = 5
                goto L_0x01a9
            L_0x019b:
                r36 = r7
                r2 = 5
                r4 = 8
                r5 = 6
                r7 = 9
                int r30 = r0.k(r1, r2)
                r14 = r14 | 32
            L_0x01a9:
                r7 = r36
                r2 = 15
            L_0x01ad:
                r5 = 0
                goto L_0x00cc
            L_0x01b0:
                r36 = r7
                r4 = 8
                r5 = 6
                r7 = 9
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r5 = 4
                java.lang.Object r8 = r0.v(r1, r5, r2, r8)
                r2 = r14 | 16
            L_0x01c0:
                r4 = r2
                r2 = 1
                r5 = 3
                goto L_0x01f8
            L_0x01c4:
                r36 = r7
                r4 = 8
                r5 = 4
                r7 = 9
                n0.c.k.h r2 = n0.c.k.h.b
                r4 = r27
                r5 = 3
                java.lang.Object r27 = r0.v(r1, r5, r2, r4)
                r2 = r14 | 8
                r4 = r2
                goto L_0x01e7
            L_0x01d8:
                r36 = r7
                r4 = r27
                r2 = 2
                r5 = 3
                r7 = 9
                boolean r34 = r0.s(r1, r2)
                r14 = r14 | 4
                r4 = r14
            L_0x01e7:
                r2 = 1
                goto L_0x01f8
            L_0x01e9:
                r36 = r7
                r4 = r27
                r2 = 1
                r5 = 3
                r7 = 9
                boolean r33 = r0.s(r1, r2)
                r14 = r14 | 2
                r4 = r14
            L_0x01f8:
                r14 = r4
            L_0x01f9:
                r7 = r36
                r2 = 15
                r4 = 8
                goto L_0x01ad
            L_0x0200:
                r36 = r7
                r4 = r27
                r5 = 3
                r7 = 9
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r5 = 0
                java.lang.Object r6 = r0.v(r1, r5, r2, r6)
                r14 = r14 | 1
                goto L_0x0219
            L_0x0211:
                r36 = r7
                r4 = r27
                r7 = 9
                r35 = r5
            L_0x0219:
                r27 = r4
                r7 = r36
                r2 = 15
                r4 = 8
                goto L_0x00cc
            L_0x0223:
                r36 = r7
                r4 = r27
                r5 = r3
                r7 = r4
                r2 = r6
                r3 = r8
                r19 = r14
                r4 = r15
                r25 = r30
                r21 = r33
                r22 = r34
                r17 = r36
                r33 = r26
                r30 = r28
            L_0x023a:
                r0.b(r1)
                com.clubhouse.android.data.models.local.EventInClub r0 = new com.clubhouse.android.data.models.local.EventInClub
                r18 = r0
                r20 = r2
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r20 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r20
                r23 = r7
                java.lang.Boolean r23 = (java.lang.Boolean) r23
                r24 = r3
                java.lang.String r24 = (java.lang.String) r24
                r26 = r12
                java.lang.String r26 = (java.lang.String) r26
                r27 = r13
                java.lang.String r27 = (java.lang.String) r27
                r28 = r4
                java.util.List r28 = (java.util.List) r28
                r29 = r5
                j$.time.OffsetDateTime r29 = (j$.time.OffsetDateTime) r29
                r31 = r11
                java.lang.String r31 = (java.lang.String) r31
                r32 = r17
                java.lang.String r32 = (java.lang.String) r32
                r34 = r10
                java.util.Map r34 = (java.util.Map) r34
                r35 = r9
                java.lang.String r35 = (java.lang.String) r35
                r18.<init>((int) r19, (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r20, (boolean) r21, (boolean) r22, (java.lang.Boolean) r23, (java.lang.String) r24, (int) r25, (java.lang.String) r26, (java.lang.String) r27, (java.util.List) r28, (j$.time.OffsetDateTime) r29, (boolean) r30, (java.lang.String) r31, (java.lang.String) r32, (boolean) r33, (java.util.Map) r34, (java.lang.String) r35)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.EventInClub.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            EventInClub eventInClub = (EventInClub) obj;
            i.e(encoder, "encoder");
            i.e(eventInClub, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(eventInClub, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.l(serialDescriptor, 0, ClubWithAdmin.a.a, eventInClub.c);
            if (c.v(serialDescriptor, 1) || eventInClub.d) {
                c.r(serialDescriptor, 1, eventInClub.d);
            }
            if (c.v(serialDescriptor, 2) || eventInClub.q) {
                c.r(serialDescriptor, 2, eventInClub.q);
            }
            if (c.v(serialDescriptor, 3) || eventInClub.x != null) {
                c.l(serialDescriptor, 3, h.b, eventInClub.x);
            }
            if (c.v(serialDescriptor, 4) || eventInClub.y != null) {
                c.l(serialDescriptor, 4, g1.b, eventInClub.y);
            }
            if (c.v(serialDescriptor, 5) || eventInClub.Y1 != 0) {
                c.q(serialDescriptor, 5, eventInClub.Y1);
            }
            if (c.v(serialDescriptor, 6) || eventInClub.Z1 != null) {
                c.l(serialDescriptor, 6, g1.b, eventInClub.Z1);
            }
            if (c.v(serialDescriptor, 7) || eventInClub.a2 != null) {
                c.l(serialDescriptor, 7, g1.b, eventInClub.a2);
            }
            if (c.v(serialDescriptor, 8) || eventInClub.b2 != null) {
                c.l(serialDescriptor, 8, new n0.c.k.e(UserInList.a.a), eventInClub.b2);
            }
            if (c.v(serialDescriptor, 9) || eventInClub.c2 != null) {
                c.l(serialDescriptor, 9, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), eventInClub.c2);
            }
            if (c.v(serialDescriptor, 10) || eventInClub.d2) {
                c.r(serialDescriptor, 10, eventInClub.d2);
            }
            if (c.v(serialDescriptor, 11) || eventInClub.e2 != null) {
                c.l(serialDescriptor, 11, g1.b, eventInClub.e2);
            }
            if (c.v(serialDescriptor, 12) || eventInClub.f2 != null) {
                c.l(serialDescriptor, 12, g1.b, eventInClub.f2);
            }
            if (c.v(serialDescriptor, 13) || eventInClub.g2) {
                c.r(serialDescriptor, 13, eventInClub.g2);
            }
            if (c.v(serialDescriptor, 14) || eventInClub.h2 != null) {
                c.l(serialDescriptor, 14, new h0(g1.b, i0.e.b.b3.a.b.c.a.a), eventInClub.h2);
            }
            if (c.v(serialDescriptor, 15) || eventInClub.i2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 15, g1.b, eventInClub.i2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: EventInClub.kt */
    public static final class b implements Parcelable.Creator<EventInClub> {
        public Object createFromParcel(Parcel parcel) {
            Boolean bool;
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            ClubWithAdmin createFromParcel = parcel.readInt() == 0 ? null : ClubWithAdmin.CREATOR.createFromParcel(parcel2);
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt2);
                for (int i = 0; i != readInt2; i = i0.d.a.a.a.n(UserInList.CREATOR, parcel2, arrayList2, i, 1)) {
                }
                arrayList = arrayList2;
            }
            OffsetDateTime offsetDateTime = (OffsetDateTime) parcel.readSerializable();
            boolean z3 = parcel.readInt() != 0;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                int i2 = 0;
                while (i2 != readInt3) {
                    i2 = i0.d.a.a.a.y(EventInClub.class, parcel, linkedHashMap2, parcel.readString(), i2, 1);
                    linkedHashMap2 = linkedHashMap2;
                    readInt3 = readInt3;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new EventInClub(createFromParcel, z, z2, bool, readString, readInt, readString2, readString3, arrayList, offsetDateTime, z3, readString4, readString5, z4, linkedHashMap, parcel.readString());
        }

        public Object[] newArray(int i) {
            return new EventInClub[i];
        }
    }

    public EventInClub(int i, ClubWithAdmin clubWithAdmin, boolean z, boolean z2, Boolean bool, String str, int i3, String str2, String str3, List list, OffsetDateTime offsetDateTime, boolean z3, String str4, String str5, boolean z4, Map map, String str6) {
        int i4 = i;
        if (1 == (i4 & 1)) {
            this.c = clubWithAdmin;
            if ((i4 & 2) == 0) {
                this.d = false;
            } else {
                this.d = z;
            }
            if ((i4 & 4) == 0) {
                this.q = false;
            } else {
                this.q = z2;
            }
            if ((i4 & 8) == 0) {
                this.x = null;
            } else {
                this.x = bool;
            }
            if ((i4 & 16) == 0) {
                this.y = null;
            } else {
                this.y = str;
            }
            if ((i4 & 32) == 0) {
                this.Y1 = 0;
            } else {
                this.Y1 = i3;
            }
            if ((i4 & 64) == 0) {
                this.Z1 = null;
            } else {
                this.Z1 = str2;
            }
            if ((i4 & 128) == 0) {
                this.a2 = null;
            } else {
                this.a2 = str3;
            }
            if ((i4 & 256) == 0) {
                this.b2 = null;
            } else {
                this.b2 = list;
            }
            if ((i4 & 512) == 0) {
                this.c2 = null;
            } else {
                this.c2 = offsetDateTime;
            }
            if ((i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                this.d2 = false;
            } else {
                this.d2 = z3;
            }
            if ((i4 & 2048) == 0) {
                this.e2 = null;
            } else {
                this.e2 = str4;
            }
            if ((i4 & 4096) == 0) {
                this.f2 = null;
            } else {
                this.f2 = str5;
            }
            if ((i4 & 8192) == 0) {
                this.g2 = false;
            } else {
                this.g2 = z4;
            }
            if ((i4 & 16384) == 0) {
                this.h2 = null;
            } else {
                this.h2 = map;
            }
            if ((i4 & 32768) == 0) {
                this.i2 = null;
            } else {
                this.i2 = str6;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 1, a.b);
            throw null;
        }
    }

    public static EventInClub d(EventInClub eventInClub, ClubWithAdmin clubWithAdmin, boolean z, boolean z2, Boolean bool, String str, int i, String str2, String str3, List list, OffsetDateTime offsetDateTime, boolean z3, String str4, String str5, boolean z4, Map map, String str6, int i3) {
        EventInClub eventInClub2 = eventInClub;
        int i4 = i3;
        ClubWithAdmin clubWithAdmin2 = (i4 & 1) != 0 ? eventInClub2.c : clubWithAdmin;
        boolean z5 = (i4 & 2) != 0 ? eventInClub2.d : z;
        boolean z6 = (i4 & 4) != 0 ? eventInClub2.q : z2;
        Boolean bool2 = (i4 & 8) != 0 ? eventInClub2.x : bool;
        String str7 = (i4 & 16) != 0 ? eventInClub2.y : null;
        int i5 = (i4 & 32) != 0 ? eventInClub2.Y1 : i;
        String str8 = (i4 & 64) != 0 ? eventInClub2.Z1 : str2;
        String str9 = (i4 & 128) != 0 ? eventInClub2.a2 : str3;
        List<UserInList> list2 = (i4 & 256) != 0 ? eventInClub2.b2 : null;
        OffsetDateTime offsetDateTime2 = (i4 & 512) != 0 ? eventInClub2.c2 : offsetDateTime;
        boolean z7 = (i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? eventInClub2.d2 : z3;
        String str10 = (i4 & 2048) != 0 ? eventInClub2.e2 : null;
        String str11 = (i4 & 4096) != 0 ? eventInClub2.f2 : null;
        boolean z8 = (i4 & 8192) != 0 ? eventInClub2.g2 : z4;
        Map<String, Object> map2 = (i4 & 16384) != 0 ? eventInClub2.h2 : null;
        String str12 = (i4 & 32768) != 0 ? eventInClub2.i2 : null;
        Objects.requireNonNull(eventInClub);
        return new EventInClub(clubWithAdmin2, z5, z6, bool2, str7, i5, str8, str9, list2, offsetDateTime2, z7, str10, str11, z8, map2, str12);
    }

    public String a() {
        return this.i2;
    }

    public Map<String, Object> c() {
        return this.h2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventInClub)) {
            return false;
        }
        EventInClub eventInClub = (EventInClub) obj;
        return i.a(this.c, eventInClub.c) && this.d == eventInClub.d && this.q == eventInClub.q && i.a(this.x, eventInClub.x) && i.a(this.y, eventInClub.y) && this.Y1 == eventInClub.Y1 && i.a(this.Z1, eventInClub.Z1) && i.a(this.a2, eventInClub.a2) && i.a(this.b2, eventInClub.b2) && i.a(this.c2, eventInClub.c2) && this.d2 == eventInClub.d2 && i.a(this.e2, eventInClub.e2) && i.a(this.f2, eventInClub.f2) && this.g2 == eventInClub.g2 && i.a(this.h2, eventInClub.h2) && i.a(this.i2, eventInClub.i2);
    }

    public int getId() {
        return this.Y1;
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
        ClubWithAdmin clubWithAdmin = this.c;
        int i10 = 0;
        int hashCode = (clubWithAdmin == null ? 0 : clubWithAdmin.hashCode()) * 31;
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
        Boolean bool = this.x;
        if (bool == null) {
            i = 0;
        } else {
            i = bool.hashCode();
        }
        int i13 = (i12 + i) * 31;
        String str = this.y;
        int M = i0.d.a.a.a.M(this.Y1, (i13 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.Z1;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i14 = (M + i3) * 31;
        String str3 = this.a2;
        if (str3 == null) {
            i4 = 0;
        } else {
            i4 = str3.hashCode();
        }
        int i15 = (i14 + i4) * 31;
        List<UserInList> list = this.b2;
        if (list == null) {
            i5 = 0;
        } else {
            i5 = list.hashCode();
        }
        int i16 = (i15 + i5) * 31;
        OffsetDateTime offsetDateTime = this.c2;
        if (offsetDateTime == null) {
            i6 = 0;
        } else {
            i6 = offsetDateTime.hashCode();
        }
        int i17 = (i16 + i6) * 31;
        boolean z4 = this.d2;
        if (z4) {
            z4 = true;
        }
        int i18 = (i17 + (z4 ? 1 : 0)) * 31;
        String str4 = this.e2;
        if (str4 == null) {
            i7 = 0;
        } else {
            i7 = str4.hashCode();
        }
        int i19 = (i18 + i7) * 31;
        String str5 = this.f2;
        if (str5 == null) {
            i8 = 0;
        } else {
            i8 = str5.hashCode();
        }
        int i20 = (i19 + i8) * 31;
        boolean z5 = this.g2;
        if (!z5) {
            z2 = z5;
        }
        int i21 = (i20 + (z2 ? 1 : 0)) * 31;
        Map<String, Object> map = this.h2;
        if (map == null) {
            i9 = 0;
        } else {
            i9 = map.hashCode();
        }
        int i22 = (i21 + i9) * 31;
        String str6 = this.i2;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return i22 + i10;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("EventInClub(club=");
        P0.append(this.c);
        P0.append(", clubIsMember=");
        P0.append(this.d);
        P0.append(", clubIsInvited=");
        P0.append(this.q);
        P0.append(", isAttending=");
        P0.append(this.x);
        P0.append(", clubInviteUrl=");
        P0.append(this.y);
        P0.append(", id=");
        P0.append(this.Y1);
        P0.append(", description=");
        P0.append(this.Z1);
        P0.append(", name=");
        P0.append(this.a2);
        P0.append(", hosts=");
        P0.append(this.b2);
        P0.append(", timeStart=");
        P0.append(this.c2);
        P0.append(", isMemberOnly=");
        P0.append(this.d2);
        P0.append(", url=");
        P0.append(this.e2);
        P0.append(", channel=");
        P0.append(this.f2);
        P0.append(", isExpired=");
        P0.append(this.g2);
        P0.append(", loggingContext=");
        P0.append(this.h2);
        P0.append(", reason=");
        return i0.d.a.a.a.w0(P0, this.i2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        ClubWithAdmin clubWithAdmin = this.c;
        if (clubWithAdmin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clubWithAdmin.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        Boolean bool = this.x;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.y);
        parcel.writeInt(this.Y1);
        parcel.writeString(this.Z1);
        parcel.writeString(this.a2);
        List<UserInList> list = this.b2;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (UserInList writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        parcel.writeSerializable(this.c2);
        parcel.writeInt(this.d2 ? 1 : 0);
        parcel.writeString(this.e2);
        parcel.writeString(this.f2);
        parcel.writeInt(this.g2 ? 1 : 0);
        Map<String, Object> map = this.h2;
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
        parcel.writeString(this.i2);
    }

    public EventInClub(ClubWithAdmin clubWithAdmin, boolean z, boolean z2, Boolean bool, String str, int i, String str2, String str3, List<UserInList> list, OffsetDateTime offsetDateTime, boolean z3, String str4, String str5, boolean z4, Map<String, ? extends Object> map, String str6) {
        this.c = clubWithAdmin;
        this.d = z;
        this.q = z2;
        this.x = bool;
        this.y = str;
        this.Y1 = i;
        this.Z1 = str2;
        this.a2 = str3;
        this.b2 = list;
        this.c2 = offsetDateTime;
        this.d2 = z3;
        this.e2 = str4;
        this.f2 = str5;
        this.g2 = z4;
        this.h2 = map;
        this.i2 = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EventInClub(com.clubhouse.android.data.models.local.club.ClubWithAdmin r21, boolean r22, boolean r23, java.lang.Boolean r24, java.lang.String r25, int r26, java.lang.String r27, java.lang.String r28, java.util.List r29, j$.time.OffsetDateTime r30, boolean r31, java.lang.String r32, java.lang.String r33, boolean r34, java.util.Map r35, java.lang.String r36, int r37) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r22
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r23
        L_0x0013:
            r1 = r0 & 8
            r7 = 0
            r1 = r0 & 16
            r8 = 0
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001f
            r9 = r2
            goto L_0x0021
        L_0x001f:
            r9 = r26
        L_0x0021:
            r1 = r0 & 64
            r10 = 0
            r1 = r0 & 128(0x80, float:1.794E-43)
            r11 = 0
            r1 = r0 & 256(0x100, float:3.59E-43)
            r12 = 0
            r1 = r0 & 512(0x200, float:7.175E-43)
            r13 = 0
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0033
            r14 = r2
            goto L_0x0035
        L_0x0033:
            r14 = r31
        L_0x0035:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r15 = 0
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r16 = 0
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0043
            r17 = r2
            goto L_0x0045
        L_0x0043:
            r17 = r34
        L_0x0045:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r18 = 0
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            r19 = 0
            r3 = r20
            r4 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.EventInClub.<init>(com.clubhouse.android.data.models.local.club.ClubWithAdmin, boolean, boolean, java.lang.Boolean, java.lang.String, int, java.lang.String, java.lang.String, java.util.List, j$.time.OffsetDateTime, boolean, java.lang.String, java.lang.String, boolean, java.util.Map, java.lang.String, int):void");
    }
}
