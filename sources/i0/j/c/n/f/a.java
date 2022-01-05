package i0.j.c.n.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.instabug.chat.e.b;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.threading.PoolProvider;
import i0.j.c.n.f.b;

/* compiled from: ChatsAdapter */
public class a implements Runnable {
    public final /* synthetic */ b c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ b.a q;

    /* renamed from: i0.j.c.n.f.a$a  reason: collision with other inner class name */
    /* compiled from: ChatsAdapter */
    public class C0169a implements BitmapUtils.OnBitmapReady {

        /* renamed from: i0.j.c.n.f.a$a$a  reason: collision with other inner class name */
        /* compiled from: ChatsAdapter */
        public class C0170a implements Runnable {
            public final /* synthetic */ Bitmap c;

            public C0170a(Bitmap bitmap) {
                this.c = bitmap;
            }

            public void run() {
                a.this.q.b.setImageBitmap(this.c);
            }
        }

        public C0169a() {
        }

        public void onBitmapFailedToLoad() {
        }

        public void onBitmapReady(Bitmap bitmap) {
            PoolProvider.postMainThreadTask(new C0170a(bitmap));
        }
    }

    public a(com.instabug.chat.e.b bVar, Context context, b.a aVar) {
        this.c = bVar;
        this.d = context;
        this.q = aVar;
    }

    public void run() {
        if (this.c.c() != null) {
            BitmapUtils.loadBitmapForAsset(this.d, this.c.c(), AssetEntity.AssetType.IMAGE, new C0169a());
        }
    }
}
