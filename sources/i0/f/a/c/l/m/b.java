package i0.f.a.c.l.m;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import i0.f.a.c.t.f;
import java.lang.reflect.Member;
import java.util.HashMap;

/* compiled from: CreatorCollector */
public class b {
    public static final String[] a = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    public final i0.f.a.c.b b;
    public final boolean c;
    public final boolean d;
    public final AnnotatedWithParams[] e = new AnnotatedWithParams[11];
    public int f = 0;
    public boolean g = false;
    public SettableBeanProperty[] h;
    public SettableBeanProperty[] i;
    public SettableBeanProperty[] j;

    public b(i0.f.a.c.b bVar, MapperConfig<?> mapperConfig) {
        this.b = bVar;
        this.c = mapperConfig.b();
        this.d = mapperConfig.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final JavaType a(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (!this.g || annotatedWithParams == null) {
            return null;
        }
        int i2 = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (settableBeanPropertyArr[i3] == null) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
        DeserializationConfig deserializationConfig = deserializationContext.q;
        JavaType y = annotatedWithParams.y(i2);
        AnnotationIntrospector e2 = deserializationConfig.e();
        if (e2 == null) {
            return y;
        }
        AnnotatedParameter w = annotatedWithParams.w(i2);
        Object k = e2.k(w);
        if (k != null) {
            return y.c0(deserializationContext.v(w, k));
        }
        return e2.B0(deserializationConfig, w, y);
    }

    public boolean b(AnnotatedWithParams annotatedWithParams) {
        return f.w(annotatedWithParams.h()) && "valueOf".equals(annotatedWithParams.d());
    }

    public void c(int i2, boolean z, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        Object[] objArr = new Object[4];
        objArr[0] = a[i2];
        objArr[1] = z ? "explicitly marked" : "implicitly discovered";
        objArr[2] = annotatedWithParams;
        objArr[3] = annotatedWithParams2;
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", objArr));
    }

    public void d(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr, int i2) {
        if (annotatedWithParams.y(i2).E()) {
            if (h(annotatedWithParams, 10, z)) {
                this.i = settableBeanPropertyArr;
            }
        } else if (h(annotatedWithParams, 8, z)) {
            this.h = settableBeanPropertyArr;
        }
    }

    public void e(AnnotatedWithParams annotatedWithParams, boolean z, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (h(annotatedWithParams, 9, z)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap hashMap = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    String str = settableBeanPropertyArr[i2].x.q;
                    if ((!str.isEmpty() || settableBeanPropertyArr[i2].v() == null) && (num = (Integer) hashMap.put(str, Integer.valueOf(i2))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{str, num, Integer.valueOf(i2), f.E(this.b.a.c)}));
                    }
                }
            }
            this.j = settableBeanPropertyArr;
        }
    }

    public ValueInstantiator f(DeserializationContext deserializationContext) throws JsonMappingException {
        JavaType a2 = a(deserializationContext, this.e[8], this.h);
        JavaType a3 = a(deserializationContext, this.e[10], this.i);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(this.b.a);
        AnnotatedWithParams[] annotatedWithParamsArr = this.e;
        AnnotatedWithParams annotatedWithParams = annotatedWithParamsArr[0];
        AnnotatedWithParams annotatedWithParams2 = annotatedWithParamsArr[8];
        SettableBeanProperty[] settableBeanPropertyArr = this.h;
        AnnotatedWithParams annotatedWithParams3 = annotatedWithParamsArr[9];
        SettableBeanProperty[] settableBeanPropertyArr2 = this.j;
        stdValueInstantiator.q = annotatedWithParams;
        stdValueInstantiator.Z1 = annotatedWithParams2;
        stdValueInstantiator.Y1 = a2;
        stdValueInstantiator.a2 = settableBeanPropertyArr;
        stdValueInstantiator.x = annotatedWithParams3;
        stdValueInstantiator.y = settableBeanPropertyArr2;
        AnnotatedWithParams annotatedWithParams4 = annotatedWithParamsArr[10];
        SettableBeanProperty[] settableBeanPropertyArr3 = this.i;
        stdValueInstantiator.c2 = annotatedWithParams4;
        stdValueInstantiator.b2 = a3;
        stdValueInstantiator.d2 = settableBeanPropertyArr3;
        stdValueInstantiator.e2 = annotatedWithParamsArr[1];
        stdValueInstantiator.f2 = annotatedWithParamsArr[2];
        stdValueInstantiator.g2 = annotatedWithParamsArr[3];
        stdValueInstantiator.h2 = annotatedWithParamsArr[4];
        stdValueInstantiator.i2 = annotatedWithParamsArr[5];
        stdValueInstantiator.j2 = annotatedWithParamsArr[6];
        stdValueInstantiator.k2 = annotatedWithParamsArr[7];
        return stdValueInstantiator;
    }

    public void g(AnnotatedWithParams annotatedWithParams) {
        AnnotatedWithParams[] annotatedWithParamsArr = this.e;
        if (this.c) {
            f.e((Member) annotatedWithParams.b(), this.d);
        }
        annotatedWithParamsArr[0] = annotatedWithParams;
    }

    public boolean h(AnnotatedWithParams annotatedWithParams, int i2, boolean z) {
        boolean z2;
        int i3 = 1 << i2;
        this.g = true;
        AnnotatedWithParams annotatedWithParams2 = this.e[i2];
        if (annotatedWithParams2 != null) {
            if ((this.f & i3) == 0) {
                z2 = !z;
            } else if (!z) {
                return false;
            } else {
                z2 = true;
            }
            if (z2 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> z3 = annotatedWithParams2.z(0);
                Class<?> z4 = annotatedWithParams.z(0);
                if (z3 == z4) {
                    if (b(annotatedWithParams)) {
                        return false;
                    }
                    if (!b(annotatedWithParams2)) {
                        c(i2, z, annotatedWithParams2, annotatedWithParams);
                        throw null;
                    }
                } else if (z4.isAssignableFrom(z3)) {
                    return false;
                } else {
                    if (!z3.isAssignableFrom(z4)) {
                        if (z3.isPrimitive() == z4.isPrimitive()) {
                            c(i2, z, annotatedWithParams2, annotatedWithParams);
                            throw null;
                        } else if (z3.isPrimitive()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (z) {
            this.f |= i3;
        }
        AnnotatedWithParams[] annotatedWithParamsArr = this.e;
        if (annotatedWithParams != null && this.c) {
            f.e((Member) annotatedWithParams.b(), this.d);
        }
        annotatedWithParamsArr[i2] = annotatedWithParams;
        return true;
    }
}
