package i0.f.a.c.n;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedConstructor;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: POJOPropertyBuilder */
public class p extends j implements Comparable<p> {
    public static final AnnotationIntrospector.ReferenceProperty d = new AnnotationIntrospector.ReferenceProperty(AnnotationIntrospector.ReferenceProperty.Type.MANAGED_REFERENCE, "");
    public final PropertyName Y1;
    public final PropertyName Z1;
    public e<AnnotatedField> a2;
    public e<AnnotatedParameter> b2;
    public e<AnnotatedMethod> c2;
    public e<AnnotatedMethod> d2;
    public transient PropertyMetadata e2;
    public transient AnnotationIntrospector.ReferenceProperty f2;
    public final boolean q;
    public final MapperConfig<?> x;
    public final AnnotationIntrospector y;

    /* compiled from: POJOPropertyBuilder */
    public class a implements g<Class<?>[]> {
        public a() {
        }

        public Object a(AnnotatedMember annotatedMember) {
            return p.this.y.o0(annotatedMember);
        }
    }

    /* compiled from: POJOPropertyBuilder */
    public class b implements g<AnnotationIntrospector.ReferenceProperty> {
        public b() {
        }

        public Object a(AnnotatedMember annotatedMember) {
            return p.this.y.Z(annotatedMember);
        }
    }

    /* compiled from: POJOPropertyBuilder */
    public class c implements g<Boolean> {
        public c() {
        }

        public Object a(AnnotatedMember annotatedMember) {
            return p.this.y.A0(annotatedMember);
        }
    }

    /* compiled from: POJOPropertyBuilder */
    public class d implements g<n> {
        public d() {
        }

        public Object a(AnnotatedMember annotatedMember) {
            n G = p.this.y.G(annotatedMember);
            return G != null ? p.this.y.H(annotatedMember, G) : G;
        }
    }

    /* compiled from: POJOPropertyBuilder */
    public static final class e<T> {
        public final T a;
        public final e<T> b;
        public final PropertyName c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public e(T t, e<T> eVar, PropertyName propertyName, boolean z, boolean z2, boolean z3) {
            this.a = t;
            this.b = eVar;
            PropertyName propertyName2 = (propertyName == null || propertyName.e()) ? null : propertyName;
            this.c = propertyName2;
            if (z) {
                if (propertyName2 == null) {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                } else if (!propertyName.c()) {
                    z = false;
                }
            }
            this.d = z;
            this.e = z2;
            this.f = z3;
        }

        public e<T> a(e<T> eVar) {
            e<T> eVar2 = this.b;
            if (eVar2 == null) {
                return c(eVar);
            }
            return c(eVar2.a(eVar));
        }

        public e<T> b() {
            e<T> eVar = this.b;
            if (eVar == null) {
                return this;
            }
            e<T> b2 = eVar.b();
            if (this.c != null) {
                if (b2.c == null) {
                    return c((e) null);
                }
                return c(b2);
            } else if (b2.c != null) {
                return b2;
            } else {
                boolean z = this.e;
                if (z == b2.e) {
                    return c(b2);
                }
                return z ? c((e) null) : b2;
            }
        }

