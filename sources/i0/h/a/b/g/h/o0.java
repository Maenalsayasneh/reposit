package i0.h.a.b.g.h;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class o0 implements v0 {
    public v0[] a;

    public o0(v0... v0VarArr) {
        this.a = v0VarArr;
    }

    public final boolean a(Class<?> cls) {
        for (v0 a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final w0 b(Class<?> cls) {
        for (v0 v0Var : this.a) {
            if (v0Var.a(cls)) {
                return v0Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
