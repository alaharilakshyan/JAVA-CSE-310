class Adhaar {
    int AdhaarNumber;

    // Constructor
    Adhaar(int AdhaarNumber) {
        this.AdhaarNumber = AdhaarNumber;
    }

    @Override
    public String toString() {
        return "The number of Adhaar card is " + AdhaarNumber; // Approach 1
        // return Integer.toString(AdhaarNumber); // Approach 2
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check null and class type
        
        Adhaar a = (Adhaar) obj; // Typecasting
        return this.AdhaarNumber == a.AdhaarNumber; // Check if Adhaar numbers are equal
    }
}

class Main {
    public static void main(String args[]) {
        Adhaar Person1 = new Adhaar(123456789);
        Adhaar Person2 = new Adhaar(123456789);
        Adhaar Person3 = Person1;
        String s = "123456789";

        System.out.println(Person1); // Calls toString()
        System.out.println(Person1.toString()); // Explicit toString()
        System.out.println(Person1.equals(Person2)); // True, same AdhaarNumber
        System.out.println(Person1.equals(Person3)); // True, same reference
        System.out.println(Person1.equals(s)); // False, different class type
        System.out.println(Person1.equals(null)); // False, comparing with null
    }
}