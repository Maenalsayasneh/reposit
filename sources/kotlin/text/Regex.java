package kotlin.text;

import i0.j.f.p.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m0.n.b.i;

/* compiled from: Regex.kt */
public final class Regex implements Serializable {
    public final Pattern c;

    public Regex(String str) {
        i.e(str, "pattern");
        Pattern compile = Pattern.compile(str);
        i.d(compile, "Pattern.compile(pattern)");
        i.e(compile, "nativePattern");
        this.c = compile;
    }

    public final boolean a(CharSequence charSequence) {
        i.e(charSequence, "input");
        return this.c.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        i.e(charSequence, "input");
        i.e(str, "replacement");
        String replaceAll = this.c.matcher(charSequence).replaceAll(str);
        i.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> c(CharSequence charSequence, int i) {
        i.e(charSequence, "input");
        int i2 = 0;
        if (i >= 0) {
            Matcher matcher = this.c.matcher(charSequence);
            if (!matcher.find() || i == 1) {
                return h.L2(charSequence.toString());
            }
            int i3 = 10;
            if (i > 0 && i <= 10) {
                i3 = i;
            }
            ArrayList arrayList = new ArrayList(i3);
            int i4 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if ((i4 >= 0 && arrayList.size() == i4) || !matcher.find()) {
                    arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
                }
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                break;
            } while (!matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    public String toString() {
        String pattern = this.c.toString();
        i.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
