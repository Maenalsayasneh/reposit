package i0.f.a.c.s;

import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import java.util.ArrayList;

/* compiled from: ClassStack */
public final class a {
    public final a a;
    public final Class<?> b;
    public ArrayList<ResolvedRecursiveType> c;

    public a(a aVar, Class<?> cls) {
        this.a = aVar;
        this.b = cls;
    }

    public String toString() {
        String str;
        StringBuilder P0 = i0.d.a.a.a.P0("[ClassStack (self-refs: ");
        ArrayList<ResolvedRecursiveType> arrayList = this.c;
        if (arrayList == null) {
            str = "0";
        } else {
            str = String.valueOf(arrayList.size());
        }
        P0.append(str);
        P0.append(')');
        for (a aVar = this; aVar != null; aVar = aVar.a) {
            P0.append(' ');
            P0.append(aVar.b.getName());
        }
        P0.append(']');
        return P0.toString();
    }

    public a(Class<?> cls) {
        this.a = null;
        this.b = cls;
    }
}
