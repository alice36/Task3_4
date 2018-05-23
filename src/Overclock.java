public class Overclock {

    void increaseCpuClock(Computer comp, int increase){
        comp.procesor.taktowanie = comp.procesor.taktowanie + increase;
    }

    void decreaseCpuClock(Computer comp, int decrease){
        comp.procesor.taktowanie = comp.procesor.taktowanie - decrease;
    }
}
