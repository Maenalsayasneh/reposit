package i0.e.b.g3.n;

import com.clubhouse.android.data.models.local.user.UserInList;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import java.util.List;
import m0.n.b.i;

/* compiled from: CreateChannelViewModel.kt */
public final class o implements c {
    public final List<UserInList> a;

    public o(List<UserInList> list) {
        i.e(list, "users");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && i.a(this.a, ((o) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("ChooseUsers(users="), this.a, ')');
    }
}
