class Sentence_Reverse{
    public static void main (String[] args) {
        String s="I                   love Java     Programming";
        int n=s.length()-1;
        String str="";
        for(int i=n;i>=0;i--)
        {
            if(s.charAt(i)!=' '){
                str=str+s.charAt(i);
                if(i==0){
                StringBuilder sb=new StringBuilder(str);
                System.out.print(sb.reverse());
                }
            }
            else if(s.charAt(i)==' '){
                if(str=="")
                {
                    continue;
                }
                StringBuilder sb=new StringBuilder(str);
                System.out.print(sb.reverse()+" ");
                str="";
            }
        }
    }
}
