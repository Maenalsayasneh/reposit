package i0.j.e.l0.b.k.j;

import com.instabug.library.util.TimeUtils;
import i0.j.e.l0.b.k.f;
import i0.j.e.q0.e;
import java.io.File;

/* compiled from: LogFileRecord */
public class d extends f {
    public d(File file) {
        super(file);
    }

    public long a() {
        long b = e.b(this.a);
        return b == -1 ? super.a() : TimeUtils.currentTimeMillis() - b;
    }
}
