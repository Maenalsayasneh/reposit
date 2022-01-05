package com.theartofdev.edmodo.cropper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.theartofdev.edmodo.cropper.CropImageView;
import h0.b.a.a;
import h0.b.a.e;
import i0.j.f.p.h;
import java.io.File;
import java.io.IOException;

public class CropImageActivity extends e implements CropImageView.g, CropImageView.c {
    public CropImageView c;
    public Uri d;
    public CropImageOptions q;

    @SuppressLint({"NewApi"})
    public void onActivityResult(int i, int i2, Intent intent) {
        String action;
        if (i == 200) {
            if (i2 == 0) {
                t0();
            }
            if (i2 == -1) {
                boolean z = true;
                if (!(intent == null || intent.getData() == null || ((action = intent.getAction()) != null && action.equals("android.media.action.IMAGE_CAPTURE")))) {
                    z = false;
                }
                Uri V0 = (z || intent.getData() == null) ? h.V0(this) : intent.getData();
                this.d = V0;
                if (h.w2(this, V0)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.c.setImageUriAsync(this.d);
                }
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        t0();
    }

    @SuppressLint({"NewApi"})
    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onCreate(bundle);
        setContentView(R.layout.crop_image_activity);
        this.c = (CropImageView) findViewById(R.id.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.d = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.q = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.d;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (h.i2(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    h.X3(this);
                }
            } else if (h.w2(this, this.d)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.c.setImageUriAsync(this.d);
            }
        }
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions = this.q;
            if (cropImageOptions == null || (charSequence2 = cropImageOptions.w2) == null || charSequence2.length() <= 0) {
                charSequence = getResources().getString(R.string.crop_image_activity_title);
            } else {
                charSequence = this.q.w2;
            }
            supportActionBar.u(charSequence);
            supportActionBar.p(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.q;
        if (!cropImageOptions.H2) {
            menu.removeItem(R.id.crop_image_menu_rotate_left);
            menu.removeItem(R.id.crop_image_menu_rotate_right);
        } else if (cropImageOptions.J2) {
            menu.findItem(R.id.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.q.I2) {
            menu.removeItem(R.id.crop_image_menu_flip);
        }
        if (this.q.N2 != null) {
            menu.findItem(R.id.crop_image_menu_crop).setTitle(this.q.N2);
        }
        Drawable drawable = null;
        try {
            int i = this.q.O2;
            if (i != 0) {
                drawable = h0.i.b.a.getDrawable(this, i);
                menu.findItem(R.id.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception e) {
            Log.w("AIC", "Failed to read menu crop drawable", e);
        }
        int i2 = this.q.x2;
        if (i2 != 0) {
            u0(menu, R.id.crop_image_menu_rotate_left, i2);
            u0(menu, R.id.crop_image_menu_rotate_right, this.q.x2);
            u0(menu, R.id.crop_image_menu_flip, this.q.x2);
            if (drawable != null) {
                u0(menu, R.id.crop_image_menu_crop, this.q.x2);
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.crop_image_menu_crop) {
            CropImageOptions cropImageOptions = this.q;
            if (cropImageOptions.E2) {
                q0((Uri) null, (Exception) null, 1);
            } else {
                Uri uri = cropImageOptions.y2;
                if (uri == null || uri.equals(Uri.EMPTY)) {
                    try {
                        Bitmap.CompressFormat compressFormat = this.q.z2;
                        uri = Uri.fromFile(File.createTempFile("cropped", compressFormat == Bitmap.CompressFormat.JPEG ? ".jpg" : compressFormat == Bitmap.CompressFormat.PNG ? ".png" : ".webp", getCacheDir()));
                    } catch (IOException e) {
                        throw new RuntimeException("Failed to create temp file for output image", e);
                    }
                }
                Uri uri2 = uri;
                CropImageView cropImageView = this.c;
                CropImageOptions cropImageOptions2 = this.q;
                Bitmap.CompressFormat compressFormat2 = cropImageOptions2.z2;
                int i = cropImageOptions2.A2;
                int i2 = cropImageOptions2.B2;
                int i3 = cropImageOptions2.C2;
                CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions2.D2;
                if (cropImageView.u2 != null) {
                    cropImageView.i(i2, i3, requestSizeOptions, uri2, compressFormat2, i);
                } else {
                    throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
                }
            }
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_rotate_left) {
            this.c.e(-this.q.K2);
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_rotate_right) {
            this.c.e(this.q.K2);
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_flip_horizontally) {
            CropImageView cropImageView2 = this.c;
            cropImageView2.f2 = !cropImageView2.f2;
            cropImageView2.a((float) cropImageView2.getWidth(), (float) cropImageView2.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() == R.id.crop_image_menu_flip_vertically) {
            CropImageView cropImageView3 = this.c;
            cropImageView3.g2 = !cropImageView3.g2;
            cropImageView3.a((float) cropImageView3.getWidth(), (float) cropImageView3.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            t0();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 201) {
            Uri uri = this.d;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, R.string.crop_image_activity_no_permissions, 1).show();
                t0();
            } else {
                this.c.setImageUriAsync(uri);
            }
        }
        if (i == 2011) {
            h.X3(this);
        }
    }

    public void onStart() {
        super.onStart();
        this.c.setOnSetImageUriCompleteListener(this);
        this.c.setOnCropImageCompleteListener(this);
    }

    public void onStop() {
        super.onStop();
        this.c.setOnSetImageUriCompleteListener((CropImageView.g) null);
        this.c.setOnCropImageCompleteListener((CropImageView.c) null);
    }

    public void q0(Uri uri, Exception exc, int i) {
        int i2 = exc == null ? -1 : 204;
        CropImage$ActivityResult cropImage$ActivityResult = new CropImage$ActivityResult(this.c.getImageUri(), uri, exc, this.c.getCropPoints(), this.c.getCropRect(), this.c.getRotatedDegrees(), this.c.getWholeImageRect(), i);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cropImage$ActivityResult);
        setResult(i2, intent);
        finish();
    }

    public void t0() {
        setResult(0);
        finish();
    }

    public final void u0(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (Exception e) {
                Log.w("AIC", "Failed to update menu item color", e);
            }
        }
    }
}
