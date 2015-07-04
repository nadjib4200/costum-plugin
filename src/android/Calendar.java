package org.devgirl.calendar;

import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CallbackContext;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Calendar extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext){

            if (action.equals("addCalendarEntry")) {

              callbackContext.success("OK");
            }

    }
}
