package s0.a.a;

import java.io.IOException;

public class p1 implements t {
    public x c;

    public p1(x xVar) {
        this.c = xVar;
    }

    public r c() {
        try {
            return new o1(this.c.c());
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public r j() throws IOException {
        return new o1(this.c.c());
    }
}
