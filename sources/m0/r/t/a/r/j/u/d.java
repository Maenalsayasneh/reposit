package m0.r.t.a.r.j.u;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: MemberScope.kt */
public final class d {
    public static final a a = new a((f) null);
    public static int b = 1;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final d m;
    public static final d n;
    public static final d o;
    public static final d p;
    public static final d q;
    public static final List<a.C0273a> r;
    public static final List<a.C0273a> s;
    public final List<c> t;
    public final int u;

    /* compiled from: MemberScope.kt */
    public static final class a {

        /* renamed from: m0.r.t.a.r.j.u.d$a$a  reason: collision with other inner class name */
        /* compiled from: MemberScope.kt */
        public static final class C0273a {
            public final int a;
            public final String b;

            public C0273a(int i, String str) {
                i.e(str, "name");
                this.a = i;
                this.b = str;
            }
        }

        public a(f fVar) {
        }
    }

    static {
        a.C0273a aVar;
        a.C0273a aVar2;
        Class<d> cls = d.class;
        int i2 = b;
        int i3 = i2 << 1;
        b = i3;
        c = i2;
        int i4 = i3 << 1;
        b = i4;
        d = i3;
        int i5 = i4 << 1;
        b = i5;
        e = i4;
        int i6 = i5 << 1;
        b = i6;
        f = i5;
        int i7 = i6 << 1;
        b = i7;
        g = i6;
        int i8 = i7 << 1;
        b = i8;
        h = i7;
        b = i8 << 1;
        int i9 = i8 - 1;
        i = i9;
        int i10 = i2 | i3 | i4;
        j = i10;
        int i11 = i3 | i6 | i7;
        k = i11;
        int i12 = i6 | i7;
        l = i12;
        m = new d(i9, (List) null, 2);
        n = new d(i12, (List) null, 2);
        new d(i2, (List) null, 2);
        new d(i3, (List) null, 2);
        new d(i4, (List) null, 2);
        o = new d(i10, (List) null, 2);
        new d(i5, (List) null, 2);
        p = new d(i6, (List) null, 2);
        q = new d(i7, (List) null, 2);
        new d(i11, (List) null, 2);
        Field[] fields = cls.getFields();
        i.d(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field2 = (Field) it.next();
            Object obj = field2.get((Object) null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i13 = dVar.u;
                String name = field2.getName();
                i.d(name, "field.name");
                aVar2 = new a.C0273a(i13, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        r = arrayList2;
        Field[] fields2 = cls.getFields();
        i.d(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (i.a(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Field field4 = (Field) it3.next();
            Object obj2 = field4.get((Object) null);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                i.d(name2, "field.name");
                aVar = new a.C0273a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        s = arrayList5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d(int i2, List list, int i3) {
        this(i2, (i3 & 2) != 0 ? EmptyList.c : null);
    }

    public final boolean a(int i2) {
        return (i2 & this.u) != 0;
    }

    public String toString() {
        T t2;
        String str;
        boolean z;
        Iterator<T> it = r.iterator();
        while (true) {
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (((a.C0273a) t2).a == this.u) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        a.C0273a aVar = (a.C0273a) t2;
        if (aVar == null) {
            str = null;
        } else {
            str = aVar.b;
        }
        if (str == null) {
            List<a.C0273a> list = s;
            ArrayList arrayList = new ArrayList();
            for (a.C0273a aVar2 : list) {
                String str2 = a(aVar2.a) ? aVar2.b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = g.E(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
        }
        return i0.d.a.a.a.A0(i0.d.a.a.a.T0("DescriptorKindFilter(", str, ", "), this.t, ')');
    }

    public d(int i2, List<? extends c> list) {
        i.e(list, "excludes");
        this.t = list;
        for (c a2 : list) {
            i2 &= ~a2.a();
        }
        this.u = i2;
    }
}
