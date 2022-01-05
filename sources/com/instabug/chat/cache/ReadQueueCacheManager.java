package com.instabug.chat.cache;

import android.annotation.SuppressLint;
import com.instabug.chat.e.d;
import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.c.f.c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReadQueueCacheManager {
    public static final String READ_QUEUE_DISK_CACHE_FILE_NAME = "/read_queue.cache";
    public static final String READ_QUEUE_DISK_CACHE_KEY = "read_queue_disk_cache_key";
    public static final String READ_QUEUE_MEMORY_CACHE_KEY = "read_queue_memory_cache_key";
    private static ReadQueueCacheManager mReadQueueCacheManager;

    public static class a extends CacheManager.KeyExtractor<String, c> {
        @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
        public Object extractKey(Object obj) {
            return ((c) obj).c;
        }
    }

    public static class b extends CacheManager.KeyExtractor<String, c> {
        public Object extractKey(Object obj) {
            return String.valueOf(((c) obj).c);
        }
    }

    private ReadQueueCacheManager() {
        InstabugSDKLogger.d(this, "Initializing ReadQueueCacheManager");
        CacheManager.getInstance().addCache(new InMemoryCache(READ_QUEUE_MEMORY_CACHE_KEY));
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public static InMemoryCache<String, c> getCache() {
        Class<ReadQueueCacheManager> cls = ReadQueueCacheManager.class;
        if (!CacheManager.getInstance().cacheExists(READ_QUEUE_MEMORY_CACHE_KEY) || CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY).getValues().size() > 0) {
            StringBuilder P0 = i0.d.a.a.a.P0("In-memory cache not found, loading it from disk ");
            P0.append(CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY));
            InstabugSDKLogger.d(cls, P0.toString());
            CacheManager.getInstance().migrateCache(READ_QUEUE_DISK_CACHE_KEY, READ_QUEUE_MEMORY_CACHE_KEY, new a());
            Cache cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
            if (cache != null) {
                StringBuilder P02 = i0.d.a.a.a.P0("In-memory cache restored from disk, ");
                P02.append(cache.getValues().size());
                P02.append(" elements restored");
                InstabugSDKLogger.d(cls, P02.toString());
            }
        }
        InstabugSDKLogger.d(cls, "In-memory cache found");
        return (InMemoryCache) CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
    }

    public static ReadQueueCacheManager getInstance() {
        if (mReadQueueCacheManager == null) {
            mReadQueueCacheManager = new ReadQueueCacheManager();
        }
        return mReadQueueCacheManager;
    }

    private void remove(String str) {
        Cache cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        if (cache != null) {
            cache.delete(str);
        }
    }

    public static void saveCacheToDisk() {
        Cache cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        Cache cache2 = CacheManager.getInstance().getCache(READ_QUEUE_DISK_CACHE_KEY);
        if (cache != null && cache2 != null) {
            StringBuilder P0 = i0.d.a.a.a.P0("Saving In-memory cache to disk, no. of items to save is ");
            P0.append(cache.getValues());
            InstabugSDKLogger.d(ReadQueueCacheManager.class, P0.toString());
            CacheManager.getInstance().migrateCache(cache, cache2, new b());
        }
    }

    public static void tearDown() {
        mReadQueueCacheManager = null;
    }

    public void add(c cVar) {
        String str;
        InstabugSDKLogger.v(this, "Adding message " + cVar + " to read queue in-memory cache");
        Cache cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        if (cache != null && cVar != null && (str = cVar.c) != null) {
            cache.put(str, cVar);
            InstabugSDKLogger.v(this, "Added message " + cVar + " to read queue in-memory cache " + cache.size());
        }
    }

    public List<c> getAll() {
        Cache cache = CacheManager.getInstance().getCache(READ_QUEUE_MEMORY_CACHE_KEY);
        if (cache != null) {
            return cache.getValues();
        }
        return new ArrayList();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public JSONArray getReadMessagesArray() {
        JSONArray jSONArray = new JSONArray();
        for (c next : getAll()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("chat_number", (Object) next.c);
                jSONObject.put("message_id", (Object) next.q);
                jSONObject.put("read_at", next.d);
                jSONArray.put((Object) jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray;
    }

    public c map(d dVar) {
        c cVar = new c();
        cVar.c = dVar.d;
        cVar.q = dVar.c;
        cVar.d = InstabugDateFormatter.getCurrentUTCTimeStampInSeconds();
        return cVar;
    }

    public void markAsRead(d dVar) {
        add(map(dVar));
    }

    public void notify(List<c> list) {
        String str;
        String str2;
        for (c next : getAll()) {
            for (c next2 : list) {
                String str3 = next.c;
                if (!(str3 == null || !str3.equals(next2.c) || (str = next.q) == null || !str.equals(next2.q) || (str2 = next2.c) == null)) {
                    remove(str2);
                }
            }
        }
    }
}
