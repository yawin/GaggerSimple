package powerzhou.com.testapp;

import android.os.Bundle;


import powerzhou.com.testapp.injector.DaggerUserComponent;
import powerzhou.com.testapp.injector.UserModule;

/**
 * Created by power on 10/3/2017.
 */

public class UserActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initializeInjector();

        presenter.getData();
        presenter2.getData();
    }

    private void initializeInjector(){
        DaggerUserComponent.builder()
                .applicationComponent(getApplicationComponent())
                .userModule(new UserModule(this))
                .activityModule(getActivityModule())
                .build()
                .inject(this)
        ;
    }

}
