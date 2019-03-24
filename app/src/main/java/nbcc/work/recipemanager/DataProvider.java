package nbcc.work.recipemanager;

import java.util.LinkedList;

public class DataProvider {

    static LinkedList<Recipe> recipes;

    static LinkedList<Recipe> getRecipes() {return recipes;}


    static {
        recipes = new LinkedList<Recipe>();


        String name = "Walnut Banana Bread Pudding";
        String description = "My mom has been making this recipe since I was little. " +
                "This dessert is a big hit at every barbecue and potluck I bring this to! Sometimes I use pecans " +
                "instead of walnuts. This is great with coconuts, raisins, and dried cranberries, too!";
        String image = "https://images.media-allrecipes.com/userphotos/250x250/829687.jpg";
        String ingredients = "1/2 cup butter, divided\n" +
                "1 (16 ounce) loaf day-old French bread, cut into 1-inch cubes\n" +
                "1 cup chopped walnuts\n" +
                "4 eggs\n" +
                "1 cup heavy cream\n" +
                "1 (14 ounce) can sweetened condensed milk\n" +
                "1 (14 ounce) can coconut milk\n" +
                " \n" +
                "1 cup brown sugar\n" +
                "4 teaspoons vanilla extract\n" +
                "1/2 teaspoon ground cinnamon\n" +
                "1/4 teaspoon ground nutmeg\n" +
                "1/4 teaspoon ground allspice\n" +
                "1 pinch salt\n" +
                "4 very ripe bananas, mashed";
        String directions = "1.\n Grease a 9x13-inch baking dish with 1 tablespoon of butter; place the remaining butter in a saucepan over low heat, and melt the butter. Spread the French bread cubes out into the greased pan, and drizzle the melted butter over the bread.\n" +
                "\n2.\n Place the walnuts into a dry skillet over medium-low heat; cook and stir until the walnuts turn a light golden brown and give off a toasted fragrance, about 2 minutes. Watch carefully so they don't burn. Remove from heat, and transfer walnuts into a bowl immediately to cool. Set walnuts aside.\n" +
                "\n3.\n In a large mixing bowl, beat the eggs lightly just to break yolks, and mix in the cream, condensed milk, coconut milk, brown sugar, vanilla extract, cinnamon, nutmeg, allspice, and salt. Whisk to thoroughly combine until smooth. Stir in mashed banana and 3/4 cup of walnuts. Pour the banana mixture evenly over the bread cubes, and push bread cubes into the mixture to coat well with the custard. Sprinkle with remaining 1/4 cup of toasted walnuts. Cover the dish with plastic wrap, and refrigerate 8 to 12 hours.\n" +
                "\n4.\n Preheat oven to 350 degrees F (175 degrees C). Remove plastic wrap, and cover dish with foil.\n" +
                "\n5.\n Bake in the preheated oven for 15 minutes, then remove the foil and return to oven until the top is browned and the edges are pulling away from the pan, about 45 more minutes. Allow to cool before serving.";

        recipes.add(new Recipe(name, description, image, ingredients, directions));


        name = "Rum Raisin Bread Pudding with Warm Vanilla Sauce";
        description = "This easy recipe combines my favorite things in this world -- bread pudding, apples, " +
                "raisins, vanilla, and rum! The sauce thickens atop the bread pudding, providing an attractive " +
                "and delicious glaze. We never have leftovers!";
        image = "https://images.media-allrecipes.com/userphotos/720x405/715166.jpg";
        ingredients = "Pudding\n" +
                "1 tablespoon butter\n" +
                "1 apple, peeled and thinly sliced\n" +
                "1/4 cup raisins\n" +
                "1 tablespoon rum\n" +
                "1 pinch ground cinnamon\n" +
                "8 slices cinnamon raisin bread, crusts removed, cut into 3/4 inch cubes\n" +
                "3/4 cup brown sugar\n" +
                "1/4 cup white sugar\n" +
                "3/4 cup nonfat milk\n" +
                "1 cup lowfat evaporated milk\n" +
                "1 tablespoon ground cinnamon\n" +
                " \n" +
                "1/4 cup butter\n" +
                "2 eggs\n" +
                "1/2 teaspoon vanilla extract\n" +
                "Rum Sauce\n" +
                "3 tablespoons nonfat milk\n" +
                "5 teaspoons cornstarch\n" +
                "1 tablespoon butter\n" +
                "1 tablespoon rum\n" +
                "1/2 cup nonfat milk\n" +
                "1/4 cup white sugar\n" +
                "1 tablespoon vanilla extract";
        directions = "1.\n Preheat oven to 350 degrees F (175 degrees C). Grease a 9-inch cake pan.\n" +
                "\n2.\n Melt 1 tablespoon of butter in a small skillet over medium heat. Stir in the apple, raisins, 1 tablespoon rum, and pinch of cinnamon. Cook until the apples are soft, about 10 minutes. Toss apples with bread cubes, and spoon into prepared pan.\n" +
                "\n3.\n Combine brown sugar, white sugar, 3/4 cup milk, evaporated milk, 1 tablespoon cinnamon, and 1/4 cup butter in a small saucepan over medium heat. Cook, stirring, until butter is melted, about 5 minutes.\n" +
                "\n4.\n Whisk the eggs and 1/2 teaspoon vanilla extract in a small bowl. Whisking constantly, pour hot milk mixture into beaten eggs. Pour custard over bread cubes and apples.\n" +
                "\n5.\n Cover pan with aluminum foil; bake in preheated oven for 40 minutes. Remove foil and bake until pudding is puffed and lightly browned, about 10 additional minutes.\n" +
                "\n6.\n While the pudding bakes, prepare the rum sauce. Whisk together 3 tablespoons milk and the cornstarch in a small bowl until smooth. Melt the butter over medium heat in a small saucepan. Stir in 1 tablespoon rum, 1/2 cup milk, and 1/4 cup white sugar; bring to a boil. Slowly add cornstarch mixture, stirring until sauce thickens. Remove from heat and stir in 1 tablespoon vanilla.\n" +
                "\n7.\n Pour rum sauce over warm pudding. Let rest for 5 minutes before serving. The sauce will continue to thicken and form a beautiful glaze.";

        recipes.add(new Recipe(name, description, image, ingredients, directions));

        name = "Cranberry Bread Pudding";
        description = "Aromatic, flavorful bread pudding";
        image = "https://images.media-allrecipes.com/userphotos/560x315/1069396.jpg";
        ingredients = "3 cups milk\n" +
                "1 1/2 cups heavy whipping cream\n" +
                "3/4 cup white sugar\n" +
                "5 eggs\n" +
                "1 1/2 teaspoons lemon zest\n" +
                "1 1/2 teaspoons kosher salt\n" +
                " \n" +
                "1/4 teaspoon ground cinnamon\n" +
                "3/4 vanilla bean, split and seeds scraped away\n" +
                "1 1/2 French baguettes, cut into 2-inch slices\n" +
                "1/2 cup golden raisins\n" +
                "1 cup cranberries\n" +
                "2 teaspoons butter";
        directions = "1. Whisk milk, cream, sugar, eggs, lemon zest, salt, cinnamon, and vanilla bean together in a bowl; fold in baguette slices, raisins, and cranberries. Set aside to soak for 40 minutes.\n" +
                "\n2. Preheat oven to 350 degrees F (175 degrees C). Butter a 12-inch deep-dish pie dish.\n" +
                "\n3. Transfer bread mixture to prepared pie dish; remove and discard vanilla bean. Cover dish with aluminum foil.\n" +
                "\n4. Bake in the preheated oven for 45 minutes. Remove foil and bake until until pudding is set and lightly browned, about 15 more minutes.";

        recipes.add(new Recipe(name, description, image, ingredients, directions));


        name = "Bread Pudding with Whiskey Sauce";
        description = "This is the best bread pudding I've ever eaten! My husband wants me to make it every weekend for Sunday brunch";
        image = "https://images.media-allrecipes.com/userphotos/720x405/4329960.jpg";
        ingredients = "2 eggs, beaten\n" +
                "3 tablespoons butter, melted\n" +
                "2 tablespoons vanilla extract\n" +
                "2 1/2 cups milk\n" +
                "1/4 cup white sugar\n" +
                "1 (1 pound) loaf French bread, cut into 1 inch cubes\n" +
                " \n" +
                "1 cup chopped pecans\n" +
                "1/2 cup white sugar\n" +
                "1/2 cup butter\n" +
                "1/2 cup heavy cream\n" +
                "1/4 cup whiskey";
        directions = "1.\n Preheat oven to 325 degrees F (165 degrees C). Lightly grease a 9x13 inch pan.\n" +
                "\n2.\n In a large bowl, stir together eggs, butter, vanilla and milk. Gradually add 1/4 cup sugar and mix thoroughly until sugar is dissolved.\n" +
                "\n3.\n Place bread cubes in bottom of prepared pan. Pour liquid over bread, fully saturating all bread. Sprinkle pecans on top.\n" +
                "\n4.\n Bake in preheated oven for 60 minutes, until golden. Meanwhile, combine 1/2 cup white sugar, 1/2 cup butter, cream and whiskey in a small saucepan. Warm over low heat, stirring constantly, until sauce is gently boiling. Pour sauce over baked bread pudding and serve.\n";
        recipes.add(new Recipe(name, description, image, ingredients, directions));

        name = "Bourbon Bread Pudding";
        description = "Here we go back to New Orleans again, with Bourbon Street flair. Southern bourbon-soaked brioche bread makes a hearty Creole-style dessert";
        image = "https://assets.epicurious.com/photos/54b28e8aa801766f773f9ebf/6:4/w_620%2Ch_413/368689_bourbon-bread-pudding_1x1.jpg";
        ingredients = "2 tablespoons butter, plus more for greasing\n" +
                "10 cups cubed brioche bread (from a 1-pound loaf)\n" +
                "1 cup chopped pecans\n" +
                "4 cups half-and-half\n" +
                "1 cup whole milk\n" +
                "5 eggs, beaten\n" +
                "1 cup packed dark-brown sugar\n" +
                "3 tablespoons bourbon\n" +
                "2 teaspoons pure vanilla extract\n" +
                "1 teaspoon ground cinnamon\n" +
                "1/2 teaspoon kosher salt\n" +
                "1/4 teaspoon grated nutmeg";
        directions = "1.\n Butter a 13 by 9-inch baking dish, and put the cubed brioche in it. Sprinkle with the pecans.\n" +
                "\n2.\n Whisk together the half-and-half, milk, eggs, butter, brown sugar, bourbon, vanilla, cinnamon, salt, and nutmeg in a large bowl.\n" +
                "\n3.\n Pour the custard mixture over the bread in the baking dish, giving the bread a stir to make sure it's coated. Let the pudding sit for 1 hour, so the bread can fully absorb the milk.\n" +
                "\n4.\n Preheat the oven to 350 degrees F. Once it is ready, put the dish in the oven and bake for 50 minutes, or until puffy and set. Remove, and let stand 10 minutes before serving. This is absolutely lovely when served with some fresh whipped cream.";
        recipes.add(new Recipe(name, description, image, ingredients, directions));
    }

}
