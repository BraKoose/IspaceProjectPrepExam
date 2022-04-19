package com.hgecapsi.newsapptestoneproject.api

import com.hgecapsi.newsapptestoneproject.helper.Constants
import com.hgecapsi.newsapptestoneproject.models.StudentResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(Constants.END_POINT)
    suspend fun getStudent():Response<StudentResponse>
}