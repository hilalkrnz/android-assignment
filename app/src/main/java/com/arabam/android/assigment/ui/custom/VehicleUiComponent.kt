package com.arabam.android.assigment.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.arabam.android.assigment.databinding.LayoutVehicleBinding
import com.arabam.android.assigment.domain.model.ArabamUiData

class VehicleUiComponent @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr) {

    private val binding = LayoutVehicleBinding.inflate(LayoutInflater.from(context), this, false)

    init {
        addView(binding.root)
    }

    fun setVehicleData(arabamUiData: ArabamUiData) {
        binding.year.text = arabamUiData.year.toString()
        binding.city.text = arabamUiData.city.toString()
        binding.model.text = arabamUiData.model
        binding.price.text = arabamUiData.price

    }
}

