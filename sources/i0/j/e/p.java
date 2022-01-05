package i0.j.e;

import android.util.Pair;
import com.instabug.library.util.filters.Filters;
import i0.j.e.d1.d.c;
import i0.j.e.d1.d.e;

/* compiled from: InstabugDelegate */
public class p implements Runnable {
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public p(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public void run() {
        Filters.applyOn(new Pair(this.c, this.d)).apply(new c()).thenDo(new e());
    }
}
