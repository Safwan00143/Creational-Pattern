import java.util.LinkedList;

class Product{
    LinkedList<String>parts;

    public Product(){
        parts = new LinkedList<String>();
    }

    public void Add(String part){
        parts.addLast(part);
    }

    public void show(){
        System.out.println("\nProduct completed as below :");
        for(int i=0;i<parts.size();i++){
            System.out.println(parts.get(i));
        }
    }
}

interface IBuilder{
    void BuildBody();
    void InsertWheels();
    void AddHeadlights();
    Product GetVehicle();
}

class Car implements IBuilder{
    Product product = new Product();

    public void BuildBody(){
        product.Add("Body of the car.");
    }

    @Override
    public void InsertWheels() {
        product.Add("Four wheels added.");
    }

    @Override
    public void AddHeadlights() {
        product.Add("Added 2 headlights.");
    }


    @Override
    public Product GetVehicle() {
        return product;
    }

}

class Director{
    IBuilder myBuilder;

    public void Construct(IBuilder builder){
        myBuilder = builder;
        myBuilder.BuildBody();
        myBuilder.InsertWheels();
        myBuilder.AddHeadlights();
    }
}

public class Builder_From_Slide {
    public static void main(String[] args) {
        Director director = new Director();

        IBuilder carBuilder = new Car();

        director.Construct(carBuilder);
        Product p1 = carBuilder.GetVehicle();
        p1.show();
    }
}
