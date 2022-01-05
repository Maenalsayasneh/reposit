package org.bouncycastle.crypto;

import s0.a.b.g;
import s0.a.b.t;

public enum PasswordConverter implements g {
    ASCII {
        public byte[] convert(char[] cArr) {
            return t.PKCS5PasswordToBytes(cArr);
        }

        public String getType() {
            return "ASCII";
        }
    },
    UTF8 {
        public byte[] convert(char[] cArr) {
            return t.PKCS5PasswordToUTF8Bytes(cArr);
        }

        public String getType() {
            return "UTF8";
        }
    },
    PKCS12 {
        public byte[] convert(char[] cArr) {
            return t.PKCS12PasswordToBytes(cArr);
        }

        public String getType() {
            return "PKCS12";
        }
    }
}
