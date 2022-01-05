package m0.r;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import kotlin.reflect.ParameterizedTypeImpl;
import kotlin.reflect.TypesJVMKt$typeToString$unwrap$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import m0.s.h;

/* compiled from: TypesJVM.kt */
public final class r {
    public static final String a(Type type) {
        String str;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            h C1 = a.C1(type, TypesJVMKt$typeToString$unwrap$1.c);
            StringBuilder sb = new StringBuilder();
            i.e(C1, "$this$last");
            Iterator it = C1.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = it.next();
                }
                sb.append(((Class) next).getName());
                sb.append(StringsKt__IndentKt.z("[]", SequencesKt___SequencesKt.b(C1)));
                str = sb.toString();
            } else {
                throw new NoSuchElementException("Sequence is empty.");
            }
        } else {
            str = cls.getName();
        }
        i.d(str, "if (type.isArray) {\n    …\n        } else type.name");
        return str;
    }

    public static final Type b(n nVar, boolean z) {
        e c = nVar.c();
        if (c instanceof o) {
            return new q((o) c);
        }
        if (c instanceof d) {
            d dVar = (d) c;
            Class m1 = z ? i0.j.f.p.h.m1(dVar) : i0.j.f.p.h.l1(dVar);
            List<p> a = nVar.a();
            if (a.isEmpty()) {
                return m1;
            }
            if (!m1.isArray()) {
                return d(m1, a);
            }
            Class<?> componentType = m1.getComponentType();
            i.d(componentType, "jClass.componentType");
            if (componentType.isPrimitive()) {
                return m1;
            }
            p pVar = (p) g.l0(a);
            if (pVar != null) {
                KVariance kVariance = pVar.c;
                n nVar2 = pVar.d;
                if (kVariance == null) {
                    return m1;
                }
                int ordinal = kVariance.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        return m1;
                    }
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                i.c(nVar2);
                Type c2 = c(nVar2, false, 1);
                return c2 instanceof Class ? m1 : new a(c2);
            }
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + nVar);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + nVar);
    }

    public static /* synthetic */ Type c(n nVar, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return b(nVar, z);
    }

    public static final Type d(Class<?> cls, List<p> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
            for (p e : list) {
                arrayList.add(e(e));
            }
            return new ParameterizedTypeImpl(cls, (Type) null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(i0.j.f.p.h.K(list, 10));
            for (p e2 : list) {
                arrayList2.add(e(e2));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type d = d(declaringClass, list.subList(length, list.size()));
            List<p> subList = list.subList(0, length);
            ArrayList arrayList3 = new ArrayList(i0.j.f.p.h.K(subList, 10));
            for (p e3 : subList) {
                arrayList3.add(e(e3));
            }
            return new ParameterizedTypeImpl(cls, d, arrayList3);
        }
    }

    public static final Type e(p pVar) {
        KVariance kVariance = pVar.c;
        if (kVariance == null) {
            return s.c;
        }
        n nVar = pVar.d;
        i.c(nVar);
        int ordinal = kVariance.ordinal();
        if (ordinal == 0) {
            return b(nVar, true);
        }
        if (ordinal == 1) {
            return new s((Type) null, b(nVar, true));
        }
        if (ordinal == 2) {
            return new s(b(nVar, true), (Type) null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
