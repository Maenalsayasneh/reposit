package androidx.constraintlayout.core.parser;

import i0.d.a.a.a;

public class CLParsingException extends Exception {
    public String toString() {
        StringBuilder P0 = a.P0("CLParsingException (");
        P0.append(hashCode());
        P0.append(") : ");
        P0.append("null (null at line 0)");
        return P0.toString();
    }
}
