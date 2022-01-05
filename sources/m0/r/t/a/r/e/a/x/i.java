package m0.r.t.a.r.e.a.x;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents$jvmDescriptor$1;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m0.j.g;
import m0.j.l;
import m0.j.m;
import m0.j.n;
import m0.r.t.a.r.e.b.p;

/* compiled from: predefinedEnhancementInfo.kt */
public final class i {
    public final Map<String, h> a = new LinkedHashMap();

    /* compiled from: predefinedEnhancementInfo.kt */
    public final class a {
        public final String a;
        public final /* synthetic */ i b;

        /* renamed from: m0.r.t.a.r.e.a.x.i$a$a  reason: collision with other inner class name */
        /* compiled from: predefinedEnhancementInfo.kt */
        public final class C0258a {
            public final String a;
            public final List<Pair<String, k>> b = new ArrayList();
            public Pair<String, k> c = new Pair<>("V", null);
            public final /* synthetic */ a d;

            public C0258a(a aVar, String str) {
                m0.n.b.i.e(aVar, "this$0");
                m0.n.b.i.e(str, "functionName");
                this.d = aVar;
                this.a = str;
            }

            public final void a(String str, e... eVarArr) {
                k kVar;
                m0.n.b.i.e(str, "type");
                m0.n.b.i.e(eVarArr, "qualifiers");
                List<Pair<String, k>> list = this.b;
                if (eVarArr.length == 0) {
                    kVar = null;
                } else {
                    Iterable E4 = h.E4(eVarArr);
                    int R2 = h.R2(h.K(E4, 10));
                    if (R2 < 16) {
                        R2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
                    Iterator it = ((m) E4).iterator();
                    while (true) {
                        n nVar = (n) it;
                        if (!nVar.hasNext()) {
                            break;
                        }
                        l lVar = (l) nVar.next();
                        linkedHashMap.put(Integer.valueOf(lVar.a), (e) lVar.b);
                    }
                    kVar = new k(linkedHashMap);
                }
                list.add(new Pair(str, kVar));
            }

            public final void b(String str, e... eVarArr) {
                m0.n.b.i.e(str, "type");
                m0.n.b.i.e(eVarArr, "qualifiers");
                Iterable E4 = h.E4(eVarArr);
                int R2 = h.R2(h.K(E4, 10));
                if (R2 < 16) {
                    R2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(R2);
                Iterator it = ((m) E4).iterator();
                while (true) {
                    n nVar = (n) it;
                    if (nVar.hasNext()) {
                        l lVar = (l) nVar.next();
                        linkedHashMap.put(Integer.valueOf(lVar.a), (e) lVar.b);
                    } else {
                        this.c = new Pair<>(str, new k(linkedHashMap));
                        return;
                    }
                }
            }

            public final void c(JvmPrimitiveType jvmPrimitiveType) {
                m0.n.b.i.e(jvmPrimitiveType, "type");
                String desc = jvmPrimitiveType.getDesc();
                m0.n.b.i.d(desc, "type.desc");
                this.c = new Pair<>(desc, null);
            }
        }

        public a(i iVar, String str) {
            m0.n.b.i.e(iVar, "this$0");
            m0.n.b.i.e(str, "className");
            this.b = iVar;
            this.a = str;
        }

        public final void a(String str, m0.n.a.l<? super C0258a, m0.i> lVar) {
            String str2 = str;
            m0.n.a.l<? super C0258a, m0.i> lVar2 = lVar;
            m0.n.b.i.e(str2, "name");
            m0.n.b.i.e(lVar2, "block");
            Map<String, h> map = this.b.a;
            C0258a aVar = new C0258a(this, str2);
            lVar2.invoke(aVar);
            p pVar = p.a;
            String str3 = aVar.d.a;
            String str4 = aVar.a;
            List<Pair<String, k>> list = aVar.b;
            ArrayList arrayList = new ArrayList(h.K(list, 10));
            for (Pair pair : list) {
                arrayList.add((String) pair.c);
            }
            String str5 = (String) aVar.c.c;
            m0.n.b.i.e(str4, "name");
            m0.n.b.i.e(arrayList, InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS);
            m0.n.b.i.e(str5, "ret");
            String i = pVar.i(str3, str4 + '(' + g.E(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new SignatureBuildingComponents$jvmDescriptor$1(pVar), 30) + ')' + pVar.b(str5));
            k kVar = (k) aVar.c.d;
            List<Pair<String, k>> list2 = aVar.b;
            ArrayList arrayList2 = new ArrayList(h.K(list2, 10));
            for (Pair pair2 : list2) {
                arrayList2.add((k) pair2.d);
            }
            map.put(i, new h(kVar, arrayList2));
        }
    }
}
