package com.gibbs.myfirstapp.andoidMaster.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.gibbs.myfirstapp.databinding.ItemSuperheroBinding
import com.squareup.picasso.Picasso

class SuperHeroViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding= ItemSuperheroBinding.bind(view)

    fun bind(superheroItemResponse: SuperHeroItemResponse, onItemSelected: (String) -> Unit){
        binding.tvSuperHeroName.text = superheroItemResponse.name
        Picasso.get().load(superheroItemResponse.superheroImage.url).into(binding.ivSuperhero)
        binding.root.setOnClickListener { onItemSelected(superheroItemResponse.superheroId) }


    }
}