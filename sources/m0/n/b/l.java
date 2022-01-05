package m0.n.b;

/* compiled from: PackageReference.kt */
public final class l implements c {
    public final Class<?> c;

    public l(Class<?> cls, String str) {
        i.e(cls, "jClass");
        i.e(str, "moduleName");
        this.c = cls;
    }

    public boolean equals(Object obj) {
        return (obj instanceof l) && i.a(this.c, ((l) obj).c);
    }

    public Class<?> h() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return this.c.toString() + " (Kotlin reflection is not available)";
    }
}
