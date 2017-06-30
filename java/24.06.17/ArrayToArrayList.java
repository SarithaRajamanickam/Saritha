class ArrayToArrayList
{
    public static void main(String[] args) {
        String name[]={"saritha","sindhuja"};
        ArrayList<String> n1=new ArrayList<String>(Arrays.asList(name));
        for(String result:n1)
        {
        System.out.println(result);
        }
    }
}