package i0.h.a.d.a.b;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import i0.h.a.b.c.m.b;
import i0.h.a.d.a.e.d0;
import java.util.Objects;

public final class y2 implements d0<?> {
    public final d0<q2> a;
    public final d0<Context> b;

    public y2(d0<q2> d0Var, d0<Context> d0Var2) {
        this.a = d0Var;
        this.b = d0Var2;
    }

    public final Object a() {
        q2 a2 = this.a.a();
        Context b2 = ((a3) this.b).a();
        q2 q2Var = a2;
        b.J(b2.getPackageManager(), new ComponentName(b2.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        int i = PlayCoreDialogWrapperActivity.c;
        b.J(b2.getPackageManager(), new ComponentName(b2.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
        Objects.requireNonNull(q2Var, "Cannot return null from a non-@Nullable @Provides method");
        return q2Var;
    }
}
