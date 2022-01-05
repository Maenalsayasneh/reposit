package kotlin.reflect.jvm.internal.impl.renderer;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.text.StringsKt__IndentKt;
import m0.c;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.a0;
import m0.r.t.a.r.c.b0;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.p0;
import m0.r.t.a.r.c.q;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.s;
import m0.r.t.a.r.c.t0.x;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.y;
import m0.r.t.a.r.g.f;
import m0.r.t.a.r.i.b;
import m0.r.t.a.r.j.p.o;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.v0;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl extends DescriptorRenderer implements b {
    public final DescriptorRendererOptionsImpl c;
    public final c d = h.H2(new DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(this));

    /* compiled from: DescriptorRendererImpl.kt */
    public final class a implements k<i, StringBuilder> {
        public final /* synthetic */ DescriptorRendererImpl a;

        public a(DescriptorRendererImpl descriptorRendererImpl) {
            m0.n.b.i.e(descriptorRendererImpl, "this$0");
            this.a = descriptorRendererImpl;
        }

        public Object a(d dVar, Object obj) {
            m0.r.t.a.r.c.c P;
            String str;
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(dVar, "descriptor");
            m0.n.b.i.e(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.a;
            Objects.requireNonNull(descriptorRendererImpl);
            boolean z = dVar.f() == ClassKind.ENUM_ENTRY;
            if (!descriptorRendererImpl.J()) {
                descriptorRendererImpl.R(sb, dVar, (AnnotationUseSiteTarget) null);
                if (!z) {
                    p visibility = dVar.getVisibility();
                    m0.n.b.i.d(visibility, "klass.visibility");
                    descriptorRendererImpl.v0(visibility, sb);
                }
                if (!(dVar.f() == ClassKind.INTERFACE && dVar.j() == Modality.ABSTRACT) && (!dVar.f().isSingleton() || dVar.j() != Modality.FINAL)) {
                    Modality j = dVar.j();
                    m0.n.b.i.d(j, "klass.modality");
                    descriptorRendererImpl.b0(j, sb, descriptorRendererImpl.P(dVar));
                }
                descriptorRendererImpl.Z(dVar, sb);
                descriptorRendererImpl.d0(sb, descriptorRendererImpl.G().contains(DescriptorRendererModifier.INNER) && dVar.L(), "inner");
                descriptorRendererImpl.d0(sb, descriptorRendererImpl.G().contains(DescriptorRendererModifier.DATA) && dVar.E0(), MessageExtension.FIELD_DATA);
                descriptorRendererImpl.d0(sb, descriptorRendererImpl.G().contains(DescriptorRendererModifier.INLINE) && dVar.isInline(), "inline");
                descriptorRendererImpl.d0(sb, descriptorRendererImpl.G().contains(DescriptorRendererModifier.VALUE) && dVar.H(), InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                descriptorRendererImpl.d0(sb, descriptorRendererImpl.G().contains(DescriptorRendererModifier.FUN) && dVar.z(), "fun");
                m0.n.b.i.e(dVar, "classifier");
                if (dVar instanceof l0) {
                    str = "typealias";
                } else if (dVar.w()) {
                    str = "companion object";
                } else {
                    int ordinal = dVar.f().ordinal();
                    if (ordinal == 0) {
                        str = "class";
                    } else if (ordinal == 1) {
                        str = "interface";
                    } else if (ordinal == 2) {
                        str = "enum class";
                    } else if (ordinal == 3) {
                        str = "enum entry";
                    } else if (ordinal == 4) {
                        str = "annotation class";
                    } else if (ordinal == 5) {
                        str = "object";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                sb.append(descriptorRendererImpl.X(str));
            }
            if (!m0.r.t.a.r.j.d.p(dVar)) {
                if (!descriptorRendererImpl.J()) {
                    descriptorRendererImpl.m0(sb);
                }
                descriptorRendererImpl.e0(dVar, sb, true);
            } else {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
                if (((Boolean) descriptorRendererOptionsImpl.G.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[30])).booleanValue()) {
                    if (descriptorRendererImpl.J()) {
                        sb.append("companion object");
                    }
                    descriptorRendererImpl.m0(sb);
                    m0.r.t.a.r.c.i b = dVar.b();
                    if (b != null) {
                        sb.append("of ");
                        m0.r.t.a.r.g.d name = b.getName();
                        m0.n.b.i.d(name, "containingDeclaration.name");
                        sb.append(descriptorRendererImpl.v(name, false));
                    }
                }
                if (descriptorRendererImpl.M() || !m0.n.b.i.a(dVar.getName(), f.b)) {
                    if (!descriptorRendererImpl.J()) {
                        descriptorRendererImpl.m0(sb);
                    }
                    m0.r.t.a.r.g.d name2 = dVar.getName();
                    m0.n.b.i.d(name2, "descriptor.name");
                    sb.append(descriptorRendererImpl.v(name2, true));
                }
            }
            if (!z) {
                List<m0> t = dVar.t();
                m0.n.b.i.d(t, "klass.declaredTypeParameters");
                descriptorRendererImpl.r0(t, sb, false);
                descriptorRendererImpl.T(dVar, sb);
                if (!dVar.f().isSingleton()) {
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = descriptorRendererImpl.c;
                    if (((Boolean) descriptorRendererOptionsImpl2.j.getValue(descriptorRendererOptionsImpl2, DescriptorRendererOptionsImpl.a[7])).booleanValue() && (P = dVar.P()) != null) {
                        sb.append(" ");
                        descriptorRendererImpl.R(sb, P, (AnnotationUseSiteTarget) null);
                        p visibility2 = P.getVisibility();
                        m0.n.b.i.d(visibility2, "primaryConstructor.visibility");
                        descriptorRendererImpl.v0(visibility2, sb);
                        sb.append(descriptorRendererImpl.X("constructor"));
                        List<o0> h = P.h();
                        m0.n.b.i.d(h, "primaryConstructor.valueParameters");
                        descriptorRendererImpl.u0(h, P.C(), sb);
                    }
                }
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl3 = descriptorRendererImpl.c;
                if (!((Boolean) descriptorRendererOptionsImpl3.x.getValue(descriptorRendererOptionsImpl3, DescriptorRendererOptionsImpl.a[21])).booleanValue() && !m0.r.t.a.r.b.f.F(dVar.q())) {
                    Collection<v> b2 = dVar.i().b();
                    m0.n.b.i.d(b2, "klass.typeConstructor.supertypes");
                    if (!b2.isEmpty() && (b2.size() != 1 || !m0.r.t.a.r.b.f.y(b2.iterator().next()))) {
                        descriptorRendererImpl.m0(sb);
                        sb.append(": ");
                        g.C(b2, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DescriptorRendererImpl$renderSuperTypes$1(descriptorRendererImpl), 60);
                    }
                }
                descriptorRendererImpl.w0(t, sb);
            }
            return i.a;
        }

        public Object b(d0 d0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(d0Var, "descriptor");
            m0.n.b.i.e(sb, "builder");
            o(d0Var, sb, "getter");
            return i.a;
        }

        public Object c(y yVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(yVar, "descriptor");
            m0.n.b.i.e(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.a;
            Objects.requireNonNull(descriptorRendererImpl);
            LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = (LazyPackageViewDescriptorImpl) yVar;
            descriptorRendererImpl.i0(lazyPackageViewDescriptorImpl.y, "package", sb);
            if (descriptorRendererImpl.o()) {
                sb.append(" in context of ");
                descriptorRendererImpl.e0(lazyPackageViewDescriptorImpl.x, sb, false);
            }
            return i.a;
        }

        public Object d(c0 c0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(c0Var, "descriptor");
            m0.n.b.i.e(sb, "builder");
            DescriptorRendererImpl.y(this.a, c0Var, sb);
            return i.a;
        }

        public Object e(l0 l0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(l0Var, "descriptor");
            m0.n.b.i.e(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.a;
            descriptorRendererImpl.R(sb, l0Var, (AnnotationUseSiteTarget) null);
            AbstractTypeAliasDescriptor abstractTypeAliasDescriptor = (AbstractTypeAliasDescriptor) l0Var;
            p pVar = abstractTypeAliasDescriptor.y;
            m0.n.b.i.d(pVar, "typeAlias.visibility");
            descriptorRendererImpl.v0(pVar, sb);
            descriptorRendererImpl.Z(l0Var, sb);
            sb.append(descriptorRendererImpl.X("typealias"));
            sb.append(" ");
            descriptorRendererImpl.e0(l0Var, sb, true);
            List<m0> t = abstractTypeAliasDescriptor.t();
            m0.n.b.i.d(t, "typeAlias.declaredTypeParameters");
            descriptorRendererImpl.r0(t, sb, false);
            descriptorRendererImpl.T(l0Var, sb);
            sb.append(" = ");
            sb.append(descriptorRendererImpl.w(((m0.r.t.a.r.k.b.w.h) l0Var).f0()));
            return i.a;
        }

        public Object f(m0.r.t.a.r.c.v vVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(vVar, "descriptor");
            m0.n.b.i.e(sb, "builder");
            DescriptorRendererImpl descriptorRendererImpl = this.a;
            Objects.requireNonNull(descriptorRendererImpl);
            x xVar = (x) vVar;
            descriptorRendererImpl.i0(xVar.y, "package-fragment", sb);
            if (descriptorRendererImpl.o()) {
                sb.append(" in ");
                descriptorRendererImpl.e0(xVar.b(), sb, false);
            }
            return i.a;
        }

        public /* bridge */ /* synthetic */ Object g(r rVar, Object obj) {
            n(rVar, (StringBuilder) obj);
            return i.a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00f7  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0143  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object h(m0.r.t.a.r.c.h r21, java.lang.Object r22) {
            /*
                r20 = this;
                r0 = r21
                r1 = r22
                java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
                java.lang.String r2 = "constructorDescriptor"
                m0.n.b.i.e(r0, r2)
                java.lang.String r2 = "builder"
                m0.n.b.i.e(r1, r2)
                r2 = r20
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r3 = r2.a
                r4 = 0
                r3.R(r1, r0, r4)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r4 = r3.c
                m0.o.d r5 = r4.p
                m0.r.k<java.lang.Object>[] r6 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
                r7 = 13
                r7 = r6[r7]
                java.lang.Object r4 = r5.getValue(r4, r7)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                r5 = 0
                r7 = 1
                if (r4 != 0) goto L_0x003f
                r4 = r0
                m0.r.t.a.r.c.t0.g r4 = (m0.r.t.a.r.c.t0.g) r4
                m0.r.t.a.r.c.d r4 = r4.y()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r4.j()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
                if (r4 == r8) goto L_0x0053
            L_0x003f:
                r4 = r0
                m0.r.t.a.r.c.t0.p r4 = (m0.r.t.a.r.c.t0.p) r4
                m0.r.t.a.r.c.p r4 = r4.getVisibility()
                java.lang.String r8 = "constructor.visibility"
                m0.n.b.i.d(r4, r8)
                boolean r4 = r3.v0(r4, r1)
                if (r4 == 0) goto L_0x0053
                r4 = r7
                goto L_0x0054
            L_0x0053:
                r4 = r5
            L_0x0054:
                r3.Y(r0, r1)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r8 = r3.c
                m0.o.d r9 = r8.P
                r10 = 39
                r10 = r6[r10]
                java.lang.Object r8 = r9.getValue(r8, r10)
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x0077
                r8 = r0
                m0.r.t.a.r.c.t0.g r8 = (m0.r.t.a.r.c.t0.g) r8
                boolean r8 = r8.x2
                if (r8 == 0) goto L_0x0077
                if (r4 == 0) goto L_0x0075
                goto L_0x0077
            L_0x0075:
                r4 = r5
                goto L_0x0078
            L_0x0077:
                r4 = r7
            L_0x0078:
                if (r4 == 0) goto L_0x0083
                java.lang.String r8 = "constructor"
                java.lang.String r8 = r3.X(r8)
                r1.append(r8)
            L_0x0083:
                r8 = r0
                m0.r.t.a.r.c.t0.g r8 = (m0.r.t.a.r.c.t0.g) r8
                m0.r.t.a.r.c.d r9 = r8.b()
                java.lang.String r10 = "constructor.containingDeclaration"
                m0.n.b.i.d(r9, r10)
                boolean r10 = r3.H()
                java.lang.String r11 = "constructor.typeParameters"
                if (r10 == 0) goto L_0x00ae
                if (r4 == 0) goto L_0x009e
                java.lang.String r4 = " "
                r1.append(r4)
            L_0x009e:
                r3.e0(r9, r1, r7)
                r4 = r0
                m0.r.t.a.r.c.t0.p r4 = (m0.r.t.a.r.c.t0.p) r4
                java.util.List r4 = r4.getTypeParameters()
                m0.n.b.i.d(r4, r11)
                r3.r0(r4, r1, r5)
            L_0x00ae:
                r4 = r0
                m0.r.t.a.r.c.t0.p r4 = (m0.r.t.a.r.c.t0.p) r4
                java.util.List r10 = r4.h()
                java.lang.String r12 = "constructor.valueParameters"
                m0.n.b.i.d(r10, r12)
                boolean r0 = r21.C()
                r3.u0(r10, r0, r1)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r3.c
                m0.o.d r10 = r0.r
                r12 = 15
                r6 = r6[r12]
                java.lang.Object r0 = r10.getValue(r0, r6)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x013d
                boolean r0 = r8.x2
                if (r0 != 0) goto L_0x013d
                m0.r.t.a.r.c.c r0 = r9.P()
                if (r0 == 0) goto L_0x013d
                java.util.List r0 = r0.h()
                java.lang.String r6 = "primaryConstructor.valueParameters"
                m0.n.b.i.d(r0, r6)
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x00f1:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x0113
                java.lang.Object r6 = r0.next()
                r8 = r6
                m0.r.t.a.r.c.o0 r8 = (m0.r.t.a.r.c.o0) r8
                boolean r9 = r8.s0()
                if (r9 != 0) goto L_0x010c
                m0.r.t.a.r.m.v r8 = r8.k0()
                if (r8 != 0) goto L_0x010c
                r8 = r7
                goto L_0x010d
            L_0x010c:
                r8 = r5
            L_0x010d:
                if (r8 == 0) goto L_0x00f1
                r12.add(r6)
                goto L_0x00f1
            L_0x0113:
                boolean r0 = r12.isEmpty()
                r0 = r0 ^ r7
                if (r0 == 0) goto L_0x013d
                java.lang.String r0 = " : "
                r1.append(r0)
                java.lang.String r0 = "this"
                java.lang.String r0 = r3.X(r0)
                r1.append(r0)
                r16 = 0
                r17 = 0
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1 r18 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl$renderConstructor$1.c
                r19 = 24
                java.lang.String r13 = ", "
                java.lang.String r14 = "("
                java.lang.String r15 = ")"
                java.lang.String r0 = m0.j.g.E(r12, r13, r14, r15, r16, r17, r18, r19)
                r1.append(r0)
            L_0x013d:
                boolean r0 = r3.H()
                if (r0 == 0) goto L_0x014d
                java.util.List r0 = r4.getTypeParameters()
                m0.n.b.i.d(r0, r11)
                r3.w0(r0, r1)
            L_0x014d:
                m0.i r0 = m0.i.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.a.h(m0.r.t.a.r.c.h, java.lang.Object):java.lang.Object");
        }

        public Object i(e0 e0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(e0Var, "descriptor");
            m0.n.b.i.e(sb, "builder");
            o(e0Var, sb, "setter");
            return i.a;
        }

        public Object j(u uVar, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(uVar, "descriptor");
            m0.n.b.i.e(sb, "builder");
            this.a.e0(uVar, sb, true);
            return i.a;
        }

        public Object k(o0 o0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(o0Var, "descriptor");
            m0.n.b.i.e(sb, "builder");
            this.a.t0(o0Var, true, sb, true);
            return i.a;
        }

        public Object l(f0 f0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(f0Var, "descriptor");
            m0.n.b.i.e(sb, "builder");
            sb.append(((m0.r.t.a.r.c.t0.k) f0Var).getName());
            return i.a;
        }

        public Object m(m0 m0Var, Object obj) {
            StringBuilder sb = (StringBuilder) obj;
            m0.n.b.i.e(m0Var, "descriptor");
            m0.n.b.i.e(sb, "builder");
            this.a.p0(m0Var, sb, true);
            return i.a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void n(m0.r.t.a.r.c.r r9, java.lang.StringBuilder r10) {
            /*
                r8 = this;
                java.lang.String r0 = "descriptor"
                m0.n.b.i.e(r9, r0)
                java.lang.String r0 = "builder"
                m0.n.b.i.e(r10, r0)
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r0 = r8.a
                boolean r1 = r0.J()
                java.lang.String r2 = "function.typeParameters"
                r3 = 1
                if (r1 != 0) goto L_0x0118
                boolean r1 = r0.I()
                if (r1 != 0) goto L_0x00fd
                r1 = 0
                r0.R(r10, r9, r1)
                m0.r.t.a.r.c.p r1 = r9.getVisibility()
                java.lang.String r4 = "function.visibility"
                m0.n.b.i.d(r1, r4)
                r0.v0(r1, r10)
                r0.c0(r9, r10)
                boolean r1 = r0.F()
                if (r1 == 0) goto L_0x0037
                r0.Z(r9, r10)
            L_0x0037:
                r0.h0(r9, r10)
                boolean r1 = r0.F()
                java.lang.String r4 = "suspend"
                if (r1 == 0) goto L_0x00d7
                boolean r1 = r9.isOperator()
                java.lang.String r5 = "functionDescriptor.overriddenDescriptors"
                r6 = 0
                if (r1 == 0) goto L_0x007c
                java.util.Collection r1 = r9.e()
                m0.n.b.i.d(r1, r5)
                boolean r7 = r1.isEmpty()
                if (r7 == 0) goto L_0x0059
                goto L_0x0071
            L_0x0059:
                java.util.Iterator r1 = r1.iterator()
            L_0x005d:
                boolean r7 = r1.hasNext()
                if (r7 == 0) goto L_0x0071
                java.lang.Object r7 = r1.next()
                m0.r.t.a.r.c.r r7 = (m0.r.t.a.r.c.r) r7
                boolean r7 = r7.isOperator()
                if (r7 == 0) goto L_0x005d
                r1 = r6
                goto L_0x0072
            L_0x0071:
                r1 = r3
            L_0x0072:
                if (r1 != 0) goto L_0x007a
                boolean r1 = r0.C()
                if (r1 == 0) goto L_0x007c
            L_0x007a:
                r1 = r3
                goto L_0x007d
            L_0x007c:
                r1 = r6
            L_0x007d:
                boolean r7 = r9.isInfix()
                if (r7 == 0) goto L_0x00b3
                java.util.Collection r7 = r9.e()
                m0.n.b.i.d(r7, r5)
                boolean r5 = r7.isEmpty()
                if (r5 == 0) goto L_0x0091
                goto L_0x00a9
            L_0x0091:
                java.util.Iterator r5 = r7.iterator()
            L_0x0095:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L_0x00a9
                java.lang.Object r7 = r5.next()
                m0.r.t.a.r.c.r r7 = (m0.r.t.a.r.c.r) r7
                boolean r7 = r7.isInfix()
                if (r7 == 0) goto L_0x0095
                r5 = r6
                goto L_0x00aa
            L_0x00a9:
                r5 = r3
            L_0x00aa:
                if (r5 != 0) goto L_0x00b2
                boolean r5 = r0.C()
                if (r5 == 0) goto L_0x00b3
            L_0x00b2:
                r6 = r3
            L_0x00b3:
                boolean r5 = r9.O()
                java.lang.String r7 = "tailrec"
                r0.d0(r10, r5, r7)
                boolean r5 = r9.isSuspend()
                r0.d0(r10, r5, r4)
                boolean r4 = r9.isInline()
                java.lang.String r5 = "inline"
                r0.d0(r10, r4, r5)
                java.lang.String r4 = "infix"
                r0.d0(r10, r6, r4)
                java.lang.String r4 = "operator"
                r0.d0(r10, r1, r4)
                goto L_0x00de
            L_0x00d7:
                boolean r1 = r9.isSuspend()
                r0.d0(r10, r1, r4)
            L_0x00de:
                r0.Y(r9, r10)
                boolean r1 = r0.M()
                if (r1 == 0) goto L_0x00fd
                boolean r1 = r9.u0()
                if (r1 == 0) goto L_0x00f2
                java.lang.String r1 = "/*isHiddenToOvercomeSignatureClash*/ "
                r10.append(r1)
            L_0x00f2:
                boolean r1 = r9.y0()
                if (r1 == 0) goto L_0x00fd
                java.lang.String r1 = "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "
                r10.append(r1)
            L_0x00fd:
                java.lang.String r1 = "fun"
                java.lang.String r1 = r0.X(r1)
                r10.append(r1)
                java.lang.String r1 = " "
                r10.append(r1)
                java.util.List r1 = r9.getTypeParameters()
                m0.n.b.i.d(r1, r2)
                r0.r0(r1, r10, r3)
                r0.k0(r9, r10)
            L_0x0118:
                r0.e0(r9, r10, r3)
                java.util.List r1 = r9.h()
                java.lang.String r3 = "function.valueParameters"
                m0.n.b.i.d(r1, r3)
                boolean r3 = r9.C()
                r0.u0(r1, r3, r10)
                r0.l0(r9, r10)
                m0.r.t.a.r.m.v r1 = r9.getReturnType()
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r3 = r0.c
                m0.o.d r4 = r3.m
                m0.r.k<java.lang.Object>[] r5 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
                r6 = 10
                r6 = r5[r6]
                java.lang.Object r3 = r4.getValue(r3, r6)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x0175
                kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r3 = r0.c
                m0.o.d r4 = r3.l
                r6 = 9
                r5 = r5[r6]
                java.lang.Object r3 = r4.getValue(r3, r5)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x0164
                if (r1 == 0) goto L_0x0164
                boolean r3 = m0.r.t.a.r.b.f.N(r1)
                if (r3 != 0) goto L_0x0175
            L_0x0164:
                java.lang.String r3 = ": "
                r10.append(r3)
                if (r1 != 0) goto L_0x016e
                java.lang.String r1 = "[NULL]"
                goto L_0x0172
            L_0x016e:
                java.lang.String r1 = r0.w(r1)
            L_0x0172:
                r10.append(r1)
            L_0x0175:
                java.util.List r9 = r9.getTypeParameters()
                m0.n.b.i.d(r9, r2)
                r0.w0(r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.a.n(m0.r.t.a.r.c.r, java.lang.StringBuilder):void");
        }

        public final void o(b0 b0Var, StringBuilder sb, String str) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.a.c;
            int ordinal = ((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.H.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[31])).ordinal();
            if (ordinal == 0) {
                this.a.Z(b0Var, sb);
                sb.append(m0.n.b.i.k(str, " for "));
                DescriptorRendererImpl descriptorRendererImpl = this.a;
                c0 x0 = b0Var.x0();
                m0.n.b.i.d(x0, "descriptor.correspondingProperty");
                DescriptorRendererImpl.y(descriptorRendererImpl, x0, sb);
            } else if (ordinal == 1) {
                n(b0Var, sb);
            }
        }
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        m0.n.b.i.e(descriptorRendererOptionsImpl, "options");
        this.c = descriptorRendererOptionsImpl;
    }

    public static /* synthetic */ void S(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb, m0.r.t.a.r.c.r0.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i) {
        int i2 = i & 2;
        descriptorRendererImpl.R(sb, aVar, (AnnotationUseSiteTarget) null);
    }

    public static final void y(DescriptorRendererImpl descriptorRendererImpl, c0 c0Var, StringBuilder sb) {
        if (!descriptorRendererImpl.J()) {
            if (!descriptorRendererImpl.I()) {
                if (descriptorRendererImpl.G().contains(DescriptorRendererModifier.ANNOTATIONS)) {
                    descriptorRendererImpl.R(sb, c0Var, (AnnotationUseSiteTarget) null);
                    q p02 = c0Var.p0();
                    if (p02 != null) {
                        descriptorRendererImpl.R(sb, p02, AnnotationUseSiteTarget.FIELD);
                    }
                    q m02 = c0Var.m0();
                    if (m02 != null) {
                        descriptorRendererImpl.R(sb, m02, AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD);
                    }
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
                    if (((PropertyAccessorRenderingPolicy) descriptorRendererOptionsImpl.H.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[31])) == PropertyAccessorRenderingPolicy.NONE) {
                        d0 getter = c0Var.getGetter();
                        if (getter != null) {
                            descriptorRendererImpl.R(sb, getter, AnnotationUseSiteTarget.PROPERTY_GETTER);
                        }
                        e0 setter = c0Var.getSetter();
                        if (setter != null) {
                            descriptorRendererImpl.R(sb, setter, AnnotationUseSiteTarget.PROPERTY_SETTER);
                            List<o0> h = setter.h();
                            m0.n.b.i.d(h, "setter.valueParameters");
                            o0 o0Var = (o0) g.j0(h);
                            m0.n.b.i.d(o0Var, "it");
                            descriptorRendererImpl.R(sb, o0Var, AnnotationUseSiteTarget.SETTER_PARAMETER);
                        }
                    }
                }
                p visibility = c0Var.getVisibility();
                m0.n.b.i.d(visibility, "property.visibility");
                descriptorRendererImpl.v0(visibility, sb);
                descriptorRendererImpl.d0(sb, descriptorRendererImpl.G().contains(DescriptorRendererModifier.CONST) && c0Var.isConst(), "const");
                descriptorRendererImpl.Z(c0Var, sb);
                descriptorRendererImpl.c0(c0Var, sb);
                descriptorRendererImpl.h0(c0Var, sb);
                descriptorRendererImpl.d0(sb, descriptorRendererImpl.G().contains(DescriptorRendererModifier.LATEINIT) && c0Var.q0(), "lateinit");
                descriptorRendererImpl.Y(c0Var, sb);
            }
            descriptorRendererImpl.s0(c0Var, sb, false);
            List<m0> typeParameters = c0Var.getTypeParameters();
            m0.n.b.i.d(typeParameters, "property.typeParameters");
            descriptorRendererImpl.r0(typeParameters, sb, true);
            descriptorRendererImpl.k0(c0Var, sb);
        }
        descriptorRendererImpl.e0(c0Var, sb, true);
        sb.append(": ");
        v type = c0Var.getType();
        m0.n.b.i.d(type, "property.type");
        sb.append(descriptorRendererImpl.w(type));
        descriptorRendererImpl.l0(c0Var, sb);
        descriptorRendererImpl.W(c0Var, sb);
        List<m0> typeParameters2 = c0Var.getTypeParameters();
        m0.n.b.i.d(typeParameters2, "property.typeParameters");
        descriptorRendererImpl.w0(typeParameters2, sb);
    }

    public final boolean A(String str, String str2) {
        if (!m0.n.b.i.a(str, StringsKt__IndentKt.B(str2, "?", "", false, 4)) && (!StringsKt__IndentKt.e(str2, "?", false, 2) || !m0.n.b.i.a(m0.n.b.i.k(str, "?"), str2))) {
            StringBuilder sb = new StringBuilder();
            sb.append('(');
            sb.append(str);
            sb.append(")?");
            return m0.n.b.i.a(sb.toString(), str2);
        }
    }

    public final String B(String str) {
        return K().escape(str);
    }

    public boolean C() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.O.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[38])).booleanValue();
    }

    public boolean D() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.V.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[46])).booleanValue();
    }

    public m0.r.t.a.r.i.a E() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (m0.r.t.a.r.i.a) descriptorRendererOptionsImpl.c.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[0]);
    }

    public boolean F() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.S.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[42])).booleanValue();
    }

    public Set<DescriptorRendererModifier> G() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (Set) descriptorRendererOptionsImpl.f.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[3]);
    }

    public boolean H() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.A.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[24])).booleanValue();
    }

    public boolean I() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.h.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[5])).booleanValue();
    }

    public boolean J() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.g.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[4])).booleanValue();
    }

    public RenderingFormat K() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (RenderingFormat) descriptorRendererOptionsImpl.D.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[27]);
    }

    public DescriptorRenderer.b L() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (DescriptorRenderer.b) descriptorRendererOptionsImpl.C.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[26]);
    }

    public boolean M() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.k.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[8])).booleanValue();
    }

    public boolean N() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.w.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[20])).booleanValue();
    }

    public final String O() {
        return K().escape(">");
    }

    public final Modality P(s sVar) {
        if (sVar instanceof d) {
            return ((d) sVar).f() == ClassKind.INTERFACE ? Modality.ABSTRACT : Modality.FINAL;
        }
        m0.r.t.a.r.c.i b = sVar.b();
        d dVar = b instanceof d ? (d) b : null;
        if (dVar == null) {
            return Modality.FINAL;
        }
        if (!(sVar instanceof CallableMemberDescriptor)) {
            return Modality.FINAL;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) sVar;
        Collection<? extends CallableMemberDescriptor> e = callableMemberDescriptor.e();
        m0.n.b.i.d(e, "this.overriddenDescriptors");
        if ((!e.isEmpty()) && dVar.j() != Modality.FINAL) {
            return Modality.OPEN;
        }
        if (dVar.f() != ClassKind.INTERFACE || m0.n.b.i.a(callableMemberDescriptor.getVisibility(), o.a)) {
            return Modality.FINAL;
        }
        Modality j = callableMemberDescriptor.j();
        Modality modality = Modality.ABSTRACT;
        if (j == modality) {
            return modality;
        }
        return Modality.OPEN;
    }

    public final String Q() {
        return K().escape("<");
    }

    public final void R(StringBuilder sb, m0.r.t.a.r.c.r0.a aVar, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set set;
        if (G().contains(DescriptorRendererModifier.ANNOTATIONS)) {
            if (aVar instanceof v) {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
                set = (Set) descriptorRendererOptionsImpl.L.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[35]);
            } else {
                DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.c;
                set = (Set) descriptorRendererOptionsImpl2.K.getValue(descriptorRendererOptionsImpl2, DescriptorRendererOptionsImpl.a[34]);
            }
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl3 = this.c;
            l lVar = (l) descriptorRendererOptionsImpl3.M.getValue(descriptorRendererOptionsImpl3, DescriptorRendererOptionsImpl.a[36]);
            for (m0.r.t.a.r.c.r0.c cVar : aVar.getAnnotations()) {
                if (!g.f(set, cVar.d()) && !m0.n.b.i.a(cVar.d(), g.a.y)) {
                    if (lVar == null || ((Boolean) lVar.invoke(cVar)).booleanValue()) {
                        sb.append(r(cVar, annotationUseSiteTarget));
                        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl4 = this.c;
                        if (((Boolean) descriptorRendererOptionsImpl4.J.getValue(descriptorRendererOptionsImpl4, DescriptorRendererOptionsImpl.a[33])).booleanValue()) {
                            sb.append(10);
                            m0.n.b.i.d(sb, "append('\\n')");
                        } else {
                            sb.append(" ");
                        }
                    }
                }
            }
        }
    }

    public final void T(m0.r.t.a.r.c.g gVar, StringBuilder sb) {
        List<m0> t = gVar.t();
        m0.n.b.i.d(t, "classifier.declaredTypeParameters");
        List<m0> parameters = gVar.i().getParameters();
        m0.n.b.i.d(parameters, "classifier.typeConstructor.parameters");
        if (M() && gVar.L() && parameters.size() > t.size()) {
            sb.append(" /*captured type parameters: ");
            q0(sb, parameters.subList(t.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String U(m0.r.t.a.r.j.p.g<?> gVar) {
        if (gVar instanceof m0.r.t.a.r.j.p.b) {
            return m0.j.g.E((Iterable) ((m0.r.t.a.r.j.p.b) gVar).a, ", ", "{", "}", 0, (CharSequence) null, new DescriptorRendererImpl$renderConstant$1(this), 24);
        }
        if (gVar instanceof m0.r.t.a.r.j.p.a) {
            return StringsKt__IndentKt.x(DescriptorRenderer.s(this, (m0.r.t.a.r.c.r0.c) ((m0.r.t.a.r.j.p.a) gVar).a, (AnnotationUseSiteTarget) null, 2, (Object) null), "@");
        }
        if (!(gVar instanceof m0.r.t.a.r.j.p.o)) {
            return gVar.toString();
        }
        o.a aVar = (o.a) ((m0.r.t.a.r.j.p.o) gVar).a;
        if (aVar instanceof o.a.C0271a) {
            return ((o.a.C0271a) aVar).a + "::class";
        } else if (aVar instanceof o.a.b) {
            o.a.b bVar = (o.a.b) aVar;
            String b = bVar.a.a.b().b();
            m0.n.b.i.d(b, "classValue.classId.asSingleFqName().asString()");
            for (int i = 0; i < bVar.a.b; i++) {
                b = "kotlin.Array<" + b + '>';
            }
            return m0.n.b.i.k(b, "::class");
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [m0.r.t.a.r.c.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void V(java.lang.StringBuilder r6, m0.r.t.a.r.m.v r7) {
        /*
            r5 = this;
            r0 = 0
            r5.R(r6, r7, r0)
            boolean r1 = i0.j.f.p.h.h2(r7)
            java.lang.String r2 = "<this>"
            if (r1 == 0) goto L_0x006b
            boolean r0 = r7 instanceof m0.r.t.a.r.m.u0
            if (r0 == 0) goto L_0x002f
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r5.c
            m0.o.d r1 = r0.U
            m0.r.k<java.lang.Object>[] r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
            r4 = 45
            r3 = r3[r4]
            java.lang.Object r0 = r1.getValue(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002f
            r0 = r7
            m0.r.t.a.r.m.u0 r0 = (m0.r.t.a.r.m.u0) r0
            java.lang.String r0 = r0.Z1
            r6.append(r0)
            goto L_0x005f
        L_0x002f:
            boolean r0 = r7 instanceof m0.r.t.a.r.m.o
            if (r0 == 0) goto L_0x0054
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r5.c
            m0.o.d r1 = r0.W
            m0.r.k<java.lang.Object>[] r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
            r4 = 47
            r3 = r3[r4]
            java.lang.Object r0 = r1.getValue(r0, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0054
            r0 = r7
            m0.r.t.a.r.m.o r0 = (m0.r.t.a.r.m.o) r0
            java.lang.String r0 = r0.R0()
            r6.append(r0)
            goto L_0x005f
        L_0x0054:
            m0.r.t.a.r.m.j0 r0 = r7.I0()
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L_0x005f:
            java.util.List r0 = r7.H0()
            java.lang.String r0 = r5.n0(r0)
            r6.append(r0)
            goto L_0x009e
        L_0x006b:
            m0.r.t.a.r.m.j0 r1 = r7.I0()
            m0.n.b.i.e(r7, r2)
            m0.r.t.a.r.m.j0 r3 = r7.I0()
            m0.r.t.a.r.c.f r3 = r3.c()
            boolean r4 = r3 instanceof m0.r.t.a.r.c.g
            if (r4 == 0) goto L_0x0081
            r0 = r3
            m0.r.t.a.r.c.g r0 = (m0.r.t.a.r.c.g) r0
        L_0x0081:
            r3 = 0
            m0.r.t.a.r.c.a0 r0 = i0.j.f.p.h.A(r7, r0, r3)
            if (r0 != 0) goto L_0x009b
            java.lang.String r0 = r5.o0(r1)
            r6.append(r0)
            java.util.List r0 = r7.H0()
            java.lang.String r0 = r5.n0(r0)
            r6.append(r0)
            goto L_0x009e
        L_0x009b:
            r5.j0(r6, r0)
        L_0x009e:
            boolean r0 = r7.J0()
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "?"
            r6.append(r0)
        L_0x00a9:
            m0.n.b.i.e(r7, r2)
            m0.r.t.a.r.m.v0 r7 = (m0.r.t.a.r.m.v0) r7
            boolean r7 = r7 instanceof m0.r.t.a.r.m.i
            if (r7 == 0) goto L_0x00b7
            java.lang.String r7 = "!!"
            r6.append(r7)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.V(java.lang.StringBuilder, m0.r.t.a.r.m.v):void");
    }

    public final void W(p0 p0Var, StringBuilder sb) {
        m0.r.t.a.r.j.p.g<?> V;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (((Boolean) descriptorRendererOptionsImpl.v.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[19])).booleanValue() && (V = p0Var.V()) != null) {
            sb.append(" = ");
            sb.append(B(U(V)));
        }
    }

    public final String X(String str) {
        int ordinal = K().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return D() ? str : i0.d.a.a.a.o0("<b>", str, "</b>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void Y(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (G().contains(DescriptorRendererModifier.MEMBER_KIND) && M() && callableMemberDescriptor.f() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb.append("/*");
            String name = callableMemberDescriptor.f().name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase();
            m0.n.b.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            sb.append(lowerCase);
            sb.append("*/ ");
        }
    }

    public final void Z(s sVar, StringBuilder sb) {
        d0(sb, sVar.isExternal(), "external");
        boolean z = true;
        d0(sb, G().contains(DescriptorRendererModifier.EXPECT) && sVar.K(), "expect");
        if (!G().contains(DescriptorRendererModifier.ACTUAL) || !sVar.A0()) {
            z = false;
        }
        d0(sb, z, "actual");
    }

    public void a(Set<m0.r.t.a.r.g.b> set) {
        m0.n.b.i.e(set, "<set-?>");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        Objects.requireNonNull(descriptorRendererOptionsImpl);
        m0.n.b.i.e(set, "<set-?>");
        descriptorRendererOptionsImpl.L.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[35], set);
    }

    public String a0(String str) {
        m0.n.b.i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        int ordinal = K().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return i0.d.a.a.a.o0("<i>", str, "</i>");
        }
        throw new NoWhenBranchMatchedException();
    }

    public void b(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        descriptorRendererOptionsImpl.g.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[4], Boolean.valueOf(z));
    }

    public final void b0(Modality modality, StringBuilder sb, Modality modality2) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (((Boolean) descriptorRendererOptionsImpl.q.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[14])).booleanValue() || modality != modality2) {
            boolean contains = G().contains(DescriptorRendererModifier.MODALITY);
            String name = modality.name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase();
            m0.n.b.i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
            d0(sb, contains, lowerCase);
        }
    }

    public void c(Set<? extends DescriptorRendererModifier> set) {
        m0.n.b.i.e(set, "<set-?>");
        this.c.c(set);
    }

    public final void c0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (!m0.r.t.a.r.j.d.y(callableMemberDescriptor) || callableMemberDescriptor.j() != Modality.FINAL) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
            if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.B.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[25])) != OverrideRenderingPolicy.RENDER_OVERRIDE || callableMemberDescriptor.j() != Modality.OPEN || !(!callableMemberDescriptor.e().isEmpty())) {
                Modality j = callableMemberDescriptor.j();
                m0.n.b.i.d(j, "callable.modality");
                b0(j, sb, P(callableMemberDescriptor));
            }
        }
    }

    public void d(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        m0.n.b.i.e(parameterNameRenderingPolicy, "<set-?>");
        this.c.d(parameterNameRenderingPolicy);
    }

    public final void d0(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(X(str));
            sb.append(" ");
        }
    }

    public void e(boolean z) {
        this.c.e(z);
    }

    public final void e0(m0.r.t.a.r.c.i iVar, StringBuilder sb, boolean z) {
        m0.r.t.a.r.g.d name = iVar.getName();
        m0.n.b.i.d(name, "descriptor.name");
        sb.append(v(name, z));
    }

    public boolean f() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return ((Boolean) descriptorRendererOptionsImpl.n.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[11])).booleanValue();
    }

    public final void f0(StringBuilder sb, v vVar) {
        v0 L0 = vVar.L0();
        m0.r.t.a.r.m.a aVar = L0 instanceof m0.r.t.a.r.m.a ? (m0.r.t.a.r.m.a) L0 : null;
        if (aVar != null) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
            m0.o.d dVar = descriptorRendererOptionsImpl.R;
            m0.r.k<Object>[] kVarArr = DescriptorRendererOptionsImpl.a;
            if (((Boolean) dVar.getValue(descriptorRendererOptionsImpl, kVarArr[41])).booleanValue()) {
                g0(sb, aVar.d);
                return;
            }
            g0(sb, aVar.q);
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.c;
            if (((Boolean) descriptorRendererOptionsImpl2.Q.getValue(descriptorRendererOptionsImpl2, kVarArr[40])).booleanValue()) {
                RenderingFormat K = K();
                RenderingFormat renderingFormat = RenderingFormat.HTML;
                if (K == renderingFormat) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* = ");
                g0(sb, aVar.d);
                sb.append(" */");
                if (K() == renderingFormat) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        g0(sb, vVar);
    }

    public void g(m0.r.t.a.r.i.a aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.c.g(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g0(java.lang.StringBuilder r14, m0.r.t.a.r.m.v r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof m0.r.t.a.r.m.w0
            if (r0 == 0) goto L_0x0019
            boolean r0 = r13.o()
            if (r0 == 0) goto L_0x0019
            r0 = r15
            m0.r.t.a.r.m.w0 r0 = (m0.r.t.a.r.m.w0) r0
            boolean r0 = r0.N0()
            if (r0 != 0) goto L_0x0019
            java.lang.String r15 = "<Not computed yet>"
            r14.append(r15)
            return
        L_0x0019:
            m0.r.t.a.r.m.v0 r15 = r15.L0()
            boolean r0 = r15 instanceof m0.r.t.a.r.m.q
            if (r0 == 0) goto L_0x002c
            m0.r.t.a.r.m.q r15 = (m0.r.t.a.r.m.q) r15
            java.lang.String r15 = r15.Q0(r13, r13)
            r14.append(r15)
            goto L_0x01f6
        L_0x002c:
            boolean r0 = r15 instanceof m0.r.t.a.r.m.a0
            if (r0 == 0) goto L_0x01f6
            m0.r.t.a.r.m.a0 r15 = (m0.r.t.a.r.m.a0) r15
            m0.r.t.a.r.m.a0 r0 = m0.r.t.a.r.m.s0.b
            boolean r0 = m0.n.b.i.a(r15, r0)
            java.lang.String r1 = "???"
            if (r0 != 0) goto L_0x01f3
            r0 = 0
            r2 = 1
            if (r15 == 0) goto L_0x004e
            m0.r.t.a.r.m.j0 r3 = r15.I0()
            m0.r.t.a.r.m.a0 r4 = m0.r.t.a.r.m.s0.a
            m0.r.t.a.r.m.j0 r4 = r4.I0()
            if (r3 != r4) goto L_0x004e
            r3 = r2
            goto L_0x004f
        L_0x004e:
            r3 = r0
        L_0x004f:
            if (r3 == 0) goto L_0x0053
            goto L_0x01f3
        L_0x0053:
            if (r15 == 0) goto L_0x005f
            m0.r.t.a.r.m.j0 r3 = r15.I0()
            boolean r3 = r3 instanceof m0.r.t.a.r.m.p.f
            if (r3 == 0) goto L_0x005f
            r3 = r2
            goto L_0x0060
        L_0x005f:
            r3 = r0
        L_0x0060:
            r4 = 0
            if (r3 == 0) goto L_0x008b
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r13.c
            m0.o.d r3 = r0.u
            m0.r.k<java.lang.Object>[] r5 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
            r6 = 18
            r5 = r5[r6]
            java.lang.Object r0 = r3.getValue(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x007e
            r14.append(r1)
            goto L_0x01f6
        L_0x007e:
            m0.r.t.a.r.m.j0 r14 = r15.I0()
            m0.r.t.a.r.m.p$f r14 = (m0.r.t.a.r.m.p.f) r14
            java.util.Objects.requireNonNull(r14)
            m0.r.t.a.r.m.p.f.f(r2)
            throw r4
        L_0x008b:
            boolean r1 = i0.j.f.p.h.h2(r15)
            if (r1 == 0) goto L_0x0096
            r13.V(r14, r15)
            goto L_0x01f6
        L_0x0096:
            boolean r1 = r13.y0(r15)
            if (r1 == 0) goto L_0x01ef
            int r1 = r14.length()
            m0.c r3 = r13.d
            java.lang.Object r3 = r3.getValue()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl r3 = (kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl) r3
            r5 = 2
            S(r3, r14, r15, r4, r5)
            int r3 = r14.length()
            if (r3 == r1) goto L_0x00b4
            r3 = r2
            goto L_0x00b5
        L_0x00b4:
            r3 = r0
        L_0x00b5:
            boolean r5 = m0.r.t.a.r.b.e.h(r15)
            boolean r6 = r15.J0()
            m0.r.t.a.r.m.v r7 = m0.r.t.a.r.b.e.d(r15)
            if (r6 != 0) goto L_0x00ca
            if (r3 == 0) goto L_0x00c8
            if (r7 == 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r8 = r0
            goto L_0x00cb
        L_0x00ca:
            r8 = r2
        L_0x00cb:
            java.lang.String r9 = "("
            if (r8 == 0) goto L_0x0112
            if (r5 == 0) goto L_0x00d7
            r3 = 40
            r14.insert(r1, r3)
            goto L_0x0112
        L_0x00d7:
            if (r3 == 0) goto L_0x010f
            java.lang.String r1 = "$this$last"
            m0.n.b.i.e(r14, r1)
            int r1 = r14.length()
            if (r1 != 0) goto L_0x00e6
            r1 = r2
            goto L_0x00e7
        L_0x00e6:
            r1 = r0
        L_0x00e7:
            if (r1 != 0) goto L_0x0107
            int r1 = kotlin.text.StringsKt__IndentKt.h(r14)
            r14.charAt(r1)
            int r1 = kotlin.text.StringsKt__IndentKt.h(r14)
            int r1 = r1 - r2
            char r1 = r14.charAt(r1)
            r3 = 41
            if (r1 == r3) goto L_0x010f
            int r1 = kotlin.text.StringsKt__IndentKt.h(r14)
            java.lang.String r3 = "()"
            r14.insert(r1, r3)
            goto L_0x010f
        L_0x0107:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "Char sequence is empty."
            r14.<init>(r15)
            throw r14
        L_0x010f:
            r14.append(r9)
        L_0x0112:
            java.lang.String r1 = "suspend"
            r13.d0(r14, r5, r1)
            java.lang.String r1 = ")"
            if (r7 == 0) goto L_0x0152
            boolean r3 = r13.y0(r7)
            if (r3 == 0) goto L_0x0127
            boolean r3 = r7.J0()
            if (r3 == 0) goto L_0x013d
        L_0x0127:
            boolean r3 = m0.r.t.a.r.b.e.h(r7)
            if (r3 != 0) goto L_0x013a
            m0.r.t.a.r.c.r0.f r3 = r7.getAnnotations()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0138
            goto L_0x013a
        L_0x0138:
            r3 = r0
            goto L_0x013b
        L_0x013a:
            r3 = r2
        L_0x013b:
            if (r3 == 0) goto L_0x013f
        L_0x013d:
            r3 = r2
            goto L_0x0140
        L_0x013f:
            r3 = r0
        L_0x0140:
            if (r3 == 0) goto L_0x0145
            r14.append(r9)
        L_0x0145:
            r13.f0(r14, r7)
            if (r3 == 0) goto L_0x014d
            r14.append(r1)
        L_0x014d:
            java.lang.String r3 = "."
            r14.append(r3)
        L_0x0152:
            r14.append(r9)
            java.util.List r3 = m0.r.t.a.r.b.e.f(r15)
            java.util.Iterator r3 = r3.iterator()
            r5 = r0
        L_0x015e:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x01af
            int r7 = r5 + 1
            java.lang.Object r9 = r3.next()
            m0.r.t.a.r.m.m0 r9 = (m0.r.t.a.r.m.m0) r9
            if (r5 <= 0) goto L_0x0173
            java.lang.String r5 = ", "
            r14.append(r5)
        L_0x0173:
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r5 = r13.c
            m0.o.d r10 = r5.T
            m0.r.k<java.lang.Object>[] r11 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
            r12 = 43
            r11 = r11[r12]
            java.lang.Object r5 = r10.getValue(r5, r11)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0197
            m0.r.t.a.r.m.v r5 = r9.getType()
            java.lang.String r10 = "typeProjection.type"
            m0.n.b.i.d(r5, r10)
            m0.r.t.a.r.g.d r5 = m0.r.t.a.r.b.e.b(r5)
            goto L_0x0198
        L_0x0197:
            r5 = r4
        L_0x0198:
            if (r5 == 0) goto L_0x01a6
            java.lang.String r5 = r13.v(r5, r0)
            r14.append(r5)
            java.lang.String r5 = ": "
            r14.append(r5)
        L_0x01a6:
            java.lang.String r5 = r13.x(r9)
            r14.append(r5)
            r5 = r7
            goto L_0x015e
        L_0x01af:
            java.lang.String r0 = ") "
            r14.append(r0)
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r13.K()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01c9
            if (r0 != r2) goto L_0x01c3
            java.lang.String r0 = "&rarr;"
            goto L_0x01d3
        L_0x01c3:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x01c9:
            kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat r0 = r13.K()
            java.lang.String r2 = "->"
            java.lang.String r0 = r0.escape(r2)
        L_0x01d3:
            r14.append(r0)
            java.lang.String r0 = " "
            r14.append(r0)
            m0.r.t.a.r.m.v r15 = m0.r.t.a.r.b.e.e(r15)
            r13.f0(r14, r15)
            if (r8 == 0) goto L_0x01e7
            r14.append(r1)
        L_0x01e7:
            if (r6 == 0) goto L_0x01f6
            java.lang.String r15 = "?"
            r14.append(r15)
            goto L_0x01f6
        L_0x01ef:
            r13.V(r14, r15)
            goto L_0x01f6
        L_0x01f3:
            r14.append(r1)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.g0(java.lang.StringBuilder, m0.r.t.a.r.m.v):void");
    }

    public void h(boolean z) {
        this.c.h(z);
    }

    public final void h0(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb) {
        if (G().contains(DescriptorRendererModifier.OVERRIDE) && (!callableMemberDescriptor.e().isEmpty())) {
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
            if (((OverrideRenderingPolicy) descriptorRendererOptionsImpl.B.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[25])) != OverrideRenderingPolicy.RENDER_OPEN) {
                d0(sb, true, "override");
                if (M()) {
                    sb.append("/*");
                    sb.append(callableMemberDescriptor.e().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    public void i(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        descriptorRendererOptionsImpl.i.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[6], Boolean.valueOf(z));
    }

    public final void i0(m0.r.t.a.r.g.b bVar, String str, StringBuilder sb) {
        sb.append(X(str));
        m0.r.t.a.r.g.c j = bVar.j();
        m0.n.b.i.d(j, "fqName.toUnsafe()");
        String u = u(j);
        if (u.length() > 0) {
            sb.append(" ");
            sb.append(u);
        }
    }

    public void j(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        descriptorRendererOptionsImpl.G.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[30], Boolean.valueOf(z));
    }

    public final void j0(StringBuilder sb, a0 a0Var) {
        StringBuilder sb2;
        a0 a0Var2 = a0Var.c;
        if (a0Var2 == null) {
            sb2 = null;
        } else {
            j0(sb, a0Var2);
            sb.append('.');
            m0.r.t.a.r.g.d name = a0Var.a.getName();
            m0.n.b.i.d(name, "possiblyInnerType.classifierDescriptor.name");
            sb.append(v(name, false));
            sb2 = sb;
        }
        if (sb2 == null) {
            j0 i = a0Var.a.i();
            m0.n.b.i.d(i, "possiblyInnerType.classifierDescriptor.typeConstructor");
            sb.append(o0(i));
        }
        sb.append(n0(a0Var.b));
    }

    public void k(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        descriptorRendererOptionsImpl.F.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[29], Boolean.valueOf(z));
    }

    public final void k0(m0.r.t.a.r.c.a aVar, StringBuilder sb) {
        f0 l02 = aVar.l0();
        if (l02 != null) {
            R(sb, l02, AnnotationUseSiteTarget.RECEIVER);
            v type = l02.getType();
            m0.n.b.i.d(type, "receiver.type");
            String w = w(type);
            if (y0(type) && !s0.g(type)) {
                w = '(' + w + ')';
            }
            sb.append(w);
            sb.append(".");
        }
    }

    public void l(RenderingFormat renderingFormat) {
        m0.n.b.i.e(renderingFormat, "<set-?>");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        Objects.requireNonNull(descriptorRendererOptionsImpl);
        m0.n.b.i.e(renderingFormat, "<set-?>");
        descriptorRendererOptionsImpl.D.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[27], renderingFormat);
    }

    public final void l0(m0.r.t.a.r.c.a aVar, StringBuilder sb) {
        f0 l02;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        if (((Boolean) descriptorRendererOptionsImpl.F.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[29])).booleanValue() && (l02 = aVar.l0()) != null) {
            sb.append(" on ");
            v type = l02.getType();
            m0.n.b.i.d(type, "receiver.type");
            sb.append(w(type));
        }
    }

    public void m(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        m0.n.b.i.e(annotationArgumentsRenderingPolicy, "<set-?>");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        Objects.requireNonNull(descriptorRendererOptionsImpl);
        m0.n.b.i.e(annotationArgumentsRenderingPolicy, "<set-?>");
        descriptorRendererOptionsImpl.N.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[37], annotationArgumentsRenderingPolicy);
    }

    public final void m0(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public Set<m0.r.t.a.r.g.b> n() {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        return (Set) descriptorRendererOptionsImpl.L.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[35]);
    }

    public String n0(List<? extends m0.r.t.a.r.m.m0> list) {
        m0.n.b.i.e(list, "typeArguments");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Q());
        z(sb, list);
        sb.append(O());
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public boolean o() {
        return this.c.o();
    }

    public String o0(j0 j0Var) {
        m0.n.b.i.e(j0Var, "typeConstructor");
        m0.r.t.a.r.c.f c2 = j0Var.c();
        boolean z = true;
        if (!(c2 instanceof m0 ? true : c2 instanceof d)) {
            z = c2 instanceof l0;
        }
        if (z) {
            m0.n.b.i.e(c2, "klass");
            if (m0.r.t.a.r.m.p.j(c2)) {
                return c2.i().toString();
            }
            return E().a(c2, this);
        } else if (c2 == null) {
            return j0Var.toString();
        } else {
            throw new IllegalStateException(m0.n.b.i.k("Unexpected classifier: ", c2.getClass()).toString());
        }
    }

    public void p(boolean z) {
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        descriptorRendererOptionsImpl.w.setValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[20], Boolean.valueOf(z));
    }

    public final void p0(m0 m0Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(Q());
        }
        if (M()) {
            sb.append("/*");
            sb.append(m0Var.g());
            sb.append("*/ ");
        }
        d0(sb, m0Var.B(), "reified");
        String label = m0Var.l().getLabel();
        boolean z2 = true;
        d0(sb, label.length() > 0, label);
        R(sb, m0Var, (AnnotationUseSiteTarget) null);
        e0(m0Var, sb, z);
        int size = m0Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            v next = m0Var.getUpperBounds().iterator().next();
            if (next == null) {
                m0.r.t.a.r.b.f.a(PubNubErrorBuilder.PNERR_STATE_MISSING);
                throw null;
            } else if (!m0.r.t.a.r.b.f.G(next)) {
                sb.append(" : ");
                m0.n.b.i.d(next, "upperBound");
                sb.append(w(next));
            }
        } else if (z) {
            for (v next2 : m0Var.getUpperBounds()) {
                if (next2 == null) {
                    m0.r.t.a.r.b.f.a(PubNubErrorBuilder.PNERR_STATE_MISSING);
                    throw null;
                } else if (!m0.r.t.a.r.b.f.G(next2)) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    m0.n.b.i.d(next2, "upperBound");
                    sb.append(w(next2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(O());
        }
    }

    public String q(m0.r.t.a.r.c.i iVar) {
        m0.n.b.i.e(iVar, "declarationDescriptor");
        StringBuilder sb = new StringBuilder();
        iVar.J(new a(this), sb);
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        m0.o.d dVar = descriptorRendererOptionsImpl.d;
        m0.r.k<Object>[] kVarArr = DescriptorRendererOptionsImpl.a;
        if (((Boolean) dVar.getValue(descriptorRendererOptionsImpl, kVarArr[1])).booleanValue() && !(iVar instanceof m0.r.t.a.r.c.v) && !(iVar instanceof y)) {
            if (iVar instanceof u) {
                sb.append(" is a module");
            } else {
                m0.r.t.a.r.c.i b = iVar.b();
                if (b != null && !(b instanceof u)) {
                    sb.append(" ");
                    sb.append(a0("defined in"));
                    sb.append(" ");
                    m0.r.t.a.r.g.c g = m0.r.t.a.r.j.d.g(b);
                    m0.n.b.i.d(g, "getFqName(containingDeclaration)");
                    sb.append(g.e() ? "root package" : u(g));
                    DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.c;
                    if (((Boolean) descriptorRendererOptionsImpl2.e.getValue(descriptorRendererOptionsImpl2, kVarArr[2])).booleanValue() && (b instanceof m0.r.t.a.r.c.v) && (iVar instanceof m0.r.t.a.r.c.l)) {
                        Objects.requireNonNull(((m0.r.t.a.r.c.l) iVar).r().a());
                    }
                }
            }
        }
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void q0(StringBuilder sb, List<? extends m0> list) {
        Iterator<? extends m0> it = list.iterator();
        while (it.hasNext()) {
            p0((m0) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String r(m0.r.t.a.r.c.r0.c r11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget r12) {
        /*
            r10 = this;
            java.lang.String r0 = "annotation"
            m0.n.b.i.e(r11, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 64
            r0.append(r1)
            if (r12 == 0) goto L_0x001e
            java.lang.String r12 = r12.getRenderName()
            java.lang.String r1 = ":"
            java.lang.String r12 = m0.n.b.i.k(r12, r1)
            r0.append(r12)
        L_0x001e:
            m0.r.t.a.r.m.v r12 = r11.getType()
            java.lang.String r1 = r10.w(r12)
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r10.c
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = "this"
            m0.n.b.i.e(r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r1 = r1.q()
            boolean r1 = r1.getIncludeAnnotationArguments()
            if (r1 == 0) goto L_0x018a
            java.util.Map r1 = r11.a()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r3 = r10.c
            m0.o.d r4 = r3.I
            m0.r.k<java.lang.Object>[] r5 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
            r6 = 32
            r5 = r5[r6]
            java.lang.Object r3 = r4.getValue(r3, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 == 0) goto L_0x005d
            m0.r.t.a.r.c.d r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.e(r11)
            goto L_0x005e
        L_0x005d:
            r11 = r4
        L_0x005e:
            if (r11 != 0) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            m0.r.t.a.r.c.c r11 = r11.P()
            if (r11 != 0) goto L_0x0069
        L_0x0067:
            r11 = r4
            goto L_0x006d
        L_0x0069:
            java.util.List r11 = r11.h()
        L_0x006d:
            r3 = 10
            if (r11 != 0) goto L_0x0072
            goto L_0x00b4
        L_0x0072:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x007b:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0092
            java.lang.Object r5 = r11.next()
            r6 = r5
            m0.r.t.a.r.c.o0 r6 = (m0.r.t.a.r.c.o0) r6
            boolean r6 = r6.s0()
            if (r6 == 0) goto L_0x007b
            r4.add(r5)
            goto L_0x007b
        L_0x0092:
            java.util.ArrayList r11 = new java.util.ArrayList
            int r5 = i0.j.f.p.h.K(r4, r3)
            r11.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x009f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b3
            java.lang.Object r5 = r4.next()
            m0.r.t.a.r.c.o0 r5 = (m0.r.t.a.r.c.o0) r5
            m0.r.t.a.r.g.d r5 = r5.getName()
            r11.add(r5)
            goto L_0x009f
        L_0x00b3:
            r4 = r11
        L_0x00b4:
            if (r4 == 0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.c
        L_0x00b9:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r5 = r4.iterator()
        L_0x00c2:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00e0
            java.lang.Object r6 = r5.next()
            r7 = r6
            m0.r.t.a.r.g.d r7 = (m0.r.t.a.r.g.d) r7
            java.lang.String r8 = "it"
            m0.n.b.i.d(r7, r8)
            boolean r7 = r1.containsKey(r7)
            r7 = r7 ^ 1
            if (r7 == 0) goto L_0x00c2
            r11.add(r6)
            goto L_0x00c2
        L_0x00e0:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = i0.j.f.p.h.K(r11, r3)
            r5.<init>(r6)
            java.util.Iterator r11 = r11.iterator()
        L_0x00ed:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L_0x0107
            java.lang.Object r6 = r11.next()
            m0.r.t.a.r.g.d r6 = (m0.r.t.a.r.g.d) r6
            java.lang.String r6 = r6.b()
            java.lang.String r7 = " = ..."
            java.lang.String r6 = m0.n.b.i.k(r6, r7)
            r5.add(r6)
            goto L_0x00ed
        L_0x0107:
            java.util.Set r11 = r1.entrySet()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = i0.j.f.p.h.K(r11, r3)
            r1.<init>(r3)
            java.util.Iterator r11 = r11.iterator()
        L_0x0118:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x0159
            java.lang.Object r3 = r11.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r6 = r3.getKey()
            m0.r.t.a.r.g.d r6 = (m0.r.t.a.r.g.d) r6
            java.lang.Object r3 = r3.getValue()
            m0.r.t.a.r.j.p.g r3 = (m0.r.t.a.r.j.p.g) r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r6.b()
            r7.append(r8)
            java.lang.String r8 = " = "
            r7.append(r8)
            boolean r6 = r4.contains(r6)
            if (r6 != 0) goto L_0x014c
            java.lang.String r3 = r10.U(r3)
            goto L_0x014e
        L_0x014c:
            java.lang.String r3 = "..."
        L_0x014e:
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r1.add(r3)
            goto L_0x0118
        L_0x0159:
            java.util.List r11 = m0.j.g.Z(r5, r1)
            java.util.List r1 = m0.j.g.m0(r11)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r11 = r10.c
            java.util.Objects.requireNonNull(r11)
            m0.n.b.i.e(r11, r2)
            kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy r11 = r11.q()
            boolean r11 = r11.getIncludeEmptyAnnotationArguments()
            if (r11 != 0) goto L_0x017b
            boolean r11 = r1.isEmpty()
            r11 = r11 ^ 1
            if (r11 == 0) goto L_0x018a
        L_0x017b:
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 112(0x70, float:1.57E-43)
            java.lang.String r3 = ", "
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r2 = r0
            m0.j.g.C(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x018a:
            boolean r11 = r10.M()
            if (r11 == 0) goto L_0x01a7
            boolean r11 = i0.j.f.p.h.h2(r12)
            if (r11 != 0) goto L_0x01a2
            m0.r.t.a.r.m.j0 r11 = r12.I0()
            m0.r.t.a.r.c.f r11 = r11.c()
            boolean r11 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.b
            if (r11 == 0) goto L_0x01a7
        L_0x01a2:
            java.lang.String r11 = " /* annotation class not found */"
            r0.append(r11)
        L_0x01a7:
            java.lang.String r11 = r0.toString()
            java.lang.String r12 = "StringBuilder().apply(builderAction).toString()"
            m0.n.b.i.d(r11, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.r(m0.r.t.a.r.c.r0.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget):java.lang.String");
    }

    public final void r0(List<? extends m0> list, StringBuilder sb, boolean z) {
        if (!N() && (!list.isEmpty())) {
            sb.append(Q());
            q0(sb, list);
            sb.append(O());
            if (z) {
                sb.append(" ");
            }
        }
    }

    public final void s0(p0 p0Var, StringBuilder sb, boolean z) {
        if (z || !(p0Var instanceof o0)) {
            sb.append(X(p0Var.i0() ? "var" : "val"));
            sb.append(" ");
        }
    }

    public String t(String str, String str2, m0.r.t.a.r.b.f fVar) {
        m0.n.b.i.e(str, "lowerRendered");
        m0.n.b.i.e(str2, "upperRendered");
        m0.n.b.i.e(fVar, "builtIns");
        if (!A(str, str2)) {
            m0.r.t.a.r.i.a E = E();
            d j = fVar.j(g.a.J);
            if (j != null) {
                m0.n.b.i.d(j, "builtIns.collection");
                String R = StringsKt__IndentKt.R(E.a(j, this), "Collection", (String) null, 2);
                String k = m0.n.b.i.k(R, "Mutable");
                String x0 = x0(str, k, str2, R, R + '(' + "Mutable" + ')');
                if (x0 != null) {
                    return x0;
                }
                String x02 = x0(str, m0.n.b.i.k(R, "MutableMap.MutableEntry"), str2, m0.n.b.i.k(R, "Map.Entry"), m0.n.b.i.k(R, "(Mutable)Map.(Mutable)Entry"));
                if (x02 != null) {
                    return x02;
                }
                m0.r.t.a.r.i.a E2 = E();
                d k2 = fVar.k("Array");
                m0.n.b.i.d(k2, "builtIns.array");
                String R2 = StringsKt__IndentKt.R(E2.a(k2, this), "Array", (String) null, 2);
                String x03 = x0(str, m0.n.b.i.k(R2, K().escape("Array<")), str2, m0.n.b.i.k(R2, K().escape("Array<out ")), m0.n.b.i.k(R2, K().escape("Array<(out) ")));
                if (x03 != null) {
                    return x03;
                }
                return '(' + str + ".." + str2 + ')';
            }
            m0.r.t.a.r.b.f.a(33);
            throw null;
        } else if (!StringsKt__IndentKt.J(str2, "(", false, 2)) {
            return m0.n.b.i.k(str, "!");
        } else {
            return '(' + str + ")!";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0105, code lost:
        if ((o() ? r10.s0() : kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.a(r10)) != false) goto L_0x0109;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t0(m0.r.t.a.r.c.o0 r10, boolean r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r9 = this;
            if (r13 == 0) goto L_0x0010
            java.lang.String r0 = "value-parameter"
            java.lang.String r0 = r9.X(r0)
            r12.append(r0)
            java.lang.String r0 = " "
            r12.append(r0)
        L_0x0010:
            boolean r0 = r9.M()
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = "/*"
            r12.append(r0)
            int r0 = r10.g()
            r12.append(r0)
            java.lang.String r0 = "*/ "
            r12.append(r0)
        L_0x0027:
            r0 = 0
            r9.R(r12, r10, r0)
            boolean r1 = r10.a0()
            java.lang.String r2 = "crossinline"
            r9.d0(r12, r1, r2)
            boolean r1 = r10.W()
            java.lang.String r2 = "noinline"
            r9.d0(r12, r1, r2)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r9.c
            m0.o.d r2 = r1.s
            m0.r.k<java.lang.Object>[] r3 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
            r4 = 16
            r4 = r3[r4]
            java.lang.Object r1 = r2.getValue(r1, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0076
            m0.r.t.a.r.c.a r1 = r10.b()
            boolean r5 = r1 instanceof m0.r.t.a.r.c.c
            if (r5 == 0) goto L_0x0060
            m0.r.t.a.r.c.c r1 = (m0.r.t.a.r.c.c) r1
            goto L_0x0061
        L_0x0060:
            r1 = r0
        L_0x0061:
            if (r1 != 0) goto L_0x0064
            goto L_0x006c
        L_0x0064:
            boolean r0 = r1.x()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x006c:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = m0.n.b.i.a(r0, r1)
            if (r0 == 0) goto L_0x0076
            r0 = r2
            goto L_0x0077
        L_0x0076:
            r0 = r4
        L_0x0077:
            if (r0 == 0) goto L_0x0090
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r1 = r9.c
            m0.o.d r5 = r1.t
            r6 = 17
            r6 = r3[r6]
            java.lang.Object r1 = r5.getValue(r1, r6)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            java.lang.String r5 = "actual"
            r9.d0(r12, r1, r5)
        L_0x0090:
            m0.r.t.a.r.m.v r1 = r10.getType()
            java.lang.String r5 = "variable.type"
            m0.n.b.i.d(r1, r5)
            m0.r.t.a.r.m.v r5 = r10.k0()
            if (r5 != 0) goto L_0x00a1
            r6 = r1
            goto L_0x00a2
        L_0x00a1:
            r6 = r5
        L_0x00a2:
            if (r5 == 0) goto L_0x00a6
            r7 = r2
            goto L_0x00a7
        L_0x00a6:
            r7 = r4
        L_0x00a7:
            java.lang.String r8 = "vararg"
            r9.d0(r12, r7, r8)
            if (r0 != 0) goto L_0x00b6
            if (r13 == 0) goto L_0x00b9
            boolean r7 = r9.J()
            if (r7 != 0) goto L_0x00b9
        L_0x00b6:
            r9.s0(r10, r12, r0)
        L_0x00b9:
            if (r11 == 0) goto L_0x00c3
            r9.e0(r10, r12, r13)
            java.lang.String r11 = ": "
            r12.append(r11)
        L_0x00c3:
            java.lang.String r11 = r9.w(r6)
            r12.append(r11)
            r9.W(r10, r12)
            boolean r11 = r9.M()
            if (r11 == 0) goto L_0x00e6
            if (r5 == 0) goto L_0x00e6
            java.lang.String r11 = " /*"
            r12.append(r11)
            java.lang.String r11 = r9.w(r1)
            r12.append(r11)
            java.lang.String r11 = "*/"
            r12.append(r11)
        L_0x00e6:
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r11 = r9.c
            m0.o.d r13 = r11.z
            r0 = 23
            r1 = r3[r0]
            java.lang.Object r11 = r13.getValue(r11, r1)
            m0.n.a.l r11 = (m0.n.a.l) r11
            if (r11 == 0) goto L_0x0108
            boolean r11 = r9.o()
            if (r11 == 0) goto L_0x0101
            boolean r11 = r10.s0()
            goto L_0x0105
        L_0x0101:
            boolean r11 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.a(r10)
        L_0x0105:
            if (r11 == 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r2 = r4
        L_0x0109:
            if (r2 == 0) goto L_0x0127
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r11 = r9.c
            m0.o.d r13 = r11.z
            r0 = r3[r0]
            java.lang.Object r11 = r13.getValue(r11, r0)
            m0.n.a.l r11 = (m0.n.a.l) r11
            m0.n.b.i.c(r11)
            java.lang.Object r10 = r11.invoke(r10)
            java.lang.String r11 = " = "
            java.lang.String r10 = m0.n.b.i.k(r11, r10)
            r12.append(r10)
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.t0(m0.r.t.a.r.c.o0, boolean, java.lang.StringBuilder, boolean):void");
    }

    public String u(m0.r.t.a.r.g.c cVar) {
        m0.n.b.i.e(cVar, "fqName");
        List<m0.r.t.a.r.g.d> g = cVar.g();
        m0.n.b.i.d(g, "fqName.pathSegments()");
        return K().escape(h.s3(g));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (r8 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u0(java.util.Collection<? extends m0.r.t.a.r.c.o0> r7, boolean r8, java.lang.StringBuilder r9) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl r0 = r6.c
            m0.o.d r1 = r0.E
            m0.r.k<java.lang.Object>[] r2 = kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl.a
            r3 = 28
            r2 = r2[r3]
            java.lang.Object r0 = r1.getValue(r0, r2)
            kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy r0 = (kotlin.reflect.jvm.internal.impl.renderer.ParameterNameRenderingPolicy) r0
            int r0 = r0.ordinal()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0028
            if (r0 == r1) goto L_0x0024
            r8 = 2
            if (r0 != r8) goto L_0x001e
            goto L_0x0027
        L_0x001e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0024:
            if (r8 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = r2
        L_0x0028:
            int r8 = r7.size()
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r0 = r6.L()
            r0.b(r8, r9)
            java.util.Iterator r7 = r7.iterator()
            r0 = r2
        L_0x0038:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0059
            int r3 = r0 + 1
            java.lang.Object r4 = r7.next()
            m0.r.t.a.r.c.o0 r4 = (m0.r.t.a.r.c.o0) r4
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r5 = r6.L()
            r5.a(r4, r0, r8, r9)
            r6.t0(r4, r1, r9, r2)
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r5 = r6.L()
            r5.d(r4, r0, r8, r9)
            r0 = r3
            goto L_0x0038
        L_0x0059:
            kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer$b r7 = r6.L()
            r7.c(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.u0(java.util.Collection, boolean, java.lang.StringBuilder):void");
    }

    public String v(m0.r.t.a.r.g.d dVar, boolean z) {
        m0.n.b.i.e(dVar, "name");
        String B = B(h.r3(dVar));
        return (!D() || K() != RenderingFormat.HTML || !z) ? B : i0.d.a.a.a.o0("<b>", B, "</b>");
    }

    public final boolean v0(p pVar, StringBuilder sb) {
        if (!G().contains(DescriptorRendererModifier.VISIBILITY)) {
            return false;
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        m0.o.d dVar = descriptorRendererOptionsImpl.o;
        m0.r.k<Object>[] kVarArr = DescriptorRendererOptionsImpl.a;
        if (((Boolean) dVar.getValue(descriptorRendererOptionsImpl, kVarArr[12])).booleanValue()) {
            pVar = pVar.d();
        }
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = this.c;
        if (!((Boolean) descriptorRendererOptionsImpl2.p.getValue(descriptorRendererOptionsImpl2, kVarArr[13])).booleanValue() && m0.n.b.i.a(pVar, m0.r.t.a.r.c.o.k)) {
            return false;
        }
        sb.append(X(pVar.b()));
        sb.append(" ");
        return true;
    }

    public String w(v vVar) {
        m0.n.b.i.e(vVar, "type");
        StringBuilder sb = new StringBuilder();
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = this.c;
        f0(sb, (v) ((l) descriptorRendererOptionsImpl.y.getValue(descriptorRendererOptionsImpl, DescriptorRendererOptionsImpl.a[22])).invoke(vVar));
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final void w0(List<? extends m0> list, StringBuilder sb) {
        if (!N()) {
            ArrayList arrayList = new ArrayList(0);
            for (m0 m0Var : list) {
                List<v> upperBounds = m0Var.getUpperBounds();
                m0.n.b.i.d(upperBounds, "typeParameter.upperBounds");
                for (T t : m0.j.g.l(upperBounds, 1)) {
                    StringBuilder sb2 = new StringBuilder();
                    m0.r.t.a.r.g.d name = m0Var.getName();
                    m0.n.b.i.d(name, "typeParameter.name");
                    sb2.append(v(name, false));
                    sb2.append(" : ");
                    m0.n.b.i.d(t, "it");
                    sb2.append(w(t));
                    arrayList.add(sb2.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" ");
                sb.append(X("where"));
                sb.append(" ");
                m0.j.g.C(arrayList, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124);
            }
        }
    }

    public String x(m0.r.t.a.r.m.m0 m0Var) {
        m0.n.b.i.e(m0Var, "typeProjection");
        StringBuilder sb = new StringBuilder();
        z(sb, h.L2(m0Var));
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String x0(String str, String str2, String str3, String str4, String str5) {
        if (!StringsKt__IndentKt.J(str, str2, false, 2) || !StringsKt__IndentKt.J(str3, str4, false, 2)) {
            return null;
        }
        String substring = str.substring(str2.length());
        m0.n.b.i.d(substring, "(this as java.lang.String).substring(startIndex)");
        String substring2 = str3.substring(str4.length());
        m0.n.b.i.d(substring2, "(this as java.lang.String).substring(startIndex)");
        String k = m0.n.b.i.k(str5, substring);
        if (m0.n.b.i.a(substring, substring2)) {
            return k;
        }
        if (A(substring, substring2)) {
            return m0.n.b.i.k(k, "!");
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y0(m0.r.t.a.r.m.v r4) {
        /*
            r3 = this;
            boolean r0 = m0.r.t.a.r.b.e.g(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.util.List r4 = r4.H0()
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0018
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0018
        L_0x0016:
            r4 = r2
            goto L_0x002f
        L_0x0018:
            java.util.Iterator r4 = r4.iterator()
        L_0x001c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r4.next()
            m0.r.t.a.r.m.m0 r0 = (m0.r.t.a.r.m.m0) r0
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x001c
            r4 = r1
        L_0x002f:
            if (r4 == 0) goto L_0x0032
            r1 = r2
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.y0(m0.r.t.a.r.m.v):boolean");
    }

    public final void z(StringBuilder sb, List<? extends m0.r.t.a.r.m.m0> list) {
        m0.j.g.C(list, sb, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new DescriptorRendererImpl$appendTypeProjections$1(this), 60);
    }
}
