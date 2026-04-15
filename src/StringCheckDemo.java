public class StringCheckDemo {
    public static void main(String[] args){

        String message = "welcome to our class";
        System.out.println(" the original message is : " +"\n" +message );

        System.out.println("first to world in the string : " +message.substring(0,10) );

        String updatedMessage = message.replace("our","my");
        System.out.println("the updated message are : " + updatedMessage);

        System.out.println("is the message contain world 'class' ? " +updatedMessage.contains("class") );
        System.out.println("the character in index 5 un the message is :  " +updatedMessage.charAt(5) );

        String text = " in Oman";
        System.out.println(updatedMessage.concat(" ").concat(text));


    }
}
