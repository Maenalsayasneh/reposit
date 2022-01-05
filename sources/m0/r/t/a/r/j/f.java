package m0.r.t.a.r.j;

import java.util.Comparator;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.h;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.r;

/* compiled from: MemberComparator */
public class f implements Comparator<i> {
    public static final f c = new f();

    public static int a(i iVar) {
        if (d.r(iVar)) {
            return 8;
        }
        if (iVar instanceof h) {
            return 7;
        }
        if (iVar instanceof c0) {
            return ((c0) iVar).l0() == null ? 6 : 5;
        }
        if (iVar instanceof r) {
            return ((r) iVar).l0() == null ? 4 : 3;
        }
        if (iVar instanceof d) {
            return 2;
        }
        return iVar instanceof l0 ? 1 : 0;
    }

    public int compare(Object obj, Object obj2) {
        Integer num;
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        int a = a(iVar2) - a(iVar);
        if (a != 0) {
            num = Integer.valueOf(a);
        } else if (!d.r(iVar) || !d.r(iVar2)) {
            int compareTo = iVar.getName().c.compareTo(iVar2.getName().c);
            num = compareTo != 0 ? Integer.valueOf(compareTo) : null;
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
