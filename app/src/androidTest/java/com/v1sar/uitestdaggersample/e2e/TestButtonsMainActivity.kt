package com.v1sar.uitestdaggersample.e2e

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.util.Log
import com.v1sar.uitestdaggersample.activities.MainActivity
import com.v1sar.uitestdaggersample.isVisibleWithWait
import com.v1sar.uitestdaggersample.pageobjects.*
import org.junit.FixMethodOrder
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(AndroidJUnit4::class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class TestButtonsMainActivity {

    private val TAG = TestButtonsMainActivity::class.java.simpleName

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java)

    private val mMainScreen = MainActivityScreen()
    private val mFirstFeatureScreen = FirstFeatureScreen()
    private val mSecondFeatureScreen = SecondFeatureScreen()
    private val mThirdFeatureScreen = ThirdFeatureScreen()
    private val mThirdFeatureFrwScreen = ThirdFeatureFrwScreen()

    @Test
    fun testFirstFeature() {
        Log.w(TAG, "testFirstFeature")
        mMainScreen {
            toFirstFeatureButton {
                isVisible()
                click()
            }
        }
        mFirstFeatureScreen {
            dummyNumber {
                hasAnyText()
            }
            dummyNumberButton {
                click()
                click()
                click()
                click()
                click()
            }
        }
    }

    @Test
    fun testSecondFeature() {
        Log.w(TAG, "testSecondFeature")
        mMainScreen {
            toSecondFeatureButton {
                isVisible()
                click()
            }
        }
        mSecondFeatureScreen {
            dummyNumber {
                hasAnyText()
            }
        }
    }

    @Test
    fun testThirdFeature() {
        Log.w(TAG, "testThirdFeature")
        mMainScreen {
            toThirdFeatureButton {
                isVisible()
                click()
            }
        }
        mThirdFeatureFrwScreen {
            proceedButton {
                click()
            }
        }
        mThirdFeatureScreen {
            featureDisclaimer {
                isVisibleWithWait()
            }
        }
    }

}