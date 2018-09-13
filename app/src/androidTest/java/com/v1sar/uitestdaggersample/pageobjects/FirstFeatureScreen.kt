package com.v1sar.uitestdaggersample.pageobjects

import com.agoda.kakao.KButton
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.v1sar.uitestdaggersample.R

class FirstFeatureScreen: Screen<FirstFeatureScreen>() {

    val featureDisclaimer = KTextView { withId(R.id.featureDisclaimer)}
    val dummyNumberText = KTextView { withId(R.id.dummyNumberText)}
    val dummyNumber = KTextView { withId(R.id.dummyNumber)}
    val dummyNumberButton = KButton { withId(R.id.dummyNumberIncreaser)}

}