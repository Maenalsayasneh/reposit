package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import h0.g.a.h.f;
import i0.d.a.a.a;

/* compiled from: VerticalWidgetRun */
public class l extends WidgetRun {
    public DependencyNode k;
    public f l = null;

    public l(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.k = dependencyNode;
        this.h.e = DependencyNode.Type.TOP;
        this.i.e = DependencyNode.Type.BOTTOM;
        dependencyNode.e = DependencyNode.Type.BASELINE;
        this.f = 1;
    }

    public void a(d dVar) {
        int i;
        float f;
        float f2;
        float f3;
        int ordinal = this.j.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal != 3) {
            f fVar = this.e;
            if (fVar.c && !fVar.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget = this.b;
                int i2 = constraintWidget.r;
                if (i2 == 2) {
                    ConstraintWidget constraintWidget2 = constraintWidget.W;
                    if (constraintWidget2 != null) {
                        f fVar2 = constraintWidget2.e.e;
                        if (fVar2.j) {
                            fVar.c((int) ((((float) fVar2.g) * constraintWidget.y) + 0.5f));
                        }
                    }
                } else if (i2 == 3) {
                    f fVar3 = constraintWidget.d.e;
                    if (fVar3.j) {
                        int i3 = constraintWidget.a0;
                        if (i3 == -1) {
                            f3 = (float) fVar3.g;
                            f2 = constraintWidget.Z;
                        } else if (i3 == 0) {
                            f = ((float) fVar3.g) * constraintWidget.Z;
                            i = (int) (f + 0.5f);
                            fVar.c(i);
                        } else if (i3 != 1) {
                            i = 0;
                            fVar.c(i);
                        } else {
                            f3 = (float) fVar3.g;
                            f2 = constraintWidget.Z;
                        }
                        f = f3 / f2;
                        i = (int) (f + 0.5f);
                        fVar.c(i);
                    }
                }
            }
            DependencyNode dependencyNode = this.h;
            if (dependencyNode.c) {
                DependencyNode dependencyNode2 = this.i;
                if (dependencyNode2.c) {
                    if (!dependencyNode.j || !dependencyNode2.j || !this.e.j) {
                        if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                            ConstraintWidget constraintWidget3 = this.b;
                            if (constraintWidget3.q == 0 && !constraintWidget3.E()) {
                                int i4 = this.h.l.get(0).g;
                                DependencyNode dependencyNode3 = this.h;
                                int i5 = i4 + dependencyNode3.f;
                                int i6 = this.i.l.get(0).g + this.i.f;
                                dependencyNode3.c(i5);
                                this.i.c(i6);
                                this.e.c(i6 - i5);
                                return;
                            }
                        }
                        if (!this.e.j && this.d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                            int i7 = (this.i.l.get(0).g + this.i.f) - (this.h.l.get(0).g + this.h.f);
                            f fVar4 = this.e;
                            int i8 = fVar4.m;
                            if (i7 < i8) {
                                fVar4.c(i7);
                            } else {
                                fVar4.c(i8);
                            }
                        }
                        if (this.e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                            DependencyNode dependencyNode4 = this.h.l.get(0);
                            DependencyNode dependencyNode5 = this.i.l.get(0);
                            int i9 = dependencyNode4.g;
                            DependencyNode dependencyNode6 = this.h;
                            int i10 = dependencyNode6.f + i9;
                            int i11 = dependencyNode5.g;
                            int i12 = this.i.f + i11;
                            float f4 = this.b.f5l0;
                            if (dependencyNode4 == dependencyNode5) {
                                f4 = 0.5f;
                            } else {
                                i9 = i10;
                                i11 = i12;
                            }
                            dependencyNode6.c((int) ((((float) ((i11 - i9) - this.e.g)) * f4) + ((float) i9) + 0.5f));
                            this.i.c(this.h.g + this.e.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ConstraintWidget constraintWidget4 = this.b;
        l(constraintWidget4.L, constraintWidget4.N, 1);
    }

    public void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4 = this.b;
        if (constraintWidget4.a) {
            this.e.c(constraintWidget4.q());
        }
        if (!this.e.j) {
            this.d = this.b.v();
            if (this.b.F) {
                this.l = new a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget3 = this.b.W) != null && constraintWidget3.v() == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int q = (constraintWidget3.q() - this.b.L.e()) - this.b.N.e();
                    b(this.h, constraintWidget3.e.h, this.b.L.e());
                    b(this.i, constraintWidget3.e.i, -this.b.N.e());
                    this.e.c(q);
                    return;
                } else if (this.d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    this.e.c(this.b.q());
                }
            }
        } else if (this.d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = this.b.W) != null && constraintWidget2.v() == ConstraintWidget.DimensionBehaviour.FIXED) {
            b(this.h, constraintWidget2.e.h, this.b.L.e());
            b(this.i, constraintWidget2.e.i, -this.b.N.e());
            return;
        }
        f fVar = this.e;
        boolean z = fVar.j;
        if (z) {
            ConstraintWidget constraintWidget5 = this.b;
            if (constraintWidget5.a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.S;
                if (constraintAnchorArr[2].f != null && constraintAnchorArr[3].f != null) {
                    if (constraintWidget5.E()) {
                        this.h.f = this.b.S[2].e();
                        this.i.f = -this.b.S[3].e();
                    } else {
                        DependencyNode h = h(this.b.S[2]);
                        if (h != null) {
                            DependencyNode dependencyNode = this.h;
                            int e = this.b.S[2].e();
                            dependencyNode.l.add(h);
                            dependencyNode.f = e;
                            h.k.add(dependencyNode);
                        }
                        DependencyNode h2 = h(this.b.S[3]);
                        if (h2 != null) {
                            DependencyNode dependencyNode2 = this.i;
                            dependencyNode2.l.add(h2);
                            dependencyNode2.f = -this.b.S[3].e();
                            h2.k.add(dependencyNode2);
                        }
                        this.h.b = true;
                        this.i.b = true;
                    }
                    ConstraintWidget constraintWidget6 = this.b;
                    if (constraintWidget6.F) {
                        b(this.k, this.h, constraintWidget6.f1h0);
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[2].f != null) {
                    DependencyNode h3 = h(constraintAnchorArr[2]);
                    if (h3 != null) {
                        DependencyNode dependencyNode3 = this.h;
                        int e2 = this.b.S[2].e();
                        dependencyNode3.l.add(h3);
                        dependencyNode3.f = e2;
                        h3.k.add(dependencyNode3);
                        b(this.i, this.h, this.e.g);
                        ConstraintWidget constraintWidget7 = this.b;
                        if (constraintWidget7.F) {
                            b(this.k, this.h, constraintWidget7.f1h0);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[3].f != null) {
                    DependencyNode h4 = h(constraintAnchorArr[3]);
                    if (h4 != null) {
                        DependencyNode dependencyNode4 = this.i;
                        dependencyNode4.l.add(h4);
                        dependencyNode4.f = -this.b.S[3].e();
                        h4.k.add(dependencyNode4);
                        b(this.h, this.i, -this.e.g);
                    }
                    ConstraintWidget constraintWidget8 = this.b;
                    if (constraintWidget8.F) {
                        b(this.k, this.h, constraintWidget8.f1h0);
                        return;
                    }
                    return;
                } else if (constraintAnchorArr[4].f != null) {
                    DependencyNode h5 = h(constraintAnchorArr[4]);
                    if (h5 != null) {
                        DependencyNode dependencyNode5 = this.k;
                        dependencyNode5.l.add(h5);
                        dependencyNode5.f = 0;
                        h5.k.add(dependencyNode5);
                        b(this.h, this.k, -this.b.f1h0);
                        b(this.i, this.h, this.e.g);
                        return;
                    }
                    return;
                } else if (!(constraintWidget5 instanceof f) && constraintWidget5.W != null && constraintWidget5.n(ConstraintAnchor.Type.CENTER).f == null) {
                    ConstraintWidget constraintWidget9 = this.b;
                    b(this.h, constraintWidget9.W.e.h, constraintWidget9.y());
                    b(this.i, this.h, this.e.g);
                    ConstraintWidget constraintWidget10 = this.b;
                    if (constraintWidget10.F) {
                        b(this.k, this.h, constraintWidget10.f1h0);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        if (z || this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            fVar.k.add(this);
            if (fVar.j) {
                a(this);
            }
        } else {
            ConstraintWidget constraintWidget11 = this.b;
            int i = constraintWidget11.r;
            if (i == 2) {
                ConstraintWidget constraintWidget12 = constraintWidget11.W;
                if (constraintWidget12 != null) {
                    f fVar2 = constraintWidget12.e.e;
                    fVar.l.add(fVar2);
                    fVar2.k.add(this.e);
                    f fVar3 = this.e;
                    fVar3.b = true;
                    fVar3.k.add(this.h);
                    this.e.k.add(this.i);
                }
            } else if (i == 3 && !constraintWidget11.E()) {
                ConstraintWidget constraintWidget13 = this.b;
                if (constraintWidget13.q != 3) {
                    f fVar4 = constraintWidget13.d.e;
                    this.e.l.add(fVar4);
                    fVar4.k.add(this.e);
                    f fVar5 = this.e;
                    fVar5.b = true;
                    fVar5.k.add(this.h);
                    this.e.k.add(this.i);
                }
            }
        }
        ConstraintWidget constraintWidget14 = this.b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget14.S;
        if (constraintAnchorArr2[2].f != null && constraintAnchorArr2[3].f != null) {
            if (constraintWidget14.E()) {
                this.h.f = this.b.S[2].e();
                this.i.f = -this.b.S[3].e();
            } else {
                DependencyNode h6 = h(this.b.S[2]);
                DependencyNode h7 = h(this.b.S[3]);
                if (h6 != null) {
                    h6.k.add(this);
                    if (h6.j) {
                        a(this);
                    }
                }
                if (h7 != null) {
                    h7.k.add(this);
                    if (h7.j) {
                        a(this);
                    }
                }
                this.j = WidgetRun.RunType.CENTER;
            }
            if (this.b.F) {
                c(this.k, this.h, 1, this.l);
            }
        } else if (constraintAnchorArr2[2].f != null) {
            DependencyNode h8 = h(constraintAnchorArr2[2]);
            if (h8 != null) {
                DependencyNode dependencyNode6 = this.h;
                int e3 = this.b.S[2].e();
                dependencyNode6.l.add(h8);
                dependencyNode6.f = e3;
                h8.k.add(dependencyNode6);
                c(this.i, this.h, 1, this.e);
                if (this.b.F) {
                    c(this.k, this.h, 1, this.l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget15 = this.b;
                    if (constraintWidget15.Z > 0.0f) {
                        j jVar = constraintWidget15.d;
                        if (jVar.d == dimensionBehaviour3) {
                            jVar.e.k.add(this.e);
                            this.e.l.add(this.b.d.e);
                            this.e.a = this;
                        }
                    }
                }
            }
        } else if (constraintAnchorArr2[3].f != null) {
            DependencyNode h9 = h(constraintAnchorArr2[3]);
            if (h9 != null) {
                DependencyNode dependencyNode7 = this.i;
                dependencyNode7.l.add(h9);
                dependencyNode7.f = -this.b.S[3].e();
                h9.k.add(dependencyNode7);
                c(this.h, this.i, -1, this.e);
                if (this.b.F) {
                    c(this.k, this.h, 1, this.l);
                }
            }
        } else if (constraintAnchorArr2[4].f != null) {
            DependencyNode h10 = h(constraintAnchorArr2[4]);
            if (h10 != null) {
                DependencyNode dependencyNode8 = this.k;
                dependencyNode8.l.add(h10);
                dependencyNode8.f = 0;
                h10.k.add(dependencyNode8);
                c(this.h, this.k, -1, this.l);
                c(this.i, this.h, 1, this.e);
            }
        } else if (!(constraintWidget14 instanceof f) && (constraintWidget = constraintWidget14.W) != null) {
            b(this.h, constraintWidget.e.h, constraintWidget14.y());
            c(this.i, this.h, 1, this.e);
            if (this.b.F) {
                c(this.k, this.h, 1, this.l);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour4 == dimensionBehaviour5) {
                ConstraintWidget constraintWidget16 = this.b;
                if (constraintWidget16.Z > 0.0f) {
                    j jVar2 = constraintWidget16.d;
                    if (jVar2.d == dimensionBehaviour5) {
                        jVar2.e.k.add(this.e);
                        this.e.l.add(this.b.d.e);
                        this.e.a = this;
                    }
                }
            }
        }
        if (this.e.l.size() == 0) {
            this.e.c = true;
        }
    }

    public void e() {
        DependencyNode dependencyNode = this.h;
        if (dependencyNode.j) {
            this.b.c0 = dependencyNode.g;
        }
    }

    public void f() {
        this.c = null;
        this.h.b();
        this.i.b();
        this.k.b();
        this.e.b();
        this.g = false;
    }

    public boolean k() {
        if (this.d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.b.r == 0) {
            return true;
        }
        return false;
    }

    public void m() {
        this.g = false;
        this.h.b();
        this.h.j = false;
        this.i.b();
        this.i.j = false;
        this.k.b();
        this.k.j = false;
        this.e.j = false;
    }

    public String toString() {
        StringBuilder P0 = a.P0("VerticalRun ");
        P0.append(this.b.f9p0);
        return P0.toString();
    }
}
