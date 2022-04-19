package com.hgecapsi.newsapptestoneproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.hgecapsi.newsapptestoneproject.R
import com.hgecapsi.newsapptestoneproject.databinding.StudentLayoutAdapterBinding
import com.hgecapsi.newsapptestoneproject.models.StudentItem

class StudentAdapter : RecyclerView.Adapter<StudentAdapter.MyViewHolder>(){
    inner class MyViewHolder(val binding: StudentLayoutAdapterBinding):
        RecyclerView.ViewHolder(binding.root)

    private val diffCallback = object : DiffUtil.ItemCallback<StudentItem>(){
        override fun areItemsTheSame(oldItem: StudentItem, newItem: StudentItem): Boolean {
            return oldItem.email == newItem.email
            }

        override fun areContentsTheSame(oldItem: StudentItem, newItem: StudentItem): Boolean {
            return newItem == oldItem
        }
    }



    private val differ = AsyncListDiffer(this, diffCallback)
     var studentsList:List<StudentItem>
        get() = differ.currentList
        set(value){
            differ.submitList(value)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(StudentLayoutAdapterBinding.inflate(
            LayoutInflater.from(parent.context), parent, false

        ))
        }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentStudent = studentsList[position]

        holder.binding.apply {
            textView.text = currentStudent.first_name
            imageView.load(currentStudent.image){
                crossfade(true)
                crossfade(1000)
            }

        }
    }

    override fun getItemCount() = studentsList.size



}