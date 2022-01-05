package i0.f.a.c.n;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import i0.d.a.a.a;
import i0.f.a.c.n.p;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: POJOPropertiesCollector */
public class o {
    public final MapperConfig<?> a;
    public final AccessorNamingStrategy b;
    public final boolean c;
    public final JavaType d;
    public final b e;
    public final VisibilityChecker<?> f;
    public final AnnotationIntrospector g;
    public final boolean h;
    public boolean i;
    public LinkedHashMap<String, p> j;
    public LinkedList<p> k;
    public Map<PropertyName, PropertyName> l;
    public LinkedList<AnnotatedMember> m;
    public LinkedList<AnnotatedMember> n;
    public LinkedList<AnnotatedMethod> o;
    public LinkedList<AnnotatedMember> p;
    public LinkedList<AnnotatedMember> q;
    public LinkedList<AnnotatedMember> r;
    public HashSet<String> s;
    public LinkedHashMap<Object, AnnotatedMember> t;

    public o(MapperConfig<?> mapperConfig, boolean z, JavaType javaType, b bVar, AccessorNamingStrategy accessorNamingStrategy) {
        this.a = mapperConfig;
        this.c = z;
        this.d = javaType;
        this.e = bVar;
        if (mapperConfig.p()) {
            this.h = true;
            this.g = mapperConfig.e();
        } else {
            this.h = false;
            this.g = NopAnnotationIntrospector.c;
        }
        this.f = mapperConfig.l(javaType.c, bVar);
        this.b = accessorNamingStrategy;
        mapperConfig.q(MapperFeature.USE_STD_BEAN_NAMING);
    }

