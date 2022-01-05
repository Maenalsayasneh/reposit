package i0.h.a.b.g.h;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class i1 {
    public static final i1 a = new i1();
    public final l1 b = new n0();
    public final ConcurrentMap<Class<?>, j1<?>> c = new ConcurrentHashMap();

    public final <T> j1<T> a(Class<T> cls) {
        j1<T> j1Var;
        a1 a1Var;
        Class<?> cls2;
        Charset charset = b0.a;
        Objects.requireNonNull(cls, ChallengeRequestData.FIELD_MESSAGE_TYPE);
        j1<T> j1Var2 = (j1) this.c.get(cls);
        if (j1Var2 != null) {
            return j1Var2;
        }
        n0 n0Var = (n0) this.b;
        Objects.requireNonNull(n0Var);
        Class<z> cls3 = z.class;
        Class<?> cls4 = k1.a;
        if (cls3.isAssignableFrom(cls) || (cls2 = k1.a) == null || cls2.isAssignableFrom(cls)) {
            w0 b2 = n0Var.b.b(cls);
            if (b2.d()) {
                if (cls3.isAssignableFrom(cls)) {
                    x1<?, ?> x1Var = k1.d;
                    u<?> uVar = w.a;
                    a1Var = new a1(x1Var, w.a, b2.h());
                } else {
                    x1<?, ?> x1Var2 = k1.b;
                    u<?> uVar2 = w.b;
                    if (uVar2 != null) {
                        a1Var = new a1(x1Var2, uVar2, b2.h());
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                j1Var = a1Var;
            } else {
                boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                boolean z = false;
                if (isAssignableFrom) {
                    if (b2.a() == 1) {
                        z = true;
                    }
                    if (z) {
                        c1 c1Var = e1.b;
                        k0 k0Var = k0.b;
                        x1<?, ?> x1Var3 = k1.d;
                        u<?> uVar3 = w.a;
                        j1Var = b1.f(b2, c1Var, k0Var, x1Var3, w.a, t0.b);
                    } else {
                        j1Var = b1.f(b2, e1.b, k0.b, k1.d, (u) null, t0.b);
                    }
                } else {
                    if (b2.a() == 1) {
                        z = true;
                    }
                    if (z) {
                        c1 c1Var2 = e1.a;
                        k0 k0Var2 = k0.a;
                        x1<?, ?> x1Var4 = k1.b;
                        u<?> uVar4 = w.b;
                        if (uVar4 != null) {
                            j1Var = b1.f(b2, c1Var2, k0Var2, x1Var4, uVar4, t0.a);
                        } else {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                    } else {
                        j1Var = b1.f(b2, e1.a, k0.a, k1.c, (u) null, t0.a);
                    }
                }
            }
            j1<T> putIfAbsent = this.c.putIfAbsent(cls, j1Var);
            return putIfAbsent != null ? putIfAbsent : j1Var;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
    }

    public final <T> j1<T> b(T t) {
        return a(t.getClass());
    }
}
