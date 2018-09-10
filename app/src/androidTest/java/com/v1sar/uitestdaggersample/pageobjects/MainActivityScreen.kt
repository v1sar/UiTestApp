package com.v1sar.uitestdaggersample.pageobjects

import com.agoda.kakao.KButton
import com.agoda.kakao.Screen
import com.v1sar.uitestdaggersample.R

class MainActivityScreen: Screen<MainActivityScreen>() {

    val toFirstFeatureButton = KButton { withId(R.id.toFirstFeature)}
    val toSecondFeatureButton = KButton { withId(R.id.toSecondFeature)}
    val toThirdFeatureButton = KButton { withId(R.id.toThirdFeature)}

}