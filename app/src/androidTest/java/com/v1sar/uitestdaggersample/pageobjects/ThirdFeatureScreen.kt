package com.v1sar.uitestdaggersample.pageobjects

import com.agoda.kakao.KButton
import com.agoda.kakao.KProgressBar
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.v1sar.uitestdaggersample.R

class ThirdFeatureScreen: Screen<ThirdFeatureScreen>()  {

    val featureDisclaimer = KTextView { withId(R.id.featureDisclaimer3rd)}
    val progressBar = KProgressBar { withId(R.id.progressBar2)}
    val resetFrwButton = KButton { withId(R.id.resetFrwState)}
    val resetInitializationButton = KButton { withId(R.id.resetInitializationState)}

}