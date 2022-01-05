package q0.h0.k;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import m0.n.b.i;
import r0.p;
import r0.w;
import r0.y;

/* compiled from: FileSystem.kt */
public final class a implements b {
    public y a(File file) throws FileNotFoundException {
        i.e(file, "file");
        Logger logger = p.a;
        i.e(file, "$this$source");
        return m0.r.t.a.r.m.a1.a.D3(new FileInputStream(file));
    }

    public w b(File file) throws FileNotFoundException {
        i.e(file, "file");
        try {
            return m0.r.t.a.r.m.a1.a.C3(file, false, 1, (Object) null);
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            return m0.r.t.a.r.m.a1.a.C3(file, false, 1, (Object) null);
        }
    }

    public void c(File file) throws IOException {
        i.e(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                i.d(file2, "file");
                if (file2.isDirectory()) {
                    c(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    public boolean d(File file) {
        i.e(file, "file");
        return file.exists();
    }

    public void e(File file, File file2) throws IOException {
        i.e(file, "from");
        i.e(file2, "to");
        f(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }

    public void f(File file) throws IOException {
        i.e(file, "file");
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public w g(File file) throws FileNotFoundException {
        i.e(file, "file");
        try {
            Logger logger = p.a;
            i.e(file, "$this$appendingSink");
            return m0.r.t.a.r.m.a1.a.A3(new FileOutputStream(file, true));
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = p.a;
            i.e(file, "$this$appendingSink");
            return m0.r.t.a.r.m.a1.a.A3(new FileOutputStream(file, true));
        }
    }

    public long h(File file) {
        i.e(file, "file");
        return file.length();
    }

    public String toString() {
        return "FileSystem.SYSTEM";
    }
}
