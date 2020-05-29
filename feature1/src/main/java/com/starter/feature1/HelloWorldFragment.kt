package com.starter.feature1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.starter.feature1.databinding.FragmentHelloWorldBinding
import com.starter.uicomponents.viewBinding
import org.koin.android.viewmodel.ext.android.viewModel

class HelloWorldFragment : Fragment(R.layout.fragment_hello_world) {
    private val binding  by viewBinding(FragmentHelloWorldBinding::bind)
    private val vm: HelloWorldViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            viewModel = vm
        }
    }
}