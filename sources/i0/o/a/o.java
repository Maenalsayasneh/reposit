package i0.o.a;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* compiled from: LruCache */
public final class o implements d {
    public final LruCache<String, a> a;

    /* compiled from: LruCache */
    public static final class a {
        public final Bitmap a;
        public final int b;

        public a(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public o(Context context) {
        StringBuilder sb = b0.a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.a = new n(this, (int) ((((long) ((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass())) * 1048576) / 7));
    }

    public int a() {
        return this.a.maxSize();
    }

    public Bitmap get(String str) {
        a aVar = this.a.get(str);
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public void set(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int b = b0.b(bitmap);
        if (b > this.a.maxSize()) {
            this.a.remove(str);
        } else {
            this.a.put(str, new a(bitmap, b));
        }
    }

    public int size() {
        return this.a.size();
    }
}
