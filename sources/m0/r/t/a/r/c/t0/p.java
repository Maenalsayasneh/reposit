package m0.r.t.a.r.c.t0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.j.g;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.o.i;

/* compiled from: FunctionDescriptorImpl */
public abstract class p extends l implements r {
    public List<o0> Y1;
    public v Z1;
    public f0 a2;
    public f0 b2;
    public Modality c2;
    public m0.r.t.a.r.c.p d2;
    public boolean e2;
    public boolean f2;
    public boolean g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public boolean o2;
    public boolean p2;
    public Collection<? extends r> q2;
    public volatile m0.n.a.a<Collection<r>> r2;
    public final r s2;
    public final CallableMemberDescriptor.Kind t2;
    public r u2;
    public Map<a.C0250a<?>, Object> v2;
    public List<m0> y;

    /* compiled from: FunctionDescriptorImpl */
    public class a implements m0.n.a.a<Collection<r>> {
        public final /* synthetic */ TypeSubstitutor c;

        public a(TypeSubstitutor typeSubstitutor) {
            this.c = typeSubstitutor;
        }

        public Object invoke() {
            i iVar = new i();
            for (r c2 : p.this.e()) {
                iVar.add(c2.c(this.c));
            }
            return iVar;
        }
    }

    /* compiled from: FunctionDescriptorImpl */
    public static class b implements m0.n.a.a<List<p0>> {
        public final /* synthetic */ List c;

        public b(List list) {
            this.c = list;
        }

        public Object invoke() {
            return this.c;
        }
    }

    /* compiled from: FunctionDescriptorImpl */
    public class c implements r.a<r> {
        public m0.r.t.a.r.m.p0 a;
        public m0.r.t.a.r.c.i b;
        public Modality c;
        public m0.r.t.a.r.c.p d;
        public r e;
        public CallableMemberDescriptor.Kind f;
        public List<o0> g;
        public f0 h;
        public f0 i;
        public v j;
        public d k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public List<m0> q;
        public f r;
        public boolean s;
        public Map<a.C0250a<?>, Object> t;
        public Boolean u;
        public boolean v;
        public final /* synthetic */ p w;

        public c(p pVar, m0.r.t.a.r.m.p0 p0Var, m0.r.t.a.r.c.i iVar, Modality modality, m0.r.t.a.r.c.p pVar2, CallableMemberDescriptor.Kind kind, List<o0> list, f0 f0Var, v vVar, d dVar) {
            if (p0Var == null) {
                r(0);
                throw null;
            } else if (iVar == null) {
                r(1);
                throw null;
            } else if (modality == null) {
                r(2);
                throw null;
            } else if (pVar2 == null) {
                r(3);
                throw null;
            } else if (kind == null) {
                r(4);
                throw null;
            } else if (list == null) {
                r(5);
                throw null;
            } else if (vVar != null) {
                this.w = pVar;
                this.e = null;
                this.i = pVar.b2;
                this.l = true;
                this.m = false;
                this.n = false;
                this.o = false;
                this.p = pVar.l2;
                this.q = null;
                this.r = null;
                this.s = pVar.m2;
                this.t = new LinkedHashMap();
                this.u = null;
                this.v = false;
                this.a = p0Var;
                this.b = iVar;
                this.c = modality;
                this.d = pVar2;
                this.f = kind;
                this.g = list;
                this.h = f0Var;
                this.j = vVar;
                this.k = null;
            } else {
                r(6);
                throw null;
            }
        }

