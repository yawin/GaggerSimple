package powerzhou.com.testapp;

import android.app.Application;

import powerzhou.com.testapp.injector.ApplicationComponent;
import powerzhou.com.testapp.injector.ApplicationModule;
import powerzhou.com.testapp.injector.DaggerApplicationComponent;

/**
 * Created by power on 10/3/2017.
 */

public class AndroidApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this,new Utils())).build();
        applicationComponent.inject(this);
//        getUtils().println();

    }

    public ApplicationComponent getApplicationComponent(){
        return this.applicationComponent;
    }

//    public Utils getUtils(){
//        return this.applicationComponent.getUtils();
//    }
}
