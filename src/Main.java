public class Main {
    public static void main(String[] args) {
        Shape square1=new Suare();    //cоздаем фигуры
        Shape square2=new Suare();
        Shape circle1=new Circle();

        Shape triangle1=new Triangle();
        Shape square3=new Suare();
        Shape circle2=new Circle();

        Composite composite=new Composite();   //создаем композиции(сумки для фигур)
        Composite composite1=new Composite();
        Composite composite2=new Composite();

       composite1.addComponent(square1);  //помещаем одни  фигуры в композицию 1
       composite1.addComponent(square2);
       composite1.addComponent(circle1);

       composite2.addComponent(triangle1);  // вторые в композицию 2
       composite2.addComponent(square3);
       composite2.addComponent(circle2);

       composite.addComponent(composite1);  // в общую композицию помещаем две композиции
       composite.addComponent(composite2);

       composite.draw();   // выводим общую композицию
    }
}
