package s0.a.f.c.a.e;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.rainbow.BCRainbowPublicKey;
import s0.a.a.c3.m0;
import s0.a.a.e;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.w2.p;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.f;
import s0.a.f.a.g;
import s0.a.f.c.b.b;

public class a extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof s0.a.f.c.b.a) {
            return new BCRainbowPrivateKey((s0.a.f.c.b.a) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(p.s(r.x(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Unsupported key specification: ");
            P0.append(keySpec.getClass());
            P0.append(".");
            throw new InvalidKeySpecException(P0.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof b) {
            return new BCRainbowPublicKey((b) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return generatePublic(m0.s(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        } else {
            throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
        }
    }

    public final KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        if (key instanceof BCRainbowPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (s0.a.f.c.b.a.class.isAssignableFrom(cls)) {
                BCRainbowPrivateKey bCRainbowPrivateKey = (BCRainbowPrivateKey) key;
                return new s0.a.f.c.b.a(bCRainbowPrivateKey.c, bCRainbowPrivateKey.d, bCRainbowPrivateKey.q, bCRainbowPrivateKey.x, bCRainbowPrivateKey.Y1, bCRainbowPrivateKey.y);
            }
        } else if (!(key instanceof BCRainbowPublicKey)) {
            StringBuilder P0 = i0.d.a.a.a.P0("Unsupported key type: ");
            P0.append(key.getClass());
            P0.append(".");
            throw new InvalidKeySpecException(P0.toString());
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (b.class.isAssignableFrom(cls)) {
                BCRainbowPublicKey bCRainbowPublicKey = (BCRainbowPublicKey) key;
                return new b(bCRainbowPublicKey.x, bCRainbowPublicKey.c, bCRainbowPublicKey.a(), h3.N(bCRainbowPublicKey.q));
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    public final Key engineTranslateKey(Key key) throws InvalidKeyException {
        if ((key instanceof BCRainbowPrivateKey) || (key instanceof BCRainbowPublicKey)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        e u = pVar.u();
        f fVar = u instanceof f ? (f) u : u != null ? new f(s.B(u)) : null;
        short[][] Y = h3.Y(fVar.q);
        short[] W = h3.W(fVar.x);
        short[][] Y2 = h3.Y(fVar.y);
        short[] W2 = h3.W(fVar.Y1);
        byte[] bArr = fVar.Z1;
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return new BCRainbowPrivateKey(Y, W, Y2, W2, iArr, fVar.a2);
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        r t = m0Var.t();
        g gVar = t instanceof g ? (g) t : t != null ? new g(s.B(t)) : null;
        return new BCRainbowPublicKey(gVar.q.I(), h3.Y(gVar.x), h3.Y(gVar.y), h3.W(gVar.Y1));
    }
}
