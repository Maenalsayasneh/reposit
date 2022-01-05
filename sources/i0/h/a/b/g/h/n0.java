package i0.h.a.b.g.h;

import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class n0 implements l1 {
    public static final v0 a = new p0();
    public final v0 b;

    public n0() {
        v0 v0Var;
        v0[] v0VarArr = new v0[2];
        v0VarArr[0] = a0.a;
        try {
            v0Var = (v0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            v0Var = a;
        }
        v0VarArr[1] = v0Var;
        o0 o0Var = new o0(v0VarArr);
        Charset charset = b0.a;
        this.b = o0Var;
    }
}
