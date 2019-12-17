import { Component } from '@angular/core';
import { Platform } from 'ionic-angular';
import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { HomePage } from '../pages/home/home';

@Component({
  templateUrl: 'app.html'
})
export class MyApp {
  rootPage:any = HomePage;

  constructor(platform: Platform, statusBar: StatusBar, splashScreen: SplashScreen) {
    platform.ready().then(() => {
      // Okay, so the platform is ready and our plugins are available.
      // Here you can do any higher level native things you might need.
      statusBar.styleDefault();
      splashScreen.hide();

      // *** This works **
      // const test = window['cordova']['plugins']['Temperature'];
      // test.isDeviceCompatible((val) => {
      //   console.log("This should be your temperature", val);
      // },
      // (err) => {
      //     console.log('Error' + err);
      // })

      // Testing new custom plugin
      const test = window['cordova']['plugins']['GooglePay'];
      test.callFunctionOne((val) => {
        console.log("You correctly called plugins function one", val);
      },
      (err) => {
          console.log('Error' + err);
      })

    });
  }
}

