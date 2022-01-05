package h0.i.f;

import android.content.Context;
import h0.i.f.j;
import java.util.concurrent.Callable;

/* compiled from: FontRequestWorker */
public class f implements Callable<j.a> {
    public final /* synthetic */ String c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ e q;
    public final /* synthetic */ int x;

    public f(String str, Context context, e eVar, int i) {
        this.c = str;
        this.d = context;
        this.q = eVar;
        this.x = i;
    }

    public Object call() throws Exception {
        return j.a(this.c, this.d, this.q, this.x);
    }
}
