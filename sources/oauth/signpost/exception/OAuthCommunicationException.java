package oauth.signpost.exception;

public class OAuthCommunicationException extends OAuthException {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OAuthCommunicationException(java.lang.Exception r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Communication with the service provider failed: "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r1 = r3.getLocalizedMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oauth.signpost.exception.OAuthCommunicationException.<init>(java.lang.Exception):void");
    }

    public OAuthCommunicationException(String str, String str2) {
        super(str);
    }
}
