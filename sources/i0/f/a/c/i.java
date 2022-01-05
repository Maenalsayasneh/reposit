package i0.f.a.c;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.n.j;
import i0.f.a.c.r.d;
import i0.f.a.c.r.g;
import i0.f.a.c.r.h;
import i0.f.a.c.r.k.c;
import i0.f.a.c.r.k.e;
import i0.f.a.c.s.a;
import i0.f.a.c.t.f;
import i0.f.a.c.t.t;
import java.io.Closeable;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Map;
import java.util.Objects;

/* compiled from: SerializerProvider */
public abstract class i extends c {
    public static final g<Object> c = new FailingSerializer("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");
    public static final g<Object> d = new UnknownSerializer();
    public final h Y1;
    public transient ContextAttributes Z1;
    public g<Object> a2;
    public g<Object> b2;
    public g<Object> c2;
    public g<Object> d2;
    public final c e2;
    public DateFormat f2;
    public final boolean g2;
    public final SerializationConfig q;
    public final Class<?> x;
    public final i0.f.a.c.r.i y;

    public i() {
        this.a2 = d;
        this.c2 = NullSerializer.q;
        this.d2 = c;
        this.q = null;
        this.y = null;
        this.Y1 = new h();
        this.e2 = null;
        this.x = null;
        this.Z1 = null;
        this.g2 = true;
    }

    public g<Object> A(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        g<Object> a = this.e2.a(javaType);
        if (a == null && (a = this.Y1.a(javaType)) == null && (a = q(javaType)) == null) {
            return R(javaType.c);
        }
        return U(a, beanProperty);
    }

    public g<Object> C(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        g<Object> b = this.e2.b(cls);
        if (b == null && (b = this.Y1.b(cls)) == null && (b = this.Y1.a(this.q.d.d.b((a) null, cls, TypeFactory.q))) == null && (b = v(cls)) == null) {
            return R(cls);
        }
        return U(b, beanProperty);
    }

    public g<Object> E(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        g<Object> a = this.y.a(this, javaType, this.b2);
        if (a instanceof g) {
            ((g) a).b(this);
        }
        return U(a, beanProperty);
    }

    public abstract e F(Object obj, ObjectIdGenerator<?> objectIdGenerator);

    public g<Object> G(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        g<Object> a = this.e2.a(javaType);
        if (a == null && (a = this.Y1.a(javaType)) == null && (a = q(javaType)) == null) {
            return R(javaType.c);
        }
        return T(a, beanProperty);
    }

