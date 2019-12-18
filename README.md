# ionic-custom-plugin

Ionic 3 application that implements com-pscu-google-plugin
Code Repo: https://github.com/jefftanz/android-corova-plugin-v1

# Install the cordova plugin
ionic cordova plugin add [PLUGIN_LOCAL_REPO_LOCATION]

Example PLUGIN_LOCAL_REPO_LOCATION: /Users/jeffrey.tansey/repos/playground/ionic/cordova-plugin/google-pay-plugin-v1

In the Ionic 3 application terminal -> ionic cordova plugin add  /Users/jeffrey.tansey/repos/playground/ionic/cordova-plugin/google-pay-plugin-v1

If you make changes to the plugin and want to test the latest code in the Ionic 3 App, you will need to remove the plugin and re-add the plugin

1. ionic cordova plugin remove com-pscu-google-plugin
2. ionic cordova plugin add  /Users/jeffrey.tansey/repos/playground/ionic/cordova-plugin/google-pay-plugin-v1
3. ionic cordova build android
4. ionic cordova run android --device
# ionic-custom-plugin-v1
