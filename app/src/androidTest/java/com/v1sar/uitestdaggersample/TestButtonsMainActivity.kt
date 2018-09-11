package com.v1sar.uitestdaggersample

import android.support.test.espresso.ViewInteraction
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import com.agoda.kakao.KButton
import com.agoda.kakao.KTextView
import com.agoda.kakao.Screen
import com.agoda.kakao.ScreenActions
import com.v1sar.uitestdaggersample.activities.MainActivity
import com.v1sar.uitestdaggersample.pageobjects.HelperScreen
import com.v1sar.uitestdaggersample.pageobjects.MainActivityScreen
import com.v1sar.uitestdaggersample.pageobjects.ThirdFeatureScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestButtonsMainActivity {

    private val TAG = TestButtonsMainActivity::class.java.simpleName

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    private val mMainScreen = MainActivityScreen()
    private val mThirdFeatureScreen = ThirdFeatureScreen()

    @Test
    fun shouldSeeButtonFirstFeature() {
        Log.w(TAG, "Test shouldSeeButtonFirstFeature")
        mMainScreen {
            toFirstFeatureButton {
                isVisible()
                click()
            }
        }
    }

    @Test
    fun shouldSeeButtonSecondFeature() {
        Log.w(TAG, "Test shouldSeeButtonSecondFeature")
        mMainScreen {
            toSecondFeatureButton {
                isVisible()
                click()
            }
        }
    }

    @Test
    fun shouldSeeButtonThirdFeature() {
        mMainScreen {
            toThirdFeatureButton {
                click()
            }
        }
        mThirdFeatureScreen {
            thirdFeatureTextView {
                isVisibleWithWait()
            }
        }
    }

    fun KTextView.isVisibleWithWait() {
        var bool = true
        while (bool) {
            try {
                isVisible()
                bool = false
            } catch (e: Exception) {
                // pass
            }
            Screen<HelperScreen>().idle()
        }
    }

}