package m0.r.t.a.r.c.t0;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.g;
import m0.n.a.l;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.j;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.p0;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: LazySubstitutingClassDescriptor */
public class r extends s {
    public j0 Y1;
    public final s c;
    public final TypeSubstitutor d;
    public TypeSubstitutor q;
    public List<m0> x;
    public List<m0> y;

    /* compiled from: LazySubstitutingClassDescriptor */
    public class a implements l<m0, Boolean> {
        public a(r rVar) {
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(!((m0) obj).n0());
        }
    }

    public r(s sVar, TypeSubstitutor typeSubstitutor) {
        this.c = sVar;
        this.d = typeSubstitutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00de A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void I(int r15) {
        /*
            r0 = 22
            r1 = 13
            r2 = 10
            r3 = 8
            r4 = 6
            r5 = 5
            r6 = 3
            r7 = 2
            if (r15 == r7) goto L_0x001f
            if (r15 == r6) goto L_0x001f
            if (r15 == r5) goto L_0x001f
            if (r15 == r4) goto L_0x001f
            if (r15 == r3) goto L_0x001f
            if (r15 == r2) goto L_0x001f
            if (r15 == r1) goto L_0x001f
            if (r15 == r0) goto L_0x001f
            java.lang.String r8 = "@NotNull method %s.%s must not return null"
            goto L_0x0021
        L_0x001f:
            java.lang.String r8 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
        L_0x0021:
            if (r15 == r7) goto L_0x0033
            if (r15 == r6) goto L_0x0033
            if (r15 == r5) goto L_0x0033
            if (r15 == r4) goto L_0x0033
            if (r15 == r3) goto L_0x0033
            if (r15 == r2) goto L_0x0033
            if (r15 == r1) goto L_0x0033
            if (r15 == r0) goto L_0x0033
            r9 = r7
            goto L_0x0034
        L_0x0033:
            r9 = r6
        L_0x0034:
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor"
            r11 = 0
            if (r15 == r7) goto L_0x005b
            if (r15 == r6) goto L_0x0056
            if (r15 == r5) goto L_0x0051
            if (r15 == r4) goto L_0x0056
            if (r15 == r3) goto L_0x005b
            if (r15 == r2) goto L_0x0051
            if (r15 == r1) goto L_0x0056
            if (r15 == r0) goto L_0x004c
            r9[r11] = r10
            goto L_0x005f
        L_0x004c:
            java.lang.String r12 = "substitutor"
            r9[r11] = r12
            goto L_0x005f
        L_0x0051:
            java.lang.String r12 = "typeSubstitution"
            r9[r11] = r12
            goto L_0x005f
        L_0x0056:
            java.lang.String r12 = "kotlinTypeRefiner"
            r9[r11] = r12
            goto L_0x005f
        L_0x005b:
            java.lang.String r12 = "typeArguments"
            r9[r11] = r12
        L_0x005f:
            java.lang.String r11 = "substitute"
            java.lang.String r12 = "getUnsubstitutedMemberScope"
            java.lang.String r13 = "getMemberScope"
            r14 = 1
            switch(r15) {
                case 2: goto L_0x00bd;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00ba;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00bd;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00bd;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00bd;
                case 11: goto L_0x00ba;
                case 12: goto L_0x00b7;
                case 13: goto L_0x00bd;
                case 14: goto L_0x00b7;
                case 15: goto L_0x00b2;
                case 16: goto L_0x00ad;
                case 17: goto L_0x00a8;
                case 18: goto L_0x00a3;
                case 19: goto L_0x009e;
                case 20: goto L_0x0099;
                case 21: goto L_0x0094;
                case 22: goto L_0x00bd;
                case 23: goto L_0x0091;
                case 24: goto L_0x008c;
                case 25: goto L_0x0087;
                case 26: goto L_0x0082;
                case 27: goto L_0x007d;
                case 28: goto L_0x0078;
                case 29: goto L_0x0073;
                case 30: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            java.lang.String r10 = "getTypeConstructor"
            r9[r14] = r10
            goto L_0x00bf
        L_0x006e:
            java.lang.String r10 = "getSealedSubclasses"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0073:
            java.lang.String r10 = "getDeclaredTypeParameters"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0078:
            java.lang.String r10 = "getSource"
            r9[r14] = r10
            goto L_0x00bf
        L_0x007d:
            java.lang.String r10 = "getUnsubstitutedInnerClassesScope"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0082:
            java.lang.String r10 = "getVisibility"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0087:
            java.lang.String r10 = "getModality"
            r9[r14] = r10
            goto L_0x00bf
        L_0x008c:
            java.lang.String r10 = "getKind"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0091:
            r9[r14] = r11
            goto L_0x00bf
        L_0x0094:
            java.lang.String r10 = "getContainingDeclaration"
            r9[r14] = r10
            goto L_0x00bf
        L_0x0099:
            java.lang.String r10 = "getOriginal"
            r9[r14] = r10
            goto L_0x00bf
        L_0x009e:
            java.lang.String r10 = "getName"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00a3:
            java.lang.String r10 = "getAnnotations"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00a8:
            java.lang.String r10 = "getConstructors"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00ad:
            java.lang.String r10 = "getDefaultType"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00b2:
            java.lang.String r10 = "getStaticScope"
            r9[r14] = r10
            goto L_0x00bf
        L_0x00b7:
            r9[r14] = r12
            goto L_0x00bf
        L_0x00ba:
            r9[r14] = r13
            goto L_0x00bf
        L_0x00bd:
            r9[r14] = r10
        L_0x00bf:
            if (r15 == r7) goto L_0x00d6
            if (r15 == r6) goto L_0x00d6
            if (r15 == r5) goto L_0x00d6
            if (r15 == r4) goto L_0x00d6
            if (r15 == r3) goto L_0x00d6
            if (r15 == r2) goto L_0x00d6
            if (r15 == r1) goto L_0x00d3
            if (r15 == r0) goto L_0x00d0
            goto L_0x00d8
        L_0x00d0:
            r9[r7] = r11
            goto L_0x00d8
        L_0x00d3:
            r9[r7] = r12
            goto L_0x00d8
        L_0x00d6:
            r9[r7] = r13
        L_0x00d8:
            java.lang.String r8 = java.lang.String.format(r8, r9)
            if (r15 == r7) goto L_0x00f2
            if (r15 == r6) goto L_0x00f2
            if (r15 == r5) goto L_0x00f2
            if (r15 == r4) goto L_0x00f2
            if (r15 == r3) goto L_0x00f2
            if (r15 == r2) goto L_0x00f2
            if (r15 == r1) goto L_0x00f2
            if (r15 == r0) goto L_0x00f2
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>(r8)
            goto L_0x00f7
        L_0x00f2:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            r15.<init>(r8)
        L_0x00f7:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.c.t0.r.I(int):void");
    }

    public boolean A0() {
        return this.c.A0();
    }

    public final TypeSubstitutor B0() {
        if (this.q == null) {
            if (this.d.h()) {
                this.q = this.d;
            } else {
                List<m0> parameters = this.c.i().getParameters();
                this.x = new ArrayList(parameters.size());
                this.q = h.Z3(parameters, this.d.g(), this, this.x);
                this.y = g.r(this.x, new a(this));
            }
        }
        return this.q;
    }

    public MemberScope D(p0 p0Var, e eVar) {
        if (p0Var == null) {
            I(5);
            throw null;
        } else if (eVar != null) {
            MemberScope D = this.c.D(p0Var, eVar);
            if (!this.d.h()) {
                return new SubstitutingScope(D, B0());
            }
            if (D != null) {
                return D;
            }
            I(7);
            throw null;
        } else {
            I(6);
            throw null;
        }
    }

    public MemberScope E(e eVar) {
        if (eVar != null) {
            MemberScope E = this.c.E(eVar);
            if (!this.d.h()) {
                return new SubstitutingScope(E, B0());
            }
            if (E != null) {
                return E;
            }
            I(14);
            throw null;
        }
        I(13);
        throw null;
    }

    public boolean E0() {
        return this.c.E0();
    }

    public Collection<d> G() {
        Collection<d> G = this.c.G();
        if (G != null) {
            return G;
        }
        I(30);
        throw null;
    }

    public f0 G0() {
        throw new UnsupportedOperationException();
    }

    public boolean H() {
        return this.c.H();
    }

    public <R, D> R J(k<R, D> kVar, D d2) {
        return kVar.a(this, d2);
    }

    public boolean K() {
        return this.c.K();
    }

    public boolean L() {
        return this.c.L();
    }

    public c P() {
        return this.c.P();
    }

    public MemberScope Q() {
        MemberScope Q = this.c.Q();
        if (Q != null) {
            return Q;
        }
        I(15);
        throw null;
    }

    public d S() {
        return this.c.S();
    }

    public MemberScope Z(p0 p0Var) {
        MemberScope D = D(p0Var, DescriptorUtilsKt.j(m0.r.t.a.r.j.d.d(this)));
        if (D != null) {
            return D;
        }
        I(11);
        throw null;
    }

    public d a() {
        d a2 = this.c.a();
        if (a2 != null) {
            return a2;
        }
        I(20);
        throw null;
    }

    public i b() {
        i b = this.c.b();
        if (b != null) {
            return b;
        }
        I(21);
        throw null;
    }

    public j c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            I(22);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            return new r(this, TypeSubstitutor.f(typeSubstitutor.g(), B0().g()));
        }
    }

    public ClassKind f() {
        ClassKind f = this.c.f();
        if (f != null) {
            return f;
        }
        I(24);
        throw null;
    }

    public f getAnnotations() {
        f annotations = this.c.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        I(18);
        throw null;
    }

    public m0.r.t.a.r.g.d getName() {
        m0.r.t.a.r.g.d name = this.c.getName();
        if (name != null) {
            return name;
        }
        I(19);
        throw null;
    }

    public p getVisibility() {
        p visibility = this.c.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        I(26);
        throw null;
    }

    public j0 i() {
        j0 i = this.c.i();
        if (!this.d.h()) {
            if (this.Y1 == null) {
                TypeSubstitutor B0 = B0();
                Collection<v> b = i.b();
                ArrayList arrayList = new ArrayList(b.size());
                for (v k : b) {
                    arrayList.add(B0.k(k, Variance.INVARIANT));
                }
                this.Y1 = new m0.r.t.a.r.m.g(this, this.x, arrayList, LockBasedStorageManager.b);
            }
            j0 j0Var = this.Y1;
            if (j0Var != null) {
                return j0Var;
            }
            I(1);
            throw null;
        } else if (i != null) {
            return i;
        } else {
            I(0);
            throw null;
        }
    }

    public boolean isExternal() {
        return this.c.isExternal();
    }

    public boolean isInline() {
        return this.c.isInline();
    }

    public Modality j() {
        Modality j = this.c.j();
        if (j != null) {
            return j;
        }
        I(25);
        throw null;
    }

    public Collection<c> k() {
        Collection<c> k = this.c.k();
        ArrayList arrayList = new ArrayList(k.size());
        for (c next : k) {
            arrayList.add(((c) next.s().f(next.a()).b(next.j()).k(next.getVisibility()).n(next.f()).h(false).build()).c(B0()));
        }
        return arrayList;
    }

    public a0 q() {
        return KotlinTypeFactory.h(getAnnotations(), i(), s0.f(i().getParameters()), false, z0());
    }

    public h0 r() {
        return h0.a;
    }

    public List<m0> t() {
        B0();
        List<m0> list = this.y;
        if (list != null) {
            return list;
        }
        I(29);
        throw null;
    }

    public boolean w() {
        return this.c.w();
    }

    public MemberScope w0() {
        MemberScope w0 = this.c.w0();
        if (w0 != null) {
            return w0;
        }
        I(27);
        throw null;
    }

    public boolean z() {
        return this.c.z();
    }

    public MemberScope z0() {
        MemberScope E = E(DescriptorUtilsKt.j(m0.r.t.a.r.j.d.d(this.c)));
        if (E != null) {
            return E;
        }
        I(12);
        throw null;
    }
}
