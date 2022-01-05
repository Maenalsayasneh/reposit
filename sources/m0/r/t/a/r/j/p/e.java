package m0.r.t.a.r.j.p;

import java.util.Arrays;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class e extends m<Character> {
    public e(char c) {
        super(Character.valueOf(c));
    }

    public v a(u uVar) {
        i.e(uVar, "module");
        f m = uVar.m();
        Objects.requireNonNull(m);
        a0 t = m.t(PrimitiveType.CHAR);
        if (t != null) {
            i.d(t, "module.builtIns.charType");
            return t;
        }
        f.a(61);
        throw null;
    }

    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(((Character) this.a).charValue());
        char charValue = ((Character) this.a).charValue();
        if (charValue == 8) {
            str = "\\b";
        } else if (charValue == 9) {
            str = "\\t";
        } else if (charValue == 10) {
            str = "\\n";
        } else if (charValue == 12) {
            str = "\\f";
        } else if (charValue == 13) {
            str = "\\r";
        } else {
            byte type = (byte) Character.getType(charValue);
            if (!(type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19)) {
                z = true;
            }
            str = z ? String.valueOf(charValue) : "?";
        }
        objArr[1] = str;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        i.d(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
