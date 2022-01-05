package com.instabug.chat.cache;

import android.content.Context;
import android.net.Uri;
import com.instabug.chat.e.b;
import com.instabug.chat.e.d;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.InMemoryCache;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ChatsCacheManager {
    public static final String CHATS_DISK_CACHE_FILE_NAME = "/chats.cache";
    public static final String CHATS_DISK_CACHE_KEY = "chats_disk_cache";
    public static final String CHATS_MEMORY_CACHE_KEY = "chats_memory_cache";

    public static class a extends CacheManager.KeyExtractor<String, com.instabug.chat.e.b> {
        public Object extractKey(Object obj) {
            return ((com.instabug.chat.e.b) obj).c;
        }
    }

    public static class b extends CacheManager.KeyExtractor<String, com.instabug.chat.e.b> {
        public Object extractKey(Object obj) {
            return ((com.instabug.chat.e.b) obj).c;
        }
    }

    public static com.instabug.chat.e.b addOfflineChat(Context context) {
        com.instabug.chat.e.b bVar = new com.instabug.chat.e.b(System.currentTimeMillis() + "", (State) null, b.a.READY_TO_BE_SENT);
        PoolProvider.postIOTask(new i0.j.c.f.a(bVar, context));
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null) {
            cache.put(bVar.c, bVar);
        }
        return bVar;
    }

    public static void cleanupChats() {
        InstabugSDKLogger.v(ChatsCacheManager.class, "cleanupChats");
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null) {
            List<com.instabug.chat.e.b> values = cache.getValues();
            ArrayList arrayList = new ArrayList();
            for (com.instabug.chat.e.b next : values) {
                if (next.x == b.a.WAITING_ATTACHMENT_MESSAGE) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cache.delete(((com.instabug.chat.e.b) it.next()).c);
            }
        }
        saveCacheToDisk();
    }

    public static synchronized InMemoryCache<String, com.instabug.chat.e.b> getCache() throws IllegalArgumentException {
        InMemoryCache<String, com.instabug.chat.e.b> inMemoryCache;
        Class<ChatsCacheManager> cls = ChatsCacheManager.class;
        synchronized (cls) {
            if (!CacheManager.getInstance().cacheExists(CHATS_MEMORY_CACHE_KEY)) {
                InstabugSDKLogger.d(cls, "In-memory cache not found, loading it from disk " + CacheManager.getInstance().getCache(CHATS_MEMORY_CACHE_KEY));
                CacheManager.getInstance().migrateCache(CHATS_DISK_CACHE_KEY, CHATS_MEMORY_CACHE_KEY, new a());
                Cache cache = CacheManager.getInstance().getCache(CHATS_MEMORY_CACHE_KEY);
                if (cache != null) {
                    InstabugSDKLogger.d(cls, "In-memory cache restored from disk, " + cache.getValues().size() + " elements restored");
                }
            }
            InstabugSDKLogger.d(cls, "In-memory cache found");
            inMemoryCache = (InMemoryCache) CacheManager.getInstance().getCache(CHATS_MEMORY_CACHE_KEY);
        }
        return inMemoryCache;
    }

    public static com.instabug.chat.e.b getChat(String str) {
        if (str == null) {
            return null;
        }
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null) {
            for (com.instabug.chat.e.b next : cache.getValues()) {
                String str2 = next.c;
                if (str2 != null && str2.equals(str)) {
                    return next;
                }
            }
        }
        InstabugSDKLogger.e(ChatsCacheManager.class, "No chat with id: " + str + " found, returning null");
        return null;
    }

    public static long getLastMessageMessagedAt() {
        ArrayList arrayList = new ArrayList();
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null) {
            for (com.instabug.chat.e.b bVar : cache.getValues()) {
                Iterator<d> it = bVar.q.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    if (next.e2 == d.c.SYNCED) {
                        arrayList.add(next);
                    }
                }
            }
        }
        Collections.sort(arrayList, new d.a());
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (!dVar.c.equals("0")) {
                return dVar.Y1;
            }
        }
        return 0;
    }

    public static List<d> getNotSentMessages() {
        ArrayList arrayList = new ArrayList();
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null) {
            for (com.instabug.chat.e.b bVar : cache.getValues()) {
                Iterator<d> it = bVar.q.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    d.c cVar = next.e2;
                    if (cVar == d.c.SENT || cVar == d.c.READY_TO_BE_SENT) {
                        arrayList.add(next);
                    }
                }
            }
        }
        StringBuilder P0 = i0.d.a.a.a.P0("not sent messages count: ");
        P0.append(arrayList.size());
        InstabugSDKLogger.v(ChatsCacheManager.class, P0.toString());
        return arrayList;
    }

    public static synchronized List<com.instabug.chat.e.b> getOfflineChats() {
        ArrayList arrayList;
        Class<ChatsCacheManager> cls = ChatsCacheManager.class;
        synchronized (cls) {
            arrayList = new ArrayList();
            InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
            if (cache != null) {
                for (com.instabug.chat.e.b next : cache.getValues()) {
                    InstabugSDKLogger.v(cls, "chat state: " + next.x + ", messages count: " + next.q.size());
                    b.a aVar = next.x;
                    if (aVar != null && ((aVar.equals(b.a.READY_TO_BE_SENT) || next.x.equals(b.a.LOGS_READY_TO_BE_UPLOADED)) && next.q.size() > 0)) {
                        arrayList.add(next);
                    }
                }
            }
        }
        return arrayList;
    }

    public static List<d> getOfflineMessages() {
        ArrayList arrayList = new ArrayList();
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null) {
            for (com.instabug.chat.e.b next : cache.getValues()) {
                b.a aVar = next.x;
                if (aVar != null && aVar.equals(b.a.SENT)) {
                    Iterator<d> it = next.q.iterator();
                    while (it.hasNext()) {
                        d next2 = it.next();
                        if (next2.e2.equals(d.c.READY_TO_BE_SENT) || next2.e2.equals(d.c.SENT)) {
                            arrayList.add(next2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static int getTotalMessagesCount() {
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        int i = 0;
        if (cache != null) {
            for (com.instabug.chat.e.b bVar : cache.getValues()) {
                Iterator<d> it = bVar.q.iterator();
                while (it.hasNext()) {
                    if (it.next().e2.equals(d.c.SYNCED)) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    public static int getUnreadCount() {
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        int i = 0;
        if (cache != null) {
            for (com.instabug.chat.e.b f : cache.getValues()) {
                i += f.f();
            }
        }
        return i;
    }

    public static List<com.instabug.chat.e.b> getValidChats() {
        ArrayList arrayList = new ArrayList();
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null) {
            for (com.instabug.chat.e.b next : cache.getValues()) {
                if (next.q.size() > 0) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public static void saveCacheToDisk() throws IllegalArgumentException {
        Class<ChatsCacheManager> cls = ChatsCacheManager.class;
        Cache cache = CacheManager.getInstance().getCache(CHATS_MEMORY_CACHE_KEY);
        Cache cache2 = CacheManager.getInstance().getCache(CHATS_DISK_CACHE_KEY);
        if (cache == null || cache2 == null) {
            InstabugSDKLogger.e(cls, "In-memory cache is null");
            return;
        }
        CacheManager.getInstance().migrateCache(cache, cache2, new b());
        InstabugSDKLogger.d(cls, "In-memory cache had been persisted on-disk");
    }

    public static void updateLocalMessageWithSyncedMessage(Context context, d dVar) throws IOException {
        String str;
        com.instabug.chat.e.b bVar;
        String str2;
        AssetEntity assetEntity;
        Class<ChatsCacheManager> cls = ChatsCacheManager.class;
        InMemoryCache<String, com.instabug.chat.e.b> cache = getCache();
        if (cache != null && (str = dVar.d) != null && (bVar = cache.get(str)) != null) {
            ArrayList<d> arrayList = bVar.q;
            int i = 0;
            while (i < arrayList.size()) {
                if (!arrayList.get(i).c.equals(dVar.c) || !arrayList.get(i).e2.equals(d.c.READY_TO_BE_SYNCED) || arrayList.get(i).b2.size() != dVar.b2.size()) {
                    i++;
                } else {
                    for (int i2 = 0; i2 < arrayList.get(i).b2.size(); i2++) {
                        com.instabug.chat.e.a aVar = dVar.b2.get(i2);
                        if (!(aVar == null || (str2 = aVar.x) == null || aVar.q == null)) {
                            str2.hashCode();
                            char c = 65535;
                            switch (str2.hashCode()) {
                                case 93166550:
                                    if (str2.equals("audio")) {
                                        c = 0;
                                        break;
                                    }
                                    break;
                                case 1710800780:
                                    if (str2.equals("extra_video")) {
                                        c = 1;
                                        break;
                                    }
                                    break;
                                case 1830389646:
                                    if (str2.equals("video_gallery")) {
                                        c = 2;
                                        break;
                                    }
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    assetEntity = AssetsCacheManager.createEmptyEntity(context, aVar.q, AssetEntity.AssetType.AUDIO);
                                    break;
                                case 1:
                                case 2:
                                    assetEntity = AssetsCacheManager.createEmptyEntity(context, aVar.q, AssetEntity.AssetType.VIDEO);
                                    break;
                                default:
                                    assetEntity = AssetsCacheManager.createEmptyEntity(context, aVar.q, AssetEntity.AssetType.IMAGE);
                                    break;
                            }
                            String str3 = arrayList.get(i).b2.get(i2).d;
                            if (str3 != null) {
                                File file = new File(str3);
                                DiskUtils.copyFromUriIntoFile(context, Uri.fromFile(file), assetEntity.getFile());
                                AssetsCacheManager.addAssetEntity(assetEntity);
                                InstabugSDKLogger.v(cls, "local attachment file deleted: " + file.delete());
                            }
                        }
                    }
                    bVar.q.set(i, dVar);
                    InstabugSDKLogger.v(cls, "messages number: " + bVar.q.size());
                    InstabugSDKLogger.v(cls, "messages: " + bVar.q.get(i));
                    cache.put(bVar.c, bVar);
                    return;
                }
            }
        }
    }
}
