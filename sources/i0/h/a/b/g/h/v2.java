package i0.h.a.b.g.h;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.recaptcha.RecaptchaAction;
import com.google.android.gms.recaptcha.RecaptchaHandle;
import i0.h.a.b.c.g.j.l;
import i0.h.a.b.m.h;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final /* synthetic */ class v2 implements l {
    public final u2 a;
    public final RecaptchaHandle b;
    public final RecaptchaAction c;

    public v2(u2 u2Var, RecaptchaHandle recaptchaHandle, RecaptchaAction recaptchaAction) {
        this.a = u2Var;
        this.b = recaptchaHandle;
        this.c = recaptchaAction;
    }

    public final void a(Object obj, Object obj2) {
        u2 u2Var = this.a;
        RecaptchaHandle recaptchaHandle = this.b;
        RecaptchaAction recaptchaAction = this.c;
        c cVar = (c) obj;
        Objects.requireNonNull(u2Var);
        b bVar = new b((h) obj2);
        Context context = u2Var.o;
        String str = recaptchaHandle.c;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.recaptcha.internal.VERIFICATION_HISTORY_FILE_KEY", 0);
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "verification_history_token_key:".concat(valueOf) : new String("verification_history_token_key:");
        String str2 = "";
        if (sharedPreferences.contains(concat)) {
            str2 = sharedPreferences.getString(concat, str2);
        }
        ((s2) cVar.u()).F(bVar, recaptchaHandle, new RecaptchaAction(recaptchaAction.c, recaptchaAction.d, recaptchaAction.q, str2));
    }
}
