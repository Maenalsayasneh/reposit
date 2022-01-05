package i0.e.c.f.b.a;

import androidx.core.app.NotificationCompat;
import com.clubhouse.backchannel.data.models.local.DeliveryStatus;
import com.clubhouse.backchannel.data.models.local.Position;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import j$.time.OffsetDateTime;
import m0.n.b.i;

/* compiled from: BackchannelMessage.kt */
public abstract class c {

    /* compiled from: BackchannelMessage.kt */
    public static final class a extends c implements f {
        public final OffsetDateTime a;
        public final Integer b;
        public final String c;
        public final Position d;
        public final boolean e;
        public final ChatMember f;
        public final int g;
        public final DeliveryStatus h;
        public final String i;
        public final ChatDestination j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(OffsetDateTime offsetDateTime, Integer num, String str, Position position, boolean z, ChatMember chatMember, int i2, DeliveryStatus deliveryStatus, String str2, ChatDestination chatDestination) {
            super((m0.n.b.f) null);
            i.e(offsetDateTime, "timeReceived");
            i.e(str, "clientMessageId");
            i.e(position, "position");
            i.e(chatMember, NotificationCompat.MessagingStyle.Message.KEY_SENDER);
            i.e(deliveryStatus, "deliveryStatus");
            i.e(str2, "messageBody");
            i.e(chatDestination, "chatDestination");
            this.a = offsetDateTime;
            this.b = num;
            this.c = str;
            this.d = position;
            this.e = z;
            this.f = chatMember;
            this.g = i2;
            this.h = deliveryStatus;
            this.i = str2;
            this.j = chatDestination;
        }

        public boolean a() {
            return this.e;
        }

        public Position b() {
            return this.d;
        }

        public int c() {
            return this.g;
        }

        public c d(Position position) {
            i.e(position, "position");
            OffsetDateTime offsetDateTime = this.a;
            Integer num = this.b;
            String str = this.c;
            boolean z = this.e;
            ChatMember chatMember = this.f;
            int i2 = this.g;
            DeliveryStatus deliveryStatus = this.h;
            String str2 = this.i;
            ChatDestination chatDestination = this.j;
            i.e(offsetDateTime, "timeReceived");
            i.e(str, "clientMessageId");
            i.e(position, "position");
            i.e(chatMember, NotificationCompat.MessagingStyle.Message.KEY_SENDER);
            i.e(deliveryStatus, "deliveryStatus");
            i.e(str2, "messageBody");
            i.e(chatDestination, "chatDestination");
            return new a(offsetDateTime, num, str, position, z, chatMember, i2, deliveryStatus, str2, chatDestination);
        }

        public Integer e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c) && this.d == aVar.d && this.e == aVar.e && i.a(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h && i.a(this.i, aVar.i) && this.j == aVar.j;
        }

        public OffsetDateTime f() {
            return this.a;
        }

