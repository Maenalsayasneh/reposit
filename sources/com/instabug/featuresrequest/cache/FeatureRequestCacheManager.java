package com.instabug.featuresrequest.cache;

import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.ArrayList;
import java.util.List;

public class FeatureRequestCacheManager {
    public static final String FEATURES_REQUESTS_EXTRAS_DISK_CACHE_FILE_NAME = "/features_request_extras.cache";
    public static final String FEATURES_REQUESTS_EXTRAS_DISK_CACHE_KEY = "features_request_extras_disk_cache";
    public static final String FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY = "features_request_extras_memory_cache";
    public static final String FEATURES_REQUEST_DISK_CACHE_FILE_NAME = "/features_request.cache";
    public static final String FEATURES_REQUEST_DISK_CACHE_KEY = "features_request_disk_cache";
    public static final String FEATURES_REQUEST_MEMORY_CACHE_KEY = "features_request_memory_cache";
    private static final String TAG = "FeatureRequestCacheManager";

    public static class a extends CacheManager.KeyExtractor<Long, com.instabug.featuresrequest.d.b> {
        public Object extractKey(Object obj) {
            return Long.valueOf(((com.instabug.featuresrequest.d.b) obj).c);
        }
    }

    public static class b extends CacheManager.KeyExtractor<String, com.instabug.featuresrequest.d.b> {
        public Object extractKey(Object obj) {
            return String.valueOf(((com.instabug.featuresrequest.d.b) obj).c);
        }
    }

    public static class c extends CacheManager.KeyExtractor<String, Object> {
        public Object extractKey(Object obj) {
            return obj instanceof Boolean ? "has_next_page" : "completed_features_count";
        }
    }

    public static class d extends CacheManager.KeyExtractor<String, Object> {
        public Object extractKey(Object obj) {
            return obj instanceof Boolean ? "has_next_page" : "completed_features_count";
        }
    }

