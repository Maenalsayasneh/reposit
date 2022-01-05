package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.d0;
import m0.r.t.a.r.c.t0.p;
import m0.r.t.a.r.e.a.t.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;

public class JavaMethodDescriptor extends d0 implements b {
    public static final a.C0250a<o0> w2 = new a();
    public ParameterNamesStatus x2;
    public final boolean y2;

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private ParameterNamesStatus(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        public static ParameterNamesStatus get(boolean z, boolean z2) {
            ParameterNamesStatus parameterNamesStatus = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (parameterNamesStatus == null) {
                $$$reportNull$$$0(0);
            }
            return parameterNamesStatus;
        }
    }

    public static class a implements a.C0250a<o0> {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaMethodDescriptor(i iVar, g0 g0Var, f fVar, d dVar, CallableMemberDescriptor.Kind kind, h0 h0Var, boolean z) {
        super(iVar, g0Var, fVar, dVar, kind, h0Var);
        if (iVar == null) {
            D(0);
            throw null;
        } else if (fVar == null) {
            D(1);
            throw null;
        } else if (dVar == null) {
            D(2);
            throw null;
        } else if (kind == null) {
            D(3);
            throw null;
        } else if (h0Var != null) {
            this.x2 = null;
            this.y2 = z;
        } else {
            D(4);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 17 || i == 20) ? 2 : 3)];
        switch (i) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 12) {
            objArr[1] = "initialize";
        } else if (i == 17) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = "initialize";
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 18:
            case 19:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 17 || i == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static JavaMethodDescriptor V0(i iVar, f fVar, d dVar, h0 h0Var, boolean z) {
        if (iVar == null) {
            D(5);
            throw null;
        } else if (dVar == null) {
            D(7);
            throw null;
        } else if (h0Var != null) {
            return new JavaMethodDescriptor(iVar, (g0) null, fVar, dVar, CallableMemberDescriptor.Kind.DECLARATION, h0Var, z);
        } else {
            D(8);
            throw null;
        }
    }

    public boolean C() {
        return this.x2.isSynthesized;
    }

    public p H0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, d dVar, f fVar, h0 h0Var) {
        if (iVar == null) {
            D(13);
            throw null;
        } else if (kind == null) {
            D(14);
            throw null;
        } else if (fVar != null) {
            g0 g0Var = (g0) rVar;
            if (dVar == null) {
                dVar = getName();
            }
            JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(iVar, g0Var, fVar, dVar, kind, h0Var, this.y2);
            ParameterNamesStatus parameterNamesStatus = this.x2;
            javaMethodDescriptor.W0(parameterNamesStatus.isStable, parameterNamesStatus.isSynthesized);
            return javaMethodDescriptor;
        } else {
            D(15);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r4.b.a(r5) == false) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0.r.t.a.r.c.t0.d0 U0(m0.r.t.a.r.c.f0 r2, m0.r.t.a.r.c.f0 r3, java.util.List<? extends m0.r.t.a.r.c.m0> r4, java.util.List<m0.r.t.a.r.c.o0> r5, m0.r.t.a.r.m.v r6, kotlin.reflect.jvm.internal.impl.descriptors.Modality r7, m0.r.t.a.r.c.p r8, java.util.Map<? extends m0.r.t.a.r.c.a.C0250a<?>, ?> r9) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x00a4
            if (r8 == 0) goto L_0x009e
            super.U0(r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r2 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.a
            java.lang.String r3 = "functionDescriptor"
            m0.n.b.i.e(r1, r3)
            java.util.List r2 = r2.a()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0097
            java.lang.Object r4 = r2.next()
            m0.r.t.a.r.n.d r4 = (m0.r.t.a.r.n.d) r4
            java.util.Objects.requireNonNull(r4)
            m0.n.b.i.e(r1, r3)
            m0.r.t.a.r.g.d r5 = r4.a
            r6 = 0
            if (r5 == 0) goto L_0x003d
            m0.r.t.a.r.g.d r5 = r1.getName()
            m0.r.t.a.r.g.d r7 = r4.a
            boolean r5 = m0.n.b.i.a(r5, r7)
            if (r5 != 0) goto L_0x003d
            goto L_0x0065
        L_0x003d:
            kotlin.text.Regex r5 = r4.b
            if (r5 == 0) goto L_0x0057
            m0.r.t.a.r.g.d r5 = r1.getName()
            java.lang.String r5 = r5.b()
            java.lang.String r7 = "functionDescriptor.name.asString()"
            m0.n.b.i.d(r5, r7)
            kotlin.text.Regex r7 = r4.b
            boolean r5 = r7.a(r5)
            if (r5 != 0) goto L_0x0057
            goto L_0x0065
        L_0x0057:
            java.util.Collection<m0.r.t.a.r.g.d> r5 = r4.c
            if (r5 == 0) goto L_0x0067
            m0.r.t.a.r.g.d r7 = r1.getName()
            boolean r5 = r5.contains(r7)
            if (r5 != 0) goto L_0x0067
        L_0x0065:
            r5 = r6
            goto L_0x0068
        L_0x0067:
            r5 = 1
        L_0x0068:
            if (r5 != 0) goto L_0x006b
            goto L_0x0019
        L_0x006b:
            m0.n.b.i.e(r1, r3)
            m0.r.t.a.r.n.b[] r2 = r4.e
            int r3 = r2.length
        L_0x0071:
            if (r6 >= r3) goto L_0x0083
            r5 = r2[r6]
            int r6 = r6 + 1
            java.lang.String r5 = r5.a(r1)
            if (r5 == 0) goto L_0x0071
            m0.r.t.a.r.n.c$b r2 = new m0.r.t.a.r.n.c$b
            r2.<init>(r5)
            goto L_0x0099
        L_0x0083:
            m0.n.a.l<m0.r.t.a.r.c.r, java.lang.String> r2 = r4.d
            java.lang.Object r2 = r2.invoke(r1)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0094
            m0.r.t.a.r.n.c$b r3 = new m0.r.t.a.r.n.c$b
            r3.<init>(r2)
            r2 = r3
            goto L_0x0099
        L_0x0094:
            m0.r.t.a.r.n.c$c r2 = m0.r.t.a.r.n.c.C0276c.b
            goto L_0x0099
        L_0x0097:
            m0.r.t.a.r.n.c$a r2 = m0.r.t.a.r.n.c.a.b
        L_0x0099:
            boolean r2 = r2.a
            r1.e2 = r2
            return r1
        L_0x009e:
            r2 = 11
            D(r2)
            throw r0
        L_0x00a4:
            r2 = 10
            D(r2)
            throw r0
        L_0x00aa:
            r2 = 9
            D(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.U0(m0.r.t.a.r.c.f0, m0.r.t.a.r.c.f0, java.util.List, java.util.List, m0.r.t.a.r.m.v, kotlin.reflect.jvm.internal.impl.descriptors.Modality, m0.r.t.a.r.c.p, java.util.Map):m0.r.t.a.r.c.t0.d0");
    }

    public void W0(boolean z, boolean z2) {
        this.x2 = ParameterNamesStatus.get(z, z2);
    }

    public b v(v vVar, List list, v vVar2, Pair pair) {
        f0 f0Var;
        if (vVar2 != null) {
            List<o0> Z = h.Z(list, h(), this);
            if (vVar == null) {
                f0Var = null;
            } else {
                Objects.requireNonNull(f.i);
                f0Var = h.k0(this, vVar, f.a.b);
            }
            p.c cVar = (p.c) s();
            cVar.a(Z);
            cVar.e(vVar2);
            cVar.h = f0Var;
            cVar.o = true;
            cVar.n = true;
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) cVar.build();
            if (pair != null) {
                javaMethodDescriptor.M0((a.C0250a) pair.c, pair.d);
            }
            if (javaMethodDescriptor != null) {
                return javaMethodDescriptor;
            }
            D(20);
            throw null;
        }
        D(19);
        throw null;
    }
}
