package i0.e.b.g3.r;

import android.net.Uri;
import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import com.clubhouse.app.R;
import h0.t.a;
import h0.t.l;
import i0.b.b.b;
import i0.b.b.g0;
import i0.b.b.j;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: AddPhotoViewModel.kt */
public final class i0 implements j {
    public final l a;
    public final b<UpdatePhotoResponse> b;
    public final Uri c;
    public final boolean d;

    public i0() {
        this((l) null, (b) null, (Uri) null, false, 15, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public i0(l lVar, b bVar, Uri uri, boolean z, int i, f fVar) {
        this((i & 1) != 0 ? new a(R.id.action_addPhotoFragment_to_contactsPermissionFragment) : lVar, (i & 2) != 0 ? g0.b : bVar, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? false : z);
    }

    public static i0 copy$default(i0 i0Var, l lVar, b<UpdatePhotoResponse> bVar, Uri uri, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = i0Var.a;
        }
        if ((i & 2) != 0) {
            bVar = i0Var.b;
        }
        if ((i & 4) != 0) {
            uri = i0Var.c;
        }
        if ((i & 8) != 0) {
            z = i0Var.d;
        }
        Objects.requireNonNull(i0Var);
        i.e(lVar, "navigateTo");
        i.e(bVar, "updatePhotoRequest");
        return new i0(lVar, bVar, uri, z);
    }

    public final l component1() {
        return this.a;
    }

    public final b<UpdatePhotoResponse> component2() {
        return this.b;
    }

    public final Uri component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return i.a(this.a, i0Var.a) && i.a(this.b, i0Var.b) && i.a(this.c, i0Var.c) && this.d == i0Var.d;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Uri uri = this.c;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        boolean z = this.d;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AddPhotoState(navigateTo=");
        P0.append(this.a);
        P0.append(", updatePhotoRequest=");
        P0.append(this.b);
        P0.append(", localPhotoUri=");
        P0.append(this.c);
        P0.append(", didUploadPhoto=");
        return i0.d.a.a.a.C0(P0, this.d, ')');
    }

    public i0(l lVar, b<UpdatePhotoResponse> bVar, Uri uri, boolean z) {
        i.e(lVar, "navigateTo");
        i.e(bVar, "updatePhotoRequest");
        this.a = lVar;
        this.b = bVar;
        this.c = uri;
        this.d = z;
    }
}
