class TestConditional{
    public static void main(String[] args) {
        Integer i=42;
        String s=(i>50)?"Best Projects":(i>90)?"no bugs":"go";
        s+=(i<4)?"yes":(45>40)?"yes great":"no";
        System.out.println(s);
    }
}