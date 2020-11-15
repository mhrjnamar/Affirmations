RecyclerView widget helps you display a list of data.
RecyclerView uses the adapter pattern to adapt and display the data.
ViewHolder creates and holds the views for RecyclerView.
RecyclerView comes with built in LayoutManagers. RecyclerView delegates how items are laid out to LayoutManagers.
To implement the adapter:

Create a new class for the adapter, for example, ItemAdapter.
Create a custom ViewHolder class that represents a single list item view. Extend from RecyclerView.ViewHolder class.
Modify the ItemAdapter class to extend from the RecyclerView.Adapter class with the custom ViewHolder class.
Implement these methods within the adapter: getItemsCount(), onCreateViewHolder(), and onBindViewHolder().