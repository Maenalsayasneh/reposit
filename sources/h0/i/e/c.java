package h0.i.e;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat */
public final class c {
    public d a;

    static {
        a(new Locale[0]);
    }

    public c(d dVar) {
        this.a = dVar;
    }

    public static c a(Locale... localeArr) {
        return c(new LocaleList(localeArr));
    }

    public static c c(LocaleList localeList) {
        return new c(new e(localeList));
    }

    public Locale b(int i) {
        return this.a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}
