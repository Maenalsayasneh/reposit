package i0.b.a;

import android.util.Log;
import i0.d.a.a.a;

/* compiled from: DebugTimer */
public class j implements l0 {
    public final String a;
    public long b = -1;
    public String c = null;

    public j(String str) {
        this.a = str;
    }

    public void a(String str) {
        if (this.b == -1) {
            this.b = System.nanoTime();
            this.c = str;
            return;
        }
        throw new IllegalStateException("Timer was already started");
    }

    public void stop() {
        if (this.b != -1) {
            Log.d(this.a, String.format(a.y0(new StringBuilder(), this.c, ": %.3fms"), new Object[]{Float.valueOf(((float) (System.nanoTime() - this.b)) / 1000000.0f)}));
            this.b = -1;
            this.c = null;
            return;
        }
        throw new IllegalStateException("Timer was not started");
    }
}
