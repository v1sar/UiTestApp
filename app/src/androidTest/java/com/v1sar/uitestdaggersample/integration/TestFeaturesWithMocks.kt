package com.v1sar.uitestdaggersample.integration

import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.v1sar.uitestdaggersample.UiTestApplication.getApp
import com.v1sar.uitestdaggersample.activities.MainActivity
import com.v1sar.uitestdaggersample.activities.ThirdFeature
import com.v1sar.uitestdaggersample.inject.DummyFrw
import com.v1sar.uitestdaggersample.integration.di.DaggerFakeComponent
import com.v1sar.uitestdaggersample.integration.di.FakeComponent
import com.v1sar.uitestdaggersample.integration.di.FakeMainModule
import com.v1sar.uitestdaggersample.pageobjects.FirstFeatureScreen
import com.v1sar.uitestdaggersample.pageobjects.MainActivityScreen
import com.v1sar.uitestdaggersample.pageobjects.ThirdFeatureFrwScreen
import com.v1sar.uitestdaggersample.pageobjects.ThirdFeatureScreen
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject


@RunWith(AndroidJUnit4::class)
class TestFeaturesWithMocks {

    private val TAG = TestFeaturesWithMocks::class.java.simpleName

    @Rule
    @JvmField
    val rule = ActivityTestRule(MainActivity::class.java, false, false)

    @Rule
    @JvmField
    val ruleThirdFeature = ActivityTestRule(ThirdFeature::class.java, false, false)

    val mMainActivityScreen = MainActivityScreen()
    val mFirstFeatureScreen = FirstFeatureScreen()
    val mThirdFeatureScreen = ThirdFeatureScreen()
    val mThirdFeatureFrwScreen = ThirdFeatureFrwScreen()

    lateinit var mComponent: FakeComponent

    @Inject
    lateinit var mFakeDummyFrw: DummyFrw

    @Before
    fun init() {
        mComponent = DaggerFakeComponent.builder()
                .fakeMainModule(FakeMainModule(getApp())).build()
        getApp().mainComponent = mComponent
        mComponent.inject(this)
    }

    @Test
    fun testThirdFeatureWithFakeInitializationDone() {
        rule.launchActivity(null)
        mMainActivityScreen {
            toThirdFeatureButton {
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
                isVisible()
            }
        }
    }

    @Test
    fun testThirdFeatureWithFrwDone() {
        rule.launchActivity(null)

        mFakeDummyFrw.isFrwFinished = true

        mMainActivityScreen {
            toThirdFeatureButton {
                click()
            }
        }
        mThirdFeatureScreen {
            featureDisclaimer {
                isVisible()
            }
        }
    }

    @Test
    fun testThirdFeatureWithFrwDoneWithoutMainActivity() {
        mFakeDummyFrw.isFrwFinished = true

        ruleThirdFeature.launchActivity(null)

        mThirdFeatureScreen {
            featureDisclaimer {
                isVisible()
                idle()
            }
        }
    }

    @Test
    fun testFirstFeatureWithMocks() {
        rule.launchActivity(null)

        mMainActivityScreen {
            toFirstFeatureButton {
                click()
            }
        }
        mFirstFeatureScreen {
            dummyNumberButton {
                click()
                click()
                click()
                click()
                click()
            }
        }
    }


}