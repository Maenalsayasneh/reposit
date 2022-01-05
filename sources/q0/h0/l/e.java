package q0.h0.l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import m0.n.b.i;
import okhttp3.Protocol;

/* compiled from: Jdk8WithJettyBootPlatform.kt */
public final class e extends h {
    public final Method d;
    public final Method e;
    public final Method f;
    public final Class<?> g;
    public final Class<?> h;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    public static final class a implements InvocationHandler {
        public boolean a;
        public String b;
        public final List<String> c;

        public a(List<String> list) {
            i.e(list, "protocols");
            this.c = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            i.e(obj, "proxy");
            i.e(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (i.a(name, "supports") && i.a(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!i.a(name, "unsupported") || !i.a(Void.TYPE, returnType)) {
                if (i.a(name, "protocols")) {
                    if (objArr.length == 0) {
                        return this.c;
                    }
                }
                if ((i.a(name, "selectProtocol") || i.a(name, "select")) && i.a(String.class, returnType) && objArr.length == 1 && (objArr[0] instanceof List)) {
                    Object obj2 = objArr[0];
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                    List list = (List) obj2;
                    int size = list.size();
                    if (size >= 0) {
                        int i = 0;
                        while (true) {
                            Object obj3 = list.get(i);
                            Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj3;
                            if (!this.c.contains(str)) {
                                if (i == size) {
                                    break;
                                }
                                i++;
                            } else {
                                this.b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = this.c.get(0);
                    this.b = str2;
                    return str2;
                } else if ((!i.a(name, "protocolSelected") && !i.a(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                } else {
                    Object obj4 = objArr[0];
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.b = (String) obj4;
                    return null;
                }
            } else {
                this.a = true;
                return null;
            }
        }
    }

    public e(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        i.e(method, "putMethod");
        i.e(method2, "getMethod");
        i.e(method3, "removeMethod");
        i.e(cls, "clientProviderClass");
        i.e(cls2, "serverProviderClass");
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    public void a(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            this.f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    public void d(SSLSocket sSLSocket, String str, List<? extends Protocol> list) {
        i.e(sSLSocket, "sslSocket");
        i.e(list, "protocols");
        List<String> a2 = h.c.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.g, this.h}, new a(a2));
            this.d.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    public String f(SSLSocket sSLSocket) {
        i.e(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.e.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                a aVar = (a) invocationHandler;
                boolean z = aVar.a;
                if (!z && aVar.b == null) {
                    h.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return aVar.b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
