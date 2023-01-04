package com.arabam.android.assigment.utility

import com.arabam.android.assigment.data.NetworkResponseState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

suspend fun <T : Any> safeApiCall(apiToBeCalled: suspend () -> Response<T>): NetworkResponseState<T> {
    return withContext(Dispatchers.IO) {
        try {
            val response: Response<T> = apiToBeCalled()
            NetworkResponseState.Success(result = response.body()!!)
        } catch (e: HttpException) {
            NetworkResponseState.Error(e)
        } catch (e: IOException) {
            NetworkResponseState.Error(e)
        } catch (e: Exception) {
            NetworkResponseState.Error(e)
        }
    }
}