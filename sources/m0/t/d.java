package m0.t;

import i0.d.a.a.a;
import kotlin.text.Regex;

/* compiled from: StringNumberConversionsJVM.kt */
public final class d {
    public static final Regex a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append("(\\p{Digit}+)");
        sb.append("(\\.)?(");
        sb.append("(\\p{Digit}+)");
        sb.append("?)(");
        a.s(sb, "[eE][+-]?(\\p{Digit}+)", ")?)|", "(\\.(", "(\\p{Digit}+)");
        a.s(sb, ")(", "[eE][+-]?(\\p{Digit}+)", ")?)|", "((");
        sb.append("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))");
        sb.append(")[pP][+-]?");
        sb.append("(\\p{Digit}+)");
        sb.append(')');
        a = new Regex(a.o0("[\\x00-\\x20]*[+-]?(NaN|Infinity|((", sb.toString(), ")[fFdD]?))[\\x00-\\x20]*"));
    }
}
