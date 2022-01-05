package r0;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.OutputStream;
import m0.n.b.i;

/* compiled from: Buffer.kt */
public final class g extends OutputStream {
    public final /* synthetic */ f c;

    public g(f fVar) {
        this.c = fVar;
    }

    public void close() {
    }

    public void flush() {
    }

    public String toString() {
        return this.c + ".outputStream()";
    }

    public void write(int i) {
        this.c.I(i);
    }

    public void write(byte[] bArr, int i, int i2) {
        i.e(bArr, MessageExtension.FIELD_DATA);
        this.c.H(bArr, i, i2);
    }
}
