package com.instabug.library.util;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

public class BitmapWorkerTask extends AsyncTask<String, Void, Bitmap> {
    public int fallbackResourceDrawable;
    private final WeakReference<ImageView> imageViewReference;
    private OnImageLoadedListener onImageLoadedListener;
    private boolean resize;
    private float targetHeight;
    private float targetWidth;

    public interface OnImageLoadedListener {
        void onImageLoaded();
    }

    public BitmapWorkerTask(ImageView imageView) {
        this.imageViewReference = new WeakReference<>(imageView);
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public Bitmap doInBackground(String... strArr) {
        try {
            Bitmap decodeSampledBitmapFromLocalPath = BitmapUtils.decodeSampledBitmapFromLocalPath(strArr[0]);
            return this.resize ? BitmapUtils.resizeBitmap(decodeSampledBitmapFromLocalPath, this.targetWidth, this.targetHeight) : decodeSampledBitmapFromLocalPath;
        } catch (Exception | OutOfMemoryError e) {
            InstabugSDKLogger.e(this, "Something went wrong while loading bitmap", e);
            return null;
        }
    }

    public void onPostExecute(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.imageViewReference.get();
        if (bitmap != null) {
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                OnImageLoadedListener onImageLoadedListener2 = this.onImageLoadedListener;
                if (onImageLoadedListener2 != null) {
                    onImageLoadedListener2.onImageLoaded();
                }
            }
        } else if (imageView != null) {
            try {
                imageView.setImageResource(this.fallbackResourceDrawable);
            } catch (Exception e) {
                InstabugSDKLogger.e(this, "Something went wrong while loading image resource", e);
            }
        }
    }

    public BitmapWorkerTask(ImageView imageView, int i) {
        this.imageViewReference = new WeakReference<>(imageView);
        this.fallbackResourceDrawable = i;
    }

    public BitmapWorkerTask(ImageView imageView, float f, float f2) {
        this(imageView);
        this.targetWidth = f;
        this.targetHeight = f2;
        this.resize = true;
    }

    public BitmapWorkerTask(ImageView imageView, OnImageLoadedListener onImageLoadedListener2) {
        this(imageView);
        this.onImageLoadedListener = onImageLoadedListener2;
    }

    public BitmapWorkerTask(ImageView imageView, float f, float f2, OnImageLoadedListener onImageLoadedListener2) {
        this(imageView, f, f2);
        this.onImageLoadedListener = onImageLoadedListener2;
    }
}
