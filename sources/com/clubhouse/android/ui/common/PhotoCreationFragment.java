package com.clubhouse.android.ui.common;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.clubhouse.android.core.ui.BaseFragment;
import com.clubhouse.core.ui.R;
import com.theartofdev.edmodo.cropper.CropImage$ActivityResult;
import com.theartofdev.edmodo.cropper.CropImageActivity;
import com.theartofdev.edmodo.cropper.CropImageOptions;
import h0.a.f.b;
import h0.a.f.d.e;
import h0.b.a.d;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.e.b.g3.m.a;
import i0.e.b.g3.m.c;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.n.b.i;
import n0.a.h2.f;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\f0\f0\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00180\u00180\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016RB\u0010\u001d\u001a.\u0012*\u0012(\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00180\u0018 \u0014*\u0014\u0012\u000e\b\u0001\u0012\n \u0014*\u0004\u0018\u00010\u00180\u0018\u0018\u00010\u001b0\u001b0\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0018\u0010 \u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/clubhouse/android/ui/common/PhotoCreationFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Lm0/i;", "N0", "()V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/net/Uri;", "uri", "M0", "(Landroid/net/Uri;)V", "O0", "L0", "()Landroid/net/Uri;", "Lh0/a/f/b;", "kotlin.jvm.PlatformType", "y", "Lh0/a/f/b;", "getCameraImage", "", "Y1", "getGalleryImage", "", "Z1", "askForStoragePermissions", "x", "Landroid/net/Uri;", "cameraImageUri", "contentLayoutId", "<init>", "(I)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: PhotoCreationFragment.kt */
public abstract class PhotoCreationFragment extends BaseFragment {
    public static final /* synthetic */ int q = 0;
    public final b<String> Y1;
    public final b<String[]> Z1;
    public Uri x;
    public final b<Uri> y;

    public PhotoCreationFragment(int i) {
        super(i);
        b<Uri> registerForActivityResult = registerForActivityResult(new e(), new c(this));
        i.d(registerForActivityResult, "registerForActivityResult(ActivityResultContracts.TakePicture()) { success ->\n            if (success) {\n                val contentUri = cameraImageUri\n                if (contentUri == null) {\n                    showNegativeBanner { message(R.string.common_error_try_again) }\n                } else {\n                    requestCrop(contentUri)\n                }\n            }\n        }");
        this.y = registerForActivityResult;
        b<String> registerForActivityResult2 = registerForActivityResult(new h0.a.f.d.b(), new a(this));
        i.d(registerForActivityResult2, "registerForActivityResult(ActivityResultContracts.GetContent()) { uri ->\n            uri?.let { requestCrop(uri) }\n        }");
        this.Y1 = registerForActivityResult2;
        b<String[]> registerForActivityResult3 = registerForActivityResult(new h0.a.f.d.c(), new i0.e.b.g3.m.b(this));
        i.d(registerForActivityResult3, "registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()) { resultsMap ->\n            if (resultsMap.values.all { it == true }) {\n                cameraImageUri = createCameraPhotoUri()\n                getCameraImage.launch(cameraImageUri)\n            }\n        }");
        this.Z1 = registerForActivityResult3;
    }

    public final Uri L0() {
        Uri uri;
        ContentResolver contentResolver = requireContext().getApplicationContext().getContentResolver();
        if (Build.VERSION.SDK_INT >= 29) {
            uri = MediaStore.Images.Media.getContentUri("external_primary");
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("JPEG_");
        P0.append(System.currentTimeMillis());
        P0.append('_');
        String sb = P0.toString();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", sb);
        contentValues.put("mime_type", "image/jpeg");
        return contentResolver.insert(uri, contentValues);
    }

    public abstract void M0(Uri uri);

    public final void N0() {
        PhotoCreationFragment$promptToAddImage$1 photoCreationFragment$promptToAddImage$1 = new PhotoCreationFragment$promptToAddImage$1(this);
        i.e(this, "<this>");
        i.e(photoCreationFragment$promptToAddImage$1, "f");
        d.a aVar = new d.a(requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
        photoCreationFragment$promptToAddImage$1.invoke(aVar);
        aVar.g();
    }

    public final void O0(Uri uri) {
        CropImageOptions cropImageOptions = new CropImageOptions();
        cropImageOptions.e2 = true;
        cropImageOptions.f2 = 1;
        cropImageOptions.g2 = 1;
        cropImageOptions.e2 = true;
        cropImageOptions.a();
        Intent intent = new Intent();
        intent.setClass(requireContext(), CropImageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", uri);
        bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", cropImageOptions);
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
        startActivityForResult(intent, 203);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 203) {
            CropImage$ActivityResult cropImage$ActivityResult = intent != null ? (CropImage$ActivityResult) intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT") : null;
            if (i2 == -1) {
                p viewLifecycleOwner = getViewLifecycleOwner();
                i.d(viewLifecycleOwner, "viewLifecycleOwner");
                m0.r.t.a.r.m.a1.a.E2(new f(((LifecycleCoroutineScopeImpl) q.a(viewLifecycleOwner)).d.plus(m0.c)), (m0.l.e) null, (CoroutineStart) null, new PhotoCreationFragment$onActivityResult$1(this, cropImage$ActivityResult, (m0.l.c<? super PhotoCreationFragment$onActivityResult$1>) null), 3, (Object) null);
            } else if (i2 == 204) {
                v.f2(this, PhotoCreationFragment$onActivityResult$2.c);
                v0.a.a.d.e(cropImage$ActivityResult.q);
            }
        }
    }
}
