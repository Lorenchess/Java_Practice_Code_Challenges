package Concurrency;

public class DownloadFileTask implements Runnable{

    @Override
    public void run() {
        System.out.println("Downloading "+ Thread.currentThread().getName());
    }
}
