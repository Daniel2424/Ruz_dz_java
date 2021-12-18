package ru.mirea.dz3;

public class Main {

    public static void main(String[] args)
    {
        Circle[] circles = new Circle[5];
        for(int i = 0; i < circles.length; i++){
            circles[i] = new Circle((float) (Math.random()*10));
            System.out.println(circles[i].getRadius() + " " + circles[i].getLengthOfCircle() + " " + circles[i].getАreaOfCircle());
        }
        System.out.println();

        Human[] humans = new Human[5];
        for(int i = 0; i < humans.length; i++){
            humans[i] = new Human( new Hand("rHand"), new Hand("lHand"), new Leg("rLeg"), new Leg("lLeg"), new Head("center" ));
            System.out.println(humans[i].getInfoAboutHuman());
        }
        System.out.println();

        Book[] books = new Book[5];
        for(int i = 0; i < books.length; i++){
            books[i] = new Book("Gerbert", "Frenk", 1965);
            System.out.println(books[i]);
        }
    }
}
