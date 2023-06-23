import java.util.function.Function;

public  class TestS {

    int id = 1 ;
    public static class TestSS extends TestS{
        int id;
        public void fun1(){
            int id =30 ;
            this.id= this.id + 10 ;
            id = 500;
            super.id = 120;
        };
    }
}
