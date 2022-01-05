package s0.a.a;

import java.io.IOException;

public class h0 implements t {
    public x c;

    public h0(x xVar) {
        this.c = xVar;
    }

    public r c() {
        try {
            return j();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    public r j() throws IOException {
        return new g0(this.c.c());
    }
}
