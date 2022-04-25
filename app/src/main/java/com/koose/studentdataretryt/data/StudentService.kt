package com.koose.studentdataretryt.data

import retrofit2.Response
import retrofit2.http.GET

interface StudentService {
    @GET("DEVELOPER_IMG/learners.json")
    suspend fun getStudentData(): Response<List<StudentData>>
}