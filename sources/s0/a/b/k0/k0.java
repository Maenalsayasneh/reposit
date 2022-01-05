package s0.a.b.k0;

public class k0 extends b {
    public l0 d;

    public k0(boolean z, l0 l0Var) {
        super(z);
        this.d = l0Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        l0 l0Var = this.d;
        if (l0Var == null) {
            return k0Var.d == null;
        }
        return l0Var.equals(k0Var.d);
    }

    public int hashCode() {
        l0 l0Var = this.d;
        if (l0Var != null) {
            return l0Var.hashCode();
        }
        return 0;
    }
}
