package q0.h0.j;

import okhttp3.internal.http2.ErrorCode;
import q0.h0.f.a;

/* compiled from: TaskQueue.kt */
public final class i extends a {
    public final /* synthetic */ d e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ErrorCode g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, boolean z, String str2, boolean z2, d dVar, int i, ErrorCode errorCode) {
        super(str2, z2);
        this.e = dVar;
        this.f = i;
        this.g = errorCode;
    }

    public long a() {
        this.e.g2.c(this.f, this.g);
        synchronized (this.e) {
            this.e.w2.remove(Integer.valueOf(this.f));
        }
        return -1;
    }
}
