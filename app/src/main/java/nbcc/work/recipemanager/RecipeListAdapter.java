package nbcc.work.recipemanager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class RecipeListAdapter
        extends RecyclerView.Adapter<RecipeListAdapter.WordViewHolder> {

    private LinkedList<Recipe> mRecipeList;
    private LayoutInflater mInflater;
    private FrameLayout fragmentContainer;


    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        public final TextView recipeTitleView;
        public final TextView recipeDescrView;
        final RecipeListAdapter mAdapter;

        /**
         * Creates a new custom view holder to hold the view to display in
         * the RecyclerView.
         *
         * @param itemView The view in which to display the data.
         * @param adapter The adapter that manages the the data and views
         *                for the RecyclerView.
         */
        public WordViewHolder(View itemView, RecipeListAdapter adapter)  {
            super(itemView);
            recipeTitleView = itemView.findViewById(R.id.recipeTitle);
            recipeDescrView= itemView.findViewById(R.id.recipeDescription);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            //Recipe element = DataProvider.getRecipes().get(mPosition);
            // Change the word in the mWordList.
            //mWordList.set(mPosition, "Clicked! " + element);
            // Notify the adapter, that the data has changed so it can
            // update the RecyclerView to display the data.
            //mAdapter.notifyDataSetChanged();
        }
    }

    public RecipeListAdapter(Context context,
                           LinkedList<Recipe> recipeList) {
        mInflater = LayoutInflater.from(context);
        this.mRecipeList = recipeList;
    }

    @Override
    public RecipeListAdapter.WordViewHolder onCreateViewHolder(ViewGroup parent,
                                                             int viewType) {
        // Inflate an item view.
        View mItemView = mInflater.inflate(
                R.layout.recipe_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(RecipeListAdapter.WordViewHolder holder,
                                 int position) {
        // Retrieve the data for that position.
        String recipeTitle = mRecipeList.get(position).name;
        String recipeDescription = mRecipeList.get(position).description;
        // Add the data to the view holder.
        holder.recipeTitleView.setText(recipeTitle);
        holder.recipeDescrView.setText(recipeDescription);
    }

    @Override
    public int getItemCount() {
        return mRecipeList.size();
    }



}
