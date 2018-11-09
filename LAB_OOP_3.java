                                                "Dogs.java"
package com.company;

public abstract class Dogs {

    String breed;
    String name;
    int age;
    char sex;

    public void displayInfo(){
        System.out.println("\nПорода: " + breed + "\nИмя: " + name + "\nsex: " + sex + "\nВозраст: " + age);
    }
    public  abstract  void dog();
    }

                                               "Bulldog.java"
package com.company;

public class Bulldog extends Dogs {
    @Override
    public void dog() {
        breed = "Bulldog";
        name = "Jack";
        age = 2;
        sex = 'M';
    }
}

                                                "CaneCorso.java"
package com.company;

public class CaneCorso extends Dogs {
    @Override
    public void dog() {
        breed = "Cane Corso";
        name = "Nicka";
        age = 4;
        sex = 'W';
    }
}

    
                                               "Shepherd.java"
package com.company;

public class Shepherd extends Dogs {
    @Override
    public void dog() {
        breed = "Shepherd";
        name = "Grey";
        age = 4;
        sex = 'M';
    }
}

                                               "Main.java"
package com.company;
import java.util.Scanner;
// 2. Создать абстрактный класс, описывающий собак(Dog).
// С помощью наследования реализовать различные породы собак.
// Протестировать работу классов.
public class Main {
    public static void main(String[] args) {
        Shepherd shepherd = new Shepherd();
        Bulldog bulldog = new Bulldog();
        CaneCorso caneCorso = new CaneCorso();
        shepherd.dog();
        bulldog.dog();
        caneCorso.dog();
        shepherd.displayInfo();
        bulldog.displayInfo();
        caneCorso.displayInfo();
    }
}
