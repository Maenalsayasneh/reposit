package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import i0.d.a.a.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    public final SettableBeanProperty[] Y1;
    public final Map<String, List<PropertyName>> Z1;
    public final Map<String, String> a2;
    public final Locale b2;
    public final boolean c;
    public int d;
    public int q;
    public int x;
    public Object[] y;

    public BeanPropertyMap(boolean z, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map, Locale locale) {
        HashMap hashMap;
        this.c = z;
        this.Y1 = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this.Z1 = map;
        this.b2 = locale;
        if (map == null || map.isEmpty()) {
            hashMap = Collections.emptyMap();
        } else {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                str = z ? str.toLowerCase(locale) : str;
                for (PropertyName propertyName : (List) next.getValue()) {
                    String str2 = propertyName.q;
                    if (z) {
                        str2 = str2.toLowerCase(locale);
                    }
                    hashMap2.put(str2, str);
                }
            }
            hashMap = hashMap2;
        }
        this.a2 = hashMap;
        x(collection);
    }

    public final int b(SettableBeanProperty settableBeanProperty) {
        int length = this.Y1.length;
        for (int i = 0; i < length; i++) {
            if (this.Y1[i] == settableBeanProperty) {
                return i;
            }
        }
        throw new IllegalStateException(a.y0(a.P0("Illegal state: property '"), settableBeanProperty.x.q, "' missing from _propsInOrder"));
    }

    public final SettableBeanProperty c(String str) {
        if (str == null) {
            return null;
        }
        int e = e(str);
        int i = e << 1;
        Object obj = this.y[i];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this.y[i + 1];
        }
        if (obj == null) {
            return null;
        }
        int i2 = this.d + 1;
        int i3 = ((e >> 1) + i2) << 1;
        Object obj2 = this.y[i3];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.y[i3 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i4 = (i2 + (i2 >> 1)) << 1;
        int i5 = this.x + i4;
        while (i4 < i5) {
            Object obj3 = this.y[i4];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this.y[i4 + 1];
            }
            i4 += 2;
        }
        return null;
    }

    public final int e(String str) {
        return str.hashCode() & this.d;
    }

    public Iterator<SettableBeanProperty> iterator() {
        ArrayList arrayList = new ArrayList(this.q);
        int length = this.y.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.y[i];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList.iterator();
    }

    public BeanPropertyMap k() {
        int length = this.y.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.y[i2];
            if (settableBeanProperty != null) {
                settableBeanProperty.h(i);
                i++;
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i2 = i + 1;
            if (i > 0) {
                P0.append(", ");
            }
            P0.append(next.x.q);
            P0.append('(');
            P0.append(next.y);
            P0.append(')');
            i = i2;
        }
        P0.append(']');
        if (!this.Z1.isEmpty()) {
            P0.append("(aliases: ");
            P0.append(this.Z1);
            P0.append(")");
        }
        return P0.toString();
    }

    public SettableBeanProperty v(String str) {
        if (str != null) {
            if (this.c) {
                str = str.toLowerCase(this.b2);
            }
            int hashCode = str.hashCode() & this.d;
            int i = hashCode << 1;
            Object obj = this.y[i];
            if (obj == str || str.equals(obj)) {
                return (SettableBeanProperty) this.y[i + 1];
            }
            if (obj == null) {
                return c(this.a2.get(str));
            }
            int i2 = this.d + 1;
            int i3 = ((hashCode >> 1) + i2) << 1;
            Object obj2 = this.y[i3];
            if (str.equals(obj2)) {
                return (SettableBeanProperty) this.y[i3 + 1];
            }
            if (obj2 != null) {
                int i4 = (i2 + (i2 >> 1)) << 1;
                int i5 = this.x + i4;
                while (i4 < i5) {
                    Object obj3 = this.y[i4];
                    if (obj3 == str || str.equals(obj3)) {
                        return (SettableBeanProperty) this.y[i4 + 1];
                    }
                    i4 += 2;
                }
            }
            return c(this.a2.get(str));
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    public final String w(SettableBeanProperty settableBeanProperty) {
        if (this.c) {
            return settableBeanProperty.x.q.toLowerCase(this.b2);
        }
        return settableBeanProperty.x.q;
    }

    public void x(Collection<SettableBeanProperty> collection) {
        int i;
        int size = collection.size();
        this.q = size;
        if (size <= 5) {
            i = 8;
        } else if (size <= 12) {
            i = 16;
        } else {
            int i2 = 32;
            while (i2 < size + (size >> 2)) {
                i2 += i2;
            }
            i = i2;
        }
        this.d = i - 1;
        int i3 = (i >> 1) + i;
        Object[] objArr = new Object[(i3 * 2)];
        int i4 = 0;
        for (SettableBeanProperty next : collection) {
            if (next != null) {
                String w = w(next);
                int e = e(w);
                int i5 = e << 1;
                if (objArr[i5] != null) {
                    i5 = ((e >> 1) + i) << 1;
                    if (objArr[i5] != null) {
                        i5 = (i3 << 1) + i4;
                        i4 += 2;
                        if (i5 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i5] = w;
                objArr[i5 + 1] = next;
            }
        }
        this.y = objArr;
        this.x = i4;
    }

    public void y(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this.q);
        String w = w(settableBeanProperty);
        int length = this.y.length;
        boolean z = false;
        for (int i = 1; i < length; i += 2) {
            Object[] objArr = this.y;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i];
            if (settableBeanProperty2 != null) {
                if (z || !(z = w.equals(objArr[i - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this.Y1[b(settableBeanProperty2)] = null;
                }
            }
        }
        if (z) {
            x(arrayList);
            return;
        }
        throw new NoSuchElementException(a.y0(a.P0("No entry '"), settableBeanProperty.x.q, "' found, can't remove"));
    }

    public BeanPropertyMap z(SettableBeanProperty settableBeanProperty) {
        String w = w(settableBeanProperty);
        int length = this.y.length;
        for (int i = 1; i < length; i += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this.y[i];
            if (settableBeanProperty2 != null && settableBeanProperty2.x.q.equals(w)) {
                return new BeanPropertyMap(this, settableBeanProperty, i, b(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, w, e(w));
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i, int i2) {
        this.c = beanPropertyMap.c;
        this.b2 = beanPropertyMap.b2;
        this.d = beanPropertyMap.d;
        this.q = beanPropertyMap.q;
        this.x = beanPropertyMap.x;
        this.Z1 = beanPropertyMap.Z1;
        this.a2 = beanPropertyMap.a2;
        Object[] objArr = beanPropertyMap.y;
        this.y = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.Y1;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.Y1 = settableBeanPropertyArr2;
        this.y[i] = settableBeanProperty;
        settableBeanPropertyArr2[i2] = settableBeanProperty;
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i) {
        this.c = beanPropertyMap.c;
        this.b2 = beanPropertyMap.b2;
        this.d = beanPropertyMap.d;
        this.q = beanPropertyMap.q;
        this.x = beanPropertyMap.x;
        this.Z1 = beanPropertyMap.Z1;
        this.a2 = beanPropertyMap.a2;
        Object[] objArr = beanPropertyMap.y;
        this.y = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.Y1;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this.Y1 = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i2 = this.d + 1;
        int i3 = i << 1;
        Object[] objArr2 = this.y;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = this.x;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this.x = i4 + 2;
                if (i3 >= objArr2.length) {
                    this.y = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.y;
        objArr3[i3] = str;
        objArr3[i3 + 1] = settableBeanProperty;
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z) {
        this.c = z;
        this.b2 = beanPropertyMap.b2;
        this.Z1 = beanPropertyMap.Z1;
        this.a2 = beanPropertyMap.a2;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.Y1;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.Y1 = settableBeanPropertyArr2;
        x(Arrays.asList(settableBeanPropertyArr2));
    }
}
