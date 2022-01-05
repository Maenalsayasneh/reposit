package h0.i.e;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListPlatformWrapper */
public final class e implements d {
    public final LocaleList a;

    public e(LocaleList localeList) {
        this.a = localeList;
    }

    public String a() {
        return this.a.toLanguageTags();
    }

    public Object b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return this.a.equals(((d) obj).b());
    }

    public Locale get(int i) {
        return this.a.get(i);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }
}
