public class Marketer extends Employee{


//    this method is only for marketer
    public boolean insideMarket(){
        return true;
    }

    @Override
    public int getHours() {
        return super.getHours();
    }
}
