package org.bouncycastle.jce.provider;

import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.util.StoreException;
import s0.a.c.e;
import s0.a.g.i;

public abstract class PKIXCRLUtil {
    public static Set findCRLs(e eVar, Date date, List list, List list2) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            findCRLs(hashSet, eVar, list2);
            findCRLs(hashSet, eVar, list);
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                X509CRL x509crl = (X509CRL) it.next();
                if (x509crl.getNextUpdate().after(date)) {
                    CRLSelector cRLSelector = eVar.c;
                    X509Certificate certificateChecking = cRLSelector instanceof X509CRLSelector ? ((X509CRLSelector) cRLSelector).getCertificateChecking() : null;
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e);
        }
    }

    private static void findCRLs(HashSet hashSet, e eVar, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        AnnotatedException annotatedException2 = null;
        boolean z = false;
        for (Object next : list) {
            if (next instanceof i) {
                try {
                    hashSet.addAll(((i) next).getMatches(eVar));
                } catch (StoreException e) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) next).getCRLs(new e.c(eVar)));
                } catch (CertStoreException e2) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e2);
                }
            }
            z = true;
        }
        if (!z && annotatedException2 != null) {
            throw annotatedException2;
        }
    }
}
