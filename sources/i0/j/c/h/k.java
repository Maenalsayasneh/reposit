package i0.j.c.h;

import android.app.Activity;
import android.graphics.Bitmap;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.ui.custom.CircularImageView;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.c.f.b;
import java.util.Objects;

/* compiled from: NotificationBarInvoker */
public class k implements Runnable {
    public final /* synthetic */ b c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ CircularImageView q;
    public final /* synthetic */ a x;

    /* compiled from: NotificationBarInvoker */
    public class a implements BitmapUtils.OnBitmapReady {

        /* renamed from: i0.j.c.h.k$a$a  reason: collision with other inner class name */
        /* compiled from: NotificationBarInvoker */
        public class C0165a implements Runnable {
            public final /* synthetic */ Bitmap c;

            public C0165a(Bitmap bitmap) {
                this.c = bitmap;
            }

            public void run() {
                k kVar = k.this;
                a aVar = kVar.x;
                CircularImageView circularImageView = kVar.q;
                Bitmap bitmap = this.c;
                Objects.requireNonNull(aVar);
                if (bitmap != null) {
                    circularImageView.setBackgroundResource(0);
                    circularImageView.setImageBitmap(bitmap);
                }
                k kVar2 = k.this;
                a aVar2 = kVar2.x;
                if (!aVar2.b) {
                    a.b(aVar2, kVar2.d);
                }
            }
        }

        public a() {
        }

        public void onBitmapFailedToLoad() {
            k kVar = k.this;
            a aVar = kVar.x;
            if (!aVar.b) {
                a.b(aVar, kVar.d);
            }
        }

        public void onBitmapReady(Bitmap bitmap) {
            PoolProvider.postMainThreadTask(new C0165a(bitmap));
        }
    }

    public k(a aVar, b bVar, Activity activity, CircularImageView circularImageView) {
        this.x = aVar;
        this.c = bVar;
        this.d = activity;
        this.q = circularImageView;
    }

    public void run() {
        String str = this.c.c;
        if (str != null) {
            BitmapUtils.loadBitmapForAsset(this.d, str, AssetEntity.AssetType.IMAGE, new a());
        }
    }
}
