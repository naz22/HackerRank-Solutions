static boolean isAnagram(String a, String b) {
    // Complete the function

    // Quick checks for null/empty strings and string length comparison
    if( a == null || b == null || a.equals("") || b.equals("") ) return false;
    if(a.length() != b.length()) return false;

    a= a.toLowerCase();
    b= b.toLowerCase();
    int index;

    for(int i=0;i<a.length();i++)
    {
        index =b.indexOf(a.charAt(i));
        if(index==-1)   return false;
        else b = b.substring(0,index) + b.substring(index+1);
    }
    return true;
}
