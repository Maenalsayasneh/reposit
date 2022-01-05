package com.fasterxml.jackson.databind.introspect;

import i0.f.a.c.n.h;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class AnnotationCollector {
    public static final i0.f.a.c.t.a a = new NoAnnotations();
    public final Object b;

    public static class NoAnnotations implements i0.f.a.c.t.a, Serializable {
        public <A extends Annotation> A a(Class<A> cls) {
            return null;
        }

        public int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements i0.f.a.c.t.a, Serializable {
        public final Class<?> c;
        public final Annotation d;

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this.c = cls;
            this.d = annotation;
        }

        public <A extends Annotation> A a(Class<A> cls) {
            if (this.c == cls) {
                return this.d;
            }
            return null;
        }

        public int size() {
            return 1;
        }
    }

    public static class TwoAnnotations implements i0.f.a.c.t.a, Serializable {
        public final Class<?> c;
        public final Class<?> d;
        public final Annotation q;
        public final Annotation x;

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.c = cls;
            this.q = annotation;
            this.d = cls2;
            this.x = annotation2;
        }

        public <A extends Annotation> A a(Class<A> cls) {
            if (this.c == cls) {
                return this.q;
            }
            if (this.d == cls) {
                return this.x;
            }
            return null;
        }

        public int size() {
            return 2;
        }
    }

    public static class a extends AnnotationCollector {
        public static final a c = new a((Object) null);

        public a(Object obj) {
            super((Object) null);
        }

        public AnnotationCollector a(Annotation annotation) {
            return new c(this.b, annotation.annotationType(), annotation);
        }

        public h b() {
            return new h();
        }

        public i0.f.a.c.t.a c() {
            return AnnotationCollector.a;
        }

        public boolean d(Annotation annotation) {
            return false;
        }
    }

    public static class b extends AnnotationCollector {
        public final HashMap<Class<?>, Annotation> c;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> hashMap = new HashMap<>();
            this.c = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        public AnnotationCollector a(Annotation annotation) {
            this.c.put(annotation.annotationType(), annotation);
            return this;
        }

        public h b() {
            h hVar = new h();
            for (Annotation next : this.c.values()) {
                if (hVar.c == null) {
                    hVar.c = new HashMap<>();
                }
                Annotation put = hVar.c.put(next.annotationType(), next);
                if (put != null) {
                    boolean equals = put.equals(next);
                }
            }
            return hVar;
        }

        public i0.f.a.c.t.a c() {
            if (this.c.size() != 2) {
                return new h(this.c);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.c.entrySet().iterator();
            Map.Entry next = it.next();
            Map.Entry next2 = it.next();
            return new TwoAnnotations((Class) next.getKey(), (Annotation) next.getValue(), (Class) next2.getKey(), (Annotation) next2.getValue());
        }

        public boolean d(Annotation annotation) {
            return this.c.containsKey(annotation.annotationType());
        }
    }

    public static class c extends AnnotationCollector {
        public Class<?> c;
        public Annotation d;

        public c(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.c = cls;
            this.d = annotation;
        }

        public AnnotationCollector a(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<?> cls = this.c;
            if (cls != annotationType) {
                return new b(this.b, cls, this.d, annotationType, annotation);
            }
            this.d = annotation;
            return this;
        }

        public h b() {
            Class<?> cls = this.c;
            Annotation annotation = this.d;
            HashMap hashMap = new HashMap(4);
            hashMap.put(cls, annotation);
            return new h(hashMap);
        }

        public i0.f.a.c.t.a c() {
            return new OneAnnotation(this.c, this.d);
        }

        public boolean d(Annotation annotation) {
            return annotation.annotationType() == this.c;
        }
    }

    public AnnotationCollector(Object obj) {
        this.b = obj;
    }

    public abstract AnnotationCollector a(Annotation annotation);

    public abstract h b();

    public abstract i0.f.a.c.t.a c();

    public abstract boolean d(Annotation annotation);
}
