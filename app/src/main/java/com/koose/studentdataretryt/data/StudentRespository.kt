package com.koose.studentdataretryt.data

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import androidx.annotation.WorkerThread
import androidx.lifecycle.MutableLiveData
import com.koose.studentdataretryt.utils.WEB_SERVICE_URL
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class StudentRespository(val app:Application) {
    val studentData = MutableLiveData<List<StudentData>>()

    //There's, Network in the device
    @WorkerThread
    suspend fun callWebService() {
        if (networkAvailable()) {
            val retrofit = Retrofit.Builder()
                .baseUrl(WEB_SERVICE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
            val service = retrofit.create(StudentService::class.java)
            val serviceData = service.getStudentData().body() ?: emptyList()
            studentData.postValue(serviceData)
        }
    }

    @Suppress("DEPRECATION")
    private fun networkAvailable(): Boolean {
        val connectivityManager = app.getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo?.isConnectedOrConnecting ?: false
    }

}