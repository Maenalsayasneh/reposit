package com.nimbusds.jose;

public final class JWSAlgorithm extends Algorithm {
    public static final JWSAlgorithm Y1;
    public static final JWSAlgorithm Z1;
    public static final JWSAlgorithm a2;
    public static final JWSAlgorithm b2;
    public static final JWSAlgorithm c2;
    public static final JWSAlgorithm d2;
    public static final JWSAlgorithm e2;
    public static final JWSAlgorithm f2;
    public static final JWSAlgorithm g2;
    public static final JWSAlgorithm h2;
    public static final JWSAlgorithm i2;
    public static final JWSAlgorithm q = new JWSAlgorithm("HS256", Requirement.REQUIRED);
    public static final JWSAlgorithm x;
    public static final JWSAlgorithm y;

    static {
        Requirement requirement = Requirement.OPTIONAL;
        x = new JWSAlgorithm("HS384", requirement);
        y = new JWSAlgorithm("HS512", requirement);
        Requirement requirement2 = Requirement.RECOMMENDED;
        Y1 = new JWSAlgorithm("RS256", requirement2);
        Z1 = new JWSAlgorithm("RS384", requirement);
        a2 = new JWSAlgorithm("RS512", requirement);
        b2 = new JWSAlgorithm("ES256", requirement2);
        c2 = new JWSAlgorithm("ES256K", requirement);
        d2 = new JWSAlgorithm("ES384", requirement);
        e2 = new JWSAlgorithm("ES512", requirement);
        f2 = new JWSAlgorithm("PS256", requirement);
        g2 = new JWSAlgorithm("PS384", requirement);
        h2 = new JWSAlgorithm("PS512", requirement);
        i2 = new JWSAlgorithm("EdDSA", requirement);
    }

    public JWSAlgorithm(String str, Requirement requirement) {
        super(str, requirement);
    }

    public JWSAlgorithm(String str) {
        super(str, (Requirement) null);
    }
}
