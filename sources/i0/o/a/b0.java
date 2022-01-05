package i0.o.a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;

/* compiled from: Utils */
public final class b0 {
    public static final StringBuilder a = new StringBuilder();
    public static final ByteString b;
    public static final ByteString c;

    /* compiled from: Utils */
    public static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* compiled from: Utils */
    public static class b implements ThreadFactory {
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    static {
        ByteString.a aVar = ByteString.d;
        b = aVar.c("RIFF");
        c = aVar.c("WEBP");
    }

    public static String a(t tVar, StringBuilder sb) {
        Objects.requireNonNull(tVar);
        Uri uri = tVar.d;
        if (uri != null) {
            String uri2 = uri.toString();
            sb.ensureCapacity(uri2.length() + 50);
            sb.append(uri2);
        } else {
            sb.ensureCapacity(50);
            sb.append(tVar.e);
        }
        sb.append(10);
        if (tVar.m != 0.0f) {
            sb.append("rotation:");
            sb.append(tVar.m);
            if (tVar.p) {
                sb.append('@');
                sb.append(tVar.n);
                sb.append('x');
                sb.append(tVar.o);
            }
            sb.append(10);
        }
        if (tVar.a()) {
            sb.append("resize:");
            sb.append(tVar.g);
            sb.append('x');
            sb.append(tVar.h);
            sb.append(10);
        }
        if (tVar.i) {
            sb.append("centerCrop:");
            sb.append(tVar.j);
            sb.append(10);
        } else if (tVar.k) {
            sb.append("centerInside");
            sb.append(10);
        }
        List<z> list = tVar.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(tVar.f.get(i).b());
                sb.append(10);
            }
        }
        return sb.toString();
    }

    public static int b(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    public static String c(c cVar) {
        return d(cVar, "");
    }

    public static String d(c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        a aVar = cVar.h2;
        if (aVar != null) {
            sb.append(aVar.b.b());
        }
        List<a> list = cVar.i2;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || aVar != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).b.b());
            }
        }
        return sb.toString();
    }

    public static boolean e() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void f(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }
}
