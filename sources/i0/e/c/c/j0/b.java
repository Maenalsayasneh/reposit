package i0.e.c.c.j0;

import com.clubhouse.backchannel.R;
import i0.d.a.a.a;

/* compiled from: MessageBubbleStyle.kt */
public final class b {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public b() {
        this(0, 0, 0, 0, 15);
    }

    public b(int i, int i2, int i3, int i4, int i5) {
        i = (i5 & 1) != 0 ? R.dimen.message_radius_normal : i;
        i2 = (i5 & 2) != 0 ? R.dimen.message_radius_normal : i2;
        i3 = (i5 & 4) != 0 ? R.dimen.message_radius_normal : i3;
        i4 = (i5 & 8) != 0 ? R.dimen.message_radius_normal : i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + a.M(this.c, a.M(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("Radius(topLeft=");
        P0.append(this.a);
        P0.append(", topRight=");
        P0.append(this.b);
        P0.append(", bottomLeft=");
        P0.append(this.c);
        P0.append(", bottomRight=");
        return a.s0(P0, this.d, ')');
    }
}
