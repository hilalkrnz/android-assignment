package com.arabam.android.assigment.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.arabam.android.assigment.R
import com.arabam.android.assigment.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding

    private val viewModel by viewModels<HomeViewModel>()

    private val adapter = VehicleRecyclerViewAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater).apply {
            vehiclesListRv.adapter = adapter
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // observe(0, 0)

        collectUiState(1, 0)

    }


    private fun collectUiState(sort: Int?, sortDirection: Int?) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.getListing(sort, sortDirection).collectLatest {
                adapter.submitData(it)
            }
        }
    }

    /*private fun observe(sort: Int?, sortDirection: Int?) {
         lifecycleScope.launchWhenStarted {
             viewModel.getListing(sort, sortDirection).collectLatest {
                 adapter.submitData(it.map {
                     arabamUiDataMapper.map(it)
                 })
             }

         }
     }*/


}