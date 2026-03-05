class Main {
    public void PrintNum(int i,int n){
        if(i>n){
            return;
        }
        PrintNum(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Main obj= new Main();
        obj.PrintNum(1,5);
    }
}