package i0.e.e.k.a;

import android.content.Context;
import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import com.clubhouse.android.data.network.AbstractDataSource;
import m0.n.b.i;
import q0.f0;
import t0.h;

/* compiled from: WaveDataSource.kt */
public final class b extends AbstractDataSource {
    public final a e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, h<f0, ErrorResponse> hVar, Context context) {
        super(hVar, context);
        i.e(aVar, "waveApi");
        i.e(hVar, "errorConverter");
        i.e(context, "context");
        this.e = aVar;
    }
}
