public class ComputerTest {
    public static void main(String args[]){
        Procesor proc1 = new Procesor("AMD", "Ryzen 5", 2600);
        Memory mem1 = new Memory("Goodram", "DDR3", 4, 2800);
        Computer comp1 = new Computer("Lenovo", proc1, mem1);

        Procesor proc2 = new Procesor("Intel", "Intel Core i5", 2800);
        Memory mem2 = new Memory("Kingston", "DDR4", 8, 2700);
        Computer comp2 = new Computer("Asus", proc2, mem2);

        comp1.showInfo();
        comp2.showInfo();

        Overclock overclock1 = new Overclock();
        overclock1.increaseCpuClock(comp1,20);
        overclock1.decreaseCpuClock(comp2,20);

        comp1.showInfo();
        comp2.showInfo();

        ComputerAssembly computerAssembly = new ComputerAssembly();
        Computer comp3 = computerAssembly.assembly("Dell", "i7", "Intel", 2200, "Goodram", "XDR", 12, 2600);
        comp3.showInfo();
    }
}
