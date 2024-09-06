package PACKAGE_NAME;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public void addWater(){
        brewMaster.hasWorkToDo = true;
        setKitchenState(true, iceBox.hasWorkToDo, dishWasher.hasWorkToDo);
    }

    public void pourMilk(){
        iceBox.hasWorkToDo = true;
        setKitchenState(brewMaster.hasWorkToDo, true, dishWasher.hasWorkToDo);
    }

    public void loadDishwasher(){
        dishWasher.hasWorkToDo = true;
        setKitchenState(brewMaster.hasWorkToDo, iceBox.hasWorkToDo, true);
    }

    public void setKitchenState(boolean isBrewing, boolean isWashing, boolean isOdering){
        brewMaster.hasWorkToDo = isBrewing;
        dishWasher.hasWorkToDo = isWashing;
        iceBox.hasWorkToDo = isOdering;
    }

}

class Refrigerator extends SmartKitchen {
    boolean hasWorkToDo;

    private void  orderFood(boolean isWorking){
        hasWorkToDo = isWorking;
        if(isWorking) {
            System.out.println("Ordering food...");
        }
    }
}

class DishWasher extends SmartKitchen{
    boolean hasWorkToDo;

    private void  doDishes(boolean isWorking){
        hasWorkToDo = isWorking;
        if(isWorking) {
            System.out.println("Washing plates...");
        }
    }
}

class CoffeeMaker{
   boolean hasWorkToDo;

   private void  brewCoffee(boolean isWorking){
       hasWorkToDo = isWorking;
       if(isWorking) {
           System.out.println("The coffee is brewing...");
       }
   }
}


