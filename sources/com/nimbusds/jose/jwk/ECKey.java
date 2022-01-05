package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import i0.j.f.p.h;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class ECKey extends JWK {
    public static final Set<Curve> e2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Curve[]{Curve.c, Curve.d, Curve.x, Curve.y})));
    public final Curve f2;
    public final Base64URL g2;
    public final Base64URL h2;
    public final Base64URL i2;
    public final PrivateKey j2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.c, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        Curve curve2 = curve;
        Base64URL base64URL5 = base64URL;
        Base64URL base64URL6 = base64URL2;
        if (curve2 != null) {
            this.f2 = curve2;
            if (base64URL5 != null) {
                this.g2 = base64URL5;
                if (base64URL6 != null) {
                    this.h2 = base64URL6;
                    g(curve, base64URL, base64URL2);
                    f(a());
                    this.i2 = null;
                    this.j2 = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static Base64URL e(int i, BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i3 = 1;
        if (bigInteger.bitLength() % 8 == 0 || (bigInteger.bitLength() / 8) + 1 != bitLength / 8) {
            int length = byteArray.length;
            if (bigInteger.bitLength() % 8 == 0) {
                length--;
            } else {
                i3 = 0;
            }
            int i4 = bitLength / 8;
            int i5 = i4 - length;
            byte[] bArr = new byte[i4];
            System.arraycopy(byteArray, i3, bArr, i5, length);
            byteArray = bArr;
        }
        int i6 = (i + 7) / 8;
        if (byteArray.length >= i6) {
            return Base64URL.d(byteArray);
        }
        byte[] bArr2 = new byte[i6];
        System.arraycopy(byteArray, 0, bArr2, i6 - byteArray.length, byteArray.length);
        return Base64URL.d(bArr2);
    }

    public static void g(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!e2.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        } else if (!h.u2(base64URL.b(), base64URL2.b(), curve.b())) {
            throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + curve + " curve");
        }
    }

    public static ECKey h(Map<String, Object> map) throws ParseException {
        Map<String, Object> map2 = map;
        Class cls = String.class;
        if (KeyType.c.equals(h.e3(map))) {
            try {
                Curve a = Curve.a((String) h.h1(map2, "crv", cls));
                Base64URL T0 = h.T0(map2, "x");
                Base64URL T02 = h.T0(map2, "y");
                Base64URL T03 = h.T0(map2, "d");
                if (T03 == null) {
                    try {
                        KeyUse f3 = h.f3(map);
                        Set<KeyOperation> d3 = h.d3(map);
                        Algorithm c3 = h.c3(map);
                        URI I1 = h.I1(map2, "x5u");
                        Base64URL T04 = h.T0(map2, "x5t");
                        Base64URL T05 = h.T0(map2, "x5t#S256");
                        return new ECKey(a, T0, T02, f3, d3, c3, (String) h.h1(map2, "kid", cls), I1, T04, T05, h.h3(map), (KeyStore) null);
                    } catch (IllegalArgumentException e) {
                        throw new ParseException(e.getMessage(), 0);
                    }
                } else {
                    KeyUse f32 = h.f3(map);
                    Set<KeyOperation> d32 = h.d3(map);
                    Algorithm c32 = h.c3(map);
                    URI I12 = h.I1(map2, "x5u");
                    Base64URL T06 = h.T0(map2, "x5t");
                    Base64URL T07 = h.T0(map2, "x5t#S256");
                    return new ECKey(a, T0, T02, T03, f32, d32, c32, (String) h.h1(map2, "kid", cls), I12, T06, T07, h.h3(map), (KeyStore) null);
                }
            } catch (IllegalArgumentException e3) {
                throw new ParseException(e3.getMessage(), 0);
            }
        } else {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
    }

    public boolean b() {
        return (this.i2 == null && this.j2 == null) ? false : true;
    }

    public Map<String, Object> d() {
        Map<String, Object> d = super.d();
        HashMap hashMap = (HashMap) d;
        hashMap.put("crv", this.f2.c2);
        hashMap.put("x", this.g2.c);
        hashMap.put("y", this.h2.c);
        Base64URL base64URL = this.i2;
        if (base64URL != null) {
            hashMap.put("d", base64URL.c);
        }
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECKey) || !super.equals(obj)) {
            return false;
        }
        ECKey eCKey = (ECKey) obj;
        if (!Objects.equals(this.f2, eCKey.f2) || !Objects.equals(this.g2, eCKey.g2) || !Objects.equals(this.h2, eCKey.h2) || !Objects.equals(this.i2, eCKey.i2) || !Objects.equals(this.j2, eCKey.j2)) {
            return false;
        }
        return true;
    }

    public final void f(List<X509Certificate> list) {
        if (list != null) {
            boolean z = false;
            X509Certificate x509Certificate = list.get(0);
            try {
                ECPublicKey eCPublicKey = (ECPublicKey) a().get(0).getPublicKey();
                if (this.g2.b().equals(eCPublicKey.getW().getAffineX())) {
                    z = this.h2.b().equals(eCPublicKey.getW().getAffineY());
                }
            } catch (ClassCastException unused) {
            }
            if (!z) {
                throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
            }
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f2, this.g2, this.h2, this.i2, this.j2});
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        super(KeyType.c, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, (KeyStore) null);
        Curve curve2 = curve;
        Base64URL base64URL6 = base64URL;
        Base64URL base64URL7 = base64URL2;
        if (curve2 != null) {
            this.f2 = curve2;
            if (base64URL6 != null) {
                this.g2 = base64URL6;
                if (base64URL7 != null) {
                    this.h2 = base64URL7;
                    g(curve, base64URL, base64URL2);
                    f(a());
                    this.i2 = base64URL3;
                    this.j2 = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
