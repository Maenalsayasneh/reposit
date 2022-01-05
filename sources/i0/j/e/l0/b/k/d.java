package i0.j.e.l0.b.k;

import android.content.Context;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.util.FileUtils;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.l0.b.j.a;
import i0.j.e.l0.b.j.b;
import i0.j.e.l0.b.k.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

/* compiled from: FileInspector */
public class d extends a<b> {
    public d(e eVar) {
        super(eVar);
    }

    public Collection<b> a() {
        i0.j.e.l0.b.k.j.b bVar;
        Collection<b> collection;
        Collection<b> collection2;
        long j;
        LinkedList linkedList = new LinkedList();
        Objects.requireNonNull((e) this.a);
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext == null) {
            bVar = null;
        } else {
            bVar = new i0.j.e.l0.b.k.j.b(DiskUtils.getInsatbugLogDirectory("logs/", applicationContext).getAbsolutePath(), new g[]{new i0.j.e.l0.b.k.j.a()}, com.instabug.library.internal.b.i.a.DISABLED_LOGS);
        }
        if (bVar == null) {
            collection = Collections.emptyList();
        } else {
            collection = Collections.singleton(bVar);
        }
        for (b bVar2 : collection) {
            i c = bVar2.c();
            com.instabug.library.internal.b.i.a a = bVar2.a();
            Collection<g> b = bVar2.b();
            h hVar = (h) c;
            i.a aVar = hVar.b;
            String str = hVar.a;
            Objects.requireNonNull(aVar);
            LinkedList<f> linkedList2 = new LinkedList<>();
            try {
                File file = new File(str);
                File[] listFiles = file.listFiles();
                if (file.exists() && listFiles != null) {
                    for (File dVar : listFiles) {
                        linkedList2.add(new i0.j.e.l0.b.k.j.d(dVar));
                    }
                }
            } catch (Exception e) {
                InstabugSDKLogger.e(aVar, e.getMessage(), e);
            }
            if (a.c()) {
                collection2 = c(linkedList2);
            } else {
                i.a aVar2 = hVar.b;
                String str2 = hVar.a;
                Objects.requireNonNull(aVar2);
                try {
                    j = FileUtils.getSize(new File(str2));
                } catch (Exception e2) {
                    InstabugSDKLogger.e(aVar2, e2.getMessage(), e2);
                    j = 0;
                }
                long a2 = a.a();
                long b2 = a.b();
                HashSet hashSet = new HashSet();
                if (j > b2) {
                    Collections.sort(linkedList2, new c());
                    ArrayList arrayList = new ArrayList(linkedList2.size());
                    for (f fVar : linkedList2) {
                        if (j <= b2) {
                            break;
                        } else if (!b(fVar, b)) {
                            arrayList.add(fVar);
                            j -= fVar.a.length();
                        }
                    }
                    hashSet.addAll(arrayList);
                }
                LinkedList linkedList3 = new LinkedList();
                for (f fVar2 : linkedList2) {
                    if (fVar2.a() > a2 && !b(fVar2, b)) {
                        linkedList3.add(fVar2);
                    }
                }
                hashSet.addAll(linkedList3);
                collection2 = c(hashSet);
            }
            linkedList.addAll(collection2);
        }
        return linkedList;
    }

    public boolean b(f fVar, Collection<g> collection) {
        for (g a : collection) {
            if (a.a(fVar)) {
                return true;
            }
        }
        return false;
    }

    public Collection<b> c(Collection<f> collection) {
        LinkedList linkedList = new LinkedList();
        for (f aVar : collection) {
            linkedList.add(new a(aVar));
        }
        return linkedList;
    }
}
