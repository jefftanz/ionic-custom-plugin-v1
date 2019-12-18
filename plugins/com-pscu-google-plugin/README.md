
# Cordova Plugin Example
An ionic cordova android plugin example. Testing Dependencies.


# Requirements
An Ionic 3 application https://ionicframework.com/docs/v3/intro/installation/


# Compatibility
Android ONLY


# Installation
ionic cordova plugin add [PLUGIN_LOCAL_REPO_LOCATION]

Example PLUGIN_LOCAL_REPO_LOCATION: /Users/jeffrey.tansey/repos/playground/ionic/cordova-plugin/google-pay-plugin

In the Ionic 3 application terminal -> ionic cordova plugin add  /Users/jeffrey.tansey/repos/playground/ionic/cordova-plugin/google-pay-plugin

If you make changes to the plugin and want to test the latest code in the Ionic 3 App, you will need to remove the plugin and re-add the plugin

1. ionic cordova plugin remove com-pscu-google-plugin
2. ionic cordova plugin add  /Users/jeffrey.tansey/repos/playground/ionic/cordova-plugin/google-pay-plugin
3. ionic cordova build android
4. ionic cordova run android --device


# Usage

  // app.component.ts

  const googlePay = window['cordova']['plugins']['GooglePay'];
  googlePay.callFunctionOne((val) => {
    console.log("You correctly called plugins function one", val);
  },
  (err) => {
      console.log('Error' + err);
  })

# android-corova-plugin-v1
