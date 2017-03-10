package powerzhou.com.testapp.injector;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;
import powerzhou.com.testapp.IPresentor;
import powerzhou.com.testapp.UserPresentor;
import powerzhou.com.testapp.Utils;
import powerzhou.com.testapp.injector.annotion.PerActivity;
import powerzhou.com.testapp.injector.annotion.Type;

/**
 * Created by power on 10/3/2017.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity){
        this.activity = activity;
    }
    @Provides
    @PerActivity
    public Activity activity(){
        return this.activity;
    }

    @Type(value = "2")
    @PerActivity
    @Provides
    public IPresentor getProvidePersentor(Utils utils,Context mContext){
        Log.d("Powerzhou","mContext is "+mContext);
        return new UserPresentor(utils);
    }
    @Type(value = "1")
    @PerActivity
    @Provides
    public IPresentor getProvidePersentorNoUtils(Context mContext){
        Log.d("Powerzhou","mContext is "+mContext);
        return new UserPresentor();
    }
}
