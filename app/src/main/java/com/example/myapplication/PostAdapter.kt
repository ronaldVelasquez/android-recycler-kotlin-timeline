package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(var listPost: List<Post>) : RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post_view, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val post: Post = listPost.get(position)
        holder.txtUsername.text = post.userName
        holder.txtPost.text = post.textPost
    }

    override fun getItemCount(): Int {
        return listPost.size
    }


    class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtUsername: TextView
        val txtPost: TextView

        init {
            txtUsername = itemView.findViewById(R.id.txt_userName)
            txtPost = itemView.findViewById(R.id.txt_post)
        }
    }
}

