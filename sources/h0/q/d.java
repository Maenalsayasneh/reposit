package h0.q;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: ClassesInfoCache */
public final class d {
    public static d a = new d();
    public final Map<Class<?>, a> b = new HashMap();
    public final Map<Class<?>, Boolean> c = new HashMap();

    /* compiled from: ClassesInfoCache */
    public static class a {
        public final Map<Lifecycle.Event, List<b>> a = new HashMap();
        public final Map<b, Lifecycle.Event> b;

        public a(Map<b, Lifecycle.Event> map) {
            this.b = map;
            for (Map.Entry next : map.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) next.getValue();
                List list = this.a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(event, list);
                }
                list.add(next.getKey());
            }
        }

        public static void a(List<b> list, p pVar, Lifecycle.Event event, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i = bVar.a;
                        if (i == 0) {
                            bVar.b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.b.invoke(obj, new Object[]{pVar});
                        } else if (i == 2) {
                            bVar.b.invoke(obj, new Object[]{pVar, event});
                        }
                        size--;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    }
                }
            }
        }
    }

    /* compiled from: ClassesInfoCache */
    public static final class b {
        public final int a;
        public final Method b;

        public b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a != bVar.a || !this.b.getName().equals(bVar.b.getName())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i;
        a b2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.b);
        }
        for (Class b3 : cls.getInterfaces()) {
            for (Map.Entry next : b(b3).b.entrySet()) {
                c(hashMap, (b) next.getKey(), (Lifecycle.Event) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            a0 a0Var = (a0) method.getAnnotation(a0.class);
            if (a0Var != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(p.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Lifecycle.Event value = a0Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Lifecycle.Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == Lifecycle.Event.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        a aVar = new a(hashMap);
        this.b.put(cls, aVar);
        this.c.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    public a b(Class<?> cls) {
        a aVar = this.b.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return a(cls, (Method[]) null);
    }

    public final void c(Map<b, Lifecycle.Event> map, b bVar, Lifecycle.Event event, Class<?> cls) {
        Lifecycle.Event event2 = map.get(bVar);
        if (event2 != null && event != event2) {
            Method method = bVar.b;
            StringBuilder P0 = i0.d.a.a.a.P0("Method ");
            P0.append(method.getName());
            P0.append(" in ");
            P0.append(cls.getName());
            P0.append(" already declared with different @OnLifecycleEvent value: previous value ");
            P0.append(event2);
            P0.append(", new value ");
            P0.append(event);
            throw new IllegalArgumentException(P0.toString());
        } else if (event2 == null) {
            map.put(bVar, event);
        }
    }
}
