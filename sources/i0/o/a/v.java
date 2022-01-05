package i0.o.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.util.Objects;
import r0.y;

/* compiled from: RequestHandler */
public abstract class v {
    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, t tVar) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                d = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                if (tVar.k) {
                    i5 = Math.max(floor, floor2);
                } else {
                    i5 = Math.min(floor, floor2);
                }
            }
            i5 = (int) d;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i, int i2, BitmapFactory.Options options, t tVar) {
        a(i, i2, options.outWidth, options.outHeight, options, tVar);
    }

    public static BitmapFactory.Options d(t tVar) {
        boolean a2 = tVar.a();
        boolean z = tVar.r != null;
        BitmapFactory.Options options = null;
        if (a2 || z || tVar.q) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = a2;
            boolean z2 = tVar.q;
            options.inInputShareable = z2;
            options.inPurgeable = z2;
            if (z) {
                options.inPreferredConfig = tVar.r;
            }
        }
        return options;
    }

    public abstract boolean c(t tVar);

    public int e() {
        return 0;
    }

    public abstract a f(t tVar, int i) throws IOException;

    public boolean g(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* compiled from: RequestHandler */
    public static final class a {
        public final Picasso.LoadedFrom a;
        public final Bitmap b;
        public final y c;
        public final int d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(y yVar, Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) null, yVar, loadedFrom, 0);
            StringBuilder sb = b0.a;
            Objects.requireNonNull(yVar, "source == null");
        }

        public a(Bitmap bitmap, y yVar, Picasso.LoadedFrom loadedFrom, int i) {
            if ((bitmap != null) != (yVar == null ? false : true)) {
                this.b = bitmap;
                this.c = yVar;
                StringBuilder sb = b0.a;
                Objects.requireNonNull(loadedFrom, "loadedFrom == null");
                this.a = loadedFrom;
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }
}
