package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import i0.d.a.a.a;
import i0.h.a.b.h.f.n;
import i0.j.f.p.h;
import i0.l.a.h.b;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public abstract class JWK implements Serializable {
    public final URI Y1;
    @Deprecated
    public final Base64URL Z1;
    public final Base64URL a2;
    public final List<Base64> b2;
    public final KeyType c;
    public final List<X509Certificate> c2;
    public final KeyUse d;
    public final KeyStore d2;
    public final Set<KeyOperation> q;
    public final Algorithm x;
    public final String y;

    public JWK(KeyType keyType, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, KeyStore keyStore) {
        if (keyType != null) {
            this.c = keyType;
            Map<KeyUse, Set<KeyOperation>> map = b.a;
            if ((keyUse == null || set == null) ? true : b.a.get(keyUse).containsAll(set)) {
                this.d = keyUse;
                this.q = set;
                this.x = algorithm;
                this.y = str;
                this.Y1 = uri;
                this.Z1 = base64URL;
                this.a2 = base64URL2;
                if (list == null || !list.isEmpty()) {
                    this.b2 = list;
                    try {
                        this.c2 = h.a3(list);
                        this.d2 = keyStore;
                    } catch (ParseException e) {
                        StringBuilder P0 = a.P0("Invalid X.509 certificate chain \"x5c\": ");
                        P0.append(e.getMessage());
                        throw new IllegalArgumentException(P0.toString(), e);
                    }
                } else {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
            } else {
                throw new IllegalArgumentException("The key use \"use\" and key options \"key_opts\" parameters are not consistent, see RFC 7517, section 4.3");
            }
        } else {
            throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
        }
    }

    public static JWK c(Map<String, Object> map) throws ParseException {
        List<Object> j1;
        Map<String, Object> map2 = map;
        Class cls = String.class;
        String str = (String) h.h1(map2, "kty", cls);
        if (str != null) {
            KeyType a = KeyType.a(str);
            if (a == KeyType.c) {
                return ECKey.h(map);
            }
            KeyType keyType = KeyType.d;
            if (a != keyType) {
                KeyType keyType2 = KeyType.q;
                if (a != keyType2) {
                    KeyType keyType3 = KeyType.x;
                    if (a == keyType3) {
                        Set<Curve> set = OctetKeyPair.e2;
                        if (keyType3.equals(h.e3(map))) {
                            try {
                                Curve a3 = Curve.a((String) h.h1(map2, "crv", cls));
                                Base64URL T0 = h.T0(map2, "x");
                                Base64URL T02 = h.T0(map2, "d");
                                if (T02 != null) {
                                    return new OctetKeyPair(a3, T0, T02, h.f3(map), h.d3(map), h.c3(map), (String) h.h1(map2, "kid", cls), h.I1(map2, "x5u"), h.T0(map2, "x5t"), h.T0(map2, "x5t#S256"), h.h3(map), (KeyStore) null);
                                }
                                try {
                                    return new OctetKeyPair(a3, T0, h.f3(map), h.d3(map), h.c3(map), (String) h.h1(map2, "kid", cls), h.I1(map2, "x5u"), h.T0(map2, "x5t"), h.T0(map2, "x5t#S256"), h.h3(map), (KeyStore) null);
                                } catch (IllegalArgumentException e) {
                                    throw new ParseException(e.getMessage(), 0);
                                }
                            } catch (IllegalArgumentException e2) {
                                throw new ParseException(e2.getMessage(), 0);
                            }
                        } else {
                            throw new ParseException("The key type \"kty\" must be OKP", 0);
                        }
                    } else {
                        throw new ParseException("Unsupported key type \"kty\" parameter: " + a, 0);
                    }
                } else if (keyType2.equals(h.e3(map))) {
                    try {
                        return new OctetSequenceKey(h.T0(map2, "k"), h.f3(map), h.d3(map), h.c3(map), (String) h.h1(map2, "kid", cls), h.I1(map2, "x5u"), h.T0(map2, "x5t"), h.T0(map2, "x5t#S256"), h.h3(map), (KeyStore) null);
                    } catch (IllegalArgumentException e3) {
                        throw new ParseException(e3.getMessage(), 0);
                    }
                } else {
                    throw new ParseException("The key type \"kty\" must be oct", 0);
                }
            } else if (keyType.equals(h.e3(map))) {
                Base64URL T03 = h.T0(map2, n.a);
                Base64URL T04 = h.T0(map2, "e");
                Base64URL T05 = h.T0(map2, "d");
                Base64URL T06 = h.T0(map2, "p");
                Base64URL T07 = h.T0(map2, "q");
                Base64URL T08 = h.T0(map2, "dp");
                String str2 = "dq";
                Base64URL T09 = h.T0(map2, str2);
                Base64URL T010 = h.T0(map2, "qi");
                ArrayList arrayList = null;
                if (map2.containsKey("oth") && (j1 = h.j1(map2, "oth")) != null) {
                    arrayList = new ArrayList(j1.size());
                    Iterator<Object> it = j1.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof Map) {
                            Map map3 = (Map) next;
                            Iterator<Object> it2 = it;
                            String str3 = str2;
                            try {
                                arrayList.add(new RSAKey.OtherPrimesInfo(h.T0(map3, "r"), h.T0(map3, str2), h.T0(map3, "t")));
                                it = it2;
                                str2 = str3;
                            } catch (IllegalArgumentException e4) {
                                throw new ParseException(e4.getMessage(), 0);
                            }
                        }
                    }
                }
                try {
                    return new RSAKey(T03, T04, T05, T06, T07, T08, T09, T010, arrayList, (PrivateKey) null, h.f3(map), h.d3(map), h.c3(map), (String) h.h1(map2, "kid", cls), h.I1(map2, "x5u"), h.T0(map2, "x5t"), h.T0(map2, "x5t#S256"), h.h3(map), (KeyStore) null);
                } catch (IllegalArgumentException e5) {
                    throw new ParseException(e5.getMessage(), 0);
                }
            } else {
                throw new ParseException("The key type \"kty\" must be RSA", 0);
            }
        } else {
            throw new ParseException("Missing key type \"kty\" parameter", 0);
        }
    }

    public List<X509Certificate> a() {
        List<X509Certificate> list = this.c2;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public abstract boolean b();

    public Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("kty", this.c.y);
        KeyUse keyUse = this.d;
        if (keyUse != null) {
            hashMap.put("use", keyUse.q);
        }
        if (this.q != null) {
            ArrayList arrayList = new ArrayList();
            for (KeyOperation identifier : this.q) {
                arrayList.add(identifier.identifier());
            }
            hashMap.put("key_ops", arrayList);
        }
        Algorithm algorithm = this.x;
        if (algorithm != null) {
            hashMap.put("alg", algorithm.d);
        }
        String str = this.y;
        if (str != null) {
            hashMap.put("kid", str);
        }
        URI uri = this.Y1;
        if (uri != null) {
            hashMap.put("x5u", uri.toString());
        }
        Base64URL base64URL = this.Z1;
        if (base64URL != null) {
            hashMap.put("x5t", base64URL.c);
        }
        Base64URL base64URL2 = this.a2;
        if (base64URL2 != null) {
            hashMap.put("x5t#S256", base64URL2.c);
        }
        if (this.b2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Base64 base64 : this.b2) {
                arrayList2.add(base64.c);
            }
            hashMap.put("x5c", arrayList2);
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JWK)) {
            return false;
        }
        JWK jwk = (JWK) obj;
        if (!Objects.equals(this.c, jwk.c) || !Objects.equals(this.d, jwk.d) || !Objects.equals(this.q, jwk.q) || !Objects.equals(this.x, jwk.x) || !Objects.equals(this.y, jwk.y) || !Objects.equals(this.Y1, jwk.Y1) || !Objects.equals(this.Z1, jwk.Z1) || !Objects.equals(this.a2, jwk.a2) || !Objects.equals(this.b2, jwk.b2) || !Objects.equals(this.d2, jwk.d2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.c, this.d, this.q, this.x, this.y, this.Y1, this.Z1, this.a2, this.b2, this.d2});
    }

    public String toString() {
        return h.k4(d());
    }
}
