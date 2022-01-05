package oauth.signpost.http;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import p0.a.a;

public class HttpParameters implements Map<String, SortedSet<String>>, Serializable {
    public TreeMap<String, SortedSet<String>> c = new TreeMap<>();

    public String a(String str) {
        String b = b(str);
        if (b == null) {
            return null;
        }
        return str + "=\"" + b + "\"";
    }

    public String b(Object obj) {
        SortedSet sortedSet = this.c.get(obj);
        if (sortedSet == null || sortedSet.isEmpty()) {
            return null;
        }
        return (String) sortedSet.first();
    }

    public String c(String str, String str2, boolean z) {
        if (z) {
            str = a.f(str);
        }
        SortedSet sortedSet = this.c.get(str);
        if (sortedSet == null) {
            sortedSet = new TreeSet();
            this.c.put(str, sortedSet);
        }
        if (str2 != null) {
            if (z) {
                str2 = a.f(str2);
            }
            sortedSet.add(str2);
        }
        return str2;
    }

    public void clear() {
        this.c.clear();
    }

    public boolean containsKey(Object obj) {
        return this.c.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        for (SortedSet<String> contains : this.c.values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public void d(Map<? extends String, ? extends SortedSet<String>> map, boolean z) {
        if (z) {
            for (String str : map.keySet()) {
                SortedSet remove = this.c.remove(str);
                for (String c2 : (SortedSet) map.get(str)) {
                    c(str, c2, true);
                }
                SortedSet sortedSet = this.c.get(str);
            }
            return;
        }
        this.c.putAll(map);
    }

    public Set<Map.Entry<String, SortedSet<String>>> entrySet() {
        return this.c.entrySet();
    }

    public void f(String[] strArr, boolean z) {
        for (int i = 0; i < strArr.length - 1; i += 2) {
            c(strArr[i], strArr[i + 1], z);
        }
    }

    public Object get(Object obj) {
        return this.c.get(obj);
    }

    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    public Set<String> keySet() {
        return this.c.keySet();
    }

    public Object put(Object obj, Object obj2) {
        return this.c.put((String) obj, (SortedSet) obj2);
    }

    public void putAll(Map<? extends String, ? extends SortedSet<String>> map) {
        this.c.putAll(map);
    }

    public Object remove(Object obj) {
        return this.c.remove(obj);
    }

    public int size() {
        int i = 0;
        for (String str : this.c.keySet()) {
            i += this.c.get(str).size();
        }
        return i;
    }

    public Collection<SortedSet<String>> values() {
        return this.c.values();
    }
}
