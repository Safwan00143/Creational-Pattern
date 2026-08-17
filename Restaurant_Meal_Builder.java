import java.util.LinkedList;

class Meal{
    LinkedList<String> items;

    public Meal(){
        items = new LinkedList<String>();
    }

    public void Add(String s){
        items.addLast(s);
    }

    public void Show(){
        System.out.println("\nHere are the items for your selected meals: ");
        for(int i=0; i<items.size();i++){
            System.out.println(items.get(i));
        }
    }
}

interface MealBuilder{
    void PrepareMainCourse();
    void AddDrink();
    void AddDessert();
    void AddSideDish();
    Meal GetMeal();
}

class KidsMealBuilder implements MealBuilder{
    Meal meal;

    public KidsMealBuilder(){
        meal = new Meal();
    }
    
    @Override
    public void AddDessert() {
        meal.Add("Ice Cream");
    }

    @Override
    public void AddDrink() {
        meal.Add("Orange Juice");
    }

    @Override
    public void AddSideDish() {
        meal.Add("French Fries");
    }

    @Override
    public Meal GetMeal() {
        return meal;
    }

    @Override
    public void PrepareMainCourse() {
        meal.Add("Chicken Nuggets");
    }
    
}

class FitnessMealBuilder implements MealBuilder{
    Meal meal;

    public FitnessMealBuilder(){
        meal = new Meal();
    }
    @Override
    public void AddDessert() {
        meal.Add("Protein Bar");
    }

    @Override
    public void AddDrink() {
        meal.Add("Water");
    }

    @Override
    public void AddSideDish() {
        meal.Add("Salad");
    }

    @Override
    public Meal GetMeal() {
        return meal;
    }

    @Override
    public void PrepareMainCourse() {
        meal.Add("Grilled Chicken");
        meal.Add("Brown Rice");
    }
   
}

class MealDirector{
    MealBuilder mb;

    public void Construct(MealBuilder builder){
        mb = builder;
        mb.PrepareMainCourse();
        mb.AddDrink();
        mb.AddDessert();
        mb.AddSideDish();
    }
}

public class Restaurant_Meal_Builder {
    public static void main(String[] args) {
        MealBuilder kidFood = new KidsMealBuilder();
        MealDirector director = new MealDirector();
        director.Construct(kidFood);

        Meal meal = kidFood.GetMeal();

        meal.Show();
    }
}
