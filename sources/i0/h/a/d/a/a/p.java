package i0.h.a.d.a.a;

import android.content.Context;
import java.io.File;

public final class p {
    public final Context a;

    public p(Context context) {
        this.a = context;
    }

    public static long a(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File a2 : listFiles) {
                j += a(a2);
            }
        }
        return j;
    }
}
