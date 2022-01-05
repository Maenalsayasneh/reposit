package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import h0.g.a.d;
import h0.g.a.h.e;
import h0.g.a.h.h;
import h0.g.a.h.i;
import h0.g.a.h.k.c;
import h0.g.a.h.k.j;
import h0.g.a.h.k.l;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class ConstraintWidget {
    public boolean A;
    public boolean A0;
    public int B;
    public int B0;
    public float C;
    public int C0;
    public int[] D;
    public boolean D0;
    public float E;
    public boolean E0;
    public boolean F;
    public float[] F0;
    public boolean G;
    public ConstraintWidget[] G0;
    public boolean H;
    public ConstraintWidget[] H0;
    public int I;
    public ConstraintWidget I0;
    public int J;
    public ConstraintWidget J0;
    public ConstraintAnchor K;
    public int K0;
    public ConstraintAnchor L;
    public int L0;
    public ConstraintAnchor M;
    public ConstraintAnchor N;
    public ConstraintAnchor O;
    public ConstraintAnchor P;
    public ConstraintAnchor Q;
    public ConstraintAnchor R;
    public ConstraintAnchor[] S;
    public ArrayList<ConstraintAnchor> T;
    public boolean[] U;
    public DimensionBehaviour[] V;
    public ConstraintWidget W;
    public int X;
    public int Y;
    public float Z;
    public boolean a = false;
    public int a0;
    public c b;
    public int b0;
    public c c;
    public int c0;
    public j d = null;
    public int d0;
    public l e = null;
    public int e0;
    public boolean[] f = {true, true};
    public int f0;
    public boolean g = true;

    /* renamed from: g0  reason: collision with root package name */
    public int f0g0;
    public int h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public int f1h0;
    public int i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f2i0;
    public boolean j;

    /* renamed from: j0  reason: collision with root package name */
    public int f3j0;
    public boolean k;

    /* renamed from: k0  reason: collision with root package name */
    public float f4k0;
    public boolean l;

    /* renamed from: l0  reason: collision with root package name */
    public float f5l0;
    public boolean m;

    /* renamed from: m0  reason: collision with root package name */
    public Object f6m0;
    public int n;

    /* renamed from: n0  reason: collision with root package name */
    public int f7n0;
    public int o;

    /* renamed from: o0  reason: collision with root package name */
    public int f8o0;
    public int p;

    /* renamed from: p0  reason: collision with root package name */
    public String f9p0;
    public int q;

    /* renamed from: q0  reason: collision with root package name */
    public String f10q0;
    public int r;

    /* renamed from: r0  reason: collision with root package name */
    public int f11r0;
    public int[] s;

    /* renamed from: s0  reason: collision with root package name */
    public int f12s0;
    public int t;

    /* renamed from: t0  reason: collision with root package name */
    public int f13t0;
    public int u;

    /* renamed from: u0  reason: collision with root package name */
    public int f14u0;
    public float v;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f15v0;
    public int w;
    public boolean w0;
    public int x;
    public boolean x0;
    public float y;
    public boolean y0;
    public boolean z;
    public boolean z0;

    public enum DimensionBehaviour {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public ConstraintWidget() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = 0;
        this.u = 0;
        this.v = 1.0f;
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.B = -1;
        this.C = 1.0f;
        this.D = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.E = 0.0f;
        this.F = false;
        this.H = false;
        this.I = 0;
        this.J = 0;
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.Type.LEFT);
        this.K = constraintAnchor;
        ConstraintAnchor constraintAnchor2 = new ConstraintAnchor(this, ConstraintAnchor.Type.TOP);
        this.L = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = new ConstraintAnchor(this, ConstraintAnchor.Type.RIGHT);
        this.M = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = new ConstraintAnchor(this, ConstraintAnchor.Type.BOTTOM);
        this.N = constraintAnchor4;
        ConstraintAnchor constraintAnchor5 = new ConstraintAnchor(this, ConstraintAnchor.Type.BASELINE);
        this.O = constraintAnchor5;
        this.P = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_X);
        this.Q = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER_Y);
        ConstraintAnchor constraintAnchor6 = new ConstraintAnchor(this, ConstraintAnchor.Type.CENTER);
        this.R = constraintAnchor6;
        this.S = new ConstraintAnchor[]{constraintAnchor, constraintAnchor3, constraintAnchor2, constraintAnchor4, constraintAnchor5, constraintAnchor6};
        this.T = new ArrayList<>();
        this.U = new boolean[2];
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        this.V = new DimensionBehaviour[]{dimensionBehaviour, dimensionBehaviour};
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0;
        this.f0 = 0;
        this.f0g0 = 0;
        this.f1h0 = 0;
        this.f4k0 = 0.5f;
        this.f5l0 = 0.5f;
        this.f7n0 = 0;
        this.f8o0 = 0;
        this.f9p0 = null;
        this.f10q0 = null;
        this.B0 = 0;
        this.C0 = 0;
        this.F0 = new float[]{-1.0f, -1.0f};
        this.G0 = new ConstraintWidget[]{null, null};
        this.H0 = new ConstraintWidget[]{null, null};
        this.I0 = null;
        this.J0 = null;
        this.K0 = -1;
        this.L0 = -1;
        this.T.add(this.K);
        this.T.add(this.L);
        this.T.add(this.M);
        this.T.add(this.N);
        this.T.add(this.P);
        this.T.add(this.Q);
        this.T.add(this.R);
        this.T.add(this.O);
    }

    public boolean A(int i2, int i3) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i2 == 0) {
            ConstraintAnchor constraintAnchor3 = this.K.f;
            if (constraintAnchor3 != null && constraintAnchor3.c && (constraintAnchor2 = this.M.f) != null && constraintAnchor2.c) {
                if ((constraintAnchor2.d() - this.M.e()) - (this.K.e() + this.K.f.d()) >= i3) {
                    return true;
                }
                return false;
            }
        } else {
            ConstraintAnchor constraintAnchor4 = this.L.f;
            if (constraintAnchor4 != null && constraintAnchor4.c && (constraintAnchor = this.N.f) != null && constraintAnchor.c) {
                if ((constraintAnchor.d() - this.N.e()) - (this.L.e() + this.L.f.d()) >= i3) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public void B(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2, int i3) {
        n(type).b(constraintWidget.n(type2), i2, i3, true);
    }

    public final boolean C(int i2) {
        int i3 = i2 * 2;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        if (!(constraintAnchorArr[i3].f == null || constraintAnchorArr[i3].f.f == constraintAnchorArr[i3])) {
            int i4 = i3 + 1;
            return constraintAnchorArr[i4].f != null && constraintAnchorArr[i4].f.f == constraintAnchorArr[i4];
        }
    }

    public boolean D() {
        ConstraintAnchor constraintAnchor = this.K;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.M;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public boolean E() {
        ConstraintAnchor constraintAnchor = this.L;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f;
        if (constraintAnchor2 != null && constraintAnchor2.f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.N;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f;
        return constraintAnchor4 != null && constraintAnchor4.f == constraintAnchor3;
    }

    public boolean F() {
        return this.g && this.f8o0 != 8;
    }

    public boolean G() {
        return this.j || (this.K.c && this.M.c);
    }

    public boolean H() {
        return this.k || (this.L.c && this.N.c);
    }

    public void I() {
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.Q.k();
        this.R.k();
        this.W = null;
        this.E = 0.0f;
        this.X = 0;
        this.Y = 0;
        this.Z = 0.0f;
        this.a0 = -1;
        this.b0 = 0;
        this.c0 = 0;
        this.f0 = 0;
        this.f0g0 = 0;
        this.f1h0 = 0;
        this.f2i0 = 0;
        this.f3j0 = 0;
        this.f4k0 = 0.5f;
        this.f5l0 = 0.5f;
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = DimensionBehaviour.FIXED;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        this.f6m0 = null;
        this.f7n0 = 0;
        this.f8o0 = 0;
        this.f10q0 = null;
        this.z0 = false;
        this.A0 = false;
        this.B0 = 0;
        this.C0 = 0;
        this.D0 = false;
        this.E0 = false;
        float[] fArr = this.F0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.n = -1;
        this.o = -1;
        int[] iArr = this.D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.q = 0;
        this.r = 0;
        this.v = 1.0f;
        this.y = 1.0f;
        this.u = Integer.MAX_VALUE;
        this.x = Integer.MAX_VALUE;
        this.t = 0;
        this.w = 0;
        this.B = -1;
        this.C = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        this.H = false;
        boolean[] zArr2 = this.U;
        zArr2[0] = false;
        zArr2[1] = false;
        this.g = true;
        int[] iArr2 = this.s;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.h = -1;
        this.i = -1;
    }

    public void J() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget != null && (constraintWidget instanceof h0.g.a.h.c)) {
            Objects.requireNonNull((h0.g.a.h.c) constraintWidget);
        }
        int size = this.T.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.T.get(i2).k();
        }
    }

    public void K() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        int size = this.T.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintAnchor constraintAnchor = this.T.get(i2);
            constraintAnchor.c = false;
            constraintAnchor.b = 0;
        }
    }

    public void L(h0.g.a.c cVar) {
        this.K.l();
        this.L.l();
        this.M.l();
        this.N.l();
        this.O.l();
        this.R.l();
        this.P.l();
        this.Q.l();
    }

    public void M(int i2) {
        this.f1h0 = i2;
        this.F = i2 > 0;
    }

    public void N(int i2, int i3) {
        if (!this.j) {
            ConstraintAnchor constraintAnchor = this.K;
            constraintAnchor.b = i2;
            constraintAnchor.c = true;
            ConstraintAnchor constraintAnchor2 = this.M;
            constraintAnchor2.b = i3;
            constraintAnchor2.c = true;
            this.b0 = i2;
            this.X = i3 - i2;
            this.j = true;
        }
    }

    public void O(int i2, int i3) {
        if (!this.k) {
            ConstraintAnchor constraintAnchor = this.L;
            constraintAnchor.b = i2;
            constraintAnchor.c = true;
            ConstraintAnchor constraintAnchor2 = this.N;
            constraintAnchor2.b = i3;
            constraintAnchor2.c = true;
            this.c0 = i2;
            this.Y = i3 - i2;
            if (this.F) {
                this.O.m(i2 + this.f1h0);
            }
            this.k = true;
        }
    }

    public void P(int i2) {
        this.Y = i2;
        int i3 = this.f3j0;
        if (i2 < i3) {
            this.Y = i3;
        }
    }

    public void Q(DimensionBehaviour dimensionBehaviour) {
        this.V[0] = dimensionBehaviour;
    }

    public void R(int i2) {
        if (i2 < 0) {
            this.f3j0 = 0;
        } else {
            this.f3j0 = i2;
        }
    }

    public void S(int i2) {
        if (i2 < 0) {
            this.f2i0 = 0;
        } else {
            this.f2i0 = i2;
        }
    }

    public void T(DimensionBehaviour dimensionBehaviour) {
        this.V[1] = dimensionBehaviour;
    }

    public void U(int i2) {
        this.X = i2;
        int i3 = this.f2i0;
        if (i2 < i3) {
            this.X = i3;
        }
    }

    public void V(boolean z2, boolean z3) {
        int i2;
        int i3;
        j jVar = this.d;
        boolean z4 = z2 & jVar.g;
        l lVar = this.e;
        boolean z5 = z3 & lVar.g;
        int i4 = jVar.h.g;
        int i5 = lVar.h.g;
        int i6 = jVar.i.g;
        int i7 = lVar.i.g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.b0 = i4;
        }
        if (z5) {
            this.c0 = i5;
        }
        if (this.f8o0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        if (z4) {
            if (this.V[0] == DimensionBehaviour.FIXED && i9 < (i3 = this.X)) {
                i9 = i3;
            }
            this.X = i9;
            int i11 = this.f2i0;
            if (i9 < i11) {
                this.X = i11;
            }
        }
        if (z5) {
            if (this.V[1] == DimensionBehaviour.FIXED && i10 < (i2 = this.Y)) {
                i10 = i2;
            }
            this.Y = i10;
            int i12 = this.f3j0;
            if (i10 < i12) {
                this.Y = i12;
            }
        }
    }

    public void W(d dVar, boolean z2) {
        int i2;
        int i3;
        l lVar;
        j jVar;
        int o2 = dVar.o(this.K);
        int o3 = dVar.o(this.L);
        int o4 = dVar.o(this.M);
        int o5 = dVar.o(this.N);
        if (z2 && (jVar = this.d) != null) {
            DependencyNode dependencyNode = jVar.h;
            if (dependencyNode.j) {
                DependencyNode dependencyNode2 = jVar.i;
                if (dependencyNode2.j) {
                    o2 = dependencyNode.g;
                    o4 = dependencyNode2.g;
                }
            }
        }
        if (z2 && (lVar = this.e) != null) {
            DependencyNode dependencyNode3 = lVar.h;
            if (dependencyNode3.j) {
                DependencyNode dependencyNode4 = lVar.i;
                if (dependencyNode4.j) {
                    o3 = dependencyNode3.g;
                    o5 = dependencyNode4.g;
                }
            }
        }
        int i4 = o5 - o3;
        if (o4 - o2 < 0 || i4 < 0 || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE || o5 == Integer.MIN_VALUE || o5 == Integer.MAX_VALUE) {
            o5 = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        int i5 = o4 - o2;
        int i6 = o5 - o3;
        this.b0 = o2;
        this.c0 = o3;
        if (this.f8o0 == 8) {
            this.X = 0;
            this.Y = 0;
            return;
        }
        DimensionBehaviour[] dimensionBehaviourArr = this.V;
        DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        DimensionBehaviour dimensionBehaviour2 = DimensionBehaviour.FIXED;
        if (dimensionBehaviour == dimensionBehaviour2 && i5 < (i3 = this.X)) {
            i5 = i3;
        }
        if (dimensionBehaviourArr[1] == dimensionBehaviour2 && i6 < (i2 = this.Y)) {
            i6 = i2;
        }
        this.X = i5;
        this.Y = i6;
        int i7 = this.f3j0;
        if (i6 < i7) {
            this.Y = i7;
        }
        int i8 = this.f2i0;
        if (i5 < i8) {
            this.X = i8;
        }
        int i9 = this.u;
        if (i9 > 0 && dimensionBehaviourArr[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.X = Math.min(this.X, i9);
        }
        int i10 = this.x;
        if (i10 > 0 && this.V[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            this.Y = Math.min(this.Y, i10);
        }
        int i11 = this.X;
        if (i5 != i11) {
            this.h = i11;
        }
        int i12 = this.Y;
        if (i6 != i12) {
            this.i = i12;
        }
    }

    public void d(h0.g.a.h.c cVar, d dVar, HashSet<ConstraintWidget> hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                h.a(cVar, dVar, this);
                hashSet.remove(this);
                f(dVar, cVar.h0(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.K.a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().d.d(cVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.M.a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().d.d(cVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.L.a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().d.d(cVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.N.a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().d.d(cVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.O.a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().d.d(cVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean e() {
        return (this instanceof i) || (this instanceof e);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0530  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x05c6  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:359:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x0644  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(h0.g.a.d r52, boolean r53) {
        /*
            r51 = this;
            r15 = r51
            r14 = r52
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.K
            androidx.constraintlayout.core.SolverVariable r13 = r14.l(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.M
            androidx.constraintlayout.core.SolverVariable r12 = r14.l(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.L
            androidx.constraintlayout.core.SolverVariable r11 = r14.l(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.N
            androidx.constraintlayout.core.SolverVariable r10 = r14.l(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.O
            androidx.constraintlayout.core.SolverVariable r9 = r14.l(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L_0x005b
            if (r0 == 0) goto L_0x0036
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.V
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L_0x0036
            r2 = r7
            goto L_0x0037
        L_0x0036:
            r2 = r6
        L_0x0037:
            if (r0 == 0) goto L_0x0043
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.V
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L_0x0043
            r0 = r7
            goto L_0x0044
        L_0x0043:
            r0 = r6
        L_0x0044:
            int r3 = r15.p
            if (r3 == r7) goto L_0x0056
            if (r3 == r8) goto L_0x0051
            if (r3 == r1) goto L_0x005b
            r28 = r0
            r29 = r2
            goto L_0x005f
        L_0x0051:
            r28 = r0
            r29 = r6
            goto L_0x005f
        L_0x0056:
            r29 = r2
            r28 = r6
            goto L_0x005f
        L_0x005b:
            r28 = r6
            r29 = r28
        L_0x005f:
            int r0 = r15.f8o0
            r5 = 8
            if (r0 != r5) goto L_0x008f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r15.T
            int r0 = r0.size()
            r2 = r6
        L_0x006c:
            if (r2 >= r0) goto L_0x0081
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r15.T
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            boolean r3 = r3.h()
            if (r3 == 0) goto L_0x007e
            r0 = r7
            goto L_0x0082
        L_0x007e:
            int r2 = r2 + 1
            goto L_0x006c
        L_0x0081:
            r0 = r6
        L_0x0082:
            if (r0 != 0) goto L_0x008f
            boolean[] r0 = r15.U
            boolean r2 = r0[r6]
            if (r2 != 0) goto L_0x008f
            boolean r0 = r0[r7]
            if (r0 != 0) goto L_0x008f
            return
        L_0x008f:
            boolean r0 = r15.j
            if (r0 != 0) goto L_0x0097
            boolean r2 = r15.k
            if (r2 == 0) goto L_0x00f8
        L_0x0097:
            if (r0 == 0) goto L_0x00b8
            int r0 = r15.b0
            r14.e(r13, r0)
            int r0 = r15.b0
            int r2 = r15.X
            int r0 = r0 + r2
            r14.e(r12, r0)
            if (r29 == 0) goto L_0x00b8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x00b8
            h0.g.a.h.c r0 = (h0.g.a.h.c) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.K
            r0.b0(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.M
            r0.a0(r2)
        L_0x00b8:
            boolean r0 = r15.k
            if (r0 == 0) goto L_0x00eb
            int r0 = r15.c0
            r14.e(r11, r0)
            int r0 = r15.c0
            int r2 = r15.Y
            int r0 = r0 + r2
            r14.e(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.O
            boolean r0 = r0.h()
            if (r0 == 0) goto L_0x00d9
            int r0 = r15.c0
            int r2 = r15.f1h0
            int r0 = r0 + r2
            r14.e(r9, r0)
        L_0x00d9:
            if (r28 == 0) goto L_0x00eb
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x00eb
            h0.g.a.h.c r0 = (h0.g.a.h.c) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.L
            r0.d0(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.N
            r0.c0(r2)
        L_0x00eb:
            boolean r0 = r15.j
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r15.k
            if (r0 == 0) goto L_0x00f8
            r15.j = r6
            r15.k = r6
            return
        L_0x00f8:
            if (r53 == 0) goto L_0x017e
            h0.g.a.h.k.j r0 = r15.d
            if (r0 == 0) goto L_0x017e
            h0.g.a.h.k.l r2 = r15.e
            if (r2 == 0) goto L_0x017e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r0.h
            boolean r4 = r3.j
            if (r4 == 0) goto L_0x017e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x017e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.h
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x017e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x017e
            int r0 = r3.g
            r14.e(r13, r0)
            h0.g.a.h.k.j r0 = r15.d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.i
            int r0 = r0.g
            r14.e(r12, r0)
            h0.g.a.h.k.l r0 = r15.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.h
            int r0 = r0.g
            r14.e(r11, r0)
            h0.g.a.h.k.l r0 = r15.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.i
            int r0 = r0.g
            r14.e(r10, r0)
            h0.g.a.h.k.l r0 = r15.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.k
            int r0 = r0.g
            r14.e(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x0179
            if (r29 == 0) goto L_0x0160
            boolean[] r0 = r15.f
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0160
            boolean r0 = r51.D()
            if (r0 != 0) goto L_0x0160
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.M
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r14.f(r0, r12, r6, r5)
        L_0x0160:
            if (r28 == 0) goto L_0x0179
            boolean[] r0 = r15.f
            boolean r0 = r0[r7]
            if (r0 == 0) goto L_0x0179
            boolean r0 = r51.E()
            if (r0 != 0) goto L_0x0179
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.N
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r14.f(r0, r10, r6, r5)
        L_0x0179:
            r15.j = r6
            r15.k = r6
            return
        L_0x017e:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x01ef
            boolean r0 = r15.C(r6)
            if (r0 == 0) goto L_0x0191
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            h0.g.a.h.c r0 = (h0.g.a.h.c) r0
            r0.Y(r15, r6)
            r0 = r7
            goto L_0x0195
        L_0x0191:
            boolean r0 = r51.D()
        L_0x0195:
            boolean r2 = r15.C(r7)
            if (r2 == 0) goto L_0x01a4
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.W
            h0.g.a.h.c r2 = (h0.g.a.h.c) r2
            r2.Y(r15, r7)
            r2 = r7
            goto L_0x01a8
        L_0x01a4:
            boolean r2 = r51.E()
        L_0x01a8:
            if (r0 != 0) goto L_0x01c7
            if (r29 == 0) goto L_0x01c7
            int r3 = r15.f8o0
            if (r3 == r5) goto L_0x01c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 != 0) goto L_0x01c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 != 0) goto L_0x01c7
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r15.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.M
            androidx.constraintlayout.core.SolverVariable r3 = r14.l(r3)
            r14.f(r3, r12, r6, r7)
        L_0x01c7:
            if (r2 != 0) goto L_0x01ea
            if (r28 == 0) goto L_0x01ea
            int r3 = r15.f8o0
            if (r3 == r5) goto L_0x01ea
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 != 0) goto L_0x01ea
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.f
            if (r3 != 0) goto L_0x01ea
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.O
            if (r3 != 0) goto L_0x01ea
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r15.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.N
            androidx.constraintlayout.core.SolverVariable r3 = r14.l(r3)
            r14.f(r3, r10, r6, r7)
        L_0x01ea:
            r31 = r0
            r30 = r2
            goto L_0x01f3
        L_0x01ef:
            r30 = r6
            r31 = r30
        L_0x01f3:
            int r0 = r15.X
            int r2 = r15.f2i0
            if (r0 >= r2) goto L_0x01fa
            goto L_0x01fb
        L_0x01fa:
            r2 = r0
        L_0x01fb:
            int r3 = r15.Y
            int r4 = r15.f3j0
            if (r3 >= r4) goto L_0x0202
            goto L_0x0203
        L_0x0202:
            r4 = r3
        L_0x0203:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.V
            r1 = r8[r6]
            r18 = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 == r2) goto L_0x020f
            r1 = r7
            goto L_0x0210
        L_0x020f:
            r1 = r6
        L_0x0210:
            r6 = r8[r7]
            if (r6 == r2) goto L_0x0216
            r6 = r7
            goto L_0x0217
        L_0x0216:
            r6 = 0
        L_0x0217:
            int r7 = r15.a0
            r15.B = r7
            float r5 = r15.Z
            r15.C = r5
            r22 = r4
            int r4 = r15.q
            r23 = r9
            int r9 = r15.r
            r24 = 0
            int r24 = (r5 > r24 ? 1 : (r5 == r24 ? 0 : -1))
            r25 = 4
            r27 = r10
            if (r24 <= 0) goto L_0x0375
            int r10 = r15.f8o0
            r32 = r11
            r11 = 8
            if (r10 == r11) goto L_0x0377
            r10 = 0
            r11 = r8[r10]
            if (r11 != r2) goto L_0x0241
            if (r4 != 0) goto L_0x0241
            r4 = 3
        L_0x0241:
            r10 = 1
            r11 = r8[r10]
            if (r11 != r2) goto L_0x0249
            if (r9 != 0) goto L_0x0249
            r9 = 3
        L_0x0249:
            r11 = 0
            r10 = r8[r11]
            r26 = 1065353216(0x3f800000, float:1.0)
            if (r10 != r2) goto L_0x0318
            r10 = 1
            r11 = r8[r10]
            if (r11 != r2) goto L_0x0316
            r10 = 3
            if (r4 != r10) goto L_0x0316
            if (r9 != r10) goto L_0x0316
            r0 = -1
            if (r7 != r0) goto L_0x0272
            if (r1 == 0) goto L_0x0265
            if (r6 != 0) goto L_0x0265
            r3 = 0
            r15.B = r3
            goto L_0x0272
        L_0x0265:
            if (r1 != 0) goto L_0x0272
            if (r6 == 0) goto L_0x0272
            r1 = 1
            r15.B = r1
            if (r7 != r0) goto L_0x0272
            float r0 = r26 / r5
            r15.C = r0
        L_0x0272:
            int r0 = r15.B
            if (r0 != 0) goto L_0x028a
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.L
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0286
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.N
            boolean r0 = r0.i()
            if (r0 != 0) goto L_0x028a
        L_0x0286:
            r0 = 1
            r15.B = r0
            goto L_0x02a2
        L_0x028a:
            r0 = 1
            int r1 = r15.B
            if (r1 != r0) goto L_0x02a2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.K
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x029f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.M
            boolean r0 = r0.i()
            if (r0 != 0) goto L_0x02a2
        L_0x029f:
            r0 = 0
            r15.B = r0
        L_0x02a2:
            int r0 = r15.B
            r1 = -1
            if (r0 != r1) goto L_0x02f4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.L
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.N
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.K
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.M
            boolean r0 = r0.i()
            if (r0 != 0) goto L_0x02f4
        L_0x02c7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.L
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02db
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.N
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02db
            r0 = 0
            r15.B = r0
            goto L_0x02f4
        L_0x02db:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.K
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02f4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.M
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x02f4
            float r0 = r15.C
            float r0 = r26 / r0
            r15.C = r0
            r0 = 1
            r15.B = r0
        L_0x02f4:
            int r0 = r15.B
            r1 = -1
            if (r0 != r1) goto L_0x036a
            int r0 = r15.t
            if (r0 <= 0) goto L_0x0306
            int r1 = r15.w
            if (r1 != 0) goto L_0x0306
            r1 = 0
            r15.B = r1
            goto L_0x036a
        L_0x0306:
            if (r0 != 0) goto L_0x036a
            int r0 = r15.w
            if (r0 <= 0) goto L_0x036a
            float r0 = r15.C
            float r0 = r26 / r0
            r15.C = r0
            r0 = 1
            r15.B = r0
            goto L_0x036a
        L_0x0316:
            r1 = 0
            goto L_0x0319
        L_0x0318:
            r1 = r11
        L_0x0319:
            r6 = r8[r1]
            if (r6 != r2) goto L_0x0342
            r6 = 3
            if (r4 != r6) goto L_0x0342
            r15.B = r1
            float r0 = (float) r3
            float r5 = r5 * r0
            int r0 = (int) r5
            r1 = 1
            r3 = r8[r1]
            r18 = r0
            if (r3 == r2) goto L_0x0337
            r35 = r9
            r33 = r22
            r36 = r25
            r19 = 0
            r34 = 0
            goto L_0x0381
        L_0x0337:
            r34 = r1
            r36 = r4
            r35 = r9
            r33 = r22
            r19 = 0
            goto L_0x0381
        L_0x0342:
            r1 = 1
            r3 = r8[r1]
            if (r3 != r2) goto L_0x036a
            r3 = 3
            if (r9 != r3) goto L_0x036a
            r15.B = r1
            r1 = -1
            if (r7 != r1) goto L_0x0353
            float r1 = r26 / r5
            r15.C = r1
        L_0x0353:
            float r1 = r15.C
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            r19 = 0
            r1 = r8[r19]
            r33 = r0
            r36 = r4
            if (r1 == r2) goto L_0x0367
            r34 = r19
            r35 = r25
            goto L_0x0381
        L_0x0367:
            r35 = r9
            goto L_0x0372
        L_0x036a:
            r19 = 0
            r36 = r4
            r35 = r9
            r33 = r22
        L_0x0372:
            r34 = 1
            goto L_0x0381
        L_0x0375:
            r32 = r11
        L_0x0377:
            r19 = 0
            r36 = r4
            r35 = r9
            r34 = r19
            r33 = r22
        L_0x0381:
            int[] r0 = r15.s
            r0[r19] = r36
            r1 = 1
            r0[r1] = r35
            if (r34 == 0) goto L_0x0394
            int r0 = r15.B
            r1 = -1
            if (r0 == 0) goto L_0x0391
            if (r0 != r1) goto L_0x0395
        L_0x0391:
            r17 = 1
            goto L_0x0397
        L_0x0394:
            r1 = -1
        L_0x0395:
            r17 = 0
        L_0x0397:
            if (r34 == 0) goto L_0x03a3
            int r0 = r15.B
            r3 = 1
            if (r0 == r3) goto L_0x03a0
            if (r0 != r1) goto L_0x03a3
        L_0x03a0:
            r37 = 1
            goto L_0x03a5
        L_0x03a3:
            r37 = 0
        L_0x03a5:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.V
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r11) goto L_0x03b4
            boolean r0 = r15 instanceof h0.g.a.h.c
            if (r0 == 0) goto L_0x03b4
            r9 = 1
            goto L_0x03b5
        L_0x03b4:
            r9 = 0
        L_0x03b5:
            if (r9 == 0) goto L_0x03b9
            r18 = 0
        L_0x03b9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.R
            boolean r0 = r0.i()
            r1 = 1
            r38 = r0 ^ 1
            boolean[] r0 = r15.U
            r3 = 0
            boolean r22 = r0[r3]
            boolean r39 = r0[r1]
            int r0 = r15.n
            r40 = 0
            r8 = 2
            if (r0 == r8) goto L_0x04a6
            boolean r0 = r15.j
            if (r0 != 0) goto L_0x04a6
            if (r53 == 0) goto L_0x0419
            h0.g.a.h.k.j r0 = r15.d
            if (r0 == 0) goto L_0x0419
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.h
            boolean r3 = r1.j
            if (r3 == 0) goto L_0x0419
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.i
            boolean r0 = r0.j
            if (r0 != 0) goto L_0x03e7
            goto L_0x0419
        L_0x03e7:
            if (r53 == 0) goto L_0x04a6
            int r0 = r1.g
            r14.e(r13, r0)
            h0.g.a.h.k.j r0 = r15.d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.i
            int r0 = r0.g
            r14.e(r12, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x04a6
            if (r29 == 0) goto L_0x04a6
            boolean[] r0 = r15.f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x04a6
            boolean r0 = r51.D()
            if (r0 != 0) goto L_0x04a6
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.M
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r5 = 8
            r14.f(r0, r12, r1, r5)
            goto L_0x04a6
        L_0x0419:
            r5 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x0427
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.M
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r7 = r0
            goto L_0x0429
        L_0x0427:
            r7 = r40
        L_0x0429:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x0435
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.K
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r6 = r0
            goto L_0x0437
        L_0x0435:
            r6 = r40
        L_0x0437:
            boolean[] r0 = r15.f
            r10 = 0
            boolean r16 = r0[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.V
            r19 = r0[r10]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.M
            int r3 = r15.b0
            int r14 = r15.f2i0
            int[] r5 = r15.D
            r42 = r5[r10]
            float r5 = r15.f4k0
            r20 = 1
            r0 = r0[r20]
            if (r0 != r2) goto L_0x0457
            r43 = r20
            goto L_0x0459
        L_0x0457:
            r43 = r10
        L_0x0459:
            int r0 = r15.t
            r24 = r0
            int r0 = r15.u
            r25 = r0
            float r0 = r15.v
            r26 = r0
            r0 = r51
            r44 = r1
            r1 = r52
            r45 = r2
            r2 = 1
            r21 = r3
            r3 = r29
            r46 = r4
            r4 = r28
            r41 = r5
            r5 = r16
            r8 = r19
            r47 = r23
            r48 = r27
            r10 = r46
            r50 = r11
            r49 = r32
            r11 = r44
            r32 = r12
            r12 = r21
            r44 = r13
            r13 = r18
            r15 = r42
            r16 = r41
            r18 = r43
            r19 = r31
            r20 = r30
            r21 = r22
            r22 = r36
            r23 = r35
            r27 = r38
            r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x04b4
        L_0x04a6:
            r45 = r2
            r50 = r11
            r44 = r13
            r47 = r23
            r48 = r27
            r49 = r32
            r32 = r12
        L_0x04b4:
            if (r53 == 0) goto L_0x051a
            r15 = r51
            h0.g.a.h.k.l r0 = r15.e
            if (r0 == 0) goto L_0x050d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.h
            boolean r2 = r1.j
            if (r2 == 0) goto L_0x050d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.i
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x050d
            int r0 = r1.g
            r14 = r52
            r13 = r49
            r14.e(r13, r0)
            h0.g.a.h.k.l r0 = r15.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.i
            int r0 = r0.g
            r12 = r48
            r14.e(r12, r0)
            h0.g.a.h.k.l r0 = r15.e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.k
            int r0 = r0.g
            r1 = r47
            r14.e(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x0507
            if (r30 != 0) goto L_0x0507
            if (r28 == 0) goto L_0x0507
            boolean[] r2 = r15.f
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x0503
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.N
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x050b
        L_0x0503:
            r2 = 8
            r10 = 0
            goto L_0x050b
        L_0x0507:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x050b:
            r7 = r10
            goto L_0x0529
        L_0x050d:
            r14 = r52
            r1 = r47
            r12 = r48
            r13 = r49
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x0528
        L_0x051a:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r51
            r14 = r52
            r1 = r47
            r12 = r48
            r13 = r49
        L_0x0528:
            r7 = r11
        L_0x0529:
            int r0 = r15.o
            r3 = 2
            if (r0 != r3) goto L_0x0530
            r6 = r10
            goto L_0x0531
        L_0x0530:
            r6 = r7
        L_0x0531:
            if (r6 == 0) goto L_0x0609
            boolean r0 = r15.k
            if (r0 != 0) goto L_0x0609
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.V
            r0 = r0[r11]
            r3 = r50
            if (r0 != r3) goto L_0x0545
            boolean r0 = r15 instanceof h0.g.a.h.c
            if (r0 == 0) goto L_0x0545
            r9 = r11
            goto L_0x0546
        L_0x0545:
            r9 = r10
        L_0x0546:
            if (r9 == 0) goto L_0x054a
            r33 = r10
        L_0x054a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x0556
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.N
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r7 = r0
            goto L_0x0558
        L_0x0556:
            r7 = r40
        L_0x0558:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.W
            if (r0 == 0) goto L_0x0564
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.L
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r6 = r0
            goto L_0x0566
        L_0x0564:
            r6 = r40
        L_0x0566:
            int r0 = r15.f1h0
            if (r0 > 0) goto L_0x056e
            int r3 = r15.f8o0
            if (r3 != r2) goto L_0x05a6
        L_0x056e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.f
            if (r4 == 0) goto L_0x0597
            r14.d(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.O
            int r3 = r3.e()
            r14.d(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x0594
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.N
            androidx.constraintlayout.core.SolverVariable r0 = r14.l(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x0594:
            r27 = r10
            goto L_0x05a8
        L_0x0597:
            int r4 = r15.f8o0
            if (r4 != r2) goto L_0x05a3
            int r0 = r3.e()
            r14.d(r1, r13, r0, r2)
            goto L_0x05a6
        L_0x05a3:
            r14.d(r1, r13, r0, r2)
        L_0x05a6:
            r27 = r38
        L_0x05a8:
            boolean[] r0 = r15.f
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.V
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.N
            int r1 = r15.c0
            int r2 = r15.f3j0
            int[] r10 = r15.D
            r16 = r10[r11]
            float r10 = r15.f5l0
            r17 = 0
            r0 = r0[r17]
            r11 = r45
            if (r0 != r11) goto L_0x05c9
            r18 = 1
            goto L_0x05cb
        L_0x05c9:
            r18 = r17
        L_0x05cb:
            int r0 = r15.w
            r24 = r0
            int r0 = r15.x
            r25 = r0
            float r0 = r15.y
            r26 = r0
            r0 = r51
            r19 = r1
            r1 = r52
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r28
            r21 = r4
            r4 = r29
            r17 = r10
            r10 = r21
            r28 = r12
            r12 = r19
            r29 = r13
            r13 = r33
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r37
            r19 = r30
            r20 = r31
            r21 = r39
            r22 = r35
            r23 = r36
            r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x060d
        L_0x0609:
            r28 = r12
            r29 = r13
        L_0x060d:
            if (r34 == 0) goto L_0x063a
            r6 = 8
            r7 = r51
            int r0 = r7.B
            r1 = 1
            if (r0 != r1) goto L_0x0628
            float r5 = r7.C
            r0 = r52
            r1 = r28
            r2 = r29
            r3 = r32
            r4 = r44
            r0.h(r1, r2, r3, r4, r5, r6)
            goto L_0x063c
        L_0x0628:
            float r5 = r7.C
            r6 = 8
            r0 = r52
            r1 = r32
            r2 = r44
            r3 = r28
            r4 = r29
            r0.h(r1, r2, r3, r4, r5, r6)
            goto L_0x063c
        L_0x063a:
            r7 = r51
        L_0x063c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.R
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x06d4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.R
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.d
            float r1 = r7.E
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.R
            int r2 = r2.e()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r7.n(r3)
            r5 = r52
            androidx.constraintlayout.core.SolverVariable r9 = r5.l(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r7.n(r4)
            androidx.constraintlayout.core.SolverVariable r11 = r5.l(r6)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r7.n(r6)
            androidx.constraintlayout.core.SolverVariable r16 = r5.l(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r7.n(r8)
            androidx.constraintlayout.core.SolverVariable r12 = r5.l(r10)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.n(r3)
            androidx.constraintlayout.core.SolverVariable r3 = r5.l(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.n(r4)
            androidx.constraintlayout.core.SolverVariable r13 = r5.l(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.n(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r5.l(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.n(r8)
            androidx.constraintlayout.core.SolverVariable r14 = r5.l(r0)
            h0.g.a.b r0 = r52.m()
            double r6 = (double) r1
            double r17 = java.lang.Math.sin(r6)
            double r1 = (double) r2
            r53 = r3
            r19 = r4
            double r3 = r17 * r1
            float r15 = (float) r3
            r10 = r0
            r10.g(r11, r12, r13, r14, r15)
            r5.c(r0)
            h0.g.a.b r0 = r52.m()
            double r3 = java.lang.Math.cos(r6)
            double r3 = r3 * r1
            float r13 = (float) r3
            r8 = r0
            r10 = r16
            r11 = r53
            r12 = r19
            r8.g(r9, r10, r11, r12, r13)
            r5.c(r0)
        L_0x06d4:
            r1 = 0
            r0 = r51
            r0.j = r1
            r0.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.f(h0.g.a.d, boolean):void");
    }

    public boolean g() {
        return this.f8o0 != 8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03fa, code lost:
        if ((r3 instanceof h0.g.a.h.a) != false) goto L_0x03ff;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x02c7  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x03e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x049f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x04bb A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x04dc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:349:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:353:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(h0.g.a.d r37, boolean r38, boolean r39, boolean r40, boolean r41, androidx.constraintlayout.core.SolverVariable r42, androidx.constraintlayout.core.SolverVariable r43, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r44, boolean r45, androidx.constraintlayout.core.widgets.ConstraintAnchor r46, androidx.constraintlayout.core.widgets.ConstraintAnchor r47, int r48, int r49, int r50, int r51, float r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, int r58, int r59, int r60, int r61, float r62, boolean r63) {
        /*
            r36 = this;
            r0 = r36
            r10 = r37
            r11 = r42
            r12 = r43
            r13 = r46
            r14 = r47
            r15 = r50
            r1 = r51
            r2 = r59
            r3 = r60
            r4 = r61
            androidx.constraintlayout.core.SolverVariable r9 = r10.l(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.l(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r13.f
            androidx.constraintlayout.core.SolverVariable r7 = r10.l(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r14.f
            androidx.constraintlayout.core.SolverVariable r6 = r10.l(r5)
            boolean r16 = r46.i()
            boolean r17 = r47.i()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.R
            boolean r18 = r5.i()
            if (r17 == 0) goto L_0x003d
            int r5 = r16 + 1
            goto L_0x003f
        L_0x003d:
            r5 = r16
        L_0x003f:
            if (r18 == 0) goto L_0x0043
            int r5 = r5 + 1
        L_0x0043:
            if (r53 == 0) goto L_0x0049
            r20 = r6
            r12 = 3
            goto L_0x004d
        L_0x0049:
            r12 = r58
            r20 = r6
        L_0x004d:
            int r6 = r44.ordinal()
            r2 = 1
            if (r6 == 0) goto L_0x005f
            if (r6 == r2) goto L_0x005f
            r2 = 2
            if (r6 == r2) goto L_0x005a
            goto L_0x005f
        L_0x005a:
            r2 = 4
            if (r12 == r2) goto L_0x0060
            r6 = 1
            goto L_0x0061
        L_0x005f:
            r2 = 4
        L_0x0060:
            r6 = 0
        L_0x0061:
            int r2 = r0.h
            r14 = -1
            if (r2 == r14) goto L_0x006d
            if (r38 == 0) goto L_0x006d
            r0.h = r14
            r49 = r2
            r6 = 0
        L_0x006d:
            int r2 = r0.i
            if (r2 == r14) goto L_0x0077
            if (r38 != 0) goto L_0x0077
            r0.i = r14
            r6 = 0
            goto L_0x0079
        L_0x0077:
            r2 = r49
        L_0x0079:
            int r14 = r0.f8o0
            r49 = r2
            r2 = 8
            if (r14 != r2) goto L_0x0084
            r6 = 0
            r14 = 0
            goto L_0x0087
        L_0x0084:
            r14 = r6
            r6 = r49
        L_0x0087:
            if (r63 == 0) goto L_0x00a6
            if (r16 != 0) goto L_0x0095
            if (r17 != 0) goto L_0x0095
            if (r18 != 0) goto L_0x0095
            r2 = r48
            r10.e(r9, r2)
            goto L_0x00a3
        L_0x0095:
            if (r16 == 0) goto L_0x00a3
            if (r17 != 0) goto L_0x00a3
            int r2 = r46.e()
            r11 = 8
            r10.d(r9, r7, r2, r11)
            goto L_0x00a7
        L_0x00a3:
            r11 = 8
            goto L_0x00a7
        L_0x00a6:
            r11 = r2
        L_0x00a7:
            if (r14 != 0) goto L_0x00c7
            if (r45 == 0) goto L_0x00c0
            r2 = 3
            r11 = 0
            r10.d(r8, r9, r11, r2)
            r2 = 8
            if (r15 <= 0) goto L_0x00b7
            r10.f(r8, r9, r15, r2)
        L_0x00b7:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00c4
            r10.g(r8, r9, r1, r2)
            goto L_0x00c4
        L_0x00c0:
            r2 = r11
            r10.d(r8, r9, r6, r2)
        L_0x00c4:
            r2 = r3
            goto L_0x0135
        L_0x00c7:
            r1 = 2
            if (r5 == r1) goto L_0x00e3
            if (r53 != 0) goto L_0x00e3
            r1 = 1
            if (r12 == r1) goto L_0x00d1
            if (r12 != 0) goto L_0x00e3
        L_0x00d1:
            int r1 = java.lang.Math.max(r3, r6)
            if (r4 <= 0) goto L_0x00db
            int r1 = java.lang.Math.min(r4, r1)
        L_0x00db:
            r2 = 8
            r10.d(r8, r9, r1, r2)
            r2 = r3
            r14 = 0
            goto L_0x0135
        L_0x00e3:
            r1 = -2
            if (r3 != r1) goto L_0x00e8
            r2 = r6
            goto L_0x00e9
        L_0x00e8:
            r2 = r3
        L_0x00e9:
            if (r4 != r1) goto L_0x00ed
            r1 = r6
            goto L_0x00ee
        L_0x00ed:
            r1 = r4
        L_0x00ee:
            if (r6 <= 0) goto L_0x00f4
            r3 = 1
            if (r12 == r3) goto L_0x00f4
            r6 = 0
        L_0x00f4:
            if (r2 <= 0) goto L_0x00ff
            r3 = 8
            r10.f(r8, r9, r2, r3)
            int r6 = java.lang.Math.max(r6, r2)
        L_0x00ff:
            if (r1 <= 0) goto L_0x0118
            if (r39 == 0) goto L_0x0108
            r3 = 1
            if (r12 != r3) goto L_0x0108
            r3 = 0
            goto L_0x0109
        L_0x0108:
            r3 = 1
        L_0x0109:
            if (r3 == 0) goto L_0x0111
            r3 = 8
            r10.g(r8, r9, r1, r3)
            goto L_0x0113
        L_0x0111:
            r3 = 8
        L_0x0113:
            int r6 = java.lang.Math.min(r6, r1)
            goto L_0x011a
        L_0x0118:
            r3 = 8
        L_0x011a:
            r4 = 1
            if (r12 != r4) goto L_0x0143
            if (r39 == 0) goto L_0x0123
            r10.d(r8, r9, r6, r3)
            goto L_0x0134
        L_0x0123:
            if (r55 == 0) goto L_0x012d
            r4 = 5
            r10.d(r8, r9, r6, r4)
            r10.g(r8, r9, r6, r3)
            goto L_0x0134
        L_0x012d:
            r4 = 5
            r10.d(r8, r9, r6, r4)
            r10.g(r8, r9, r6, r3)
        L_0x0134:
            r4 = r1
        L_0x0135:
            r24 = r2
            r1 = r4
            r2 = r5
            r15 = r7
            r11 = r8
            r25 = r14
            r14 = r20
            r20 = r41
            goto L_0x01ba
        L_0x0143:
            r3 = 2
            if (r12 != r3) goto L_0x01a9
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r13.e
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L_0x016a
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r6) goto L_0x0151
            goto L_0x016a
        L_0x0151:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.n(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.l(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.n(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.l(r4)
            goto L_0x0180
        L_0x016a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.n(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.l(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.W
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.n(r6)
            androidx.constraintlayout.core.SolverVariable r4 = r10.l(r4)
        L_0x0180:
            r11 = r3
            r6 = r4
            h0.g.a.b r4 = r37.m()
            r3 = r4
            r45 = r1
            r1 = r4
            r4 = r8
            r51 = r2
            r2 = r5
            r5 = r9
            r24 = r14
            r14 = r20
            r15 = r7
            r7 = r11
            r11 = r8
            r8 = r62
            r3.d(r4, r5, r6, r7, r8)
            r10.c(r1)
            if (r39 == 0) goto L_0x01a2
            r24 = 0
        L_0x01a2:
            r20 = r41
            r1 = r45
            r25 = r24
            goto L_0x01b8
        L_0x01a9:
            r45 = r1
            r51 = r2
            r2 = r5
            r15 = r7
            r11 = r8
            r24 = r14
            r14 = r20
            r25 = r24
            r20 = 1
        L_0x01b8:
            r24 = r51
        L_0x01ba:
            if (r63 == 0) goto L_0x04cf
            if (r55 == 0) goto L_0x01c0
            goto L_0x04cf
        L_0x01c0:
            if (r16 != 0) goto L_0x01c8
            if (r17 != 0) goto L_0x01c8
            if (r18 != 0) goto L_0x01c8
        L_0x01c6:
            r2 = 0
            goto L_0x01fa
        L_0x01c8:
            if (r16 == 0) goto L_0x01df
            if (r17 != 0) goto L_0x01df
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r13.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.d
            if (r39 == 0) goto L_0x01d9
            boolean r1 = r1 instanceof h0.g.a.h.a
            if (r1 == 0) goto L_0x01d9
            r2 = 8
            goto L_0x01da
        L_0x01d9:
            r2 = 5
        L_0x01da:
            r19 = r39
            r1 = 0
            goto L_0x04b9
        L_0x01df:
            if (r16 != 0) goto L_0x01fe
            if (r17 == 0) goto L_0x01fe
            int r1 = r47.e()
            int r1 = -r1
            r2 = 8
            r10.d(r11, r14, r1, r2)
            if (r39 == 0) goto L_0x01c6
            r8 = r42
            r1 = 5
            r2 = 0
            r10.f(r9, r8, r2, r1)
            r3 = r1
            r1 = r2
            goto L_0x04b6
        L_0x01fa:
            r1 = r2
            r3 = 5
            goto L_0x04b6
        L_0x01fe:
            r8 = r42
            r2 = 0
            if (r16 == 0) goto L_0x01fa
            if (r17 == 0) goto L_0x01fa
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r13.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r3.d
            r6 = r47
            r3 = -1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r6.f
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.d
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.W
            r16 = 6
            if (r25 == 0) goto L_0x031e
            if (r12 != 0) goto L_0x0267
            if (r1 != 0) goto L_0x0242
            if (r24 != 0) goto L_0x0242
            boolean r1 = r15.Z1
            if (r1 == 0) goto L_0x0236
            boolean r1 = r14.Z1
            if (r1 == 0) goto L_0x0236
            int r1 = r46.e()
            r3 = 8
            r10.d(r9, r15, r1, r3)
            int r1 = r47.e()
            int r1 = -r1
            r10.d(r11, r14, r1, r3)
            return
        L_0x0236:
            r3 = 8
            r18 = r2
            r23 = r18
            r1 = r3
            r17 = r1
            r21 = 1
            goto L_0x024d
        L_0x0242:
            r3 = 8
            r21 = r2
            r1 = 5
            r17 = 5
            r18 = 1
            r23 = 1
        L_0x024d:
            boolean r2 = r7 instanceof h0.g.a.h.a
            if (r2 != 0) goto L_0x0255
            boolean r2 = r5 instanceof h0.g.a.h.a
            if (r2 == 0) goto L_0x0256
        L_0x0255:
            r1 = 4
        L_0x0256:
            r19 = r16
            r26 = r17
            r22 = r18
            r27 = r21
            r2 = 3
            r18 = 5
            r21 = r1
            r17 = r3
            r3 = 1
            goto L_0x0290
        L_0x0267:
            r2 = 2
            r17 = 8
            if (r12 != r2) goto L_0x027a
            boolean r1 = r7 instanceof h0.g.a.h.a
            if (r1 != 0) goto L_0x0277
            boolean r1 = r5 instanceof h0.g.a.h.a
            if (r1 == 0) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            r1 = 5
            goto L_0x0278
        L_0x0277:
            r1 = 4
        L_0x0278:
            r2 = 5
            goto L_0x0280
        L_0x027a:
            r2 = 1
            if (r12 != r2) goto L_0x0294
            r2 = r17
            r1 = 4
        L_0x0280:
            r21 = r1
            r26 = r2
            r19 = r16
            r2 = 3
            r3 = 1
            r18 = 5
            r22 = 1
            r23 = 1
            r27 = 0
        L_0x0290:
            r1 = r43
            goto L_0x0376
        L_0x0294:
            r2 = 3
            if (r12 != r2) goto L_0x0314
            int r2 = r0.B
            if (r2 != r3) goto L_0x02b6
            if (r56 == 0) goto L_0x02a3
            if (r39 == 0) goto L_0x02a1
            r1 = 5
            goto L_0x02a5
        L_0x02a1:
            r1 = 4
            goto L_0x02a5
        L_0x02a3:
            r1 = r17
        L_0x02a5:
            r19 = r1
            r26 = r17
            r2 = 3
            r3 = 1
            r18 = 5
            r21 = 5
            r22 = 1
            r23 = 1
            r27 = 1
            goto L_0x0290
        L_0x02b6:
            if (r53 == 0) goto L_0x02dd
            r2 = r59
            r3 = 2
            if (r2 == r3) goto L_0x02c3
            r3 = 1
            if (r2 != r3) goto L_0x02c1
            goto L_0x02c4
        L_0x02c1:
            r1 = 0
            goto L_0x02c5
        L_0x02c3:
            r3 = 1
        L_0x02c4:
            r1 = r3
        L_0x02c5:
            if (r1 != 0) goto L_0x02cb
            r2 = r17
            r1 = 5
            goto L_0x02cd
        L_0x02cb:
            r1 = 4
            r2 = 5
        L_0x02cd:
            r21 = r1
            r26 = r2
            r22 = r3
            r23 = r22
            r27 = r23
            r19 = r16
            r2 = 3
            r18 = 5
            goto L_0x0290
        L_0x02dd:
            r3 = 1
            if (r1 <= 0) goto L_0x02e2
            r1 = 5
            goto L_0x0303
        L_0x02e2:
            if (r1 != 0) goto L_0x0302
            if (r24 != 0) goto L_0x0302
            if (r56 != 0) goto L_0x02eb
            r1 = r17
            goto L_0x0303
        L_0x02eb:
            if (r7 == r4) goto L_0x02f1
            if (r5 == r4) goto L_0x02f1
            r1 = 4
            goto L_0x02f2
        L_0x02f1:
            r1 = 5
        L_0x02f2:
            r26 = r1
            r22 = r3
            r23 = r22
            r27 = r23
            r19 = r16
            r2 = 3
            r18 = 5
            r21 = 4
            goto L_0x0290
        L_0x0302:
            r1 = 4
        L_0x0303:
            r21 = r1
            r22 = r3
            r23 = r22
            r27 = r23
            r19 = r16
            r2 = 3
            r18 = 5
            r26 = 5
            goto L_0x0290
        L_0x0314:
            r3 = 1
            r1 = r43
            r18 = 5
            r19 = 0
            r21 = 0
            goto L_0x036a
        L_0x031e:
            r3 = 1
            r17 = 8
            boolean r1 = r15.Z1
            if (r1 == 0) goto L_0x0361
            boolean r1 = r14.Z1
            if (r1 == 0) goto L_0x0361
            int r1 = r46.e()
            int r2 = r47.e()
            r3 = 8
            r53 = r37
            r54 = r9
            r55 = r15
            r56 = r1
            r57 = r52
            r58 = r14
            r59 = r11
            r60 = r2
            r61 = r3
            r53.b(r54, r55, r56, r57, r58, r59, r60, r61)
            if (r39 == 0) goto L_0x0360
            if (r20 == 0) goto L_0x0360
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.f
            if (r1 == 0) goto L_0x0357
            int r2 = r47.e()
            r1 = r43
            goto L_0x035a
        L_0x0357:
            r1 = r43
            r2 = 0
        L_0x035a:
            if (r14 == r1) goto L_0x0360
            r3 = 5
            r10.f(r1, r11, r2, r3)
        L_0x0360:
            return
        L_0x0361:
            r1 = r43
            r2 = 3
            r18 = 5
            r19 = r3
            r21 = r19
        L_0x036a:
            r26 = r18
            r23 = r19
            r22 = r21
            r21 = 4
            r27 = 0
            r19 = r16
        L_0x0376:
            if (r23 == 0) goto L_0x0381
            if (r15 != r14) goto L_0x0381
            if (r7 == r4) goto L_0x0381
            r23 = 0
            r28 = 0
            goto L_0x0385
        L_0x0381:
            r28 = r23
            r23 = r3
        L_0x0385:
            if (r22 == 0) goto L_0x03cb
            if (r25 != 0) goto L_0x039a
            if (r54 != 0) goto L_0x039a
            if (r56 != 0) goto L_0x039a
            if (r15 != r8) goto L_0x039a
            if (r14 != r1) goto L_0x039a
            r22 = r17
            r26 = r22
            r19 = 0
            r23 = 0
            goto L_0x039e
        L_0x039a:
            r22 = r19
            r19 = r39
        L_0x039e:
            int r29 = r46.e()
            int r30 = r47.e()
            r13 = r1
            r1 = r37
            r13 = r17
            r17 = 4
            r35 = r18
            r18 = r3
            r3 = r35
            r2 = r9
            r3 = r15
            r31 = r4
            r4 = r29
            r32 = r5
            r5 = r52
            r6 = r14
            r33 = r7
            r7 = r11
            r8 = r30
            r34 = r9
            r9 = r22
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x03db
        L_0x03cb:
            r18 = r3
            r31 = r4
            r32 = r5
            r33 = r7
            r34 = r9
            r13 = r17
            r17 = 4
            r19 = r39
        L_0x03db:
            r2 = r23
            int r1 = r0.f8o0
            if (r1 != r13) goto L_0x03e8
            boolean r1 = r47.h()
            if (r1 != 0) goto L_0x03e8
            return
        L_0x03e8:
            if (r28 == 0) goto L_0x041c
            if (r19 == 0) goto L_0x0402
            if (r15 == r14) goto L_0x0402
            if (r25 != 0) goto L_0x0402
            r1 = r33
            boolean r3 = r1 instanceof h0.g.a.h.a
            if (r3 != 0) goto L_0x03fd
            r3 = r32
            boolean r4 = r3 instanceof h0.g.a.h.a
            if (r4 == 0) goto L_0x0406
            goto L_0x03ff
        L_0x03fd:
            r3 = r32
        L_0x03ff:
            r4 = r16
            goto L_0x0408
        L_0x0402:
            r3 = r32
            r1 = r33
        L_0x0406:
            r4 = r26
        L_0x0408:
            int r5 = r46.e()
            r6 = r34
            r10.f(r6, r15, r5, r4)
            int r5 = r47.e()
            int r5 = -r5
            r10.g(r11, r14, r5, r4)
            r26 = r4
            goto L_0x0422
        L_0x041c:
            r3 = r32
            r1 = r33
            r6 = r34
        L_0x0422:
            if (r19 == 0) goto L_0x0438
            if (r57 == 0) goto L_0x0438
            boolean r4 = r1 instanceof h0.g.a.h.a
            if (r4 != 0) goto L_0x0438
            boolean r4 = r3 instanceof h0.g.a.h.a
            if (r4 != 0) goto L_0x0438
            r4 = r31
            if (r3 == r4) goto L_0x043a
            r5 = r16
            r7 = r5
            r2 = r18
            goto L_0x043e
        L_0x0438:
            r4 = r31
        L_0x043a:
            r5 = r21
            r7 = r26
        L_0x043e:
            if (r2 == 0) goto L_0x0489
            if (r27 == 0) goto L_0x0469
            if (r56 == 0) goto L_0x0446
            if (r40 == 0) goto L_0x0469
        L_0x0446:
            if (r1 == r4) goto L_0x044d
            if (r3 != r4) goto L_0x044b
            goto L_0x044d
        L_0x044b:
            r2 = r5
            goto L_0x044f
        L_0x044d:
            r2 = r16
        L_0x044f:
            boolean r8 = r1 instanceof h0.g.a.h.e
            if (r8 != 0) goto L_0x0457
            boolean r8 = r3 instanceof h0.g.a.h.e
            if (r8 == 0) goto L_0x0458
        L_0x0457:
            r2 = 5
        L_0x0458:
            boolean r8 = r1 instanceof h0.g.a.h.a
            if (r8 != 0) goto L_0x0460
            boolean r8 = r3 instanceof h0.g.a.h.a
            if (r8 == 0) goto L_0x0461
        L_0x0460:
            r2 = 5
        L_0x0461:
            if (r56 == 0) goto L_0x0464
            r2 = 5
        L_0x0464:
            int r2 = java.lang.Math.max(r2, r5)
            goto L_0x046a
        L_0x0469:
            r2 = r5
        L_0x046a:
            if (r19 == 0) goto L_0x047a
            int r2 = java.lang.Math.min(r7, r2)
            if (r53 == 0) goto L_0x047a
            if (r56 != 0) goto L_0x047a
            if (r1 == r4) goto L_0x0478
            if (r3 != r4) goto L_0x047a
        L_0x0478:
            r2 = r17
        L_0x047a:
            int r1 = r46.e()
            r10.d(r6, r15, r1, r2)
            int r1 = r47.e()
            int r1 = -r1
            r10.d(r11, r14, r1, r2)
        L_0x0489:
            if (r19 == 0) goto L_0x049c
            r1 = r42
            if (r1 != r15) goto L_0x0494
            int r2 = r46.e()
            goto L_0x0495
        L_0x0494:
            r2 = 0
        L_0x0495:
            if (r15 == r1) goto L_0x049c
            r3 = 5
            r10.f(r6, r1, r2, r3)
            goto L_0x049d
        L_0x049c:
            r3 = 5
        L_0x049d:
            if (r19 == 0) goto L_0x04b4
            if (r25 == 0) goto L_0x04b4
            if (r50 != 0) goto L_0x04b4
            if (r24 != 0) goto L_0x04b4
            if (r25 == 0) goto L_0x04af
            r1 = 3
            if (r12 != r1) goto L_0x04af
            r1 = 0
            r10.f(r11, r6, r1, r13)
            goto L_0x04b8
        L_0x04af:
            r1 = 0
            r10.f(r11, r6, r1, r3)
            goto L_0x04b8
        L_0x04b4:
            r1 = 0
            goto L_0x04b8
        L_0x04b6:
            r19 = r39
        L_0x04b8:
            r2 = r3
        L_0x04b9:
            if (r19 == 0) goto L_0x04ce
            if (r20 == 0) goto L_0x04ce
            r3 = r47
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.f
            if (r4 == 0) goto L_0x04c7
            int r1 = r47.e()
        L_0x04c7:
            r4 = r43
            if (r14 == r4) goto L_0x04ce
            r10.f(r4, r11, r1, r2)
        L_0x04ce:
            return
        L_0x04cf:
            r1 = r42
            r4 = r43
            r6 = r9
            r3 = 2
            r5 = 0
            r13 = 8
            r18 = 1
            if (r2 >= r3) goto L_0x0516
            if (r39 == 0) goto L_0x0516
            if (r20 == 0) goto L_0x0516
            r10.f(r6, r1, r5, r13)
            if (r38 != 0) goto L_0x04ee
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f
            if (r1 != 0) goto L_0x04ec
            goto L_0x04ee
        L_0x04ec:
            r2 = r5
            goto L_0x04f0
        L_0x04ee:
            r2 = r18
        L_0x04f0:
            if (r38 != 0) goto L_0x0511
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.O
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.f
            if (r1 == 0) goto L_0x0511
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.d
            float r2 = r1.Z
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0510
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.V
            r2 = r1[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x0510
            r1 = r1[r18]
            if (r1 != r3) goto L_0x0510
            r2 = r18
            goto L_0x0511
        L_0x0510:
            r2 = r5
        L_0x0511:
            if (r2 == 0) goto L_0x0516
            r10.f(r4, r11, r5, r13)
        L_0x0516:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.h(h0.g.a.d, boolean, boolean, boolean, boolean, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.SolverVariable, androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour, boolean, androidx.constraintlayout.core.widgets.ConstraintAnchor, androidx.constraintlayout.core.widgets.ConstraintAnchor, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void i(ConstraintAnchor.Type type, ConstraintWidget constraintWidget, ConstraintAnchor.Type type2, int i2) {
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        boolean z2;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.CENTER;
        if (type != type5) {
            ConstraintAnchor.Type type6 = ConstraintAnchor.Type.CENTER_X;
            if (type == type6 && (type2 == (type4 = ConstraintAnchor.Type.LEFT) || type2 == ConstraintAnchor.Type.RIGHT)) {
                ConstraintAnchor n2 = n(type4);
                ConstraintAnchor n3 = constraintWidget.n(type2);
                ConstraintAnchor n4 = n(ConstraintAnchor.Type.RIGHT);
                n2.a(n3, 0);
                n4.a(n3, 0);
                n(type6).a(n3, 0);
                return;
            }
            ConstraintAnchor.Type type7 = ConstraintAnchor.Type.CENTER_Y;
            if (type == type7 && (type2 == (type3 = ConstraintAnchor.Type.TOP) || type2 == ConstraintAnchor.Type.BOTTOM)) {
                ConstraintAnchor n5 = constraintWidget.n(type2);
                n(type3).a(n5, 0);
                n(ConstraintAnchor.Type.BOTTOM).a(n5, 0);
                n(type7).a(n5, 0);
            } else if (type == type6 && type2 == type6) {
                ConstraintAnchor.Type type8 = ConstraintAnchor.Type.LEFT;
                n(type8).a(constraintWidget.n(type8), 0);
                ConstraintAnchor.Type type9 = ConstraintAnchor.Type.RIGHT;
                n(type9).a(constraintWidget.n(type9), 0);
                n(type6).a(constraintWidget.n(type2), 0);
            } else if (type == type7 && type2 == type7) {
                ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                n(type10).a(constraintWidget.n(type10), 0);
                ConstraintAnchor.Type type11 = ConstraintAnchor.Type.BOTTOM;
                n(type11).a(constraintWidget.n(type11), 0);
                n(type7).a(constraintWidget.n(type2), 0);
            } else {
                ConstraintAnchor n6 = n(type);
                ConstraintAnchor n7 = constraintWidget.n(type2);
                if (n6.j(n7)) {
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BASELINE;
                    if (type == type12) {
                        ConstraintAnchor n8 = n(ConstraintAnchor.Type.TOP);
                        ConstraintAnchor n9 = n(ConstraintAnchor.Type.BOTTOM);
                        if (n8 != null) {
                            n8.k();
                        }
                        if (n9 != null) {
                            n9.k();
                        }
                    } else if (type == ConstraintAnchor.Type.TOP || type == ConstraintAnchor.Type.BOTTOM) {
                        ConstraintAnchor n10 = n(type12);
                        if (n10 != null) {
                            n10.k();
                        }
                        ConstraintAnchor n11 = n(type5);
                        if (n11.f != n7) {
                            n11.k();
                        }
                        ConstraintAnchor f2 = n(type).f();
                        ConstraintAnchor n12 = n(type7);
                        if (n12.i()) {
                            f2.k();
                            n12.k();
                        }
                    } else if (type == ConstraintAnchor.Type.LEFT || type == ConstraintAnchor.Type.RIGHT) {
                        ConstraintAnchor n13 = n(type5);
                        if (n13.f != n7) {
                            n13.k();
                        }
                        ConstraintAnchor f3 = n(type).f();
                        ConstraintAnchor n14 = n(type6);
                        if (n14.i()) {
                            f3.k();
                            n14.k();
                        }
                    }
                    n6.a(n7, i2);
                }
            }
        } else if (type2 == type5) {
            ConstraintAnchor.Type type13 = ConstraintAnchor.Type.LEFT;
            ConstraintAnchor n15 = n(type13);
            ConstraintAnchor.Type type14 = ConstraintAnchor.Type.RIGHT;
            ConstraintAnchor n16 = n(type14);
            ConstraintAnchor.Type type15 = ConstraintAnchor.Type.TOP;
            ConstraintAnchor n17 = n(type15);
            ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
            ConstraintAnchor n18 = n(type16);
            boolean z3 = true;
            if ((n15 == null || !n15.i()) && (n16 == null || !n16.i())) {
                i(type13, constraintWidget, type13, 0);
                i(type14, constraintWidget, type14, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((n17 == null || !n17.i()) && (n18 == null || !n18.i())) {
                i(type15, constraintWidget, type15, 0);
                i(type16, constraintWidget, type16, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                n(type5).a(constraintWidget.n(type5), 0);
            } else if (z2) {
                ConstraintAnchor.Type type17 = ConstraintAnchor.Type.CENTER_X;
                n(type17).a(constraintWidget.n(type17), 0);
            } else if (z3) {
                ConstraintAnchor.Type type18 = ConstraintAnchor.Type.CENTER_Y;
                n(type18).a(constraintWidget.n(type18), 0);
            }
        } else {
            ConstraintAnchor.Type type19 = ConstraintAnchor.Type.LEFT;
            if (type2 == type19 || type2 == ConstraintAnchor.Type.RIGHT) {
                i(type19, constraintWidget, type2, 0);
                i(ConstraintAnchor.Type.RIGHT, constraintWidget, type2, 0);
                n(type5).a(constraintWidget.n(type2), 0);
                return;
            }
            ConstraintAnchor.Type type20 = ConstraintAnchor.Type.TOP;
            if (type2 == type20 || type2 == ConstraintAnchor.Type.BOTTOM) {
                i(type20, constraintWidget, type2, 0);
                i(ConstraintAnchor.Type.BOTTOM, constraintWidget, type2, 0);
                n(type5).a(constraintWidget.n(type2), 0);
            }
        }
    }

    public void j(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2) {
        if (constraintAnchor.d == this) {
            i(constraintAnchor.e, constraintAnchor2.d, constraintAnchor2.e, i2);
        }
    }

    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        this.n = constraintWidget.n;
        this.o = constraintWidget.o;
        this.q = constraintWidget.q;
        this.r = constraintWidget.r;
        int[] iArr = this.s;
        int[] iArr2 = constraintWidget.s;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.t = constraintWidget.t;
        this.u = constraintWidget.u;
        this.w = constraintWidget.w;
        this.x = constraintWidget.x;
        this.y = constraintWidget.y;
        this.z = constraintWidget.z;
        this.A = constraintWidget.A;
        this.B = constraintWidget.B;
        this.C = constraintWidget.C;
        int[] iArr3 = constraintWidget.D;
        this.D = Arrays.copyOf(iArr3, iArr3.length);
        this.E = constraintWidget.E;
        this.F = constraintWidget.F;
        this.G = constraintWidget.G;
        this.K.k();
        this.L.k();
        this.M.k();
        this.N.k();
        this.O.k();
        this.P.k();
        this.Q.k();
        this.R.k();
        this.V = (DimensionBehaviour[]) Arrays.copyOf(this.V, 2);
        ConstraintWidget constraintWidget2 = null;
        this.W = this.W == null ? null : hashMap.get(constraintWidget.W);
        this.X = constraintWidget.X;
        this.Y = constraintWidget.Y;
        this.Z = constraintWidget.Z;
        this.a0 = constraintWidget.a0;
        this.b0 = constraintWidget.b0;
        this.c0 = constraintWidget.c0;
        this.d0 = constraintWidget.d0;
        this.e0 = constraintWidget.e0;
        this.f0 = constraintWidget.f0;
        this.f0g0 = constraintWidget.f0g0;
        this.f1h0 = constraintWidget.f1h0;
        this.f2i0 = constraintWidget.f2i0;
        this.f3j0 = constraintWidget.f3j0;
        this.f4k0 = constraintWidget.f4k0;
        this.f5l0 = constraintWidget.f5l0;
        this.f6m0 = constraintWidget.f6m0;
        this.f7n0 = constraintWidget.f7n0;
        this.f8o0 = constraintWidget.f8o0;
        this.f9p0 = constraintWidget.f9p0;
        this.f10q0 = constraintWidget.f10q0;
        this.f11r0 = constraintWidget.f11r0;
        this.f12s0 = constraintWidget.f12s0;
        this.f13t0 = constraintWidget.f13t0;
        this.f14u0 = constraintWidget.f14u0;
        this.f15v0 = constraintWidget.f15v0;
        this.w0 = constraintWidget.w0;
        this.x0 = constraintWidget.x0;
        this.y0 = constraintWidget.y0;
        this.z0 = constraintWidget.z0;
        this.A0 = constraintWidget.A0;
        this.B0 = constraintWidget.B0;
        this.C0 = constraintWidget.C0;
        this.D0 = constraintWidget.D0;
        this.E0 = constraintWidget.E0;
        float[] fArr = this.F0;
        float[] fArr2 = constraintWidget.F0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        ConstraintWidget[] constraintWidgetArr = this.G0;
        ConstraintWidget[] constraintWidgetArr2 = constraintWidget.G0;
        constraintWidgetArr[0] = constraintWidgetArr2[0];
        constraintWidgetArr[1] = constraintWidgetArr2[1];
        ConstraintWidget[] constraintWidgetArr3 = this.H0;
        ConstraintWidget[] constraintWidgetArr4 = constraintWidget.H0;
        constraintWidgetArr3[0] = constraintWidgetArr4[0];
        constraintWidgetArr3[1] = constraintWidgetArr4[1];
        ConstraintWidget constraintWidget3 = constraintWidget.I0;
        this.I0 = constraintWidget3 == null ? null : hashMap.get(constraintWidget3);
        ConstraintWidget constraintWidget4 = constraintWidget.J0;
        if (constraintWidget4 != null) {
            constraintWidget2 = hashMap.get(constraintWidget4);
        }
        this.J0 = constraintWidget2;
    }

    public void l(d dVar) {
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        dVar.l(this.N);
        if (this.f1h0 > 0) {
            dVar.l(this.O);
        }
    }

    public void m() {
        if (this.d == null) {
            this.d = new j(this);
        }
        if (this.e == null) {
            this.e = new l(this);
        }
    }

    public ConstraintAnchor n(ConstraintAnchor.Type type) {
        switch (type.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.K;
            case 2:
                return this.L;
            case 3:
                return this.M;
            case 4:
                return this.N;
            case 5:
                return this.O;
            case 6:
                return this.R;
            case 7:
                return this.P;
            case 8:
                return this.Q;
            default:
                throw new AssertionError(type.name());
        }
    }

    public int o() {
        return y() + this.Y;
    }

    public DimensionBehaviour p(int i2) {
        if (i2 == 0) {
            return r();
        }
        if (i2 == 1) {
            return v();
        }
        return null;
    }

    public int q() {
        if (this.f8o0 == 8) {
            return 0;
        }
        return this.Y;
    }

    public DimensionBehaviour r() {
        return this.V[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget s(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.M
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.N
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.s(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.constraintlayout.core.widgets.ConstraintWidget t(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.K
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.L
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.f
            if (r0 == 0) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.f
            if (r1 != r3) goto L_0x001f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintWidget.t(int):androidx.constraintlayout.core.widgets.ConstraintWidget");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(this.f10q0 != null ? a.y0(a.P0("type: "), this.f10q0, " ") : str);
        if (this.f9p0 != null) {
            str = a.y0(a.P0("id: "), this.f9p0, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.b0);
        sb.append(", ");
        sb.append(this.c0);
        sb.append(") - (");
        sb.append(this.X);
        sb.append(" x ");
        return a.u0(sb, this.Y, ")");
    }

    public int u() {
        return x() + this.X;
    }

    public DimensionBehaviour v() {
        return this.V[1];
    }

    public int w() {
        if (this.f8o0 == 8) {
            return 0;
        }
        return this.X;
    }

    public int x() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget == null || !(constraintWidget instanceof h0.g.a.h.c)) {
            return this.b0;
        }
        return ((h0.g.a.h.c) constraintWidget).T0 + this.b0;
    }

    public int y() {
        ConstraintWidget constraintWidget = this.W;
        if (constraintWidget == null || !(constraintWidget instanceof h0.g.a.h.c)) {
            return this.c0;
        }
        return ((h0.g.a.h.c) constraintWidget).U0 + this.c0;
    }

    public boolean z(int i2) {
        if (i2 == 0) {
            return (this.K.f != null ? 1 : 0) + (this.M.f != null ? 1 : 0) < 2;
        }
        if ((this.L.f != null ? 1 : 0) + (this.N.f != null ? 1 : 0) + (this.O.f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }
}
