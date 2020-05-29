package com.starter.uicomponents.di


import com.starter.uicomponents.rvadapter.GenericRVAdapter
import org.koin.dsl.module

val uiComponentsModule = module {
    factory (override = true) { params ->
        GenericRVAdapter(if (params.size() > 0) params[0] else 0)
    }
}