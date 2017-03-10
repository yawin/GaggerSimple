package powerzhou.com.testapp;

import android.util.Log;

/**
 * Created by power on 10/3/2017.
 */

public class UserPresentor implements IPresentor {

    Utils utils;
    public UserPresentor(){
    }
    public UserPresentor(Utils utils){
        this.utils = utils;
    }

    @Override
    public void getData() {
        if(utils != null) {
            utils.println();
        }
        Log.d("Powerzhou","UserPresentor getData,");
    }
}
