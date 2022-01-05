package m0.r.t.a.r.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: FqNameUnsafe */
public final class c {
    public static final d a = d.j("<root>");
    public static final Pattern b = Pattern.compile("\\.");
    public static final l<String, d> c = new a();
    public final String d;
    public transient b e;
    public transient c f;
    public transient d g;

    /* compiled from: FqNameUnsafe */
    public static class a implements l<String, d> {
        public Object invoke(Object obj) {
            return d.f((String) obj);
        }
    }

    public c(String str, b bVar) {
        if (str != null) {
            this.d = str;
            this.e = bVar;
            return;
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public String b() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        a(4);
        throw null;
    }

    public c c(d dVar) {
        String str;
        if (dVar != null) {
            if (e()) {
                str = dVar.b();
            } else {
                str = this.d + "." + dVar.b();
            }
            return new c(str, this, dVar);
        }
        a(9);
        throw null;
    }

    public final void d() {
        int lastIndexOf = this.d.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.g = d.f(this.d.substring(lastIndexOf + 1));
            this.f = new c(this.d.substring(0, lastIndexOf));
            return;
        }
        this.g = d.f(this.d);
        this.f = b.a.j();
    }

    public boolean e() {
        return this.d.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.d.equals(((c) obj).d);
    }

    public boolean f() {
        return this.e != null || b().indexOf(60) < 0;
    }

    public List<d> g() {
        List<d> list;
        if (e()) {
            list = Collections.emptyList();
        } else {
            String[] split = b.split(this.d);
            l<String, d> lVar = c;
            i.e(split, "$this$map");
            i.e(lVar, "transform");
            ArrayList arrayList = new ArrayList(split.length);
            for (String invoke : split) {
                arrayList.add(lVar.invoke(invoke));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public d h() {
        d dVar = this.g;
        if (dVar != null) {
            if (dVar != null) {
                return dVar;
            }
            a(10);
            throw null;
        } else if (!e()) {
            d();
            d dVar2 = this.g;
            if (dVar2 != null) {
                return dVar2;
            }
            a(11);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public b i() {
        b bVar = this.e;
        if (bVar == null) {
            b bVar2 = new b(this);
            this.e = bVar2;
            if (bVar2 != null) {
                return bVar2;
            }
            a(6);
            throw null;
        } else if (bVar != null) {
            return bVar;
        } else {
            a(5);
            throw null;
        }
    }

    public String toString() {
        String b2 = e() ? a.b() : this.d;
        if (b2 != null) {
            return b2;
        }
        a(17);
        throw null;
    }

    public c(String str) {
        if (str != null) {
            this.d = str;
        } else {
            a(2);
            throw null;
        }
    }

    public c(String str, c cVar, d dVar) {
        if (str != null) {
            this.d = str;
            this.f = cVar;
            this.g = dVar;
            return;
        }
        a(3);
        throw null;
    }
}
