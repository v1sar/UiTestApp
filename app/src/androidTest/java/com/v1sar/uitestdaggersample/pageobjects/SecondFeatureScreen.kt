package com.v1sar.uitestdaggersample.pageobjects

import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.v1sar.uitestdaggersample.R

class SecondFeatureScreen: Screen<SecondFeatureScreen>() {

    val featureDisclaimer = KTextView { withId(R.id.featureDisclaimer2nd)}
    val dummyNumberText = KTextView { withId(R.id.dummyNumberText2nd)}
    val dummyNumber = KTextView { withId(R.id.dummyNumber2nd)}

}