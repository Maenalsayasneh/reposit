package i0.p.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import com.theartofdev.edmodo.cropper.CropImageActivity;
import com.theartofdev.edmodo.cropper.CropImageView;
import i0.p.a.a.c;
import java.lang.ref.WeakReference;

/* compiled from: BitmapCroppingWorkerTask */
public final class a extends AsyncTask<Void, Void, C0222a> {
    public final WeakReference<CropImageView> a;
    public final Bitmap b;
    public final Uri c;
    public final Context d;
    public final float[] e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final CropImageView.RequestSizeOptions p;
    public final Uri q;
    public final Bitmap.CompressFormat r;
    public final int s;

    public a(CropImageView cropImageView, Bitmap bitmap, float[] fArr, int i2, boolean z, int i3, int i4, int i5, int i6, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri, Bitmap.CompressFormat compressFormat, int i7) {
        CropImageView cropImageView2 = cropImageView;
        this.a = new WeakReference<>(cropImageView);
        this.d = cropImageView.getContext();
        this.b = bitmap;
        this.e = fArr;
        this.c = null;
        this.f = i2;
        this.i = z;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = z2;
        this.o = z3;
        this.p = requestSizeOptions;
        this.q = uri;
        this.r = compressFormat;
        this.s = i7;
        this.g = 0;
        this.h = 0;
    }

    public Object doInBackground(Object[] objArr) {
        c.a aVar;
        Void[] voidArr = (Void[]) objArr;
        boolean z = true;
        try {
            if (isCancelled()) {
                return null;
            }
            Uri uri = this.c;
            if (uri != null) {
                aVar = c.c(this.d, uri, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
            } else {
                Bitmap bitmap = this.b;
                if (bitmap == null) {
                    return new C0222a((Bitmap) null, 1);
                }
                aVar = c.e(bitmap, this.e, this.f, this.i, this.j, this.k, this.n, this.o);
            }
            Bitmap u = c.u(aVar.a, this.l, this.m, this.p);
            Uri uri2 = this.q;
            if (uri2 == null) {
                return new C0222a(u, aVar.b);
            }
            c.v(this.d, u, uri2, this.r, this.s);
            if (u != null) {
                u.recycle();
            }
            return new C0222a(this.q, aVar.b);
        } catch (Exception e2) {
            if (this.q == null) {
                z = false;
            }
            return new C0222a(e2, z);
        }
    }

    public void onPostExecute(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        C0222a aVar = (C0222a) obj;
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = (CropImageView) this.a.get()) != null) {
                z = true;
                cropImageView.F2 = null;
                cropImageView.h();
                CropImageView.c cVar = cropImageView.u2;
                if (cVar != null) {
                    Uri uri = aVar.b;
                    Exception exc = aVar.c;
                    cropImageView.getCropPoints();
                    cropImageView.getCropRect();
                    cropImageView.getWholeImageRect();
                    cropImageView.getRotatedDegrees();
                    ((CropImageActivity) cVar).q0(uri, exc, aVar.d);
                }
            }
            if (!z && (bitmap = aVar.a) != null) {
                bitmap.recycle();
            }
        }
    }

    /* renamed from: i0.p.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: BitmapCroppingWorkerTask */
    public static final class C0222a {
        public final Bitmap a;
        public final Uri b;
        public final Exception c;
        public final int d;

        public C0222a(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = null;
            this.c = null;
            this.d = i;
        }

        public C0222a(Uri uri, int i) {
            this.a = null;
            this.b = uri;
            this.c = null;
            this.d = i;
        }

        public C0222a(Exception exc, boolean z) {
            this.a = null;
            this.b = null;
            this.c = exc;
            this.d = 1;
        }
    }

    public a(CropImageView cropImageView, Uri uri, float[] fArr, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, boolean z2, boolean z3, CropImageView.RequestSizeOptions requestSizeOptions, Uri uri2, Bitmap.CompressFormat compressFormat, int i9) {
        CropImageView cropImageView2 = cropImageView;
        this.a = new WeakReference<>(cropImageView);
        this.d = cropImageView.getContext();
        this.c = uri;
        this.e = fArr;
        this.f = i2;
        this.i = z;
        this.j = i5;
        this.k = i6;
        this.g = i3;
        this.h = i4;
        this.l = i7;
        this.m = i8;
        this.n = z2;
        this.o = z3;
        this.p = requestSizeOptions;
        this.q = uri2;
        this.r = compressFormat;
        this.s = i9;
        this.b = null;
    }
}
