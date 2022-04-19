package com.hgecapsi.newsapptestoneproject.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hgecapsi.newsapptestoneproject.StudentAdapter
import com.hgecapsi.newsapptestoneproject.models.StudentItem
import com.hgecapsi.newsapptestoneproject.respository.StudentRespository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StudentViewModel
    @Inject
    constructor
    (private val respository:
     StudentRespository):ViewModel() {

         private val _resposne = MutableLiveData<List<StudentItem>>()
            val responseStudent:LiveData<List<StudentItem>>
            get()= _resposne

        init {

        }

}