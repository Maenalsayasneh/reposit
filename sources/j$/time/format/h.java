package j$.time.format;

import j$.time.temporal.j;
import j$.time.temporal.p;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class h {
    private static final ConcurrentMap a = new ConcurrentHashMap(16, 0.75f, 2);
    /* access modifiers changed from: private */
    public static final Comparator b = new a();
    public static final /* synthetic */ int c = 0;

    class a implements Comparator<Map.Entry<String, Long>> {
        a() {
        }

        public int compare(Object obj, Object obj2) {
            return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
        }
    }

    static final class b {
        private final Map a;
        private final Map b;

        b(Map map) {
            this.a = map;
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    int i = h.c;
                    hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
                }
                ArrayList arrayList2 = new ArrayList(hashMap2.values());
                Collections.sort(arrayList2, h.b);
                hashMap.put((m) entry.getKey(), arrayList2);
                arrayList.addAll(arrayList2);
                hashMap.put((Object) null, arrayList);
            }
            Collections.sort(arrayList, h.b);
            this.b = hashMap;
        }

        /* access modifiers changed from: package-private */
        public String a(long j, m mVar) {
            Map map = (Map) this.a.get(mVar);
            if (map != null) {
                return (String) map.get(Long.valueOf(j));
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public Iterator b(m mVar) {
            List list = (List) this.b.get(mVar);
            if (list != null) {
                return list.iterator();
            }
            return null;
        }
    }

    h() {
    }

    private Object b(p pVar, Locale locale) {
        Object obj;
        p pVar2 = pVar;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(pVar2, locale);
        ConcurrentMap concurrentMap = a;
        Object obj2 = concurrentMap.get(simpleImmutableEntry);
        if (obj2 != null) {
            return obj2;
        }
        HashMap hashMap = new HashMap();
        int i = 0;
        if (pVar2 == j.ERA) {
            DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            String[] eras = instance.getEras();
            while (i < eras.length) {
                if (!eras[i].isEmpty()) {
                    long j = (long) i;
                    hashMap2.put(Long.valueOf(j), eras[i]);
                    hashMap3.put(Long.valueOf(j), c(eras[i]));
                }
                i++;
            }
            if (!hashMap2.isEmpty()) {
                hashMap.put(m.FULL, hashMap2);
                hashMap.put(m.SHORT, hashMap2);
                hashMap.put(m.NARROW, hashMap3);
            }
            obj = new b(hashMap);
        } else if (pVar2 == j.MONTH_OF_YEAR) {
            DateFormatSymbols instance2 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            String[] months = instance2.getMonths();
            for (int i2 = 0; i2 < months.length; i2++) {
                if (!months[i2].isEmpty()) {
                    long j2 = ((long) i2) + 1;
                    hashMap4.put(Long.valueOf(j2), months[i2]);
                    hashMap5.put(Long.valueOf(j2), c(months[i2]));
                }
            }
            if (!hashMap4.isEmpty()) {
                hashMap.put(m.FULL, hashMap4);
                hashMap.put(m.NARROW, hashMap5);
            }
            HashMap hashMap6 = new HashMap();
            String[] shortMonths = instance2.getShortMonths();
            while (i < shortMonths.length) {
                if (!shortMonths[i].isEmpty()) {
                    hashMap6.put(Long.valueOf(((long) i) + 1), shortMonths[i]);
                }
                i++;
            }
            if (!hashMap6.isEmpty()) {
                hashMap.put(m.SHORT, hashMap6);
            }
            obj = new b(hashMap);
        } else if (pVar2 == j.DAY_OF_WEEK) {
            DateFormatSymbols instance3 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap7 = new HashMap();
            String[] weekdays = instance3.getWeekdays();
            hashMap7.put(1L, weekdays[2]);
            hashMap7.put(2L, weekdays[3]);
            hashMap7.put(3L, weekdays[4]);
            hashMap7.put(4L, weekdays[5]);
            hashMap7.put(5L, weekdays[6]);
            hashMap7.put(6L, weekdays[7]);
            hashMap7.put(7L, weekdays[1]);
            hashMap.put(m.FULL, hashMap7);
            HashMap hashMap8 = new HashMap();
            hashMap8.put(1L, c(weekdays[2]));
            hashMap8.put(2L, c(weekdays[3]));
            hashMap8.put(3L, c(weekdays[4]));
            hashMap8.put(4L, c(weekdays[5]));
            hashMap8.put(5L, c(weekdays[6]));
            hashMap8.put(6L, c(weekdays[7]));
            hashMap8.put(7L, c(weekdays[1]));
            hashMap.put(m.NARROW, hashMap8);
            HashMap hashMap9 = new HashMap();
            String[] shortWeekdays = instance3.getShortWeekdays();
            hashMap9.put(1L, shortWeekdays[2]);
            hashMap9.put(2L, shortWeekdays[3]);
            hashMap9.put(3L, shortWeekdays[4]);
            hashMap9.put(4L, shortWeekdays[5]);
            hashMap9.put(5L, shortWeekdays[6]);
            hashMap9.put(6L, shortWeekdays[7]);
            hashMap9.put(7L, shortWeekdays[1]);
            hashMap.put(m.SHORT, hashMap9);
            obj = new b(hashMap);
        } else if (pVar2 == j.AMPM_OF_DAY) {
            DateFormatSymbols instance4 = DateFormatSymbols.getInstance(locale);
            HashMap hashMap10 = new HashMap();
            HashMap hashMap11 = new HashMap();
            String[] amPmStrings = instance4.getAmPmStrings();
            while (i < amPmStrings.length) {
                if (!amPmStrings[i].isEmpty()) {
                    long j3 = (long) i;
                    hashMap10.put(Long.valueOf(j3), amPmStrings[i]);
                    hashMap11.put(Long.valueOf(j3), c(amPmStrings[i]));
                }
                i++;
            }
            if (!hashMap10.isEmpty()) {
                hashMap.put(m.FULL, hashMap10);
                hashMap.put(m.SHORT, hashMap10);
                hashMap.put(m.NARROW, hashMap11);
            }
            obj = new b(hashMap);
        } else {
            obj = "";
        }
        concurrentMap.putIfAbsent(simpleImmutableEntry, obj);
        return concurrentMap.get(simpleImmutableEntry);
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    public String d(p pVar, long j, m mVar, Locale locale) {
        Object b2 = b(pVar, locale);
        if (b2 instanceof b) {
            return ((b) b2).a(j, mVar);
        }
        return null;
    }

    public Iterator e(p pVar, m mVar, Locale locale) {
        Object b2 = b(pVar, locale);
        if (b2 instanceof b) {
            return ((b) b2).b(mVar);
        }
        return null;
    }
}
