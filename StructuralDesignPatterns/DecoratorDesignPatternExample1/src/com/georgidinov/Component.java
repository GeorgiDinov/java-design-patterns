package com.georgidinov;

public abstract class Component {
    public abstract void doJob();
}//end of abstract class Component

class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("I am from concrete component - I am closed for modification!");
    }//end of method doJob

}//end of class ConcreteComponent
