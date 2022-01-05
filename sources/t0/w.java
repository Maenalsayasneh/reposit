package t0;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import m0.n.b.i;
import q0.a0;
import q0.d0;
import q0.f;
import q0.f0;
import q0.w;
import t0.c;
import t0.e;
import t0.h;

/* compiled from: Retrofit */
public final class w {
    public final Map<Method, x<?>> a = new ConcurrentHashMap();
    public final f.a b;
    public final q0.w c;
    public final List<h.a> d;
    public final List<e.a> e;
    public final boolean f;

    /* compiled from: Retrofit */
    public class a implements InvocationHandler {
        public final s a = s.a;
        public final Object[] b = new Object[0];
        public final /* synthetic */ Class c;

        public a(Class cls) {
            this.c = cls;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.b;
            }
            if (this.a.b && method.isDefault()) {
                return this.a.b(method, this.c, obj, objArr);
            }
            return w.this.c(method).a(objArr);
        }
    }

    /* compiled from: Retrofit */
    public static final class b {
        public final s a;
        public f.a b;
        public q0.w c;
        public final List<h.a> d = new ArrayList();
        public final List<e.a> e = new ArrayList();

        public b() {
            s sVar = s.a;
            this.a = sVar;
        }

        public b a(h.a aVar) {
            List<h.a> list = this.d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            i.e(str, "$this$toHttpUrl");
            w.a aVar = new w.a();
            aVar.d((q0.w) null, str);
            q0.w b2 = aVar.b();
            List<String> list = b2.i;
            if ("".equals(list.get(list.size() - 1))) {
                this.c = b2;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + b2);
        }

        public w c() {
            List list;
            if (this.c != null) {
                f.a aVar = this.b;
                if (aVar == null) {
                    aVar = new a0();
                }
                f.a aVar2 = aVar;
                Executor a2 = this.a.a();
                ArrayList arrayList = new ArrayList(this.e);
                s sVar = this.a;
                i iVar = new i(a2);
                if (sVar.b) {
                    list = Arrays.asList(new e.a[]{g.a, iVar});
                } else {
                    list = Collections.singletonList(iVar);
                }
                arrayList.addAll(list);
                ArrayList arrayList2 = new ArrayList(this.d.size() + 1 + (this.a.b ? 1 : 0));
                arrayList2.add(new c());
                arrayList2.addAll(this.d);
                arrayList2.addAll(this.a.b ? Collections.singletonList(o.a) : Collections.emptyList());
                return new w(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), a2, false);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public b d(a0 a0Var) {
            Objects.requireNonNull(a0Var, "client == null");
            this.b = a0Var;
            return this;
        }
    }

    public w(f.a aVar, q0.w wVar, List<h.a> list, List<e.a> list2, Executor executor, boolean z) {
        this.b = aVar;
        this.c = wVar;
        this.d = list;
        this.e = list2;
        this.f = z;
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf((Object) null) + 1;
        int size = this.e.size();
        for (int i = indexOf; i < size; i++) {
            e<?, ?> a2 = this.e.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> T b(Class<T> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f) {
                s sVar = s.a;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!(sVar.b && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public x<?> c(Method method) {
        x<?> xVar;
        x<?> xVar2 = this.a.get(method);
        if (xVar2 != null) {
            return xVar2;
        }
        synchronized (this.a) {
            xVar = this.a.get(method);
            if (xVar == null) {
                xVar = x.b(this, method);
                this.a.put(method, xVar);
            }
        }
        return xVar;
    }

    public <T> h<T, d0> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf((Object) null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            h<?, d0> a2 = this.d.get(i).a(type, annotationArr, annotationArr2, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<f0, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf((Object) null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            h<f0, ?> b2 = this.d.get(i).b(type, annotationArr, this);
            if (b2 != null) {
                return b2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<T, String> f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            Objects.requireNonNull(this.d.get(i));
        }
        return c.d.a;
    }
}
