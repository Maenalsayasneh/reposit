package i0.e.c.i;

import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.chat.ChatArgs;
import i0.b.b.b;
import i0.b.b.g0;
import i0.b.b.j;
import i0.e.b.a3.d.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: BackchannelMembersViewModel.kt */
public final class p implements j {
    public final String a;
    public final b<List<a<User>>> b;
    public final boolean c;

    public p(String str, b<? extends List<a<User>>> bVar, boolean z) {
        i.e(str, "chatId");
        i.e(bVar, "results");
        this.a = str;
        this.b = bVar;
        this.c = z;
    }

    public static p copy$default(p pVar, String str, b<List<a<User>>> bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pVar.a;
        }
        if ((i & 2) != 0) {
            bVar = pVar.b;
        }
        if ((i & 4) != 0) {
            z = pVar.c;
        }
        Objects.requireNonNull(pVar);
        i.e(str, "chatId");
        i.e(bVar, "results");
        return new p(str, bVar, z);
    }

    public final String component1() {
        return this.a;
    }

    public final b<List<a<User>>> component2() {
        return this.b;
    }

    public final boolean component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return i.a(this.a, pVar.a) && i.a(this.b, pVar.b) && this.c == pVar.c;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("MembersViewState(chatId=");
        P0.append(this.a);
        P0.append(", results=");
        P0.append(this.b);
        P0.append(", loading=");
        return i0.d.a.a.a.C0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, b bVar, boolean z, int i, f fVar) {
        this(str, (i & 2) != 0 ? g0.b : bVar, (i & 4) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public p(ChatArgs chatArgs) {
        this(chatArgs.c, (b) null, false, 6, (f) null);
        i.e(chatArgs, "args");
    }
}
