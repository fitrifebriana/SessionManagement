package id.or.codelabs.sessionmanagement;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Created by FitriFebriana on 8/2/2016.
 */
public class SessionManager {


    public void setPreferences(Context context, String key, String value) {

        SharedPreferences.Editor editor = context.getSharedPreferences("prefs", Context.MODE_PRIVATE).edit();
        editor.putString(key, value);
        editor.commit();

    }

    public  String getPreferences(Context context, String key) {

        SharedPreferences prefs = context.getSharedPreferences("prefs",	Context.MODE_PRIVATE);
        String value = prefs.getString(key, "");
        return value;
    }
}
