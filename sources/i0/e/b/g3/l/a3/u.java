package i0.e.b.g3.l.a3;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ClubNominationsViewModel.kt */
public final class u implements c {
    public final int a;
    public final Integer b;

    public u(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && i.a(this.b, uVar.b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("RejectNomination(userId=");
        P0.append(this.a);
        P0.append(", nominationId=");
        return a.v0(P0, this.b, ')');
    }
}
