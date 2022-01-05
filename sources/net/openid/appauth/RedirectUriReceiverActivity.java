package net.openid.appauth;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class RedirectUriReceiverActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Uri data = getIntent().getData();
        Intent intent = new Intent(this, AuthorizationManagementActivity.class);
        intent.setData(data);
        intent.addFlags(603979776);
        startActivity(intent);
        finish();
    }
}
