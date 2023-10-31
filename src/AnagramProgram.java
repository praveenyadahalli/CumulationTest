import java.util.HashSet;

public class AnagramProgram {
    public static void main(String[] args) {
        String s1="loco",s2="cool";
        String s3="poolo", s4="loop";
        System.out.println(anagram(s1,s2));
        System.out.println(anagram(s3,s4));

    }
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }
        boolean bool=true;
        for(int i=0;i<s1.length();i++){
            if(!set.contains(s2.charAt(i))){
                bool=false;
                return bool;
            }
        }
        return bool;
    }
}
