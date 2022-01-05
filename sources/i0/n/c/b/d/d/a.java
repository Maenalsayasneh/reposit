package i0.n.c.b.d.d;

import com.sinch.verification.core.internal.error.CodeInterceptionException;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;

/* compiled from: FlashCallPatternFactory.kt */
public final class a implements i0.n.c.a.e.c.a {
    public Pattern a(String str) {
        i.e(str, "template");
        String quote = Pattern.quote(str);
        i.d(quote, "Pattern.quote(template)");
        String B = StringsKt__IndentKt.B(StringsKt__IndentKt.B(quote, "(", "\\E(", false, 4), ")", ")\\Q", false, 4);
        try {
            Pattern compile = Pattern.compile(B);
            i.d(compile, "Pattern.compile(escapedTemplate)");
            return compile;
        } catch (PatternSyntaxException e) {
            StringBuilder T0 = i0.d.a.a.a.T0("Failed to compile pattern: ", B, ", error: ");
            T0.append(e.getMessage());
            throw new CodeInterceptionException(T0.toString());
        }
    }
}
