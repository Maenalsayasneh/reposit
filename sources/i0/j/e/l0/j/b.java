package i0.j.e.l0.j;

import com.instabug.library.internal.orchestrator.Action;
import i0.j.e.l0.b.j.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/* compiled from: DisposeDataAction */
public class b implements Action {
    public final Collection<a<?>> a;

    public b(a<?> aVar, a<?>... aVarArr) {
        if (aVarArr.length == 0) {
            this.a = Collections.singleton(aVar);
            return;
        }
        LinkedList linkedList = new LinkedList();
        this.a = linkedList;
        linkedList.add(aVar);
        linkedList.addAll(Arrays.asList(aVarArr));
    }

    public void run() {
        HashSet<a> hashSet = new HashSet<>();
        for (a<?> add : this.a) {
            hashSet.add(add);
        }
        LinkedList<i0.j.e.l0.b.j.b> linkedList = new LinkedList<>();
        for (a a2 : hashSet) {
            linkedList.addAll(a2.a());
        }
        for (i0.j.e.l0.b.j.b dispose : linkedList) {
            dispose.dispose();
        }
    }
}
