package i0.h.a.b.a.a.d;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final /* synthetic */ class c implements Comparator {
    public static final Comparator c = new c();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).d.compareTo(((Scope) obj2).d);
    }
}
