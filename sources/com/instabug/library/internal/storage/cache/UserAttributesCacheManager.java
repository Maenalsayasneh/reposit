package com.instabug.library.internal.storage.cache;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.model.UserAttributes;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.HashMap;

public class UserAttributesCacheManager {
    public static final String USER_ATTRIBUTES_CACHE_KEY = "attrs";
    public static final String USER_ATTRIBUTES_DISK_CACHE_FILE_NAME = "/user_attributes.cache";
    public static final String USER_ATTRIBUTES_DISK_CACHE_KEY = "user_attributes_disk_cache";
    public static final String USER_ATTRIBUTES_MEMORY_CACHE_KEY = "user_attributes_memory_cache";

    public static class a extends CacheManager.KeyExtractor<String, UserAttributes> {
        public /* bridge */ /* synthetic */ Object extractKey(Object obj) {
            UserAttributes userAttributes = (UserAttributes) obj;
            return UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY;
        }
    }

    public static class b implements Runnable {
        public final /* synthetic */ Context c;

        public b(Context context) {
            this.c = context;
        }

        public void run() {
            UserAttributesCacheManager.prepareUserAttributesCache(this.c);
        }
    }

    public static HashMap<String, String> getAll() {
        InMemoryCache<String, UserAttributes> cache = getCache();
        UserAttributes userAttributes = cache != null ? cache.get(USER_ATTRIBUTES_CACHE_KEY) : null;
        if (userAttributes == null || userAttributes.getMap() == null || userAttributes.getMap().isEmpty()) {
            return null;
        }
        return userAttributes.getMap();
    }

    public static InMemoryCache<String, UserAttributes> getCache() {
        CacheManager.getInstance().migrateCache(USER_ATTRIBUTES_DISK_CACHE_KEY, USER_ATTRIBUTES_MEMORY_CACHE_KEY, new a());
        return (InMemoryCache) CacheManager.getInstance().getCache(USER_ATTRIBUTES_MEMORY_CACHE_KEY);
    }

    public static void prepareCaches(Context context) {
        HandlerThread handlerThread = new HandlerThread("prepareCachesThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new b(context));
    }

    /* access modifiers changed from: private */
    public static void prepareUserAttributesCache(Context context) {
        InstabugSDKLogger.v(UserAttributesCacheManager.class, "Creating UserAttributes disk cache");
        CacheManager.getInstance().addCache(new OnDiskCache(context, USER_ATTRIBUTES_DISK_CACHE_KEY, USER_ATTRIBUTES_DISK_CACHE_FILE_NAME, UserAttributes.class));
    }
}