        public e<T> c(e<T> eVar) {
            if (eVar == this.b) {
                return this;
            }
            return new e(this.a, eVar, this.c, this.d, this.e, this.f);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
            r0 = r0.d();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public i0.f.a.c.n.p.e<T> d() {
            /*
                r2 = this;
                boolean r0 = r2.f
                if (r0 == 0) goto L_0x000f
                i0.f.a.c.n.p$e<T> r0 = r2.b
                if (r0 != 0) goto L_0x000a
                r0 = 0
                goto L_0x000e
            L_0x000a:
                i0.f.a.c.n.p$e r0 = r0.d()
            L_0x000e:
                return r0
            L_0x000f:
                i0.f.a.c.n.p$e<T> r0 = r2.b
                if (r0 == 0) goto L_0x0020
                i0.f.a.c.n.p$e r0 = r0.d()
                i0.f.a.c.n.p$e<T> r1 = r2.b
                if (r0 == r1) goto L_0x0020
                i0.f.a.c.n.p$e r0 = r2.c(r0)
                return r0
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.p.e.d():i0.f.a.c.n.p$e");
        }

        public e<T> e() {
            if (this.b == null) {
                return this;
            }
            return new e(this.a, (e) null, this.c, this.d, this.e, this.f);
        }

        public e<T> f() {
            e<T> eVar = this.b;
            e<T> f2 = eVar == null ? null : eVar.f();
            return this.e ? c(f2) : f2;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", new Object[]{this.a.toString(), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.d)});
            if (this.b == null) {
                return format;
            }
            StringBuilder S0 = i0.d.a.a.a.S0(format, ", ");
            S0.append(this.b.toString());
            return S0.toString();
        }
    }

    /* compiled from: POJOPropertyBuilder */
    public static class f<T extends AnnotatedMember> implements Iterator<T> {
        public e<T> c;

        public f(e<T> eVar) {
            this.c = eVar;
        }

        public boolean hasNext() {
            return this.c != null;
        }

        public Object next() {
            e<T> eVar = this.c;
            if (eVar != null) {
                AnnotatedMember annotatedMember = (AnnotatedMember) eVar.a;
                this.c = eVar.b;
                return annotatedMember;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: POJOPropertyBuilder */
    public interface g<T> {
        T a(AnnotatedMember annotatedMember);
    }

    public p(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName) {
        this.x = mapperConfig;
        this.y = annotationIntrospector;
        this.Z1 = propertyName;
        this.Y1 = propertyName;
        this.q = z;
    }

    public static <T> e<T> d0(e<T> eVar, e<T> eVar2) {
        if (eVar == null) {
            return eVar2;
        }
        if (eVar2 == null) {
            return eVar;
        }
        e<T> eVar3 = eVar.b;
        if (eVar3 == null) {
            return eVar.c(eVar2);
        }
        return eVar.c(eVar3.a(eVar2));
    }

    public AnnotatedMethod B() {
        e<AnnotatedMethod> eVar = this.d2;
        if (eVar == null) {
            return null;
        }
        e<T> eVar2 = eVar.b;
        if (eVar2 == null) {
            return (AnnotatedMethod) eVar.a;
        }
        while (eVar2 != null) {
            Class<?> h = ((AnnotatedMethod) eVar.a).h();
            Class<?> h2 = ((AnnotatedMethod) eVar2.a).h();
            if (h != h2) {
                if (!h.isAssignableFrom(h2)) {
                    if (h2.isAssignableFrom(h)) {
                        continue;
                        eVar2 = eVar2.b;
                    }
                }
                eVar = eVar2;
                eVar2 = eVar2.b;
            }
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) eVar2.a;
            AnnotatedMethod annotatedMethod2 = (AnnotatedMethod) eVar.a;
            int Y = Y(annotatedMethod);
            int Y2 = Y(annotatedMethod2);
            if (Y != Y2) {
                if (Y >= Y2) {
                    eVar2 = eVar2.b;
                }
                eVar = eVar2;
                eVar2 = eVar2.b;
            } else {
                AnnotationIntrospector annotationIntrospector = this.y;
                if (annotationIntrospector != null) {
                    AnnotatedMethod D0 = annotationIntrospector.D0(this.x, annotatedMethod2, annotatedMethod);
                    if (D0 != annotatedMethod2) {
                        if (D0 != annotatedMethod) {
                        }
                        eVar = eVar2;
                        eVar2 = eVar2.b;
                    } else {
                        continue;
                        eVar2 = eVar2.b;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", new Object[]{getName(), ((AnnotatedMethod) eVar.a).i(), ((AnnotatedMethod) eVar2.a).i()}));
            }
        }
        this.d2 = eVar.e();
        return (AnnotatedMethod) eVar.a;
    }

    public PropertyName C() {
        AnnotationIntrospector annotationIntrospector;
        if (w() == null || (annotationIntrospector = this.y) == null) {
            return null;
        }
        Objects.requireNonNull(annotationIntrospector);
        return null;
    }

    public boolean D() {
        return this.b2 != null;
    }

    public boolean E() {
        return this.a2 != null;
    }

    public boolean F(PropertyName propertyName) {
        return this.Y1.equals(propertyName);
    }

    public boolean G() {
        return this.d2 != null;
    }

    public boolean H() {
        return M(this.a2) || M(this.c2) || M(this.d2) || L(this.b2);
    }

    public boolean I() {
        return L(this.a2) || L(this.c2) || L(this.d2) || L(this.b2);
    }

    public boolean K() {
        Boolean bool = (Boolean) c0(new c());
        return bool != null && bool.booleanValue();
    }

    public final <T> boolean L(e<T> eVar) {
        while (eVar != null) {
            if (eVar.c != null && eVar.d) {
                return true;
            }
            eVar = eVar.b;
        }
        return false;
    }

    public final <T> boolean M(e<T> eVar) {
        while (eVar != null) {
            PropertyName propertyName = eVar.c;
            if (propertyName != null && propertyName.c()) {
                return true;
            }
            eVar = eVar.b;
        }
        return false;
    }

    public final <T> boolean N(e<T> eVar) {
        while (eVar != null) {
            if (eVar.f) {
                return true;
            }
            eVar = eVar.b;
        }
        return false;
    }

    public final <T> boolean O(e<T> eVar) {
        while (eVar != null) {
            if (eVar.e) {
                return true;
            }
            eVar = eVar.b;
        }
        return false;
    }

    public final <T extends AnnotatedMember> e<T> P(e<T> eVar, h hVar) {
        T t = (AnnotatedMember) ((AnnotatedMember) eVar.a).n(hVar);
        e<T> eVar2 = eVar.b;
        if (eVar2 != null) {
            eVar = eVar.c(P(eVar2, hVar));
        }
        return t == eVar.a ? eVar : new e<>(t, eVar.b, eVar.c, eVar.d, eVar.e, eVar.f);
    }

    public final void Q(Collection<PropertyName> collection, Map<PropertyName, p> map, e<?> eVar) {
        for (e eVar2 = eVar; eVar2 != null; eVar2 = eVar2.b) {
            PropertyName propertyName = eVar2.c;
            if (eVar2.d && propertyName != null) {
                p pVar = map.get(propertyName);
                if (pVar == null) {
                    pVar = new p(this.x, this.y, this.q, this.Z1, propertyName);
                    map.put(propertyName, pVar);
                }
                if (eVar == this.a2) {
                    pVar.a2 = eVar2.c(pVar.a2);
                } else if (eVar == this.c2) {
                    pVar.c2 = eVar2.c(pVar.c2);
                } else if (eVar == this.d2) {
                    pVar.d2 = eVar2.c(pVar.d2);
                } else if (eVar == this.b2) {
                    pVar.b2 = eVar2.c(pVar.b2);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (eVar2.e) {
                StringBuilder P0 = i0.d.a.a.a.P0("Conflicting/ambiguous property name definitions (implicit name ");
                P0.append(i0.f.a.c.t.f.C(this.Y1));
                P0.append("): found multiple explicit names: ");
                P0.append(collection);
                P0.append(", but also implicit accessor: ");
                P0.append(eVar2);
                throw new IllegalStateException(P0.toString());
            }
        }
    }

    public final Set<PropertyName> S(e<? extends AnnotatedMember> eVar, Set<PropertyName> set) {
        e<T> eVar2;
        while (eVar2 != null) {
            if (eVar2.d && eVar2.c != null) {
                if (set == null) {
                    set = new HashSet<>();
                }
                set.add(eVar2.c);
            }
            e<T> eVar3 = eVar2.b;
            eVar2 = eVar;
            eVar2 = eVar3;
        }
        return set;
    }

    public final <T extends AnnotatedMember> h T(e<T> eVar) {
        h hVar = ((AnnotatedMember) eVar.a).d;
        e<T> eVar2 = eVar.b;
        return eVar2 != null ? h.c(hVar, T(eVar2)) : hVar;
    }

    public int U(AnnotatedMethod annotatedMethod) {
        String d3 = annotatedMethod.d();
        if (d3.startsWith("get") && d3.length() > 3) {
            return 1;
        }
        if (!d3.startsWith("is") || d3.length() <= 2) {
            return 3;
        }
        return 2;
    }

    public final h V(int i, e<? extends AnnotatedMember>... eVarArr) {
        e<? extends AnnotatedMember> eVar = eVarArr[i];
        h hVar = ((AnnotatedMember) eVar.a).d;
        e<T> eVar2 = eVar.b;
        if (eVar2 != null) {
            hVar = h.c(hVar, T(eVar2));
        }
        do {
            i++;
            if (i >= eVarArr.length) {
                return hVar;
            }
        } while (eVarArr[i] == null);
        return h.c(hVar, V(i, eVarArr));
    }

    public final <T> e<T> W(e<T> eVar) {
        return eVar == null ? eVar : eVar.d();
    }

    public final <T> e<T> X(e<T> eVar) {
        return eVar == null ? eVar : eVar.f();
    }

    public int Y(AnnotatedMethod annotatedMethod) {
        String d3 = annotatedMethod.d();
        return (!d3.startsWith("set") || d3.length() <= 3) ? 2 : 1;
    }

    public final <T> e<T> Z(e<T> eVar) {
        return eVar == null ? eVar : eVar.b();
    }

    public void a0(p pVar) {
        this.a2 = d0(this.a2, pVar.a2);
        this.b2 = d0(this.b2, pVar.b2);
        this.c2 = d0(this.c2, pVar.c2);
        this.d2 = d0(this.d2, pVar.d2);
    }

    public PropertyName b() {
        return this.Y1;
    }

    public Set<PropertyName> b0() {
        Set<PropertyName> S = S(this.b2, S(this.d2, S(this.c2, S(this.a2, (Set<PropertyName>) null))));
        return S == null ? Collections.emptySet() : S;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r0 = r2.a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T c0(i0.f.a.c.n.p.g<T> r3) {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.AnnotationIntrospector r0 = r2.y
            r1 = 0
            if (r0 == 0) goto L_0x003e
            boolean r0 = r2.q
            if (r0 == 0) goto L_0x0016
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r2.c2
            if (r0 == 0) goto L_0x0030
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.a(r0)
            goto L_0x0030
        L_0x0016:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r0 = r2.b2
            if (r0 == 0) goto L_0x0022
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x0022:
            if (r1 != 0) goto L_0x0030
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r2.d2
            if (r0 == 0) goto L_0x0030
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x0030:
            if (r1 != 0) goto L_0x003e
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r0 = r2.a2
            if (r0 == 0) goto L_0x003e
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            java.lang.Object r1 = r3.a(r0)
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.p.c0(i0.f.a.c.n.p$g):java.lang.Object");
    }

    public int compareTo(Object obj) {
        p pVar = (p) obj;
        if (this.b2 != null) {
            if (pVar.b2 == null) {
                return -1;
            }
        } else if (pVar.b2 != null) {
            return 1;
        }
        return getName().compareTo(pVar.getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fasterxml.jackson.databind.PropertyMetadata f() {
        /*
            r12 = this;
            com.fasterxml.jackson.databind.PropertyMetadata r0 = r12.e2
            if (r0 != 0) goto L_0x013d
            boolean r0 = r12.q
            r1 = 0
            if (r0 == 0) goto L_0x001d
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r12.c2
            if (r0 == 0) goto L_0x0012
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            goto L_0x0040
        L_0x0012:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r0 = r12.a2
            if (r0 == 0) goto L_0x001b
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            goto L_0x0040
        L_0x001b:
            r0 = r1
            goto L_0x0040
        L_0x001d:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r0 = r12.b2
            if (r0 == 0) goto L_0x0026
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            goto L_0x0040
        L_0x0026:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r12.d2
            if (r0 == 0) goto L_0x002f
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            goto L_0x0040
        L_0x002f:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r0 = r12.a2
            if (r0 == 0) goto L_0x0038
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
            goto L_0x0040
        L_0x0038:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r0 = r12.c2
            if (r0 == 0) goto L_0x001b
            T r0 = r0.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r0 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r0
        L_0x0040:
            if (r0 != 0) goto L_0x0048
            com.fasterxml.jackson.databind.PropertyMetadata r0 = com.fasterxml.jackson.databind.PropertyMetadata.q
            r12.e2 = r0
            goto L_0x013d
        L_0x0048:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r12.y
            java.lang.Boolean r2 = r2.x0(r0)
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r12.y
            java.lang.String r6 = r3.R(r0)
            com.fasterxml.jackson.databind.AnnotationIntrospector r3 = r12.y
            java.lang.Integer r3 = r3.X(r0)
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r12.y
            java.lang.String r4 = r4.Q(r0)
            if (r2 != 0) goto L_0x0081
            if (r3 != 0) goto L_0x0081
            if (r4 != 0) goto L_0x0081
            com.fasterxml.jackson.databind.PropertyMetadata r2 = com.fasterxml.jackson.databind.PropertyMetadata.q
            if (r6 != 0) goto L_0x006b
            goto L_0x007e
        L_0x006b:
            com.fasterxml.jackson.databind.PropertyMetadata r3 = new com.fasterxml.jackson.databind.PropertyMetadata
            java.lang.Boolean r5 = r2.x
            java.lang.Integer r7 = r2.Y1
            java.lang.String r8 = r2.Z1
            com.fasterxml.jackson.databind.PropertyMetadata$a r9 = r2.a2
            com.fasterxml.jackson.annotation.Nulls r10 = r2.b2
            com.fasterxml.jackson.annotation.Nulls r11 = r2.c2
            r4 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2 = r3
        L_0x007e:
            r12.e2 = r2
            goto L_0x0087
        L_0x0081:
            com.fasterxml.jackson.databind.PropertyMetadata r2 = com.fasterxml.jackson.databind.PropertyMetadata.a(r2, r6, r3, r4)
            r12.e2 = r2
        L_0x0087:
            boolean r2 = r12.q
            if (r2 != 0) goto L_0x013d
            com.fasterxml.jackson.databind.PropertyMetadata r2 = r12.e2
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r3 = r12.r()
            r4 = 1
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r12.y
            r6 = 0
            if (r5 == 0) goto L_0x00c4
            if (r3 == 0) goto L_0x00b0
            java.lang.Boolean r5 = r5.z(r0)
            if (r5 == 0) goto L_0x00b0
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x00ae
            com.fasterxml.jackson.databind.PropertyMetadata$a r5 = new com.fasterxml.jackson.databind.PropertyMetadata$a
            r5.<init>(r3, r6)
            com.fasterxml.jackson.databind.PropertyMetadata r2 = r2.b(r5)
        L_0x00ae:
            r5 = r6
            goto L_0x00b1
        L_0x00b0:
            r5 = r4
        L_0x00b1:
            com.fasterxml.jackson.databind.AnnotationIntrospector r7 = r12.y
            com.fasterxml.jackson.annotation.JsonSetter$Value r7 = r7.i0(r0)
            if (r7 == 0) goto L_0x00c2
            com.fasterxml.jackson.annotation.Nulls r1 = r7.c()
            com.fasterxml.jackson.annotation.Nulls r7 = r7.b()
            goto L_0x00c6
        L_0x00c2:
            r7 = r1
            goto L_0x00c6
        L_0x00c4:
            r7 = r1
            r5 = r4
        L_0x00c6:
            if (r5 != 0) goto L_0x00cc
            if (r1 == 0) goto L_0x00cc
            if (r7 != 0) goto L_0x00fc
        L_0x00cc:
            boolean r8 = r0 instanceof com.fasterxml.jackson.databind.introspect.AnnotatedMethod
            if (r8 == 0) goto L_0x00e0
            r8 = r0
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r8
            int r9 = r8.x()
            if (r9 <= 0) goto L_0x00e0
            com.fasterxml.jackson.databind.JavaType r0 = r8.y(r6)
            java.lang.Class<?> r0 = r0.c
            goto L_0x00e6
        L_0x00e0:
            com.fasterxml.jackson.databind.JavaType r0 = r0.f()
            java.lang.Class<?> r0 = r0.c
        L_0x00e6:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r6 = r12.x
            i0.f.a.c.k.b r0 = r6.f(r0)
            com.fasterxml.jackson.annotation.JsonSetter$Value r0 = r0.c
            if (r0 == 0) goto L_0x00fc
            if (r1 != 0) goto L_0x00f6
            com.fasterxml.jackson.annotation.Nulls r1 = r0.c()
        L_0x00f6:
            if (r7 != 0) goto L_0x00fc
            com.fasterxml.jackson.annotation.Nulls r7 = r0.b()
        L_0x00fc:
            if (r5 != 0) goto L_0x0102
            if (r1 == 0) goto L_0x0102
            if (r7 != 0) goto L_0x0133
        L_0x0102:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r0 = r12.x
            com.fasterxml.jackson.databind.cfg.MapperConfigBase r0 = (com.fasterxml.jackson.databind.cfg.MapperConfigBase) r0
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r0 = r0.e2
            com.fasterxml.jackson.annotation.JsonSetter$Value r0 = r0.q
            if (r1 != 0) goto L_0x0110
            com.fasterxml.jackson.annotation.Nulls r1 = r0.c()
        L_0x0110:
            if (r7 != 0) goto L_0x0116
            com.fasterxml.jackson.annotation.Nulls r7 = r0.b()
        L_0x0116:
            if (r5 == 0) goto L_0x0133
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r0 = r12.x
            com.fasterxml.jackson.databind.cfg.MapperConfigBase r0 = (com.fasterxml.jackson.databind.cfg.MapperConfigBase) r0
            com.fasterxml.jackson.databind.cfg.ConfigOverrides r0 = r0.e2
            java.lang.Boolean r0 = r0.y
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0133
            if (r3 == 0) goto L_0x0133
            com.fasterxml.jackson.databind.PropertyMetadata$a r0 = new com.fasterxml.jackson.databind.PropertyMetadata$a
            r0.<init>(r3, r4)
            com.fasterxml.jackson.databind.PropertyMetadata r2 = r2.b(r0)
        L_0x0133:
            if (r1 != 0) goto L_0x0137
            if (r7 == 0) goto L_0x013b
        L_0x0137:
            com.fasterxml.jackson.databind.PropertyMetadata r2 = r2.c(r1, r7)
        L_0x013b:
            r12.e2 = r2
        L_0x013d:
            com.fasterxml.jackson.databind.PropertyMetadata r0 = r12.e2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.p.f():com.fasterxml.jackson.databind.PropertyMetadata");
    }

    public String getName() {
        PropertyName propertyName = this.Y1;
        if (propertyName == null) {
            return null;
        }
        return propertyName.q;
    }

    public boolean i() {
        return (this.b2 == null && this.d2 == null && this.a2 == null) ? false : true;
    }

    public boolean j() {
        return (this.c2 == null && this.a2 == null) ? false : true;
    }

    public JsonInclude.Value l() {
        JsonInclude.Value value;
        AnnotatedMember r = r();
        AnnotationIntrospector annotationIntrospector = this.y;
        if (annotationIntrospector == null) {
            value = null;
        } else {
            value = annotationIntrospector.V(r);
        }
        return value == null ? JsonInclude.Value.c : value;
    }

    public n n() {
        return (n) c0(new d());
    }

    public AnnotationIntrospector.ReferenceProperty o() {
        AnnotationIntrospector.ReferenceProperty referenceProperty = this.f2;
        if (referenceProperty == null) {
            AnnotationIntrospector.ReferenceProperty referenceProperty2 = (AnnotationIntrospector.ReferenceProperty) c0(new b());
            this.f2 = referenceProperty2 == null ? d : referenceProperty2;
            return referenceProperty2;
        } else if (referenceProperty == d) {
            return null;
        } else {
            return referenceProperty;
        }
    }

    public Class<?>[] q() {
        return (Class[]) c0(new a());
    }

    public AnnotatedParameter s() {
        e eVar = this.b2;
        if (eVar == null) {
            return null;
        }
        do {
            T t = eVar.a;
            if (((AnnotatedParameter) t).q instanceof AnnotatedConstructor) {
                return (AnnotatedParameter) t;
            }
            eVar = eVar.b;
        } while (eVar != null);
        return (AnnotatedParameter) this.b2.a;
    }

    public Iterator<AnnotatedParameter> t() {
        e<AnnotatedParameter> eVar = this.b2;
        if (eVar == null) {
            return i0.f.a.c.t.f.c;
        }
        return new f(eVar);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("[Property '");
        P0.append(this.Y1);
        P0.append("'; ctors: ");
        P0.append(this.b2);
        P0.append(", field(s): ");
        P0.append(this.a2);
        P0.append(", getter(s): ");
        P0.append(this.c2);
        P0.append(", setter(s): ");
        P0.append(this.d2);
        P0.append("]");
        return P0.toString();
    }

    public AnnotatedField u() {
        e<AnnotatedField> eVar = this.a2;
        if (eVar == null) {
            return null;
        }
        AnnotatedField annotatedField = (AnnotatedField) eVar.a;
        e<T> eVar2 = eVar.b;
        while (eVar2 != null) {
            AnnotatedField annotatedField2 = (AnnotatedField) eVar2.a;
            Class<?> h = annotatedField.h();
            Class<?> h2 = annotatedField2.h();
            if (h != h2) {
                if (h.isAssignableFrom(h2)) {
                    annotatedField = annotatedField2;
                } else if (h2.isAssignableFrom(h)) {
                }
                eVar2 = eVar2.b;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Multiple fields representing property \"");
            P0.append(getName());
            P0.append("\": ");
            P0.append(annotatedField.i());
            P0.append(" vs ");
            P0.append(annotatedField2.i());
            throw new IllegalArgumentException(P0.toString());
        }
        return annotatedField;
    }

    public AnnotatedMethod v() {
        e<AnnotatedMethod> eVar = this.c2;
        if (eVar == null) {
            return null;
        }
        e<T> eVar2 = eVar.b;
        if (eVar2 == null) {
            return (AnnotatedMethod) eVar.a;
        }
        while (eVar2 != null) {
            Class<?> h = ((AnnotatedMethod) eVar.a).h();
            Class<?> h2 = ((AnnotatedMethod) eVar2.a).h();
            if (h != h2) {
                if (!h.isAssignableFrom(h2)) {
                    if (h2.isAssignableFrom(h)) {
                        continue;
                        eVar2 = eVar2.b;
                    }
                }
                eVar = eVar2;
                eVar2 = eVar2.b;
            }
            int U = U((AnnotatedMethod) eVar2.a);
            int U2 = U((AnnotatedMethod) eVar.a);
            if (U != U2) {
                if (U >= U2) {
                    eVar2 = eVar2.b;
                }
                eVar = eVar2;
                eVar2 = eVar2.b;
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("Conflicting getter definitions for property \"");
                P0.append(getName());
                P0.append("\": ");
                P0.append(((AnnotatedMethod) eVar.a).i());
                P0.append(" vs ");
                P0.append(((AnnotatedMethod) eVar2.a).i());
                throw new IllegalArgumentException(P0.toString());
            }
        }
        this.c2 = eVar.e();
        return (AnnotatedMethod) eVar.a;
    }

    public AnnotatedMember w() {
        if (this.q) {
            return r();
        }
        AnnotatedMember s = s();
        if (s == null && (s = B()) == null) {
            s = u();
        }
        return s == null ? r() : s;
    }

    public JavaType y() {
        if (this.q) {
            a v = v();
            if (v == null && (v = u()) == null) {
                return TypeFactory.v();
            }
            return v.f();
        }
        a s = s();
        if (s == null) {
            AnnotatedMethod B = B();
            if (B != null) {
                return B.y(0);
            }
            s = u();
        }
        if (s == null && (s = v()) == null) {
            return TypeFactory.v();
        }
        return s.f();
    }

    public Class<?> z() {
        return y().c;
    }

    public p(MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, boolean z, PropertyName propertyName, PropertyName propertyName2) {
        this.x = mapperConfig;
        this.y = annotationIntrospector;
        this.Z1 = propertyName;
        this.Y1 = propertyName2;
        this.q = z;
    }

    public p(p pVar, PropertyName propertyName) {
        this.x = pVar.x;
        this.y = pVar.y;
        this.Z1 = pVar.Z1;
        this.Y1 = propertyName;
        this.a2 = pVar.a2;
        this.b2 = pVar.b2;
        this.c2 = pVar.c2;
        this.d2 = pVar.d2;
        this.q = pVar.q;
    }
}
