class Door {   //inheritance
    void open() {
        System.out.println("The door is opened manually");
    }
    void close() {
        System.out.println("The door is closed manually");
    }
}
class SmartDoor extends Door {
    private int pin = 12345;
    void unlock(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Pin is correct, open the door manually");

        } else {
            System.out.println("Invalid pin");
        }
    }
    }
    class SingleInheritance{
    public static void main(String[] args) {
        SmartDoor myDoor = new SmartDoor();
        myDoor.unlock(12345); // Correct pin
        myDoor.close();       // Closing the door
        myDoor.open();
    }
}
