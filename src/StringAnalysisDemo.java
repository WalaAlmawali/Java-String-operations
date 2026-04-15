public class StringAnalysisDemo {
    public static void main(String[] args){

        String Text = "I love Java !";
        System.out.println(" the original Text is : " +"\n" +Text );
        System.out.println(" the total number of characters are : "+ Text.length());

        String Text2 = " I love PHP !";

        System.out.println("is "+Text + "equals to "+ Text2 + "?" + Text.equals(Text2) );

        System.out.println("the index of character 'v' in the string is :" + Text.indexOf("v") );


        System.out.println("is the string start with 'I' character? " + Text.startsWith("I"));
        System.out.println("is the string end with 'y' character? " + Text.endsWith("y"));


    }
}
