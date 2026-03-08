package javacity;

/*
 * Q10 + Q11: TinyHouse implements PowerConsumer
 * 
 * Notice: TinyHouse does NOT extend Building (the assignment only asks
 * ShoppingMall to extend Building in Q12). TinyHouse just implements the interface.
 * 
 * This shows: you can implement an interface WITHOUT extending any class.
 */
public class TinyHouse implements PowerConsumer {

    private String ownerName;

    public TinyHouse(String ownerName) {
        this.ownerName = ownerName;
    }

    // Q11: Different implementation than ShoppingMall — same method, different behavior
    // This is the whole point of interfaces: same contract, different execution
    @Override
    public void consumeEnergy(int watts) {
        System.out.println("[" + ownerName + "'s Tiny House] Powering the lights.");
    }
}
