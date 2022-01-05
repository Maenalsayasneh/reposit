package com.stripe.android.stripe3ds2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.stripe3ds2.utils.ImageCache;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/stripe/android/stripe3ds2/utils/ImageCache$Default$cache$1", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "key", "bitmap", "", "sizeOf", "(Ljava/lang/String;Landroid/graphics/Bitmap;)I", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ImageCache.kt */
public final class ImageCache$Default$cache$1 extends LruCache<String, Bitmap> {
    public final /* synthetic */ ImageCache.Default this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageCache$Default$cache$1(ImageCache.Default defaultR, int i) {
        super(i);
        this.this$0 = defaultR;
    }

    public int sizeOf(String str, Bitmap bitmap) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        i.e(bitmap, "bitmap");
        return bitmap.getByteCount() / RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
    }
}
