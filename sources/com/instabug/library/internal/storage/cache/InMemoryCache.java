package com.instabug.library.internal.storage.cache;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class InMemoryCache<K, V> extends Cache<K, V> {
    private final LinkedHashMap<K, V> map;

    public InMemoryCache(String str) {
        this(str, 1);
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_RETURN_ANNOTATION"})
    public V delete(K k) {
        V remove;
        synchronized (this.map) {
            remove = this.map.remove(k);
        }
        if (remove != null) {
            notifyItemRemoved(remove);
        }
        return remove;
    }

    public V get(K k) {
        V v;
        synchronized (this.map) {
            v = this.map.get(k);
        }
        return v;
    }

    public List<V> getValues() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.map) {
            for (K k : this.map.keySet()) {
                Object obj = get(k);
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public void invalidate() {
        synchronized (this.map) {
            this.map.clear();
        }
        notifyCacheInvalidated();
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_RETURN_ANNOTATION"})
    public V put(K k, V v) {
        V put;
        if (v == null || k == null) {
            return null;
        }
        synchronized (this.map) {
            put = this.map.put(k, v);
        }
        if (put == null) {
            notifyItemAdded(v);
            return v;
        }
        notifyItemUpdated(put, v);
        return put;
    }

    public long size() {
        long size;
        synchronized (this.map) {
            size = (long) this.map.size();
        }
        return size;
    }

    public InMemoryCache(String str, int i) {
        super(str, i);
        this.map = new LinkedHashMap<>();
    }
}
