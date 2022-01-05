package i0.o.a;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.io.IOException;
import q0.a0;
import q0.b0;
import q0.d;
import q0.e0;
import q0.f;

/* compiled from: OkHttp3Downloader */
public final class q implements j {
    public final f.a a;

    public q(Context context) {
        long j;
        StringBuilder sb = b0.a;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        long max = Math.max(Math.min(j, 52428800), 5242880);
        a0.a aVar = new a0.a();
        aVar.k = new d(file, max);
        this.a = new a0(aVar);
    }

    public e0 a(b0 b0Var) throws IOException {
        return this.a.newCall(b0Var).execute();
    }

    public q(a0 a0Var) {
        this.a = a0Var;
        d dVar = a0Var.g2;
    }
}
