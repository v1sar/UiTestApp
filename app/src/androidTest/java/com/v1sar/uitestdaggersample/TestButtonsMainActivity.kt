package com.v1sar.uitestdaggersample

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import com.v1sar.uitestdaggersample.activities.MainActivity
import com.v1sar.uitestdaggersample.pageobjects.MainActivityScreen
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

}