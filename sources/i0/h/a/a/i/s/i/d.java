package i0.h.a.a.i.s.i;

import com.google.auto.value.AutoValue;
import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import i0.d.a.a.a;
import i0.h.a.a.i.s.i.a;

@AutoValue
/* compiled from: EventStoreConfig */
public abstract class d {
    public static final d a;

    static {
        Long l = 10485760L;
        Integer num = 200;
        Integer valueOf = Integer.valueOf(InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT);
        Long l2 = 604800000L;
        Integer num2 = 81920;
        String str = l == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = a.n0(str, " loadBatchSize");
        }
        if (valueOf == null) {
            str = a.n0(str, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            str = a.n0(str, " eventCleanUpAge");
        }
        if (num2 == null) {
            str = a.n0(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            a = new a(l.longValue(), num.intValue(), valueOf.intValue(), l2.longValue(), num2.intValue(), (a.C0127a) null);
            return;
        }
        throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str));
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
