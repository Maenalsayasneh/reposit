package s0.a.b;

import s0.a.g.j;

public abstract class t {
    public int iterationCount;
    public byte[] password;
    public byte[] salt;

    public static byte[] PKCS12PasswordToBytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[((cArr.length + 1) * 2)];
        for (int i = 0; i != cArr.length; i++) {
            int i2 = i * 2;
            bArr[i2] = (byte) (cArr[i] >>> 8);
            bArr[i2 + 1] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] PKCS5PasswordToBytes(char[] cArr) {
        if (cArr == null) {
            return new byte[0];
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] PKCS5PasswordToUTF8Bytes(char[] cArr) {
        return cArr != null ? j.f(cArr) : new byte[0];
    }

    public abstract i generateDerivedMacParameters(int i);

    public abstract i generateDerivedParameters(int i);

    public abstract i generateDerivedParameters(int i, int i2);

    public int getIterationCount() {
        return this.iterationCount;
    }

    public byte[] getPassword() {
        return this.password;
    }

    public byte[] getSalt() {
        return this.salt;
    }

    public void init(byte[] bArr, byte[] bArr2, int i) {
        this.password = bArr;
        this.salt = bArr2;
        this.iterationCount = i;
    }
}
