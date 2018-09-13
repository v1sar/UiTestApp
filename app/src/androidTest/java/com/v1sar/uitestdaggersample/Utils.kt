package com.v1sar.uitestdaggersample

import com.agoda.kakao.KButton
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen

class HelperScreen: Screen<HelperScreen>()

fun KTextView.isVisibleWithWait() {
    var bool = true
            while (bool) {
                try {
                    isVisible()
                    bool = false
                } catch (e: Exception) {
                    Screen<HelperScreen>().idle(200)
                }
            }
}
fun KButton.clickWithWait() {
    var bool = true
            while (bool) {
                try {
                    click()
                    bool = false
                } catch (e: Exception) {
                    Screen<HelperScreen>().idle(200)
                }
            }
}