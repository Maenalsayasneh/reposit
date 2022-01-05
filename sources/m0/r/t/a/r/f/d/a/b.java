package m0.r.t.a.r.f.d.a;

import com.stripe.android.model.Stripe3ds2AuthResult;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ClassMapperLite.kt */
public final class b {
    public static final b a = new b();
    public static final String b = g.E(g.K('k', 'o', 't', 'l', 'i', 'n'), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    public static final Map<String, String> c;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List K = g.K("Boolean", "Z", "Char", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int C1 = h.C1(0, K.size() - 1, 2);
        if (C1 >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                StringBuilder sb = new StringBuilder();
                String str = b;
                sb.append(str);
                sb.append('/');
                sb.append((String) K.get(i2));
                int i4 = i2 + 1;
                linkedHashMap.put(sb.toString(), K.get(i4));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(a.y0(sb2, (String) K.get(i2), "Array"), i.k("[", K.get(i4)));
                if (i2 == C1) {
                    break;
                }
                i2 = i3;
            }
        }
        linkedHashMap.put(i.k(b, "/Unit"), "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : g.K("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, i.k("java/lang/", str2));
        }
        for (String str3 : g.K("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, i.k("collections/", str3), i.k("java/util/", str3));
            a(linkedHashMap, i.k("collections/Mutable", str3), i.k("java/util/", str3));
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        while (true) {
            int i5 = i + 1;
            String k = i.k("Function", Integer.valueOf(i));
            StringBuilder sb3 = new StringBuilder();
            String str4 = b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i);
            a(linkedHashMap, k, sb3.toString());
            a(linkedHashMap, i.k("reflect/KFunction", Integer.valueOf(i)), i.k(str4, "/reflect/KFunction"));
            if (i5 > 22) {
                break;
            }
            i = i5;
        }
        for (String str5 : g.K("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, i.k(str5, ".Companion"), b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        c = linkedHashMap;
    }

    public static final void a(Map<String, String> map, String str, String str2) {
        map.put(b + '/' + str, 'L' + str2 + ';');
    }

    public static final String b(String str) {
        i.e(str, "classId");
        String str2 = c.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder N0 = a.N0('L');
        N0.append(StringsKt__IndentKt.A(str, '.', '$', false, 4));
        N0.append(';');
        return N0.toString();
    }
}
