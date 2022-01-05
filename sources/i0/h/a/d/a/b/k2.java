package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.f;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public final class k2 {
    public static final f a = new f("VerifySliceTaskHandler");
    public final y b;

    public k2(y yVar) {
        this.b = yVar;
    }

    public final void a(j2 j2Var) {
        File j = this.b.j(j2Var.b, j2Var.c, j2Var.d, j2Var.e);
        if (j.exists()) {
            try {
                File p = this.b.p(j2Var.b, j2Var.c, j2Var.d, j2Var.e);
                if (p.exists()) {
                    try {
                        if (p1.a(i2.a(j, p)).equals(j2Var.f)) {
                            a.b(4, "Verification of slice %s of pack %s successful.", new Object[]{j2Var.e, j2Var.b});
                            File k = this.b.k(j2Var.b, j2Var.c, j2Var.d, j2Var.e);
                            if (!k.exists()) {
                                k.mkdirs();
                            }
                            if (!j.renameTo(k)) {
                                throw new bv(String.format("Failed to move slice %s after verification.", new Object[]{j2Var.e}), j2Var.a);
                            }
                            return;
                        }
                        throw new bv(String.format("Verification failed for slice %s.", new Object[]{j2Var.e}), j2Var.a);
                    } catch (NoSuchAlgorithmException e) {
                        throw new bv("SHA256 algorithm not supported.", e, j2Var.a);
                    } catch (IOException e2) {
                        throw new bv(String.format("Could not digest file during verification for slice %s.", new Object[]{j2Var.e}), e2, j2Var.a);
                    }
                } else {
                    throw new bv(String.format("Cannot find metadata files for slice %s.", new Object[]{j2Var.e}), j2Var.a);
                }
            } catch (IOException e3) {
                throw new bv(String.format("Could not reconstruct slice archive during verification for slice %s.", new Object[]{j2Var.e}), e3, j2Var.a);
            }
        } else {
            throw new bv(String.format("Cannot find unverified files for slice %s.", new Object[]{j2Var.e}), j2Var.a);
        }
    }
}
