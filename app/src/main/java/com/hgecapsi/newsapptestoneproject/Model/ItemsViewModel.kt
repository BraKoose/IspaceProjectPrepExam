package com.hgecapsi.newsapptestoneproject.Model

import android.icu.text.SymbolTable

data class StudentsViewModel(val id: Int,
    val first_name: String,
                             val last_name: String,
                            val email: String,
                            val gender: String,
                            val profession: String,
                            val phone_number: String,
                             val location: String,
                            val image: Int) {

}
