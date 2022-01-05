package j$.time.format;

import j$.time.chrono.h;
import j$.time.format.c;
import java.util.function.Consumer;

public final /* synthetic */ class b implements Consumer {
    public final /* synthetic */ c.m a;
    public final /* synthetic */ d b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ b(c.m mVar, d dVar, long j, int i, int i2) {
        this.a = mVar;
        this.b = dVar;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public final void accept(Object obj) {
        h hVar = (h) obj;
        this.a.d(this.b, this.c, this.d, this.e);
    }
}
