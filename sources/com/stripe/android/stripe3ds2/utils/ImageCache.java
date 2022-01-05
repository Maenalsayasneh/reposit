package com.stripe.android.stripe3ds2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0001\rJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H¦\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "", "Lm0/i;", "clear", "()V", "", "key", "Landroid/graphics/Bitmap;", "get", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "set", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ImageCache.kt */
public interface ImageCache {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR.\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00128\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache$Default;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "", "key", "Landroid/graphics/Bitmap;", "get", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "bitmap", "Lm0/i;", "set", "(Ljava/lang/String;Landroid/graphics/Bitmap;)V", "clear", "()V", "", "MAX_SIZE", "I", "cacheSize", "KB", "Landroid/util/LruCache;", "cache", "Landroid/util/LruCache;", "getCache$3ds2sdk_release", "()Landroid/util/LruCache;", "getCache$3ds2sdk_release$annotations", "<init>", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ImageCache.kt */
    public static final class Default implements ImageCache {
        public static final Default INSTANCE;
        private static final int KB = 1024;
        private static final int MAX_SIZE = 10240;
        private static final LruCache<String, Bitmap> cache;
        private static final int cacheSize;

        static {
            Default defaultR = new Default();
            INSTANCE = defaultR;
            int min = Math.min((int) ((Runtime.getRuntime().maxMemory() / ((long) 1024)) / ((long) 8)), MAX_SIZE);
            cacheSize = min;
            cache = new ImageCache$Default$cache$1(defaultR, min);
        }

        private Default() {
        }

        public static /* synthetic */ void getCache$3ds2sdk_release$annotations() {
        }

        public void clear() {
            cache.evictAll();
        }

        public Bitmap get(String str) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            return cache.get(str);
        }

        public final LruCache<String, Bitmap> getCache$3ds2sdk_release() {
            return cache;
        }

        public void set(String str, Bitmap bitmap) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
            i.e(bitmap, "bitmap");
            cache.put(str, bitmap);
        }
    }

    void clear();

    Bitmap get(String str);

    void set(String str, Bitmap bitmap);
}
