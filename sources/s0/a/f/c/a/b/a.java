package s0.a.f.c.a.b;

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
import java.util.Objects;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.mceliece.BCMcElieceCCA2PublicKey;
import s0.a.a.c3.m0;
import s0.a.a.r;
import s0.a.a.w2.p;
import s0.a.e.b.b0.c.h3;
import s0.a.f.a.e;
import s0.a.f.b.b.b;
import s0.a.f.b.b.c;
import s0.a.f.d.a.d;

public class a extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                p s = p.s(r.x(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (e.d.w(s.d.c)) {
                        s0.a.f.a.a t = s0.a.f.a.a.t(s.u());
                        return new BCMcElieceCCA2PrivateKey(new b(t.c, t.d, t.s(), new s0.a.f.d.a.e(t.s(), t.x), new d(t.y), h3.b1(t.Y1).getAlgorithmName()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                } catch (IOException unused) {
                    throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
                }
            } catch (IOException e) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e);
            }
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Unsupported key specification: ");
            P0.append(keySpec.getClass());
            P0.append(".");
            throw new InvalidKeySpecException(P0.toString());
        }
    }

    public PublicKey engineGeneratePublic(KeySpec keySpec) throws InvalidKeySpecException {
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                m0 s = m0.s(r.x(((X509EncodedKeySpec) keySpec).getEncoded()));
                try {
                    if (e.d.w(s.c.c)) {
                        s0.a.f.a.b s2 = s0.a.f.a.b.s(s.t());
                        return new BCMcElieceCCA2PublicKey(new c(s2.c, s2.d, s2.q, h3.b1(s2.x).getAlgorithmName()));
                    }
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                } catch (IOException e) {
                    throw new InvalidKeySpecException(i0.d.a.a.a.V(e, i0.d.a.a.a.P0("Unable to decode X509EncodedKeySpec: ")));
                }
            } catch (IOException e2) {
                throw new InvalidKeySpecException(e2.toString());
            }
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Unsupported key specification: ");
            P0.append(keySpec.getClass());
            P0.append(".");
            throw new InvalidKeySpecException(P0.toString());
        }
    }

    public KeySpec engineGetKeySpec(Key key, Class cls) throws InvalidKeySpecException {
        return null;
    }

    public Key engineTranslateKey(Key key) throws InvalidKeyException {
        return null;
    }

    public PrivateKey generatePrivate(p pVar) throws IOException {
        r rVar = (r) pVar.u();
        Objects.requireNonNull(rVar);
        s0.a.f.a.a t = s0.a.f.a.a.t(rVar);
        return new BCMcElieceCCA2PrivateKey(new b(t.c, t.d, t.s(), new s0.a.f.d.a.e(t.s(), t.x), new d(t.y), (String) null));
    }

    public PublicKey generatePublic(m0 m0Var) throws IOException {
        s0.a.f.a.b s = s0.a.f.a.b.s(m0Var.t());
        return new BCMcElieceCCA2PublicKey(new c(s.c, s.d, s.q, h3.b1(s.x).getAlgorithmName()));
    }
}
