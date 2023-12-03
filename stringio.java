
public class stringio 
{
    public static void main (String a32[])
    { // capacity of string buffer will always be 16 bit + Length of code
        StringBuffer nam=new StringBuffer("navin"); //initialized StringBuffer, it is different to String Builder as it is thread safe
        nam.ensureCapacity(5); // ensuring that minimum capacity of string is 5
        nam.append("reddy"); //appends ready to the initial string buffer string nam
        nam.deleteCharAt(2); // Deletes character value at index 2
        nam.insert(0,"This is inserted "); // stringbuffername.insert(indexnumber,"Additional String");
        nam.setLength(10);//stringbuffername.setLength(New_Length_of_string)
        String str=nam.toString();//Converting the stringbuffer type variable to a different string variable 
        


    }    
}
