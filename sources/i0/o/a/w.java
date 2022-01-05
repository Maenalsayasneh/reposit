package i0.o.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import i0.d.a.a.a;
import i0.o.a.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import r0.y;

/* compiled from: ResourceRequestHandler */
public class w extends v {
    public final Context a;

    public w(Context context) {
        this.a = context;
    }

    public boolean c(t tVar) {
        if (tVar.e != 0) {
            return true;
        }
        return "android.resource".equals(tVar.d.getScheme());
    }

    public v.a f(t tVar, int i) throws IOException {
        Resources resources;
        Uri uri;
        Uri uri2;
        Context context = this.a;
        StringBuilder sb = b0.a;
        if (tVar.e != 0 || (uri2 = tVar.d) == null) {
            resources = context.getResources();
        } else {
            String authority = uri2.getAuthority();
            if (authority != null) {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    StringBuilder P0 = a.P0("Unable to obtain resources for package: ");
                    P0.append(tVar.d);
                    throw new FileNotFoundException(P0.toString());
                }
            } else {
                StringBuilder P02 = a.P0("No package provided: ");
                P02.append(tVar.d);
                throw new FileNotFoundException(P02.toString());
            }
        }
        int i2 = tVar.e;
        boolean z = true;
        if (i2 == 0 && (uri = tVar.d) != null) {
            String authority2 = uri.getAuthority();
            if (authority2 != null) {
                List<String> pathSegments = tVar.d.getPathSegments();
                if (pathSegments == null || pathSegments.isEmpty()) {
                    StringBuilder P03 = a.P0("No path segments: ");
                    P03.append(tVar.d);
                    throw new FileNotFoundException(P03.toString());
                } else if (pathSegments.size() == 1) {
                    try {
                        i2 = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused2) {
                        StringBuilder P04 = a.P0("Last path segment is not a resource ID: ");
                        P04.append(tVar.d);
                        throw new FileNotFoundException(P04.toString());
                    }
                } else if (pathSegments.size() == 2) {
                    i2 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                } else {
                    StringBuilder P05 = a.P0("More than two path segments: ");
                    P05.append(tVar.d);
                    throw new FileNotFoundException(P05.toString());
                }
            } else {
                StringBuilder P06 = a.P0("No package provided: ");
                P06.append(tVar.d);
                throw new FileNotFoundException(P06.toString());
            }
        }
        BitmapFactory.Options d = v.d(tVar);
        if (d == null || !d.inJustDecodeBounds) {
            z = false;
        }
        if (z) {
            BitmapFactory.decodeResource(resources, i2, d);
            v.b(tVar.g, tVar.h, d, tVar);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, d);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        Objects.requireNonNull(decodeResource, "bitmap == null");
        return new v.a(decodeResource, (y) null, loadedFrom, 0);
    }
}
