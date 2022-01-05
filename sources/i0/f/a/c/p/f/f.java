package i0.f.a.c.p.f;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.c;
import i0.f.a.c.s.a;
import i0.f.a.c.t.f;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Properties;

/* compiled from: ClassNameIdResolver */
public class f extends j {
    public final PolymorphicTypeValidator c;

    public f(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory);
        this.c = polymorphicTypeValidator;
    }

    public String a(Object obj) {
        return g(obj, obj.getClass(), this.a);
    }

    public String b() {
        return "class name used as type id";
    }

    public JavaType d(c cVar, String str) throws IOException {
        return h(str, cVar);
    }

    public String e(Object obj, Class<?> cls) {
        return g(obj, cls, this.a);
    }

    public String g(Object obj, Class<?> cls, TypeFactory typeFactory) {
        Class cls2;
        JavaType javaType;
        JavaType javaType2;
        Class cls3;
        boolean w = i0.f.a.c.t.f.w(cls);
        Class<? super Object> cls4 = cls;
        if (w) {
            boolean isEnum = cls.isEnum();
            cls4 = cls;
            if (!isEnum) {
                cls4 = cls.getSuperclass();
            }
        }
        String name = cls4.getName();
        if (!name.startsWith("java.util.")) {
            return (name.indexOf(36) < 0 || i0.f.a.c.t.f.r(cls4) == null || i0.f.a.c.t.f.r(this.b.c) != null) ? name : this.b.c.getName();
        }
        if (obj instanceof EnumSet) {
            EnumSet enumSet = (EnumSet) obj;
            if (!enumSet.isEmpty()) {
                cls3 = ((Enum) enumSet.iterator().next()).getDeclaringClass();
            } else {
                Field field = f.b.a.b;
                if (field != null) {
                    try {
                        cls3 = (Class) field.get(enumSet);
                    } catch (Exception e) {
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
                }
            }
            return typeFactory.g(EnumSet.class, typeFactory.c((a) null, cls3, TypeFactory.q)).f0();
        } else if (!(obj instanceof EnumMap)) {
            return name;
        } else {
            EnumMap enumMap = (EnumMap) obj;
            if (!enumMap.isEmpty()) {
                cls2 = ((Enum) enumMap.keySet().iterator().next()).getDeclaringClass();
            } else {
                Field field2 = f.b.a.c;
                if (field2 != null) {
                    try {
                        cls2 = (Class) field2.get(enumMap);
                    } catch (Exception e2) {
                        throw new IllegalArgumentException(e2);
                    }
                } else {
                    throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
                }
            }
            Class<Object> cls5 = Object.class;
            Class<EnumMap> cls6 = EnumMap.class;
            Objects.requireNonNull(typeFactory);
            if (cls6 == Properties.class) {
                javaType2 = TypeFactory.i2;
                javaType = javaType2;
            } else {
                TypeBindings typeBindings = TypeFactory.q;
                javaType2 = typeFactory.c((a) null, cls2, typeBindings);
                javaType = typeFactory.c((a) null, cls5, typeBindings);
            }
            return typeFactory.k(cls6, javaType2, javaType).f0();
        }
    }

    public JavaType h(String str, c cVar) throws IOException {
        JavaType javaType;
        JavaType javaType2 = this.b;
        PolymorphicTypeValidator polymorphicTypeValidator = this.c;
        Objects.requireNonNull(cVar);
        int indexOf = str.indexOf(60);
        if (indexOf > 0) {
            MapperConfig<?> h = cVar.h();
            PolymorphicTypeValidator.Validity b = polymorphicTypeValidator.b(h, javaType2, str.substring(0, indexOf));
            if (b != PolymorphicTypeValidator.Validity.DENIED) {
                javaType = cVar.i().h(str);
                if (javaType.T(javaType2.c)) {
                    PolymorphicTypeValidator.Validity validity = PolymorphicTypeValidator.Validity.ALLOWED;
                    if (!(b == validity || polymorphicTypeValidator.c(h, javaType2, javaType) == validity)) {
                        cVar.d(javaType2, str, polymorphicTypeValidator);
                        throw null;
                    }
                } else {
                    throw cVar.k(javaType2, str, "Not a subtype");
                }
            } else {
                cVar.e(javaType2, str, polymorphicTypeValidator);
                throw null;
            }
        } else {
            MapperConfig<?> h2 = cVar.h();
            PolymorphicTypeValidator.Validity b2 = polymorphicTypeValidator.b(h2, javaType2, str);
            if (b2 != PolymorphicTypeValidator.Validity.DENIED) {
                try {
                    Class<?> n = cVar.i().n(str);
                    if (javaType2.U(n)) {
                        javaType = h2.d.d.l(javaType2, n, false);
                        if (b2 == PolymorphicTypeValidator.Validity.INDETERMINATE && polymorphicTypeValidator.c(h2, javaType2, javaType) != PolymorphicTypeValidator.Validity.ALLOWED) {
                            cVar.d(javaType2, str, polymorphicTypeValidator);
                            throw null;
                        }
                    } else {
                        throw cVar.k(javaType2, str, "Not a subtype");
                    }
                } catch (ClassNotFoundException unused) {
                    javaType = null;
                } catch (Exception e) {
                    throw cVar.k(javaType2, str, String.format("problem: (%s) %s", new Object[]{e.getClass().getName(), i0.f.a.c.t.f.j(e)}));
                }
            } else {
                cVar.e(javaType2, str, polymorphicTypeValidator);
                throw null;
            }
        }
        if (javaType != null || !(cVar instanceof DeserializationContext)) {
            return javaType;
        }
        ((DeserializationContext) cVar).W(this.b, str, this, "no such class found");
        return null;
    }
}
