package com.clubhouse.android.ui.selection;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashSet;
import java.util.Set;
import m0.n.b.i;

/* compiled from: SelectionFragment.kt */
public final class SelectionArgs implements Parcelable {
    public static final Parcelable.Creator<SelectionArgs> CREATOR = new a();
    public final String c;
    public final Set<Selection> d;
    public final Selection q;
    public final String x;
    public final String y;

    /* compiled from: SelectionFragment.kt */
    public static final class a implements Parcelable.Creator<SelectionArgs> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashSet.add(parcel.readParcelable(SelectionArgs.class.getClassLoader()));
            }
            return new SelectionArgs(readString, linkedHashSet, (Selection) parcel.readParcelable(SelectionArgs.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        public Object[] newArray(int i) {
            return new SelectionArgs[i];
        }
    }

    public SelectionArgs(String str, Set<? extends Selection> set, Selection selection, String str2, String str3) {
        i.e(set, "items");
        i.e(selection, "preselectedItem");
        this.c = str;
        this.d = set;
        this.q = selection;
        this.x = str2;
        this.y = str3;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionArgs)) {
            return false;
        }
        SelectionArgs selectionArgs = (SelectionArgs) obj;
        return i.a(this.c, selectionArgs.c) && i.a(this.d, selectionArgs.d) && i.a(this.q, selectionArgs.q) && i.a(this.x, selectionArgs.x) && i.a(this.y, selectionArgs.y);
    }

    public int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = (this.q.hashCode() + i0.d.a.a.a.I(this.d, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        String str2 = this.x;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.y;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SelectionArgs(title=");
        P0.append(this.c);
        P0.append(", items=");
        P0.append(this.d);
        P0.append(", preselectedItem=");
        P0.append(this.q);
        P0.append(", header=");
        P0.append(this.x);
        P0.append(", footer=");
        return i0.d.a.a.a.w0(P0, this.y, ')');
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        parcel.writeString(this.c);
        Set<Selection> set = this.d;
        parcel.writeInt(set.size());
        for (Selection writeParcelable : set) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.q, i);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SelectionArgs(java.lang.String r8, java.util.Set r9, com.clubhouse.android.ui.selection.Selection r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r7 = this;
            r11 = r13 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r2 = r0
            goto L_0x0008
        L_0x0007:
            r2 = r8
        L_0x0008:
            r8 = r13 & 8
            r5 = 0
            r8 = r13 & 16
            if (r8 == 0) goto L_0x0011
            r6 = r0
            goto L_0x0012
        L_0x0011:
            r6 = r12
        L_0x0012:
            r1 = r7
            r3 = r9
            r4 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.selection.SelectionArgs.<init>(java.lang.String, java.util.Set, com.clubhouse.android.ui.selection.Selection, java.lang.String, java.lang.String, int):void");
    }
}
