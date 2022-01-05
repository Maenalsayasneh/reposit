package org.bouncycastle.jce.interfaces;

import java.security.PrivateKey;
import java.security.PublicKey;

public interface MQVPrivateKey extends PrivateKey {
    PublicKey L();

    PrivateKey s();

    PrivateKey u();
}
