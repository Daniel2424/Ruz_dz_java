package ru.mirea.dz3;

public class Human {
    private final Hand rHand, lHand;
    private final Leg rLeg, lLeg;
    private final Head head;

    public Human(Hand rHand, Hand lHand, Leg rLeg, Leg lLeg, Head head) {
        this.rHand = rHand;
        this.lHand = lHand;
        this.rLeg = rLeg;
        this.lLeg = lLeg;
        this.head = head;
    }

    public String getInfoAboutHuman(){
        return (head.getPosition() + " " + rHand.getname() + " " + lHand.getname() + " " + rLeg.getname() + " " + lLeg.getname());
    }
}
