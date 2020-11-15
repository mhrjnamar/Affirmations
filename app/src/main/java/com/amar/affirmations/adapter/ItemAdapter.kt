package com.amar.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.amar.affirmations.R
import com.amar.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [@MainActivity]. Display [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val dataSet: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just an Affirmation object
    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemViewHolder(
        // create a new view
        LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
    )

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.textView.text = context.getString(dataSet[position].stringResourceId)
        holder.imageView.setImageResource(dataSet[position].imageResourceId)
    }

    /**
     * Return the size of your dataSet (invoked by the layout manager)
     */
    override fun getItemCount() = dataSet.size
}