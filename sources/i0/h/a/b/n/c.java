package i0.h.a.b.n;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import i0.h.a.b.c.g.b;
import i0.h.a.b.c.g.j.n;
import i0.h.a.b.m.g;
import i0.h.a.b.n.d;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public class c extends b<d.a> {
    public c(Context context, d.a aVar) {
        super(context, d.a, aVar, b.a.a);
    }

    @RecentlyNonNull
    public g<Boolean> d(@RecentlyNonNull IsReadyToPayRequest isReadyToPayRequest) {
        n.a a = n.a();
        a.d = 23705;
        a.a = new g(isReadyToPayRequest);
        return c(0, a.a());
    }
}