    public void a(Map<String, p> map, AnnotatedParameter annotatedParameter) {
        p pVar;
        JsonCreator.Mode e2;
        String q2 = this.g.q(annotatedParameter);
        if (q2 == null) {
            q2 = "";
        }
        PropertyName A = this.g.A(annotatedParameter);
        boolean z = A != null && !A.e();
        if (!z) {
            if (!q2.isEmpty() && (e2 = this.g.e(this.a, annotatedParameter.q)) != null && e2 != JsonCreator.Mode.DISABLED) {
                A = PropertyName.a(q2);
            } else {
                return;
            }
        }
        PropertyName propertyName = A;
        String b2 = b(q2);
        if (!z || !b2.isEmpty()) {
            pVar = f(map, b2);
        } else {
            String str = propertyName.q;
            pVar = map.get(str);
            if (pVar == null) {
                pVar = new p(this.a, this.g, this.c, propertyName);
                map.put(str, pVar);
            }
        }
        pVar.b2 = new p.e(annotatedParameter, pVar.b2, propertyName, z, true, false);
        this.k.add(pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.get(e(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(java.lang.String r3) {
        /*
            r2 = this;
            java.util.Map<com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.PropertyName> r0 = r2.l
            if (r0 == 0) goto L_0x0012
            com.fasterxml.jackson.databind.PropertyName r1 = r2.e(r3)
            java.lang.Object r0 = r0.get(r1)
            com.fasterxml.jackson.databind.PropertyName r0 = (com.fasterxml.jackson.databind.PropertyName) r0
            if (r0 == 0) goto L_0x0012
            java.lang.String r3 = r0.q
        L_0x0012:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.o.b(java.lang.String):java.lang.String");
    }

    public void c(String str) {
        if (!this.c && str != null) {
            if (this.s == null) {
                this.s = new HashSet<>();
            }
            this.s.add(str);
        }
    }

    public void d(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value != null) {
            Object obj = value.d;
            if (this.t == null) {
                this.t = new LinkedHashMap<>();
            }
            AnnotatedMember annotatedMember2 = (AnnotatedMember) this.t.put(obj, annotatedMember);
            if (annotatedMember2 != null && annotatedMember2.getClass() == annotatedMember.getClass()) {
                String name = obj.getClass().getName();
                throw new IllegalArgumentException("Duplicate injectable value with id '" + obj + "' (of type " + name + ")");
            }
        }
    }

    public final PropertyName e(String str) {
        return PropertyName.b(str, (String) null);
    }

    public p f(Map<String, p> map, String str) {
        p pVar = map.get(str);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this.a, this.g, this.c, PropertyName.a(str));
        map.put(str, pVar2);
        return pVar2;
    }

    public boolean g(p pVar, List<p> list) {
        if (list != null) {
            String str = pVar.Z1.q;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (list.get(i2).Z1.q.equals(str)) {
                    list.set(i2, pVar);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:401:0x0825  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0837  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0841  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0845  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
            r15 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            com.fasterxml.jackson.databind.AnnotationIntrospector r1 = r15.g
            boolean r2 = r15.c
            r3 = 1
            if (r2 != 0) goto L_0x0018
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r15.a
            com.fasterxml.jackson.databind.MapperFeature r4 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS
            boolean r2 = r2.q(r4)
            if (r2 != 0) goto L_0x0018
            r2 = r3
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r4 = r15.a
            com.fasterxml.jackson.databind.MapperFeature r5 = com.fasterxml.jackson.databind.MapperFeature.PROPAGATE_TRANSIENT_MARKER
            boolean r4 = r4.q(r5)
            i0.f.a.c.n.b r5 = r15.e
            java.lang.Iterable r5 = r5.i()
            java.util.Iterator r5 = r5.iterator()
        L_0x002b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0159
            java.lang.Object r6 = r5.next()
            r8 = r6
            com.fasterxml.jackson.databind.introspect.AnnotatedField r8 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r8
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r7 = r15.a
            java.lang.Boolean r7 = r1.s0(r7, r8)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0056
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r7 = r15.q
            if (r7 != 0) goto L_0x0051
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            r15.q = r7
        L_0x0051:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r7 = r15.q
            r7.add(r8)
        L_0x0056:
            java.lang.Boolean r7 = r1.t0(r8)
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L_0x0071
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r6 = r15.r
            if (r6 != 0) goto L_0x006b
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r15.r = r6
        L_0x006b:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r6 = r15.r
            r6.add(r8)
            goto L_0x002b
        L_0x0071:
            java.lang.Boolean r7 = r1.p0(r8)
            boolean r7 = r6.equals(r7)
            java.lang.Boolean r9 = r1.r0(r8)
            boolean r6 = r6.equals(r9)
            if (r7 != 0) goto L_0x0133
            if (r6 == 0) goto L_0x0087
            goto L_0x0133
        L_0x0087:
            java.lang.String r6 = r1.q(r8)
            if (r6 != 0) goto L_0x0091
            java.lang.String r6 = r8.d()
        L_0x0091:
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy r7 = r15.b
            com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy r7 = (com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy) r7
            java.util.Objects.requireNonNull(r7)
            if (r6 != 0) goto L_0x009b
            goto L_0x002b
        L_0x009b:
            com.fasterxml.jackson.databind.PropertyName r7 = r15.e(r6)
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r9 = r15.a
            com.fasterxml.jackson.databind.PropertyName r9 = r1.a0(r9, r8, r7)
            if (r9 == 0) goto L_0x00bd
            boolean r10 = r9.equals(r7)
            if (r10 != 0) goto L_0x00bd
            java.util.Map<com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.PropertyName> r10 = r15.l
            if (r10 != 0) goto L_0x00b8
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r15.l = r10
        L_0x00b8:
            java.util.Map<com.fasterxml.jackson.databind.PropertyName, com.fasterxml.jackson.databind.PropertyName> r10 = r15.l
            r10.put(r9, r7)
        L_0x00bd:
            boolean r7 = r15.c
            if (r7 == 0) goto L_0x00c6
            com.fasterxml.jackson.databind.PropertyName r7 = r1.C(r8)
            goto L_0x00ca
        L_0x00c6:
            com.fasterxml.jackson.databind.PropertyName r7 = r1.A(r8)
        L_0x00ca:
            if (r7 == 0) goto L_0x00ce
            r9 = r3
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            if (r9 == 0) goto L_0x00df
            boolean r10 = r7.e()
            if (r10 == 0) goto L_0x00df
            com.fasterxml.jackson.databind.PropertyName r7 = r15.e(r6)
            r10 = 0
            r11 = r10
            r10 = r7
            goto L_0x00e1
        L_0x00df:
            r10 = r7
            r11 = r9
        L_0x00e1:
            if (r10 == 0) goto L_0x00e5
            r7 = r3
            goto L_0x00e6
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            if (r7 != 0) goto L_0x00f7
            com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r7 = r15.f
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r7 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r7
            java.util.Objects.requireNonNull(r7)
            java.lang.reflect.Field r12 = r8.q
            com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r7 = r7.Y1
            boolean r7 = r7.isVisible(r12)
        L_0x00f7:
            boolean r12 = r1.w0(r8)
            java.lang.reflect.Field r13 = r8.q
            int r13 = r13.getModifiers()
            boolean r13 = java.lang.reflect.Modifier.isTransient(r13)
            if (r13 == 0) goto L_0x010d
            if (r9 != 0) goto L_0x010d
            if (r4 == 0) goto L_0x010c
            r12 = r3
        L_0x010c:
            r7 = 0
        L_0x010d:
            r13 = r12
            r12 = r7
            if (r2 == 0) goto L_0x0123
            if (r10 != 0) goto L_0x0123
            if (r13 != 0) goto L_0x0123
            java.lang.reflect.Field r7 = r8.q
            int r7 = r7.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isFinal(r7)
            if (r7 == 0) goto L_0x0123
            goto L_0x002b
        L_0x0123:
            i0.f.a.c.n.p r6 = r15.f(r0, r6)
            i0.f.a.c.n.p$e r14 = new i0.f.a.c.n.p$e
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r9 = r6.a2
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.a2 = r14
            goto L_0x002b
        L_0x0133:
            if (r7 == 0) goto L_0x0145
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r7 = r15.n
            if (r7 != 0) goto L_0x0140
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            r15.n = r7
        L_0x0140:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r7 = r15.n
            r7.add(r8)
        L_0x0145:
            if (r6 == 0) goto L_0x002b
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r6 = r15.p
            if (r6 != 0) goto L_0x0152
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            r15.p = r6
        L_0x0152:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r6 = r15.p
            r6.add(r8)
            goto L_0x002b
        L_0x0159:
            i0.f.a.c.n.b r1 = r15.e
            i0.f.a.c.n.g r1 = r1.h()
            java.util.Iterator r1 = r1.iterator()
        L_0x0163:
            boolean r2 = r1.hasNext()
            r4 = 2
            if (r2 == 0) goto L_0x0310
            java.lang.Object r2 = r1.next()
            r6 = r2
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r6 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r6
            int r2 = r6.x()
            if (r2 != 0) goto L_0x027c
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r15.g
            java.lang.Class r4 = r6.A()
            java.lang.Class r5 = java.lang.Void.TYPE
            if (r4 == r5) goto L_0x0163
            java.lang.Class<java.lang.Void> r5 = java.lang.Void.class
            if (r4 != r5) goto L_0x0190
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r4 = r15.a
            com.fasterxml.jackson.databind.MapperFeature r5 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_VOID_VALUED_PROPERTIES
            boolean r4 = r4.q(r5)
            if (r4 != 0) goto L_0x0190
            goto L_0x0163
        L_0x0190:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Boolean r5 = r2.p0(r6)
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x01ad
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r15.m
            if (r2 != 0) goto L_0x01a7
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r15.m = r2
        L_0x01a7:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r15.m
            r2.add(r6)
            goto L_0x0163
        L_0x01ad:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r5 = r15.a
            java.lang.Boolean r5 = r2.s0(r5, r6)
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x01ca
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r15.q
            if (r2 != 0) goto L_0x01c4
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r15.q = r2
        L_0x01c4:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r15.q
            r2.add(r6)
            goto L_0x0163
        L_0x01ca:
            java.lang.Boolean r5 = r2.t0(r6)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01e6
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r15.r
            if (r2 != 0) goto L_0x01df
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r15.r = r2
        L_0x01df:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMember> r2 = r15.r
            r2.add(r6)
            goto L_0x0163
        L_0x01e6:
            com.fasterxml.jackson.databind.PropertyName r4 = r2.C(r6)
            if (r4 == 0) goto L_0x01ee
            r5 = r3
            goto L_0x01ef
        L_0x01ee:
            r5 = 0
        L_0x01ef:
            if (r5 != 0) goto L_0x0234
            java.lang.String r7 = r2.q(r6)
            if (r7 != 0) goto L_0x0201
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy r7 = r15.b
            java.lang.String r8 = r6.d()
            java.lang.String r7 = r7.c(r6, r8)
        L_0x0201:
            if (r7 != 0) goto L_0x0221
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy r7 = r15.b
            java.lang.String r8 = r6.d()
            java.lang.String r7 = r7.a(r6, r8)
            if (r7 != 0) goto L_0x0211
            goto L_0x0163
        L_0x0211:
            com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r8 = r15.f
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r8 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r8
            java.util.Objects.requireNonNull(r8)
            java.lang.reflect.Method r9 = r6.x
            com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r8 = r8.q
            boolean r8 = r8.isVisible(r9)
            goto L_0x0230
        L_0x0221:
            com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r8 = r15.f
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r8 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r8
            java.util.Objects.requireNonNull(r8)
            java.lang.reflect.Method r9 = r6.x
            com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r8 = r8.d
            boolean r8 = r8.isVisible(r9)
        L_0x0230:
            r9 = r5
            r10 = r8
            r8 = r4
            goto L_0x0264
        L_0x0234:
            java.lang.String r7 = r2.q(r6)
            if (r7 != 0) goto L_0x0250
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy r7 = r15.b
            java.lang.String r8 = r6.d()
            java.lang.String r7 = r7.c(r6, r8)
            if (r7 != 0) goto L_0x0250
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy r7 = r15.b
            java.lang.String r8 = r6.d()
            java.lang.String r7 = r7.a(r6, r8)
        L_0x0250:
            if (r7 != 0) goto L_0x0256
            java.lang.String r7 = r6.d()
        L_0x0256:
            boolean r8 = r4.e()
            if (r8 == 0) goto L_0x0261
            com.fasterxml.jackson.databind.PropertyName r4 = r15.e(r7)
            r5 = 0
        L_0x0261:
            r10 = r3
            r8 = r4
            r9 = r5
        L_0x0264:
            java.lang.String r4 = r15.b(r7)
            boolean r11 = r2.w0(r6)
            i0.f.a.c.n.p r2 = r15.f(r0, r4)
            i0.f.a.c.n.p$e r4 = new i0.f.a.c.n.p$e
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r7 = r2.c2
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.c2 = r4
            goto L_0x0163
        L_0x027c:
            if (r2 != r3) goto L_0x02ee
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r15.g
            com.fasterxml.jackson.databind.PropertyName r4 = r2.A(r6)
            if (r4 == 0) goto L_0x0288
            r5 = r3
            goto L_0x0289
        L_0x0288:
            r5 = 0
        L_0x0289:
            if (r5 != 0) goto L_0x02b2
            java.lang.String r7 = r2.q(r6)
            if (r7 != 0) goto L_0x029b
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy r7 = r15.b
            java.lang.String r8 = r6.d()
            java.lang.String r7 = r7.b(r6, r8)
        L_0x029b:
            if (r7 != 0) goto L_0x029f
            goto L_0x0163
        L_0x029f:
            com.fasterxml.jackson.databind.introspect.VisibilityChecker<?> r8 = r15.f
            com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std r8 = (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std) r8
            java.util.Objects.requireNonNull(r8)
            java.lang.reflect.Method r9 = r6.x
            com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility r8 = r8.x
            boolean r8 = r8.isVisible(r9)
            r9 = r5
            r10 = r8
            r8 = r4
            goto L_0x02d6
        L_0x02b2:
            java.lang.String r7 = r2.q(r6)
            if (r7 != 0) goto L_0x02c2
            com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy r7 = r15.b
            java.lang.String r8 = r6.d()
            java.lang.String r7 = r7.b(r6, r8)
        L_0x02c2:
            if (r7 != 0) goto L_0x02c8
            java.lang.String r7 = r6.d()
        L_0x02c8:
            boolean r8 = r4.e()
            if (r8 == 0) goto L_0x02d3
            com.fasterxml.jackson.databind.PropertyName r4 = r15.e(r7)
            r5 = 0
        L_0x02d3:
            r10 = r3
            r8 = r4
            r9 = r5
        L_0x02d6:
            java.lang.String r4 = r15.b(r7)
            boolean r11 = r2.w0(r6)
            i0.f.a.c.n.p r2 = r15.f(r0, r4)
            i0.f.a.c.n.p$e r4 = new i0.f.a.c.n.p$e
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r7 = r2.d2
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.d2 = r4
            goto L_0x0163
        L_0x02ee:
            if (r2 != r4) goto L_0x0163
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r15.g
            java.lang.Boolean r4 = r4.r0(r6)
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0163
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r15.o
            if (r2 != 0) goto L_0x0309
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r15.o = r2
        L_0x0309:
            java.util.LinkedList<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r2 = r15.o
            r2.add(r6)
            goto L_0x0163
        L_0x0310:
            i0.f.a.c.n.b r1 = r15.e
            boolean r1 = r1.m()
            if (r1 != 0) goto L_0x0381
            boolean r1 = r15.h
            if (r1 != 0) goto L_0x031d
            goto L_0x0381
        L_0x031d:
            i0.f.a.c.n.b r1 = r15.e
            java.util.List r1 = r1.k()
            java.util.Iterator r1 = r1.iterator()
        L_0x0327:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x034f
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedConstructor r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedConstructor) r2
            java.util.LinkedList<i0.f.a.c.n.p> r5 = r15.k
            if (r5 != 0) goto L_0x033e
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r15.k = r5
        L_0x033e:
            int r5 = r2.x()
            r6 = 0
        L_0x0343:
            if (r6 >= r5) goto L_0x0327
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r7 = r2.w(r6)
            r15.a(r0, r7)
            int r6 = r6 + 1
            goto L_0x0343
        L_0x034f:
            i0.f.a.c.n.b r1 = r15.e
            java.util.List r1 = r1.l()
            java.util.Iterator r1 = r1.iterator()
        L_0x0359:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0381
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r2
            java.util.LinkedList<i0.f.a.c.n.p> r5 = r15.k
            if (r5 != 0) goto L_0x0370
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            r15.k = r5
        L_0x0370:
            int r5 = r2.x()
            r6 = 0
        L_0x0375:
            if (r6 >= r5) goto L_0x0359
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r7 = r2.w(r6)
            r15.a(r0, r7)
            int r6 = r6 + 1
            goto L_0x0375
        L_0x0381:
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0389:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0425
            java.lang.Object r2 = r1.next()
            i0.f.a.c.n.p r2 = (i0.f.a.c.n.p) r2
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r5 = r2.a2
            boolean r5 = r2.O(r5)
            if (r5 != 0) goto L_0x03b8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.c2
            boolean r5 = r2.O(r5)
            if (r5 != 0) goto L_0x03b8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.d2
            boolean r5 = r2.O(r5)
            if (r5 != 0) goto L_0x03b8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r5 = r2.b2
            boolean r5 = r2.O(r5)
            if (r5 == 0) goto L_0x03b6
            goto L_0x03b8
        L_0x03b6:
            r5 = 0
            goto L_0x03b9
        L_0x03b8:
            r5 = r3
        L_0x03b9:
            if (r5 != 0) goto L_0x03bf
            r1.remove()
            goto L_0x0389
        L_0x03bf:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r5 = r2.a2
            boolean r5 = r2.N(r5)
            if (r5 != 0) goto L_0x03e2
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.c2
            boolean r5 = r2.N(r5)
            if (r5 != 0) goto L_0x03e2
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.d2
            boolean r5 = r2.N(r5)
            if (r5 != 0) goto L_0x03e2
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r5 = r2.b2
            boolean r5 = r2.N(r5)
            if (r5 == 0) goto L_0x03e0
            goto L_0x03e2
        L_0x03e0:
            r5 = 0
            goto L_0x03e3
        L_0x03e2:
            r5 = r3
        L_0x03e3:
            if (r5 == 0) goto L_0x0389
            boolean r5 = r2.H()
            if (r5 != 0) goto L_0x03f6
            r1.remove()
            java.lang.String r2 = r2.getName()
            r15.c(r2)
            goto L_0x0389
        L_0x03f6:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r5 = r2.a2
            i0.f.a.c.n.p$e r5 = r2.W(r5)
            r2.a2 = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.c2
            i0.f.a.c.n.p$e r5 = r2.W(r5)
            r2.c2 = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.d2
            i0.f.a.c.n.p$e r5 = r2.W(r5)
            r2.d2 = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r5 = r2.b2
            i0.f.a.c.n.p$e r5 = r2.W(r5)
            r2.b2 = r5
            boolean r5 = r2.i()
            if (r5 != 0) goto L_0x0389
            java.lang.String r2 = r2.getName()
            r15.c(r2)
            goto L_0x0389
        L_0x0425:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r1 = r15.a
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.INFER_PROPERTY_MUTATORS
            boolean r1 = r1.q(r2)
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0435:
            boolean r5 = r2.hasNext()
            r6 = 3
            r7 = 0
            if (r5 == 0) goto L_0x055f
            java.lang.Object r5 = r2.next()
            i0.f.a.c.n.p r5 = (i0.f.a.c.n.p) r5
            boolean r8 = r15.c
            if (r8 == 0) goto L_0x0449
            r8 = r7
            goto L_0x044a
        L_0x0449:
            r8 = r15
        L_0x044a:
            java.util.Objects.requireNonNull(r5)
            com.fasterxml.jackson.annotation.JsonProperty$Access r9 = com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO
            com.fasterxml.jackson.databind.AnnotationIntrospector r10 = r5.y
            if (r10 != 0) goto L_0x0455
            goto L_0x04ef
        L_0x0455:
            boolean r11 = r5.q
            if (r11 == 0) goto L_0x04a5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r11 = r5.c2
            if (r11 == 0) goto L_0x046b
            T r11 = r11.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r11 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r11
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r10.M(r11)
            if (r10 == 0) goto L_0x046b
            if (r10 == r9) goto L_0x046b
            goto L_0x04f0
        L_0x046b:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r10 = r5.a2
            if (r10 == 0) goto L_0x047f
            T r10 = r10.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r10
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r5.y
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r11.M(r10)
            if (r10 == 0) goto L_0x047f
            if (r10 == r9) goto L_0x047f
            goto L_0x04f0
        L_0x047f:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r10 = r5.b2
            if (r10 == 0) goto L_0x0492
            T r10 = r10.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r10
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r5.y
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r11.M(r10)
            if (r10 == 0) goto L_0x0492
            if (r10 == r9) goto L_0x0492
            goto L_0x04f0
        L_0x0492:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r5.d2
            if (r10 == 0) goto L_0x04ef
            T r10 = r10.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r10
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r5.y
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r11.M(r10)
            if (r10 == 0) goto L_0x04ef
            if (r10 == r9) goto L_0x04ef
            goto L_0x04f0
        L_0x04a5:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r11 = r5.b2
            if (r11 == 0) goto L_0x04b6
            T r11 = r11.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r11 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r11
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r10.M(r11)
            if (r10 == 0) goto L_0x04b6
            if (r10 == r9) goto L_0x04b6
            goto L_0x04f0
        L_0x04b6:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r5.d2
            if (r10 == 0) goto L_0x04c9
            T r10 = r10.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r10
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r5.y
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r11.M(r10)
            if (r10 == 0) goto L_0x04c9
            if (r10 == r9) goto L_0x04c9
            goto L_0x04f0
        L_0x04c9:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r10 = r5.a2
            if (r10 == 0) goto L_0x04dc
            T r10 = r10.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r10
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r5.y
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r11.M(r10)
            if (r10 == 0) goto L_0x04dc
            if (r10 == r9) goto L_0x04dc
            goto L_0x04f0
        L_0x04dc:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r5.c2
            if (r10 == 0) goto L_0x04ef
            T r10 = r10.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r10 = (com.fasterxml.jackson.databind.introspect.AnnotatedMember) r10
            com.fasterxml.jackson.databind.AnnotationIntrospector r11 = r5.y
            com.fasterxml.jackson.annotation.JsonProperty$Access r10 = r11.M(r10)
            if (r10 == 0) goto L_0x04ef
            if (r10 == r9) goto L_0x04ef
            goto L_0x04f0
        L_0x04ef:
            r10 = r7
        L_0x04f0:
            if (r10 != 0) goto L_0x04f3
            goto L_0x04f4
        L_0x04f3:
            r9 = r10
        L_0x04f4:
            int r9 = r9.ordinal()
            if (r9 == r3) goto L_0x0530
            if (r9 == r4) goto L_0x0526
            if (r9 == r6) goto L_0x0435
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r6 = r5.c2
            i0.f.a.c.n.p$e r6 = r5.X(r6)
            r5.c2 = r6
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r6 = r5.b2
            i0.f.a.c.n.p$e r6 = r5.X(r6)
            r5.b2 = r6
            if (r1 == 0) goto L_0x0514
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r6 = r5.c2
            if (r6 != 0) goto L_0x0435
        L_0x0514:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r6 = r5.a2
            i0.f.a.c.n.p$e r6 = r5.X(r6)
            r5.a2 = r6
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r6 = r5.d2
            i0.f.a.c.n.p$e r6 = r5.X(r6)
            r5.d2 = r6
            goto L_0x0435
        L_0x0526:
            r5.c2 = r7
            boolean r6 = r5.q
            if (r6 == 0) goto L_0x0435
            r5.a2 = r7
            goto L_0x0435
        L_0x0530:
            if (r8 == 0) goto L_0x0553
            java.lang.String r6 = r5.getName()
            r8.c(r6)
            java.util.Set r6 = r5.b0()
            java.util.Iterator r6 = r6.iterator()
        L_0x0541:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0553
            java.lang.Object r9 = r6.next()
            com.fasterxml.jackson.databind.PropertyName r9 = (com.fasterxml.jackson.databind.PropertyName) r9
            java.lang.String r9 = r9.q
            r8.c(r9)
            goto L_0x0541
        L_0x0553:
            r5.d2 = r7
            r5.b2 = r7
            boolean r6 = r5.q
            if (r6 != 0) goto L_0x0435
            r5.a2 = r7
            goto L_0x0435
        L_0x055f:
            java.util.Set r1 = r0.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = r7
        L_0x0568:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x05c9
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            i0.f.a.c.n.p r5 = (i0.f.a.c.n.p) r5
            java.util.Set r8 = r5.b0()
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0585
            goto L_0x0568
        L_0x0585:
            r1.remove()
            if (r2 != 0) goto L_0x058f
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x058f:
            int r9 = r8.size()
            if (r9 != r3) goto L_0x05a8
            java.util.Iterator r8 = r8.iterator()
            java.lang.Object r8 = r8.next()
            com.fasterxml.jackson.databind.PropertyName r8 = (com.fasterxml.jackson.databind.PropertyName) r8
            i0.f.a.c.n.p r9 = new i0.f.a.c.n.p
            r9.<init>(r5, r8)
            r2.add(r9)
            goto L_0x0568
        L_0x05a8:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r10 = r5.a2
            r5.Q(r8, r9, r10)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r5.c2
            r5.Q(r8, r9, r10)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r5.d2
            r5.Q(r8, r9, r10)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r10 = r5.b2
            r5.Q(r8, r9, r10)
            java.util.Collection r5 = r9.values()
            r2.addAll(r5)
            goto L_0x0568
        L_0x05c9:
            if (r2 == 0) goto L_0x05fe
            java.util.Iterator r1 = r2.iterator()
        L_0x05cf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x05fe
            java.lang.Object r2 = r1.next()
            i0.f.a.c.n.p r2 = (i0.f.a.c.n.p) r2
            java.lang.String r5 = r2.getName()
            java.lang.Object r8 = r0.get(r5)
            i0.f.a.c.n.p r8 = (i0.f.a.c.n.p) r8
            if (r8 != 0) goto L_0x05eb
            r0.put(r5, r2)
            goto L_0x05ee
        L_0x05eb:
            r8.a0(r2)
        L_0x05ee:
            java.util.LinkedList<i0.f.a.c.n.p> r8 = r15.k
            boolean r2 = r15.g(r2, r8)
            if (r2 == 0) goto L_0x05cf
            java.util.HashSet<java.lang.String> r2 = r15.s
            if (r2 == 0) goto L_0x05cf
            r2.remove(r5)
            goto L_0x05cf
        L_0x05fe:
            i0.f.a.c.n.b r1 = r15.e
            java.lang.Iterable r1 = r1.i()
            java.util.Iterator r1 = r1.iterator()
        L_0x0608:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x061e
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedField r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedField) r2
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r15.g
            com.fasterxml.jackson.annotation.JacksonInject$Value r5 = r5.v(r2)
            r15.d(r5, r2)
            goto L_0x0608
        L_0x061e:
            i0.f.a.c.n.b r1 = r15.e
            i0.f.a.c.n.g r1 = r1.h()
            java.util.Iterator r1 = r1.iterator()
        L_0x0628:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0645
            java.lang.Object r2 = r1.next()
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r2 = (com.fasterxml.jackson.databind.introspect.AnnotatedMethod) r2
            int r5 = r2.x()
            if (r5 == r3) goto L_0x063b
            goto L_0x0628
        L_0x063b:
            com.fasterxml.jackson.databind.AnnotationIntrospector r5 = r15.g
            com.fasterxml.jackson.annotation.JacksonInject$Value r5 = r5.v(r2)
            r15.d(r5, r2)
            goto L_0x0628
        L_0x0645:
            java.util.Collection r1 = r0.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x064d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x06f8
            java.lang.Object r2 = r1.next()
            i0.f.a.c.n.p r2 = (i0.f.a.c.n.p) r2
            boolean r5 = r15.c
            r8 = 4
            if (r5 == 0) goto L_0x069e
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.c2
            if (r5 == 0) goto L_0x0680
            i0.f.a.c.n.p$e[] r8 = new i0.f.a.c.n.p.e[r8]
            r9 = 0
            r8[r9] = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r5 = r2.a2
            r8[r3] = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r5 = r2.b2
            r8[r4] = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r2.d2
            r8[r6] = r5
            i0.f.a.c.n.h r5 = r2.V(r9, r8)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r8 = r2.c2
            i0.f.a.c.n.p$e r5 = r2.P(r8, r5)
            r2.c2 = r5
            goto L_0x064d
        L_0x0680:
            r5 = 0
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r8 = r2.a2
            if (r8 == 0) goto L_0x064d
            i0.f.a.c.n.p$e[] r9 = new i0.f.a.c.n.p.e[r6]
            r9[r5] = r8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r8 = r2.b2
            r9[r3] = r8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r8 = r2.d2
            r9[r4] = r8
            i0.f.a.c.n.h r5 = r2.V(r5, r9)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r8 = r2.a2
            i0.f.a.c.n.p$e r5 = r2.P(r8, r5)
            r2.a2 = r5
            goto L_0x064d
        L_0x069e:
            r5 = 0
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r9 = r2.b2
            if (r9 == 0) goto L_0x06c0
            i0.f.a.c.n.p$e[] r8 = new i0.f.a.c.n.p.e[r8]
            r8[r5] = r9
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r9 = r2.d2
            r8[r3] = r9
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r9 = r2.a2
            r8[r4] = r9
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r9 = r2.c2
            r8[r6] = r9
            i0.f.a.c.n.h r5 = r2.V(r5, r8)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r8 = r2.b2
            i0.f.a.c.n.p$e r5 = r2.P(r8, r5)
            r2.b2 = r5
            goto L_0x064d
        L_0x06c0:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r8 = r2.d2
            if (r8 == 0) goto L_0x06de
            i0.f.a.c.n.p$e[] r9 = new i0.f.a.c.n.p.e[r6]
            r9[r5] = r8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r8 = r2.a2
            r9[r3] = r8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r8 = r2.c2
            r9[r4] = r8
            i0.f.a.c.n.h r5 = r2.V(r5, r9)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r8 = r2.d2
            i0.f.a.c.n.p$e r5 = r2.P(r8, r5)
            r2.d2 = r5
            goto L_0x064d
        L_0x06de:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r8 = r2.a2
            if (r8 == 0) goto L_0x064d
            i0.f.a.c.n.p$e[] r9 = new i0.f.a.c.n.p.e[r4]
            r9[r5] = r8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r8 = r2.c2
            r9[r3] = r8
            i0.f.a.c.n.h r5 = r2.V(r5, r9)
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r8 = r2.a2
            i0.f.a.c.n.p$e r5 = r2.P(r8, r5)
            r2.a2 = r5
            goto L_0x064d
        L_0x06f8:
            r1 = 0
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0701:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x072e
            java.lang.Object r4 = r2.next()
            i0.f.a.c.n.p r4 = (i0.f.a.c.n.p) r4
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedField> r5 = r4.a2
            i0.f.a.c.n.p$e r5 = r4.Z(r5)
            r4.a2 = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r4.c2
            i0.f.a.c.n.p$e r5 = r4.Z(r5)
            r4.c2 = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r5 = r4.d2
            i0.f.a.c.n.p$e r5 = r4.Z(r5)
            r4.d2 = r5
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedParameter> r5 = r4.b2
            i0.f.a.c.n.p$e r5 = r4.Z(r5)
            r4.b2 = r5
            goto L_0x0701
        L_0x072e:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r15.g
            i0.f.a.c.n.b r4 = r15.e
            java.lang.Object r2 = r2.E(r4)
            if (r2 != 0) goto L_0x073f
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r15.a
            com.fasterxml.jackson.databind.cfg.BaseSettings r2 = r2.d
            com.fasterxml.jackson.databind.PropertyNamingStrategy r2 = r2.y
            goto L_0x076d
        L_0x073f:
            boolean r4 = r2 instanceof com.fasterxml.jackson.databind.PropertyNamingStrategy
            if (r4 == 0) goto L_0x0746
            com.fasterxml.jackson.databind.PropertyNamingStrategy r2 = (com.fasterxml.jackson.databind.PropertyNamingStrategy) r2
            goto L_0x076d
        L_0x0746:
            boolean r4 = r2 instanceof java.lang.Class
            if (r4 == 0) goto L_0x0a03
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Class<com.fasterxml.jackson.databind.PropertyNamingStrategy> r4 = com.fasterxml.jackson.databind.PropertyNamingStrategy.class
            if (r2 != r4) goto L_0x0752
            r2 = r7
            goto L_0x076d
        L_0x0752:
            java.lang.Class<com.fasterxml.jackson.databind.PropertyNamingStrategy> r4 = com.fasterxml.jackson.databind.PropertyNamingStrategy.class
            boolean r4 = r4.isAssignableFrom(r2)
            if (r4 == 0) goto L_0x09f1
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r4 = r15.a
            com.fasterxml.jackson.databind.cfg.BaseSettings r4 = r4.d
            java.util.Objects.requireNonNull(r4)
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r4 = r15.a
            boolean r4 = r4.b()
            java.lang.Object r2 = i0.f.a.c.t.f.i(r2, r4)
            com.fasterxml.jackson.databind.PropertyNamingStrategy r2 = (com.fasterxml.jackson.databind.PropertyNamingStrategy) r2
        L_0x076d:
            if (r2 == 0) goto L_0x0851
            java.util.Collection r4 = r0.values()
            int r5 = r0.size()
            i0.f.a.c.n.p[] r5 = new i0.f.a.c.n.p[r5]
            java.lang.Object[] r4 = r4.toArray(r5)
            i0.f.a.c.n.p[] r4 = (i0.f.a.c.n.p[]) r4
            r0.clear()
            int r5 = r4.length
            r6 = r1
        L_0x0784:
            if (r6 >= r5) goto L_0x0851
            r8 = r4[r6]
            com.fasterxml.jackson.databind.PropertyName r9 = r8.Y1
            boolean r10 = r8.I()
            if (r10 == 0) goto L_0x079a
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r10 = r15.a
            com.fasterxml.jackson.databind.MapperFeature r11 = com.fasterxml.jackson.databind.MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING
            boolean r10 = r10.q(r11)
            if (r10 == 0) goto L_0x081a
        L_0x079a:
            boolean r10 = r15.c
            if (r10 == 0) goto L_0x07c8
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r8.c2
            if (r10 == 0) goto L_0x07a4
            r10 = r3
            goto L_0x07a5
        L_0x07a4:
            r10 = r1
        L_0x07a5:
            if (r10 == 0) goto L_0x07b5
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r10 = r15.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r11 = r8.v()
            java.lang.String r12 = r9.q
            java.lang.String r10 = r2.c(r10, r11, r12)
            goto L_0x081b
        L_0x07b5:
            boolean r10 = r8.E()
            if (r10 == 0) goto L_0x081a
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r10 = r15.a
            com.fasterxml.jackson.databind.introspect.AnnotatedField r11 = r8.u()
            java.lang.String r12 = r9.q
            java.lang.String r10 = r2.b(r10, r11, r12)
            goto L_0x081b
        L_0x07c8:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r8.d2
            if (r10 == 0) goto L_0x07ce
            r10 = r3
            goto L_0x07cf
        L_0x07ce:
            r10 = r1
        L_0x07cf:
            if (r10 == 0) goto L_0x07de
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r10 = r15.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r11 = r8.B()
            java.lang.String r12 = r9.q
            java.lang.String r10 = r2.d(r10, r11, r12)
            goto L_0x081b
        L_0x07de:
            boolean r10 = r8.D()
            if (r10 == 0) goto L_0x07f1
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r10 = r15.a
            com.fasterxml.jackson.databind.introspect.AnnotatedParameter r11 = r8.s()
            java.lang.String r12 = r9.q
            java.lang.String r10 = r2.a(r10, r11, r12)
            goto L_0x081b
        L_0x07f1:
            boolean r10 = r8.E()
            if (r10 == 0) goto L_0x0804
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r10 = r15.a
            com.fasterxml.jackson.databind.introspect.AnnotatedField r11 = r8.u()
            java.lang.String r12 = r9.q
            java.lang.String r10 = r2.b(r10, r11, r12)
            goto L_0x081b
        L_0x0804:
            i0.f.a.c.n.p$e<com.fasterxml.jackson.databind.introspect.AnnotatedMethod> r10 = r8.c2
            if (r10 == 0) goto L_0x080a
            r10 = r3
            goto L_0x080b
        L_0x080a:
            r10 = r1
        L_0x080b:
            if (r10 == 0) goto L_0x081a
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r10 = r15.a
            com.fasterxml.jackson.databind.introspect.AnnotatedMethod r11 = r8.v()
            java.lang.String r12 = r9.q
            java.lang.String r10 = r2.c(r10, r11, r12)
            goto L_0x081b
        L_0x081a:
            r10 = r7
        L_0x081b:
            if (r10 == 0) goto L_0x0837
            java.lang.String r11 = r9.q
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x0837
            com.fasterxml.jackson.databind.PropertyName r9 = r8.Y1
            com.fasterxml.jackson.databind.PropertyName r9 = r9.g(r10)
            com.fasterxml.jackson.databind.PropertyName r11 = r8.Y1
            if (r9 != r11) goto L_0x0830
            goto L_0x0839
        L_0x0830:
            i0.f.a.c.n.p r11 = new i0.f.a.c.n.p
            r11.<init>(r8, r9)
            r8 = r11
            goto L_0x0839
        L_0x0837:
            java.lang.String r10 = r9.q
        L_0x0839:
            java.lang.Object r9 = r0.get(r10)
            i0.f.a.c.n.p r9 = (i0.f.a.c.n.p) r9
            if (r9 != 0) goto L_0x0845
            r0.put(r10, r8)
            goto L_0x0848
        L_0x0845:
            r9.a0(r8)
        L_0x0848:
            java.util.LinkedList<i0.f.a.c.n.p> r9 = r15.k
            r15.g(r8, r9)
            int r6 = r6 + 1
            goto L_0x0784
        L_0x0851:
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r2 = r15.a
            com.fasterxml.jackson.databind.MapperFeature r4 = com.fasterxml.jackson.databind.MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME
            boolean r2 = r2.q(r4)
            if (r2 == 0) goto L_0x0882
            java.util.Set r2 = r0.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0863:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0882
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            i0.f.a.c.n.p r4 = (i0.f.a.c.n.p) r4
            com.fasterxml.jackson.databind.introspect.AnnotatedMember r4 = r4.w()
            if (r4 != 0) goto L_0x087c
            goto L_0x0863
        L_0x087c:
            com.fasterxml.jackson.databind.AnnotationIntrospector r4 = r15.g
            java.util.Objects.requireNonNull(r4)
            goto L_0x0863
        L_0x0882:
            com.fasterxml.jackson.databind.AnnotationIntrospector r2 = r15.g
            i0.f.a.c.n.b r4 = r15.e
            java.lang.Boolean r4 = r2.f0(r4)
            if (r4 != 0) goto L_0x0898
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r4 = r15.a
            java.util.Objects.requireNonNull(r4)
            com.fasterxml.jackson.databind.MapperFeature r5 = com.fasterxml.jackson.databind.MapperFeature.SORT_PROPERTIES_ALPHABETICALLY
            boolean r4 = r4.q(r5)
            goto L_0x089c
        L_0x0898:
            boolean r4 = r4.booleanValue()
        L_0x089c:
            java.util.Collection r5 = r0.values()
            java.util.Iterator r5 = r5.iterator()
        L_0x08a4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x08bf
            java.lang.Object r6 = r5.next()
            i0.f.a.c.n.p r6 = (i0.f.a.c.n.p) r6
            com.fasterxml.jackson.databind.PropertyMetadata r6 = r6.f()
            java.lang.Integer r6 = r6.Y1
            if (r6 == 0) goto L_0x08ba
            r6 = r3
            goto L_0x08bb
        L_0x08ba:
            r6 = r1
        L_0x08bb:
            if (r6 == 0) goto L_0x08a4
            r5 = r3
            goto L_0x08c0
        L_0x08bf:
            r5 = r1
        L_0x08c0:
            i0.f.a.c.n.b r6 = r15.e
            java.lang.String[] r2 = r2.e0(r6)
            if (r4 != 0) goto L_0x08d2
            if (r5 != 0) goto L_0x08d2
            java.util.LinkedList<i0.f.a.c.n.p> r6 = r15.k
            if (r6 != 0) goto L_0x08d2
            if (r2 != 0) goto L_0x08d2
            goto L_0x09ec
        L_0x08d2:
            int r6 = r0.size()
            if (r4 == 0) goto L_0x08de
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            goto L_0x08e5
        L_0x08de:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            int r8 = r6 + r6
            r7.<init>(r8)
        L_0x08e5:
            java.util.Collection r8 = r0.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x08ed:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0901
            java.lang.Object r9 = r8.next()
            i0.f.a.c.n.p r9 = (i0.f.a.c.n.p) r9
            java.lang.String r10 = r9.getName()
            r7.put(r10, r9)
            goto L_0x08ed
        L_0x0901:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r6 = r6 + r6
            r8.<init>(r6)
            if (r2 == 0) goto L_0x0941
            int r6 = r2.length
        L_0x090a:
            if (r1 >= r6) goto L_0x0941
            r9 = r2[r1]
            java.lang.Object r10 = r7.remove(r9)
            i0.f.a.c.n.p r10 = (i0.f.a.c.n.p) r10
            if (r10 != 0) goto L_0x0939
            java.util.Collection r11 = r0.values()
            java.util.Iterator r11 = r11.iterator()
        L_0x091e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0939
            java.lang.Object r12 = r11.next()
            i0.f.a.c.n.p r12 = (i0.f.a.c.n.p) r12
            com.fasterxml.jackson.databind.PropertyName r13 = r12.Z1
            java.lang.String r13 = r13.q
            boolean r13 = r9.equals(r13)
            if (r13 == 0) goto L_0x091e
            java.lang.String r9 = r12.getName()
            r10 = r12
        L_0x0939:
            if (r10 == 0) goto L_0x093e
            r8.put(r9, r10)
        L_0x093e:
            int r1 = r1 + 1
            goto L_0x090a
        L_0x0941:
            if (r5 == 0) goto L_0x098d
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            java.util.Set r2 = r7.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0950:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0971
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            i0.f.a.c.n.p r5 = (i0.f.a.c.n.p) r5
            com.fasterxml.jackson.databind.PropertyMetadata r6 = r5.f()
            java.lang.Integer r6 = r6.Y1
            if (r6 == 0) goto L_0x0950
            r1.put(r6, r5)
            r2.remove()
            goto L_0x0950
        L_0x0971:
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0979:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x098d
            java.lang.Object r2 = r1.next()
            i0.f.a.c.n.p r2 = (i0.f.a.c.n.p) r2
            java.lang.String r5 = r2.getName()
            r8.put(r5, r2)
            goto L_0x0979
        L_0x098d:
            java.util.LinkedList<i0.f.a.c.n.p> r1 = r15.k
            if (r1 == 0) goto L_0x09e3
            if (r4 == 0) goto L_0x099d
            com.fasterxml.jackson.databind.cfg.MapperConfig<?> r1 = r15.a
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.SORT_CREATOR_PROPERTIES_FIRST
            boolean r1 = r1.q(r2)
            if (r1 == 0) goto L_0x09e3
        L_0x099d:
            if (r4 == 0) goto L_0x09c3
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            java.util.LinkedList<i0.f.a.c.n.p> r2 = r15.k
            java.util.Iterator r2 = r2.iterator()
        L_0x09aa:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x09be
            java.lang.Object r4 = r2.next()
            i0.f.a.c.n.p r4 = (i0.f.a.c.n.p) r4
            java.lang.String r5 = r4.getName()
            r1.put(r5, r4)
            goto L_0x09aa
        L_0x09be:
            java.util.Collection r1 = r1.values()
            goto L_0x09c5
        L_0x09c3:
            java.util.LinkedList<i0.f.a.c.n.p> r1 = r15.k
        L_0x09c5:
            java.util.Iterator r1 = r1.iterator()
        L_0x09c9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x09e3
            java.lang.Object r2 = r1.next()
            i0.f.a.c.n.p r2 = (i0.f.a.c.n.p) r2
            java.lang.String r4 = r2.getName()
            boolean r5 = r7.containsKey(r4)
            if (r5 == 0) goto L_0x09c9
            r8.put(r4, r2)
            goto L_0x09c9
        L_0x09e3:
            r8.putAll(r7)
            r0.clear()
            r0.putAll(r8)
        L_0x09ec:
            r15.j = r0
            r15.i = r3
            return
        L_0x09f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AnnotationIntrospector returned Class "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r3 = "; expected Class<PropertyNamingStrategy>"
            java.lang.String r1 = i0.d.a.a.a.Y(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x0a03:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AnnotationIntrospector returned PropertyNamingStrategy definition of type "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r3 = "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead"
            java.lang.String r1 = i0.d.a.a.a.d0(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.n.o.h():void");
    }

    public void i(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        StringBuilder P0 = a.P0("Problem with definition of ");
        P0.append(this.e);
        P0.append(": ");
        P0.append(str);
        throw new IllegalArgumentException(P0.toString());
    }
}
