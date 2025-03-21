class Tablet {
    public static void details(String dissolves, String cures, String killThePain, String reacts) {
        System.out.println("dissolves: " + dissolves + ", cures: " + cures + ", killThePain: " + killThePain + ", reacts: " + reacts);
    }
}

public class TabletRunner {
    public static void main(String[] args) {
        System.out.println("Details of Tablet");
        Tablet.details("It dissolves", "It cures", "It kills the pain", "It reacts");
    }
}