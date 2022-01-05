package com.nimbusds.jose;

public final class EncryptionMethod extends Algorithm {
    public static final EncryptionMethod Y1;
    public static final EncryptionMethod Z1;
    public static final EncryptionMethod a2;
    public static final EncryptionMethod b2;
    public static final EncryptionMethod c2;
    public static final EncryptionMethod q;
    public static final EncryptionMethod x;
    public static final EncryptionMethod y;
    public final int d2;

    static {
        Requirement requirement = Requirement.REQUIRED;
        q = new EncryptionMethod("A128CBC-HS256", requirement, 256);
        Requirement requirement2 = Requirement.OPTIONAL;
        x = new EncryptionMethod("A192CBC-HS384", requirement2, 384);
        y = new EncryptionMethod("A256CBC-HS512", requirement, 512);
        Y1 = new EncryptionMethod("A128CBC+HS256", requirement2, 256);
        Z1 = new EncryptionMethod("A256CBC+HS512", requirement2, 512);
        Requirement requirement3 = Requirement.RECOMMENDED;
        a2 = new EncryptionMethod("A128GCM", requirement3, 128);
        b2 = new EncryptionMethod("A192GCM", requirement2, 192);
        c2 = new EncryptionMethod("A256GCM", requirement3, 256);
    }

    public EncryptionMethod(String str) {
        super(str, (Requirement) null);
        this.d2 = 0;
    }

    public EncryptionMethod(String str, Requirement requirement, int i) {
        super(str, requirement);
        this.d2 = i;
    }
}
