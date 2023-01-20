package Lessons.Lesson15;

public class SearchExample {
    public static void main(String[] args) {
        int[] workingArray = {1,2,3,4,5,-4};
        int serchElement = -4;

        int indexAfterSearch = linearSerch(workingArray,serchElement);
        if(indexAfterSearch>-1){
            System.out.println("In our Array "+serchElement+" have index "+indexAfterSearch);
        }else {
            System.out.println("In our Array "+serchElement+" doesn't find");
        }
    }
    public static int linearSerch(int[] workingArray, int element){
        for (int index = 0; index < workingArray.length; index++) {
            if (workingArray[index] == element){return index;}
        } return -1;
    }
}