    public static void addFeature(com.instabug.featuresrequest.d.b bVar) {
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache != null) {
            cache.put(Long.valueOf(bVar.c), bVar);
        }
    }

    public static void addFeatures(List<com.instabug.featuresrequest.d.b> list) {
        for (com.instabug.featuresrequest.d.b addFeature : list) {
            addFeature(addFeature);
        }
    }

    public static InMemoryCache<Long, com.instabug.featuresrequest.d.b> getCache() throws IllegalArgumentException {
        if (!CacheManager.getInstance().cacheExists(FEATURES_REQUEST_MEMORY_CACHE_KEY)) {
            StringBuilder P0 = i0.d.a.a.a.P0("In-memory features requet cache not found, loading it from disk ");
            P0.append(CacheManager.getInstance().getCache(FEATURES_REQUEST_MEMORY_CACHE_KEY));
            InstabugSDKLogger.d(TAG, P0.toString());
            CacheManager.getInstance().migrateCache(FEATURES_REQUEST_DISK_CACHE_KEY, FEATURES_REQUEST_MEMORY_CACHE_KEY, new a());
            Cache cache = CacheManager.getInstance().getCache(FEATURES_REQUEST_MEMORY_CACHE_KEY);
            if (cache != null) {
                StringBuilder P02 = i0.d.a.a.a.P0("In-memory Feature Request cache restored from disk, ");
                P02.append(cache.size());
                P02.append(" elements restored");
                InstabugSDKLogger.d(TAG, P02.toString());
            }
        }
        InstabugSDKLogger.d(TAG, "In-memory features request cache found");
        return (InMemoryCache) CacheManager.getInstance().getCache(FEATURES_REQUEST_MEMORY_CACHE_KEY);
    }

    public static int getCompletedFeaturesCount() {
        InMemoryCache<String, Object> extrasCache = getExtrasCache();
        if (extrasCache == null || extrasCache.get("completed_features_count") == null || extrasCache.get("completed_features_count") == null) {
            return 0;
        }
        return ((Integer) extrasCache.get("completed_features_count")).intValue();
    }

    public static InMemoryCache<String, Object> getExtrasCache() throws IllegalArgumentException {
        if (!CacheManager.getInstance().cacheExists(FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY)) {
            StringBuilder P0 = i0.d.a.a.a.P0("In-memory features request extas cache not found, loading it from disk ");
            P0.append(CacheManager.getInstance().getCache(FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY));
            InstabugSDKLogger.d(TAG, P0.toString());
            CacheManager.getInstance().migrateCache(FEATURES_REQUESTS_EXTRAS_DISK_CACHE_KEY, FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY, new c());
            Cache cache = CacheManager.getInstance().getCache(FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY);
            if (cache != null) {
                StringBuilder P02 = i0.d.a.a.a.P0("In-memory Feature Request extras cache restored from disk, ");
                P02.append(cache.size());
                P02.append(" elements restored");
                InstabugSDKLogger.d(TAG, P02.toString());
            }
        }
        InstabugSDKLogger.d(TAG, "In-memory features request extras cache found");
        return (InMemoryCache) CacheManager.getInstance().getCache(FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY);
    }

    public static com.instabug.featuresrequest.d.b getFeature(long j) {
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache == null) {
            return null;
        }
        for (com.instabug.featuresrequest.d.b next : cache.getValues()) {
            if (next.c == j) {
                return next;
            }
        }
        return null;
    }

    public static List<com.instabug.featuresrequest.d.b> getFeatures() {
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache != null) {
            return cache.getValues();
        }
        return new ArrayList();
    }

    public static List<com.instabug.featuresrequest.d.b> getVotesToUpload() {
        ArrayList arrayList = new ArrayList();
        InMemoryCache<Long, com.instabug.featuresrequest.d.b> cache = getCache();
        if (cache != null) {
            List<com.instabug.featuresrequest.d.b> values = cache.getValues();
            StringBuilder P0 = i0.d.a.a.a.P0("size: ");
            P0.append(values.size());
            InstabugSDKLogger.d(TAG, P0.toString());
            arrayList.addAll(values);
        }
        return arrayList;
    }

    public static boolean hasNextPage() {
        InMemoryCache<String, Object> extrasCache = getExtrasCache();
        if (extrasCache == null || extrasCache.get("has_next_page") == null || extrasCache.get("has_next_page") == null || !((Boolean) extrasCache.get("has_next_page")).booleanValue()) {
            return false;
        }
        return true;
    }

    public static void saveCacheToDisk() {
        int i;
        Cache cache = CacheManager.getInstance().getCache(FEATURES_REQUEST_DISK_CACHE_KEY);
        Cache cache2 = CacheManager.getInstance().getCache(FEATURES_REQUEST_MEMORY_CACHE_KEY);
        if (cache == null || cache2 == null) {
            i = 0;
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Checking old values cached ");
            P0.append(cache.getValues());
            InstabugSDKLogger.d(TAG, P0.toString());
            InstabugSDKLogger.addVerboseLog(TAG, "Saving In-memory feature requests cache to disk, no. of feature requests to save is " + cache2.size());
            CacheManager.getInstance().migrateCache(cache2, cache, new b());
            i = cache.getValues().size();
        }
        InstabugSDKLogger.d(TAG, "In-memory feature requests cache had been persisted on-disk, " + i + " feautre reuests saved");
    }

    public static void saveExtrasCacheToDisk() {
        int i;
        Cache cache = CacheManager.getInstance().getCache(FEATURES_REQUESTS_EXTRAS_DISK_CACHE_KEY);
        Cache cache2 = CacheManager.getInstance().getCache(FEATURES_REQUESTS_EXTRAS_MEMORY_CACHE_KEY);
        if (cache == null || cache2 == null) {
            i = 0;
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Checking old values cached ");
            P0.append(cache.getValues());
            InstabugSDKLogger.d(TAG, P0.toString());
            InstabugSDKLogger.d(TAG, "Saving In-memory feature requests extras cache to disk, no. of feature requests to save is " + cache2.size());
            CacheManager.getInstance().migrateCache(cache2, cache, new d());
            i = cache.getValues().size();
        }
        InstabugSDKLogger.d(TAG, "In-memory feature requests extras cache had been persisted on-disk, " + i + " feauture requests extras saved");
    }

    public static void setCompletedFeaturesCount(int i) {
        InMemoryCache<String, Object> extrasCache = getExtrasCache();
        if (extrasCache != null) {
            extrasCache.put("completed_features_count", Integer.valueOf(i));
        }
    }

    public static void setHasNextPage(boolean z) {
        InMemoryCache<String, Object> extrasCache = getExtrasCache();
        if (extrasCache != null) {
            extrasCache.put("has_next_page", Boolean.valueOf(z));
        }
    }

    public static void tearDown() {
        CacheManager.getInstance().deleteCache(FEATURES_REQUEST_MEMORY_CACHE_KEY);
        CacheManager.getInstance().deleteCache(FEATURES_REQUEST_DISK_CACHE_KEY);
    }
}
