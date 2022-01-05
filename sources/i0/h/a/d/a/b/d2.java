package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import i0.h.a.b.c.m.b;
import i0.h.a.d.a.e.a0;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.e.z;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

public final class d2 {
    public static final f a = new f("PatchSliceTaskHandler");
    public final y b;
    public final a0<e3> c;

    public d2(y yVar, a0<e3> a0Var) {
        this.b = yVar;
        this.c = a0Var;
    }

    public final void a(c2 c2Var) {
        InputStream inputStream;
        File i = this.b.i(c2Var.b, c2Var.c, c2Var.d);
        y yVar = this.b;
        String str = c2Var.b;
        int i2 = c2Var.c;
        long j = c2Var.d;
        String str2 = c2Var.h;
        Objects.requireNonNull(yVar);
        File file = new File(new File(yVar.i(str, i2, j), "_metadata"), str2);
        try {
            inputStream = c2Var.j;
            if (c2Var.g == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            b0 b0Var = new b0(i, file);
            File j2 = this.b.j(c2Var.b, c2Var.e, c2Var.f, c2Var.h);
            if (!j2.exists()) {
                j2.mkdirs();
            }
            g2 g2Var = new g2(this.b, c2Var.b, c2Var.e, c2Var.f, c2Var.h);
            b.a0(b0Var, inputStream, new q0(j2, g2Var), c2Var.i);
            g2Var.d(0);
            inputStream.close();
            a.b(4, "Patching and extraction finished for slice %s of pack %s.", new Object[]{c2Var.h, c2Var.b});
            this.c.a().k(c2Var.a, c2Var.b, c2Var.h, 0);
            try {
                c2Var.j.close();
                return;
            } catch (IOException unused) {
                a.b(5, "Could not close file for slice %s of pack %s.", new Object[]{c2Var.h, c2Var.b});
                return;
            }
        } catch (IOException e) {
            a.b(6, "IOException during patching %s.", new Object[]{e.getMessage()});
            throw new bv(String.format("Error patching slice %s of pack %s.", new Object[]{c2Var.h, c2Var.b}), e, c2Var.a);
        } catch (Throwable th) {
            z.a.a(th, th);
        }
        throw th;
    }
}
