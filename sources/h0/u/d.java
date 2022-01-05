package h0.u;

import androidx.paging.LoadType;
import m0.n.b.i;

/* compiled from: DataSource.kt */
public final class d<K> {
    public final LoadType a;
    public final K b;

    public d(LoadType loadType, K k, int i, boolean z, int i2) {
        i.e(loadType, "type");
        this.a = loadType;
        this.b = k;
        if (loadType != LoadType.REFRESH && k == null) {
            throw new IllegalArgumentException("Key must be non-null for prepend/append");
        }
    }
}
