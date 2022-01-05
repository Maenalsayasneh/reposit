package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.exceptions.InvalidInputException;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;

public abstract class BaseCustomization implements Customization, Parcelable {
    private String mTextColor;
    private String mTextFontName;
    private int mTextFontSize;

    public BaseCustomization() {
    }

    public String getTextColor() {
        return this.mTextColor;
    }

    public String getTextFontName() {
        return this.mTextFontName;
    }

    public int getTextFontSize() {
        return this.mTextFontSize;
    }

    public void setTextColor(String str) throws InvalidInputException {
        this.mTextColor = CustomizeUtils.requireValidColor(str);
    }

    public void setTextFontName(String str) throws InvalidInputException {
        this.mTextFontName = CustomizeUtils.requireValidString(str);
    }

    public void setTextFontSize(int i) throws InvalidInputException {
        this.mTextFontSize = CustomizeUtils.requireValidFontSize(i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mTextFontName);
        parcel.writeString(this.mTextColor);
        parcel.writeInt(this.mTextFontSize);
    }

    public BaseCustomization(Parcel parcel) {
        this.mTextFontName = parcel.readString();
        this.mTextColor = parcel.readString();
        this.mTextFontSize = parcel.readInt();
    }
}
