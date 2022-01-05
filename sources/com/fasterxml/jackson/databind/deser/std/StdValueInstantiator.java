package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import i0.f.a.c.j.a;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.BigInteger;

@a
public class StdValueInstantiator extends ValueInstantiator implements Serializable {
    public JavaType Y1;
    public AnnotatedWithParams Z1;
    public SettableBeanProperty[] a2;
    public JavaType b2;
    public final String c;
    public AnnotatedWithParams c2;
    public final Class<?> d;
    public SettableBeanProperty[] d2;
    public AnnotatedWithParams e2;
    public AnnotatedWithParams f2;
    public AnnotatedWithParams g2;
    public AnnotatedWithParams h2;
    public AnnotatedWithParams i2;
    public AnnotatedWithParams j2;
    public AnnotatedWithParams k2;
    public AnnotatedWithParams q;
    public AnnotatedWithParams x;
    public SettableBeanProperty[] y;

    public StdValueInstantiator(JavaType javaType) {
        String str;
        Class cls;
        if (javaType == null) {
            str = "UNKNOWN TYPE";
        } else {
            str = javaType.toString();
        }
        this.c = str;
        if (javaType == null) {
            cls = Object.class;
        } else {
            cls = javaType.c;
        }
        this.d = cls;
    }

    public Object A(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.c2;
        if (annotatedWithParams != null || this.Z1 == null) {
            return O(annotatedWithParams, this.d2, deserializationContext, obj);
        }
        return E(deserializationContext, obj);
    }

