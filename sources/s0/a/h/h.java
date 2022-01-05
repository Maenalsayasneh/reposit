package s0.a.h;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Extension;
import java.util.Date;

public interface h extends X509Extension {
    a a();

    f[] b(String str);

    b c();

    void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException;

    byte[] getEncoded() throws IOException;

    Date getNotAfter();

    BigInteger getSerialNumber();
}
