package com.example.test_flutter_app

import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.android.FlutterActivityLaunchConfigs.BackgroundMode

class MWABottomSheetActivity : FlutterActivity() {
    override fun getDartEntrypointFunctionName(): String {
        return "bottomsheet"
    }

    override fun getBackgroundMode(): BackgroundMode {
        return BackgroundMode.transparent
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setDecorFitsSystemWindows(false)

        overridePendingTransition(R.anim.slide_in_from_bottom, R.anim.slide_out_to_bottom)

        val windowLayoutParams = window.attributes
        windowLayoutParams.gravity = Gravity.BOTTOM
        windowLayoutParams.flags =
                windowLayoutParams.flags and WindowManager.LayoutParams.FLAG_DIM_BEHIND
        window.attributes = windowLayoutParams
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_from_bottom, R.anim.slide_out_to_bottom)
    }
}
