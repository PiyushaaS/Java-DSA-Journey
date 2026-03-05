class Main {
    public void PrintNum(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        PrintNum(i+1,n);
    }
    public static void main(String[] args){
        Main obj= new Main();
        obj.PrintNum(1,4);
    }
}
