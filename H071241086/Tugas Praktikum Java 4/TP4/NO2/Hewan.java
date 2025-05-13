class Hewan  {
    void eat() {
        System.out.println("Hewan makan");

    }
    
    
}

class Mamalia extends Hewan {
    void eat() {
        System.out.println("Mamalia makan");
    }

    
}

class Kucing extends Mamalia {
    void eat() {
        System.out.println("kucing makan");
    }
}

class Kitten extends Kucing {
    void eat() {
        System.out.println("Dapur");
    }
}
