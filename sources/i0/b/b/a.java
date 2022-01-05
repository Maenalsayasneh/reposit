package i0.b.b;

import androidx.activity.ComponentActivity;
import h0.q.o0;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: MavericksViewModelFactory.kt */
public final class a extends j0 {
    public final ComponentActivity a;
    public final Object b;
    public final o0 c;
    public final h0.x.a d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ComponentActivity componentActivity, Object obj, o0 o0Var, h0.x.a aVar) {
        super((f) null);
        i.e(componentActivity, "activity");
        i.e(o0Var, "owner");
        i.e(aVar, "savedStateRegistry");
        this.a = componentActivity;
        this.b = obj;
        this.c = o0Var;
        this.d = aVar;
    }

    public ComponentActivity a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public o0 c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && i.a(this.c, aVar.c) && i.a(this.d, aVar.d);
    }

    public int hashCode() {
        ComponentActivity componentActivity = this.a;
        int i = 0;
        int hashCode = (componentActivity != null ? componentActivity.hashCode() : 0) * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        o0 o0Var = this.c;
        int hashCode3 = (hashCode2 + (o0Var != null ? o0Var.hashCode() : 0)) * 31;
        h0.x.a aVar = this.d;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ActivityViewModelContext(activity=");
        P0.append(this.a);
        P0.append(", args=");
        P0.append(this.b);
        P0.append(", owner=");
        P0.append(this.c);
        P0.append(", savedStateRegistry=");
        P0.append(this.d);
        P0.append(")");
        return P0.toString();
    }
}
