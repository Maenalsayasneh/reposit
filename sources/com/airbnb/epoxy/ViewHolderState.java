package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.airbnb.viewmodeladapter.R;
import h0.f.e;
import i0.b.a.g;
import i0.b.a.t;
import i0.b.a.w;
import java.util.Objects;

public class ViewHolderState extends e<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new a();

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new a();

        public ViewState() {
        }

        public void c(View view) {
            int id = view.getId();
            if (view.getId() == -1) {
                view.setId(R.id.view_model_state_saving_id);
            }
            view.restoreHierarchyState(this);
            view.setId(id);
        }

        public void d(View view) {
            int id = view.getId();
            if (view.getId() == -1) {
                view.setId(R.id.view_model_state_saving_id);
            }
            view.saveHierarchyState(this);
            view.setId(id);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = keyAt(i2);
                parcelableArr[i2] = (Parcelable) valueAt(i2);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public ViewState(int i, int[] iArr, Parcelable[] parcelableArr, a aVar) {
            super(i);
            for (int i2 = 0; i2 < i; i2++) {
                put(iArr[i2], parcelableArr[i2]);
            }
        }

        public class a implements Parcelable.ClassLoaderCreator<ViewState> {
            public Object createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray((ClassLoader) null), (a) null);
            }

            public Object[] newArray(int i) {
                return new ViewState[i];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader), (a) null);
            }
        }
    }

    public class a implements Parcelable.Creator<ViewHolderState> {
        public Object createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt, (a) null);
            for (int i = 0; i < readInt; i++) {
                viewHolderState.o(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }

        public Object[] newArray(int i) {
            return new ViewHolderState[i];
        }
    }

    public ViewHolderState() {
    }

    public int describeContents() {
        return 0;
    }

    public void t(w wVar) {
        wVar.a();
        t tVar = wVar.a;
        Objects.requireNonNull(tVar);
        if (tVar instanceof g) {
            ViewState viewState = (ViewState) h(wVar.getItemId());
            if (viewState == null) {
                viewState = new ViewState();
            }
            viewState.d(wVar.itemView);
            o(wVar.getItemId(), viewState);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int r = r();
        parcel.writeInt(r);
        for (int i2 = 0; i2 < r; i2++) {
            parcel.writeLong(m(i2));
            parcel.writeParcelable((Parcelable) s(i2), 0);
        }
    }

    public ViewHolderState(int i, a aVar) {
        super(i);
    }
}
