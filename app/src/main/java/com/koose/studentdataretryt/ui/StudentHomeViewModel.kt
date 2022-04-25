package com.koose.studentdataretryt.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.koose.studentdataretryt.data.StudentData
import com.koose.studentdataretryt.data.StudentRespository

class StudentHomeViewModel(app:Application) : AndroidViewModel(app) {

    // TODO: Implement the ViewModel

    // TODO: Implement the ViewModel
    val datarepo = StudentRespository(app)
    val studentData = datarepo.studentData

    val selectedStudent = MutableLiveData<StudentData>()
}