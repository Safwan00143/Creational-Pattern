class Character{
    String name;
    String weapon;
    String armor;
    String pet;
    String specialSkill;

    public Character(){
        name = "None";
        weapon = "None";
        armor = "none";
        pet = "none";
        specialSkill = "none";
    }

    public void print(){
        System.out.println(name);
        System.out.println("Weapon: "+ weapon);
        System.out.println("Armor: "+armor);
        System.out.println("Pet: "+pet);
        System.out.println("Skill: "+specialSkill);
    }
}

class CharBuilder{
    private Character character;

    public CharBuilder(){
        character = new Character();
    }

    public CharBuilder setName(String name){
        character.name = name;
        return this;
    }

    public CharBuilder setWeapon(String w){
        character.weapon = w;
        return this;
    }

    public CharBuilder setArmor(String w){
        character.armor = w;
        return this;
    }

    public CharBuilder setPet(String w){
        character.pet = w;
        return this;
    }

    public CharBuilder setSpecialSkill(String w){
        character.specialSkill = w;
        return this;
    }

    public Character build(){
        return character;
    }
}

class CharDirector{

    public Character getMage(){
        return new CharBuilder().setName("Mage")
                                .setWeapon("sword")
                                .setArmor("Steel Armor")
                                .build();
        
    }
}

public class builder_again {
    public static void main(String[] args) {
        CharBuilder builder = new CharBuilder();
        Character gandu = builder.setName("Gandu").build();
        CharDirector director = new CharDirector();
        Character mage = director.getMage();

        gandu.print();
        mage.print();
    }
}
