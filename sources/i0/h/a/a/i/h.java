package i0.h.a.a.i;

import android.util.Base64;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import i0.h.a.a.i.b;

@AutoValue
/* compiled from: TransportContext */
public abstract class h {

    @AutoValue.Builder
    /* compiled from: TransportContext */
    public static abstract class a {
        public abstract h a();

        public abstract a b(String str);

        public abstract a c(Priority priority);
    }

    public static a a() {
        b.C0125b bVar = new b.C0125b();
        bVar.c(Priority.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Priority d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
