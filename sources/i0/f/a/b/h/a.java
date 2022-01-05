package i0.f.a.b.h;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.b.c;
import i0.f.a.b.d;
import i0.f.a.b.f;
import i0.f.a.b.j.b;
import i0.f.a.b.j.e;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: GeneratorBase */
public abstract class a extends JsonGenerator {
    public static final int x = ((JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask());
    public int Y1;
    public boolean Z1;
    public e a2;
    public d y;

    public a(int i, d dVar) {
        this.Y1 = i;
        this.y = dVar;
        this.a2 = e.m(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? new b(this) : null);
        this.Z1 = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    public void D0(f fVar) throws IOException {
        V0("write raw value");
        y0(fVar);
    }

    public void F0(String str) throws IOException {
        V0("write raw value");
        A0(str);
    }

    public String T0(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.Y1)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale >= -9999 && scale <= 9999) {
            return bigDecimal.toPlainString();
        }
        throw new JsonGenerationException(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[]{Integer.valueOf(scale), 9999, 9999}), this);
    }

    public void U0(int i, int i2) {
        if ((x & i2) != 0) {
            this.Z1 = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
            JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
            if (feature.enabledIn(i2)) {
                if (feature.enabledIn(i)) {
                    z(127);
                } else {
                    z(0);
                }
            }
            JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
            if (!feature2.enabledIn(i2)) {
                return;
            }
            if (feature2.enabledIn(i)) {
                e eVar = this.a2;
                if (eVar.d == null) {
                    eVar.d = new b(this);
                    this.a2 = eVar;
                    return;
                }
                return;
            }
            e eVar2 = this.a2;
            eVar2.d = null;
            this.a2 = eVar2;
        }
    }

    public abstract void V0(String str) throws IOException;

    public JsonGenerator i(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this.Y1 &= ~mask;
        if ((mask & x) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.Z1 = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                z(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                e eVar = this.a2;
                eVar.d = null;
                this.a2 = eVar;
            }
        }
        return this;
    }

    public int k() {
        return this.Y1;
    }

    public c l() {
        return this.a2;
    }

    public final boolean n(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.Y1) != 0;
    }

    public void u0(Object obj) throws IOException {
        if (obj == null) {
            c0();
            return;
        }
        d dVar = this.y;
        if (dVar != null) {
            dVar.a(this, obj);
        } else if (obj instanceof String) {
            Q0((String) obj);
        } else {
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number instanceof Integer) {
                    g0(number.intValue());
                    return;
                } else if (number instanceof Long) {
                    i0(number.longValue());
                    return;
                } else if (number instanceof Double) {
                    d0(number.doubleValue());
                    return;
                } else if (number instanceof Float) {
                    f0(number.floatValue());
                    return;
                } else if (number instanceof Short) {
                    r0(number.shortValue());
                    return;
                } else if (number instanceof Byte) {
                    r0((short) number.byteValue());
                    return;
                } else if (number instanceof BigInteger) {
                    p0((BigInteger) number);
                    return;
                } else if (number instanceof BigDecimal) {
                    n0((BigDecimal) number);
                    return;
                } else if (number instanceof AtomicInteger) {
                    g0(((AtomicInteger) number).get());
                    return;
                } else if (number instanceof AtomicLong) {
                    i0(((AtomicLong) number).get());
                    return;
                }
            } else if (obj instanceof byte[]) {
                N((byte[]) obj);
                return;
            } else if (obj instanceof Boolean) {
                O(((Boolean) obj).booleanValue());
                return;
            } else if (obj instanceof AtomicBoolean) {
                O(((AtomicBoolean) obj).get());
                return;
            }
            throw new IllegalStateException(i0.d.a.a.a.d0(obj, i0.d.a.a.a.P0("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed "), ")"));
        }
    }

    public JsonGenerator v(int i, int i2) {
        int i3 = this.Y1;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.Y1 = i4;
            U0(i4, i5);
        }
        return this;
    }

    public void w(Object obj) {
        e eVar = this.a2;
        if (eVar != null) {
            eVar.g = obj;
        }
    }

    @Deprecated
    public JsonGenerator y(int i) {
        int i2 = this.Y1 ^ i;
        this.Y1 = i;
        if (i2 != 0) {
            U0(i, i2);
        }
        return this;
    }
}
