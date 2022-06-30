package coursAlex.exoTirelire;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

        Tirelire tirelire = new Tirelire(10);
        Etrenne etren = new Etrenne(1,10, tirelire,250);
        etren.start();
        Etrenne etren2 = new Etrenne(1,15, tirelire,250);
        etren2.start();

        //region stopper l'etrenne en checkant dans le main
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        Future<?> f1 = executor.submit(etren::start);
//
//        while(tirelire.getArgent() <= 150){
//            if(tirelire.getArgent() == 150){
//                etren.stopEtrenne();
//                executor.shutdownNow();
//                break;
//            }
//        }
        //endregion
    }
}
