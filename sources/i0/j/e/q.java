package i0.j.e;

import com.instabug.library.util.filters.Filters;
import i0.j.e.d1.d.a;
import i0.j.e.d1.d.d;

/* compiled from: InstabugDelegate */
public class q implements Runnable {
    public final /* synthetic */ String c;

    public q(String str) {
        this.c = str;
    }

    public void run() {
        Filters.applyOn(this.c).apply(new a()).thenDo(new d());
    }
}
