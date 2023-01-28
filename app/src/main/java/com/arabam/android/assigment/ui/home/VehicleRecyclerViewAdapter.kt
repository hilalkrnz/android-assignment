package com.arabam.android.assigment.ui.home

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.arabam.android.assigment.databinding.AdapterVehicleItemBinding
import com.arabam.android.assigment.domain.model.ArabamUiData
import com.arabam.android.assigment.utility.inflateAdapterItem

class VehicleRecyclerViewAdapter : PagingDataAdapter<ArabamUiData, VehicleRecyclerViewAdapter.VehicleViewHolder>(Diff) {


    override fun onBindViewHolder(holder: VehicleViewHolder, position: Int) {
        getItem(position)?.let { arabamUiData -> holder.onBind(arabamUiData) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehicleViewHolder {
        return VehicleViewHolder(
            parent.inflateAdapterItem(AdapterVehicleItemBinding::inflate)
        )
    }

    class VehicleViewHolder(private val binding: AdapterVehicleItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(data: ArabamUiData) {
            binding.vehicleComponent.setVehicleData(data)
        }

    }

    object Diff : DiffUtil.ItemCallback<ArabamUiData>() {
        override fun areItemsTheSame(oldItem: ArabamUiData, newItem: ArabamUiData): Boolean =
            oldItem.imageUrl == newItem.imageUrl


        override fun areContentsTheSame(oldItem: ArabamUiData, newItem: ArabamUiData): Boolean =
            oldItem == newItem

    }
}