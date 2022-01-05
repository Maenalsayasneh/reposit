package kotlinx.serialization.internal;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.g;

/* compiled from: Enums.kt */
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {
    public final SerialDescriptor a;
    public final T[] b;

    public EnumSerializer(String str, T[] tArr) {
        i.e(str, "serialName");
        i.e(tArr, "values");
        this.b = tArr;
        this.a = a.f0(str, g.b.a, new SerialDescriptor[0], new EnumSerializer$descriptor$1(this, str));
    }

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        int g = decoder.g(this.a);
        T[] tArr = this.b;
        int length = tArr.length;
        if (g >= 0 && length > g) {
            return tArr[g];
        }
        throw new SerializationException(g + " is not among valid " + this.a.a() + " enum values, " + "values size is " + this.b.length);
    }

    public SerialDescriptor getDescriptor() {
        return this.a;
    }

    public void serialize(Encoder encoder, Object obj) {
        Enum enumR = (Enum) obj;
        i.e(encoder, "encoder");
        i.e(enumR, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        int Y1 = h.Y1(this.b, enumR);
        if (Y1 != -1) {
            encoder.u(this.a, Y1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(enumR);
        sb.append(" is not a valid enum ");
        sb.append(this.a.a());
        sb.append(", ");
        sb.append("must be one of ");
        String arrays = Arrays.toString(this.b);
        i.d(arrays, "java.util.Arrays.toString(this)");
        sb.append(arrays);
        throw new SerializationException(sb.toString());
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("kotlinx.serialization.internal.EnumSerializer<");
        P0.append(this.a.a());
        P0.append('>');
        return P0.toString();
    }
}
