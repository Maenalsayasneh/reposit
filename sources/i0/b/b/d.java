package i0.b.b;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import h0.q.o0;
import h0.x.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: MavericksViewModelFactory.kt */
public final class d extends j0 {
    public final ComponentActivity a;
    public final Object b;
    public final Fragment c;
    public final o0 d;
    public final a e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ d(androidx.activity.ComponentActivity r7, java.lang.Object r8, androidx.fragment.app.Fragment r9, h0.q.o0 r10, h0.x.a r11, int r12) {
        /*
            r6 = this;
            r10 = r12 & 8
            r11 = 0
            if (r10 == 0) goto L_0x0007
            r4 = r9
            goto L_0x0008
        L_0x0007:
            r4 = r11
        L_0x0008:
            r10 = r12 & 16
            if (r10 == 0) goto L_0x0015
            h0.x.a r11 = r9.getSavedStateRegistry()
            java.lang.String r10 = "fragment.savedStateRegistry"
            m0.n.b.i.d(r11, r10)
        L_0x0015:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.b.b.d.<init>(androidx.activity.ComponentActivity, java.lang.Object, androidx.fragment.app.Fragment, h0.q.o0, h0.x.a, int):void");
    }

    public ComponentActivity a() {
        return this.a;
    }

    public Object b() {
        return this.b;
    }

    public o0 c() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.a, dVar.a) && i.a(this.b, dVar.b) && i.a(this.c, dVar.c) && i.a(this.d, dVar.d) && i.a(this.e, dVar.e);
    }

    public int hashCode() {
        ComponentActivity componentActivity = this.a;
        int i = 0;
        int hashCode = (componentActivity != null ? componentActivity.hashCode() : 0) * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Fragment fragment = this.c;
        int hashCode3 = (hashCode2 + (fragment != null ? fragment.hashCode() : 0)) * 31;
        o0 o0Var = this.d;
        int hashCode4 = (hashCode3 + (o0Var != null ? o0Var.hashCode() : 0)) * 31;
        a aVar = this.e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FragmentViewModelContext(activity=");
        P0.append(this.a);
        P0.append(", args=");
        P0.append(this.b);
        P0.append(", fragment=");
        P0.append(this.c);
        P0.append(", owner=");
        P0.append(this.d);
        P0.append(", savedStateRegistry=");
        P0.append(this.e);
        P0.append(")");
        return P0.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(ComponentActivity componentActivity, Object obj, Fragment fragment, o0 o0Var, a aVar) {
        super((f) null);
        i.e(componentActivity, "activity");
        i.e(fragment, "fragment");
        i.e(o0Var, "owner");
        i.e(aVar, "savedStateRegistry");
        this.a = componentActivity;
        this.b = obj;
        this.c = fragment;
        this.d = o0Var;
        this.e = aVar;
    }
}
