package inheritance;

public class Octopus extends Animal{
    private int noOfHearts ;

    @Override
    public int getNoOfHearts() {
        return noOfHearts;
    }

    @Override
    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
    }
}
