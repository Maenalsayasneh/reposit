package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.r.t.a.r.c.b0;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.q;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.j.u.i.b;
import m0.r.t.a.r.m.p0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.o.j;

/* compiled from: PropertyDescriptorImpl */
public class z extends i0 implements c0 {
    public final Modality a2;
    public p b2;
    public Collection<? extends c0> c2;
    public final c0 d2;
    public final CallableMemberDescriptor.Kind e2;
    public final boolean f2;
    public final boolean g2;
    public final boolean h2;
    public final boolean i2;
    public final boolean j2;
    public final boolean k2;
    public f0 l2;
    public f0 m2;
    public List<m0> n2;
    public a0 o2;
    public e0 p2;
    public boolean q2;
    public q r2;
    public q s2;

    /* compiled from: PropertyDescriptorImpl */
    public class a {
        public i a;
        public Modality b;
        public p c;
        public c0 d = null;
        public CallableMemberDescriptor.Kind e;
        public p0 f;
        public boolean g;
        public f0 h;
        public d i;
        public v j;

        public a() {
            this.a = z.this.b();
            this.b = z.this.j();
            this.c = z.this.getVisibility();
            this.e = z.this.f();
            this.f = p0.a;
            this.g = true;
            this.h = z.this.l2;
            this.i = z.this.getName();
            this.j = z.this.getType();
        }