    public g<Object> H(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        g<Object> b = this.e2.b(cls);
        if (b == null && (b = this.Y1.b(cls)) == null && (b = this.Y1.a(this.q.d.d.b((a) null, cls, TypeFactory.q))) == null && (b = v(cls)) == null) {
            return R(cls);
        }
        return T(b, beanProperty);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i0.f.a.c.g<java.lang.Object> I(java.lang.Class<?> r7, boolean r8, com.fasterxml.jackson.databind.BeanProperty r9) throws com.fasterxml.jackson.databind.JsonMappingException {
        /*
            r6 = this;
            i0.f.a.c.r.k.c r9 = r6.e2
            i0.f.a.c.r.k.c$a[] r0 = r9.a
            java.lang.String r1 = r7.getName()
            int r1 = r1.hashCode()
            r2 = 1
            int r1 = r1 + r2
            int r9 = r9.b
            r9 = r9 & r1
            r9 = r0[r9]
            r0 = 0
            if (r9 != 0) goto L_0x0017
            goto L_0x003c
        L_0x0017:
            java.lang.Class<?> r1 = r9.c
            r3 = 0
            if (r1 != r7) goto L_0x0022
            boolean r1 = r9.e
            if (r1 == 0) goto L_0x0022
            r1 = r2
            goto L_0x0023
        L_0x0022:
            r1 = r3
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            i0.f.a.c.g<java.lang.Object> r9 = r9.a
            goto L_0x003d
        L_0x0028:
            i0.f.a.c.r.k.c$a r9 = r9.b
            if (r9 == 0) goto L_0x003c
            java.lang.Class<?> r1 = r9.c
            if (r1 != r7) goto L_0x0036
            boolean r1 = r9.e
            if (r1 == 0) goto L_0x0036
            r1 = r2
            goto L_0x0037
        L_0x0036:
            r1 = r3
        L_0x0037:
            if (r1 == 0) goto L_0x0028
            i0.f.a.c.g<java.lang.Object> r9 = r9.a
            goto L_0x003d
        L_0x003c:
            r9 = r0
        L_0x003d:
            if (r9 == 0) goto L_0x0040
            return r9
        L_0x0040:
            i0.f.a.c.r.h r9 = r6.Y1
            monitor-enter(r9)
            java.util.HashMap<i0.f.a.c.t.t, i0.f.a.c.g<java.lang.Object>> r1 = r9.a     // Catch:{ all -> 0x0093 }
            i0.f.a.c.t.t r3 = new i0.f.a.c.t.t     // Catch:{ all -> 0x0093 }
            r3.<init>((java.lang.Class<?>) r7, (boolean) r2)     // Catch:{ all -> 0x0093 }
            java.lang.Object r1 = r1.get(r3)     // Catch:{ all -> 0x0093 }
            i0.f.a.c.g r1 = (i0.f.a.c.g) r1     // Catch:{ all -> 0x0093 }
            monitor-exit(r9)     // Catch:{ all -> 0x0093 }
            if (r1 == 0) goto L_0x0054
            return r1
        L_0x0054:
            i0.f.a.c.g r9 = r6.N(r7, r0)
            i0.f.a.c.r.i r1 = r6.y
            com.fasterxml.jackson.databind.SerializationConfig r3 = r6.q
            com.fasterxml.jackson.databind.cfg.BaseSettings r4 = r3.d
            com.fasterxml.jackson.databind.type.TypeFactory r4 = r4.d
            com.fasterxml.jackson.databind.type.TypeBindings r5 = com.fasterxml.jackson.databind.type.TypeFactory.q
            com.fasterxml.jackson.databind.JavaType r4 = r4.b(r0, r7, r5)
            i0.f.a.c.p.e r1 = r1.b(r3, r4)
            if (r1 == 0) goto L_0x0076
            i0.f.a.c.p.e r1 = r1.a(r0)
            i0.f.a.c.r.k.d r3 = new i0.f.a.c.r.k.d
            r3.<init>(r1, r9)
            r9 = r3
        L_0x0076:
            if (r8 == 0) goto L_0x0092
            i0.f.a.c.r.h r8 = r6.Y1
            monitor-enter(r8)
            java.util.HashMap<i0.f.a.c.t.t, i0.f.a.c.g<java.lang.Object>> r1 = r8.a     // Catch:{ all -> 0x008f }
            i0.f.a.c.t.t r3 = new i0.f.a.c.t.t     // Catch:{ all -> 0x008f }
            r3.<init>((java.lang.Class<?>) r7, (boolean) r2)     // Catch:{ all -> 0x008f }
            java.lang.Object r7 = r1.put(r3, r9)     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x008d
            java.util.concurrent.atomic.AtomicReference<i0.f.a.c.r.k.c> r7 = r8.b     // Catch:{ all -> 0x008f }
            r7.set(r0)     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r8)     // Catch:{ all -> 0x008f }
            goto L_0x0092
        L_0x008f:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x008f }
            throw r7
        L_0x0092:
            return r9
        L_0x0093:
            r7 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0093 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f.a.c.i.I(java.lang.Class, boolean, com.fasterxml.jackson.databind.BeanProperty):i0.f.a.c.g");
    }

    public g<Object> J(JavaType javaType) throws JsonMappingException {
        g<Object> a = this.e2.a(javaType);
        if (a != null) {
            return a;
        }
        g<Object> a3 = this.Y1.a(javaType);
        if (a3 != null) {
            return a3;
        }
        g<Object> q2 = q(javaType);
        return q2 == null ? R(javaType.c) : q2;
    }

    public g<Object> M(JavaType javaType, BeanProperty beanProperty) throws JsonMappingException {
        if (javaType != null) {
            g<Object> a = this.e2.a(javaType);
            if (a == null && (a = this.Y1.a(javaType)) == null && (a = q(javaType)) == null) {
                return R(javaType.c);
            }
            return U(a, beanProperty);
        }
        b0("Null passed for `valueType` of `findValueSerializer()`", new Object[0]);
        throw null;
    }

    public g<Object> N(Class<?> cls, BeanProperty beanProperty) throws JsonMappingException {
        g<Object> b = this.e2.b(cls);
        if (b == null && (b = this.Y1.b(cls)) == null && (b = this.Y1.a(this.q.d.d.b((a) null, cls, TypeFactory.q))) == null && (b = v(cls)) == null) {
            return R(cls);
        }
        return U(b, beanProperty);
    }

    public final AnnotationIntrospector O() {
        return this.q.e();
    }

    public Object Q(Object obj) {
        Object obj2;
        ContextAttributes.Impl impl = (ContextAttributes.Impl) this.Z1;
        Map<Object, Object> map = impl.x;
        if (map == null || (obj2 = map.get(obj)) == null) {
            return impl.q.get(obj);
        }
        if (obj2 == ContextAttributes.Impl.d) {
            return null;
        }
        return obj2;
    }

    public g<Object> R(Class<?> cls) {
        if (cls == Object.class) {
            return this.a2;
        }
        return new UnknownSerializer(cls);
    }

    public g<?> T(g<?> gVar, BeanProperty beanProperty) throws JsonMappingException {
        return (gVar == null || !(gVar instanceof d)) ? gVar : ((d) gVar).a(this, beanProperty);
    }

    public g<?> U(g<?> gVar, BeanProperty beanProperty) throws JsonMappingException {
        return (gVar == null || !(gVar instanceof d)) ? gVar : ((d) gVar).a(this, beanProperty);
    }

    public abstract Object V(j jVar, Class<?> cls) throws JsonMappingException;

    public abstract boolean W(Object obj) throws JsonMappingException;

    public final boolean X(MapperFeature mapperFeature) {
        return mapperFeature.enabledIn(this.q.c);
    }

    public final boolean Y(SerializationFeature serializationFeature) {
        return this.q.E(serializationFeature);
    }

    public <T> T Z(b bVar, j jVar, String str, Object... objArr) throws JsonMappingException {
        String b = b(str, objArr);
        String str2 = "N/A";
        String c3 = jVar != null ? c(jVar.getName()) : str2;
        if (bVar != null) {
            str2 = f.E(bVar.a.c);
        }
        throw new InvalidDefinitionException(((DefaultSerializerProvider) this).j2, String.format("Invalid definition for property %s (of type %s): %s", new Object[]{c3, str2, b}), bVar, jVar);
    }

    public <T> T a0(b bVar, String str, Object... objArr) throws JsonMappingException {
        throw new InvalidDefinitionException(((DefaultSerializerProvider) this).j2, String.format("Invalid type definition for type %s: %s", new Object[]{f.E(bVar.a.c), b(str, objArr)}), bVar, (j) null);
    }

    public void b0(String str, Object... objArr) throws JsonMappingException {
        throw new JsonMappingException((Closeable) ((DefaultSerializerProvider) this).j2, b(str, objArr), (Throwable) null);
    }

    public abstract g<Object> c0(i0.f.a.c.n.a aVar, Object obj) throws JsonMappingException;

    public MapperConfig h() {
        return this.q;
    }

    public final TypeFactory i() {
        return this.q.d.d;
    }

    public JsonMappingException k(JavaType javaType, String str, String str2) {
        return new InvalidTypeIdException((JsonParser) null, a(String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, f.t(javaType)}), str2), javaType, str);
    }

    public <T> T n(JavaType javaType, String str) throws JsonMappingException {
        throw new InvalidDefinitionException(((DefaultSerializerProvider) this).j2, str, javaType);
    }

    public g<Object> q(JavaType javaType) throws JsonMappingException {
        try {
            g<Object> w = w(javaType);
            if (w != null) {
                h hVar = this.Y1;
                synchronized (hVar) {
                    if (hVar.a.put(new t(javaType, false), w) == null) {
                        hVar.b.set((Object) null);
                    }
                    if (w instanceof g) {
                        ((g) w).b(this);
                    }
                }
            }
            return w;
        } catch (IllegalArgumentException e) {
            throw new JsonMappingException((Closeable) ((DefaultSerializerProvider) this).j2, b(f.j(e), new Object[0]), (Throwable) e);
        }
    }

    public g<Object> v(Class<?> cls) throws JsonMappingException {
        JavaType b = this.q.d.d.b((a) null, cls, TypeFactory.q);
        try {
            g<Object> w = w(b);
            if (w != null) {
                h hVar = this.Y1;
                synchronized (hVar) {
                    g<Object> put = hVar.a.put(new t(cls, false), w);
                    g<Object> put2 = hVar.a.put(new t(b, false), w);
                    if (put == null || put2 == null) {
                        hVar.b.set((Object) null);
                    }
                    if (w instanceof g) {
                        ((g) w).b(this);
                    }
                }
            }
            return w;
        } catch (IllegalArgumentException e) {
            throw new JsonMappingException((Closeable) ((DefaultSerializerProvider) this).j2, b(f.j(e), new Object[0]), (Throwable) e);
        }
    }

    public g<Object> w(JavaType javaType) throws JsonMappingException {
        JavaType javaType2;
        BeanSerializerFactory beanSerializerFactory = (BeanSerializerFactory) this.y;
        Objects.requireNonNull(beanSerializerFactory);
        SerializationConfig serializationConfig = this.q;
        b C = serializationConfig.C(javaType);
        g e = beanSerializerFactory.e(this, ((i0.f.a.c.n.i) C).f);
        if (e != null) {
            return e;
        }
        AnnotationIntrospector e3 = serializationConfig.e();
        boolean z = false;
        i0.f.a.c.t.g<Object, Object> gVar = null;
        if (e3 == null) {
            javaType2 = javaType;
        } else {
            try {
                javaType2 = e3.C0(serializationConfig, ((i0.f.a.c.n.i) C).f, javaType);
            } catch (JsonMappingException e4) {
                a0(C, e4.getMessage(), new Object[0]);
                throw null;
            }
        }
        if (javaType2 != javaType) {
            if (!javaType2.A(javaType.c)) {
                C = serializationConfig.C(javaType2);
            }
            z = true;
        }
        i0.f.a.c.n.i iVar = (i0.f.a.c.n.i) C;
        AnnotationIntrospector annotationIntrospector = iVar.e;
        if (annotationIntrospector != null) {
            gVar = iVar.g(annotationIntrospector.d0(iVar.f));
        }
        if (gVar == null) {
            return beanSerializerFactory.h(this, javaType2, C, z);
        }
        JavaType c3 = gVar.c(i());
        if (!c3.A(javaType2.c)) {
            C = serializationConfig.C(c3);
            e = beanSerializerFactory.e(this, ((i0.f.a.c.n.i) C).f);
        }
        if (e == null && !c3.N()) {
            e = beanSerializerFactory.h(this, c3, C, true);
        }
        return new StdDelegatingSerializer(gVar, c3, e);
    }

    public final DateFormat x() {
        DateFormat dateFormat = this.f2;
        if (dateFormat != null) {
            return dateFormat;
        }
        DateFormat dateFormat2 = (DateFormat) this.q.d.b2.clone();
        this.f2 = dateFormat2;
        return dateFormat2;
    }

    public JavaType y(JavaType javaType, Class<?> cls) throws IllegalArgumentException {
        if (javaType.c == cls) {
            return javaType;
        }
        return this.q.d.d.l(javaType, cls, true);
    }

    public final void z(JsonGenerator jsonGenerator) throws IOException {
        if (this.g2) {
            jsonGenerator.c0();
        } else {
            this.c2.f(null, jsonGenerator, this);
        }
    }

    public i(i iVar, SerializationConfig serializationConfig, i0.f.a.c.r.i iVar2) {
        this.a2 = d;
        this.c2 = NullSerializer.q;
        g<Object> gVar = c;
        this.d2 = gVar;
        this.y = iVar2;
        this.q = serializationConfig;
        h hVar = iVar.Y1;
        this.Y1 = hVar;
        this.a2 = iVar.a2;
        this.b2 = iVar.b2;
        g<Object> gVar2 = iVar.c2;
        this.c2 = gVar2;
        this.d2 = iVar.d2;
        this.g2 = gVar2 == gVar;
        this.x = serializationConfig.b2;
        this.Z1 = serializationConfig.c2;
        c cVar = hVar.b.get();
        if (cVar == null) {
            synchronized (hVar) {
                cVar = hVar.b.get();
                if (cVar == null) {
                    c cVar2 = new c(hVar.a);
                    hVar.b.set(cVar2);
                    cVar = cVar2;
                }
            }
        }
        this.e2 = cVar;
    }
}
