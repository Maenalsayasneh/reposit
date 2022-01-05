package h0.w.k;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TableInfo */
public class c {
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;

    /* compiled from: TableInfo */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;

        public a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.a = str;
            this.b = str2;
            this.d = z;
            this.e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                    i3 = 2;
                } else if (!upperCase.contains("BLOB")) {
                    i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                }
            }
            this.c = i3;
            this.f = str3;
            this.g = i2;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.e != aVar.e || !this.a.equals(aVar.a) || this.d != aVar.d) {
                return false;
            }
            if (this.g == 1 && aVar.g == 2 && (str3 = this.f) != null && !str3.equals(aVar.f)) {
                return false;
            }
            if (this.g == 2 && aVar.g == 1 && (str2 = aVar.f) != null && !str2.equals(this.f)) {
                return false;
            }
            int i = this.g;
            if (i != 0 && i == aVar.g && ((str = this.f) == null ? aVar.f != null : !str.equals(aVar.f))) {
                return false;
            }
            if (this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + this.c) * 31) + (this.d ? 1231 : 1237)) * 31) + this.e;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Column{name='");
            i0.d.a.a.a.r(P0, this.a, '\'', ", type='");
            i0.d.a.a.a.r(P0, this.b, '\'', ", affinity='");
            P0.append(this.c);
            P0.append('\'');
            P0.append(", notNull=");
            P0.append(this.d);
            P0.append(", primaryKeyPosition=");
            P0.append(this.e);
            P0.append(", defaultValue='");
            P0.append(this.f);
            P0.append('\'');
            P0.append('}');
            return P0.toString();
        }
    }

    /* compiled from: TableInfo */
    public static class b {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = Collections.unmodifiableList(list);
            this.e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a.equals(bVar.a) && this.b.equals(bVar.b) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return this.e.equals(bVar.e);
            }
            return false;
        }

        public int hashCode() {
            int F = i0.d.a.a.a.F(this.c, i0.d.a.a.a.F(this.b, this.a.hashCode() * 31, 31), 31);
            return this.e.hashCode() + ((this.d.hashCode() + F) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("ForeignKey{referenceTable='");
            i0.d.a.a.a.r(P0, this.a, '\'', ", onDelete='");
            i0.d.a.a.a.r(P0, this.b, '\'', ", onUpdate='");
            i0.d.a.a.a.r(P0, this.c, '\'', ", columnNames=");
            P0.append(this.d);
            P0.append(", referenceColumnNames=");
            return i0.d.a.a.a.A0(P0, this.e, '}');
        }
    }

    /* renamed from: h0.w.k.c$c  reason: collision with other inner class name */
    /* compiled from: TableInfo */
    public static class C0074c implements Comparable<C0074c> {
        public final int c;
        public final int d;
        public final String q;
        public final String x;

        public C0074c(int i, int i2, String str, String str2) {
            this.c = i;
            this.d = i2;
            this.q = str;
            this.x = str2;
        }

        public int compareTo(Object obj) {
            C0074c cVar = (C0074c) obj;
            int i = this.c - cVar.c;
            return i == 0 ? this.d - cVar.d : i;
        }
    }

    /* compiled from: TableInfo */
    public static class d {
        public final String a;
        public final boolean b;
        public final List<String> c;

        public d(String str, boolean z, List<String> list) {
            this.a = str;
            this.b = z;
            this.c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.b != dVar.b || !this.c.equals(dVar.c)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return dVar.a.startsWith("index_");
            }
            return this.a.equals(dVar.a);
        }

        public int hashCode() {
            int i;
            if (this.a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.a.hashCode();
            }
            return this.c.hashCode() + (((i * 31) + (this.b ? 1 : 0)) * 31);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Index{name='");
            i0.d.a.a.a.r(P0, this.a, '\'', ", unique=");
            P0.append(this.b);
            P0.append(", columns=");
            return i0.d.a.a.a.A0(P0, this.c, '}');
        }
    }

    public c(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        Set<d> set3;
        this.a = str;
        this.b = Collections.unmodifiableMap(map);
        this.c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.d = set3;
    }

    /* JADX INFO: finally extract failed */
    public static c a(h0.y.a.b bVar, String str) {
        int i;
        int i2;
        List<C0074c> list;
        int i3;
        String str2 = str;
        h0.y.a.f.a aVar = (h0.y.a.f.a) bVar;
        Cursor e = aVar.e(i0.d.a.a.a.o0("PRAGMA table_info(`", str2, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (e.getColumnCount() > 0) {
                int columnIndex = e.getColumnIndex("name");
                int columnIndex2 = e.getColumnIndex("type");
                int columnIndex3 = e.getColumnIndex("notnull");
                int columnIndex4 = e.getColumnIndex("pk");
                int columnIndex5 = e.getColumnIndex("dflt_value");
                while (e.moveToNext()) {
                    String string = e.getString(columnIndex);
                    int i4 = columnIndex;
                    a aVar2 = r12;
                    a aVar3 = new a(string, e.getString(columnIndex2), e.getInt(columnIndex3) != 0, e.getInt(columnIndex4), e.getString(columnIndex5), 2);
                    hashMap.put(string, aVar2);
                    columnIndex = i4;
                }
            }
            e.close();
            HashSet hashSet = new HashSet();
            Cursor e2 = aVar.e("PRAGMA foreign_key_list(`" + str2 + "`)");
            try {
                int columnIndex6 = e2.getColumnIndex("id");
                int columnIndex7 = e2.getColumnIndex("seq");
                int columnIndex8 = e2.getColumnIndex("table");
                int columnIndex9 = e2.getColumnIndex("on_delete");
                int columnIndex10 = e2.getColumnIndex("on_update");
                List<C0074c> b2 = b(e2);
                int count = e2.getCount();
                int i5 = 0;
                while (i5 < count) {
                    e2.moveToPosition(i5);
                    if (e2.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i3 = columnIndex7;
                        list = b2;
                        i2 = count;
                    } else {
                        int i6 = e2.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList = new ArrayList();
                        i3 = columnIndex7;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = ((ArrayList) b2).iterator();
                        while (it.hasNext()) {
                            List<C0074c> list2 = b2;
                            C0074c cVar = (C0074c) it.next();
                            int i7 = count;
                            if (cVar.c == i6) {
                                arrayList.add(cVar.q);
                                arrayList2.add(cVar.x);
                            }
                            b2 = list2;
                            count = i7;
                        }
                        list = b2;
                        i2 = count;
                        hashSet.add(new b(e2.getString(columnIndex8), e2.getString(columnIndex9), e2.getString(columnIndex10), arrayList, arrayList2));
                    }
                    i5++;
                    columnIndex6 = i;
                    columnIndex7 = i3;
                    b2 = list;
                    count = i2;
                }
                e2.close();
                Cursor e3 = aVar.e("PRAGMA index_list(`" + str2 + "`)");
                try {
                    int columnIndex11 = e3.getColumnIndex("name");
                    int columnIndex12 = e3.getColumnIndex("origin");
                    int columnIndex13 = e3.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1) {
                        if (columnIndex13 != -1) {
                            HashSet hashSet3 = new HashSet();
                            while (e3.moveToNext()) {
                                if ("c".equals(e3.getString(columnIndex12))) {
                                    String string2 = e3.getString(columnIndex11);
                                    boolean z = true;
                                    if (e3.getInt(columnIndex13) != 1) {
                                        z = false;
                                    }
                                    d c2 = c(aVar, string2, z);
                                    if (c2 != null) {
                                        hashSet3.add(c2);
                                    }
                                }
                            }
                            e3.close();
                            hashSet2 = hashSet3;
                            return new c(str2, hashMap, hashSet, hashSet2);
                        }
                    }
                    return new c(str2, hashMap, hashSet, hashSet2);
                } finally {
                    e3.close();
                }
            } catch (Throwable th) {
                e2.close();
                throw th;
            }
        } catch (Throwable th2) {
            e.close();
            throw th2;
        }
    }

    public static List<C0074c> b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0074c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static d c(h0.y.a.b bVar, String str, boolean z) {
        Cursor e = ((h0.y.a.f.a) bVar).e(i0.d.a.a.a.o0("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = e.getColumnIndex("seqno");
            int columnIndex2 = e.getColumnIndex("cid");
            int columnIndex3 = e.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (e.moveToNext()) {
                        if (e.getInt(columnIndex2) >= 0) {
                            int i = e.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), e.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    d dVar = new d(str, z, arrayList);
                    e.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            e.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.a;
        if (str == null ? cVar.a != null : !str.equals(cVar.a)) {
            return false;
        }
        Map<String, a> map = this.b;
        if (map == null ? cVar.b != null : !map.equals(cVar.b)) {
            return false;
        }
        Set<b> set2 = this.c;
        if (set2 == null ? cVar.c != null : !set2.equals(cVar.c)) {
            return false;
        }
        Set<d> set3 = this.d;
        if (set3 == null || (set = cVar.d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("TableInfo{name='");
        i0.d.a.a.a.r(P0, this.a, '\'', ", columns=");
        P0.append(this.b);
        P0.append(", foreignKeys=");
        P0.append(this.c);
        P0.append(", indices=");
        P0.append(this.d);
        P0.append('}');
        return P0.toString();
    }
}
