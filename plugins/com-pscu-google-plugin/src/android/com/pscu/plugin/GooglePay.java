package com.pscu.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
import android.content.Context;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import com.google.android.gms.wallet.WalletConstants;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.TapAndPayStatusCodes;

public class GooglePay extends CordovaPlugin {

  private WalletConstants walletConstrants ;
  private TapAndPayClient tapAndPayClient;
  private TapAndPayStatusCodes tapAndPayStatusCodes;

  // public void initialize(CordovaInterface cordova, CordovaWebView webView) {
  //   super.initialize(cordova, webView);
  // }

  @Override
  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    // your init code here
  }


  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
      if (action.equals("callFunctionOne")) {

        // print("Status test: " + tapAndPayStatusCodes.TAP_AND_PAY_NO_ACTIVE_WALLET);

        // String message = args.getString(0);
        String message = String.valueOf(tapAndPayStatusCodes.TAP_AND_PAY_NO_ACTIVE_WALLET);

        this.functionOne(message, callbackContext);
        return true;
      }
      return false;
  }


  private void functionOne(String message, CallbackContext callbackContext) {
    if (message != null && message.length() > 0) {
        callbackContext.success(message);
    } else {
        callbackContext.error("Expected one non-empty string argument.");
    }
  }


  // public void functionOne() {
  //   String msg = "Function One";
  //   Toast.makeText(cordova.getActivity(), msg, Toast.LENGTH_LONG).show();
  // }

  // public void functionTwo(){
  //   String msg = "Function Two";
  //   Toast.makeText(cordova.getActivity(), msg, Toast.LENGTH_LONG).show();
  // }


}
