package i0.e.b.g3.l;

import i0.e.b.a3.b.c;
import i0.e.b.g3.l.y2.a;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class r2 implements c {
    public final a a;

    public r2(a aVar) {
        i.e(aVar, "upsellType");
        this.a = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2) && i.a(this.a, ((r2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UpdateMigrationUpsellShown(upsellType=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
