package i0.e.b.g3.q;

import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.c3.h.c;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PendingInvitesViewModel.kt */
public final class o extends i0.e.b.a3.b.a<p> {
    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(p pVar) {
        super(pVar);
        i.e(pVar, "initialState");
    }

    /* compiled from: PendingInvitesViewModel.kt */
    public static final class a implements v<o, p> {
        public final /* synthetic */ c<o, p> a = new c<>(o.class);

        public a() {
        }

        public o create(j0 j0Var, p pVar) {
            i.e(j0Var, "viewModelContext");
            i.e(pVar, "state");
            return this.a.create(j0Var, pVar);
        }

        public p initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
