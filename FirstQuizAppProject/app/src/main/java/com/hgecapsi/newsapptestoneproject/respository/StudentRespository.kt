package com.hgecapsi.newsapptestoneproject.respository

import com.hgecapsi.newsapptestoneproject.api.ApiService
import javax.inject.Inject

class StudentRespository
@Inject
constructor(private val apiService: ApiService){
    suspend fun getStudent()= apiService.getStudent()
}