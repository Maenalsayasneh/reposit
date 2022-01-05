package com.instabug.featuresrequest.cache;

import com.instabug.featuresrequest.d.g;
import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;

public class TimelineCacheManager {
    private static final String TAG = "TimelineCacheManager";
    public static final String TIMELINE_DISK_CACHE_FILE_NAME = "/timeline.cache";
    public static final String TIMELINE_DISK_CACHE_KEY = "timeline_disk_cache";
    public static final String TIMELINE_MEMORY_CACHE_KEY = "timeline_memory_cache";

    public static class a extends CacheManager.KeyExtractor<Long, g> {
        public Object extractKey(Object obj) {
            return Long.valueOf(((g) obj).c);
        }
    }

    public static class b extends CacheManager.KeyExtractor<String, g> {
        public Object extractKey(Object obj) {
            return String.valueOf(((g) obj).c);
        }
    }

    public static void addTimeline(g gVar) {
        InMemoryCache<Long, g> cache = getCache();
        if (cache != null) {
            cache.put(Long.valueOf(gVar.c), gVar);
        }
    }

    public static InMemoryCache<Long, g> getCache() throws IllegalArgumentException {
        if (!CacheManager.getInstance().cacheExists(TIMELINE_MEMORY_CACHE_KEY)) {
            StringBuilder P0 = i0.d.a.a.a.P0("In-memory comments cache not found, loading it from disk ");
            P0.append(CacheManager.getInstance().getCache(TIMELINE_MEMORY_CACHE_KEY));
            InstabugSDKLogger.d(TAG, P0.toString());
            CacheManager.getInstance().migrateCache(TIMELINE_DISK_CACHE_KEY, TIMELINE_MEMORY_CACHE_KEY, new a());
            Cache cache = CacheManager.getInstance().getCache(TIMELINE_MEMORY_CACHE_KEY);
            if (cache != null) {
                StringBuilder P02 = i0.d.a.a.a.P0("In-memory Comments cache restored from disk, ");
                P02.append(cache.size());
                P02.append(" elements restored");
                InstabugSDKLogger.d(TAG, P02.toString());
            }
        }
        InstabugSDKLogger.d(TAG, "In-memory Comments cache found");
        return (InMemoryCache) CacheManager.getInstance().getCache(TIMELINE_MEMORY_CACHE_KEY);
    }

    public static g getComments(long j) {
        if (getCache() == null) {
            return null;
        }
        return getCache().get(Long.valueOf(j));
    }

    public static void saveCacheToDisk() {
        Cache cache = CacheManager.getInstance().getCache(TIMELINE_DISK_CACHE_KEY);
        Cache cache2 = CacheManager.getInstance().getCache(TIMELINE_MEMORY_CACHE_KEY);
        if (cache != null && cache2 != null) {
            CacheManager.getInstance().migrateCache(cache2, cache, new b());
        }
    }

    public static void tearDown() {
        CacheManager.getInstance().deleteCache(TIMELINE_DISK_CACHE_KEY);
        CacheManager.getInstance().deleteCache(TIMELINE_MEMORY_CACHE_KEY);
    }
}
