package com.turbosplash

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = TurboSplashModule.NAME)
class TurboSplashModule(reactContext: ReactApplicationContext) :
  NativeTurboSplashSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  companion object {
    const val NAME = "TurboSplash"
  }
}
