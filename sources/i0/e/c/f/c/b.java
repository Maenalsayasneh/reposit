package i0.e.c.f.c;

import android.content.Context;
import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import com.clubhouse.android.data.network.AbstractDataSource;
import m0.n.b.i;
import q0.f0;
import t0.h;

/* compiled from: ChatDataSource.kt */
public final class b extends AbstractDataSource {
    public final a e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, h<f0, ErrorResponse> hVar, Context context) {
        super(hVar, context);
        i.e(aVar, "chatApi");
        i.e(hVar, "converter");
        i.e(context, "context");
        this.e = aVar;
    }
}
