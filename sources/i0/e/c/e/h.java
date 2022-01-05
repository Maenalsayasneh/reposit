package i0.e.c.e;

import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.clubhouse.android.user.model.User;
import i0.b.b.b;
import i0.b.b.g0;
import i0.b.b.j;
import i0.e.b.a3.d.a;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: BackchannelCreateChatViewModel.kt */
public final class h implements j {
    public final CreateChatArgs a;
    public final Set<User> b;
    public final b<List<a<User>>> c;
    public final b<i0.e.c.f.b.a.a> d;
    public final boolean e;

    public h() {
        this((CreateChatArgs) null, (Set) null, (b) null, (b) null, 15, (f) null);
    }

    public h(CreateChatArgs createChatArgs, Set<? extends User> set, b<? extends List<a<User>>> bVar, b<i0.e.c.f.b.a.a> bVar2) {
        i.e(set, "selectedUsers");
        i.e(bVar, "results");
        i.e(bVar2, "chatRequest");
        this.a = createChatArgs;
        this.b = set;
        this.c = bVar;
        this.d = bVar2;
        this.e = !set.isEmpty();
    }

    public static h copy$default(h hVar, CreateChatArgs createChatArgs, Set<User> set, b<List<a<User>>> bVar, b<i0.e.c.f.b.a.a> bVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            createChatArgs = hVar.a;
        }
        if ((i & 2) != 0) {
            set = hVar.b;
        }
        if ((i & 4) != 0) {
            bVar = hVar.c;
        }
        if ((i & 8) != 0) {
            bVar2 = hVar.d;
        }
        Objects.requireNonNull(hVar);
        i.e(set, "selectedUsers");
        i.e(bVar, "results");
        i.e(bVar2, "chatRequest");
        return new h(createChatArgs, set, bVar, bVar2);
    }

    public final CreateChatArgs component1() {
        return this.a;
    }

    public final Set<User> component2() {
        return this.b;
    }

    public final b<List<a<User>>> component3() {
        return this.c;
    }

    public final b<i0.e.c.f.b.a.a> component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.a, hVar.a) && i.a(this.b, hVar.b) && i.a(this.c, hVar.c) && i.a(this.d, hVar.d);
    }

    public int hashCode() {
        CreateChatArgs createChatArgs = this.a;
        return this.d.hashCode() + ((this.c.hashCode() + i0.d.a.a.a.I(this.b, (createChatArgs == null ? 0 : createChatArgs.hashCode()) * 31, 31)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("CreateChatState(args=");
        P0.append(this.a);
        P0.append(", selectedUsers=");
        P0.append(this.b);
        P0.append(", results=");
        P0.append(this.c);
        P0.append(", chatRequest=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(CreateChatArgs createChatArgs, Set set, b bVar, b bVar2, int i, f fVar) {
        this((i & 1) != 0 ? null : createChatArgs, (i & 2) != 0 ? EmptySet.c : set, (i & 4) != 0 ? g0.b : bVar, (i & 8) != 0 ? g0.b : bVar2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(CreateChatArgs createChatArgs) {
        this(createChatArgs, (Set) null, (b) null, (b) null, 14, (f) null);
        i.e(createChatArgs, "createCharArgs");
    }
}
