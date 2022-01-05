package i0.h.a.d.a.b;

import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class h2 implements FilenameFilter {
    public static final FilenameFilter a = new h2();

    public final boolean accept(File file, String str) {
        return i2.a.matcher(str).matches();
    }
}
