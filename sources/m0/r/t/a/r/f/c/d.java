package m0.r.t.a.r.f.c;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: NameResolverImpl.kt */
public final class d implements c {
    public final ProtoBuf$StringTable a;
    public final ProtoBuf$QualifiedNameTable b;

    public d(ProtoBuf$StringTable protoBuf$StringTable, ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        i.e(protoBuf$StringTable, "strings");
        i.e(protoBuf$QualifiedNameTable, "qualifiedNames");
        this.a = protoBuf$StringTable;
        this.b = protoBuf$QualifiedNameTable;
    }

    public String a(int i) {
        Triple<List<String>, List<String>, Boolean> d = d(i);
        List list = (List) d.c;
        String E = g.E((List) d.d, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        if (list.isEmpty()) {
            return E;
        }
        return g.E(list, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62) + '/' + E;
    }

    public String b(int i) {
        String str = (String) this.a.x.get(i);
        i.d(str, "strings.getString(index)");
        return str;
    }

    public boolean c(int i) {
        return ((Boolean) d(i).q).booleanValue();
    }

    public final Triple<List<String>, List<String>, Boolean> d(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            ProtoBuf$QualifiedNameTable.QualifiedName qualifiedName = this.b.x.get(i);
            String str = (String) this.a.x.get(qualifiedName.Y1);
            ProtoBuf$QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.Z1;
            i.c(kind);
            int ordinal = kind.ordinal();
            if (ordinal == 0) {
                linkedList2.addFirst(str);
            } else if (ordinal == 1) {
                linkedList.addFirst(str);
            } else if (ordinal == 2) {
                linkedList2.addFirst(str);
                z = true;
            }
            i = qualifiedName.y;
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
