package i0.j.c.e;

import com.instabug.chat.cache.ChatsCacheManager;

/* compiled from: CacheUtility */
public final class b implements Runnable {
    public void run() {
        ChatsCacheManager.cleanupChats();
    }
}
