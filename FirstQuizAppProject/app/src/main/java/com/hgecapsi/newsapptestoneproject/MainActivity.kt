package com.hgecapsi.newsapptestoneproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hgecapsi.newsapptestoneproject.adapter.StudentAdapter
import com.hgecapsi.newsapptestoneproject.databinding.ActivityMainBinding
import com.hgecapsi.newsapptestoneproject.viewmodel.StudentViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private val viewModel: StudentViewModel by viewModels()
    private lateinit var studentAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpRV()
    }





    private fun setUpRV(){
        studentAdapter = StudentAdapter()
        binding.recyclerview.apply {
            adapter = studentAdapter
            layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL,
           false )

            setHasFixedSize(true)
        }

        viewModel.responseStudent.observe(this) { listStudents ->

            studentAdapter.studentsList = listStudents
        }

    }


}