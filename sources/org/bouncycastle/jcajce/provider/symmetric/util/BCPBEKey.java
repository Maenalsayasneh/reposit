package org.bouncycastle.jcajce.provider.symmetric.util;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;
import javax.security.auth.Destroyable;
import s0.a.a.n;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.y0;
import s0.a.b.t;
import s0.a.e.b.b0.c.h3;

public class BCPBEKey implements PBEKey, Destroyable {
    public String algorithm;
    public int digest;
    private final AtomicBoolean hasBeenDestroyed = new AtomicBoolean(false);
    private final int iterationCount;
    public int ivSize;
    public int keySize;
    public n oid;
    private final i param;
    private final char[] password;
    private final byte[] salt;
    public boolean tryWrong = false;
    public int type;

    public BCPBEKey(String str, n nVar, int i, int i2, int i3, int i4, PBEKeySpec pBEKeySpec, i iVar) {
        this.algorithm = str;
        this.oid = nVar;
        this.type = i;
        this.digest = i2;
        this.keySize = i3;
        this.ivSize = i4;
        this.password = pBEKeySpec.getPassword();
        this.iterationCount = pBEKeySpec.getIterationCount();
        this.salt = pBEKeySpec.getSalt();
        this.param = iVar;
    }

    public BCPBEKey(String str, i iVar) {
        this.algorithm = str;
        this.param = iVar;
        this.password = null;
        this.iterationCount = -1;
        this.salt = null;
    }

    public static void checkDestroyed(Destroyable destroyable) {
        if (destroyable.isDestroyed()) {
            throw new IllegalStateException("key has been destroyed");
        }
    }

    public void destroy() {
        if (!this.hasBeenDestroyed.getAndSet(true)) {
            char[] cArr = this.password;
            if (cArr != null) {
                Arrays.fill(cArr, 0);
            }
            byte[] bArr = this.salt;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
            }
        }
    }

    public String getAlgorithm() {
        checkDestroyed(this);
        return this.algorithm;
    }

    public int getDigest() {
        checkDestroyed(this);
        return this.digest;
    }

    public byte[] getEncoded() {
        checkDestroyed(this);
        i iVar = this.param;
        if (iVar != null) {
            if (iVar instanceof c1) {
                iVar = ((c1) iVar).d;
            }
            return ((y0) iVar).c;
        }
        int i = this.type;
        if (i == 2) {
            return t.PKCS12PasswordToBytes(this.password);
        }
        return i == 5 ? t.PKCS5PasswordToUTF8Bytes(this.password) : t.PKCS5PasswordToBytes(this.password);
    }

    public String getFormat() {
        return "RAW";
    }

    public int getIterationCount() {
        checkDestroyed(this);
        return this.iterationCount;
    }

    public int getIvSize() {
        checkDestroyed(this);
        return this.ivSize;
    }

    public int getKeySize() {
        checkDestroyed(this);
        return this.keySize;
    }

    public n getOID() {
        checkDestroyed(this);
        return this.oid;
    }

    public i getParam() {
        checkDestroyed(this);
        return this.param;
    }

    public char[] getPassword() {
        checkDestroyed(this);
        char[] cArr = this.password;
        if (cArr != null) {
            return (char[]) cArr.clone();
        }
        throw new IllegalStateException("no password available");
    }

    public byte[] getSalt() {
        checkDestroyed(this);
        return h3.I(this.salt);
    }

    public int getType() {
        checkDestroyed(this);
        return this.type;
    }

    public boolean isDestroyed() {
        return this.hasBeenDestroyed.get();
    }

    public void setTryWrongPKCS12Zero(boolean z) {
        this.tryWrong = z;
    }

    public boolean shouldTryWrongPKCS12() {
        return this.tryWrong;
    }
}
