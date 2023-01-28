package com.arabam.android.assigment.data.mapper

interface ArabamMapper<I, O> {
    fun map(input: I?): O
}