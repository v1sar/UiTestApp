package com.v1sar.uitestdaggersample.pageobjects

import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.v1sar.uitestdaggersample.R

class ThirdFeatureScreen: Screen<ThirdFeatureScreen>()  {

    val thirdFeatureTextView = KTextView { withId(R.id.textView3)}

}