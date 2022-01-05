package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import h0.i.i.q;
import i0.h.a.c.q.a;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] q = {16842912};
    public boolean Y1 = true;
    public boolean x;
    public boolean y = true;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean q;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeInt(this.q ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = parcel.readInt() != 1 ? false : true;
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.imageButtonStyle);
        q.p(this, new a(this));
    }

    public boolean isChecked() {
        return this.x;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.x) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = q;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setChecked(savedState.q);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.q = this.x;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.y != z) {
            this.y = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.y && this.x != z) {
            this.x = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.Y1 = z;
    }

    public void setPressed(boolean z) {
        if (this.Y1) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.x);
    }
}
