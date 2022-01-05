package i0.e.b.g3.r;

import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.c3.h.c;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: InvitedByViewModel.kt */
public final class l1 extends i0.e.b.a3.b.a<k1> {
    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l1(k1 k1Var) {
        super(k1Var);
        i.e(k1Var, "initialState");
    }

    /* compiled from: InvitedByViewModel.kt */
    public static final class a implements v<l1, k1> {
        public final /* synthetic */ c<l1, k1> a = new c<>(l1.class);

        public a() {
        }

        public l1 create(j0 j0Var, k1 k1Var) {
            i.e(j0Var, "viewModelContext");
            i.e(k1Var, "state");
            return this.a.create(j0Var, k1Var);
        }

        public k1 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
