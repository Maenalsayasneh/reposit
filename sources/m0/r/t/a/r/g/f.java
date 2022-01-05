package m0.r.t.a.r.g;

/* compiled from: SpecialNames */
public class f {
    public static final d a = d.j("<no name provided>");
    public static final d b = d.g("Companion");
    public static final d c = d.g("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");

    static {
        d.j("<root package>");
        d.j("<anonymous>");
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 1 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 1 ? 2 : 3)];
        if (i != 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        } else {
            objArr[0] = "name";
        }
        if (i != 1) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        }
        if (i == 1) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }
}
