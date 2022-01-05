package m0.q;

import java.util.NoSuchElementException;
import m0.j.o;

/* compiled from: ProgressionIterators.kt */
public final class d extends o {
    public final int c;
    public boolean d;
    public int q;
    public final int x;

    public d(int i, int i2, int i3) {
        this.x = i3;
        this.c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.d = z;
        this.q = !z ? i2 : i;
    }

    public int a() {
        int i = this.q;
        if (i != this.c) {
            this.q = this.x + i;
        } else if (this.d) {
            this.d = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.d;
    }
}
