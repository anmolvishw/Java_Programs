class thread_Ex extends Thread {
    String str="Hello";
    public void run(){
        System.out.println("Start Funn of class");
        System.out.println(str); 
    }

    public static void main(String[] args) {
        thread_Ex ex=new thread_Ex();
        ex.start();
    }
}