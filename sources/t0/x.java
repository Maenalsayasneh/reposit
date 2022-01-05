package t0;

import com.instabug.library.networkv2.request.Header;
import com.instabug.library.networkv2.request.RequestMethod;
import i0.d.a.a.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import q0.e0;
import q0.f;
import q0.v;
import q0.w;
import q0.y;
import q0.z;
import t0.a0;
import t0.c;
import t0.c0.b;
import t0.c0.d;
import t0.c0.e;
import t0.c0.f;
import t0.c0.g;
import t0.c0.h;
import t0.c0.i;
import t0.c0.j;
import t0.c0.k;
import t0.c0.l;
import t0.c0.m;
import t0.c0.n;
import t0.c0.o;
import t0.c0.p;
import t0.c0.q;
import t0.c0.s;
import t0.c0.t;
import t0.j;
import t0.r;
import t0.u;

/* compiled from: ServiceMethod */
public abstract class x<T> {
    public static <T> x<T> b(w wVar, Method method) {
        Type type;
        boolean z;
        String str;
        int i;
        int i2;
        r<?> rVar;
        Type type2;
        String str2;
        int i3;
        Type type3;
        r<?> rVar2;
        r<?> rVar3;
        r<?> rVar4;
        r<?> cVar;
        String str3;
        u.a aVar = new u.a(wVar, method);
        Annotation[] annotationArr = aVar.e;
        int length = annotationArr.length;
        int i4 = 0;
        int i5 = 0;
        loop0:
        while (true) {
            String str4 = "HEAD";
            int i6 = 1;
            if (i5 < length) {
                Annotation annotation = annotationArr[i5];
                if (annotation instanceof b) {
                    aVar.b(RequestMethod.DELETE, ((b) annotation).value(), false);
                } else if (annotation instanceof f) {
                    aVar.b(RequestMethod.GET, ((f) annotation).value(), false);
                } else if (annotation instanceof g) {
                    aVar.b(str4, ((g) annotation).value(), false);
                } else if (annotation instanceof n) {
                    aVar.b("PATCH", ((n) annotation).value(), true);
                } else if (annotation instanceof o) {
                    aVar.b(RequestMethod.POST, ((o) annotation).value(), true);
                } else if (annotation instanceof p) {
                    aVar.b(RequestMethod.PUT, ((p) annotation).value(), true);
                } else if (annotation instanceof m) {
                    aVar.b("OPTIONS", ((m) annotation).value(), false);
                } else if (annotation instanceof h) {
                    h hVar = (h) annotation;
                    aVar.b(hVar.method(), hVar.path(), hVar.hasBody());
                } else if (annotation instanceof k) {
                    String[] value = ((k) annotation).value();
                    if (value.length != 0) {
                        v.a aVar2 = new v.a();
                        int length2 = value.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            str3 = value[i7];
                            int indexOf = str3.indexOf(58);
                            if (indexOf == -1 || indexOf == 0 || indexOf == str3.length() - 1) {
                            } else {
                                String substring = str3.substring(0, indexOf);
                                String trim = str3.substring(indexOf + 1).trim();
                                if (Header.CONTENT_TYPE.equalsIgnoreCase(substring)) {
                                    try {
                                        aVar.v = y.b(trim);
                                    } catch (IllegalArgumentException e) {
                                        throw a0.k(aVar.d, e, "Malformed content type: %s", trim);
                                    }
                                } else {
                                    aVar2.a(substring, trim);
                                }
                                i7++;
                            }
                        }
                        aVar.u = aVar2.d();
                    } else {
                        throw a0.j(aVar.d, "@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof l) {
                    if (!aVar.r) {
                        aVar.s = true;
                    } else {
                        throw a0.j(aVar.d, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (!(annotation instanceof e)) {
                    continue;
                } else if (!aVar.s) {
                    aVar.r = true;
                } else {
                    throw a0.j(aVar.d, "Only one encoding annotation is allowed.", new Object[0]);
                }
                i5++;
            } else if (aVar.p != null) {
                if (!aVar.q) {
                    if (aVar.s) {
                        throw a0.j(aVar.d, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (aVar.r) {
                        throw a0.j(aVar.d, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length3 = aVar.f.length;
                aVar.x = new r[length3];
                int i8 = length3 - 1;
                int i9 = 0;
                while (i4 < length3) {
                    r<?>[] rVarArr = aVar.x;
                    Type type4 = aVar.g[i4];
                    Annotation[] annotationArr2 = aVar.f[i4];
                    if (i4 != i8) {
                        i6 = i9;
                    }
                    if (annotationArr2 != null) {
                        int length4 = annotationArr2.length;
                        rVar = null;
                        while (i9 < length4) {
                            Annotation annotation2 = annotationArr2[i9];
                            Class<String> cls = String.class;
                            Class<z.c> cls2 = z.c.class;
                            int i10 = length3;
                            int i11 = i8;
                            if (annotation2 instanceof t0.c0.y) {
                                aVar.c(i4, type4);
                                if (aVar.o) {
                                    throw a0.l(aVar.d, i4, "Multiple @Url method annotations found.", new Object[0]);
                                } else if (aVar.k) {
                                    throw a0.l(aVar.d, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                                } else if (aVar.l) {
                                    throw a0.l(aVar.d, i4, "A @Url parameter must not come after a @Query.", new Object[0]);
                                } else if (aVar.m) {
                                    throw a0.l(aVar.d, i4, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                } else if (aVar.n) {
                                    throw a0.l(aVar.d, i4, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                } else if (aVar.t == null) {
                                    aVar.o = true;
                                    if (type4 == w.class || type4 == cls || type4 == URI.class || ((type4 instanceof Class) && "android.net.Uri".equals(((Class) type4).getName()))) {
                                        rVar2 = new r.n(aVar.d, i4);
                                        str2 = str4;
                                        i3 = length4;
                                        type3 = type4;
                                    } else {
                                        throw a0.l(aVar.d, i4, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                    }
                                } else {
                                    throw a0.l(aVar.d, i4, "@Url cannot be used with @%s URL", aVar.p);
                                }
                            } else {
                                i3 = length4;
                                if (annotation2 instanceof s) {
                                    aVar.c(i4, type4);
                                    if (aVar.l) {
                                        throw a0.l(aVar.d, i4, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    } else if (aVar.m) {
                                        throw a0.l(aVar.d, i4, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    } else if (aVar.n) {
                                        throw a0.l(aVar.d, i4, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    } else if (aVar.o) {
                                        throw a0.l(aVar.d, i4, "@Path parameters may not be used with @Url.", new Object[0]);
                                    } else if (aVar.t != null) {
                                        aVar.k = true;
                                        s sVar = (s) annotation2;
                                        String value2 = sVar.value();
                                        if (!u.a.b.matcher(value2).matches()) {
                                            throw a0.l(aVar.d, i4, "@Path parameter name must match %s. Found: %s", u.a.a.pattern(), value2);
                                        } else if (aVar.w.contains(value2)) {
                                            aVar.c.f(type4, annotationArr2);
                                            String str5 = value2;
                                            Annotation[] annotationArr3 = annotationArr2;
                                            type3 = type4;
                                            r.i iVar = new r.i(aVar.d, i4, str5, c.d.a, sVar.encoded());
                                            annotationArr2 = annotationArr3;
                                            rVar2 = iVar;
                                        } else {
                                            throw a0.l(aVar.d, i4, "URL \"%s\" does not contain \"{%s}\".", aVar.t, value2);
                                        }
                                    } else {
                                        throw a0.l(aVar.d, i4, "@Path can only be used with relative url on @%s", aVar.p);
                                    }
                                } else {
                                    type3 = type4;
                                    if (annotation2 instanceof t) {
                                        aVar.c(i4, type3);
                                        t tVar = (t) annotation2;
                                        String value3 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        Class<?> f = a0.f(type3);
                                        aVar.l = true;
                                        if (Iterable.class.isAssignableFrom(f)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.c.f(a0.e(0, (ParameterizedType) type3), annotationArr2);
                                                rVar2 = new p(new r.j(value3, c.d.a, encoded));
                                            } else {
                                                throw a0.l(aVar.d, i4, a.Z(f, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f.isArray()) {
                                            aVar.c.f(u.a.a(f.getComponentType()), annotationArr2);
                                            rVar2 = new q(new r.j(value3, c.d.a, encoded));
                                        } else {
                                            aVar.c.f(type3, annotationArr2);
                                            rVar2 = new r.j<>(value3, c.d.a, encoded);
                                        }
                                    } else if (annotation2 instanceof t0.c0.v) {
                                        aVar.c(i4, type3);
                                        boolean encoded2 = ((t0.c0.v) annotation2).encoded();
                                        Class<?> f2 = a0.f(type3);
                                        aVar.m = true;
                                        if (Iterable.class.isAssignableFrom(f2)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.c.f(a0.e(0, (ParameterizedType) type3), annotationArr2);
                                                rVar2 = new p(new r.l(c.d.a, encoded2));
                                            } else {
                                                throw a0.l(aVar.d, i4, a.Z(f2, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f2.isArray()) {
                                            aVar.c.f(u.a.a(f2.getComponentType()), annotationArr2);
                                            rVar2 = new q(new r.l(c.d.a, encoded2));
                                        } else {
                                            aVar.c.f(type3, annotationArr2);
                                            str2 = str4;
                                            rVar2 = new r.l<>(c.d.a, encoded2);
                                        }
                                    } else if (annotation2 instanceof t0.c0.u) {
                                        aVar.c(i4, type3);
                                        Class<?> f3 = a0.f(type3);
                                        aVar.n = true;
                                        if (Map.class.isAssignableFrom(f3)) {
                                            Type g = a0.g(type3, f3, Map.class);
                                            if (g instanceof ParameterizedType) {
                                                ParameterizedType parameterizedType = (ParameterizedType) g;
                                                Type e2 = a0.e(0, parameterizedType);
                                                if (cls == e2) {
                                                    aVar.c.f(a0.e(1, parameterizedType), annotationArr2);
                                                    rVar2 = new r.k<>(aVar.d, i4, c.d.a, ((t0.c0.u) annotation2).encoded());
                                                } else {
                                                    throw a0.l(aVar.d, i4, a.q0("@QueryMap keys must be of type String: ", e2), new Object[0]);
                                                }
                                            } else {
                                                throw a0.l(aVar.d, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                        } else {
                                            throw a0.l(aVar.d, i4, "@QueryMap parameter type must be Map.", new Object[0]);
                                        }
                                    } else if (annotation2 instanceof i) {
                                        aVar.c(i4, type3);
                                        String value4 = ((i) annotation2).value();
                                        Class<?> f4 = a0.f(type3);
                                        if (Iterable.class.isAssignableFrom(f4)) {
                                            if (type3 instanceof ParameterizedType) {
                                                aVar.c.f(a0.e(0, (ParameterizedType) type3), annotationArr2);
                                                rVar2 = new p(new r.d(value4, c.d.a));
                                            } else {
                                                throw a0.l(aVar.d, i4, a.Z(f4, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                            }
                                        } else if (f4.isArray()) {
                                            aVar.c.f(u.a.a(f4.getComponentType()), annotationArr2);
                                            rVar2 = new q(new r.d(value4, c.d.a));
                                        } else {
                                            aVar.c.f(type3, annotationArr2);
                                            str2 = str4;
                                            rVar2 = new r.d<>(value4, c.d.a);
                                        }
                                    } else {
                                        if (annotation2 instanceof j) {
                                            if (type3 == v.class) {
                                                cVar = new r.f(aVar.d, i4);
                                            } else {
                                                aVar.c(i4, type3);
                                                Class<?> f5 = a0.f(type3);
                                                if (Map.class.isAssignableFrom(f5)) {
                                                    Type g2 = a0.g(type3, f5, Map.class);
                                                    if (g2 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType2 = (ParameterizedType) g2;
                                                        Type e3 = a0.e(0, parameterizedType2);
                                                        if (cls == e3) {
                                                            aVar.c.f(a0.e(1, parameterizedType2), annotationArr2);
                                                            rVar2 = new r.e<>(aVar.d, i4, c.d.a);
                                                        } else {
                                                            throw a0.l(aVar.d, i4, a.q0("@HeaderMap keys must be of type String: ", e3), new Object[0]);
                                                        }
                                                    } else {
                                                        throw a0.l(aVar.d, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw a0.l(aVar.d, i4, "@HeaderMap parameter type must be Map.", new Object[0]);
                                                }
                                            }
                                        } else if (annotation2 instanceof t0.c0.c) {
                                            aVar.c(i4, type3);
                                            if (aVar.r) {
                                                t0.c0.c cVar2 = (t0.c0.c) annotation2;
                                                String value5 = cVar2.value();
                                                boolean encoded3 = cVar2.encoded();
                                                aVar.h = true;
                                                Class<?> f6 = a0.f(type3);
                                                if (Iterable.class.isAssignableFrom(f6)) {
                                                    if (type3 instanceof ParameterizedType) {
                                                        aVar.c.f(a0.e(0, (ParameterizedType) type3), annotationArr2);
                                                        cVar = new p(new r.b(value5, c.d.a, encoded3));
                                                    } else {
                                                        throw a0.l(aVar.d, i4, a.Z(f6, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                    }
                                                } else if (f6.isArray()) {
                                                    aVar.c.f(u.a.a(f6.getComponentType()), annotationArr2);
                                                    cVar = new q(new r.b(value5, c.d.a, encoded3));
                                                } else {
                                                    aVar.c.f(type3, annotationArr2);
                                                    rVar2 = new r.b<>(value5, c.d.a, encoded3);
                                                }
                                            } else {
                                                throw a0.l(aVar.d, i4, "@Field parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof d) {
                                            aVar.c(i4, type3);
                                            if (aVar.r) {
                                                Class<?> f7 = a0.f(type3);
                                                if (Map.class.isAssignableFrom(f7)) {
                                                    Type g3 = a0.g(type3, f7, Map.class);
                                                    if (g3 instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType3 = (ParameterizedType) g3;
                                                        Type e4 = a0.e(0, parameterizedType3);
                                                        if (cls == e4) {
                                                            aVar.c.f(a0.e(1, parameterizedType3), annotationArr2);
                                                            c.d dVar = c.d.a;
                                                            aVar.h = true;
                                                            cVar = new r.c<>(aVar.d, i4, dVar, ((d) annotation2).encoded());
                                                        } else {
                                                            throw a0.l(aVar.d, i4, a.q0("@FieldMap keys must be of type String: ", e4), new Object[0]);
                                                        }
                                                    } else {
                                                        throw a0.l(aVar.d, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw a0.l(aVar.d, i4, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                            } else {
                                                throw a0.l(aVar.d, i4, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                            }
                                        } else if (annotation2 instanceof q) {
                                            aVar.c(i4, type3);
                                            if (aVar.s) {
                                                q qVar = (q) annotation2;
                                                aVar.i = true;
                                                String value6 = qVar.value();
                                                Class<?> f8 = a0.f(type3);
                                                if (!value6.isEmpty()) {
                                                    str2 = str4;
                                                    v c = v.c.c("Content-Disposition", a.o0("form-data; name=\"", value6, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(f8)) {
                                                        if (type3 instanceof ParameterizedType) {
                                                            Type e5 = a0.e(0, (ParameterizedType) type3);
                                                            if (!cls2.isAssignableFrom(a0.f(e5))) {
                                                                rVar4 = new p(new r.g(aVar.d, i4, c, aVar.c.d(e5, annotationArr2, aVar.e)));
                                                            } else {
                                                                throw a0.l(aVar.d, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        } else {
                                                            throw a0.l(aVar.d, i4, a.Z(f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                        }
                                                    } else if (f8.isArray()) {
                                                        Class<?> a = u.a.a(f8.getComponentType());
                                                        if (!cls2.isAssignableFrom(a)) {
                                                            rVar4 = new q(new r.g(aVar.d, i4, c, aVar.c.d(a, annotationArr2, aVar.e)));
                                                        } else {
                                                            throw a0.l(aVar.d, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                    } else if (!cls2.isAssignableFrom(f8)) {
                                                        rVar2 = new r.g<>(aVar.d, i4, c, aVar.c.d(type3, annotationArr2, aVar.e));
                                                    } else {
                                                        throw a0.l(aVar.d, i4, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                    }
                                                    rVar2 = rVar4;
                                                } else if (Iterable.class.isAssignableFrom(f8)) {
                                                    if (!(type3 instanceof ParameterizedType)) {
                                                        throw a0.l(aVar.d, i4, a.Z(f8, new StringBuilder(), " must include generic type (e.g., ", "<String>)"), new Object[0]);
                                                    } else if (cls2.isAssignableFrom(a0.f(a0.e(0, (ParameterizedType) type3)))) {
                                                        rVar2 = new p(r.m.a);
                                                    } else {
                                                        throw a0.l(aVar.d, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else if (f8.isArray()) {
                                                    if (cls2.isAssignableFrom(f8.getComponentType())) {
                                                        rVar2 = new q(r.m.a);
                                                    } else {
                                                        throw a0.l(aVar.d, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                } else if (cls2.isAssignableFrom(f8)) {
                                                    rVar2 = r.m.a;
                                                } else {
                                                    throw a0.l(aVar.d, i4, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else {
                                                throw a0.l(aVar.d, i4, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                            }
                                        } else {
                                            str2 = str4;
                                            if (annotation2 instanceof t0.c0.r) {
                                                aVar.c(i4, type3);
                                                if (aVar.s) {
                                                    aVar.i = true;
                                                    Class<?> f9 = a0.f(type3);
                                                    if (Map.class.isAssignableFrom(f9)) {
                                                        Type g4 = a0.g(type3, f9, Map.class);
                                                        if (g4 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType4 = (ParameterizedType) g4;
                                                            Type e6 = a0.e(0, parameterizedType4);
                                                            if (cls == e6) {
                                                                Type e7 = a0.e(1, parameterizedType4);
                                                                if (!cls2.isAssignableFrom(a0.f(e7))) {
                                                                    rVar3 = new r.h<>(aVar.d, i4, aVar.c.d(e7, annotationArr2, aVar.e), ((t0.c0.r) annotation2).encoding());
                                                                } else {
                                                                    throw a0.l(aVar.d, i4, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw a0.l(aVar.d, i4, a.q0("@PartMap keys must be of type String: ", e6), new Object[0]);
                                                            }
                                                        } else {
                                                            throw a0.l(aVar.d, i4, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw a0.l(aVar.d, i4, "@PartMap parameter type must be Map.", new Object[0]);
                                                    }
                                                } else {
                                                    throw a0.l(aVar.d, i4, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof t0.c0.a) {
                                                aVar.c(i4, type3);
                                                if (aVar.r || aVar.s) {
                                                    throw a0.l(aVar.d, i4, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                } else if (!aVar.j) {
                                                    try {
                                                        h d = aVar.c.d(type3, annotationArr2, aVar.e);
                                                        aVar.j = true;
                                                        rVar3 = new r.a<>(aVar.d, i4, d);
                                                    } catch (RuntimeException e8) {
                                                        throw a0.m(aVar.d, e8, i4, "Unable to create @Body converter for %s", type3);
                                                    }
                                                } else {
                                                    throw a0.l(aVar.d, i4, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof t0.c0.x) {
                                                aVar.c(i4, type3);
                                                Class<?> f10 = a0.f(type3);
                                                int i12 = i4 - 1;
                                                while (i12 >= 0) {
                                                    r<?> rVar5 = aVar.x[i12];
                                                    if (!(rVar5 instanceof r.o) || !((r.o) rVar5).a.equals(f10)) {
                                                        i12--;
                                                    } else {
                                                        Method method2 = aVar.d;
                                                        StringBuilder P0 = a.P0("@Tag type ");
                                                        P0.append(f10.getName());
                                                        P0.append(" is duplicate of parameter #");
                                                        P0.append(i12 + 1);
                                                        P0.append(" and would always overwrite its value.");
                                                        throw a0.l(method2, i4, P0.toString(), new Object[0]);
                                                    }
                                                }
                                                rVar3 = new r.o<>(f10);
                                            } else {
                                                rVar2 = null;
                                            }
                                            rVar2 = rVar3;
                                        }
                                        rVar2 = cVar;
                                    }
                                }
                                str2 = str4;
                            }
                            if (rVar2 != null) {
                                if (rVar == null) {
                                    rVar = rVar2;
                                } else {
                                    throw a0.l(aVar.d, i4, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                            }
                            i9++;
                            w wVar2 = wVar;
                            Method method3 = method;
                            type4 = type3;
                            length3 = i10;
                            i8 = i11;
                            length4 = i3;
                            str4 = str2;
                        }
                        i2 = length3;
                        i = i8;
                        str = str4;
                        type2 = type4;
                    } else {
                        i2 = length3;
                        i = i8;
                        str = str4;
                        type2 = type4;
                        rVar = null;
                    }
                    if (rVar == null) {
                        if (i6 != 0) {
                            try {
                                if (a0.f(type2) == m0.l.c.class) {
                                    aVar.y = true;
                                    rVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw a0.l(aVar.d, i4, "No Retrofit annotation found.", new Object[0]);
                    }
                    rVarArr[i4] = rVar;
                    i4++;
                    i9 = 0;
                    i6 = 1;
                    w wVar3 = wVar;
                    Method method4 = method;
                    length3 = i2;
                    i8 = i;
                    str4 = str;
                }
                String str6 = str4;
                if (aVar.t != null || aVar.o) {
                    boolean z2 = aVar.r;
                    if (!z2 && !aVar.s && !aVar.q && aVar.j) {
                        throw a0.j(aVar.d, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !aVar.h) {
                        throw a0.j(aVar.d, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!aVar.s || aVar.i) {
                        u uVar = new u(aVar);
                        Type genericReturnType = method.getGenericReturnType();
                        if (a0.h(genericReturnType)) {
                            throw a0.j(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
                        } else if (genericReturnType != Void.TYPE) {
                            Class<v> cls3 = v.class;
                            boolean z3 = uVar.k;
                            Annotation[] annotations = method.getAnnotations();
                            if (z3) {
                                Type[] genericParameterTypes = method.getGenericParameterTypes();
                                Type type5 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                                if (type5 instanceof WildcardType) {
                                    type5 = ((WildcardType) type5).getLowerBounds()[0];
                                }
                                if (a0.f(type5) != cls3 || !(type5 instanceof ParameterizedType)) {
                                    z = false;
                                } else {
                                    type5 = a0.e(0, (ParameterizedType) type5);
                                    z = true;
                                }
                                type = new a0.b((Type) null, d.class, type5);
                                if (!a0.i(annotations, y.class)) {
                                    Annotation[] annotationArr4 = new Annotation[(annotations.length + 1)];
                                    annotationArr4[0] = z.a;
                                    System.arraycopy(annotations, 0, annotationArr4, 1, annotations.length);
                                    annotations = annotationArr4;
                                }
                            } else {
                                type = method.getGenericReturnType();
                                z = false;
                            }
                            w wVar4 = wVar;
                            try {
                                e<?, ?> a2 = wVar4.a(type, annotations);
                                Type a3 = a2.a();
                                if (a3 == e0.class) {
                                    StringBuilder P02 = a.P0("'");
                                    P02.append(a0.f(a3).getName());
                                    P02.append("' is not a valid response body type. Did you mean ResponseBody?");
                                    throw a0.j(method, P02.toString(), new Object[0]);
                                } else if (a3 == cls3) {
                                    throw a0.j(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                } else if (!uVar.c.equals(str6) || Void.class.equals(a3)) {
                                    Method method5 = method;
                                    try {
                                        h e9 = wVar4.e(a3, method.getAnnotations());
                                        f.a aVar3 = wVar4.b;
                                        if (!z3) {
                                            return new j.a(uVar, aVar3, e9, a2);
                                        }
                                        if (z) {
                                            return new j.c(uVar, aVar3, e9, a2);
                                        }
                                        return new j.b(uVar, aVar3, e9, a2, false);
                                    } catch (RuntimeException e10) {
                                        throw a0.k(method5, e10, "Unable to create converter for %s", a3);
                                    }
                                } else {
                                    throw a0.j(method, "HEAD method must use Void as response type.", new Object[0]);
                                }
                            } catch (RuntimeException e11) {
                                throw a0.k(method, e11, "Unable to create call adapter for %s", type);
                            }
                        } else {
                            throw a0.j(method, "Service methods cannot return void.", new Object[0]);
                        }
                    } else {
                        throw a0.j(aVar.d, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw a0.j(aVar.d, "Missing either @%s URL or @Url parameter.", aVar.p);
                }
            } else {
                throw a0.j(aVar.d, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
        throw a0.j(aVar.d, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str3);
    }

    public abstract T a(Object[] objArr);
}