        public int hashCode() {
            int i2;
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            if (num == null) {
                i2 = 0;
            } else {
                i2 = num.hashCode();
            }
            int hashCode2 = (this.d.hashCode() + i0.d.a.a.a.F(this.c, (hashCode + i2) * 31, 31)) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            int hashCode3 = this.f.hashCode();
            int M = i0.d.a.a.a.M(this.g, (hashCode3 + ((hashCode2 + (z ? 1 : 0)) * 31)) * 31, 31);
            return this.j.hashCode() + i0.d.a.a.a.F(this.i, (this.h.hashCode() + M) * 31, 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Chat(timeReceived=");
            P0.append(this.a);
            P0.append(", messageId=");
            P0.append(this.b);
            P0.append(", clientMessageId=");
            P0.append(this.c);
            P0.append(", position=");
            P0.append(this.d);
            P0.append(", isSelf=");
            P0.append(this.e);
            P0.append(", sender=");
            P0.append(this.f);
            P0.append(", senderId=");
            P0.append(this.g);
            P0.append(", deliveryStatus=");
            P0.append(this.h);
            P0.append(", messageBody=");
            P0.append(this.i);
            P0.append(", chatDestination=");
            P0.append(this.j);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: BackchannelMessage.kt */
    public static final class b extends c {
        public final OffsetDateTime a;
        public final Integer b;
        public final String c;
        public final ChatMember d;
        public final ChatMember e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(OffsetDateTime offsetDateTime, Integer num, String str, ChatMember chatMember, ChatMember chatMember2) {
            super((m0.n.b.f) null);
            i.e(offsetDateTime, "timeReceived");
            i.e(str, "clientMessageId");
            i.e(chatMember, "addedBy");
            i.e(chatMember2, "memberAdded");
            this.a = offsetDateTime;
            this.b = num;
            this.c = str;
            this.d = chatMember;
            this.e = chatMember2;
        }

        public Integer e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && i.a(this.b, bVar.b) && i.a(this.c, bVar.c) && i.a(this.d, bVar.d) && i.a(this.e, bVar.e);
        }

        public OffsetDateTime f() {
            return this.a;
        }

        public int hashCode() {
            int i;
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            if (num == null) {
                i = 0;
            } else {
                i = num.hashCode();
            }
            int F = i0.d.a.a.a.F(this.c, (hashCode + i) * 31, 31);
            return this.e.hashCode() + ((this.d.hashCode() + F) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("MemberAdded(timeReceived=");
            P0.append(this.a);
            P0.append(", messageId=");
            P0.append(this.b);
            P0.append(", clientMessageId=");
            P0.append(this.c);
            P0.append(", addedBy=");
            P0.append(this.d);
            P0.append(", memberAdded=");
            P0.append(this.e);
            P0.append(')');
            return P0.toString();
        }
    }

    /* renamed from: i0.e.c.f.b.a.c$c  reason: collision with other inner class name */
    /* compiled from: BackchannelMessage.kt */
    public static final class C0216c extends c {
        public final OffsetDateTime a;
        public final Integer b;
        public final String c;
        public final ChatMember d;
        public final ChatMember e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0216c(OffsetDateTime offsetDateTime, Integer num, String str, ChatMember chatMember, ChatMember chatMember2) {
            super((m0.n.b.f) null);
            i.e(offsetDateTime, "timeReceived");
            i.e(str, "clientMessageId");
            i.e(chatMember, "removedBy");
            i.e(chatMember2, "memberRemoved");
            this.a = offsetDateTime;
            this.b = num;
            this.c = str;
            this.d = chatMember;
            this.e = chatMember2;
        }

        public Integer e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0216c)) {
                return false;
            }
            C0216c cVar = (C0216c) obj;
            return i.a(this.a, cVar.a) && i.a(this.b, cVar.b) && i.a(this.c, cVar.c) && i.a(this.d, cVar.d) && i.a(this.e, cVar.e);
        }

        public OffsetDateTime f() {
            return this.a;
        }

        public int hashCode() {
            int i;
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            if (num == null) {
                i = 0;
            } else {
                i = num.hashCode();
            }
            int F = i0.d.a.a.a.F(this.c, (hashCode + i) * 31, 31);
            return this.e.hashCode() + ((this.d.hashCode() + F) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("MemberRemoved(timeReceived=");
            P0.append(this.a);
            P0.append(", messageId=");
            P0.append(this.b);
            P0.append(", clientMessageId=");
            P0.append(this.c);
            P0.append(", removedBy=");
            P0.append(this.d);
            P0.append(", memberRemoved=");
            P0.append(this.e);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: BackchannelMessage.kt */
    public static final class d extends c {
        public final OffsetDateTime a;
        public final Integer b = null;
        public final CharSequence c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(OffsetDateTime offsetDateTime, Integer num, CharSequence charSequence, int i) {
            super((m0.n.b.f) null);
            int i2 = i & 2;
            i.e(offsetDateTime, "timeReceived");
            i.e(charSequence, "displayTime");
            this.a = offsetDateTime;
            this.c = charSequence;
        }

        public Integer e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return i.a(this.a, dVar.a) && i.a(this.b, dVar.b) && i.a(this.c, dVar.c);
        }

        public OffsetDateTime f() {
            return this.a;
        }

        public int hashCode() {
            int i;
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            if (num == null) {
                i = 0;
            } else {
                i = num.hashCode();
            }
            return this.c.hashCode() + ((hashCode + i) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("TimeDivider(timeReceived=");
            P0.append(this.a);
            P0.append(", messageId=");
            P0.append(this.b);
            P0.append(", displayTime=");
            P0.append(this.c);
            P0.append(')');
            return P0.toString();
        }
    }

    /* compiled from: BackchannelMessage.kt */
    public static final class e extends c implements f {
        public final OffsetDateTime a;
        public final Integer b;
        public final String c;
        public final Position d;
        public final boolean e;
        public final int f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(OffsetDateTime offsetDateTime, Integer num, String str, Position position, boolean z, int i) {
            super((m0.n.b.f) null);
            i.e(offsetDateTime, "timeReceived");
            i.e(str, "clientMessageId");
            i.e(position, "position");
            this.a = offsetDateTime;
            this.b = num;
            this.c = str;
            this.d = position;
            this.e = z;
            this.f = i;
        }

        public boolean a() {
            return this.e;
        }

        public Position b() {
            return this.d;
        }

        public int c() {
            return this.f;
        }

        public c d(Position position) {
            i.e(position, "position");
            OffsetDateTime offsetDateTime = this.a;
            Integer num = this.b;
            String str = this.c;
            boolean z = this.e;
            int i = this.f;
            i.e(offsetDateTime, "timeReceived");
            i.e(str, "clientMessageId");
            i.e(position, "position");
            return new e(offsetDateTime, num, str, position, z, i);
        }

        public Integer e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return i.a(this.a, eVar.a) && i.a(this.b, eVar.b) && i.a(this.c, eVar.c) && this.d == eVar.d && this.e == eVar.e && this.f == eVar.f;
        }

        public OffsetDateTime f() {
            return this.a;
        }

        public int hashCode() {
            int i;
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            if (num == null) {
                i = 0;
            } else {
                i = num.hashCode();
            }
            int hashCode2 = (this.d.hashCode() + i0.d.a.a.a.F(this.c, (hashCode + i) * 31, 31)) * 31;
            boolean z = this.e;
            if (z) {
                z = true;
            }
            return Integer.hashCode(this.f) + ((hashCode2 + (z ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Unavailable(timeReceived=");
            P0.append(this.a);
            P0.append(", messageId=");
            P0.append(this.b);
            P0.append(", clientMessageId=");
            P0.append(this.c);
            P0.append(", position=");
            P0.append(this.d);
            P0.append(", isSelf=");
            P0.append(this.e);
            P0.append(", senderId=");
            return i0.d.a.a.a.s0(P0, this.f, ')');
        }
    }

    /* compiled from: BackchannelMessage.kt */
    public interface f {
        boolean a();

        Position b();

        int c();

        c d(Position position);
    }

    public c() {
    }

    public abstract Integer e();

    public abstract OffsetDateTime f();

    public c(m0.n.b.f fVar) {
    }
}