        public static /* synthetic */ void a(int i2) {
            int i3 = i2;
            String str = (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11 || i3 == 19 || i3 == 13 || i3 == 14 || i3 == 16 || i3 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11 || i3 == 19 || i3 == 13 || i3 == 14 || i3 == 16 || i3 == 17) ? 2 : 3)];
            switch (i3) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i3 == 1) {
                objArr[1] = "setOwner";
            } else if (i3 == 2) {
                objArr[1] = "setOriginal";
            } else if (i3 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i3 == 5) {
                objArr[1] = "setReturnType";
            } else if (i3 == 7) {
                objArr[1] = "setModality";
            } else if (i3 == 9) {
                objArr[1] = "setVisibility";
            } else if (i3 == 11) {
                objArr[1] = "setKind";
            } else if (i3 == 19) {
                objArr[1] = "setName";
            } else if (i3 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i3 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i3 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i3 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i3) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i3 == 1 || i3 == 2 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 9 || i3 == 11 || i3 == 19 || i3 == 13 || i3 == 14 || i3 == 16 || i3 == 17) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public c0 b() {
            f0 f0Var;
            c0 c0Var;
            a0 a0Var;
            b0 b0Var;
            m0.r.t.a.r.l.i<g<?>> iVar;
            e0 e0Var;
            d0 d0Var;
            z zVar = z.this;
            Objects.requireNonNull(zVar);
            o oVar = null;
            i iVar2 = this.a;
            Modality modality = this.b;
            p pVar = this.c;
            c0 c0Var2 = this.d;
            CallableMemberDescriptor.Kind kind = this.e;
            d dVar = this.i;
            h0 h0Var = h0.a;
            z I0 = zVar.I0(iVar2, modality, pVar, c0Var2, kind, dVar, h0Var);
            List<m0> typeParameters = zVar.getTypeParameters();
            ArrayList arrayList = new ArrayList(typeParameters.size());
            TypeSubstitutor Z3 = h.Z3(typeParameters, this.f, I0, arrayList);
            v vVar = this.j;
            Variance variance = Variance.OUT_VARIANCE;
            v k2 = Z3.k(vVar, variance);
            if (k2 == null) {
                return null;
            }
            f0 f0Var2 = this.h;
            if (f0Var2 != null) {
                f0Var = f0Var2.c(Z3);
                if (f0Var == null) {
                    return null;
                }
            } else {
                f0Var = null;
            }
            f0 f0Var3 = zVar.m2;
            if (f0Var3 != null) {
                v k3 = Z3.k(f0Var3.getType(), Variance.IN_VARIANCE);
                if (k3 == null) {
                    return null;
                }
                c0Var = new c0(I0, new b(I0, k3, zVar.m2.getValue()), zVar.m2.getAnnotations());
            } else {
                c0Var = null;
            }
            I0.L0(k2, arrayList, f0Var, c0Var);
            a0 a0Var2 = zVar.o2;
            if (a0Var2 == null) {
                a0Var = null;
            } else {
                f annotations = a0Var2.getAnnotations();
                Modality modality2 = this.b;
                p visibility = zVar.o2.getVisibility();
                if (this.e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && o.e(visibility.d())) {
                    visibility = o.h;
                }
                p pVar2 = visibility;
                a0 a0Var3 = zVar.o2;
                boolean z = a0Var3.y;
                boolean z2 = a0Var3.Y1;
                boolean z3 = a0Var3.b2;
                CallableMemberDescriptor.Kind kind2 = this.e;
                c0 c0Var3 = this.d;
                if (c0Var3 == null) {
                    d0Var = null;
                } else {
                    d0Var = c0Var3.getGetter();
                }
                a0Var = new a0(I0, annotations, modality2, pVar2, z, z2, z3, kind2, d0Var, h0Var);
            }
            if (a0Var != null) {
                a0 a0Var4 = zVar.o2;
                v vVar2 = a0Var4.f2;
                a0Var.e2 = z.J0(Z3, a0Var4);
                a0Var.J0(vVar2 != null ? Z3.k(vVar2, variance) : null);
            }
            e0 e0Var2 = zVar.p2;
            if (e0Var2 == null) {
                b0Var = null;
            } else {
                f annotations2 = e0Var2.getAnnotations();
                Modality modality3 = this.b;
                p visibility2 = zVar.p2.getVisibility();
                if (this.e == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && o.e(visibility2.d())) {
                    visibility2 = o.h;
                }
                p pVar3 = visibility2;
                boolean T = zVar.p2.T();
                boolean isExternal = zVar.p2.isExternal();
                boolean isInline = zVar.p2.isInline();
                CallableMemberDescriptor.Kind kind3 = this.e;
                c0 c0Var4 = this.d;
                if (c0Var4 == null) {
                    e0Var = null;
                } else {
                    e0Var = c0Var4.getSetter();
                }
                b0Var = new b0(I0, annotations2, modality3, pVar3, T, isExternal, isInline, kind3, e0Var, h0Var);
            }
            if (b0Var != null) {
                List<o0> J0 = p.J0(b0Var, zVar.p2.h(), Z3, false, false, (boolean[]) null);
                if (J0 == null) {
                    I0.q2 = true;
                    J0 = Collections.singletonList(b0.I0(b0Var, DescriptorUtilsKt.f(this.a).o(), zVar.p2.h().get(0).getAnnotations()));
                }
                if (J0.size() == 1) {
                    b0Var.e2 = z.J0(Z3, zVar.p2);
                    b0Var.K0(J0.get(0));
                } else {
                    throw new IllegalStateException();
                }
            }
            q qVar = zVar.r2;
            o oVar2 = qVar == null ? null : new o(qVar.getAnnotations(), I0);
            q qVar2 = zVar.s2;
            if (qVar2 != null) {
                oVar = new o(qVar2.getAnnotations(), I0);
            }
            I0.K0(a0Var, b0Var, oVar2, oVar);
            if (this.g) {
                j b2 = j.b();
                for (c0 c2 : zVar.e()) {
                    b2.add(c2.c(Z3));
                }
                I0.v0(b2);
            }
            if (zVar.isConst() && (iVar = zVar.Z1) != null) {
                I0.H0(iVar);
            }
            return I0;
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [m0.r.t.a.r.c.c0] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(m0.r.t.a.r.c.i r13, m0.r.t.a.r.c.c0 r14, m0.r.t.a.r.c.r0.f r15, kotlin.reflect.jvm.internal.impl.descriptors.Modality r16, m0.r.t.a.r.c.p r17, boolean r18, m0.r.t.a.r.g.d r19, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r20, m0.r.t.a.r.c.h0 r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
        /*
            r12 = this;
            r7 = r12
            r8 = r16
            r9 = r17
            r10 = r20
            r11 = 0
            if (r13 == 0) goto L_0x0069
            if (r15 == 0) goto L_0x0064
            if (r8 == 0) goto L_0x005f
            if (r9 == 0) goto L_0x005a
            if (r19 == 0) goto L_0x0055
            if (r10 == 0) goto L_0x0050
            if (r21 == 0) goto L_0x004b
            r4 = 0
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r19
            r5 = r18
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.c2 = r11
            r7.a2 = r8
            r7.b2 = r9
            if (r14 != 0) goto L_0x002d
            r0 = r7
            goto L_0x002e
        L_0x002d:
            r0 = r14
        L_0x002e:
            r7.d2 = r0
            r7.e2 = r10
            r0 = r22
            r7.f2 = r0
            r0 = r23
            r7.g2 = r0
            r0 = r24
            r7.h2 = r0
            r0 = r25
            r7.i2 = r0
            r0 = r26
            r7.j2 = r0
            r0 = r27
            r7.k2 = r0
            return
        L_0x004b:
            r0 = 6
            D(r0)
            throw r11
        L_0x0050:
            r0 = 5
            D(r0)
            throw r11
        L_0x0055:
            r0 = 4
            D(r0)
            throw r11
        L_0x005a:
            r0 = 3
            D(r0)
            throw r11
        L_0x005f:
            r0 = 2
            D(r0)
            throw r11
        L_0x0064:
            r0 = 1
            D(r0)
            throw r11
        L_0x0069:
            r0 = 0
            D(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.c.t0.z.<init>(m0.r.t.a.r.c.i, m0.r.t.a.r.c.c0, m0.r.t.a.r.c.r0.f, kotlin.reflect.jvm.internal.impl.descriptors.Modality, m0.r.t.a.r.c.p, boolean, m0.r.t.a.r.g.d, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, m0.r.t.a.r.c.h0, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public static /* synthetic */ void D(int i) {
        String str;
        int i3;
        Throwable th;
        if (!(i == 23 || i == 33 || i == 34 || i == 36 || i == 37)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 23 || i == 33 || i == 34 || i == 36 || i == 37)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    i3 = 3;
                    break;
            }
        }
        i3 = 2;
        Object[] objArr = new Object[i3];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 16:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 30:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 32:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 14:
                objArr[0] = "outType";
                break;
            case 15:
                objArr[0] = "typeParameters";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 33:
            case 34:
            case 36:
            case 37:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
                objArr[0] = "copyConfiguration";
                break;
            case 25:
                objArr[0] = "substitutor";
                break;
            case 26:
                objArr[0] = "accessorDescriptor";
                break;
            case 27:
                objArr[0] = "newOwner";
                break;
            case 28:
                objArr[0] = "newModality";
                break;
            case 29:
                objArr[0] = "newVisibility";
                break;
            case 31:
                objArr[0] = "newName";
                break;
            case 35:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 23) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 33) {
            objArr[1] = "getOriginal";
        } else if (i == 34) {
            objArr[1] = "getKind";
        } else if (i == 36) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 37) {
            switch (i) {
                case 17:
                    objArr[1] = "getTypeParameters";
                    break;
                case 18:
                    objArr[1] = "getReturnType";
                    break;
                case 19:
                    objArr[1] = "getModality";
                    break;
                case 20:
                    objArr[1] = "getVisibility";
                    break;
                case 21:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
            case 15:
                objArr[2] = "setType";
                break;
            case 16:
                objArr[2] = "setVisibility";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 33:
            case 34:
            case 36:
            case 37:
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "doSubstitute";
                break;
            case 25:
            case 26:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 35:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 23 || i == 33 || i == 34 || i == 36 || i == 37)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static r J0(TypeSubstitutor typeSubstitutor, b0 b0Var) {
        if (b0Var == null) {
            D(26);
            throw null;
        } else if (b0Var.c0() != null) {
            return b0Var.c0().c(typeSubstitutor);
        } else {
            return null;
        }
    }

    public boolean A0() {
        return this.i2;
    }

    public z I0(i iVar, Modality modality, p pVar, c0 c0Var, CallableMemberDescriptor.Kind kind, d dVar, h0 h0Var) {
        if (iVar == null) {
            D(27);
            throw null;
        } else if (modality == null) {
            D(28);
            throw null;
        } else if (pVar == null) {
            D(29);
            throw null;
        } else if (kind == null) {
            D(30);
            throw null;
        } else if (dVar != null) {
            return new z(iVar, c0Var, getAnnotations(), modality, pVar, this.Y1, dVar, kind, h0Var, this.f2, isConst(), this.h2, this.i2, isExternal(), this.k2);
        } else {
            D(31);
            throw null;
        }
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        return kVar.d(this, d);
    }

    public boolean K() {
        return this.h2;
    }

    public void K0(a0 a0Var, e0 e0Var, q qVar, q qVar2) {
        this.o2 = a0Var;
        this.p2 = e0Var;
        this.r2 = qVar;
        this.s2 = qVar2;
    }

    public void L0(v vVar, List<? extends m0> list, f0 f0Var, f0 f0Var2) {
        if (vVar == null) {
            D(14);
            throw null;
        } else if (list != null) {
            this.y = vVar;
            this.n2 = new ArrayList(list);
            this.m2 = f0Var2;
            this.l2 = f0Var;
        } else {
            D(15);
            throw null;
        }
    }

    public boolean N() {
        return this.k2;
    }

    public Collection<? extends c0> e() {
        Collection<? extends c0> collection = this.c2;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        D(36);
        throw null;
    }

    public f0 e0() {
        return this.l2;
    }

    public CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.e2;
        if (kind != null) {
            return kind;
        }
        D(34);
        throw null;
    }

    public d0 getGetter() {
        return this.o2;
    }

    public v getReturnType() {
        v type = getType();
        if (type != null) {
            return type;
        }
        D(18);
        throw null;
    }

    public e0 getSetter() {
        return this.p2;
    }

    public List<m0> getTypeParameters() {
        List<m0> list = this.n2;
        if (list != null) {
            return list;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("typeParameters == null for ");
        P0.append(k.E(this));
        throw new IllegalStateException(P0.toString());
    }

    public p getVisibility() {
        p pVar = this.b2;
        if (pVar != null) {
            return pVar;
        }
        D(20);
        throw null;
    }

    public boolean isConst() {
        return this.g2;
    }

    public boolean isExternal() {
        return this.j2;
    }

    public Modality j() {
        Modality modality = this.a2;
        if (modality != null) {
            return modality;
        }
        D(19);
        throw null;
    }

    public CallableMemberDescriptor j0(i iVar, Modality modality, p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        a aVar = new a();
        aVar.a = iVar;
        aVar.d = null;
        aVar.b = modality;
        if (pVar != null) {
            aVar.c = pVar;
            if (kind != null) {
                aVar.e = kind;
                aVar.g = z;
                c0 b = aVar.b();
                if (b != null) {
                    return b;
                }
                D(37);
                throw null;
            }
            a.a(10);
            throw null;
        }
        a.a(8);
        throw null;
    }

    public f0 l0() {
        return this.m2;
    }

    public q m0() {
        return this.s2;
    }

    public q p0() {
        return this.r2;
    }

    public boolean q0() {
        return this.f2;
    }

    public List<b0> u() {
        ArrayList arrayList = new ArrayList(2);
        a0 a0Var = this.o2;
        if (a0Var != null) {
            arrayList.add(a0Var);
        }
        e0 e0Var = this.p2;
        if (e0Var != null) {
            arrayList.add(e0Var);
        }
        return arrayList;
    }

    public void v0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            this.c2 = collection;
        } else {
            D(35);
            throw null;
        }
    }

    public c0 c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            D(22);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            a aVar = new a();
            p0 g = typeSubstitutor.g();
            if (g != null) {
                aVar.f = g;
                aVar.d = a();
                return aVar.b();
            }
            a.a(15);
            throw null;
        }
    }

    public c0 a() {
        c0 c0Var = this.d2;
        c0 a3 = c0Var == this ? this : c0Var.a();
        if (a3 != null) {
            return a3;
        }
        D(33);
        throw null;
    }
}
