package i0.e.b.g3.p;

import com.clubhouse.backchannel.chat.ChatArgs;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: HallwayViewModel.kt */
public final class s implements b {
    public final ChatArgs a;

    public s(ChatArgs chatArgs) {
        i.e(chatArgs, "chatArgs");
        this.a = chatArgs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && i.a(this.a, ((s) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("NavigateToChat(chatArgs=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
