package i0.f.a.b.m;

import com.fasterxml.jackson.core.StreamWriteCapability;
import i0.f.a.b.m.e;

/* compiled from: JacksonFeatureSet */
public final class f<F extends e> {
    public int a;

    public f(int i) {
        this.a = i;
    }

    public static <F extends e> f<F> a(F[] fArr) {
        if (fArr.length <= 31) {
            int i = 0;
            for (F f : fArr) {
                if (f.enabledByDefault()) {
                    i |= f.getMask();
                }
            }
            return new f<>(i);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{fArr[0].getClass().getName(), Integer.valueOf(fArr.length)}));
    }

    public f<F> b(F f) {
        int mask = ((StreamWriteCapability) f).getMask() | this.a;
        return mask == this.a ? this : new f<>(mask);
    }
}
