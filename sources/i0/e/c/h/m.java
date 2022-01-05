package i0.e.c.h;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: BackchannelInboxViewModel.kt */
public final class m implements c {
    public final ChatDestination a;

    public m(ChatDestination chatDestination) {
        i.e(chatDestination, "chatDestination");
        this.a = chatDestination;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.a == ((m) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SelectTab(chatDestination=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
