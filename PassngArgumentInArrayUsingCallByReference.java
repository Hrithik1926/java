public class PassngArgumentInArrayUsingCallByReference {
    public static void update(int marks[]){//Call by Reference
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i] + 2;
        }
    }
    public static void extraUpdate(int marks[]){
        for (int i=0;i< marks.length;i++){
            marks[i]=marks[i]+6;
        }

    }
    public static void main(String[] args) {
        int marks[]={12,45,65,32};
        update(marks);

        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
        extraUpdate(marks);
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
