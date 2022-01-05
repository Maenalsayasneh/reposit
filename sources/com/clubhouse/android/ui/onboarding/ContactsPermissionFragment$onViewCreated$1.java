package com.clubhouse.android.ui.onboarding;

import com.afollestad.assent.AssentResult;
import com.afollestad.assent.Permission;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.repos.OnboardingRepo;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ContactsPermissionFragment.kt */
public final class ContactsPermissionFragment$onViewCreated$1 extends Lambda implements l<AssentResult, i> {
    public final /* synthetic */ ContactsPermissionFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactsPermissionFragment$onViewCreated$1(ContactsPermissionFragment contactsPermissionFragment) {
        super(1);
        this.c = contactsPermissionFragment;
    }

    public Object invoke(Object obj) {
        AssentResult assentResult = (AssentResult) obj;
        m0.n.b.i.e(assentResult, "it");
        if (assentResult.b().contains(Permission.READ_CONTACTS)) {
            ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-Permissions-Contacts-Granted");
            ContactsPermissionFragment contactsPermissionFragment = this.c;
            OnboardingRepo onboardingRepo = contactsPermissionFragment.Z1;
            if (onboardingRepo != null) {
                v.b1(contactsPermissionFragment, onboardingRepo.h(SourceLocation.UNKNOWN));
            } else {
                m0.n.b.i.m("onboardingRepo");
                throw null;
            }
        } else {
            ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-Permissions-Contacts-Rejected");
            ContactsPermissionFragment contactsPermissionFragment2 = this.c;
            OnboardingRepo onboardingRepo2 = contactsPermissionFragment2.Z1;
            if (onboardingRepo2 != null) {
                v.b1(contactsPermissionFragment2, onboardingRepo2.h(SourceLocation.ONBOARDING_FRIENDS));
            } else {
                m0.n.b.i.m("onboardingRepo");
                throw null;
            }
        }
        ((AmplitudeAnalytics) v.l(this.c)).a("Onboarding-Permissions-Contacts-Done");
        return i.a;
    }
}
