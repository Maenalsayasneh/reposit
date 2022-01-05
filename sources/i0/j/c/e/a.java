package i0.j.c.e;

import android.content.Context;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.cache.ReadQueueCacheManager;
import com.instabug.chat.e.b;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.OnDiskCache;
import i0.j.c.f.c;

/* compiled from: CacheUtility */
public final class a implements Runnable {
    public final /* synthetic */ Context c;

    public a(Context context) {
        this.c = context;
    }

    public void run() {
        CacheManager.getInstance().addCache(new OnDiskCache(this.c, ChatsCacheManager.CHATS_DISK_CACHE_KEY, ChatsCacheManager.CHATS_DISK_CACHE_FILE_NAME, b.class));
        CacheManager.getInstance().addCache(new OnDiskCache(this.c, ReadQueueCacheManager.READ_QUEUE_DISK_CACHE_KEY, ReadQueueCacheManager.READ_QUEUE_DISK_CACHE_FILE_NAME, c.class));
    }
}
