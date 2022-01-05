package io.michaelrocks.libphonenumber.android.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class RegexCache {
    public LRUCache<String, Pattern> a;

    public static class LRUCache<K, V> {
        public LinkedHashMap<K, V> a;
        public int b;

        public LRUCache(int i) {
            this.b = i;
            this.a = new LinkedHashMap<K, V>(((i * 4) / 3) + 1, 0.75f, true) {
                public boolean removeEldestEntry(Map.Entry<K, V> entry) {
                    return size() > LRUCache.this.b;
                }
            };
        }
    }

    public RegexCache(int i) {
        this.a = new LRUCache<>(i);
    }

    public Pattern a(String str) {
        V v;
        LRUCache<String, Pattern> lRUCache = this.a;
        synchronized (lRUCache) {
            v = lRUCache.a.get(str);
        }
        Pattern pattern = (Pattern) v;
        if (pattern == null) {
            pattern = Pattern.compile(str);
            LRUCache<String, Pattern> lRUCache2 = this.a;
            synchronized (lRUCache2) {
                lRUCache2.a.put(str, pattern);
            }
        }
        return pattern;
    }
}
