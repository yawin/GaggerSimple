package powerzhou.com.testapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import javax.inject.Inject;

import powerzhou.com.testapp.injector.ActivityModule;
import powerzhou.com.testapp.injector.ApplicationComponent;
import powerzhou.com.testapp.injector.annotion.Type;

/**
 * Created by power on 10/3/2017.
 */

public abstract class BaseActivity<T extends IPresentor> extends FragmentActivity {

    @Type(value = "1")
    @Inject
    protected T presenter;

    @Type(value = "2")
    @Inject
    protected T presenter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    protected ApplicationComponent getApplicationComponent(){
        return ((AndroidApplication)getApplication()).getApplicationComponent();
    }

    protected ActivityModule getActivityModule(){
        return new ActivityModule(this);
    }


}
