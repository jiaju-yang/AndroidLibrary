package io.github.psychesworld.library.presentation.ui;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import io.github.psychesworld.cleanarchitecture.di.module.ActivityModule;
import io.github.psychesworld.library.di.component.ApplicationComponent;
import io.github.psychesworld.library.presentation.AndroidApplication;

public abstract class BaseActivity extends AppCompatActivity {

    protected void addFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.add(containerViewId, fragment);
        fragmentTransaction.commit();
    }

    protected void replaceFragment(int containerViewId, Fragment fragment) {
        FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.replace(containerViewId, fragment);
        fragmentTransaction.commit();
    }

    protected ApplicationComponent getApplicationComponent() {
        return AndroidApplication.get(this).getApplicationComponent();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

}
