package com.nimbusds.jose;

public final class JWEAlgorithm extends Algorithm {
    public static final JWEAlgorithm Y1;
    public static final JWEAlgorithm Z1;
    public static final JWEAlgorithm a2;
    public static final JWEAlgorithm b2;
    public static final JWEAlgorithm c2;
    public static final JWEAlgorithm d2;
    public static final JWEAlgorithm e2;
    public static final JWEAlgorithm f2;
    public static final JWEAlgorithm g2;
    public static final JWEAlgorithm h2;
    public static final JWEAlgorithm i2;
    public static final JWEAlgorithm j2;
    public static final JWEAlgorithm k2;
    public static final JWEAlgorithm l2;
    @Deprecated
    public static final JWEAlgorithm q = new JWEAlgorithm("RSA1_5", Requirement.REQUIRED);
    @Deprecated
    public static final JWEAlgorithm x;
    public static final JWEAlgorithm y;

    static {
        Requirement requirement = Requirement.OPTIONAL;
        x = new JWEAlgorithm("RSA-OAEP", requirement);
        y = new JWEAlgorithm("RSA-OAEP-256", requirement);
        Requirement requirement2 = Requirement.RECOMMENDED;
        Y1 = new JWEAlgorithm("A128KW", requirement2);
        Z1 = new JWEAlgorithm("A192KW", requirement);
        a2 = new JWEAlgorithm("A256KW", requirement2);
        b2 = new JWEAlgorithm("dir", requirement2);
        c2 = new JWEAlgorithm("ECDH-ES", requirement2);
        d2 = new JWEAlgorithm("ECDH-ES+A128KW", requirement2);
        e2 = new JWEAlgorithm("ECDH-ES+A192KW", requirement);
        f2 = new JWEAlgorithm("ECDH-ES+A256KW", requirement2);
        g2 = new JWEAlgorithm("A128GCMKW", requirement);
        h2 = new JWEAlgorithm("A192GCMKW", requirement);
        i2 = new JWEAlgorithm("A256GCMKW", requirement);
        j2 = new JWEAlgorithm("PBES2-HS256+A128KW", requirement);
        k2 = new JWEAlgorithm("PBES2-HS384+A192KW", requirement);
        l2 = new JWEAlgorithm("PBES2-HS512+A256KW", requirement);
    }

    public JWEAlgorithm(String str, Requirement requirement) {
        super(str, requirement);
    }

    public JWEAlgorithm(String str) {
        super(str, (Requirement) null);
    }
}
