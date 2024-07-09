package com.example.test_flutter_app

import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import io.flutter.embedding.android.FlutterActivity

class MWABottomSheetActivity : FlutterActivity() {
    override fun getDartEntrypointFunctionName(): String {
        return "bottomsheet"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(R.anim.slide_in_from_bottom, R.anim.slide_out_to_bottom)

        val windowLayoutParams = window.attributes
        windowLayoutParams.gravity = Gravity.BOTTOM
        window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
        window.attributes = windowLayoutParams
        window.decorView.setBackgroundColor(android.graphics.Color.TRANSPARENT)
        window.setBackgroundDrawableResource(android.R.color.transparent)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_in_from_bottom, R.anim.slide_out_to_bottom)
    }
}
