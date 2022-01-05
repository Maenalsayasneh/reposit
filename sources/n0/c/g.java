package n0.c;

import i0.j.f.p.h;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.MapEntrySerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.TripleSerializer;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.n;
import m0.r.p;
import m0.r.t.a.r.m.a1.a;
import n0.c.k.e;
import n0.c.k.h0;
import n0.c.k.j0;
import n0.c.k.u0;
import n0.c.k.x;
import n0.c.k.z;
import n0.c.m.b;

/* compiled from: SerializersJvm.kt */
public final /* synthetic */ class g {
    public static final d<?> a(Type type) {
        if (type instanceof d) {
            return (d) type;
        }
        if (type instanceof Class) {
            return h.r1((Class) type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            i.d(rawType, "it.rawType");
            return a(rawType);
        } else if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            i.d(upperBounds, "it.upperBounds");
            Object H0 = h.H0(upperBounds);
            i.d(H0, "it.upperBounds.first()");
            return a((Type) H0);
        } else if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            i.d(genericComponentType, "it.genericComponentType");
            return a(genericComponentType);
        } else {
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + m.a(type.getClass()));
        }
    }

    public static final KSerializer<Object> b(b bVar, Type type, boolean z) {
        ArrayList<KSerializer> arrayList;
        KSerializer<Object> v3;
        KSerializer<E[]> b;
        KSerializer<Object> kSerializer;
        KSerializer<Object> kSerializer2;
        d dVar;
        KSerializer<Object> kSerializer3 = null;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                i.d(upperBounds, "it.upperBounds");
                genericComponentType = (Type) h.H0(upperBounds);
            }
            i.d(genericComponentType, "eType");
            if (z) {
                kSerializer2 = a.t3(bVar, genericComponentType);
            } else {
                kSerializer2 = a.w3(bVar, genericComponentType);
                if (kSerializer2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                Objects.requireNonNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
                dVar = h.r1((Class) rawType);
            } else if (genericComponentType instanceof d) {
                dVar = (d) genericComponentType;
            } else {
                StringBuilder P0 = i0.d.a.a.a.P0("unsupported type in GenericArray: ");
                P0.append(m.a(genericComponentType.getClass()));
                throw new IllegalStateException(P0.toString());
            }
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return a.b(dVar, kSerializer2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray()) {
                d r1 = h.r1(cls);
                Objects.requireNonNull(r1, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                v3 = a.v3(r1);
                if (v3 == null) {
                    b = bVar.b(r1);
                }
            } else {
                Class<?> componentType = cls.getComponentType();
                i.d(componentType, "type.componentType");
                if (z) {
                    kSerializer = a.t3(bVar, componentType);
                } else {
                    kSerializer = a.w3(bVar, componentType);
                    if (kSerializer == null) {
                        return null;
                    }
                }
                d<?> r12 = h.r1(componentType);
                Objects.requireNonNull(r12, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                b = a.b(r12, kSerializer);
            }
            return b;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType2 = parameterizedType.getRawType();
            Objects.requireNonNull(rawType2, "null cannot be cast to non-null type java.lang.Class<*>");
            Class cls2 = (Class) rawType2;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            i.d(actualTypeArguments, "args");
            if (z) {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type2 : actualTypeArguments) {
                    i.d(type2, "it");
                    arrayList.add(a.t3(bVar, type2));
                }
            } else {
                arrayList = new ArrayList<>(actualTypeArguments.length);
                for (Type type3 : actualTypeArguments) {
                    i.d(type3, "it");
                    KSerializer<Object> w3 = a.w3(bVar, type3);
                    if (w3 == null) {
                        return null;
                    }
                    arrayList.add(w3);
                }
            }
            if (Set.class.isAssignableFrom(cls2)) {
                KSerializer kSerializer4 = (KSerializer) arrayList.get(0);
                i.e(kSerializer4, "elementSerializer");
                return new j0(kSerializer4);
            } else if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
                return a.u((KSerializer) arrayList.get(0));
            } else {
                if (Map.class.isAssignableFrom(cls2)) {
                    return a.v((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
                }
                if (Map.Entry.class.isAssignableFrom(cls2)) {
                    KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                    KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                    i.e(kSerializer5, "keySerializer");
                    i.e(kSerializer6, "valueSerializer");
                    return new MapEntrySerializer(kSerializer5, kSerializer6);
                } else if (Pair.class.isAssignableFrom(cls2)) {
                    KSerializer kSerializer7 = (KSerializer) arrayList.get(0);
                    KSerializer kSerializer8 = (KSerializer) arrayList.get(1);
                    i.e(kSerializer7, "keySerializer");
                    i.e(kSerializer8, "valueSerializer");
                    return new PairSerializer(kSerializer7, kSerializer8);
                } else if (Triple.class.isAssignableFrom(cls2)) {
                    KSerializer kSerializer9 = (KSerializer) arrayList.get(0);
                    KSerializer kSerializer10 = (KSerializer) arrayList.get(1);
                    KSerializer kSerializer11 = (KSerializer) arrayList.get(2);
                    i.e(kSerializer9, "aSerializer");
                    i.e(kSerializer10, "bSerializer");
                    i.e(kSerializer11, "cSerializer");
                    return new TripleSerializer(kSerializer9, kSerializer10, kSerializer11);
                } else {
                    ArrayList arrayList2 = new ArrayList(h.K(arrayList, 10));
                    for (KSerializer kSerializer12 : arrayList) {
                        Objects.requireNonNull(kSerializer12, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
                        arrayList2.add(kSerializer12);
                    }
                    Object[] array = arrayList2.toArray(new KSerializer[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    KSerializer[] kSerializerArr = (KSerializer[]) array;
                    KSerializer<Object> I0 = a.I0(h.r1(cls2), (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
                    if (I0 instanceof KSerializer) {
                        kSerializer3 = I0;
                    }
                    if (kSerializer3 != null) {
                        return kSerializer3;
                    }
                    d r13 = h.r1(cls2);
                    Objects.requireNonNull(r13, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                    v3 = a.v3(r13);
                    if (v3 == null) {
                        b = bVar.b(r13);
                        return b;
                    }
                }
            }
        } else if (type instanceof WildcardType) {
            Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
            i.d(upperBounds2, "type.upperBounds");
            Object H0 = h.H0(upperBounds2);
            i.d(H0, "type.upperBounds.first()");
            return b(bVar, (Type) H0, true);
        } else {
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + m.a(type.getClass()));
        }
        return v3;
    }

    public static final KSerializer<Object> c(b bVar, n nVar, boolean z) {
        KSerializer kSerializer;
        ArrayList arrayList;
        KSerializer kSerializer2;
        KSerializer kSerializer3;
        d c = u0.c(nVar);
        boolean d = nVar.d();
        List<p> a = nVar.a();
        ArrayList arrayList2 = new ArrayList(h.K(a, 10));
        for (p pVar : a) {
            n nVar2 = pVar.d;
            if (nVar2 != null) {
                arrayList2.add(nVar2);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + nVar).toString());
            }
        }
        if (arrayList2.isEmpty()) {
            kSerializer = a.v3(c);
            if (kSerializer == null) {
                kSerializer = bVar.b(c);
            }
        } else {
            if (!z) {
                arrayList = new ArrayList(h.K(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    n nVar3 = (n) it.next();
                    i.e(bVar, "$this$serializerOrNull");
                    i.e(nVar3, "type");
                    KSerializer<Object> c2 = c(bVar, nVar3, false);
                    if (c2 == null) {
                        kSerializer = null;
                        break;
                    }
                    arrayList.add(c2);
                }
            } else {
                arrayList = new ArrayList(h.K(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a.u3(bVar, (n) it2.next()));
                }
            }
            if (i.a(c, m.a(Collection.class)) || i.a(c, m.a(List.class)) || i.a(c, m.a(List.class)) || i.a(c, m.a(ArrayList.class))) {
                kSerializer2 = new e((KSerializer) arrayList.get(0));
            } else if (i.a(c, m.a(HashSet.class))) {
                kSerializer2 = new z((KSerializer) arrayList.get(0));
            } else if (i.a(c, m.a(Set.class)) || i.a(c, m.a(Set.class)) || i.a(c, m.a(LinkedHashSet.class))) {
                kSerializer2 = new j0((KSerializer) arrayList.get(0));
            } else if (i.a(c, m.a(HashMap.class))) {
                kSerializer2 = new x((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            } else if (!i.a(c, m.a(Map.class)) && !i.a(c, m.a(Map.class)) && !i.a(c, m.a(LinkedHashMap.class))) {
                if (i.a(c, m.a(Map.Entry.class))) {
                    KSerializer kSerializer4 = (KSerializer) arrayList.get(0);
                    KSerializer kSerializer5 = (KSerializer) arrayList.get(1);
                    i.e(kSerializer4, "keySerializer");
                    i.e(kSerializer5, "valueSerializer");
                    kSerializer3 = new MapEntrySerializer(kSerializer4, kSerializer5);
                } else if (i.a(c, m.a(Pair.class))) {
                    KSerializer kSerializer6 = (KSerializer) arrayList.get(0);
                    KSerializer kSerializer7 = (KSerializer) arrayList.get(1);
                    i.e(kSerializer6, "keySerializer");
                    i.e(kSerializer7, "valueSerializer");
                    kSerializer3 = new PairSerializer(kSerializer6, kSerializer7);
                } else if (i.a(c, m.a(Triple.class))) {
                    KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
                    KSerializer kSerializer9 = (KSerializer) arrayList.get(1);
                    KSerializer kSerializer10 = (KSerializer) arrayList.get(2);
                    i.e(kSerializer8, "aSerializer");
                    i.e(kSerializer9, "bSerializer");
                    i.e(kSerializer10, "cSerializer");
                    kSerializer = new TripleSerializer(kSerializer8, kSerializer9, kSerializer10);
                } else {
                    i.e(c, "rootClass");
                    if (h.l1(c).isArray()) {
                        m0.r.e c3 = ((n) arrayList2.get(0)).c();
                        Objects.requireNonNull(c3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                        kSerializer2 = a.b((d) c3, (KSerializer) arrayList.get(0));
                    } else {
                        Object[] array = arrayList.toArray(new KSerializer[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                        KSerializer[] kSerializerArr = (KSerializer[]) array;
                        kSerializer2 = a.I0(c, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
                    }
                }
                kSerializer = kSerializer3;
            } else {
                kSerializer2 = new h0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
            }
            kSerializer = kSerializer2;
        }
        if (kSerializer == null) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return d ? a.R1(kSerializer) : kSerializer;
        }
        return null;
    }
}
