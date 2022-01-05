package com.instabug.featuresrequest.cache;

import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;

public class NewFeatureRequestsCacheManager {
    public static final String NEW_FEATURES_DISK_CACHE_FILE_NAME = "/new_feature_requests.cache";
    public static final String NEW_FEATURES_DISK_CACHE_KEY = "new_feature_requests_disk_cache";
    public static final String NEW_FEATURES_MEMORY_CACHE_KEY = "new_feature_requests._memory_cache";
    private static final String TAG = "NewFeatureRequestsCacheManager";

    public static class a extends CacheManager.KeyExtractor<Long, com.instabug.featuresrequest.d.b> {
        public Object extractKey(Object obj) {
            return Long.valueOf(((com.instabug.featuresrequest.d.b) obj).c);
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ Cache c;
        public final /* synthetic */ Cache d;

        public class a extends CacheManager.KeyExtractor<String, com.instabug.featuresrequest.d.b> {
            public Object extractKey(Object obj) {
                return String.valueOf(((com.instabug.featuresrequest.d.b) obj).c);
            }
        }

        public b(Cache cache, Cache cache2) {
            this.c = cache;
            this.d = cache2;
        }

        public void run() {
            CacheManager.getInstance().migrateCache(this.c, this.d, new a());
        }
    }

    public static void addNewFeatureRequest(com.instabug.featuresrequest.d.b bVar) {
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache != null) {
            cache.put(Long.valueOf(bVar.c), bVar);
        }
    }

    public static com.instabug.featuresrequest.d.b deleteNewFeatureRequest(com.instabug.featuresrequest.d.b bVar) {
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache != null) {
            return cache.delete(Long.valueOf(bVar.c));
        }
        return null;
    }

    public static InMemoryCache<Long, com.instabug.featuresrequest.d.b> getCache() throws IllegalArgumentException {
        if (!CacheManager.getInstance().cacheExists(NEW_FEATURES_MEMORY_CACHE_KEY)) {
            StringBuilder P0 = i0.d.a.a.a.P0("In-memory new_feature_requests cache not found, loading it from disk ");
            P0.append(CacheManager.getInstance().getCache(NEW_FEATURES_MEMORY_CACHE_KEY));
            InstabugSDKLogger.addVerboseLog(TAG, P0.toString());
            CacheManager.getInstance().migrateCache(NEW_FEATURES_DISK_CACHE_KEY, NEW_FEATURES_MEMORY_CACHE_KEY, new a());
            Cache cache = CacheManager.getInstance().getCache(NEW_FEATURES_MEMORY_CACHE_KEY);
            if (cache != null) {
                StringBuilder P02 = i0.d.a.a.a.P0("In-memory new_feature_requests cache restored from disk, ");
                P02.append(cache.getValues().size());
                P02.append(" elements restored");
                InstabugSDKLogger.d(TAG, P02.toString());
            }
        }
        InstabugSDKLogger.d(TAG, "In-memory new_feature_requests cache found");
        return (InMemoryCache) CacheManager.getInstance().getCache(NEW_FEATURES_MEMORY_CACHE_KEY);
    }

    public static com.instabug.featuresrequest.d.b getNewFeatureRequest(long j) {
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache != null) {
            return cache.get(Long.valueOf(j));
        }
        return null;
    }

    public static List<com.instabug.featuresrequest.d.b> getNewFeatureRequests() {
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache != null) {
            return cache.getValues();
        }
        return new ArrayList();
    }

    public static void saveCacheToDisk() {
        Cache cache = CacheManager.getInstance().getCache(NEW_FEATURES_MEMORY_CACHE_KEY);
        Cache cache2 = CacheManager.getInstance().getCache(NEW_FEATURES_DISK_CACHE_KEY);
        if (cache != null && cache2 != null) {
            new Thread(new b(cache, cache2)).start();
        }
    }

    public static void tearDown() {
        CacheManager.getInstance().deleteCache(NEW_FEATURES_MEMORY_CACHE_KEY);
        CacheManager.getInstance().deleteCache(NEW_FEATURES_DISK_CACHE_KEY);
    }
}
