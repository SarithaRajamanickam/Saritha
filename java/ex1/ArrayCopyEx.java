class ArrayCopyEx
{
    public static void main(String[] args) {
         char arr1[]={'s','a','r','i','t','h','a'};
         char arr2[]=new char[arr1.length];
        System.arraycopy(arr1,1,arr2,2,5);
        System.out.println(new String(arr2));
    }
}