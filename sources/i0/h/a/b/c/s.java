package i0.h.a.b.c;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public abstract class s extends r {
    public static final WeakReference<byte[]> b = new WeakReference<>((Object) null);
    public WeakReference<byte[]> c = b;

    public s(byte[] bArr) {
        super(bArr);
    }

    public final byte[] d0() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.c.get();
            if (bArr == null) {
                bArr = k0();
                this.c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] k0();
}
