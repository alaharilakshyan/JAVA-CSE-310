class Door {
    void open() {System.out.println("The door is opened manually!");}
    void close() {System.out.println("The door is closed manuallY!");}
}

class SmartDoor extends Door{
    private int pin = 123456;
    void unlock(int enteredpin){
        if(enteredpin==pin){
            System.out.println("Pin i Correct!, Opening the Door manually.");
            open();
        }
        else{
            System.out.println();
        }
    }
}
