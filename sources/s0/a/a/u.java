package s0.a.a;

import java.util.Enumeration;
import java.util.NoSuchElementException;

public class u implements Enumeration {
    public int a = 0;
    public final /* synthetic */ v b;

    public u(v vVar) {
        this.b = vVar;
    }

    public boolean hasMoreElements() {
        return this.a < this.b.c.length;
    }

    public Object nextElement() {
        int i = this.a;
        e[] eVarArr = this.b.c;
        if (i < eVarArr.length) {
            this.a = i + 1;
            return eVarArr[i];
        }
        throw new NoSuchElementException();
    }
}
