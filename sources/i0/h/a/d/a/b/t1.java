package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import i0.d.a.a.a;
import i0.h.a.d.a.e.f;
import java.io.File;
import java.io.IOException;

public final class t1 {
    public static final f a = new f("MergeSliceTaskHandler");
    public final y b;

    public t1(y yVar) {
        this.b = yVar;
    }

    public static void b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                String valueOf = String.valueOf(file);
                throw new bv(a.y0(new StringBuilder(valueOf.length() + 28), "Unable to delete directory: ", valueOf));
            }
        } else if (file2.exists()) {
            String valueOf2 = String.valueOf(file2);
            throw new bv(a.y0(new StringBuilder(valueOf2.length() + 51), "File clashing with existing file from other slice: ", valueOf2));
        } else if (!file.renameTo(file2)) {
            String valueOf3 = String.valueOf(file);
            throw new bv(a.y0(new StringBuilder(valueOf3.length() + 21), "Unable to move file: ", valueOf3));
        }
    }

    public final void a(s1 s1Var) {
        File k = this.b.k(s1Var.b, s1Var.c, s1Var.d, s1Var.e);
        if (k.exists()) {
            File l = this.b.l(s1Var.b, s1Var.c, s1Var.d);
            if (!l.exists()) {
                l.mkdirs();
            }
            b(k, l);
            try {
                this.b.n(s1Var.b, s1Var.c, s1Var.d, this.b.m(s1Var.b, s1Var.c, s1Var.d) + 1);
            } catch (IOException e) {
                a.b(6, "Writing merge checkpoint failed with %s.", new Object[]{e.getMessage()});
                throw new bv("Writing merge checkpoint failed.", e, s1Var.a);
            }
        } else {
            throw new bv(String.format("Cannot find verified files for slice %s.", new Object[]{s1Var.e}), s1Var.a);
        }
    }
}
