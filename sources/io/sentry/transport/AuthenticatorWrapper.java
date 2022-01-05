package io.sentry.transport;

import java.net.Authenticator;

public final class AuthenticatorWrapper {
    private static final AuthenticatorWrapper instance = new AuthenticatorWrapper();

    private AuthenticatorWrapper() {
    }

    public static AuthenticatorWrapper getInstance() {
        return instance;
    }

    public void setDefault(Authenticator authenticator) {
        Authenticator.setDefault(authenticator);
    }
}
