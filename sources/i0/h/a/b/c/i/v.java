package i0.h.a.b.c.i;

import android.content.Context;
import android.util.SparseIntArray;
import i0.h.a.b.c.c;
import i0.h.a.b.c.g.a;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class v {
    public final SparseIntArray a = new SparseIntArray();
    public c b;

    public v(c cVar) {
        Objects.requireNonNull(cVar, "null reference");
        this.b = cVar;
    }

    public final int a(Context context, a.f fVar) {
        Objects.requireNonNull(context, "null reference");
        Objects.requireNonNull(fVar, "null reference");
        int i = 0;
        if (!fVar.i()) {
            return 0;
        }
        int j = fVar.j();
        int i2 = this.a.get(j, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.a.keyAt(i3);
            if (keyAt > j && this.a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.b.b(context, j);
        }
        this.a.put(j, i);
        return i;
    }
}