        public static /* synthetic */ void r(int i2) {
            String str;
            int i3;
            Throwable th;
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    i3 = 2;
                    break;
                default:
                    i3 = 3;
                    break;
            }
            Object[] objArr = new Object[i3];
            switch (i2) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 13:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newReturnType";
                    break;
                case 7:
                    objArr[0] = "owner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 9:
                    objArr[0] = "modality";
                    break;
                case 11:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                case 18:
                case 20:
                    objArr[0] = InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS;
                    break;
                case 22:
                    objArr[0] = "type";
                    break;
                case 32:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 36:
                    objArr[0] = "userDataKey";
                    break;
                default:
                    objArr[0] = "substitution";
                    break;
            }
            switch (i2) {
                case 8:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                    objArr[1] = "setModality";
                    break;
                case 12:
                    objArr[1] = "setVisibility";
                    break;
                case 14:
                    objArr[1] = "setKind";
                    break;
                case 15:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 17:
                    objArr[1] = "setName";
                    break;
                case 19:
                    objArr[1] = "setValueParameters";
                    break;
                case 21:
                    objArr[1] = "setTypeParameters";
                    break;
                case 23:
                    objArr[1] = "setReturnType";
                    break;
                case 24:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 25:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 26:
                    objArr[1] = "setOriginal";
                    break;
                case 27:
                    objArr[1] = "setSignatureChange";
                    break;
                case 28:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case 29:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 30:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 31:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 33:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 35:
                    objArr[1] = "setSubstitution";
                    break;
                case 37:
                    objArr[1] = "putUserData";
                    break;
                case 38:
                    objArr[1] = "getSubstitution";
                    break;
                case 39:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
            }
            switch (i2) {
                case 7:
                    objArr[2] = "setOwner";
                    break;
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    break;
                case 9:
                    objArr[2] = "setModality";
                    break;
                case 11:
                    objArr[2] = "setVisibility";
                    break;
                case 13:
                    objArr[2] = "setKind";
                    break;
                case 16:
                    objArr[2] = "setName";
                    break;
                case 18:
                    objArr[2] = "setValueParameters";
                    break;
                case 20:
                    objArr[2] = "setTypeParameters";
                    break;
                case 22:
                    objArr[2] = "setReturnType";
                    break;
                case 32:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 34:
                    objArr[2] = "setSubstitution";
                    break;
                case 36:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            switch (i2) {
                case 8:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                case 19:
                case 21:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 33:
                case 35:
                case 37:
                case 38:
                case 39:
                    th = new IllegalStateException(format);
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
            throw th;
        }

        public r.a a(List list) {
            if (list != null) {
                this.g = list;
                return this;
            }
            r(18);
            throw null;
        }

        public r.a b(Modality modality) {
            if (modality != null) {
                this.c = modality;
                return this;
            }
            r(9);
            throw null;
        }

        public r build() {
            return this.w.I0(this);
        }

        public r.a c(f0 f0Var) {
            this.i = f0Var;
            return this;
        }

        public r.a d() {
            this.n = true;
            return this;
        }

        public r.a e(v vVar) {
            if (vVar != null) {
                this.j = vVar;
                return this;
            }
            r(22);
            throw null;
        }

        public r.a f(CallableMemberDescriptor callableMemberDescriptor) {
            this.e = (r) callableMemberDescriptor;
            return this;
        }

        public r.a g() {
            this.s = true;
            return this;
        }

        public r.a h(boolean z) {
            this.l = z;
            return this;
        }

        public r.a i(m0.r.t.a.r.m.p0 p0Var) {
            if (p0Var != null) {
                this.a = p0Var;
                return this;
            }
            r(34);
            throw null;
        }

        public r.a j(List list) {
            if (list != null) {
                this.q = list;
                return this;
            }
            r(20);
            throw null;
        }

        public r.a k(m0.r.t.a.r.c.p pVar) {
            if (pVar != null) {
                this.d = pVar;
                return this;
            }
            r(11);
            throw null;
        }

        public r.a l(m0.r.t.a.r.c.i iVar) {
            if (iVar != null) {
                this.b = iVar;
                return this;
            }
            r(7);
            throw null;
        }

        public r.a m() {
            this.p = true;
            return this;
        }

        public r.a n(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                this.f = kind;
                return this;
            }
            r(13);
            throw null;
        }

        public r.a o(f fVar) {
            if (fVar != null) {
                this.r = fVar;
                return this;
            }
            r(32);
            throw null;
        }

