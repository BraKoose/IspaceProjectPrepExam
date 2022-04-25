package com.koose.studentdataretryt.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.koose.studentdataretryt.data.StudentData
import com.koose.studentdataretryt.data.adapter.StudentAdapter
import com.koose.studentdataretryt.databinding.StudentHomeFragmentBinding

class StudentHomeFrag : Fragment() {


    private lateinit var binding: StudentHomeFragmentBinding
    private lateinit var viewModel: StudentHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = StudentHomeFragmentBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this).get(StudentHomeViewModel::class.java)

        viewModel.studentData.observe(viewLifecycleOwner, androidx.lifecycle.Observer {
                data ->
            val adapter = StudentAdapter(requireContext(), data, object : StudentAdapter.HandleStudentItem{

                override fun studentClicked(position: Int) {
                    viewModel.selectedStudent.value = StudentData("Koose",
                        "bra", "male", "ss",
                        "Koose", "Accra, Ridge",
                        "0509103721",
                        "Google DEV Associate")


                }
            })
            binding.recyclerView.adapter = adapter
        })

        return binding.root

    }


}