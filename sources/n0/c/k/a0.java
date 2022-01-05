package n0.c.k;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.i;

/* compiled from: InlineClassDescriptor.kt */
public final class a0 extends PluginGeneratedSerialDescriptor {
    public final boolean l = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(String str, v<?> vVar) {
        super(str, vVar, 1);
        i.e(str, "name");
        i.e(vVar, "generatedSerializer");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (!(!i.a(this.i, serialDescriptor.a()))) {
                a0 a0Var = (a0) obj;
                if ((a0Var.l && Arrays.equals(k(), a0Var.k())) && this.k == serialDescriptor.e()) {
                    int i = this.k;
                    int i2 = 0;
                    while (i2 < i) {
                        if (!(!i.a(h(i2).a(), serialDescriptor.h(i2).a())) && !(!i.a(h(i2).f(), serialDescriptor.h(i2).f()))) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }

    public boolean isInline() {
        return this.l;
    }
}
