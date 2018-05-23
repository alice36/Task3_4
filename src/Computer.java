public class Computer {
    String nazwa;
    Procesor procesor;
    Memory memory;

    Computer(String nazwa, Procesor procesor, Memory memory){
        this.nazwa=nazwa;
        this.procesor = procesor;
        this.memory = memory;
    }

    void showInfo(){
        System.out.println("Komputer: " + nazwa);
        System.out.println("Procesor: " + procesor.model + " " + procesor.producent + " " + procesor.taktowanie);
        System.out.println("Pamięć: " + memory.model + " " + memory.producent + " "  + memory.ilosc + "GB " + memory.taktowanie);
        System.out.println("");
    }

}
