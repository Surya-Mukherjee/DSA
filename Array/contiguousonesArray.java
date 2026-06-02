    public class contiguousonesArray {
        public static int findmaxconsecutiveones(int[]max){
            int a=max.length;
            
            int count1=0;
            
            int i=0;
            int length=0;
            while(i<=a-1 ){
                if(max[i]==1){
                    count1++;
                    i++;
                }else {
                    count1=0;
                    i++;
                }

                if(count1>length){
                    length=count1;
                }
            }
            return length;
        }
        public static void main(String[] args) {
            
        int a[]={1,1,0,1,0,1};
        int length= findmaxconsecutiveones(a);
        System.out.println("FINAL LENGTH "+length);
        }
    }