        public r.a p(d dVar) {
            if (dVar != null) {
                this.k = dVar;
                return this;
            }
            r(16);
            throw null;
        }

        public r.a q() {
            this.m = true;
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(m0.r.t.a.r.c.i iVar, r rVar, f fVar, d dVar, CallableMemberDescriptor.Kind kind, h0 h0Var) {
        super(iVar, fVar, dVar, h0Var);
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
            this.d2 = o.i;
            this.e2 = false;
            this.f2 = false;
            this.g2 = false;
            this.h2 = false;
            this.i2 = false;
            this.j2 = false;
            this.k2 = false;
            this.l2 = false;
            this.m2 = false;
            this.n2 = false;
            this.o2 = true;
            this.p2 = false;
            this.q2 = null;
            this.r2 = null;
            this.u2 = null;
            this.v2 = null;
            this.s2 = rVar == null ? this : rVar;
            this.t2 = kind;
        } else {
            D(4);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str;
        int i3;
        Throwable th;
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 5:
                objArr[0] = "typeParameters";
                break;
            case 6:
            case 26:
            case 28:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 7:
            case 9:
                objArr[0] = "visibility";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 10:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 11:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 15:
                objArr[0] = "overriddenDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
            case 27:
            case 29:
                objArr[0] = "substitutor";
                break;
            case 23:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 8:
                objArr[1] = "initialize";
                break;
            case 12:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 13:
                objArr[1] = "getModality";
                break;
            case 14:
                objArr[1] = "getVisibility";
                break;
            case 16:
                objArr[1] = "getTypeParameters";
                break;
            case 17:
                objArr[1] = "getValueParameters";
                break;
            case 18:
                objArr[1] = "getOriginal";
                break;
            case 19:
                objArr[1] = "getKind";
                break;
            case 21:
                objArr[1] = "newCopyBuilder";
                break;
            case 24:
                objArr[1] = "copy";
                break;
            case 25:
                objArr[1] = "getSourceToUseForCopy";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
                objArr[2] = "initialize";
                break;
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setReturnType";
                break;
            case 11:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 15:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "newCopyBuilder";
                break;
            case 23:
                objArr[2] = "doSubstitute";
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 8:
            case 12:
            case 13:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 24:
            case 25:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r7v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration] */
    /* JADX WARNING: type inference failed for: r7v5, types: [kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<m0.r.t.a.r.c.o0> J0(m0.r.t.a.r.c.r r20, java.util.List<m0.r.t.a.r.c.o0> r21, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r22, boolean r23, boolean r24, boolean[] r25) {
        /*
            r0 = r22
            r1 = 0
            if (r21 == 0) goto L_0x00c8
            if (r0 == 0) goto L_0x00c2
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r21.size()
            r2.<init>(r3)
            java.util.Iterator r3 = r21.iterator()
        L_0x0014:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00c1
            java.lang.Object r4 = r3.next()
            m0.r.t.a.r.c.o0 r4 = (m0.r.t.a.r.c.o0) r4
            m0.r.t.a.r.m.v r5 = r4.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            m0.r.t.a.r.m.v r13 = r0.k(r5, r6)
            m0.r.t.a.r.m.v r5 = r4.k0()
            if (r5 != 0) goto L_0x0032
            r6 = r1
            goto L_0x0036
        L_0x0032:
            m0.r.t.a.r.m.v r6 = r0.k(r5, r6)
        L_0x0036:
            if (r13 != 0) goto L_0x0039
            return r1
        L_0x0039:
            m0.r.t.a.r.m.v r7 = r4.getType()
            if (r13 != r7) goto L_0x0041
            if (r5 == r6) goto L_0x0047
        L_0x0041:
            if (r25 == 0) goto L_0x0047
            r5 = 0
            r7 = 1
            r25[r5] = r7
        L_0x0047:
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration
            if (r5 == 0) goto L_0x005e
            r5 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration r5 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration) r5
            m0.c r5 = r5.e2
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            m0.r.t.a.r.c.t0.p$b r7 = new m0.r.t.a.r.c.t0.p$b
            r7.<init>(r5)
            r19 = r7
            goto L_0x0060
        L_0x005e:
            r19 = r1
        L_0x0060:
            if (r23 == 0) goto L_0x0064
            r9 = r1
            goto L_0x0065
        L_0x0064:
            r9 = r4
        L_0x0065:
            int r10 = r4.g()
            m0.r.t.a.r.c.r0.f r11 = r4.getAnnotations()
            m0.r.t.a.r.g.d r12 = r4.getName()
            boolean r14 = r4.s0()
            boolean r15 = r4.a0()
            boolean r16 = r4.W()
            if (r24 == 0) goto L_0x0084
            m0.r.t.a.r.c.h0 r4 = r4.r()
            goto L_0x0086
        L_0x0084:
            m0.r.t.a.r.c.h0 r4 = m0.r.t.a.r.c.h0.a
        L_0x0086:
            java.lang.String r5 = "containingDeclaration"
            r8 = r20
            m0.n.b.i.e(r8, r5)
            java.lang.String r5 = "annotations"
            m0.n.b.i.e(r11, r5)
            java.lang.String r5 = "name"
            m0.n.b.i.e(r12, r5)
            java.lang.String r5 = "outType"
            m0.n.b.i.e(r13, r5)
            java.lang.String r5 = "source"
            m0.n.b.i.e(r4, r5)
            if (r19 != 0) goto L_0x00b0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl r5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl
            r7 = r5
            r8 = r20
            r17 = r6
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00bc
        L_0x00b0:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration r5 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration
            r7 = r5
            r8 = r20
            r17 = r6
            r18 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x00bc:
            r2.add(r5)
            goto L_0x0014
        L_0x00c1:
            return r2
        L_0x00c2:
            r0 = 29
            D(r0)
            throw r1
        L_0x00c8:
            r0 = 28
            D(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.c.t0.p.J0(m0.r.t.a.r.c.r, java.util.List, kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor, boolean, boolean, boolean[]):java.util.List");
    }

    public boolean A0() {
        return this.k2;
    }

    /* renamed from: B0 */
    public r j0(m0.r.t.a.r.c.i iVar, Modality modality, m0.r.t.a.r.c.p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        r build = s().l(iVar).b(modality).k(pVar).n(kind).h(z).build();
        if (build != null) {
            return build;
        }
        D(24);
        throw null;
    }

    public boolean C() {
        return this.p2;
    }

    public abstract p H0(m0.r.t.a.r.c.i iVar, r rVar, CallableMemberDescriptor.Kind kind, d dVar, f fVar, h0 h0Var);

    public r I0(c cVar) {
        h0 h0Var;
        c0 c0Var;
        f0 f0Var;
        v k;
        r rVar;
        c cVar2 = cVar;
        boolean[] zArr = new boolean[1];
        f M = cVar2.r != null ? h.M(getAnnotations(), cVar2.r) : getAnnotations();
        m0.r.t.a.r.c.i iVar = cVar2.b;
        r rVar2 = cVar2.e;
        CallableMemberDescriptor.Kind kind = cVar2.f;
        d dVar = cVar2.k;
        if (cVar2.n) {
            if (rVar2 != null) {
                rVar = rVar2;
            } else {
                rVar = a();
            }
            h0Var = rVar.r();
        } else {
            h0Var = h0.a;
        }
        h0 h0Var2 = h0Var;
        if (h0Var2 != null) {
            p H0 = H0(iVar, rVar2, kind, dVar, M, h0Var2);
            List<m0> list = cVar2.q;
            if (list == null) {
                list = getTypeParameters();
            }
            zArr[0] = zArr[0] | (!list.isEmpty());
            ArrayList arrayList = new ArrayList(list.size());
            TypeSubstitutor a4 = h.a4(list, cVar2.a, H0, arrayList, zArr);
            if (a4 == null) {
                return null;
            }
            f0 f0Var2 = cVar2.h;
            if (f0Var2 != null) {
                v k3 = a4.k(f0Var2.getType(), Variance.IN_VARIANCE);
                if (k3 == null) {
                    return null;
                }
                c0 c0Var2 = new c0(H0, new m0.r.t.a.r.j.u.i.b(H0, k3, cVar2.h.getValue()), cVar2.h.getAnnotations());
                zArr[0] = (k3 != cVar2.h.getType()) | zArr[0];
                c0Var = c0Var2;
            } else {
                c0Var = null;
            }
            f0 f0Var3 = cVar2.i;
            if (f0Var3 != null) {
                f0 c3 = f0Var3.c(a4);
                if (c3 == null) {
                    return null;
                }
                zArr[0] = zArr[0] | (c3 != cVar2.i);
                f0Var = c3;
            } else {
                f0Var = null;
            }
            List<o0> J0 = J0(H0, cVar2.g, a4, cVar2.o, cVar2.n, zArr);
            if (J0 == null || (k = a4.k(cVar2.j, Variance.OUT_VARIANCE)) == null) {
                return null;
            }
            zArr[0] = zArr[0] | (k != cVar2.j);
            if (!zArr[0] && cVar2.v) {
                return this;
            }
            TypeSubstitutor typeSubstitutor = a4;
            H0.K0(c0Var, f0Var, arrayList, J0, k, cVar2.c, cVar2.d);
            H0.e2 = this.e2;
            H0.f2 = this.f2;
            H0.g2 = this.g2;
            H0.h2 = this.h2;
            H0.i2 = this.i2;
            H0.n2 = this.n2;
            H0.j2 = this.j2;
            H0.k2 = this.k2;
            H0.N0(this.o2);
            H0.l2 = cVar2.p;
            H0.m2 = cVar2.s;
            Boolean bool = cVar2.u;
            H0.O0(bool != null ? bool.booleanValue() : this.p2);
            if (!cVar2.t.isEmpty() || this.v2 != null) {
                Map<a.C0250a<?>, Object> map = cVar2.t;
                Map<a.C0250a<?>, Object> map2 = this.v2;
                if (map2 != null) {
                    for (Map.Entry next : map2.entrySet()) {
                        if (!map.containsKey(next.getKey())) {
                            map.put(next.getKey(), next.getValue());
                        }
                    }
                }
                if (map.size() == 1) {
                    H0.v2 = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
                } else {
                    H0.v2 = map;
                }
            }
            if (cVar2.m || this.u2 != null) {
                r rVar3 = this.u2;
                if (rVar3 == null) {
                    rVar3 = this;
                }
                H0.u2 = rVar3.c(typeSubstitutor);
            }
            if (cVar2.l && !a().e().isEmpty()) {
                if (cVar2.a.f()) {
                    m0.n.a.a<Collection<r>> aVar = this.r2;
                    if (aVar != null) {
                        H0.r2 = aVar;
                    } else {
                        H0.v0(e());
                    }
                } else {
                    H0.r2 = new a(typeSubstitutor);
                }
            }
            return H0;
        }
        D(25);
        throw null;
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        return kVar.g(this, d);
    }

    public boolean K() {
        return this.j2;
    }

    public p K0(f0 f0Var, f0 f0Var2, List<? extends m0> list, List<o0> list2, v vVar, Modality modality, m0.r.t.a.r.c.p pVar) {
        if (list == null) {
            D(5);
            throw null;
        } else if (list2 == null) {
            D(6);
            throw null;
        } else if (pVar != null) {
            this.y = g.v0(list);
            this.Y1 = g.v0(list2);
            this.Z1 = vVar;
            this.c2 = modality;
            this.d2 = pVar;
            this.a2 = f0Var;
            this.b2 = f0Var2;
            int i = 0;
            int i3 = 0;
            while (i3 < list.size()) {
                m0 m0Var = (m0) list.get(i3);
                if (m0Var.g() == i3) {
                    i3++;
                } else {
                    throw new IllegalStateException(m0Var + " index is " + m0Var.g() + " but position is " + i3);
                }
            }
            while (i < list2.size()) {
                o0 o0Var = list2.get(i);
                if (o0Var.g() == i + 0) {
                    i++;
                } else {
                    throw new IllegalStateException(o0Var + "index is " + o0Var.g() + " but position is " + i);
                }
            }
            return this;
        } else {
            D(7);
            throw null;
        }
    }

    public c L0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor != null) {
            return new c(this, typeSubstitutor.g(), b(), j(), getVisibility(), f(), h(), this.a2, getReturnType(), (d) null);
        }
        D(22);
        throw null;
    }

    public <V> void M0(a.C0250a<V> aVar, Object obj) {
        if (this.v2 == null) {
            this.v2 = new LinkedHashMap();
        }
        this.v2.put(aVar, obj);
    }

    public void N0(boolean z) {
        this.o2 = z;
    }

    public boolean O() {
        return this.i2;
    }

    public void O0(boolean z) {
        this.p2 = z;
    }

    public void P0(v vVar) {
        if (vVar != null) {
            this.Z1 = vVar;
        } else {
            D(10);
            throw null;
        }
    }

    public r c0() {
        return this.u2;
    }

    public Collection<? extends r> e() {
        m0.n.a.a<Collection<r>> aVar = this.r2;
        if (aVar != null) {
            this.q2 = aVar.invoke();
            this.r2 = null;
        }
        Collection<? extends r> collection = this.q2;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        D(12);
        throw null;
    }

    public f0 e0() {
        return this.b2;
    }

    public CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.t2;
        if (kind != null) {
            return kind;
        }
        D(19);
        throw null;
    }

    public v getReturnType() {
        return this.Z1;
    }

    public List<m0> getTypeParameters() {
        List<m0> list = this.y;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    public m0.r.t.a.r.c.p getVisibility() {
        m0.r.t.a.r.c.p pVar = this.d2;
        if (pVar != null) {
            return pVar;
        }
        D(14);
        throw null;
    }

    public List<o0> h() {
        List<o0> list = this.Y1;
        if (list != null) {
            return list;
        }
        D(17);
        throw null;
    }

    public <V> V h0(a.C0250a<V> aVar) {
        Map map = this.v2;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    public boolean isExternal() {
        return this.g2;
    }

    public boolean isInfix() {
        if (this.f2) {
            return true;
        }
        for (r isInfix : a().e()) {
            if (isInfix.isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.h2;
    }

    public boolean isOperator() {
        if (this.e2) {
            return true;
        }
        for (r isOperator : a().e()) {
            if (isOperator.isOperator()) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuspend() {
        return this.n2;
    }

    public Modality j() {
        Modality modality = this.c2;
        if (modality != null) {
            return modality;
        }
        D(13);
        throw null;
    }

    public f0 l0() {
        return this.a2;
    }

    public r.a<? extends r> s() {
        return L0(TypeSubstitutor.a);
    }

    public boolean u0() {
        return this.l2;
    }

    public void v0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != null) {
            this.q2 = collection;
            Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
            while (it.hasNext()) {
                if (((r) it.next()).y0()) {
                    this.m2 = true;
                    return;
                }
            }
            return;
        }
        D(15);
        throw null;
    }

    public boolean y0() {
        return this.m2;
    }

    public r c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            D(20);
            throw null;
        } else if (typeSubstitutor.h()) {
            return this;
        } else {
            c L0 = L0(typeSubstitutor);
            L0.e = a();
            L0.n = true;
            L0.v = true;
            return L0.build();
        }
    }

    public r a() {
        r rVar = this.s2;
        r a3 = rVar == this ? this : rVar.a();
        if (a3 != null) {
            return a3;
        }
        D(18);
        throw null;
    }
}
