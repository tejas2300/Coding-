package Practice.Kypn;


class Tejas{
    public static void main(String []args){
        String s= "223456234";
        int count;
        s = s.toLowerCase();
        String arr[]=s.split("");
        int i=0,j=0;
        

        for( i=0;i<arr.length;i++){
            count=1;
            for(j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    count ++;
                    arr[j]="0";
                }
            }
            if(count>1 && arr[i]!="0"){
                System.out.println(arr[i]);
            }
          
        }



    }
}
