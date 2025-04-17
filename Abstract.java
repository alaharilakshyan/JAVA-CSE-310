abstract class AadhaarForm {
    String name;
    int age;

    AadhaarForm(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    abstract void stateVerification();
}

class DelhiAadhaar extends AadhaarForm {
    DelhiAadhaar(String name, int age) {
        super(name, age);
    }

    @Override
    void stateVerification() {
        System.out.println("Delhi verification: Electricity bill required.");
    }
}

class MaharashtraAadhaar extends AadhaarForm {
    MaharashtraAadhaar(String name, int age) {
        super(name, age);
    }

    @Override
    void stateVerification() {
        System.out.println("Maharashtra verification: Ration card required.");
    }
}

class Main {
    public static void main(String[] args) {
        AadhaarForm person1 = new DelhiAadhaar("Dahreen", 3);
        person1.printDetails();
        person1.stateVerification();

        AadhaarForm person2 = new MaharashtraAadhaar("Prabh", 33);
        person2.printDetails();
        person2.stateVerification();
    }
}