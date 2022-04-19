package com.hgecapsi.newsapptestoneproject

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val context: Context, val studentList: List<Student>):RecyclerView.Adapter<StudentAdapter.ViewHolder>(){
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val nameText: TextView = itemView.findViewById(R.id.nameText)
        val studentImage: ImageView = itemView.findViewById(R.id.monsterImage)
        val profession: TextView = itemView.findViewById(R.id.ratingBar)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}
