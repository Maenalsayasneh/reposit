package q0.h0.e;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import q0.b0;
import q0.e0;

/* compiled from: CacheStrategy.kt */
public final class d {
    public final b0 a;
    public final e0 b;

    public d(b0 b0Var, e0 e0Var) {
        this.a = b0Var;
        this.b = e0Var;
    }

    public static final boolean a(e0 e0Var, b0 b0Var) {
        i.e(e0Var, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        i.e(b0Var, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        int i = e0Var.y;
        if (!(i == 200 || i == 410 || i == 414 || i == 501 || i == 203 || i == 204)) {
            if (i != 307) {
                if (!(i == 308 || i == 404 || i == 405)) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (e0.b(e0Var, "Expires", (String) null, 2) == null && e0Var.a().e == -1 && !e0Var.a().h && !e0Var.a().g) {
                return false;
            }
        }
        if (e0Var.a().d || b0Var.a().d) {
            return false;
        }
        return true;
    }
}
