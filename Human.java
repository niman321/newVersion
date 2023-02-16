package Class26;

public interface  Human {
    void eat();
    void walk();
    void sleep();
    void dream();
}
interface Child1{
    void listen();
        void makeNoise();
}
class Result implements Human,Child1{

    @Override
    public void eat() {
        System.out.println("humans can eat meat");
    }

    @Override
    public void walk() {
        System.out.println("humans can walk");
    }

    @Override
    public void sleep() {
        System.out.println("humans need sleeping");
    }

    @Override
    public void dream() {
        System.out.println("humans dream");
    }

    @Override
    public void listen() {
        System.out.println("a child can listen");
    }

    @Override
    public void makeNoise() {
        System.out.println("a child make noises");
    }
}
class Result1 extends Result{
    public void eat() {
        System.out.println(" humans can eat");
    }

    @Override
    public void walk() {
        System.out.println("humans can walk not always");
    }

    @Override
    public void sleep() {
        System.out.println("humans need sleeping but too mush");
    }

    @Override
    public void dream() {
        System.out.println("humans dream but cant remember everything");
    }

    @Override
    public void listen() {
        System.out.println("a child can listen but not always");
    }

    @Override
    public void makeNoise() {
        System.out.println("a child make noises not even he is fed");
    }

    public static void main(String[] args) {
        Human[]humans={new Result(),};
        for (int i = 0; i <humans.length ; i++) {
            Human human=humans[i];
            human.eat();
            human.dream();
            human.sleep();
            human.walk();
            for (Human h:humans){
                h.walk();
                h.sleep();
                h.dream();
                h.eat();
            }
        }
    }


}
