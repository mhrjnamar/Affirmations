RecyclerView widget helps you display a list of data.
RecyclerView uses the adapter pattern to adapt and display the data.
ViewHolder creates and holds the views for RecyclerView.
RecyclerView comes with built in LayoutManagers. RecyclerView delegates how items are laid out to LayoutManagers.
To implement the adapter:

Create a new class for the adapter, for example, ItemAdapter.
Create a custom ViewHolder class that represents a single list item view. Extend from RecyclerView.ViewHolder class.
Modify the ItemAdapter class to extend from the RecyclerView.Adapter class with the custom ViewHolder class.
Implement these methods within the adapter: getItemsCount(), onCreateViewHolder(), and onBindViewHolder().

//=====================================================================\\

Adding Images
To display additional content in a RecyclerView, modify the underlying data model class and data source. Then update the list item layout and adapter to set that data onto the views.
Use resource annotations to help ensure that the right type of resource ID is passed into a class constructor.
Use the Material Components for Android library to have your app more easily follow the recommended Material Design guidelines.
Use MaterialCardView to display content in a Material card.
Small visual tweaks to your app in terms of color and spacing can make the app look more polished and consistent.