package i0.b.c;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.airbnb.paris.StyleApplierUtils$Companion$getMissingStyleAttributesError$1;
import com.airbnb.paris.StyleApplierUtils$Companion$getMissingStyleAttributesError$2;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import i0.b.c.b;
import i0.b.c.g.e;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.j.o;
import m0.n.b.i;
import m0.q.d;

/* compiled from: StyleApplierUtils.kt */
public final class c {

    /* compiled from: StyleApplierUtils.kt */
    public static final class a implements b.a {
        public final HashMap<View, Set<e>> a;
        public final HashMap<e, Set<String>> b;

        public a(HashMap<View, Set<e>> hashMap, HashMap<e, Set<String>> hashMap2) {
            i.e(hashMap, "viewToStyles");
            i.e(hashMap2, "styleToAttrNames");
            this.a = hashMap;
            this.b = hashMap2;
        }

        public void a(View view, e eVar, int[] iArr, int[] iArr2, i0.b.c.h.c cVar) {
            String str;
            i.e(view, "view");
            i.e(eVar, "style");
            i.e(iArr, "attributes");
            i.e(cVar, "typedArray");
            HashMap<View, Set<e>> hashMap = this.a;
            Set<e> hashSet = new HashSet<>();
            if (hashMap.containsKey(view)) {
                hashSet = hashMap.get(view);
                i.c(hashSet);
            }
            Set set = hashSet;
            set.add(eVar);
            this.a.put(view, set);
            i.e(cVar, "typedArray");
            m0.q.e f = m0.q.i.f(0, cVar.g());
            ArrayList arrayList = new ArrayList(h.K(f, 10));
            Iterator it = f.iterator();
            while (((d) it).d) {
                arrayList.add(Integer.valueOf(cVar.f(((o) it).a())));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                ((Number) next).intValue();
                arrayList2.add(next);
            }
            Set<Number> D0 = g.D0(arrayList2);
            Context context = view.getContext();
            i.d(context, "view.context");
            i.e(context, "context");
            i.e(iArr, UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY);
            i.e(D0, "attrIndexes");
            ArrayList arrayList3 = new ArrayList(h.K(D0, 10));
            for (Number intValue : D0) {
                int intValue2 = intValue.intValue();
                try {
                    str = context.getResources().getResourceEntryName(iArr[intValue2]);
                } catch (Resources.NotFoundException unused) {
                    StringBuilder P0 = i0.d.a.a.a.P0("NotFoundException:id=");
                    P0.append(iArr[intValue2]);
                    str = P0.toString();
                }
                arrayList3.add(str);
            }
            Set D02 = g.D0(arrayList3);
            HashMap<e, Set<String>> hashMap2 = this.b;
            Set<String> hashSet2 = new HashSet<>();
            if (hashMap2.containsKey(eVar)) {
                hashSet2 = hashMap2.get(eVar);
                i.c(hashSet2);
            }
            Set set2 = hashSet2;
            set2.addAll(D02);
            this.b.put(eVar, set2);
        }
    }

    public static final void a(b<?, ?> bVar, e... eVarArr) {
        b<?, ?> bVar2 = bVar;
        e[] eVarArr2 = eVarArr;
        i.e(bVar2, "applier");
        i.e(eVarArr2, "parentStyles");
        boolean z = true;
        if (eVarArr2.length > 1) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            bVar2.a = new a(hashMap, hashMap2);
            boolean z2 = false;
            for (e a2 : eVarArr2) {
                bVar2.a(a2);
            }
            bVar2.a = null;
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : hashMap.entrySet()) {
                View view = (View) entry.getKey();
                Set<e> set = (Set) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (e eVar : set) {
                    Object obj = hashMap2.get(eVar);
                    i.c(obj);
                    g.b(arrayList, (Set) obj);
                }
                Set D0 = g.D0(arrayList);
                for (e eVar2 : set) {
                    Object obj2 = hashMap2.get(eVar2);
                    i.c(obj2);
                    i.d(obj2, "styleToAttrNames[style]!!");
                    Set o02 = g.o0(D0, (Iterable) obj2);
                    if (o02.isEmpty() ^ z) {
                        Set T = g.T(set, eVar2);
                        i.e(view, "view");
                        i.e(eVar2, "style");
                        i.e(T, "otherStyles");
                        i.e(o02, "missingAttrNames");
                        Context context = view.getContext();
                        String simpleName = view.getClass().getSimpleName();
                        i.d(context, "context");
                        StringBuilder U0 = i0.d.a.a.a.U0("\n                |The ", simpleName, " style \"", eVar2.c(context), "\" is missing the following attributes:\n                |");
                        U0.append(g.E(o02, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, StyleApplierUtils$Companion$getMissingStyleAttributesError$1.c, 30));
                        U0.append("\n                |It must declare the same attributes as the following styles:\n                |");
                        U0.append(g.E(T, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new StyleApplierUtils$Companion$getMissingStyleAttributesError$2(context), 30));
                        U0.append("\n                |\n                ");
                        sb.append(StringsKt__IndentKt.Z(U0.toString(), (String) null, 1));
                        z = true;
                        z2 = true;
                    }
                }
            }
            if (z2) {
                throw new AssertionError(sb);
            }
        }
    }
}
