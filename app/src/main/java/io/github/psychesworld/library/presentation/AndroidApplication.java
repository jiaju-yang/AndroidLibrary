package io.github.psychesworld.library.presentation;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.RefWatcher;

import io.github.psychesworld.library.di.component.ApplicationComponent;
import io.github.psychesworld.library.di.component.DaggerApplicationComponent;
import io.github.psychesworld.library.di.module.ApplicationModule;

public abstract class AndroidApplication extends Application {

    public static AndroidApplication get(Context context) {
        return (AndroidApplication) context.getApplicationContext();
    }

    private ApplicationComponent applicationComponent;
    private RefWatcher refWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
        initializeLeakDetection();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    protected abstract RefWatcher initializeRefWatcher();

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    private void initializeLeakDetection() {
        refWatcher = initializeRefWatcher();
    }
}

