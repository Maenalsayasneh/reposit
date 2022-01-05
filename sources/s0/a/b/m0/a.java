package s0.a.b.m0;

import java.security.SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandom;

public class a implements d {
    public final SecureRandom a;

    /* renamed from: s0.a.b.m0.a$a  reason: collision with other inner class name */
    public class C0301a implements c {
        public final /* synthetic */ int a;

        public C0301a(int i) {
            this.a = i;
        }

        public int entropySize() {
            return this.a;
        }

        public byte[] getEntropy() {
            SecureRandom secureRandom = a.this.a;
            if (!(secureRandom instanceof SP800SecureRandom)) {
                return secureRandom.generateSeed((this.a + 7) / 8);
            }
            byte[] bArr = new byte[((this.a + 7) / 8)];
            secureRandom.nextBytes(bArr);
            return bArr;
        }
    }

    public a(SecureRandom secureRandom, boolean z) {
        this.a = secureRandom;
    }

    public c get(int i) {
        return new C0301a(i);
    }
}
