package io.github.psychesworld.cleanarchitecture.presentation.presenter;

import android.support.annotation.NonNull;

import io.github.psychesworld.cleanarchitecture.presentation.ui.vu.BaseVu;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BasePresenter<V extends BaseVu> {
    private final CompositeSubscription subscriptions;
    protected V vu;

    public BasePresenter() {
        this.subscriptions = new CompositeSubscription();
    }

    public void setVu(@NonNull V vu) {
        this.vu = vu;
    }

    public void add(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public void remove(final Subscription subscription) {
        subscriptions.remove(subscription);
    }

    public void clear() {
        subscriptions.clear();
    }

    public void resume() {
    }

    public void pause() {
    }

    public void destroy() {
        clear();
        vu = null;
    }
}
