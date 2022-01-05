package i0.f.a.c.l;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import i0.f.a.c.b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: BeanDeserializerBuilder */
public class a {
    public final DeserializationConfig a;
    public final DeserializationContext b;
    public final b c;
    public final Map<String, SettableBeanProperty> d = new LinkedHashMap();
    public List<ValueInjector> e;
    public HashMap<String, SettableBeanProperty> f;
    public HashSet<String> g;
    public HashSet<String> h;
    public ValueInstantiator i;
    public ObjectIdReader j;
    public SettableAnyProperty k;
    public boolean l;
    public AnnotatedMethod m;

    public a(b bVar, DeserializationContext deserializationContext) {
        this.c = bVar;
        this.b = deserializationContext;
        this.a = deserializationContext.q;
    }

    public Map<String, List<PropertyName>> a(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector e2 = this.a.e();
        HashMap hashMap = null;
        if (e2 != null) {
            for (SettableBeanProperty next : collection) {
                List<PropertyName> N = e2.N(next.a());
                if (N != null && !N.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(next.x.q, N);
                }
            }
        }
        return hashMap == null ? Collections.emptyMap() : hashMap;
    }

    public boolean b() {
        Boolean b2 = this.c.b((JsonFormat.Value) null).b(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (b2 == null) {
            return this.a.q(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        }
        return b2.booleanValue();
    }

    public void c(Collection<SettableBeanProperty> collection) {
        if (this.a.b()) {
            for (SettableBeanProperty n : collection) {
                n.n(this.a);
            }
        }
        SettableAnyProperty settableAnyProperty = this.k;
        if (settableAnyProperty != null) {
            settableAnyProperty.d.g(this.a.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        AnnotatedMethod annotatedMethod = this.m;
        if (annotatedMethod != null) {
            annotatedMethod.g(this.a.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
    }

    public void d(String str) {
        if (this.g == null) {
            this.g = new HashSet<>();
        }
        this.g.add(str);
    }

    public void e(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty put = this.d.put(settableBeanProperty.x.q, settableBeanProperty);
        if (put != null && put != settableBeanProperty) {
            StringBuilder P0 = i0.d.a.a.a.P0("Duplicate property '");
            P0.append(settableBeanProperty.x.q);
            P0.append("' for ");
            P0.append(this.c.a);
            throw new IllegalArgumentException(P0.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.d<?> f() {
        /*
            r14 = this;
            java.util.Map<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r0 = r14.d
            java.util.Collection r0 = r0.values()
            r14.c(r0)
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r14.a
            java.util.Map r2 = r14.a(r0)
            boolean r3 = r14.b()
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r4 = new com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap
            com.fasterxml.jackson.databind.cfg.BaseSettings r1 = r1.d
            java.util.Locale r1 = r1.c2
            r4.<init>((boolean) r3, (java.util.Collection<com.fasterxml.jackson.databind.deser.SettableBeanProperty>) r0, (java.util.Map<java.lang.String, java.util.List<com.fasterxml.jackson.databind.PropertyName>>) r2, (java.util.Locale) r1)
            r4.k()
            com.fasterxml.jackson.databind.DeserializationConfig r1 = r14.a
            com.fasterxml.jackson.databind.MapperFeature r2 = com.fasterxml.jackson.databind.MapperFeature.DEFAULT_VIEW_INCLUSION
            boolean r1 = r1.q(r2)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 != 0) goto L_0x0043
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0043
            java.lang.Object r3 = r0.next()
            com.fasterxml.jackson.databind.deser.SettableBeanProperty r3 = (com.fasterxml.jackson.databind.deser.SettableBeanProperty) r3
            boolean r3 = r3.E()
            if (r3 == 0) goto L_0x002f
            r13 = r2
            goto L_0x0044
        L_0x0043:
            r13 = r1
        L_0x0044:
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r0 = r14.j
            if (r0 == 0) goto L_0x0055
            com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty r0 = new com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty
            com.fasterxml.jackson.databind.deser.impl.ObjectIdReader r1 = r14.j
            com.fasterxml.jackson.databind.PropertyMetadata r2 = com.fasterxml.jackson.databind.PropertyMetadata.c
            r0.<init>((com.fasterxml.jackson.databind.deser.impl.ObjectIdReader) r1, (com.fasterxml.jackson.databind.PropertyMetadata) r2)
            com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap r4 = r4.z(r0)
        L_0x0055:
            r8 = r4
            com.fasterxml.jackson.databind.deser.BeanDeserializer r0 = new com.fasterxml.jackson.databind.deser.BeanDeserializer
            i0.f.a.c.b r7 = r14.c
            java.util.HashMap<java.lang.String, com.fasterxml.jackson.databind.deser.SettableBeanProperty> r9 = r14.f
            java.util.HashSet<java.lang.String> r10 = r14.g
            boolean r11 = r14.l
            java.util.HashSet<java.lang.String> r12 = r14.h
            r5 = r0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.l.a.f():i0.f.a.c.d");
    }
}
