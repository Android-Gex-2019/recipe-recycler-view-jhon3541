/**
 * @file
 * @author Jhon Romero
 * @version 1.0
 *
 *
 * @section DESCRIPTION
 *
 *
 *
 * @section LICENSE
 *
 *
 * Copyright 2019
 * Permission to use, copy, modify, and/or distribute this software for
 * any purpose with or without fee is hereby granted, provided that the
 * above copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 *
 * @section Academic Integrity
 * I certify that this work is solely my own and complies with
 * NBCC Academic Integrity Policy (policy 1111)
 */

package nbcc.work.recipemanager;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.LinkedList;

public class RecipeListAdapter
        extends RecyclerView.Adapter<RecipeListAdapter.WordViewHolder> {

    private LinkedList<Recipe> mRecipeList;
    private LayoutInflater mInflater;
    private FrameLayout fragmentContainer;
    private Context context;


    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        public final TextView recipeTitleView;
        public final TextView recipeDescrView;
        public final TextView recipeNameView;
        public final ImageView recipeImageView;
        public final TextView recipeIngredientsView;
        public final TextView recipeDirectionsView;
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
            //Fragment container
            fragmentContainer= (FrameLayout) itemView.findViewById(R.id.fragment_container);
            recipeNameView= itemView.findViewById(R.id.recipeName);
            recipeImageView= itemView.findViewById(R.id.recipeImage);
            recipeIngredientsView = itemView.findViewById(R.id.recipeIngredients);
            recipeDirectionsView= itemView.findViewById(R.id.recipeDirections);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            Recipe recipe = DataProvider.getRecipes().get(mPosition);

            String recipeName= recipe.name;
            String recipeImage = recipe.image;
            String recipeIngredients = recipe.ingredients;
            String recipeDirections= recipe.directions;

            Intent intent = new Intent(context, SecondActivity.class);
            intent.putExtra("RECIPE_NAME",recipeName);
            intent.putExtra("RECIPE_IMAGE",recipeImage);
            intent.putExtra("RECIPE_INGREDIENTS", recipeIngredients);
            intent.putExtra("RECIPE_DIRECTIONS",recipeDirections);

            context.startActivity(intent);

            //openFragment(recipeName, recipeImage, recipeIngredients, recipeDirections);
        }
    }


    public RecipeListAdapter(Context context,
                           LinkedList<Recipe> recipeList) {
        mInflater = LayoutInflater.from(context);
        this.mRecipeList = recipeList;
        this.context= context;
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
