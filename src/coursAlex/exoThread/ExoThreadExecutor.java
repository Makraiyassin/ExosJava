package coursAlex.exoThread;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExoThreadExecutor {

    public static Random random = new Random();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        HashMap<String,Future<?>> futures = new HashMap<>();
        StringBuilder sentence = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            futures.put("f"+(i+1),myExecutor(executor));
        }

        try {
            for (Future<?> f : futures.values()) {
                sentence.append(f.get()).append(" ");
            }
            System.out.println(sentence.toString());

            //region autre solution (en commentaire)
//            System.out.printf(
//                    "%s %s %s %s %s %s",
//                    myExecutor(executor).get(),
//                    myExecutor(executor).get(),
//                    myExecutor(executor).get(),
//                    myExecutor(executor).get(),
//                    myExecutor(executor).get(),
//                    myExecutor(executor).get()
//            );
            //endregion
            //region code redondant (en commentaire)
//            Future<?> f1 = myExecutor(executor);
//            Future<?> f2 = myExecutor(executor);
//            Future<?> f3 = myExecutor(executor);
//            Future<?> f4 = myExecutor(executor);
//            Future<?> f5 = myExecutor(executor);
//            Future<?> f6 = myExecutor(executor);
//            System.out.printf("%s %s %s %s %s %s",f1.get(),f2.get(),f3.get(),f4.get(),f5.get(),f6.get());
            //endregion

            executor.shutdown();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    static Future<String> myExecutor(ExecutorService executor){
        return executor.submit(() -> {
            System.out.println(Thread.currentThread().getName() +" - demarre");
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < random.nextInt(5)+2 ; j++) {
                word.append((char) (random.nextInt(26) + 97));
            }
            System.out.println(Thread.currentThread().getName() +" - a fini");
            return word.toString();
        });
    }
}
