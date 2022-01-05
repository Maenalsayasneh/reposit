package org.bouncycastle.crypto.prng;

import java.security.SecureRandom;
import s0.a.b.m0.b;
import s0.a.b.m0.c;

public class SP800SecureRandom extends SecureRandom {
    public final b c;
    public final boolean d;
    public final SecureRandom q;
    public final c x;
    public s0.a.b.m0.f.c y;

    public SP800SecureRandom(SecureRandom secureRandom, c cVar, b bVar, boolean z) {
        this.q = secureRandom;
        this.x = cVar;
        this.c = bVar;
        this.d = z;
    }

    public byte[] generateSeed(int i) {
        c cVar = this.x;
        byte[] bArr = new byte[i];
        if (i * 8 <= cVar.entropySize()) {
            System.arraycopy(cVar.getEntropy(), 0, bArr, 0, i);
        } else {
            int entropySize = cVar.entropySize() / 8;
            for (int i2 = 0; i2 < i; i2 += entropySize) {
                byte[] entropy = cVar.getEntropy();
                int i3 = i - i2;
                if (entropy.length <= i3) {
                    System.arraycopy(entropy, 0, bArr, i2, entropy.length);
                } else {
                    System.arraycopy(entropy, 0, bArr, i2, i3);
                }
            }
        }
        return bArr;
    }

    public String getAlgorithm() {
        return this.c.getAlgorithm();
    }

    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.y == null) {
                this.y = this.c.a(this.x);
            }
            if (this.y.b(bArr, (byte[]) null, this.d) < 0) {
                this.y.a((byte[]) null);
                this.y.b(bArr, (byte[]) null, this.d);
            }
        }
    }

    public void setSeed(long j) {
        synchronized (this) {
            SecureRandom secureRandom = this.q;
            if (secureRandom != null) {
                secureRandom.setSeed(j);
            }
        }
    }

    public void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.q;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }
}
