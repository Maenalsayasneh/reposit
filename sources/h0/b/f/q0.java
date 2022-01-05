package h0.b.f;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.SearchView;
import com.pubnub.api.endpoints.objects_api.utils.Limiter;
import h0.j.a.c;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: SuggestionsAdapter */
public class q0 extends c implements View.OnClickListener {
    public static final /* synthetic */ int e2 = 0;
    public final SearchView f2;
    public final SearchableInfo g2;
    public final Context h2;
    public final WeakHashMap<String, Drawable.ConstantState> i2;
    public final int j2;
    public int k2 = 1;
    public ColorStateList l2;
    public int m2 = -1;
    public int n2 = -1;
    public int o2 = -1;
    public int p2 = -1;
    public int q2 = -1;
    public int r2 = -1;

    /* compiled from: SuggestionsAdapter */
    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(16908308);
            this.b = (TextView) view.findViewById(16908309);
            this.c = (ImageView) view.findViewById(16908295);
            this.d = (ImageView) view.findViewById(16908296);
            this.e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2 = searchView;
        this.g2 = searchableInfo;
        this.j2 = searchView.getSuggestionCommitIconResId();
        this.h2 = context;
        this.i2 = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r18, android.content.Context r19, android.database.Cursor r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r20
            java.lang.Object r0 = r18.getTag()
            r3 = r0
            h0.b.f.q0$a r3 = (h0.b.f.q0.a) r3
            int r0 = r1.r2
            r4 = -1
            r5 = 0
            if (r0 == r4) goto L_0x0017
            int r0 = r2.getInt(r0)
            r4 = r0
            goto L_0x0018
        L_0x0017:
            r4 = r5
        L_0x0018:
            android.widget.TextView r0 = r3.a
            r6 = 8
            if (r0 == 0) goto L_0x0036
            int r0 = r1.m2
            java.lang.String r0 = h(r2, r0)
            android.widget.TextView r7 = r3.a
            r7.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0033
            r7.setVisibility(r6)
            goto L_0x0036
        L_0x0033:
            r7.setVisibility(r5)
        L_0x0036:
            android.widget.TextView r0 = r3.b
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x00be
            int r0 = r1.o2
            java.lang.String r0 = h(r2, r0)
            if (r0 == 0) goto L_0x0085
            android.content.res.ColorStateList r9 = r1.l2
            if (r9 != 0) goto L_0x0066
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.Context r10 = r1.h2
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int r11 = androidx.appcompat.R.attr.textColorSearchUrl
            r10.resolveAttribute(r11, r9, r8)
            android.content.Context r10 = r1.h2
            android.content.res.Resources r10 = r10.getResources()
            int r9 = r9.resourceId
            android.content.res.ColorStateList r9 = r10.getColorStateList(r9)
            r1.l2 = r9
        L_0x0066:
            android.text.SpannableString r9 = new android.text.SpannableString
            r9.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r11 = 0
            r12 = 0
            r13 = 0
            android.content.res.ColorStateList r14 = r1.l2
            r16 = 0
            r10 = r15
            r6 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            int r0 = r0.length()
            r10 = 33
            r9.setSpan(r6, r5, r0, r10)
            goto L_0x008b
        L_0x0085:
            int r0 = r1.n2
            java.lang.String r9 = h(r2, r0)
        L_0x008b:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x009e
            android.widget.TextView r0 = r3.a
            if (r0 == 0) goto L_0x00aa
            r0.setSingleLine(r5)
            android.widget.TextView r0 = r3.a
            r0.setMaxLines(r7)
            goto L_0x00aa
        L_0x009e:
            android.widget.TextView r0 = r3.a
            if (r0 == 0) goto L_0x00aa
            r0.setSingleLine(r8)
            android.widget.TextView r0 = r3.a
            r0.setMaxLines(r8)
        L_0x00aa:
            android.widget.TextView r0 = r3.b
            r0.setText(r9)
            boolean r6 = android.text.TextUtils.isEmpty(r9)
            if (r6 == 0) goto L_0x00bb
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x00be
        L_0x00bb:
            r0.setVisibility(r5)
        L_0x00be:
            android.widget.ImageView r6 = r3.c
            if (r6 == 0) goto L_0x016f
            int r0 = r1.p2
            r9 = -1
            if (r0 != r9) goto L_0x00ca
            r0 = 0
            goto L_0x015c
        L_0x00ca:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto L_0x00d6
            goto L_0x015c
        L_0x00d6:
            android.app.SearchableInfo r0 = r1.g2
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r9 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.i2
            boolean r10 = r10.containsKey(r9)
            if (r10 == 0) goto L_0x00ff
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.i2
            java.lang.Object r0 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f4
            r0 = 0
            goto L_0x014f
        L_0x00f4:
            android.content.Context r9 = r1.h2
            android.content.res.Resources r9 = r9.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r9)
            goto L_0x014f
        L_0x00ff:
            java.lang.String r10 = "SuggestionsAdapter"
            android.content.Context r11 = r1.h2
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r12 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r12 = r11.getActivityInfo(r0, r12)     // Catch:{ NameNotFoundException -> 0x0137 }
            int r13 = r12.getIconResource()
            if (r13 != 0) goto L_0x0114
            goto L_0x0140
        L_0x0114:
            java.lang.String r14 = r0.getPackageName()
            android.content.pm.ApplicationInfo r12 = r12.applicationInfo
            android.graphics.drawable.Drawable r11 = r11.getDrawable(r14, r13, r12)
            if (r11 != 0) goto L_0x0141
            java.lang.String r11 = "Invalid icon resource "
            java.lang.String r12 = " for "
            java.lang.StringBuilder r11 = i0.d.a.a.a.Q0(r11, r13, r12)
            java.lang.String r0 = r0.flattenToShortString()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
            goto L_0x0140
        L_0x0137:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r10, r0)
        L_0x0140:
            r11 = 0
        L_0x0141:
            if (r11 != 0) goto L_0x0145
            r0 = 0
            goto L_0x0149
        L_0x0145:
            android.graphics.drawable.Drawable$ConstantState r0 = r11.getConstantState()
        L_0x0149:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r10 = r1.i2
            r10.put(r9, r0)
            r0 = r11
        L_0x014f:
            if (r0 == 0) goto L_0x0152
            goto L_0x015c
        L_0x0152:
            android.content.Context r0 = r1.h2
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x015c:
            r9 = 4
            r6.setImageDrawable(r0)
            if (r0 != 0) goto L_0x0166
            r6.setVisibility(r9)
            goto L_0x016f
        L_0x0166:
            r6.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r8, r5)
        L_0x016f:
            android.widget.ImageView r0 = r3.d
            if (r0 == 0) goto L_0x0196
            int r6 = r1.q2
            r9 = -1
            if (r6 != r9) goto L_0x017a
            r2 = 0
            goto L_0x0182
        L_0x017a:
            java.lang.String r2 = r2.getString(r6)
            android.graphics.drawable.Drawable r2 = r1.f(r2)
        L_0x0182:
            r0.setImageDrawable(r2)
            if (r2 != 0) goto L_0x018d
            r6 = 8
            r0.setVisibility(r6)
            goto L_0x0196
        L_0x018d:
            r0.setVisibility(r5)
            r2.setVisible(r5, r5)
            r2.setVisible(r8, r5)
        L_0x0196:
            int r0 = r1.k2
            if (r0 == r7) goto L_0x01a9
            if (r0 != r8) goto L_0x01a1
            r0 = r4 & 1
            if (r0 == 0) goto L_0x01a1
            goto L_0x01a9
        L_0x01a1:
            android.widget.ImageView r0 = r3.e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01be
        L_0x01a9:
            android.widget.ImageView r0 = r3.e
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r3.e
            android.widget.TextView r2 = r3.a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.e
            r0.setOnClickListener(r1)
        L_0x01be:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.q0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.m2 = cursor.getColumnIndex("suggest_text_1");
                this.n2 = cursor.getColumnIndex("suggest_text_2");
                this.o2 = cursor.getColumnIndex("suggest_text_2_url");
                this.p2 = cursor.getColumnIndex("suggest_icon_1");
                this.q2 = cursor.getColumnIndex("suggest_icon_2");
                this.r2 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public CharSequence c(Cursor cursor) {
        String h;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        if (this.g2.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!this.g2.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.d2.inflate(this.b2, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.j2);
        return inflate;
    }

    public Drawable e(Uri uri) throws FileNotFoundException {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.h2.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x009e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable f(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013a
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013a
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013a
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.content.Context r4 = r7.h2     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.i2     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.h2     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable r2 = h0.i.b.a.getDrawable(r4, r2)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            if (r2 == 0) goto L_0x005c
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.i2     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0072, NotFoundException -> 0x005d }
        L_0x005c:
            return r2
        L_0x005d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0072:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.i2
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x007e
            r2 = r1
            goto L_0x0082
        L_0x007e:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0082:
            if (r2 == 0) goto L_0x0085
            return r2
        L_0x0085:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            if (r4 == 0) goto L_0x00b5
            android.graphics.drawable.Drawable r0 = r7.e(r2)     // Catch:{ NotFoundException -> 0x009e }
            r1 = r0
            goto L_0x012f
        L_0x009e:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010e }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            throw r3     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00b5:
            android.content.Context r4 = r7.h2     // Catch:{ FileNotFoundException -> 0x010e }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x010e }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            if (r4 == 0) goto L_0x00f7
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00de }
            r4.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00dc
        L_0x00c9:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00dc:
            r1 = r5
            goto L_0x012f
        L_0x00de:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00f6
        L_0x00e3:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x010e }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00f6:
            throw r5     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x00f7:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x010e }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x010e }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x010e }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x010e }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x010e }
            throw r3     // Catch:{ FileNotFoundException -> 0x010e }
        L_0x010e:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x012f:
            if (r1 == 0) goto L_0x013a
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.i2
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.q0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter(Limiter.LIMIT_PARAM_NAME, String.valueOf(i));
        }
        return this.h2.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.d2.inflate(this.c2, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View d = d(this.h2, this.q, viewGroup);
            ((a) d.getTag()).a.setText(e.toString());
            return d;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public final void i(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        i(this.q);
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        i(this.q);
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2.x((CharSequence) tag);
        }
    }
}
