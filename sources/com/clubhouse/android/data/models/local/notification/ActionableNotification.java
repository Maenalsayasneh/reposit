package com.clubhouse.android.data.models.local.notification;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
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
import n0.c.j.d;
import n0.c.k.e0;
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.o0;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ActionableNotification.kt */
public final class ActionableNotification implements Parcelable {
    public static final Parcelable.Creator<ActionableNotification> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final BasicUser Y1;
    public final String Z1;
    public final String a2;
    public final ClubWithAdmin b2;
    public final long c;
    public final Integer c2;
    public final ActionableNotificationType d;
    public final List<BasicUser> d2;
    public final Integer e2;
    public final OffsetDateTime q;
    public final String x;
    public final Boolean y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/notification/ActionableNotification$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/notification/ActionableNotification;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ActionableNotification.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ActionableNotification> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ActionableNotification.kt */
    public static final class a implements v<ActionableNotification> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.notification.ActionableNotification", aVar, 12);
            pluginGeneratedSerialDescriptor.i("actionable_notification_id", false);
            pluginGeneratedSerialDescriptor.i("type", false);
            pluginGeneratedSerialDescriptor.i("time_created", false);
            pluginGeneratedSerialDescriptor.i(InstabugDbContract.BugEntry.COLUMN_MESSAGE, true);
            pluginGeneratedSerialDescriptor.i("is_unread", true);
            pluginGeneratedSerialDescriptor.i("user_profile", true);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("url", true);
            pluginGeneratedSerialDescriptor.i("club", true);
            pluginGeneratedSerialDescriptor.i("event_id", true);
            pluginGeneratedSerialDescriptor.i("users", true);
            pluginGeneratedSerialDescriptor.i("count", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g1 g1Var = g1.b;
            BasicUser.a aVar = BasicUser.a.a;
            e0 e0Var = e0.b;
            return new KSerializer[]{o0.b, i0.e.b.b3.a.a.e.a.a, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(h.b), m0.r.t.a.r.m.a1.a.R1(aVar), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(g1Var), m0.r.t.a.r.m.a1.a.R1(ClubWithAdmin.a.a), m0.r.t.a.r.m.a1.a.R1(e0Var), m0.r.t.a.r.m.a1.a.R1(new n0.c.k.e(aVar)), m0.r.t.a.r.m.a1.a.R1(e0Var)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a5, code lost:
            r19 = r4;
            r18 = r5;
            r9 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00eb, code lost:
            r2 = 11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0119, code lost:
            r2 = 11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x011d, code lost:
            r10 = 10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0189, code lost:
            r24 = r9;
            r5 = r18;
            r4 = r19;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r30) {
            /*
                r29 = this;
                r0 = r30
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
                if (r2 == 0) goto L_0x0079
                long r16 = r0.h(r1, r15)
                i0.e.b.b3.a.a.e.a r2 = i0.e.b.b3.a.a.e.a.a
                java.lang.Object r2 = r0.m(r1, r11, r2, r4)
                n0.c.a r11 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r18 = j$.time.OffsetDateTime.class
                m0.r.d r3 = m0.n.b.m.a(r18)
                kotlinx.serialization.KSerializer[] r15 = new kotlinx.serialization.KSerializer[r15]
                r11.<init>(r3, r4, r15)
                java.lang.Object r3 = r0.m(r1, r12, r11, r4)
                n0.c.k.g1 r11 = n0.c.k.g1.b
                java.lang.Object r5 = r0.v(r1, r5, r11, r4)
                n0.c.k.h r12 = n0.c.k.h.b
                java.lang.Object r12 = r0.v(r1, r13, r12, r4)
                com.clubhouse.android.data.models.local.user.BasicUser$a r13 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                java.lang.Object r6 = r0.v(r1, r6, r13, r4)
                java.lang.Object r7 = r0.v(r1, r7, r11, r4)
                java.lang.Object r8 = r0.v(r1, r8, r11, r4)
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r11 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                java.lang.Object r11 = r0.v(r1, r14, r11, r4)
                n0.c.k.e0 r14 = n0.c.k.e0.b
                java.lang.Object r9 = r0.v(r1, r9, r14, r4)
                n0.c.k.e r15 = new n0.c.k.e
                r15.<init>(r13)
                java.lang.Object r10 = r0.v(r1, r10, r15, r4)
                r13 = 11
                java.lang.Object r4 = r0.v(r1, r13, r14, r4)
                r13 = 4095(0xfff, float:5.738E-42)
                r14 = r13
                r15 = r16
                goto L_0x01a5
            L_0x0079:
                r2 = 11
                r16 = 0
                r3 = r4
                r5 = r3
                r6 = r5
                r7 = r6
                r8 = r7
                r12 = r8
                r13 = r12
                r24 = r13
                r28 = r11
                r14 = r15
                r26 = r16
                r11 = r24
                r15 = r11
            L_0x008e:
                if (r28 == 0) goto L_0x0190
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x017d;
                    case 0: goto L_0x016c;
                    case 1: goto L_0x0158;
                    case 2: goto L_0x0137;
                    case 3: goto L_0x0121;
                    case 4: goto L_0x010b;
                    case 5: goto L_0x00fd;
                    case 6: goto L_0x00ee;
                    case 7: goto L_0x00de;
                    case 8: goto L_0x00d0;
                    case 9: goto L_0x00c2;
                    case 10: goto L_0x00b1;
                    case 11: goto L_0x009d;
                    default: goto L_0x0097;
                }
            L_0x0097:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x009d:
                n0.c.k.e0 r9 = n0.c.k.e0.b
                java.lang.Object r12 = r0.v(r1, r2, r9, r12)
                r14 = r14 | 2048(0x800, float:2.87E-42)
            L_0x00a5:
                r19 = r4
                r18 = r5
                r9 = r24
                r2 = 0
                r4 = 0
                r5 = 2
            L_0x00ae:
                r10 = 1
                goto L_0x0189
            L_0x00b1:
                n0.c.k.e r9 = new n0.c.k.e
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r9.<init>(r2)
                java.lang.Object r7 = r0.v(r1, r10, r9, r7)
                r2 = r14 | 1024(0x400, float:1.435E-42)
                r14 = r2
                r9 = 9
                goto L_0x00cd
            L_0x00c2:
                n0.c.k.e0 r2 = n0.c.k.e0.b
                r9 = 9
                java.lang.Object r6 = r0.v(r1, r9, r2, r6)
                r2 = r14 | 512(0x200, float:7.175E-43)
                r14 = r2
            L_0x00cd:
                r10 = 8
                goto L_0x00a5
            L_0x00d0:
                r9 = 9
                com.clubhouse.android.data.models.local.club.ClubWithAdmin$a r2 = com.clubhouse.android.data.models.local.club.ClubWithAdmin.a.a
                r10 = 8
                java.lang.Object r8 = r0.v(r1, r10, r2, r8)
                r2 = r14 | 256(0x100, float:3.59E-43)
                r14 = r2
                goto L_0x00a5
            L_0x00de:
                r9 = 9
                r10 = 8
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r10 = 7
                java.lang.Object r13 = r0.v(r1, r10, r2, r13)
                r14 = r14 | 128(0x80, float:1.794E-43)
            L_0x00eb:
                r2 = 11
                goto L_0x011d
            L_0x00ee:
                r9 = 9
                r10 = 7
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r10 = 6
                java.lang.Object r5 = r0.v(r1, r10, r2, r5)
                r2 = r14 | 64
                r14 = r2
                r10 = 5
                goto L_0x00eb
            L_0x00fd:
                r9 = 9
                r10 = 6
                com.clubhouse.android.data.models.local.user.BasicUser$a r2 = com.clubhouse.android.data.models.local.user.BasicUser.a.a
                r10 = 5
                java.lang.Object r15 = r0.v(r1, r10, r2, r15)
                r2 = r14 | 32
                r14 = r2
                goto L_0x00eb
            L_0x010b:
                r9 = 9
                r10 = 5
                n0.c.k.h r2 = n0.c.k.h.b
                r9 = r24
                r10 = 4
                java.lang.Object r24 = r0.v(r1, r10, r2, r9)
                r14 = r14 | 16
            L_0x0119:
                r2 = 11
                r9 = 9
            L_0x011d:
                r10 = 10
                goto L_0x008e
            L_0x0121:
                r9 = r24
                r10 = 4
                n0.c.k.g1 r2 = n0.c.k.g1.b
                r10 = 3
                java.lang.Object r4 = r0.v(r1, r10, r2, r4)
                r2 = r14 | 8
                r14 = r2
                r19 = r4
                r18 = r5
                r2 = 0
                r4 = 0
                r5 = 2
                goto L_0x00ae
            L_0x0137:
                r9 = r24
                r10 = 3
                n0.c.a r2 = new n0.c.a
                java.lang.Class<j$.time.OffsetDateTime> r19 = j$.time.OffsetDateTime.class
                m0.r.d r10 = m0.n.b.m.a(r19)
                r19 = r4
                r18 = r5
                r4 = 0
                kotlinx.serialization.KSerializer[] r5 = new kotlinx.serialization.KSerializer[r4]
                r4 = 0
                r2.<init>(r10, r4, r5)
                r5 = 2
                java.lang.Object r11 = r0.m(r1, r5, r2, r11)
                r2 = r14 | 4
                r14 = r2
                r2 = 0
                goto L_0x00ae
            L_0x0158:
                r19 = r4
                r18 = r5
                r9 = r24
                r4 = 0
                r5 = 2
                i0.e.b.b3.a.a.e.a r2 = i0.e.b.b3.a.a.e.a.a
                r10 = 1
                java.lang.Object r3 = r0.m(r1, r10, r2, r3)
                r2 = r14 | 2
                r14 = r2
                r2 = 0
                goto L_0x0189
            L_0x016c:
                r19 = r4
                r18 = r5
                r9 = r24
                r2 = 0
                r4 = 0
                r5 = 2
                r10 = 1
                long r26 = r0.h(r1, r2)
                r14 = r14 | 1
                goto L_0x0189
            L_0x017d:
                r19 = r4
                r18 = r5
                r9 = r24
                r2 = 0
                r4 = 0
                r5 = 2
                r10 = 1
                r28 = r2
            L_0x0189:
                r24 = r9
                r5 = r18
                r4 = r19
                goto L_0x0119
            L_0x0190:
                r19 = r4
                r18 = r5
                r9 = r24
                r2 = r3
                r10 = r7
                r3 = r11
                r4 = r12
                r7 = r18
                r5 = r19
                r11 = r8
                r12 = r9
                r8 = r13
                r9 = r6
                r6 = r15
                r15 = r26
            L_0x01a5:
                r0.b(r1)
                com.clubhouse.android.data.models.local.notification.ActionableNotification r0 = new com.clubhouse.android.data.models.local.notification.ActionableNotification
                r17 = r2
                com.clubhouse.android.data.models.local.notification.ActionableNotificationType r17 = (com.clubhouse.android.data.models.local.notification.ActionableNotificationType) r17
                r18 = r3
                j$.time.OffsetDateTime r18 = (j$.time.OffsetDateTime) r18
                r19 = r5
                java.lang.String r19 = (java.lang.String) r19
                r20 = r12
                java.lang.Boolean r20 = (java.lang.Boolean) r20
                r21 = r6
                com.clubhouse.android.data.models.local.user.BasicUser r21 = (com.clubhouse.android.data.models.local.user.BasicUser) r21
                r22 = r7
                java.lang.String r22 = (java.lang.String) r22
                r23 = r8
                java.lang.String r23 = (java.lang.String) r23
                r24 = r11
                com.clubhouse.android.data.models.local.club.ClubWithAdmin r24 = (com.clubhouse.android.data.models.local.club.ClubWithAdmin) r24
                r25 = r9
                java.lang.Integer r25 = (java.lang.Integer) r25
                r26 = r10
                java.util.List r26 = (java.util.List) r26
                r27 = r4
                java.lang.Integer r27 = (java.lang.Integer) r27
                r13 = r0
                r13.<init>(r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.notification.ActionableNotification.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ActionableNotification actionableNotification = (ActionableNotification) obj;
            i.e(encoder, "encoder");
            i.e(actionableNotification, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(actionableNotification, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            c.D(serialDescriptor, 0, actionableNotification.c);
            c.z(serialDescriptor, 1, i0.e.b.b3.a.a.e.a.a, actionableNotification.d);
            c.z(serialDescriptor, 2, new n0.c.a(m.a(OffsetDateTime.class), (KSerializer) null, new KSerializer[0]), actionableNotification.q);
            if (c.v(serialDescriptor, 3) || actionableNotification.x != null) {
                c.l(serialDescriptor, 3, g1.b, actionableNotification.x);
            }
            if (c.v(serialDescriptor, 4) || actionableNotification.y != null) {
                c.l(serialDescriptor, 4, h.b, actionableNotification.y);
            }
            if (c.v(serialDescriptor, 5) || actionableNotification.Y1 != null) {
                c.l(serialDescriptor, 5, BasicUser.a.a, actionableNotification.Y1);
            }
            if (c.v(serialDescriptor, 6) || actionableNotification.Z1 != null) {
                c.l(serialDescriptor, 6, g1.b, actionableNotification.Z1);
            }
            if (c.v(serialDescriptor, 7) || actionableNotification.a2 != null) {
                c.l(serialDescriptor, 7, g1.b, actionableNotification.a2);
            }
            if (c.v(serialDescriptor, 8) || actionableNotification.b2 != null) {
                c.l(serialDescriptor, 8, ClubWithAdmin.a.a, actionableNotification.b2);
            }
            if (c.v(serialDescriptor, 9) || actionableNotification.c2 != null) {
                c.l(serialDescriptor, 9, e0.b, actionableNotification.c2);
            }
            if (c.v(serialDescriptor, 10) || actionableNotification.d2 != null) {
                c.l(serialDescriptor, 10, new n0.c.k.e(BasicUser.a.a), actionableNotification.d2);
            }
            if (c.v(serialDescriptor, 11) || actionableNotification.e2 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 11, e0.b, actionableNotification.e2);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ActionableNotification.kt */
    public static final class b implements Parcelable.Creator<ActionableNotification> {
        public Object createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            i.e(parcel2, "parcel");
            long readLong = parcel.readLong();
            ActionableNotificationType valueOf2 = ActionableNotificationType.valueOf(parcel.readString());
            OffsetDateTime offsetDateTime = (OffsetDateTime) parcel.readSerializable();
            String readString = parcel.readString();
            int i = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Boolean bool = valueOf;
            BasicUser createFromParcel = parcel.readInt() == 0 ? null : BasicUser.CREATOR.createFromParcel(parcel2);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            ClubWithAdmin createFromParcel2 = parcel.readInt() == 0 ? null : ClubWithAdmin.CREATOR.createFromParcel(parcel2);
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (i != readInt) {
                    i = i0.d.a.a.a.n(BasicUser.CREATOR, parcel2, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            return new ActionableNotification(readLong, valueOf2, offsetDateTime, readString, bool, createFromParcel, readString2, readString3, createFromParcel2, valueOf3, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        public Object[] newArray(int i) {
            return new ActionableNotification[i];
        }
    }

    public ActionableNotification(int i, long j, ActionableNotificationType actionableNotificationType, OffsetDateTime offsetDateTime, String str, Boolean bool, BasicUser basicUser, String str2, String str3, ClubWithAdmin clubWithAdmin, Integer num, List list, Integer num2) {
        int i2 = i;
        if (7 == (i2 & 7)) {
            this.c = j;
            this.d = actionableNotificationType;
            this.q = offsetDateTime;
            if ((i2 & 8) == 0) {
                this.x = null;
            } else {
                this.x = str;
            }
            if ((i2 & 16) == 0) {
                this.y = null;
            } else {
                this.y = bool;
            }
            if ((i2 & 32) == 0) {
                this.Y1 = null;
            } else {
                this.Y1 = basicUser;
            }
            if ((i2 & 64) == 0) {
                this.Z1 = null;
            } else {
                this.Z1 = str2;
            }
            if ((i2 & 128) == 0) {
                this.a2 = null;
            } else {
                this.a2 = str3;
            }
            if ((i2 & 256) == 0) {
                this.b2 = null;
            } else {
                this.b2 = clubWithAdmin;
            }
            if ((i2 & 512) == 0) {
                this.c2 = null;
            } else {
                this.c2 = num;
            }
            if ((i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 0) {
                this.d2 = null;
            } else {
                this.d2 = list;
            }
            if ((i2 & 2048) == 0) {
                this.e2 = null;
            } else {
                this.e2 = num2;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 7, a.b);
            throw null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionableNotification)) {
            return false;
        }
        ActionableNotification actionableNotification = (ActionableNotification) obj;
        return this.c == actionableNotification.c && this.d == actionableNotification.d && i.a(this.q, actionableNotification.q) && i.a(this.x, actionableNotification.x) && i.a(this.y, actionableNotification.y) && i.a(this.Y1, actionableNotification.Y1) && i.a(this.Z1, actionableNotification.Z1) && i.a(this.a2, actionableNotification.a2) && i.a(this.b2, actionableNotification.b2) && i.a(this.c2, actionableNotification.c2) && i.a(this.d2, actionableNotification.d2) && i.a(this.e2, actionableNotification.e2);
    }

    public int hashCode() {
        int hashCode = (this.q.hashCode() + ((this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31)) * 31;
        String str = this.x;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        BasicUser basicUser = this.Y1;
        int hashCode4 = (hashCode3 + (basicUser == null ? 0 : basicUser.hashCode())) * 31;
        String str2 = this.Z1;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.a2;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ClubWithAdmin clubWithAdmin = this.b2;
        int hashCode7 = (hashCode6 + (clubWithAdmin == null ? 0 : clubWithAdmin.hashCode())) * 31;
        Integer num = this.c2;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        List<BasicUser> list = this.d2;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.e2;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActionableNotification(notificationId=");
        P0.append(this.c);
        P0.append(", type=");
        P0.append(this.d);
        P0.append(", timeCreated=");
        P0.append(this.q);
        P0.append(", message=");
        P0.append(this.x);
        P0.append(", isUnread=");
        P0.append(this.y);
        P0.append(", user=");
        P0.append(this.Y1);
        P0.append(", channel=");
        P0.append(this.Z1);
        P0.append(", url=");
        P0.append(this.a2);
        P0.append(", club=");
        P0.append(this.b2);
        P0.append(", eventId=");
        P0.append(this.c2);
        P0.append(", users=");
        P0.append(this.d2);
        P0.append(", count=");
        return i0.d.a.a.a.v0(P0, this.e2, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeLong(this.c);
        parcel.writeString(this.d.name());
        parcel.writeSerializable(this.q);
        parcel.writeString(this.x);
        Boolean bool = this.y;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        BasicUser basicUser = this.Y1;
        if (basicUser == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            basicUser.writeToParcel(parcel, i);
        }
        parcel.writeString(this.Z1);
        parcel.writeString(this.a2);
        ClubWithAdmin clubWithAdmin = this.b2;
        if (clubWithAdmin == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clubWithAdmin.writeToParcel(parcel, i);
        }
        Integer num = this.c2;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num);
        }
        List<BasicUser> list = this.d2;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (BasicUser writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        Integer num2 = this.e2;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            i0.d.a.a.a.i(parcel, 1, num2);
        }
    }

    public ActionableNotification(long j, ActionableNotificationType actionableNotificationType, OffsetDateTime offsetDateTime, String str, Boolean bool, BasicUser basicUser, String str2, String str3, ClubWithAdmin clubWithAdmin, Integer num, List<BasicUser> list, Integer num2) {
        i.e(actionableNotificationType, "type");
        i.e(offsetDateTime, "timeCreated");
        this.c = j;
        this.d = actionableNotificationType;
        this.q = offsetDateTime;
        this.x = str;
        this.y = bool;
        this.Y1 = basicUser;
        this.Z1 = str2;
        this.a2 = str3;
        this.b2 = clubWithAdmin;
        this.c2 = num;
        this.d2 = list;
        this.e2 = num2;
    }
}
