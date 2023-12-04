package com.example.proyectobar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

import com.example.proyectobar.databinding.ViewPlatosItemBinding

interface MenuClickedListener{
    fun onMovieClick(menu: Menu)
}


class MenuAdaptar(private  val menus: List<Menu>, private val menuClickedListener: MenuClickedListener) : RecyclerView.Adapter<MenuAdaptar.ViewHolder>(){


    class ViewHolder(private val binding: ViewPlatosItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(menu:Menu){

            binding.title.text = menu.title
            Glide.with(binding.root.context).load(menu.cover).into(binding.cover)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //Aqui creamos la vista
      val binding = ViewPlatosItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)


        return ViewHolder(binding)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = menus[position]
        holder.bind(menu)
        holder.itemView.setOnClickListener {
            menuClickedListener.onMovieClick(menu)
        }
    }


    //Esto se llama expresion body
    override fun getItemCount() = menus.size


}


