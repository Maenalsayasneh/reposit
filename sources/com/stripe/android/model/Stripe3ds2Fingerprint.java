package com.stripe.android.model;

import com.stripe.android.model.StripeIntent;
import i0.j.f.p.h;
import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import m0.t.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001:\u0001#B)\b\u0000\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0010\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001c\u0010\u0004R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001d\u0010\u0004¨\u0006$"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "component4", "()Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "source", "directoryServerName", "serverTransactionId", "directoryServerEncryption", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;)Lcom/stripe/android/model/Stripe3ds2Fingerprint;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getServerTransactionId", "Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "getDirectoryServerEncryption", "getDirectoryServerName", "getSource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;)V", "Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;", "sdkData", "(Lcom/stripe/android/model/StripeIntent$NextActionData$SdkData$Use3DS2;)V", "DirectoryServerEncryption", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2Fingerprint.kt */
public final class Stripe3ds2Fingerprint {
    private final DirectoryServerEncryption directoryServerEncryption;
    private final String directoryServerName;
    private final String serverTransactionId;
    private final String source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 '2\u00020\u0001:\u0001'B1\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010#B1\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\"\u0010&J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004J@\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010\u0007R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b!\u0010\u0004¨\u0006("}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "", "", "component1", "()Ljava/lang/String;", "Ljava/security/PublicKey;", "component2", "()Ljava/security/PublicKey;", "", "Ljava/security/cert/X509Certificate;", "component3", "()Ljava/util/List;", "component4", "directoryServerId", "directoryServerPublicKey", "rootCerts", "keyId", "copy", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/List;Ljava/lang/String;)Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDirectoryServerId", "Ljava/util/List;", "getRootCerts", "Ljava/security/PublicKey;", "getDirectoryServerPublicKey", "getKeyId", "<init>", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/util/List;Ljava/lang/String;)V", "dsCertificateData", "rootCertsData", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2Fingerprint.kt */
    public static final class DirectoryServerEncryption {
        /* access modifiers changed from: private */
        public static final Companion Companion = new Companion((f) null);
        private final String directoryServerId;
        private final PublicKey directoryServerPublicKey;
        private final String keyId;
        private final List<X509Certificate> rootCerts;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion;", "", "", "", "certificatesData", "Ljava/security/cert/X509Certificate;", "generateCertificates", "(Ljava/util/List;)Ljava/util/List;", "certificateData", "generateCertificate", "(Ljava/lang/String;)Ljava/security/cert/X509Certificate;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Stripe3ds2Fingerprint.kt */
        public static final class Companion {
            private Companion() {
            }

            /* access modifiers changed from: private */
            public final X509Certificate generateCertificate(String str) throws CertificateException {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                Charset charset = a.a;
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str.getBytes(charset);
                i.d(bytes, "(this as java.lang.String).getBytes(charset)");
                Certificate generateCertificate = instance.generateCertificate(new ByteArrayInputStream(bytes));
                Objects.requireNonNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) generateCertificate;
            }

            /* access modifiers changed from: private */
            public final List<X509Certificate> generateCertificates(List<String> list) throws CertificateException {
                ArrayList arrayList = new ArrayList(h.K(list, 10));
                for (String generateCertificate : list) {
                    arrayList.add(DirectoryServerEncryption.Companion.generateCertificate(generateCertificate));
                }
                return arrayList;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public DirectoryServerEncryption(String str, PublicKey publicKey, List<? extends X509Certificate> list, String str2) {
            i.e(str, "directoryServerId");
            i.e(publicKey, "directoryServerPublicKey");
            i.e(list, "rootCerts");
            this.directoryServerId = str;
            this.directoryServerPublicKey = publicKey;
            this.rootCerts = list;
            this.keyId = str2;
        }

        public static /* synthetic */ DirectoryServerEncryption copy$default(DirectoryServerEncryption directoryServerEncryption, String str, PublicKey publicKey, List<X509Certificate> list, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = directoryServerEncryption.directoryServerId;
            }
            if ((i & 2) != 0) {
                publicKey = directoryServerEncryption.directoryServerPublicKey;
            }
            if ((i & 4) != 0) {
                list = directoryServerEncryption.rootCerts;
            }
            if ((i & 8) != 0) {
                str2 = directoryServerEncryption.keyId;
            }
            return directoryServerEncryption.copy(str, publicKey, list, str2);
        }

        public final String component1() {
            return this.directoryServerId;
        }

        public final PublicKey component2() {
            return this.directoryServerPublicKey;
        }

        public final List<X509Certificate> component3() {
            return this.rootCerts;
        }

        public final String component4() {
            return this.keyId;
        }

        public final DirectoryServerEncryption copy(String str, PublicKey publicKey, List<? extends X509Certificate> list, String str2) {
            i.e(str, "directoryServerId");
            i.e(publicKey, "directoryServerPublicKey");
            i.e(list, "rootCerts");
            return new DirectoryServerEncryption(str, publicKey, list, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DirectoryServerEncryption)) {
                return false;
            }
            DirectoryServerEncryption directoryServerEncryption = (DirectoryServerEncryption) obj;
            return i.a(this.directoryServerId, directoryServerEncryption.directoryServerId) && i.a(this.directoryServerPublicKey, directoryServerEncryption.directoryServerPublicKey) && i.a(this.rootCerts, directoryServerEncryption.rootCerts) && i.a(this.keyId, directoryServerEncryption.keyId);
        }

        public final String getDirectoryServerId() {
            return this.directoryServerId;
        }

        public final PublicKey getDirectoryServerPublicKey() {
            return this.directoryServerPublicKey;
        }

