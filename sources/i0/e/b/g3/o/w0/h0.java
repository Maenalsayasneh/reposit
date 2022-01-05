package i0.e.b.g3.o.w0;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class h0 implements c {
    public final ClubWithAdmin a;

    public h0() {
        this.a = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && i.a(this.a, ((h0) obj).a);
    }

    public int hashCode() {
        ClubWithAdmin clubWithAdmin = this.a;
        if (clubWithAdmin == null) {
            return 0;
        }
        return clubWithAdmin.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SelectHostClub(selectedHostClub=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    public h0(ClubWithAdmin clubWithAdmin) {
        this.a = clubWithAdmin;
    }

    public h0(ClubWithAdmin clubWithAdmin, int i) {
        int i2 = i & 1;
        this.a = null;
    }
}
