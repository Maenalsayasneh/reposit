package q0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.c;

/* compiled from: Headers.kt */
public final class v implements Iterable<Pair<? extends String, ? extends String>>, m0.n.b.s.a {
    public static final b c = new b((f) null);
    public final String[] d;

    /* compiled from: Headers.kt */
    public static final class a {
        public final List<String> a = new ArrayList(20);

        public final a a(String str, String str2) {
            i.e(str, "name");
            i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            b bVar = v.c;
            bVar.a(str);
            bVar.b(str2, str);
            c(str, str2);
            return this;
        }

        public final a b(String str) {
            i.e(str, "line");
            int l = StringsKt__IndentKt.l(str, ':', 1, false, 4);
            if (l != -1) {
                String substring = str.substring(0, l);
                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(l + 1);
                i.d(substring2, "(this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (str.charAt(0) == ':') {
                String substring3 = str.substring(1);
                i.d(substring3, "(this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", str);
            }
            return this;
        }

        public final a c(String str, String str2) {
            i.e(str, "name");
            i.e(str2, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            this.a.add(str);
            this.a.add(StringsKt__IndentKt.X(str2).toString());
            return this;
        }

        public final v d() {
            Object[] array = this.a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new v((String[]) array, (f) null);
        }

        public final String e(String str) {
            i.e(str, "name");
            c e = m0.q.i.e(m0.q.i.d(this.a.size() - 2, 0), 2);
            int i = e.c;
            int i2 = e.d;
            int i3 = e.q;
            if (i3 >= 0) {
                if (i > i2) {
                    return null;
                }
            } else if (i < i2) {
                return null;
            }
            while (!StringsKt__IndentKt.f(str, this.a.get(i), true)) {
                if (i == i2) {
                    return null;
                }
                i += i3;
            }
            return this.a.get(i + 1);
        }

        public final a f(String str) {
            i.e(str, "name");
            int i = 0;
            while (i < this.a.size()) {
                if (StringsKt__IndentKt.f(str, this.a.get(i), true)) {
                    this.a.remove(i);
                    this.a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }
    }

    /* compiled from: Headers.kt */
    public static final class b {
        public b(f fVar) {
        }

        public final void a(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(q0.h0.c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        public final void b(String str, String str2) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == 9 || (' ' <= charAt && '~' >= charAt)) {
                    i++;
                } else {
                    throw new IllegalArgumentException(q0.h0.c.i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str).toString());
                }
            }
        }

        public final v c(String... strArr) {
            i.e(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = StringsKt__IndentKt.X(str).toString();
                        i++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                c e = m0.q.i.e(m0.q.i.f(0, strArr2.length), 2);
                int i2 = e.c;
                int i3 = e.d;
                int i4 = e.q;
                if (i4 < 0 ? i2 >= i3 : i2 <= i3) {
                    while (true) {
                        String str2 = strArr2[i2];
                        String str3 = strArr2[i2 + 1];
                        a(str2);
                        b(str3, str2);
                        if (i2 == i3) {
                            break;
                        }
                        i2 += i4;
                    }
                }
                return new v(strArr2, (f) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public v(String[] strArr, f fVar) {
        this.d = strArr;
    }

    public final String b(String str) {
        i.e(str, "name");
        String[] strArr = this.d;
        c e = m0.q.i.e(m0.q.i.d(strArr.length - 2, 0), 2);
        int i = e.c;
        int i2 = e.d;
        int i3 = e.q;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!StringsKt__IndentKt.f(str, strArr[i], true)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.d[i * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof v) && Arrays.equals(this.d, ((v) obj).d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public Iterator<Pair<String, String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(c(i), k(i));
        }
        return h.C2(pairArr);
    }

    public final a j() {
        a aVar = new a();
        List<String> list = aVar.a;
        String[] strArr = this.d;
        i.e(list, "$this$addAll");
        i.e(strArr, "elements");
        list.addAll(g.d(strArr));
        return aVar;
    }

    public final String k(int i) {
        return this.d[(i * 2) + 1];
    }

    public final List<String> o(String str) {
        i.e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (StringsKt__IndentKt.f(str, c(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(k(i));
            }
        }
        if (arrayList == null) {
            return EmptyList.c;
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        i.d(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int size() {
        return this.d.length / 2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            sb.append(c(i));
            sb.append(": ");
            sb.append(k(i));
            sb.append("\n");
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
