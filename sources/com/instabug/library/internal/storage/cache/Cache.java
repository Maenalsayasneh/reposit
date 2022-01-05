package com.instabug.library.internal.storage.cache;

import java.util.ArrayList;
import java.util.List;

public abstract class Cache<K, V> {
    private int appVersion;
    private String id;
    private final List<CacheChangedListener<V>> listeners;

    public Cache(String str) {
        this(str, 1);
    }

    public boolean addOnCacheChangedListener(CacheChangedListener<V> cacheChangedListener) {
        return !this.listeners.contains(cacheChangedListener) && this.listeners.add(cacheChangedListener);
    }

    public abstract V delete(K k);

    public abstract V get(K k);

    public int getAppVersion() {
        return this.appVersion;
    }

    public String getId() {
        return this.id;
    }

    public abstract List<V> getValues();

    public abstract void invalidate();

    public void notifyCacheInvalidated() {
        for (CacheChangedListener<V> onCacheInvalidated : this.listeners) {
            onCacheInvalidated.onCacheInvalidated();
        }
    }

    public void notifyItemAdded(V v) {
        for (CacheChangedListener<V> onCachedItemAdded : this.listeners) {
            onCachedItemAdded.onCachedItemAdded(v);
        }
    }

    public void notifyItemRemoved(V v) {
        for (CacheChangedListener<V> onCachedItemRemoved : this.listeners) {
            onCachedItemRemoved.onCachedItemRemoved(v);
        }
    }

    public void notifyItemUpdated(V v, V v2) {
        for (CacheChangedListener<V> onCachedItemUpdated : this.listeners) {
            onCachedItemUpdated.onCachedItemUpdated(v, v2);
        }
    }

    public abstract V put(K k, V v);

    public boolean removeOnCacheChangedListener(CacheChangedListener<V> cacheChangedListener) {
        return this.listeners.remove(cacheChangedListener);
    }

    public abstract long size();

    public Cache(String str, int i) {
        this.appVersion = -1;
        this.id = str;
        this.appVersion = i;
        this.listeners = new ArrayList();
    }
}
