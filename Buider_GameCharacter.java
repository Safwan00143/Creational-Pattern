class GameCharacter{
    String name;
    String race;
    String characterClass;

    int level;
    int health;
    int mana;
    int strength;
    int agility;
    int intelligence;

    String weapon;
    String armor;
    String pet;
    String mount;
    String specialSkill;
    String guild;

}

class GameCharacterBuilder {

    private GameCharacter gameCharacter;

    public GameCharacterBuilder() {
        gameCharacter = new GameCharacter();
    }

    public GameCharacterBuilder setName(String name) {
        gameCharacter.name = name;
        return this;
    }

    public GameCharacterBuilder setRace(String race) {
        gameCharacter.race = race;
        return this;
    }

    public GameCharacterBuilder setCharacterClass(String characterClass) {
        gameCharacter.characterClass = characterClass;
        return this;
    }

    public GameCharacterBuilder setLevel(int level) {
        gameCharacter.level = level;
        return this;
    }

    public GameCharacterBuilder setHealth(int health) {
        gameCharacter.health = health;
        return this;
    }

    public GameCharacterBuilder setMana(int mana) {
        gameCharacter.mana = mana;
        return this;
    }

    public GameCharacterBuilder setStrength(int strength) {
        gameCharacter.strength = strength;
        return this;
    }

    public GameCharacterBuilder setAgility(int agility) {
        gameCharacter.agility = agility;
        return this;
    }

    public GameCharacterBuilder setIntelligence(int intelligence) {
        gameCharacter.intelligence = intelligence;
        return this;
    }

    public GameCharacterBuilder setWeapon(String weapon) {
        gameCharacter.weapon = weapon;
        return this;
    }

    public GameCharacterBuilder setArmor(String armor) {
        gameCharacter.armor = armor;
        return this;
    }

    public GameCharacterBuilder setPet(String pet) {
        gameCharacter.pet = pet;
        return this;
    }

    public GameCharacterBuilder setMount(String mount) {
        gameCharacter.mount = mount;
        return this;
    }

    public GameCharacterBuilder setSpecialSkill(String specialSkill) {
        gameCharacter.specialSkill = specialSkill;
        return this;
    }

    public GameCharacterBuilder setGuild(String guild) {
        gameCharacter.guild = guild;
        return this;
    }

    public GameCharacter build() {
        return gameCharacter;
    }

}

public class Buider_GameCharacter {
    public static void main(String[] args) {
        GameCharacter mage = new GameCharacterBuilder()
                    .setName("Aether")
                    .setRace("Elf")
                    .setCharacterClass("Mage")
                    .setLevel(50)
                    .setHealth(1200)
                    .setMana(5000)
                    .setStrength(80)
                    .setAgility(150)
                    .setIntelligence(450)
                    .setWeapon("Legendary Staff")
                    .setArmor("Mystic Robe")
                    .setSpecialSkill("Meteor Storm")
                    .setGuild("Arcane Order")
                    .build();
        System.out.println(mage.weapon);
    }
}
