package com.hgecapsi.newsapptestoneproject.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hgecapsi.newsapptestoneproject.Model.StudentsViewModel
import com.hgecapsi.newsapptestoneproject.R

class StudentAdapter(private val iStudent: List<StudentsViewModel>):
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {




    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}