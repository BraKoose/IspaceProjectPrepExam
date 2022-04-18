package com.hgecapsi.newsapptestoneproject.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hgecapsi.newsapptestoneproject.Model.StudentsViewModel
import com.hgecapsi.newsapptestoneproject.R

class StudentAdapter(private val iStudent: List<StudentsViewModel>):
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val studentsViewModel = iStudent[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(studentsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = studentsViewModel.first_name

    }

    override fun getItemCount(): Int {
        // return the number of the students in the list
        return iStudent.size
    }

    // Holds the views for adding it to image and text
    //Mr mawuli likes it beneath lol
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}