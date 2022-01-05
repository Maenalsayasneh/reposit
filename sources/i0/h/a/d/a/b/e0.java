package i0.h.a.d.a.b;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.assetpacks.bv;
import i0.h.a.b.c.m.b;
import i0.h.a.d.a.e.a0;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public final class e0 {
    public final a0<e3> a;

    public e0(a0<e3> a0Var) {
        this.a = a0Var;
    }

    public final InputStream a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) b.l(this.a.a().m(i, str, str2, i2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new bv(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new bv(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new bv("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
