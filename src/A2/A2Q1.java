

public class A2Q1 {
    public static void main(String[] args) {
        String[] tiangan = {"gui", "jia", "yi", "bing", "ding", "wu", "ji", "geng", "xin", "ren"};
        String[] dizhi = {"hai", "zi", "chou", "yin", "mao", "chen", "si", "wu", "wei", "shen", "you", "xu"};
        String[] animal = {"Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep", "Monkey", "Rooster", "Dog"};
        int year = Integer.parseInt(args[0]);
        int tiangan_num = (year - 3) % 10;
        int dizhi_num = (year - 3) % 12;
        int animal_num = (year - 3) % 12;
        System.out.printf("%s-%s\n%s", tiangan[tiangan_num], dizhi[dizhi_num], animal[animal_num]);
    }
}
