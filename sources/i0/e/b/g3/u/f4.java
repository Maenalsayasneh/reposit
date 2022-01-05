package i0.e.b.g3.u;

import android.net.Uri;
import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import com.clubhouse.android.ui.profile.EditPhotoArgs;
import i0.b.b.b;
import i0.b.b.g0;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EditPhotoViewModel.kt */
public final class f4 implements j {
    public final b<UpdatePhotoResponse> a;
    public final Uri b;
    public final String c;

    public f4() {
        this((b) null, (Uri) null, (String) null, 7, (f) null);
    }

    public f4(b<UpdatePhotoResponse> bVar, Uri uri, String str) {
        i.e(bVar, "updatePhotoRequest");
        this.a = bVar;
        this.b = uri;
        this.c = str;
    }

    public static f4 copy$default(f4 f4Var, b<UpdatePhotoResponse> bVar, Uri uri, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = f4Var.a;
        }
        if ((i & 2) != 0) {
            uri = f4Var.b;
        }
        if ((i & 4) != 0) {
            str = f4Var.c;
        }
        Objects.requireNonNull(f4Var);
        i.e(bVar, "updatePhotoRequest");
        return new f4(bVar, uri, str);
    }

    public final b<UpdatePhotoResponse> component1() {
        return this.a;
    }

    public final Uri component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        return i.a(this.a, f4Var.a) && i.a(this.b, f4Var.b) && i.a(this.c, f4Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EditPhotoState(updatePhotoRequest=");
        P0.append(this.a);
        P0.append(", localPhotoUri=");
        P0.append(this.b);
        P0.append(", remotePhotoUrl=");
        return a.w0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(b bVar, Uri uri, String str, int i, f fVar) {
        this((i & 1) != 0 ? g0.b : bVar, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f4(EditPhotoArgs editPhotoArgs) {
        this((b) null, (Uri) null, editPhotoArgs.c, 1, (f) null);
        i.e(editPhotoArgs, "args");
    }
}
