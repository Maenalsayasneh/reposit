package o0.a.a.p;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import i0.d.a.a.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* compiled from: BrowserDescriptor */
public class b {
    public final String a;
    public final Set<String> b;
    public final String c;
    public final Boolean d;

    public b(PackageInfo packageInfo, boolean z) {
        String str = packageInfo.packageName;
        Signature[] signatureArr = packageInfo.signatures;
        HashSet hashSet = new HashSet();
        int length = signatureArr.length;
        int i = 0;
        while (i < length) {
            try {
                hashSet.add(Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signatureArr[i].toByteArray()), 10));
                i++;
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }
        String str2 = packageInfo.versionName;
        this.a = str;
        this.b = hashSet;
        this.c = str2;
        this.d = Boolean.valueOf(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.a.equals(bVar.a) || !this.c.equals(bVar.c) || this.d != bVar.d || !this.b.equals(bVar.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int F = (this.d.booleanValue() ? 1 : 0) + a.F(this.c, this.a.hashCode() * 92821, 92821);
        for (String hashCode : this.b) {
            F = (F * 92821) + hashCode.hashCode();
        }
        return F;
    }
}
