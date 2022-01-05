package i0.e.b.g3.o.w0;

import com.clubhouse.android.data.models.local.user.UserInList;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import java.util.List;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class k0 implements c {
    public final List<UserInList> a;

    public k0(List<UserInList> list) {
        i.e(list, "newCoHosts");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && i.a(this.a, ((k0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("UpdateCoHosts(newCoHosts="), this.a, ')');
    }
}
