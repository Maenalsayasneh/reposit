package i0.j.c.e;

import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.cache.ReadQueueCacheManager;

/* compiled from: CacheUtility */
public final class c implements Runnable {
    public void run() {
        ChatsCacheManager.saveCacheToDisk();
        ReadQueueCacheManager.saveCacheToDisk();
    }
}