        public final String getKeyId() {
            return this.keyId;
        }

        public final List<X509Certificate> getRootCerts() {
            return this.rootCerts;
        }

        public int hashCode() {
            String str = this.directoryServerId;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            PublicKey publicKey = this.directoryServerPublicKey;
            int hashCode2 = (hashCode + (publicKey != null ? publicKey.hashCode() : 0)) * 31;
            List<X509Certificate> list = this.rootCerts;
            int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.keyId;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("DirectoryServerEncryption(directoryServerId=");
            P0.append(this.directoryServerId);
            P0.append(", directoryServerPublicKey=");
            P0.append(this.directoryServerPublicKey);
            P0.append(", rootCerts=");
            P0.append(this.rootCerts);
            P0.append(", keyId=");
            return i0.d.a.a.a.y0(P0, this.keyId, ")");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DirectoryServerEncryption(java.lang.String r3, java.lang.String r4, java.util.List<java.lang.String> r5, java.lang.String r6) {
            /*
                r2 = this;
                java.lang.String r0 = "directoryServerId"
                m0.n.b.i.e(r3, r0)
                java.lang.String r0 = "dsCertificateData"
                m0.n.b.i.e(r4, r0)
                java.lang.String r0 = "rootCertsData"
                m0.n.b.i.e(r5, r0)
                com.stripe.android.model.Stripe3ds2Fingerprint$DirectoryServerEncryption$Companion r0 = Companion
                java.security.cert.X509Certificate r4 = r0.generateCertificate(r4)
                java.security.PublicKey r4 = r4.getPublicKey()
                java.lang.String r1 = "generateCertificate(dsCertificateData).publicKey"
                m0.n.b.i.d(r4, r1)
                java.util.List r5 = r0.generateCertificates(r5)
                r2.<init>((java.lang.String) r3, (java.security.PublicKey) r4, (java.util.List<? extends java.security.cert.X509Certificate>) r5, (java.lang.String) r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.Stripe3ds2Fingerprint.DirectoryServerEncryption.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
        }
    }

    public Stripe3ds2Fingerprint(String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption2) {
        i.e(str, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(str2, "directoryServerName");
        i.e(str3, "serverTransactionId");
        i.e(directoryServerEncryption2, "directoryServerEncryption");
        this.source = str;
        this.directoryServerName = str2;
        this.serverTransactionId = str3;
        this.directoryServerEncryption = directoryServerEncryption2;
    }

    public static /* synthetic */ Stripe3ds2Fingerprint copy$default(Stripe3ds2Fingerprint stripe3ds2Fingerprint, String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = stripe3ds2Fingerprint.source;
        }
        if ((i & 2) != 0) {
            str2 = stripe3ds2Fingerprint.directoryServerName;
        }
        if ((i & 4) != 0) {
            str3 = stripe3ds2Fingerprint.serverTransactionId;
        }
        if ((i & 8) != 0) {
            directoryServerEncryption2 = stripe3ds2Fingerprint.directoryServerEncryption;
        }
        return stripe3ds2Fingerprint.copy(str, str2, str3, directoryServerEncryption2);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.directoryServerName;
    }

    public final String component3() {
        return this.serverTransactionId;
    }

    public final DirectoryServerEncryption component4() {
        return this.directoryServerEncryption;
    }

    public final Stripe3ds2Fingerprint copy(String str, String str2, String str3, DirectoryServerEncryption directoryServerEncryption2) {
        i.e(str, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(str2, "directoryServerName");
        i.e(str3, "serverTransactionId");
        i.e(directoryServerEncryption2, "directoryServerEncryption");
        return new Stripe3ds2Fingerprint(str, str2, str3, directoryServerEncryption2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stripe3ds2Fingerprint)) {
            return false;
        }
        Stripe3ds2Fingerprint stripe3ds2Fingerprint = (Stripe3ds2Fingerprint) obj;
        return i.a(this.source, stripe3ds2Fingerprint.source) && i.a(this.directoryServerName, stripe3ds2Fingerprint.directoryServerName) && i.a(this.serverTransactionId, stripe3ds2Fingerprint.serverTransactionId) && i.a(this.directoryServerEncryption, stripe3ds2Fingerprint.directoryServerEncryption);
    }

    public final DirectoryServerEncryption getDirectoryServerEncryption() {
        return this.directoryServerEncryption;
    }

    public final String getDirectoryServerName() {
        return this.directoryServerName;
    }

    public final String getServerTransactionId() {
        return this.serverTransactionId;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.source;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.directoryServerName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.serverTransactionId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        DirectoryServerEncryption directoryServerEncryption2 = this.directoryServerEncryption;
        if (directoryServerEncryption2 != null) {
            i = directoryServerEncryption2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Stripe3ds2Fingerprint(source=");
        P0.append(this.source);
        P0.append(", directoryServerName=");
        P0.append(this.directoryServerName);
        P0.append(", serverTransactionId=");
        P0.append(this.serverTransactionId);
        P0.append(", directoryServerEncryption=");
        P0.append(this.directoryServerEncryption);
        P0.append(")");
        return P0.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Stripe3ds2Fingerprint(StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2) throws CertificateException {
        this(use3DS2.getSource(), use3DS2.getServerName(), use3DS2.getTransactionId(), new DirectoryServerEncryption(use3DS2.getServerEncryption().getDirectoryServerId(), use3DS2.getServerEncryption().getDsCertificateData(), use3DS2.getServerEncryption().getRootCertsData(), use3DS2.getServerEncryption().getKeyId()));
        i.e(use3DS2, "sdkData");
    }
}
