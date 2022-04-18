package com.hgecapsi.newsapptestoneproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.hgecapsi.newsapptestoneproject.Adapter.StudentAdapter
import com.hgecapsi.newsapptestoneproject.Model.StudentsViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class StudentsViewModel
        val data = ArrayList<StudentsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(StudentsViewModel(R.drawable.ic_baseline_folder_24, "Item " + i, "Addai Amoako", "KooseTheBlogger@gmail.com",
            "male",
            "Google Asociate Android Developer",
            "0509103721",
            "Accra",
            1))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = StudentAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


    }
}