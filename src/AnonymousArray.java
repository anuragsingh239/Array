public class AnonymousArray {
    int arr[];
    AnonymousArray(){ arr=new int[5];}
    public void initializearray(int tarr[]){
        arr=tarr;
        for(var res:arr){
            System.out.println("this is the array"+" "+res);

        }
    }

    public static void main(String[] args) {
        AnonymousArray obj=new AnonymousArray();
        obj.initializearray(new int[]{1,2,3,4,6});
    }
}