package n0.a;

import n0.a.h2.t;

/* compiled from: JobSupport.kt */
public final class j1 {
    public static final t a = new t("COMPLETING_ALREADY");
    public static final t b = new t("COMPLETING_WAITING_CHILDREN");
    public static final t c = new t("COMPLETING_RETRY");
    public static final t d = new t("TOO_LATE_TO_CANCEL");
    public static final t e = new t("SEALED");
    public static final r0 f = new r0(false);
    public static final r0 g = new r0(true);

    public static final Object a(Object obj) {
        b1 b1Var = obj instanceof b1 ? (b1) obj : null;
        return b1Var == null ? obj : b1Var.a;
    }
}
