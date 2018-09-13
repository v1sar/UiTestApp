package com.v1sar.uitestdaggersample.pageobjects

import com.agoda.kakao.KButton
import com.agoda.kakao.KProgressBar
import com.agoda.kakao.Screen
import com.v1sar.uitestdaggersample.R

class ThirdFeatureFrwScreen: Screen<ThirdFeatureFrwScreen>() {

    val proceedButton = KButton { withId(R.id.goToThirdFeatureButton)}
    val progressBar = KProgressBar { withId(R.id.progressBar)}

}