    public Object C(DeserializationContext deserializationContext) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.q;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.p();
            } catch (Exception e) {
                deserializationContext.N(this.d, (Object) null, Q(deserializationContext, e));
                throw null;
            }
        } else {
            super.C(deserializationContext);
            throw null;
        }
    }

    public Object E(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedWithParams annotatedWithParams;
        AnnotatedWithParams annotatedWithParams2 = this.Z1;
        if (annotatedWithParams2 != null || (annotatedWithParams = this.c2) == null) {
            return O(annotatedWithParams2, this.a2, deserializationContext, obj);
        }
        return O(annotatedWithParams, this.d2, deserializationContext, obj);
    }

    public AnnotatedWithParams F() {
        return this.c2;
    }

    public JavaType G(DeserializationConfig deserializationConfig) {
        return this.b2;
    }

    public AnnotatedWithParams H() {
        return this.q;
    }

    public AnnotatedWithParams I() {
        return this.Z1;
    }

    public JavaType J(DeserializationConfig deserializationConfig) {
        return this.Y1;
    }

    public SettableBeanProperty[] M(DeserializationConfig deserializationConfig) {
        return this.y;
    }

    public Class<?> N() {
        return this.d;
    }

    public final Object O(AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (annotatedWithParams == null) {
            StringBuilder P0 = i0.d.a.a.a.P0("No delegate constructor for ");
            P0.append(this.c);
            throw new IllegalStateException(P0.toString());
        } else if (settableBeanPropertyArr == null) {
            try {
                return annotatedWithParams.v(obj);
            } catch (Throwable th) {
                throw Q(deserializationContext, th);
            }
        } else {
            int length = settableBeanPropertyArr.length;
            Object[] objArr = new Object[length];
            int i = 0;
            while (i < length) {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i];
                if (settableBeanProperty == null) {
                    objArr[i] = obj;
                    i++;
                } else {
                    deserializationContext.z(settableBeanProperty.v(), settableBeanProperty, (Object) null);
                    throw null;
                }
            }
            return annotatedWithParams.q(objArr);
        }
    }

    public JsonMappingException Q(DeserializationContext deserializationContext, Throwable th) {
        Throwable cause;
        if (((th instanceof ExceptionInInitializerError) || (th instanceof InvocationTargetException)) && (cause = th.getCause()) != null) {
            th = cause;
        }
        if (th instanceof JsonMappingException) {
            return (JsonMappingException) th;
        }
        return deserializationContext.b0(this.d, th);
    }

    public boolean a() {
        return this.j2 != null;
    }

    public boolean b() {
        return this.h2 != null;
    }

    public boolean c() {
        return this.k2 != null;
    }

    public boolean d() {
        return this.i2 != null;
    }

    public boolean e() {
        return this.f2 != null;
    }

    public boolean f() {
        return this.g2 != null;
    }

    public boolean g() {
        return this.x != null;
    }

    public boolean h() {
        return this.e2 != null;
    }

    public boolean i() {
        return this.b2 != null;
    }

    public boolean k() {
        return this.q != null;
    }

    public boolean l() {
        return this.Y1 != null;
    }

    public boolean m() {
        return k() || l() || i() || g() || h() || e() || f() || d() || c();
    }

    public Object n(DeserializationContext deserializationContext, BigDecimal bigDecimal) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.j2;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.v(bigDecimal);
            } catch (Throwable th) {
                deserializationContext.N(this.j2.h(), bigDecimal, Q(deserializationContext, th));
                throw null;
            }
        } else {
            if (this.i2 != null) {
                double doubleValue = bigDecimal.doubleValue();
                Double valueOf = Double.isInfinite(doubleValue) ? null : Double.valueOf(doubleValue);
                if (valueOf != null) {
                    try {
                        return this.i2.v(valueOf);
                    } catch (Throwable th2) {
                        deserializationContext.N(this.i2.h(), valueOf, Q(deserializationContext, th2));
                        throw null;
                    }
                }
            }
            super.n(deserializationContext, bigDecimal);
            throw null;
        }
    }

    public Object p(DeserializationContext deserializationContext, BigInteger bigInteger) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.h2;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.v(bigInteger);
            } catch (Throwable th) {
                deserializationContext.N(this.h2.h(), bigInteger, Q(deserializationContext, th));
                throw null;
            }
        } else {
            super.p(deserializationContext, bigInteger);
            throw null;
        }
    }

    public Object q(DeserializationContext deserializationContext, boolean z) throws IOException {
        if (this.k2 != null) {
            Boolean valueOf = Boolean.valueOf(z);
            try {
                return this.k2.v(valueOf);
            } catch (Throwable th) {
                deserializationContext.N(this.k2.h(), valueOf, Q(deserializationContext, th));
                throw null;
            }
        } else {
            super.q(deserializationContext, z);
            throw null;
        }
    }

    public Object v(DeserializationContext deserializationContext, double d3) throws IOException {
        if (this.i2 != null) {
            Double valueOf = Double.valueOf(d3);
            try {
                return this.i2.v(valueOf);
            } catch (Throwable th) {
                deserializationContext.N(this.i2.h(), valueOf, Q(deserializationContext, th));
                throw null;
            }
        } else if (this.j2 != null) {
            BigDecimal valueOf2 = BigDecimal.valueOf(d3);
            try {
                return this.j2.v(valueOf2);
            } catch (Throwable th2) {
                deserializationContext.N(this.j2.h(), valueOf2, Q(deserializationContext, th2));
                throw null;
            }
        } else {
            super.v(deserializationContext, d3);
            throw null;
        }
    }

    public Object w(DeserializationContext deserializationContext, int i) throws IOException {
        if (this.f2 != null) {
            Integer valueOf = Integer.valueOf(i);
            try {
                return this.f2.v(valueOf);
            } catch (Throwable th) {
                deserializationContext.N(this.f2.h(), valueOf, Q(deserializationContext, th));
                throw null;
            }
        } else if (this.g2 != null) {
            Long valueOf2 = Long.valueOf((long) i);
            try {
                return this.g2.v(valueOf2);
            } catch (Throwable th2) {
                deserializationContext.N(this.g2.h(), valueOf2, Q(deserializationContext, th2));
                throw null;
            }
        } else if (this.h2 != null) {
            BigInteger valueOf3 = BigInteger.valueOf((long) i);
            try {
                return this.h2.v(valueOf3);
            } catch (Throwable th3) {
                deserializationContext.N(this.h2.h(), valueOf3, Q(deserializationContext, th3));
                throw null;
            }
        } else {
            super.w(deserializationContext, i);
            throw null;
        }
    }

    public Object x(DeserializationContext deserializationContext, long j) throws IOException {
        if (this.g2 != null) {
            Long valueOf = Long.valueOf(j);
            try {
                return this.g2.v(valueOf);
            } catch (Throwable th) {
                deserializationContext.N(this.g2.h(), valueOf, Q(deserializationContext, th));
                throw null;
            }
        } else if (this.h2 != null) {
            BigInteger valueOf2 = BigInteger.valueOf(j);
            try {
                return this.h2.v(valueOf2);
            } catch (Throwable th2) {
                deserializationContext.N(this.h2.h(), valueOf2, Q(deserializationContext, th2));
                throw null;
            }
        } else {
            super.x(deserializationContext, j);
            throw null;
        }
    }

    public Object y(DeserializationContext deserializationContext, Object[] objArr) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.x;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.q(objArr);
            } catch (Exception e) {
                deserializationContext.N(this.d, objArr, Q(deserializationContext, e));
                throw null;
            }
        } else {
            super.y(deserializationContext, objArr);
            throw null;
        }
    }

    public Object z(DeserializationContext deserializationContext, String str) throws IOException {
        AnnotatedWithParams annotatedWithParams = this.e2;
        if (annotatedWithParams != null) {
            try {
                return annotatedWithParams.v(str);
            } catch (Throwable th) {
                deserializationContext.N(this.e2.h(), str, Q(deserializationContext, th));
                throw null;
            }
        } else {
            super.z(deserializationContext, str);
            throw null;
        }
    }
}
