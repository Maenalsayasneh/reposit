package i0.h.a.a.i.v;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.EnumMap;

/* compiled from: PriorityMapping */
public final class a {
    public static SparseArray<Priority> a = new SparseArray<>();
    public static EnumMap<Priority, Integer> b;

    static {
        EnumMap<Priority, Integer> enumMap = new EnumMap<>(Priority.class);
        b = enumMap;
        enumMap.put(Priority.DEFAULT, 0);
        b.put(Priority.VERY_LOW, 1);
        b.put(Priority.HIGHEST, 2);
        for (Priority next : b.keySet()) {
            a.append(b.get(next).intValue(), next);
        }
    }

    public static int a(Priority priority) {
        Integer num = b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i) {
        Priority priority = a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.e0("Unknown Priority for value ", i));
    }
}
