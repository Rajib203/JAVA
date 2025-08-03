public class LinearsAtindex {
    public static int linearsearch(int numbers[],int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,24};
        int key=30;
        int index=linearsearch(numbers, key);
        if(index==-1)
        {
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("key find at index"+index);
        }

    }
}
