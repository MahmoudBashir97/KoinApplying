package com.mahmoudbashir.koinapply.KoinWithApi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.mahmoudbashir.koinapply.KoinWithApi.pojo.dataPosts
import com.mahmoudbashir.koinapply.R

class PostsAdapter : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    private val differCallback = object : DiffUtil.ItemCallback<dataPosts>(){
        override fun areItemsTheSame(oldItem: dataPosts, newItem: dataPosts): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: dataPosts, newItem: dataPosts): Boolean {
            return oldItem == newItem
        }
    }

    val differ = AsyncListDiffer(this,differCallback)

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title_tv = itemView.findViewById<TextView>(R.id.title_tv)
        val body_tv = itemView.findViewById<TextView>(R.id.body_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.single_item_layout, parent, false)
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = differ.currentList[position]

        holder.title_tv.text = post.title
        holder.body_tv.text = post.body

    }

    override fun getItemCount(): Int = differ.currentList.size
}