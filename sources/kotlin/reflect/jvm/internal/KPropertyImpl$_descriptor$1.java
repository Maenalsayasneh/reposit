package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.n;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.g.d;
import m0.t.c;

/* compiled from: KPropertyImpl.kt */
public final class KPropertyImpl$_descriptor$1 extends Lambda implements a<c0> {
    public final /* synthetic */ KPropertyImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KPropertyImpl$_descriptor$1(KPropertyImpl kPropertyImpl) {
        super(0);
        this.c = kPropertyImpl;
    }

    public Object invoke() {
        String str;
        KPropertyImpl kPropertyImpl = this.c;
        KDeclarationContainerImpl kDeclarationContainerImpl = kPropertyImpl.a2;
        String str2 = kPropertyImpl.b2;
        String str3 = kPropertyImpl.c2;
        Objects.requireNonNull(kDeclarationContainerImpl);
        i.e(str2, "name");
        i.e(str3, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        Regex regex = KDeclarationContainerImpl.d;
        Objects.requireNonNull(regex);
        i.e(str3, "input");
        Matcher matcher = regex.c.matcher(str3);
        i.d(matcher, "nativePattern.matcher(input)");
        c cVar = !matcher.matches() ? null : new c(matcher, str3);
        boolean z = true;
        if (cVar != null) {
            i.e(cVar, "match");
            String str4 = cVar.a().get(1);
            c0 p = kDeclarationContainerImpl.p(Integer.parseInt(str4));
            if (p != null) {
                return p;
            }
            StringBuilder T0 = i0.d.a.a.a.T0("Local property #", str4, " not found in ");
            T0.append(kDeclarationContainerImpl.h());
            throw new KotlinReflectionInternalError(T0.toString());
        }
        d g = d.g(str2);
        i.d(g, "Name.identifier(name)");
        Collection<c0> s = kDeclarationContainerImpl.s(g);
        ArrayList arrayList = new ArrayList();
        for (T next : s) {
            n nVar = n.b;
            if (i.a(n.c((c0) next).a(), str3)) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder U0 = i0.d.a.a.a.U0("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
            U0.append(kDeclarationContainerImpl);
            throw new KotlinReflectionInternalError(U0.toString());
        } else if (arrayList.size() == 1) {
            return (c0) g.j0(arrayList);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                p visibility = ((c0) next2).getVisibility();
                Object obj = linkedHashMap.get(visibility);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(visibility, obj);
                }
                ((List) obj).add(next2);
            }
            m0.r.t.a.g gVar = m0.r.t.a.g.c;
            i.e(linkedHashMap, "$this$toSortedMap");
            i.e(gVar, "comparator");
            TreeMap treeMap = new TreeMap(gVar);
            treeMap.putAll(linkedHashMap);
            Collection values = treeMap.values();
            i.d(values, "properties\n             …                }).values");
            List list = (List) g.F(values);
            if (list.size() == 1) {
                i.d(list, "mostVisibleProperties");
                return (c0) g.u(list);
            }
            d g2 = d.g(str2);
            i.d(g2, "Name.identifier(name)");
            String E = g.E(kDeclarationContainerImpl.s(g2), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, KDeclarationContainerImpl$findPropertyDescriptor$allMembers$1.c, 30);
            StringBuilder U02 = i0.d.a.a.a.U0("Property '", str2, "' (JVM signature: ", str3, ") not resolved in ");
            U02.append(kDeclarationContainerImpl);
            U02.append(':');
            if (E.length() != 0) {
                z = false;
            }
            if (z) {
                str = " no members found";
            } else {
                str = 10 + E;
            }
            U02.append(str);
            throw new KotlinReflectionInternalError(U02.toString());
        }
    }
}
