package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import g0.a.b.b.a;
import h0.g.a.h.e;
import h0.g.a.h.k.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {
    public HashSet<ConstraintAnchor> a = null;
    public int b;
    public boolean c;
    public final ConstraintWidget d;
    public final Type e;
    public ConstraintAnchor f;
    public int g = 0;
    public int h = Integer.MIN_VALUE;
    public SolverVariable i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.d = constraintWidget;
        this.e = type;
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i2) {
        return b(constraintAnchor, i2, Integer.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i2, int i3, boolean z) {
        if (constraintAnchor == null) {
            k();
            return true;
        } else if (!z && !j(constraintAnchor)) {
            return false;
        } else {
            this.f = constraintAnchor;
            if (constraintAnchor.a == null) {
                constraintAnchor.a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i2;
            this.h = i3;
            return true;
        }
    }

    public void c(int i2, ArrayList<m> arrayList, m mVar) {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                a.C(it.next().d, i2, arrayList, mVar);
            }
        }
    }

    public int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public int e() {
        ConstraintAnchor constraintAnchor;
        if (this.d.f8o0 == 8) {
            return 0;
        }
        int i2 = this.h;
        if (i2 == Integer.MIN_VALUE || (constraintAnchor = this.f) == null || constraintAnchor.d.f8o0 != 8) {
            return this.g;
        }
        return i2;
    }

    public final ConstraintAnchor f() {
        switch (this.e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.d.M;
            case 2:
                return this.d.N;
            case 3:
                return this.d.K;
            case 4:
                return this.d.L;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        HashSet<ConstraintAnchor> hashSet = this.a;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean i() {
        return this.f != null;
    }

    public boolean j(ConstraintAnchor constraintAnchor) {
        boolean z = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.e;
        Type type2 = this.e;
        if (type != type2) {
            switch (type2.ordinal()) {
                case 0:
                case 7:
                case 8:
                    return false;
                case 1:
                case 3:
                    boolean z2 = type == Type.LEFT || type == Type.RIGHT;
                    if (!(constraintAnchor.d instanceof e)) {
                        return z2;
                    }
                    if (z2 || type == Type.CENTER_X) {
                        z = true;
                    }
                    return z;
                case 2:
                case 4:
                    boolean z3 = type == Type.TOP || type == Type.BOTTOM;
                    if (!(constraintAnchor.d instanceof e)) {
                        return z3;
                    }
                    if (z3 || type == Type.CENTER_Y) {
                        z = true;
                    }
                    return z;
                case 5:
                    if (type == Type.LEFT || type == Type.RIGHT) {
                        return false;
                    }
                    return true;
                case 6:
                    if (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                default:
                    throw new AssertionError(this.e.name());
            }
        } else if (type2 != Type.BASELINE || (constraintAnchor.d.F && this.d.F)) {
            return true;
        } else {
            return false;
        }
    }

    public void k() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.a) == null)) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public void l() {
        SolverVariable solverVariable = this.i;
        if (solverVariable == null) {
            this.i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.e();
        }
    }

    public void m(int i2) {
        this.b = i2;
        this.c = true;
    }

    public void n(int i2) {
        if (i()) {
            this.h = i2;
        }
    }

    public String toString() {
        return this.d.f9p0 + ":" + this.e.toString();
    }
}
