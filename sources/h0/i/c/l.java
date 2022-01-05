package h0.i.c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.instabug.library.network.RequestResponse;
import h0.i.b.d.d;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl */
public class l {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, d> a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl */
    public interface a<T> {
        int a(T t);

        boolean b(T t);
    }

    public static <T> T e(T[] tArr, int i, a<T> aVar) {
        int i2 = (i & 1) == 0 ? RequestResponse.HttpStatusCode._4xx.BAD_REQUEST : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(aVar.a(t2) - i2) * 2) + (aVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, d dVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, h0.i.f.l[] lVarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File R = g0.a.b.b.a.R(context);
        if (R == null) {
            return null;
        }
        try {
            if (!g0.a.b.b.a.v(R, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(R.getPath());
            R.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            R.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File R = g0.a.b.b.a.R(context);
        if (R == null) {
            return null;
        }
        try {
            if (!g0.a.b.b.a.u(R, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(R.getPath());
            R.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            R.delete();
        }
    }
}
