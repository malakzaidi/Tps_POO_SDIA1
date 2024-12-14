package Exercise1;

public class App1 {
        public static void main(String[] args) {
            // Création manuelle des instances de Talkative
            Talkactive talkative1 = new Talkactive(1);
            Talkactive talkative2 = new Talkactive(2);
            Talkactive talkative3 = new Talkactive(3);
            Talkactive talkative4 = new Talkactive(4);
            Talkactive talkative5 = new Talkactive(5);
            Talkactive talkative6 = new Talkactive(6);
            Talkactive talkative7 = new Talkactive(7);
            Talkactive talkative8 = new Talkactive(8);
            Talkactive talkative9 = new Talkactive(9);
            Talkactive talkative10 = new Talkactive(10);

            // Création manuelle des threads
            Thread thread1 = new Thread(talkative1);
            Thread thread2 = new Thread(talkative2);
            Thread thread3 = new Thread(talkative3);
            Thread thread4 = new Thread(talkative4);
            Thread thread5 = new Thread(talkative5);
            Thread thread6 = new Thread(talkative6);
            Thread thread7 = new Thread(talkative7);
            Thread thread8 = new Thread(talkative8);
            Thread thread9 = new Thread(talkative9);
            Thread thread10 = new Thread(talkative10);

            // Démarrage des threads
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();
            thread7.start();
            thread8.start();
            thread9.start();
            thread10.start();
        }
    }


