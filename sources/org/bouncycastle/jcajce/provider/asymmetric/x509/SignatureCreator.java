package org.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

public interface SignatureCreator {
    Signature createSignature(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
