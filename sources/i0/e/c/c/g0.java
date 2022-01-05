package i0.e.c.c;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import java.util.List;
import m0.n.b.i;

/* compiled from: BackchannelChatViewModel.kt */
public final class g0 implements b {
    public final List<ChatMember> a;

    public g0(List<ChatMember> list) {
        i.e(list, "blockedUsers");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && i.a(this.a, ((g0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("ShowBlockWarning(blockedUsers="), this.a, ')');
    }
}
