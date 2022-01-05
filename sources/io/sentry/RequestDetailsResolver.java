package io.sentry;

import i0.d.a.a.a;
import io.sentry.util.Objects;
import java.net.URI;
import java.util.HashMap;

public final class RequestDetailsResolver {
    private static final String SENTRY_AUTH = "X-Sentry-Auth";
    private static final String USER_AGENT = "User-Agent";
    private final SentryOptions options;

    public RequestDetailsResolver(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options is required");
    }

    public RequestDetails resolve() {
        Dsn dsn = new Dsn(this.options.getDsn());
        URI sentryUri = dsn.getSentryUri();
        String uri = sentryUri.resolve(sentryUri.getPath() + "/envelope/").toString();
        String publicKey = dsn.getPublicKey();
        String secretKey = dsn.getSecretKey();
        StringBuilder P0 = a.P0("Sentry sentry_version=7,sentry_client=");
        P0.append(this.options.getSentryClientName());
        P0.append(",sentry_key=");
        P0.append(publicKey);
        P0.append((secretKey == null || secretKey.length() <= 0) ? "" : a.n0(",sentry_secret=", secretKey));
        String sb = P0.toString();
        String sentryClientName = this.options.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put(USER_AGENT, sentryClientName);
        hashMap.put(SENTRY_AUTH, sb);
        return new RequestDetails(uri, hashMap);
    }
}
