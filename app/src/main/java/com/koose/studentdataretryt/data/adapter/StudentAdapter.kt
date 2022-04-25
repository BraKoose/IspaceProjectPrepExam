package com.koose.studentdataretryt.data.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.koose.studentdataretryt.R
import com.koose.studentdataretryt.data.StudentData

class StudentAdapter(val context: Context,
            val studList:List<StudentData>,
            val handleStudentItem: HandleStudentItem)
    :RecyclerView.Adapter<StudentAdapter.ViewHolder>() {


    override fun getItemCount() = studList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.student_grid_items, parent, false)

        return ViewHolder(view )
    }

    //OnClick listener
    interface HandleStudentItem{
        fun studentClicked(position: Int)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = studList[position]
        holder.nameText.text = student.first_name
        holder.locationBar.text = student.location

        Glide.with(context)
            .load(student.imageFileUrl)
            .into(holder.studentImage)

        //add monster click

        holder.itemView.setOnClickListener {
            handleStudentItem.studentClicked(position)
        }
    }







    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val nameText: TextView = itemView.findViewById(R.id.nameText)
        val studentImage: ImageView = itemView.findViewById(R.id.studentImage)
        val locationBar: TextView = itemView.findViewById(R.id.locationBar)

    }

}