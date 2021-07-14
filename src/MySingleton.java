public class MySingleton {

    private static  MySingleton instance;
    private MySingleton(){
    }
    public static MySingleton getIntsance()
    {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    
    }
}
