package m0.r.t.a.r.f.d.a;

import com.pubnub.api.endpoints.objects_api.utils.Pager;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.text.StringsKt__IndentKt;
import m0.j.m;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.f.c.c;

/* compiled from: JvmNameResolver.kt */
public final class g implements c {
    public static final a a;
    public static final String b;
    public static final List<String> c;
    public final JvmProtoBuf.StringTableTypes d;
    public final String[] e;
    public final Set<Integer> f;
    public final List<JvmProtoBuf.StringTableTypes.Record> g;

    /* compiled from: JvmNameResolver.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final List<String> a() {
            return g.c;
        }
    }

    static {
        a aVar = new a((f) null);
        a = aVar;
        String E = m0.j.g.E(m0.j.g.K('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        b = E;
        int i = 16;
        c = m0.j.g.K(i.k(E, "/Any"), i.k(E, "/Nothing"), i.k(E, "/Unit"), i.k(E, "/Throwable"), i.k(E, "/Number"), i.k(E, "/Byte"), i.k(E, "/Double"), i.k(E, "/Float"), i.k(E, "/Int"), i.k(E, "/Long"), i.k(E, "/Short"), i.k(E, "/Boolean"), i.k(E, "/Char"), i.k(E, "/CharSequence"), i.k(E, "/String"), i.k(E, "/Comparable"), i.k(E, "/Enum"), i.k(E, "/Array"), i.k(E, "/ByteArray"), i.k(E, "/DoubleArray"), i.k(E, "/FloatArray"), i.k(E, "/IntArray"), i.k(E, "/LongArray"), i.k(E, "/ShortArray"), i.k(E, "/BooleanArray"), i.k(E, "/CharArray"), i.k(E, "/Cloneable"), i.k(E, "/Annotation"), i.k(E, "/collections/Iterable"), i.k(E, "/collections/MutableIterable"), i.k(E, "/collections/Collection"), i.k(E, "/collections/MutableCollection"), i.k(E, "/collections/List"), i.k(E, "/collections/MutableList"), i.k(E, "/collections/Set"), i.k(E, "/collections/MutableSet"), i.k(E, "/collections/Map"), i.k(E, "/collections/MutableMap"), i.k(E, "/collections/Map.Entry"), i.k(E, "/collections/MutableMap.MutableEntry"), i.k(E, "/collections/Iterator"), i.k(E, "/collections/MutableIterator"), i.k(E, "/collections/ListIterator"), i.k(E, "/collections/MutableListIterator"));
        Iterable<m0.j.l<T>> E0 = m0.j.g.E0(aVar.a());
        int R2 = h.R2(h.K(E0, 10));
        if (R2 >= 16) {
            i = R2;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        Iterator it = ((m) E0).iterator();
        while (it.hasNext()) {
            m0.j.l lVar = (m0.j.l) it.next();
            linkedHashMap.put((String) lVar.b, Integer.valueOf(lVar.a));
        }
    }

    public g(JvmProtoBuf.StringTableTypes stringTableTypes, String[] strArr) {
        Set<Integer> set;
        i.e(stringTableTypes, "types");
        i.e(strArr, "strings");
        this.d = stringTableTypes;
        this.e = strArr;
        List<Integer> list = stringTableTypes.y;
        if (list.isEmpty()) {
            set = EmptySet.c;
        } else {
            i.d(list, "");
            set = m0.j.g.D0(list);
        }
        this.f = set;
        ArrayList arrayList = new ArrayList();
        List<JvmProtoBuf.StringTableTypes.Record> list2 = stringTableTypes.x;
        arrayList.ensureCapacity(list2.size());
        for (JvmProtoBuf.StringTableTypes.Record next : list2) {
            int i = next.y;
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(next);
            }
        }
        arrayList.trimToSize();
        this.g = arrayList;
    }

    public String a(int i) {
        return b(i);
    }

    public String b(int i) {
        String str;
        JvmProtoBuf.StringTableTypes.Record record = this.g.get(i);
        int i2 = record.x;
        if ((i2 & 4) == 4) {
            Object obj = record.Z1;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                m0.r.t.a.r.h.c cVar = (m0.r.t.a.r.h.c) obj;
                String z = cVar.z();
                if (cVar.s()) {
                    record.Z1 = z;
                }
                str = z;
            }
        } else {
            if ((i2 & 2) == 2) {
                List<String> list = c;
                int size = list.size() - 1;
                int i3 = record.Y1;
                if (i3 >= 0 && i3 <= size) {
                    str = list.get(i3);
                }
            }
            str = this.e[i];
        }
        if (record.b2.size() >= 2) {
            List<Integer> list2 = record.b2;
            i.d(list2, "substringIndexList");
            Integer num = list2.get(0);
            Integer num2 = list2.get(1);
            i.d(num, "begin");
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                i.d(num2, Pager.END_PARAM_NAME);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    i.d(str, "string");
                    str = str.substring(num.intValue(), num2.intValue());
                    i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
            }
        }
        if (record.d2.size() >= 2) {
            List<Integer> list3 = record.d2;
            i.d(list3, "replaceCharList");
            i.d(str, "string");
            str = StringsKt__IndentKt.A(str, (char) list3.get(0).intValue(), (char) list3.get(1).intValue(), false, 4);
        }
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.a2;
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int ordinal = operation.ordinal();
        if (ordinal == 1) {
            i.d(str, "string");
            str = StringsKt__IndentKt.A(str, '$', '.', false, 4);
        } else if (ordinal == 2) {
            if (str.length() >= 2) {
                i.d(str, "string");
                str = str.substring(1, str.length() - 1);
                i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            i.d(str, "string");
            str = StringsKt__IndentKt.A(str, '$', '.', false, 4);
        }
        i.d(str, "string");
        return str;
    }

    public boolean c(int i) {
        return this.f.contains(Integer.valueOf(i));
    }
}
