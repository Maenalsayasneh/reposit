package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.instabug.library.model.StepType;
import i0.d.a.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b = -1;
    public Object c;
    public byte[] d = null;
    public Parcelable e = null;
    public int f = 0;
    public int g = 0;
    public ColorStateList h = null;
    public PorterDuff.Mode i = a;
    public String j = null;
    public String k;

    public IconCompat() {
    }

    public static IconCompat a(Icon icon) {
        Objects.requireNonNull(icon);
        int j2 = j(icon);
        if (j2 == 2) {
            return c((Resources) null, g(icon), e(icon));
        }
        if (j2 == 4) {
            Uri l = l(icon);
            if (l != null) {
                String uri = l.toString();
                if (uri != null) {
                    IconCompat iconCompat = new IconCompat(4);
                    iconCompat.c = uri;
                    return iconCompat;
                }
                throw new IllegalArgumentException("Uri must not be null.");
            }
            throw new IllegalArgumentException("Uri must not be null.");
        } else if (j2 != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.c = icon;
            return iconCompat2;
        } else {
            Uri l2 = l(icon);
            if (l2 != null) {
                String uri2 = l2.toString();
                if (uri2 != null) {
                    IconCompat iconCompat3 = new IconCompat(6);
                    iconCompat3.c = uri2;
                    return iconCompat3;
                }
                throw new IllegalArgumentException("Uri must not be null.");
            }
            throw new IllegalArgumentException("Uri must not be null.");
        }
    }

    public static Bitmap b(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = (float) min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat c(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f = i2;
            if (resources != null) {
                try {
                    iconCompat.c = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.c = str;
            }
            iconCompat.k = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    public static int e(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    public static String g(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    public static Resources h(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", new Object[]{str}), e2);
            return null;
        }
    }

    public static int j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    public static Uri l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    public int d() {
        int i2 = this.b;
        if (i2 == -1) {
            return e((Icon) this.c);
        }
        if (i2 == 2) {
            return this.f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i2 = this.b;
        if (i2 == -1) {
            return g((Icon) this.c);
        }
        if (i2 != 2) {
            throw new IllegalStateException("called getResPackage() on " + this);
        } else if (TextUtils.isEmpty(this.k)) {
            return ((String) this.c).split(":", -1)[0];
        } else {
            return this.k;
        }
    }

    public int i() {
        int i2 = this.b;
        return i2 == -1 ? j((Icon) this.c) : i2;
    }

    public Uri k() {
        int i2 = this.b;
        if (i2 == -1) {
            return l((Icon) this.c);
        }
        if (i2 == 4 || i2 == 6) {
            return Uri.parse((String) this.c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream m(Context context) {
        Uri k2 = k();
        String scheme = k2.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(k2);
            } catch (Exception e2) {
                Log.w("IconCompat", "Unable to load image from URI: " + k2, e2);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.c));
            } catch (FileNotFoundException e3) {
                Log.w("IconCompat", "Unable to load image from path: " + k2, e3);
                return null;
            }
        }
    }

    @Deprecated
    public Icon n() {
        return o((Context) null);
    }

    public Icon o(Context context) {
        Icon icon;
        switch (this.b) {
            case -1:
                return (Icon) this.c;
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.c);
                break;
            case 2:
                icon = Icon.createWithResource(f(), this.f);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.c, this.f, this.g);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(b((Bitmap) this.c, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.c);
                    break;
                }
            case 6:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(k());
                    break;
                } else if (context != null) {
                    InputStream m = m(context);
                    if (m != null) {
                        if (i2 < 26) {
                            icon = Icon.createWithBitmap(b(BitmapFactory.decodeStream(m), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(m));
                            break;
                        }
                    } else {
                        StringBuilder P0 = a.P0("Cannot load adaptive icon from uri: ");
                        P0.append(k());
                        throw new IllegalStateException(P0.toString());
                    }
                } else {
                    StringBuilder P02 = a.P0("Context is required to resolve the file uri of the icon: ");
                    P02.append(k());
                    throw new IllegalArgumentException(P02.toString());
                }
            default:
                throw new IllegalArgumentException("Unknown type");
        }
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.i;
        if (mode != a) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = StepType.UNKNOWN;
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", new Object[]{Integer.valueOf(d())}));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i2) {
        this.b = i2;
    }
}
