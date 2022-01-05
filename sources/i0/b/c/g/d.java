package i0.b.c.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import i0.b.c.h.b;
import i0.b.c.h.c;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: ResourceStyle.kt */
public final class d implements e {
    public final boolean a = true;
    public final int b;
    public String c = null;

    public d(int i, String str, int i2) {
        int i3 = i2 & 2;
        this.b = i;
    }

    @SuppressLint({"Recycle"})
    public c a(Context context, int[] iArr) {
        i.e(context, "context");
        i.e(iArr, UserAttributesCacheManager.USER_ATTRIBUTES_CACHE_KEY);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.b, iArr);
        i.d(obtainStyledAttributes, "context.obtainStyledAttributes(styleRes, attrs)");
        return new b(context, obtainStyledAttributes);
    }

    public boolean b() {
        return this.a;
    }

    public String c(Context context) {
        i.e(context, "context");
        String resourceEntryName = context.getResources().getResourceEntryName(this.b);
        i.d(resourceEntryName, "context.resources.getResourceEntryName(styleRes)");
        return resourceEntryName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && i.a(this.c, dVar.c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        String str = this.c;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ResourceStyle(styleRes=");
        P0.append(this.b);
        P0.append(", name=");
        return a.y0(P0, this.c, ")");
    }
}
