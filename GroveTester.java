public class GroveTester{

    public static void main(String[] args) {
        Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1);

        for (int i = 0; i < 7; i++){
            Tree spruce = new Tree(i + 1, 37, "Spruce");
            grove1.plant(spruce);
        }
        System.out.println(grove1);

        grove1.remove(3);
        grove1.remove(5);
        System.out.println(grove1);

        Tree maple = new Tree(8, 13, "Maple");
        grove1.plant(maple);
        System.out.println(grove1);

    }
}