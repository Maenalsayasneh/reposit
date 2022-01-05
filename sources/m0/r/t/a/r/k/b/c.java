package m0.r.t.a.r.k.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1;
import m0.j.g;
import m0.j.o;
import m0.n.b.i;
import m0.q.e;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.j.p.b;
import m0.r.t.a.r.j.p.j;
import m0.r.t.a.r.j.p.k;
import m0.r.t.a.r.j.p.l;
import m0.r.t.a.r.j.p.r;
import m0.r.t.a.r.j.p.s;
import m0.r.t.a.r.j.p.t;
import m0.r.t.a.r.j.p.w;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: AnnotationDeserializer.kt */
public final class c {
    public final u a;
    public final NotFoundClasses b;

    /* compiled from: AnnotationDeserializer.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            ProtoBuf$Annotation.Argument.Value.Type.values();
            int[] iArr = new int[13];
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            a = iArr;
        }
    }

    public c(u uVar, NotFoundClasses notFoundClasses) {
        i.e(uVar, "module");
        i.e(notFoundClasses, "notFoundClasses");
        this.a = uVar;
        this.b = notFoundClasses;
    }

    public final m0.r.t.a.r.c.r0.c a(ProtoBuf$Annotation protoBuf$Annotation, m0.r.t.a.r.f.c.c cVar) {
        i.e(protoBuf$Annotation, "proto");
        i.e(cVar, "nameResolver");
        d G0 = h.G0(this.a, h.X0(cVar, protoBuf$Annotation.y), this.b);
        Map o = g.o();
        if (protoBuf$Annotation.Y1.size() != 0 && !p.j(G0) && m0.r.t.a.r.j.d.m(G0)) {
            Collection<m0.r.t.a.r.c.c> k = G0.k();
            i.d(k, "annotationClass.constructors");
            m0.r.t.a.r.c.c cVar2 = (m0.r.t.a.r.c.c) g.k0(k);
            if (cVar2 != null) {
                List<o0> h = cVar2.h();
                i.d(h, "constructor.valueParameters");
                int R2 = h.R2(h.K(h, 10));
                if (R2 < 16) {
                    R2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
                for (T next : h) {
                    linkedHashMap.put(((o0) next).getName(), next);
                }
                List<ProtoBuf$Annotation.Argument> list = protoBuf$Annotation.Y1;
                i.d(list, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf$Annotation.Argument argument : list) {
                    i.d(argument, "it");
                    o0 o0Var = (o0) linkedHashMap.get(h.v1(cVar, argument.y));
                    m0.r.t.a.r.j.p.g<?> gVar = null;
                    if (o0Var != null) {
                        m0.r.t.a.r.g.d v1 = h.v1(cVar, argument.y);
                        v type = o0Var.getType();
                        i.d(type, "parameter.type");
                        ProtoBuf$Annotation.Argument.Value value = argument.Y1;
                        i.d(value, "proto.value");
                        m0.r.t.a.r.j.p.g<?> c = c(type, value, cVar);
                        if (b(c, type, value)) {
                            gVar = c;
                        }
                        if (gVar == null) {
                            StringBuilder P0 = i0.d.a.a.a.P0("Unexpected argument value: actual type ");
                            P0.append(value.y);
                            P0.append(" != expected type ");
                            P0.append(type);
                            String sb = P0.toString();
                            i.e(sb, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                            gVar = new j.a(sb);
                        }
                        gVar = new Pair<>(v1, gVar);
                    }
                    if (gVar != null) {
                        arrayList.add(gVar);
                    }
                }
                o = g.w0(arrayList);
            }
        }
        return new m0.r.t.a.r.c.r0.d(G0.q(), o, h0.a);
    }

    public final boolean b(m0.r.t.a.r.j.p.g<?> gVar, v vVar, ProtoBuf$Annotation.Argument.Value value) {
        int i;
        ProtoBuf$Annotation.Argument.Value.Type type = value.y;
        if (type == null) {
            i = -1;
        } else {
            i = a.a[type.ordinal()];
        }
        if (i == 10) {
            f c = vVar.I0().c();
            d dVar = c instanceof d ? (d) c : null;
            if (dVar != null) {
                m0.r.t.a.r.g.d dVar2 = m0.r.t.a.r.b.f.a;
                if (!m0.r.t.a.r.b.f.c(dVar, g.a.X)) {
                    return false;
                }
            }
        } else if (i != 13) {
            return i.a(gVar.a(this.a), vVar);
        } else {
            if ((gVar instanceof b) && ((List) ((b) gVar).a).size() == value.f2.size()) {
                v g = this.a.m().g(vVar);
                i.d(g, "builtIns.getArrayElementType(expectedType)");
                b bVar = (b) gVar;
                e x = m0.j.g.x((Collection) bVar.a);
                if (!(x instanceof Collection) || !((Collection) x).isEmpty()) {
                    Iterator it = x.iterator();
                    while (((m0.q.d) it).d) {
                        int a2 = ((o) it).a();
                        ProtoBuf$Annotation.Argument.Value value2 = value.f2.get(a2);
                        i.d(value2, "value.getArrayElement(i)");
                        if (!b((m0.r.t.a.r.j.p.g) ((List) bVar.a).get(a2), g, value2)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(i.k("Deserialized ArrayValue should have the same number of elements as the original array value: ", gVar).toString());
            }
        }
        return true;
    }

    public final m0.r.t.a.r.j.p.g<?> c(v vVar, ProtoBuf$Annotation.Argument.Value value, m0.r.t.a.r.f.c.c cVar) {
        int i;
        m0.r.t.a.r.j.p.g<?> gVar;
        i.e(vVar, "expectedType");
        i.e(value, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(cVar, "nameResolver");
        boolean E = i0.d.a.a.a.E(m0.r.t.a.r.f.c.b.M, value.h2, "IS_UNSIGNED.get(value.flags)");
        ProtoBuf$Annotation.Argument.Value.Type type = value.y;
        if (type == null) {
            i = -1;
        } else {
            i = a.a[type.ordinal()];
        }
        switch (i) {
            case 1:
                byte b2 = (byte) ((int) value.Y1);
                return E ? new t(b2) : new m0.r.t.a.r.j.p.d(b2);
            case 2:
                gVar = new m0.r.t.a.r.j.p.e((char) ((int) value.Y1));
                break;
            case 3:
                short s = (short) ((int) value.Y1);
                return E ? new w(s) : new r(s);
            case 4:
                int i2 = (int) value.Y1;
                return E ? new m0.r.t.a.r.j.p.u(i2) : new l(i2);
            case 5:
                long j = value.Y1;
                return E ? new m0.r.t.a.r.j.p.v(j) : new m0.r.t.a.r.j.p.p(j);
            case 6:
                gVar = new k(value.Z1);
                break;
            case 7:
                gVar = new m0.r.t.a.r.j.p.h(value.a2);
                break;
            case 8:
                gVar = new m0.r.t.a.r.j.p.c(value.Y1 != 0);
                break;
            case 9:
                gVar = new s(cVar.b(value.b2));
                break;
            case 10:
                gVar = new m0.r.t.a.r.j.p.o(h.X0(cVar, value.c2), value.g2);
                break;
            case 11:
                gVar = new m0.r.t.a.r.j.p.i(h.X0(cVar, value.c2), h.v1(cVar, value.d2));
                break;
            case 12:
                ProtoBuf$Annotation protoBuf$Annotation = value.e2;
                i.d(protoBuf$Annotation, "value.annotation");
                gVar = new m0.r.t.a.r.j.p.a(a(protoBuf$Annotation, cVar));
                break;
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> list = value.f2;
                i.d(list, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(h.K(list, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : list) {
                    a0 f = this.a.m().f();
                    i.d(f, "builtIns.anyType");
                    i.d(value2, "it");
                    arrayList.add(c(f, value2, cVar));
                }
                i.e(arrayList, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                i.e(vVar, "type");
                return new b(arrayList, new ConstantValueFactory$createArrayValue$1(vVar));
            default:
                StringBuilder P0 = i0.d.a.a.a.P0("Unsupported annotation argument type: ");
                P0.append(value.y);
                P0.append(" (expected ");
                P0.append(vVar);
                P0.append(')');
                throw new IllegalStateException(P0.toString().toString());
        }
        return gVar;
    }
}
