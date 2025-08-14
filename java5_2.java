package проекти_відео;

class java5_2 {

    public static void main(String[] args){
        for(byte i=1; i<=10; i++){
            if(i==8)
                break;

            if(i%2 !=0)
                continue;

            System.out.println(i);
        }
    }
}
