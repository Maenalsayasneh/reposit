package h0.a.f.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* compiled from: ActivityResultContract */
public abstract class a<I, O> {

    /* renamed from: h0.a.f.d.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityResultContract */
    public static final class C0014a<T> {
        @SuppressLint({"UnknownNullness"})
        public final T a;

        public C0014a(@SuppressLint({"UnknownNullness"}) T t) {
            this.a = t;
        }
    }

    public abstract Intent createIntent(Context context, @SuppressLint({"UnknownNullness"}) I i);

    public C0014a<O> getSynchronousResult(Context context, @SuppressLint({"UnknownNullness"}) I i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O parseResult(int i, Intent intent);
}
