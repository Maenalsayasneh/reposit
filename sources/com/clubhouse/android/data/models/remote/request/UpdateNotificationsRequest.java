package com.clubhouse.android.data.models.remote.request;

import androidx.core.app.FrameMetricsAggregator;
import com.clubhouse.android.data.models.local.notification.NotificationEnableSetting;
import com.clubhouse.android.data.models.local.notification.NotificationFrequency;
import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.e.b.b3.a.a.e.g;
import i0.e.b.b3.a.a.e.h;
import i0.e.b.b3.a.a.e.i;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: UpdateNotificationsRequest.kt */
public final class UpdateNotificationsRequest {
    public static final Companion Companion = new Companion((f) null);
    public final NotificationEnableSetting a;
    public final NotificationEnableSetting b;
    public final NotificationEnableSetting c;
    public final NotificationEnableSetting d;
    public final NotificationEnableSetting e;
    public final NotificationPause f;
    public final String g;
    public final NotificationEnableSetting h;
    public final NotificationFrequency i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/remote/request/UpdateNotificationsRequest$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/remote/request/UpdateNotificationsRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: UpdateNotificationsRequest.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<UpdateNotificationsRequest> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: UpdateNotificationsRequest.kt */
    public static final class a implements v<UpdateNotificationsRequest> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest", aVar, 9);
            pluginGeneratedSerialDescriptor.i("enable_room", true);
            pluginGeneratedSerialDescriptor.i("enable_chat", true);
            pluginGeneratedSerialDescriptor.i("enable_trending", true);
            pluginGeneratedSerialDescriptor.i("enable_other", true);
            pluginGeneratedSerialDescriptor.i("enable_send_fewer", true);
            pluginGeneratedSerialDescriptor.i("pause_till", true);
            pluginGeneratedSerialDescriptor.i("fcm_token", true);
            pluginGeneratedSerialDescriptor.i("system_enabled", true);
            pluginGeneratedSerialDescriptor.i("frequency", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            g gVar = g.a;
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(gVar), m0.r.t.a.r.m.a1.a.R1(gVar), m0.r.t.a.r.m.a1.a.R1(gVar), m0.r.t.a.r.m.a1.a.R1(gVar), m0.r.t.a.r.m.a1.a.R1(gVar), m0.r.t.a.r.m.a1.a.R1(i.a), m0.r.t.a.r.m.a1.a.R1(g1.b), m0.r.t.a.r.m.a1.a.R1(gVar), m0.r.t.a.r.m.a1.a.R1(h.a)};
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r20) {
            /*
                r19 = this;
                r0 = r20
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 6
                r4 = 0
                r5 = 8
                r6 = 3
                r7 = 5
                r8 = 7
                r9 = 1
                r10 = 0
                r11 = 2
                r12 = 4
                if (r2 == 0) goto L_0x0051
                i0.e.b.b3.a.a.e.g r2 = i0.e.b.b3.a.a.e.g.a
                java.lang.Object r10 = r0.v(r1, r10, r2, r4)
                java.lang.Object r9 = r0.v(r1, r9, r2, r4)
                java.lang.Object r11 = r0.v(r1, r11, r2, r4)
                java.lang.Object r6 = r0.v(r1, r6, r2, r4)
                java.lang.Object r12 = r0.v(r1, r12, r2, r4)
                i0.e.b.b3.a.a.e.i r13 = i0.e.b.b3.a.a.e.i.a
                java.lang.Object r7 = r0.v(r1, r7, r13, r4)
                n0.c.k.g1 r13 = n0.c.k.g1.b
                java.lang.Object r3 = r0.v(r1, r3, r13, r4)
                java.lang.Object r2 = r0.v(r1, r8, r2, r4)
                i0.e.b.b3.a.a.e.h r8 = i0.e.b.b3.a.a.e.h.a
                java.lang.Object r4 = r0.v(r1, r5, r8, r4)
                r5 = 511(0x1ff, float:7.16E-43)
                r14 = r9
                r9 = r6
                r6 = r5
                goto L_0x00df
            L_0x0051:
                r2 = r4
                r11 = r2
                r13 = r11
                r14 = r13
                r15 = r14
                r16 = r15
                r17 = r9
                r6 = r10
                r9 = r16
                r10 = r9
            L_0x005e:
                if (r17 == 0) goto L_0x00d4
                int r12 = r0.x(r1)
                switch(r12) {
                    case -1: goto L_0x00cb;
                    case 0: goto L_0x00be;
                    case 1: goto L_0x00b3;
                    case 2: goto L_0x00a8;
                    case 3: goto L_0x009d;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x007f;
                    case 7: goto L_0x0076;
                    case 8: goto L_0x006d;
                    default: goto L_0x0067;
                }
            L_0x0067:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r12)
                throw r0
            L_0x006d:
                i0.e.b.b3.a.a.e.h r12 = i0.e.b.b3.a.a.e.h.a
                java.lang.Object r4 = r0.v(r1, r5, r12, r4)
                r6 = r6 | 256(0x100, float:3.59E-43)
                goto L_0x0087
            L_0x0076:
                i0.e.b.b3.a.a.e.g r12 = i0.e.b.b3.a.a.e.g.a
                java.lang.Object r10 = r0.v(r1, r8, r12, r10)
                r6 = r6 | 128(0x80, float:1.794E-43)
                goto L_0x0087
            L_0x007f:
                n0.c.k.g1 r12 = n0.c.k.g1.b
                java.lang.Object r2 = r0.v(r1, r3, r12, r2)
                r6 = r6 | 64
            L_0x0087:
                r5 = 0
                goto L_0x00d0
            L_0x0089:
                i0.e.b.b3.a.a.e.i r12 = i0.e.b.b3.a.a.e.i.a
                java.lang.Object r13 = r0.v(r1, r7, r12, r13)
                r6 = r6 | 32
            L_0x0091:
                r12 = 4
                goto L_0x005e
            L_0x0093:
                i0.e.b.b3.a.a.e.g r12 = i0.e.b.b3.a.a.e.g.a
                r3 = 4
                java.lang.Object r11 = r0.v(r1, r3, r12, r11)
                r6 = r6 | 16
                goto L_0x0087
            L_0x009d:
                r3 = 4
                i0.e.b.b3.a.a.e.g r12 = i0.e.b.b3.a.a.e.g.a
                r3 = 3
                java.lang.Object r9 = r0.v(r1, r3, r12, r9)
                r6 = r6 | 8
                goto L_0x0087
            L_0x00a8:
                r3 = 3
                i0.e.b.b3.a.a.e.g r12 = i0.e.b.b3.a.a.e.g.a
                r3 = 2
                java.lang.Object r15 = r0.v(r1, r3, r12, r15)
                r6 = r6 | 4
                goto L_0x0087
            L_0x00b3:
                r3 = 2
                i0.e.b.b3.a.a.e.g r12 = i0.e.b.b3.a.a.e.g.a
                r3 = 1
                java.lang.Object r14 = r0.v(r1, r3, r12, r14)
                r6 = r6 | 2
                goto L_0x0087
            L_0x00be:
                r3 = 1
                i0.e.b.b3.a.a.e.g r12 = i0.e.b.b3.a.a.e.g.a
                r3 = r16
                r5 = 0
                java.lang.Object r16 = r0.v(r1, r5, r12, r3)
                r6 = r6 | 1
                goto L_0x00d0
            L_0x00cb:
                r3 = r16
                r5 = 0
                r17 = r5
            L_0x00d0:
                r3 = 6
                r5 = 8
                goto L_0x0091
            L_0x00d4:
                r3 = r16
                r12 = r11
                r7 = r13
                r11 = r15
                r18 = r3
                r3 = r2
                r2 = r10
                r10 = r18
            L_0x00df:
                r0.b(r1)
                com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest r0 = new com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest
                r1 = r10
                com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r1 = (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r1
                r8 = r14
                com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r8 = (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8
                r10 = r11
                com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r10 = (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10
                r11 = r9
                com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r11 = (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11
                com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r12 = (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r12
                r13 = r7
                com.clubhouse.android.data.models.local.notification.NotificationPause r13 = (com.clubhouse.android.data.models.local.notification.NotificationPause) r13
                java.lang.String r3 = (java.lang.String) r3
                r14 = r2
                com.clubhouse.android.data.models.local.notification.NotificationEnableSetting r14 = (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14
                r15 = r4
                com.clubhouse.android.data.models.local.notification.NotificationFrequency r15 = (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15
                r5 = r0
                r7 = r1
                r9 = r10
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r3
                r5.<init>((int) r6, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r7, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r8, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r9, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r10, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r11, (com.clubhouse.android.data.models.local.notification.NotificationPause) r12, (java.lang.String) r13, (com.clubhouse.android.data.models.local.notification.NotificationEnableSetting) r14, (com.clubhouse.android.data.models.local.notification.NotificationFrequency) r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.remote.request.UpdateNotificationsRequest.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            UpdateNotificationsRequest updateNotificationsRequest = (UpdateNotificationsRequest) obj;
            m0.n.b.i.e(encoder, "encoder");
            m0.n.b.i.e(updateNotificationsRequest, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            m0.n.b.i.e(updateNotificationsRequest, "self");
            m0.n.b.i.e(c, "output");
            m0.n.b.i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || updateNotificationsRequest.a != NotificationEnableSetting.NULL) {
                c.l(serialDescriptor, 0, g.a, updateNotificationsRequest.a);
            }
            if (c.v(serialDescriptor, 1) || updateNotificationsRequest.b != NotificationEnableSetting.NULL) {
                c.l(serialDescriptor, 1, g.a, updateNotificationsRequest.b);
            }
            if (c.v(serialDescriptor, 2) || updateNotificationsRequest.c != NotificationEnableSetting.NULL) {
                c.l(serialDescriptor, 2, g.a, updateNotificationsRequest.c);
            }
            if (c.v(serialDescriptor, 3) || updateNotificationsRequest.d != NotificationEnableSetting.NULL) {
                c.l(serialDescriptor, 3, g.a, updateNotificationsRequest.d);
            }
            if (c.v(serialDescriptor, 4) || updateNotificationsRequest.e != NotificationEnableSetting.NULL) {
                c.l(serialDescriptor, 4, g.a, updateNotificationsRequest.e);
            }
            if (c.v(serialDescriptor, 5) || updateNotificationsRequest.f != NotificationPause.NULL) {
                c.l(serialDescriptor, 5, i.a, updateNotificationsRequest.f);
            }
            if (c.v(serialDescriptor, 6) || updateNotificationsRequest.g != null) {
                c.l(serialDescriptor, 6, g1.b, updateNotificationsRequest.g);
            }
            if (c.v(serialDescriptor, 7) || updateNotificationsRequest.h != NotificationEnableSetting.NULL) {
                c.l(serialDescriptor, 7, g.a, updateNotificationsRequest.h);
            }
            if (c.v(serialDescriptor, 8) || updateNotificationsRequest.i != NotificationFrequency.NULL) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 8, h.a, updateNotificationsRequest.i);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    public UpdateNotificationsRequest() {
        this((NotificationEnableSetting) null, (NotificationEnableSetting) null, (NotificationEnableSetting) null, (NotificationEnableSetting) null, (NotificationEnableSetting) null, (NotificationPause) null, (String) null, (NotificationEnableSetting) null, (NotificationFrequency) null, (int) FrameMetricsAggregator.EVERY_DURATION);
    }

    public UpdateNotificationsRequest(int i2, NotificationEnableSetting notificationEnableSetting, NotificationEnableSetting notificationEnableSetting2, NotificationEnableSetting notificationEnableSetting3, NotificationEnableSetting notificationEnableSetting4, NotificationEnableSetting notificationEnableSetting5, NotificationPause notificationPause, String str, NotificationEnableSetting notificationEnableSetting6, NotificationFrequency notificationFrequency) {
        if ((i2 & 0) == 0) {
            this.a = (i2 & 1) == 0 ? NotificationEnableSetting.NULL : notificationEnableSetting;
            if ((i2 & 2) == 0) {
                this.b = NotificationEnableSetting.NULL;
            } else {
                this.b = notificationEnableSetting2;
            }
            if ((i2 & 4) == 0) {
                this.c = NotificationEnableSetting.NULL;
            } else {
                this.c = notificationEnableSetting3;
            }
            if ((i2 & 8) == 0) {
                this.d = NotificationEnableSetting.NULL;
            } else {
                this.d = notificationEnableSetting4;
            }
            if ((i2 & 16) == 0) {
                this.e = NotificationEnableSetting.NULL;
            } else {
                this.e = notificationEnableSetting5;
            }
            if ((i2 & 32) == 0) {
                this.f = NotificationPause.NULL;
            } else {
                this.f = notificationPause;
            }
            if ((i2 & 64) == 0) {
                this.g = null;
            } else {
                this.g = str;
            }
            if ((i2 & 128) == 0) {
                this.h = NotificationEnableSetting.NULL;
            } else {
                this.h = notificationEnableSetting6;
            }
            if ((i2 & 256) == 0) {
                this.i = NotificationFrequency.NULL;
            } else {
                this.i = notificationFrequency;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i2, 0, a.b);
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateNotificationsRequest)) {
            return false;
        }
        UpdateNotificationsRequest updateNotificationsRequest = (UpdateNotificationsRequest) obj;
        return this.a == updateNotificationsRequest.a && this.b == updateNotificationsRequest.b && this.c == updateNotificationsRequest.c && this.d == updateNotificationsRequest.d && this.e == updateNotificationsRequest.e && this.f == updateNotificationsRequest.f && m0.n.b.i.a(this.g, updateNotificationsRequest.g) && this.h == updateNotificationsRequest.h && this.i == updateNotificationsRequest.i;
    }

    public int hashCode() {
        NotificationEnableSetting notificationEnableSetting = this.a;
        int i2 = 0;
        int hashCode = (notificationEnableSetting == null ? 0 : notificationEnableSetting.hashCode()) * 31;
        NotificationEnableSetting notificationEnableSetting2 = this.b;
        int hashCode2 = (hashCode + (notificationEnableSetting2 == null ? 0 : notificationEnableSetting2.hashCode())) * 31;
        NotificationEnableSetting notificationEnableSetting3 = this.c;
        int hashCode3 = (hashCode2 + (notificationEnableSetting3 == null ? 0 : notificationEnableSetting3.hashCode())) * 31;
        NotificationEnableSetting notificationEnableSetting4 = this.d;
        int hashCode4 = (hashCode3 + (notificationEnableSetting4 == null ? 0 : notificationEnableSetting4.hashCode())) * 31;
        NotificationEnableSetting notificationEnableSetting5 = this.e;
        int hashCode5 = (hashCode4 + (notificationEnableSetting5 == null ? 0 : notificationEnableSetting5.hashCode())) * 31;
        NotificationPause notificationPause = this.f;
        int hashCode6 = (hashCode5 + (notificationPause == null ? 0 : notificationPause.hashCode())) * 31;
        String str = this.g;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        NotificationEnableSetting notificationEnableSetting6 = this.h;
        int hashCode8 = (hashCode7 + (notificationEnableSetting6 == null ? 0 : notificationEnableSetting6.hashCode())) * 31;
        NotificationFrequency notificationFrequency = this.i;
        if (notificationFrequency != null) {
            i2 = notificationFrequency.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateNotificationsRequest(enableRoom=");
        P0.append(this.a);
        P0.append(", enableChat=");
        P0.append(this.b);
        P0.append(", enableTrending=");
        P0.append(this.c);
        P0.append(", enableOther=");
        P0.append(this.d);
        P0.append(", enableSendFewer=");
        P0.append(this.e);
        P0.append(", pauseTill=");
        P0.append(this.f);
        P0.append(", fcmToken=");
        P0.append(this.g);
        P0.append(", systemEnabled=");
        P0.append(this.h);
        P0.append(", frequency=");
        P0.append(this.i);
        P0.append(')');
        return P0.toString();
    }

    public UpdateNotificationsRequest(NotificationEnableSetting notificationEnableSetting, NotificationEnableSetting notificationEnableSetting2, NotificationEnableSetting notificationEnableSetting3, NotificationEnableSetting notificationEnableSetting4, NotificationEnableSetting notificationEnableSetting5, NotificationPause notificationPause, String str, NotificationEnableSetting notificationEnableSetting6, NotificationFrequency notificationFrequency, int i2) {
        notificationEnableSetting = (i2 & 1) != 0 ? NotificationEnableSetting.NULL : notificationEnableSetting;
        notificationEnableSetting2 = (i2 & 2) != 0 ? NotificationEnableSetting.NULL : notificationEnableSetting2;
        notificationEnableSetting3 = (i2 & 4) != 0 ? NotificationEnableSetting.NULL : notificationEnableSetting3;
        notificationEnableSetting4 = (i2 & 8) != 0 ? NotificationEnableSetting.NULL : notificationEnableSetting4;
        notificationEnableSetting5 = (i2 & 16) != 0 ? NotificationEnableSetting.NULL : notificationEnableSetting5;
        notificationPause = (i2 & 32) != 0 ? NotificationPause.NULL : notificationPause;
        NotificationFrequency notificationFrequency2 = null;
        str = (i2 & 64) != 0 ? null : str;
        notificationEnableSetting6 = (i2 & 128) != 0 ? NotificationEnableSetting.NULL : notificationEnableSetting6;
        notificationFrequency2 = (i2 & 256) != 0 ? NotificationFrequency.NULL : notificationFrequency2;
        this.a = notificationEnableSetting;
        this.b = notificationEnableSetting2;
        this.c = notificationEnableSetting3;
        this.d = notificationEnableSetting4;
        this.e = notificationEnableSetting5;
        this.f = notificationPause;
        this.g = str;
        this.h = notificationEnableSetting6;
        this.i = notificationFrequency2;
    }
}
