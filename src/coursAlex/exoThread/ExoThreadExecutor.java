package coursAlex.exoThread;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExoThreadExecutor {
    public static Random random = new Random();
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            System.out.printf(
                    "%s %s %s %s %s %s",
                    myExecutor(executor, 1).get(),
                    myExecutor(executor, 2).get(),
                    myExecutor(executor, 3).get(),
                    myExecutor(executor, 4).get(),
                    myExecutor(executor, 5).get(),
                    myExecutor(executor, 6).get()
            );
            executor.shutdown();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

//        region (code redondant)
//        Future<?> f1 = executor.submit(() -> {
//            StringBuilder word = new StringBuilder();
//            for (int j = 0; j < random.nextInt(4)+2 ; j++) {
//                word.append((char) (random.nextInt(26) + 97));
//            }
//            return word;
//        });
//        Future<?> f2 = executor.submit(() -> {
//            StringBuilder word = new StringBuilder();
//            for (int j = 0; j < random.nextInt(4)+2 ; j++) {
//                word.append((char) (random.nextInt(26) + 97));
//            }
//            return word;
//        });
//        Future<?> f3 = executor.submit(() -> {
//            StringBuilder word = new StringBuilder();
//            for (int j = 0; j < random.nextInt(4)+2 ; j++) {
//                word.append((char) (random.nextInt(26) + 97));
//            }
//            return word;
//        });
//        Future<?> f4 = executor.submit(() -> {
//            StringBuilder word = new StringBuilder();
//            for (int j = 0; j < random.nextInt(4)+2 ; j++) {
//                word.append((char) (random.nextInt(26) + 97));
//            }
//            return word;
//        });
//        Future<?> f5 = executor.submit(() -> {
//            StringBuilder word = new StringBuilder();
//            for (int j = 0; j < random.nextInt(4)+2 ; j++) {
//                word.append((char) (random.nextInt(26) + 97));
//            }
//            return word;
//        });
//        Future<?> f6 = executor.submit(() -> {
//            StringBuilder word = new StringBuilder();
//            for (int j = 0; j < random.nextInt(4)+2 ; j++) {
//                word.append((char) (random.nextInt(26) + 97));
//            }
//            return word;
//        });
//        System.out.printf("%s %s %s %s %s %s",f1.get(),f2.get(),f3.get(),f4.get(),f5.get(),f6.get());
//        endregion

//        region test boucle thread
//        StringBuilder sentence = new StringBuilder();

//        for (int i = 0; i < 3; i++) {
//            System.out.println("action"+i);
//            Future<?> f = executor.submit(() -> {
//                System.out.println("action");
//                Random random = new Random();
//                StringBuilder word = new StringBuilder();
//                for (int j = 0; j < random.nextInt(4)+2 ; j++) {
//                    word.append((char) (random.nextInt(26) + 97));
//                }
//                return word;
//            });
//
//            sentence.append(f.get());
//            sentence.append(' ');
//        }
//        System.out.println(sentence);
//        endregion
    }
    static Future<String> myExecutor(ExecutorService executor, int step){
        return executor.submit(() -> {
            System.out.println(Thread.currentThread().getName() +" - action "+step);
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < random.nextInt(5)+2 ; j++) {
                word.append((char) (random.nextInt(26) + 97));
            }
            return word.toString();
        });
    }
}
