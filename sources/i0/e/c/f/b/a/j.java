package i0.e.c.f.b.a;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: BackchannelChatSegment.kt */
public final class j {
    public final Integer a;
    public final Integer b;

    public j() {
        this((Integer) null, (Integer) null, 3);
    }

    public j(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.a, jVar.a) && i.a(this.b, jVar.b);
    }

    public int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Range(beforeMessageId=");
        P0.append(this.a);
        P0.append(", afterMessageId=");
        return a.v0(P0, this.b, ')');
    }

    public j(Integer num, Integer num2, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        this.a = num;
        this.b = num2;
    }
}
