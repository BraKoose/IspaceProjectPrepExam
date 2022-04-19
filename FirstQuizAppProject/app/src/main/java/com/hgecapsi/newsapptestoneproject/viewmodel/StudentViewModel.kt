package com.hgecapsi.newsapptestoneproject.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hgecapsi.newsapptestoneproject.models.StudentItem
import com.hgecapsi.newsapptestoneproject.respository.StudentRespository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
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
            getStudent()
        }

        private fun getStudent() = viewModelScope.launch {
            respository.getStudent().let {
                response ->

                if(response.isSuccessful){
                    _resposne.postValue(response.body())
                }else{
                    Log.d("Tag", "getStudent Error: ${response.code()}")
                }

            }
        }

}