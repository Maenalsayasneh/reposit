package i0.h.a.b.c.i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.R;
import g0.a.b.b.a;
import h0.b0.v;
import h0.f.h;
import i0.h.a.b.c.d;
import i0.h.a.b.c.n.b;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public final class r {
    public static final h<String, String> a = new h<>();
    public static Locale b;

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return b(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return b(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return b(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return b(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    public static String b(Context context, String str) {
        Resources resources;
        h<String, String> hVar = a;
        synchronized (hVar) {
            Locale b2 = a.L(context.getResources().getConfiguration()).b(0);
            if (!b2.equals(b)) {
                hVar.clear();
                b = b2;
            }
            String orDefault = hVar.getOrDefault(str, null);
            if (orDefault != null) {
                return orDefault;
            }
            int i = d.e;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }

    public static String c(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String b2 = b(context, str);
        if (b2 == null) {
            b2 = resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, b2, new Object[]{str2});
    }

    public static String d(Context context) {
        String packageName = context.getPackageName();
        try {
            i0.h.a.b.c.n.a a2 = b.a(context);
            return a2.a.getPackageManager().getApplicationLabel(a2.a.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        String d = d(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{d});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{d});
            } else if (i == 5) {
                return c(context, "common_google_play_services_invalid_account_text", d);
            } else {
                if (i == 7) {
                    return c(context, "common_google_play_services_network_error_text", d);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{d});
                } else if (i == 20) {
                    return c(context, "common_google_play_services_restricted_profile_text", d);
                } else {
                    switch (i) {
                        case 16:
                            return c(context, "common_google_play_services_api_unavailable_text", d);
                        case 17:
                            return c(context, "common_google_play_services_sign_in_failed_text", d);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{d});
                        default:
                            return resources.getString(com.google.android.gms.common.R.string.common_google_play_services_unknown_issue, new Object[]{d});
                    }
                }
            }
        } else if (v.N0(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{d});
        }
    }

    public static String f(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(R.string.common_google_play_services_enable_button);
    }
}
