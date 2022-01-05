package h0.i.f;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.network.RequestResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: FontProvider */
public class d {
    public static final Comparator<byte[]> a = new a();

    /* compiled from: FontProvider */
    public class a implements Comparator<byte[]> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                byte[] r5 = (byte[]) r5
                byte[] r6 = (byte[]) r6
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x000b
                int r5 = r5.length
                int r6 = r6.length
                goto L_0x001a
            L_0x000b:
                r0 = 0
                r1 = r0
            L_0x000d:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x0020
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x001d
                byte r5 = r5[r1]
                byte r6 = r6[r1]
            L_0x001a:
                int r0 = r5 - r6
                goto L_0x0020
            L_0x001d:
                int r1 = r1 + 1
                goto L_0x000d
            L_0x0020:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.i.f.d.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [h0.i.f.l[], android.database.Cursor] */
    public static k a(Context context, e eVar, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        Cursor cursor;
        Uri uri;
        boolean z;
        e eVar2 = eVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = eVar2.a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(i0.d.a.a.a.n0("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(eVar2.b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, a);
            List<List<byte[]>> list = eVar2.d;
            if (list == null) {
                list = g0.a.b.b.a.p0(resources, eVar2.e);
            }
            int i = 0;
            while (true) {
                cursor = 0;
                if (i >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i));
                Collections.sort(arrayList2, a);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            z = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z = false;
                if (z) {
                    break;
                }
                i++;
            }
            if (resolveContentProvider == null) {
                return new k(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{InstabugDbContract.FeatureRequestEntry.COLUMN_ID, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar2.c}, (String) null, cancellationSignal);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex(InstabugDbContract.FeatureRequestEntry.COLUMN_ID);
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                        int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        arrayList3.add(new l(uri, i4, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : RequestResponse.HttpStatusCode._4xx.BAD_REQUEST, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i3));
                    }
                }
                return new k(0, (l[]) arrayList3.toArray(new l[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            StringBuilder T0 = i0.d.a.a.a.T0("Found content provider ", str, ", but package was not ");
            T0.append(eVar2.b);
            throw new PackageManager.NameNotFoundException(T0.toString());
        }
    }
}
