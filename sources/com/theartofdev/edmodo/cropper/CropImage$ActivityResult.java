package com.theartofdev.edmodo.cropper;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.theartofdev.edmodo.cropper.CropImageView;

public final class CropImage$ActivityResult extends CropImageView.b implements Parcelable {
    public static final Parcelable.Creator<CropImage$ActivityResult> CREATOR = new a();

    public static class a implements Parcelable.Creator<CropImage$ActivityResult> {
        public Object createFromParcel(Parcel parcel) {
            return new CropImage$ActivityResult(parcel);
        }

        public Object[] newArray(int i) {
            return new CropImage$ActivityResult[i];
        }
    }

    public CropImage$ActivityResult(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
        super((Bitmap) null, uri, (Bitmap) null, uri2, exc, fArr, rect, rect2, i, i2);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeSerializable(this.q);
        parcel.writeFloatArray(this.x);
        parcel.writeParcelable(this.y, i);
        parcel.writeParcelable(this.Y1, i);
        parcel.writeInt(this.Z1);
        parcel.writeInt(this.a2);
    }

    public CropImage$ActivityResult(Parcel parcel) {
        super((Bitmap) null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Bitmap) null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
