public class ComputerAssembly {
    Computer assembly(String nazwa, String nazwaProcesora, String producentProcesora, int taktowanieProcesora, String nazwaPamieci, String modelPamieci, int iloscPamieci, int taktowaniePamieci){


        Procesor proc = new Procesor(producentProcesora, nazwaProcesora, taktowanieProcesora );
        Memory mem = new Memory(nazwaPamieci, modelPamieci, iloscPamieci,taktowaniePamieci );

        return new Computer(nazwa,proc, mem);
    }
}
