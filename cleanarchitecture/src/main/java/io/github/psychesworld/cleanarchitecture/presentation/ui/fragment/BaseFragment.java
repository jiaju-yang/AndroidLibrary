package io.github.psychesworld.cleanarchitecture.presentation.ui.fragment;

import android.app.Fragment;
import android.content.Context;

import javax.inject.Inject;

import io.github.psychesworld.cleanarchitecture.di.HasComponent;
import io.github.psychesworld.cleanarchitecture.di.qualifier.ForActivity;
import io.github.psychesworld.cleanarchitecture.presentation.presenter.BasePresenter;

public abstract class BaseFragment<P extends BasePresenter> extends Fragment {

    @Inject
    P presenter;

    @Inject
    @ForActivity
    Context context;

    @Override
    public void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.pause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.destroy();
    }

    @SuppressWarnings("unchecked")
    protected <C> C getComponent(Class<C> componentType) {
        return componentType.cast(((HasComponent<C>) getActivity()).getComponent());
    }

}
