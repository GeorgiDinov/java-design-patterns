package com.georgidinov;

public abstract class AbstractDecorator extends Component {

    protected Component comp;

    public void setTheComponent(Component component) {
        this.comp = component;
    }//end of method setTheComponent

    public void doJob() {
        if (comp != null) {
            comp.doJob();
        }
    }//end of method doJob

}//end of abstract class AbstractDecorator


class ConcreteDecoratorExampleOne extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        //add additional responsibilities
        System.out.println("I am explicitly from example 1");
    }
}//end of class ConcreteDecoratorExampleOne

class ConcreteDecoratorExampleTwo extends AbstractDecorator {
    public void doJob() {
        System.out.println("Start Example 2");
        super.doJob();
        //add additional responsibilities
        System.out.println("I am explicitly from Example 2");
        System.out.println("End of Example 2");
    }
}//end of class ConcreteDecoratorExampleTwo