package m0.r.t.a.r.g;

import i0.d.a.a.a;

/* compiled from: Name */
public final class d implements Comparable<d> {
    public final String c;
    public final boolean d;

    public d(String str, boolean z) {
        if (str != null) {
            this.c = str;
            this.d = z;
            return;
        }
        a(0);
        throw null;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[1] = "getIdentifier";
        }
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                objArr[2] = "identifier";
                break;
            case 4:
                objArr[2] = "isValidIdentifier";
                break;
            case 5:
                objArr[2] = "special";
                break;
            case 6:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static d f(String str) {
        if (str == null) {
            a(6);
            throw null;
        } else if (str.startsWith("<")) {
            return j(str);
        } else {
            return g(str);
        }
    }

    public static d g(String str) {
        if (str != null) {
            return new d(str, false);
        }
        a(3);
        throw null;
    }

    public static boolean i(String str) {
        if (str == null) {
            a(4);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    public static d j(String str) {
        if (str == null) {
            a(5);
            throw null;
        } else if (str.startsWith("<")) {
            return new d(str, true);
        } else {
            throw new IllegalArgumentException(a.n0("special name must start with '<': ", str));
        }
    }

    public String b() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public int compareTo(Object obj) {
        return this.c.compareTo(((d) obj).c);
    }

    public String e() {
        if (!this.d) {
            String b = b();
            if (b != null) {
                return b;
            }
            a(2);
            throw null;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.d == dVar.d && this.c.equals(dVar.c);
    }

    public int hashCode() {
        return (this.c.hashCode() * 31) + (this.d ? 1 : 0);
    }

    public String toString() {
        return this.c;
    }
}
