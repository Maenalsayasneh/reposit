package i0.h.a.b.c.g;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i0.h.a.b.c.g.h;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class e<R extends h> extends BasePendingResult<R> {
    public final R l;

    public e(c cVar, R r) {
        super(cVar);
        this.l = r;
    }

    public final R b(Status status) {
        return this.l;
    }
}
