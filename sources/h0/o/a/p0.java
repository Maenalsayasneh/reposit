package h0.o.a;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter */
public final class p0 extends Writer {
    public final String c;
    public StringBuilder d = new StringBuilder(128);

    public p0(String str) {
        this.c = str;
    }

    public final void a() {
        if (this.d.length() > 0) {
            Log.d(this.c, this.d.toString());
            StringBuilder sb = this.d;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == 10) {
                a();
            } else {
                this.d.append(c2);
            }
        }
    }
}
