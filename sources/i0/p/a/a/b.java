package i0.p.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import com.instabug.library.settings.SettingsManager;
import com.theartofdev.edmodo.cropper.CropImageActivity;
import com.theartofdev.edmodo.cropper.CropImageView;
import h0.n.a.a;
import i0.p.a.a.c;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* compiled from: BitmapLoadingWorkerTask */
public final class b extends AsyncTask<Void, Void, a> {
    public final WeakReference<CropImageView> a;
    public final Uri b;
    public final Context c;
    public final int d;
    public final int e;

    public b(CropImageView cropImageView, Uri uri) {
        this.b = uri;
        this.a = new WeakReference<>(cropImageView);
        this.c = cropImageView.getContext();
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        double d2 = f > 1.0f ? (double) (1.0f / f) : 1.0d;
        this.d = (int) (((double) displayMetrics.widthPixels) * d2);
        this.e = (int) (((double) displayMetrics.heightPixels) * d2);
    }

    public Object doInBackground(Object[] objArr) {
        c.b bVar;
        Void[] voidArr = (Void[]) objArr;
        try {
            h0.n.a.a aVar = null;
            if (isCancelled()) {
                return null;
            }
            c.a i = c.i(this.c, this.b, this.d, this.e);
            if (isCancelled()) {
                return null;
            }
            Bitmap bitmap = i.a;
            Context context = this.c;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(this.b);
                if (openInputStream != null) {
                    h0.n.a.a aVar2 = new h0.n.a.a(openInputStream);
                    try {
                        openInputStream.close();
                    } catch (Exception unused) {
                    }
                    aVar = aVar2;
                }
            } catch (Exception unused2) {
            }
            int i2 = 0;
            if (aVar != null) {
                a.b d2 = aVar.d("Orientation");
                int i3 = 1;
                if (d2 != null) {
                    try {
                        i3 = d2.f(aVar.I);
                    } catch (NumberFormatException unused3) {
                    }
                }
                if (i3 == 3) {
                    i2 = SettingsManager.MAX_ASR_DURATION_IN_SECONDS;
                } else if (i3 == 6) {
                    i2 = 90;
                } else if (i3 == 8) {
                    i2 = 270;
                }
                bVar = new c.b(bitmap, i2);
            } else {
                bVar = new c.b(bitmap, 0);
            }
            return new a(this.b, bVar.a, i.b, bVar.b);
        } catch (Exception e2) {
            return new a(this.b, e2);
        }
    }

    public void onPostExecute(Object obj) {
        Bitmap bitmap;
        CropImageView cropImageView;
        a aVar = (a) obj;
        if (aVar != null) {
            boolean z = false;
            if (!isCancelled() && (cropImageView = (CropImageView) this.a.get()) != null) {
                cropImageView.E2 = null;
                cropImageView.h();
                if (aVar.e == null) {
                    int i = aVar.d;
                    cropImageView.d2 = i;
                    cropImageView.f(aVar.b, 0, aVar.a, aVar.c, i);
                }
                CropImageView.g gVar = cropImageView.t2;
                if (gVar != null) {
                    Exception exc = aVar.e;
                    CropImageActivity cropImageActivity = (CropImageActivity) gVar;
                    if (exc == null) {
                        Rect rect = cropImageActivity.q.F2;
                        if (rect != null) {
                            cropImageActivity.c.setCropRect(rect);
                        }
                        int i2 = cropImageActivity.q.G2;
                        if (i2 > -1) {
                            cropImageActivity.c.setRotatedDegrees(i2);
                        }
                    } else {
                        cropImageActivity.q0((Uri) null, exc, 1);
                    }
                }
                z = true;
            }
            if (!z && (bitmap = aVar.b) != null) {
                bitmap.recycle();
            }
        }
    }

    /* compiled from: BitmapLoadingWorkerTask */
    public static final class a {
        public final Uri a;
        public final Bitmap b;
        public final int c;
        public final int d;
        public final Exception e;

        public a(Uri uri, Bitmap bitmap, int i, int i2) {
            this.a = uri;
            this.b = bitmap;
            this.c = i;
            this.d = i2;
            this.e = null;
        }

        public a(Uri uri, Exception exc) {
            this.a = uri;
            this.b = null;
            this.c = 0;
            this.d = 0;
            this.e = exc;
        }
    }
}
