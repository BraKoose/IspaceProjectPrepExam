package com.koose.studentdataretryt.data

import com.koose.studentdataretryt.utils.IMAGE_BASE_URL


data class StudentData(
    val email: String,
    val first_name: String,
    val gender: String,
    val image: String,
    val last_name: String,
    val location: String,
    val phone_number: String,
    val profession: String
){
    val imageFileUrl
        get() = IMAGE_BASE_URL+"/$image.jpg"

    val imageFullUrl
        get() = "$IMAGE_BASE_URL/${image}.jpeg"
}

